import java.util.*;
class diamond {
public static void main(String[] args){
	int i,j,k;
     for(i = 1;i<=5;i++){
		System.out.println();
		for(j = 1;j<=5-i;j++){
			System.out.print(" ");
               
}
	for(k= 1;k<=i*2-1;k++){
		System.out.print(k);
}
}
  for(i=5-1;i>0;i--){
	System.out.println();
	for(j=1;j<=5-i;j++){
        System.out.print(" ");

	}
	for(k=1;k<=i*2-1;k++){
		System.out.print(k);
	}
  }
}
}
