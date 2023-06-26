package Test;

import Selenium.Frame;

public class FrameTest {
public static void main(String[] args) {
	Frame obj=new Frame();
    obj.OpenBrowser();
    obj.OpenUrl("https://demo.automationtesting.in/Frames.html");
    obj.click();
    obj.SetTextINFrame("vasu");
}
}
