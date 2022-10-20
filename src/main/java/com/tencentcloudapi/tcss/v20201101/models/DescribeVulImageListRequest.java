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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVulImageListRequest extends AbstractModel{

    /**
    * 漏洞PocID
    */
    @SerializedName("PocID")
    @Expose
    private String PocID;

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
<li>OnlyAffectedNewestImage- Bool- 是否必填：否 - 仅展示影响最新版本镜像的漏洞</li>
<li>ImageID- string - 是否必填：否 - 镜像ID</li>
<li>ImageName- String -是否必填: 否 - 镜像名称</li>
<li>HostIP- string -是否必填: 否 - 内网IP</li>
<li>PublicIP- string -是否必填: 否 - 外网IP</li>
<li>ComponentName- string -是否必填: 否 - 组件名称</li>
<li>ComponentVersion- string -是否必填: 否 - 组件版本</li>
<li>HostName- string -是否必填: 否 - 主机名称</li>
    */
    @SerializedName("Filters")
    @Expose
    private RunTimeFilters [] Filters;

    /**
    * 排序方式
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * 排序字段
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
     * Get 漏洞PocID 
     * @return PocID 漏洞PocID
     */
    public String getPocID() {
        return this.PocID;
    }

    /**
     * Set 漏洞PocID
     * @param PocID 漏洞PocID
     */
    public void setPocID(String PocID) {
        this.PocID = PocID;
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
<li>OnlyAffectedNewestImage- Bool- 是否必填：否 - 仅展示影响最新版本镜像的漏洞</li>
<li>ImageID- string - 是否必填：否 - 镜像ID</li>
<li>ImageName- String -是否必填: 否 - 镜像名称</li>
<li>HostIP- string -是否必填: 否 - 内网IP</li>
<li>PublicIP- string -是否必填: 否 - 外网IP</li>
<li>ComponentName- string -是否必填: 否 - 组件名称</li>
<li>ComponentVersion- string -是否必填: 否 - 组件版本</li>
<li>HostName- string -是否必填: 否 - 主机名称</li> 
     * @return Filters 过滤条件。
<li>OnlyAffectedNewestImage- Bool- 是否必填：否 - 仅展示影响最新版本镜像的漏洞</li>
<li>ImageID- string - 是否必填：否 - 镜像ID</li>
<li>ImageName- String -是否必填: 否 - 镜像名称</li>
<li>HostIP- string -是否必填: 否 - 内网IP</li>
<li>PublicIP- string -是否必填: 否 - 外网IP</li>
<li>ComponentName- string -是否必填: 否 - 组件名称</li>
<li>ComponentVersion- string -是否必填: 否 - 组件版本</li>
<li>HostName- string -是否必填: 否 - 主机名称</li>
     */
    public RunTimeFilters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件。
<li>OnlyAffectedNewestImage- Bool- 是否必填：否 - 仅展示影响最新版本镜像的漏洞</li>
<li>ImageID- string - 是否必填：否 - 镜像ID</li>
<li>ImageName- String -是否必填: 否 - 镜像名称</li>
<li>HostIP- string -是否必填: 否 - 内网IP</li>
<li>PublicIP- string -是否必填: 否 - 外网IP</li>
<li>ComponentName- string -是否必填: 否 - 组件名称</li>
<li>ComponentVersion- string -是否必填: 否 - 组件版本</li>
<li>HostName- string -是否必填: 否 - 主机名称</li>
     * @param Filters 过滤条件。
<li>OnlyAffectedNewestImage- Bool- 是否必填：否 - 仅展示影响最新版本镜像的漏洞</li>
<li>ImageID- string - 是否必填：否 - 镜像ID</li>
<li>ImageName- String -是否必填: 否 - 镜像名称</li>
<li>HostIP- string -是否必填: 否 - 内网IP</li>
<li>PublicIP- string -是否必填: 否 - 外网IP</li>
<li>ComponentName- string -是否必填: 否 - 组件名称</li>
<li>ComponentVersion- string -是否必填: 否 - 组件版本</li>
<li>HostName- string -是否必填: 否 - 主机名称</li>
     */
    public void setFilters(RunTimeFilters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 排序方式 
     * @return Order 排序方式
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 排序方式
     * @param Order 排序方式
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get 排序字段 
     * @return By 排序字段
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set 排序字段
     * @param By 排序字段
     */
    public void setBy(String By) {
        this.By = By;
    }

    public DescribeVulImageListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVulImageListRequest(DescribeVulImageListRequest source) {
        if (source.PocID != null) {
            this.PocID = new String(source.PocID);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Filters != null) {
            this.Filters = new RunTimeFilters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new RunTimeFilters(source.Filters[i]);
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
        this.setParamSimple(map, prefix + "PocID", this.PocID);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);

    }
}

