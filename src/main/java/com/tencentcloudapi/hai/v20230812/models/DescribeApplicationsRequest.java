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
package com.tencentcloudapi.hai.v20230812.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeApplicationsRequest extends AbstractModel {

    /**
    * 应用id列表
    */
    @SerializedName("ApplicationIds")
    @Expose
    private String [] ApplicationIds;

    /**
    * 过滤器，跟ApplicationIds不能共用，支持的filter主要有：
application-id，精确匹配
scene-id，精确匹配
application-name，模糊匹配
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 偏移量，默认为0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回量，默认为20
MC：1000
用户：100

    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 应用id列表 
     * @return ApplicationIds 应用id列表
     */
    public String [] getApplicationIds() {
        return this.ApplicationIds;
    }

    /**
     * Set 应用id列表
     * @param ApplicationIds 应用id列表
     */
    public void setApplicationIds(String [] ApplicationIds) {
        this.ApplicationIds = ApplicationIds;
    }

    /**
     * Get 过滤器，跟ApplicationIds不能共用，支持的filter主要有：
application-id，精确匹配
scene-id，精确匹配
application-name，模糊匹配 
     * @return Filters 过滤器，跟ApplicationIds不能共用，支持的filter主要有：
application-id，精确匹配
scene-id，精确匹配
application-name，模糊匹配
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤器，跟ApplicationIds不能共用，支持的filter主要有：
application-id，精确匹配
scene-id，精确匹配
application-name，模糊匹配
     * @param Filters 过滤器，跟ApplicationIds不能共用，支持的filter主要有：
application-id，精确匹配
scene-id，精确匹配
application-name，模糊匹配
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 偏移量，默认为0 
     * @return Offset 偏移量，默认为0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0
     * @param Offset 偏移量，默认为0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回量，默认为20
MC：1000
用户：100
 
     * @return Limit 返回量，默认为20
MC：1000
用户：100

     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回量，默认为20
MC：1000
用户：100

     * @param Limit 返回量，默认为20
MC：1000
用户：100

     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeApplicationsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeApplicationsRequest(DescribeApplicationsRequest source) {
        if (source.ApplicationIds != null) {
            this.ApplicationIds = new String[source.ApplicationIds.length];
            for (int i = 0; i < source.ApplicationIds.length; i++) {
                this.ApplicationIds[i] = new String(source.ApplicationIds[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ApplicationIds.", this.ApplicationIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

