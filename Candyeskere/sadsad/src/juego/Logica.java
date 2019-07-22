package juego;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

public class Logica {
    private String respuesta;
    private int pic = 0;
    private int puntos;
    private int Vidas;
    public char aux;
    private int b;
    private char xs;
    JLabel pt = new JLabel("" + puntos);
    JLabel lbpts = new JLabel("Puntos:");
    JLabel vd = new JLabel("" + Vidas);
    JLabel lbvds = new JLabel("Vidas:");
    public JButton matriz[][] = new JButton[11][11];	
    private int turn = 0;
    
    char matriz1[][]=new char[11][11];
    
        	
        public Logica(){
        JFrame frame = new JFrame("Candy Crush Para Gods");
        frame.setLayout(new GridLayout(10,10));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
                       pic=llenar(i,j);
                       matriz[i][j].setActionCommand("("+ i + "," + j + "," + pic +")"); 
                     
                       frame.getContentPane().add(matriz[i][j]);
                        }        
                    }
       
         detectarVertical();
         deteH();
        JPanel status = new JPanel();

        status.add(lbpts);
        status.add(pt);
        status.add(lbvds);
        status.add(vd);

        //Add Status Bar
        frame.add(status);

        //Display Window
        frame.pack();
        frame.setSize(1280,720);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

        puntos = 0;
        pt.setText(String.valueOf(puntos));

        Vidas= 3;
        vd.setText(String.valueOf(Vidas));     
        menu();
        }
	private int  llenar(int x, int y ) {
				int numAle = (int) ((Math.random() * 5) + 65);
                                xs=(char)(numAle);
                                matriz1[x][y]= xs;
                                ImageIcon pic;
                                pic = new ImageIcon("icons/" + xs + ".png");
				matriz[x][y] = new JButton(pic);
                               
                                return numAle;
        }              
     private  void detectarVertical() {
          
		for (int j = 0; j < 9; j++) {
			for (int i = 0; i < 9; i++) {
                                ImageIcon pic;
				if (matriz1[i][j] == matriz1[i + 1][j] && matriz1[i + 2][j] == matriz1[i][j]) {
					int numAle = (int) ((Math.random() * 2) + 65);
					if ((char) (numAle) == matriz1[i + 1][j]) {
						if (numAle < 69) {
							matriz1[i][j] = (char) (numAle + 1);    
                                                        pic = new ImageIcon("icons/" + matriz1[i][j] + ".png");
                                                        Icon temp = pic;
                                                        matriz[i][j].setIcon(temp);
                                                        matriz1[i+1][j]=(char) (numAle +2);
                                                        pic = new ImageIcon("icons/" + matriz1[i+1][j] + ".png");
                                                        temp = pic;
                                                        matriz[i+1][j].setIcon(temp);                                       
						}else{
                                                    matriz1[i][j]=(char) (numAle + 1);
                                                    pic = new ImageIcon("icons/" + matriz1[i][j] + ".png");
                                                    Icon temp = pic;
                                                    matriz[i][j].setIcon(temp);                              
                                                    i=0;
                                                } 
					}else{
                                            matriz1[i][j]=(char)(numAle+1);
                                            pic = new ImageIcon("icons/" + matriz1[i][j] + ".png");
                                            Icon temp = pic;
                                            matriz[i][j].setIcon(temp);
                                            
                                        }
                                        
					i = 0;                                    
				}
			}
		}

	}

	private  void deteH() {
          ImageIcon pic;
          Icon temp;
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {

				if (matriz1[i][j] == matriz1[i][j + 1] && matriz1[i][j] == matriz1[i][j + 2]) {
					int numAle = (int) ((Math.random() * 2) + 65);
					if ((char) (numAle) == matriz1[i][j + 1]) {
						if (numAle < 69) {
						
								matriz1[i][j] = (char) (numAle + 1);                                                
                                                                pic = new ImageIcon("icons/" + matriz1[i][j] + ".png");
                                                                temp = pic;
                                                                matriz[i][j].setIcon(temp);
                                                                matriz1[i][j+2]=(char)(numAle+2);
                                                                pic = new ImageIcon("icons/" + matriz1[i][j+2] + ".png");
                                                                matriz[i][j+2].setIcon(pic);
                                                                matriz1[i][j+1]=(char)(numAle+3);
                                                                pic = new ImageIcon("icons/" + matriz1[i][j+1] + ".png");
                                                                matriz[i][j+1].setIcon(pic);
				
						}
                                                
					}else{
                                            matriz1[i][j]=(char)(numAle+1);
                                            pic = new ImageIcon("icons/" + matriz1[i][j] + ".png");
                                            matriz[i][j].setIcon(pic);
                                            
                                        }
					j = 0;
					detectarVertical();
				}

			}
		}
	}


	 public void play() {
              
              ImageIcon pic;
		int f = 0, c = 0, f1 = 0, c1 = 0,fh=0,aux1=0;
                
		JOptionPane.showMessageDialog(null, "Porfavor Digite fila de 0 a 8", "xdxd", JOptionPane.INFORMATION_MESSAGE);
                respuesta = JOptionPane.showInputDialog("Escribe");
                f = Integer.parseInt(respuesta);
                
		while (f > 8) {
			JOptionPane.showMessageDialog(null, "Porfavor Digite fila de 0 a 8", "", JOptionPane.INFORMATION_MESSAGE);
			respuesta = JOptionPane.showInputDialog("Escribe");
                        f = Integer.parseInt(respuesta);
		}
		JOptionPane.showMessageDialog(null, "Porfavor Digite Columna de 0 a 8", "", JOptionPane.INFORMATION_MESSAGE);
                respuesta = JOptionPane.showInputDialog("Escribe");
		c = Integer.parseInt(respuesta);
		while (c > 8) {
			JOptionPane.showMessageDialog(null, "Porfavor Digite Columna de 0 a 8", "", JOptionPane.INFORMATION_MESSAGE);
			respuesta = JOptionPane.showInputDialog("Escribe");
                        c = Integer.parseInt(respuesta);

		}
                JOptionPane.showMessageDialog(null, "Porfavor Digite fila de la otra letra de 0 a 8 ", "", JOptionPane.INFORMATION_MESSAGE);	
                respuesta = JOptionPane.showInputDialog("Escribe ");
		f1 = Integer.parseInt(respuesta);
		while (f > 8) {
			JOptionPane.showMessageDialog(null, "Porfavor Digite fila de la otra letra de 0 a 8 ", "", JOptionPane.INFORMATION_MESSAGE);	
                         respuesta = JOptionPane.showInputDialog("Escribe ");
		         f1 = Integer.parseInt(respuesta);
		}
		if (f1 == f) {
                    JOptionPane.showMessageDialog(null, "Porfavor Digite Columna de la otra letra de 0 a 8 ", "", JOptionPane.INFORMATION_MESSAGE);	
                         respuesta = JOptionPane.showInputDialog("Escribe ");
			c1 = Integer.parseInt(respuesta);
			while (c > 8) {
				JOptionPane.showMessageDialog(null, "Porfavor Digite Columna de la otra letra de 0 a 8 ", "", JOptionPane.INFORMATION_MESSAGE);	
                         respuesta = JOptionPane.showInputDialog("Escribe ");
			c1 = Integer.parseInt(respuesta);
			}

			if (c1 == c + 1 || c1 == c - 1) {
				Icon temp = matriz[f1][c1].getIcon();
				matriz[f1][c1].setIcon(matriz[f][c].getIcon());
                                matriz[f][c].setIcon(temp);
                                aux = matriz1[f1][c1];
				matriz1[f1][c1] = matriz1[f][c];
				matriz1[f][c] = aux;
			} else {
				if (c1 != c + 1 || c1 != c - 1) {
                                JOptionPane.showMessageDialog(null, "Solo esta permitido mover adyacente ", ":v", JOptionPane.INFORMATION_MESSAGE);	
				}
			}
		}
		if (f1 == f + 1 || f1 == f - 1) {
			JOptionPane.showMessageDialog(null, "Porfavor Digite Columna de la otra letra de 0 a 8 ", "", JOptionPane.INFORMATION_MESSAGE);	
			respuesta = JOptionPane.showInputDialog("Escribe ");
			c1 = Integer.parseInt(respuesta);
			while (c > 8) {
				JOptionPane.showMessageDialog(null, "Porfavor Digite Columna de la otra letra de 0 a 8 ", "", JOptionPane.INFORMATION_MESSAGE);	
			respuesta = JOptionPane.showInputDialog("Escribe ");
			c1 = Integer.parseInt(respuesta);
			}
			if (c1 == c) {
				Icon temp = matriz[f1][c1].getIcon();
				matriz[f1][c1].setIcon(matriz[f][c].getIcon());
                                matriz[f][c].setIcon(temp);
                                aux = matriz1[f1][c1];
				matriz1[f1][c1] = matriz1[f][c];
				matriz1[f][c] = aux;
			} else {
				if (c1 != c) {
					JOptionPane.showMessageDialog(null, "Porfavor Digite Columna de la otra letra de 0 a 8 ", "", JOptionPane.INFORMATION_MESSAGE);	
                                        JOptionPane.showMessageDialog(null, "Porfavor Digite Columna de la otra letra de 0 a 8 ", "", JOptionPane.INFORMATION_MESSAGE);	
                                    respuesta = JOptionPane.showInputDialog("Escribe ");
                                c1 = Integer.parseInt(respuesta);
				}

			}
		}
                aux1=puntos;
                eliminacionV();
		eliminacionH();               
                  if(aux1==puntos){
                  fh=play2(f,c,f1,c1);
                  Vidas=Vidas-1;
                  vd.setText(""+ Vidas);
                    JOptionPane.showMessageDialog(null, "Te quedan solo"+Vidas+" Vidas en el juego ", "Wrong Step Alert!", JOptionPane.INFORMATION_MESSAGE);
                    if(Vidas==0){
                     JOptionPane.showMessageDialog(null, "Lo siento, Perdiste ", "Sigue intentando", JOptionPane.INFORMATION_MESSAGE);
                     b=0;
                    }
                }
                
               if(puntos==500){
                    JOptionPane.showMessageDialog(null, "FELICIDADES GANASTE, GRACIAS POR JUGAR!!", "Cheer", JOptionPane.INFORMATION_MESSAGE);
                    b=0;
                    
                }
	}
 public void eliminacionH() {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
                            ImageIcon pic;
				if (matriz1[i][j] == matriz1[i][j + 1] && matriz1[i][j] == matriz1[i][j + 2]) {
					if (matriz1[i][j] == matriz1[i][j + 3]) {
                                            if(matriz1[i][j] ==matriz1[i][j+4]){
                                                if(matriz1[i][j]==matriz1[i][j+5]){
                                                    int numAle = (int) ((Math.random() * 1) + 65);
                                                if ((char) (numAle) == matriz1[i][j + 1]) {
							if (numAle < 66) {
								matriz1[i][j] = (char) (numAle + 1);
                                                                pic = new ImageIcon("icons/" + matriz1[i][j] + ".png");
                                                                matriz[i][j].setIcon(pic);
								matriz1[i][j + 1] = (char) (numAle + 2);
                                                                pic = new ImageIcon("icons/" + matriz1[i][j+1] + ".png");
                                                                matriz[i][j+1].setIcon(pic);
								matriz1[i][j + 2] = (char) (numAle + 3);
                                                                pic = new ImageIcon("icons/" + matriz1[i][j+2] + ".png");
                                                                matriz[i][j+2].setIcon(pic);
                                                                matriz1[i][j + 3] = (char) (numAle + 4);
                                                                pic = new ImageIcon("icons/" + matriz1[i][j+3] + ".png");
                                                                matriz[i][j+3].setIcon(pic);
								puntos = puntos + 350;
                                                                pt.setText("" + puntos);
                                                                 break;
							} else {
								matriz1[i][j] = (char) (numAle);
                                                                pic = new ImageIcon("icons/" + matriz1[i][j] + ".png");
                                                                matriz[i][j].setIcon(pic);
								matriz1[i][j + 1] = (char) (numAle + 1);
                                                                pic = new ImageIcon("icons/" + matriz1[i][j+1] + ".png");
                                                                matriz[i][j+1].setIcon(pic);
								matriz1[i][j + 2] = (char) (numAle + 2);
                                                                pic = new ImageIcon("icons/" + matriz1[i][j+2] + ".png");
                                                                matriz[i][j+2].setIcon(pic);
                                                                matriz1[i][j + 3] = (char) (numAle + 3);
                                                                pic = new ImageIcon("icons/" + matriz1[i][j+3] + ".png");
                                                                matriz[i][j+3].setIcon(pic);
								puntos = puntos + 350;
                                                                pt.setText("" + puntos);
                                                                break;
							}
                                            }else {
							matriz1[i][j] = (char) (numAle);
                                                        pic = new ImageIcon("icons/" + matriz1[i][j] + ".png");
                                                        matriz[i][j].setIcon(pic);
							matriz1[i][j + 1] = (char) (numAle + 1);
                                                        pic = new ImageIcon("icons/" + matriz1[i][j+1] + ".png");
                                                        matriz[i][j+1].setIcon(pic);
							matriz1[i][j + 2] = (char) (numAle + 2);
                                                        pic = new ImageIcon("icons/" + matriz1[i][j+2] + ".png");
                                                                matriz[i][j+2].setIcon(pic);
                                                        matriz1[i][j + 3] = (char) (numAle + 3);
                                                        pic = new ImageIcon("icons/" + matriz1[i][j+3] + ".png");
                                                                matriz[i][j+3].setIcon(pic);
							puntos = puntos + 350;
                                                        pt.setText("" + puntos);
							j = 0;
						}
						j = 0;
                                                 break;
                                                }
                                                int numAle = (int) ((Math.random() * 1) + 65);
                                                if ((char) (numAle) == matriz1[i][j + 1]) {
							if (numAle < 66) {
								matriz1[i][j] = (char) (numAle + 1);
                                                                pic = new ImageIcon("icons/" + matriz1[i][j] + ".png");
                                                                matriz[i][j].setIcon(pic);
								matriz1[i][j + 1] = (char) (numAle + 2);
                                                                pic = new ImageIcon("icons/" + matriz1[i][j+1] + ".png");
                                                                matriz[i][j+1].setIcon(pic);
								matriz1[i][j + 2] = (char) (numAle + 3);
                                                                pic = new ImageIcon("icons/" + matriz1[i][j+2] + ".png");
                                                                matriz[i][j+2].setIcon(pic);
                                                                matriz1[i][j + 3] = (char) (numAle + 4);
                                                                pic = new ImageIcon("icons/" + matriz1[i][j+3] + ".png");
                                                                matriz[i][j+3].setIcon(pic);
								puntos = puntos + 200;
                                                                pt.setText("" + puntos);
                                                                 break;
							} else {
								matriz1[i][j] = (char) (numAle);
                                                                pic = new ImageIcon("icons/" + matriz1[i][j] + ".png");
                                                                matriz[i][j].setIcon(pic);
								matriz1[i][j + 1] = (char) (numAle + 1);
                                                                pic = new ImageIcon("icons/" + matriz1[i][j+1] + ".png");
                                                                matriz[i][j+1].setIcon(pic);
								matriz1[i][j + 2] = (char) (numAle + 2);
                                                                pic = new ImageIcon("icons/" + matriz1[i][j+2] + ".png");
                                                                matriz[i][j+2].setIcon(pic);
                                                                matriz1[i][j + 3] = (char) (numAle + 3);
                                                                pic = new ImageIcon("icons/" + matriz1[i][j+3] + ".png");
                                                                matriz[i][j+3].setIcon(pic);
								puntos = puntos + 200;
                                                                pt.setText("" + puntos);
                                                                break;
							}
                                            }else {
							matriz1[i][j] = (char) (numAle);
                                                        pic = new ImageIcon("icons/" + matriz1[i][j] + ".png");
                                                        matriz[i][j].setIcon(pic);
							matriz1[i][j + 1] = (char) (numAle + 1);
                                                        pic = new ImageIcon("icons/" + matriz1[i][j+1] + ".png");
                                                                matriz[i][j+1].setIcon(pic);
							matriz1[i][j + 2] = (char) (numAle + 2);
                                                        pic = new ImageIcon("icons/" + matriz1[i][j+2] + ".png");
                                                                matriz[i][j+2].setIcon(pic);
                                                        matriz1[i][j + 3] = (char) (numAle + 3);
                                                        pic = new ImageIcon("icons/" + matriz1[i][j+3] + ".png");
                                                                matriz[i][j+3].setIcon(pic);
							puntos = puntos + 200;
                                                        pt.setText("" + puntos);
							j = 0;
						}
						j = 0;
                                                 break;
                                            }
						int numAle = (int) ((Math.random() * 2) + 65);
						if ((char) (numAle) == matriz1[i][j + 1]) {
							if (numAle < 67) {
								matriz1[i][j] = (char) (numAle + 1);
                                                                pic = new ImageIcon("icons/" + matriz1[i][j] + ".png");
                                                                matriz[i][j].setIcon(pic);
								matriz1[i][j + 1] = (char) (numAle + 2);
                                                                pic = new ImageIcon("icons/" + matriz1[i][j+1] + ".png");
                                                                matriz[i][j+1].setIcon(pic);
								matriz1[i][j + 2] = (char) (numAle + 3);
                                                                pic = new ImageIcon("icons/" + matriz1[i][j+2] + ".png");
                                                                matriz[i][j+2].setIcon(pic);
								puntos = puntos + 100;
                                                                pt.setText("" + puntos);
                                                                 break;
							} else {
								matriz1[i][j] = (char) (numAle);
                                                                pic = new ImageIcon("icons/" + matriz1[i][j] + ".png");
                                                                matriz[i][j].setIcon(pic);
								matriz1[i][j + 1] = (char) (numAle + 1);
                                                                pic = new ImageIcon("icons/" + matriz1[i][j+1] + ".png");
                                                                matriz[i][j+1].setIcon(pic);
								matriz1[i][j + 2] = (char) (numAle + 2);
                                                                pic = new ImageIcon("icons/" + matriz1[i][j+2] + ".png");
                                                                matriz[i][j+2].setIcon(pic);
								puntos = puntos + 100;
                                                                pt.setText("" + puntos);
                                                                break;
							}
						} else {
							matriz1[i][j] = (char) (numAle);
                                                        pic = new ImageIcon("icons/" + matriz1[i][j] + ".png");
                                                                matriz[i][j].setIcon(pic);
							matriz1[i][j + 1] = (char) (numAle + 1);
                                                        pic = new ImageIcon("icons/" + matriz1[i][j+1] + ".png");
                                                                matriz[i][j+1].setIcon(pic);
							matriz1[i][j + 2] = (char) (numAle + 2);
                                                        pic = new ImageIcon("icons/" + matriz1[i][j+2] + ".png");
                                                                matriz[i][j+2].setIcon(pic);
							puntos = puntos + 100;
                                                        pt.setText("" + puntos);
							j = 0;
						}
						j = 0;
                                                 break;
					}
                                        
					int numAle = (int) ((Math.random() * 2) + 65);
					if ((char) (numAle) == matriz1[i][j + 1]) {
						if (numAle < 67) {
							matriz1[i][j] = (char) (numAle + 1);
                                                        pic = new ImageIcon("icons/" + matriz1[i][j] + ".png");
                                                                matriz[i][j].setIcon(pic);
							matriz1[i][j + 1] = (char) (numAle + 2);
                                                        pic = new ImageIcon("icons/" + matriz1[i][j+1] + ".png");
                                                                matriz[i][j+1].setIcon(pic);
							matriz1[i][j + 2] = (char) (numAle + 3);
                                                        pic = new ImageIcon("icons/" + matriz1[i][j+2] + ".png");
                                                                matriz[i][j+2].setIcon(pic);
							puntos = puntos + 50;
                                                        pt.setText("" + puntos);
                                                        break;
						} else {
							matriz1[i][j] = (char) (numAle);
                                                        pic = new ImageIcon("icons/" + matriz1[i][j] + ".png");
                                                                matriz[i][j].setIcon(pic);
							matriz1[i][j + 1] = (char) (numAle + 1);
                                                        pic = new ImageIcon("icons/" + matriz1[i][j+1] + ".png");
                                                                matriz[i][j+1].setIcon(pic);
							matriz1[i][j + 2] = (char) (numAle + 2);
                                                        pic = new ImageIcon("icons/" + matriz1[i][j+2] + ".png");
                                                                matriz[i][j+2].setIcon(pic);
							puntos = puntos + 50;
                                                        pt.setText("" + puntos);
                                                        break;
						}
					} else {
						matriz1[i][j] = (char) (numAle);
                                                pic = new ImageIcon("icons/" + matriz1[i][j] + ".png");
                                                                matriz[i][j].setIcon(pic);
						matriz1[i][j + 1] = (char) (numAle + 1);
                                                pic = new ImageIcon("icons/" + matriz1[i][j+1] + ".png");
                                                                matriz[i][j+1].setIcon(pic);
						matriz1[i][j + 2] = (char) (numAle + 2);
                                                pic = new ImageIcon("icons/" + matriz1[i][j+2] + ".png");
                                                                matriz[i][j+2].setIcon(pic);
						puntos = puntos + 50;
                                                pt.setText("" + puntos);
						j = 0;
					}
					j = 0;
                                         break;
				}else{
                                    
                                    
                                }                              
			}
		}
               
                }
 public int play2(int a, int b, int c, int d){
    aux = matriz1[c][d];
    matriz1[c][d] = matriz1[a][b];
    matriz1[a][b] = aux;
    Icon temp = matriz[c][d].getIcon();
    matriz[c][d].setIcon(matriz[a][b].getIcon());
    matriz[a][b].setIcon(temp);
    
    
        return 0;
}
     public  void eliminacionV() {
		for (int j = 0; j < 9; j++) {
			for (int i = 0; i < 9; i++) {
                                ImageIcon pic;
				if (matriz1[i][j] == matriz1[i + 1][j] && matriz1[i + 2][j] == matriz1[i][j]) {
					if (matriz1[i][j] == matriz1[i + 3][j]) {
                                            if (matriz1[i][j] == matriz1[i+4][j]) {
                                                if (matriz1[i][j]==matriz1[i+5][j]){
                                                    int numAle = (int) ((Math.random() * 1) + 65);
                                                    if ((char) (numAle) == matriz1[i + 1][j]) {
							if (numAle < 66) {
								matriz1[i][j] = (char) (numAle + 1);
                                                                pic = new ImageIcon("icons/" + matriz1[i][j] + ".png");
                                                                matriz[i][j].setIcon(pic);
								matriz1[i + 1][j] = (char) (numAle + 2);
                                                                pic = new ImageIcon("icons/" + matriz1[i+1][j] + ".png");
                                                                matriz[i+1][j].setIcon(pic);
								matriz1[i + 2][j] = (char) (numAle + 3);
                                                                pic = new ImageIcon("icons/" + matriz1[i+2][j] + ".png");
                                                                matriz[i+2][j].setIcon(pic);
                                                                matriz1[i + 3][j] = (char) (numAle + 4);
                                                                pic = new ImageIcon("icons/" + matriz1[i+3][j] + ".png");
                                                                matriz[i+3][j].setIcon(pic);
								puntos = puntos + 350;
                                                                pt.setText("" + puntos);
                                                                break;
							} else {
								matriz1[i][j] = (char) (numAle);
                                                                pic = new ImageIcon("icons/" + matriz1[i][j] + ".png");
                                                                matriz[i][j].setIcon(pic);
								matriz1[i + 1][j] = (char) (numAle + 1);
                                                                pic = new ImageIcon("icons/" + matriz1[i+1][j] + ".png");
                                                                matriz[i+1][j].setIcon(pic);
								matriz1[i + 2][j] = (char) (numAle + 2);
                                                                pic = new ImageIcon("icons/" + matriz1[i+2][j] + ".png");
                                                                matriz[i+2][j].setIcon(pic);
                                                                matriz1[i + 3][j] = (char) (numAle + 3);
                                                                pic = new ImageIcon("icons/" + matriz1[i+3][j] + ".png");
                                                                matriz[i+3][j].setIcon(pic);
								puntos = puntos + 350;
                                                                pt.setText("" + puntos);
                                                                break;
							}
						}else {
							matriz1[i][j] = (char) (numAle);
							matriz1[i + 1][j] = (char) (numAle + 1);
                                                        pic = new ImageIcon("icons/" + matriz1[i+1][j] + ".png");
                                                                matriz[i+1][j].setIcon(pic);
							matriz1[i + 2][j] = (char) (numAle + 2);
                                                        pic = new ImageIcon("icons/" + matriz1[i+2][j] + ".png");
                                                                matriz[i+2][j].setIcon(pic);
                                                        matriz1[i + 3][j] = (char) (numAle + 3);
                                                        pic = new ImageIcon("icons/" + matriz1[i+3][j] + ".png");
                                                                matriz[i+3][j].setIcon(pic);
							puntos = puntos + 350;
                                                        pt.setText("" + puntos);
							i = 0;
                                                        
						}
						i = 0;
                                                break;
                                                }
                                            int numAle = (int) ((Math.random() * 1) + 65);
                                            if ((char) (numAle) == matriz1[i + 1][j]) {
							if (numAle < 66) {
								matriz1[i][j] = (char) (numAle + 1);
                                                                pic = new ImageIcon("icons/" + matriz1[i][j] + ".png");
                                                                matriz[i][j].setIcon(pic);
								matriz1[i + 1][j] = (char) (numAle + 2);
                                                                pic = new ImageIcon("icons/" + matriz1[i+1][j] + ".png");
                                                                matriz[i+1][j].setIcon(pic);
								matriz1[i + 2][j] = (char) (numAle + 3);
                                                                pic = new ImageIcon("icons/" + matriz1[i+2][j] + ".png");
                                                                matriz[i+2][j].setIcon(pic);
                                                                matriz1[i + 3][j] = (char) (numAle + 4);
                                                                pic = new ImageIcon("icons/" + matriz1[i+3][j] + ".png");
                                                                matriz[i+3][j].setIcon(pic);
								puntos = puntos + 200;
                                                                pt.setText("" + puntos);
                                                                break;
							} else {
								matriz1[i][j] = (char) (numAle);
                                                                pic = new ImageIcon("icons/" + matriz1[i][j] + ".png");
                                                                matriz[i][j].setIcon(pic);
								matriz1[i + 1][j] = (char) (numAle + 1);
                                                                pic = new ImageIcon("icons/" + matriz1[i+1][j] + ".png");
                                                                matriz[i+1][j].setIcon(pic);
								matriz1[i + 2][j] = (char) (numAle + 2);
                                                                pic = new ImageIcon("icons/" + matriz1[i+2][j] + ".png");
                                                                matriz[i+2][j].setIcon(pic);
                                                                matriz1[i + 3][j] = (char) (numAle + 3);
                                                                pic = new ImageIcon("icons/" + matriz1[i+3][j] + ".png");
                                                                matriz[i+3][j].setIcon(pic);
								puntos = puntos + 200;
                                                                pt.setText("" + puntos);
                                                                break;
							}
						}else {
							matriz1[i][j] = (char) (numAle);
                                                        pic = new ImageIcon("icons/" + matriz1[i][j] + ".png");
                                                                matriz[i][j].setIcon(pic);
							matriz1[i + 1][j] = (char) (numAle + 1);
                                                        pic = new ImageIcon("icons/" + matriz1[i+1][j] + ".png");
                                                                matriz[i+1][j].setIcon(pic);
							matriz1[i + 2][j] = (char) (numAle + 2);
                                                        pic = new ImageIcon("icons/" + matriz1[i+2][j] + ".png");
                                                                matriz[i+2][j].setIcon(pic);
                                                        matriz1[i + 3][j] = (char) (numAle + 3);
                                                        pic = new ImageIcon("icons/" + matriz1[i+3][j] + ".png");
                                                                matriz[i+3][j].setIcon(pic);
							puntos = puntos + 200;
                                                        pt.setText("" + puntos);
							i = 0;
                                                        
						}
						i = 0;
                                                break;
                                            }
						int numAle = (int) ((Math.random() * 2) + 65);
						if ((char) (numAle) == matriz1[i + 1][j]) {
							if (numAle < 67) {
								matriz1[i][j] = (char) (numAle + 1);
                                                                pic = new ImageIcon("icons/" + matriz1[i][j] + ".png");
                                                                matriz[i][j].setIcon(pic);
								matriz1[i + 1][j] = (char) (numAle + 2);
                                                                pic = new ImageIcon("icons/" + matriz1[i+1][j] + ".png");
                                                                matriz[i+1][j].setIcon(pic);
								matriz1[i + 2][j] = (char) (numAle + 3);
                                                                pic = new ImageIcon("icons/" + matriz1[i+2][j] + ".png");
                                                                matriz[i+2][j].setIcon(pic);
								puntos = puntos + 100;
                                                                pt.setText("" + puntos);
                                                                break;
							} else {
								matriz1[i][j] = (char) (numAle);
                                                                pic = new ImageIcon("icons/" + matriz1[i][j] + ".png");
                                                                matriz[i][j].setIcon(pic);
								matriz1[i + 1][j] = (char) (numAle + 1);
                                                                pic = new ImageIcon("icons/" + matriz1[i+1][j] + ".png");
                                                                matriz[i+1][j].setIcon(pic);
								matriz1[i + 2][j] = (char) (numAle + 2);
                                                                pic = new ImageIcon("icons/" + matriz1[i+2][j] + ".png");
                                                                matriz[i+2][j].setIcon(pic);
								puntos = puntos + 100;
                                                                pt.setText("" + puntos);
                                                                break;
							}
						} else {
							matriz1[i][j] = (char) (numAle);
                                                        pic = new ImageIcon("icons/" + matriz1[i][j] + ".png");
                                                                matriz[i][j].setIcon(pic);
							matriz1[i + 1][j] = (char) (numAle + 1);
                                                        pic = new ImageIcon("icons/" + matriz1[i+1][j] + ".png");
                                                                matriz[i+1][j].setIcon(pic);
							matriz1[i + 2][j] = (char) (numAle + 2);
                                                        pic = new ImageIcon("icons/" + matriz1[i+2][j] + ".png");
                                                                matriz[i+2][j].setIcon(pic);
							puntos = puntos + 100;
                                                        pt.setText("" + puntos);
							i = 0;
                                                        
						}
						i = 0;
                                                break;
					}
					int numAle = (int) ((Math.random() * 2) + 65);
					if ((char) (numAle) == matriz1[i + 1][j]) {
						if (numAle < 67) {
							matriz1[i][j] = (char) (numAle + 1);
                                                        pic = new ImageIcon("icons/" + matriz1[i][j] + ".png");
                                                                matriz[i][j].setIcon(pic);
							matriz1[i + 1][j] = (char) (numAle + 2);
                                                        pic = new ImageIcon("icons/" + matriz1[i+1][j] + ".png");
                                                                matriz[i+1][j].setIcon(pic);
							matriz1[i + 2][j] = (char) (numAle + 3);
                                                        pic = new ImageIcon("icons/" + matriz1[i+2][j] + ".png");
                                                                matriz[i+2][j].setIcon(pic);
							puntos = puntos + 50;
                                                        pt.setText("" + puntos);
                                                        break;
						} else {
							matriz1[i][j] = (char) (numAle);
                                                        pic = new ImageIcon("icons/" + matriz1[i][j] + ".png");
                                                                matriz[i][j].setIcon(pic);
							matriz1[i + 1][j] = (char) (numAle + 1);
                                                        pic = new ImageIcon("icons/" + matriz1[i+1][j] + ".png");
                                                                matriz[i+1][j].setIcon(pic);
							matriz1[i + 2][j] = (char) (numAle + 2);
                                                        pic = new ImageIcon("icons/" + matriz1[i+2][j] + ".png");
                                                                matriz[i+2][j].setIcon(pic);
							puntos = puntos + 50;
                                                        pt.setText("" + puntos);
                                                        break;
						}
					} else {
						matriz1[i][j] = (char) (numAle);
                                                pic = new ImageIcon("icons/" + matriz1[i][j] + ".png");
                                                                matriz[i][j].setIcon(pic);
						matriz1[i + 1][j] = (char) (numAle + 1);
                                                pic = new ImageIcon("icons/" + matriz1[i+1][j] + ".png");
                                                                matriz[i+1][j].setIcon(pic);
						matriz1[i + 2][j] = (char) (numAle + 2);
                                                pic = new ImageIcon("icons/" + matriz1[i+2][j] + ".png");
                                                                matriz[i+2][j].setIcon(pic);
						puntos = puntos + 50;
                                                pt.setText("" + puntos);
						i = 0;
					}
					i = 0;
                                        break;
				}                          
			}
		}
                           
	}
     public  void menu() {
		int op = 0;
                int b= 1;
                JOptionPane.showMessageDialog(null, "Bienvenido para ganar necesitas LLegar a 500 puntos y Solo tienes 3 Vidas", "", JOptionPane.INFORMATION_MESSAGE);
		while (b != 0) {
			JOptionPane.showMessageDialog(null, "Que Opción desea hacer?", "", JOptionPane.INFORMATION_MESSAGE);	
			JOptionPane.showMessageDialog(null, "1. Para mover. 2. Para Salir", "", JOptionPane.INFORMATION_MESSAGE);
			respuesta = JOptionPane.showInputDialog("Escribe ");
                         op = Integer.parseInt(respuesta);
			
			if (op == 1) {
				play();
			}
			if (op == 2) {
				b=0;
                        JOptionPane.showMessageDialog(null, "GRACIAS POR JUGAR!!", "", JOptionPane.INFORMATION_MESSAGE);
			}
         
		
	}
}
}


	


        
        

 



	