package de.rwthaachen.openlap.visualizer.core.dtos;

/**
 * Created by bas on 1/29/16.
 */
public class VisualizationSuggestionDetails {

    private long methodId;
    private String methodName;
    private long frameworkId;
    private String frameworkName;

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public String getFrameworkName() {
        return frameworkName;
    }

    public void setFrameworkName(String frameworkName) {
        this.frameworkName = frameworkName;
    }

    public long getMethodId() {
        return methodId;
    }

    public void setMethodId(long methodId) {
        this.methodId = methodId;
    }

    public long getFrameworkId() {
        return frameworkId;
    }

    public void setFrameworkId(long frameworkId) {
        this.frameworkId = frameworkId;
    }
}
