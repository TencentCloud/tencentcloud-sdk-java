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
package com.tencentcloudapi.ump.v20200918.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeConfigResponse extends AbstractModel{

    /**
    * 会话ID
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * 配置版本号
    */
    @SerializedName("Version")
    @Expose
    private Long Version;

    /**
    * 摄像头列表
    */
    @SerializedName("Cameras")
    @Expose
    private CameraConfig [] Cameras;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 会话ID 
     * @return SessionId 会话ID
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set 会话ID
     * @param SessionId 会话ID
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get 配置版本号 
     * @return Version 配置版本号
     */
    public Long getVersion() {
        return this.Version;
    }

    /**
     * Set 配置版本号
     * @param Version 配置版本号
     */
    public void setVersion(Long Version) {
        this.Version = Version;
    }

    /**
     * Get 摄像头列表 
     * @return Cameras 摄像头列表
     */
    public CameraConfig [] getCameras() {
        return this.Cameras;
    }

    /**
     * Set 摄像头列表
     * @param Cameras 摄像头列表
     */
    public void setCameras(CameraConfig [] Cameras) {
        this.Cameras = Cameras;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeConfigResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeConfigResponse(DescribeConfigResponse source) {
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.Version != null) {
            this.Version = new Long(source.Version);
        }
        if (source.Cameras != null) {
            this.Cameras = new CameraConfig[source.Cameras.length];
            for (int i = 0; i < source.Cameras.length; i++) {
                this.Cameras[i] = new CameraConfig(source.Cameras[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamArrayObj(map, prefix + "Cameras.", this.Cameras);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

