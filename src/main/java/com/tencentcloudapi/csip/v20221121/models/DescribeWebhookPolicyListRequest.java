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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeWebhookPolicyListRequest extends AbstractModel {

    /**
    * <p>分页偏移量<br>取值范围：[0, +∞)<br>默认值：0</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>每页返回数量<br>取值范围：[1, 200]<br>默认值：20</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>过滤条件<br>支持的过滤项：<br>Name：按策略名称模糊搜索<br>Status：启用状态，可选值：ON / OFF<br>ReceiveFormat：接收格式，可选值：TEXT / JSON<br>Module：通知项模块，可选值：Vul / Alert / AkSk / Agent / LogAnalysis<br>ReceiverID：关联的接收机器人 ID</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
    * <p>排序字段<br>枚举值：<br>InsertTime：创建时间<br>UpdateTime：更新时间<br>默认值：UpdateTime</p>
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * <p>排序方式<br>枚举值：<br>asc：升序<br>desc：降序<br>默认值：desc</p>
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
     * Get <p>分页偏移量<br>取值范围：[0, +∞)<br>默认值：0</p> 
     * @return Offset <p>分页偏移量<br>取值范围：[0, +∞)<br>默认值：0</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页偏移量<br>取值范围：[0, +∞)<br>默认值：0</p>
     * @param Offset <p>分页偏移量<br>取值范围：[0, +∞)<br>默认值：0</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>每页返回数量<br>取值范围：[1, 200]<br>默认值：20</p> 
     * @return Limit <p>每页返回数量<br>取值范围：[1, 200]<br>默认值：20</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>每页返回数量<br>取值范围：[1, 200]<br>默认值：20</p>
     * @param Limit <p>每页返回数量<br>取值范围：[1, 200]<br>默认值：20</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>过滤条件<br>支持的过滤项：<br>Name：按策略名称模糊搜索<br>Status：启用状态，可选值：ON / OFF<br>ReceiveFormat：接收格式，可选值：TEXT / JSON<br>Module：通知项模块，可选值：Vul / Alert / AkSk / Agent / LogAnalysis<br>ReceiverID：关联的接收机器人 ID</p> 
     * @return Filters <p>过滤条件<br>支持的过滤项：<br>Name：按策略名称模糊搜索<br>Status：启用状态，可选值：ON / OFF<br>ReceiveFormat：接收格式，可选值：TEXT / JSON<br>Module：通知项模块，可选值：Vul / Alert / AkSk / Agent / LogAnalysis<br>ReceiverID：关联的接收机器人 ID</p>
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>过滤条件<br>支持的过滤项：<br>Name：按策略名称模糊搜索<br>Status：启用状态，可选值：ON / OFF<br>ReceiveFormat：接收格式，可选值：TEXT / JSON<br>Module：通知项模块，可选值：Vul / Alert / AkSk / Agent / LogAnalysis<br>ReceiverID：关联的接收机器人 ID</p>
     * @param Filters <p>过滤条件<br>支持的过滤项：<br>Name：按策略名称模糊搜索<br>Status：启用状态，可选值：ON / OFF<br>ReceiveFormat：接收格式，可选值：TEXT / JSON<br>Module：通知项模块，可选值：Vul / Alert / AkSk / Agent / LogAnalysis<br>ReceiverID：关联的接收机器人 ID</p>
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>排序字段<br>枚举值：<br>InsertTime：创建时间<br>UpdateTime：更新时间<br>默认值：UpdateTime</p> 
     * @return Order <p>排序字段<br>枚举值：<br>InsertTime：创建时间<br>UpdateTime：更新时间<br>默认值：UpdateTime</p>
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set <p>排序字段<br>枚举值：<br>InsertTime：创建时间<br>UpdateTime：更新时间<br>默认值：UpdateTime</p>
     * @param Order <p>排序字段<br>枚举值：<br>InsertTime：创建时间<br>UpdateTime：更新时间<br>默认值：UpdateTime</p>
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get <p>排序方式<br>枚举值：<br>asc：升序<br>desc：降序<br>默认值：desc</p> 
     * @return By <p>排序方式<br>枚举值：<br>asc：升序<br>desc：降序<br>默认值：desc</p>
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set <p>排序方式<br>枚举值：<br>asc：升序<br>desc：降序<br>默认值：desc</p>
     * @param By <p>排序方式<br>枚举值：<br>asc：升序<br>desc：降序<br>默认值：desc</p>
     */
    public void setBy(String By) {
        this.By = By;
    }

    public DescribeWebhookPolicyListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeWebhookPolicyListRequest(DescribeWebhookPolicyListRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new Filters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filters(source.Filters[i]);
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
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);

    }
}

