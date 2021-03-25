package com.alumne.accions;

public class Accions {

	/*
	 * M�tode per registrar tickers i preus
	 * 
	 * Comprova si el ticker �s v�lid comparantlo amb els que t� guardats, si no
	 * coincideix retorna -1
	 * 
	 * Comprova que el preu estigui dintre d'un determinat rang (si �s negatiu
	 * retorna -2 i si �s superior a 500 retorna -3
	 * 
	 * Tamb� mostra amb una cadena de car�cters el ticker i preu corretes i en
	 * aquest cas retorna -0
	 */
	public int registrarPreu(double preu, String ticker) {

		// Si fora real guardaria a la base de dades el nom de l'empresa i el valor de
		// l'acci� pero com es tracta d'una prova nom�s els mostra per pantalla

		String tickersValids = "AAPL AMZN FB GOOGL";

		int comparacio = tickersValids.indexOf(ticker);
		if (comparacio == -1) {

			System.out.println("El ticker no �s valid");

			return -1;
		}

		if (preu < 0.0) {

			System.out.println("El preu �s menor que el valor m�nim perm�s");

			return -2;

		}

		if (preu > 500.0) {

			System.out.println("El preu �s superior al valor m�xim perm�s");
			return -3;
		}

		System.out.println("Valors registrats, ticker: " + ticker + ", preu: " + preu);
		return 0;
	}

	/*
	 * Es connecta a per a mirar el preu m�s alt com �s per a una prova rapida
	 * mostra un valor predeterminat
	 * 
	 * @return Retorna el preu m�s alt
	 */
	public double preuMax() {
		// Un programa real es connectaria a una base de dades per a mirar el preu m�s
		// alt com �s per a una prova rapida mostra un valor predeterminat
		return 455.0;
	}

	/*
	 * Es connectaria a una base de dades per a mirar el ticker m�s gran que hi ha
	 * com �s per a una prova rapida mostra un valor predeterminat
	 * 
	 * @return Retorna el ticker m�s gran
	 */
	public String tickerMax() {
		// Un programa real es connectaria a una base de dades per a mirar el ticker m�s
		// gran que hi ha com �s per a una prova rapida mostra un valor predeterminat
		return "AAPL";
	}

	/*
	 * Es connectaria a una base de dades per a mirar el preu m�s baix que hi ha com
	 * �s per a una prova rapida mostra un valor predeterminat
	 * 
	 * @return Retorna el preu m�s baix
	 */
	public double preuMin() {
		// Un programa real es connectaria a una base de dades per a mirar el preu m�s
		// baix que hi ha com �s per a una prova rapida mostra un valor predeterminat
		return 150.0;
	}

	/*
	 * Es connectaria a una base de dades per a mirar el preu m�s baix que hi ha com
	 * �s per a una prova rapida mostra un valor predeterminat
	 * 
	 * @return Retorna el ticker m�s baix
	 */
	public String tickerMin() {
		// Es connectaria a una base de dades per a mirar el ticker m�s baix que hi ha
		return "FB";
	}
}
