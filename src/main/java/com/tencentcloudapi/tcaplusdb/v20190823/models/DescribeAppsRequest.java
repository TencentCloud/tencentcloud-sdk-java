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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAppsRequest  extends AbstractModel{

    /**
    * 指定查询的应用ID
    */
    @SerializedName("ApplicationIds")
    @Expose
    private String [] ApplicationIds;

    /**
    * 查询过滤条件
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 应用列表的大小，默认值20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * 获取指定查询的应用ID
     * @return ApplicationIds 指定查询的应用ID
     */
    public String [] getApplicationIds() {
        return this.ApplicationIds;
    }

    /**
     * 设置指定查询的应用ID
     * @param ApplicationIds 指定查询的应用ID
     */
    public void setApplicationIds(String [] ApplicationIds) {
        this.ApplicationIds = ApplicationIds;
    }

    /**
     * 获取查询过滤条件
     * @return Filters 查询过滤条件
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * 设置查询过滤条件
     * @param Filters 查询过滤条件
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * 获取偏移量
     * @return Offset 偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * 设置偏移量
     * @param Offset 偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * 获取应用列表的大小，默认值20
     * @return Limit 应用列表的大小，默认值20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * 设置应用列表的大小，默认值20
     * @param Limit 应用列表的大小，默认值20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ApplicationIds.", this.ApplicationIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

