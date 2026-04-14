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
package com.tencentcloudapi.hai.v20230812.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateServiceConfigsRequest extends AbstractModel {

    /**
    * <p>服务ID</p>
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * <p>期望副本数</p>
    */
    @SerializedName("TargetReplicas")
    @Expose
    private Long TargetReplicas;

    /**
    * <p>启动参数、环境变量等参数</p>
    */
    @SerializedName("DeploymentConfigs")
    @Expose
    private DeploymentConfig [] DeploymentConfigs;

    /**
     * Get <p>服务ID</p> 
     * @return ServiceId <p>服务ID</p>
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set <p>服务ID</p>
     * @param ServiceId <p>服务ID</p>
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get <p>期望副本数</p> 
     * @return TargetReplicas <p>期望副本数</p>
     */
    public Long getTargetReplicas() {
        return this.TargetReplicas;
    }

    /**
     * Set <p>期望副本数</p>
     * @param TargetReplicas <p>期望副本数</p>
     */
    public void setTargetReplicas(Long TargetReplicas) {
        this.TargetReplicas = TargetReplicas;
    }

    /**
     * Get <p>启动参数、环境变量等参数</p> 
     * @return DeploymentConfigs <p>启动参数、环境变量等参数</p>
     */
    public DeploymentConfig [] getDeploymentConfigs() {
        return this.DeploymentConfigs;
    }

    /**
     * Set <p>启动参数、环境变量等参数</p>
     * @param DeploymentConfigs <p>启动参数、环境变量等参数</p>
     */
    public void setDeploymentConfigs(DeploymentConfig [] DeploymentConfigs) {
        this.DeploymentConfigs = DeploymentConfigs;
    }

    public UpdateServiceConfigsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateServiceConfigsRequest(UpdateServiceConfigsRequest source) {
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.TargetReplicas != null) {
            this.TargetReplicas = new Long(source.TargetReplicas);
        }
        if (source.DeploymentConfigs != null) {
            this.DeploymentConfigs = new DeploymentConfig[source.DeploymentConfigs.length];
            for (int i = 0; i < source.DeploymentConfigs.length; i++) {
                this.DeploymentConfigs[i] = new DeploymentConfig(source.DeploymentConfigs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "TargetReplicas", this.TargetReplicas);
        this.setParamArrayObj(map, prefix + "DeploymentConfigs.", this.DeploymentConfigs);

    }
}

