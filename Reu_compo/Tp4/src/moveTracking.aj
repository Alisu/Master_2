
public aspect moveTracking {
private static boolean flag = false;
public static boolean testAndClear(){
	boolean result=flag;
	flag=false;return result;}


pointcut moves():
	call(void Line.setP1(Point))||
	call(void Line.setP2(Point));
	
	after():moves(){
		flag=true;
	}
	
}