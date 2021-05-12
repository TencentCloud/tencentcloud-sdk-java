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
package com.tencentcloudapi.gpm.v20200820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMatchesResponse extends AbstractModel{

    /**
    * 匹配信息列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MatchInfoList")
    @Expose
    private MatchInfo [] MatchInfoList;

    /**
    * 总记录数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 当前页号，不填默认返回第一页
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 单页大小，不填默认取 30，最大值不能超过 30
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 查询类型（可选）：matchName表示匹配名称，matchCode表示匹配code，ruleName表示规则名称，tag表示标签Key/Value
    */
    @SerializedName("SearchType")
    @Expose
    private String SearchType;

    /**
    * 查询关键词（可选）
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 匹配信息列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MatchInfoList 匹配信息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MatchInfo [] getMatchInfoList() {
        return this.MatchInfoList;
    }

    /**
     * Set 匹配信息列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param MatchInfoList 匹配信息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMatchInfoList(MatchInfo [] MatchInfoList) {
        this.MatchInfoList = MatchInfoList;
    }

    /**
     * Get 总记录数 
     * @return TotalCount 总记录数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 总记录数
     * @param TotalCount 总记录数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 当前页号，不填默认返回第一页 
     * @return PageNumber 当前页号，不填默认返回第一页
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 当前页号，不填默认返回第一页
     * @param PageNumber 当前页号，不填默认返回第一页
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 单页大小，不填默认取 30，最大值不能超过 30 
     * @return PageSize 单页大小，不填默认取 30，最大值不能超过 30
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 单页大小，不填默认取 30，最大值不能超过 30
     * @param PageSize 单页大小，不填默认取 30，最大值不能超过 30
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 查询类型（可选）：matchName表示匹配名称，matchCode表示匹配code，ruleName表示规则名称，tag表示标签Key/Value 
     * @return SearchType 查询类型（可选）：matchName表示匹配名称，matchCode表示匹配code，ruleName表示规则名称，tag表示标签Key/Value
     */
    public String getSearchType() {
        return this.SearchType;
    }

    /**
     * Set 查询类型（可选）：matchName表示匹配名称，matchCode表示匹配code，ruleName表示规则名称，tag表示标签Key/Value
     * @param SearchType 查询类型（可选）：matchName表示匹配名称，matchCode表示匹配code，ruleName表示规则名称，tag表示标签Key/Value
     */
    public void setSearchType(String SearchType) {
        this.SearchType = SearchType;
    }

    /**
     * Get 查询关键词（可选） 
     * @return Keyword 查询关键词（可选）
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set 查询关键词（可选）
     * @param Keyword 查询关键词（可选）
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeMatchesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMatchesResponse(DescribeMatchesResponse source) {
        if (source.MatchInfoList != null) {
            this.MatchInfoList = new MatchInfo[source.MatchInfoList.length];
            for (int i = 0; i < source.MatchInfoList.length; i++) {
                this.MatchInfoList[i] = new MatchInfo(source.MatchInfoList[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.SearchType != null) {
            this.SearchType = new String(source.SearchType);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "MatchInfoList.", this.MatchInfoList);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "SearchType", this.SearchType);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

