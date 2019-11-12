package util;

import org.openqa.selenium.WebElement;

public class Validacao {

	public boolean ValidaElemVisivel(WebElement elemento) {
		try {
			if (elemento.isDisplayed())
				new Util().HighlightElemPassou(elemento);

			return elemento.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}

	public boolean ValidaElemEnable(WebElement elemento) {
		try {
			if (elemento.isEnabled())
				new Util().HighlightElemPassou(elemento);

			return elemento.isEnabled();
		} catch (Exception e) {
			return false;
		}
	}

	public boolean ValidaElemContainsText(WebElement elemento, String resultadoEsperado) {
		try {
			Util util = new Util();
			if (elemento.getText().contains(resultadoEsperado) && resultadoEsperado != "") {
				util.HighlightElemPassou(elemento);
				return true;
			} else {
				util.HighlightElemFalhou(elemento);
				return false;
			}
		} catch (Exception e) {
			return false;
		}
	}

	public boolean ValidaAttributeValueText(WebElement elemento, String resultadoEsperado) {
		try {
			Util util = new Util();
			if (elemento.getAttribute("value").contains(resultadoEsperado) && resultadoEsperado != "") {
				util.HighlightElemPassou(elemento);
				return true;
			} else {
				util.HighlightElemFalhou(elemento);
				return false;
			}
		} catch (Exception e) {
			return false;
		}
	}

	public boolean ValidaElemEqualsText(WebElement elemento, String resultadoEsperado) {
		try {
			Util util = new Util();
			if (elemento.getText().equals(resultadoEsperado)) {
				util.HighlightElemPassou(elemento);
				return true;
			} else {
				util.HighlightElemFalhou(elemento);
				return false;
			}
		} catch (Exception e) {
			return false;
		}
	}

	public boolean ValidaEqualsText(String resultadoEsperado1, String resultadoEsperado2) {
		try {
			return resultadoEsperado1.equals(resultadoEsperado2);
		} catch (Exception e) {
			return false;
		}
	}

	public boolean ValidaContainsText(String resultadoEsperado1, String resultadoEsperado2) {
		try {
			return resultadoEsperado1.contains(resultadoEsperado2);
		} catch (Exception e) {
			return false;
		}
	}

//     public boolean ValidaElementTextRegex(WebElement elemento, String resultadoEsperado)
//     {
//         Util util = new Util();
//         try
//         {
//             Match matchResult = Regex.Match(elemento.getText(), resultadoEsperado);
//
//             if (matchResult.Success)
//             {
//                 util.HighlightElemPassou(elemento);
//                 return true;
//             }
//             else
//             {
//                 util.HighlightElemFalhou(elemento);
//                 return false;
//             }
//         }
//         catch (Exception e)
//         {
//             return false;
//         }
//     }

}
