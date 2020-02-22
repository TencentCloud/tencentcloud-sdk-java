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
package com.tencentcloudapi.tbm.v20180129.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBrandSocialOpinionResponse extends AbstractModel{

    /**
    * 文章总数
    */
    @SerializedName("ArticleCount")
    @Expose
    private Long ArticleCount;

    /**
    * 来源统计总数
    */
    @SerializedName("FromCount")
    @Expose
    private Long FromCount;

    /**
    * 疑似负面报道总数
    */
    @SerializedName("AdverseCount")
    @Expose
    private Long AdverseCount;

    /**
    * 文章列表详情
    */
    @SerializedName("ArticleSet")
    @Expose
    private BrandReportArticle [] ArticleSet;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 文章总数 
     * @return ArticleCount 文章总数
     */
    public Long getArticleCount() {
        return this.ArticleCount;
    }

    /**
     * Set 文章总数
     * @param ArticleCount 文章总数
     */
    public void setArticleCount(Long ArticleCount) {
        this.ArticleCount = ArticleCount;
    }

    /**
     * Get 来源统计总数 
     * @return FromCount 来源统计总数
     */
    public Long getFromCount() {
        return this.FromCount;
    }

    /**
     * Set 来源统计总数
     * @param FromCount 来源统计总数
     */
    public void setFromCount(Long FromCount) {
        this.FromCount = FromCount;
    }

    /**
     * Get 疑似负面报道总数 
     * @return AdverseCount 疑似负面报道总数
     */
    public Long getAdverseCount() {
        return this.AdverseCount;
    }

    /**
     * Set 疑似负面报道总数
     * @param AdverseCount 疑似负面报道总数
     */
    public void setAdverseCount(Long AdverseCount) {
        this.AdverseCount = AdverseCount;
    }

    /**
     * Get 文章列表详情 
     * @return ArticleSet 文章列表详情
     */
    public BrandReportArticle [] getArticleSet() {
        return this.ArticleSet;
    }

    /**
     * Set 文章列表详情
     * @param ArticleSet 文章列表详情
     */
    public void setArticleSet(BrandReportArticle [] ArticleSet) {
        this.ArticleSet = ArticleSet;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ArticleCount", this.ArticleCount);
        this.setParamSimple(map, prefix + "FromCount", this.FromCount);
        this.setParamSimple(map, prefix + "AdverseCount", this.AdverseCount);
        this.setParamArrayObj(map, prefix + "ArticleSet.", this.ArticleSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

