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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TrtcRecordInfo extends AbstractModel{

    /**
    * TRTC 应用 ID。
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * TRTC 房间 ID。
    */
    @SerializedName("RoomId")
    @Expose
    private String RoomId;

    /**
    * 录制任务 ID。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 参与录制的用户 ID 列表。
    */
    @SerializedName("UserIds")
    @Expose
    private String [] UserIds;

    /**
     * Get TRTC 应用 ID。 
     * @return SdkAppId TRTC 应用 ID。
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set TRTC 应用 ID。
     * @param SdkAppId TRTC 应用 ID。
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get TRTC 房间 ID。 
     * @return RoomId TRTC 房间 ID。
     */
    public String getRoomId() {
        return this.RoomId;
    }

    /**
     * Set TRTC 房间 ID。
     * @param RoomId TRTC 房间 ID。
     */
    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get 录制任务 ID。 
     * @return TaskId 录制任务 ID。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 录制任务 ID。
     * @param TaskId 录制任务 ID。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 参与录制的用户 ID 列表。 
     * @return UserIds 参与录制的用户 ID 列表。
     */
    public String [] getUserIds() {
        return this.UserIds;
    }

    /**
     * Set 参与录制的用户 ID 列表。
     * @param UserIds 参与录制的用户 ID 列表。
     */
    public void setUserIds(String [] UserIds) {
        this.UserIds = UserIds;
    }

    public TrtcRecordInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TrtcRecordInfo(TrtcRecordInfo source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.RoomId != null) {
            this.RoomId = new String(source.RoomId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.UserIds != null) {
            this.UserIds = new String[source.UserIds.length];
            for (int i = 0; i < source.UserIds.length; i++) {
                this.UserIds[i] = new String(source.UserIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamArraySimple(map, prefix + "UserIds.", this.UserIds);

    }
}

