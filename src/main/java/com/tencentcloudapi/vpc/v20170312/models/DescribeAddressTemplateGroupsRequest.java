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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAddressTemplateGroupsRequest extends AbstractModel {

    /**
    * 过滤条件。
<li>address-template-group-name - String - （过滤条件）IP地址模板集合名称。</li>
<li>address-template-group-id - String - （过滤条件）IP地址模板实集合例ID，例如：ipmg-mdunqeb6。</li>
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
    * 是否查询IP地址模板成员标识。
    */
    @SerializedName("NeedMemberInfo")
    @Expose
    private Boolean NeedMemberInfo;

    /**
     * Get 过滤条件。
<li>address-template-group-name - String - （过滤条件）IP地址模板集合名称。</li>
<li>address-template-group-id - String - （过滤条件）IP地址模板实集合例ID，例如：ipmg-mdunqeb6。</li> 
     * @return Filters 过滤条件。
<li>address-template-group-name - String - （过滤条件）IP地址模板集合名称。</li>
<li>address-template-group-id - String - （过滤条件）IP地址模板实集合例ID，例如：ipmg-mdunqeb6。</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件。
<li>address-template-group-name - String - （过滤条件）IP地址模板集合名称。</li>
<li>address-template-group-id - String - （过滤条件）IP地址模板实集合例ID，例如：ipmg-mdunqeb6。</li>
     * @param Filters 过滤条件。
<li>address-template-group-name - String - （过滤条件）IP地址模板集合名称。</li>
<li>address-template-group-id - String - （过滤条件）IP地址模板实集合例ID，例如：ipmg-mdunqeb6。</li>
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
     * Get 是否查询IP地址模板成员标识。 
     * @return NeedMemberInfo 是否查询IP地址模板成员标识。
     */
    public Boolean getNeedMemberInfo() {
        return this.NeedMemberInfo;
    }

    /**
     * Set 是否查询IP地址模板成员标识。
     * @param NeedMemberInfo 是否查询IP地址模板成员标识。
     */
    public void setNeedMemberInfo(Boolean NeedMemberInfo) {
        this.NeedMemberInfo = NeedMemberInfo;
    }

    public DescribeAddressTemplateGroupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAddressTemplateGroupsRequest(DescribeAddressTemplateGroupsRequest source) {
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "NeedMemberInfo", this.NeedMemberInfo);

    }
}

