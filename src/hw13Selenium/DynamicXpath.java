package hw13Selenium;

public class DynamicXpath {

    //1) Tag with a single attribute.
	// input[@id='twotabsearchtextbox']
	// form[@id='nav-search-bar-form']
	// input[@id='nav-search-submit-button']
	// a[@id='nav-logo-sprites']
	// span[@id='glow-ingress-line2']
	// form[@class='nav-searchbar nav-progressive-attribute']
	// a[@class='nav-logo-link nav-progressive-attribute']
	// span[@class='icp-nav-flag icp-nav-flag-us']
	// span[@class='hm-icon-label']
	// div[@class='nav-sprite nav-progressive-attribute']

	// 2) Tag with multiple attribute with 'or' logic
	// div[@class='nav-sprite nav-progressive-attribute' or
	// @id='nav-packard-glow-loc-icon']
	// form[@id='nav-search-bar-form' or @class='nav-searchbar
	// nav-progressive-attribute']
	// span[@class='icp-nav-flag icp-nav-flag-us'or@id='nav-logo-sprites']
	// span[@id='glow-ingress-line2' or @class='nav-line-2 nav-progressive-content']
	// form[@name='site-search' or @id='nav-search-bar-form']

	// 3) Tag with multiple attribute with 'and' logic
	// div[@class='nav-sprite nav-progressive-attribute' and
	// @id='nav-packard-glow-loc-icon']
	// input[@id='twotabsearchtextbox' and @class='nav-input
	// nav-progressive-attribute']
	// form[@id='nav-search-bar-form' and @class='nav-searchbar
	// nav-progressive-attribute']
	// input[@id='nav-search-submit-button' and @class='nav-input
	// nav-progressive-attribute']
	// span[@id='glow-ingress-line2' and @class='nav-line-2
	// nav-progressive-content']

	// 4) Tag with inner text [means complete text]
	// a[text()='Amazon Basics']
	// a[text()='Customer Service']
	// a[text()="Today's Deals"]
	// span[text()='Prime']
	// a[text()='Music']

	// 5) Tag with inner text [not complete inner text rather partial text as well
	// as actual text]
	// p[contains(text(),'Cancer is')]
	// p[contains(text(),'At the Mount Sinai T')]
	// h1[contains(text(),'Mount Sinai Tisch Cancer Center')]
	// h1[contains(text(),'Mount Sinai')]
	// title[contains(text(),'Request')]

	// 6)Tag with attributes and use of contains7
	// h2[contains(@class,'nyp-type-h2 u-m-t-o u-p-b-lg')]
	// a[contains(@class,'coh-link search-btn c-inline-icon u-p-horz u-p-vert-xs')]
	// p[contains(@class,'coh-paragraph c-hero__content--copy u-text-large u-w-m600
	// u-m-b u-c-white')]
	// a[contains(@class,'coh-link tertiary-link tertiary-link--large
	// coh-style-location-map-link-override')]
	// input[contains(@id,'gh-ac')]

	// 7)Using Normalize space method -- eliminates leading and trailing spaces.
	// a[normalize-space(text())='Credit Cards']
	// a[normalize-space(text())='Home Loans']
	// p[normalize-space(text())='Checking & Savings']
	// a[normalize-space(text())='Auto']
	// a[normalize-space(text())='Investing by J.P. Morgan']

	// 8)Starts-with() by text 9
	// b[starts-with(text(),'Welcome bonus for new checking customers!')]
	// p[starts-with(text(),'Earn up to $500 cash ')]
	// p[starts-with(text(),'Refer ')]
	// span[starts-with(text(),' Opens h')]
	// a[starts-with(text(),'ATM & branch')]

	// 9)Starts-with() with attribute: (https://www.chase.com/)
	// a[starts-with(@class,'btn cta cta--primary cta--large')]
	// a[starts-with(@class,'link-anchor ')]
	// input[starts-with(@id,'u')]
	// div[starts-with(@class,'primary-item-icon icon-b')]
	// a[starts-with(@class,'chaseanalytics-track-link button c')]

}