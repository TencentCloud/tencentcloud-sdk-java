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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListRejectedQuestionRequest extends AbstractModel {

    /**
    * 机器人ID
    */
    @SerializedName("BotBizId")
    @Expose
    private String BotBizId;

    /**
    * 页码

    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 每页数量

    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 查询内容

    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
     * Get 机器人ID 
     * @return BotBizId 机器人ID
     */
    public String getBotBizId() {
        return this.BotBizId;
    }

    /**
     * Set 机器人ID
     * @param BotBizId 机器人ID
     */
    public void setBotBizId(String BotBizId) {
        this.BotBizId = BotBizId;
    }

    /**
     * Get 页码
 
     * @return PageNumber 页码

     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 页码

     * @param PageNumber 页码

     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 每页数量
 
     * @return PageSize 每页数量

     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页数量

     * @param PageSize 每页数量

     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 查询内容
 
     * @return Query 查询内容

     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set 查询内容

     * @param Query 查询内容

     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    public ListRejectedQuestionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListRejectedQuestionRequest(ListRejectedQuestionRequest source) {
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BotBizId", this.BotBizId);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "Query", this.Query);

    }
}

