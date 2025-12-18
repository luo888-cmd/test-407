// 数据库操作模板类
abstract class DBTemplate {
    // 模板方法（定义固定操作流程）
    public final void operateDB() {
        connDB();
        openDB();
        useDB();
        closeDB();
    }

    // 抽象方法：连接数据库（子类实现）
    protected abstract void connDB();
    //欢迎大家学习Git
    

    // 固定方法：打开数据库
    protected void openDB() {
        System.out.println("打开数据库连接");
        
    }


 // 固定方法：使用数据库
    

    // 固定方法：使用数据库
    protected void useDB() {
        System.out.println("执行数据库增删改查操作");
    }

    // 固定方法：关闭数据库
    protected void closeDB() {
        System.out.println("关闭数据库连接");
    }
}

