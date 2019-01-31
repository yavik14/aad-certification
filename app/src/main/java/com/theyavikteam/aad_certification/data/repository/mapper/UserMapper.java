package com.theyavikteam.aad_certification.data.repository.mapper;

import com.theyavikteam.aad_certification.api.dto.UserDto;
import com.theyavikteam.aad_certification.domain.bo.UserBo;

public class UserMapper {

    public static UserBo dtoToBo(UserDto userDto){
        UserBo userBo = null;
        if (userDto != null) {
            userBo = new UserBo();
            userBo.setTag(userDto.getTag());
            userBo.setAvatarId(userDto.getAvatar());
            userBo.setBestRoboRumbleTime(userDto.getBestRoboRumbleTime());
            userBo.setBestTimeAsBoss(userDto.getBestTimeAsBoss());
            userBo.setCurrentTrophies(userDto.getTrophies());
            userBo.setMaxTrophies(userDto.getHighestTrophies());
            userBo.setDivision(userDto.getDivision());
            userBo.setSoloShowdownVictories(userDto.getSoloShowdownVictories());
            userBo.setDuoShowdownVictories(userDto.getDuoShowdownVictories());
            userBo.setExperienceToNextLevel(userDto.getExpFmt());
            userBo.setLevel(userDto.getLevel());
            userBo.setName(userDto.getName());
            userBo.setVictories(userDto.getVictories());
            userBo.setClubBo(ClubMapper.dtoToBo(userDto.getClub()));
            userBo.setBrawlers(BrawlerMapper.dtoToBo(userDto.getBrawlers()));
        }
        return userBo;
    }
}
