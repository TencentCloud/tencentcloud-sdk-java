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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeClientRuleListRequest extends AbstractModel{

    /**
    * 查询的站点ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 查询的子域名。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 规则类型，取值有：
<li>acl：自定义规则；</li>
<li>rate：限速规则。</li>不填表示查询所有规则。
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * 规则ID。
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * 客户端IP。
    */
    @SerializedName("SourceClientIp")
    @Expose
    private String SourceClientIp;

    /**
    * 分页查询的限制数目，默认值为20，最大查询条目为1000。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页的偏移量，默认值为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 数据归属地区，取值有：
<li>overseas：全球（除中国大陆地区）数据；</li>
<li>mainland：中国大陆地区数据。</li>不填将根据用户所在地智能选择地区。
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
     * Get 查询的站点ID. 
     * @return ZoneId 查询的站点ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 查询的站点ID.
     * @param ZoneId 查询的站点ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 查询的子域名。 
     * @return Domain 查询的子域名。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 查询的子域名。
     * @param Domain 查询的子域名。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 规则类型，取值有：
<li>acl：自定义规则；</li>
<li>rate：限速规则。</li>不填表示查询所有规则。 
     * @return RuleType 规则类型，取值有：
<li>acl：自定义规则；</li>
<li>rate：限速规则。</li>不填表示查询所有规则。
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set 规则类型，取值有：
<li>acl：自定义规则；</li>
<li>rate：限速规则。</li>不填表示查询所有规则。
     * @param RuleType 规则类型，取值有：
<li>acl：自定义规则；</li>
<li>rate：限速规则。</li>不填表示查询所有规则。
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get 规则ID。 
     * @return RuleId 规则ID。
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则ID。
     * @param RuleId 规则ID。
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 客户端IP。 
     * @return SourceClientIp 客户端IP。
     */
    public String getSourceClientIp() {
        return this.SourceClientIp;
    }

    /**
     * Set 客户端IP。
     * @param SourceClientIp 客户端IP。
     */
    public void setSourceClientIp(String SourceClientIp) {
        this.SourceClientIp = SourceClientIp;
    }

    /**
     * Get 分页查询的限制数目，默认值为20，最大查询条目为1000。 
     * @return Limit 分页查询的限制数目，默认值为20，最大查询条目为1000。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页查询的限制数目，默认值为20，最大查询条目为1000。
     * @param Limit 分页查询的限制数目，默认值为20，最大查询条目为1000。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页的偏移量，默认值为0。 
     * @return Offset 分页的偏移量，默认值为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页的偏移量，默认值为0。
     * @param Offset 分页的偏移量，默认值为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 数据归属地区，取值有：
<li>overseas：全球（除中国大陆地区）数据；</li>
<li>mainland：中国大陆地区数据。</li>不填将根据用户所在地智能选择地区。 
     * @return Area 数据归属地区，取值有：
<li>overseas：全球（除中国大陆地区）数据；</li>
<li>mainland：中国大陆地区数据。</li>不填将根据用户所在地智能选择地区。
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set 数据归属地区，取值有：
<li>overseas：全球（除中国大陆地区）数据；</li>
<li>mainland：中国大陆地区数据。</li>不填将根据用户所在地智能选择地区。
     * @param Area 数据归属地区，取值有：
<li>overseas：全球（除中国大陆地区）数据；</li>
<li>mainland：中国大陆地区数据。</li>不填将根据用户所在地智能选择地区。
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    public DescribeClientRuleListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClientRuleListRequest(DescribeClientRuleListRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.RuleType != null) {
            this.RuleType = new String(source.RuleType);
        }
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.SourceClientIp != null) {
            this.SourceClientIp = new String(source.SourceClientIp);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "SourceClientIp", this.SourceClientIp);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Area", this.Area);

    }
}

