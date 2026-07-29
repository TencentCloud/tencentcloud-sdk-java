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

public class DescribeCloudAppVersionResponse extends AbstractModel {

    /**
    * <p>构建类型</p>
    */
    @SerializedName("BuildType")
    @Expose
    private String BuildType;

    /**
    * <p>构建Id</p>
    */
    @SerializedName("BuildId")
    @Expose
    private String BuildId;

    /**
    * <p>构建状态</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>框架</p>
    */
    @SerializedName("Framework")
    @Expose
    private String Framework;

    /**
    * <p>静态托管配置信息</p>
    */
    @SerializedName("StaticConfig")
    @Expose
    private StaticConfig StaticConfig;

    /**
    * <p>构建时间</p>
    */
    @SerializedName("BuildTime")
    @Expose
    private String BuildTime;

    /**
    * <p>[]BuildStepStatus 的 JSON 序列化</p>
    */
    @SerializedName("Steps")
    @Expose
    private BuildStepStatus [] Steps;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>构建类型</p> 
     * @return BuildType <p>构建类型</p>
     */
    public String getBuildType() {
        return this.BuildType;
    }

    /**
     * Set <p>构建类型</p>
     * @param BuildType <p>构建类型</p>
     */
    public void setBuildType(String BuildType) {
        this.BuildType = BuildType;
    }

    /**
     * Get <p>构建Id</p> 
     * @return BuildId <p>构建Id</p>
     */
    public String getBuildId() {
        return this.BuildId;
    }

    /**
     * Set <p>构建Id</p>
     * @param BuildId <p>构建Id</p>
     */
    public void setBuildId(String BuildId) {
        this.BuildId = BuildId;
    }

    /**
     * Get <p>构建状态</p> 
     * @return Status <p>构建状态</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>构建状态</p>
     * @param Status <p>构建状态</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>框架</p> 
     * @return Framework <p>框架</p>
     */
    public String getFramework() {
        return this.Framework;
    }

    /**
     * Set <p>框架</p>
     * @param Framework <p>框架</p>
     */
    public void setFramework(String Framework) {
        this.Framework = Framework;
    }

    /**
     * Get <p>静态托管配置信息</p> 
     * @return StaticConfig <p>静态托管配置信息</p>
     */
    public StaticConfig getStaticConfig() {
        return this.StaticConfig;
    }

    /**
     * Set <p>静态托管配置信息</p>
     * @param StaticConfig <p>静态托管配置信息</p>
     */
    public void setStaticConfig(StaticConfig StaticConfig) {
        this.StaticConfig = StaticConfig;
    }

    /**
     * Get <p>构建时间</p> 
     * @return BuildTime <p>构建时间</p>
     */
    public String getBuildTime() {
        return this.BuildTime;
    }

    /**
     * Set <p>构建时间</p>
     * @param BuildTime <p>构建时间</p>
     */
    public void setBuildTime(String BuildTime) {
        this.BuildTime = BuildTime;
    }

    /**
     * Get <p>[]BuildStepStatus 的 JSON 序列化</p> 
     * @return Steps <p>[]BuildStepStatus 的 JSON 序列化</p>
     */
    public BuildStepStatus [] getSteps() {
        return this.Steps;
    }

    /**
     * Set <p>[]BuildStepStatus 的 JSON 序列化</p>
     * @param Steps <p>[]BuildStepStatus 的 JSON 序列化</p>
     */
    public void setSteps(BuildStepStatus [] Steps) {
        this.Steps = Steps;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeCloudAppVersionResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCloudAppVersionResponse(DescribeCloudAppVersionResponse source) {
        if (source.BuildType != null) {
            this.BuildType = new String(source.BuildType);
        }
        if (source.BuildId != null) {
            this.BuildId = new String(source.BuildId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Framework != null) {
            this.Framework = new String(source.Framework);
        }
        if (source.StaticConfig != null) {
            this.StaticConfig = new StaticConfig(source.StaticConfig);
        }
        if (source.BuildTime != null) {
            this.BuildTime = new String(source.BuildTime);
        }
        if (source.Steps != null) {
            this.Steps = new BuildStepStatus[source.Steps.length];
            for (int i = 0; i < source.Steps.length; i++) {
                this.Steps[i] = new BuildStepStatus(source.Steps[i]);
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
        this.setParamSimple(map, prefix + "BuildType", this.BuildType);
        this.setParamSimple(map, prefix + "BuildId", this.BuildId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Framework", this.Framework);
        this.setParamObj(map, prefix + "StaticConfig.", this.StaticConfig);
        this.setParamSimple(map, prefix + "BuildTime", this.BuildTime);
        this.setParamArrayObj(map, prefix + "Steps.", this.Steps);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

