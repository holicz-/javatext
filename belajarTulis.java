//Created by Fera Zulkarnain
//http://github.com/holicz-
//Java Programing base

class belajarTulis{
	static String output1="",output2="",output3="",output4="",output5="";
	public static void main(String[]args){
		System.out.print("Masukkan kata atau kalimat : ");
			java.util.Scanner scan=new java.util.Scanner(System.in);
			String teks=scan.nextLine();
		System.out.println();
		int in=1;
		int [] simpan=new int[teks.length()];
		//menambahkan karakter pertama
		simpan[0]=0;
		for(int indek=0;indek<teks.length();indek++)
				//menambahkan letak karakter spasi
				if(teks.charAt(indek)==' '){
				simpan[in]=indek+1;
				in++;
			}
		//menambahkan karakter terakhir
		simpan[in]=teks.length();
		
		//program utama
		for(int j=0;j<in;j++){
			for(int i=simpan[j];i<simpan[j+1];i++)
				kerjakan(teks.charAt(i));
		
			//menambahkan spasi supaya rata tengah	
			String spasi="";
			for(int i=(79-output1.length())/2;i>0;i--)
			spasi+=" ";
			
			//menampilkan hasil
			System.out.println(spasi+output1);
			System.out.println(spasi+output2);
			System.out.println(spasi+output3);
			System.out.println(spasi+output4);
			System.out.println(spasi+output5);
			
			//mengosongkan kembali hasil yang telah ditampilkan
			output1="";output2="";output3="";output4="";output5="";
			System.out.println();
			System.out.println();
			
		}
	}
	
