package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CriarConta_Page {

    WebDriver driver;
    public CriarConta_Page (WebDriver driver) {
        this.driver = driver;
    }

    // Credenciais de Criar Conta
    @FindBy(how = How.ID, using = "menuUser")    WebElement botaoPerfil;
    @FindBy(how = How.CSS, using = "body > login-modal > div > div > div.login.ng-scope > a.create-new-account.ng-scope") WebElement botaoCriarConta;
    @FindBy(how = How.NAME, using = "usernameRegisterPage") WebElement preencherNome;
    @FindBy(how = How.NAME, using = "emailRegisterPage") WebElement preencherEmail;
    @FindBy(how = How.NAME, using = "passwordRegisterPage") WebElement preencherSenha;
    @FindBy(how = How.NAME, using = "confirm_passwordRegisterPage") WebElement preencherConfirmSenha;
    @FindBy(how = How.NAME, using = "i_agree") WebElement aceitarTermos;
    @FindBy(how = How.ID, using = "register_btnundefined") WebElement botaoRegister;

    //Cliar no botão do Perfil
    public void ClicarPerfil() {
        int timeout = 10;
        new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(botaoPerfil));
        botaoPerfil.click();
    }

    public void ClicarCriarConta() {
        int timeout = 10;
        new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(botaoCriarConta));
        botaoCriarConta.click();
    }

    //Preencher nome
    public void ColocarUsuario(String strNome) {
        int timeout = 10;
        new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(preencherNome));
        preencherNome.sendKeys(strNome);
    }

    //Preencher email
    public void ColocarEmail(String strEmail) {
        int timeout = 10;
        new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(preencherEmail));
        preencherEmail.sendKeys(strEmail);
    }

    //Preencher senha
    public void ColocarSenha(String strSenha) {
        int timeout = 10;
        new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(preencherSenha));
        preencherSenha.sendKeys(strSenha);
    }

    //Preencher confirmação de senha
    public void ColocarConfirmSenha(String strSenhaConfirm) {
        int timeout = 10;
        new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(preencherConfirmSenha));
        preencherConfirmSenha.sendKeys(strSenhaConfirm);
    }

    //Clicar no botão para aceitar os termos
    public void ClicarTermos() {
        int timeout = 10;
        new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(aceitarTermos));
        aceitarTermos.click();
    }

    //Clicar no botão registrar
    public void ClicarRegistrar() {
        int timeout = 10;
        new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(botaoRegister));
        botaoRegister.click();
    }
}
