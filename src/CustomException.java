public class CustomException extends RuntimeException {
    String message;

    CustomException(String message){
        this.message = message;
    }

    @Override
    public String toString() {
        return "CustomException{" +
                "message='" + message + '\'' +
                '}';
    }
}
