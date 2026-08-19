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
    * <p>服务id</p>
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * <p>服务名称</p>
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * <p>服务状态</p>
    */
    @SerializedName("ServiceState")
    @Expose
    private String ServiceState;

    /**
    * <p>运行中的副本数</p>
    */
    @SerializedName("RunningReplicas")
    @Expose
    private Long RunningReplicas;

    /**
    * <p>期望的副本总数</p>
    */
    @SerializedName("TotalReplicas")
    @Expose
    private Long TotalReplicas;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>算力套餐详情</p>
    */
    @SerializedName("ComputeSet")
    @Expose
    private ComputeDetail [] ComputeSet;

    /**
    * <p>模型名称</p>
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * <p>服务部署信息</p>
    */
    @SerializedName("DeploymentConfigs")
    @Expose
    private DeploymentConfig [] DeploymentConfigs;

    /**
    * <p>服务超参数配置</p>
    */
    @SerializedName("HyperParam")
    @Expose
    private HyperParam HyperParam;

    /**
    * <p>安全类型</p>
    */
    @SerializedName("SecurityType")
    @Expose
    private String SecurityType;

    /**
    * <p>角色算力配置列表</p>
    */
    @SerializedName("RoleComputeSet")
    @Expose
    private ComputeDetail [] RoleComputeSet;

    /**
    * <p>目标副本数</p>
    */
    @SerializedName("TargetReplicas")
    @Expose
    private Long TargetReplicas;

    /**
    * <p>计费类型：POSTPAID_BY_HOUR(按量)/PREPAID_BY_MONTH(包月)</p>
    */
    @SerializedName("ChargeType")
    @Expose
    private String ChargeType;

    /**
    * <p>到期时间(包月)，按量为空</p>
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * <p>自动续费标识(包月)</p>
    */
    @SerializedName("RenewFlag")
    @Expose
    private String RenewFlag;

    /**
    * <p>受限状态(如欠费隔离)</p>
    */
    @SerializedName("RestrictState")
    @Expose
    private String RestrictState;

    /**
    * <p>是否自定义部署：1是 0否</p>
    */
    @SerializedName("IsCustomDeploy")
    @Expose
    private Long IsCustomDeploy;

    /**
     * Get <p>服务id</p> 
     * @return ServiceId <p>服务id</p>
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set <p>服务id</p>
     * @param ServiceId <p>服务id</p>
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

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
     * Get <p>服务状态</p> 
     * @return ServiceState <p>服务状态</p>
     */
    public String getServiceState() {
        return this.ServiceState;
    }

    /**
     * Set <p>服务状态</p>
     * @param ServiceState <p>服务状态</p>
     */
    public void setServiceState(String ServiceState) {
        this.ServiceState = ServiceState;
    }

    /**
     * Get <p>运行中的副本数</p> 
     * @return RunningReplicas <p>运行中的副本数</p>
     */
    public Long getRunningReplicas() {
        return this.RunningReplicas;
    }

    /**
     * Set <p>运行中的副本数</p>
     * @param RunningReplicas <p>运行中的副本数</p>
     */
    public void setRunningReplicas(Long RunningReplicas) {
        this.RunningReplicas = RunningReplicas;
    }

    /**
     * Get <p>期望的副本总数</p> 
     * @return TotalReplicas <p>期望的副本总数</p>
     */
    public Long getTotalReplicas() {
        return this.TotalReplicas;
    }

    /**
     * Set <p>期望的副本总数</p>
     * @param TotalReplicas <p>期望的副本总数</p>
     */
    public void setTotalReplicas(Long TotalReplicas) {
        this.TotalReplicas = TotalReplicas;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreateTime <p>创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreateTime <p>创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>算力套餐详情</p> 
     * @return ComputeSet <p>算力套餐详情</p>
     */
    public ComputeDetail [] getComputeSet() {
        return this.ComputeSet;
    }

    /**
     * Set <p>算力套餐详情</p>
     * @param ComputeSet <p>算力套餐详情</p>
     */
    public void setComputeSet(ComputeDetail [] ComputeSet) {
        this.ComputeSet = ComputeSet;
    }

    /**
     * Get <p>模型名称</p> 
     * @return ModelName <p>模型名称</p>
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set <p>模型名称</p>
     * @param ModelName <p>模型名称</p>
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get <p>服务部署信息</p> 
     * @return DeploymentConfigs <p>服务部署信息</p>
     */
    public DeploymentConfig [] getDeploymentConfigs() {
        return this.DeploymentConfigs;
    }

    /**
     * Set <p>服务部署信息</p>
     * @param DeploymentConfigs <p>服务部署信息</p>
     */
    public void setDeploymentConfigs(DeploymentConfig [] DeploymentConfigs) {
        this.DeploymentConfigs = DeploymentConfigs;
    }

    /**
     * Get <p>服务超参数配置</p> 
     * @return HyperParam <p>服务超参数配置</p>
     */
    public HyperParam getHyperParam() {
        return this.HyperParam;
    }

    /**
     * Set <p>服务超参数配置</p>
     * @param HyperParam <p>服务超参数配置</p>
     */
    public void setHyperParam(HyperParam HyperParam) {
        this.HyperParam = HyperParam;
    }

    /**
     * Get <p>安全类型</p> 
     * @return SecurityType <p>安全类型</p>
     */
    public String getSecurityType() {
        return this.SecurityType;
    }

    /**
     * Set <p>安全类型</p>
     * @param SecurityType <p>安全类型</p>
     */
    public void setSecurityType(String SecurityType) {
        this.SecurityType = SecurityType;
    }

    /**
     * Get <p>角色算力配置列表</p> 
     * @return RoleComputeSet <p>角色算力配置列表</p>
     */
    public ComputeDetail [] getRoleComputeSet() {
        return this.RoleComputeSet;
    }

    /**
     * Set <p>角色算力配置列表</p>
     * @param RoleComputeSet <p>角色算力配置列表</p>
     */
    public void setRoleComputeSet(ComputeDetail [] RoleComputeSet) {
        this.RoleComputeSet = RoleComputeSet;
    }

    /**
     * Get <p>目标副本数</p> 
     * @return TargetReplicas <p>目标副本数</p>
     */
    public Long getTargetReplicas() {
        return this.TargetReplicas;
    }

    /**
     * Set <p>目标副本数</p>
     * @param TargetReplicas <p>目标副本数</p>
     */
    public void setTargetReplicas(Long TargetReplicas) {
        this.TargetReplicas = TargetReplicas;
    }

    /**
     * Get <p>计费类型：POSTPAID_BY_HOUR(按量)/PREPAID_BY_MONTH(包月)</p> 
     * @return ChargeType <p>计费类型：POSTPAID_BY_HOUR(按量)/PREPAID_BY_MONTH(包月)</p>
     */
    public String getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set <p>计费类型：POSTPAID_BY_HOUR(按量)/PREPAID_BY_MONTH(包月)</p>
     * @param ChargeType <p>计费类型：POSTPAID_BY_HOUR(按量)/PREPAID_BY_MONTH(包月)</p>
     */
    public void setChargeType(String ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get <p>到期时间(包月)，按量为空</p> 
     * @return ExpireTime <p>到期时间(包月)，按量为空</p>
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set <p>到期时间(包月)，按量为空</p>
     * @param ExpireTime <p>到期时间(包月)，按量为空</p>
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get <p>自动续费标识(包月)</p> 
     * @return RenewFlag <p>自动续费标识(包月)</p>
     */
    public String getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set <p>自动续费标识(包月)</p>
     * @param RenewFlag <p>自动续费标识(包月)</p>
     */
    public void setRenewFlag(String RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get <p>受限状态(如欠费隔离)</p> 
     * @return RestrictState <p>受限状态(如欠费隔离)</p>
     */
    public String getRestrictState() {
        return this.RestrictState;
    }

    /**
     * Set <p>受限状态(如欠费隔离)</p>
     * @param RestrictState <p>受限状态(如欠费隔离)</p>
     */
    public void setRestrictState(String RestrictState) {
        this.RestrictState = RestrictState;
    }

    /**
     * Get <p>是否自定义部署：1是 0否</p> 
     * @return IsCustomDeploy <p>是否自定义部署：1是 0否</p>
     */
    public Long getIsCustomDeploy() {
        return this.IsCustomDeploy;
    }

    /**
     * Set <p>是否自定义部署：1是 0否</p>
     * @param IsCustomDeploy <p>是否自定义部署：1是 0否</p>
     */
    public void setIsCustomDeploy(Long IsCustomDeploy) {
        this.IsCustomDeploy = IsCustomDeploy;
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
        if (source.SecurityType != null) {
            this.SecurityType = new String(source.SecurityType);
        }
        if (source.RoleComputeSet != null) {
            this.RoleComputeSet = new ComputeDetail[source.RoleComputeSet.length];
            for (int i = 0; i < source.RoleComputeSet.length; i++) {
                this.RoleComputeSet[i] = new ComputeDetail(source.RoleComputeSet[i]);
            }
        }
        if (source.TargetReplicas != null) {
            this.TargetReplicas = new Long(source.TargetReplicas);
        }
        if (source.ChargeType != null) {
            this.ChargeType = new String(source.ChargeType);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new String(source.RenewFlag);
        }
        if (source.RestrictState != null) {
            this.RestrictState = new String(source.RestrictState);
        }
        if (source.IsCustomDeploy != null) {
            this.IsCustomDeploy = new Long(source.IsCustomDeploy);
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
        this.setParamSimple(map, prefix + "SecurityType", this.SecurityType);
        this.setParamArrayObj(map, prefix + "RoleComputeSet.", this.RoleComputeSet);
        this.setParamSimple(map, prefix + "TargetReplicas", this.TargetReplicas);
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "RestrictState", this.RestrictState);
        this.setParamSimple(map, prefix + "IsCustomDeploy", this.IsCustomDeploy);

    }
}

