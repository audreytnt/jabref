package org.jabref.model.entry;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FieldNameTest2 {

    @Test
    public void testGetDisplayNameUnknownField() {
        assertEquals("Aaa", FieldName.getDisplayName("aaa"));
    }

    @Test
    public void testGetDisplayNameKnownField() {
        assertEquals("DOI", FieldName.getDisplayName("doi"));
        assertEquals("PDF", FieldName.getDisplayName("Pdf"));
    }
}
