package seedu.travelr.model;

import org.junit.jupiter.api.Test;

import static seedu.travelr.testutil.Assert.assertThrows;

public class UserPrefsTest {

    @Test
    public void setGuiSettings_nullGuiSettings_throwsNullPointerException() {
        seedu.travelr.model.UserPrefs userPref = new seedu.travelr.model.UserPrefs();
        assertThrows(NullPointerException.class, () -> userPref.setGuiSettings(null));
    }

    @Test
    public void setAddressBookFilePath_nullPath_throwsNullPointerException() {
        seedu.travelr.model.UserPrefs userPrefs = new UserPrefs();
        assertThrows(NullPointerException.class, () -> userPrefs.setAddressBookFilePath(null));
    }

}
