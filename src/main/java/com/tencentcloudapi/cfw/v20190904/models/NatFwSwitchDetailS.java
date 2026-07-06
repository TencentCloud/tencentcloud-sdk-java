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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NatFwSwitchDetailS extends AbstractModel {

    /**
    * <p>NAT实例ID</p>
    */
    @SerializedName("InsObj")
    @Expose
    private String InsObj;

    /**
    * <p>实例名称</p>
    */
    @SerializedName("ObjName")
    @Expose
    private String ObjName;

    /**
    * <p>防火墙类型</p>
    */
    @SerializedName("FwType")
    @Expose
    private String FwType;

    /**
    * <p>资产类型，nat-VPC内防护，nat_ccn-CCN集群模式</p>
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * <p>地域</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>开关接入模式，1-自动接入，2-手动接入</p>
    */
    @SerializedName("SwitchMode")
    @Expose
    private Long SwitchMode;

    /**
    * <p>引流路由方法，0-多路由表，1-策略路由</p>
    */
    @SerializedName("RoutingMode")
    @Expose
    private Long RoutingMode;

    /**
    * <p>开关状态，0-未开启，1-已开启，2-开启中，3-关闭中</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>ip版本，0：ipv4；1：ipv6</p>
    */
    @SerializedName("IpVersion")
    @Expose
    private Long IpVersion;

    /**
    * <p>是否非集群模式，0-集群模式，1-非集群模式</p>
    */
    @SerializedName("NonCluster")
    @Expose
    private Long NonCluster;

    /**
    * <p>入侵防御动作</p>
    */
    @SerializedName("IpsAction")
    @Expose
    private Long IpsAction;

    /**
    * <p>流量监控开关</p>
    */
    @SerializedName("TransEnable")
    @Expose
    private Long TransEnable;

    /**
    * <p>Bypass状态，0-关闭，1-开启</p>
    */
    @SerializedName("Bypass")
    @Expose
    private Long Bypass;

    /**
    * <p>关联ID，nat_ccn资产类型时为云联网实例ID, nat资产类型时为空</p>
    */
    @SerializedName("AttachId")
    @Expose
    private String AttachId;

    /**
    * <p>关联ID的实例名称，nat_ccn资产类型时为云联网名称</p>
    */
    @SerializedName("AttachName")
    @Expose
    private String AttachName;

    /**
    * <p>NAT防火墙所在VPC ID</p>
    */
    @SerializedName("NatVpcId")
    @Expose
    private String NatVpcId;

    /**
    * <p>NAT防火墙所在VPC的VPC名称</p>
    */
    @SerializedName("NatVpcName")
    @Expose
    private String NatVpcName;

    /**
    * <p>CCN关联实例列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AttachIns")
    @Expose
    private AttachInsInfo [] AttachIns;

    /**
    * <p>终端节点列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Endpoints")
    @Expose
    private EndpointInfo [] Endpoints;

    /**
    * <p>防火墙开关操作时的进度状态：</p><p>// 开启 — 自动模式（3步）<br>&quot;AUTO_OPEN_ORCHESTRATING&quot;      // 步骤1: 预编排策略路由<br>&quot;AUTO_OPEN_CREATING_RESOURCES&quot; // 步骤2: 创建引流网络和资源<br>&quot;AUTO_OPEN_PUSHING_ROUTES&quot;     // 步骤3: 创建策略路由</p><p>// 开启 — 手动模式（1步）<br>&quot;MANUAL_OPEN_CREATING_RESOURCES&quot; // 步骤1: 创建引流网络和资源</p><p>// 关闭 — 自动模式（2步）<br>&quot;AUTO_CLOSE_DELETING_ROUTES&quot;    // 步骤1: 删除策略路由<br>&quot;AUTO_CLOSE_DELETING_RESOURCES&quot; // 步骤2: 删除引流网络和资源<br>// 关闭 — 手动模式（1步）<br>&quot;MANUAL_CLOSE_DELETING_RESOURCES&quot; // 步骤1: 删除引流网络和资源</p><p>// 修改 — 自动模式（3步）<br>&quot;AUTO_MODIFY_ORCHESTRATING&quot;   // 步骤1: 预编排策略路由<br>&quot;AUTO_MODIFY_DELETING_ROUTES&quot; // 步骤2: 删除旧策略路由<br>&quot;AUTO_MODIFY_PUSHING_ROUTES&quot;  // 步骤3: 创建新策略路由</p><p>// 修改 — 手动模式（1步，仅 VPC 防火墙存在手动模式修改）<br>&quot;MANUAL_MODIFY_UPDATING_RESOURCES&quot; // 步骤1: 更新引流网络和资源</p>
    */
    @SerializedName("Progress")
    @Expose
    private String Progress;

    /**
    * <p>预接入检查结果</p>
    */
    @SerializedName("CheckResult")
    @Expose
    private ClusterFwPreAccessCheckResult CheckResult;

    /**
     * Get <p>NAT实例ID</p> 
     * @return InsObj <p>NAT实例ID</p>
     */
    public String getInsObj() {
        return this.InsObj;
    }

    /**
     * Set <p>NAT实例ID</p>
     * @param InsObj <p>NAT实例ID</p>
     */
    public void setInsObj(String InsObj) {
        this.InsObj = InsObj;
    }

    /**
     * Get <p>实例名称</p> 
     * @return ObjName <p>实例名称</p>
     */
    public String getObjName() {
        return this.ObjName;
    }

    /**
     * Set <p>实例名称</p>
     * @param ObjName <p>实例名称</p>
     */
    public void setObjName(String ObjName) {
        this.ObjName = ObjName;
    }

    /**
     * Get <p>防火墙类型</p> 
     * @return FwType <p>防火墙类型</p>
     */
    public String getFwType() {
        return this.FwType;
    }

    /**
     * Set <p>防火墙类型</p>
     * @param FwType <p>防火墙类型</p>
     */
    public void setFwType(String FwType) {
        this.FwType = FwType;
    }

    /**
     * Get <p>资产类型，nat-VPC内防护，nat_ccn-CCN集群模式</p> 
     * @return AssetType <p>资产类型，nat-VPC内防护，nat_ccn-CCN集群模式</p>
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set <p>资产类型，nat-VPC内防护，nat_ccn-CCN集群模式</p>
     * @param AssetType <p>资产类型，nat-VPC内防护，nat_ccn-CCN集群模式</p>
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get <p>地域</p> 
     * @return Region <p>地域</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>地域</p>
     * @param Region <p>地域</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>开关接入模式，1-自动接入，2-手动接入</p> 
     * @return SwitchMode <p>开关接入模式，1-自动接入，2-手动接入</p>
     */
    public Long getSwitchMode() {
        return this.SwitchMode;
    }

    /**
     * Set <p>开关接入模式，1-自动接入，2-手动接入</p>
     * @param SwitchMode <p>开关接入模式，1-自动接入，2-手动接入</p>
     */
    public void setSwitchMode(Long SwitchMode) {
        this.SwitchMode = SwitchMode;
    }

    /**
     * Get <p>引流路由方法，0-多路由表，1-策略路由</p> 
     * @return RoutingMode <p>引流路由方法，0-多路由表，1-策略路由</p>
     */
    public Long getRoutingMode() {
        return this.RoutingMode;
    }

    /**
     * Set <p>引流路由方法，0-多路由表，1-策略路由</p>
     * @param RoutingMode <p>引流路由方法，0-多路由表，1-策略路由</p>
     */
    public void setRoutingMode(Long RoutingMode) {
        this.RoutingMode = RoutingMode;
    }

    /**
     * Get <p>开关状态，0-未开启，1-已开启，2-开启中，3-关闭中</p> 
     * @return Status <p>开关状态，0-未开启，1-已开启，2-开启中，3-关闭中</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>开关状态，0-未开启，1-已开启，2-开启中，3-关闭中</p>
     * @param Status <p>开关状态，0-未开启，1-已开启，2-开启中，3-关闭中</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>ip版本，0：ipv4；1：ipv6</p> 
     * @return IpVersion <p>ip版本，0：ipv4；1：ipv6</p>
     */
    public Long getIpVersion() {
        return this.IpVersion;
    }

    /**
     * Set <p>ip版本，0：ipv4；1：ipv6</p>
     * @param IpVersion <p>ip版本，0：ipv4；1：ipv6</p>
     */
    public void setIpVersion(Long IpVersion) {
        this.IpVersion = IpVersion;
    }

    /**
     * Get <p>是否非集群模式，0-集群模式，1-非集群模式</p> 
     * @return NonCluster <p>是否非集群模式，0-集群模式，1-非集群模式</p>
     */
    public Long getNonCluster() {
        return this.NonCluster;
    }

    /**
     * Set <p>是否非集群模式，0-集群模式，1-非集群模式</p>
     * @param NonCluster <p>是否非集群模式，0-集群模式，1-非集群模式</p>
     */
    public void setNonCluster(Long NonCluster) {
        this.NonCluster = NonCluster;
    }

    /**
     * Get <p>入侵防御动作</p> 
     * @return IpsAction <p>入侵防御动作</p>
     */
    public Long getIpsAction() {
        return this.IpsAction;
    }

    /**
     * Set <p>入侵防御动作</p>
     * @param IpsAction <p>入侵防御动作</p>
     */
    public void setIpsAction(Long IpsAction) {
        this.IpsAction = IpsAction;
    }

    /**
     * Get <p>流量监控开关</p> 
     * @return TransEnable <p>流量监控开关</p>
     */
    public Long getTransEnable() {
        return this.TransEnable;
    }

    /**
     * Set <p>流量监控开关</p>
     * @param TransEnable <p>流量监控开关</p>
     */
    public void setTransEnable(Long TransEnable) {
        this.TransEnable = TransEnable;
    }

    /**
     * Get <p>Bypass状态，0-关闭，1-开启</p> 
     * @return Bypass <p>Bypass状态，0-关闭，1-开启</p>
     */
    public Long getBypass() {
        return this.Bypass;
    }

    /**
     * Set <p>Bypass状态，0-关闭，1-开启</p>
     * @param Bypass <p>Bypass状态，0-关闭，1-开启</p>
     */
    public void setBypass(Long Bypass) {
        this.Bypass = Bypass;
    }

    /**
     * Get <p>关联ID，nat_ccn资产类型时为云联网实例ID, nat资产类型时为空</p> 
     * @return AttachId <p>关联ID，nat_ccn资产类型时为云联网实例ID, nat资产类型时为空</p>
     */
    public String getAttachId() {
        return this.AttachId;
    }

    /**
     * Set <p>关联ID，nat_ccn资产类型时为云联网实例ID, nat资产类型时为空</p>
     * @param AttachId <p>关联ID，nat_ccn资产类型时为云联网实例ID, nat资产类型时为空</p>
     */
    public void setAttachId(String AttachId) {
        this.AttachId = AttachId;
    }

    /**
     * Get <p>关联ID的实例名称，nat_ccn资产类型时为云联网名称</p> 
     * @return AttachName <p>关联ID的实例名称，nat_ccn资产类型时为云联网名称</p>
     */
    public String getAttachName() {
        return this.AttachName;
    }

    /**
     * Set <p>关联ID的实例名称，nat_ccn资产类型时为云联网名称</p>
     * @param AttachName <p>关联ID的实例名称，nat_ccn资产类型时为云联网名称</p>
     */
    public void setAttachName(String AttachName) {
        this.AttachName = AttachName;
    }

    /**
     * Get <p>NAT防火墙所在VPC ID</p> 
     * @return NatVpcId <p>NAT防火墙所在VPC ID</p>
     */
    public String getNatVpcId() {
        return this.NatVpcId;
    }

    /**
     * Set <p>NAT防火墙所在VPC ID</p>
     * @param NatVpcId <p>NAT防火墙所在VPC ID</p>
     */
    public void setNatVpcId(String NatVpcId) {
        this.NatVpcId = NatVpcId;
    }

    /**
     * Get <p>NAT防火墙所在VPC的VPC名称</p> 
     * @return NatVpcName <p>NAT防火墙所在VPC的VPC名称</p>
     */
    public String getNatVpcName() {
        return this.NatVpcName;
    }

    /**
     * Set <p>NAT防火墙所在VPC的VPC名称</p>
     * @param NatVpcName <p>NAT防火墙所在VPC的VPC名称</p>
     */
    public void setNatVpcName(String NatVpcName) {
        this.NatVpcName = NatVpcName;
    }

    /**
     * Get <p>CCN关联实例列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AttachIns <p>CCN关联实例列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AttachInsInfo [] getAttachIns() {
        return this.AttachIns;
    }

    /**
     * Set <p>CCN关联实例列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AttachIns <p>CCN关联实例列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAttachIns(AttachInsInfo [] AttachIns) {
        this.AttachIns = AttachIns;
    }

    /**
     * Get <p>终端节点列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Endpoints <p>终端节点列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EndpointInfo [] getEndpoints() {
        return this.Endpoints;
    }

    /**
     * Set <p>终端节点列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Endpoints <p>终端节点列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndpoints(EndpointInfo [] Endpoints) {
        this.Endpoints = Endpoints;
    }

    /**
     * Get <p>防火墙开关操作时的进度状态：</p><p>// 开启 — 自动模式（3步）<br>&quot;AUTO_OPEN_ORCHESTRATING&quot;      // 步骤1: 预编排策略路由<br>&quot;AUTO_OPEN_CREATING_RESOURCES&quot; // 步骤2: 创建引流网络和资源<br>&quot;AUTO_OPEN_PUSHING_ROUTES&quot;     // 步骤3: 创建策略路由</p><p>// 开启 — 手动模式（1步）<br>&quot;MANUAL_OPEN_CREATING_RESOURCES&quot; // 步骤1: 创建引流网络和资源</p><p>// 关闭 — 自动模式（2步）<br>&quot;AUTO_CLOSE_DELETING_ROUTES&quot;    // 步骤1: 删除策略路由<br>&quot;AUTO_CLOSE_DELETING_RESOURCES&quot; // 步骤2: 删除引流网络和资源<br>// 关闭 — 手动模式（1步）<br>&quot;MANUAL_CLOSE_DELETING_RESOURCES&quot; // 步骤1: 删除引流网络和资源</p><p>// 修改 — 自动模式（3步）<br>&quot;AUTO_MODIFY_ORCHESTRATING&quot;   // 步骤1: 预编排策略路由<br>&quot;AUTO_MODIFY_DELETING_ROUTES&quot; // 步骤2: 删除旧策略路由<br>&quot;AUTO_MODIFY_PUSHING_ROUTES&quot;  // 步骤3: 创建新策略路由</p><p>// 修改 — 手动模式（1步，仅 VPC 防火墙存在手动模式修改）<br>&quot;MANUAL_MODIFY_UPDATING_RESOURCES&quot; // 步骤1: 更新引流网络和资源</p> 
     * @return Progress <p>防火墙开关操作时的进度状态：</p><p>// 开启 — 自动模式（3步）<br>&quot;AUTO_OPEN_ORCHESTRATING&quot;      // 步骤1: 预编排策略路由<br>&quot;AUTO_OPEN_CREATING_RESOURCES&quot; // 步骤2: 创建引流网络和资源<br>&quot;AUTO_OPEN_PUSHING_ROUTES&quot;     // 步骤3: 创建策略路由</p><p>// 开启 — 手动模式（1步）<br>&quot;MANUAL_OPEN_CREATING_RESOURCES&quot; // 步骤1: 创建引流网络和资源</p><p>// 关闭 — 自动模式（2步）<br>&quot;AUTO_CLOSE_DELETING_ROUTES&quot;    // 步骤1: 删除策略路由<br>&quot;AUTO_CLOSE_DELETING_RESOURCES&quot; // 步骤2: 删除引流网络和资源<br>// 关闭 — 手动模式（1步）<br>&quot;MANUAL_CLOSE_DELETING_RESOURCES&quot; // 步骤1: 删除引流网络和资源</p><p>// 修改 — 自动模式（3步）<br>&quot;AUTO_MODIFY_ORCHESTRATING&quot;   // 步骤1: 预编排策略路由<br>&quot;AUTO_MODIFY_DELETING_ROUTES&quot; // 步骤2: 删除旧策略路由<br>&quot;AUTO_MODIFY_PUSHING_ROUTES&quot;  // 步骤3: 创建新策略路由</p><p>// 修改 — 手动模式（1步，仅 VPC 防火墙存在手动模式修改）<br>&quot;MANUAL_MODIFY_UPDATING_RESOURCES&quot; // 步骤1: 更新引流网络和资源</p>
     */
    public String getProgress() {
        return this.Progress;
    }

    /**
     * Set <p>防火墙开关操作时的进度状态：</p><p>// 开启 — 自动模式（3步）<br>&quot;AUTO_OPEN_ORCHESTRATING&quot;      // 步骤1: 预编排策略路由<br>&quot;AUTO_OPEN_CREATING_RESOURCES&quot; // 步骤2: 创建引流网络和资源<br>&quot;AUTO_OPEN_PUSHING_ROUTES&quot;     // 步骤3: 创建策略路由</p><p>// 开启 — 手动模式（1步）<br>&quot;MANUAL_OPEN_CREATING_RESOURCES&quot; // 步骤1: 创建引流网络和资源</p><p>// 关闭 — 自动模式（2步）<br>&quot;AUTO_CLOSE_DELETING_ROUTES&quot;    // 步骤1: 删除策略路由<br>&quot;AUTO_CLOSE_DELETING_RESOURCES&quot; // 步骤2: 删除引流网络和资源<br>// 关闭 — 手动模式（1步）<br>&quot;MANUAL_CLOSE_DELETING_RESOURCES&quot; // 步骤1: 删除引流网络和资源</p><p>// 修改 — 自动模式（3步）<br>&quot;AUTO_MODIFY_ORCHESTRATING&quot;   // 步骤1: 预编排策略路由<br>&quot;AUTO_MODIFY_DELETING_ROUTES&quot; // 步骤2: 删除旧策略路由<br>&quot;AUTO_MODIFY_PUSHING_ROUTES&quot;  // 步骤3: 创建新策略路由</p><p>// 修改 — 手动模式（1步，仅 VPC 防火墙存在手动模式修改）<br>&quot;MANUAL_MODIFY_UPDATING_RESOURCES&quot; // 步骤1: 更新引流网络和资源</p>
     * @param Progress <p>防火墙开关操作时的进度状态：</p><p>// 开启 — 自动模式（3步）<br>&quot;AUTO_OPEN_ORCHESTRATING&quot;      // 步骤1: 预编排策略路由<br>&quot;AUTO_OPEN_CREATING_RESOURCES&quot; // 步骤2: 创建引流网络和资源<br>&quot;AUTO_OPEN_PUSHING_ROUTES&quot;     // 步骤3: 创建策略路由</p><p>// 开启 — 手动模式（1步）<br>&quot;MANUAL_OPEN_CREATING_RESOURCES&quot; // 步骤1: 创建引流网络和资源</p><p>// 关闭 — 自动模式（2步）<br>&quot;AUTO_CLOSE_DELETING_ROUTES&quot;    // 步骤1: 删除策略路由<br>&quot;AUTO_CLOSE_DELETING_RESOURCES&quot; // 步骤2: 删除引流网络和资源<br>// 关闭 — 手动模式（1步）<br>&quot;MANUAL_CLOSE_DELETING_RESOURCES&quot; // 步骤1: 删除引流网络和资源</p><p>// 修改 — 自动模式（3步）<br>&quot;AUTO_MODIFY_ORCHESTRATING&quot;   // 步骤1: 预编排策略路由<br>&quot;AUTO_MODIFY_DELETING_ROUTES&quot; // 步骤2: 删除旧策略路由<br>&quot;AUTO_MODIFY_PUSHING_ROUTES&quot;  // 步骤3: 创建新策略路由</p><p>// 修改 — 手动模式（1步，仅 VPC 防火墙存在手动模式修改）<br>&quot;MANUAL_MODIFY_UPDATING_RESOURCES&quot; // 步骤1: 更新引流网络和资源</p>
     */
    public void setProgress(String Progress) {
        this.Progress = Progress;
    }

    /**
     * Get <p>预接入检查结果</p> 
     * @return CheckResult <p>预接入检查结果</p>
     */
    public ClusterFwPreAccessCheckResult getCheckResult() {
        return this.CheckResult;
    }

    /**
     * Set <p>预接入检查结果</p>
     * @param CheckResult <p>预接入检查结果</p>
     */
    public void setCheckResult(ClusterFwPreAccessCheckResult CheckResult) {
        this.CheckResult = CheckResult;
    }

    public NatFwSwitchDetailS() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NatFwSwitchDetailS(NatFwSwitchDetailS source) {
        if (source.InsObj != null) {
            this.InsObj = new String(source.InsObj);
        }
        if (source.ObjName != null) {
            this.ObjName = new String(source.ObjName);
        }
        if (source.FwType != null) {
            this.FwType = new String(source.FwType);
        }
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.SwitchMode != null) {
            this.SwitchMode = new Long(source.SwitchMode);
        }
        if (source.RoutingMode != null) {
            this.RoutingMode = new Long(source.RoutingMode);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.IpVersion != null) {
            this.IpVersion = new Long(source.IpVersion);
        }
        if (source.NonCluster != null) {
            this.NonCluster = new Long(source.NonCluster);
        }
        if (source.IpsAction != null) {
            this.IpsAction = new Long(source.IpsAction);
        }
        if (source.TransEnable != null) {
            this.TransEnable = new Long(source.TransEnable);
        }
        if (source.Bypass != null) {
            this.Bypass = new Long(source.Bypass);
        }
        if (source.AttachId != null) {
            this.AttachId = new String(source.AttachId);
        }
        if (source.AttachName != null) {
            this.AttachName = new String(source.AttachName);
        }
        if (source.NatVpcId != null) {
            this.NatVpcId = new String(source.NatVpcId);
        }
        if (source.NatVpcName != null) {
            this.NatVpcName = new String(source.NatVpcName);
        }
        if (source.AttachIns != null) {
            this.AttachIns = new AttachInsInfo[source.AttachIns.length];
            for (int i = 0; i < source.AttachIns.length; i++) {
                this.AttachIns[i] = new AttachInsInfo(source.AttachIns[i]);
            }
        }
        if (source.Endpoints != null) {
            this.Endpoints = new EndpointInfo[source.Endpoints.length];
            for (int i = 0; i < source.Endpoints.length; i++) {
                this.Endpoints[i] = new EndpointInfo(source.Endpoints[i]);
            }
        }
        if (source.Progress != null) {
            this.Progress = new String(source.Progress);
        }
        if (source.CheckResult != null) {
            this.CheckResult = new ClusterFwPreAccessCheckResult(source.CheckResult);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InsObj", this.InsObj);
        this.setParamSimple(map, prefix + "ObjName", this.ObjName);
        this.setParamSimple(map, prefix + "FwType", this.FwType);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "SwitchMode", this.SwitchMode);
        this.setParamSimple(map, prefix + "RoutingMode", this.RoutingMode);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "IpVersion", this.IpVersion);
        this.setParamSimple(map, prefix + "NonCluster", this.NonCluster);
        this.setParamSimple(map, prefix + "IpsAction", this.IpsAction);
        this.setParamSimple(map, prefix + "TransEnable", this.TransEnable);
        this.setParamSimple(map, prefix + "Bypass", this.Bypass);
        this.setParamSimple(map, prefix + "AttachId", this.AttachId);
        this.setParamSimple(map, prefix + "AttachName", this.AttachName);
        this.setParamSimple(map, prefix + "NatVpcId", this.NatVpcId);
        this.setParamSimple(map, prefix + "NatVpcName", this.NatVpcName);
        this.setParamArrayObj(map, prefix + "AttachIns.", this.AttachIns);
        this.setParamArrayObj(map, prefix + "Endpoints.", this.Endpoints);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamObj(map, prefix + "CheckResult.", this.CheckResult);

    }
}

