package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Logout_Page {

    WebDriver driver;

    public Logout_Page(WebDriver driver) {
        this.driver = driver;
    }

    // Credenciais de Login/Logout
    @FindBy(how = How.ID, using = "menuUser")    WebElement botaoPerfil;
    @FindBy(how = How.NAME, using = "username")    WebElement preencherUsuario;
    @FindBy(how = How.NAME, using = "password")    WebElement preencherSenha;
    @FindBy(how = How.ID, using = "sign_in_btnundefined")    WebElement botaoEntrar;
    @FindBy(how = How.XPATH, using = "//*[@id=\"loginMiniTitle\"]/label[3]") WebElement botaoLogout;

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

    //Clicar no botão para Sair
    public void ClicarSair() {
        int timeout = 10;
        new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(botaoLogout));
        botaoLogout.click();
    }
}
