package aut.testcreation.pages.rumboesbracamontequezadapino.TrenesPages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TrenesPage extends SeleniumWrapper {

    public TrenesPage(WebDriver driver) {
        super(driver);
    }

    //Localizadores

    By locatorSoloIda = By.xpath("//div[contains(text(),'Solo ida')]");
    By locatorIdaYVuelta = By.xpath("//div[contains(text(),'Ida y vuelta')]");
    By locatorLugarOrigen = By.xpath("//input[@placeholder= 'Origen']");

    By locatorSeleccionaCiudad = By.xpath("//li[@data-option-index='0']");
    By locatorSeleccionaCiudad2 = By.xpath("//li[@data-option-index='7']");
    By locatorLugarDestino = By.xpath("//input[@placeholder= 'Destino']");
    By locatorFechaIda = By.xpath("//button[@aria-label='Fecha de ida']");
    By locatorMarcarDiaIda15 = By.xpath("//button[contains(text(), '15')]");
    //class="d-1z9ad3" [@class='d-1kuzy14'] //button[contains(text(), '15')]

    // Para junio, julio //button[contains(text(), '15')][@class='d-1kuzy14']

    By locatorMarcarDiaVuelta25 = By.xpath("//button[contains(text(), '25')]");

    By locatorMarcarDiaVuelta22 = By.xpath("//button[contains(text(), '22')]");
    By locatorMarcarDiaVuelta13 = By.xpath("//button[contains(text(), '13')]");
    By locatorMarcarDiaIda10 = By.xpath("//button[contains(text(), '8')]");
    By locatorFechaVuelta = By.xpath("//label[contains(text(), 'Fecha de vuelta')]");
    By locatorPasajero = By.xpath("//div[@class='d-1rd1g4p']");
    By locatorAgregarNinio = By.xpath("//button[@class='d-1ch1522']");
    By locatorEdadNinno = By.xpath("//li[contains(text(), '4 años')]");
    By locatorBtnBuscar = By.xpath("//button[@aria-label='Buscar']");

    //https://res.cloudinary.com/lastminute-contenthub/i…s/Europe/Spain/Sevilla/shutterstock_108544976.jpg
    By locatorOfertaSevillaMadrid = By.xpath("//img[@alt='Madrid - Sevilla']");

    //https://res.cloudinary.com/lastminute-contenthub/c…ons/Europe/Spain/Barcelona/shutterstock_165497819
    By locatorOfertaTrenHotelBarcelonaMadrid = By.xpath("//img[@alt='Tren + Hotel a Madrid']");

    By locatorObtenerMensajeSinDispo = By.xpath("//span[contains(text(), 'No hemos encontrado ninguna')]");
    By locatorSinDisponibilidad = By.xpath("//div[contains(text(), 'No hemos encontrado ningún')]");

    By locatorOfertaMadridBarcelona = By.xpath("//img[@alt='Madrid - Barcelona']");
    public void soloIda(){
        click(findElement(locatorSoloIda));
    }

    public void idaYVuelta(){
        click(findElement(locatorIdaYVuelta));
    }
    public void escribirOrigen (String origen) throws InterruptedException{
        click(locatorLugarOrigen);
        write(origen, locatorLugarOrigen);
        Thread.sleep(3000);
        click(locatorSeleccionaCiudad);
    }

    public void escribirDestino (String destino) throws InterruptedException{
        Thread.sleep(2000);
        write(destino, locatorLugarDestino);
        Thread.sleep(2000);
        click(locatorSeleccionaCiudad);
    }

    public void marcarDestino() throws InterruptedException{
        Thread.sleep(3000);
        findElement(locatorSeleccionaCiudad2);
        click(locatorSeleccionaCiudad2);
    }

    public void fechaIda() throws InterruptedException{
        Thread.sleep(3000);
        List < WebElement> dia15 = findElements(locatorMarcarDiaIda15);
        click(dia15.get(0));

    }

    public void marcarDia() throws InterruptedException{
        Thread.sleep(3000);
        List < WebElement> dia15 = findElements(locatorMarcarDiaIda15);
        click(dia15.get(0));

    }
    public void fechasIdaYVuelta15al25() throws InterruptedException{
        click(findElement(locatorFechaIda));
        Thread.sleep(3000);
        List < WebElement> dia15 = findElements(locatorMarcarDiaIda15);
        click(dia15.get(0));
        List < WebElement> dia25 = findElements(locatorMarcarDiaVuelta25);
        click(dia25.get(0));
    }

    public void fechasIdaYVuelta15al22() throws InterruptedException{
        Thread.sleep(3000);
        List < WebElement> dia15 = findElements(locatorMarcarDiaIda15);
        click(dia15.get(0));
        List < WebElement> dia22 = findElements(locatorMarcarDiaVuelta22);
        click(dia22.get(0));
    }

    public void marcarPasajeroYAgregarNinnio(){
        click(findElement(locatorPasajero));
        click(findElement(locatorAgregarNinio));
        click(findElement(locatorEdadNinno));
    }

    public void clickEnBuscar(){
        click(findElement(locatorBtnBuscar));
    }

    public void ofertaMadridSevilla(){
        click(findElement(locatorOfertaSevillaMadrid));
    }
    public void ofertaTrenHotelMadridBarcelona(){
        click(findElement(locatorOfertaTrenHotelBarcelonaMadrid));
    }

    public void sendKeys(Keys key){
        sendKeys(key, locatorFechaIda);
    }

    public String obtenerMensajeSinDispo(){
        return getText(locatorObtenerMensajeSinDispo);
    }

    public void bajarAOfertas(){
        scrolling(findElement(locatorOfertaSevillaMadrid));
    }

    public String sinDisponibilidad(){
        return getText(locatorSinDisponibilidad);
    }
    public void ofertaMadridBarcelona(){
        click(findElement(locatorOfertaMadridBarcelona));
    }
    public void fechasIdaYVuelta08al13() throws InterruptedException{
        Thread.sleep(3000);
        List < WebElement> dia10 = findElements(locatorMarcarDiaIda10);
        click(dia10.get(0));
        List < WebElement> dia13 = findElements(locatorMarcarDiaVuelta13);
        click(dia13.get(0));
    }
}
