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
package com.tencentcloudapi.ses.v20201002.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetAbuseReportRequest extends AbstractModel {

    /**
    * 起始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 限制数量（默认为1000）
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 发信域名
    */
    @SerializedName("FromDomain")
    @Expose
    private String FromDomain;

    /**
    * 发信地址
    */
    @SerializedName("FromAddress")
    @Expose
    private String FromAddress;

    /**
    * 收信域名
    */
    @SerializedName("Mta")
    @Expose
    private String Mta;

    /**
    * 收信地址
    */
    @SerializedName("ToAddress")
    @Expose
    private String ToAddress;

    /**
    * 模版id
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
     * Get 起始时间 
     * @return StartTime 起始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 起始时间
     * @param StartTime 起始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间 
     * @return EndTime 结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
     * @param EndTime 结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 偏移量 
     * @return Offset 偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量
     * @param Offset 偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 限制数量（默认为1000） 
     * @return Limit 限制数量（默认为1000）
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 限制数量（默认为1000）
     * @param Limit 限制数量（默认为1000）
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 发信域名 
     * @return FromDomain 发信域名
     */
    public String getFromDomain() {
        return this.FromDomain;
    }

    /**
     * Set 发信域名
     * @param FromDomain 发信域名
     */
    public void setFromDomain(String FromDomain) {
        this.FromDomain = FromDomain;
    }

    /**
     * Get 发信地址 
     * @return FromAddress 发信地址
     */
    public String getFromAddress() {
        return this.FromAddress;
    }

    /**
     * Set 发信地址
     * @param FromAddress 发信地址
     */
    public void setFromAddress(String FromAddress) {
        this.FromAddress = FromAddress;
    }

    /**
     * Get 收信域名 
     * @return Mta 收信域名
     */
    public String getMta() {
        return this.Mta;
    }

    /**
     * Set 收信域名
     * @param Mta 收信域名
     */
    public void setMta(String Mta) {
        this.Mta = Mta;
    }

    /**
     * Get 收信地址 
     * @return ToAddress 收信地址
     */
    public String getToAddress() {
        return this.ToAddress;
    }

    /**
     * Set 收信地址
     * @param ToAddress 收信地址
     */
    public void setToAddress(String ToAddress) {
        this.ToAddress = ToAddress;
    }

    /**
     * Get 模版id 
     * @return TemplateId 模版id
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 模版id
     * @param TemplateId 模版id
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    public GetAbuseReportRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetAbuseReportRequest(GetAbuseReportRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.FromDomain != null) {
            this.FromDomain = new String(source.FromDomain);
        }
        if (source.FromAddress != null) {
            this.FromAddress = new String(source.FromAddress);
        }
        if (source.Mta != null) {
            this.Mta = new String(source.Mta);
        }
        if (source.ToAddress != null) {
            this.ToAddress = new String(source.ToAddress);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "FromDomain", this.FromDomain);
        this.setParamSimple(map, prefix + "FromAddress", this.FromAddress);
        this.setParamSimple(map, prefix + "Mta", this.Mta);
        this.setParamSimple(map, prefix + "ToAddress", this.ToAddress);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);

    }
}

