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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAttributeLabelRequest extends AbstractModel {

    /**
    * 应用ID，获取方法参看如何获取[BotBizId](https://cloud.tencent.com/document/product/1759/109469#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa)
    */
    @SerializedName("BotBizId")
    @Expose
    private String BotBizId;

    /**
    * 标签ID
    */
    @SerializedName("AttributeBizId")
    @Expose
    private String AttributeBizId;

    /**
    * 每次请求返回的最大标签数量​，限制单次接口返回的标签数量，避免数据量过大。取值范围：大于0。

    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 登录用户主账号(集成商模式必填)
    */
    @SerializedName("LoginUin")
    @Expose
    private String LoginUin;

    /**
    * 登录用户子账号(集成商模式必填)
    */
    @SerializedName("LoginSubAccountUin")
    @Expose
    private String LoginSubAccountUin;

    /**
    * 搜索关键词，用于查询标签标准词或相似词
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * 滚动加载游标，上一次请求返回的最后一个标签ID
    */
    @SerializedName("LastLabelBizId")
    @Expose
    private String LastLabelBizId;

    /**
    * 查询范围 all(或者传空):标准词和相似词 standard:标准词 similar:相似词
    */
    @SerializedName("QueryScope")
    @Expose
    private String QueryScope;

    /**
     * Get 应用ID，获取方法参看如何获取[BotBizId](https://cloud.tencent.com/document/product/1759/109469#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa) 
     * @return BotBizId 应用ID，获取方法参看如何获取[BotBizId](https://cloud.tencent.com/document/product/1759/109469#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa)
     */
    public String getBotBizId() {
        return this.BotBizId;
    }

    /**
     * Set 应用ID，获取方法参看如何获取[BotBizId](https://cloud.tencent.com/document/product/1759/109469#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa)
     * @param BotBizId 应用ID，获取方法参看如何获取[BotBizId](https://cloud.tencent.com/document/product/1759/109469#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa)
     */
    public void setBotBizId(String BotBizId) {
        this.BotBizId = BotBizId;
    }

    /**
     * Get 标签ID 
     * @return AttributeBizId 标签ID
     */
    public String getAttributeBizId() {
        return this.AttributeBizId;
    }

    /**
     * Set 标签ID
     * @param AttributeBizId 标签ID
     */
    public void setAttributeBizId(String AttributeBizId) {
        this.AttributeBizId = AttributeBizId;
    }

    /**
     * Get 每次请求返回的最大标签数量​，限制单次接口返回的标签数量，避免数据量过大。取值范围：大于0。
 
     * @return Limit 每次请求返回的最大标签数量​，限制单次接口返回的标签数量，避免数据量过大。取值范围：大于0。

     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每次请求返回的最大标签数量​，限制单次接口返回的标签数量，避免数据量过大。取值范围：大于0。

     * @param Limit 每次请求返回的最大标签数量​，限制单次接口返回的标签数量，避免数据量过大。取值范围：大于0。

     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 登录用户主账号(集成商模式必填) 
     * @return LoginUin 登录用户主账号(集成商模式必填)
     */
    public String getLoginUin() {
        return this.LoginUin;
    }

    /**
     * Set 登录用户主账号(集成商模式必填)
     * @param LoginUin 登录用户主账号(集成商模式必填)
     */
    public void setLoginUin(String LoginUin) {
        this.LoginUin = LoginUin;
    }

    /**
     * Get 登录用户子账号(集成商模式必填) 
     * @return LoginSubAccountUin 登录用户子账号(集成商模式必填)
     */
    public String getLoginSubAccountUin() {
        return this.LoginSubAccountUin;
    }

    /**
     * Set 登录用户子账号(集成商模式必填)
     * @param LoginSubAccountUin 登录用户子账号(集成商模式必填)
     */
    public void setLoginSubAccountUin(String LoginSubAccountUin) {
        this.LoginSubAccountUin = LoginSubAccountUin;
    }

    /**
     * Get 搜索关键词，用于查询标签标准词或相似词 
     * @return Query 搜索关键词，用于查询标签标准词或相似词
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set 搜索关键词，用于查询标签标准词或相似词
     * @param Query 搜索关键词，用于查询标签标准词或相似词
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get 滚动加载游标，上一次请求返回的最后一个标签ID 
     * @return LastLabelBizId 滚动加载游标，上一次请求返回的最后一个标签ID
     */
    public String getLastLabelBizId() {
        return this.LastLabelBizId;
    }

    /**
     * Set 滚动加载游标，上一次请求返回的最后一个标签ID
     * @param LastLabelBizId 滚动加载游标，上一次请求返回的最后一个标签ID
     */
    public void setLastLabelBizId(String LastLabelBizId) {
        this.LastLabelBizId = LastLabelBizId;
    }

    /**
     * Get 查询范围 all(或者传空):标准词和相似词 standard:标准词 similar:相似词 
     * @return QueryScope 查询范围 all(或者传空):标准词和相似词 standard:标准词 similar:相似词
     */
    public String getQueryScope() {
        return this.QueryScope;
    }

    /**
     * Set 查询范围 all(或者传空):标准词和相似词 standard:标准词 similar:相似词
     * @param QueryScope 查询范围 all(或者传空):标准词和相似词 standard:标准词 similar:相似词
     */
    public void setQueryScope(String QueryScope) {
        this.QueryScope = QueryScope;
    }

    public DescribeAttributeLabelRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAttributeLabelRequest(DescribeAttributeLabelRequest source) {
        if (source.BotBizId != null) {
            this.BotBizId = new String(source.BotBizId);
        }
        if (source.AttributeBizId != null) {
            this.AttributeBizId = new String(source.AttributeBizId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.LoginUin != null) {
            this.LoginUin = new String(source.LoginUin);
        }
        if (source.LoginSubAccountUin != null) {
            this.LoginSubAccountUin = new String(source.LoginSubAccountUin);
        }
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.LastLabelBizId != null) {
            this.LastLabelBizId = new String(source.LastLabelBizId);
        }
        if (source.QueryScope != null) {
            this.QueryScope = new String(source.QueryScope);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BotBizId", this.BotBizId);
        this.setParamSimple(map, prefix + "AttributeBizId", this.AttributeBizId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "LoginUin", this.LoginUin);
        this.setParamSimple(map, prefix + "LoginSubAccountUin", this.LoginSubAccountUin);
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamSimple(map, prefix + "LastLabelBizId", this.LastLabelBizId);
        this.setParamSimple(map, prefix + "QueryScope", this.QueryScope);

    }
}

