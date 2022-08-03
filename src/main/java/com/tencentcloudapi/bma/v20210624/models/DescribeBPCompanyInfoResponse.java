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
    * xx
    */
    @SerializedName("CompanyName")
    @Expose
    private String CompanyName;

    /**
    * xx
    */
    @SerializedName("Phone")
    @Expose
    private String Phone;

    /**
    * xx
    */
    @SerializedName("LicenseName")
    @Expose
    private String LicenseName;

    /**
    * xx
    */
    @SerializedName("LicenseStatus")
    @Expose
    private Long LicenseStatus;

    /**
    * xx
    */
    @SerializedName("LicenseNote")
    @Expose
    private String LicenseNote;

    /**
    * xx
    */
    @SerializedName("AuthorizationName")
    @Expose
    private String AuthorizationName;

    /**
    * xx
    */
    @SerializedName("AuthorizationStatus")
    @Expose
    private Long AuthorizationStatus;

    /**
    * xx
    */
    @SerializedName("AuthorizationNote")
    @Expose
    private String AuthorizationNote;

    /**
    * xx
    */
    @SerializedName("BrandDatas")
    @Expose
    private BrandData [] BrandDatas;

    /**
    * xx
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
     * Get xx 
     * @return CompanyName xx
     */
    public String getCompanyName() {
        return this.CompanyName;
    }

    /**
     * Set xx
     * @param CompanyName xx
     */
    public void setCompanyName(String CompanyName) {
        this.CompanyName = CompanyName;
    }

    /**
     * Get xx 
     * @return Phone xx
     */
    public String getPhone() {
        return this.Phone;
    }

    /**
     * Set xx
     * @param Phone xx
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    /**
     * Get xx 
     * @return LicenseName xx
     */
    public String getLicenseName() {
        return this.LicenseName;
    }

    /**
     * Set xx
     * @param LicenseName xx
     */
    public void setLicenseName(String LicenseName) {
        this.LicenseName = LicenseName;
    }

    /**
     * Get xx 
     * @return LicenseStatus xx
     */
    public Long getLicenseStatus() {
        return this.LicenseStatus;
    }

    /**
     * Set xx
     * @param LicenseStatus xx
     */
    public void setLicenseStatus(Long LicenseStatus) {
        this.LicenseStatus = LicenseStatus;
    }

    /**
     * Get xx 
     * @return LicenseNote xx
     */
    public String getLicenseNote() {
        return this.LicenseNote;
    }

    /**
     * Set xx
     * @param LicenseNote xx
     */
    public void setLicenseNote(String LicenseNote) {
        this.LicenseNote = LicenseNote;
    }

    /**
     * Get xx 
     * @return AuthorizationName xx
     */
    public String getAuthorizationName() {
        return this.AuthorizationName;
    }

    /**
     * Set xx
     * @param AuthorizationName xx
     */
    public void setAuthorizationName(String AuthorizationName) {
        this.AuthorizationName = AuthorizationName;
    }

    /**
     * Get xx 
     * @return AuthorizationStatus xx
     */
    public Long getAuthorizationStatus() {
        return this.AuthorizationStatus;
    }

    /**
     * Set xx
     * @param AuthorizationStatus xx
     */
    public void setAuthorizationStatus(Long AuthorizationStatus) {
        this.AuthorizationStatus = AuthorizationStatus;
    }

    /**
     * Get xx 
     * @return AuthorizationNote xx
     */
    public String getAuthorizationNote() {
        return this.AuthorizationNote;
    }

    /**
     * Set xx
     * @param AuthorizationNote xx
     */
    public void setAuthorizationNote(String AuthorizationNote) {
        this.AuthorizationNote = AuthorizationNote;
    }

    /**
     * Get xx 
     * @return BrandDatas xx
     */
    public BrandData [] getBrandDatas() {
        return this.BrandDatas;
    }

    /**
     * Set xx
     * @param BrandDatas xx
     */
    public void setBrandDatas(BrandData [] BrandDatas) {
        this.BrandDatas = BrandDatas;
    }

    /**
     * Get xx 
     * @return CompanyId xx
     */
    public Long getCompanyId() {
        return this.CompanyId;
    }

    /**
     * Set xx
     * @param CompanyId xx
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

