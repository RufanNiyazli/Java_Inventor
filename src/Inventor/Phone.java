package Inventor;

public class Phone {
    private String name;
    private String ram;
    private int memory;

   public Phone(String name, String ram, int memory){
       this.name=name;
       this.ram =ram;
       this.memory=memory;

   }
   public String toString(){
       return "Phone name: "+name+" Ram: "+ram+" Memory: " +memory  ;
   }
}
