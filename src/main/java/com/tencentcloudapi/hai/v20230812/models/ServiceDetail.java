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

public class ServiceDetail extends AbstractModel {

    /**
    * 服务id
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * 服务名称
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * 服务状态
    */
    @SerializedName("ServiceState")
    @Expose
    private String ServiceState;

    /**
    * 运行中的副本数
    */
    @SerializedName("RunningReplicas")
    @Expose
    private Long RunningReplicas;

    /**
    * 期望的副本总数
    */
    @SerializedName("TotalReplicas")
    @Expose
    private Long TotalReplicas;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 算力套餐详情
    */
    @SerializedName("ComputeSet")
    @Expose
    private ComputeDetail [] ComputeSet;

    /**
    * 模型名称
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * 服务部署信息
    */
    @SerializedName("DeploymentConfigs")
    @Expose
    private DeploymentConfig [] DeploymentConfigs;

    /**
    * 服务超参数配置
    */
    @SerializedName("HyperParam")
    @Expose
    private HyperParam HyperParam;

    /**
     * Get 服务id 
     * @return ServiceId 服务id
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set 服务id
     * @param ServiceId 服务id
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
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
     * Get 服务状态 
     * @return ServiceState 服务状态
     */
    public String getServiceState() {
        return this.ServiceState;
    }

    /**
     * Set 服务状态
     * @param ServiceState 服务状态
     */
    public void setServiceState(String ServiceState) {
        this.ServiceState = ServiceState;
    }

    /**
     * Get 运行中的副本数 
     * @return RunningReplicas 运行中的副本数
     */
    public Long getRunningReplicas() {
        return this.RunningReplicas;
    }

    /**
     * Set 运行中的副本数
     * @param RunningReplicas 运行中的副本数
     */
    public void setRunningReplicas(Long RunningReplicas) {
        this.RunningReplicas = RunningReplicas;
    }

    /**
     * Get 期望的副本总数 
     * @return TotalReplicas 期望的副本总数
     */
    public Long getTotalReplicas() {
        return this.TotalReplicas;
    }

    /**
     * Set 期望的副本总数
     * @param TotalReplicas 期望的副本总数
     */
    public void setTotalReplicas(Long TotalReplicas) {
        this.TotalReplicas = TotalReplicas;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 算力套餐详情 
     * @return ComputeSet 算力套餐详情
     */
    public ComputeDetail [] getComputeSet() {
        return this.ComputeSet;
    }

    /**
     * Set 算力套餐详情
     * @param ComputeSet 算力套餐详情
     */
    public void setComputeSet(ComputeDetail [] ComputeSet) {
        this.ComputeSet = ComputeSet;
    }

    /**
     * Get 模型名称 
     * @return ModelName 模型名称
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set 模型名称
     * @param ModelName 模型名称
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get 服务部署信息 
     * @return DeploymentConfigs 服务部署信息
     */
    public DeploymentConfig [] getDeploymentConfigs() {
        return this.DeploymentConfigs;
    }

    /**
     * Set 服务部署信息
     * @param DeploymentConfigs 服务部署信息
     */
    public void setDeploymentConfigs(DeploymentConfig [] DeploymentConfigs) {
        this.DeploymentConfigs = DeploymentConfigs;
    }

    /**
     * Get 服务超参数配置 
     * @return HyperParam 服务超参数配置
     */
    public HyperParam getHyperParam() {
        return this.HyperParam;
    }

    /**
     * Set 服务超参数配置
     * @param HyperParam 服务超参数配置
     */
    public void setHyperParam(HyperParam HyperParam) {
        this.HyperParam = HyperParam;
    }

    public ServiceDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServiceDetail(ServiceDetail source) {
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.ServiceState != null) {
            this.ServiceState = new String(source.ServiceState);
        }
        if (source.RunningReplicas != null) {
            this.RunningReplicas = new Long(source.RunningReplicas);
        }
        if (source.TotalReplicas != null) {
            this.TotalReplicas = new Long(source.TotalReplicas);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ComputeSet != null) {
            this.ComputeSet = new ComputeDetail[source.ComputeSet.length];
            for (int i = 0; i < source.ComputeSet.length; i++) {
                this.ComputeSet[i] = new ComputeDetail(source.ComputeSet[i]);
            }
        }
        if (source.ModelName != null) {
            this.ModelName = new String(source.ModelName);
        }
        if (source.DeploymentConfigs != null) {
            this.DeploymentConfigs = new DeploymentConfig[source.DeploymentConfigs.length];
            for (int i = 0; i < source.DeploymentConfigs.length; i++) {
                this.DeploymentConfigs[i] = new DeploymentConfig(source.DeploymentConfigs[i]);
            }
        }
        if (source.HyperParam != null) {
            this.HyperParam = new HyperParam(source.HyperParam);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "ServiceState", this.ServiceState);
        this.setParamSimple(map, prefix + "RunningReplicas", this.RunningReplicas);
        this.setParamSimple(map, prefix + "TotalReplicas", this.TotalReplicas);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamArrayObj(map, prefix + "ComputeSet.", this.ComputeSet);
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);
        this.setParamArrayObj(map, prefix + "DeploymentConfigs.", this.DeploymentConfigs);
        this.setParamObj(map, prefix + "HyperParam.", this.HyperParam);

    }
}

