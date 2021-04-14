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
package com.tencentcloudapi.oceanus.v20190422.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeResourcesRequest extends AbstractModel{

    /**
    * 需要查询的资源ID数组
    */
    @SerializedName("ResourceIds")
    @Expose
    private String [] ResourceIds;

    /**
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 条数限制
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 查询资源配置列表， 如果不填写，返回该ResourceId下所有作业配置列表
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get 需要查询的资源ID数组 
     * @return ResourceIds 需要查询的资源ID数组
     */
    public String [] getResourceIds() {
        return this.ResourceIds;
    }

    /**
     * Set 需要查询的资源ID数组
     * @param ResourceIds 需要查询的资源ID数组
     */
    public void setResourceIds(String [] ResourceIds) {
        this.ResourceIds = ResourceIds;
    }

    /**
     * Get 偏移量 
     * @return Offset 偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量
     * @param Offset 偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 条数限制 
     * @return Limit 条数限制
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 条数限制
     * @param Limit 条数限制
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 查询资源配置列表， 如果不填写，返回该ResourceId下所有作业配置列表 
     * @return Filters 查询资源配置列表， 如果不填写，返回该ResourceId下所有作业配置列表
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 查询资源配置列表， 如果不填写，返回该ResourceId下所有作业配置列表
     * @param Filters 查询资源配置列表， 如果不填写，返回该ResourceId下所有作业配置列表
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ResourceIds.", this.ResourceIds);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

