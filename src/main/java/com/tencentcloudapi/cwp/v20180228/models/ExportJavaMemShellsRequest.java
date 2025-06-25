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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExportJavaMemShellsRequest extends AbstractModel {

    /**
    * 过滤条件：InstanceID、IP、

MachineName主机名模糊查询, Type，Status精确匹配，CreateBeginTime，CreateEndTime时间段
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 导出字段
    */
    @SerializedName("Where")
    @Expose
    private String [] Where;

    /**
    * 排序，大小写无关：asc 升序，desc降序
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * 排序列，严格相等：最近检测时间RecentFoundTime
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
     * Get 过滤条件：InstanceID、IP、

MachineName主机名模糊查询, Type，Status精确匹配，CreateBeginTime，CreateEndTime时间段 
     * @return Filters 过滤条件：InstanceID、IP、

MachineName主机名模糊查询, Type，Status精确匹配，CreateBeginTime，CreateEndTime时间段
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件：InstanceID、IP、

MachineName主机名模糊查询, Type，Status精确匹配，CreateBeginTime，CreateEndTime时间段
     * @param Filters 过滤条件：InstanceID、IP、

MachineName主机名模糊查询, Type，Status精确匹配，CreateBeginTime，CreateEndTime时间段
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 导出字段 
     * @return Where 导出字段
     */
    public String [] getWhere() {
        return this.Where;
    }

    /**
     * Set 导出字段
     * @param Where 导出字段
     */
    public void setWhere(String [] Where) {
        this.Where = Where;
    }

    /**
     * Get 排序，大小写无关：asc 升序，desc降序 
     * @return Order 排序，大小写无关：asc 升序，desc降序
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 排序，大小写无关：asc 升序，desc降序
     * @param Order 排序，大小写无关：asc 升序，desc降序
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get 排序列，严格相等：最近检测时间RecentFoundTime 
     * @return By 排序列，严格相等：最近检测时间RecentFoundTime
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set 排序列，严格相等：最近检测时间RecentFoundTime
     * @param By 排序列，严格相等：最近检测时间RecentFoundTime
     */
    public void setBy(String By) {
        this.By = By;
    }

    public ExportJavaMemShellsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExportJavaMemShellsRequest(ExportJavaMemShellsRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Where != null) {
            this.Where = new String[source.Where.length];
            for (int i = 0; i < source.Where.length; i++) {
                this.Where[i] = new String(source.Where[i]);
            }
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.By != null) {
            this.By = new String(source.By);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArraySimple(map, prefix + "Where.", this.Where);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);

    }
}

