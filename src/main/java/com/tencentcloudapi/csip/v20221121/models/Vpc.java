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

public class Vpc extends AbstractModel{

    /**
    * 子网(只支持32位)
    */
    @SerializedName("Subnet")
    @Expose
    private Long Subnet;

    /**
    * 互通vpc(只支持32位)
    */
    @SerializedName("ConnectedVpc")
    @Expose
    private Long ConnectedVpc;

    /**
    * 资产id
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
    * region区域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 云服务器(只支持32位)
    */
    @SerializedName("CVM")
    @Expose
    private Long CVM;

    /**
    * 标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tag")
    @Expose
    private Tag [] Tag;

    /**
    * dns域名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DNS")
    @Expose
    private String [] DNS;

    /**
    * 资产名称
    */
    @SerializedName("AssetName")
    @Expose
    private String AssetName;

    /**
    * cidr网段
    */
    @SerializedName("CIDR")
    @Expose
    private String CIDR;

    /**
    * 资产创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

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
    * 昵称
    */
    @SerializedName("Nick")
    @Expose
    private String Nick;

    /**
    * 是否新资产 1新
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsNewAsset")
    @Expose
    private Long IsNewAsset;

    /**
    * 是否核心资产1是 2不是
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsCore")
    @Expose
    private Long IsCore;

    /**
     * Get 子网(只支持32位) 
     * @return Subnet 子网(只支持32位)
     */
    public Long getSubnet() {
        return this.Subnet;
    }

    /**
     * Set 子网(只支持32位)
     * @param Subnet 子网(只支持32位)
     */
    public void setSubnet(Long Subnet) {
        this.Subnet = Subnet;
    }

    /**
     * Get 互通vpc(只支持32位) 
     * @return ConnectedVpc 互通vpc(只支持32位)
     */
    public Long getConnectedVpc() {
        return this.ConnectedVpc;
    }

    /**
     * Set 互通vpc(只支持32位)
     * @param ConnectedVpc 互通vpc(只支持32位)
     */
    public void setConnectedVpc(Long ConnectedVpc) {
        this.ConnectedVpc = ConnectedVpc;
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
     * Get region区域 
     * @return Region region区域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set region区域
     * @param Region region区域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 云服务器(只支持32位) 
     * @return CVM 云服务器(只支持32位)
     */
    public Long getCVM() {
        return this.CVM;
    }

    /**
     * Set 云服务器(只支持32位)
     * @param CVM 云服务器(只支持32位)
     */
    public void setCVM(Long CVM) {
        this.CVM = CVM;
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
     * Get dns域名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DNS dns域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getDNS() {
        return this.DNS;
    }

    /**
     * Set dns域名
注意：此字段可能返回 null，表示取不到有效值。
     * @param DNS dns域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDNS(String [] DNS) {
        this.DNS = DNS;
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
     * Get cidr网段 
     * @return CIDR cidr网段
     */
    public String getCIDR() {
        return this.CIDR;
    }

    /**
     * Set cidr网段
     * @param CIDR cidr网段
     */
    public void setCIDR(String CIDR) {
        this.CIDR = CIDR;
    }

    /**
     * Get 资产创建时间 
     * @return CreateTime 资产创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 资产创建时间
     * @param CreateTime 资产创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

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

    /**
     * Get 是否核心资产1是 2不是
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsCore 是否核心资产1是 2不是
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsCore() {
        return this.IsCore;
    }

    /**
     * Set 是否核心资产1是 2不是
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsCore 是否核心资产1是 2不是
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsCore(Long IsCore) {
        this.IsCore = IsCore;
    }

    public Vpc() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Vpc(Vpc source) {
        if (source.Subnet != null) {
            this.Subnet = new Long(source.Subnet);
        }
        if (source.ConnectedVpc != null) {
            this.ConnectedVpc = new Long(source.ConnectedVpc);
        }
        if (source.AssetId != null) {
            this.AssetId = new String(source.AssetId);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.CVM != null) {
            this.CVM = new Long(source.CVM);
        }
        if (source.Tag != null) {
            this.Tag = new Tag[source.Tag.length];
            for (int i = 0; i < source.Tag.length; i++) {
                this.Tag[i] = new Tag(source.Tag[i]);
            }
        }
        if (source.DNS != null) {
            this.DNS = new String[source.DNS.length];
            for (int i = 0; i < source.DNS.length; i++) {
                this.DNS[i] = new String(source.DNS[i]);
            }
        }
        if (source.AssetName != null) {
            this.AssetName = new String(source.AssetName);
        }
        if (source.CIDR != null) {
            this.CIDR = new String(source.CIDR);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.Nick != null) {
            this.Nick = new String(source.Nick);
        }
        if (source.IsNewAsset != null) {
            this.IsNewAsset = new Long(source.IsNewAsset);
        }
        if (source.IsCore != null) {
            this.IsCore = new Long(source.IsCore);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Subnet", this.Subnet);
        this.setParamSimple(map, prefix + "ConnectedVpc", this.ConnectedVpc);
        this.setParamSimple(map, prefix + "AssetId", this.AssetId);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "CVM", this.CVM);
        this.setParamArrayObj(map, prefix + "Tag.", this.Tag);
        this.setParamArraySimple(map, prefix + "DNS.", this.DNS);
        this.setParamSimple(map, prefix + "AssetName", this.AssetName);
        this.setParamSimple(map, prefix + "CIDR", this.CIDR);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "Nick", this.Nick);
        this.setParamSimple(map, prefix + "IsNewAsset", this.IsNewAsset);
        this.setParamSimple(map, prefix + "IsCore", this.IsCore);

    }
}

