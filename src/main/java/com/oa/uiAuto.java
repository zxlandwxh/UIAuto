package com.oa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Set;

public class uiAuto {

    public static void simpleTest() throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "D:\\Study\\ao_approval_auto\\src\\main\\resources\\driver\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        //url
        driver.get("");
        //login
        utils utils = new utils();
        utils.waitFindEleByid(driver, "uesrcode").clear();
        driver.findElement(By.id("usercode")).sendKeys("0568");
        utils.waitFindEleByid(driver, "password").clear();
        driver.findElement(By.id("password")).sendKeys("741203");
        driver.findElement(By.id("btnSubmit")).click();

        //固定资产管理
        utils.waitFindEleByxpath(driver, "//*[@id=\"MENUL1_0000000218\"]/a").click();
        utils.waitFindEleByxpath(driver, "//*[@id=\"u0000000218\"]/li[1]/a/span").click();

        //新建到货验证单
        utils.waitFindEleByxpath(driver, "//*[@id=\"btnAdd2\"]/span/span").click();
        driver.wait(8000);
        Set<String> Allhandles = driver.getWindowHandles();
        ArrayList<String> lst = new ArrayList<String>(Allhandles);
        String handle = lst.get(lst.size() - 1);
        //切换新窗口
        driver.switchTo().window(handle);
        //1.基本信息
        //供货单位
        driver.findElement(By.id("OBJECT_NAME")).sendKeys("");
        //合同号
        driver.findElement(By.id("CONTRACT_ID")).sendKeys("");
        //到货日期
        driver.findElement(By.id("REAL_COME_DATE")).sendKeys("");
        //购入方式
        driver.findElement(By.id("GET_MODE")).sendKeys("");
        //使用科室
        driver.findElement(By.id("DEPT_NAME")).sendKeys("");
        // 发票号码
        driver.findElement(By.id("INVOICE_NO")).sendKeys("");
        //发票日期
        driver.findElement(By.id("INVOICE_DATE")).sendKeys("");
        //用途
        Select WHERE_USED = new Select(driver.findElement(By.id("WHERE_USED")));
        WHERE_USED.selectByValue("");
        //招标项目
        driver.findElement(By.id("BID_PROJECT_NAME")).sendKeys("");
        //产地类型
        Select MADEIN_TYPE = new Select(driver.findElement(By.id("MADEIN_TYPE")));
        MADEIN_TYPE.selectByValue("");
        //放置区域
        driver.findElement(By.id("PUT_AREA_NAME")).sendKeys("");
        driver.findElement(By.id("")).sendKeys("");

        //2.设备信息
        //物资名称
        driver.findElement(By.id("PRODUCT_NAME")).sendKeys("");
        //单位
        driver.findElement(By.id("MIN_UNIT")).sendKeys("");
        //数量
        utils.clearAndSendKeys(driver, "QUANTITY", "");
        //价格
        driver.findElement(By.id("PRICE")).sendKeys("");
        //金额
        driver.findElement(By.id("AMOUNT")).sendKeys("");
        //生产厂家
        driver.findElement(By.id("PRODUCE_NAME")).sendKeys("");
        //生产厂家增加
        driver.findElement(By.id("")).sendKeys("");
        //产地
        driver.findElement(By.id("PLACE_NAME")).sendKeys("");
        //品牌
        driver.findElement(By.id("BRAND_NAME")).sendKeys("");
        //字典核算科目
        driver.findElement(By.id("ACC_NAME")).sendKeys("");
        //规格型号
        driver.findElement(By.id("SPEC_NAME")).sendKeys("");
        //注册证号
        driver.findElement(By.id("REG_CERT_NO")).sendKeys("");
        //中文标示
        utils.checkBox(driver, "NCHINESE_FLAG", "");
        //预算编号
        driver.findElement(By.id("BUDGET_NO")).sendKeys("");
        //预算项目名称
        driver.findElement(By.id("BUDGET_ITEM_NAME")).sendKeys("");
        //设备分类
        driver.findElement(By.id("DEVICE_CLASS")).sendKeys("");
        //UDI编码
        driver.findElement(By.id("UDI_CODE")).sendKeys("");
        //其他内容
        driver.findElement(By.id("OTHERS")).sendKeys("");
        //科研设备
        Select KY_DEVICE = new Select(driver.findElement(By.id("KY_DEVICE")));
        KY_DEVICE.selectByValue("");


    }

}
