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
    * 企业ID
    */
    @SerializedName("CustomerId")
    @Expose
    private Long CustomerId;

    /**
    * ip种子数组
    */
    @SerializedName("Ips")
    @Expose
    private String [] Ips;

    /**
    * icon种子数组
    */
    @SerializedName("Icons")
    @Expose
    private String [] Icons;

    /**
    * 主域名种子数组
    */
    @SerializedName("Domains")
    @Expose
    private String [] Domains;

    /**
    * title种子数组
    */
    @SerializedName("Titles")
    @Expose
    private String [] Titles;

    /**
    * 子域名种子数组
    */
    @SerializedName("SubDomains")
    @Expose
    private String [] SubDomains;

    /**
    * 关键词种子数组
    */
    @SerializedName("Keywords")
    @Expose
    private String [] Keywords;

    /**
    * 母公司种子数组
    */
    @SerializedName("ParentCompanies")
    @Expose
    private String [] ParentCompanies;

    /**
     * Get 企业ID 
     * @return CustomerId 企业ID
     */
    public Long getCustomerId() {
        return this.CustomerId;
    }

    /**
     * Set 企业ID
     * @param CustomerId 企业ID
     */
    public void setCustomerId(Long CustomerId) {
        this.CustomerId = CustomerId;
    }

    /**
     * Get ip种子数组 
     * @return Ips ip种子数组
     */
    public String [] getIps() {
        return this.Ips;
    }

    /**
     * Set ip种子数组
     * @param Ips ip种子数组
     */
    public void setIps(String [] Ips) {
        this.Ips = Ips;
    }

    /**
     * Get icon种子数组 
     * @return Icons icon种子数组
     */
    public String [] getIcons() {
        return this.Icons;
    }

    /**
     * Set icon种子数组
     * @param Icons icon种子数组
     */
    public void setIcons(String [] Icons) {
        this.Icons = Icons;
    }

    /**
     * Get 主域名种子数组 
     * @return Domains 主域名种子数组
     */
    public String [] getDomains() {
        return this.Domains;
    }

    /**
     * Set 主域名种子数组
     * @param Domains 主域名种子数组
     */
    public void setDomains(String [] Domains) {
        this.Domains = Domains;
    }

    /**
     * Get title种子数组 
     * @return Titles title种子数组
     */
    public String [] getTitles() {
        return this.Titles;
    }

    /**
     * Set title种子数组
     * @param Titles title种子数组
     */
    public void setTitles(String [] Titles) {
        this.Titles = Titles;
    }

    /**
     * Get 子域名种子数组 
     * @return SubDomains 子域名种子数组
     */
    public String [] getSubDomains() {
        return this.SubDomains;
    }

    /**
     * Set 子域名种子数组
     * @param SubDomains 子域名种子数组
     */
    public void setSubDomains(String [] SubDomains) {
        this.SubDomains = SubDomains;
    }

    /**
     * Get 关键词种子数组 
     * @return Keywords 关键词种子数组
     */
    public String [] getKeywords() {
        return this.Keywords;
    }

    /**
     * Set 关键词种子数组
     * @param Keywords 关键词种子数组
     */
    public void setKeywords(String [] Keywords) {
        this.Keywords = Keywords;
    }

    /**
     * Get 母公司种子数组 
     * @return ParentCompanies 母公司种子数组
     */
    public String [] getParentCompanies() {
        return this.ParentCompanies;
    }

    /**
     * Set 母公司种子数组
     * @param ParentCompanies 母公司种子数组
     */
    public void setParentCompanies(String [] ParentCompanies) {
        this.ParentCompanies = ParentCompanies;
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

    }
}

