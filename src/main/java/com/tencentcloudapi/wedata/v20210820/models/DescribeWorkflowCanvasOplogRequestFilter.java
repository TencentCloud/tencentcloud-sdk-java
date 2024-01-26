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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeWorkflowCanvasOplogRequestFilter extends AbstractModel {

    /**
    * 开始时间，时间戳，精确到秒
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 开始时间，时间戳，精确到秒
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 排序类型，asc 或者 desc，不填默认为 asc
    */
    @SerializedName("OrderType")
    @Expose
    private String OrderType;

    /**
    * 操作人ID，用来过滤
    */
    @SerializedName("OperatorIds")
    @Expose
    private Long [] OperatorIds;

    /**
     * Get 开始时间，时间戳，精确到秒 
     * @return StartTime 开始时间，时间戳，精确到秒
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间，时间戳，精确到秒
     * @param StartTime 开始时间，时间戳，精确到秒
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 开始时间，时间戳，精确到秒 
     * @return EndTime 开始时间，时间戳，精确到秒
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 开始时间，时间戳，精确到秒
     * @param EndTime 开始时间，时间戳，精确到秒
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 排序类型，asc 或者 desc，不填默认为 asc 
     * @return OrderType 排序类型，asc 或者 desc，不填默认为 asc
     */
    public String getOrderType() {
        return this.OrderType;
    }

    /**
     * Set 排序类型，asc 或者 desc，不填默认为 asc
     * @param OrderType 排序类型，asc 或者 desc，不填默认为 asc
     */
    public void setOrderType(String OrderType) {
        this.OrderType = OrderType;
    }

    /**
     * Get 操作人ID，用来过滤 
     * @return OperatorIds 操作人ID，用来过滤
     */
    public Long [] getOperatorIds() {
        return this.OperatorIds;
    }

    /**
     * Set 操作人ID，用来过滤
     * @param OperatorIds 操作人ID，用来过滤
     */
    public void setOperatorIds(Long [] OperatorIds) {
        this.OperatorIds = OperatorIds;
    }

    public DescribeWorkflowCanvasOplogRequestFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeWorkflowCanvasOplogRequestFilter(DescribeWorkflowCanvasOplogRequestFilter source) {
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.OrderType != null) {
            this.OrderType = new String(source.OrderType);
        }
        if (source.OperatorIds != null) {
            this.OperatorIds = new Long[source.OperatorIds.length];
            for (int i = 0; i < source.OperatorIds.length; i++) {
                this.OperatorIds[i] = new Long(source.OperatorIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);
        this.setParamArraySimple(map, prefix + "OperatorIds.", this.OperatorIds);

    }
}

