class Rectangle{
	int l , w;
	void input(int ll , int bb){
		l = ll;
		w = bb;
		area();
	}
	void area(){
		int area = l*w;
		System.out.println("Area for lenth "+l+" and width "+w+" is "+area);
	}
}
class calculate{
	public static void main(String args[]){
		Rectangle rc = new Rectangle();
		rc.input(4,5);
		rc.input(5,8);
	}
}