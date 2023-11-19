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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTagListRequest extends AbstractModel {

    /**
    * 数量，最大值为1000
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页偏移量，Offset=0表示第一页，如果Limit=100，则Offset=100表示第二页，Offset=200表示第三页，依次类推
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分账标签键，用作模糊搜索
    */
    @SerializedName("TagKey")
    @Expose
    private String TagKey;

    /**
    * 标签类型，枚举值：0普通标签，1分账标签，用作筛选，不传获取全部标签键
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 排序方式，枚举值：asc排升序，desc排降序
    */
    @SerializedName("OrderType")
    @Expose
    private String OrderType;

    /**
     * Get 数量，最大值为1000 
     * @return Limit 数量，最大值为1000
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 数量，最大值为1000
     * @param Limit 数量，最大值为1000
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页偏移量，Offset=0表示第一页，如果Limit=100，则Offset=100表示第二页，Offset=200表示第三页，依次类推 
     * @return Offset 分页偏移量，Offset=0表示第一页，如果Limit=100，则Offset=100表示第二页，Offset=200表示第三页，依次类推
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移量，Offset=0表示第一页，如果Limit=100，则Offset=100表示第二页，Offset=200表示第三页，依次类推
     * @param Offset 分页偏移量，Offset=0表示第一页，如果Limit=100，则Offset=100表示第二页，Offset=200表示第三页，依次类推
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分账标签键，用作模糊搜索 
     * @return TagKey 分账标签键，用作模糊搜索
     */
    public String getTagKey() {
        return this.TagKey;
    }

    /**
     * Set 分账标签键，用作模糊搜索
     * @param TagKey 分账标签键，用作模糊搜索
     */
    public void setTagKey(String TagKey) {
        this.TagKey = TagKey;
    }

    /**
     * Get 标签类型，枚举值：0普通标签，1分账标签，用作筛选，不传获取全部标签键 
     * @return Status 标签类型，枚举值：0普通标签，1分账标签，用作筛选，不传获取全部标签键
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 标签类型，枚举值：0普通标签，1分账标签，用作筛选，不传获取全部标签键
     * @param Status 标签类型，枚举值：0普通标签，1分账标签，用作筛选，不传获取全部标签键
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 排序方式，枚举值：asc排升序，desc排降序 
     * @return OrderType 排序方式，枚举值：asc排升序，desc排降序
     */
    public String getOrderType() {
        return this.OrderType;
    }

    /**
     * Set 排序方式，枚举值：asc排升序，desc排降序
     * @param OrderType 排序方式，枚举值：asc排升序，desc排降序
     */
    public void setOrderType(String OrderType) {
        this.OrderType = OrderType;
    }

    public DescribeTagListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTagListRequest(DescribeTagListRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.TagKey != null) {
            this.TagKey = new String(source.TagKey);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.OrderType != null) {
            this.OrderType = new String(source.OrderType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "TagKey", this.TagKey);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);

    }
}

