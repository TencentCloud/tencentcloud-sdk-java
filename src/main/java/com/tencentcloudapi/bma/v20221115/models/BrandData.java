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

public class BrandData extends AbstractModel{

    /**
    * 品牌Id
    */
    @SerializedName("CompanyId")
    @Expose
    private Long CompanyId;

    /**
    * 企业名称
    */
    @SerializedName("CompanyName")
    @Expose
    private String CompanyName;

    /**
    * 品牌名称
    */
    @SerializedName("BrandName")
    @Expose
    private String BrandName;

    /**
    * 联系电话
    */
    @SerializedName("Phone")
    @Expose
    private String Phone;

    /**
    * 营业执照
    */
    @SerializedName("License")
    @Expose
    private String License;

    /**
    * 营业执照审核状态
    */
    @SerializedName("LicenseStatus")
    @Expose
    private Long LicenseStatus;

    /**
    * 营业执照审核状态说明
    */
    @SerializedName("LicenseNote")
    @Expose
    private String LicenseNote;

    /**
    * 授权书
    */
    @SerializedName("Authorization")
    @Expose
    private String Authorization;

    /**
    * 授权书审核状态
    */
    @SerializedName("AuthorizationStatus")
    @Expose
    private Long AuthorizationStatus;

    /**
    * 授权书审核状态说明
    */
    @SerializedName("AuthorizationNote")
    @Expose
    private String AuthorizationNote;

    /**
    * 商标信息
    */
    @SerializedName("Trademarks")
    @Expose
    private TrademarkData [] Trademarks;

    /**
    * 新增时间
    */
    @SerializedName("InsertTime")
    @Expose
    private String InsertTime;

    /**
    * 服务信息
    */
    @SerializedName("Services")
    @Expose
    private ServiceData Services;

    /**
    * 账号id
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
     * Get 品牌Id 
     * @return CompanyId 品牌Id
     */
    public Long getCompanyId() {
        return this.CompanyId;
    }

    /**
     * Set 品牌Id
     * @param CompanyId 品牌Id
     */
    public void setCompanyId(Long CompanyId) {
        this.CompanyId = CompanyId;
    }

    /**
     * Get 企业名称 
     * @return CompanyName 企业名称
     */
    public String getCompanyName() {
        return this.CompanyName;
    }

    /**
     * Set 企业名称
     * @param CompanyName 企业名称
     */
    public void setCompanyName(String CompanyName) {
        this.CompanyName = CompanyName;
    }

    /**
     * Get 品牌名称 
     * @return BrandName 品牌名称
     */
    public String getBrandName() {
        return this.BrandName;
    }

    /**
     * Set 品牌名称
     * @param BrandName 品牌名称
     */
    public void setBrandName(String BrandName) {
        this.BrandName = BrandName;
    }

    /**
     * Get 联系电话 
     * @return Phone 联系电话
     */
    public String getPhone() {
        return this.Phone;
    }

    /**
     * Set 联系电话
     * @param Phone 联系电话
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    /**
     * Get 营业执照 
     * @return License 营业执照
     */
    public String getLicense() {
        return this.License;
    }

    /**
     * Set 营业执照
     * @param License 营业执照
     */
    public void setLicense(String License) {
        this.License = License;
    }

    /**
     * Get 营业执照审核状态 
     * @return LicenseStatus 营业执照审核状态
     */
    public Long getLicenseStatus() {
        return this.LicenseStatus;
    }

    /**
     * Set 营业执照审核状态
     * @param LicenseStatus 营业执照审核状态
     */
    public void setLicenseStatus(Long LicenseStatus) {
        this.LicenseStatus = LicenseStatus;
    }

    /**
     * Get 营业执照审核状态说明 
     * @return LicenseNote 营业执照审核状态说明
     */
    public String getLicenseNote() {
        return this.LicenseNote;
    }

    /**
     * Set 营业执照审核状态说明
     * @param LicenseNote 营业执照审核状态说明
     */
    public void setLicenseNote(String LicenseNote) {
        this.LicenseNote = LicenseNote;
    }

    /**
     * Get 授权书 
     * @return Authorization 授权书
     */
    public String getAuthorization() {
        return this.Authorization;
    }

    /**
     * Set 授权书
     * @param Authorization 授权书
     */
    public void setAuthorization(String Authorization) {
        this.Authorization = Authorization;
    }

