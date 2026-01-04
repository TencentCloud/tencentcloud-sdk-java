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
    * 实例对象可以是ccnid类型:ccn-ad21xuds形式;nat网关类型:nat-da12daxd形式;ip类型:1.1.1.1形式等
    */
    @SerializedName("InsObj")
    @Expose
    private String InsObj;

    /**
    * 实例对象名称
    */
    @SerializedName("ObjName")
    @Expose
    private String ObjName;

    /**
    * 防火墙类型，ew：vpc间防火墙；nat：nat防火墙；border：互联网边界防火墙
    */
    @SerializedName("FwType")
    @Expose
    private String FwType;

    /**
    * 资产类型，ccn：ccn实例类型；nat：nat网关类型
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * 地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 开关状态
0 : 关闭
1 : 开启
2 : 开启中
3 : 关闭中
4 : 异常
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 开关接入模式，1：自动接入；2，手动接入，0：未选择
    */
    @SerializedName("SwitchMode")
    @Expose
    private Long SwitchMode;

    /**
    * 实例对象是否处于非集群接入场景（主备模式）
    */
    @SerializedName("NonCluster")
    @Expose
    private Long NonCluster;

    /**
    * ip版本，0：ipv4；1：ipv6
    */
    @SerializedName("IpVersion")
    @Expose
    private Long IpVersion;

    /**
    * 关联实例
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AttachIns")
    @Expose
    private AttachInsInfo [] AttachIns;

    /**
    * 引流私有网络端点信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Endpoints")
    @Expose
    private EndpointInfo [] Endpoints;

    /**
    * 入侵防护模式,0:观察;1:拦截;2:严格;3:关闭
    */
    @SerializedName("Idpsaction")
    @Expose
    private Long Idpsaction;

    /**
    * //透明模式开关,0:未开启,1:已开启
    */
    @SerializedName("TransEnable")
    @Expose
    private Long TransEnable;

    /**
    * 开关状态 0关闭 1开启
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * 路由模式：0：多路由表，1：策略路由
    */
    @SerializedName("RoutingMode")
    @Expose
    private Long RoutingMode;

    /**
    * 是否跨租户开关 1是 0不是
    */
    @SerializedName("IsPeer")
    @Expose
    private Long IsPeer;

    /**
    * 跨租户appid
    */
    @SerializedName("PeerAppid")
    @Expose
    private String PeerAppid;

    /**
    * 跨租户操作状态 1不允许操作 0可以
    */
    @SerializedName("PeerStatus")
    @Expose
    private Long PeerStatus;

    /**
     * Get 实例对象可以是ccnid类型:ccn-ad21xuds形式;nat网关类型:nat-da12daxd形式;ip类型:1.1.1.1形式等 
     * @return InsObj 实例对象可以是ccnid类型:ccn-ad21xuds形式;nat网关类型:nat-da12daxd形式;ip类型:1.1.1.1形式等
     */
    public String getInsObj() {
        return this.InsObj;
    }

    /**
     * Set 实例对象可以是ccnid类型:ccn-ad21xuds形式;nat网关类型:nat-da12daxd形式;ip类型:1.1.1.1形式等
     * @param InsObj 实例对象可以是ccnid类型:ccn-ad21xuds形式;nat网关类型:nat-da12daxd形式;ip类型:1.1.1.1形式等
     */
    public void setInsObj(String InsObj) {
        this.InsObj = InsObj;
    }

    /**
     * Get 实例对象名称 
     * @return ObjName 实例对象名称
     */
    public String getObjName() {
        return this.ObjName;
    }

    /**
     * Set 实例对象名称
     * @param ObjName 实例对象名称
     */
    public void setObjName(String ObjName) {
        this.ObjName = ObjName;
    }

    /**
     * Get 防火墙类型，ew：vpc间防火墙；nat：nat防火墙；border：互联网边界防火墙 
     * @return FwType 防火墙类型，ew：vpc间防火墙；nat：nat防火墙；border：互联网边界防火墙
     */
    public String getFwType() {
        return this.FwType;
    }

    /**
     * Set 防火墙类型，ew：vpc间防火墙；nat：nat防火墙；border：互联网边界防火墙
     * @param FwType 防火墙类型，ew：vpc间防火墙；nat：nat防火墙；border：互联网边界防火墙
     */
    public void setFwType(String FwType) {
        this.FwType = FwType;
    }

    /**
     * Get 资产类型，ccn：ccn实例类型；nat：nat网关类型 
     * @return AssetType 资产类型，ccn：ccn实例类型；nat：nat网关类型
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set 资产类型，ccn：ccn实例类型；nat：nat网关类型
     * @param AssetType 资产类型，ccn：ccn实例类型；nat：nat网关类型
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get 地域 
     * @return Region 地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域
     * @param Region 地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 开关状态
0 : 关闭
1 : 开启
2 : 开启中
3 : 关闭中
4 : 异常 
     * @return Status 开关状态
0 : 关闭
1 : 开启
2 : 开启中
3 : 关闭中
4 : 异常
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 开关状态
0 : 关闭
1 : 开启
2 : 开启中
3 : 关闭中
4 : 异常
     * @param Status 开关状态
0 : 关闭
1 : 开启
2 : 开启中
3 : 关闭中
4 : 异常
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 开关接入模式，1：自动接入；2，手动接入，0：未选择 
     * @return SwitchMode 开关接入模式，1：自动接入；2，手动接入，0：未选择
     */
    public Long getSwitchMode() {
        return this.SwitchMode;
    }

    /**
     * Set 开关接入模式，1：自动接入；2，手动接入，0：未选择
     * @param SwitchMode 开关接入模式，1：自动接入；2，手动接入，0：未选择
     */
    public void setSwitchMode(Long SwitchMode) {
        this.SwitchMode = SwitchMode;
    }

    /**
     * Get 实例对象是否处于非集群接入场景（主备模式） 
     * @return NonCluster 实例对象是否处于非集群接入场景（主备模式）
     */
    public Long getNonCluster() {
        return this.NonCluster;
    }

    /**
     * Set 实例对象是否处于非集群接入场景（主备模式）
     * @param NonCluster 实例对象是否处于非集群接入场景（主备模式）
     */
    public void setNonCluster(Long NonCluster) {
        this.NonCluster = NonCluster;
    }

    /**
     * Get ip版本，0：ipv4；1：ipv6 
     * @return IpVersion ip版本，0：ipv4；1：ipv6
     */
    public Long getIpVersion() {
        return this.IpVersion;
    }

    /**
     * Set ip版本，0：ipv4；1：ipv6
     * @param IpVersion ip版本，0：ipv4；1：ipv6
     */
    public void setIpVersion(Long IpVersion) {
        this.IpVersion = IpVersion;
    }

    /**
     * Get 关联实例
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AttachIns 关联实例
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AttachInsInfo [] getAttachIns() {
        return this.AttachIns;
    }

    /**
     * Set 关联实例
注意：此字段可能返回 null，表示取不到有效值。
     * @param AttachIns 关联实例
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAttachIns(AttachInsInfo [] AttachIns) {
        this.AttachIns = AttachIns;
    }

    /**
     * Get 引流私有网络端点信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Endpoints 引流私有网络端点信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EndpointInfo [] getEndpoints() {
        return this.Endpoints;
    }

    /**
     * Set 引流私有网络端点信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Endpoints 引流私有网络端点信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndpoints(EndpointInfo [] Endpoints) {
        this.Endpoints = Endpoints;
    }

    /**
     * Get 入侵防护模式,0:观察;1:拦截;2:严格;3:关闭 
     * @return Idpsaction 入侵防护模式,0:观察;1:拦截;2:严格;3:关闭
     */
    public Long getIdpsaction() {
        return this.Idpsaction;
    }

    /**
     * Set 入侵防护模式,0:观察;1:拦截;2:严格;3:关闭
     * @param Idpsaction 入侵防护模式,0:观察;1:拦截;2:严格;3:关闭
     */
    public void setIdpsaction(Long Idpsaction) {
        this.Idpsaction = Idpsaction;
    }

    /**
     * Get //透明模式开关,0:未开启,1:已开启 
     * @return TransEnable //透明模式开关,0:未开启,1:已开启
     */
    public Long getTransEnable() {
        return this.TransEnable;
    }

    /**
     * Set //透明模式开关,0:未开启,1:已开启
     * @param TransEnable //透明模式开关,0:未开启,1:已开启
     */
    public void setTransEnable(Long TransEnable) {
        this.TransEnable = TransEnable;
    }

    /**
     * Get 开关状态 0关闭 1开启 
     * @return Enable 开关状态 0关闭 1开启
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set 开关状态 0关闭 1开启
     * @param Enable 开关状态 0关闭 1开启
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get 路由模式：0：多路由表，1：策略路由 
     * @return RoutingMode 路由模式：0：多路由表，1：策略路由
     */
    public Long getRoutingMode() {
        return this.RoutingMode;
    }

    /**
     * Set 路由模式：0：多路由表，1：策略路由
     * @param RoutingMode 路由模式：0：多路由表，1：策略路由
     */
    public void setRoutingMode(Long RoutingMode) {
        this.RoutingMode = RoutingMode;
    }

    /**
     * Get 是否跨租户开关 1是 0不是 
     * @return IsPeer 是否跨租户开关 1是 0不是
     */
    public Long getIsPeer() {
        return this.IsPeer;
    }

    /**
     * Set 是否跨租户开关 1是 0不是
     * @param IsPeer 是否跨租户开关 1是 0不是
     */
    public void setIsPeer(Long IsPeer) {
        this.IsPeer = IsPeer;
    }

    /**
     * Get 跨租户appid 
     * @return PeerAppid 跨租户appid
     */
    public String getPeerAppid() {
        return this.PeerAppid;
    }

    /**
     * Set 跨租户appid
     * @param PeerAppid 跨租户appid
     */
    public void setPeerAppid(String PeerAppid) {
        this.PeerAppid = PeerAppid;
    }

    /**
     * Get 跨租户操作状态 1不允许操作 0可以 
     * @return PeerStatus 跨租户操作状态 1不允许操作 0可以
     */
    public Long getPeerStatus() {
        return this.PeerStatus;
    }

    /**
     * Set 跨租户操作状态 1不允许操作 0可以
     * @param PeerStatus 跨租户操作状态 1不允许操作 0可以
     */
    public void setPeerStatus(Long PeerStatus) {
        this.PeerStatus = PeerStatus;
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

    }
}

