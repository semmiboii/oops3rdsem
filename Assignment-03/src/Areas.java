class Areas {
    int length , breadth;
    void setDim(int length , int Breadth){
        this.breadth = Breadth;
        this.length = length;
    }
    int getArea(){
        int area = length*breadth;
        return area;
    }
}
class area_check{
    public static void main(String[] args) {
        Areas a = new Areas();
        a.setDim(22 , 33);
        System.out.println("Area is "+a.getArea());
    }
}
