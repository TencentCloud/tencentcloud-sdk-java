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

public class DescribeAggrSoftDetailData extends AbstractModel {

    /**
    * 软件名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 平台
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OsType")
    @Expose
    private Long OsType;

    /**
    * 盗版风险
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PiracyRisk")
    @Expose
    private Long PiracyRisk;

    /**
    * 厂商
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Corp")
    @Expose
    private String Corp;

    /**
    * 已安装版本分布
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SoftVersionDist")
    @Expose
    private SoftVersionAndNum [] SoftVersionDist;

    /**
    * 盗版版本安装
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PiracyVersionDist")
    @Expose
    private SoftVersionAndNum [] PiracyVersionDist;

    /**
    * 安装设备数
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
    * 安装用户数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstalledUserNum")
    @Expose
    private Long InstalledUserNum;

    /**
    * 盗版安装用户数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PiracyInstalledUserNum")
    @Expose
    private Long PiracyInstalledUserNum;

    /**
    * 授权数
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
    * 当前可升级的最新版本信息, 每一项均为json字符串
    */
    @SerializedName("UpgradableVersions")
    @Expose
    private String [] UpgradableVersions;

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
     * Get 平台
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OsType 平台
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOsType() {
        return this.OsType;
    }

    /**
     * Set 平台
注意：此字段可能返回 null，表示取不到有效值。
     * @param OsType 平台
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOsType(Long OsType) {
        this.OsType = OsType;
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
     * Get 厂商
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Corp 厂商
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCorp() {
        return this.Corp;
    }

    /**
     * Set 厂商
注意：此字段可能返回 null，表示取不到有效值。
     * @param Corp 厂商
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCorp(String Corp) {
        this.Corp = Corp;
    }

    /**
     * Get 已安装版本分布
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SoftVersionDist 已安装版本分布
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SoftVersionAndNum [] getSoftVersionDist() {
        return this.SoftVersionDist;
    }

    /**
     * Set 已安装版本分布
注意：此字段可能返回 null，表示取不到有效值。
     * @param SoftVersionDist 已安装版本分布
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSoftVersionDist(SoftVersionAndNum [] SoftVersionDist) {
        this.SoftVersionDist = SoftVersionDist;
    }

    /**
     * Get 盗版版本安装
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PiracyVersionDist 盗版版本安装
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SoftVersionAndNum [] getPiracyVersionDist() {
        return this.PiracyVersionDist;
    }

    /**
     * Set 盗版版本安装
注意：此字段可能返回 null，表示取不到有效值。
     * @param PiracyVersionDist 盗版版本安装
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPiracyVersionDist(SoftVersionAndNum [] PiracyVersionDist) {
        this.PiracyVersionDist = PiracyVersionDist;
    }

    /**
     * Get 安装设备数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstalledDeviceNum 安装设备数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getInstalledDeviceNum() {
        return this.InstalledDeviceNum;
    }

    /**
     * Set 安装设备数
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstalledDeviceNum 安装设备数
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
     * Get 安装用户数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstalledUserNum 安装用户数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getInstalledUserNum() {
        return this.InstalledUserNum;
    }

    /**
     * Set 安装用户数
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstalledUserNum 安装用户数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstalledUserNum(Long InstalledUserNum) {
        this.InstalledUserNum = InstalledUserNum;
    }

    /**
     * Get 盗版安装用户数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PiracyInstalledUserNum 盗版安装用户数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPiracyInstalledUserNum() {
        return this.PiracyInstalledUserNum;
    }

    /**
     * Set 盗版安装用户数
注意：此字段可能返回 null，表示取不到有效值。
     * @param PiracyInstalledUserNum 盗版安装用户数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPiracyInstalledUserNum(Long PiracyInstalledUserNum) {
        this.PiracyInstalledUserNum = PiracyInstalledUserNum;
    }

    /**
     * Get 授权数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AuthNum 授权数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAuthNum() {
        return this.AuthNum;
    }

    /**
     * Set 授权数
注意：此字段可能返回 null，表示取不到有效值。
     * @param AuthNum 授权数
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

    /**
     * Get 当前可升级的最新版本信息, 每一项均为json字符串 
     * @return UpgradableVersions 当前可升级的最新版本信息, 每一项均为json字符串
     */
    public String [] getUpgradableVersions() {
        return this.UpgradableVersions;
    }

    /**
     * Set 当前可升级的最新版本信息, 每一项均为json字符串
     * @param UpgradableVersions 当前可升级的最新版本信息, 每一项均为json字符串
     */
    public void setUpgradableVersions(String [] UpgradableVersions) {
        this.UpgradableVersions = UpgradableVersions;
    }

    public DescribeAggrSoftDetailData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAggrSoftDetailData(DescribeAggrSoftDetailData source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.OsType != null) {
            this.OsType = new Long(source.OsType);
        }
        if (source.PiracyRisk != null) {
            this.PiracyRisk = new Long(source.PiracyRisk);
        }
        if (source.Corp != null) {
            this.Corp = new String(source.Corp);
        }
        if (source.SoftVersionDist != null) {
            this.SoftVersionDist = new SoftVersionAndNum[source.SoftVersionDist.length];
            for (int i = 0; i < source.SoftVersionDist.length; i++) {
                this.SoftVersionDist[i] = new SoftVersionAndNum(source.SoftVersionDist[i]);
            }
        }
        if (source.PiracyVersionDist != null) {
            this.PiracyVersionDist = new SoftVersionAndNum[source.PiracyVersionDist.length];
            for (int i = 0; i < source.PiracyVersionDist.length; i++) {
                this.PiracyVersionDist[i] = new SoftVersionAndNum(source.PiracyVersionDist[i]);
            }
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
        if (source.UpgradableVersions != null) {
            this.UpgradableVersions = new String[source.UpgradableVersions.length];
            for (int i = 0; i < source.UpgradableVersions.length; i++) {
                this.UpgradableVersions[i] = new String(source.UpgradableVersions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "OsType", this.OsType);
        this.setParamSimple(map, prefix + "PiracyRisk", this.PiracyRisk);
        this.setParamSimple(map, prefix + "Corp", this.Corp);
        this.setParamArrayObj(map, prefix + "SoftVersionDist.", this.SoftVersionDist);
        this.setParamArrayObj(map, prefix + "PiracyVersionDist.", this.PiracyVersionDist);
        this.setParamSimple(map, prefix + "InstalledDeviceNum", this.InstalledDeviceNum);
        this.setParamSimple(map, prefix + "PiracyInstalledDeviceNum", this.PiracyInstalledDeviceNum);
        this.setParamSimple(map, prefix + "InstalledUserNum", this.InstalledUserNum);
        this.setParamSimple(map, prefix + "PiracyInstalledUserNum", this.PiracyInstalledUserNum);
        this.setParamSimple(map, prefix + "AuthNum", this.AuthNum);
        this.setParamSimple(map, prefix + "GenuineRate", this.GenuineRate);
        this.setParamSimple(map, prefix + "UpgradableDeviceNum", this.UpgradableDeviceNum);
        this.setParamArraySimple(map, prefix + "UpgradableVersions.", this.UpgradableVersions);

    }
}

