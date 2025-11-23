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
package com.tencentcloudapi.ctem.v20231128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSubDomainRequest extends AbstractModel {

    /**
    * 企业Id
    */
    @SerializedName("CustomerId")
    @Expose
    private Long CustomerId;

    /**
    * 子域名
    */
    @SerializedName("SubDomain")
    @Expose
    private String SubDomain;

    /**
    * Ip
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 国家
    */
    @SerializedName("Country")
    @Expose
    private String Country;

    /**
    * 省
    */
    @SerializedName("Province")
    @Expose
    private String Province;

    /**
    * 城市
    */
    @SerializedName("City")
    @Expose
    private String City;

    /**
    * Isp
    */
    @SerializedName("Isp")
    @Expose
    private String Isp;

    /**
    * 子公司
    */
    @SerializedName("EnterpriseUid")
    @Expose
    private String EnterpriseUid;

    /**
     * Get 企业Id 
     * @return CustomerId 企业Id
     */
    public Long getCustomerId() {
        return this.CustomerId;
    }

    /**
     * Set 企业Id
     * @param CustomerId 企业Id
     */
    public void setCustomerId(Long CustomerId) {
        this.CustomerId = CustomerId;
    }

    /**
     * Get 子域名 
     * @return SubDomain 子域名
     */
    public String getSubDomain() {
        return this.SubDomain;
    }

    /**
     * Set 子域名
     * @param SubDomain 子域名
     */
    public void setSubDomain(String SubDomain) {
        this.SubDomain = SubDomain;
    }

    /**
     * Get Ip 
     * @return Ip Ip
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set Ip
     * @param Ip Ip
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 国家 
     * @return Country 国家
     */
    public String getCountry() {
        return this.Country;
    }

    /**
     * Set 国家
     * @param Country 国家
     */
    public void setCountry(String Country) {
        this.Country = Country;
    }

    /**
     * Get 省 
     * @return Province 省
     */
    public String getProvince() {
        return this.Province;
    }

    /**
     * Set 省
     * @param Province 省
     */
    public void setProvince(String Province) {
        this.Province = Province;
    }

    /**
     * Get 城市 
     * @return City 城市
     */
    public String getCity() {
        return this.City;
    }

    /**
     * Set 城市
     * @param City 城市
     */
    public void setCity(String City) {
        this.City = City;
    }

    /**
     * Get Isp 
     * @return Isp Isp
     */
    public String getIsp() {
        return this.Isp;
    }

    /**
     * Set Isp
     * @param Isp Isp
     */
    public void setIsp(String Isp) {
        this.Isp = Isp;
    }

    /**
     * Get 子公司 
     * @return EnterpriseUid 子公司
     */
    public String getEnterpriseUid() {
        return this.EnterpriseUid;
    }

    /**
     * Set 子公司
     * @param EnterpriseUid 子公司
     */
    public void setEnterpriseUid(String EnterpriseUid) {
        this.EnterpriseUid = EnterpriseUid;
    }

    public CreateSubDomainRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSubDomainRequest(CreateSubDomainRequest source) {
        if (source.CustomerId != null) {
            this.CustomerId = new Long(source.CustomerId);
        }
        if (source.SubDomain != null) {
            this.SubDomain = new String(source.SubDomain);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Country != null) {
            this.Country = new String(source.Country);
        }
        if (source.Province != null) {
            this.Province = new String(source.Province);
        }
        if (source.City != null) {
            this.City = new String(source.City);
        }
        if (source.Isp != null) {
            this.Isp = new String(source.Isp);
        }
        if (source.EnterpriseUid != null) {
            this.EnterpriseUid = new String(source.EnterpriseUid);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CustomerId", this.CustomerId);
        this.setParamSimple(map, prefix + "SubDomain", this.SubDomain);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Country", this.Country);
        this.setParamSimple(map, prefix + "Province", this.Province);
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamSimple(map, prefix + "Isp", this.Isp);
        this.setParamSimple(map, prefix + "EnterpriseUid", this.EnterpriseUid);

    }
}

