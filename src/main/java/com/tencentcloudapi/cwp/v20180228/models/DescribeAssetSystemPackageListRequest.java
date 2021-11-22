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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAssetSystemPackageListRequest extends AbstractModel{

    /**
    * 主机Uuid
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * 主机Quuid
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * 需要返回的数量，默认为10，最大值为100
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
    * 过滤条件。
<li>Name - String - 是否必填：否 - 包 名</li>
<li>StartTime - String - 是否必填：否 - 安装开始时间</li>
<li>EndTime - String - 是否必填：否 - 安装开始时间</li>
<li>Type - int - 是否必填：否 - 安装包类型：
1:rmp
2:dpkg
3:java
4:system</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 排序方式，asc-升序 或 desc-降序。默认：desc-降序
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * 排序方式可选：InstallTime 安装时间
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
     * Get 主机Uuid 
     * @return Uuid 主机Uuid
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set 主机Uuid
     * @param Uuid 主机Uuid
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get 主机Quuid 
     * @return Quuid 主机Quuid
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set 主机Quuid
     * @param Quuid 主机Quuid
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get 需要返回的数量，默认为10，最大值为100 
     * @return Limit 需要返回的数量，默认为10，最大值为100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 需要返回的数量，默认为10，最大值为100
     * @param Limit 需要返回的数量，默认为10，最大值为100
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
     * Get 过滤条件。
<li>Name - String - 是否必填：否 - 包 名</li>
<li>StartTime - String - 是否必填：否 - 安装开始时间</li>
<li>EndTime - String - 是否必填：否 - 安装开始时间</li>
<li>Type - int - 是否必填：否 - 安装包类型：
1:rmp
2:dpkg
3:java
4:system</li> 
     * @return Filters 过滤条件。
<li>Name - String - 是否必填：否 - 包 名</li>
<li>StartTime - String - 是否必填：否 - 安装开始时间</li>
<li>EndTime - String - 是否必填：否 - 安装开始时间</li>
<li>Type - int - 是否必填：否 - 安装包类型：
1:rmp
2:dpkg
3:java
4:system</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件。
<li>Name - String - 是否必填：否 - 包 名</li>
<li>StartTime - String - 是否必填：否 - 安装开始时间</li>
<li>EndTime - String - 是否必填：否 - 安装开始时间</li>
<li>Type - int - 是否必填：否 - 安装包类型：
1:rmp
2:dpkg
3:java
4:system</li>
     * @param Filters 过滤条件。
<li>Name - String - 是否必填：否 - 包 名</li>
<li>StartTime - String - 是否必填：否 - 安装开始时间</li>
<li>EndTime - String - 是否必填：否 - 安装开始时间</li>
<li>Type - int - 是否必填：否 - 安装包类型：
1:rmp
2:dpkg
3:java
4:system</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 排序方式，asc-升序 或 desc-降序。默认：desc-降序 
     * @return Order 排序方式，asc-升序 或 desc-降序。默认：desc-降序
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 排序方式，asc-升序 或 desc-降序。默认：desc-降序
     * @param Order 排序方式，asc-升序 或 desc-降序。默认：desc-降序
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get 排序方式可选：InstallTime 安装时间 
     * @return By 排序方式可选：InstallTime 安装时间
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set 排序方式可选：InstallTime 安装时间
     * @param By 排序方式可选：InstallTime 安装时间
     */
    public void setBy(String By) {
        this.By = By;
    }

    public DescribeAssetSystemPackageListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAssetSystemPackageListRequest(DescribeAssetSystemPackageListRequest source) {
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
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
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);

    }
}

