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

public class ListGroupsResponse extends AbstractModel {

    /**
    * 查询返回结果下一页的令牌。  说明 只有IsTruncated为true时，才显示该参数。
    */
    @SerializedName("NextToken")
    @Expose
    private String NextToken;

    /**
    * 用户组列表。
    */
    @SerializedName("Groups")
    @Expose
    private GroupInfo [] Groups;

    /**
    * 每页的最大数据条数。
    */
    @SerializedName("MaxResults")
    @Expose
    private Long MaxResults;

    /**
    * 符合请求参数条件的数据总条数。
    */
    @SerializedName("TotalCounts")
    @Expose
    private Long TotalCounts;

    /**
    * 返回结果是否被截断。取值：  true：已截断。 false：未截断。
    */
    @SerializedName("IsTruncated")
    @Expose
    private Boolean IsTruncated;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 查询返回结果下一页的令牌。  说明 只有IsTruncated为true时，才显示该参数。 
     * @return NextToken 查询返回结果下一页的令牌。  说明 只有IsTruncated为true时，才显示该参数。
     */
    public String getNextToken() {
        return this.NextToken;
    }

    /**
     * Set 查询返回结果下一页的令牌。  说明 只有IsTruncated为true时，才显示该参数。
     * @param NextToken 查询返回结果下一页的令牌。  说明 只有IsTruncated为true时，才显示该参数。
     */
    public void setNextToken(String NextToken) {
        this.NextToken = NextToken;
    }

    /**
     * Get 用户组列表。 
     * @return Groups 用户组列表。
     */
    public GroupInfo [] getGroups() {
        return this.Groups;
    }

    /**
     * Set 用户组列表。
     * @param Groups 用户组列表。
     */
    public void setGroups(GroupInfo [] Groups) {
        this.Groups = Groups;
    }

    /**
     * Get 每页的最大数据条数。 
     * @return MaxResults 每页的最大数据条数。
     */
    public Long getMaxResults() {
        return this.MaxResults;
    }

    /**
     * Set 每页的最大数据条数。
     * @param MaxResults 每页的最大数据条数。
     */
    public void setMaxResults(Long MaxResults) {
        this.MaxResults = MaxResults;
    }

    /**
     * Get 符合请求参数条件的数据总条数。 
     * @return TotalCounts 符合请求参数条件的数据总条数。
     */
    public Long getTotalCounts() {
        return this.TotalCounts;
    }

    /**
     * Set 符合请求参数条件的数据总条数。
     * @param TotalCounts 符合请求参数条件的数据总条数。
     */
    public void setTotalCounts(Long TotalCounts) {
        this.TotalCounts = TotalCounts;
    }

    /**
     * Get 返回结果是否被截断。取值：  true：已截断。 false：未截断。 
     * @return IsTruncated 返回结果是否被截断。取值：  true：已截断。 false：未截断。
     */
    public Boolean getIsTruncated() {
        return this.IsTruncated;
    }

    /**
     * Set 返回结果是否被截断。取值：  true：已截断。 false：未截断。
     * @param IsTruncated 返回结果是否被截断。取值：  true：已截断。 false：未截断。
     */
    public void setIsTruncated(Boolean IsTruncated) {
        this.IsTruncated = IsTruncated;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public ListGroupsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListGroupsResponse(ListGroupsResponse source) {
        if (source.NextToken != null) {
            this.NextToken = new String(source.NextToken);
        }
        if (source.Groups != null) {
            this.Groups = new GroupInfo[source.Groups.length];
            for (int i = 0; i < source.Groups.length; i++) {
                this.Groups[i] = new GroupInfo(source.Groups[i]);
            }
        }
        if (source.MaxResults != null) {
            this.MaxResults = new Long(source.MaxResults);
        }
        if (source.TotalCounts != null) {
            this.TotalCounts = new Long(source.TotalCounts);
        }
        if (source.IsTruncated != null) {
            this.IsTruncated = new Boolean(source.IsTruncated);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NextToken", this.NextToken);
        this.setParamArrayObj(map, prefix + "Groups.", this.Groups);
        this.setParamSimple(map, prefix + "MaxResults", this.MaxResults);
        this.setParamSimple(map, prefix + "TotalCounts", this.TotalCounts);
        this.setParamSimple(map, prefix + "IsTruncated", this.IsTruncated);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

