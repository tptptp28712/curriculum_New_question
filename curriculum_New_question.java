package curriculum_New_question;

import java.util.*;
public class curriculum_New_question{

	    private static void printThreeValues(String moji,String moji2,int suuji) {
     // Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
	 // 出力
System.out.println(moji+" "+moji2+" "+suuji);
}
private static void printThreeValues2(int first,int second,int[] array) {
	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
	System.out.println(first*second);

// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください

   
    for(int i=0; i<array.length; i++) {
            System.out.println(array[i]);
        }


  // Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
  
	System.out.println((double)first+(double)second);
}


// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。
	public static void printThreeValues4(int num) {
	    
		// 数字入力

int[] ss = new int[num];
Random rand = new Random();
    int num2 = 0;
int num3 =0;
//　ランダム出力
for(int v=1;v<=num;v++){
    num2 = rand.nextInt(100) + 1;
System.out.println(num2);
ss[num3] = num2;
num3 = num3 + 1;

}
	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。
double average = Arrays.stream(ss).average().getAsDouble();
        System.out.println(average);
        	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
        boolean flag = true;
         flag = (average >= 50);
    System.out.println(flag);
  
	}

	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
	public static void main(String[] args) {
    // 作成したメソッドをここで呼び出してください
     printThreeValues("Hello","JavaSE",11);
     int[] array = { 1, 2, 3 };
     printThreeValues2(2,2,array);
     
      printThreeValues4(5);
	}
    	}
