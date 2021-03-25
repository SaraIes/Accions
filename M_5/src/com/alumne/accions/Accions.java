package com.alumne.accions;

public class Accions {

	/*
	 * Métode per registrar tickers i preus
	 * 
	 * Comprova si el ticker és vàlid comparantlo amb els que té guardats, si no
	 * coincideix retorna -1
	 * 
	 * Comprova que el preu estigui dintre d'un determinat rang (si és negatiu
	 * retorna -2 i si és superior a 500 retorna -3
	 * 
	 * També mostra amb una cadena de caràcters el ticker i preu corretes i en
	 * aquest cas retorna -0
	 */
	public int registrarPreu(double preu, String ticker) {

		// Si fora real guardaria a la base de dades el nom de l'empresa i el valor de
		// l'acció pero com es tracta d'una prova només els mostra per pantalla

		String tickersValids = "AAPL AMZN FB GOOGL";

		int comparacio = tickersValids.indexOf(ticker);
		if (comparacio == -1) {

			System.out.println("El ticker no és valid");

			return -1;
		}

		if (preu < 0.0) {

			System.out.println("El preu és menor que el valor mínim permés");

			return -2;

		}

		if (preu > 500.0) {

			System.out.println("El preu és superior al valor màxim permés");
			return -3;
		}

		System.out.println("Valors registrats, ticker: " + ticker + ", preu: " + preu);
		return 0;
	}

	/*
	 * Es connecta a per a mirar el preu més alt com és per a una prova rapida
	 * mostra un valor predeterminat
	 * 
	 * @return Retorna el preu més alt
	 */
	public double preuMax() {
		// Un programa real es connectaria a una base de dades per a mirar el preu més
		// alt com és per a una prova rapida mostra un valor predeterminat
		return 455.0;
	}

	/*
	 * Es connectaria a una base de dades per a mirar el ticker més gran que hi ha
	 * com és per a una prova rapida mostra un valor predeterminat
	 * 
	 * @return Retorna el ticker més gran
	 */
	public String tickerMax() {
		// Un programa real es connectaria a una base de dades per a mirar el ticker més
		// gran que hi ha com és per a una prova rapida mostra un valor predeterminat
		return "AAPL";
	}

	/*
	 * Es connectaria a una base de dades per a mirar el preu més baix que hi ha com
	 * és per a una prova rapida mostra un valor predeterminat
	 * 
	 * @return Retorna el preu més baix
	 */
	public double preuMin() {
		// Un programa real es connectaria a una base de dades per a mirar el preu més
		// baix que hi ha com és per a una prova rapida mostra un valor predeterminat
		return 150.0;
	}

	/*
	 * Es connectaria a una base de dades per a mirar el preu més baix que hi ha com
	 * és per a una prova rapida mostra un valor predeterminat
	 * 
	 * @return Retorna el ticker més baix
	 */
	public String tickerMin() {
		// Es connectaria a una base de dades per a mirar el ticker més baix que hi ha
		return "FB";
	}
}
