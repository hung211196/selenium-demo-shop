package Checkout;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CheckUrlRole_Live {
    WebDriver driver;

    @BeforeClass
    public void beforeClass() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void TC_01_Url_Key_S1V1() {
        List<String> Url = new ArrayList<>();
        Url.add("electrolyte-powder-packets                    ");
        Url.add("keto-energy-regular                           ");
        Url.add("ketofast-unsweetened-tea                      ");
        Url.add("lumbar-support                                ");
        Url.add("keto-essential-aminos                         ");
        Url.add("keto-dessert-peanut-butter                    ");
        Url.add("mct-oil                                       ");
        Url.add("electrolyte-sports-drink-raspberry-lemon      ");
        Url.add("digest-formula-extra-strength                 ");
        Url.add("gallbladder-support-vegan-formula             ");
        Url.add("hair-formula                                  ");
        Url.add("sinus-and-lung-support-formula                ");
        Url.add("clean-lather-shampoo                          ");
        Url.add("bacti-cleanse                                 ");
        Url.add("impeccable-face-cream                         ");
        Url.add("clear-skin                                    ");
        Url.add("aromatherapy-sleep-lotion                     ");
        Url.add("turmeric-latte-golden-milk-with-ashwagandha   ");
        Url.add("magnesium-glycinate-90-capsules               ");
        Url.add("magnesium-oil-spray                           ");
        Url.add("vitamin-c-serum-with-probiotic                ");
        for (String url : Url) {
            driver.get("https://shop.drberg.com/" + url);
            sleepInSeconds(3);
//            if (driver.findElement(By.xpath("//a[text() = 'Home']")).isDisplayed())
//            {
//                System.out.println("SP success:" + Url);
//            } else {
//                System.out.println("SP error:" + Url);
//            }
        }
    }

    @Test
    public void TC_02_Url_Key_S1V4() {
        List<String> Url = new ArrayList<>();
        Url.add("dr-bergs-healthy-fat-burning-recipes-digital-ebook");
        Url.add("organic-greens-superfood-250-count             ");
        Url.add("gallbladder-formula                            ");
        Url.add("trace-minerals                                 ");
        Url.add("raw-wheat-grass-juice-powder                   ");
        Url.add("massage-tool                                   ");
        Url.add("dr-bergs-keto-if-membership                    ");
        Url.add("adrenal-stress-advanced-formula                ");
        Url.add("digestive-kit                                  ");
        Url.add("raw-wheat-grass-juice-powder-lemon-regular     ");
        Url.add("estrogen-balance-with-dim                      ");
        Url.add("advanced-digestive-formula                     ");
        Url.add("shaker-bottle                                  ");
        Url.add("electrolyte-powder                             ");
        Url.add("blood-sugar-support                            ");
        Url.add("sleep-aid-vegan                                ");
        Url.add("sleep-aid                                      ");
        Url.add("the-healthy-keto-plan                          ");
        Url.add("nutritional-yeast-regular                      ");
        Url.add("ketogenic-meal-plans                           ");
        Url.add("drberg-book-on-video                           ");
        Url.add("drbergs-get-healthy-booklet                    ");
        Url.add("ketogenic-desserts-yummies-digital-ebook       ");
        Url.add("keto-coach                                     ");
        Url.add("friendly-bacteria-probiotic                    ");
        Url.add("keto-fasting-tea-ketofast-sweetened-tea        ");
        Url.add("veggie-solution-flavored-sweetened             ");
        Url.add("electrolyte-orange                             ");
        Url.add("vitamin-c-complex                              ");
        Url.add("immune-booster-kit                             ");
        Url.add("adrenal-body-type-pack                         ");
        Url.add("daily-immunity-kit                             ");
        Url.add("keto-combo                                     ");
        Url.add("thyroid-body-type-package                      ");
        Url.add("bundle-adrenal-kit                             ");
        Url.add("stress-kit                                     ");
        Url.add("ketokit                                        ");
        Url.add("ovary-body-type-package                        ");
        Url.add("liver-body-type-kit                            ");
        Url.add("advanced-immune-support                        ");
        Url.add("cod-liver-oil                                  ");
        Url.add("electrolyte-powder-lemonade-extra              ");
        Url.add("summit-2020-digital-recording                  ");
        Url.add("electrolyte-powder-raspberry-lemon-100-servings");
        Url.add("electrolyte-bundle                             ");
        Url.add("electrolyte-90-servings-bundle                 ");
        Url.add("comprehensive-bundle                           ");
        Url.add("electrolyte-powder-lemonade-50-servings        ");
        Url.add("sea-kelp-enhanced                              ");
        Url.add("hair-formula-capsules                          ");
        Url.add("organic-greens-superfood-90-count              ");
        Url.add("scalp-and-hair-follicle-serum                  ");
        Url.add("adrenal-glandular-formula                      ");
        Url.add("electrolyte-powder-cherry-pomegranate          ");
        Url.add("electrolyte-powder-tangerine                   ");
        Url.add("clean-shine-conditioner                        ");
        Url.add("clean-shine-conditioner-clean-lather-shampoo   ");
        Url.add("magnesium-glycinate-150-capsules               ");
        Url.add("electrolyte-variety-pack                       ");
        Url.add("d3-k2-vitamin-regular                          ");
        Url.add("natural-vitamin-b1                             ");
        Url.add("nutritional-yeast-flakes                       ");
        Url.add("electrolyte-capsules                           ");
        Url.add("joint-muscle-therapy-cream-with-arnica-and-msm ");
        Url.add("d3-k2-vitamin-5-000-iu                         ");
        Url.add("nerve-support-with-benfotiamine                ");
        Url.add("2-week-keto-meal-plan                          ");
        Url.add("ashwagandha-with-black-pepper                  ");
        Url.add("baja-gold-sea-salt                             ");
        Url.add("turmeric-curcumin-with-bioperine               ");
        Url.add("potassium-iodide                               ");
        Url.add("liver-cleanse-detox-repair-support             ");
        Url.add("vitamin-d3-k2-with-zinc-mct-oil                ");
        Url.add("60-billion-probiotic                           ");
        Url.add("electrolyte-powder-grape                       ");
        Url.add("electrolyte-powder-strawberry-lemonade         ");
        Url.add("adrenal-cortisol-support                       ");
        Url.add("kids-chewable-multivitamin                     ");
        Url.add("biotin-shampoo                                 ");
        Url.add("turmeric-ginger-tea                            ");
        Url.add("sports-hydration-electrolytes                  ");
        Url.add("natural-prenatal-multivitamin                  ");
        Url.add("whole-food-multivitamin-with-minerals          ");
        Url.add("emergency-immune-support                       ");
        for (String url : Url) {
            driver.get("https://shop.drberg.com/" + url);
            sleepInSeconds(5);
//            if (driver.findElement(By.xpath("//a[text() = 'Home']")).isDisplayed())
//            {
//                System.out.println("SP success:" + Url);
//            } else {
//                System.out.println("SP error:" + Url);
//            }
        }
    }

    @Test
    public void TC_03_Url_Key_S2V4() {
        List<String> Url = new ArrayList<>();
        Url.add("drbergs-healthy-fat-burning-recipes       ");
        Url.add("quickstart-program-online-access          ");
        Url.add("health-coaching-monthly-tools-access      ");
        Url.add("adrenal-kit-regular-deprecated            ");
        Url.add("meal-maker                                ");
        Url.add("meal-maker-program                        ");
        Url.add("quiz-maker                                ");
        Url.add("how-to-burn-fat-booklet                   ");
        Url.add("meal-replacement-shake-with-mcts          ");
        Url.add("joint-support                             ");
        Url.add("d3-k2-vitamin-regular1                    ");
        Url.add("electrolyte-powder-packets                ");
        Url.add("unlimited-recipes                         ");
        Url.add("keto-summit-2018                          ");
        Url.add("keto-combo-regular-deprecated             ");
        Url.add("keto-health-summit-2018                   ");
        Url.add("wheatgrass-juice-powder-packets-lemon     ");
        Url.add("keto-energy-regular                       ");
        Url.add("ketofast-unsweetened-tea                  ");
        Url.add("keto-fasting-tea-old                      ");
        Url.add("keto-summit-2019                          ");
        Url.add("veggie-solution-plain                     ");
        Url.add("lumbar-support                            ");
        Url.add("keto-essential-aminos                     ");
        Url.add("keto-dessert-peanut-butter                ");
        Url.add("keto-dessert-pecan-pie                    ");
        Url.add("keto-health-summit-2019                   ");
        Url.add("keto-strips                               ");
        Url.add("dessert-bundle                            ");
        Url.add("mct-oil                                   ");
        Url.add("electrolyte-sports-drink-raspberry-lemon  ");
        Url.add("ketokit-1                                 ");
        Url.add("digest-formula-extra-strength             ");
        Url.add("gallbladder-support-vegan-formula         ");
        Url.add("liquid-vitamin-d-with-zinc                ");
        Url.add("hair-formula                              ");
        Url.add("sinus-and-lung-support-formula            ");
        Url.add("clean-lather-shampoo                      ");
        Url.add("bacti-cleanse                             ");
        Url.add("impeccable-face-cream                     ");
        Url.add("clear-skin                                ");
        Url.add("aromatherapy-sleep-lotion                 ");
        Url.add("turmeric-latte-golden-milk-with-ashwagandha");
        Url.add("magnesium-glycinate-90-capsules           ");
        Url.add("magnesium-oil-spray                       ");
        Url.add("vitamin-c-serum-with-probiotics           ");
        for (String url : Url) {
            driver.get("https://shop.drberg.com/" + url);
            sleepInSeconds(3);
//            if (driver.findElement(By.xpath("//a[text() = 'Home']")).isDisplayed())
//            {
//                System.out.println("SP success:" + Url);
//            } else {
//                System.out.println("SP error:" + Url);
//            }
        }
    }

    @Test
    public void TC_04_Url_Key_S2V1() {
        List<String> Url = new ArrayList<>();
        Url.add("icelandic-sea-kelp                                 ");
        Url.add("adrenal-body-type-kit-abk001-deprecated            ");
        Url.add("thyroid-body-type-package-deprecated               ");
        Url.add("ovary-body-type-package-deprecated                 ");
        Url.add("liver-body-type-kit-deprecated                     ");
        Url.add("health-coaches-and-quick-start-health-coach-package");
        Url.add("stress-kit-deprecated                              ");
        Url.add("dr-berg-s-technique-health-system                  ");
        Url.add("adrenal-cortisol-reg                               ");
        Url.add("dr-berg-s-new-body-type-guide-ws-12-pack-min-12-books");
        Url.add("keto-kit-deprecated                                ");
        Url.add("wheatgrass-juice-powder-packets-regular            ");
        Url.add("keto-fasting-tea-ketofast-sweetened-tea-1          ");
        Url.add("keto-on-the-go                                     ");
        Url.add("keto-kit-bundle                                    ");
        Url.add("body-type-quiz-special-offer                       ");
        Url.add("keto-shake                                         ");
        Url.add("electrolyte-powder-configurable                    ");
        Url.add("keto-energy                                        ");
        Url.add("impeccable-face-bundle                             ");
        for (String url : Url) {
            driver.get("https://shop.drberg.com/" + url);
            sleepInSeconds(5);
//            if (driver.findElement(By.xpath("//a[text() = 'Home']")).isDisplayed())
//            {
//                System.out.println("SP success:" + Url);
//            } else {
//                System.out.println("SP error:" + Url);
//            }
        }
    }

    @Test
    public void TC_05_Url_Key_S1V1_ID() {
        List<String> Url = new ArrayList<>();
        Url.add("255");
        Url.add("352");
        Url.add("371");
        Url.add("372");
        Url.add("375");
        Url.add("376");
        Url.add("377");
        Url.add("378");
        Url.add("379");
        Url.add("381");
        Url.add("382");
        Url.add("394");
        Url.add("410");
        Url.add("411");
        Url.add("443");
        Url.add("444");
        Url.add("445");
        Url.add("451");
        Url.add("459");
        Url.add("533");
        Url.add("541");
        Url.add("543");
        Url.add("544");
        for (String url : Url) {
            driver.get("https://shop.drberg.com/catalog/product/view/id/" + url);
            sleepInSeconds(5);
        }
    }

    @Test
    public void TC_06_Url_Key_S1V4_ID() {
        List<String> Url = new ArrayList<>();
        Url.add("17");
        Url.add("21");
        Url.add("31");
        Url.add("34");
        Url.add("37");
        Url.add("49");
        Url.add("198");
        Url.add("201");
        Url.add("217");
        Url.add("223");
        Url.add("243");
        Url.add("247");
        Url.add("249");
        Url.add("260");
        Url.add("276");
        Url.add("280");
        Url.add("284");
        Url.add("292");
        Url.add("295");
        Url.add("304");
        Url.add("305");
        Url.add("307");
        Url.add("308");
        Url.add("309");
        Url.add("340");
        Url.add("344");
        Url.add("349");
        Url.add("353");
        Url.add("399");
        Url.add("407");
        Url.add("409");
        Url.add("414");
        Url.add("416");
        Url.add("417");
        Url.add("418");
        Url.add("419");
        Url.add("420");
        Url.add("424");
        Url.add("425");
        Url.add("428");
        Url.add("429");
        Url.add("430");
        Url.add("431");
        Url.add("438");
        Url.add("440");
        Url.add("441");
        Url.add("442");
        Url.add("446");
        Url.add("448");
        Url.add("467");
        Url.add("484");
        Url.add("489");
        Url.add("490");
        Url.add("492");
        Url.add("493");
        Url.add("495");
        Url.add("496");
        Url.add("498");
        Url.add("501");
        Url.add("509");
        Url.add("510");
        Url.add("516");
        Url.add("517");
        Url.add("518");
        Url.add("519");
        Url.add("520");
        Url.add("522");
        Url.add("523");
        Url.add("524");
        Url.add("527");
        Url.add("528");
        Url.add("529");
        Url.add("534");
        Url.add("535");
        Url.add("536");
        Url.add("537");
        Url.add("542");
        Url.add("545");
        Url.add("546");
        Url.add("548");
        Url.add("551");
        Url.add("553");
        Url.add("554");
        Url.add("555");
        for (String url : Url) {
            driver.get("https://shop.drberg.com/catalog/product/view/id/" + url);
            sleepInSeconds(3);
//            if (driver.findElement(By.xpath("//a[text() = 'Home']")).isDisplayed())
//            {
//                System.out.println("SP success:" + Url);
//            } else {
//                System.out.println("SP error:" + Url);
//            }
        }
    }

    @Test
    public void TC_07_Url_Key_S2V1_ID() {
        List<String> Url = new ArrayList<>();
        Url.add("42");
        Url.add("51");
        Url.add("52");
        Url.add("53");
        Url.add("54");
        Url.add("105");
        Url.add("181");
        Url.add("220");
        Url.add("264");
        Url.add("294");
        Url.add("299");
        Url.add("341");
        Url.add("347");
        Url.add("380");
        Url.add("384");
        Url.add("436");
        Url.add("466");
        Url.add("473");
        Url.add("483");
        Url.add("508");
        for (String url : Url) {
            driver.get("https://shop.drberg.com/catalog/product/view/id/" + url);
            sleepInSeconds(5);
//            if (driver.findElement(By.xpath("//a[text() = 'Home']")).isDisplayed())
//            {
//                System.out.println("SP success:" + Url);
//            } else {
//                System.out.println("SP error:" + Url);
//            }
        }
    }

    @Test
    public void TC_08_Url_Key_S2V4_ID() {
        List<String> Url = new ArrayList<>();
        Url.add("18");
        Url.add("46");
        Url.add("106");
        Url.add("152");
        Url.add("180");
        Url.add("210");
        Url.add("219");
        Url.add("222");
        Url.add("250");
        Url.add("251");
        Url.add("268");
        Url.add("272");
        Url.add("300");
        Url.add("310");
        Url.add("335");
        Url.add("338");
        Url.add("339");
        Url.add("342");
        Url.add("343");
        Url.add("345");
        Url.add("346");
        Url.add("348");
        Url.add("350");
        Url.add("351");
        Url.add("354");
        Url.add("355");
        Url.add("356");
        Url.add("357");
        Url.add("358");
        Url.add("383");
        Url.add("405");
        Url.add("412");
        Url.add("437");
        Url.add("447");
        Url.add("460");
        Url.add("461");
        Url.add("465");
        Url.add("491");
        Url.add("494");
        Url.add("497");
        Url.add("500");
        Url.add("506");
        Url.add("511");
        Url.add("515");
        Url.add("525");
        Url.add("526");
        Url.add("538");
        for (String url : Url) {
            driver.get("https://shop.drberg.com/catalog/product/view/id/" + url);
            sleepInSeconds(5);
//            if (driver.findElement(By.xpath("//a[text() = 'Home']")).isDisplayed())
//            {
//                System.out.println("SP success:" + Url);
//            } else {
//                System.out.println("SP error:" + Url);
//            }
        }
    }
    @Test
    public void TC_111_Url_Key_S2V4_ID() {
        List<String> Url = new ArrayList<>();
        Url.add("264");
        Url.add("466");

        for (String url : Url) {
            driver.get("https://shop.drberg.com/catalog/product/view/id/" + url);
            sleepInSeconds(3);
//            if (driver.findElement(By.xpath("//a[text() = 'Home']")).isDisplayed())
//            {
//                System.out.println("SP success:" + Url);
//            } else {
//                System.out.println("SP error:" + Url);
//            }
        }
    }
    @Test
    public void TC_09_Category_books() {
        List<String> Url = new ArrayList<>();
        Url.add("dr-bergs-healthy-fat-burning-recipes-digital-ebook");
        Url.add("the-healthy-keto-plan                      ");
        Url.add("ketogenic-meal-plans                       ");
        Url.add("drbergs-get-healthy-booklet                ");
        Url.add("ketogenic-desserts-yummies-digital-ebook   ");
        Url.add("2-week-keto-meal-plan                      ");
        for (String url : Url) {
            driver.get("https://shop.drberg.com/books/" + url);
            sleepInSeconds(5);
//            if (driver.findElement(By.xpath("//a[text() = 'Home']")).isDisplayed())
//            {
//                System.out.println("SP success:" + Url);
//            } else {
//                System.out.println("SP error:" + Url);
//            }
        }
    }
    @Test
    public void TC_09_Category_devices() {
        List<String> Url = new ArrayList<>();
        Url.add("massage-tool");
        Url.add("shaker-bottle");
        for (String url : Url) {
            driver.get("https://shop.drberg.com/devices/" + url);
            sleepInSeconds(3);
//            if (driver.findElement(By.xpath("//a[text() = 'Home']")).isDisplayed())
//            {
//                System.out.println("SP success:" + Url);
//            } else {
//                System.out.println("SP error:" + Url);
//            }
        }
    }
    @Test
    public void TC_09_Category_digital_programs() {
        List<String> Url = new ArrayList<>();
        Url.add("dr-bergs-keto-if-membership");
        Url.add("drberg-book-on-video");
        Url.add("keto-coach");
        Url.add("summit-2020-digital-recording");
        for (String url : Url) {
            driver.get("https://shop.drberg.com/digital-programs/" + url);
            sleepInSeconds(3);
//            if (driver.findElement(By.xpath("//a[text() = 'Home']")).isDisplayed())
//            {
//                System.out.println("SP success:" + Url);
//            } else {
//                System.out.println("SP error:" + Url);
//            }
        }
    }
    @Test
    public void TC_09_Category_powders() {
        List<String> Url = new ArrayList<>();
        Url.add("raw-wheat-grass-juice-powder                  ");
        Url.add("raw-wheat-grass-juice-powder-lemon-regular    ");
        Url.add("electrolyte-powder                            ");
        Url.add("veggie-solution-flavored-sweetened            ");
        Url.add("electrolyte-orange                            ");
        Url.add("electrolyte-powder-lemonade-extra             ");
        Url.add("electrolyte-powder-raspberry-lemon-100-servings");
        Url.add("electrolyte-powder-lemonade-50-servings       ");
        Url.add("electrolyte-powder-cherry-pomegranate         ");
        Url.add("electrolyte-powder-tangerine                  ");
        Url.add("electrolyte-variety-pack                      ");
        Url.add("electrolyte-powder-grape                      ");
        Url.add("electrolyte-powder-strawberry-lemonade        ");
        Url.add("sports-hydration-electrolytes                 ");
        for (String url : Url) {
            driver.get("https://shop.drberg.com/powders/" + url);
            sleepInSeconds(3);
//            if (driver.findElement(By.xpath("//a[text() = 'Home']")).isDisplayed())
//            {
//                System.out.println("SP success:" + Url);
//            } else {
//                System.out.println("SP error:" + Url);
//            }
        }
    }
    @Test
    public void TC_09_Category_supplements() {
        List<String> Url = new ArrayList<>();
        Url.add("organic-greens-superfood-250-count            ");
        Url.add("gallbladder-formula                           ");
        Url.add("trace-minerals                                ");
        Url.add("raw-wheat-grass-juice-powder                  ");
        Url.add("adrenal-stress-advanced-formula               ");
        Url.add("raw-wheat-grass-juice-powder-lemon-regular    ");
        Url.add("estrogen-balance-with-dim                     ");
        Url.add("advanced-digestive-formula                    ");
        Url.add("electrolyte-powder                            ");
        Url.add("blood-sugar-support                           ");
        Url.add("sleep-aid-vegan                               ");
        Url.add("sleep-aid                                     ");
        Url.add("nutritional-yeast-regular                     ");
        Url.add("friendly-bacteria-probiotic                   ");
        Url.add("veggie-solution-flavored-sweetened            ");
        Url.add("electrolyte-orange                            ");
        Url.add("vitamin-c-complex                             ");
        Url.add("advanced-immune-support                       ");
        Url.add("cod-liver-oil                                 ");
        Url.add("electrolyte-powder-lemonade-extra             ");
        Url.add("electrolyte-powder-raspberry-lemon-100-servings");
        Url.add("electrolyte-powder-lemonade-50-servings       ");
        Url.add("sea-kelp-enhanced                             ");
        Url.add("hair-formula-capsules                         ");
        Url.add("organic-greens-superfood-90-count             ");
        Url.add("adrenal-glandular-formula                     ");
        Url.add("electrolyte-powder-cherry-pomegranate         ");
        Url.add("electrolyte-powder-tangerine                  ");
        Url.add("magnesium-glycinate-150-capsules              ");
        Url.add("electrolyte-variety-pack                      ");
        Url.add("d3-k2-vitamin-regular                         ");
        Url.add("natural-vitamin-b1                            ");
        Url.add("electrolyte-capsules                          ");
        Url.add("d3-k2-vitamin-5-000-iu                        ");
        Url.add("nerve-support-with-benfotiamine               ");
        Url.add("ashwagandha-with-black-pepper                 ");
        Url.add("turmeric-curcumin-with-bioperine              ");
        Url.add("potassium-iodide                              ");
        Url.add("liver-cleanse-detox-repair-support            ");
        Url.add("vitamin-d3-k2-with-zinc-mct-oil               ");
        Url.add("60-billion-probiotic                          ");
        Url.add("electrolyte-powder-grape                      ");
        Url.add("electrolyte-powder-strawberry-lemonade        ");
        Url.add("adrenal-cortisol-support                      ");
        Url.add("kids-chewable-multivitamin                    ");
        Url.add("sports-hydration-electrolytes                 ");
        Url.add("natural-prenatal-multivitamin                 ");
        Url.add("whole-food-multivitamin-with-minerals         ");
        Url.add("emergency-immune-support                      ");
        for (String url : Url) {
            driver.get("https://shop.drberg.com/supplements/" + url);
            sleepInSeconds(3);
//            if (driver.findElement(By.xpath("//a[text() = 'Home']")).isDisplayed())
//            {
//                System.out.println("SP success:" + Url);
//            } else {
//                System.out.println("SP error:" + Url);
//            }
        }
    }
    @Test
    public void TC_09_Category_immune() {
        List<String> Url = new ArrayList<>();
        Url.add("vitamin-c-complex");
        Url.add("immune-booster-kit");
        Url.add("daily-immunity-kit");
        Url.add("advanced-immune-support");
        Url.add("d3-k2-vitamin-regular");
        Url.add("d3-k2-vitamin-5-000-iu");
        for (String url : Url) {
            driver.get("https://shop.drberg.com/immune/" + url);
            sleepInSeconds(3);
//            if (driver.findElement(By.xpath("//a[text() = 'Home']")).isDisplayed())
//            {
//                System.out.println("SP success:" + Url);
//            } else {
//                System.out.println("SP error:" + Url);
//            }
        }
    }
    @Test
    public void TC_09_Category_all_products() {
        List<String> Url = new ArrayList<>();
        Url.add("keto-fasting-tea-ketofast-sweetened-tea");
        Url.add("nutritional-yeast-flakes");
        Url.add("joint-muscle-therapy-cream-with-arnica-and-msm");
        Url.add("baja-gold-sea-salt");
        Url.add("turmeric-ginger-tea");
        for (String url : Url) {
            driver.get("https://shop.drberg.com/all-products/" + url);
            sleepInSeconds(3);
//            if (driver.findElement(By.xpath("//a[text() = 'Home']")).isDisplayed())
//            {
//                System.out.println("SP success:" + Url);
//            } else {
//                System.out.println("SP error:" + Url);
//            }
        }
    }
    @Test
    public void TC_09_Category_beauty() {
        List<String> Url = new ArrayList<>();
        Url.add("hair-formula-capsules                      ");
        Url.add("scalp-and-hair-follicle-serum              ");
        Url.add("clean-shine-conditioner                    ");
        Url.add("clean-shine-conditioner-clean-lather-shampoo");
        Url.add("biotin-shampoo                             ");
        for (String url : Url) {
            driver.get("https://shop.drberg.com/beauty/" + url);
            sleepInSeconds(3);
//            if (driver.findElement(By.xpath("//a[text() = 'Home']")).isDisplayed())
//            {
//                System.out.println("SP success:" + Url);
//            } else {
//                System.out.println("SP error:" + Url);
//            }
        }
    }
    @Test
    public void TC_09_Category_bundles() {
        List<String> Url = new ArrayList<>();
        Url.add("digestive-kit                              ");
        Url.add("immune-booster-kit                         ");
        Url.add("adrenal-body-type-pack                     ");
        Url.add("daily-immunity-kit                         ");
        Url.add("keto-combo                                 ");
        Url.add("thyroid-body-type-package                  ");
        Url.add("bundle-adrenal-kit                         ");
        Url.add("stress-kit                                 ");
        Url.add("ketokit                                    ");
        Url.add("ovary-body-type-package                    ");
        Url.add("liver-body-type-kit                        ");
        Url.add("electrolyte-bundle                         ");
        Url.add("electrolyte-90-servings-bundle             ");
        Url.add("comprehensive-bundle                       ");
        Url.add("clean-shine-conditioner-clean-lather-shampoo");
        for (String url : Url) {
            driver.get("https://shop.drberg.com/bundles/" + url);
            sleepInSeconds(3);
//            if (driver.findElement(By.xpath("//a[text() = 'Home']")).isDisplayed())
//            {
//                System.out.println("SP success:" + Url);
//            } else {
//                System.out.println("SP error:" + Url);
//            }
        }
    }
    @Test
    public void TC_10_product_id_Category_books() {
        List<String> Url = new ArrayList<>();
        Url.add("17");
        Url.add("292");
        Url.add("304");
        Url.add("307");
        Url.add("308");
        Url.add("522");
        for (String url : Url) {
            driver.get("https://shop.drberg.com/catalog/product/view/id/" + url +"/category/3");
            sleepInSeconds(3);
//            if (driver.findElement(By.xpath("//a[text() = 'Home']")).isDisplayed())
//            {
//                System.out.println("SP success:" + Url);
//            } else {
//                System.out.println("SP error:" + Url);
//            }
        }
    }
    @Test
    public void TC_10_product_id_Category_devices() {
        List<String> Url = new ArrayList<>();
        Url.add("49");
        Url.add("249");
        for (String url : Url) {
            driver.get("https://shop.drberg.com/catalog/product/view/id/" + url +"/category/4");
            sleepInSeconds(3);
//            if (driver.findElement(By.xpath("//a[text() = 'Home']")).isDisplayed())
//            {
//                System.out.println("SP success:" + Url);
//            } else {
//                System.out.println("SP error:" + Url);
//            }
        }
    }
    @Test
    public void TC_10_product_id_Category_digital_programs() {
        List<String> Url = new ArrayList<>();
        Url.add("198");
        Url.add("305");
        Url.add("309");
        Url.add("431");
        for (String url : Url) {
            driver.get("https://shop.drberg.com/catalog/product/view/id/" + url +"/category/5");
            sleepInSeconds(3);
//            if (driver.findElement(By.xpath("//a[text() = 'Home']")).isDisplayed())
//            {
//                System.out.println("SP success:" + Url);
//            } else {
//                System.out.println("SP error:" + Url);
//            }
        }
    }
    @Test
    public void TC_10_product_id_Category_powders() {
        List<String> Url = new ArrayList<>();
        Url.add("37");
        Url.add("223");
        Url.add("260");
        Url.add("349");
        Url.add("353");
        Url.add("430");
        Url.add("438");
        Url.add("446");
        Url.add("492");
        Url.add("493");
        Url.add("501");
        Url.add("536");
        Url.add("537");
        Url.add("551");
        for (String url : Url) {
            driver.get("https://shop.drberg.com/catalog/product/view/id/" + url +"/category/6");
            sleepInSeconds(3);
//            if (driver.findElement(By.xpath("//a[text() = 'Home']")).isDisplayed())
//            {
//                System.out.println("SP success:" + Url);
//            } else {
//                System.out.println("SP error:" + Url);
//            }
        }
    }
    @Test
    public void TC_10_product_id_Category_supplements() {
        List<String> Url = new ArrayList<>();
        Url.add("21");
        Url.add("31");
        Url.add("34");
        Url.add("37");
        Url.add("201");
        Url.add("223");
        Url.add("243");
        Url.add("247");
        Url.add("260");
        Url.add("276");
        Url.add("280");
        Url.add("284");
        Url.add("295");
        Url.add("340");
        Url.add("349");
        Url.add("353");
        Url.add("399");
        Url.add("428");
        Url.add("429");
        Url.add("430");
        Url.add("438");
        Url.add("446");
        Url.add("448");
        Url.add("467");
        Url.add("484");
        Url.add("490");
        Url.add("492");
        Url.add("493");
        Url.add("498");
        Url.add("501");
        Url.add("509");
        Url.add("510");
        Url.add("517");
        Url.add("519");
        Url.add("520");
        Url.add("523");
        Url.add("527");
        Url.add("528");
        Url.add("529");
        Url.add("534");
        Url.add("535");
        Url.add("536");
        Url.add("537");
        Url.add("542");
        Url.add("545");
        Url.add("551");
        Url.add("553");
        Url.add("554");
        Url.add("555");
        for (String url : Url) {
            driver.get("https://shop.drberg.com/catalog/product/view/id/" + url +"/category/7");
            sleepInSeconds(3);
//            if (driver.findElement(By.xpath("//a[text() = 'Home']")).isDisplayed())
//            {
//                System.out.println("SP success:" + Url);
//            } else {
//                System.out.println("SP error:" + Url);
//            }
        }
    }
    @Test
    public void TC_10_product_id_Category_immune() {
        List<String> Url = new ArrayList<>();
        Url.add("399");
        Url.add("407");
        Url.add("414");
        Url.add("428");
        Url.add("509");
        Url.add("519");
        for (String url : Url) {
            driver.get("https://shop.drberg.com/catalog/product/view/id/" + url +"/category/107");
            sleepInSeconds(3);
//            if (driver.findElement(By.xpath("//a[text() = 'Home']")).isDisplayed())
//            {
//                System.out.println("SP success:" + Url);
//            } else {
//                System.out.println("SP error:" + Url);
//            }
        }
    }
    @Test
    public void TC_10_product_id_Category_all_products() {
        List<String> Url = new ArrayList<>();
        Url.add("344");
        Url.add("516");
        Url.add("518");
        Url.add("524");
        Url.add("548");
        for (String url : Url) {
            driver.get("https://shop.drberg.com/catalog/product/view/id/" + url +"/category/110");
            sleepInSeconds(3);
//            if (driver.findElement(By.xpath("//a[text() = 'Home']")).isDisplayed())
//            {
//                System.out.println("SP success:" + Url);
//            } else {
//                System.out.println("SP error:" + Url);
//            }
        }
    }
    @Test
    public void TC_10_product_id_Category_beauty() {
        List<String> Url = new ArrayList<>();
        Url.add("467");
        Url.add("489");
        Url.add("495");
        Url.add("496");
        Url.add("546");
        for (String url : Url) {
            driver.get("https://shop.drberg.com/catalog/product/view/id/" + url +"/category/111");
            sleepInSeconds(3);
//            if (driver.findElement(By.xpath("//a[text() = 'Home']")).isDisplayed())
//            {
//                System.out.println("SP success:" + Url);
//            } else {
//                System.out.println("SP error:" + Url);
//            }
        }
    }
    @Test
    public void TC_10_product_id_Category_bundles() {
        List<String> Url = new ArrayList<>();
        Url.add("217");
        Url.add("407");
        Url.add("409");
        Url.add("414");
        Url.add("416");
        Url.add("417");
        Url.add("418");
        Url.add("419");
        Url.add("420");
        Url.add("424");
        Url.add("425");
        Url.add("440");
        Url.add("441");
        Url.add("442");
        Url.add("496");
        for (String url : Url) {
            driver.get("https://shop.drberg.com/catalog/product/view/id/" + url +"/category/88");
            sleepInSeconds(3);
//            if (driver.findElement(By.xpath("//a[text() = 'Home']")).isDisplayed())
//            {
//                System.out.println("SP success:" + Url);
//            } else {
//                System.out.println("SP error:" + Url);
//            }
        }
    }
    @Test
    public void TC_11_Parent_Category_sleep() {
        List<String> Url = new ArrayList<>();
        Url.add("sleep-aid-vegan");
        Url.add("sleep-aid");
        for (String url : Url) {
            driver.get("https://shop.drberg.com/health-concern/sleep/" + url);
            sleepInSeconds(3);
//            if (driver.findElement(By.xpath("//a[text() = 'Home']")).isDisplayed())
//            {
//                System.out.println("SP success:" + Url);
//            } else {
//                System.out.println("SP error:" + Url);
//            }
        }
    }
    @Test
    public void TC_11_Parent_Category_digestion() {
        List<String> Url = new ArrayList<>();
        Url.add("gallbladder-formula");
        Url.add("advanced-digestive-formula");
        Url.add("friendly-bacteria-probiotic");
        for (String url : Url) {
            driver.get("https://shop.drberg.com/health-concern/digestion/" + url);
            sleepInSeconds(3);
//            if (driver.findElement(By.xpath("//a[text() = 'Home']")).isDisplayed())
//            {
//                System.out.println("SP success:" + Url);
//            } else {
//                System.out.println("SP error:" + Url);
//            }
        }
    }
    @Test
    public void TC_11_Parent_Category_weight_loss() {
        List<String> Url = new ArrayList<>();
        Url.add("the-healthy-keto-plan");
        Url.add("ketogenic-meal-plans");
        Url.add("ketogenic-desserts-yummies-digital-ebook");
        for (String url : Url) {
            driver.get("https://shop.drberg.com/health-concern/weight-loss/" + url);
            sleepInSeconds(3);
//            if (driver.findElement(By.xpath("//a[text() = 'Home']")).isDisplayed())
//            {
//                System.out.println("SP success:" + Url);
//            } else {
//                System.out.println("SP error:" + Url);
//            }
        }
    }
    @Test
    public void TC_11_Parent_Category_keto() {
        List<String> Url = new ArrayList<>();
        Url.add("raw-wheat-grass-juice-powder          ");
        Url.add("dr-bergs-keto-if-membership           ");
        Url.add("raw-wheat-grass-juice-powder-lemon-regular");
        Url.add("electrolyte-powder                    ");
        Url.add("the-healthy-keto-plan                 ");
        Url.add("nutritional-yeast-regular             ");
        Url.add("ketogenic-meal-plans                  ");
        Url.add("drbergs-get-healthy-booklet           ");
        Url.add("ketogenic-desserts-yummies-digital-ebook");
        Url.add("keto-coach                    ");
        Url.add("electrolyte-orange                    ");
        for (String url : Url) {
            driver.get("https://shop.drberg.com/health-concern/keto/" + url);
            sleepInSeconds(3);
//            if (driver.findElement(By.xpath("//a[text() = 'Home']")).isDisplayed())
//            {
//                System.out.println("SP success:" + Url);
//            } else {
//                System.out.println("SP error:" + Url);
//            }
        }
    }
    @Test
    public void TC_11_Parent_Category_stress() {
        List<String> Url = new ArrayList<>();
        Url.add("massage-tool");
        for (String url : Url) {
            driver.get("https://shop.drberg.com/health-concern/stress/" + url);
            sleepInSeconds(3);
//            if (driver.findElement(By.xpath("//a[text() = 'Home']")).isDisplayed())
//            {
//                System.out.println("SP success:" + Url);
//            } else {
//                System.out.println("SP error:" + Url);
//            }
        }
    }
    @Test
    public void TC_11_Parent_Category_antioxidant_detoxification() {
        List<String> Url = new ArrayList<>();
        Url.add("organic-greens-superfood-250-count");
        Url.add("estrogen-balance-with-dim");
        for (String url : Url) {
            driver.get("https://shop.drberg.com/health-concern/antioxidant-detoxification/" + url);
            sleepInSeconds(3);
//            if (driver.findElement(By.xpath("//a[text() = 'Home']")).isDisplayed())
//            {
//                System.out.println("SP success:" + Url);
//            } else {
//                System.out.println("SP error:" + Url);
//            }
        }
    }
    @Test
    public void TC_11_Parent_Category_endocrine_support() {
        List<String> Url = new ArrayList<>();
        Url.add("adrenal-stress-advanced-formula");
        Url.add("estrogen-balance-with-dim");
        Url.add("blood-sugar-support");
        for (String url : Url) {
            driver.get("https://shop.drberg.com/health-concern/endocrine-support/" + url);
            sleepInSeconds(3);
//            if (driver.findElement(By.xpath("//a[text() = 'Home']")).isDisplayed())
//            {
//                System.out.println("SP success:" + Url);
//            } else {
//                System.out.println("SP error:" + Url);
//            }
        }
    }
    @Test
    public void TC_11_Parent_Category_nutrient_enhancement() {
        List<String> Url = new ArrayList<>();
        Url.add("trace-minerals");
        Url.add("raw-wheat-grass-juice-powder");
        Url.add("electrolyte-powder");
        Url.add("nutritional-yeast-regular");
        Url.add("electrolyte-orange");
        Url.add("d3-k2-vitamin-regular");
        for (String url : Url) {
            driver.get("https://shop.drberg.com/health-concern/nutrient-enhancement/" + url);
            sleepInSeconds(3);
//            if (driver.findElement(By.xpath("//a[text() = 'Home']")).isDisplayed())
//            {
//                System.out.println("SP success:" + Url);
//            } else {
//                System.out.println("SP error:" + Url);
//            }
        }
    }
    @Test
    public void TC_11_Parent_Category_hair_nails_skin() {
        List<String> Url = new ArrayList<>();
        Url.add("trace-minerals");
        Url.add("raw-wheat-grass-juice-powder");
        Url.add("raw-wheat-grass-juice-powder-lemon-regular");
        for (String url : Url) {
            driver.get("https://shop.drberg.com/health-concern/hair-nails-skin/" + url);
            sleepInSeconds(3);
//            if (driver.findElement(By.xpath("//a[text() = 'Home']")).isDisplayed())
//            {
//                System.out.println("SP success:" + Url);
//            } else {
//                System.out.println("SP error:" + Url);
//            }
        }
    }
    @Test
    public void TC_11_Parent_Category_pain_inflammation() {
        List<String> Url = new ArrayList<>();
        Url.add("massage-tool");
        Url.add("adrenal-stress-advanced-formula");
        for (String url : Url) {
            driver.get("https://shop.drberg.com/health-concern/pain-inflammation/" + url);
            sleepInSeconds(3);
//            if (driver.findElement(By.xpath("//a[text() = 'Home']")).isDisplayed())
//            {
//                System.out.println("SP success:" + Url);
//            } else {
//                System.out.println("SP error:" + Url);
//            }
        }
    }
    @Test
    public void TC_11_Parent_Category_blood_sugar_support() {
        List<String> Url = new ArrayList<>();
        Url.add("raw-wheat-grass-juice-powder");
        Url.add("raw-wheat-grass-juice-powder-lemon-regular");
        Url.add("electrolyte-powder");
        Url.add("blood-sugar-support");
        Url.add("nutritional-yeast-regular");
        Url.add("electrolyte-orange");
        for (String url : Url) {
            driver.get("https://shop.drberg.com/health-concern/blood-sugar-support/" + url);
            sleepInSeconds(3);
//            if (driver.findElement(By.xpath("//a[text() = 'Home']")).isDisplayed())
//            {
//                System.out.println("SP success:" + Url);
//            } else {
//                System.out.println("SP error:" + Url);
//            }
        }
    }
    public void sleepInSeconds(long timeInSecond) {
        try {
            Thread.sleep(timeInSecond * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}
