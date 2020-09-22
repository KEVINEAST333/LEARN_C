package sword_point_offer;

public class single {
    //单例模式
    //懒汉模式
  /*  private static single instance = new single();
    public  static single getInstance() {
        return instance;
    }*/
    //饿汉模式
    private static single instance = null;
    public  static single getInstance() {
        if(instance == null) {
            synchronized (single.class) {
                if(instance == null) {
                    instance = new single();
                }   
        }
        }
        return instance;
    }

}
