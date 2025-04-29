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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeFirewallTemplatesRequest extends AbstractModel {

    /**
    * 防火墙模板ID列表。可通过[DescribeFirewallTemplates](https://cloud.tencent.com/document/product/1207/96874)接口返回值字段TemplateSet获取。列表长度最大值为100。
    */
    @SerializedName("TemplateIds")
    @Expose
    private String [] TemplateIds;

    /**
    * 过滤器列表。
<li>template-id</li>按照【防火墙模板所属的ID】进行过滤。
类型：String
必选：否
<li>template-name</li>按照【防火墙模板所属的名称】进行过滤。
类型：String
必选：否
<li>template-type</li>按照【防火墙模板的类型】进行过滤。
类型：String
必选：否
取值: "PRIVATE"(个人模版)
每次请求的 Filters 的上限为 10，Filter.Values 的上限为 100。参数不支持同时指定 TemplateIds 和 Filters。
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 偏移量，默认为 0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回数量，默认为 20，最大值为 100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 防火墙模板ID列表。可通过[DescribeFirewallTemplates](https://cloud.tencent.com/document/product/1207/96874)接口返回值字段TemplateSet获取。列表长度最大值为100。 
     * @return TemplateIds 防火墙模板ID列表。可通过[DescribeFirewallTemplates](https://cloud.tencent.com/document/product/1207/96874)接口返回值字段TemplateSet获取。列表长度最大值为100。
     */
    public String [] getTemplateIds() {
        return this.TemplateIds;
    }

    /**
     * Set 防火墙模板ID列表。可通过[DescribeFirewallTemplates](https://cloud.tencent.com/document/product/1207/96874)接口返回值字段TemplateSet获取。列表长度最大值为100。
     * @param TemplateIds 防火墙模板ID列表。可通过[DescribeFirewallTemplates](https://cloud.tencent.com/document/product/1207/96874)接口返回值字段TemplateSet获取。列表长度最大值为100。
     */
    public void setTemplateIds(String [] TemplateIds) {
        this.TemplateIds = TemplateIds;
    }

    /**
     * Get 过滤器列表。
<li>template-id</li>按照【防火墙模板所属的ID】进行过滤。
类型：String
必选：否
<li>template-name</li>按照【防火墙模板所属的名称】进行过滤。
类型：String
必选：否
<li>template-type</li>按照【防火墙模板的类型】进行过滤。
类型：String
必选：否
取值: "PRIVATE"(个人模版)
每次请求的 Filters 的上限为 10，Filter.Values 的上限为 100。参数不支持同时指定 TemplateIds 和 Filters。 
     * @return Filters 过滤器列表。
<li>template-id</li>按照【防火墙模板所属的ID】进行过滤。
类型：String
必选：否
<li>template-name</li>按照【防火墙模板所属的名称】进行过滤。
类型：String
必选：否
<li>template-type</li>按照【防火墙模板的类型】进行过滤。
类型：String
必选：否
取值: "PRIVATE"(个人模版)
每次请求的 Filters 的上限为 10，Filter.Values 的上限为 100。参数不支持同时指定 TemplateIds 和 Filters。
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤器列表。
<li>template-id</li>按照【防火墙模板所属的ID】进行过滤。
类型：String
必选：否
<li>template-name</li>按照【防火墙模板所属的名称】进行过滤。
类型：String
必选：否
<li>template-type</li>按照【防火墙模板的类型】进行过滤。
类型：String
必选：否
取值: "PRIVATE"(个人模版)
每次请求的 Filters 的上限为 10，Filter.Values 的上限为 100。参数不支持同时指定 TemplateIds 和 Filters。
     * @param Filters 过滤器列表。
<li>template-id</li>按照【防火墙模板所属的ID】进行过滤。
类型：String
必选：否
<li>template-name</li>按照【防火墙模板所属的名称】进行过滤。
类型：String
必选：否
<li>template-type</li>按照【防火墙模板的类型】进行过滤。
类型：String
必选：否
取值: "PRIVATE"(个人模版)
每次请求的 Filters 的上限为 10，Filter.Values 的上限为 100。参数不支持同时指定 TemplateIds 和 Filters。
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 偏移量，默认为 0。 
     * @return Offset 偏移量，默认为 0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为 0。
     * @param Offset 偏移量，默认为 0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回数量，默认为 20，最大值为 100。 
     * @return Limit 返回数量，默认为 20，最大值为 100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认为 20，最大值为 100。
     * @param Limit 返回数量，默认为 20，最大值为 100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeFirewallTemplatesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFirewallTemplatesRequest(DescribeFirewallTemplatesRequest source) {
        if (source.TemplateIds != null) {
            this.TemplateIds = new String[source.TemplateIds.length];
            for (int i = 0; i < source.TemplateIds.length; i++) {
                this.TemplateIds[i] = new String(source.TemplateIds[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "TemplateIds.", this.TemplateIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

