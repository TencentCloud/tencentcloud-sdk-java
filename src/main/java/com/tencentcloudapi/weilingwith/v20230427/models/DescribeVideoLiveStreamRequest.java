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
package com.tencentcloudapi.weilingwith.v20230427.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVideoLiveStreamRequest extends AbstractModel {

    /**
    * 设备的唯一标识

    */
    @SerializedName("WID")
    @Expose
    private String WID;

    /**
    * 枚举如下：
flv
rtmp
hls
webrtc
raw (视频原始帧)
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 工作空间Id
    */
    @SerializedName("WorkspaceId")
    @Expose
    private Long WorkspaceId;

    /**
    * 应用token
    */
    @SerializedName("ApplicationToken")
    @Expose
    private String ApplicationToken;

    /**
    * 主码流传0，子码流传1，默认主码流

    */
    @SerializedName("StreamId")
    @Expose
    private Long StreamId;

    /**
    * 设备所在环境，公有云私有化项目传0或者不传，混合云项目一般传空间id
    */
    @SerializedName("Env")
    @Expose
    private String Env;

    /**
     * Get 设备的唯一标识
 
     * @return WID 设备的唯一标识

     */
    public String getWID() {
        return this.WID;
    }

    /**
     * Set 设备的唯一标识

     * @param WID 设备的唯一标识

     */
    public void setWID(String WID) {
        this.WID = WID;
    }

    /**
     * Get 枚举如下：
flv
rtmp
hls
webrtc
raw (视频原始帧) 
     * @return Protocol 枚举如下：
flv
rtmp
hls
webrtc
raw (视频原始帧)
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 枚举如下：
flv
rtmp
hls
webrtc
raw (视频原始帧)
     * @param Protocol 枚举如下：
flv
rtmp
hls
webrtc
raw (视频原始帧)
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 工作空间Id 
     * @return WorkspaceId 工作空间Id
     */
    public Long getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set 工作空间Id
     * @param WorkspaceId 工作空间Id
     */
    public void setWorkspaceId(Long WorkspaceId) {
        this.WorkspaceId = WorkspaceId;
    }

    /**
     * Get 应用token 
     * @return ApplicationToken 应用token
     */
    public String getApplicationToken() {
        return this.ApplicationToken;
    }

    /**
     * Set 应用token
     * @param ApplicationToken 应用token
     */
    public void setApplicationToken(String ApplicationToken) {
        this.ApplicationToken = ApplicationToken;
    }

    /**
     * Get 主码流传0，子码流传1，默认主码流
 
     * @return StreamId 主码流传0，子码流传1，默认主码流

     */
    public Long getStreamId() {
        return this.StreamId;
    }

    /**
     * Set 主码流传0，子码流传1，默认主码流

     * @param StreamId 主码流传0，子码流传1，默认主码流

     */
    public void setStreamId(Long StreamId) {
        this.StreamId = StreamId;
    }

    /**
     * Get 设备所在环境，公有云私有化项目传0或者不传，混合云项目一般传空间id 
     * @return Env 设备所在环境，公有云私有化项目传0或者不传，混合云项目一般传空间id
     */
    public String getEnv() {
        return this.Env;
    }

    /**
     * Set 设备所在环境，公有云私有化项目传0或者不传，混合云项目一般传空间id
     * @param Env 设备所在环境，公有云私有化项目传0或者不传，混合云项目一般传空间id
     */
    public void setEnv(String Env) {
        this.Env = Env;
    }

    public DescribeVideoLiveStreamRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVideoLiveStreamRequest(DescribeVideoLiveStreamRequest source) {
        if (source.WID != null) {
            this.WID = new String(source.WID);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new Long(source.WorkspaceId);
        }
        if (source.ApplicationToken != null) {
            this.ApplicationToken = new String(source.ApplicationToken);
        }
        if (source.StreamId != null) {
            this.StreamId = new Long(source.StreamId);
        }
        if (source.Env != null) {
            this.Env = new String(source.Env);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WID", this.WID);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamSimple(map, prefix + "ApplicationToken", this.ApplicationToken);
        this.setParamSimple(map, prefix + "StreamId", this.StreamId);
        this.setParamSimple(map, prefix + "Env", this.Env);

    }
}

