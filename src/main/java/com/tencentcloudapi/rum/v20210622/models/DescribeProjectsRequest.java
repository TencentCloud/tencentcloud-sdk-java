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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProjectsRequest extends AbstractModel{

    /**
    * 分页每页数目，整型
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页页码，整型
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 过滤参数；demo模式传{"Name": "IsDemo", "Values":["1"]}
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 该参数已废弃，demo模式请在Filters内注明
    */
    @SerializedName("IsDemo")
    @Expose
    private Long IsDemo;

    /**
     * Get 分页每页数目，整型 
     * @return Limit 分页每页数目，整型
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页每页数目，整型
     * @param Limit 分页每页数目，整型
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页页码，整型 
     * @return Offset 分页页码，整型
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页页码，整型
     * @param Offset 分页页码，整型
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 过滤参数；demo模式传{"Name": "IsDemo", "Values":["1"]} 
     * @return Filters 过滤参数；demo模式传{"Name": "IsDemo", "Values":["1"]}
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤参数；demo模式传{"Name": "IsDemo", "Values":["1"]}
     * @param Filters 过滤参数；demo模式传{"Name": "IsDemo", "Values":["1"]}
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 该参数已废弃，demo模式请在Filters内注明 
     * @return IsDemo 该参数已废弃，demo模式请在Filters内注明
     */
    public Long getIsDemo() {
        return this.IsDemo;
    }

    /**
     * Set 该参数已废弃，demo模式请在Filters内注明
     * @param IsDemo 该参数已废弃，demo模式请在Filters内注明
     */
    public void setIsDemo(Long IsDemo) {
        this.IsDemo = IsDemo;
    }

    public DescribeProjectsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeProjectsRequest(DescribeProjectsRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.IsDemo != null) {
            this.IsDemo = new Long(source.IsDemo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "IsDemo", this.IsDemo);

    }
}

