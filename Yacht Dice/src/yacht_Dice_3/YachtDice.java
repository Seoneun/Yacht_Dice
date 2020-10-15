package yacht_Dice_3;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;


public class YachtDice extends JFrame {
	
	private Image screenImage;
	private Graphics screenGraphic;
	
	private Image introBackground = new ImageIcon(Main.class.getResource("../images/introBackground.jpg")).getImage();
	private ImageIcon exitButtonImage = new ImageIcon(Main.class.getResource("../images/exitButton.png"));
	
	private ImageIcon blankDiceImage = new ImageIcon(Main.class.getResource("../images/blankDice.jpg"));
	private ImageIcon dice1Image = new ImageIcon(Main.class.getResource("../images/dice1.jpg"));
	private ImageIcon dice2Image = new ImageIcon(Main.class.getResource("../images/dice2.jpg"));
	private ImageIcon dice3Image = new ImageIcon(Main.class.getResource("../images/dice3.jpg"));
	private ImageIcon dice4Image = new ImageIcon(Main.class.getResource("../images/dice4.jpg"));
	private ImageIcon dice5Image = new ImageIcon(Main.class.getResource("../images/dice5.jpg"));
	private ImageIcon dice6Image = new ImageIcon(Main.class.getResource("../images/dice6.jpg"));
	
	private ImageIcon dice1ImagePressed = new ImageIcon(Main.class.getResource("../images/dice1Pressedjpg.jpg"));
	private ImageIcon dice2ImagePressed = new ImageIcon(Main.class.getResource("../images/dice2Pressedjpg.jpg"));
	private ImageIcon dice3ImagePressed = new ImageIcon(Main.class.getResource("../images/dice3Pressedjpg.jpg"));
	private ImageIcon dice4ImagePressed = new ImageIcon(Main.class.getResource("../images/dice4Pressedjpg.jpg"));
	private ImageIcon dice5ImagePressed = new ImageIcon(Main.class.getResource("../images/dice5Pressedjpg.jpg"));
	private ImageIcon dice6ImagePressed = new ImageIcon(Main.class.getResource("../images/dice6Pressedjpg.jpg"));
	
	private JButton exitButton = new JButton(exitButtonImage);
	
	private JButton dice1 = new JButton(blankDiceImage);
	private JButton dice2 = new JButton(blankDiceImage);
	private JButton dice3 = new JButton(blankDiceImage);
	private JButton dice4 = new JButton(blankDiceImage);
	private JButton dice5 = new JButton(blankDiceImage);
	private JButton dice6 = new JButton(blankDiceImage);
	
	private ImageIcon diceButtonImage = new ImageIcon(Main.class.getResource("../images/diceButton.jpg"));
	private ImageIcon diceButtonImageEntered = new ImageIcon(Main.class.getResource("../images/diceButtonEntered.jpg"));
	
	private ImageIcon count0Image = new ImageIcon(Main.class.getResource("../images/count0.jpg"));
	private ImageIcon count1Image = new ImageIcon(Main.class.getResource("../images/count1.jpg"));
	private ImageIcon count2Image = new ImageIcon(Main.class.getResource("../images/count2.jpg"));
	private ImageIcon count3Image = new ImageIcon(Main.class.getResource("../images/count3.jpg"));
	
	private JButton count = new JButton(count0Image);
	
	private JButton diceButton = new JButton(diceButtonImage);
	
	private ImageIcon wordsImage = new ImageIcon(Main.class.getResource("../images/words.jpg"));
	private JButton words = new JButton(wordsImage);
	
	private ImageIcon Ranking1Image = new ImageIcon(Main.class.getResource("../images/Ranking_1.jpg"));
	private ImageIcon Ranking2Image = new ImageIcon(Main.class.getResource("../images/Ranking_2.jpg"));
	private ImageIcon Ranking3Image = new ImageIcon(Main.class.getResource("../images/Ranking_3.jpg"));
	private ImageIcon Ranking4Image = new ImageIcon(Main.class.getResource("../images/Ranking_4.jpg"));
	private ImageIcon Ranking5Image = new ImageIcon(Main.class.getResource("../images/Ranking_5.jpg"));
	private ImageIcon Ranking6Image = new ImageIcon(Main.class.getResource("../images/Ranking_6.jpg"));
	private ImageIcon RankingBonusImage = new ImageIcon(Main.class.getResource("../images/Ranking_Bonus.jpg"));
	private ImageIcon RankingChanceImage = new ImageIcon(Main.class.getResource("../images/Ranking_Chance.jpg"));
	private ImageIcon RankingFourOfAKindImage = new ImageIcon(Main.class.getResource("../images/Ranking_FourOfAKind.jpg"));
	private ImageIcon RankingFullHouseImage = new ImageIcon(Main.class.getResource("../images/Ranking_FullHouse.jpg"));
	private ImageIcon RankingSmallStraightImage = new ImageIcon(Main.class.getResource("../images/Raning_SmallStraight.jpg"));
	private ImageIcon RankingLargeStraightImage = new ImageIcon(Main.class.getResource("../images/Ranking_LargeStraight.jpg"));
	private ImageIcon RankingYachtImage = new ImageIcon(Main.class.getResource("../images/Ranking_Yacht.jpg"));
	private ImageIcon RankingTotalImage = new ImageIcon(Main.class.getResource("../images/Ranking_Total.jpg"));
	
	private JButton Ranking1 = new JButton(Ranking1Image);
	private JButton Ranking2 = new JButton(Ranking2Image);
	private JButton Ranking3 = new JButton(Ranking3Image);
	private JButton Ranking4 = new JButton(Ranking4Image);
	private JButton Ranking5 = new JButton(Ranking5Image);
	private JButton Ranking6 = new JButton(Ranking6Image);
	private JButton RankingBonus = new JButton(RankingBonusImage);
	private JButton RankingChance = new JButton(RankingChanceImage);
	private JButton RankingFourOfAKind = new JButton(RankingFourOfAKindImage);
	private JButton RankingFullHouse = new JButton(RankingFullHouseImage);
	private JButton RankingSmallStraight = new JButton(RankingSmallStraightImage);
	private JButton RankingLargeStraight = new JButton(RankingLargeStraightImage);
	private JButton RankingYacht = new JButton(RankingYachtImage);
	private JButton RankingTotal = new JButton(RankingTotalImage);
	
