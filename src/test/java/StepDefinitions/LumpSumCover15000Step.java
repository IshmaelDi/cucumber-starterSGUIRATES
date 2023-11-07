package StepDefinitions;

import PageObjects.IndividualCover.LumpSumCover15000;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.PageObject;

public class LumpSumCover15000Step extends PageObject {

    @Steps
    LumpSumCover15000 lumpSumCover15000;


    @Given("user log in SGUI or shamba  website")
    public void user_log_in_sgui_or_shamba_website() throws InterruptedException {
        lumpSumCover15000.OpenWebsite();
        lumpSumCover15000.loginIn("WRambau@clientele.co.za", "clientele003");
        lumpSumCover15000.ClienteleLogo();
        lumpSumCover15000.CaptureSale();
        lumpSumCover15000.LeadBasket();
        lumpSumCover15000.selectNew();
        lumpSumCover15000.LeadCheckBox();
        lumpSumCover15000.ActionSaleButton();

    }
    @When("user Select the plan option: Individual or member and family")
    public void user_select_the_plan_option_individual_or_member_and_family() throws InterruptedException {
        lumpSumCover15000.HelpIconButton();
        lumpSumCover15000.SelectPlanTextDropdown("YA");
        lumpSumCover15000.SelectPlanOkBtn();

    }
    @Then("user Select the date of birth of the main life assured")
    public void user_select_the_date_of_birth_of_the_main_life_assured() throws InterruptedException {
        lumpSumCover15000.GetRatesBtn();
        lumpSumCover15000.SelectPlanOption();
        lumpSumCover15000.SelectDoB("2022-06-03");

    }
    @When("user On the slider select the cover amounts that are applicable to the plan chosen")
    public void user_on_the_slider_select_the_cover_amounts_that_are_applicable_to_the_plan_chosen() throws InterruptedException {
        lumpSumCover15000.selectCoverAmount();
        lumpSumCover15000.ViewRates();
        lumpSumCover15000.StartSale();
        lumpSumCover15000.handleModelPopUp();
        //Main Member details
        lumpSumCover15000.selectTittleDropdown("Mr");
        lumpSumCover15000.EnterName("Shade");
        lumpSumCover15000.EnterSurname("Mills");
        lumpSumCover15000.selectSACitizen("Yes");
        lumpSumCover15000.clickTextBox();
        lumpSumCover15000.enterID("2206038569084");
        lumpSumCover15000.confirmID("2206038569084");
        lumpSumCover15000.clickOKButton();
        lumpSumCover15000.EnterDoB("2022-06-03");
        lumpSumCover15000.selectMonthlyIncome("Up to 3,000");
        lumpSumCover15000.selectOccupation("Sales and services");
        lumpSumCover15000.selectEduction("Matric");
        lumpSumCover15000.enterCellNum("0601234231");
        lumpSumCover15000.enterPostalAddress("Plot 30 ward 55 ");
        lumpSumCover15000.enterPostalCode("1234");
        lumpSumCover15000.clickCopyPhysical();
        lumpSumCover15000.clickValidateBtn();
        lumpSumCover15000.clickSaveMMBtn();
        //Payer Details
        lumpSumCover15000.navigatePayer();
        lumpSumCover15000.selectTittle("Miss");
        lumpSumCover15000.enterName("Joy");
        lumpSumCover15000.enterSurname("McGregor");
        lumpSumCover15000.fieldTextID();
        lumpSumCover15000.mainIDPopUp("9606035120182");
        lumpSumCover15000.confirmationID("9606035120182");
        lumpSumCover15000.clickOK();
        lumpSumCover15000.PayerRelation("Sister");
        lumpSumCover15000.selectDebit("1");
        lumpSumCover15000.selectDebiDate("01 Dec 2023");
        lumpSumCover15000.selectBank("CAPITEC BANK LTD");
        lumpSumCover15000.selectBranch("470010");
        lumpSumCover15000.selectAccType("Savings Account");
        lumpSumCover15000.enterAccNum();
        lumpSumCover15000.enterMainAcc("1234");
        lumpSumCover15000.confirmAccount("1234");
        lumpSumCover15000.OKButton();
        lumpSumCover15000.enterMobiNum("0601234230");
        lumpSumCover15000.isEmployee("No");
        lumpSumCover15000.confCheckBoxes();
        lumpSumCover15000.clickSaveBtn();
    }
    @Then("user proceed with the cover and conclude sale")
    public void user_proceed_with_the_cover_and_conclude_sale() throws InterruptedException {
        lumpSumCover15000.navigateBeneficiary();
        lumpSumCover15000.addBeneficiary();
        lumpSumCover15000.selectRelation("Member Estate");
        lumpSumCover15000.saveBeneficiary();
        lumpSumCover15000.navigateFICA();
        lumpSumCover15000.navigatePremium();
        lumpSumCover15000.navigateRewards();
        lumpSumCover15000.navigateSummary();
        lumpSumCover15000.debiCheck();
        lumpSumCover15000.summaryTable();
    }
}