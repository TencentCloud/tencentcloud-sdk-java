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
package com.tencentcloudapi.dtf.v20200506.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTransactionsRequest extends AbstractModel{

    /**
    * 事务分组ID
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 事务开始时间查询起始时间戳，UTC，精确到毫秒
    */
    @SerializedName("TransactionBeginFrom")
    @Expose
    private Long TransactionBeginFrom;

    /**
    * 事务开始时间查询截止时间戳，UTC，精确到毫秒
    */
    @SerializedName("TransactionBeginTo")
    @Expose
    private Long TransactionBeginTo;

    /**
    * 仅查询异常状态的事务，true：仅查询异常，false或不传入：查询所有
    */
    @SerializedName("SearchError")
    @Expose
    private Boolean SearchError;

    /**
    * 主事务ID，不传入时查询全量，高优先级
    */
    @SerializedName("TransactionId")
    @Expose
    private Long TransactionId;

    /**
    * 主事务ID列表，不传入时查询全量，低优先级
    */
    @SerializedName("TransactionIdList")
    @Expose
    private Long [] TransactionIdList;

    /**
    * 每页数量
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 起始偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get 事务分组ID 
     * @return GroupId 事务分组ID
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 事务分组ID
     * @param GroupId 事务分组ID
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 事务开始时间查询起始时间戳，UTC，精确到毫秒 
     * @return TransactionBeginFrom 事务开始时间查询起始时间戳，UTC，精确到毫秒
     */
    public Long getTransactionBeginFrom() {
        return this.TransactionBeginFrom;
    }

    /**
     * Set 事务开始时间查询起始时间戳，UTC，精确到毫秒
     * @param TransactionBeginFrom 事务开始时间查询起始时间戳，UTC，精确到毫秒
     */
    public void setTransactionBeginFrom(Long TransactionBeginFrom) {
        this.TransactionBeginFrom = TransactionBeginFrom;
    }

    /**
     * Get 事务开始时间查询截止时间戳，UTC，精确到毫秒 
     * @return TransactionBeginTo 事务开始时间查询截止时间戳，UTC，精确到毫秒
     */
    public Long getTransactionBeginTo() {
        return this.TransactionBeginTo;
    }

    /**
     * Set 事务开始时间查询截止时间戳，UTC，精确到毫秒
     * @param TransactionBeginTo 事务开始时间查询截止时间戳，UTC，精确到毫秒
     */
    public void setTransactionBeginTo(Long TransactionBeginTo) {
        this.TransactionBeginTo = TransactionBeginTo;
    }

    /**
     * Get 仅查询异常状态的事务，true：仅查询异常，false或不传入：查询所有 
     * @return SearchError 仅查询异常状态的事务，true：仅查询异常，false或不传入：查询所有
     */
    public Boolean getSearchError() {
        return this.SearchError;
    }

    /**
     * Set 仅查询异常状态的事务，true：仅查询异常，false或不传入：查询所有
     * @param SearchError 仅查询异常状态的事务，true：仅查询异常，false或不传入：查询所有
     */
    public void setSearchError(Boolean SearchError) {
        this.SearchError = SearchError;
    }

    /**
     * Get 主事务ID，不传入时查询全量，高优先级 
     * @return TransactionId 主事务ID，不传入时查询全量，高优先级
     */
    public Long getTransactionId() {
        return this.TransactionId;
    }

    /**
     * Set 主事务ID，不传入时查询全量，高优先级
     * @param TransactionId 主事务ID，不传入时查询全量，高优先级
     */
    public void setTransactionId(Long TransactionId) {
        this.TransactionId = TransactionId;
    }

    /**
     * Get 主事务ID列表，不传入时查询全量，低优先级 
     * @return TransactionIdList 主事务ID列表，不传入时查询全量，低优先级
     */
    public Long [] getTransactionIdList() {
        return this.TransactionIdList;
    }

    /**
     * Set 主事务ID列表，不传入时查询全量，低优先级
     * @param TransactionIdList 主事务ID列表，不传入时查询全量，低优先级
     */
    public void setTransactionIdList(Long [] TransactionIdList) {
        this.TransactionIdList = TransactionIdList;
    }

    /**
     * Get 每页数量 
     * @return Limit 每页数量
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页数量
     * @param Limit 每页数量
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 起始偏移量 
     * @return Offset 起始偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 起始偏移量
     * @param Offset 起始偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeTransactionsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTransactionsRequest(DescribeTransactionsRequest source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.TransactionBeginFrom != null) {
            this.TransactionBeginFrom = new Long(source.TransactionBeginFrom);
        }
        if (source.TransactionBeginTo != null) {
            this.TransactionBeginTo = new Long(source.TransactionBeginTo);
        }
        if (source.SearchError != null) {
            this.SearchError = new Boolean(source.SearchError);
        }
        if (source.TransactionId != null) {
            this.TransactionId = new Long(source.TransactionId);
        }
        if (source.TransactionIdList != null) {
            this.TransactionIdList = new Long[source.TransactionIdList.length];
            for (int i = 0; i < source.TransactionIdList.length; i++) {
                this.TransactionIdList[i] = new Long(source.TransactionIdList[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "TransactionBeginFrom", this.TransactionBeginFrom);
        this.setParamSimple(map, prefix + "TransactionBeginTo", this.TransactionBeginTo);
        this.setParamSimple(map, prefix + "SearchError", this.SearchError);
        this.setParamSimple(map, prefix + "TransactionId", this.TransactionId);
        this.setParamArraySimple(map, prefix + "TransactionIdList.", this.TransactionIdList);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

