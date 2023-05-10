package hello.spring_advanced.trace;

import java.util.UUID;

public class TraceId {

    private String id;
    private int level;
    public TraceId() {
        this.id = createId();
        this.level = 0;
    }
    private TraceId(String id, int level) {
        this.id = id;
        this.level = level;
    }
    private String createId() {
        return UUID.randomUUID().toString().substring(0, 8);
    }
    public TraceId createNextId() { // 한 트랜잭션의 요청을 단계별(깊이)로 나타내기 위한 메서드
        return new TraceId(id, level + 1);
    }
    public TraceId createPreviousId() {
        return new TraceId(id, level - 1);
    }
    public boolean isFirstLevel() {
        return level == 0;
    }
    public String getId() {
        return id;
    }
    public int getLevel() {
        return level;
    }
}
