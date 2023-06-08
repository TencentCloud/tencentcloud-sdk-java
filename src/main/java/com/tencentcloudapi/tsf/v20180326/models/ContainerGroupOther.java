/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ContainerGroupOther extends AbstractModel{

    /**
    * 实例总数
    */
    @SerializedName("InstanceNum")
    @Expose
    private Long InstanceNum;

    /**
    * 已启动实例总数
    */
    @SerializedName("CurrentNum")
    @Expose
    private Long CurrentNum;

    /**
    * 负载均衡ip
    */
    @SerializedName("LbIp")
    @Expose
    private String LbIp;

    /**
    * Service ip
    */
    @SerializedName("ClusterIp")
    @Expose
    private String ClusterIp;

    /**
    * 服务状态，请参考后面的的状态定义
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 服务状态，请参考后面的的状态定义
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 环境变量
    */
    @SerializedName("Envs")
    @Expose
    private Env [] Envs;

    /**
    * Service NodePort
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodePort")
    @Expose
    private Long NodePort;

    /**
    * 子网ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 健康检查相关字段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HealthCheckSettings")
    @Expose
    private HealthCheckSettings HealthCheckSettings;

    /**
    * 服务配置信息是否匹配
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsNotEqualServiceConfig")
    @Expose
    private Boolean IsNotEqualServiceConfig;

    /**
     * Get 实例总数 
     * @return InstanceNum 实例总数
     */
    public Long getInstanceNum() {
        return this.InstanceNum;
    }

    /**
     * Set 实例总数
     * @param InstanceNum 实例总数
     */
    public void setInstanceNum(Long InstanceNum) {
        this.InstanceNum = InstanceNum;
    }

    /**
     * Get 已启动实例总数 
     * @return CurrentNum 已启动实例总数
     */
    public Long getCurrentNum() {
        return this.CurrentNum;
    }

    /**
     * Set 已启动实例总数
     * @param CurrentNum 已启动实例总数
     */
    public void setCurrentNum(Long CurrentNum) {
        this.CurrentNum = CurrentNum;
    }

    /**
     * Get 负载均衡ip 
     * @return LbIp 负载均衡ip
     */
    public String getLbIp() {
        return this.LbIp;
    }

    /**
     * Set 负载均衡ip
     * @param LbIp 负载均衡ip
     */
    public void setLbIp(String LbIp) {
        this.LbIp = LbIp;
    }

    /**
     * Get Service ip 
     * @return ClusterIp Service ip
     */
    public String getClusterIp() {
        return this.ClusterIp;
    }

    /**
     * Set Service ip
     * @param ClusterIp Service ip
     */
    public void setClusterIp(String ClusterIp) {
        this.ClusterIp = ClusterIp;
    }

    /**
     * Get 服务状态，请参考后面的的状态定义 
     * @return Status 服务状态，请参考后面的的状态定义
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 服务状态，请参考后面的的状态定义
     * @param Status 服务状态，请参考后面的的状态定义
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 服务状态，请参考后面的的状态定义 
     * @return Message 服务状态，请参考后面的的状态定义
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 服务状态，请参考后面的的状态定义
     * @param Message 服务状态，请参考后面的的状态定义
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 环境变量 
     * @return Envs 环境变量
     */
    public Env [] getEnvs() {
        return this.Envs;
    }

    /**
     * Set 环境变量
     * @param Envs 环境变量
     */
    public void setEnvs(Env [] Envs) {
        this.Envs = Envs;
    }

    /**
     * Get Service NodePort
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodePort Service NodePort
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNodePort() {
        return this.NodePort;
    }

    /**
     * Set Service NodePort
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodePort Service NodePort
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodePort(Long NodePort) {
        this.NodePort = NodePort;
    }

    /**
     * Get 子网ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubnetId 子网ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubnetId 子网ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 健康检查相关字段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HealthCheckSettings 健康检查相关字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public HealthCheckSettings getHealthCheckSettings() {
        return this.HealthCheckSettings;
    }

    /**
     * Set 健康检查相关字段
注意：此字段可能返回 null，表示取不到有效值。
     * @param HealthCheckSettings 健康检查相关字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHealthCheckSettings(HealthCheckSettings HealthCheckSettings) {
        this.HealthCheckSettings = HealthCheckSettings;
    }

    /**
     * Get 服务配置信息是否匹配
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsNotEqualServiceConfig 服务配置信息是否匹配
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsNotEqualServiceConfig() {
        return this.IsNotEqualServiceConfig;
    }

    /**
     * Set 服务配置信息是否匹配
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsNotEqualServiceConfig 服务配置信息是否匹配
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsNotEqualServiceConfig(Boolean IsNotEqualServiceConfig) {
        this.IsNotEqualServiceConfig = IsNotEqualServiceConfig;
    }

    public ContainerGroupOther() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ContainerGroupOther(ContainerGroupOther source) {
        if (source.InstanceNum != null) {
            this.InstanceNum = new Long(source.InstanceNum);
        }
        if (source.CurrentNum != null) {
            this.CurrentNum = new Long(source.CurrentNum);
        }
        if (source.LbIp != null) {
            this.LbIp = new String(source.LbIp);
        }
        if (source.ClusterIp != null) {
            this.ClusterIp = new String(source.ClusterIp);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.Envs != null) {
            this.Envs = new Env[source.Envs.length];
            for (int i = 0; i < source.Envs.length; i++) {
                this.Envs[i] = new Env(source.Envs[i]);
            }
        }
        if (source.NodePort != null) {
            this.NodePort = new Long(source.NodePort);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.HealthCheckSettings != null) {
            this.HealthCheckSettings = new HealthCheckSettings(source.HealthCheckSettings);
        }
        if (source.IsNotEqualServiceConfig != null) {
            this.IsNotEqualServiceConfig = new Boolean(source.IsNotEqualServiceConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceNum", this.InstanceNum);
        this.setParamSimple(map, prefix + "CurrentNum", this.CurrentNum);
        this.setParamSimple(map, prefix + "LbIp", this.LbIp);
        this.setParamSimple(map, prefix + "ClusterIp", this.ClusterIp);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamArrayObj(map, prefix + "Envs.", this.Envs);
        this.setParamSimple(map, prefix + "NodePort", this.NodePort);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamObj(map, prefix + "HealthCheckSettings.", this.HealthCheckSettings);
        this.setParamSimple(map, prefix + "IsNotEqualServiceConfig", this.IsNotEqualServiceConfig);

    }
}

