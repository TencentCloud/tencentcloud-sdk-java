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
package com.tencentcloudapi.hunyuan.v20230901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetThreadMessageListRequest extends AbstractModel {

    /**
    * 会话 ID
    */
    @SerializedName("ThreadID")
    @Expose
    private String ThreadID;

    /**
    * 返回的消息条数，1 - 100 条
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 排序方式，按创建时间升序（asc）或降序（desc），默认为 desc
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
     * Get 会话 ID 
     * @return ThreadID 会话 ID
     */
    public String getThreadID() {
        return this.ThreadID;
    }

    /**
     * Set 会话 ID
     * @param ThreadID 会话 ID
     */
    public void setThreadID(String ThreadID) {
        this.ThreadID = ThreadID;
    }

    /**
     * Get 返回的消息条数，1 - 100 条 
     * @return Limit 返回的消息条数，1 - 100 条
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回的消息条数，1 - 100 条
     * @param Limit 返回的消息条数，1 - 100 条
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 排序方式，按创建时间升序（asc）或降序（desc），默认为 desc 
     * @return Order 排序方式，按创建时间升序（asc）或降序（desc），默认为 desc
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 排序方式，按创建时间升序（asc）或降序（desc），默认为 desc
     * @param Order 排序方式，按创建时间升序（asc）或降序（desc），默认为 desc
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    public GetThreadMessageListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetThreadMessageListRequest(GetThreadMessageListRequest source) {
        if (source.ThreadID != null) {
            this.ThreadID = new String(source.ThreadID);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ThreadID", this.ThreadID);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Order", this.Order);

    }
}

