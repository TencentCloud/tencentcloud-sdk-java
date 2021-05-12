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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListAsyncEventsRequest extends AbstractModel{

    /**
    * 函数名称
    */
    @SerializedName("FunctionName")
    @Expose
    private String FunctionName;

    /**
    * 命名空间
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 过滤条件，函数版本
    */
    @SerializedName("Qualifier")
    @Expose
    private String Qualifier;

    /**
    * 过滤条件，调用类型列表
    */
    @SerializedName("InvokeType")
    @Expose
    private String [] InvokeType;

    /**
    * 过滤条件，事件状态列表
    */
    @SerializedName("Status")
    @Expose
    private String [] Status;

    /**
    * 过滤条件，开始执行时间左闭右开区间
    */
    @SerializedName("StartTimeInterval")
    @Expose
    private TimeInterval StartTimeInterval;

    /**
    * 过滤条件，结束执行时间左闭右开区间
    */
    @SerializedName("EndTimeInterval")
    @Expose
    private TimeInterval EndTimeInterval;

    /**
    * 可选值 ASC 和 DESC，默认 DESC
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * 可选值 StartTime 和 EndTime，默认值 StartTime
    */
    @SerializedName("Orderby")
    @Expose
    private String Orderby;

    /**
    * 数据偏移量，默认值为 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回数据长度，默认值为 20，最大值 100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 过滤条件，事件调用请求id
    */
    @SerializedName("InvokeRequestId")
    @Expose
    private String InvokeRequestId;

    /**
     * Get 函数名称 
     * @return FunctionName 函数名称
     */
    public String getFunctionName() {
        return this.FunctionName;
    }

    /**
     * Set 函数名称
     * @param FunctionName 函数名称
     */
    public void setFunctionName(String FunctionName) {
        this.FunctionName = FunctionName;
    }

    /**
     * Get 命名空间 
     * @return Namespace 命名空间
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 命名空间
     * @param Namespace 命名空间
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 过滤条件，函数版本 
     * @return Qualifier 过滤条件，函数版本
     */
    public String getQualifier() {
        return this.Qualifier;
    }

    /**
     * Set 过滤条件，函数版本
     * @param Qualifier 过滤条件，函数版本
     */
    public void setQualifier(String Qualifier) {
        this.Qualifier = Qualifier;
    }

    /**
     * Get 过滤条件，调用类型列表 
     * @return InvokeType 过滤条件，调用类型列表
     */
    public String [] getInvokeType() {
        return this.InvokeType;
    }

    /**
     * Set 过滤条件，调用类型列表
     * @param InvokeType 过滤条件，调用类型列表
     */
    public void setInvokeType(String [] InvokeType) {
        this.InvokeType = InvokeType;
    }

    /**
     * Get 过滤条件，事件状态列表 
     * @return Status 过滤条件，事件状态列表
     */
    public String [] getStatus() {
        return this.Status;
    }

    /**
     * Set 过滤条件，事件状态列表
     * @param Status 过滤条件，事件状态列表
     */
    public void setStatus(String [] Status) {
        this.Status = Status;
    }

    /**
     * Get 过滤条件，开始执行时间左闭右开区间 
     * @return StartTimeInterval 过滤条件，开始执行时间左闭右开区间
     */
    public TimeInterval getStartTimeInterval() {
        return this.StartTimeInterval;
    }

    /**
     * Set 过滤条件，开始执行时间左闭右开区间
     * @param StartTimeInterval 过滤条件，开始执行时间左闭右开区间
     */
    public void setStartTimeInterval(TimeInterval StartTimeInterval) {
        this.StartTimeInterval = StartTimeInterval;
    }

    /**
     * Get 过滤条件，结束执行时间左闭右开区间 
     * @return EndTimeInterval 过滤条件，结束执行时间左闭右开区间
     */
    public TimeInterval getEndTimeInterval() {
        return this.EndTimeInterval;
    }

    /**
     * Set 过滤条件，结束执行时间左闭右开区间
     * @param EndTimeInterval 过滤条件，结束执行时间左闭右开区间
     */
    public void setEndTimeInterval(TimeInterval EndTimeInterval) {
        this.EndTimeInterval = EndTimeInterval;
    }

    /**
     * Get 可选值 ASC 和 DESC，默认 DESC 
     * @return Order 可选值 ASC 和 DESC，默认 DESC
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 可选值 ASC 和 DESC，默认 DESC
     * @param Order 可选值 ASC 和 DESC，默认 DESC
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get 可选值 StartTime 和 EndTime，默认值 StartTime 
     * @return Orderby 可选值 StartTime 和 EndTime，默认值 StartTime
     */
    public String getOrderby() {
        return this.Orderby;
    }

    /**
     * Set 可选值 StartTime 和 EndTime，默认值 StartTime
     * @param Orderby 可选值 StartTime 和 EndTime，默认值 StartTime
     */
    public void setOrderby(String Orderby) {
        this.Orderby = Orderby;
    }

    /**
     * Get 数据偏移量，默认值为 0 
     * @return Offset 数据偏移量，默认值为 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 数据偏移量，默认值为 0
     * @param Offset 数据偏移量，默认值为 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回数据长度，默认值为 20，最大值 100 
     * @return Limit 返回数据长度，默认值为 20，最大值 100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数据长度，默认值为 20，最大值 100
     * @param Limit 返回数据长度，默认值为 20，最大值 100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 过滤条件，事件调用请求id 
     * @return InvokeRequestId 过滤条件，事件调用请求id
     */
    public String getInvokeRequestId() {
        return this.InvokeRequestId;
    }

    /**
     * Set 过滤条件，事件调用请求id
     * @param InvokeRequestId 过滤条件，事件调用请求id
     */
    public void setInvokeRequestId(String InvokeRequestId) {
        this.InvokeRequestId = InvokeRequestId;
    }

    public ListAsyncEventsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListAsyncEventsRequest(ListAsyncEventsRequest source) {
        if (source.FunctionName != null) {
            this.FunctionName = new String(source.FunctionName);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.Qualifier != null) {
            this.Qualifier = new String(source.Qualifier);
        }
        if (source.InvokeType != null) {
            this.InvokeType = new String[source.InvokeType.length];
            for (int i = 0; i < source.InvokeType.length; i++) {
                this.InvokeType[i] = new String(source.InvokeType[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String[source.Status.length];
            for (int i = 0; i < source.Status.length; i++) {
                this.Status[i] = new String(source.Status[i]);
            }
        }
        if (source.StartTimeInterval != null) {
            this.StartTimeInterval = new TimeInterval(source.StartTimeInterval);
        }
        if (source.EndTimeInterval != null) {
            this.EndTimeInterval = new TimeInterval(source.EndTimeInterval);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.Orderby != null) {
            this.Orderby = new String(source.Orderby);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.InvokeRequestId != null) {
            this.InvokeRequestId = new String(source.InvokeRequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FunctionName", this.FunctionName);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "Qualifier", this.Qualifier);
        this.setParamArraySimple(map, prefix + "InvokeType.", this.InvokeType);
        this.setParamArraySimple(map, prefix + "Status.", this.Status);
        this.setParamObj(map, prefix + "StartTimeInterval.", this.StartTimeInterval);
        this.setParamObj(map, prefix + "EndTimeInterval.", this.EndTimeInterval);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "Orderby", this.Orderby);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "InvokeRequestId", this.InvokeRequestId);

    }
}

