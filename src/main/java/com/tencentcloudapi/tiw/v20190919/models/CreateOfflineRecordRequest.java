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
package com.tencentcloudapi.tiw.v20190919.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateOfflineRecordRequest extends AbstractModel{

    /**
    * 客户的SdkAppId
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * 录制任务对应的房间号
    */
    @SerializedName("RoomId")
    @Expose
    private Long RoomId;

    /**
    * 录制任务对应的群组Id
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 混流参数配置
目前课后录制暂未支持自定义混流布局Custom参数
    */
    @SerializedName("MixStream")
    @Expose
    private MixStream MixStream;

    /**
    * 白板参数配置
    */
    @SerializedName("Whiteboard")
    @Expose
    private Whiteboard Whiteboard;

    /**
     * Get 客户的SdkAppId 
     * @return SdkAppId 客户的SdkAppId
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set 客户的SdkAppId
     * @param SdkAppId 客户的SdkAppId
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get 录制任务对应的房间号 
     * @return RoomId 录制任务对应的房间号
     */
    public Long getRoomId() {
        return this.RoomId;
    }

    /**
     * Set 录制任务对应的房间号
     * @param RoomId 录制任务对应的房间号
     */
    public void setRoomId(Long RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get 录制任务对应的群组Id 
     * @return GroupId 录制任务对应的群组Id
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 录制任务对应的群组Id
     * @param GroupId 录制任务对应的群组Id
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 混流参数配置
目前课后录制暂未支持自定义混流布局Custom参数 
     * @return MixStream 混流参数配置
目前课后录制暂未支持自定义混流布局Custom参数
     */
    public MixStream getMixStream() {
        return this.MixStream;
    }

    /**
     * Set 混流参数配置
目前课后录制暂未支持自定义混流布局Custom参数
     * @param MixStream 混流参数配置
目前课后录制暂未支持自定义混流布局Custom参数
     */
    public void setMixStream(MixStream MixStream) {
        this.MixStream = MixStream;
    }

    /**
     * Get 白板参数配置 
     * @return Whiteboard 白板参数配置
     */
    public Whiteboard getWhiteboard() {
        return this.Whiteboard;
    }

    /**
     * Set 白板参数配置
     * @param Whiteboard 白板参数配置
     */
    public void setWhiteboard(Whiteboard Whiteboard) {
        this.Whiteboard = Whiteboard;
    }

    public CreateOfflineRecordRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateOfflineRecordRequest(CreateOfflineRecordRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.RoomId != null) {
            this.RoomId = new Long(source.RoomId);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.MixStream != null) {
            this.MixStream = new MixStream(source.MixStream);
        }
        if (source.Whiteboard != null) {
            this.Whiteboard = new Whiteboard(source.Whiteboard);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamObj(map, prefix + "MixStream.", this.MixStream);
        this.setParamObj(map, prefix + "Whiteboard.", this.Whiteboard);

    }
}

