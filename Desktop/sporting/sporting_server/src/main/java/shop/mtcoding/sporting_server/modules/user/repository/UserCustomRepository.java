package shop.mtcoding.sporting_server.modules.user.repository;

import org.springframework.data.repository.query.Param;

import shop.mtcoding.sporting_server.topic.player.dto.PlayerUpdateFormOutDTO;

public interface UserCustomRepository {
    PlayerUpdateFormOutDTO findByUserId(@Param("userId") Long userId);
}
