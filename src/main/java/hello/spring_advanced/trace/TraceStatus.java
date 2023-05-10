package hello.spring_advanced.trace;
// 로그가 시작할 때의 상태정보를 가지고 있는 클래스
public class TraceStatus {
    private TraceId traceId;
    private Long startTimeMs;
    private String message;
    public TraceStatus(TraceId traceId, Long startTimeMs, String message) {
        this.traceId = traceId;
        this.startTimeMs = startTimeMs;
        this.message = message;
    }
    public Long getStartTimeMs() {
        return startTimeMs;
    }
    public String getMessage() {
        return message;
    }
    public TraceId getTraceId() {
        return traceId;
    }
}
