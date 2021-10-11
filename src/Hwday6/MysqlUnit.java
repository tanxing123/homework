public class MysqlUnit {
    
        /*第二大题:
            MysqlUnit类型
            设置3个常量：userName ，密码，ip
            连接的静态方法getConnect
            syso（已经连接那个ip的电脑。用户xx密码xx）
            关闭的静态方法getClose
            syso（已经关闭了xxxip服务器连接）
            执行类，调用连接和关闭的静态方法
            */
        final static String userName = "tanxing123";
        final static String passWord = "123456";
        final static String ip = "117.144.155.255";
        
        public static void getCoonect() {
            System.out.println("已经连接" + ip + "的电脑");
            System.out.println("userName:" + userName);
            System.out.println("passWord:" + passWord);
            
        }
        
        public static void getClose() {
            System.out.println("已经关闭" + ip + "服务器的连接");
            
        }
        
        
    
    
}
