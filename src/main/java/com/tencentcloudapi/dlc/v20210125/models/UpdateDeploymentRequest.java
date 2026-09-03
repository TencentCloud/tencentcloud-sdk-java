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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateDeploymentRequest extends AbstractModel {

    /**
    * <p>DeploymentId</p>
    */
    @SerializedName("DeploymentId")
    @Expose
    private String DeploymentId;

    /**
    * <p>模型版本（如 v1, v2），未提供时保持当前版本</p>
    */
    @SerializedName("ModelVersion")
    @Expose
    private String ModelVersion;

    /**
    * <p>推理引擎（vllm）</p>
    */
    @SerializedName("Engine")
    @Expose
    private String Engine;

    /**
    * <p>副本数</p>
    */
    @SerializedName("Replicas")
    @Expose
    private Long Replicas;

    /**
    * <p>是否启用弹性伸缩</p>
    */
    @SerializedName("AutoscalingEnabled")
    @Expose
    private Boolean AutoscalingEnabled;

    /**
     * Get <p>DeploymentId</p> 
     * @return DeploymentId <p>DeploymentId</p>
     */
    public String getDeploymentId() {
        return this.DeploymentId;
    }

    /**
     * Set <p>DeploymentId</p>
     * @param DeploymentId <p>DeploymentId</p>
     */
    public void setDeploymentId(String DeploymentId) {
        this.DeploymentId = DeploymentId;
    }

    /**
     * Get <p>模型版本（如 v1, v2），未提供时保持当前版本</p> 
     * @return ModelVersion <p>模型版本（如 v1, v2），未提供时保持当前版本</p>
     */
    public String getModelVersion() {
        return this.ModelVersion;
    }

    /**
     * Set <p>模型版本（如 v1, v2），未提供时保持当前版本</p>
     * @param ModelVersion <p>模型版本（如 v1, v2），未提供时保持当前版本</p>
     */
    public void setModelVersion(String ModelVersion) {
        this.ModelVersion = ModelVersion;
    }

    /**
     * Get <p>推理引擎（vllm）</p> 
     * @return Engine <p>推理引擎（vllm）</p>
     */
    public String getEngine() {
        return this.Engine;
    }

    /**
     * Set <p>推理引擎（vllm）</p>
     * @param Engine <p>推理引擎（vllm）</p>
     */
    public void setEngine(String Engine) {
        this.Engine = Engine;
    }

    /**
     * Get <p>副本数</p> 
     * @return Replicas <p>副本数</p>
     */
    public Long getReplicas() {
        return this.Replicas;
    }

    /**
     * Set <p>副本数</p>
     * @param Replicas <p>副本数</p>
     */
    public void setReplicas(Long Replicas) {
        this.Replicas = Replicas;
    }

    /**
     * Get <p>是否启用弹性伸缩</p> 
     * @return AutoscalingEnabled <p>是否启用弹性伸缩</p>
     */
    public Boolean getAutoscalingEnabled() {
        return this.AutoscalingEnabled;
    }

    /**
     * Set <p>是否启用弹性伸缩</p>
     * @param AutoscalingEnabled <p>是否启用弹性伸缩</p>
     */
    public void setAutoscalingEnabled(Boolean AutoscalingEnabled) {
        this.AutoscalingEnabled = AutoscalingEnabled;
    }

    public UpdateDeploymentRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateDeploymentRequest(UpdateDeploymentRequest source) {
        if (source.DeploymentId != null) {
            this.DeploymentId = new String(source.DeploymentId);
        }
        if (source.ModelVersion != null) {
            this.ModelVersion = new String(source.ModelVersion);
        }
        if (source.Engine != null) {
            this.Engine = new String(source.Engine);
        }
        if (source.Replicas != null) {
            this.Replicas = new Long(source.Replicas);
        }
        if (source.AutoscalingEnabled != null) {
            this.AutoscalingEnabled = new Boolean(source.AutoscalingEnabled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeploymentId", this.DeploymentId);
        this.setParamSimple(map, prefix + "ModelVersion", this.ModelVersion);
        this.setParamSimple(map, prefix + "Engine", this.Engine);
        this.setParamSimple(map, prefix + "Replicas", this.Replicas);
        this.setParamSimple(map, prefix + "AutoscalingEnabled", this.AutoscalingEnabled);

    }
}