    /**
     * Get 授权书审核状态 
     * @return AuthorizationStatus 授权书审核状态
     */
    public Long getAuthorizationStatus() {
        return this.AuthorizationStatus;
    }

    /**
     * Set 授权书审核状态
     * @param AuthorizationStatus 授权书审核状态
     */
    public void setAuthorizationStatus(Long AuthorizationStatus) {
        this.AuthorizationStatus = AuthorizationStatus;
    }

    /**
     * Get 授权书审核状态说明 
     * @return AuthorizationNote 授权书审核状态说明
     */
    public String getAuthorizationNote() {
        return this.AuthorizationNote;
    }

    /**
     * Set 授权书审核状态说明
     * @param AuthorizationNote 授权书审核状态说明
     */
    public void setAuthorizationNote(String AuthorizationNote) {
        this.AuthorizationNote = AuthorizationNote;
    }

    /**
     * Get 商标信息 
     * @return Trademarks 商标信息
     */
    public TrademarkData [] getTrademarks() {
        return this.Trademarks;
    }

    /**
     * Set 商标信息
     * @param Trademarks 商标信息
     */
    public void setTrademarks(TrademarkData [] Trademarks) {
        this.Trademarks = Trademarks;
    }

    /**
     * Get 新增时间 
     * @return InsertTime 新增时间
     */
    public String getInsertTime() {
        return this.InsertTime;
    }

    /**
     * Set 新增时间
     * @param InsertTime 新增时间
     */
    public void setInsertTime(String InsertTime) {
        this.InsertTime = InsertTime;
    }

    /**
     * Get 服务信息 
     * @return Services 服务信息
     */
    public ServiceData getServices() {
        return this.Services;
    }

    /**
     * Set 服务信息
     * @param Services 服务信息
     */
    public void setServices(ServiceData Services) {
        this.Services = Services;
    }

    /**
     * Get 账号id 
     * @return Uin 账号id
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 账号id
     * @param Uin 账号id
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    public BrandData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BrandData(BrandData source) {
        if (source.CompanyId != null) {
            this.CompanyId = new Long(source.CompanyId);
        }
        if (source.CompanyName != null) {
            this.CompanyName = new String(source.CompanyName);
        }
        if (source.BrandName != null) {
            this.BrandName = new String(source.BrandName);
        }
        if (source.Phone != null) {
            this.Phone = new String(source.Phone);
        }
        if (source.License != null) {
            this.License = new String(source.License);
        }
        if (source.LicenseStatus != null) {
            this.LicenseStatus = new Long(source.LicenseStatus);
        }
        if (source.LicenseNote != null) {
            this.LicenseNote = new String(source.LicenseNote);
        }
        if (source.Authorization != null) {
            this.Authorization = new String(source.Authorization);
        }
        if (source.AuthorizationStatus != null) {
            this.AuthorizationStatus = new Long(source.AuthorizationStatus);
        }
        if (source.AuthorizationNote != null) {
            this.AuthorizationNote = new String(source.AuthorizationNote);
        }
        if (source.Trademarks != null) {
            this.Trademarks = new TrademarkData[source.Trademarks.length];
            for (int i = 0; i < source.Trademarks.length; i++) {
                this.Trademarks[i] = new TrademarkData(source.Trademarks[i]);
            }
        }
        if (source.InsertTime != null) {
            this.InsertTime = new String(source.InsertTime);
        }
        if (source.Services != null) {
            this.Services = new ServiceData(source.Services);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CompanyId", this.CompanyId);
        this.setParamSimple(map, prefix + "CompanyName", this.CompanyName);
        this.setParamSimple(map, prefix + "BrandName", this.BrandName);
        this.setParamSimple(map, prefix + "Phone", this.Phone);
        this.setParamSimple(map, prefix + "License", this.License);
        this.setParamSimple(map, prefix + "LicenseStatus", this.LicenseStatus);
        this.setParamSimple(map, prefix + "LicenseNote", this.LicenseNote);
        this.setParamSimple(map, prefix + "Authorization", this.Authorization);
        this.setParamSimple(map, prefix + "AuthorizationStatus", this.AuthorizationStatus);
        this.setParamSimple(map, prefix + "AuthorizationNote", this.AuthorizationNote);
        this.setParamArrayObj(map, prefix + "Trademarks.", this.Trademarks);
        this.setParamSimple(map, prefix + "InsertTime", this.InsertTime);
        this.setParamObj(map, prefix + "Services.", this.Services);
        this.setParamSimple(map, prefix + "Uin", this.Uin);

    }
}

