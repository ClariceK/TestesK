package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddProduto_Page {

    WebDriver driver;
    public AddProduto_Page (WebDriver driver) {
        this.driver = driver;
    }

    // Credenciais de Login/Add Produto
    @FindBy(how = How.ID, using = "menuUser")    WebElement botaoPerfil;
    @FindBy(how = How.NAME, using = "username")    WebElement preencherUsuario;
    @FindBy(how = How.NAME, using = "password")    WebElement preencherSenha;
    @FindBy(how = How.ID, using = "sign_in_btnundefined")    WebElement botaoEntrar;
    @FindBy(how = How.ID, using = "headphonesImg") WebElement imgFone;
    @FindBy(how = How.XPATH, using = "//*[@id=\"14\"]") WebElement foneLgt;
    @FindBy(how = How.NAME, using = "save_to_cart") WebElement botaoAddCard;

    //Cliar no botão do Perfil
    public void ClicarPerfil() {
        int timeout = 10;
        new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(botaoPerfil));
        botaoPerfil.click();
    }

    //Preencher email
    public void ColocarUsuario(String strUsuario) {
        int timeout = 10;
        new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(preencherUsuario));
        preencherUsuario.sendKeys(strUsuario);
    }

    //Preencher senha
    public void ColocarSenha(String strSenha) {
        int timeout = 10;
        new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(preencherSenha));
        preencherSenha.sendKeys(strSenha);
    }

    //Clicar no botão para Entrar
    public void ClicarEntrar() {
        int timeout = 10;
        new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(botaoEntrar));
        botaoEntrar.click();
    }

    //Clicar na imagem do catalogo fone
    public void ClicarFone() {
        int timeout = 10;
        new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(imgFone));
        imgFone.click();
    }

    //Clicar na imagem do fone logitech
    public void ClicarFoneLogitech() {
        int timeout = 10;
        new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(foneLgt));
        foneLgt.click();
    }

    //Clicar no botao adicionar ao carrinho
    public void ClicarAddCarrinho() {
        int timeout = 10;
        new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(botaoAddCard));
        botaoAddCard.click();
    }
}
