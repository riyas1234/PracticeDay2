import java.util.ArrayList;
public class PracticeDay2{
	public static void main (String[]args){
		System.out.println(convertToArrayList(8950));
		System.out.println(convertToInt(convertToArrayList(8950)));
	}
	public static ArrayList <Integer> convertToArrayList (int x){
		ArrayList <Integer> a = new ArrayList<>();
		for (int i = 1; i <= 4; i ++){
			a.add(0,x%10);
			x/=10;
		}
		return a;
}

		public static int convertToInt(ArrayList<Integer> mist){
			int a=0;
			for(int i=0;i<=mist.size();i++){
				a+=mist.get(0)*(int)Math.pow(10,mist.size()-1);
				mist.remove(0);
			}
			return a;
	}
}