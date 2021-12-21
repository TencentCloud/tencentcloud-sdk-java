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

public class QueryDealerInfoListRequest extends AbstractModel{

    /**
    * 用于分页查询的游标，字符串类型，由上一次调用返回，首次调用可不填
    */
    @SerializedName("Cursor")
    @Expose
    private String Cursor;

    /**
    * 返回的最大记录数，整型，最大值100，默认值50，超过最大值时取最大值
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 用于分页查询的游标，字符串类型，由上一次调用返回，首次调用可不填 
     * @return Cursor 用于分页查询的游标，字符串类型，由上一次调用返回，首次调用可不填
     */
    public String getCursor() {
        return this.Cursor;
    }

    /**
     * Set 用于分页查询的游标，字符串类型，由上一次调用返回，首次调用可不填
     * @param Cursor 用于分页查询的游标，字符串类型，由上一次调用返回，首次调用可不填
     */
    public void setCursor(String Cursor) {
        this.Cursor = Cursor;
    }

    /**
     * Get 返回的最大记录数，整型，最大值100，默认值50，超过最大值时取最大值 
     * @return Limit 返回的最大记录数，整型，最大值100，默认值50，超过最大值时取最大值
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回的最大记录数，整型，最大值100，默认值50，超过最大值时取最大值
     * @param Limit 返回的最大记录数，整型，最大值100，默认值50，超过最大值时取最大值
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public QueryDealerInfoListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryDealerInfoListRequest(QueryDealerInfoListRequest source) {
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

