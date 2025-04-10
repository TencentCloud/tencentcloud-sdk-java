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

public class DescribeHostLoginListRequest extends AbstractModel {

    /**
    * 需要返回的数量，最大值为100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移量，默认为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 过滤条件。<li>Quuid - String - 是否必填：否 - 云服务器uuid</li><li>Uuid - String - 是否必填：否 - 主机安全唯一Uuid</li><li>MachineName - String - 是否必填：否 - 主机别名</li><li>Ip - String - 是否必填：否 - 主机ip</li><li>InstanceID - String - 是否必填：否 - 主机实例ID</li><li>SrcIp - String - 是否必填：否 - 来源ip筛选</li><li>UserName - String - 是否必填：否 - 用户名筛选</li><li>Status - string - 是否必填：否 - 状态筛选：2:待处理；5：已加白,14:已处理，15：已忽略</li><li>LoginTimeBegin - String - 是否必填：否 - 按照修改时间段筛选，开始时间</li><li>LoginTimeEnd - String - 是否必填：否 - 按照修改时间段筛选，结束时间</li><li>RiskLevel - string - 是否必填：否 - 状态筛选0:高危；1：可疑</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 排序方式：根据请求次数排序：asc-升序/desc-降序
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * 排序字段：LoginTime-发生时间
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
     * Get 需要返回的数量，最大值为100 
     * @return Limit 需要返回的数量，最大值为100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 需要返回的数量，最大值为100
     * @param Limit 需要返回的数量，最大值为100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
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
     * Get 过滤条件。<li>Quuid - String - 是否必填：否 - 云服务器uuid</li><li>Uuid - String - 是否必填：否 - 主机安全唯一Uuid</li><li>MachineName - String - 是否必填：否 - 主机别名</li><li>Ip - String - 是否必填：否 - 主机ip</li><li>InstanceID - String - 是否必填：否 - 主机实例ID</li><li>SrcIp - String - 是否必填：否 - 来源ip筛选</li><li>UserName - String - 是否必填：否 - 用户名筛选</li><li>Status - string - 是否必填：否 - 状态筛选：2:待处理；5：已加白,14:已处理，15：已忽略</li><li>LoginTimeBegin - String - 是否必填：否 - 按照修改时间段筛选，开始时间</li><li>LoginTimeEnd - String - 是否必填：否 - 按照修改时间段筛选，结束时间</li><li>RiskLevel - string - 是否必填：否 - 状态筛选0:高危；1：可疑</li> 
     * @return Filters 过滤条件。<li>Quuid - String - 是否必填：否 - 云服务器uuid</li><li>Uuid - String - 是否必填：否 - 主机安全唯一Uuid</li><li>MachineName - String - 是否必填：否 - 主机别名</li><li>Ip - String - 是否必填：否 - 主机ip</li><li>InstanceID - String - 是否必填：否 - 主机实例ID</li><li>SrcIp - String - 是否必填：否 - 来源ip筛选</li><li>UserName - String - 是否必填：否 - 用户名筛选</li><li>Status - string - 是否必填：否 - 状态筛选：2:待处理；5：已加白,14:已处理，15：已忽略</li><li>LoginTimeBegin - String - 是否必填：否 - 按照修改时间段筛选，开始时间</li><li>LoginTimeEnd - String - 是否必填：否 - 按照修改时间段筛选，结束时间</li><li>RiskLevel - string - 是否必填：否 - 状态筛选0:高危；1：可疑</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件。<li>Quuid - String - 是否必填：否 - 云服务器uuid</li><li>Uuid - String - 是否必填：否 - 主机安全唯一Uuid</li><li>MachineName - String - 是否必填：否 - 主机别名</li><li>Ip - String - 是否必填：否 - 主机ip</li><li>InstanceID - String - 是否必填：否 - 主机实例ID</li><li>SrcIp - String - 是否必填：否 - 来源ip筛选</li><li>UserName - String - 是否必填：否 - 用户名筛选</li><li>Status - string - 是否必填：否 - 状态筛选：2:待处理；5：已加白,14:已处理，15：已忽略</li><li>LoginTimeBegin - String - 是否必填：否 - 按照修改时间段筛选，开始时间</li><li>LoginTimeEnd - String - 是否必填：否 - 按照修改时间段筛选，结束时间</li><li>RiskLevel - string - 是否必填：否 - 状态筛选0:高危；1：可疑</li>
     * @param Filters 过滤条件。<li>Quuid - String - 是否必填：否 - 云服务器uuid</li><li>Uuid - String - 是否必填：否 - 主机安全唯一Uuid</li><li>MachineName - String - 是否必填：否 - 主机别名</li><li>Ip - String - 是否必填：否 - 主机ip</li><li>InstanceID - String - 是否必填：否 - 主机实例ID</li><li>SrcIp - String - 是否必填：否 - 来源ip筛选</li><li>UserName - String - 是否必填：否 - 用户名筛选</li><li>Status - string - 是否必填：否 - 状态筛选：2:待处理；5：已加白,14:已处理，15：已忽略</li><li>LoginTimeBegin - String - 是否必填：否 - 按照修改时间段筛选，开始时间</li><li>LoginTimeEnd - String - 是否必填：否 - 按照修改时间段筛选，结束时间</li><li>RiskLevel - string - 是否必填：否 - 状态筛选0:高危；1：可疑</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 排序方式：根据请求次数排序：asc-升序/desc-降序 
     * @return Order 排序方式：根据请求次数排序：asc-升序/desc-降序
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 排序方式：根据请求次数排序：asc-升序/desc-降序
     * @param Order 排序方式：根据请求次数排序：asc-升序/desc-降序
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get 排序字段：LoginTime-发生时间 
     * @return By 排序字段：LoginTime-发生时间
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set 排序字段：LoginTime-发生时间
     * @param By 排序字段：LoginTime-发生时间
     */
    public void setBy(String By) {
        this.By = By;
    }

    public DescribeHostLoginListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeHostLoginListRequest(DescribeHostLoginListRequest source) {
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
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);

    }
}

