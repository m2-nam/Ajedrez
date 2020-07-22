package chess;

public enum SideColor {
 PINK , BLACK;
 
 public SideColor swapColor() {
	 if(this ==SideColor.PINK) return SideColor.BLACK;
	 return  SideColor.PINK;
 }
 public String getBetterString() {
	 if(this ==SideColor.PINK) return "Pink";
	 return  "Black";

 }
 
}
