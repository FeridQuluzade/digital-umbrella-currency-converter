package az.digitalUmbrella.dev.currency.error;

public enum ErrorCodes implements ErrorCode {

    INVALID_USERNAME_OR_PASSWORD,
    CLIENT_ERROR,
    ALREADY_TAKEN,
    USER_NOT_FOUND;

    @Override
    public String code() {
        return this.name();
    }

}
