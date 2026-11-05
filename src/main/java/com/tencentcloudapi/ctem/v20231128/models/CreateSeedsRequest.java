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

public class CreateSeedsRequest extends AbstractModel {

    /**
    * <p>企业ID</p>
    */
    @SerializedName("CustomerId")
    @Expose
    private Long CustomerId;

    /**
    * <p>ip种子数组</p>
    */
    @SerializedName("Ips")
    @Expose
    private String [] Ips;

    /**
    * <p>icon种子数组</p>
    */
    @SerializedName("Icons")
    @Expose
    private String [] Icons;

    /**
    * <p>主域名种子数组</p>
    */
    @SerializedName("Domains")
    @Expose
    private String [] Domains;

    /**
    * <p>title种子数组</p>
    */
    @SerializedName("Titles")
    @Expose
    private String [] Titles;

    /**
    * <p>子域名种子数组</p>
    */
    @SerializedName("SubDomains")
    @Expose
    private String [] SubDomains;

    /**
    * <p>关键词种子数组</p>
    */
    @SerializedName("Keywords")
    @Expose
    private String [] Keywords;

    /**
    * <p>母公司种子数组</p>
    */
    @SerializedName("ParentCompanies")
    @Expose
    private String [] ParentCompanies;

    /**
    * <p>关键词用途：leakage_code代码泄露/leakage_data其他泄露/wechat_applet微信小程序/wechat_official_account微信公众号，不填=全部用途</p>
    */
    @SerializedName("KeywordPurposes")
    @Expose
    private String [] KeywordPurposes;

    /**
     * Get <p>企业ID</p> 
     * @return CustomerId <p>企业ID</p>
     */
    public Long getCustomerId() {
        return this.CustomerId;
    }

    /**
     * Set <p>企业ID</p>
     * @param CustomerId <p>企业ID</p>
     */
    public void setCustomerId(Long CustomerId) {
        this.CustomerId = CustomerId;
    }

    /**
     * Get <p>ip种子数组</p> 
     * @return Ips <p>ip种子数组</p>
     */
    public String [] getIps() {
        return this.Ips;
    }

    /**
     * Set <p>ip种子数组</p>
     * @param Ips <p>ip种子数组</p>
     */
    public void setIps(String [] Ips) {
        this.Ips = Ips;
    }

    /**
     * Get <p>icon种子数组</p> 
     * @return Icons <p>icon种子数组</p>
     */
    public String [] getIcons() {
        return this.Icons;
    }

    /**
     * Set <p>icon种子数组</p>
     * @param Icons <p>icon种子数组</p>
     */
    public void setIcons(String [] Icons) {
        this.Icons = Icons;
    }

    /**
     * Get <p>主域名种子数组</p> 
     * @return Domains <p>主域名种子数组</p>
     */
    public String [] getDomains() {
        return this.Domains;
    }

    /**
     * Set <p>主域名种子数组</p>
     * @param Domains <p>主域名种子数组</p>
     */
    public void setDomains(String [] Domains) {
        this.Domains = Domains;
    }

    /**
     * Get <p>title种子数组</p> 
     * @return Titles <p>title种子数组</p>
     */
    public String [] getTitles() {
        return this.Titles;
    }

    /**
     * Set <p>title种子数组</p>
     * @param Titles <p>title种子数组</p>
     */
    public void setTitles(String [] Titles) {
        this.Titles = Titles;
    }

    /**
     * Get <p>子域名种子数组</p> 
     * @return SubDomains <p>子域名种子数组</p>
     */
    public String [] getSubDomains() {
        return this.SubDomains;
    }

    /**
     * Set <p>子域名种子数组</p>
     * @param SubDomains <p>子域名种子数组</p>
     */
    public void setSubDomains(String [] SubDomains) {
        this.SubDomains = SubDomains;
    }

    /**
     * Get <p>关键词种子数组</p> 
     * @return Keywords <p>关键词种子数组</p>
     */
    public String [] getKeywords() {
        return this.Keywords;
    }

    /**
     * Set <p>关键词种子数组</p>
     * @param Keywords <p>关键词种子数组</p>
     */
    public void setKeywords(String [] Keywords) {
        this.Keywords = Keywords;
    }

