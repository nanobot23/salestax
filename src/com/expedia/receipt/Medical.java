package com.expedia.receipt;

public class Medical {

	private String medicalItems[] = { "box of headache pills" };

	public boolean isMedical(String name) {

		for (String medicalItem : medicalItems) {
			if (name.equals(medicalItem)) {
				return true;

			}

		}

		return false;
	}

}
