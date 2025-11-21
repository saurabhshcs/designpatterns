package com.saurabhshcs.adtech.designpatterns.structural.facade;

import com.saurabhshcs.adtech.designpatterns.structural.facade.common.ReportFormat;

import java.util.List;

public class ReportExporterFacade {

    public Boolean export(List<String> campaigns, ReportFormat format) {
        return format == ReportFormat.FORMAT_JSON || format == ReportFormat.FORMAT_CSV;
    }
}
