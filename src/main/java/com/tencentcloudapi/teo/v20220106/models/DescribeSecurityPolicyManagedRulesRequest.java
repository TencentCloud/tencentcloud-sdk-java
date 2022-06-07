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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSecurityPolicyManagedRulesRequest extends AbstractModel{

    /**
    * 一级域名
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 子域名/应用名
    */
    @SerializedName("Entity")
    @Expose
    private String Entity;

    /**
    * 页数
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * 每页数量
    */
    @SerializedName("PerPage")
    @Expose
    private Long PerPage;

    /**
     * Get 一级域名 
     * @return ZoneId 一级域名
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 一级域名
     * @param ZoneId 一级域名
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 子域名/应用名 
     * @return Entity 子域名/应用名
     */
    public String getEntity() {
        return this.Entity;
    }

    /**
     * Set 子域名/应用名
     * @param Entity 子域名/应用名
     */
    public void setEntity(String Entity) {
        this.Entity = Entity;
    }

    /**
     * Get 页数 
     * @return Page 页数
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set 页数
     * @param Page 页数
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get 每页数量 
     * @return PerPage 每页数量
     */
    public Long getPerPage() {
        return this.PerPage;
    }

    /**
     * Set 每页数量
     * @param PerPage 每页数量
     */
    public void setPerPage(Long PerPage) {
        this.PerPage = PerPage;
    }

    public DescribeSecurityPolicyManagedRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSecurityPolicyManagedRulesRequest(DescribeSecurityPolicyManagedRulesRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Entity != null) {
            this.Entity = new String(source.Entity);
        }
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
        if (source.PerPage != null) {
            this.PerPage = new Long(source.PerPage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Entity", this.Entity);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "PerPage", this.PerPage);

    }
}

