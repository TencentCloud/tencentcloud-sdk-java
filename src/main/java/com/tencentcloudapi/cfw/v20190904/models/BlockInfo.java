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

public class BlockInfo extends AbstractModel {

    /**
    * 源IP
    */
    @SerializedName("SrcIP")
    @Expose
    private String SrcIP;

    /**
    * 目的ip
    */
    @SerializedName("DstIP")
    @Expose
    private String DstIP;

    /**
    * 端口
    */
    @SerializedName("DstPort")
    @Expose
    private String DstPort;

    /**
    * appid信息
    */
    @SerializedName("AppID")
    @Expose
    private String AppID;

    /**
    * 资产id
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
    * 资产名称
    */
    @SerializedName("AssetName")
    @Expose
    private String AssetName;

    /**
    * 地域
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 最晚时间
    */
    @SerializedName("MaxDate")
    @Expose
    private String MaxDate;

    /**
    * 最近时间
    */
    @SerializedName("MinDate")
    @Expose
    private String MinDate;

    /**
    * 方向  1入站 0出战
    */
    @SerializedName("Direction")
    @Expose
    private Long Direction;

    /**
    * 来源  1拦截列表，2虚拟补丁，3威胁情报，4基础防御
    */
    @SerializedName("BlockSource")
    @Expose
    private Long BlockSource;

    /**
    * 国加
    */
    @SerializedName("Country")
    @Expose
    private String Country;

    /**
    * 次数
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 拦截频率
    */
    @SerializedName("AvgCount")
    @Expose
    private Float AvgCount;

    /**
    * 置顶位
    */
    @SerializedName("IsTop")
    @Expose
    private Long IsTop;

    /**
    * 记录唯一标识
    */
    @SerializedName("UniqueId")
    @Expose
    private String UniqueId;

    /**
    * 1是 0不是
    */
    @SerializedName("ByPass")
    @Expose
    private Long ByPass;

    /**
    * 1是 0不是
    */
    @SerializedName("Block")
    @Expose
    private Long Block;

    /**
    * 1是 0不是
    */
    @SerializedName("Ignore")
    @Expose
    private Long Ignore;

    /**
    * WhiteTag信息
    */
    @SerializedName("WhiteTag")
    @Expose
    private String WhiteTag;

    /**
    * vpc间防火墙日志，目的资产id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DstAssetId")
    @Expose
    private String DstAssetId;

    /**
    * vpc间防火墙日志，目的资产名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DstAssetName")
    @Expose
    private String DstAssetName;

    /**
    * vpc间防火墙日志，源VPC id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SrcVpc")
    @Expose
    private String SrcVpc;

    /**
    * vpc间防火墙日志，源VPC名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SrcVpcName")
    @Expose
    private String SrcVpcName;

    /**
    * vpc间防火墙日志，目的VPC id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DstVpc")
    @Expose
    private String DstVpc;

    /**
    * vpc间防火墙日志，目的VPC名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DstVpcName")
    @Expose
    private String DstVpcName;

    /**
    * vpc间防火墙开关边id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EdgeId")
    @Expose
    private String EdgeId;

    /**
    * vpc间防火墙开关边名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EdgeName")
    @Expose
    private String EdgeName;

    /**
    * 日志来源 move：vpc间防火墙
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogSource")
    @Expose
    private String LogSource;

    /**
    * 是否加入隔离列表，1是 0不是
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Isolate")
    @Expose
    private Long Isolate;

    /**
    * 是否加入隔离列表，1是 0不是
    */
    @SerializedName("Hide")
    @Expose
    private Long Hide;

    /**
    * 域名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
     * Get 源IP 
     * @return SrcIP 源IP
     */
    public String getSrcIP() {
        return this.SrcIP;
    }

    /**
     * Set 源IP
     * @param SrcIP 源IP
     */
    public void setSrcIP(String SrcIP) {
        this.SrcIP = SrcIP;
    }

    /**
     * Get 目的ip 
     * @return DstIP 目的ip
     */
    public String getDstIP() {
        return this.DstIP;
    }

    /**
     * Set 目的ip
     * @param DstIP 目的ip
     */
    public void setDstIP(String DstIP) {
        this.DstIP = DstIP;
    }

    /**
     * Get 端口 
     * @return DstPort 端口
     */
    public String getDstPort() {
        return this.DstPort;
    }

    /**
     * Set 端口
     * @param DstPort 端口
     */
    public void setDstPort(String DstPort) {
        this.DstPort = DstPort;
    }

    /**
     * Get appid信息 
     * @return AppID appid信息
     */
    public String getAppID() {
        return this.AppID;
    }

    /**
     * Set appid信息
     * @param AppID appid信息
     */
    public void setAppID(String AppID) {
        this.AppID = AppID;
    }

