package mini.backend.post;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

import java.sql.Timestamp;

@Getter
@AllArgsConstructor
public class PostDtoReq {
    private final String title;
    private final String content;
    private final boolean isAnnounce = false;
}