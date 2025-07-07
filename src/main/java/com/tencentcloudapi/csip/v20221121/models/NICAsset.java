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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NICAsset extends AbstractModel {

    /**
    * appid
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * uin
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 资产ID
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
    * 资产名
    */
    @SerializedName("AssetName")
    @Expose
    private String AssetName;

    /**
    * 资产类型
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * 私有ip
    */
    @SerializedName("PrivateIp")
    @Expose
    private String PrivateIp;

    /**
    * 公网ip
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
    * 区域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 私有网络id
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 私有网络名
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * 标签
    */
    @SerializedName("Tag")
    @Expose
    private Tag [] Tag;

    /**
    * 出向峰值带宽
    */
    @SerializedName("OutboundPeakBandwidth")
    @Expose
    private String OutboundPeakBandwidth;

    /**
    * 入向峰值带宽
    */
    @SerializedName("InboundPeakBandwidth")
    @Expose
    private String InboundPeakBandwidth;

    /**
    * 出站累计流量
    */
    @SerializedName("OutboundCumulativeFlow")
    @Expose
    private String OutboundCumulativeFlow;

    /**
    * 入站累计流量
    */
    @SerializedName("InboundCumulativeFlow")
    @Expose
    private String InboundCumulativeFlow;

    /**
    * 网络攻击
    */
    @SerializedName("NetworkAttack")
    @Expose
    private Long NetworkAttack;

    /**
    * 暴露端口
    */
    @SerializedName("ExposedPort")
    @Expose
    private Long ExposedPort;

    /**
    * 暴露漏洞
    */
    @SerializedName("ExposedVUL")
    @Expose
    private Long ExposedVUL;

    /**
    * 配置风险
    */
    @SerializedName("ConfigureRisk")
    @Expose
    private Long ConfigureRisk;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 任务数
    */
    @SerializedName("ScanTask")
    @Expose
    private Long ScanTask;

    /**
    * 最后扫描时间
    */
    @SerializedName("LastScanTime")
    @Expose
    private String LastScanTime;

    /**
    * 昵称
    */
    @SerializedName("Nick")
    @Expose
    private String Nick;

    /**
    * 是否核心
    */
    @SerializedName("IsCore")
    @Expose
    private Long IsCore;

    /**
    * 是否新资产 1新
    */
    @SerializedName("IsNewAsset")
    @Expose
    private Long IsNewAsset;

    /**
     * Get appid 
     * @return AppId appid
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set appid
     * @param AppId appid
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get uin 
     * @return Uin uin
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set uin
     * @param Uin uin
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 资产ID 
     * @return AssetId 资产ID
     */
    public String getAssetId() {
        return this.AssetId;
    }

    /**
     * Set 资产ID
     * @param AssetId 资产ID
     */
    public void setAssetId(String AssetId) {
        this.AssetId = AssetId;
    }

    /**
     * Get 资产名 
     * @return AssetName 资产名
     */
    public String getAssetName() {
        return this.AssetName;
    }

    /**
     * Set 资产名
     * @param AssetName 资产名
     */
    public void setAssetName(String AssetName) {
        this.AssetName = AssetName;
    }

    /**
     * Get 资产类型 
     * @return AssetType 资产类型
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set 资产类型
     * @param AssetType 资产类型
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get 私有ip 
     * @return PrivateIp 私有ip
     */
    public String getPrivateIp() {
        return this.PrivateIp;
    }

    /**
     * Set 私有ip
     * @param PrivateIp 私有ip
     */
    public void setPrivateIp(String PrivateIp) {
        this.PrivateIp = PrivateIp;
    }

    /**
     * Get 公网ip 
     * @return PublicIp 公网ip
     */
    public String getPublicIp() {
        return this.PublicIp;
    }

    /**
     * Set 公网ip
     * @param PublicIp 公网ip
     */
    public void setPublicIp(String PublicIp) {
        this.PublicIp = PublicIp;
    }

    /**
     * Get 区域 
     * @return Region 区域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 区域
     * @param Region 区域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 私有网络id 
     * @return VpcId 私有网络id
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私有网络id
     * @param VpcId 私有网络id
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 私有网络名 
     * @return VpcName 私有网络名
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set 私有网络名
     * @param VpcName 私有网络名
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Get 标签 
     * @return Tag 标签
     */
    public Tag [] getTag() {
        return this.Tag;
    }

    /**
     * Set 标签
     * @param Tag 标签
     */
    public void setTag(Tag [] Tag) {
        this.Tag = Tag;
    }

    /**
     * Get 出向峰值带宽 
     * @return OutboundPeakBandwidth 出向峰值带宽
     */
    public String getOutboundPeakBandwidth() {
        return this.OutboundPeakBandwidth;
    }

    /**
     * Set 出向峰值带宽
     * @param OutboundPeakBandwidth 出向峰值带宽
     */
    public void setOutboundPeakBandwidth(String OutboundPeakBandwidth) {
        this.OutboundPeakBandwidth = OutboundPeakBandwidth;
    }

    /**
     * Get 入向峰值带宽 
     * @return InboundPeakBandwidth 入向峰值带宽
     */
    public String getInboundPeakBandwidth() {
        return this.InboundPeakBandwidth;
    }

    /**
     * Set 入向峰值带宽
     * @param InboundPeakBandwidth 入向峰值带宽
     */
    public void setInboundPeakBandwidth(String InboundPeakBandwidth) {
        this.InboundPeakBandwidth = InboundPeakBandwidth;
    }

    /**
     * Get 出站累计流量 
     * @return OutboundCumulativeFlow 出站累计流量
     */
    public String getOutboundCumulativeFlow() {
        return this.OutboundCumulativeFlow;
    }

    /**
     * Set 出站累计流量
     * @param OutboundCumulativeFlow 出站累计流量
     */
    public void setOutboundCumulativeFlow(String OutboundCumulativeFlow) {
        this.OutboundCumulativeFlow = OutboundCumulativeFlow;
    }

    /**
     * Get 入站累计流量 
     * @return InboundCumulativeFlow 入站累计流量
     */
    public String getInboundCumulativeFlow() {
        return this.InboundCumulativeFlow;
    }

    /**
     * Set 入站累计流量
     * @param InboundCumulativeFlow 入站累计流量
     */
    public void setInboundCumulativeFlow(String InboundCumulativeFlow) {
        this.InboundCumulativeFlow = InboundCumulativeFlow;
    }

    /**
     * Get 网络攻击 
     * @return NetworkAttack 网络攻击
     */
    public Long getNetworkAttack() {
        return this.NetworkAttack;
    }

    /**
     * Set 网络攻击
     * @param NetworkAttack 网络攻击
     */
    public void setNetworkAttack(Long NetworkAttack) {
        this.NetworkAttack = NetworkAttack;
    }

    /**
     * Get 暴露端口 
     * @return ExposedPort 暴露端口
     */
    public Long getExposedPort() {
        return this.ExposedPort;
    }

    /**
     * Set 暴露端口
     * @param ExposedPort 暴露端口
     */
    public void setExposedPort(Long ExposedPort) {
        this.ExposedPort = ExposedPort;
    }

    /**
     * Get 暴露漏洞 
     * @return ExposedVUL 暴露漏洞
     */
    public Long getExposedVUL() {
        return this.ExposedVUL;
    }

    /**
     * Set 暴露漏洞
     * @param ExposedVUL 暴露漏洞
     */
    public void setExposedVUL(Long ExposedVUL) {
        this.ExposedVUL = ExposedVUL;
    }

    /**
     * Get 配置风险 
     * @return ConfigureRisk 配置风险
     */
    public Long getConfigureRisk() {
        return this.ConfigureRisk;
    }

    /**
     * Set 配置风险
     * @param ConfigureRisk 配置风险
     */
    public void setConfigureRisk(Long ConfigureRisk) {
        this.ConfigureRisk = ConfigureRisk;
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
     * Get 任务数 
     * @return ScanTask 任务数
     */
    public Long getScanTask() {
        return this.ScanTask;
    }

    /**
     * Set 任务数
     * @param ScanTask 任务数
     */
    public void setScanTask(Long ScanTask) {
        this.ScanTask = ScanTask;
    }

    /**
     * Get 最后扫描时间 
     * @return LastScanTime 最后扫描时间
     */
    public String getLastScanTime() {
        return this.LastScanTime;
    }

    /**
     * Set 最后扫描时间
     * @param LastScanTime 最后扫描时间
     */
    public void setLastScanTime(String LastScanTime) {
        this.LastScanTime = LastScanTime;
    }

    /**
     * Get 昵称 
     * @return Nick 昵称
     */
    public String getNick() {
        return this.Nick;
    }

    /**
     * Set 昵称
     * @param Nick 昵称
     */
    public void setNick(String Nick) {
        this.Nick = Nick;
    }

    /**
     * Get 是否核心 
     * @return IsCore 是否核心
     */
    public Long getIsCore() {
        return this.IsCore;
    }

    /**
     * Set 是否核心
     * @param IsCore 是否核心
     */
    public void setIsCore(Long IsCore) {
        this.IsCore = IsCore;
    }

    /**
     * Get 是否新资产 1新 
     * @return IsNewAsset 是否新资产 1新
     */
    public Long getIsNewAsset() {
        return this.IsNewAsset;
    }

    /**
     * Set 是否新资产 1新
     * @param IsNewAsset 是否新资产 1新
     */
    public void setIsNewAsset(Long IsNewAsset) {
        this.IsNewAsset = IsNewAsset;
    }

    public NICAsset() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NICAsset(NICAsset source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.AssetId != null) {
            this.AssetId = new String(source.AssetId);
        }
        if (source.AssetName != null) {
            this.AssetName = new String(source.AssetName);
        }
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.PrivateIp != null) {
            this.PrivateIp = new String(source.PrivateIp);
        }
        if (source.PublicIp != null) {
            this.PublicIp = new String(source.PublicIp);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.VpcName != null) {
            this.VpcName = new String(source.VpcName);
        }
        if (source.Tag != null) {
            this.Tag = new Tag[source.Tag.length];
            for (int i = 0; i < source.Tag.length; i++) {
                this.Tag[i] = new Tag(source.Tag[i]);
            }
        }
        if (source.OutboundPeakBandwidth != null) {
            this.OutboundPeakBandwidth = new String(source.OutboundPeakBandwidth);
        }
        if (source.InboundPeakBandwidth != null) {
            this.InboundPeakBandwidth = new String(source.InboundPeakBandwidth);
        }
        if (source.OutboundCumulativeFlow != null) {
            this.OutboundCumulativeFlow = new String(source.OutboundCumulativeFlow);
        }
        if (source.InboundCumulativeFlow != null) {
            this.InboundCumulativeFlow = new String(source.InboundCumulativeFlow);
        }
        if (source.NetworkAttack != null) {
            this.NetworkAttack = new Long(source.NetworkAttack);
        }
        if (source.ExposedPort != null) {
            this.ExposedPort = new Long(source.ExposedPort);
        }
        if (source.ExposedVUL != null) {
            this.ExposedVUL = new Long(source.ExposedVUL);
        }
        if (source.ConfigureRisk != null) {
            this.ConfigureRisk = new Long(source.ConfigureRisk);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ScanTask != null) {
            this.ScanTask = new Long(source.ScanTask);
        }
        if (source.LastScanTime != null) {
            this.LastScanTime = new String(source.LastScanTime);
        }
        if (source.Nick != null) {
            this.Nick = new String(source.Nick);
        }
        if (source.IsCore != null) {
            this.IsCore = new Long(source.IsCore);
        }
        if (source.IsNewAsset != null) {
            this.IsNewAsset = new Long(source.IsNewAsset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "AssetId", this.AssetId);
        this.setParamSimple(map, prefix + "AssetName", this.AssetName);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "PrivateIp", this.PrivateIp);
        this.setParamSimple(map, prefix + "PublicIp", this.PublicIp);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);
        this.setParamArrayObj(map, prefix + "Tag.", this.Tag);
        this.setParamSimple(map, prefix + "OutboundPeakBandwidth", this.OutboundPeakBandwidth);
        this.setParamSimple(map, prefix + "InboundPeakBandwidth", this.InboundPeakBandwidth);
        this.setParamSimple(map, prefix + "OutboundCumulativeFlow", this.OutboundCumulativeFlow);
        this.setParamSimple(map, prefix + "InboundCumulativeFlow", this.InboundCumulativeFlow);
        this.setParamSimple(map, prefix + "NetworkAttack", this.NetworkAttack);
        this.setParamSimple(map, prefix + "ExposedPort", this.ExposedPort);
        this.setParamSimple(map, prefix + "ExposedVUL", this.ExposedVUL);
        this.setParamSimple(map, prefix + "ConfigureRisk", this.ConfigureRisk);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ScanTask", this.ScanTask);
        this.setParamSimple(map, prefix + "LastScanTime", this.LastScanTime);
        this.setParamSimple(map, prefix + "Nick", this.Nick);
        this.setParamSimple(map, prefix + "IsCore", this.IsCore);
        this.setParamSimple(map, prefix + "IsNewAsset", this.IsNewAsset);

    }
}

