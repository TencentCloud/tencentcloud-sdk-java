/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCloudBaseRunBuildLogRequest extends AbstractModel {

    /**
    * 环境ID
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * 服务名称
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * 版本名称
    */
    @SerializedName("ServiceVersion")
    @Expose
    private String ServiceVersion;

    /**
    * 构建ID
    */
    @SerializedName("BuildId")
    @Expose
    private Long BuildId;

    /**
    * 偏移记录
    */
    @SerializedName("Start")
    @Expose
    private Long Start;

    /**
     * Get 环境ID 
     * @return EnvId 环境ID
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set 环境ID
     * @param EnvId 环境ID
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get 服务名称 
     * @return ServiceName 服务名称
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set 服务名称
     * @param ServiceName 服务名称
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get 版本名称 
     * @return ServiceVersion 版本名称
     */
    public String getServiceVersion() {
        return this.ServiceVersion;
    }

    /**
     * Set 版本名称
     * @param ServiceVersion 版本名称
     */
    public void setServiceVersion(String ServiceVersion) {
        this.ServiceVersion = ServiceVersion;
    }

    /**
     * Get 构建ID 
     * @return BuildId 构建ID
     */
    public Long getBuildId() {
        return this.BuildId;
    }

    /**
     * Set 构建ID
     * @param BuildId 构建ID
     */
    public void setBuildId(Long BuildId) {
        this.BuildId = BuildId;
    }

    /**
     * Get 偏移记录 
     * @return Start 偏移记录
     */
    public Long getStart() {
        return this.Start;
    }

    /**
     * Set 偏移记录
     * @param Start 偏移记录
     */
    public void setStart(Long Start) {
        this.Start = Start;
    }

    public DescribeCloudBaseRunBuildLogRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCloudBaseRunBuildLogRequest(DescribeCloudBaseRunBuildLogRequest source) {
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.ServiceVersion != null) {
            this.ServiceVersion = new String(source.ServiceVersion);
        }
        if (source.BuildId != null) {
            this.BuildId = new Long(source.BuildId);
        }
        if (source.Start != null) {
            this.Start = new Long(source.Start);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "ServiceVersion", this.ServiceVersion);
        this.setParamSimple(map, prefix + "BuildId", this.BuildId);
        this.setParamSimple(map, prefix + "Start", this.Start);

    }
}

