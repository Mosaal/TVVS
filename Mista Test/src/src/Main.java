package src;

import java.util.ArrayList;

public class Main {

	public ArrayList<String> onList = new ArrayList<>();
	public ArrayList<String> offList = new ArrayList<>();
	
	public void addString(String str) {
		if (!onList.contains(str) && offList.contains(str)) {
			onList.add(str);
			offList.remove(str);
		}
	}
	
	public void removeString(String str) {
		if (onList.contains(str) && !offList.contains(str)) {
			onList.remove(str);
			offList.add(str);
		}
	}
	
	public int getNumStrings() {
		return onList.size();
	}
	
	public static void main(String[] args) {}
}