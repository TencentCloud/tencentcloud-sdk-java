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
package com.tencentcloudapi.bma.v20210624.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBPCompanyInfoResponse extends AbstractModel{

    /**
    * 企业名称
    */
    @SerializedName("CompanyName")
    @Expose
    private String CompanyName;

    /**
    * 电话号码
    */
    @SerializedName("Phone")
    @Expose
    private String Phone;

    /**
    * 营业执照
    */
    @SerializedName("LicenseName")
    @Expose
    private String LicenseName;

    /**
    * 营业执照审核状态 1-审核中 2-审核未通过，3、审核通过
    */
    @SerializedName("LicenseStatus")
    @Expose
    private Long LicenseStatus;

    /**
    * 营业执照备注
    */
    @SerializedName("LicenseNote")
    @Expose
    private String LicenseNote;

    /**
    * 授权书
    */
    @SerializedName("AuthorizationName")
    @Expose
    private String AuthorizationName;

    /**
    * 授权书审核状态
    */
    @SerializedName("AuthorizationStatus")
    @Expose
    private Long AuthorizationStatus;

    /**
    * 授权书备注
    */
    @SerializedName("AuthorizationNote")
    @Expose
    private String AuthorizationNote;

    /**
    * 品牌信息
    */
    @SerializedName("BrandDatas")
    @Expose
    private BrandData [] BrandDatas;

    /**
    * 企业ID
    */
    @SerializedName("CompanyId")
    @Expose
    private Long CompanyId;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

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
     * Get 电话号码 
     * @return Phone 电话号码
     */
    public String getPhone() {
        return this.Phone;
    }

    /**
     * Set 电话号码
     * @param Phone 电话号码
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    /**
     * Get 营业执照 
     * @return LicenseName 营业执照
     */
    public String getLicenseName() {
        return this.LicenseName;
    }

    /**
     * Set 营业执照
     * @param LicenseName 营业执照
     */
    public void setLicenseName(String LicenseName) {
        this.LicenseName = LicenseName;
    }

    /**
     * Get 营业执照审核状态 1-审核中 2-审核未通过，3、审核通过 
     * @return LicenseStatus 营业执照审核状态 1-审核中 2-审核未通过，3、审核通过
     */
    public Long getLicenseStatus() {
        return this.LicenseStatus;
    }

    /**
     * Set 营业执照审核状态 1-审核中 2-审核未通过，3、审核通过
     * @param LicenseStatus 营业执照审核状态 1-审核中 2-审核未通过，3、审核通过
     */
    public void setLicenseStatus(Long LicenseStatus) {
        this.LicenseStatus = LicenseStatus;
    }

    /**
     * Get 营业执照备注 
     * @return LicenseNote 营业执照备注
     */
    public String getLicenseNote() {
        return this.LicenseNote;
    }

    /**
     * Set 营业执照备注
     * @param LicenseNote 营业执照备注
     */
    public void setLicenseNote(String LicenseNote) {
        this.LicenseNote = LicenseNote;
    }

    /**
     * Get 授权书 
     * @return AuthorizationName 授权书
     */
    public String getAuthorizationName() {
        return this.AuthorizationName;
    }

    /**
     * Set 授权书
     * @param AuthorizationName 授权书
     */
    public void setAuthorizationName(String AuthorizationName) {
        this.AuthorizationName = AuthorizationName;
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
     * Get 授权书备注 
     * @return AuthorizationNote 授权书备注
     */
    public String getAuthorizationNote() {
        return this.AuthorizationNote;
    }

    /**
     * Set 授权书备注
     * @param AuthorizationNote 授权书备注
     */
    public void setAuthorizationNote(String AuthorizationNote) {
        this.AuthorizationNote = AuthorizationNote;
    }

    /**
     * Get 品牌信息 
     * @return BrandDatas 品牌信息
     */
    public BrandData [] getBrandDatas() {
        return this.BrandDatas;
    }

    /**
     * Set 品牌信息
     * @param BrandDatas 品牌信息
     */
    public void setBrandDatas(BrandData [] BrandDatas) {
        this.BrandDatas = BrandDatas;
    }

    /**
     * Get 企业ID 
     * @return CompanyId 企业ID
     */
    public Long getCompanyId() {
        return this.CompanyId;
    }

    /**
     * Set 企业ID
     * @param CompanyId 企业ID
     */
    public void setCompanyId(Long CompanyId) {
        this.CompanyId = CompanyId;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeBPCompanyInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBPCompanyInfoResponse(DescribeBPCompanyInfoResponse source) {
        if (source.CompanyName != null) {
            this.CompanyName = new String(source.CompanyName);
        }
        if (source.Phone != null) {
            this.Phone = new String(source.Phone);
        }
        if (source.LicenseName != null) {
            this.LicenseName = new String(source.LicenseName);
        }
        if (source.LicenseStatus != null) {
            this.LicenseStatus = new Long(source.LicenseStatus);
        }
        if (source.LicenseNote != null) {
            this.LicenseNote = new String(source.LicenseNote);
        }
        if (source.AuthorizationName != null) {
            this.AuthorizationName = new String(source.AuthorizationName);
        }
        if (source.AuthorizationStatus != null) {
            this.AuthorizationStatus = new Long(source.AuthorizationStatus);
        }
        if (source.AuthorizationNote != null) {
            this.AuthorizationNote = new String(source.AuthorizationNote);
        }
        if (source.BrandDatas != null) {
            this.BrandDatas = new BrandData[source.BrandDatas.length];
            for (int i = 0; i < source.BrandDatas.length; i++) {
                this.BrandDatas[i] = new BrandData(source.BrandDatas[i]);
            }
        }
        if (source.CompanyId != null) {
            this.CompanyId = new Long(source.CompanyId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CompanyName", this.CompanyName);
        this.setParamSimple(map, prefix + "Phone", this.Phone);
        this.setParamSimple(map, prefix + "LicenseName", this.LicenseName);
        this.setParamSimple(map, prefix + "LicenseStatus", this.LicenseStatus);
        this.setParamSimple(map, prefix + "LicenseNote", this.LicenseNote);
        this.setParamSimple(map, prefix + "AuthorizationName", this.AuthorizationName);
        this.setParamSimple(map, prefix + "AuthorizationStatus", this.AuthorizationStatus);
        this.setParamSimple(map, prefix + "AuthorizationNote", this.AuthorizationNote);
        this.setParamArrayObj(map, prefix + "BrandDatas.", this.BrandDatas);
        this.setParamSimple(map, prefix + "CompanyId", this.CompanyId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

