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
package com.tencentcloudapi.ioa.v20220601.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AggrCategorySoftDetailRow extends AbstractModel {

    /**
    * ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * 软件名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 盗版风险
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PiracyRisk")
    @Expose
    private Long PiracyRisk;

    /**
    * 系统平台
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OsType")
    @Expose
    private Long OsType;

    /**
    * 企业名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CorpName")
    @Expose
    private String CorpName;

    /**
    * 安装设备数量(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstalledDeviceNum")
    @Expose
    private Long InstalledDeviceNum;

    /**
    * 盗版安装设备数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PiracyInstalledDeviceNum")
    @Expose
    private Long PiracyInstalledDeviceNum;

    /**
    * 已安装用户数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstalledUserNum")
    @Expose
    private Long InstalledUserNum;

    /**
    * 盗版软件用户数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PiracyInstalledUserNum")
    @Expose
    private Long PiracyInstalledUserNum;

    /**
    * 授权总数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AuthNum")
    @Expose
    private Long AuthNum;

    /**
    * 正版率
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GenuineRate")
    @Expose
    private Float GenuineRate;

    /**
    * 有新版本可升级的设备数量
    */
    @SerializedName("UpgradableDeviceNum")
    @Expose
    private Long UpgradableDeviceNum;

    /**
     * Get ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ID ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ID ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get 软件名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 软件名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 软件名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 软件名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 盗版风险
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PiracyRisk 盗版风险
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPiracyRisk() {
        return this.PiracyRisk;
    }

    /**
     * Set 盗版风险
注意：此字段可能返回 null，表示取不到有效值。
     * @param PiracyRisk 盗版风险
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPiracyRisk(Long PiracyRisk) {
        this.PiracyRisk = PiracyRisk;
    }

    /**
     * Get 系统平台
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OsType 系统平台
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOsType() {
        return this.OsType;
    }

    /**
     * Set 系统平台
注意：此字段可能返回 null，表示取不到有效值。
     * @param OsType 系统平台
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOsType(Long OsType) {
        this.OsType = OsType;
    }

    /**
     * Get 企业名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CorpName 企业名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCorpName() {
        return this.CorpName;
    }

    /**
     * Set 企业名
注意：此字段可能返回 null，表示取不到有效值。
     * @param CorpName 企业名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCorpName(String CorpName) {
        this.CorpName = CorpName;
    }

    /**
     * Get 安装设备数量(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstalledDeviceNum 安装设备数量(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getInstalledDeviceNum() {
        return this.InstalledDeviceNum;
    }

    /**
     * Set 安装设备数量(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstalledDeviceNum 安装设备数量(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstalledDeviceNum(Long InstalledDeviceNum) {
        this.InstalledDeviceNum = InstalledDeviceNum;
    }

    /**
     * Get 盗版安装设备数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PiracyInstalledDeviceNum 盗版安装设备数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPiracyInstalledDeviceNum() {
        return this.PiracyInstalledDeviceNum;
    }

    /**
     * Set 盗版安装设备数
注意：此字段可能返回 null，表示取不到有效值。
     * @param PiracyInstalledDeviceNum 盗版安装设备数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPiracyInstalledDeviceNum(Long PiracyInstalledDeviceNum) {
        this.PiracyInstalledDeviceNum = PiracyInstalledDeviceNum;
    }

    /**
     * Get 已安装用户数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstalledUserNum 已安装用户数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getInstalledUserNum() {
        return this.InstalledUserNum;
    }

    /**
     * Set 已安装用户数
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstalledUserNum 已安装用户数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstalledUserNum(Long InstalledUserNum) {
        this.InstalledUserNum = InstalledUserNum;
    }

    /**
     * Get 盗版软件用户数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PiracyInstalledUserNum 盗版软件用户数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPiracyInstalledUserNum() {
        return this.PiracyInstalledUserNum;
    }

    /**
     * Set 盗版软件用户数
注意：此字段可能返回 null，表示取不到有效值。
     * @param PiracyInstalledUserNum 盗版软件用户数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPiracyInstalledUserNum(Long PiracyInstalledUserNum) {
        this.PiracyInstalledUserNum = PiracyInstalledUserNum;
    }

    /**
     * Get 授权总数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AuthNum 授权总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAuthNum() {
        return this.AuthNum;
    }

    /**
     * Set 授权总数
注意：此字段可能返回 null，表示取不到有效值。
     * @param AuthNum 授权总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAuthNum(Long AuthNum) {
        this.AuthNum = AuthNum;
    }

    /**
     * Get 正版率
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GenuineRate 正版率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getGenuineRate() {
        return this.GenuineRate;
    }

    /**
     * Set 正版率
注意：此字段可能返回 null，表示取不到有效值。
     * @param GenuineRate 正版率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGenuineRate(Float GenuineRate) {
        this.GenuineRate = GenuineRate;
    }

    /**
     * Get 有新版本可升级的设备数量 
     * @return UpgradableDeviceNum 有新版本可升级的设备数量
     */
    public Long getUpgradableDeviceNum() {
        return this.UpgradableDeviceNum;
    }

    /**
     * Set 有新版本可升级的设备数量
     * @param UpgradableDeviceNum 有新版本可升级的设备数量
     */
    public void setUpgradableDeviceNum(Long UpgradableDeviceNum) {
        this.UpgradableDeviceNum = UpgradableDeviceNum;
    }

    public AggrCategorySoftDetailRow() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AggrCategorySoftDetailRow(AggrCategorySoftDetailRow source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.PiracyRisk != null) {
            this.PiracyRisk = new Long(source.PiracyRisk);
        }
        if (source.OsType != null) {
            this.OsType = new Long(source.OsType);
        }
        if (source.CorpName != null) {
            this.CorpName = new String(source.CorpName);
        }
        if (source.InstalledDeviceNum != null) {
            this.InstalledDeviceNum = new Long(source.InstalledDeviceNum);
        }
        if (source.PiracyInstalledDeviceNum != null) {
            this.PiracyInstalledDeviceNum = new Long(source.PiracyInstalledDeviceNum);
        }
        if (source.InstalledUserNum != null) {
            this.InstalledUserNum = new Long(source.InstalledUserNum);
        }
        if (source.PiracyInstalledUserNum != null) {
            this.PiracyInstalledUserNum = new Long(source.PiracyInstalledUserNum);
        }
        if (source.AuthNum != null) {
            this.AuthNum = new Long(source.AuthNum);
        }
        if (source.GenuineRate != null) {
            this.GenuineRate = new Float(source.GenuineRate);
        }
        if (source.UpgradableDeviceNum != null) {
            this.UpgradableDeviceNum = new Long(source.UpgradableDeviceNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "PiracyRisk", this.PiracyRisk);
        this.setParamSimple(map, prefix + "OsType", this.OsType);
        this.setParamSimple(map, prefix + "CorpName", this.CorpName);
        this.setParamSimple(map, prefix + "InstalledDeviceNum", this.InstalledDeviceNum);
        this.setParamSimple(map, prefix + "PiracyInstalledDeviceNum", this.PiracyInstalledDeviceNum);
        this.setParamSimple(map, prefix + "InstalledUserNum", this.InstalledUserNum);
        this.setParamSimple(map, prefix + "PiracyInstalledUserNum", this.PiracyInstalledUserNum);
        this.setParamSimple(map, prefix + "AuthNum", this.AuthNum);
        this.setParamSimple(map, prefix + "GenuineRate", this.GenuineRate);
        this.setParamSimple(map, prefix + "UpgradableDeviceNum", this.UpgradableDeviceNum);

    }
}

