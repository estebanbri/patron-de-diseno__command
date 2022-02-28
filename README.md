## Patron de diseño Command

### Sinonimos

#### Client, Source, Invoker: 
the button, toolbar button, or menu item clicked, the shortcut key pressed by the user.
#### Command Object, Routed Command Object, Action Object: 
a singleton object (e.g. there is only one CopyCommand object), which knows about shortcut keys, button images, command text, etc. related to the command. A source/invoker object calls the Command/Action object's execute/performAction method. The Command/Action object notifies the appropriate source/invoker objects when the availability of a command/action has changed. This allows buttons and menu items to become inactive (grayed out) when a command/action cannot be executed/performed.
#### Receiver, Target Object: 
the object that is about to be copied, pasted, moved, etc. The receiver object owns the method that is called by the command's execute method. The receiver is typically also the target object. For example, if the receiver object is a cursor and the method is called moveUp, then one would expect that the cursor is the target of the moveUp action. On the other hand, if the code is defined by the command object itself, the target object will be a different object entirely.
#### Command Object, routed event arguments, event object: 
the object that is passed from the source to the Command/Action object, to the Target object to the code that does the work. Each button click or shortcut key results in a new command/event object. Some implementations add more information to the command/event object as it is being passed from one object (e.g. CopyCommand) to another (e.g. document section). Other implementations put command/event objects in other event objects (like a box inside a bigger box) as they move along the line, to avoid naming conflicts. (See also chain of responsibility pattern.)
#### Handler, ExecutedRoutedEventHandler, method, function: 
the actual code that does the copying, pasting, moving, etc. In some implementations the handler code is part of the command/action object. In other implementations the code is part of the Receiver/Target Object, and in yet other implementations the handler code is kept separate from the other objects.
#### Command Manager, Undo Manager, Scheduler, Queue, Dispatcher, Invoker: 
an object that puts command/event objects on an undo stack or redo stack, or that holds on to command/event objects until other objects are ready to act on them, or that routes the command/event objects to the appropriate receiver/target object or handler code.