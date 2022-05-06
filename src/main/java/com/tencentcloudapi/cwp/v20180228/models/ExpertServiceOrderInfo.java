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

public class ExpertServiceOrderInfo extends AbstractModel{

    /**
    * 订单id
    */
    @SerializedName("OrderId")
    @Expose
    private Long OrderId;

    /**
    * 订单类型 1应急 2 旗舰重保 3 安全管家
    */
    @SerializedName("InquireType")
    @Expose
    private Long InquireType;

    /**
    * 服务数量
    */
    @SerializedName("InquireNum")
    @Expose
    private Long InquireNum;

    /**
    * 服务开始时间
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * 服务结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 服务时长几个月
    */
    @SerializedName("ServiceTime")
    @Expose
    private Long ServiceTime;

    /**
    * 订单状态 0 未启动 1 服务中 2已过期 3完成，4退费销毁
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get 订单id 
     * @return OrderId 订单id
     */
    public Long getOrderId() {
        return this.OrderId;
    }

    /**
     * Set 订单id
     * @param OrderId 订单id
     */
    public void setOrderId(Long OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * Get 订单类型 1应急 2 旗舰重保 3 安全管家 
     * @return InquireType 订单类型 1应急 2 旗舰重保 3 安全管家
     */
    public Long getInquireType() {
        return this.InquireType;
    }

    /**
     * Set 订单类型 1应急 2 旗舰重保 3 安全管家
     * @param InquireType 订单类型 1应急 2 旗舰重保 3 安全管家
     */
    public void setInquireType(Long InquireType) {
        this.InquireType = InquireType;
    }

    /**
     * Get 服务数量 
     * @return InquireNum 服务数量
     */
    public Long getInquireNum() {
        return this.InquireNum;
    }

    /**
     * Set 服务数量
     * @param InquireNum 服务数量
     */
    public void setInquireNum(Long InquireNum) {
        this.InquireNum = InquireNum;
    }

    /**
     * Get 服务开始时间 
     * @return BeginTime 服务开始时间
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set 服务开始时间
     * @param BeginTime 服务开始时间
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get 服务结束时间 
     * @return EndTime 服务结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 服务结束时间
     * @param EndTime 服务结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 服务时长几个月 
     * @return ServiceTime 服务时长几个月
     */
    public Long getServiceTime() {
        return this.ServiceTime;
    }

    /**
     * Set 服务时长几个月
     * @param ServiceTime 服务时长几个月
     */
    public void setServiceTime(Long ServiceTime) {
        this.ServiceTime = ServiceTime;
    }

    /**
     * Get 订单状态 0 未启动 1 服务中 2已过期 3完成，4退费销毁 
     * @return Status 订单状态 0 未启动 1 服务中 2已过期 3完成，4退费销毁
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 订单状态 0 未启动 1 服务中 2已过期 3完成，4退费销毁
     * @param Status 订单状态 0 未启动 1 服务中 2已过期 3完成，4退费销毁
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public ExpertServiceOrderInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExpertServiceOrderInfo(ExpertServiceOrderInfo source) {
        if (source.OrderId != null) {
            this.OrderId = new Long(source.OrderId);
        }
        if (source.InquireType != null) {
            this.InquireType = new Long(source.InquireType);
        }
        if (source.InquireNum != null) {
            this.InquireNum = new Long(source.InquireNum);
        }
        if (source.BeginTime != null) {
            this.BeginTime = new String(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.ServiceTime != null) {
            this.ServiceTime = new Long(source.ServiceTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OrderId", this.OrderId);
        this.setParamSimple(map, prefix + "InquireType", this.InquireType);
        this.setParamSimple(map, prefix + "InquireNum", this.InquireNum);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "ServiceTime", this.ServiceTime);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

