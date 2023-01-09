/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.yinsuda.v20220527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApplyChorusRequest extends AbstractModel{

    /**
    * 应用名称。
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * 用户标识。
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 房间号。
    */
    @SerializedName("RoomId")
    @Expose
    private String RoomId;

    /**
    * 歌曲 Id。
    */
    @SerializedName("MusicId")
    @Expose
    private String MusicId;

    /**
    * 最大合唱人数，默认值为 8，最大值为 20。
    */
    @SerializedName("MaxChorusNum")
    @Expose
    private Long MaxChorusNum;

    /**
    * 合唱用户标识列表。
    */
    @SerializedName("ChorusUserIds")
    @Expose
    private String [] ChorusUserIds;

    /**
     * Get 应用名称。 
     * @return AppName 应用名称。
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set 应用名称。
     * @param AppName 应用名称。
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get 用户标识。 
     * @return UserId 用户标识。
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户标识。
     * @param UserId 用户标识。
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 房间号。 
     * @return RoomId 房间号。
     */
    public String getRoomId() {
        return this.RoomId;
    }

    /**
     * Set 房间号。
     * @param RoomId 房间号。
     */
    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get 歌曲 Id。 
     * @return MusicId 歌曲 Id。
     */
    public String getMusicId() {
        return this.MusicId;
    }

    /**
     * Set 歌曲 Id。
     * @param MusicId 歌曲 Id。
     */
    public void setMusicId(String MusicId) {
        this.MusicId = MusicId;
    }

    /**
     * Get 最大合唱人数，默认值为 8，最大值为 20。 
     * @return MaxChorusNum 最大合唱人数，默认值为 8，最大值为 20。
     */
    public Long getMaxChorusNum() {
        return this.MaxChorusNum;
    }

    /**
     * Set 最大合唱人数，默认值为 8，最大值为 20。
     * @param MaxChorusNum 最大合唱人数，默认值为 8，最大值为 20。
     */
    public void setMaxChorusNum(Long MaxChorusNum) {
        this.MaxChorusNum = MaxChorusNum;
    }

    /**
     * Get 合唱用户标识列表。 
     * @return ChorusUserIds 合唱用户标识列表。
     */
    public String [] getChorusUserIds() {
        return this.ChorusUserIds;
    }

    /**
     * Set 合唱用户标识列表。
     * @param ChorusUserIds 合唱用户标识列表。
     */
    public void setChorusUserIds(String [] ChorusUserIds) {
        this.ChorusUserIds = ChorusUserIds;
    }

    public ApplyChorusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplyChorusRequest(ApplyChorusRequest source) {
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.RoomId != null) {
            this.RoomId = new String(source.RoomId);
        }
        if (source.MusicId != null) {
            this.MusicId = new String(source.MusicId);
        }
        if (source.MaxChorusNum != null) {
            this.MaxChorusNum = new Long(source.MaxChorusNum);
        }
        if (source.ChorusUserIds != null) {
            this.ChorusUserIds = new String[source.ChorusUserIds.length];
            for (int i = 0; i < source.ChorusUserIds.length; i++) {
                this.ChorusUserIds[i] = new String(source.ChorusUserIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "MusicId", this.MusicId);
        this.setParamSimple(map, prefix + "MaxChorusNum", this.MaxChorusNum);
        this.setParamArraySimple(map, prefix + "ChorusUserIds.", this.ChorusUserIds);

    }
}

