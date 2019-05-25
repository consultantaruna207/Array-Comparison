package com.dkak.java.practice;

public class Person1 implements Comparable {
	int pid;
	String pname;
	
	Person1(int pid, String pname)
	{
		this.pid = pid;
		this.pname = pname;
	}

	@Override
	public String toString() {
		return "Person1 [pid=" + pid + ", pname=" + pname + "]";
	}
@Override
	public int compareTo(Object o1) {
		Person1 p= (Person1) o1;
		if(this.pid > p.pid)
		{
			return 1;
		}
		else if(this.pid<p.pid)
		{
			return -1;
		}
		else {
			return 0;
	}
		
	}


	

}
