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

public class ListUnsatisfiedReplyRequest extends AbstractModel {

    /**
    * 应用ID，获取方法参看如何获取[BotBizId](https://cloud.tencent.com/document/product/1759/109469#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa)
    */
    @SerializedName("BotBizId")
    @Expose
    private String BotBizId;

    /**
    * 页码，取值范围：大于0
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 分页数量，取值范围：大于0
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

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
    * 用户请求(问题或答案)，按关键词检索，可匹配用户问题或答案
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * 按错误类型检索
    */
    @SerializedName("Reasons")
    @Expose
    private String [] Reasons;

    /**
    * 按操作状态检索  0-全部 1-待处理  2-已处理【包括答案纠错，拒答，忽略】，不填时默认值为0
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 处理状态 0-待处理 1-已拒答 2-已忽略 3-已添加为新问答 4-已添加为相似问
    */
    @SerializedName("HandlingStatuses")
    @Expose
    private Long [] HandlingStatuses;

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
     * Get 页码，取值范围：大于0 
     * @return PageNumber 页码，取值范围：大于0
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 页码，取值范围：大于0
     * @param PageNumber 页码，取值范围：大于0
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 分页数量，取值范围：大于0 
     * @return PageSize 分页数量，取值范围：大于0
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 分页数量，取值范围：大于0
     * @param PageSize 分页数量，取值范围：大于0
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
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
     * Get 用户请求(问题或答案)，按关键词检索，可匹配用户问题或答案 
     * @return Query 用户请求(问题或答案)，按关键词检索，可匹配用户问题或答案
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set 用户请求(问题或答案)，按关键词检索，可匹配用户问题或答案
     * @param Query 用户请求(问题或答案)，按关键词检索，可匹配用户问题或答案
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get 按错误类型检索 
     * @return Reasons 按错误类型检索
     */
    public String [] getReasons() {
        return this.Reasons;
    }

    /**
     * Set 按错误类型检索
     * @param Reasons 按错误类型检索
     */
    public void setReasons(String [] Reasons) {
        this.Reasons = Reasons;
    }

    /**
     * Get 按操作状态检索  0-全部 1-待处理  2-已处理【包括答案纠错，拒答，忽略】，不填时默认值为0 
     * @return Status 按操作状态检索  0-全部 1-待处理  2-已处理【包括答案纠错，拒答，忽略】，不填时默认值为0
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 按操作状态检索  0-全部 1-待处理  2-已处理【包括答案纠错，拒答，忽略】，不填时默认值为0
     * @param Status 按操作状态检索  0-全部 1-待处理  2-已处理【包括答案纠错，拒答，忽略】，不填时默认值为0
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 处理状态 0-待处理 1-已拒答 2-已忽略 3-已添加为新问答 4-已添加为相似问 
     * @return HandlingStatuses 处理状态 0-待处理 1-已拒答 2-已忽略 3-已添加为新问答 4-已添加为相似问
     */
    public Long [] getHandlingStatuses() {
        return this.HandlingStatuses;
    }

    /**
     * Set 处理状态 0-待处理 1-已拒答 2-已忽略 3-已添加为新问答 4-已添加为相似问
     * @param HandlingStatuses 处理状态 0-待处理 1-已拒答 2-已忽略 3-已添加为新问答 4-已添加为相似问
     */
    public void setHandlingStatuses(Long [] HandlingStatuses) {
        this.HandlingStatuses = HandlingStatuses;
    }

    public ListUnsatisfiedReplyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListUnsatisfiedReplyRequest(ListUnsatisfiedReplyRequest source) {
        if (source.BotBizId != null) {
            this.BotBizId = new String(source.BotBizId);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
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
        if (source.Reasons != null) {
            this.Reasons = new String[source.Reasons.length];
            for (int i = 0; i < source.Reasons.length; i++) {
                this.Reasons[i] = new String(source.Reasons[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.HandlingStatuses != null) {
            this.HandlingStatuses = new Long[source.HandlingStatuses.length];
            for (int i = 0; i < source.HandlingStatuses.length; i++) {
                this.HandlingStatuses[i] = new Long(source.HandlingStatuses[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BotBizId", this.BotBizId);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "LoginUin", this.LoginUin);
        this.setParamSimple(map, prefix + "LoginSubAccountUin", this.LoginSubAccountUin);
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamArraySimple(map, prefix + "Reasons.", this.Reasons);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "HandlingStatuses.", this.HandlingStatuses);

    }
}

