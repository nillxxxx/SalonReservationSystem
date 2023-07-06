package singleton;//データベース、csv、staticをまとめるためによく使われる

public class Main {

	public static void main(String[] args) {
		Singleton singleton1 = Singleton.getInstance();//シングルトンのインスタンスを作ってから取得
		Singleton singleton2 = Singleton.getInstance();//すでにシングルトンのインスタンスが作られているので、ただ取得だけをする
		
		System.out.println(singleton1 == singleton2);//参照値が等しいかどうか
		
		//シングルトンのインスタンスにあるメソッドを呼ぶ
		singleton1.Aaa();
		singleton2.Aaa();
		
		System.out.println(singleton1.hashCode());//ハッシュコード：オブジェクトの識別子として使用される
		System.out.println(singleton2.hashCode());
	}
}


class Singleton{
	//自分自身を持つ
	private static Singleton instance;
	
	//プライベートなコンストラクタを使用してインスタンス化を制限する
	private Singleton() {//直接newできなくなってる(getInstanceでだけ呼べるようにしている)
		
	}
	//偶然同時にメソッドが呼ばれてインスタンス作成が同時に発生しないようにシンクロナイズドを付ける
	public static synchronized Singleton getInstance() {
		if(instance == null) {//インスタンスが作られてなければ
			instance = new Singleton();//インスタンスを作る
		}
		return instance;
	}
	//↑ここまでがシングルトン		↓ここからは通常のメソッドの処理
	public void Aaa() {
		System.out.println("何かしらの処理");
	}
}