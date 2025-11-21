package com.saurabhshcs.adtech.designpatterns.structural.facade;

import com.saurabhshcs.adtech.designpatterns.structural.facade.common.ReportFormat;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ReportExporterFacadeTest {

    @Test
    void exportsSupportedFormats() {
        ReportExporterFacade facade = new ReportExporterFacade();
        assertTrue(facade.export(List.of("Campaign1"), ReportFormat.FORMAT_JSON));
        assertTrue(facade.export(List.of("Campaign1"), ReportFormat.FORMAT_CSV));
    }

    @Test
    void rejectsUnsupportedFormat() {
        ReportExporterFacade facade = new ReportExporterFacade();
        // simulate unsupported format by null
        assertFalse(facade.export(List.of("Campaign1"), null));
    }

}