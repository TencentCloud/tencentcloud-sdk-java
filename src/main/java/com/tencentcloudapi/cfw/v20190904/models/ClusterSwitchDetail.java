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

public class ClusterSwitchDetail extends AbstractModel {

    /**
    * <p>实例对象可以是ccnid类型:ccn-ad21xuds形式;nat网关类型:nat-da12daxd形式;ip类型:1.1.1.1形式等</p>
    */
    @SerializedName("InsObj")
    @Expose
    private String InsObj;

    /**
    * <p>实例对象名称</p>
    */
    @SerializedName("ObjName")
    @Expose
    private String ObjName;

    /**
    * <p>防火墙类型，ew：vpc间防火墙；nat：nat防火墙；border：互联网边界防火墙</p>
    */
    @SerializedName("FwType")
    @Expose
    private String FwType;

    /**
    * <p>资产类型，ccn：ccn实例类型；nat：nat网关类型</p>
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
    * <p>开关状态<br>0 : 关闭<br>1 : 开启<br>2 : 开启中<br>3 : 关闭中<br>4 : 异常</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>开关接入模式，1：自动接入；2，手动接入，0：未选择</p>
    */
    @SerializedName("SwitchMode")
    @Expose
    private Long SwitchMode;

    /**
    * <p>实例对象是否处于非集群接入场景（主备模式）</p>
    */
    @SerializedName("NonCluster")
    @Expose
    private Long NonCluster;

    /**
    * <p>ip版本，0：ipv4；1：ipv6</p>
    */
    @SerializedName("IpVersion")
    @Expose
    private Long IpVersion;

    /**
    * <p>关联实例</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AttachIns")
    @Expose
    private AttachInsInfo [] AttachIns;

    /**
    * <p>引流私有网络端点信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Endpoints")
    @Expose
    private EndpointInfo [] Endpoints;

    /**
    * <p>入侵防护模式,0:观察;1:拦截;2:严格;3:关闭</p>
    */
    @SerializedName("Idpsaction")
    @Expose
    private Long Idpsaction;

    /**
    * <p>//透明模式开关,0:未开启,1:已开启</p>
    */
    @SerializedName("TransEnable")
    @Expose
    private Long TransEnable;

    /**
    * <p>开关状态 0关闭 1开启</p>
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * <p>路由模式：0：多路由表，1：策略路由</p>
    */
    @SerializedName("RoutingMode")
    @Expose
    private Long RoutingMode;

    /**
    * <p>是否跨租户开关 1是 0不是</p>
    */
    @SerializedName("IsPeer")
    @Expose
    private Long IsPeer;

    /**
    * <p>跨租户appid</p>
    */
    @SerializedName("PeerAppid")
    @Expose
    private String PeerAppid;

    /**
    * <p>跨租户操作状态 1不允许操作 0可以</p>
    */
    @SerializedName("PeerStatus")
    @Expose
    private Long PeerStatus;

    /**
    * <p>Bypass状态</p>
    */
    @SerializedName("Bypass")
    @Expose
    private Long Bypass;

    /**
    * <p>防火墙开关操作时的进度状态：</p><p>// 开启 — 自动模式（3步）<br>&quot;AUTO_OPEN_ORCHESTRATING&quot; // 步骤1: 预编排策略路由<br>&quot;AUTO_OPEN_CREATING_RESOURCES&quot; // 步骤2: 创建引流网络和资源<br>&quot;AUTO_OPEN_PUSHING_ROUTES&quot; // 步骤3: 创建策略路由</p><p>// 开启 — 手动模式（1步）<br>&quot;MANUAL_OPEN_CREATING_RESOURCES&quot; // 步骤1: 创建引流网络和资源</p><p>// 关闭 — 自动模式（2步）<br>&quot;AUTO_CLOSE_DELETING_ROUTES&quot; // 步骤1: 删除策略路由<br>&quot;AUTO_CLOSE_DELETING_RESOURCES&quot; // 步骤2: 删除引流网络和资源<br>// 关闭 — 手动模式（1步）<br>&quot;MANUAL_CLOSE_DELETING_RESOURCES&quot; // 步骤1: 删除引流网络和资源</p><p>// 修改 — 自动模式（3步）<br>&quot;AUTO_MODIFY_ORCHESTRATING&quot; // 步骤1: 预编排策略路由<br>&quot;AUTO_MODIFY_DELETING_ROUTES&quot; // 步骤2: 删除旧策略路由<br>&quot;AUTO_MODIFY_PUSHING_ROUTES&quot; // 步骤3: 创建新策略路由</p><p>// 修改 — 手动模式（1步，仅 VPC 防火墙存在手动模式修改）<br>&quot;MANUAL_MODIFY_UPDATING_RESOURCES&quot; // 步骤1: 更新引流网络和资源</p>
    */
    @SerializedName("Progress")
    @Expose
    private String Progress;

