package Test1;

// import javax.sql.rowset.spi.SyncResolver;
// import javax.swing.plaf.synth.SynthOptionPaneUI;

class SingletonClass{
    private static SingletonClass instance = null;// lazy instantiation of singleton object

    private SingletonClass(){

    }

    public static SingletonClass getInstance(){
        if(instance == null){
            instance = new SingletonClass();
        }

        return instance;
    }



}

// using static inner class
// public class Singleton {
//     private static class LoadSingleton {
//           static final Singleton INSTANCE = new Singleton();
//        }
//        private Singleton() {}
    
//        public static Singleton getInstance() {
//           return LoadSingleton.INSTANCE;
//        }
//     }
// }


// using static initialization block
// public class Singleton { 
//     private final static Singleton instance; 
//        static { 
//         instance = new Singleton(); 
//        } 
//        private Singleton() {} 
//        public static Singleton getInstance() { 
//         return instance; 
//        } 
//     }
// }

//early instantiation
class MySingltonClass{
    public static MySingltonClass instance = new MySingltonClass();
    private MySingltonClass(){

    }

    public static MySingltonClass getInstance(){
        return instance;
    }
}


// thread safe singleton class
// Thread Safe Singleton: A thread safe singleton in created so that singleton property is maintained even in multithreaded environment. To make a singleton class thread-safe, getInstance() method is made synchronized so that multiple threads can’t access it simultaneously.

// Lazy initialization is possible.
// It is also thread safe.
// getInstance() method is synchronized so it causes slow performance as multiple threads can’t access it simultaneously.

class ThreadSafeSingelton{
    private static ThreadSafeSingelton instance= null;

    private ThreadSafeSingelton()
    {

    };

    synchronized public static ThreadSafeSingelton getInstance(){
        if(instance == null){
            instance  = new ThreadSafeSingelton();
        }

        return instance;
    } 
}


// Lazy initialization with Double check locking: In this mechanism, we overcome the overhead problem of synchronized code. In this method, getInstance is not synchronized but the block which creates instance is synchronized so that minimum number of threads have to wait and that’s only for first time.

// // Lazy initialization is possible.
// // It is also thread safe.
// // Performance overhead gets reduced because of synchronized keyword.
// // First time, it can affect performance.

// class DoubleLockSingleton{
//     private static DoubleLockSingleton instance = null;
//     private DoubleLockSingleton(){

//     };

//     public static DoubleLockSingleton getInstance(){
//         if(instance == null){
//             synchronized(DoubleLockSingleton.class){
//                 if(instance == null){
//                     instance = new DoubleLockSingleton();
//                 }
//             }
//         }

//         return instance;
//     }


    
// }

// revision
//1st Early instantiation

// class  SingltonClass{
//     private static SingltonClass instance = new SingltonClass();

//     private SingltonClass(){

//     }

//     public static SingltonClass getSingltonObject(){
//         return instance;
//     }
// }

// 2nd Lazy instantiation

// class LazySingleton{
//     private static LazySingleton instance = null;
//     private LazySingleton(){

//     }

//     public static LazySingleton getLazyIntance(){
// //         if(instance == null){
// //             instance =  new LazySingleton();
// //         }
// //         return instance;
// //     }

// // }

// //3rd Lazy Instantiation with Synchronization

// class SynchroniseSingletonClass{
//     private static SynchroniseSingletonClass instance = null;

//     private SynchroniseSingletonClass(){

//     }

//     synchronized static SynchroniseSingletonClass getSynchronizedObject(){
//         if(instance == null){
//             instance = new SynchroniseSingletonClass();
//         }

//         return instance;
//     }
// }


//4rth Lazy instantiation with double lock

// class DoubleLockSingleton{
//     public 
// }


//single lock synchronization
class SingletonClassObject{
    private static SingletonClassObject instance = null;

    private SingletonClassObject(){

    }

    synchronized static SingletonClassObject getSingletonObject(){
        if(instance == null){
            instance = new SingletonClassObject();

        }
        return instance;
    }

}

// double lock singleton class 

class DoubleClassSingleton{
    private static DoubleClassSingleton instance = null;

    private DoubleClassSingleton(){

    }

    public static DoubleClassSingleton getSingletonObject(){
        if(instance == null){
            synchronized(DoubleClassSingleton.class){
                if(instance == null){
                    instance = new DoubleClassSingleton();
                }

            }
        }
        return instance;
    }
}