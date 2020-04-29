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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RoomState extends AbstractModel{

    /**
    * 通话ID（唯一标识一次通话）
    */
    @SerializedName("CommId")
    @Expose
    private String CommId;

    /**
    * 房间号
    */
    @SerializedName("RoomString")
    @Expose
    private String RoomString;

    /**
    * 房间创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 房间销毁时间
    */
    @SerializedName("DestroyTime")
    @Expose
    private Long DestroyTime;

    /**
    * 房间是否已经结束
    */
    @SerializedName("IsFinished")
    @Expose
    private Boolean IsFinished;

    /**
    * 房间创建者Id
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
     * Get 通话ID（唯一标识一次通话） 
     * @return CommId 通话ID（唯一标识一次通话）
     */
    public String getCommId() {
        return this.CommId;
    }

    /**
     * Set 通话ID（唯一标识一次通话）
     * @param CommId 通话ID（唯一标识一次通话）
     */
    public void setCommId(String CommId) {
        this.CommId = CommId;
    }

    /**
     * Get 房间号 
     * @return RoomString 房间号
     */
    public String getRoomString() {
        return this.RoomString;
    }

    /**
     * Set 房间号
     * @param RoomString 房间号
     */
    public void setRoomString(String RoomString) {
        this.RoomString = RoomString;
    }

    /**
     * Get 房间创建时间 
     * @return CreateTime 房间创建时间
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 房间创建时间
     * @param CreateTime 房间创建时间
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 房间销毁时间 
     * @return DestroyTime 房间销毁时间
     */
    public Long getDestroyTime() {
        return this.DestroyTime;
    }

    /**
     * Set 房间销毁时间
     * @param DestroyTime 房间销毁时间
     */
    public void setDestroyTime(Long DestroyTime) {
        this.DestroyTime = DestroyTime;
    }

    /**
     * Get 房间是否已经结束 
     * @return IsFinished 房间是否已经结束
     */
    public Boolean getIsFinished() {
        return this.IsFinished;
    }

    /**
     * Set 房间是否已经结束
     * @param IsFinished 房间是否已经结束
     */
    public void setIsFinished(Boolean IsFinished) {
        this.IsFinished = IsFinished;
    }

    /**
     * Get 房间创建者Id 
     * @return UserId 房间创建者Id
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 房间创建者Id
     * @param UserId 房间创建者Id
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CommId", this.CommId);
        this.setParamSimple(map, prefix + "RoomString", this.RoomString);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "DestroyTime", this.DestroyTime);
        this.setParamSimple(map, prefix + "IsFinished", this.IsFinished);
        this.setParamSimple(map, prefix + "UserId", this.UserId);

    }
}

