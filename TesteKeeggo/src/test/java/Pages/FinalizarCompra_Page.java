package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FinalizarCompra_Page {

    WebDriver driver;

    public FinalizarCompra_Page (WebDriver driver) {
        this.driver = driver;
    }

    // Credenciais de Finalizar Compra
    @FindBy(how = How.ID, using = "menuCart")    WebElement botaoCart;
    @FindBy(how = How.ID, using = "checkOutPopUp")    WebElement checkOut;
    @FindBy(how = How.ID, using = "next_btn")    WebElement botaoNext;
    @FindBy(how = How.NAME, using = "masterCredit")    WebElement botaoMaster;
    @FindBy(how = How.ID, using = "creditCard") WebElement numeroCartao;
    @FindBy(how = How.NAME, using = "cvv_number") WebElement numeroCVV;
    @FindBy(how = How.NAME, using = "cardholder_name") WebElement nomeCartao;
    @FindBy (how = How.NAME, using = "mmListbox") WebElement mes;
    @FindBy (how = How.NAME, using = "yyyyListbox") WebElement ano;
    @FindBy(how = How.ID, using = "pay_now_btn_ManualPayment") WebElement botaoPagar;


    //Cliar no botão do carrinho
    public void ClicarCarrinho() {
        int timeout = 10;
        new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(botaoCart));
        botaoCart.click();
    }

    //Cliar no botão do checkout
    public void ClicarCheckout() {
        int timeout = 10;
        new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(checkOut));
        checkOut.click();
    }

    //Cliar no botão do next
    public void ClicarNext() {
        int timeout = 10;
        new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(botaoNext));
        botaoNext.click();
    }

    //Cliar no botão do mastercard
    public void ClicarMaster() {
        int timeout = 10;
        new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(botaoMaster));
        botaoMaster.click();
    }


    //Preencher numero cartao
    public void PreencherNCart(String strCartao) {
        int timeout = 10;
        new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(numeroCartao));
        numeroCartao.sendKeys(strCartao);
    }


    //Preencher codigo seguranca
    public void PreencherCvv(String strCVV) {
        int timeout = 10;
        new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(numeroCVV));
        numeroCVV.sendKeys(strCVV);
    }


    //Preencher nome cartao
    public void PreencherNomeCart(String strNCart) {
        int timeout = 10;
        new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(nomeCartao));
        nomeCartao.sendKeys(strNCart);
    }

    public void selecMes() {
        int timeout = 10;
        new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(mes));
        mes.click();
    }

    public void selecAno() {
        int timeout = 10;
        new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(ano));
        ano.click();
    }

    public void botaoPagar() {
        int timeout = 10;
        new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(botaoPagar));
        botaoPagar.click();
    }

}
