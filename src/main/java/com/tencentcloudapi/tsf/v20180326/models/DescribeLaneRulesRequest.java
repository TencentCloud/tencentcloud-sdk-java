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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLaneRulesRequest extends AbstractModel {

    /**
    * 返回数量，默认为20，最大值为500。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移量，默认为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 搜索关键词。
    */
    @SerializedName("SearchWord")
    @Expose
    private String SearchWord;

    /**
    * 灰度发布规则ID。该参数可以通过调用 [DescribeLaneRules](https://cloud.tencent.com/document/product/649/44505) 的返回值中的 RuleId 字段来获取或通过登录[控制台](https://console.cloud.tencent.com/tse/tsf-consul?tab=grayscale&subTab=lanerule)查看；也可以调用[CreateLaneRule](https://cloud.tencent.com/document/product/649/44507)创建新的灰度发布规则。
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * 灰度发布规则ID。该参数可以通过调用 [DescribeLaneRules](https://cloud.tencent.com/document/product/649/44505) 的返回值中的 RuleId 字段来获取或通过登录[控制台](https://console.cloud.tencent.com/tse/tsf-consul?tab=grayscale&subTab=lanerule)查看；也可以调用[CreateLaneRule](https://cloud.tencent.com/document/product/649/44507)创建新的灰度发布规则。
    */
    @SerializedName("RuleIdList")
    @Expose
    private String [] RuleIdList;

    /**
    * 查询全部标记
    */
    @SerializedName("QueryAll")
    @Expose
    private Boolean QueryAll;

    /**
     * Get 返回数量，默认为20，最大值为500。 
     * @return Limit 返回数量，默认为20，最大值为500。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认为20，最大值为500。
     * @param Limit 返回数量，默认为20，最大值为500。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移量，默认为0。 
     * @return Offset 偏移量，默认为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0。
     * @param Offset 偏移量，默认为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 搜索关键词。 
     * @return SearchWord 搜索关键词。
     */
    public String getSearchWord() {
        return this.SearchWord;
    }

    /**
     * Set 搜索关键词。
     * @param SearchWord 搜索关键词。
     */
    public void setSearchWord(String SearchWord) {
        this.SearchWord = SearchWord;
    }

    /**
     * Get 灰度发布规则ID。该参数可以通过调用 [DescribeLaneRules](https://cloud.tencent.com/document/product/649/44505) 的返回值中的 RuleId 字段来获取或通过登录[控制台](https://console.cloud.tencent.com/tse/tsf-consul?tab=grayscale&subTab=lanerule)查看；也可以调用[CreateLaneRule](https://cloud.tencent.com/document/product/649/44507)创建新的灰度发布规则。 
     * @return RuleId 灰度发布规则ID。该参数可以通过调用 [DescribeLaneRules](https://cloud.tencent.com/document/product/649/44505) 的返回值中的 RuleId 字段来获取或通过登录[控制台](https://console.cloud.tencent.com/tse/tsf-consul?tab=grayscale&subTab=lanerule)查看；也可以调用[CreateLaneRule](https://cloud.tencent.com/document/product/649/44507)创建新的灰度发布规则。
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 灰度发布规则ID。该参数可以通过调用 [DescribeLaneRules](https://cloud.tencent.com/document/product/649/44505) 的返回值中的 RuleId 字段来获取或通过登录[控制台](https://console.cloud.tencent.com/tse/tsf-consul?tab=grayscale&subTab=lanerule)查看；也可以调用[CreateLaneRule](https://cloud.tencent.com/document/product/649/44507)创建新的灰度发布规则。
     * @param RuleId 灰度发布规则ID。该参数可以通过调用 [DescribeLaneRules](https://cloud.tencent.com/document/product/649/44505) 的返回值中的 RuleId 字段来获取或通过登录[控制台](https://console.cloud.tencent.com/tse/tsf-consul?tab=grayscale&subTab=lanerule)查看；也可以调用[CreateLaneRule](https://cloud.tencent.com/document/product/649/44507)创建新的灰度发布规则。
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 灰度发布规则ID。该参数可以通过调用 [DescribeLaneRules](https://cloud.tencent.com/document/product/649/44505) 的返回值中的 RuleId 字段来获取或通过登录[控制台](https://console.cloud.tencent.com/tse/tsf-consul?tab=grayscale&subTab=lanerule)查看；也可以调用[CreateLaneRule](https://cloud.tencent.com/document/product/649/44507)创建新的灰度发布规则。 
     * @return RuleIdList 灰度发布规则ID。该参数可以通过调用 [DescribeLaneRules](https://cloud.tencent.com/document/product/649/44505) 的返回值中的 RuleId 字段来获取或通过登录[控制台](https://console.cloud.tencent.com/tse/tsf-consul?tab=grayscale&subTab=lanerule)查看；也可以调用[CreateLaneRule](https://cloud.tencent.com/document/product/649/44507)创建新的灰度发布规则。
     */
    public String [] getRuleIdList() {
        return this.RuleIdList;
    }

    /**
     * Set 灰度发布规则ID。该参数可以通过调用 [DescribeLaneRules](https://cloud.tencent.com/document/product/649/44505) 的返回值中的 RuleId 字段来获取或通过登录[控制台](https://console.cloud.tencent.com/tse/tsf-consul?tab=grayscale&subTab=lanerule)查看；也可以调用[CreateLaneRule](https://cloud.tencent.com/document/product/649/44507)创建新的灰度发布规则。
     * @param RuleIdList 灰度发布规则ID。该参数可以通过调用 [DescribeLaneRules](https://cloud.tencent.com/document/product/649/44505) 的返回值中的 RuleId 字段来获取或通过登录[控制台](https://console.cloud.tencent.com/tse/tsf-consul?tab=grayscale&subTab=lanerule)查看；也可以调用[CreateLaneRule](https://cloud.tencent.com/document/product/649/44507)创建新的灰度发布规则。
     */
    public void setRuleIdList(String [] RuleIdList) {
        this.RuleIdList = RuleIdList;
    }

    /**
     * Get 查询全部标记 
     * @return QueryAll 查询全部标记
     */
    public Boolean getQueryAll() {
        return this.QueryAll;
    }

    /**
     * Set 查询全部标记
     * @param QueryAll 查询全部标记
     */
    public void setQueryAll(Boolean QueryAll) {
        this.QueryAll = QueryAll;
    }

    public DescribeLaneRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLaneRulesRequest(DescribeLaneRulesRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.SearchWord != null) {
            this.SearchWord = new String(source.SearchWord);
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.RuleIdList != null) {
            this.RuleIdList = new String[source.RuleIdList.length];
            for (int i = 0; i < source.RuleIdList.length; i++) {
                this.RuleIdList[i] = new String(source.RuleIdList[i]);
            }
        }
        if (source.QueryAll != null) {
            this.QueryAll = new Boolean(source.QueryAll);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "SearchWord", this.SearchWord);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamArraySimple(map, prefix + "RuleIdList.", this.RuleIdList);
        this.setParamSimple(map, prefix + "QueryAll", this.QueryAll);

    }
}

