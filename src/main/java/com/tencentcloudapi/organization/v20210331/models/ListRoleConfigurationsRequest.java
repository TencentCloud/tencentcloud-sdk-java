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

public class ListRoleConfigurationsRequest extends AbstractModel {

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
    * <p>过滤文本。不区分大小写。目前，支持 RoleConfigurationName和Description. 示例：Filter = &quot;test&quot;，表示查询名称或描述里包含 test 的权限配置。</p>
    */
    @SerializedName("Filter")
    @Expose
    private String Filter;

    /**
    * <p>检索成员账号是否配置过权限，如果配置过返回IsSelected: true, 否则返回false。</p>
    */
    @SerializedName("FilterTargets")
    @Expose
    private Long [] FilterTargets;

    /**
    * <p>授权的用户UserId或者用户组的GroupId，必须和入参数FilterTargets一起设置</p>
    */
    @SerializedName("PrincipalId")
    @Expose
    private String PrincipalId;

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
     * Get <p>过滤文本。不区分大小写。目前，支持 RoleConfigurationName和Description. 示例：Filter = &quot;test&quot;，表示查询名称或描述里包含 test 的权限配置。</p> 
     * @return Filter <p>过滤文本。不区分大小写。目前，支持 RoleConfigurationName和Description. 示例：Filter = &quot;test&quot;，表示查询名称或描述里包含 test 的权限配置。</p>
     */
    public String getFilter() {
        return this.Filter;
    }

    /**
     * Set <p>过滤文本。不区分大小写。目前，支持 RoleConfigurationName和Description. 示例：Filter = &quot;test&quot;，表示查询名称或描述里包含 test 的权限配置。</p>
     * @param Filter <p>过滤文本。不区分大小写。目前，支持 RoleConfigurationName和Description. 示例：Filter = &quot;test&quot;，表示查询名称或描述里包含 test 的权限配置。</p>
     */
    public void setFilter(String Filter) {
        this.Filter = Filter;
    }

    /**
     * Get <p>检索成员账号是否配置过权限，如果配置过返回IsSelected: true, 否则返回false。</p> 
     * @return FilterTargets <p>检索成员账号是否配置过权限，如果配置过返回IsSelected: true, 否则返回false。</p>
     */
    public Long [] getFilterTargets() {
        return this.FilterTargets;
    }

    /**
     * Set <p>检索成员账号是否配置过权限，如果配置过返回IsSelected: true, 否则返回false。</p>
     * @param FilterTargets <p>检索成员账号是否配置过权限，如果配置过返回IsSelected: true, 否则返回false。</p>
     */
    public void setFilterTargets(Long [] FilterTargets) {
        this.FilterTargets = FilterTargets;
    }

    /**
     * Get <p>授权的用户UserId或者用户组的GroupId，必须和入参数FilterTargets一起设置</p> 
     * @return PrincipalId <p>授权的用户UserId或者用户组的GroupId，必须和入参数FilterTargets一起设置</p>
     */
    public String getPrincipalId() {
        return this.PrincipalId;
    }

    /**
     * Set <p>授权的用户UserId或者用户组的GroupId，必须和入参数FilterTargets一起设置</p>
     * @param PrincipalId <p>授权的用户UserId或者用户组的GroupId，必须和入参数FilterTargets一起设置</p>
     */
    public void setPrincipalId(String PrincipalId) {
        this.PrincipalId = PrincipalId;
    }

    public ListRoleConfigurationsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListRoleConfigurationsRequest(ListRoleConfigurationsRequest source) {
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
        if (source.FilterTargets != null) {
            this.FilterTargets = new Long[source.FilterTargets.length];
            for (int i = 0; i < source.FilterTargets.length; i++) {
                this.FilterTargets[i] = new Long(source.FilterTargets[i]);
            }
        }
        if (source.PrincipalId != null) {
            this.PrincipalId = new String(source.PrincipalId);
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
        this.setParamArraySimple(map, prefix + "FilterTargets.", this.FilterTargets);
        this.setParamSimple(map, prefix + "PrincipalId", this.PrincipalId);

    }
}

