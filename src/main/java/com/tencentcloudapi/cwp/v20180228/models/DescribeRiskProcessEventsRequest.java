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

public class DescribeRiskProcessEventsRequest extends AbstractModel {

    /**
    * 过滤条件。
<li>HostId - String - 是否必填：否 - 主机ID</li>
<li>IpOrName - String - 是否必填：否 - 主机IP或主机名</li>
<li>VirusName - String - 是否必填：否 - 病毒名</li>
<li>ProcessId - String - 是否必填：否 - 进程ID</li>
<li>FilePath - String - 是否必填：否 - 进程路径</li>
<li>BeginTime - String - 是否必填：否 - 进程启动时间-开始</li>
<li>EndTime - String - 是否必填：否 - 进程启动时间-结束</li>
<li>Status - String - 是否必填：否 - 状态筛选 0待处理；1查杀中；2已查杀；3已退出;4已信任</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

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
    * 排序方式 [ASC|DESC]
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * [StartTime:进程启动时间|DetectTime:最后检测时间]
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
     * Get 过滤条件。
<li>HostId - String - 是否必填：否 - 主机ID</li>
<li>IpOrName - String - 是否必填：否 - 主机IP或主机名</li>
<li>VirusName - String - 是否必填：否 - 病毒名</li>
<li>ProcessId - String - 是否必填：否 - 进程ID</li>
<li>FilePath - String - 是否必填：否 - 进程路径</li>
<li>BeginTime - String - 是否必填：否 - 进程启动时间-开始</li>
<li>EndTime - String - 是否必填：否 - 进程启动时间-结束</li>
<li>Status - String - 是否必填：否 - 状态筛选 0待处理；1查杀中；2已查杀；3已退出;4已信任</li> 
     * @return Filters 过滤条件。
<li>HostId - String - 是否必填：否 - 主机ID</li>
<li>IpOrName - String - 是否必填：否 - 主机IP或主机名</li>
<li>VirusName - String - 是否必填：否 - 病毒名</li>
<li>ProcessId - String - 是否必填：否 - 进程ID</li>
<li>FilePath - String - 是否必填：否 - 进程路径</li>
<li>BeginTime - String - 是否必填：否 - 进程启动时间-开始</li>
<li>EndTime - String - 是否必填：否 - 进程启动时间-结束</li>
<li>Status - String - 是否必填：否 - 状态筛选 0待处理；1查杀中；2已查杀；3已退出;4已信任</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件。
<li>HostId - String - 是否必填：否 - 主机ID</li>
<li>IpOrName - String - 是否必填：否 - 主机IP或主机名</li>
<li>VirusName - String - 是否必填：否 - 病毒名</li>
<li>ProcessId - String - 是否必填：否 - 进程ID</li>
<li>FilePath - String - 是否必填：否 - 进程路径</li>
<li>BeginTime - String - 是否必填：否 - 进程启动时间-开始</li>
<li>EndTime - String - 是否必填：否 - 进程启动时间-结束</li>
<li>Status - String - 是否必填：否 - 状态筛选 0待处理；1查杀中；2已查杀；3已退出;4已信任</li>
     * @param Filters 过滤条件。
<li>HostId - String - 是否必填：否 - 主机ID</li>
<li>IpOrName - String - 是否必填：否 - 主机IP或主机名</li>
<li>VirusName - String - 是否必填：否 - 病毒名</li>
<li>ProcessId - String - 是否必填：否 - 进程ID</li>
<li>FilePath - String - 是否必填：否 - 进程路径</li>
<li>BeginTime - String - 是否必填：否 - 进程启动时间-开始</li>
<li>EndTime - String - 是否必填：否 - 进程启动时间-结束</li>
<li>Status - String - 是否必填：否 - 状态筛选 0待处理；1查杀中；2已查杀；3已退出;4已信任</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
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
     * Get 排序方式 [ASC|DESC] 
     * @return Order 排序方式 [ASC|DESC]
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 排序方式 [ASC|DESC]
     * @param Order 排序方式 [ASC|DESC]
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get [StartTime:进程启动时间|DetectTime:最后检测时间] 
     * @return By [StartTime:进程启动时间|DetectTime:最后检测时间]
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set [StartTime:进程启动时间|DetectTime:最后检测时间]
     * @param By [StartTime:进程启动时间|DetectTime:最后检测时间]
     */
    public void setBy(String By) {
        this.By = By;
    }

    public DescribeRiskProcessEventsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRiskProcessEventsRequest(DescribeRiskProcessEventsRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
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
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);

    }
}

