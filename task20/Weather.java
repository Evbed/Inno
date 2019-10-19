package task20;

public class Weather {
    float apiVersion;
    float swaggerVersion;

    public float getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(float apiVersion) {
        this.apiVersion = apiVersion;
    }

    public float getSwaggerVersion() {
        return swaggerVersion;
    }

    public void setSwaggerVersion(float swaggerVersion) {
        this.swaggerVersion = swaggerVersion;
    }

    @Override
    public String toString() {
        return String.format("API Версия:%.1f, Swagger версия:%.1f", apiVersion, swaggerVersion);
    }
}
