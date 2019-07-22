
/*package juego;

public class DetecH extends Logica{
    public static int eliminacionH() {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {

				if (matriz[i][j] == matriz[i][j + 1] && matriz[i][j] == matriz[i][j + 2]) {
					if (matriz[i][j] == matriz[i][j + 3]) {
                                            if(matriz[i][j] ==matriz[i][j+4]){
                                                if(matriz[i][j]==matriz[i][j+5]){
                                                    int numAle = (int) ((Math.random() * 1) + 65);
                                                if ((char) (numAle) == matriz[i][j + 1]) {
							if (numAle < 66) {
								matriz[i][j] = (char) (numAle + 1);
								matriz[i][j + 1] = (char) (numAle + 2);
								matriz[i][j + 2] = (char) (numAle + 3);
                                                                matriz[i][j + 3] = (char) (numAle + 4);
								puntos = puntos + 350;
                                                                 break;
							} else {
								matriz[i][j] = (char) (numAle);
								matriz[i][j + 1] = (char) (numAle + 1);
								matriz[i][j + 2] = (char) (numAle + 2);
                                                                matriz[i][j + 3] = (char) (numAle + 3);
								puntos = puntos + 350;
                                                                break;
							}
                                            }else {
							matriz[i][j] = (char) (numAle);
							matriz[i][j + 1] = (char) (numAle + 1);
							matriz[i][j + 2] = (char) (numAle + 2);
                                                        matriz[i][j + 3] = (char) (numAle + 3);
							puntos = puntos + 350;
							j = 0;
						}
						j = 0;
                                                 break;
                                                }
                                                int numAle = (int) ((Math.random() * 1) + 65);
                                                if ((char) (numAle) == matriz[i][j + 1]) {
							if (numAle < 66) {
								matriz[i][j] = (char) (numAle + 1);
								matriz[i][j + 1] = (char) (numAle + 2);
								matriz[i][j + 2] = (char) (numAle + 3);
                                                                matriz[i][j + 3] = (char) (numAle + 4);
								puntos = puntos + 200;
                                                                 break;
							} else {
								matriz[i][j] = (char) (numAle);
								matriz[i][j + 1] = (char) (numAle + 1);
								matriz[i][j + 2] = (char) (numAle + 2);
                                                                matriz[i][j + 3] = (char) (numAle + 3);
								puntos = puntos + 200;
                                                                break;
							}
                                            }else {
							matriz[i][j] = (char) (numAle);
							matriz[i][j + 1] = (char) (numAle + 1);
							matriz[i][j + 2] = (char) (numAle + 2);
                                                        matriz[i][j + 3] = (char) (numAle + 3);
							puntos = puntos + 200;
							j = 0;
						}
						j = 0;
                                                 break;
                                            }
						int numAle = (int) ((Math.random() * 2) + 65);
						if ((char) (numAle) == matriz[i][j + 1]) {
							if (numAle < 67) {
								matriz[i][j] = (char) (numAle + 1);
								matriz[i][j + 1] = (char) (numAle + 2);
								matriz[i][j + 2] = (char) (numAle + 3);
								puntos = puntos + 100;
                                                                 break;
							} else {
								matriz[i][j] = (char) (numAle);
								matriz[i][j + 1] = (char) (numAle + 1);
								matriz[i][j + 2] = (char) (numAle + 2);
								puntos = puntos + 100;
                                                                break;
							}
						} else {
							matriz[i][j] = (char) (numAle);
							matriz[i][j + 1] = (char) (numAle + 1);
							matriz[i][j + 2] = (char) (numAle + 2);
							puntos = puntos + 100;
							j = 0;
						}
						j = 0;
                                                 break;
					}
                                        
					int numAle = (int) ((Math.random() * 2) + 65);
					if ((char) (numAle) == matriz[i][j + 1]) {
						if (numAle < 67) {
							matriz[i][j] = (char) (numAle + 1);
							matriz[i][j + 1] = (char) (numAle + 2);
							matriz[i][j + 2] = (char) (numAle + 3);
							puntos = puntos + 50;
                                                        break;
						} else {
							matriz[i][j] = (char) (numAle);
							matriz[i][j + 1] = (char) (numAle + 1);
							matriz[i][j + 2] = (char) (numAle + 2);
							puntos = puntos + 50;
                                                        break;
						}
					} else {
						matriz[i][j] = (char) (numAle);
						matriz[i][j + 1] = (char) (numAle + 1);
						matriz[i][j + 2] = (char) (numAle + 2);
						puntos = puntos + 50;
						j = 0;
					}
					j = 0;
                                         break;
				}else{
                                    
                                    
                                }                              
			}
		}
                return 0;
                }
                    
public static int play(int a, int b, int c, int d){
    aux = matriz[c][d];
    matriz[c][d] = matriz[a][b];
    matriz[a][b] = aux;
    
        return 0;
}
    public static void main(String[] args) {
        eliminacionH();
    }
}
*/