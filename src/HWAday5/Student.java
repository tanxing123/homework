public class Student {

    
    /*1.写一个学生类Student（学号，姓名，生日，电话，星座，车站，性别）

    学习方法 study(){
     syso（“xxx在学习”）
    }

    showMy（）{
    把所有属性打印出来
    }

    StudentDemo{
    创建一个自己和自己喜欢的人
    }

    内存图画，拍照*/
    long id;
    String studentName;
    String birthday;
    String number;
    String star;
    String address;
    byte gender;//0.男；1.女
    public void show(){
        System.out.println("学号:" + id);
        System.out.println("名字：" + studentName);
        System.out.println("生日：" + birthday);
        System.out.println("电话：" + number);
        System.out.println("星座：" + star);
        System.out.println("车站：" + address);
        System.out.println("性别：" + gender);
        }
       
    

    
}