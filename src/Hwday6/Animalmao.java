public class Animalmao {

    private String name;
    private double weight;
    private String color;
    private String likefood;
    private byte BellyPocket;//1.有2.无
    private byte LongEars;//1.有2.无
    
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public Double getWeight() {
        return this.weight;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return this.color;
    }
    
    public void setLikefood(String likefood) {
        this.likefood = likefood;
    }
    public String getLikefood() {
        return this.likefood;
    }
    
    public void setbellyPocket(String BellyPocket) {
        this.BellyPocket = (byte)("有".equals(BellyPocket)?1 : 2);
    }
    public String getbellyPocket() {
        return this.BellyPocket == 1?"有":"无";
    }
    
    public void setlongEars(String LongEars) {
        this.LongEars = (byte)("长".equals(LongEars)?1 : 2);
    }
    public String getlongEars() {
        return this.LongEars == 1?"长":"短";
    }
    
    public Animalmao() {	
    }
    
    public Animalmao(String name, double weight, String color, String likefood) {
        this.name = name;
        this.weight = weight;
        this.color = color;
        this.likefood = likefood;
    
    }

public void canFly() {
    System.out.println(name + "在飞");
}
public void showInfo() {
    System.out.println("名字:" + getName());
    System.out.println("体重:" + getWeight());
    System.out.println("颜色:" + getColor());
    System.out.println("喜爱食物:" + getLikefood());

}
    
    
    

}