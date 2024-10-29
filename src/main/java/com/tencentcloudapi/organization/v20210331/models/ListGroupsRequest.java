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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListGroupsRequest extends AbstractModel {

    /**
    * 空间 ID。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 查询返回结果下一页的令牌。首次调用 API 不需要NextToken。  当您首次调用 API 时，如果返回数据总条数超过MaxResults限制，数据会被截断，只返回MaxResults条数据，同时，返回参数IsTruncated为true，返回一个NextToken。您可以使用上一次返回的NextToken继续调用 API，其他请求参数保持不变，查询被截断的数据。您可以按此方法多次查询，直到IsTruncated为false，表示全部数据查询完毕。
    */
    @SerializedName("NextToken")
    @Expose
    private String NextToken;

    /**
    * 每页的最大数据条数。  取值范围：1~100。  默认值：10。
    */
    @SerializedName("MaxResults")
    @Expose
    private Long MaxResults;

    /**
    * 过滤条件。  格式：<Attribute> <Operator> <Value>，不区分大小写。目前，<Attribute>只支持GroupName，<Operator>只支持eq（Equals）和sw（Start With）。  示例：Filter = "GroupName sw test"，表示查询名称以 test 开头的全部用户组。Filter = "GroupName eq testgroup"，表示查询名称为 testgroup 的用户组。
    */
    @SerializedName("Filter")
    @Expose
    private String Filter;

    /**
    * 用户组的类型  Manual：手动创建，Synchronized：外部导入。
    */
    @SerializedName("GroupType")
    @Expose
    private String GroupType;

    /**
    * 筛选的用户，该用户关联的用户组会返回IsSelected=1
    */
    @SerializedName("FilterUsers")
    @Expose
    private String [] FilterUsers;

    /**
    * 排序的字段，目前只支持CreateTime，默认是CreateTime字段
    */
    @SerializedName("SortField")
    @Expose
    private String SortField;

    /**
    * 排序类型：Desc 倒序 Asc  正序，需要你和SortField一起设置
    */
    @SerializedName("SortType")
    @Expose
    private String SortType;

    /**
    * 翻页offset. 不要与NextToken同时使用，优先使用NextToken
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get 空间 ID。 
     * @return ZoneId 空间 ID。
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 空间 ID。
     * @param ZoneId 空间 ID。
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 查询返回结果下一页的令牌。首次调用 API 不需要NextToken。  当您首次调用 API 时，如果返回数据总条数超过MaxResults限制，数据会被截断，只返回MaxResults条数据，同时，返回参数IsTruncated为true，返回一个NextToken。您可以使用上一次返回的NextToken继续调用 API，其他请求参数保持不变，查询被截断的数据。您可以按此方法多次查询，直到IsTruncated为false，表示全部数据查询完毕。 
     * @return NextToken 查询返回结果下一页的令牌。首次调用 API 不需要NextToken。  当您首次调用 API 时，如果返回数据总条数超过MaxResults限制，数据会被截断，只返回MaxResults条数据，同时，返回参数IsTruncated为true，返回一个NextToken。您可以使用上一次返回的NextToken继续调用 API，其他请求参数保持不变，查询被截断的数据。您可以按此方法多次查询，直到IsTruncated为false，表示全部数据查询完毕。
     */
    public String getNextToken() {
        return this.NextToken;
    }

    /**
     * Set 查询返回结果下一页的令牌。首次调用 API 不需要NextToken。  当您首次调用 API 时，如果返回数据总条数超过MaxResults限制，数据会被截断，只返回MaxResults条数据，同时，返回参数IsTruncated为true，返回一个NextToken。您可以使用上一次返回的NextToken继续调用 API，其他请求参数保持不变，查询被截断的数据。您可以按此方法多次查询，直到IsTruncated为false，表示全部数据查询完毕。
     * @param NextToken 查询返回结果下一页的令牌。首次调用 API 不需要NextToken。  当您首次调用 API 时，如果返回数据总条数超过MaxResults限制，数据会被截断，只返回MaxResults条数据，同时，返回参数IsTruncated为true，返回一个NextToken。您可以使用上一次返回的NextToken继续调用 API，其他请求参数保持不变，查询被截断的数据。您可以按此方法多次查询，直到IsTruncated为false，表示全部数据查询完毕。
     */
    public void setNextToken(String NextToken) {
        this.NextToken = NextToken;
    }

    /**
     * Get 每页的最大数据条数。  取值范围：1~100。  默认值：10。 
     * @return MaxResults 每页的最大数据条数。  取值范围：1~100。  默认值：10。
     */
    public Long getMaxResults() {
        return this.MaxResults;
    }

    /**
     * Set 每页的最大数据条数。  取值范围：1~100。  默认值：10。
     * @param MaxResults 每页的最大数据条数。  取值范围：1~100。  默认值：10。
     */
    public void setMaxResults(Long MaxResults) {
        this.MaxResults = MaxResults;
    }

    /**
     * Get 过滤条件。  格式：<Attribute> <Operator> <Value>，不区分大小写。目前，<Attribute>只支持GroupName，<Operator>只支持eq（Equals）和sw（Start With）。  示例：Filter = "GroupName sw test"，表示查询名称以 test 开头的全部用户组。Filter = "GroupName eq testgroup"，表示查询名称为 testgroup 的用户组。 
     * @return Filter 过滤条件。  格式：<Attribute> <Operator> <Value>，不区分大小写。目前，<Attribute>只支持GroupName，<Operator>只支持eq（Equals）和sw（Start With）。  示例：Filter = "GroupName sw test"，表示查询名称以 test 开头的全部用户组。Filter = "GroupName eq testgroup"，表示查询名称为 testgroup 的用户组。
     */
    public String getFilter() {
        return this.Filter;
    }

    /**
     * Set 过滤条件。  格式：<Attribute> <Operator> <Value>，不区分大小写。目前，<Attribute>只支持GroupName，<Operator>只支持eq（Equals）和sw（Start With）。  示例：Filter = "GroupName sw test"，表示查询名称以 test 开头的全部用户组。Filter = "GroupName eq testgroup"，表示查询名称为 testgroup 的用户组。
     * @param Filter 过滤条件。  格式：<Attribute> <Operator> <Value>，不区分大小写。目前，<Attribute>只支持GroupName，<Operator>只支持eq（Equals）和sw（Start With）。  示例：Filter = "GroupName sw test"，表示查询名称以 test 开头的全部用户组。Filter = "GroupName eq testgroup"，表示查询名称为 testgroup 的用户组。
     */
    public void setFilter(String Filter) {
        this.Filter = Filter;
    }

    /**
     * Get 用户组的类型  Manual：手动创建，Synchronized：外部导入。 
     * @return GroupType 用户组的类型  Manual：手动创建，Synchronized：外部导入。
     */
    public String getGroupType() {
        return this.GroupType;
    }

    /**
     * Set 用户组的类型  Manual：手动创建，Synchronized：外部导入。
     * @param GroupType 用户组的类型  Manual：手动创建，Synchronized：外部导入。
     */
    public void setGroupType(String GroupType) {
        this.GroupType = GroupType;
    }

    /**
     * Get 筛选的用户，该用户关联的用户组会返回IsSelected=1 
     * @return FilterUsers 筛选的用户，该用户关联的用户组会返回IsSelected=1
     */
    public String [] getFilterUsers() {
        return this.FilterUsers;
    }

    /**
     * Set 筛选的用户，该用户关联的用户组会返回IsSelected=1
     * @param FilterUsers 筛选的用户，该用户关联的用户组会返回IsSelected=1
     */
    public void setFilterUsers(String [] FilterUsers) {
        this.FilterUsers = FilterUsers;
    }

    /**
     * Get 排序的字段，目前只支持CreateTime，默认是CreateTime字段 
     * @return SortField 排序的字段，目前只支持CreateTime，默认是CreateTime字段
     */
    public String getSortField() {
        return this.SortField;
    }

    /**
     * Set 排序的字段，目前只支持CreateTime，默认是CreateTime字段
     * @param SortField 排序的字段，目前只支持CreateTime，默认是CreateTime字段
     */
    public void setSortField(String SortField) {
        this.SortField = SortField;
    }

    /**
     * Get 排序类型：Desc 倒序 Asc  正序，需要你和SortField一起设置 
     * @return SortType 排序类型：Desc 倒序 Asc  正序，需要你和SortField一起设置
     */
    public String getSortType() {
        return this.SortType;
    }

    /**
     * Set 排序类型：Desc 倒序 Asc  正序，需要你和SortField一起设置
     * @param SortType 排序类型：Desc 倒序 Asc  正序，需要你和SortField一起设置
     */
    public void setSortType(String SortType) {
        this.SortType = SortType;
    }

    /**
     * Get 翻页offset. 不要与NextToken同时使用，优先使用NextToken 
     * @return Offset 翻页offset. 不要与NextToken同时使用，优先使用NextToken
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 翻页offset. 不要与NextToken同时使用，优先使用NextToken
     * @param Offset 翻页offset. 不要与NextToken同时使用，优先使用NextToken
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public ListGroupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListGroupsRequest(ListGroupsRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.NextToken != null) {
            this.NextToken = new String(source.NextToken);
        }
        if (source.MaxResults != null) {
            this.MaxResults = new Long(source.MaxResults);
        }
        if (source.Filter != null) {
            this.Filter = new String(source.Filter);
        }
        if (source.GroupType != null) {
            this.GroupType = new String(source.GroupType);
        }
        if (source.FilterUsers != null) {
            this.FilterUsers = new String[source.FilterUsers.length];
            for (int i = 0; i < source.FilterUsers.length; i++) {
                this.FilterUsers[i] = new String(source.FilterUsers[i]);
            }
        }
        if (source.SortField != null) {
            this.SortField = new String(source.SortField);
        }
        if (source.SortType != null) {
            this.SortType = new String(source.SortType);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "NextToken", this.NextToken);
        this.setParamSimple(map, prefix + "MaxResults", this.MaxResults);
        this.setParamSimple(map, prefix + "Filter", this.Filter);
        this.setParamSimple(map, prefix + "GroupType", this.GroupType);
        this.setParamArraySimple(map, prefix + "FilterUsers.", this.FilterUsers);
        this.setParamSimple(map, prefix + "SortField", this.SortField);
        this.setParamSimple(map, prefix + "SortType", this.SortType);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

