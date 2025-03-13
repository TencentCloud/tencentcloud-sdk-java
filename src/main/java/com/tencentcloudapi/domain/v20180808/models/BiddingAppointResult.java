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
package com.tencentcloudapi.domain.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BiddingAppointResult extends AbstractModel {

    /**
    * business_id
    */
    @SerializedName("BusinessID")
    @Expose
    private String BusinessID;

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 预定价格
    */
    @SerializedName("AppointPrice")
    @Expose
    private Long AppointPrice;

    /**
    * 预约保证金
    */
    @SerializedName("AppointBondPrice")
    @Expose
    private Long AppointBondPrice;

    /**
    * 预约结束时间
    */
    @SerializedName("AppointEndTime")
    @Expose
    private String AppointEndTime;

    /**
    * 预约人数
    */
    @SerializedName("AppointNum")
    @Expose
    private Long AppointNum;

    /**
    * 1 已预约，2 竞价中，3 等待出价 4 竞价失败 5 等待支付 6 等待转移，7 转移中 8 交易成功 9 预约持有者赎回 10 竞价持有者赎回 11 其他阶段持有者赎回 12 违约
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get business_id 
     * @return BusinessID business_id
     */
    public String getBusinessID() {
        return this.BusinessID;
    }

    /**
     * Set business_id
     * @param BusinessID business_id
     */
    public void setBusinessID(String BusinessID) {
        this.BusinessID = BusinessID;
    }

    /**
     * Get 域名 
     * @return Domain 域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名
     * @param Domain 域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 预定价格 
     * @return AppointPrice 预定价格
     */
    public Long getAppointPrice() {
        return this.AppointPrice;
    }

    /**
     * Set 预定价格
     * @param AppointPrice 预定价格
     */
    public void setAppointPrice(Long AppointPrice) {
        this.AppointPrice = AppointPrice;
    }

    /**
     * Get 预约保证金 
     * @return AppointBondPrice 预约保证金
     */
    public Long getAppointBondPrice() {
        return this.AppointBondPrice;
    }

    /**
     * Set 预约保证金
     * @param AppointBondPrice 预约保证金
     */
    public void setAppointBondPrice(Long AppointBondPrice) {
        this.AppointBondPrice = AppointBondPrice;
    }

    /**
     * Get 预约结束时间 
     * @return AppointEndTime 预约结束时间
     */
    public String getAppointEndTime() {
        return this.AppointEndTime;
    }

    /**
     * Set 预约结束时间
     * @param AppointEndTime 预约结束时间
     */
    public void setAppointEndTime(String AppointEndTime) {
        this.AppointEndTime = AppointEndTime;
    }

    /**
     * Get 预约人数 
     * @return AppointNum 预约人数
     */
    public Long getAppointNum() {
        return this.AppointNum;
    }

    /**
     * Set 预约人数
     * @param AppointNum 预约人数
     */
    public void setAppointNum(Long AppointNum) {
        this.AppointNum = AppointNum;
    }

    /**
     * Get 1 已预约，2 竞价中，3 等待出价 4 竞价失败 5 等待支付 6 等待转移，7 转移中 8 交易成功 9 预约持有者赎回 10 竞价持有者赎回 11 其他阶段持有者赎回 12 违约 
     * @return Status 1 已预约，2 竞价中，3 等待出价 4 竞价失败 5 等待支付 6 等待转移，7 转移中 8 交易成功 9 预约持有者赎回 10 竞价持有者赎回 11 其他阶段持有者赎回 12 违约
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 1 已预约，2 竞价中，3 等待出价 4 竞价失败 5 等待支付 6 等待转移，7 转移中 8 交易成功 9 预约持有者赎回 10 竞价持有者赎回 11 其他阶段持有者赎回 12 违约
     * @param Status 1 已预约，2 竞价中，3 等待出价 4 竞价失败 5 等待支付 6 等待转移，7 转移中 8 交易成功 9 预约持有者赎回 10 竞价持有者赎回 11 其他阶段持有者赎回 12 违约
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public BiddingAppointResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BiddingAppointResult(BiddingAppointResult source) {
        if (source.BusinessID != null) {
            this.BusinessID = new String(source.BusinessID);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.AppointPrice != null) {
            this.AppointPrice = new Long(source.AppointPrice);
        }
        if (source.AppointBondPrice != null) {
            this.AppointBondPrice = new Long(source.AppointBondPrice);
        }
        if (source.AppointEndTime != null) {
            this.AppointEndTime = new String(source.AppointEndTime);
        }
        if (source.AppointNum != null) {
            this.AppointNum = new Long(source.AppointNum);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BusinessID", this.BusinessID);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "AppointPrice", this.AppointPrice);
        this.setParamSimple(map, prefix + "AppointBondPrice", this.AppointBondPrice);
        this.setParamSimple(map, prefix + "AppointEndTime", this.AppointEndTime);
        this.setParamSimple(map, prefix + "AppointNum", this.AppointNum);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

