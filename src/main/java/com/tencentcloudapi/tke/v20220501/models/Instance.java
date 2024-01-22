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
package com.tencentcloudapi.tke.v20220501.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Instance extends AbstractModel {

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 节点角色, MASTER, WORKER, ETCD, MASTER_ETCD,ALL, 默认为WORKER
    */
    @SerializedName("InstanceRole")
    @Expose
    private String InstanceRole;

    /**
    * 实例异常(或者处于初始化中)的原因
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FailedReason")
    @Expose
    private String FailedReason;

    /**
    * 实例的状态
- initializing创建中
- running 运行中
- failed 异常
    */
    @SerializedName("InstanceState")
    @Expose
    private String InstanceState;

    /**
    * 是否不可调度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Unschedulable")
    @Expose
    private Boolean Unschedulable;

    /**
    * 添加时间
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 节点内网IP
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LanIP")
    @Expose
    private String LanIP;

    /**
    * 资源池ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodePoolId")
    @Expose
    private String NodePoolId;

    /**
    * 原生节点参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Native")
    @Expose
    private NativeNodeInfo Native;

    /**
    * 普通节点参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Regular")
    @Expose
    private RegularNodeInfo Regular;

    /**
    * 超级节点参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Super")
    @Expose
    private SuperNodeInfo Super;

    /**
    * 第三方节点参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("External")
    @Expose
    private ExternalNodeInfo External;

    /**
    * 节点类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 节点角色, MASTER, WORKER, ETCD, MASTER_ETCD,ALL, 默认为WORKER 
     * @return InstanceRole 节点角色, MASTER, WORKER, ETCD, MASTER_ETCD,ALL, 默认为WORKER
     */
    public String getInstanceRole() {
        return this.InstanceRole;
    }

    /**
     * Set 节点角色, MASTER, WORKER, ETCD, MASTER_ETCD,ALL, 默认为WORKER
     * @param InstanceRole 节点角色, MASTER, WORKER, ETCD, MASTER_ETCD,ALL, 默认为WORKER
     */
    public void setInstanceRole(String InstanceRole) {
        this.InstanceRole = InstanceRole;
    }

    /**
     * Get 实例异常(或者处于初始化中)的原因
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FailedReason 实例异常(或者处于初始化中)的原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFailedReason() {
        return this.FailedReason;
    }

    /**
     * Set 实例异常(或者处于初始化中)的原因
注意：此字段可能返回 null，表示取不到有效值。
     * @param FailedReason 实例异常(或者处于初始化中)的原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailedReason(String FailedReason) {
        this.FailedReason = FailedReason;
    }

    /**
     * Get 实例的状态
- initializing创建中
- running 运行中
- failed 异常 
     * @return InstanceState 实例的状态
- initializing创建中
- running 运行中
- failed 异常
     */
    public String getInstanceState() {
        return this.InstanceState;
    }

    /**
     * Set 实例的状态
- initializing创建中
- running 运行中
- failed 异常
     * @param InstanceState 实例的状态
- initializing创建中
- running 运行中
- failed 异常
     */
    public void setInstanceState(String InstanceState) {
        this.InstanceState = InstanceState;
    }

    /**
     * Get 是否不可调度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Unschedulable 是否不可调度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getUnschedulable() {
        return this.Unschedulable;
    }

    /**
     * Set 是否不可调度
注意：此字段可能返回 null，表示取不到有效值。
     * @param Unschedulable 是否不可调度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUnschedulable(Boolean Unschedulable) {
        this.Unschedulable = Unschedulable;
    }

    /**
     * Get 添加时间 
     * @return CreatedTime 添加时间
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 添加时间
     * @param CreatedTime 添加时间
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 节点内网IP
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LanIP 节点内网IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLanIP() {
        return this.LanIP;
    }

    /**
     * Set 节点内网IP
注意：此字段可能返回 null，表示取不到有效值。
     * @param LanIP 节点内网IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLanIP(String LanIP) {
        this.LanIP = LanIP;
    }

    /**
     * Get 资源池ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodePoolId 资源池ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNodePoolId() {
        return this.NodePoolId;
    }

    /**
     * Set 资源池ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodePoolId 资源池ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodePoolId(String NodePoolId) {
        this.NodePoolId = NodePoolId;
    }

    /**
     * Get 原生节点参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Native 原生节点参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NativeNodeInfo getNative() {
        return this.Native;
    }

    /**
     * Set 原生节点参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Native 原生节点参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNative(NativeNodeInfo Native) {
        this.Native = Native;
    }

    /**
     * Get 普通节点参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Regular 普通节点参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RegularNodeInfo getRegular() {
        return this.Regular;
    }

    /**
     * Set 普通节点参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Regular 普通节点参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegular(RegularNodeInfo Regular) {
        this.Regular = Regular;
    }

    /**
     * Get 超级节点参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Super 超级节点参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SuperNodeInfo getSuper() {
        return this.Super;
    }

    /**
     * Set 超级节点参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Super 超级节点参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSuper(SuperNodeInfo Super) {
        this.Super = Super;
    }

    /**
     * Get 第三方节点参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return External 第三方节点参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ExternalNodeInfo getExternal() {
        return this.External;
    }

    /**
     * Set 第三方节点参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param External 第三方节点参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExternal(ExternalNodeInfo External) {
        this.External = External;
    }

    /**
     * Get 节点类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodeType 节点类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set 节点类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodeType 节点类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    public Instance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Instance(Instance source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceRole != null) {
            this.InstanceRole = new String(source.InstanceRole);
        }
        if (source.FailedReason != null) {
            this.FailedReason = new String(source.FailedReason);
        }
        if (source.InstanceState != null) {
            this.InstanceState = new String(source.InstanceState);
        }
        if (source.Unschedulable != null) {
            this.Unschedulable = new Boolean(source.Unschedulable);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.LanIP != null) {
            this.LanIP = new String(source.LanIP);
        }
        if (source.NodePoolId != null) {
            this.NodePoolId = new String(source.NodePoolId);
        }
        if (source.Native != null) {
            this.Native = new NativeNodeInfo(source.Native);
        }
        if (source.Regular != null) {
            this.Regular = new RegularNodeInfo(source.Regular);
        }
        if (source.Super != null) {
            this.Super = new SuperNodeInfo(source.Super);
        }
        if (source.External != null) {
            this.External = new ExternalNodeInfo(source.External);
        }
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceRole", this.InstanceRole);
        this.setParamSimple(map, prefix + "FailedReason", this.FailedReason);
        this.setParamSimple(map, prefix + "InstanceState", this.InstanceState);
        this.setParamSimple(map, prefix + "Unschedulable", this.Unschedulable);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "LanIP", this.LanIP);
        this.setParamSimple(map, prefix + "NodePoolId", this.NodePoolId);
        this.setParamObj(map, prefix + "Native.", this.Native);
        this.setParamObj(map, prefix + "Regular.", this.Regular);
        this.setParamObj(map, prefix + "Super.", this.Super);
        this.setParamObj(map, prefix + "External.", this.External);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);

    }
}

