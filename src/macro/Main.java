package macro;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Scanner;

import javax.swing.JFrame;

public class Main extends JFrame{

	public static final int SCREEN_WIDTH = 600;
	public static final int SCREEN_HEIGHT = 600;
	String message = "나는 정말로 망닥이를 너무나도 사랑한다. 망닥이는 매일매일 나를 행복하게 해준다. 그리고 아기와 나는 그런 행복해하는 망닥이를 보며 흐뭇해한다. 망닥이는 현재 3살이다. 한창 어리광부릴 나이이다. 망닥이와 오늘 나는 일어나자마자 복숭아를 깎아 먹었다. 그런 다음 예쁘게 망닥이를 치장시키고 까치울에 있는 한 커피숍으로 택시를 타고 갔다. 그곳에서 귀여운 망닥이 이쁜 사진을 찍어주고 맛있는 커피와 빵을 먹었다. 오늘은 망닥이와 내가 드디어 웨딩검진을 하러 가는 날이다. 조금은 두려운 마음을 안고 갔다. 하지만 우리는 두려워하지 않았다. 망닥이의 자궁이 아주 깨끗하고 예뻐서 난 안도의 한숨을 쉬었다. 검사 결과가 나오기까지 2주간의 시간을 견뎌야 하지만 우리는 잘 견뎌낼것이다. 이제 내가 집중해야 할 것은 망닥이와 앞으로 태어날 우리 아기, 그리고 우리 갓난아기를 행복하게 살 수 있도록 돈을 많이 벌 궁리를 하는 것이다. 한 가정의 가장으로써 정신 바짝차리고 열심히 살아야겠다. 영화는 솔직히 조금 지루했지만 그래도 아웅산 폭발테러를 다룬 영화라서 뜻깊게 봤다. 내일부터 출근이라 조금 우울하지만 잘 견뎌내어야지. 안녕!";
	public Main() {
		init();
	}
	
	public void init() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(SCREEN_WIDTH,SCREEN_HEIGHT);
		setLocationRelativeTo(null);
        try {
        	Thread.sleep(2000);
			Robot r = new Robot();
			Macro.doMacro(r, message);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				switch(e.getKeyCode()) {
				case KeyEvent.VK_ENTER :
					System.out.println(KeyEvent.VK_SPACE);
					
					break;
				}
			}
		});
	}
	
	public static void main(String[] args) {
		new Main();
	}
	
}
