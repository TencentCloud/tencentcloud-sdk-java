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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RaspRuleVul extends AbstractModel {

    /**
    * 漏洞id
    */
    @SerializedName("VulVulsID")
    @Expose
    private Long VulVulsID;

    /**
    * 漏洞名称
    */
    @SerializedName("VulVulsName")
    @Expose
    private String VulVulsName;

    /**
    * cve_id
    */
    @SerializedName("CveID")
    @Expose
    private String CveID;

    /**
    * 漏洞防御类型，从漏洞表富化， 1:支持组件漏洞防御，组件漏洞没有正则加白。2:支持正则防御
    */
    @SerializedName("SupportDefense")
    @Expose
    private Long SupportDefense;

    /**
     * Get 漏洞id 
     * @return VulVulsID 漏洞id
     */
    public Long getVulVulsID() {
        return this.VulVulsID;
    }

    /**
     * Set 漏洞id
     * @param VulVulsID 漏洞id
     */
    public void setVulVulsID(Long VulVulsID) {
        this.VulVulsID = VulVulsID;
    }

    /**
     * Get 漏洞名称 
     * @return VulVulsName 漏洞名称
     */
    public String getVulVulsName() {
        return this.VulVulsName;
    }

    /**
     * Set 漏洞名称
     * @param VulVulsName 漏洞名称
     */
    public void setVulVulsName(String VulVulsName) {
        this.VulVulsName = VulVulsName;
    }

    /**
     * Get cve_id 
     * @return CveID cve_id
     */
    public String getCveID() {
        return this.CveID;
    }

    /**
     * Set cve_id
     * @param CveID cve_id
     */
    public void setCveID(String CveID) {
        this.CveID = CveID;
    }

    /**
     * Get 漏洞防御类型，从漏洞表富化， 1:支持组件漏洞防御，组件漏洞没有正则加白。2:支持正则防御 
     * @return SupportDefense 漏洞防御类型，从漏洞表富化， 1:支持组件漏洞防御，组件漏洞没有正则加白。2:支持正则防御
     */
    public Long getSupportDefense() {
        return this.SupportDefense;
    }

    /**
     * Set 漏洞防御类型，从漏洞表富化， 1:支持组件漏洞防御，组件漏洞没有正则加白。2:支持正则防御
     * @param SupportDefense 漏洞防御类型，从漏洞表富化， 1:支持组件漏洞防御，组件漏洞没有正则加白。2:支持正则防御
     */
    public void setSupportDefense(Long SupportDefense) {
        this.SupportDefense = SupportDefense;
    }

    public RaspRuleVul() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RaspRuleVul(RaspRuleVul source) {
        if (source.VulVulsID != null) {
            this.VulVulsID = new Long(source.VulVulsID);
        }
        if (source.VulVulsName != null) {
            this.VulVulsName = new String(source.VulVulsName);
        }
        if (source.CveID != null) {
            this.CveID = new String(source.CveID);
        }
        if (source.SupportDefense != null) {
            this.SupportDefense = new Long(source.SupportDefense);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VulVulsID", this.VulVulsID);
        this.setParamSimple(map, prefix + "VulVulsName", this.VulVulsName);
        this.setParamSimple(map, prefix + "CveID", this.CveID);
        this.setParamSimple(map, prefix + "SupportDefense", this.SupportDefense);

    }
}

