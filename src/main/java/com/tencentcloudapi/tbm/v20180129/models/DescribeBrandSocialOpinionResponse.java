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

public class DescribeBrandSocialOpinionResponse  extends AbstractModel{

    /**
    * 文章总数
    */
    @SerializedName("ArticleCount")
    @Expose
    private Integer ArticleCount;

    /**
    * 来源统计总数
    */
    @SerializedName("FromCount")
    @Expose
    private Integer FromCount;

    /**
    * 疑似负面报道总数
    */
    @SerializedName("AdverseCount")
    @Expose
    private Integer AdverseCount;

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
     * 获取文章总数
     * @return ArticleCount 文章总数
     */
    public Integer getArticleCount() {
        return this.ArticleCount;
    }

    /**
     * 设置文章总数
     * @param ArticleCount 文章总数
     */
    public void setArticleCount(Integer ArticleCount) {
        this.ArticleCount = ArticleCount;
    }

    /**
     * 获取来源统计总数
     * @return FromCount 来源统计总数
     */
    public Integer getFromCount() {
        return this.FromCount;
    }

    /**
     * 设置来源统计总数
     * @param FromCount 来源统计总数
     */
    public void setFromCount(Integer FromCount) {
        this.FromCount = FromCount;
    }

    /**
     * 获取疑似负面报道总数
     * @return AdverseCount 疑似负面报道总数
     */
    public Integer getAdverseCount() {
        return this.AdverseCount;
    }

    /**
     * 设置疑似负面报道总数
     * @param AdverseCount 疑似负面报道总数
     */
    public void setAdverseCount(Integer AdverseCount) {
        this.AdverseCount = AdverseCount;
    }

    /**
     * 获取文章列表详情
     * @return ArticleSet 文章列表详情
     */
    public BrandReportArticle [] getArticleSet() {
        return this.ArticleSet;
    }

    /**
     * 设置文章列表详情
     * @param ArticleSet 文章列表详情
     */
    public void setArticleSet(BrandReportArticle [] ArticleSet) {
        this.ArticleSet = ArticleSet;
    }

    /**
     * 获取唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ArticleCount", this.ArticleCount);
        this.setParamSimple(map, prefix + "FromCount", this.FromCount);
        this.setParamSimple(map, prefix + "AdverseCount", this.AdverseCount);
        this.setParamArrayObj(map, prefix + "ArticleSet.", this.ArticleSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

