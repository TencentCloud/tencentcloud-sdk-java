/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLLMKeywordLibraryRequest extends AbstractModel {

    /**
    * 词库类型筛选
枚举值：
custom：自定义黑库
builtin：内置词库
all：全部词库
white：自定义白库
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 分页偏移量
取值范围：[0, +∞)
默认值：0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 每页返回数量
取值范围：[1, 1000]
默认值：10
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 排序字段
枚举值：
UpdateTime：按更新时间排序
CreateTime：按创建时间排序
Name：按名称排序
默认值：UpdateTime
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
    * 排序方向
枚举值：
ASC：升序
DESC：降序
默认值：DESC
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
     * Get 词库类型筛选
枚举值：
custom：自定义黑库
builtin：内置词库
all：全部词库
white：自定义白库 
     * @return Type 词库类型筛选
枚举值：
custom：自定义黑库
builtin：内置词库
all：全部词库
white：自定义白库
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 词库类型筛选
枚举值：
custom：自定义黑库
builtin：内置词库
all：全部词库
white：自定义白库
     * @param Type 词库类型筛选
枚举值：
custom：自定义黑库
builtin：内置词库
all：全部词库
white：自定义白库
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 分页偏移量
取值范围：[0, +∞)
默认值：0 
     * @return Offset 分页偏移量
取值范围：[0, +∞)
默认值：0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移量
取值范围：[0, +∞)
默认值：0
     * @param Offset 分页偏移量
取值范围：[0, +∞)
默认值：0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 每页返回数量
取值范围：[1, 1000]
默认值：10 
     * @return Limit 每页返回数量
取值范围：[1, 1000]
默认值：10
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页返回数量
取值范围：[1, 1000]
默认值：10
     * @param Limit 每页返回数量
取值范围：[1, 1000]
默认值：10
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 排序字段
枚举值：
UpdateTime：按更新时间排序
CreateTime：按创建时间排序
Name：按名称排序
默认值：UpdateTime 
     * @return By 排序字段
枚举值：
UpdateTime：按更新时间排序
CreateTime：按创建时间排序
Name：按名称排序
默认值：UpdateTime
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set 排序字段
枚举值：
UpdateTime：按更新时间排序
CreateTime：按创建时间排序
Name：按名称排序
默认值：UpdateTime
     * @param By 排序字段
枚举值：
UpdateTime：按更新时间排序
CreateTime：按创建时间排序
Name：按名称排序
默认值：UpdateTime
     */
    public void setBy(String By) {
        this.By = By;
    }

    /**
     * Get 排序方向
枚举值：
ASC：升序
DESC：降序
默认值：DESC 
     * @return Order 排序方向
枚举值：
ASC：升序
DESC：降序
默认值：DESC
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 排序方向
枚举值：
ASC：升序
DESC：降序
默认值：DESC
     * @param Order 排序方向
枚举值：
ASC：升序
DESC：降序
默认值：DESC
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    public DescribeLLMKeywordLibraryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLLMKeywordLibraryRequest(DescribeLLMKeywordLibraryRequest source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.By != null) {
            this.By = new String(source.By);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "By", this.By);
        this.setParamSimple(map, prefix + "Order", this.Order);

    }
}

