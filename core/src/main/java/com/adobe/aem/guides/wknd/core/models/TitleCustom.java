package com.adobe.aem.guides.wknd.core.models;

/**
 * Represents the Byline AEM Component for the WKND Site project.
 **/
public interface TitleCustom {
	/***
	 * @return a string to display as the name.
	 */
	String getTitle();

	/***
	 * @return a boolean if the component has content to display.
	 */
	boolean isEmpty();
}