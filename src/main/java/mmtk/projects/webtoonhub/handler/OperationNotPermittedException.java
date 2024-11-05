package mmtk.projects.webtoonhub.handler;

/**
 * Author : Min Myat Thu Kha
 * Created At : 05/11/2024, Nov ,09, 06
 * Project Name : WebtoonHub
 **/
public class OperationNotPermittedException extends RuntimeException {
    public OperationNotPermittedException(String msg) {
        super(msg);
    }
}
