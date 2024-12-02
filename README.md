COPD Care is an application prototype developed by Lily Hung, Anton Santos, Karen Zhao, Nayesha Khurana for UBC BizTech's hackathon, HelloHacks 2023.

This is intended to be(come) a mobile and Apple Watch application that:
- automatically tracks key indicators for an oncoming COPD exacerbation (pulse, respiratory rate, and oxygen saturation).
- uses baseline values and trends to predict exacerbations and categorize risk levels
- allows for manual symptom input and generates personalized reports
- facilitates appointment booking for care

Unique features we hoped to develop include:
- Automated tracking of vitals
- 5 day prediction of exacerbations
- Integration of educational content and actionable recommendations

How it works:

1.	Menu Interface:
- Users can:
	- Enter vital signs.
	- Print a report with risk categorization and recommendations.
 	- Quit the application.
- Menu interaction is controlled through the runApp() method.
2.	Vitals Input (enterVital):
- Prompts users to input:
	- Pulse rate (per minute).
	- Respiratory rate (per minute).
	  •	Oxygen saturation (%).
	•	Stores these values for analysis.
4.	Exacerbation Analysis (printReport):
	•	Uses threshold values to determine if any vital is abnormal:
	•	Pulse Rate: ≤ 80.
	•	Respiratory Rate: ≤ 25.
	•	Oxygen Saturation: ≥ 95.
	•	Categorizes patients based on observed trends and provides:
	•	Warnings about exacerbation risks.
	•	Suggestions to seek care if necessary.
5.	Automated Recommendations:
	•	Risk-based messaging:
	  •	High-risk patients receive a notification up to 5 days prior to predicted exacerbation.
	  •	Visual aids highlight concerning trends.
	•	Resources provided include care facility locations, medication demonstrations, and prevention tips.