	private ImageIcon Points0Image = new ImageIcon(Main.class.getResource("../images/Points_0.jpg"));
	private ImageIcon Points1Image = new ImageIcon(Main.class.getResource("../images/Points_1.jpg"));
	private ImageIcon Points2Image = new ImageIcon(Main.class.getResource("../images/Points_2.jpg"));
	private ImageIcon Points3Image = new ImageIcon(Main.class.getResource("../images/Points_3.jpg"));
	private ImageIcon Points4Image = new ImageIcon(Main.class.getResource("../images/Points_4.jpg"));
	private ImageIcon Points5Image = new ImageIcon(Main.class.getResource("../images/Points_5.jpg"));
	private ImageIcon Points6Image = new ImageIcon(Main.class.getResource("../images/Points_6.jpg"));
	private ImageIcon Points7Image = new ImageIcon(Main.class.getResource("../images/Points_7.jpg"));
	private ImageIcon Points8Image = new ImageIcon(Main.class.getResource("../images/Points_8.jpg"));
	private ImageIcon Points9Image = new ImageIcon(Main.class.getResource("../images/Points_9.jpg"));
	private ImageIcon Points10Image = new ImageIcon(Main.class.getResource("../images/Points_10.jpg"));
	private ImageIcon Points11Image = new ImageIcon(Main.class.getResource("../images/Points_11.jpg"));
	private ImageIcon Points12Image = new ImageIcon(Main.class.getResource("../images/Points_12.jpg"));
	private ImageIcon Points13Image = new ImageIcon(Main.class.getResource("../images/Points_13.jpg"));
	private ImageIcon Points14Image = new ImageIcon(Main.class.getResource("../images/Points_14.jpg"));
	private ImageIcon Points15Image = new ImageIcon(Main.class.getResource("../images/Points_15.jpg"));
	private ImageIcon Points16Image = new ImageIcon(Main.class.getResource("../images/Points_16.jpg"));
	private ImageIcon Points17Image = new ImageIcon(Main.class.getResource("../images/Points_17.jpg"));
	private ImageIcon Points18Image = new ImageIcon(Main.class.getResource("../images/Points_18.jpg"));
	private ImageIcon Points19Image = new ImageIcon(Main.class.getResource("../images/Points_19.jpg"));
	private ImageIcon Points20Image = new ImageIcon(Main.class.getResource("../images/Points_20.jpg"));
	private ImageIcon Points21Image = new ImageIcon(Main.class.getResource("../images/Points_21.jpg"));
	private ImageIcon Points22Image = new ImageIcon(Main.class.getResource("../images/Points_22.jpg"));
	private ImageIcon Points23Image = new ImageIcon(Main.class.getResource("../images/Points_23.jpg"));
	private ImageIcon Points24Image = new ImageIcon(Main.class.getResource("../images/Points_24.jpg"));
	private ImageIcon Points25Image = new ImageIcon(Main.class.getResource("../images/Points_25.jpg"));
	private ImageIcon Points26Image = new ImageIcon(Main.class.getResource("../images/Points_26.jpg"));
	private ImageIcon Points27Image = new ImageIcon(Main.class.getResource("../images/Points_27.jpg"));
	private ImageIcon Points28Image = new ImageIcon(Main.class.getResource("../images/Points_28.jpg"));
	private ImageIcon Points29Image = new ImageIcon(Main.class.getResource("../images/Points_29.jpg"));
	private ImageIcon Points30Image = new ImageIcon(Main.class.getResource("../images/Points_30.jpg"));
	private ImageIcon Points31Image = new ImageIcon(Main.class.getResource("../images/Points_31.jpg"));
	private ImageIcon Points32Image = new ImageIcon(Main.class.getResource("../images/Points_32.jpg"));
	private ImageIcon Points33Image = new ImageIcon(Main.class.getResource("../images/Points_33.jpg"));
	private ImageIcon Points34Image = new ImageIcon(Main.class.getResource("../images/Points_34.jpg"));
	private ImageIcon Points35Image = new ImageIcon(Main.class.getResource("../images/Points_35.jpg"));
	private ImageIcon Points36Image = new ImageIcon(Main.class.getResource("../images/Points_36.jpg"));
	private ImageIcon Points50Image = new ImageIcon(Main.class.getResource("../images/Points_50.jpg"));
	
	private ImageIcon Points0ImagePressed = new ImageIcon(Main.class.getResource("../images/Points_0Pressed.jpg"));
	private ImageIcon Points1ImagePressed = new ImageIcon(Main.class.getResource("../images/Points_1Pressed.jpg"));
	private ImageIcon Points2ImagePressed = new ImageIcon(Main.class.getResource("../images/Points_2Pressed.jpg"));
	private ImageIcon Points3ImagePressed = new ImageIcon(Main.class.getResource("../images/Points_3Pressed.jpg"));
	private ImageIcon Points4ImagePressed = new ImageIcon(Main.class.getResource("../images/Points_4Pressed.jpg"));
	private ImageIcon Points5ImagePressed = new ImageIcon(Main.class.getResource("../images/Points_5Pressed.jpg"));
	private ImageIcon Points6ImagePressed = new ImageIcon(Main.class.getResource("../images/Points_6Pressed.jpg"));
	private ImageIcon Points7ImagePressed = new ImageIcon(Main.class.getResource("../images/Points_7Pressed.jpg"));
	private ImageIcon Points8ImagePressed = new ImageIcon(Main.class.getResource("../images/Points_8Pressed.jpg"));
	private ImageIcon Points9ImagePressed = new ImageIcon(Main.class.getResource("../images/Points_9Pressed.jpg"));
	private ImageIcon Points10ImagePressed = new ImageIcon(Main.class.getResource("../images/Points_10Pressed.jpg"));
	private ImageIcon Points11ImagePressed = new ImageIcon(Main.class.getResource("../images/Points_11Pressed.jpg"));
	private ImageIcon Points12ImagePressed = new ImageIcon(Main.class.getResource("../images/Points_12Pressed.jpg"));
	private ImageIcon Points13ImagePressed = new ImageIcon(Main.class.getResource("../images/Points_13Pressed.jpg"));
	private ImageIcon Points14ImagePressed = new ImageIcon(Main.class.getResource("../images/Points_14Pressed.jpg"));
	private ImageIcon Points15ImagePressed = new ImageIcon(Main.class.getResource("../images/Points_15Pressed.jpg"));
	private ImageIcon Points16ImagePressed = new ImageIcon(Main.class.getResource("../images/Points_16Pressed.jpg"));
	private ImageIcon Points17ImagePressed = new ImageIcon(Main.class.getResource("../images/Points_17Pressed.jpg"));
	private ImageIcon Points18ImagePressed = new ImageIcon(Main.class.getResource("../images/Points_18Pressed.jpg"));
	private ImageIcon Points19ImagePressed = new ImageIcon(Main.class.getResource("../images/Points_19Pressed.jpg"));
	private ImageIcon Points20ImagePressed = new ImageIcon(Main.class.getResource("../images/Points_20Pressed.jpg"));
	private ImageIcon Points21ImagePressed = new ImageIcon(Main.class.getResource("../images/Points_21Pressed.jpg"));
	private ImageIcon Points22ImagePressed = new ImageIcon(Main.class.getResource("../images/Points_22Pressed.jpg"));
	private ImageIcon Points23ImagePressed = new ImageIcon(Main.class.getResource("../images/Points_23Pressed.jpg"));
	private ImageIcon Points24ImagePressed = new ImageIcon(Main.class.getResource("../images/Points_24Pressed.jpg"));
	private ImageIcon Points25ImagePressed = new ImageIcon(Main.class.getResource("../images/Points_25Pressed.jpg"));
	private ImageIcon Points26ImagePressed = new ImageIcon(Main.class.getResource("../images/Points_26Pressed.jpg"));
	private ImageIcon Points27ImagePressed = new ImageIcon(Main.class.getResource("../images/Points_27Pressed.jpg"));
	private ImageIcon Points28ImagePressed = new ImageIcon(Main.class.getResource("../images/Points_28Pressed.jpg"));
	private ImageIcon Points29ImagePressed = new ImageIcon(Main.class.getResource("../images/Points_29Pressed.jpg"));
	private ImageIcon Points30ImagePressed = new ImageIcon(Main.class.getResource("../images/Points_30Pressed.jpg"));
	private ImageIcon Points31ImagePressed = new ImageIcon(Main.class.getResource("../images/Points_31Pressed.jpg"));
	private ImageIcon Points32ImagePressed = new ImageIcon(Main.class.getResource("../images/Points_32Pressed.jpg"));
	private ImageIcon Points33ImagePressed = new ImageIcon(Main.class.getResource("../images/Points_33Pressed.jpg"));
	private ImageIcon Points34ImagePressed = new ImageIcon(Main.class.getResource("../images/Points_34Pressed.jpg"));
	private ImageIcon Points35ImagePressed = new ImageIcon(Main.class.getResource("../images/Points_35Pressed.jpg"));
	private ImageIcon Points36ImagePressed = new ImageIcon(Main.class.getResource("../images/Points_36Pressed.jpg"));
	private ImageIcon Points50ImagePressed = new ImageIcon(Main.class.getResource("../images/Points_50Pressed.jpg"));
	
