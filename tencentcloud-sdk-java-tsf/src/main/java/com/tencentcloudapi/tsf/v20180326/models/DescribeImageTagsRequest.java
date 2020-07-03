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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeImageTagsRequest extends AbstractModel{

    /**
    * 应用Id
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * 偏移量，取值从0开始
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页个数，默认为20， 取值应为1~100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 不填和0:查询 1:不查询
    */
    @SerializedName("QueryImageIdFlag")
    @Expose
    private Long QueryImageIdFlag;

    /**
    * 可用于搜索的 tag 名字
    */
    @SerializedName("SearchWord")
    @Expose
    private String SearchWord;

    /**
     * Get 应用Id 
     * @return ApplicationId 应用Id
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set 应用Id
     * @param ApplicationId 应用Id
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get 偏移量，取值从0开始 
     * @return Offset 偏移量，取值从0开始
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，取值从0开始
     * @param Offset 偏移量，取值从0开始
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页个数，默认为20， 取值应为1~100 
     * @return Limit 分页个数，默认为20， 取值应为1~100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页个数，默认为20， 取值应为1~100
     * @param Limit 分页个数，默认为20， 取值应为1~100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 不填和0:查询 1:不查询 
     * @return QueryImageIdFlag 不填和0:查询 1:不查询
     */
    public Long getQueryImageIdFlag() {
        return this.QueryImageIdFlag;
    }

    /**
     * Set 不填和0:查询 1:不查询
     * @param QueryImageIdFlag 不填和0:查询 1:不查询
     */
    public void setQueryImageIdFlag(Long QueryImageIdFlag) {
        this.QueryImageIdFlag = QueryImageIdFlag;
    }

    /**
     * Get 可用于搜索的 tag 名字 
     * @return SearchWord 可用于搜索的 tag 名字
     */
    public String getSearchWord() {
        return this.SearchWord;
    }

    /**
     * Set 可用于搜索的 tag 名字
     * @param SearchWord 可用于搜索的 tag 名字
     */
    public void setSearchWord(String SearchWord) {
        this.SearchWord = SearchWord;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "QueryImageIdFlag", this.QueryImageIdFlag);
        this.setParamSimple(map, prefix + "SearchWord", this.SearchWord);

    }
}

