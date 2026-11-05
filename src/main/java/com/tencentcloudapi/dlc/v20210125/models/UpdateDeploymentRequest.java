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
    * <p>代码包 URI（可选，未传时从 primary deployment 继承）</p>
    */
    @SerializedName("CodePackageUri")
    @Expose
    private String CodePackageUri;

    /**
    * <p>代码包原始文件名（可选，详情页「代码引用」回显用，仅记录不参与业务逻辑）</p>
    */
    @SerializedName("CodePackageOriginalName")
    @Expose
    private String CodePackageOriginalName;

    /**
    * <p>CR / PodSpec overrides JSON（可选）</p>
    */
    @SerializedName("CrOverrides")
    @Expose
    private String CrOverrides;

    /**
    * <p>Head 节点高可用开关（可选，不传或 true 为开启，仅 false 为关闭；与当前值不同会触发服务重建）</p>
    */
    @SerializedName("HeadHighAvailabilityEnabled")
    @Expose
    private Boolean HeadHighAvailabilityEnabled;

    /**
    * <p>可选：创建时一并挂载的 LoRA 模型版本（首次启动即生效）</p>
    */
    @SerializedName("LoraBindings")
    @Expose
    private LoraAdapterBinding [] LoraBindings;

    /**
    * <p>ray runtime env 字段</p>
    */
    @SerializedName("RuntimeEnv")
    @Expose
    private String RuntimeEnv;

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

    /**
     * Get <p>代码包 URI（可选，未传时从 primary deployment 继承）</p> 
     * @return CodePackageUri <p>代码包 URI（可选，未传时从 primary deployment 继承）</p>
     */
    public String getCodePackageUri() {
        return this.CodePackageUri;
    }

    /**
     * Set <p>代码包 URI（可选，未传时从 primary deployment 继承）</p>
     * @param CodePackageUri <p>代码包 URI（可选，未传时从 primary deployment 继承）</p>
     */
    public void setCodePackageUri(String CodePackageUri) {
        this.CodePackageUri = CodePackageUri;
    }

    /**
     * Get <p>代码包原始文件名（可选，详情页「代码引用」回显用，仅记录不参与业务逻辑）</p> 
     * @return CodePackageOriginalName <p>代码包原始文件名（可选，详情页「代码引用」回显用，仅记录不参与业务逻辑）</p>
     */
    public String getCodePackageOriginalName() {
        return this.CodePackageOriginalName;
    }

    /**
     * Set <p>代码包原始文件名（可选，详情页「代码引用」回显用，仅记录不参与业务逻辑）</p>
     * @param CodePackageOriginalName <p>代码包原始文件名（可选，详情页「代码引用」回显用，仅记录不参与业务逻辑）</p>
     */
    public void setCodePackageOriginalName(String CodePackageOriginalName) {
        this.CodePackageOriginalName = CodePackageOriginalName;
    }

    /**
     * Get <p>CR / PodSpec overrides JSON（可选）</p> 
     * @return CrOverrides <p>CR / PodSpec overrides JSON（可选）</p>
     */
    public String getCrOverrides() {
        return this.CrOverrides;
    }

    /**
     * Set <p>CR / PodSpec overrides JSON（可选）</p>
     * @param CrOverrides <p>CR / PodSpec overrides JSON（可选）</p>
     */
    public void setCrOverrides(String CrOverrides) {
        this.CrOverrides = CrOverrides;
    }

    /**
     * Get <p>Head 节点高可用开关（可选，不传或 true 为开启，仅 false 为关闭；与当前值不同会触发服务重建）</p> 
     * @return HeadHighAvailabilityEnabled <p>Head 节点高可用开关（可选，不传或 true 为开启，仅 false 为关闭；与当前值不同会触发服务重建）</p>
     */
    public Boolean getHeadHighAvailabilityEnabled() {
        return this.HeadHighAvailabilityEnabled;
    }

    /**
     * Set <p>Head 节点高可用开关（可选，不传或 true 为开启，仅 false 为关闭；与当前值不同会触发服务重建）</p>
     * @param HeadHighAvailabilityEnabled <p>Head 节点高可用开关（可选，不传或 true 为开启，仅 false 为关闭；与当前值不同会触发服务重建）</p>
     */
    public void setHeadHighAvailabilityEnabled(Boolean HeadHighAvailabilityEnabled) {
        this.HeadHighAvailabilityEnabled = HeadHighAvailabilityEnabled;
    }

    /**
     * Get <p>可选：创建时一并挂载的 LoRA 模型版本（首次启动即生效）</p> 
     * @return LoraBindings <p>可选：创建时一并挂载的 LoRA 模型版本（首次启动即生效）</p>
     */
    public LoraAdapterBinding [] getLoraBindings() {
        return this.LoraBindings;
    }

    /**
     * Set <p>可选：创建时一并挂载的 LoRA 模型版本（首次启动即生效）</p>
     * @param LoraBindings <p>可选：创建时一并挂载的 LoRA 模型版本（首次启动即生效）</p>
     */
    public void setLoraBindings(LoraAdapterBinding [] LoraBindings) {
        this.LoraBindings = LoraBindings;
    }

    /**
     * Get <p>ray runtime env 字段</p> 
     * @return RuntimeEnv <p>ray runtime env 字段</p>
     */
    public String getRuntimeEnv() {
        return this.RuntimeEnv;
    }

    /**
     * Set <p>ray runtime env 字段</p>
     * @param RuntimeEnv <p>ray runtime env 字段</p>
     */
    public void setRuntimeEnv(String RuntimeEnv) {
        this.RuntimeEnv = RuntimeEnv;
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
        if (source.CodePackageUri != null) {
            this.CodePackageUri = new String(source.CodePackageUri);
        }
        if (source.CodePackageOriginalName != null) {
            this.CodePackageOriginalName = new String(source.CodePackageOriginalName);
        }
        if (source.CrOverrides != null) {
            this.CrOverrides = new String(source.CrOverrides);
        }
        if (source.HeadHighAvailabilityEnabled != null) {
            this.HeadHighAvailabilityEnabled = new Boolean(source.HeadHighAvailabilityEnabled);
        }
        if (source.LoraBindings != null) {
            this.LoraBindings = new LoraAdapterBinding[source.LoraBindings.length];
            for (int i = 0; i < source.LoraBindings.length; i++) {
                this.LoraBindings[i] = new LoraAdapterBinding(source.LoraBindings[i]);
            }
        }
        if (source.RuntimeEnv != null) {
            this.RuntimeEnv = new String(source.RuntimeEnv);
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
        this.setParamSimple(map, prefix + "CodePackageUri", this.CodePackageUri);
        this.setParamSimple(map, prefix + "CodePackageOriginalName", this.CodePackageOriginalName);
        this.setParamSimple(map, prefix + "CrOverrides", this.CrOverrides);
        this.setParamSimple(map, prefix + "HeadHighAvailabilityEnabled", this.HeadHighAvailabilityEnabled);
        this.setParamArrayObj(map, prefix + "LoraBindings.", this.LoraBindings);
        this.setParamSimple(map, prefix + "RuntimeEnv", this.RuntimeEnv);

    }
}

