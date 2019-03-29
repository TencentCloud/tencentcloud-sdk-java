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

public class DescribeIndustryNewsResponse  extends AbstractModel{

    /**
    * 总计文章数量
    */
    @SerializedName("NewsCount")
    @Expose
    private Integer NewsCount;

    /**
    * 总计来源数量
    */
    @SerializedName("FromCount")
    @Expose
    private Integer FromCount;

    /**
    * 总计疑似负面数量
    */
    @SerializedName("AdverseCount")
    @Expose
    private Integer AdverseCount;

    /**
    * 文章列表
    */
    @SerializedName("NewsSet")
    @Expose
    private IndustryNews [] NewsSet;

    /**
    * 按天统计的数量列表
    */
    @SerializedName("DateCountSet")
    @Expose
    private DateCount [] DateCountSet;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取总计文章数量
     * @return NewsCount 总计文章数量
     */
    public Integer getNewsCount() {
        return this.NewsCount;
    }

    /**
     * 设置总计文章数量
     * @param NewsCount 总计文章数量
     */
    public void setNewsCount(Integer NewsCount) {
        this.NewsCount = NewsCount;
    }

    /**
     * 获取总计来源数量
     * @return FromCount 总计来源数量
     */
    public Integer getFromCount() {
        return this.FromCount;
    }

    /**
     * 设置总计来源数量
     * @param FromCount 总计来源数量
     */
    public void setFromCount(Integer FromCount) {
        this.FromCount = FromCount;
    }

    /**
     * 获取总计疑似负面数量
     * @return AdverseCount 总计疑似负面数量
     */
    public Integer getAdverseCount() {
        return this.AdverseCount;
    }

    /**
     * 设置总计疑似负面数量
     * @param AdverseCount 总计疑似负面数量
     */
    public void setAdverseCount(Integer AdverseCount) {
        this.AdverseCount = AdverseCount;
    }

    /**
     * 获取文章列表
     * @return NewsSet 文章列表
     */
    public IndustryNews [] getNewsSet() {
        return this.NewsSet;
    }

    /**
     * 设置文章列表
     * @param NewsSet 文章列表
     */
    public void setNewsSet(IndustryNews [] NewsSet) {
        this.NewsSet = NewsSet;
    }

    /**
     * 获取按天统计的数量列表
     * @return DateCountSet 按天统计的数量列表
     */
    public DateCount [] getDateCountSet() {
        return this.DateCountSet;
    }

    /**
     * 设置按天统计的数量列表
     * @param DateCountSet 按天统计的数量列表
     */
    public void setDateCountSet(DateCount [] DateCountSet) {
        this.DateCountSet = DateCountSet;
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
        this.setParamSimple(map, prefix + "NewsCount", this.NewsCount);
        this.setParamSimple(map, prefix + "FromCount", this.FromCount);
        this.setParamSimple(map, prefix + "AdverseCount", this.AdverseCount);
        this.setParamArrayObj(map, prefix + "NewsSet.", this.NewsSet);
        this.setParamArrayObj(map, prefix + "DateCountSet.", this.DateCountSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

