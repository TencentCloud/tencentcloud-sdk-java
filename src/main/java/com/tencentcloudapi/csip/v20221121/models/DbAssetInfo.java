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

public class DbAssetInfo extends AbstractModel{

    /**
    * 云防状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CFWStatus")
    @Expose
    private Long CFWStatus;

    /**
    * 资产id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
    * vpc信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * 资产类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * 公网ip
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
    * 私网ip
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PrivateIp")
    @Expose
    private String PrivateIp;

    /**
    * 地域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * vpc信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 资产名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetName")
    @Expose
    private String AssetName;

    /**
    * 云防保护版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CFWProtectLevel")
    @Expose
    private Long CFWProtectLevel;

    /**
    * tag信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tag")
    @Expose
    private Tag [] Tag;

    /**
     * Get 云防状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CFWStatus 云防状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCFWStatus() {
        return this.CFWStatus;
    }

    /**
     * Set 云防状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param CFWStatus 云防状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCFWStatus(Long CFWStatus) {
        this.CFWStatus = CFWStatus;
    }

    /**
     * Get 资产id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssetId 资产id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAssetId() {
        return this.AssetId;
    }

    /**
     * Set 资产id
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssetId 资产id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssetId(String AssetId) {
        this.AssetId = AssetId;
    }

    /**
     * Get vpc信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcName vpc信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set vpc信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcName vpc信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Get 资产类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssetType 资产类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set 资产类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssetType 资产类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get 公网ip
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PublicIp 公网ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPublicIp() {
        return this.PublicIp;
    }

    /**
     * Set 公网ip
注意：此字段可能返回 null，表示取不到有效值。
     * @param PublicIp 公网ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPublicIp(String PublicIp) {
        this.PublicIp = PublicIp;
    }

    /**
     * Get 私网ip
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PrivateIp 私网ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPrivateIp() {
        return this.PrivateIp;
    }

    /**
     * Set 私网ip
注意：此字段可能返回 null，表示取不到有效值。
     * @param PrivateIp 私网ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrivateIp(String PrivateIp) {
        this.PrivateIp = PrivateIp;
    }

    /**
     * Get 地域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region 地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region 地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get vpc信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcId vpc信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set vpc信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcId vpc信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 资产名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssetName 资产名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAssetName() {
        return this.AssetName;
    }

    /**
     * Set 资产名
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssetName 资产名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssetName(String AssetName) {
        this.AssetName = AssetName;
    }

    /**
     * Get 云防保护版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CFWProtectLevel 云防保护版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCFWProtectLevel() {
        return this.CFWProtectLevel;
    }

    /**
     * Set 云防保护版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param CFWProtectLevel 云防保护版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCFWProtectLevel(Long CFWProtectLevel) {
        this.CFWProtectLevel = CFWProtectLevel;
    }

    /**
     * Get tag信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tag tag信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTag() {
        return this.Tag;
    }

    /**
     * Set tag信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tag tag信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTag(Tag [] Tag) {
        this.Tag = Tag;
    }

    public DbAssetInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DbAssetInfo(DbAssetInfo source) {
        if (source.CFWStatus != null) {
            this.CFWStatus = new Long(source.CFWStatus);
        }
        if (source.AssetId != null) {
            this.AssetId = new String(source.AssetId);
        }
        if (source.VpcName != null) {
            this.VpcName = new String(source.VpcName);
        }
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.PublicIp != null) {
            this.PublicIp = new String(source.PublicIp);
        }
        if (source.PrivateIp != null) {
            this.PrivateIp = new String(source.PrivateIp);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.AssetName != null) {
            this.AssetName = new String(source.AssetName);
        }
        if (source.CFWProtectLevel != null) {
            this.CFWProtectLevel = new Long(source.CFWProtectLevel);
        }
        if (source.Tag != null) {
            this.Tag = new Tag[source.Tag.length];
            for (int i = 0; i < source.Tag.length; i++) {
                this.Tag[i] = new Tag(source.Tag[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CFWStatus", this.CFWStatus);
        this.setParamSimple(map, prefix + "AssetId", this.AssetId);
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "PublicIp", this.PublicIp);
        this.setParamSimple(map, prefix + "PrivateIp", this.PrivateIp);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "AssetName", this.AssetName);
        this.setParamSimple(map, prefix + "CFWProtectLevel", this.CFWProtectLevel);
        this.setParamArrayObj(map, prefix + "Tag.", this.Tag);

    }
}

