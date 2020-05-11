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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProductListRequest extends AbstractModel{

    /**
    * 固定传值monitor
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * 排序方式：DESC/ASC（区分大小写），默认值DESC
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * 分页查询的偏移量，默认值0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页查询的每页数据量，默认值20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 固定传值monitor 
     * @return Module 固定传值monitor
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set 固定传值monitor
     * @param Module 固定传值monitor
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get 排序方式：DESC/ASC（区分大小写），默认值DESC 
     * @return Order 排序方式：DESC/ASC（区分大小写），默认值DESC
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 排序方式：DESC/ASC（区分大小写），默认值DESC
     * @param Order 排序方式：DESC/ASC（区分大小写），默认值DESC
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get 分页查询的偏移量，默认值0 
     * @return Offset 分页查询的偏移量，默认值0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页查询的偏移量，默认值0
     * @param Offset 分页查询的偏移量，默认值0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页查询的每页数据量，默认值20 
     * @return Limit 分页查询的每页数据量，默认值20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页查询的每页数据量，默认值20
     * @param Limit 分页查询的每页数据量，默认值20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

