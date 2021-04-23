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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSREInstancesRequest extends AbstractModel{

    /**
    * 请求过滤参数
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 翻页单页查询限制数量[0,1000], 默认值0
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 翻页单页偏移量，默认值0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get 请求过滤参数 
     * @return Filters 请求过滤参数
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 请求过滤参数
     * @param Filters 请求过滤参数
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 翻页单页查询限制数量[0,1000], 默认值0 
     * @return Limit 翻页单页查询限制数量[0,1000], 默认值0
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 翻页单页查询限制数量[0,1000], 默认值0
     * @param Limit 翻页单页查询限制数量[0,1000], 默认值0
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 翻页单页偏移量，默认值0 
     * @return Offset 翻页单页偏移量，默认值0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 翻页单页偏移量，默认值0
     * @param Offset 翻页单页偏移量，默认值0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

