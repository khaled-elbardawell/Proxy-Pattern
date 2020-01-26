
package proxy;

import java.util.ArrayList;

interface display{
    public void display();
}

class images implements display{
    private String imgName;
    
    public images(String name){
        this.imgName=name;
        System.out.println("Loading ... "+imgName);
        display();
    }
    
    @Override
    public void display() {
      loadImage();
    }
    private void loadImage(){
        System.out.println("Display "+imgName);
    }
    
}

class proxyImage implements display{
    private String imgName;
    
    public proxyImage(String name){
        this.imgName=name;
        display();
    }
    
    @Override
    public void display() {
        new images(this.imgName);
        
    }
    
}



public class Proxy {

    public static void main(String[] args) {
      proxyImage img1 =new proxyImage("khaled.jpg");
      proxyImage img2 =new proxyImage("moh.jpg");
     
    }
    
}
