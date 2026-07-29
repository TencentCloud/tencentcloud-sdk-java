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

public class DeleteCloudAppRequest extends AbstractModel {

    /**
    * 环境ID
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * 部署类型
    */
    @SerializedName("DeployType")
    @Expose
    private String DeployType;

    /**
    * 服务名
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

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
     * Get 部署类型 
     * @return DeployType 部署类型
     */
    public String getDeployType() {
        return this.DeployType;
    }

    /**
     * Set 部署类型
     * @param DeployType 部署类型
     */
    public void setDeployType(String DeployType) {
        this.DeployType = DeployType;
    }

    /**
     * Get 服务名 
     * @return ServiceName 服务名
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set 服务名
     * @param ServiceName 服务名
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    public DeleteCloudAppRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteCloudAppRequest(DeleteCloudAppRequest source) {
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.DeployType != null) {
            this.DeployType = new String(source.DeployType);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "DeployType", this.DeployType);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);

    }
}

