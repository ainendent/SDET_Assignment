package payment;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.*;

import static org.testng.Assert.assertTrue;

public class PaymentTests extends BaseTests {

    @Test
    public void testSuccessfulPayment(){
        ShoppingCartPage shoppingCartPage = homePage.clickBuyNow();
        shoppingCartPage.setAmount();
        shoppingCartPage.setName("dinda");
        shoppingCartPage.setEmail("dinda@gmail.com");
        shoppingCartPage.setPhoneNo();
        shoppingCartPage.setCity("Jakarta Timur");
        shoppingCartPage.setAddress("Jl.H.Naman/Komplek DKI Blok P2 no.23");
        shoppingCartPage.setPostalCode();
        OrderSummaryPage orderSummaryPage = shoppingCartPage.clickCheckoutButton();

        orderSummaryPage.clickshippingDetails();
        assertTrue(orderSummaryPage.getNameText()
                        .contains("dinda"),
                "Name is incorrect");

        SelectPaymentPage selectPaymentPage = orderSummaryPage.clickContinueButton();

        CreditCardPage creditCardPage = selectPaymentPage.clickCreditCardButton();
        creditCardPage.setCardNumber();
        creditCardPage.setExpiryDate();
        creditCardPage.setCVV();

        IssuingBankPage issuingBankPage = creditCardPage.clickPayNowButton();
        issuingBankPage.setPassword();
        ValidationPage validationPage = issuingBankPage.clickOKButton();
        assertTrue(validationPage.getAlertText()
                        .contains("Transaction successful"),
                "Transaction failed");

    }
}