    /**
     * Get 资产id 
     * @return AssetId 资产id
     */
    public String getAssetId() {
        return this.AssetId;
    }

    /**
     * Set 资产id
     * @param AssetId 资产id
     */
    public void setAssetId(String AssetId) {
        this.AssetId = AssetId;
    }

    /**
     * Get 资产名称 
     * @return AssetName 资产名称
     */
    public String getAssetName() {
        return this.AssetName;
    }

    /**
     * Set 资产名称
     * @param AssetName 资产名称
     */
    public void setAssetName(String AssetName) {
        this.AssetName = AssetName;
    }

    /**
     * Get 地域 
     * @return Zone 地域
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 地域
     * @param Zone 地域
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 最晚时间 
     * @return MaxDate 最晚时间
     */
    public String getMaxDate() {
        return this.MaxDate;
    }

    /**
     * Set 最晚时间
     * @param MaxDate 最晚时间
     */
    public void setMaxDate(String MaxDate) {
        this.MaxDate = MaxDate;
    }

    /**
     * Get 最近时间 
     * @return MinDate 最近时间
     */
    public String getMinDate() {
        return this.MinDate;
    }

    /**
     * Set 最近时间
     * @param MinDate 最近时间
     */
    public void setMinDate(String MinDate) {
        this.MinDate = MinDate;
    }

    /**
     * Get 方向  1入站 0出战 
     * @return Direction 方向  1入站 0出战
     */
    public Long getDirection() {
        return this.Direction;
    }

    /**
     * Set 方向  1入站 0出战
     * @param Direction 方向  1入站 0出战
     */
    public void setDirection(Long Direction) {
        this.Direction = Direction;
    }

    /**
     * Get 来源  1拦截列表，2虚拟补丁，3威胁情报，4基础防御 
     * @return BlockSource 来源  1拦截列表，2虚拟补丁，3威胁情报，4基础防御
     */
    public Long getBlockSource() {
        return this.BlockSource;
    }

    /**
     * Set 来源  1拦截列表，2虚拟补丁，3威胁情报，4基础防御
     * @param BlockSource 来源  1拦截列表，2虚拟补丁，3威胁情报，4基础防御
     */
    public void setBlockSource(Long BlockSource) {
        this.BlockSource = BlockSource;
    }

    /**
     * Get 国加 
     * @return Country 国加
     */
    public String getCountry() {
        return this.Country;
    }

    /**
     * Set 国加
     * @param Country 国加
     */
    public void setCountry(String Country) {
        this.Country = Country;
    }

    /**
     * Get 次数 
     * @return Count 次数
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 次数
     * @param Count 次数
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 拦截频率 
     * @return AvgCount 拦截频率
     */
    public Float getAvgCount() {
        return this.AvgCount;
    }

    /**
     * Set 拦截频率
     * @param AvgCount 拦截频率
     */
    public void setAvgCount(Float AvgCount) {
        this.AvgCount = AvgCount;
    }

    /**
     * Get 置顶位 
     * @return IsTop 置顶位
     */
    public Long getIsTop() {
        return this.IsTop;
    }

    /**
     * Set 置顶位
     * @param IsTop 置顶位
     */
    public void setIsTop(Long IsTop) {
        this.IsTop = IsTop;
    }

    /**
     * Get 记录唯一标识 
     * @return UniqueId 记录唯一标识
     */
    public String getUniqueId() {
        return this.UniqueId;
    }

    /**
     * Set 记录唯一标识
     * @param UniqueId 记录唯一标识
     */
    public void setUniqueId(String UniqueId) {
        this.UniqueId = UniqueId;
    }

    /**
     * Get 1是 0不是 
     * @return ByPass 1是 0不是
     */
    public Long getByPass() {
        return this.ByPass;
    }

    /**
     * Set 1是 0不是
     * @param ByPass 1是 0不是
     */
    public void setByPass(Long ByPass) {
        this.ByPass = ByPass;
    }

    /**
     * Get 1是 0不是 
     * @return Block 1是 0不是
     */
    public Long getBlock() {
        return this.Block;
    }

    /**
     * Set 1是 0不是
     * @param Block 1是 0不是
     */
    public void setBlock(Long Block) {
        this.Block = Block;
    }

    /**
     * Get 1是 0不是 
     * @return Ignore 1是 0不是
     */
    public Long getIgnore() {
        return this.Ignore;
    }

    /**
     * Set 1是 0不是
     * @param Ignore 1是 0不是
     */
    public void setIgnore(Long Ignore) {
        this.Ignore = Ignore;
    }

    /**
     * Get WhiteTag信息 
     * @return WhiteTag WhiteTag信息
     */
    public String getWhiteTag() {
        return this.WhiteTag;
    }

    /**
     * Set WhiteTag信息
     * @param WhiteTag WhiteTag信息
     */
    public void setWhiteTag(String WhiteTag) {
        this.WhiteTag = WhiteTag;
    }

