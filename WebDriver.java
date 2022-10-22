package Project3;

public interface WebDriver {
    void open();
    void close();
    String getTitle();
}
    interface TakesScreenshot {
        void getScreenshot();

        interface RemoteWebDriver extends WebDriver,TakesScreenshot {
            void navigate();

        }

        class ChromeDriver implements RemoteWebDriver {

            @Override
            public void open() {

            }

            @Override
            public void close() {

            }

            @Override
            public String getTitle() {
                return null;
            }

            @Override
            public void navigate() {

            }

            @Override
            public void getScreenshot() {

            }
        }

        class FirefoxDriver implements RemoteWebDriver {

            @Override
            public void open() {

            }

            @Override
            public void close() {

            }

            @Override
            public String getTitle() {
                return null;
            }

            @Override
            public void navigate() {

            }

            @Override
            public void getScreenshot() {

            }
        }

        class SafariDriver implements RemoteWebDriver {

            @Override
            public void open() {

            }

            @Override
            public void close() {

            }

            @Override
            public String getTitle() {
                return null;
            }

            @Override
            public void navigate() {

            }

            @Override
            public void getScreenshot() {

            }
        }

        class Tester {
            public static void main(String[] args) {

                RemoteWebDriver[] webs = {new ChromeDriver(), new FirefoxDriver(), new SafariDriver()};
                for (RemoteWebDriver web : webs) {

                    web.close();
                    web.open();
                    web.getTitle();
                    web.navigate();
                    web.getScreenshot();

                }
            }
        }
    }



