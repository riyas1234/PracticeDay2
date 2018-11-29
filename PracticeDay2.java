import java.util.ArrayList;
public class PracticeDay2{
	public static void main (String[]args){
		System.out.println(convertToArrayList(8950));
	}
	public static ArrayList <Integer> convertToArrayList (int x){
		ArrayList <Integer> a = new ArrayList<>();
		for (int i = 1; i <= 4; i ++){
			a.add(0,x%10);
			x/=10;
		}
		return a;
	}
}