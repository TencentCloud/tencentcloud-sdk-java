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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RaspRule extends AbstractModel {

    /**
    * 规则ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 自定义请求url范围正则表达式，为空则保存不成功
    */
    @SerializedName("URLRegexp")
    @Expose
    private String URLRegexp;

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
    * 加白范围，0:全部请求加白，1:自定义请求范围加白
    */
    @SerializedName("WhiteType")
    @Expose
    private Long WhiteType;

    /**
    * 状态 0: 有效
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 修改时间
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
     * Get 规则ID 
     * @return Id 规则ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 规则ID
     * @param Id 规则ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 自定义请求url范围正则表达式，为空则保存不成功 
     * @return URLRegexp 自定义请求url范围正则表达式，为空则保存不成功
     */
    public String getURLRegexp() {
        return this.URLRegexp;
    }

    /**
     * Set 自定义请求url范围正则表达式，为空则保存不成功
     * @param URLRegexp 自定义请求url范围正则表达式，为空则保存不成功
     */
    public void setURLRegexp(String URLRegexp) {
        this.URLRegexp = URLRegexp;
    }

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

    /**
     * Get 加白范围，0:全部请求加白，1:自定义请求范围加白 
     * @return WhiteType 加白范围，0:全部请求加白，1:自定义请求范围加白
     */
    public Long getWhiteType() {
        return this.WhiteType;
    }

    /**
     * Set 加白范围，0:全部请求加白，1:自定义请求范围加白
     * @param WhiteType 加白范围，0:全部请求加白，1:自定义请求范围加白
     */
    public void setWhiteType(Long WhiteType) {
        this.WhiteType = WhiteType;
    }

    /**
     * Get 状态 0: 有效 
     * @return Status 状态 0: 有效
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态 0: 有效
     * @param Status 状态 0: 有效
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 修改时间 
     * @return ModifyTime 修改时间
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 修改时间
     * @param ModifyTime 修改时间
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    public RaspRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RaspRule(RaspRule source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.URLRegexp != null) {
            this.URLRegexp = new String(source.URLRegexp);
        }
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
        if (source.WhiteType != null) {
            this.WhiteType = new Long(source.WhiteType);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "URLRegexp", this.URLRegexp);
        this.setParamSimple(map, prefix + "VulVulsID", this.VulVulsID);
        this.setParamSimple(map, prefix + "VulVulsName", this.VulVulsName);
        this.setParamSimple(map, prefix + "CveID", this.CveID);
        this.setParamSimple(map, prefix + "SupportDefense", this.SupportDefense);
        this.setParamSimple(map, prefix + "WhiteType", this.WhiteType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);

    }
}

