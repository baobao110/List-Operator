import java.util.Arrays;

public class F {
	private Object[]a;
	private int b=0;
	public F(){
		a=new Object[2];
	}
	public F(int a){
		this.a=new Object[a];
	}
	public void add(Object c){
		if(b<a.length){
			a[b]=c;
		}
		else{
			a=Arrays.copyOf(a, a.length+1);
			a[b]=c;
		}
		b++;
	}
	public Object get(int i){
		if(i>=a.length||i<0)
			return null;
		else
			return a[i];
	}
	public void change(int i,Object b){
		if(i>=a.length||i<0){
			return;
		}
		else{
			a[i]=b;
		}
	}
	public void delete(int i ){
		if(i>=a.length||i<0){
			return;
		}
		else
		{
			for(int j=i;j<a.length-1;j++){
				a[j]=a[j+1];
			}
		}
		a=Arrays.copyOf(a,a.length-1);
	}
	/*public void delete(Object m){
		int j=0;
		for(int i=0;i<a.length;i++){
			if(a[i].equals(m))
			{
				j=i;
				break;
			}
		}
		for(int i=j;i<a.length-1;i++)
			a[i]=a[i+1];
		a=Arrays.copyOf(a,a.length-1);
	}*/
	public String toString(){
		return Arrays.toString(a);
	}
}