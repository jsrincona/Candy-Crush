/*
package juego;

public class DetecV extends Logica{
    public static void eliminacionV() {
		for (int j = 0; j < 9; j++) {
			for (int i = 0; i < 9; i++) {

				if (matriz[i][j] == matriz[i + 1][j] && matriz[i + 2][j] == matriz[i][j]) {
					if (matriz[i][j] == matriz[i + 3][j]) {
                                            if (matriz[i][j] == matriz[i+4][j]) {
                                                if (matriz[i][j]==matriz[i+5][j]){
                                                    int numAle = (int) ((Math.random() * 1) + 65);
                                                    if ((char) (numAle) == matriz[i + 1][j]) {
							if (numAle < 66) {
								matriz[i][j] = (char) (numAle + 1);
								matriz[i + 1][j] = (char) (numAle + 2);
								matriz[i + 2][j] = (char) (numAle + 3);
                                                                matriz[i + 3][j] = (char) (numAle + 4);
								puntos = puntos + 350;
                                                                break;
							} else {
								matriz[i][j] = (char) (numAle);
								matriz[i + 1][j] = (char) (numAle + 1);
								matriz[i + 2][j] = (char) (numAle + 2);
                                                                matriz[i + 3][j] = (char) (numAle + 3);
								puntos = puntos + 350;
                                                                break;
							}
						}else {
							matriz[i][j] = (char) (numAle);
							matriz[i + 1][j] = (char) (numAle + 1);
							matriz[i + 2][j] = (char) (numAle + 2);
                                                        matriz[i + 3][j] = (char) (numAle + 3);
							puntos = puntos + 350;
							i = 0;
                                                        
						}
						i = 0;
                                                break;
                                                }
                                            int numAle = (int) ((Math.random() * 1) + 65);
                                            if ((char) (numAle) == matriz[i + 1][j]) {
							if (numAle < 66) {
								matriz[i][j] = (char) (numAle + 1);
								matriz[i + 1][j] = (char) (numAle + 2);
								matriz[i + 2][j] = (char) (numAle + 3);
                                                                matriz[i + 3][j] = (char) (numAle + 4);
								puntos = puntos + 200;
                                                                break;
							} else {
								matriz[i][j] = (char) (numAle);
								matriz[i + 1][j] = (char) (numAle + 1);
								matriz[i + 2][j] = (char) (numAle + 2);
                                                                matriz[i + 3][j] = (char) (numAle + 3);
								puntos = puntos + 200;
                                                                break;
							}
						}else {
							matriz[i][j] = (char) (numAle);
							matriz[i + 1][j] = (char) (numAle + 1);
							matriz[i + 2][j] = (char) (numAle + 2);
                                                        matriz[i + 3][j] = (char) (numAle + 3);
							puntos = puntos + 200;
							i = 0;
                                                        
						}
						i = 0;
                                                break;
                                            }
						int numAle = (int) ((Math.random() * 2) + 65);
						if ((char) (numAle) == matriz[i + 1][j]) {
							if (numAle < 67) {
								matriz[i][j] = (char) (numAle + 1);
								matriz[i + 1][j] = (char) (numAle + 2);
								matriz[i + 2][j] = (char) (numAle + 3);
								puntos = puntos + 100;
                                                                break;
							} else {
								matriz[i][j] = (char) (numAle);
								matriz[i + 1][j] = (char) (numAle + 1);
								matriz[i + 2][j] = (char) (numAle + 2);
								puntos = puntos + 100;
                                                                break;
							}
						} else {
							matriz[i][j] = (char) (numAle);
							matriz[i + 1][j] = (char) (numAle + 1);
							matriz[i + 2][j] = (char) (numAle + 2);
							puntos = puntos + 100;
							i = 0;
                                                        
						}
						i = 0;
                                                break;
					}
					int numAle = (int) ((Math.random() * 2) + 65);
					if ((char) (numAle) == matriz[i + 1][j]) {
						if (numAle < 67) {
							matriz[i][j] = (char) (numAle + 1);
							matriz[i + 1][j] = (char) (numAle + 2);
							matriz[i + 2][j] = (char) (numAle + 3);
							puntos = puntos + 50;
                                                        break;
						} else {
							matriz[i][j] = (char) (numAle);
							matriz[i + 1][j] = (char) (numAle + 1);
							matriz[i + 2][j] = (char) (numAle + 2);
							puntos = puntos + 50;
                                                        break;
						}
					} else {
						matriz[i][j] = (char) (numAle);
						matriz[i + 1][j] = (char) (numAle + 1);
						matriz[i + 2][j] = (char) (numAle + 2);
						puntos = puntos + 50;
						i = 0;
					}
					i = 0;
                                        break;
				}                          
			}
		}
                           
	}
    public static int play(int a, int b, int c, int d){
    aux = matriz[c][d];
    matriz[c][d] = matriz[a][b];
    matriz[a][b] = aux;
    
        return 0;
}
    public static void main(String[] args) {
        eliminacionV();
    }

}
*/