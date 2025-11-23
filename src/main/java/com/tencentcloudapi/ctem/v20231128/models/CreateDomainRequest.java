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

public class CreateDomainRequest extends AbstractModel {

    /**
    * 企业Id
    */
    @SerializedName("CustomerId")
    @Expose
    private Long CustomerId;

    /**
    * 主域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * ICP
    */
    @SerializedName("ICP")
    @Expose
    private String ICP;

    /**
    * 注册时间
    */
    @SerializedName("RegisteredTime")
    @Expose
    private String RegisteredTime;

    /**
    * 过期时间
    */
    @SerializedName("ExpiredTime")
    @Expose
    private String ExpiredTime;

    /**
    * 公司
    */
    @SerializedName("Company")
    @Expose
    private String Company;

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
     * Get 主域名 
     * @return Domain 主域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 主域名
     * @param Domain 主域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get ICP 
     * @return ICP ICP
     */
    public String getICP() {
        return this.ICP;
    }

    /**
     * Set ICP
     * @param ICP ICP
     */
    public void setICP(String ICP) {
        this.ICP = ICP;
    }

    /**
     * Get 注册时间 
     * @return RegisteredTime 注册时间
     */
    public String getRegisteredTime() {
        return this.RegisteredTime;
    }

    /**
     * Set 注册时间
     * @param RegisteredTime 注册时间
     */
    public void setRegisteredTime(String RegisteredTime) {
        this.RegisteredTime = RegisteredTime;
    }

    /**
     * Get 过期时间 
     * @return ExpiredTime 过期时间
     */
    public String getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set 过期时间
     * @param ExpiredTime 过期时间
     */
    public void setExpiredTime(String ExpiredTime) {
        this.ExpiredTime = ExpiredTime;
    }

    /**
     * Get 公司 
     * @return Company 公司
     */
    public String getCompany() {
        return this.Company;
    }

    /**
     * Set 公司
     * @param Company 公司
     */
    public void setCompany(String Company) {
        this.Company = Company;
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

    public CreateDomainRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDomainRequest(CreateDomainRequest source) {
        if (source.CustomerId != null) {
            this.CustomerId = new Long(source.CustomerId);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.ICP != null) {
            this.ICP = new String(source.ICP);
        }
        if (source.RegisteredTime != null) {
            this.RegisteredTime = new String(source.RegisteredTime);
        }
        if (source.ExpiredTime != null) {
            this.ExpiredTime = new String(source.ExpiredTime);
        }
        if (source.Company != null) {
            this.Company = new String(source.Company);
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
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "ICP", this.ICP);
        this.setParamSimple(map, prefix + "RegisteredTime", this.RegisteredTime);
        this.setParamSimple(map, prefix + "ExpiredTime", this.ExpiredTime);
        this.setParamSimple(map, prefix + "Company", this.Company);
        this.setParamSimple(map, prefix + "EnterpriseUid", this.EnterpriseUid);

    }
}

