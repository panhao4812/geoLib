package GeoTools;

public class MeshFace{
	public int a;
	public int b;
	public int c;
	public int d;
	public MeshFace(int p1,int p2,int p3,int p4){
		a=p1;b=p2;c=p3;	d=p4;
	}
	public MeshFace(int p1,int p2,int p3){
		a=p1;b=p2;c=p3;	d=p3;
	}
	public boolean isTriangle(){if(c==d)return true;
	return false;
	}
	public boolean isQuad(){if(c==d)return false;
	return true;
	}
	public boolean equalTo(MeshFace f){
		if((a==f.a)&&(b==f.b)&&(b==f.b)&&(b==f.b)){return true;}else{return false;}	
	}
}