	private JButton Points0 = new JButton(Points0Image);
	private JButton Points1 = new JButton(Points1Image);
	private JButton Points2 = new JButton(Points2Image);
	private JButton Points3 = new JButton(Points3Image);
	private JButton Points4 = new JButton(Points4Image);
	private JButton Points5 = new JButton(Points5Image);
	
	private JButton Points0_2 = new JButton(Points0Image);
	private JButton Points2_2 = new JButton(Points2Image);
	private JButton Points4_2 = new JButton(Points4Image);
	private JButton Points6 = new JButton(Points6Image);
	private JButton Points8 = new JButton(Points8Image);
	private JButton Points10 = new JButton(Points10Image);
	
	private JButton Points0_3 = new JButton(Points0Image);
	private JButton Points3_3 = new JButton(Points3Image);
	private JButton Points6_3 = new JButton(Points6Image);
	private JButton Points9 = new JButton(Points9Image);
	private JButton Points12 = new JButton(Points12Image);
	private JButton Points15 = new JButton(Points15Image);
	
	private JButton Points0_4 = new JButton(Points0Image);
	private JButton Points4_4 = new JButton(Points4Image);
	private JButton Points8_4 = new JButton(Points8Image);
	private JButton Points12_4 = new JButton(Points12Image);
	private JButton Points16 = new JButton(Points16Image);
	private JButton Points20 = new JButton(Points20Image);
	
	private JButton Points0_5 = new JButton(Points0Image);
	private JButton Points5_5 = new JButton(Points5Image);
	private JButton Points10_5 = new JButton(Points10Image);
	private JButton Points15_5 = new JButton(Points15Image);
	private JButton Points20_5 = new JButton(Points20Image);
	private JButton Points25 = new JButton(Points25Image);
	
	private JButton Points0_6 = new JButton(Points0Image);
	private JButton Points6_6 = new JButton(Points6Image);
	private JButton Points12_6 = new JButton(Points12Image);
	private JButton Points18 = new JButton(Points18Image);
	private JButton Points24 = new JButton(Points24Image);
	private JButton Points30 = new JButton(Points30Image);
	
	//chance
	JButton PointsChance = new JButton(Points0Image);
	
	// bonus
	private JButton PointsBonus = new JButton(Points35Image);
	
	// fourofakind
	private JButton PointsFourOfAKind = new JButton(Points0Image);
	
	//fullhouse
	private JButton PointsFullHouse = new JButton(Points0Image);
	
	// smallstraight
	private JButton PointsSmallstraight = new JButton(Points15Image);
	
	// largestraight
	private JButton PointsLargestraight = new JButton(Points30Image);
	
	// yacht
	private JButton PointsYacht = new JButton(Points50Image);
	
	ArrayList<JButton> DdiceList = new ArrayList<JButton>();
	ArrayList<ImageIcon> diceList = new ArrayList<ImageIcon>();
	ArrayList<ImageIcon> dicePressedList = new ArrayList<ImageIcon>();
	ArrayList<ImageIcon> PointsList = new ArrayList<ImageIcon>();
	ArrayList<ImageIcon> PointsPressedList = new ArrayList<ImageIcon>();
	
	Random random = new Random();
	
	private int mouseX, mouseY;
	
	public YachtDice() {
		
		setUndecorated(true);
		setTitle("Yacht Dice");
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEGHT);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setBackground(new Color(0, 0, 0, 0));
		setLayout(null);
		
