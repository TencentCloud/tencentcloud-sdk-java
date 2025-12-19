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

public class ListRejectedQuestionPreviewRequest extends AbstractModel {

    /**
    * 应用ID（获取方法参看如何获取   [BotBizId](https://cloud.tencent.com/document/product/1759/109469#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa)）
    */
    @SerializedName("BotBizId")
    @Expose
    private String BotBizId;

    /**
    * 页码（必须大于0）
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 每页数量（取值范围为1-200）
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 查询内容关键字，用于模糊查询，若未提供该参数，默认为查询全部。
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * 发布单ID（可以通过[ListRelease](https://cloud.tencent.com/document/product/1759/105077)获得）
    */
    @SerializedName("ReleaseBizId")
    @Expose
    private String ReleaseBizId;

    /**
    * 状态(1新增2更新3删除)
    */
    @SerializedName("Actions")
    @Expose
    private Long [] Actions;

    /**
    * 开始时间。Unix 时间戳，单位是秒，默认为空。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间。Unix 时间戳，单位是秒，默认为空。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get 应用ID（获取方法参看如何获取   [BotBizId](https://cloud.tencent.com/document/product/1759/109469#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa)） 
     * @return BotBizId 应用ID（获取方法参看如何获取   [BotBizId](https://cloud.tencent.com/document/product/1759/109469#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa)）
     */
    public String getBotBizId() {
        return this.BotBizId;
    }

    /**
     * Set 应用ID（获取方法参看如何获取   [BotBizId](https://cloud.tencent.com/document/product/1759/109469#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa)）
     * @param BotBizId 应用ID（获取方法参看如何获取   [BotBizId](https://cloud.tencent.com/document/product/1759/109469#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa)）
     */
    public void setBotBizId(String BotBizId) {
        this.BotBizId = BotBizId;
    }

    /**
     * Get 页码（必须大于0） 
     * @return PageNumber 页码（必须大于0）
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 页码（必须大于0）
     * @param PageNumber 页码（必须大于0）
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 每页数量（取值范围为1-200） 
     * @return PageSize 每页数量（取值范围为1-200）
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页数量（取值范围为1-200）
     * @param PageSize 每页数量（取值范围为1-200）
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 查询内容关键字，用于模糊查询，若未提供该参数，默认为查询全部。 
     * @return Query 查询内容关键字，用于模糊查询，若未提供该参数，默认为查询全部。
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set 查询内容关键字，用于模糊查询，若未提供该参数，默认为查询全部。
     * @param Query 查询内容关键字，用于模糊查询，若未提供该参数，默认为查询全部。
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get 发布单ID（可以通过[ListRelease](https://cloud.tencent.com/document/product/1759/105077)获得） 
     * @return ReleaseBizId 发布单ID（可以通过[ListRelease](https://cloud.tencent.com/document/product/1759/105077)获得）
     */
    public String getReleaseBizId() {
        return this.ReleaseBizId;
    }

    /**
     * Set 发布单ID（可以通过[ListRelease](https://cloud.tencent.com/document/product/1759/105077)获得）
     * @param ReleaseBizId 发布单ID（可以通过[ListRelease](https://cloud.tencent.com/document/product/1759/105077)获得）
     */
    public void setReleaseBizId(String ReleaseBizId) {
        this.ReleaseBizId = ReleaseBizId;
    }

    /**
     * Get 状态(1新增2更新3删除) 
     * @return Actions 状态(1新增2更新3删除)
     */
    public Long [] getActions() {
        return this.Actions;
    }

    /**
     * Set 状态(1新增2更新3删除)
     * @param Actions 状态(1新增2更新3删除)
     */
    public void setActions(Long [] Actions) {
        this.Actions = Actions;
    }

    /**
     * Get 开始时间。Unix 时间戳，单位是秒，默认为空。 
     * @return StartTime 开始时间。Unix 时间戳，单位是秒，默认为空。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间。Unix 时间戳，单位是秒，默认为空。
     * @param StartTime 开始时间。Unix 时间戳，单位是秒，默认为空。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间。Unix 时间戳，单位是秒，默认为空。 
     * @return EndTime 结束时间。Unix 时间戳，单位是秒，默认为空。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间。Unix 时间戳，单位是秒，默认为空。
     * @param EndTime 结束时间。Unix 时间戳，单位是秒，默认为空。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public ListRejectedQuestionPreviewRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListRejectedQuestionPreviewRequest(ListRejectedQuestionPreviewRequest source) {
        if (source.BotBizId != null) {
            this.BotBizId = new String(source.BotBizId);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.ReleaseBizId != null) {
            this.ReleaseBizId = new String(source.ReleaseBizId);
        }
        if (source.Actions != null) {
            this.Actions = new Long[source.Actions.length];
            for (int i = 0; i < source.Actions.length; i++) {
                this.Actions[i] = new Long(source.Actions[i]);
            }
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BotBizId", this.BotBizId);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamSimple(map, prefix + "ReleaseBizId", this.ReleaseBizId);
        this.setParamArraySimple(map, prefix + "Actions.", this.Actions);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

