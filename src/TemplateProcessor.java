/*
adapted from Refactoring Workbook
Book by William C. Wake
*/

import java.lang.StringBuilder;

/**
 * Hello world!
 *
 */
public class TemplateProcessor {

    public String process(String sourceTemplate, String reqId, String code) {

        String template = new String(sourceTemplate);

        // Substitute for %CODE%
        int templateSplitBegin = template.indexOf("%CODE%");
        int templateSplitEnd = templateSplitBegin + 6;
        String templatePartOne = new String(template.substring(0,
                templateSplitBegin));
        String templatePartTwo = new String(template.substring(
                templateSplitEnd, template.length()));
        code = new String(reqId);
        //StringBuilder sb = new StringBuilder();
        //sb.append(templatePartOne).append(code).append(templatePartTwo);
        template = new String(templatePartOne + code + templatePartTwo);

        // Substitute for %ALTCODE%
        templateSplitBegin = template.indexOf("%ALTCODE%");
        templateSplitEnd = templateSplitBegin + 9;
        templatePartOne = new String(template.substring(0, templateSplitBegin));
        templatePartTwo = new String(template.substring(templateSplitEnd,
                template.length()));
        String altcode = code.substring(0, 5) + "-" + code.substring(5, 8);
        return templatePartOne + altcode + templatePartTwo;
    }

}