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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubnetAsset extends AbstractModel{

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
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tag")
    @Expose
    private Tag [] Tag;

    /**
    * 昵称
    */
    @SerializedName("Nick")
    @Expose
    private String Nick;

    /**
    * cidr
    */
    @SerializedName("CIDR")
    @Expose
    private String CIDR;

    /**
    * 可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * cvm数
    */
    @SerializedName("CVM")
    @Expose
    private Long CVM;

    /**
    * 可用ip数
    */
    @SerializedName("AvailableIp")
    @Expose
    private Long AvailableIp;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 配置风险
    */
    @SerializedName("ConfigureRisk")
    @Expose
    private Long ConfigureRisk;

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
    * 是否核心
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsCore")
    @Expose
    private Long IsCore;

    /**
    * 是否新资产 1新
注意：此字段可能返回 null，表示取不到有效值。
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
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tag 标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTag() {
        return this.Tag;
    }

    /**
     * Set 标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tag 标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTag(Tag [] Tag) {
        this.Tag = Tag;
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
     * Get cidr 
     * @return CIDR cidr
     */
    public String getCIDR() {
        return this.CIDR;
    }

    /**
     * Set cidr
     * @param CIDR cidr
     */
    public void setCIDR(String CIDR) {
        this.CIDR = CIDR;
    }

    /**
     * Get 可用区 
     * @return Zone 可用区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区
     * @param Zone 可用区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get cvm数 
     * @return CVM cvm数
     */
    public Long getCVM() {
        return this.CVM;
    }

    /**
     * Set cvm数
     * @param CVM cvm数
     */
    public void setCVM(Long CVM) {
        this.CVM = CVM;
    }

    /**
     * Get 可用ip数 
     * @return AvailableIp 可用ip数
     */
    public Long getAvailableIp() {
        return this.AvailableIp;
    }

    /**
     * Set 可用ip数
     * @param AvailableIp 可用ip数
     */
    public void setAvailableIp(Long AvailableIp) {
        this.AvailableIp = AvailableIp;
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
     * Get 是否核心
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsCore 是否核心
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsCore() {
        return this.IsCore;
    }

    /**
     * Set 是否核心
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsCore 是否核心
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsCore(Long IsCore) {
        this.IsCore = IsCore;
    }

    /**
     * Get 是否新资产 1新
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsNewAsset 是否新资产 1新
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsNewAsset() {
        return this.IsNewAsset;
    }

    /**
     * Set 是否新资产 1新
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsNewAsset 是否新资产 1新
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsNewAsset(Long IsNewAsset) {
        this.IsNewAsset = IsNewAsset;
    }

    public SubnetAsset() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubnetAsset(SubnetAsset source) {
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
        if (source.Nick != null) {
            this.Nick = new String(source.Nick);
        }
        if (source.CIDR != null) {
            this.CIDR = new String(source.CIDR);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.CVM != null) {
            this.CVM = new Long(source.CVM);
        }
        if (source.AvailableIp != null) {
            this.AvailableIp = new Long(source.AvailableIp);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ConfigureRisk != null) {
            this.ConfigureRisk = new Long(source.ConfigureRisk);
        }
        if (source.ScanTask != null) {
            this.ScanTask = new Long(source.ScanTask);
        }
        if (source.LastScanTime != null) {
            this.LastScanTime = new String(source.LastScanTime);
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
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);
        this.setParamArrayObj(map, prefix + "Tag.", this.Tag);
        this.setParamSimple(map, prefix + "Nick", this.Nick);
        this.setParamSimple(map, prefix + "CIDR", this.CIDR);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "CVM", this.CVM);
        this.setParamSimple(map, prefix + "AvailableIp", this.AvailableIp);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ConfigureRisk", this.ConfigureRisk);
        this.setParamSimple(map, prefix + "ScanTask", this.ScanTask);
        this.setParamSimple(map, prefix + "LastScanTime", this.LastScanTime);
        this.setParamSimple(map, prefix + "IsCore", this.IsCore);
        this.setParamSimple(map, prefix + "IsNewAsset", this.IsNewAsset);

    }
}

