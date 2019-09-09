package edu.ncsu.csc.itrust.model;

import java.util.regex.Pattern;

/**
 * This enum contains regular expressions that match valid inputs to the iTrust
 * system. For example, the NAME enum matches all name inputs, and can be "Up to
 * 20 letters, space, ' and -".
 * 
 * Each enum value has a regex and a plain-English description of what the regex
 * matches. Please add new regexes in alphabetical order.
 * 
 * Naming conventions:
 *  - Use ALL_CAPS_UNDERSCORE_CASE
 *  - Prefix related regexes with the thing that relates them. Examples: APPT_TYPE_xxx PATIENT_xxx
 */
public enum ValidationFormat {
	ADDRESS("[a-zA-Z0-9.\\s]{1,30}",
			"Up to 30 alphanumeric characters, and ."),
	ADVERSE_EVENT_COMMENTS("[a-zA-Z0-9.\\-',!;:()?\\s]{1,2000}",
			"Up to 2000 alphanumeric characters and .-',!;:()?"),
	ALLERGY_DESCRIPTION("[a-zA-Z0-9\\s]{1,30}",
			"Up to 30 characters, letters, numbers, and a space"),
	ANSWER("[a-zA-Z0-9\\s]{1,30}",
			"Up to 30 alphanumeric characters"),
	APPT_COMMENT("[0-9a-zA-Z\\s'\"?$!:;\\-._\n\t]{0,1000}",
			"Between 0 and 1000 alphanumerics with space, and other punctuation"),
	APPT_TYPE_DURATION("[0-9]{1,5}",
			"Between 1 and 5 numeric digits"),
	APPT_TYPE_NAME("[a-zA-Z ]{1,30}",
			"Between 1 and 30 alpha characters and space"),
	BLOOD_PRESSURE_OV("^[0-9]{1,3}\\/[0-9]{1,3}$",
			"Up to 3-digit number / Up to 3-digit number"),
	BLOODTYPE("((O)|(A)|(B)|(AB))([+-]{1})",
			"Must be [O,A,B,AB]+/-"), // ^(?:O|A|B|AB)[+-]$
	CITY("[a-zA-Z\\s]{1,15}",
			"Up to 15 characters"),
	COMMENTS("[a-zA-Z0-9'\"?!:;\\-._\n\t\\s]{1,500}",
			"Up to 500 alphanumeric characters"),
	CPT_CODE_DESCRIPTION("[a-zA-Z0-9\\s ()<>,.\\-?/']{1,30}",
			"Up to 30 alphanumeric, space and ()<>,.\\-?/'"),
	CPT("[\\d]{1,4}[A-Za-z0-9]",
			"Up to four digit integer plus a letter or digit"),
	DATE("[\\d]{2}/[\\d]{2}/[\\d]{4}",
			"MM/DD/YYYY"),
	DATETIME("[\\d]{4}-[\\d]{2}-[\\d]{2}[\\s]{1}[\\d]{2}:[\\d]{2}:[\\d]{2}.[\\d]{1}",
			"mm/dd/yyyy"),
	DIASTOLIC_BLOOD_PRESSURE("^([4-9][0-9]|1[0-4][0-9]|150)$",
			"Must be between 40 and 150"),
	DRUG_DOSAGE("^(?:[1-5]?[0-9]{1,2}|600)$",
			"integer between 0 and 600"),
	BABY_NUMBER("[0-9]",
			"must be between 0 and 9"),
	DRUG_INT_COMMENTS("[a-zA-Z0-9.\\-',!;:()?\\s]{1,500}",
			"Up to 500 alphanumeric characters and .-',!;:()?"),
	EMAILS("[a-zA-Z0-9.\\-',!;:()?\\s\\\\/]{1,500}",
			"Up to 500 alphanumeric characters and .-',!;:()?"),
	EMAIL(".+@.+\\..+",
			"Up to 30 alphanumeric characters and symbols . and _ @"), 
	EXERCISETYPE("^(?:Cardio|Weight Training)$",
			"must be one of {Cardio, Weight Training}"),
	FHR("^[0-9]\\d*",
			"Must be 0 or positive integer."),
	FHU("^[0-9]*.^[1-9][0-9]*|^[1-9][0-9]*.?[0-9]*$",
			"Must be a positive double."),
	FULL_ADDRESS("[a-zA-Z0-9.,\\s]{1,100}",
			"Up to 100 alphanumeric characters, comma, and ."),
	GENDERCOD("(Male)|(Female)|(Not Specified)",
			"Only Male, Female, or All Patients"),
	GLUCOSE_LEVEL("^([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|250)$",
			"Must be between 0 and 250"),
	HCPMID("9[0-9]{0,9}",
			"1-10 digit number beginning with 9"),
	HDL_OV("^[0-8]?[0-9]$",
			"integer less than 90"),
	HeadCircumference("[\\d]{0,3}(\\.(\\d){0,1}){0,1}",
			"Up to 3-digit number + up to 1 decimal place"),
	HEAD_CIRCUMFERENCE_OV("^[0-9]{0,3}(?:\\.[0-9])?$",
			"Up to 3 digit number and up to 1 decimal place"),
	HEIGHT("^([0-9]{1,4}\\.[0-9])$",
			"Up to 4 digit number and 1 decimal place"),
	Height("[\\d]{0,3}(\\.(\\d){0,1}){0,1}",
			"Up to 3-digit number + up to 1 decimal place"),
	HEIGHT_OV("^[0-9]{0,3}(?:\\.[0-9])?$",
			"Up to 3 digit number and up to 1 decimal place"),
	HOSPITAL_ID("[\\d]{1,10}",
			"Between 1 and 10 digits"),
	HOSPITAL_NAME("[0-9a-zA-Z' .]{1,30}",
			"Between 1 and 30 alphanumerics, space, ', and ."),
	HOURS_LABOR("[\\d]{0,3}.[\\d]{0,2}",
			"Hours in labor must between 0.0 and 999.99"),
	HSS_OV("^[0-3]$",
			"0, 1, 2, or 3, representing household smoking status"),
	ICD10CM("^[A-Z][0-9][A-Z0-9]([A-Z0-9]{1,4})?$",
			"A capital letter, followed by a number, followed by a capital letter or number, optionally followed by 1-4 capital letters or numbers"),
	ICD_CODE_DESCRIPTION("[a-zA-Z0-9\\s ()<>,.\\-?/']{1,30}",
			"Up to 30 alphanumeric, space, and ()<>,.\\-?/'"),
	INSURANCE_ID("[\\s\\da-zA-Z'-]{1,20}",
			"Up to 20 letters, digits, space, ' and -"),
	LABPROCEDURE_CONFIDENCE_INTERVAL("^[0-9]|[1-9][0-9]|100$",
			"Integer between 0 and 100"),
	LABPROCEDURE_NUMRESULT_CONTENT("^[\\-+]?(?:\\d+(?:\\.\\d*)?|\\.\\d+)$",
			"A number containing an optional minus sign and an optional decimal point."),
	LABPROCEDURE_NUMRESULT_LENGTH("^.{1,20}$",
			"A number containing between 1 and 20 characters, including the optional minus sign and decimal point."),
	LAB_RIGHTS("(ALLOWED)|(RESTRICTED)",
			"Only ALLOWED, or RESTRICTED"),
	LAB_STATUS("(In Transit)|(Received)|(Testing)|(Pending)|(Completed)",
			"Only In Transit, Received, Testing, Pending, or Completed"),
	LDL_OV("^(?:[1-5]?[0-9]{1,2}|600)$",
			"integer between 0 and 600"),
	LENGTH_OV("^[0-9]{0,3}(?:\\.[0-9])?$",
			"Up to 3 digit number and up to 1 decimal place"),
	LOINC("[\\d]{1,5}[-]{1}[\\d]{1}",
			"Must be 1-5 digits followed by a - then another digit"),
	LOINC_ITEM("[^\"]{1,100}",
			"Up to 100 characters, excluding quotation marks"),
	MEALTYPE("^(?:Breakfast|Lunch|Snack|Dinner)$",
			"must be one of {Breakfast, Lunch, Snack, Dinner}"),
	MESSAGES_BODY("[a-zA-Z0-9\\s'\"?!:;\\-.,_\n\t()\\\\/]{1,1000}",
			"Up to 1000 alphanumeric characters, with space, and other punctuation"),
	MESSAGES_SUBJECT("[a-zA-Z0-9\\s'\"?!:;\\-._\n\t()]{1,100}",
			"Up to 100 alphanumeric characters, with space, and other punctuation"),
	MID("[\\d]{1,10}",
			"Between 1 and 10 digits"),
	NAME("^(?=.*[a-zA-Z])[\\sa-zA-Z'-]{1,20}$",
			"Up to 20 Letters, space, ' and -"), 
	ND_CODE_DESCRIPTION("[a-zA-Z0-9\\s ()<>,.\\-?/']{1,100}",
			"Up to 100 alphanumeric characters plus space and ()<>,.-?/'"),
	ND("^[\\d]{1,5}(-[\\d]{1,4})?$",
			"Up to five digits, followed by an optional dash with 1-4 more digits"),
	NOTES("[a-zA-Z0-9\\s'\"?!:#;\\-.,_\n\t]{1,300}",
			"Up to 300 alphanumeric characters, with space, and other punctuation"),
	NUMBEROFHOURS_INLABOR("[\\d]{1,5}",
			"Up to 5 positive digits"),
	NUMBEROFWEEKS_INPREGNANT("[\\d]{1,5}",
			"Up to 5 positive digits"),
	NUMBEROF_PREGNANCY("([1-9]\\d+)|[2-9]",
			"Bigger than zero"),
	NUMBEROF_PREGNANCY_NOT_MULTIPLE("[1]",
			"Not multiple should be set to 1"),
	NPMID("[0-8][0-9]{0,9}",
			"1-10 digit number not beginning with 9"),
	ORC("[\\d]{1,5}",
			"Up to five digit integer"),
	OR_CODE_DESCRIPTION("[a-zA-Z0-9\\s]{1,80}",
			"Up to 80 characters, letters, numbers, and a space"),
	PASSWORD("[a-zA-Z0-9]{8,20}",
			"8-20 alphanumeric characters"),
	PATIENT_INSTRUCTIONS_COMMENTS("^[a-zA-Z0-9#;?\\-'.:,!/ \n]{1,500}$",
			"Up to 500 alphanumeric characters, with space, and other punctuation"),
	PATIENT_INSTRUCTIONS_NAME("^[a-zA-Z0-9#;?\\-'.:,!/ \n]{1,100}$",
			"Up to 100 alphanumeric characters, with space, and other punctuation"),
	PATIENT_INSTRUCTIONS_URL("^.{1,200}$",
			"Up to 200 characters, as a valid URL"),
	PEDOMETER_READING("^([0-9]{1,10})$",
			"Up to ten digit integer"),
	PHONE_NUMBER("[\\d]{3}-[\\d]{3}-[\\d]{4}",
			"xxx-xxx-xxxx"),
	PRIORITY("[1-3]",
			"Priority must be between 1 and 3"),
	PREGNANCYTYPE("[0-9]",
			"must be between 0 and 9"),
	PSS_OV("^[0-59]$",
			"0-5 or 9, representing patient smoking status"),
	QUESTION("[a-zA-Z0-9?\\-'.\\s]{1,50}",
			"Up to 50 alphanumeric characters and symbols ?-'."),
	REFERRAL_NOTES("[a-zA-Z0-9\\s'\"?!:;\\-.,_\n\t()\\\\/]{1,500}",
			"Up to 500 alphanumeric characters, with space, and other punctuation"),
	SLEEPTYPE("^(?:Nightly|Nap)$",
			"must be one of {Nightly, Nap}"),
	STATE("[A-Z]{2}",
			"Two capital letters"),
	SYSTOLIC_BLOOD_PRESSURE("^([4-9][0-9]|1[0-9][0-9]|2[0-3][0-9]|240)$",
			"Must be between 40 and 240"),
	TRIGLYCERIDE_OV("^(?:[1-5][0-9]{2}|600)$",
			"integer between 100 and 600"),
	WEEKS_PREGNANT("^([0-9]|[1-3][0-9]|4[0-2])-[0-6]{1}$",
			"Weeks must be between 0 and 42, Days must be between 0 and 6"),
	WEEKS_PREGNANT_OV("^([0-9]|[1-3][0-9]|4[0-2])-[0-6]{1}$",
			"The patient chosen is not a current obstetrics patient"),
	WEIGHT("^([0-9]{1,4}\\.[0-9])$",
			"Up to 4 digit number and 1 decimal place"),
	Weight("[\\d]{0,4}(\\.(\\d){0,1}){0,1}",
			"Up to 4-digit number + up to 1 decimal place"),
	WEIGHT_OV("^[0-9]{0,3}(?:\\.[0-9])?$",
			"Up to 4 digit number and up to 1 decimal place"),
	YEAR("[\\d]{4}",
			"Must be 4 digits"), 
	ZIPCODE("([0-9]{5})|([0-9]{5}-[0-9]{4})",
			"xxxxx or xxxxx-xxxx"), // ^[0-9]{5}(?:-[0-9]{4})?$
	visitedID("[0-9]{0,9}",
			"1-10 digit number")
	;

	private Pattern regex;
	private String description;

	ValidationFormat(String regex, String errorMessage) {
		this.regex = Pattern.compile(regex);
		this.description = errorMessage;
	}

	public Pattern getRegex() {
		return regex;
	}

	public String getDescription() {
		return description;
	}
}
