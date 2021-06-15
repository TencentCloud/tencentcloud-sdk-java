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
package com.tencentcloudapi.wav.v20210129.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryActivityListRequest extends AbstractModel{

    /**
    * 分页游标，对应结果返回的NextCursor,首次请求保持为空
    */
    @SerializedName("Cursor")
    @Expose
    private String Cursor;

    /**
    * 单页数据限制
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 分页游标，对应结果返回的NextCursor,首次请求保持为空 
     * @return Cursor 分页游标，对应结果返回的NextCursor,首次请求保持为空
     */
    public String getCursor() {
        return this.Cursor;
    }

    /**
     * Set 分页游标，对应结果返回的NextCursor,首次请求保持为空
     * @param Cursor 分页游标，对应结果返回的NextCursor,首次请求保持为空
     */
    public void setCursor(String Cursor) {
        this.Cursor = Cursor;
    }

    /**
     * Get 单页数据限制 
     * @return Limit 单页数据限制
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 单页数据限制
     * @param Limit 单页数据限制
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public QueryActivityListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryActivityListRequest(QueryActivityListRequest source) {
        if (source.Cursor != null) {
            this.Cursor = new String(source.Cursor);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Cursor", this.Cursor);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