    /**
     * Get vpc间防火墙日志，目的资产id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DstAssetId vpc间防火墙日志，目的资产id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDstAssetId() {
        return this.DstAssetId;
    }

    /**
     * Set vpc间防火墙日志，目的资产id
注意：此字段可能返回 null，表示取不到有效值。
     * @param DstAssetId vpc间防火墙日志，目的资产id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDstAssetId(String DstAssetId) {
        this.DstAssetId = DstAssetId;
    }

    /**
     * Get vpc间防火墙日志，目的资产名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DstAssetName vpc间防火墙日志，目的资产名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDstAssetName() {
        return this.DstAssetName;
    }

    /**
     * Set vpc间防火墙日志，目的资产名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param DstAssetName vpc间防火墙日志，目的资产名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDstAssetName(String DstAssetName) {
        this.DstAssetName = DstAssetName;
    }

    /**
     * Get vpc间防火墙日志，源VPC id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SrcVpc vpc间防火墙日志，源VPC id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSrcVpc() {
        return this.SrcVpc;
    }

    /**
     * Set vpc间防火墙日志，源VPC id
注意：此字段可能返回 null，表示取不到有效值。
     * @param SrcVpc vpc间防火墙日志，源VPC id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSrcVpc(String SrcVpc) {
        this.SrcVpc = SrcVpc;
    }

    /**
     * Get vpc间防火墙日志，源VPC名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SrcVpcName vpc间防火墙日志，源VPC名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSrcVpcName() {
        return this.SrcVpcName;
    }

    /**
     * Set vpc间防火墙日志，源VPC名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param SrcVpcName vpc间防火墙日志，源VPC名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSrcVpcName(String SrcVpcName) {
        this.SrcVpcName = SrcVpcName;
    }

    /**
     * Get vpc间防火墙日志，目的VPC id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DstVpc vpc间防火墙日志，目的VPC id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDstVpc() {
        return this.DstVpc;
    }

    /**
     * Set vpc间防火墙日志，目的VPC id
注意：此字段可能返回 null，表示取不到有效值。
     * @param DstVpc vpc间防火墙日志，目的VPC id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDstVpc(String DstVpc) {
        this.DstVpc = DstVpc;
    }

    /**
     * Get vpc间防火墙日志，目的VPC名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DstVpcName vpc间防火墙日志，目的VPC名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDstVpcName() {
        return this.DstVpcName;
    }

    /**
     * Set vpc间防火墙日志，目的VPC名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param DstVpcName vpc间防火墙日志，目的VPC名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDstVpcName(String DstVpcName) {
        this.DstVpcName = DstVpcName;
    }

    /**
     * Get vpc间防火墙开关边id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EdgeId vpc间防火墙开关边id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEdgeId() {
        return this.EdgeId;
    }

    /**
     * Set vpc间防火墙开关边id
注意：此字段可能返回 null，表示取不到有效值。
     * @param EdgeId vpc间防火墙开关边id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEdgeId(String EdgeId) {
        this.EdgeId = EdgeId;
    }

    /**
     * Get vpc间防火墙开关边名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EdgeName vpc间防火墙开关边名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEdgeName() {
        return this.EdgeName;
    }

    /**
     * Set vpc间防火墙开关边名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param EdgeName vpc间防火墙开关边名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEdgeName(String EdgeName) {
        this.EdgeName = EdgeName;
    }

    /**
     * Get 日志来源 move：vpc间防火墙
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogSource 日志来源 move：vpc间防火墙
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLogSource() {
        return this.LogSource;
    }

    /**
     * Set 日志来源 move：vpc间防火墙
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogSource 日志来源 move：vpc间防火墙
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogSource(String LogSource) {
        this.LogSource = LogSource;
    }

    /**
     * Get 是否加入隔离列表，1是 0不是
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Isolate 是否加入隔离列表，1是 0不是
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsolate() {
        return this.Isolate;
    }

    /**
     * Set 是否加入隔离列表，1是 0不是
注意：此字段可能返回 null，表示取不到有效值。
     * @param Isolate 是否加入隔离列表，1是 0不是
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsolate(Long Isolate) {
        this.Isolate = Isolate;
    }

    /**
     * Get 是否加入隔离列表，1是 0不是 
     * @return Hide 是否加入隔离列表，1是 0不是
     */
    public Long getHide() {
        return this.Hide;
    }

    /**
     * Set 是否加入隔离列表，1是 0不是
     * @param Hide 是否加入隔离列表，1是 0不是
     */
    public void setHide(Long Hide) {
        this.Hide = Hide;
    }

