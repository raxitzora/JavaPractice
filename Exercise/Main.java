package Exercise;



class Rectangle{
    int width;
    int height;

    public void area(){
        System.out.println("Area:"+ width*height);
    }
}


class Main{

public static void main(){
Rectangle rectangle = new Rectangle();
rectangle.width = 10;
rectangle.height = 5;
rectangle.area();
}
}
