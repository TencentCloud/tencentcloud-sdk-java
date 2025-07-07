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

public class DescribeImageTagsRequest extends AbstractModel {

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
    * 企业: tcr ；个人: personal或者不填
    */
    @SerializedName("RepoType")
    @Expose
    private String RepoType;

    /**
    * TcrRepoInfo值
    */
    @SerializedName("TcrRepoInfo")
    @Expose
    private TcrRepoInfo TcrRepoInfo;

    /**
    * 仓库名
    */
    @SerializedName("RepoName")
    @Expose
    private String RepoName;

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
     * Get 企业: tcr ；个人: personal或者不填 
     * @return RepoType 企业: tcr ；个人: personal或者不填
     */
    public String getRepoType() {
        return this.RepoType;
    }

    /**
     * Set 企业: tcr ；个人: personal或者不填
     * @param RepoType 企业: tcr ；个人: personal或者不填
     */
    public void setRepoType(String RepoType) {
        this.RepoType = RepoType;
    }

    /**
     * Get TcrRepoInfo值 
     * @return TcrRepoInfo TcrRepoInfo值
     */
    public TcrRepoInfo getTcrRepoInfo() {
        return this.TcrRepoInfo;
    }

    /**
     * Set TcrRepoInfo值
     * @param TcrRepoInfo TcrRepoInfo值
     */
    public void setTcrRepoInfo(TcrRepoInfo TcrRepoInfo) {
        this.TcrRepoInfo = TcrRepoInfo;
    }

    /**
     * Get 仓库名 
     * @return RepoName 仓库名
     */
    public String getRepoName() {
        return this.RepoName;
    }

    /**
     * Set 仓库名
     * @param RepoName 仓库名
     */
    public void setRepoName(String RepoName) {
        this.RepoName = RepoName;
    }

    public DescribeImageTagsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeImageTagsRequest(DescribeImageTagsRequest source) {
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.QueryImageIdFlag != null) {
            this.QueryImageIdFlag = new Long(source.QueryImageIdFlag);
        }
        if (source.SearchWord != null) {
            this.SearchWord = new String(source.SearchWord);
        }
        if (source.RepoType != null) {
            this.RepoType = new String(source.RepoType);
        }
        if (source.TcrRepoInfo != null) {
            this.TcrRepoInfo = new TcrRepoInfo(source.TcrRepoInfo);
        }
        if (source.RepoName != null) {
            this.RepoName = new String(source.RepoName);
        }
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
        this.setParamSimple(map, prefix + "RepoType", this.RepoType);
        this.setParamObj(map, prefix + "TcrRepoInfo.", this.TcrRepoInfo);
        this.setParamSimple(map, prefix + "RepoName", this.RepoName);

    }
}