    /**
     * Get 域名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Domain 域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Domain 域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    public BlockInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BlockInfo(BlockInfo source) {
        if (source.SrcIP != null) {
            this.SrcIP = new String(source.SrcIP);
        }
        if (source.DstIP != null) {
            this.DstIP = new String(source.DstIP);
        }
        if (source.DstPort != null) {
            this.DstPort = new String(source.DstPort);
        }
        if (source.AppID != null) {
            this.AppID = new String(source.AppID);
        }
        if (source.AssetId != null) {
            this.AssetId = new String(source.AssetId);
        }
        if (source.AssetName != null) {
            this.AssetName = new String(source.AssetName);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.MaxDate != null) {
            this.MaxDate = new String(source.MaxDate);
        }
        if (source.MinDate != null) {
            this.MinDate = new String(source.MinDate);
        }
        if (source.Direction != null) {
            this.Direction = new Long(source.Direction);
        }
        if (source.BlockSource != null) {
            this.BlockSource = new Long(source.BlockSource);
        }
        if (source.Country != null) {
            this.Country = new String(source.Country);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.AvgCount != null) {
            this.AvgCount = new Float(source.AvgCount);
        }
        if (source.IsTop != null) {
            this.IsTop = new Long(source.IsTop);
        }
        if (source.UniqueId != null) {
            this.UniqueId = new String(source.UniqueId);
        }
        if (source.ByPass != null) {
            this.ByPass = new Long(source.ByPass);
        }
        if (source.Block != null) {
            this.Block = new Long(source.Block);
        }
        if (source.Ignore != null) {
            this.Ignore = new Long(source.Ignore);
        }
        if (source.WhiteTag != null) {
            this.WhiteTag = new String(source.WhiteTag);
        }
        if (source.DstAssetId != null) {
            this.DstAssetId = new String(source.DstAssetId);
        }
        if (source.DstAssetName != null) {
            this.DstAssetName = new String(source.DstAssetName);
        }
        if (source.SrcVpc != null) {
            this.SrcVpc = new String(source.SrcVpc);
        }
        if (source.SrcVpcName != null) {
            this.SrcVpcName = new String(source.SrcVpcName);
        }
        if (source.DstVpc != null) {
            this.DstVpc = new String(source.DstVpc);
        }
        if (source.DstVpcName != null) {
            this.DstVpcName = new String(source.DstVpcName);
        }
        if (source.EdgeId != null) {
            this.EdgeId = new String(source.EdgeId);
        }
        if (source.EdgeName != null) {
            this.EdgeName = new String(source.EdgeName);
        }
        if (source.LogSource != null) {
            this.LogSource = new String(source.LogSource);
        }
        if (source.Isolate != null) {
            this.Isolate = new Long(source.Isolate);
        }
        if (source.Hide != null) {
            this.Hide = new Long(source.Hide);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SrcIP", this.SrcIP);
        this.setParamSimple(map, prefix + "DstIP", this.DstIP);
        this.setParamSimple(map, prefix + "DstPort", this.DstPort);
        this.setParamSimple(map, prefix + "AppID", this.AppID);
        this.setParamSimple(map, prefix + "AssetId", this.AssetId);
        this.setParamSimple(map, prefix + "AssetName", this.AssetName);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "MaxDate", this.MaxDate);
        this.setParamSimple(map, prefix + "MinDate", this.MinDate);
        this.setParamSimple(map, prefix + "Direction", this.Direction);
        this.setParamSimple(map, prefix + "BlockSource", this.BlockSource);
        this.setParamSimple(map, prefix + "Country", this.Country);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "AvgCount", this.AvgCount);
        this.setParamSimple(map, prefix + "IsTop", this.IsTop);
        this.setParamSimple(map, prefix + "UniqueId", this.UniqueId);
        this.setParamSimple(map, prefix + "ByPass", this.ByPass);
        this.setParamSimple(map, prefix + "Block", this.Block);
        this.setParamSimple(map, prefix + "Ignore", this.Ignore);
        this.setParamSimple(map, prefix + "WhiteTag", this.WhiteTag);
        this.setParamSimple(map, prefix + "DstAssetId", this.DstAssetId);
        this.setParamSimple(map, prefix + "DstAssetName", this.DstAssetName);
        this.setParamSimple(map, prefix + "SrcVpc", this.SrcVpc);
        this.setParamSimple(map, prefix + "SrcVpcName", this.SrcVpcName);
        this.setParamSimple(map, prefix + "DstVpc", this.DstVpc);
        this.setParamSimple(map, prefix + "DstVpcName", this.DstVpcName);
        this.setParamSimple(map, prefix + "EdgeId", this.EdgeId);
        this.setParamSimple(map, prefix + "EdgeName", this.EdgeName);
        this.setParamSimple(map, prefix + "LogSource", this.LogSource);
        this.setParamSimple(map, prefix + "Isolate", this.Isolate);
        this.setParamSimple(map, prefix + "Hide", this.Hide);
        this.setParamSimple(map, prefix + "Domain", this.Domain);

    }
}