    /**
     * Get <p>实例对象可以是ccnid类型:ccn-ad21xuds形式;nat网关类型:nat-da12daxd形式;ip类型:1.1.1.1形式等</p> 
     * @return InsObj <p>实例对象可以是ccnid类型:ccn-ad21xuds形式;nat网关类型:nat-da12daxd形式;ip类型:1.1.1.1形式等</p>
     */
    public String getInsObj() {
        return this.InsObj;
    }

    /**
     * Set <p>实例对象可以是ccnid类型:ccn-ad21xuds形式;nat网关类型:nat-da12daxd形式;ip类型:1.1.1.1形式等</p>
     * @param InsObj <p>实例对象可以是ccnid类型:ccn-ad21xuds形式;nat网关类型:nat-da12daxd形式;ip类型:1.1.1.1形式等</p>
     */
    public void setInsObj(String InsObj) {
        this.InsObj = InsObj;
    }

    /**
     * Get <p>实例对象名称</p> 
     * @return ObjName <p>实例对象名称</p>
     */
    public String getObjName() {
        return this.ObjName;
    }

    /**
     * Set <p>实例对象名称</p>
     * @param ObjName <p>实例对象名称</p>
     */
    public void setObjName(String ObjName) {
        this.ObjName = ObjName;
    }

    /**
     * Get <p>防火墙类型，ew：vpc间防火墙；nat：nat防火墙；border：互联网边界防火墙</p> 
     * @return FwType <p>防火墙类型，ew：vpc间防火墙；nat：nat防火墙；border：互联网边界防火墙</p>
     */
    public String getFwType() {
        return this.FwType;
    }

    /**
     * Set <p>防火墙类型，ew：vpc间防火墙；nat：nat防火墙；border：互联网边界防火墙</p>
     * @param FwType <p>防火墙类型，ew：vpc间防火墙；nat：nat防火墙；border：互联网边界防火墙</p>
     */
    public void setFwType(String FwType) {
        this.FwType = FwType;
    }

    /**
     * Get <p>资产类型，ccn：ccn实例类型；nat：nat网关类型</p> 
     * @return AssetType <p>资产类型，ccn：ccn实例类型；nat：nat网关类型</p>
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set <p>资产类型，ccn：ccn实例类型；nat：nat网关类型</p>
     * @param AssetType <p>资产类型，ccn：ccn实例类型；nat：nat网关类型</p>
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
     * Get <p>开关状态<br>0 : 关闭<br>1 : 开启<br>2 : 开启中<br>3 : 关闭中<br>4 : 异常</p> 
     * @return Status <p>开关状态<br>0 : 关闭<br>1 : 开启<br>2 : 开启中<br>3 : 关闭中<br>4 : 异常</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>开关状态<br>0 : 关闭<br>1 : 开启<br>2 : 开启中<br>3 : 关闭中<br>4 : 异常</p>
     * @param Status <p>开关状态<br>0 : 关闭<br>1 : 开启<br>2 : 开启中<br>3 : 关闭中<br>4 : 异常</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>开关接入模式，1：自动接入；2，手动接入，0：未选择</p> 
     * @return SwitchMode <p>开关接入模式，1：自动接入；2，手动接入，0：未选择</p>
     */
    public Long getSwitchMode() {
        return this.SwitchMode;
    }

    /**
     * Set <p>开关接入模式，1：自动接入；2，手动接入，0：未选择</p>
     * @param SwitchMode <p>开关接入模式，1：自动接入；2，手动接入，0：未选择</p>
     */
    public void setSwitchMode(Long SwitchMode) {
        this.SwitchMode = SwitchMode;
    }

    /**
     * Get <p>实例对象是否处于非集群接入场景（主备模式）</p> 
     * @return NonCluster <p>实例对象是否处于非集群接入场景（主备模式）</p>
     */
    public Long getNonCluster() {
        return this.NonCluster;
    }

