### JobIntentService
This is a demo app on how to implement JobIntentService.

### Key Points

* JobIntentService is a class in Android that allows you to perform background work without having to manage threads or the lifecycle of a Service. You can use it to perform tasks that might take a long time, such as downloading a large file or syncing data with a server, while ensuring that the work continues even if the user navigates away from your app or if the device is restarted.
* JobIntentService is similar to IntentService, which is another type of Service that can perform background work, but it has some advantages over IntentService. For example, JobIntentService can handle multiple requests in a queue, whereas IntentService can only handle one request at a time. JobIntentService is also more efficient because it can reuse the same worker thread for multiple requests, whereas IntentService creates a new worker thread for each request.
* To use JobIntentService, you need to create a subclass and implement the onHandleWork() method, which is called when a new work request is received. You can then use an Intent to enqueue work to be performed in the background by calling the enqueueWork() method on the JobIntentService. This method adds the work to a queue and ensures that it is executed on a worker thread.
* JobIntentService automatically manages the task queue and executes tasks in the most efficient way possible.
* obIntentService can execute tasks in parallel, which means that multiple tasks can be executed simultaneously, improving overall performance and reducing execution time.

### Communication b/w activity & service.

* We can use broadcast receiver to communicate/pass the data between them.
* We can also use iBinder, Livedata, RoomDb.

### How to start service

```
MyJobIntentService.enqueueWork(this, Intent(this, MyJobIntentService::class.java))
```
### How to stop service.

* To stop a running JobIntentService, you can call the JobIntentService.stopSelf() method within the onHandleWork() method. This will stop the service as soon as all work has been completed.
* JobIntentService may or may not be automatically started again after a certain time if the task is not finished and the app is killed.


