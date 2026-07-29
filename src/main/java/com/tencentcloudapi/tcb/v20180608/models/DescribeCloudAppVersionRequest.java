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

public class DescribeCloudAppVersionRequest extends AbstractModel {

    /**
    * <p>环境ID</p>
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * <p>服务名</p>
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * <p>部署类型</p>
    */
    @SerializedName("DeployType")
    @Expose
    private String DeployType;

    /**
    * <p>版本名</p>
    */
    @SerializedName("VersionName")
    @Expose
    private String VersionName;

    /**
    * <p>构建id</p>
    */
    @SerializedName("BuildId")
    @Expose
    private String BuildId;

    /**
     * Get <p>环境ID</p> 
     * @return EnvId <p>环境ID</p>
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set <p>环境ID</p>
     * @param EnvId <p>环境ID</p>
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get <p>服务名</p> 
     * @return ServiceName <p>服务名</p>
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set <p>服务名</p>
     * @param ServiceName <p>服务名</p>
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
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
     * Get <p>版本名</p> 
     * @return VersionName <p>版本名</p>
     */
    public String getVersionName() {
        return this.VersionName;
    }

    /**
     * Set <p>版本名</p>
     * @param VersionName <p>版本名</p>
     */
    public void setVersionName(String VersionName) {
        this.VersionName = VersionName;
    }

    /**
     * Get <p>构建id</p> 
     * @return BuildId <p>构建id</p>
     */
    public String getBuildId() {
        return this.BuildId;
    }

    /**
     * Set <p>构建id</p>
     * @param BuildId <p>构建id</p>
     */
    public void setBuildId(String BuildId) {
        this.BuildId = BuildId;
    }

    public DescribeCloudAppVersionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCloudAppVersionRequest(DescribeCloudAppVersionRequest source) {
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.DeployType != null) {
            this.DeployType = new String(source.DeployType);
        }
        if (source.VersionName != null) {
            this.VersionName = new String(source.VersionName);
        }
        if (source.BuildId != null) {
            this.BuildId = new String(source.BuildId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "DeployType", this.DeployType);
        this.setParamSimple(map, prefix + "VersionName", this.VersionName);
        this.setParamSimple(map, prefix + "BuildId", this.BuildId);

    }
}

