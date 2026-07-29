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

public class DescribeCloudAppInfoResponse extends AbstractModel {

    /**
    * <p>服务名称</p>
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * <p>框架名称</p>
    */
    @SerializedName("Framework")
    @Expose
    private String Framework;

    /**
    * <p>域名</p>
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * <p>构建路径</p>
    */
    @SerializedName("AppPath")
    @Expose
    private String AppPath;

    /**
    * <p>服务创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>最新版本名</p>
    */
    @SerializedName("LatestVersionName")
    @Expose
    private String LatestVersionName;

    /**
    * <p>最新版本状态</p>
    */
    @SerializedName("LatestStatus")
    @Expose
    private String LatestStatus;

    /**
    * <p>最新版本构建时间</p>
    */
    @SerializedName("LatestBuildTime")
    @Expose
    private String LatestBuildTime;

    /**
    * <p>部署类型</p>
    */
    @SerializedName("DeployType")
    @Expose
    private String DeployType;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>服务名称</p> 
     * @return ServiceName <p>服务名称</p>
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set <p>服务名称</p>
     * @param ServiceName <p>服务名称</p>
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get <p>框架名称</p> 
     * @return Framework <p>框架名称</p>
     */
    public String getFramework() {
        return this.Framework;
    }

    /**
     * Set <p>框架名称</p>
     * @param Framework <p>框架名称</p>
     */
    public void setFramework(String Framework) {
        this.Framework = Framework;
    }

    /**
     * Get <p>域名</p> 
     * @return Domain <p>域名</p>
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set <p>域名</p>
     * @param Domain <p>域名</p>
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get <p>构建路径</p> 
     * @return AppPath <p>构建路径</p>
     */
    public String getAppPath() {
        return this.AppPath;
    }

    /**
     * Set <p>构建路径</p>
     * @param AppPath <p>构建路径</p>
     */
    public void setAppPath(String AppPath) {
        this.AppPath = AppPath;
    }

    /**
     * Get <p>服务创建时间</p> 
     * @return CreateTime <p>服务创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>服务创建时间</p>
     * @param CreateTime <p>服务创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>最新版本名</p> 
     * @return LatestVersionName <p>最新版本名</p>
     */
    public String getLatestVersionName() {
        return this.LatestVersionName;
    }

    /**
     * Set <p>最新版本名</p>
     * @param LatestVersionName <p>最新版本名</p>
     */
    public void setLatestVersionName(String LatestVersionName) {
        this.LatestVersionName = LatestVersionName;
    }

    /**
     * Get <p>最新版本状态</p> 
     * @return LatestStatus <p>最新版本状态</p>
     */
    public String getLatestStatus() {
        return this.LatestStatus;
    }

    /**
     * Set <p>最新版本状态</p>
     * @param LatestStatus <p>最新版本状态</p>
     */
    public void setLatestStatus(String LatestStatus) {
        this.LatestStatus = LatestStatus;
    }

    /**
     * Get <p>最新版本构建时间</p> 
     * @return LatestBuildTime <p>最新版本构建时间</p>
     */
    public String getLatestBuildTime() {
        return this.LatestBuildTime;
    }

    /**
     * Set <p>最新版本构建时间</p>
     * @param LatestBuildTime <p>最新版本构建时间</p>
     */
    public void setLatestBuildTime(String LatestBuildTime) {
        this.LatestBuildTime = LatestBuildTime;
    }

    /**
     * Get <p>部署类型</p> 
     * @return DeployType <p>部署类型</p>
     */
    public String getDeployType() {
        return this.DeployType;
    }

    /**
     * Set <p>部署类型</p>
     * @param DeployType <p>部署类型</p>
     */
    public void setDeployType(String DeployType) {
        this.DeployType = DeployType;
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

    public DescribeCloudAppInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCloudAppInfoResponse(DescribeCloudAppInfoResponse source) {
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.Framework != null) {
            this.Framework = new String(source.Framework);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.AppPath != null) {
            this.AppPath = new String(source.AppPath);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.LatestVersionName != null) {
            this.LatestVersionName = new String(source.LatestVersionName);
        }
        if (source.LatestStatus != null) {
            this.LatestStatus = new String(source.LatestStatus);
        }
        if (source.LatestBuildTime != null) {
            this.LatestBuildTime = new String(source.LatestBuildTime);
        }
        if (source.DeployType != null) {
            this.DeployType = new String(source.DeployType);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "Framework", this.Framework);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "AppPath", this.AppPath);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "LatestVersionName", this.LatestVersionName);
        this.setParamSimple(map, prefix + "LatestStatus", this.LatestStatus);
        this.setParamSimple(map, prefix + "LatestBuildTime", this.LatestBuildTime);
        this.setParamSimple(map, prefix + "DeployType", this.DeployType);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

