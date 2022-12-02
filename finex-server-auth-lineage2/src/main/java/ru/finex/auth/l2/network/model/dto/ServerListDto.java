package ru.finex.auth.l2.network.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.finex.auth.l2.model.dto.UserServerDto;
import ru.finex.network.netty.model.NetworkDto;

import java.util.List;

/**
 * @author m0nster.mind
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ServerListDto implements NetworkDto {

    /** Last server ID where client plays. */
    private int lastServerId;

    private List<UserServerDto> servers;

}