	static void kerjakan(char huruf){
		switch(huruf){
			case 'A': 
				output1+="   A    ";
				output2+="  A A   ";
				output3+=" AAAAA  ";
				output4+="AA   AA ";
				output5+="AA   AA ";
				break;
			case 'B': 
				output1+="BBBBB  ";
				output2+="BB  BB ";
				output3+="BBBBB  ";
				output4+="BB  BB ";
				output5+="BBBBB  ";
				break;
			case 'C': 
				output1+=" CCCC  ";
				output2+="CC     ";
				output3+="CC     ";
				output4+="CC     ";
				output5+=" CCCC  ";
				break;
			case 'D': 
				output1+="DDDDD  ";
				output2+="DD  DD ";
				output3+="DD  DD ";
				output4+="DD  DD ";
				output5+="DDDDD  ";
				break;
			case 'E': 
				output1+="EEEEEE ";
				output2+="EE     ";
				output3+="EEEE   ";
				output4+="EE     ";
				output5+="EEEEEE ";
				break;
			case 'F': 
				output1+="FFFFFF ";
				output2+="FF     ";
				output3+="FFFF   ";
				output4+="FF     ";
				output5+="FF     ";
				break;
			case 'G': 
				output1+=" GGGGG ";
				output2+="GG     ";
				output3+="GG GGG ";
				output4+="GG  GG ";
				output5+=" GGGG  ";
				break;
			case 'H': 
				output1+="HH  HH ";
				output2+="HH  HH ";
				output3+="HHHHHH ";
				output4+="HH  HH ";
				output5+="HH  HH ";
				break;
			case 'I': 
				output1+=" IIII ";
				output2+="  II  ";
				output3+="  II  ";
				output4+="  II  ";
				output5+=" IIII ";
				break;
			case 'J': 
				output1+="JJJJJJ ";
				output2+="    JJ ";
				output3+="    JJ ";
				output4+="JJ  JJ ";
				output5+=" JJJJ  ";
				break;
			case 'K': 
				output1+="KK  KK ";
				output2+="KK KK  ";
				output3+="KKK    ";
				output4+="KK KK  ";
				output5+="KK  KK ";
				break;
			case 'L': 
				output1+="LL     ";
				output2+="LL     ";
				output3+="LL     ";
				output4+="LL     ";
				output5+="LLLLLL ";
				break;
			case 'M': 
				output1+="MM   MM ";
				output2+="MMM MMM ";
				output3+="MM M MM ";
				output4+="MM   MM ";
				output5+="MM   MM ";
				break;
			case 'N': 
				output1+="NN  NN ";
				output2+="NNN NN ";
				output3+="NNNNNN ";
				output4+="NN NNN ";
				output5+="NN  NN ";
				break;
			case 'O': 
				output1+=" OOOO  ";
				output2+="OO  OO ";
				output3+="OO  OO ";
				output4+="OO  OO ";
				output5+=" OOOO  ";
				break;
			case 'P': 
				output1+="PPPPP  ";
				output2+="PP  PP ";
				output3+="PPPPP  ";
				output4+="PP     ";
				output5+="PP     ";
				break;
			case 'Q': 
				output1+=" QQQQ  ";
				output2+="QQ  QQ ";
				output3+="QQ  QQ ";
				output4+="QQ \\QQ ";
				output5+=" QQQQ\\ ";
				break;
			case 'R': 
				output1+="RRRRR  ";
				output2+="RR  RR ";
				output3+="RRRRR  ";
				output4+="RR RR  ";
				output5+="RR  RR ";
				break;
			case 'S': 
				output1+="  SSSSS ";
				output2+=" SS     ";
				output3+="   SS   ";
				output4+="     SS ";
				output5+=" SSSSS  ";
				break;
			case 'T': 
				output1+="TTTTTT ";
				output2+="  TT   ";
				output3+="  TT   ";
				output4+="  TT   ";
				output5+="  TT   ";
				break;
			case 'U': 
				output1+="UU  UU ";
				output2+="UU  UU ";
				output3+="UU  UU ";
				output4+="UU  UU ";
				output5+=" UUUU  ";
				break;
			case 'V': 
				output1+="VV   VV ";
				output2+="VV   VV ";
				output3+=" VV VV  ";
				output4+="  VVV   ";
				output5+="   V    ";
				break;
			case 'W': 
				output1+="WW   WW ";
				output2+="WW   WW ";
				output3+="WW W WW ";
				output4+="WWW WWW ";
				output5+="WW   WW ";
				break;
			case 'X': 
				output1+="XX  XX ";
				output2+=" XXXX  ";
				output3+="  XX   ";
				output4+=" XXXX  ";
				output5+="XX  XX ";
				break;
			case 'Y': 
				output1+="YY  YY ";
				output2+=" YYYY  ";
				output3+="  YY   ";
				output4+="  YY   ";
				output5+="  YY   ";
				break;
			case 'Z': 
				output1+="ZZZZZZ ";
				output2+="   ZZ  ";
				output3+="  ZZ   ";
				output4+=" ZZ    ";
				output5+="ZZZZZZ ";
				break;
			
			case 'a': 
				output1+="      ";
				output2+="aaaa  ";
				output3+=" aaaa ";
				output4+="aa  a ";
				output5+=" aaaa ";
				break;
			case 'b': 
				output1+="      ";
				output2+="b     ";
				output3+="bbbb  ";
				output4+="b   b ";
				output5+="bbbb  ";
				break;
			case 'c': 
				output1+="      ";
				output2+=" ccc  ";
				output3+="c     ";
				output4+="c     ";
				output5+=" ccc  ";
				break;
			case 'd': 
				output1+="      ";
				output2+="    d ";
				output3+="  ddd ";
				output4+=" d  d ";
				output5+="  ddd ";
				break;
			case 'e': 
				output1+="      ";
				output2+=" eee  ";
				output3+="eeeee ";
				output4+="e     ";
				output5+=" eee  ";
				break;
			case 'f': 
				output1+="     ";
				output2+=" fff ";
				output3+="f    ";
				output4+="fff  ";
				output5+="f    ";
				break;
			case 'g': 
				output1+="     ";
				output2+=" ggg ";
				output3+="g  g ";
				output4+=" ggg ";
				output5+=" ggg ";
				break;
			case 'h': 
				output1+="     ";
				output2+="h    ";
				output3+="hhh  ";
				output4+="h  h ";
				output5+="h  h ";
				break;
			case 'i': 
				output1+="   ";
				output2+=" ' ";
				output3+=" i ";
				output4+=" i ";
				output5+=" i ";
				break;
			case 'j': 
				output1+="     ";
				output2+="   j ";
				output3+="   j ";
				output4+="   j ";
				output5+="jjj  ";
				break;
			case 'k': 
				output1+="    ";
				output2+="k   ";
				output3+="k k ";
				output4+="kk  ";
				output5+="k k ";
				break;
			case 'l': 
				output1+="    ";
				output2+="l   ";
				output3+="l   ";
				output4+="l   ";
				output5+=" ll ";
				break;
			case 'm': 
				output1+="      ";
				output2+=" m m  ";
				output3+="m m m ";
				output4+="m   m ";
				output5+="m   m ";
				break;
			case 'n': 
				output1+="      ";
				output2+=" nnn  ";
				output3+="n   n ";
				output4+="n   n ";
				output5+="n   n ";
				break;
			case 'o': 
				output1+="     ";
				output2+=" oo  ";
				output3+="o  o ";
				output4+="o  o ";
				output5+=" oo  ";
				break;
			case 'p': 
				output1+="     ";
				output2+="ppp  ";
				output3+="p  p ";
				output4+="ppp  ";
				output5+="p    ";
				break;
			case 'q': 
				output1+="     ";
				output2+=" qqq ";
				output3+="q  q ";
				output4+=" qqq ";
				output5+="   q ";
				break;
			case 'r': 
				output1+="     ";
				output2+=" rrr ";
				output3+="r    ";
				output4+="r    ";
				output5+="r    ";
				break;
			case 's': 
				output1+="     ";
				output2+=" sss ";
				output3+="s    ";
				output4+=" ss  ";
				output5+="ssss ";
				break;
			case 't': 
				output1+="     ";
				output2+=" t   ";
				output3+="ttt  ";
				output4+=" t   ";
				output5+=" ttt ";
				break;
			case 'u': 
				output1+="     ";
				output2+="u  u ";
				output3+="u  u ";
				output4+="u  u ";
				output5+=" uu  ";

				break;
			case 'v': 
				output1+="      ";
				output2+="v   v ";
				output3+="v   v ";
				output4+=" v v  ";
				output5+="  v   ";
				break;
			case 'w': 
				output1+="      ";
				output2+="w   w ";
				output3+="w w w ";
				output4+="w w w ";
				output5+=" w w  ";
				break;
			case 'x': 
				output1+="     ";
				output2+="x  x ";
				output3+=" xx  ";
				output4+=" xx  ";
				output5+="x  x ";
				break;
			case 'y': 
				output1+="      ";
				output2+="y   y ";
				output3+=" y y  ";
				output4+="  y   ";
				output5+=" y    ";
				break;
			case 'z': 
				output1+="     ";
				output2+="zzzz ";
				output3+="  z  ";
				output4+=" z   ";
				output5+="zzzz ";
				break;

			case '0': 
				output1+=" 0000  ";
				output2+="00  00 ";
				output3+="00  00 ";
				output4+="00  00 ";
				output5+=" 0000  ";
				break;
			case '1': 
				output1+="  11  ";
				output2+=" 111  ";
				output3+="  11  ";
				output4+="  11  ";
				output5+=" 1111 ";
				break;
			case '2': 
				output1+=" 2222  ";
				output2+="22  22 ";
				output3+="   22  ";
				output4+="  22   ";
				output5+="222222 ";
				break;
			case '3': 
				output1+=" 3333  ";
				output2+="3   33 ";
				output3+="  333  ";
				output4+="3   33 ";
				output5+=" 3333  ";
				break;
			case '4': 
				output1+="    44 ";
				output2+="  4444 ";
				output3+=" 44 44 ";
				output4+="444444 ";
				output5+="    44 ";
				break;
			case '5': 
				output1+="555555 ";
				output2+="55     ";
				output3+="55555  ";
				output4+="    55 ";
				output5+="55555  ";
				break;
			case '6': 
				output1+="  6666 ";
				output2+=" 66    ";
				output3+="66666  ";
				output4+="66  66 ";
				output5+=" 6666  ";
				break;
			case '7': 
				output1+="777777 ";
				output2+="   77  ";
				output3+="  77   ";
				output4+=" 77    ";
				output5+="77     ";
				break;
			case '8': 
				output1+=" 8888  ";
				output2+="88  88 ";
				output3+=" 8888  ";
				output4+="88  88 ";
				output5+=" 8888  ";
				break;
			case '9': 
				output1+=" 9999  ";
				output2+="99  99 ";
				output3+=" 99999 ";
				output4+="    99 ";
				output5+=" 9999  ";
				break;
			
			default: 
				output1+="";
				output2+="";
				output3+="";
				output4+="";
				output5+="";
		}
	}
}
