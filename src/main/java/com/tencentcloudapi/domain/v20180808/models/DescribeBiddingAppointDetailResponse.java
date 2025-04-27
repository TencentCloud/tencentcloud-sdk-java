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

public class DescribeBiddingAppointDetailResponse extends AbstractModel {

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 预约人数
    */
    @SerializedName("AppointNum")
    @Expose
    private Long AppointNum;

    /**
    * 预约开始时间
    */
    @SerializedName("AppointStartTime")
    @Expose
    private String AppointStartTime;

    /**
    * 预约结束时间
    */
    @SerializedName("AppointEndTime")
    @Expose
    private String AppointEndTime;

    /**
    *  注册时间
    */
    @SerializedName("RegTime")
    @Expose
    private String RegTime;

    /**
    * 过期时间
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 删除时间
    */
    @SerializedName("DeleteTime")
    @Expose
    private String DeleteTime;

    /**
    * 当前价格 单位元
    */
    @SerializedName("AppointPrice")
    @Expose
    private Long AppointPrice;

    /**
    * 预约保证金 单位元
    */
    @SerializedName("AppointBondPrice")
    @Expose
    private Long AppointBondPrice;

    /**
    * 1 已预约，2 竞价中，3 等待出价 4 竞价失败 5 等待支付 6 等待转移，7 转移中 8 交易成功 9 预约持有者赎回 10 竞价持有者赎回 11 其他阶段持有者赎回 12 违约
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 预约保证金是否已经退回
yes：退回 no: 未退回
    */
    @SerializedName("BiddingBondRefund")
    @Expose
    private String BiddingBondRefund;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

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
     * Get 预约开始时间 
     * @return AppointStartTime 预约开始时间
     */
    public String getAppointStartTime() {
        return this.AppointStartTime;
    }

    /**
     * Set 预约开始时间
     * @param AppointStartTime 预约开始时间
     */
    public void setAppointStartTime(String AppointStartTime) {
        this.AppointStartTime = AppointStartTime;
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
     * Get  注册时间 
     * @return RegTime  注册时间
     */
    public String getRegTime() {
        return this.RegTime;
    }

    /**
     * Set  注册时间
     * @param RegTime  注册时间
     */
    public void setRegTime(String RegTime) {
        this.RegTime = RegTime;
    }

    /**
     * Get 过期时间 
     * @return ExpireTime 过期时间
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 过期时间
     * @param ExpireTime 过期时间
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 删除时间 
     * @return DeleteTime 删除时间
     */
    public String getDeleteTime() {
        return this.DeleteTime;
    }

    /**
     * Set 删除时间
     * @param DeleteTime 删除时间
     */
    public void setDeleteTime(String DeleteTime) {
        this.DeleteTime = DeleteTime;
    }

    /**
     * Get 当前价格 单位元 
     * @return AppointPrice 当前价格 单位元
     */
    public Long getAppointPrice() {
        return this.AppointPrice;
    }

    /**
     * Set 当前价格 单位元
     * @param AppointPrice 当前价格 单位元
     */
    public void setAppointPrice(Long AppointPrice) {
        this.AppointPrice = AppointPrice;
    }

    /**
     * Get 预约保证金 单位元 
     * @return AppointBondPrice 预约保证金 单位元
     */
    public Long getAppointBondPrice() {
        return this.AppointBondPrice;
    }

    /**
     * Set 预约保证金 单位元
     * @param AppointBondPrice 预约保证金 单位元
     */
    public void setAppointBondPrice(Long AppointBondPrice) {
        this.AppointBondPrice = AppointBondPrice;
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

    /**
     * Get 预约保证金是否已经退回
yes：退回 no: 未退回 
     * @return BiddingBondRefund 预约保证金是否已经退回
yes：退回 no: 未退回
     */
    public String getBiddingBondRefund() {
        return this.BiddingBondRefund;
    }

    /**
     * Set 预约保证金是否已经退回
yes：退回 no: 未退回
     * @param BiddingBondRefund 预约保证金是否已经退回
yes：退回 no: 未退回
     */
    public void setBiddingBondRefund(String BiddingBondRefund) {
        this.BiddingBondRefund = BiddingBondRefund;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeBiddingAppointDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBiddingAppointDetailResponse(DescribeBiddingAppointDetailResponse source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.AppointNum != null) {
            this.AppointNum = new Long(source.AppointNum);
        }
        if (source.AppointStartTime != null) {
            this.AppointStartTime = new String(source.AppointStartTime);
        }
        if (source.AppointEndTime != null) {
            this.AppointEndTime = new String(source.AppointEndTime);
        }
        if (source.RegTime != null) {
            this.RegTime = new String(source.RegTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.DeleteTime != null) {
            this.DeleteTime = new String(source.DeleteTime);
        }
        if (source.AppointPrice != null) {
            this.AppointPrice = new Long(source.AppointPrice);
        }
        if (source.AppointBondPrice != null) {
            this.AppointBondPrice = new Long(source.AppointBondPrice);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.BiddingBondRefund != null) {
            this.BiddingBondRefund = new String(source.BiddingBondRefund);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "AppointNum", this.AppointNum);
        this.setParamSimple(map, prefix + "AppointStartTime", this.AppointStartTime);
        this.setParamSimple(map, prefix + "AppointEndTime", this.AppointEndTime);
        this.setParamSimple(map, prefix + "RegTime", this.RegTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "DeleteTime", this.DeleteTime);
        this.setParamSimple(map, prefix + "AppointPrice", this.AppointPrice);
        this.setParamSimple(map, prefix + "AppointBondPrice", this.AppointBondPrice);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "BiddingBondRefund", this.BiddingBondRefund);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

