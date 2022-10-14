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

public class CreateBPProtectURLsRequest extends AbstractModel{

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
    * 保护网站
    */
    @SerializedName("ProtectURLs")
    @Expose
    private String [] ProtectURLs;

    /**
    * 网站名称
    */
    @SerializedName("ProtectWebs")
    @Expose
    private String [] ProtectWebs;

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
     * Get 保护网站 
     * @return ProtectURLs 保护网站
     */
    public String [] getProtectURLs() {
        return this.ProtectURLs;
    }

    /**
     * Set 保护网站
     * @param ProtectURLs 保护网站
     */
    public void setProtectURLs(String [] ProtectURLs) {
        this.ProtectURLs = ProtectURLs;
    }

    /**
     * Get 网站名称 
     * @return ProtectWebs 网站名称
     */
    public String [] getProtectWebs() {
        return this.ProtectWebs;
    }

    /**
     * Set 网站名称
     * @param ProtectWebs 网站名称
     */
    public void setProtectWebs(String [] ProtectWebs) {
        this.ProtectWebs = ProtectWebs;
    }

    public CreateBPProtectURLsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateBPProtectURLsRequest(CreateBPProtectURLsRequest source) {
        if (source.CompanyName != null) {
            this.CompanyName = new String(source.CompanyName);
        }
        if (source.Phone != null) {
            this.Phone = new String(source.Phone);
        }
        if (source.LicenseName != null) {
            this.LicenseName = new String(source.LicenseName);
        }
        if (source.ProtectURLs != null) {
            this.ProtectURLs = new String[source.ProtectURLs.length];
            for (int i = 0; i < source.ProtectURLs.length; i++) {
                this.ProtectURLs[i] = new String(source.ProtectURLs[i]);
            }
        }
        if (source.ProtectWebs != null) {
            this.ProtectWebs = new String[source.ProtectWebs.length];
            for (int i = 0; i < source.ProtectWebs.length; i++) {
                this.ProtectWebs[i] = new String(source.ProtectWebs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CompanyName", this.CompanyName);
        this.setParamSimple(map, prefix + "Phone", this.Phone);
        this.setParamSimple(map, prefix + "LicenseName", this.LicenseName);
        this.setParamArraySimple(map, prefix + "ProtectURLs.", this.ProtectURLs);
        this.setParamArraySimple(map, prefix + "ProtectWebs.", this.ProtectWebs);

    }
}