		exitButton.setBounds(1820, 0, 30, 30);
		exitButton.setContentAreaFilled(false);
		exitButton.setFocusPainted(false);
		exitButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				exitButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				exitButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				System.exit(0);
			}
		});
		add(exitButton);
		
		//Music introMusic = new Music("Debussy_ ClaireDeLune.mp3", true);
		//introMusic.start();
		
		diceList.add(dice1Image);
		diceList.add(dice2Image);
		diceList.add(dice3Image);
		diceList.add(dice4Image);
		diceList.add(dice5Image);
		diceList.add(dice6Image);
		
		dicePressedList.add(dice1ImagePressed);
		dicePressedList.add(dice2ImagePressed);
		dicePressedList.add(dice3ImagePressed);
		dicePressedList.add(dice4ImagePressed);
		dicePressedList.add(dice5ImagePressed);
		dicePressedList.add(dice6ImagePressed);
		
		DdiceList.add(dice1);
		DdiceList.add(dice2);
		DdiceList.add(dice3);
		DdiceList.add(dice4);
		DdiceList.add(dice5);
		
		PointsList.add(Points0Image);
		PointsList.add(Points1Image);
		PointsList.add(Points2Image);
		PointsList.add(Points3Image);
		PointsList.add(Points4Image);
		PointsList.add(Points5Image);
		PointsList.add(Points6Image);
		PointsList.add(Points7Image);
		PointsList.add(Points8Image);
		PointsList.add(Points9Image);
		PointsList.add(Points10Image);
		PointsList.add(Points11Image);
		PointsList.add(Points12Image);
		PointsList.add(Points13Image);
		PointsList.add(Points14Image);
		PointsList.add(Points15Image);
		PointsList.add(Points16Image);
		PointsList.add(Points17Image);
		PointsList.add(Points18Image);
		PointsList.add(Points19Image);
		PointsList.add(Points20Image);
		PointsList.add(Points21Image);
		PointsList.add(Points22Image);
		PointsList.add(Points23Image);
		PointsList.add(Points24Image);
		PointsList.add(Points25Image);
		PointsList.add(Points26Image);
		PointsList.add(Points27Image);
		PointsList.add(Points28Image);
		PointsList.add(Points29Image);
		PointsList.add(Points30Image);
		PointsList.add(Points31Image);
		PointsList.add(Points32Image);
		PointsList.add(Points33Image);
		PointsList.add(Points34Image);
		PointsList.add(Points35Image);
		PointsList.add(Points36Image);
		PointsList.add(Points50Image);
		
		PointsPressedList.add(Points0ImagePressed);
		PointsPressedList.add(Points1ImagePressed);
		PointsPressedList.add(Points2ImagePressed);
		PointsPressedList.add(Points3ImagePressed);
		PointsPressedList.add(Points4ImagePressed);
		PointsPressedList.add(Points5ImagePressed);
		PointsPressedList.add(Points6ImagePressed);
		PointsPressedList.add(Points7ImagePressed);
		PointsPressedList.add(Points8ImagePressed);
		PointsPressedList.add(Points9ImagePressed);
		PointsPressedList.add(Points10ImagePressed);
		PointsPressedList.add(Points11ImagePressed);
		PointsPressedList.add(Points12ImagePressed);
		PointsPressedList.add(Points13ImagePressed);
		PointsPressedList.add(Points14ImagePressed);
		PointsPressedList.add(Points15ImagePressed);
		PointsPressedList.add(Points16ImagePressed);
		PointsPressedList.add(Points17ImagePressed);
		PointsPressedList.add(Points18ImagePressed);
		PointsPressedList.add(Points19ImagePressed);
		PointsPressedList.add(Points20ImagePressed);
		PointsPressedList.add(Points21ImagePressed);
		PointsPressedList.add(Points22ImagePressed);
		PointsPressedList.add(Points23ImagePressed);
		PointsPressedList.add(Points24ImagePressed);
		PointsPressedList.add(Points25ImagePressed);
		PointsPressedList.add(Points26ImagePressed);
		PointsPressedList.add(Points27ImagePressed);
		PointsPressedList.add(Points28ImagePressed);
		PointsPressedList.add(Points29ImagePressed);
		PointsPressedList.add(Points30ImagePressed);
		PointsPressedList.add(Points31ImagePressed);
		PointsPressedList.add(Points32ImagePressed);
		PointsPressedList.add(Points33ImagePressed);
		PointsPressedList.add(Points34ImagePressed);
		PointsPressedList.add(Points35ImagePressed);
		PointsPressedList.add(Points36ImagePressed);
		PointsPressedList.add(Points50ImagePressed);
		
		diceSetting(dice1, 50, 50, 250, 250);
		diceSetting(dice2, 350, 50, 250, 250);
		diceSetting(dice3, 650, 50, 250, 250);
		diceSetting(dice4, 950, 50, 250, 250);
		diceSetting(dice5, 1250, 50, 250, 250);
		
		selectPoints(Points0);
		selectPoints(Points1);
		selectPoints(Points2);
		selectPoints(Points3);
		selectPoints(Points4);
		selectPoints(Points5);
		selectPoints(Points0_2);
		selectPoints(Points2_2);
		selectPoints(Points4_2);
		selectPoints(Points6);
		selectPoints(Points8);
		selectPoints(Points10);
		selectPoints(Points0_3);
		selectPoints(Points3_3);
		selectPoints(Points6_3);
		selectPoints(Points9);
		selectPoints(Points12);
		selectPoints(Points15);
		selectPoints(Points0_4);
		selectPoints(Points4_4);
		selectPoints(Points8_4);
		selectPoints(Points12_4);
		selectPoints(Points16);
		selectPoints(Points20);
		selectPoints(Points0_5);
		selectPoints(Points5_5);
		selectPoints(Points10_5);
		selectPoints(Points15_5);
		selectPoints(Points20_5);
		selectPoints(Points25);
		selectPoints(Points0_6);
		selectPoints(Points6_6);
		selectPoints(Points12_6);
		selectPoints(Points18);
		selectPoints(Points24);
		selectPoints(Points30);
		selectPoints(PointsChance);
		//selectPoints(PointsBonus);
		selectPoints(PointsFourOfAKind);
		selectPoints(PointsFullHouse);
		selectPoints(PointsSmallstraight);
		selectPoints(PointsLargestraight);
		selectPoints(PointsYacht);
		diceButton.setBounds(1400, 650, 375, 250);
		diceButton.setContentAreaFilled(false);
		diceButton.setFocusPainted(false);
		diceButton.addMouseListener(new MouseAdapter() {			
			int playTime = 1;
			
			@Override
			public void mouseEntered(MouseEvent e) {
				diceButton.setIcon(diceButtonImageEntered);
				diceButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				diceButton.setIcon(diceButtonImage);
				diceButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				
				if(diceList.contains(dice1.getIcon()) || dice1.getIcon() == blankDiceImage)
					dice1.setIcon(diceList.get(random.nextInt(6)));
				if(diceList.contains(dice2.getIcon()) || dice2.getIcon() == blankDiceImage)
					dice2.setIcon(diceList.get(random.nextInt(6)));
				if(diceList.contains(dice3.getIcon()) || dice3.getIcon() == blankDiceImage)
					dice3.setIcon(diceList.get(random.nextInt(6)));
				if(diceList.contains(dice4.getIcon()) || dice4.getIcon() == blankDiceImage)
					dice4.setIcon(diceList.get(random.nextInt(6)));
				if(diceList.contains(dice5.getIcon()) || dice5.getIcon() == blankDiceImage)
					dice5.setIcon(diceList.get(random.nextInt(6)));
				if(diceList.contains(dice6.getIcon()) || dice6.getIcon() == blankDiceImage)
					dice6.setIcon(diceList.get(random.nextInt(6)));
				if(count.getIcon() == count0Image) {
					count.setIcon(count1Image);
					
					countDice(dice1Image, dice1ImagePressed, Points0, Points1, Points2, Points3, Points4, Points5);
					countDice(dice2Image, dice2ImagePressed, Points0_2, Points2_2, Points4_2, Points6, Points8, Points10);
					countDice(dice3Image, dice3ImagePressed, Points0_3, Points3_3, Points6_3, Points9, Points12, Points15);
					countDice(dice4Image, dice4ImagePressed, Points0_4, Points4_4, Points8_4, Points12_4, Points16, Points20);
					countDice(dice5Image, dice5ImagePressed, Points0_5, Points5_5, Points10_5, Points15_5, Points20_5, Points25);
					countDice(dice6Image, dice6ImagePressed, Points0_6, Points6_6, Points12_6, Points18, Points24, Points30);
					
					if(!isPressed(PointsChance)) {
						chance();	
					}
					if(!isPressed(PointsBonus)) {
						isBonus();	
					}
					if(!isPressed(PointsFourOfAKind)) {
						isFourOfAKind();	
					}
					if(!isPressed(PointsFullHouse)) {
						isFullHouse();	
					}
					if(!isPressed(PointsSmallstraight)) {
						isSmallstraight();	
					}
					if(!isPressed(PointsLargestraight)) {
						isLargestraight();	
					}
					if(!isPressed(PointsYacht)) {
						isYacht();	
					}
				} else if(count.getIcon() == count1Image && (playTime > countPointsPressed())) {
					PointsVisible(Points0);
					PointsVisible(Points1);
					PointsVisible(Points2);
					PointsVisible(Points3);
					PointsVisible(Points4);
					PointsVisible(Points5);
					
					PointsVisible(Points0_2);
					PointsVisible(Points2_2);
					PointsVisible(Points4_2);
					PointsVisible(Points6);
					PointsVisible(Points8);
					PointsVisible(Points10);
					
					PointsVisible(Points0_3);
					PointsVisible(Points3_3);
					PointsVisible(Points6_3);
					PointsVisible(Points9);
					PointsVisible(Points12);
					PointsVisible(Points15);
					
					PointsVisible(Points0_4);
					PointsVisible(Points4_4);
					PointsVisible(Points8_4);
					PointsVisible(Points12_4);
					PointsVisible(Points16);
					PointsVisible(Points20);
					
					PointsVisible(Points0_5);
					PointsVisible(Points5_5);
					PointsVisible(Points10_5);
					PointsVisible(Points15_5);
					PointsVisible(Points20_5);
					PointsVisible(Points25);
					
					PointsVisible(Points0_6);
					PointsVisible(Points6_6);
					PointsVisible(Points12_6);
					PointsVisible(Points18);
					PointsVisible(Points24);
					PointsVisible(Points30);
					
					count.setIcon(count2Image);
					
					countDice(dice1Image, dice1ImagePressed, Points0, Points1, Points2, Points3, Points4, Points5);
					countDice(dice2Image, dice2ImagePressed, Points0_2, Points2_2, Points4_2, Points6, Points8, Points10);
					countDice(dice3Image, dice3ImagePressed, Points0_3, Points3_3, Points6_3, Points9, Points12, Points15);
					countDice(dice4Image, dice4ImagePressed, Points0_4, Points4_4, Points8_4, Points12_4, Points16, Points20);
					countDice(dice5Image, dice5ImagePressed, Points0_5, Points5_5, Points10_5, Points15_5, Points20_5, Points25);
					countDice(dice6Image, dice6ImagePressed, Points0_6, Points6_6, Points12_6, Points18, Points24, Points30);
					
					if(!isPressed(PointsChance)) {
						chance();	
					}
					if(!isPressed(PointsBonus)) {
						isBonus();	
					}
					if(!isPressed(PointsFourOfAKind)) {
						isFourOfAKind();	
					}
					if(!isPressed(PointsFullHouse)) {
						isFullHouse();	
					}
					if(!isPressed(PointsSmallstraight)) {
						isSmallstraight();	
					}
					if(!isPressed(PointsLargestraight)) {
						isLargestraight();	
					}
					if(!isPressed(PointsYacht)) {
						isYacht();	
					}
				
				} else if(count.getIcon() == count2Image && (playTime > countPointsPressed())) {
					PointsVisible(Points0);
					PointsVisible(Points1);
					PointsVisible(Points2);
					PointsVisible(Points3);
					PointsVisible(Points4);
					PointsVisible(Points5);
					
					PointsVisible(Points0_2);
					PointsVisible(Points2_2);
					PointsVisible(Points4_2);
					PointsVisible(Points6);
					PointsVisible(Points8);
					PointsVisible(Points10);
					
					PointsVisible(Points0_3);
					PointsVisible(Points3_3);
					PointsVisible(Points6_3);
					PointsVisible(Points9);
					PointsVisible(Points12);
					PointsVisible(Points15);
					
					PointsVisible(Points0_4);
					PointsVisible(Points4_4);
					PointsVisible(Points8_4);
					PointsVisible(Points12_4);
					PointsVisible(Points16);
					PointsVisible(Points20);
					
					PointsVisible(Points0_5);
					PointsVisible(Points5_5);
					PointsVisible(Points10_5);
					PointsVisible(Points15_5);
					PointsVisible(Points20_5);
					PointsVisible(Points25);
					
					PointsVisible(Points0_6);
					PointsVisible(Points6_6);
					PointsVisible(Points12_6);
					PointsVisible(Points18);
					PointsVisible(Points24);
					PointsVisible(Points30);
					
					count.setIcon(count3Image);
					words.setVisible(true);
					Ranking1.setVisible(true);
					Ranking2.setVisible(true);
					Ranking3.setVisible(true);
					Ranking4.setVisible(true);
					Ranking5.setVisible(true);
					Ranking6.setVisible(true);
					RankingBonus.setVisible(true);
					RankingChance.setVisible(true);
					RankingFourOfAKind.setVisible(true);
					RankingFullHouse.setVisible(true);
					RankingSmallStraight.setVisible(true);
					RankingLargeStraight.setVisible(true);
					RankingYacht.setVisible(true);
					RankingTotal.setVisible(true);
					
					countDice(dice1Image, dice1ImagePressed, Points0, Points1, Points2, Points3, Points4, Points5);
					countDice(dice2Image, dice2ImagePressed, Points0_2, Points2_2, Points4_2, Points6, Points8, Points10);
					countDice(dice3Image, dice3ImagePressed, Points0_3, Points3_3, Points6_3, Points9, Points12, Points15);
					countDice(dice4Image, dice4ImagePressed, Points0_4, Points4_4, Points8_4, Points12_4, Points16, Points20);
					countDice(dice5Image, dice5ImagePressed, Points0_5, Points5_5, Points10_5, Points15_5, Points20_5, Points25);
					countDice(dice6Image, dice6ImagePressed, Points0_6, Points6_6, Points12_6, Points18, Points24, Points30);
					
					if(!isPressed(PointsChance)) {
						chance();	
					}
					if(!isPressed(PointsBonus)) {
						isBonus();	
					}
					if(!isPressed(PointsFourOfAKind)) {
						isFourOfAKind();	
					}
					if(!isPressed(PointsFullHouse)) {
						isFullHouse();	
					}
					if(!isPressed(PointsSmallstraight)) {
						isSmallstraight();	
					}
					if(!isPressed(PointsLargestraight)) {
						isLargestraight();	
					}
					if(!isPressed(PointsYacht)) {
						isYacht();	
					}
					
				} else if(count.getIcon() == count3Image && (playTime > countPointsPressed())) {
					count.setIcon(count0Image);
					words.setVisible(false);
					
					PointsVisible(Points0);
					PointsVisible(Points1);
					PointsVisible(Points2);
					PointsVisible(Points3);
					PointsVisible(Points4);
					PointsVisible(Points5);
					
					PointsVisible(Points0_2);
					PointsVisible(Points2_2);
					PointsVisible(Points4_2);
					PointsVisible(Points6);
					PointsVisible(Points8);
					PointsVisible(Points10);
					
					PointsVisible(Points0_3);
					PointsVisible(Points3_3);
					PointsVisible(Points6_3);
					PointsVisible(Points9);
					PointsVisible(Points12);
					PointsVisible(Points15);
					
					PointsVisible(Points0_4);
					PointsVisible(Points4_4);
					PointsVisible(Points8_4);
					PointsVisible(Points12_4);
					PointsVisible(Points16);
					PointsVisible(Points20);
					
					PointsVisible(Points0_5);
					PointsVisible(Points5_5);
					PointsVisible(Points10_5);
					PointsVisible(Points15_5);
					PointsVisible(Points20_5);
					PointsVisible(Points25);
					
					PointsVisible(Points0_6);
					PointsVisible(Points6_6);
					PointsVisible(Points12_6);
					PointsVisible(Points18);
					PointsVisible(Points24);
					PointsVisible(Points30);
					
					dice1.setIcon(blankDiceImage);
					dice2.setIcon(blankDiceImage);
					dice3.setIcon(blankDiceImage);
					dice4.setIcon(blankDiceImage);
					dice5.setIcon(blankDiceImage);
					
					if(!isPressed(PointsChance)) {
						PointsChance.setVisible(false);	
					}
					if(!isPressed(PointsFourOfAKind)) {
						PointsFourOfAKind.setVisible(false);	
					}
					if(!isPressed(PointsFullHouse)) {
						PointsFullHouse.setVisible(false);	
					}
					if(!isPressed(PointsSmallstraight)) {
						PointsSmallstraight.setVisible(false);	
					}
					if(!isPressed(PointsLargestraight)) {
						PointsLargestraight.setVisible(false);	
					}
					if(!isPressed(PointsYacht)) {
						PointsYacht.setVisible(false);	
					}
					
					isBonus();
					
					playTime++;
				} else if(playTime == countPointsPressed()) {
					count.setIcon(count0Image);
					words.setVisible(false);
					
					PointsVisible(Points0);
					PointsVisible(Points1);
					PointsVisible(Points2);
					PointsVisible(Points3);
					PointsVisible(Points4);
					PointsVisible(Points5);
					
					PointsVisible(Points0_2);
					PointsVisible(Points2_2);
					PointsVisible(Points4_2);
					PointsVisible(Points6);
					PointsVisible(Points8);
					PointsVisible(Points10);
					
					PointsVisible(Points0_3);
					PointsVisible(Points3_3);
					PointsVisible(Points6_3);
					PointsVisible(Points9);
					PointsVisible(Points12);
					PointsVisible(Points15);
					
					PointsVisible(Points0_4);
					PointsVisible(Points4_4);
					PointsVisible(Points8_4);
					PointsVisible(Points12_4);
					PointsVisible(Points16);
					PointsVisible(Points20);
					
					PointsVisible(Points0_5);
					PointsVisible(Points5_5);
					PointsVisible(Points10_5);
					PointsVisible(Points15_5);
					PointsVisible(Points20_5);
					PointsVisible(Points25);
					
					PointsVisible(Points0_6);
					PointsVisible(Points6_6);
					PointsVisible(Points12_6);
					PointsVisible(Points18);
					PointsVisible(Points24);
					PointsVisible(Points30);
					
					dice1.setIcon(blankDiceImage);
					dice2.setIcon(blankDiceImage);
					dice3.setIcon(blankDiceImage);
					dice4.setIcon(blankDiceImage);
					dice5.setIcon(blankDiceImage);
					
					if(!isPressed(PointsChance)) {
						PointsChance.setVisible(false);	
					}
					if(!isPressed(PointsFourOfAKind)) {
						PointsFourOfAKind.setVisible(false);	
					}
					if(!isPressed(PointsFullHouse)) {
						PointsFullHouse.setVisible(false);	
					}
					if(!isPressed(PointsSmallstraight)) {
						PointsSmallstraight.setVisible(false);	
					}
					if(!isPressed(PointsLargestraight)) {
						PointsLargestraight.setVisible(false);	
					}
					if(!isPressed(PointsYacht)) {
						PointsYacht.setVisible(false);	
					}
					
					isBonus();
					
					playTime++;
				}
			}
		});
		add(diceButton);
		
		count.setBounds(1425, 520, 295, 106);
		add(count);
		
		words.setBounds(400, 350, 658, 89);
		add(words);
		words.setVisible(false);
		
		Ranking1.setBounds(60, 500, 50, 50);
		add(Ranking1);
		Ranking2.setBounds(60, 580, 50, 50);
		add(Ranking2);
		Ranking3.setBounds(60, 660, 50, 50);
		add(Ranking3);
		Ranking4.setBounds(60, 740, 50, 50);
		add(Ranking4);
		Ranking5.setBounds(60, 820, 50, 50);
		add(Ranking5);
		Ranking6.setBounds(60, 900, 50, 50);
		add(Ranking6);
		RankingBonus.setBounds(250, 500, 210, 50);
		add(RankingBonus);
		RankingChance.setBounds(250, 580, 210, 50);
		add(RankingChance);
		RankingFourOfAKind.setBounds(600, 500, 480, 50);
		add(RankingFourOfAKind);
		RankingFullHouse.setBounds(600, 580, 300, 50);
		add(RankingFullHouse);
		RankingSmallStraight.setBounds(600, 660, 435, 50);
		add(RankingSmallStraight);
		RankingLargeStraight.setBounds(600, 740, 435, 50);
		add(RankingLargeStraight);
		RankingYacht.setBounds(600, 820, 200, 50);
		add(RankingYacht);
		RankingTotal.setBounds(600, 900, 180, 50);
		add(RankingTotal);
		
		Points0.setBounds(150, 500, 50, 50);
		add(Points0);
		Points0.setVisible(false);
		Points1.setBounds(150, 500, 50, 50);
		add(Points1);
		Points1.setVisible(false);
		Points2.setBounds(150, 500, 50, 50);
		add(Points2);
		Points2.setVisible(false);
		Points3.setBounds(150, 500, 50, 50);
		add(Points3);
		Points3.setVisible(false);
		Points4.setBounds(150, 500, 50, 50);
		add(Points4);
		Points4.setVisible(false);
		Points5.setBounds(150, 500, 50, 50);
		add(Points5);
		Points5.setVisible(false);
		
		Points0_2.setBounds(150, 580, 50, 50);
		add(Points0_2);
		Points0_2.setVisible(false);
		Points2_2.setBounds(150, 580, 50, 50);
		add(Points2_2);
		Points2_2.setVisible(false);
		Points4_2.setBounds(150, 580, 50, 50);
		add(Points4_2);
		Points4_2.setVisible(false);
		Points6.setBounds(150, 580, 50, 50);
		add(Points6);
		Points6.setVisible(false);
		Points8.setBounds(150, 580, 50, 50);
		add(Points8);
		Points8.setVisible(false);
		Points10.setBounds(150, 580, 60, 50);
		add(Points10);
		Points10.setVisible(false);
		
		Points0_3.setBounds(150, 660, 50, 50);
		add(Points0_3);
		Points0_3.setVisible(false);
		Points3_3.setBounds(150, 660, 50, 50);
		add(Points3_3);
		Points3_3.setVisible(false);
		Points6_3.setBounds(150, 660, 50, 50);
		add(Points6_3);
		Points6_3.setVisible(false);
		Points9.setBounds(150, 660, 50, 50);
		add(Points9);
		Points9.setVisible(false);
		Points12.setBounds(150, 660, 60, 50);
		add(Points12);
		Points12.setVisible(false);
		Points15.setBounds(150, 660, 60, 50);
		add(Points15);
		Points15.setVisible(false);
		
		Points0_4.setBounds(150, 740, 50, 50);
		add(Points0_4);
		Points0_4.setVisible(false);
		Points4_4.setBounds(150, 740, 50, 50);
		add(Points4_4);
		Points4_4.setVisible(false);
		Points8_4.setBounds(150, 740, 50, 50);
		add(Points8_4);
		Points8_4.setVisible(false);
		Points12_4.setBounds(150, 740, 60, 50);
		add(Points12_4);
		Points12_4.setVisible(false);
		Points16.setBounds(150, 740, 60, 50);
		add(Points16);
		Points16.setVisible(false);
		Points20.setBounds(150, 740, 60, 50);
		add(Points20);
		Points20.setVisible(false);
		
		Points0_5.setBounds(150, 820, 50, 50);
		add(Points0_5);
		Points0_5.setVisible(false);
		Points5_5.setBounds(150, 820, 50, 50);
		add(Points5_5);
		Points5_5.setVisible(false);
		Points10_5.setBounds(150, 820, 60, 50);
		add(Points10_5);
		Points10_5.setVisible(false);
		Points15_5.setBounds(150, 820, 60, 50);
		add(Points15_5);
		Points15_5.setVisible(false);
		Points20_5.setBounds(150, 820, 70, 50);
		add(Points20_5);
		Points20_5.setVisible(false);
		Points25.setBounds(150, 820, 70, 50);
		add(Points25);
		Points25.setVisible(false);
		
		Points0_6.setBounds(150, 900, 50, 50);
		add(Points0_6);
		Points0_6.setVisible(false);
		Points6_6.setBounds(150, 900, 50, 50);
		add(Points6_6);
		Points6_6.setVisible(false);
		Points12_6.setBounds(150, 900, 60, 50);
		add(Points12_6);
		Points12_6.setVisible(false);
		Points18.setBounds(150, 900, 60, 50);
		add(Points18);
		Points18.setVisible(false);
		Points24.setBounds(150, 900, 70, 50);
		add(Points24);
		Points24.setVisible(false);
		Points30.setBounds(150, 900, 70, 50);
		add(Points30);
		Points30.setVisible(false);
		
		PointsBonus.setBounds(500, 500, 70, 50);
		add(PointsBonus);
		
		PointsChance.setBounds(500, 580, 70, 50);
		add(PointsChance);
		PointsChance.setVisible(false);
		
		PointsFourOfAKind.setBounds(1120, 500, 60, 50);
		add(PointsFourOfAKind);
		PointsFourOfAKind.setVisible(false);
		
		PointsFullHouse.setBounds(940, 580, 60, 50);
		add(PointsFullHouse);
		PointsFullHouse.setVisible(false);
		
		PointsSmallstraight.setBounds(1075, 660, 60, 50);
		add(PointsSmallstraight);
		PointsSmallstraight.setVisible(false);
		
		PointsLargestraight.setBounds(1075, 740, 70, 50);
		add(PointsLargestraight);
		PointsLargestraight.setVisible(false);
		
		PointsYacht.setBounds(840, 820, 70, 50);
		add(PointsYacht);
		PointsYacht.setVisible(false);
	}
	
	
	public void paint(Graphics g) {
		screenImage = createImage(Main.SCREEN_WIDTH, Main.SCREEN_HEGHT);
		screenGraphic = screenImage.getGraphics();
		screenDraw(screenGraphic);
		g.drawImage(screenImage, 0, 0, null);
	}
	
	public void screenDraw(Graphics g) {
		g.drawImage(introBackground, 0, 0, null);
		paintComponents(g);
		this.repaint();
	}
	
	public void diceSetting(JButton _dice, int locationX, int locationY, int sizeX, int sizeY) {
		_dice.setBounds(locationX, locationY, sizeX, sizeY);
		_dice.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				_dice.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				if(diceList.contains(_dice.getIcon())) {
					int number = diceList.indexOf(_dice.getIcon()); 
					_dice.setIcon(dicePressedList.get(number));	
				} else if(dicePressedList.contains(_dice.getIcon())){
					int number = dicePressedList.indexOf(_dice.getIcon()); 
					_dice.setIcon(diceList.get(number));
				}
			}
		});
		add(_dice);
	}
	
	public void countDice(ImageIcon _diceImage, ImageIcon _diceImagePressed, JButton _Points1, JButton _Points2, JButton _Points3, JButton _Points4, JButton _Points5, JButton _Points6) {
		int result = 0;
		
		if(dice1.getIcon() == _diceImage || dice1.getIcon() == _diceImagePressed) {
			result++;
		}
		if(dice2.getIcon() == _diceImage || dice2.getIcon() == _diceImagePressed) {
			result++;
		}
		if(dice3.getIcon() == _diceImage || dice3.getIcon() == _diceImagePressed) {
			result++;
		}
		if(dice4.getIcon() == _diceImage || dice4.getIcon() == _diceImagePressed) {
			result++;
		}
		if(dice5.getIcon() == _diceImage || dice5.getIcon() == _diceImagePressed) {
			result++;
		}
		
		if(result == 0 && (!isPressed(_Points1) && !isPressed(_Points2) && !isPressed(_Points3) && !isPressed(_Points4) && !isPressed(_Points5) && !isPressed(_Points6))) {
			_Points1.setVisible(true);
		} else if(result == 1 && (!isPressed(_Points1) && !isPressed(_Points2) && !isPressed(_Points3) && !isPressed(_Points4) && !isPressed(_Points5) && !isPressed(_Points6))) {
			_Points2.setVisible(true);
		} else if(result == 2 && (!isPressed(_Points1) && !isPressed(_Points2) && !isPressed(_Points3) && !isPressed(_Points4) && !isPressed(_Points5) && !isPressed(_Points6))) {
			_Points3.setVisible(true);
		} else if(result == 3 && (!isPressed(_Points1) && !isPressed(_Points2) && !isPressed(_Points3) && !isPressed(_Points4) && !isPressed(_Points5) && !isPressed(_Points6))) {
			_Points4.setVisible(true);
		} else if(result == 4 && (!isPressed(_Points1) && !isPressed(_Points2) && !isPressed(_Points3) && !isPressed(_Points4) && !isPressed(_Points5) && !isPressed(_Points6))) {
			_Points5.setVisible(true);
		} else if(result == 5 && (!isPressed(_Points1) && !isPressed(_Points2) && !isPressed(_Points3) && !isPressed(_Points4) && !isPressed(_Points5) && !isPressed(_Points6))) {
			_Points6.setVisible(true);
		}
	}
	
	public void selectPoints(JButton _Points) {
		_Points.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				_Points.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				if(!isPressed(_Points)) {
					int search = PointsList.indexOf(_Points.getIcon());
					_Points.setIcon(PointsPressedList.get(search));
				} else if (isPressed(_Points)) {
					int search = PointsPressedList.indexOf(_Points.getIcon());
					_Points.setIcon(PointsList.get(search));
				}
			}
		});
	}
	
	public boolean isPressed(JButton _Points) {
		if(PointsList.contains(_Points.getIcon())) {
			return false;
		} if(PointsPressedList.contains(_Points.getIcon())) {
			return true;
		}
		return false;
	}
	
	public void PointsVisible(JButton _Points) {
		if(isPressed(_Points)) {
			_Points.setVisible(true);
		} else {
			_Points.setVisible(false);
		}
	}
	
	public int countPointsPressed() {
		int total = 0;
		if(isPressed(Points0) || isPressed(Points1) || isPressed(Points2) || isPressed(Points3) || isPressed(Points4) || isPressed(Points5)) {
			total++;
		}
		if(isPressed(Points0_2) || isPressed(Points2_2) || isPressed(Points4_2) || isPressed(Points6) || isPressed(Points8) || isPressed(Points10)) {
			total++;
		}
		if(isPressed(Points0_3) || isPressed(Points3_3) || isPressed(Points6_3) || isPressed(Points9) || isPressed(Points12) || isPressed(Points15)) {
			total++;
		}
		if(isPressed(Points0_4) || isPressed(Points4_4) || isPressed(Points8_4) || isPressed(Points12_4) || isPressed(Points16) || isPressed(Points20)) {
			total++;
		}
		if(isPressed(Points0_5) || isPressed(Points5_5) || isPressed(Points10_5) || isPressed(Points15_5) || isPressed(Points20_5) || isPressed(Points25)) {
			total++;
		}
		if(isPressed(Points0_6) || isPressed(Points6_6) || isPressed(Points12_6) || isPressed(Points18) || isPressed(Points24) || isPressed(Points30)) {
			total++;
		}
		if(isPressed(PointsChance)) {
			total++;
		}
		if(isPressed(PointsFourOfAKind)) {
			total++;
		}
		if(isPressed(PointsFullHouse)) {
			total++;
		}
		if(isPressed(PointsSmallstraight)) {
			total++;
		}
		if(isPressed(PointsLargestraight)) {
			total++;
		}
		if(isPressed(PointsYacht)) {
			total++;
		}
		return total;
	}
	
	public int diceToPoints(JButton _Dice) {
		int result = 0;
		if(_Dice.getIcon() == dice1Image || _Dice.getIcon() == dice1ImagePressed) {
			result = 1;
		} else if(_Dice.getIcon() == dice2Image || _Dice.getIcon() == dice2ImagePressed) {
			result = 2;
		} else if(_Dice.getIcon() == dice3Image || _Dice.getIcon() == dice3ImagePressed) {
			result = 3;
		} else if(_Dice.getIcon() == dice4Image || _Dice.getIcon() == dice4ImagePressed) {
			result = 4;
		} else if(_Dice.getIcon() == dice5Image || _Dice.getIcon() == dice5ImagePressed) {
			result = 5;
		} else if(_Dice.getIcon() == dice6Image || _Dice.getIcon() == dice6ImagePressed) {
			result = 6;
		}
		return result;
	}
	
	public int pointsToPoints(JButton _Points) {
		int result = -1;
		if(diceList.contains(_Points.getIcon())) {
			result = diceList.indexOf(_Points.getIcon());
		} else if(dicePressedList.contains(_Points.getIcon())) {
			result = dicePressedList.indexOf(_Points.getIcon());
		}
		return result;
	}
	
	public boolean diceCompared(JButton _Dice1, JButton _Dice2) {
		int search1 = -1;
		int search2 = -2;
		if(diceList.contains(_Dice1.getIcon())) {
			search1 = diceList.indexOf(_Dice1.getIcon());
		} else if(dicePressedList.contains(_Dice1.getIcon())) {
			search1 = dicePressedList.indexOf(_Dice1.getIcon());
		}
		if(diceList.contains(_Dice2.getIcon())) {
			search2 = diceList.indexOf(_Dice2.getIcon());
		} else if(dicePressedList.contains(_Dice2.getIcon())) {
			search2 = dicePressedList.indexOf(_Dice2.getIcon());
		}
		if(search1 == search2) {
			return true;	
		}
		return false;
	}
	
	public void isBonus() {
		int _1Points = -1;
		int _2Points = -1;
		int _3Points = -1;
		int _4Points = -1;
		int _5Points = -1;
		int _6Points = -1;
		
		//points1
		if(isPressed(Points0)) {
			_1Points = 0;
		} else if(isPressed(Points1)) {
			_1Points = 1;
		} else if(isPressed(Points2)) {
			_1Points = 2;
		} else if(isPressed(Points3)) {
			_1Points = 3;
		} else if(isPressed(Points4)) {
			_1Points = 4;
		}  else if(isPressed(Points5)) {
			_1Points = 5;
		}
		
		//points2
		if(isPressed(Points0_2)) {
			_2Points = 0;
		} else if(isPressed(Points2_2)) {
			_2Points = 2;
		} else if(isPressed(Points4_2)) {
			_2Points = 4;
		} else if(isPressed(Points6)) {
			_2Points = 6;
		} else if(isPressed(Points8)) {
			_2Points = 8;
		}  else if(isPressed(Points10)) {
			_2Points = 10;
		}
		
		//point3
		if(isPressed(Points0_3)) {
			_3Points = 0;
		} else if(isPressed(Points3_3)) {
			_3Points = 3;
		} else if(isPressed(Points6_3)) {
			_3Points = 6;
		} else if(isPressed(Points9)) {
			_3Points = 9;
		} else if(isPressed(Points12)) {
			_3Points = 12;
		}  else if(isPressed(Points15)) {
			_3Points = 15;
		}
		
		//points4
		if(isPressed(Points0_4)) {
			_4Points = 0;
		} else if(isPressed(Points4_4)) {
			_4Points = 4;
		} else if(isPressed(Points8_4)) {
			_4Points = 8;
		} else if(isPressed(Points12_4)) {
			_4Points = 12;
		} else if(isPressed(Points16)) {
			_4Points = 16;
		}  else if(isPressed(Points20)) {
			_4Points = 20;
		}
		
		//points5
		if(isPressed(Points0_5)) {
			_5Points = 0;
		} else if(isPressed(Points5_5)) {
			_5Points = 5;
		} else if(isPressed(Points10_5)) {
			_5Points = 10;
		} else if(isPressed(Points15_5)) {
			_5Points = 15;
		} else if(isPressed(Points20_5)) {
			_5Points = 20;
		}  else if(isPressed(Points25)) {
			_5Points = 25;
		}
		
		//points6
		if(isPressed(Points0_6)) {
			_6Points = 0;
		} else if(isPressed(Points6_6)) {
			_6Points = 6;
		} else if(isPressed(Points12_6)) {
			_6Points = 12;
		} else if(isPressed(Points18)) {
			_6Points = 18;
		} else if(isPressed(Points24)) {
			_6Points = 24;
		}  else if(isPressed(Points30)) {
			_6Points = 30;
		}
		
		int total = _1Points + _2Points + _3Points + _4Points + _5Points + _6Points;
		
		if(total >= 63) {
			PointsBonus.setIcon(Points35ImagePressed);;
		}
	}
	
	public void chance() {
		int _Dice1Points = diceToPoints(dice1);
		int _Dice2Points = diceToPoints(dice2);
		int _Dice3Points = diceToPoints(dice3);
		int _Dice4Points = diceToPoints(dice4);
		int _Dice5Points = diceToPoints(dice5);
		
		int total = _Dice1Points + _Dice2Points + _Dice3Points + _Dice4Points + _Dice5Points;
		
		PointsChance.setVisible(true);
		PointsChance.setIcon(PointsList.get(total));
	}
	
	public void isFourOfAKind() {
		int _Dice1Points = diceToPoints(dice1);
		int _Dice2Points = diceToPoints(dice2);
		int _Dice3Points = diceToPoints(dice3);
		int _Dice4Points = diceToPoints(dice4);
		int _Dice5Points = diceToPoints(dice5);
		
		int[] fourList = {_Dice1Points, _Dice2Points, _Dice3Points, _Dice4Points, _Dice5Points};
		Arrays.sort(fourList);
		
		int result = 0;
		for(int i = 0; i < 4; i++) {
			if(fourList[i] == fourList[i + 1]) {
				result++;
			}
		}
		if(result >= 3) {
			if(fourList[1] == fourList[2] && fourList[2] == fourList[3]) {
				PointsFourOfAKind.setVisible(true);
				PointsFourOfAKind.setIcon(PointsList.get(_Dice1Points + _Dice2Points + _Dice3Points + _Dice4Points + _Dice5Points));	
			} else {
				PointsFourOfAKind.setVisible(true);
				PointsFourOfAKind.setIcon(Points0Image);
			}
		} else {
			PointsFourOfAKind.setVisible(true);
			PointsFourOfAKind.setIcon(Points0Image);
		}
	}
	
	public void isFullHouse() {
		int _Dice1Points = diceToPoints(dice1);
		int _Dice2Points = diceToPoints(dice2);
		int _Dice3Points = diceToPoints(dice3);
		int _Dice4Points = diceToPoints(dice4);
		int _Dice5Points = diceToPoints(dice5);
		
		int[] fullList = {_Dice1Points, _Dice2Points, _Dice3Points, _Dice4Points, _Dice5Points};
		Arrays.sort(fullList);
		
		int result = 0;
		for(int i = 0; i < 4; i++) {
			if(fullList[i] == fullList[i + 1]) {
				result++;
			}
		}
		if(result >= 3) {
			if(fullList[0] == fullList[1] || fullList[3] == fullList[4]) {
				if(fullList[1] == fullList[2] && fullList[2] == fullList[3]) {
					PointsFullHouse.setVisible(true);
					PointsFullHouse.setIcon(Points0Image);
				} else {
					PointsFullHouse.setVisible(true);
					PointsFullHouse.setIcon(PointsList.get(_Dice1Points + _Dice2Points + _Dice3Points + _Dice4Points + _Dice5Points));	
				}
			} else {
				PointsFullHouse.setVisible(true);
				PointsFullHouse.setIcon(Points0Image);
			}
		} else {
			PointsFullHouse.setVisible(true);
			PointsFullHouse.setIcon(Points0Image);
		}
	}
	
	public void isSmallstraight() {
		int _Dice1Points = diceToPoints(dice1);
		int _Dice2Points = diceToPoints(dice2);
		int _Dice3Points = diceToPoints(dice3);
		int _Dice4Points = diceToPoints(dice4);
		int _Dice5Points = diceToPoints(dice5);
		
		int[] smallList = {_Dice1Points, _Dice2Points, _Dice3Points, _Dice4Points, _Dice5Points};
		Arrays.sort(smallList);
		
		int result = 0;
		for(int i = 0; i < 4; i++) {
			if((smallList[i] + 1) == smallList[i + 1]) {
				result++;
			}
		}
		if(result >= 3) {
			if((smallList[2] + 1) == smallList[3] || (smallList[1] + 1) == smallList[2]) {
				PointsSmallstraight.setVisible(true);
				PointsSmallstraight.setIcon(Points15Image);
			} else {
				PointsSmallstraight.setVisible(true);
				PointsSmallstraight.setIcon(Points0Image);
			}
		} else {
			PointsSmallstraight.setVisible(true);
			PointsSmallstraight.setIcon(Points0Image);
		}
	}
	
	public void isLargestraight() {
		int _Dice1Points = diceToPoints(dice1);
		int _Dice2Points = diceToPoints(dice2);
		int _Dice3Points = diceToPoints(dice3);
		int _Dice4Points = diceToPoints(dice4);
		int _Dice5Points = diceToPoints(dice5);
		
		int[] largeList = {_Dice1Points, _Dice2Points, _Dice3Points, _Dice4Points, _Dice5Points};
		Arrays.sort(largeList);
		
		int result = 0;
		for(int i = 0; i < 4; i++) {
			if((largeList[i] + 1) == largeList[i + 1]) {
				result++;
			}
		}
		if(result == 4) {
			PointsLargestraight.setVisible(true);
			PointsLargestraight.setIcon(Points30Image);
		} else {
			PointsLargestraight.setVisible(true);
			PointsLargestraight.setIcon(Points0Image);
		}
	}
	
	public void isYacht() {
		if(diceCompared(dice1, dice2) && diceCompared(dice1, dice3) && diceCompared(dice1, dice4) && diceCompared(dice1, dice5)) {
			PointsYacht.setVisible(true);
			PointsYacht.setIcon(Points50Image);
		} else {
			PointsYacht.setVisible(true);
			PointsYacht.setIcon(Points0Image);
		}
	}
}
