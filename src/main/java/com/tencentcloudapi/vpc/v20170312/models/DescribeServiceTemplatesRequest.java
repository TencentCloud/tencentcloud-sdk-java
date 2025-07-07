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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeServiceTemplatesRequest extends AbstractModel {

    /**
    * 过滤条件。
<li>service-template-name - 协议端口模板名称。</li>
<li>service-template-id - 协议端口模板实例ID，例如：ppm-e6dy460g。</li>
<li>service-port- 协议端口。</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 偏移量，默认为0。
    */
    @SerializedName("Offset")
    @Expose
    private String Offset;

    /**
    * 返回数量，默认为20，最大值为100。
    */
    @SerializedName("Limit")
    @Expose
    private String Limit;

    /**
    * 是否获取协议端口成员标识。
    */
    @SerializedName("NeedMemberInfo")
    @Expose
    private Boolean NeedMemberInfo;

    /**
    * 排序字段。支持：`ServiceTemplateId ` `CreatedTime` `UpdateTime`。注意：该字段没有默认值。
    */
    @SerializedName("OrderField")
    @Expose
    private String OrderField;

    /**
    * 排序方法。升序：`ASC`，倒序：`DESC`。注意：该字段没有默认值。
    */
    @SerializedName("OrderDirection")
    @Expose
    private String OrderDirection;

    /**
    * 协议端口排序字段。支持：`Service ` `UpdateTime`。注意：该字段没有默认值。
    */
    @SerializedName("MemberOrderField")
    @Expose
    private String MemberOrderField;

    /**
    * 协议端口排序方法。升序：`ASC`，倒序：`DESC`。注意：该字段没有默认值。
    */
    @SerializedName("MemberOrderDirection")
    @Expose
    private String MemberOrderDirection;

    /**
     * Get 过滤条件。
<li>service-template-name - 协议端口模板名称。</li>
<li>service-template-id - 协议端口模板实例ID，例如：ppm-e6dy460g。</li>
<li>service-port- 协议端口。</li> 
     * @return Filters 过滤条件。
<li>service-template-name - 协议端口模板名称。</li>
<li>service-template-id - 协议端口模板实例ID，例如：ppm-e6dy460g。</li>
<li>service-port- 协议端口。</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件。
<li>service-template-name - 协议端口模板名称。</li>
<li>service-template-id - 协议端口模板实例ID，例如：ppm-e6dy460g。</li>
<li>service-port- 协议端口。</li>
     * @param Filters 过滤条件。
<li>service-template-name - 协议端口模板名称。</li>
<li>service-template-id - 协议端口模板实例ID，例如：ppm-e6dy460g。</li>
<li>service-port- 协议端口。</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 偏移量，默认为0。 
     * @return Offset 偏移量，默认为0。
     */
    public String getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0。
     * @param Offset 偏移量，默认为0。
     */
    public void setOffset(String Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回数量，默认为20，最大值为100。 
     * @return Limit 返回数量，默认为20，最大值为100。
     */
    public String getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认为20，最大值为100。
     * @param Limit 返回数量，默认为20，最大值为100。
     */
    public void setLimit(String Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 是否获取协议端口成员标识。 
     * @return NeedMemberInfo 是否获取协议端口成员标识。
     */
    public Boolean getNeedMemberInfo() {
        return this.NeedMemberInfo;
    }

    /**
     * Set 是否获取协议端口成员标识。
     * @param NeedMemberInfo 是否获取协议端口成员标识。
     */
    public void setNeedMemberInfo(Boolean NeedMemberInfo) {
        this.NeedMemberInfo = NeedMemberInfo;
    }

    /**
     * Get 排序字段。支持：`ServiceTemplateId ` `CreatedTime` `UpdateTime`。注意：该字段没有默认值。 
     * @return OrderField 排序字段。支持：`ServiceTemplateId ` `CreatedTime` `UpdateTime`。注意：该字段没有默认值。
     */
    public String getOrderField() {
        return this.OrderField;
    }

    /**
     * Set 排序字段。支持：`ServiceTemplateId ` `CreatedTime` `UpdateTime`。注意：该字段没有默认值。
     * @param OrderField 排序字段。支持：`ServiceTemplateId ` `CreatedTime` `UpdateTime`。注意：该字段没有默认值。
     */
    public void setOrderField(String OrderField) {
        this.OrderField = OrderField;
    }

    /**
     * Get 排序方法。升序：`ASC`，倒序：`DESC`。注意：该字段没有默认值。 
     * @return OrderDirection 排序方法。升序：`ASC`，倒序：`DESC`。注意：该字段没有默认值。
     */
    public String getOrderDirection() {
        return this.OrderDirection;
    }

    /**
     * Set 排序方法。升序：`ASC`，倒序：`DESC`。注意：该字段没有默认值。
     * @param OrderDirection 排序方法。升序：`ASC`，倒序：`DESC`。注意：该字段没有默认值。
     */
    public void setOrderDirection(String OrderDirection) {
        this.OrderDirection = OrderDirection;
    }

    /**
     * Get 协议端口排序字段。支持：`Service ` `UpdateTime`。注意：该字段没有默认值。 
     * @return MemberOrderField 协议端口排序字段。支持：`Service ` `UpdateTime`。注意：该字段没有默认值。
     */
    public String getMemberOrderField() {
        return this.MemberOrderField;
    }

    /**
     * Set 协议端口排序字段。支持：`Service ` `UpdateTime`。注意：该字段没有默认值。
     * @param MemberOrderField 协议端口排序字段。支持：`Service ` `UpdateTime`。注意：该字段没有默认值。
     */
    public void setMemberOrderField(String MemberOrderField) {
        this.MemberOrderField = MemberOrderField;
    }

    /**
     * Get 协议端口排序方法。升序：`ASC`，倒序：`DESC`。注意：该字段没有默认值。 
     * @return MemberOrderDirection 协议端口排序方法。升序：`ASC`，倒序：`DESC`。注意：该字段没有默认值。
     */
    public String getMemberOrderDirection() {
        return this.MemberOrderDirection;
    }

    /**
     * Set 协议端口排序方法。升序：`ASC`，倒序：`DESC`。注意：该字段没有默认值。
     * @param MemberOrderDirection 协议端口排序方法。升序：`ASC`，倒序：`DESC`。注意：该字段没有默认值。
     */
    public void setMemberOrderDirection(String MemberOrderDirection) {
        this.MemberOrderDirection = MemberOrderDirection;
    }

    public DescribeServiceTemplatesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeServiceTemplatesRequest(DescribeServiceTemplatesRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new String(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new String(source.Limit);
        }
        if (source.NeedMemberInfo != null) {
            this.NeedMemberInfo = new Boolean(source.NeedMemberInfo);
        }
        if (source.OrderField != null) {
            this.OrderField = new String(source.OrderField);
        }
        if (source.OrderDirection != null) {
            this.OrderDirection = new String(source.OrderDirection);
        }
        if (source.MemberOrderField != null) {
            this.MemberOrderField = new String(source.MemberOrderField);
        }
        if (source.MemberOrderDirection != null) {
            this.MemberOrderDirection = new String(source.MemberOrderDirection);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "NeedMemberInfo", this.NeedMemberInfo);
        this.setParamSimple(map, prefix + "OrderField", this.OrderField);
        this.setParamSimple(map, prefix + "OrderDirection", this.OrderDirection);
        this.setParamSimple(map, prefix + "MemberOrderField", this.MemberOrderField);
        this.setParamSimple(map, prefix + "MemberOrderDirection", this.MemberOrderDirection);

    }
}

