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
    * <p>企业Id</p>
    */
    @SerializedName("CustomerId")
    @Expose
    private Long CustomerId;

    /**
    * <p>子域名</p>
    */
    @SerializedName("SubDomain")
    @Expose
    private String SubDomain;

    /**
    * <p>Ip</p>
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * <p>国家</p>
    */
    @SerializedName("Country")
    @Expose
    private String Country;

    /**
    * <p>省</p>
    */
    @SerializedName("Province")
    @Expose
    private String Province;

    /**
    * <p>城市</p>
    */
    @SerializedName("City")
    @Expose
    private String City;

    /**
    * <p>Isp</p>
    */
    @SerializedName("Isp")
    @Expose
    private String Isp;

    /**
    * <p>子公司</p>
    */
    @SerializedName("EnterpriseUid")
    @Expose
    private String EnterpriseUid;

    /**
    * <p>DNS解析类型。A、AAAA、CNAME等</p>
    */
    @SerializedName("DnsType")
    @Expose
    private String DnsType;

    /**
    * <p>DNS解析值。域名或者ip</p>
    */
    @SerializedName("DnsValue")
    @Expose
    private String DnsValue;

    /**
     * Get <p>企业Id</p> 
     * @return CustomerId <p>企业Id</p>
     */
    public Long getCustomerId() {
        return this.CustomerId;
    }

    /**
     * Set <p>企业Id</p>
     * @param CustomerId <p>企业Id</p>
     */
    public void setCustomerId(Long CustomerId) {
        this.CustomerId = CustomerId;
    }

    /**
     * Get <p>子域名</p> 
     * @return SubDomain <p>子域名</p>
     */
    public String getSubDomain() {
        return this.SubDomain;
    }

    /**
     * Set <p>子域名</p>
     * @param SubDomain <p>子域名</p>
     */
    public void setSubDomain(String SubDomain) {
        this.SubDomain = SubDomain;
    }

    /**
     * Get <p>Ip</p> 
     * @return Ip <p>Ip</p>
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set <p>Ip</p>
     * @param Ip <p>Ip</p>
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get <p>国家</p> 
     * @return Country <p>国家</p>
     */
    public String getCountry() {
        return this.Country;
    }

    /**
     * Set <p>国家</p>
     * @param Country <p>国家</p>
     */
    public void setCountry(String Country) {
        this.Country = Country;
    }

    /**
     * Get <p>省</p> 
     * @return Province <p>省</p>
     */
    public String getProvince() {
        return this.Province;
    }

    /**
     * Set <p>省</p>
     * @param Province <p>省</p>
     */
    public void setProvince(String Province) {
        this.Province = Province;
    }

    /**
     * Get <p>城市</p> 
     * @return City <p>城市</p>
     */
    public String getCity() {
        return this.City;
    }

    /**
     * Set <p>城市</p>
     * @param City <p>城市</p>
     */
    public void setCity(String City) {
        this.City = City;
    }

    /**
     * Get <p>Isp</p> 
     * @return Isp <p>Isp</p>
     */
    public String getIsp() {
        return this.Isp;
    }

    /**
     * Set <p>Isp</p>
     * @param Isp <p>Isp</p>
     */
    public void setIsp(String Isp) {
        this.Isp = Isp;
    }

    /**
     * Get <p>子公司</p> 
     * @return EnterpriseUid <p>子公司</p>
     */
    public String getEnterpriseUid() {
        return this.EnterpriseUid;
    }

    /**
     * Set <p>子公司</p>
     * @param EnterpriseUid <p>子公司</p>
     */
    public void setEnterpriseUid(String EnterpriseUid) {
        this.EnterpriseUid = EnterpriseUid;
    }

    /**
     * Get <p>DNS解析类型。A、AAAA、CNAME等</p> 
     * @return DnsType <p>DNS解析类型。A、AAAA、CNAME等</p>
     */
    public String getDnsType() {
        return this.DnsType;
    }

    /**
     * Set <p>DNS解析类型。A、AAAA、CNAME等</p>
     * @param DnsType <p>DNS解析类型。A、AAAA、CNAME等</p>
     */
    public void setDnsType(String DnsType) {
        this.DnsType = DnsType;
    }

    /**
     * Get <p>DNS解析值。域名或者ip</p> 
     * @return DnsValue <p>DNS解析值。域名或者ip</p>
     */
    public String getDnsValue() {
        return this.DnsValue;
    }

    /**
     * Set <p>DNS解析值。域名或者ip</p>
     * @param DnsValue <p>DNS解析值。域名或者ip</p>
     */
    public void setDnsValue(String DnsValue) {
        this.DnsValue = DnsValue;
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
        if (source.DnsType != null) {
            this.DnsType = new String(source.DnsType);
        }
        if (source.DnsValue != null) {
            this.DnsValue = new String(source.DnsValue);
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
        this.setParamSimple(map, prefix + "DnsType", this.DnsType);
        this.setParamSimple(map, prefix + "DnsValue", this.DnsValue);

    }
}