    /**
     * Set <p>实例对象是否处于非集群接入场景（主备模式）</p>
     * @param NonCluster <p>实例对象是否处于非集群接入场景（主备模式）</p>
     */
    public void setNonCluster(Long NonCluster) {
        this.NonCluster = NonCluster;
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
     * Get <p>关联实例</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AttachIns <p>关联实例</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AttachInsInfo [] getAttachIns() {
        return this.AttachIns;
    }

    /**
     * Set <p>关联实例</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AttachIns <p>关联实例</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAttachIns(AttachInsInfo [] AttachIns) {
        this.AttachIns = AttachIns;
    }

    /**
     * Get <p>引流私有网络端点信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Endpoints <p>引流私有网络端点信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EndpointInfo [] getEndpoints() {
        return this.Endpoints;
    }

    /**
     * Set <p>引流私有网络端点信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Endpoints <p>引流私有网络端点信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndpoints(EndpointInfo [] Endpoints) {
        this.Endpoints = Endpoints;
    }

    /**
     * Get <p>入侵防护模式,0:观察;1:拦截;2:严格;3:关闭</p> 
     * @return Idpsaction <p>入侵防护模式,0:观察;1:拦截;2:严格;3:关闭</p>
     */
    public Long getIdpsaction() {
        return this.Idpsaction;
    }

    /**
     * Set <p>入侵防护模式,0:观察;1:拦截;2:严格;3:关闭</p>
     * @param Idpsaction <p>入侵防护模式,0:观察;1:拦截;2:严格;3:关闭</p>
     */
    public void setIdpsaction(Long Idpsaction) {
        this.Idpsaction = Idpsaction;
    }

    /**
     * Get <p>//透明模式开关,0:未开启,1:已开启</p> 
     * @return TransEnable <p>//透明模式开关,0:未开启,1:已开启</p>
     */
    public Long getTransEnable() {
        return this.TransEnable;
    }

    /**
     * Set <p>//透明模式开关,0:未开启,1:已开启</p>
     * @param TransEnable <p>//透明模式开关,0:未开启,1:已开启</p>
     */
    public void setTransEnable(Long TransEnable) {
        this.TransEnable = TransEnable;
    }

    /**
     * Get <p>开关状态 0关闭 1开启</p> 
     * @return Enable <p>开关状态 0关闭 1开启</p>
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set <p>开关状态 0关闭 1开启</p>
     * @param Enable <p>开关状态 0关闭 1开启</p>
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get <p>路由模式：0：多路由表，1：策略路由</p> 
     * @return RoutingMode <p>路由模式：0：多路由表，1：策略路由</p>
     */
    public Long getRoutingMode() {
        return this.RoutingMode;
    }

    /**
     * Set <p>路由模式：0：多路由表，1：策略路由</p>
     * @param RoutingMode <p>路由模式：0：多路由表，1：策略路由</p>
     */
    public void setRoutingMode(Long RoutingMode) {
        this.RoutingMode = RoutingMode;
    }

    /**
     * Get <p>是否跨租户开关 1是 0不是</p> 
     * @return IsPeer <p>是否跨租户开关 1是 0不是</p>
     */
    public Long getIsPeer() {
        return this.IsPeer;
    }

    /**
     * Set <p>是否跨租户开关 1是 0不是</p>
     * @param IsPeer <p>是否跨租户开关 1是 0不是</p>
     */
    public void setIsPeer(Long IsPeer) {
        this.IsPeer = IsPeer;
    }

    /**
     * Get <p>跨租户appid</p> 
     * @return PeerAppid <p>跨租户appid</p>
     */
    public String getPeerAppid() {
        return this.PeerAppid;
    }

    /**
     * Set <p>跨租户appid</p>
     * @param PeerAppid <p>跨租户appid</p>
     */
    public void setPeerAppid(String PeerAppid) {
        this.PeerAppid = PeerAppid;
    }

    /**
     * Get <p>跨租户操作状态 1不允许操作 0可以</p> 
     * @return PeerStatus <p>跨租户操作状态 1不允许操作 0可以</p>
     */
    public Long getPeerStatus() {
        return this.PeerStatus;
    }

    /**
     * Set <p>跨租户操作状态 1不允许操作 0可以</p>
     * @param PeerStatus <p>跨租户操作状态 1不允许操作 0可以</p>
     */
    public void setPeerStatus(Long PeerStatus) {
        this.PeerStatus = PeerStatus;
    }

    /**
     * Get <p>Bypass状态</p> 
     * @return Bypass <p>Bypass状态</p>
     */
    public Long getBypass() {
        return this.Bypass;
    }

    /**
     * Set <p>Bypass状态</p>
     * @param Bypass <p>Bypass状态</p>
     */
    public void setBypass(Long Bypass) {
        this.Bypass = Bypass;
    }

    /**
     * Get <p>防火墙开关操作时的进度状态：</p><p>// 开启 — 自动模式（3步）<br>&quot;AUTO_OPEN_ORCHESTRATING&quot; // 步骤1: 预编排策略路由<br>&quot;AUTO_OPEN_CREATING_RESOURCES&quot; // 步骤2: 创建引流网络和资源<br>&quot;AUTO_OPEN_PUSHING_ROUTES&quot; // 步骤3: 创建策略路由</p><p>// 开启 — 手动模式（1步）<br>&quot;MANUAL_OPEN_CREATING_RESOURCES&quot; // 步骤1: 创建引流网络和资源</p><p>// 关闭 — 自动模式（2步）<br>&quot;AUTO_CLOSE_DELETING_ROUTES&quot; // 步骤1: 删除策略路由<br>&quot;AUTO_CLOSE_DELETING_RESOURCES&quot; // 步骤2: 删除引流网络和资源<br>// 关闭 — 手动模式（1步）<br>&quot;MANUAL_CLOSE_DELETING_RESOURCES&quot; // 步骤1: 删除引流网络和资源</p><p>// 修改 — 自动模式（3步）<br>&quot;AUTO_MODIFY_ORCHESTRATING&quot; // 步骤1: 预编排策略路由<br>&quot;AUTO_MODIFY_DELETING_ROUTES&quot; // 步骤2: 删除旧策略路由<br>&quot;AUTO_MODIFY_PUSHING_ROUTES&quot; // 步骤3: 创建新策略路由</p><p>// 修改 — 手动模式（1步，仅 VPC 防火墙存在手动模式修改）<br>&quot;MANUAL_MODIFY_UPDATING_RESOURCES&quot; // 步骤1: 更新引流网络和资源</p> 
     * @return Progress <p>防火墙开关操作时的进度状态：</p><p>// 开启 — 自动模式（3步）<br>&quot;AUTO_OPEN_ORCHESTRATING&quot; // 步骤1: 预编排策略路由<br>&quot;AUTO_OPEN_CREATING_RESOURCES&quot; // 步骤2: 创建引流网络和资源<br>&quot;AUTO_OPEN_PUSHING_ROUTES&quot; // 步骤3: 创建策略路由</p><p>// 开启 — 手动模式（1步）<br>&quot;MANUAL_OPEN_CREATING_RESOURCES&quot; // 步骤1: 创建引流网络和资源</p><p>// 关闭 — 自动模式（2步）<br>&quot;AUTO_CLOSE_DELETING_ROUTES&quot; // 步骤1: 删除策略路由<br>&quot;AUTO_CLOSE_DELETING_RESOURCES&quot; // 步骤2: 删除引流网络和资源<br>// 关闭 — 手动模式（1步）<br>&quot;MANUAL_CLOSE_DELETING_RESOURCES&quot; // 步骤1: 删除引流网络和资源</p><p>// 修改 — 自动模式（3步）<br>&quot;AUTO_MODIFY_ORCHESTRATING&quot; // 步骤1: 预编排策略路由<br>&quot;AUTO_MODIFY_DELETING_ROUTES&quot; // 步骤2: 删除旧策略路由<br>&quot;AUTO_MODIFY_PUSHING_ROUTES&quot; // 步骤3: 创建新策略路由</p><p>// 修改 — 手动模式（1步，仅 VPC 防火墙存在手动模式修改）<br>&quot;MANUAL_MODIFY_UPDATING_RESOURCES&quot; // 步骤1: 更新引流网络和资源</p>
     */
    public String getProgress() {
        return this.Progress;
    }

    /**
     * Set <p>防火墙开关操作时的进度状态：</p><p>// 开启 — 自动模式（3步）<br>&quot;AUTO_OPEN_ORCHESTRATING&quot; // 步骤1: 预编排策略路由<br>&quot;AUTO_OPEN_CREATING_RESOURCES&quot; // 步骤2: 创建引流网络和资源<br>&quot;AUTO_OPEN_PUSHING_ROUTES&quot; // 步骤3: 创建策略路由</p><p>// 开启 — 手动模式（1步）<br>&quot;MANUAL_OPEN_CREATING_RESOURCES&quot; // 步骤1: 创建引流网络和资源</p><p>// 关闭 — 自动模式（2步）<br>&quot;AUTO_CLOSE_DELETING_ROUTES&quot; // 步骤1: 删除策略路由<br>&quot;AUTO_CLOSE_DELETING_RESOURCES&quot; // 步骤2: 删除引流网络和资源<br>// 关闭 — 手动模式（1步）<br>&quot;MANUAL_CLOSE_DELETING_RESOURCES&quot; // 步骤1: 删除引流网络和资源</p><p>// 修改 — 自动模式（3步）<br>&quot;AUTO_MODIFY_ORCHESTRATING&quot; // 步骤1: 预编排策略路由<br>&quot;AUTO_MODIFY_DELETING_ROUTES&quot; // 步骤2: 删除旧策略路由<br>&quot;AUTO_MODIFY_PUSHING_ROUTES&quot; // 步骤3: 创建新策略路由</p><p>// 修改 — 手动模式（1步，仅 VPC 防火墙存在手动模式修改）<br>&quot;MANUAL_MODIFY_UPDATING_RESOURCES&quot; // 步骤1: 更新引流网络和资源</p>
     * @param Progress <p>防火墙开关操作时的进度状态：</p><p>// 开启 — 自动模式（3步）<br>&quot;AUTO_OPEN_ORCHESTRATING&quot; // 步骤1: 预编排策略路由<br>&quot;AUTO_OPEN_CREATING_RESOURCES&quot; // 步骤2: 创建引流网络和资源<br>&quot;AUTO_OPEN_PUSHING_ROUTES&quot; // 步骤3: 创建策略路由</p><p>// 开启 — 手动模式（1步）<br>&quot;MANUAL_OPEN_CREATING_RESOURCES&quot; // 步骤1: 创建引流网络和资源</p><p>// 关闭 — 自动模式（2步）<br>&quot;AUTO_CLOSE_DELETING_ROUTES&quot; // 步骤1: 删除策略路由<br>&quot;AUTO_CLOSE_DELETING_RESOURCES&quot; // 步骤2: 删除引流网络和资源<br>// 关闭 — 手动模式（1步）<br>&quot;MANUAL_CLOSE_DELETING_RESOURCES&quot; // 步骤1: 删除引流网络和资源</p><p>// 修改 — 自动模式（3步）<br>&quot;AUTO_MODIFY_ORCHESTRATING&quot; // 步骤1: 预编排策略路由<br>&quot;AUTO_MODIFY_DELETING_ROUTES&quot; // 步骤2: 删除旧策略路由<br>&quot;AUTO_MODIFY_PUSHING_ROUTES&quot; // 步骤3: 创建新策略路由</p><p>// 修改 — 手动模式（1步，仅 VPC 防火墙存在手动模式修改）<br>&quot;MANUAL_MODIFY_UPDATING_RESOURCES&quot; // 步骤1: 更新引流网络和资源</p>
     */
    public void setProgress(String Progress) {
        this.Progress = Progress;
    }

    public ClusterSwitchDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterSwitchDetail(ClusterSwitchDetail source) {
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
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.SwitchMode != null) {
            this.SwitchMode = new Long(source.SwitchMode);
        }
        if (source.NonCluster != null) {
            this.NonCluster = new Long(source.NonCluster);
        }
        if (source.IpVersion != null) {
            this.IpVersion = new Long(source.IpVersion);
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
        if (source.Idpsaction != null) {
            this.Idpsaction = new Long(source.Idpsaction);
        }
        if (source.TransEnable != null) {
            this.TransEnable = new Long(source.TransEnable);
        }
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
        if (source.RoutingMode != null) {
            this.RoutingMode = new Long(source.RoutingMode);
        }
        if (source.IsPeer != null) {
            this.IsPeer = new Long(source.IsPeer);
        }
        if (source.PeerAppid != null) {
            this.PeerAppid = new String(source.PeerAppid);
        }
        if (source.PeerStatus != null) {
            this.PeerStatus = new Long(source.PeerStatus);
        }
        if (source.Bypass != null) {
            this.Bypass = new Long(source.Bypass);
        }
        if (source.Progress != null) {
            this.Progress = new String(source.Progress);
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
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "SwitchMode", this.SwitchMode);
        this.setParamSimple(map, prefix + "NonCluster", this.NonCluster);
        this.setParamSimple(map, prefix + "IpVersion", this.IpVersion);
        this.setParamArrayObj(map, prefix + "AttachIns.", this.AttachIns);
        this.setParamArrayObj(map, prefix + "Endpoints.", this.Endpoints);
        this.setParamSimple(map, prefix + "Idpsaction", this.Idpsaction);
        this.setParamSimple(map, prefix + "TransEnable", this.TransEnable);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "RoutingMode", this.RoutingMode);
        this.setParamSimple(map, prefix + "IsPeer", this.IsPeer);
        this.setParamSimple(map, prefix + "PeerAppid", this.PeerAppid);
        this.setParamSimple(map, prefix + "PeerStatus", this.PeerStatus);
        this.setParamSimple(map, prefix + "Bypass", this.Bypass);
        this.setParamSimple(map, prefix + "Progress", this.Progress);

    }
}

