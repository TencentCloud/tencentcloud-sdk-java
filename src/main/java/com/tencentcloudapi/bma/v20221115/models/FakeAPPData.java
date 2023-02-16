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
package com.tencentcloudapi.bma.v20221115.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FakeAPPData extends AbstractModel{

    /**
    * 仿冒应用id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FakeAPPId")
    @Expose
    private Long FakeAPPId;

    /**
    * 品牌名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BrandName")
    @Expose
    private String BrandName;

    /**
    * 仿冒来源：0-系统检测 1-人工举报
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Origin")
    @Expose
    private Long Origin;

    /**
    * 仿冒应用名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FakeAPPName")
    @Expose
    private String FakeAPPName;

    /**
    * 仿冒应用包名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FakeAPPPackageName")
    @Expose
    private String FakeAPPPackageName;

    /**
    * 仿冒应用证书
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FakeAPPCert")
    @Expose
    private String FakeAPPCert;

    /**
    * 仿冒应用大小
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FakeAPPSize")
    @Expose
    private String FakeAPPSize;

    /**
    * 热度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Heat")
    @Expose
    private Long Heat;

    /**
    * 协助处置状态：0-未处置 1-处置中 2-处置成功 3-处置失败
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BlockStatus")
    @Expose
    private Long BlockStatus;

    /**
    * 协助处置状态说明
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BlockNote")
    @Expose
    private String BlockNote;

    /**
    * 关停状态：0-未关停 1-关停中 2-关停成功 3-关停失败 4-重复上架
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OfflineStatus")
    @Expose
    private Long OfflineStatus;

    /**
    * 关停状态说明
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OfflineNote")
    @Expose
    private String OfflineNote;

    /**
    * app来源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DownloadWay")
    @Expose
    private String DownloadWay;

    /**
    * 新增时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InsertTime")
    @Expose
    private String InsertTime;

    /**
    * App下载链接
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DownloadCosURL")
    @Expose
    private String DownloadCosURL;

    /**
    * 资质证明状态:0-不可用 1-可用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CertificationStatus")
    @Expose
    private Long CertificationStatus;

    /**
     * Get 仿冒应用id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FakeAPPId 仿冒应用id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFakeAPPId() {
        return this.FakeAPPId;
    }

    /**
     * Set 仿冒应用id
注意：此字段可能返回 null，表示取不到有效值。
     * @param FakeAPPId 仿冒应用id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFakeAPPId(Long FakeAPPId) {
        this.FakeAPPId = FakeAPPId;
    }

    /**
     * Get 品牌名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BrandName 品牌名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBrandName() {
        return this.BrandName;
    }

    /**
     * Set 品牌名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param BrandName 品牌名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBrandName(String BrandName) {
        this.BrandName = BrandName;
    }

    /**
     * Get 仿冒来源：0-系统检测 1-人工举报
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Origin 仿冒来源：0-系统检测 1-人工举报
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOrigin() {
        return this.Origin;
    }

    /**
     * Set 仿冒来源：0-系统检测 1-人工举报
注意：此字段可能返回 null，表示取不到有效值。
     * @param Origin 仿冒来源：0-系统检测 1-人工举报
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrigin(Long Origin) {
        this.Origin = Origin;
    }

    /**
     * Get 仿冒应用名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FakeAPPName 仿冒应用名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFakeAPPName() {
        return this.FakeAPPName;
    }

    /**
     * Set 仿冒应用名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param FakeAPPName 仿冒应用名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFakeAPPName(String FakeAPPName) {
        this.FakeAPPName = FakeAPPName;
    }

    /**
     * Get 仿冒应用包名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FakeAPPPackageName 仿冒应用包名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFakeAPPPackageName() {
        return this.FakeAPPPackageName;
    }

    /**
     * Set 仿冒应用包名
注意：此字段可能返回 null，表示取不到有效值。
     * @param FakeAPPPackageName 仿冒应用包名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFakeAPPPackageName(String FakeAPPPackageName) {
        this.FakeAPPPackageName = FakeAPPPackageName;
    }

    /**
     * Get 仿冒应用证书
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FakeAPPCert 仿冒应用证书
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFakeAPPCert() {
        return this.FakeAPPCert;
    }

    /**
     * Set 仿冒应用证书
注意：此字段可能返回 null，表示取不到有效值。
     * @param FakeAPPCert 仿冒应用证书
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFakeAPPCert(String FakeAPPCert) {
        this.FakeAPPCert = FakeAPPCert;
    }

    /**
     * Get 仿冒应用大小
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FakeAPPSize 仿冒应用大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFakeAPPSize() {
        return this.FakeAPPSize;
    }

    /**
     * Set 仿冒应用大小
注意：此字段可能返回 null，表示取不到有效值。
     * @param FakeAPPSize 仿冒应用大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFakeAPPSize(String FakeAPPSize) {
        this.FakeAPPSize = FakeAPPSize;
    }

    /**
     * Get 热度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Heat 热度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getHeat() {
        return this.Heat;
    }

    /**
     * Set 热度
注意：此字段可能返回 null，表示取不到有效值。
     * @param Heat 热度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHeat(Long Heat) {
        this.Heat = Heat;
    }

    /**
     * Get 协助处置状态：0-未处置 1-处置中 2-处置成功 3-处置失败
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BlockStatus 协助处置状态：0-未处置 1-处置中 2-处置成功 3-处置失败
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBlockStatus() {
        return this.BlockStatus;
    }

    /**
     * Set 协助处置状态：0-未处置 1-处置中 2-处置成功 3-处置失败
注意：此字段可能返回 null，表示取不到有效值。
     * @param BlockStatus 协助处置状态：0-未处置 1-处置中 2-处置成功 3-处置失败
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBlockStatus(Long BlockStatus) {
        this.BlockStatus = BlockStatus;
    }

    /**
     * Get 协助处置状态说明
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BlockNote 协助处置状态说明
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBlockNote() {
        return this.BlockNote;
    }

    /**
     * Set 协助处置状态说明
注意：此字段可能返回 null，表示取不到有效值。
     * @param BlockNote 协助处置状态说明
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBlockNote(String BlockNote) {
        this.BlockNote = BlockNote;
    }

    /**
     * Get 关停状态：0-未关停 1-关停中 2-关停成功 3-关停失败 4-重复上架
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OfflineStatus 关停状态：0-未关停 1-关停中 2-关停成功 3-关停失败 4-重复上架
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOfflineStatus() {
        return this.OfflineStatus;
    }

    /**
     * Set 关停状态：0-未关停 1-关停中 2-关停成功 3-关停失败 4-重复上架
注意：此字段可能返回 null，表示取不到有效值。
     * @param OfflineStatus 关停状态：0-未关停 1-关停中 2-关停成功 3-关停失败 4-重复上架
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOfflineStatus(Long OfflineStatus) {
        this.OfflineStatus = OfflineStatus;
    }

    /**
     * Get 关停状态说明
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OfflineNote 关停状态说明
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOfflineNote() {
        return this.OfflineNote;
    }

    /**
     * Set 关停状态说明
注意：此字段可能返回 null，表示取不到有效值。
     * @param OfflineNote 关停状态说明
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOfflineNote(String OfflineNote) {
        this.OfflineNote = OfflineNote;
    }

    /**
     * Get app来源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DownloadWay app来源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDownloadWay() {
        return this.DownloadWay;
    }

    /**
     * Set app来源
注意：此字段可能返回 null，表示取不到有效值。
     * @param DownloadWay app来源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDownloadWay(String DownloadWay) {
        this.DownloadWay = DownloadWay;
    }

    /**
     * Get 新增时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InsertTime 新增时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInsertTime() {
        return this.InsertTime;
    }

    /**
     * Set 新增时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param InsertTime 新增时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInsertTime(String InsertTime) {
        this.InsertTime = InsertTime;
    }

    /**
     * Get App下载链接
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DownloadCosURL App下载链接
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDownloadCosURL() {
        return this.DownloadCosURL;
    }

    /**
     * Set App下载链接
注意：此字段可能返回 null，表示取不到有效值。
     * @param DownloadCosURL App下载链接
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDownloadCosURL(String DownloadCosURL) {
        this.DownloadCosURL = DownloadCosURL;
    }

    /**
     * Get 资质证明状态:0-不可用 1-可用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CertificationStatus 资质证明状态:0-不可用 1-可用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCertificationStatus() {
        return this.CertificationStatus;
    }

    /**
     * Set 资质证明状态:0-不可用 1-可用
注意：此字段可能返回 null，表示取不到有效值。
     * @param CertificationStatus 资质证明状态:0-不可用 1-可用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCertificationStatus(Long CertificationStatus) {
        this.CertificationStatus = CertificationStatus;
    }

    public FakeAPPData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FakeAPPData(FakeAPPData source) {
        if (source.FakeAPPId != null) {
            this.FakeAPPId = new Long(source.FakeAPPId);
        }
        if (source.BrandName != null) {
            this.BrandName = new String(source.BrandName);
        }
        if (source.Origin != null) {
            this.Origin = new Long(source.Origin);
        }
        if (source.FakeAPPName != null) {
            this.FakeAPPName = new String(source.FakeAPPName);
        }
        if (source.FakeAPPPackageName != null) {
            this.FakeAPPPackageName = new String(source.FakeAPPPackageName);
        }
        if (source.FakeAPPCert != null) {
            this.FakeAPPCert = new String(source.FakeAPPCert);
        }
        if (source.FakeAPPSize != null) {
            this.FakeAPPSize = new String(source.FakeAPPSize);
        }
        if (source.Heat != null) {
            this.Heat = new Long(source.Heat);
        }
        if (source.BlockStatus != null) {
            this.BlockStatus = new Long(source.BlockStatus);
        }
        if (source.BlockNote != null) {
            this.BlockNote = new String(source.BlockNote);
        }
        if (source.OfflineStatus != null) {
            this.OfflineStatus = new Long(source.OfflineStatus);
        }
        if (source.OfflineNote != null) {
            this.OfflineNote = new String(source.OfflineNote);
        }
        if (source.DownloadWay != null) {
            this.DownloadWay = new String(source.DownloadWay);
        }
        if (source.InsertTime != null) {
            this.InsertTime = new String(source.InsertTime);
        }
        if (source.DownloadCosURL != null) {
            this.DownloadCosURL = new String(source.DownloadCosURL);
        }
        if (source.CertificationStatus != null) {
            this.CertificationStatus = new Long(source.CertificationStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FakeAPPId", this.FakeAPPId);
        this.setParamSimple(map, prefix + "BrandName", this.BrandName);
        this.setParamSimple(map, prefix + "Origin", this.Origin);
        this.setParamSimple(map, prefix + "FakeAPPName", this.FakeAPPName);
        this.setParamSimple(map, prefix + "FakeAPPPackageName", this.FakeAPPPackageName);
        this.setParamSimple(map, prefix + "FakeAPPCert", this.FakeAPPCert);
        this.setParamSimple(map, prefix + "FakeAPPSize", this.FakeAPPSize);
        this.setParamSimple(map, prefix + "Heat", this.Heat);
        this.setParamSimple(map, prefix + "BlockStatus", this.BlockStatus);
        this.setParamSimple(map, prefix + "BlockNote", this.BlockNote);
        this.setParamSimple(map, prefix + "OfflineStatus", this.OfflineStatus);
        this.setParamSimple(map, prefix + "OfflineNote", this.OfflineNote);
        this.setParamSimple(map, prefix + "DownloadWay", this.DownloadWay);
        this.setParamSimple(map, prefix + "InsertTime", this.InsertTime);
        this.setParamSimple(map, prefix + "DownloadCosURL", this.DownloadCosURL);
        this.setParamSimple(map, prefix + "CertificationStatus", this.CertificationStatus);

    }
}

