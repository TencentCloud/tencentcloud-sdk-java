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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeImageManifestsResponse extends AbstractModel{

    /**
    * 镜像的Manifest信息
    */
    @SerializedName("Manifest")
    @Expose
    private String Manifest;

    /**
    * 镜像的配置信息
    */
    @SerializedName("Config")
    @Expose
    private String Config;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 镜像的Manifest信息 
     * @return Manifest 镜像的Manifest信息
     */
    public String getManifest() {
        return this.Manifest;
    }

    /**
     * Set 镜像的Manifest信息
     * @param Manifest 镜像的Manifest信息
     */
    public void setManifest(String Manifest) {
        this.Manifest = Manifest;
    }

    /**
     * Get 镜像的配置信息 
     * @return Config 镜像的配置信息
     */
    public String getConfig() {
        return this.Config;
    }

    /**
     * Set 镜像的配置信息
     * @param Config 镜像的配置信息
     */
    public void setConfig(String Config) {
        this.Config = Config;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Manifest", this.Manifest);
        this.setParamSimple(map, prefix + "Config", this.Config);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

