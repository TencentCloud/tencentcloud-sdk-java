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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeESHitsRequest extends AbstractModel {

    /**
    * ES查询条件JSON
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * 偏移量，默认为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回数量，最大值为100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 日志类型列表
    */
    @SerializedName("LogTypes")
    @Expose
    private String [] LogTypes;

    /**
     * Get ES查询条件JSON 
     * @return Query ES查询条件JSON
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set ES查询条件JSON
     * @param Query ES查询条件JSON
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get 偏移量，默认为0。 
     * @return Offset 偏移量，默认为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0。
     * @param Offset 偏移量，默认为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回数量，最大值为100。 
     * @return Limit 返回数量，最大值为100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，最大值为100。
     * @param Limit 返回数量，最大值为100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 日志类型列表 
     * @return LogTypes 日志类型列表
     */
    public String [] getLogTypes() {
        return this.LogTypes;
    }

    /**
     * Set 日志类型列表
     * @param LogTypes 日志类型列表
     */
    public void setLogTypes(String [] LogTypes) {
        this.LogTypes = LogTypes;
    }

    public DescribeESHitsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeESHitsRequest(DescribeESHitsRequest source) {
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.LogTypes != null) {
            this.LogTypes = new String[source.LogTypes.length];
            for (int i = 0; i < source.LogTypes.length; i++) {
                this.LogTypes[i] = new String(source.LogTypes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "LogTypes.", this.LogTypes);

    }
}

