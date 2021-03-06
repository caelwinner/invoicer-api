package uk.co.caeldev.invoicer.api.features.common.exception;

public class ApiError {

    private String code;
    private String message;
    private String description;

    public ApiError() {
    }

    public ApiError(final ErrorCode errorCode,
                    final String description) {
        this.code = errorCode.getCode();
        this.message = errorCode.getMessage();
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public String getDescription() {
        return description;
    }
}