    /**
     * Get <p>母公司种子数组</p> 
     * @return ParentCompanies <p>母公司种子数组</p>
     */
    public String [] getParentCompanies() {
        return this.ParentCompanies;
    }

    /**
     * Set <p>母公司种子数组</p>
     * @param ParentCompanies <p>母公司种子数组</p>
     */
    public void setParentCompanies(String [] ParentCompanies) {
        this.ParentCompanies = ParentCompanies;
    }

    /**
     * Get <p>关键词用途：leakage_code代码泄露/leakage_data其他泄露/wechat_applet微信小程序/wechat_official_account微信公众号，不填=全部用途</p> 
     * @return KeywordPurposes <p>关键词用途：leakage_code代码泄露/leakage_data其他泄露/wechat_applet微信小程序/wechat_official_account微信公众号，不填=全部用途</p>
     */
    public String [] getKeywordPurposes() {
        return this.KeywordPurposes;
    }

    /**
     * Set <p>关键词用途：leakage_code代码泄露/leakage_data其他泄露/wechat_applet微信小程序/wechat_official_account微信公众号，不填=全部用途</p>
     * @param KeywordPurposes <p>关键词用途：leakage_code代码泄露/leakage_data其他泄露/wechat_applet微信小程序/wechat_official_account微信公众号，不填=全部用途</p>
     */
    public void setKeywordPurposes(String [] KeywordPurposes) {
        this.KeywordPurposes = KeywordPurposes;
    }

    public CreateSeedsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSeedsRequest(CreateSeedsRequest source) {
        if (source.CustomerId != null) {
            this.CustomerId = new Long(source.CustomerId);
        }
        if (source.Ips != null) {
            this.Ips = new String[source.Ips.length];
            for (int i = 0; i < source.Ips.length; i++) {
                this.Ips[i] = new String(source.Ips[i]);
            }
        }
        if (source.Icons != null) {
            this.Icons = new String[source.Icons.length];
            for (int i = 0; i < source.Icons.length; i++) {
                this.Icons[i] = new String(source.Icons[i]);
            }
        }
        if (source.Domains != null) {
            this.Domains = new String[source.Domains.length];
            for (int i = 0; i < source.Domains.length; i++) {
                this.Domains[i] = new String(source.Domains[i]);
            }
        }
        if (source.Titles != null) {
            this.Titles = new String[source.Titles.length];
            for (int i = 0; i < source.Titles.length; i++) {
                this.Titles[i] = new String(source.Titles[i]);
            }
        }
        if (source.SubDomains != null) {
            this.SubDomains = new String[source.SubDomains.length];
            for (int i = 0; i < source.SubDomains.length; i++) {
                this.SubDomains[i] = new String(source.SubDomains[i]);
            }
        }
        if (source.Keywords != null) {
            this.Keywords = new String[source.Keywords.length];
            for (int i = 0; i < source.Keywords.length; i++) {
                this.Keywords[i] = new String(source.Keywords[i]);
            }
        }
        if (source.ParentCompanies != null) {
            this.ParentCompanies = new String[source.ParentCompanies.length];
            for (int i = 0; i < source.ParentCompanies.length; i++) {
                this.ParentCompanies[i] = new String(source.ParentCompanies[i]);
            }
        }
        if (source.KeywordPurposes != null) {
            this.KeywordPurposes = new String[source.KeywordPurposes.length];
            for (int i = 0; i < source.KeywordPurposes.length; i++) {
                this.KeywordPurposes[i] = new String(source.KeywordPurposes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CustomerId", this.CustomerId);
        this.setParamArraySimple(map, prefix + "Ips.", this.Ips);
        this.setParamArraySimple(map, prefix + "Icons.", this.Icons);
        this.setParamArraySimple(map, prefix + "Domains.", this.Domains);
        this.setParamArraySimple(map, prefix + "Titles.", this.Titles);
        this.setParamArraySimple(map, prefix + "SubDomains.", this.SubDomains);
        this.setParamArraySimple(map, prefix + "Keywords.", this.Keywords);
        this.setParamArraySimple(map, prefix + "ParentCompanies.", this.ParentCompanies);
        this.setParamArraySimple(map, prefix + "KeywordPurposes.", this.KeywordPurposes);

    }
}

