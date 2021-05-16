package org.fasttrackit.features;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.pages.RegisterPage;
import org.fasttrackit.steps.RegisterSteps;
import org.fasttrackit.utils.BaseTest;
import org.junit.Test;

public class RegisterAccountTest extends BaseTest {
    @Steps
    private LoginTest loginTest;
    @Steps
    private RegisterSteps registerSteps;
    @Test
    public void registerNewAccount() throws InterruptedException {
        registerSteps.navigateToRegister();
        registerSteps.enterRegisterCredentials("Ioan", "Nicolae",
                "123456789","123456789","d.debre@yahoo.com");
        registerSteps.submitRegistration();
        Thread.sleep(3000);
        registerSteps.checkRegisterMessage("There is already an account with this email address. If you are sure that it is your email address," +
                " click here to get your password and access your account.");
    }
}
