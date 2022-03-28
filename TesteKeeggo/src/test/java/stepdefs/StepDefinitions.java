package stepdefs;

import Pages.*;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class StepDefinitions {

    WebDriver driver;

    @Dado ("^que estou na pagina principal do site\\.$")
    public void que_estou_na_pagina_principal_do_site() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://advantageonlineshopping.com/#/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Quando ("^forneco usuario e senha\\.$")
    public void forneco_usuario_e_senha() throws Exception {
        Login_Page Login = PageFactory.initElements(driver, Login_Page.class);
        Login.ClicarPerfil();
        Login.ColocarUsuario("OliviaMartins");
        Login.ColocarSenha("Teste123");

    }

    @Entao ("^efetuar login com sucesso\\.$")
    public void efetuar_login_com_sucesso() throws Exception {
        Login_Page Login = PageFactory.initElements(driver, Login_Page.class);
        Login.ClicarEntrar();
    }







    @Quando("^verifico se o usuario esta logado\\.$")
    public void verifico_se_o_usuario_esta_logado() throws Exception {
        Logout_Page Logout = PageFactory.initElements(driver, Logout_Page.class);
        Logout.ClicarPerfil();
        Logout.ColocarUsuario("OliviaMartins");
        Logout.ColocarSenha("Teste123");
        Logout.ClicarEntrar();
    }

    @Entao("^efetuo o logout\\.$")
    public void efetuo_o_logout() throws Exception{
        Logout_Page Logout = PageFactory.initElements(driver, Logout_Page.class);
        Logout.ClicarPerfil();
        Logout.ClicarSair();
    }







    @Quando("^coloco os dados para criar conta\\.$")
    public void coloco_os_dados_para_criar_conta() throws Exception{
        CriarConta_Page CriarConta = PageFactory.initElements(driver, CriarConta_Page.class);
        CriarConta.ClicarPerfil();
        CriarConta.ClicarCriarConta();
        CriarConta.ColocarUsuario("OliviaMartins");
        CriarConta.ColocarEmail("oliviamartins@teste.com");
        CriarConta.ColocarSenha("Teste123");
        CriarConta.ColocarConfirmSenha("Teste123");
        CriarConta.ClicarTermos();
    }


    @Entao("^clico no botao registrar\\.$")
    public void clico_no_botao_registrar() throws Exception {
        CriarConta_Page CriarConta = PageFactory.initElements(driver, CriarConta_Page.class);
        CriarConta.ClicarRegistrar();
    }








    @Quando ("^entro na conta e seleciono o produto\\.$")
    public void entro_na_conta_e_seleciono_o_produto() throws Exception {
        AddProduto_Page AddProduto = PageFactory.initElements(driver, AddProduto_Page.class);
        AddProduto.ClicarPerfil();
        AddProduto.ColocarUsuario("OliviaMartins");
        AddProduto.ColocarSenha("Teste123");
        AddProduto.ClicarEntrar();
        AddProduto.ClicarFone();
        AddProduto.ClicarFoneLogitech();
    }

    @Entao ("^adicionar o produto\\.$")
    public void adicionar_o_produto() throws Exception {
        AddProduto_Page AddProduto = PageFactory.initElements(driver, AddProduto_Page.class);
        AddProduto.ClicarAddCarrinho();
    }








    @Quando ("^clico no carrinho para finalizar compra\\.$")
    public void clico_no_carrinho_para_finalizar_compra() throws Exception {
        Login_Page Login = PageFactory.initElements(driver, Login_Page.class);
        FinalizarCompra_Page FinComp = PageFactory.initElements(driver, FinalizarCompra_Page.class);

        Login.ClicarPerfil();
        Login.ColocarUsuario("OliviaMartins");
        Login.ColocarSenha("Teste123");
        Login.ClicarEntrar();

        FinComp.ClicarCarrinho();
        FinComp.ClicarCheckout();
        FinComp.ClicarNext();
        FinComp.ClicarMaster();
        FinComp.PreencherNCart("102030405060");
        FinComp.PreencherCvv("234");
        FinComp.PreencherNomeCart("Olivia");

    }


    @Entao ("^compra finalizada\\.$")
    public void compra_finalizada() throws Exception {
        FinalizarCompra_Page FinComp = PageFactory.initElements(driver, FinalizarCompra_Page.class);
        FinComp.botaoPagar();
    }

}
