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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListGroupsRequest extends AbstractModel {

    /**
    * <p>空间 ID。</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * <p>查询返回结果下一页的令牌。首次调用 API 不需要NextToken。  当您首次调用 API 时，如果返回数据总条数超过MaxResults限制，数据会被截断，只返回MaxResults条数据，同时，返回参数IsTruncated为true，返回一个NextToken。您可以使用上一次返回的NextToken继续调用 API，其他请求参数保持不变，查询被截断的数据。您可以按此方法多次查询，直到IsTruncated为false，表示全部数据查询完毕。</p>
    */
    @SerializedName("NextToken")
    @Expose
    private String NextToken;

    /**
    * <p>每页的最大数据条数。  取值范围：1~100。  默认值：10。</p>
    */
    @SerializedName("MaxResults")
    @Expose
    private Long MaxResults;

    /**
    * <p>过滤条件，用户组名称</p>
    */
    @SerializedName("Filter")
    @Expose
    private String Filter;

    /**
    * <p>用户组的类型  Manual：手动创建，Synchronized：外部导入。</p>
    */
    @SerializedName("GroupType")
    @Expose
    private String GroupType;

    /**
    * <p>筛选的用户，该用户关联的用户组会返回IsSelected=1</p>
    */
    @SerializedName("FilterUsers")
    @Expose
    private String [] FilterUsers;

    /**
    * <p>排序的字段，目前只支持CreateTime，默认是CreateTime字段</p>
    */
    @SerializedName("SortField")
    @Expose
    private String SortField;

    /**
    * <p>排序类型：Desc 倒序 Asc  正序，需要您和SortField一起设置</p>
    */
    @SerializedName("SortType")
    @Expose
    private String SortType;

    /**
    * <p>翻页offset. 不要与NextToken同时使用，优先使用NextToken</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get <p>空间 ID。</p> 
     * @return ZoneId <p>空间 ID。</p>
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>空间 ID。</p>
     * @param ZoneId <p>空间 ID。</p>
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>查询返回结果下一页的令牌。首次调用 API 不需要NextToken。  当您首次调用 API 时，如果返回数据总条数超过MaxResults限制，数据会被截断，只返回MaxResults条数据，同时，返回参数IsTruncated为true，返回一个NextToken。您可以使用上一次返回的NextToken继续调用 API，其他请求参数保持不变，查询被截断的数据。您可以按此方法多次查询，直到IsTruncated为false，表示全部数据查询完毕。</p> 
     * @return NextToken <p>查询返回结果下一页的令牌。首次调用 API 不需要NextToken。  当您首次调用 API 时，如果返回数据总条数超过MaxResults限制，数据会被截断，只返回MaxResults条数据，同时，返回参数IsTruncated为true，返回一个NextToken。您可以使用上一次返回的NextToken继续调用 API，其他请求参数保持不变，查询被截断的数据。您可以按此方法多次查询，直到IsTruncated为false，表示全部数据查询完毕。</p>
     */
    public String getNextToken() {
        return this.NextToken;
    }

    /**
     * Set <p>查询返回结果下一页的令牌。首次调用 API 不需要NextToken。  当您首次调用 API 时，如果返回数据总条数超过MaxResults限制，数据会被截断，只返回MaxResults条数据，同时，返回参数IsTruncated为true，返回一个NextToken。您可以使用上一次返回的NextToken继续调用 API，其他请求参数保持不变，查询被截断的数据。您可以按此方法多次查询，直到IsTruncated为false，表示全部数据查询完毕。</p>
     * @param NextToken <p>查询返回结果下一页的令牌。首次调用 API 不需要NextToken。  当您首次调用 API 时，如果返回数据总条数超过MaxResults限制，数据会被截断，只返回MaxResults条数据，同时，返回参数IsTruncated为true，返回一个NextToken。您可以使用上一次返回的NextToken继续调用 API，其他请求参数保持不变，查询被截断的数据。您可以按此方法多次查询，直到IsTruncated为false，表示全部数据查询完毕。</p>
     */
    public void setNextToken(String NextToken) {
        this.NextToken = NextToken;
    }

    /**
     * Get <p>每页的最大数据条数。  取值范围：1~100。  默认值：10。</p> 
     * @return MaxResults <p>每页的最大数据条数。  取值范围：1~100。  默认值：10。</p>
     */
    public Long getMaxResults() {
        return this.MaxResults;
    }

    /**
     * Set <p>每页的最大数据条数。  取值范围：1~100。  默认值：10。</p>
     * @param MaxResults <p>每页的最大数据条数。  取值范围：1~100。  默认值：10。</p>
     */
    public void setMaxResults(Long MaxResults) {
        this.MaxResults = MaxResults;
    }

    /**
     * Get <p>过滤条件，用户组名称</p> 
     * @return Filter <p>过滤条件，用户组名称</p>
     */
    public String getFilter() {
        return this.Filter;
    }

    /**
     * Set <p>过滤条件，用户组名称</p>
     * @param Filter <p>过滤条件，用户组名称</p>
     */
    public void setFilter(String Filter) {
        this.Filter = Filter;
    }

    /**
     * Get <p>用户组的类型  Manual：手动创建，Synchronized：外部导入。</p> 
     * @return GroupType <p>用户组的类型  Manual：手动创建，Synchronized：外部导入。</p>
     */
    public String getGroupType() {
        return this.GroupType;
    }

    /**
     * Set <p>用户组的类型  Manual：手动创建，Synchronized：外部导入。</p>
     * @param GroupType <p>用户组的类型  Manual：手动创建，Synchronized：外部导入。</p>
     */
    public void setGroupType(String GroupType) {
        this.GroupType = GroupType;
    }

    /**
     * Get <p>筛选的用户，该用户关联的用户组会返回IsSelected=1</p> 
     * @return FilterUsers <p>筛选的用户，该用户关联的用户组会返回IsSelected=1</p>
     */
    public String [] getFilterUsers() {
        return this.FilterUsers;
    }

    /**
     * Set <p>筛选的用户，该用户关联的用户组会返回IsSelected=1</p>
     * @param FilterUsers <p>筛选的用户，该用户关联的用户组会返回IsSelected=1</p>
     */
    public void setFilterUsers(String [] FilterUsers) {
        this.FilterUsers = FilterUsers;
    }

    /**
     * Get <p>排序的字段，目前只支持CreateTime，默认是CreateTime字段</p> 
     * @return SortField <p>排序的字段，目前只支持CreateTime，默认是CreateTime字段</p>
     */
    public String getSortField() {
        return this.SortField;
    }

    /**
     * Set <p>排序的字段，目前只支持CreateTime，默认是CreateTime字段</p>
     * @param SortField <p>排序的字段，目前只支持CreateTime，默认是CreateTime字段</p>
     */
    public void setSortField(String SortField) {
        this.SortField = SortField;
    }

    /**
     * Get <p>排序类型：Desc 倒序 Asc  正序，需要您和SortField一起设置</p> 
     * @return SortType <p>排序类型：Desc 倒序 Asc  正序，需要您和SortField一起设置</p>
     */
    public String getSortType() {
        return this.SortType;
    }

    /**
     * Set <p>排序类型：Desc 倒序 Asc  正序，需要您和SortField一起设置</p>
     * @param SortType <p>排序类型：Desc 倒序 Asc  正序，需要您和SortField一起设置</p>
     */
    public void setSortType(String SortType) {
        this.SortType = SortType;
    }

    /**
     * Get <p>翻页offset. 不要与NextToken同时使用，优先使用NextToken</p> 
     * @return Offset <p>翻页offset. 不要与NextToken同时使用，优先使用NextToken</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>翻页offset. 不要与NextToken同时使用，优先使用NextToken</p>
     * @param Offset <p>翻页offset. 不要与NextToken同时使用，优先使用NextToken</p>
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

