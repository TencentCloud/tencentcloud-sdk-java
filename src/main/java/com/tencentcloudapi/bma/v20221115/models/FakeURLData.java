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

public class FakeURLData extends AbstractModel{

    /**
    * 仿冒网址id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FakeURLId")
    @Expose
    private Long FakeURLId;

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
    * 仿冒网址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FakeURL")
    @Expose
    private String FakeURL;

    /**
    * 仿冒域名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FakeDomain")
    @Expose
    private String FakeDomain;

    /**
    * 热度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Heat")
    @Expose
    private Long Heat;

    /**
    * 拦截处置状态：0-未处置 1-处置中 2-处置成功 3-处置失败
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BlockStatus")
    @Expose
    private Long BlockStatus;

    /**
    * 拦截处置状态说明
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
    * ip地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IP")
    @Expose
    private String IP;

    /**
    * ip地理位置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IPLocation")
    @Expose
    private String IPLocation;

    /**
    * 网站所属单位
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WebCompany")
    @Expose
    private String WebCompany;

    /**
    * 网站性质
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WebAttribute")
    @Expose
    private String WebAttribute;

    /**
    * 网站名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WebName")
    @Expose
    private String WebName;

    /**
    * 备案号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WebICP")
    @Expose
    private String WebICP;

    /**
    * 网站创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WebCreateTime")
    @Expose
    private String WebCreateTime;

    /**
    * 网站过期时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WebExpireTime")
    @Expose
    private String WebExpireTime;

    /**
    * 新增时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InsertTime")
    @Expose
    private String InsertTime;

    /**
    * 资质证明状态：0-不可用 1-可用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CertificationStatus")
    @Expose
    private Long CertificationStatus;

    /**
    * 网址截图
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Snapshot")
    @Expose
    private String Snapshot;

    /**
    * 账户资源状态：0-不可用 1-可用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccountStatus")
    @Expose
    private Long AccountStatus;

    /**
    * 审核状态：0-未审核 1-审核中 2-审核成功 3-审核失败
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AuditStatus")
    @Expose
    private Long AuditStatus;

    /**
     * Get 仿冒网址id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FakeURLId 仿冒网址id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFakeURLId() {
        return this.FakeURLId;
    }

    /**
     * Set 仿冒网址id
注意：此字段可能返回 null，表示取不到有效值。
     * @param FakeURLId 仿冒网址id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFakeURLId(Long FakeURLId) {
        this.FakeURLId = FakeURLId;
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
     * Get 仿冒网址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FakeURL 仿冒网址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFakeURL() {
        return this.FakeURL;
    }

    /**
     * Set 仿冒网址
注意：此字段可能返回 null，表示取不到有效值。
     * @param FakeURL 仿冒网址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFakeURL(String FakeURL) {
        this.FakeURL = FakeURL;
    }

    /**
     * Get 仿冒域名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FakeDomain 仿冒域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFakeDomain() {
        return this.FakeDomain;
    }

    /**
     * Set 仿冒域名
注意：此字段可能返回 null，表示取不到有效值。
     * @param FakeDomain 仿冒域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFakeDomain(String FakeDomain) {
        this.FakeDomain = FakeDomain;
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
     * Get 拦截处置状态：0-未处置 1-处置中 2-处置成功 3-处置失败
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BlockStatus 拦截处置状态：0-未处置 1-处置中 2-处置成功 3-处置失败
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBlockStatus() {
        return this.BlockStatus;
    }

    /**
     * Set 拦截处置状态：0-未处置 1-处置中 2-处置成功 3-处置失败
注意：此字段可能返回 null，表示取不到有效值。
     * @param BlockStatus 拦截处置状态：0-未处置 1-处置中 2-处置成功 3-处置失败
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBlockStatus(Long BlockStatus) {
        this.BlockStatus = BlockStatus;
    }

    /**
     * Get 拦截处置状态说明
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BlockNote 拦截处置状态说明
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBlockNote() {
        return this.BlockNote;
    }

    /**
     * Set 拦截处置状态说明
注意：此字段可能返回 null，表示取不到有效值。
     * @param BlockNote 拦截处置状态说明
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
     * Get ip地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IP ip地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIP() {
        return this.IP;
    }

    /**
     * Set ip地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param IP ip地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIP(String IP) {
        this.IP = IP;
    }

    /**
     * Get ip地理位置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IPLocation ip地理位置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIPLocation() {
        return this.IPLocation;
    }

    /**
     * Set ip地理位置
注意：此字段可能返回 null，表示取不到有效值。
     * @param IPLocation ip地理位置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIPLocation(String IPLocation) {
        this.IPLocation = IPLocation;
    }

    /**
     * Get 网站所属单位
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WebCompany 网站所属单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWebCompany() {
        return this.WebCompany;
    }

    /**
     * Set 网站所属单位
注意：此字段可能返回 null，表示取不到有效值。
     * @param WebCompany 网站所属单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWebCompany(String WebCompany) {
        this.WebCompany = WebCompany;
    }

    /**
     * Get 网站性质
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WebAttribute 网站性质
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWebAttribute() {
        return this.WebAttribute;
    }

    /**
     * Set 网站性质
注意：此字段可能返回 null，表示取不到有效值。
     * @param WebAttribute 网站性质
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWebAttribute(String WebAttribute) {
        this.WebAttribute = WebAttribute;
    }

    /**
     * Get 网站名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WebName 网站名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWebName() {
        return this.WebName;
    }

    /**
     * Set 网站名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param WebName 网站名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWebName(String WebName) {
        this.WebName = WebName;
    }

    /**
     * Get 备案号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WebICP 备案号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWebICP() {
        return this.WebICP;
    }

    /**
     * Set 备案号
注意：此字段可能返回 null，表示取不到有效值。
     * @param WebICP 备案号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWebICP(String WebICP) {
        this.WebICP = WebICP;
    }

    /**
     * Get 网站创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WebCreateTime 网站创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWebCreateTime() {
        return this.WebCreateTime;
    }

    /**
     * Set 网站创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param WebCreateTime 网站创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWebCreateTime(String WebCreateTime) {
        this.WebCreateTime = WebCreateTime;
    }

    /**
     * Get 网站过期时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WebExpireTime 网站过期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWebExpireTime() {
        return this.WebExpireTime;
    }

    /**
     * Set 网站过期时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param WebExpireTime 网站过期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWebExpireTime(String WebExpireTime) {
        this.WebExpireTime = WebExpireTime;
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
     * Get 资质证明状态：0-不可用 1-可用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CertificationStatus 资质证明状态：0-不可用 1-可用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCertificationStatus() {
        return this.CertificationStatus;
    }

    /**
     * Set 资质证明状态：0-不可用 1-可用
注意：此字段可能返回 null，表示取不到有效值。
     * @param CertificationStatus 资质证明状态：0-不可用 1-可用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCertificationStatus(Long CertificationStatus) {
        this.CertificationStatus = CertificationStatus;
    }

    /**
     * Get 网址截图
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Snapshot 网址截图
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSnapshot() {
        return this.Snapshot;
    }

    /**
     * Set 网址截图
注意：此字段可能返回 null，表示取不到有效值。
     * @param Snapshot 网址截图
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSnapshot(String Snapshot) {
        this.Snapshot = Snapshot;
    }

    /**
     * Get 账户资源状态：0-不可用 1-可用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccountStatus 账户资源状态：0-不可用 1-可用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAccountStatus() {
        return this.AccountStatus;
    }

    /**
     * Set 账户资源状态：0-不可用 1-可用
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccountStatus 账户资源状态：0-不可用 1-可用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccountStatus(Long AccountStatus) {
        this.AccountStatus = AccountStatus;
    }

    /**
     * Get 审核状态：0-未审核 1-审核中 2-审核成功 3-审核失败
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AuditStatus 审核状态：0-未审核 1-审核中 2-审核成功 3-审核失败
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAuditStatus() {
        return this.AuditStatus;
    }

    /**
     * Set 审核状态：0-未审核 1-审核中 2-审核成功 3-审核失败
注意：此字段可能返回 null，表示取不到有效值。
     * @param AuditStatus 审核状态：0-未审核 1-审核中 2-审核成功 3-审核失败
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAuditStatus(Long AuditStatus) {
        this.AuditStatus = AuditStatus;
    }

    public FakeURLData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FakeURLData(FakeURLData source) {
        if (source.FakeURLId != null) {
            this.FakeURLId = new Long(source.FakeURLId);
        }
        if (source.BrandName != null) {
            this.BrandName = new String(source.BrandName);
        }
        if (source.Origin != null) {
            this.Origin = new Long(source.Origin);
        }
        if (source.FakeURL != null) {
            this.FakeURL = new String(source.FakeURL);
        }
        if (source.FakeDomain != null) {
            this.FakeDomain = new String(source.FakeDomain);
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
        if (source.IP != null) {
            this.IP = new String(source.IP);
        }
        if (source.IPLocation != null) {
            this.IPLocation = new String(source.IPLocation);
        }
        if (source.WebCompany != null) {
            this.WebCompany = new String(source.WebCompany);
        }
        if (source.WebAttribute != null) {
            this.WebAttribute = new String(source.WebAttribute);
        }
        if (source.WebName != null) {
            this.WebName = new String(source.WebName);
        }
        if (source.WebICP != null) {
            this.WebICP = new String(source.WebICP);
        }
        if (source.WebCreateTime != null) {
            this.WebCreateTime = new String(source.WebCreateTime);
        }
        if (source.WebExpireTime != null) {
            this.WebExpireTime = new String(source.WebExpireTime);
        }
        if (source.InsertTime != null) {
            this.InsertTime = new String(source.InsertTime);
        }
        if (source.CertificationStatus != null) {
            this.CertificationStatus = new Long(source.CertificationStatus);
        }
        if (source.Snapshot != null) {
            this.Snapshot = new String(source.Snapshot);
        }
        if (source.AccountStatus != null) {
            this.AccountStatus = new Long(source.AccountStatus);
        }
        if (source.AuditStatus != null) {
            this.AuditStatus = new Long(source.AuditStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FakeURLId", this.FakeURLId);
        this.setParamSimple(map, prefix + "BrandName", this.BrandName);
        this.setParamSimple(map, prefix + "Origin", this.Origin);
        this.setParamSimple(map, prefix + "FakeURL", this.FakeURL);
        this.setParamSimple(map, prefix + "FakeDomain", this.FakeDomain);
        this.setParamSimple(map, prefix + "Heat", this.Heat);
        this.setParamSimple(map, prefix + "BlockStatus", this.BlockStatus);
        this.setParamSimple(map, prefix + "BlockNote", this.BlockNote);
        this.setParamSimple(map, prefix + "OfflineStatus", this.OfflineStatus);
        this.setParamSimple(map, prefix + "OfflineNote", this.OfflineNote);
        this.setParamSimple(map, prefix + "IP", this.IP);
        this.setParamSimple(map, prefix + "IPLocation", this.IPLocation);
        this.setParamSimple(map, prefix + "WebCompany", this.WebCompany);
        this.setParamSimple(map, prefix + "WebAttribute", this.WebAttribute);
        this.setParamSimple(map, prefix + "WebName", this.WebName);
        this.setParamSimple(map, prefix + "WebICP", this.WebICP);
        this.setParamSimple(map, prefix + "WebCreateTime", this.WebCreateTime);
        this.setParamSimple(map, prefix + "WebExpireTime", this.WebExpireTime);
        this.setParamSimple(map, prefix + "InsertTime", this.InsertTime);
        this.setParamSimple(map, prefix + "CertificationStatus", this.CertificationStatus);
        this.setParamSimple(map, prefix + "Snapshot", this.Snapshot);
        this.setParamSimple(map, prefix + "AccountStatus", this.AccountStatus);
        this.setParamSimple(map, prefix + "AuditStatus", this.AuditStatus);

    }
}

