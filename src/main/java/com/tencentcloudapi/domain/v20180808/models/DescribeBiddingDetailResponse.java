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

public class DescribeBiddingDetailResponse extends AbstractModel {

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 出价次数
    */
    @SerializedName("BiddingNum")
    @Expose
    private Long BiddingNum;

    /**
    * 竞价开始时间
    */
    @SerializedName("BiddingStartTime")
    @Expose
    private String BiddingStartTime;

    /**
    * 竞价结束时间
    */
    @SerializedName("BiddingEndTime")
    @Expose
    private String BiddingEndTime;

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
    @SerializedName("CurrentPrice")
    @Expose
    private Long CurrentPrice;

    /**
    * 当前用户昵称
    */
    @SerializedName("CurrentNickname")
    @Expose
    private String CurrentNickname;

    /**
    * 竞价保证金 单位元
    */
    @SerializedName("BiddingBondPrice")
    @Expose
    private Long BiddingBondPrice;

    /**
    * 2 竞价中  3 等待出价 4 竞价失败 10 竞价持有者赎回
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 竞价标识，1 领先，2 落后
    */
    @SerializedName("BiddingFlag")
    @Expose
    private Long BiddingFlag;

    /**
    * 是否退款，yes表示退款，no表示不退款
    */
    @SerializedName("BiddingBondRefund")
    @Expose
    private String BiddingBondRefund;

    /**
    * 我的出价 单位元
    */
    @SerializedName("BiddingPrice")
    @Expose
    private Long BiddingPrice;

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
     * Get 出价次数 
     * @return BiddingNum 出价次数
     */
    public Long getBiddingNum() {
        return this.BiddingNum;
    }

    /**
     * Set 出价次数
     * @param BiddingNum 出价次数
     */
    public void setBiddingNum(Long BiddingNum) {
        this.BiddingNum = BiddingNum;
    }

    /**
     * Get 竞价开始时间 
     * @return BiddingStartTime 竞价开始时间
     */
    public String getBiddingStartTime() {
        return this.BiddingStartTime;
    }

    /**
     * Set 竞价开始时间
     * @param BiddingStartTime 竞价开始时间
     */
    public void setBiddingStartTime(String BiddingStartTime) {
        this.BiddingStartTime = BiddingStartTime;
    }

    /**
     * Get 竞价结束时间 
     * @return BiddingEndTime 竞价结束时间
     */
    public String getBiddingEndTime() {
        return this.BiddingEndTime;
    }

    /**
     * Set 竞价结束时间
     * @param BiddingEndTime 竞价结束时间
     */
    public void setBiddingEndTime(String BiddingEndTime) {
        this.BiddingEndTime = BiddingEndTime;
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
     * @return CurrentPrice 当前价格 单位元
     */
    public Long getCurrentPrice() {
        return this.CurrentPrice;
    }

    /**
     * Set 当前价格 单位元
     * @param CurrentPrice 当前价格 单位元
     */
    public void setCurrentPrice(Long CurrentPrice) {
        this.CurrentPrice = CurrentPrice;
    }

    /**
     * Get 当前用户昵称 
     * @return CurrentNickname 当前用户昵称
     */
    public String getCurrentNickname() {
        return this.CurrentNickname;
    }

    /**
     * Set 当前用户昵称
     * @param CurrentNickname 当前用户昵称
     */
    public void setCurrentNickname(String CurrentNickname) {
        this.CurrentNickname = CurrentNickname;
    }

    /**
     * Get 竞价保证金 单位元 
     * @return BiddingBondPrice 竞价保证金 单位元
     */
    public Long getBiddingBondPrice() {
        return this.BiddingBondPrice;
    }

    /**
     * Set 竞价保证金 单位元
     * @param BiddingBondPrice 竞价保证金 单位元
     */
    public void setBiddingBondPrice(Long BiddingBondPrice) {
        this.BiddingBondPrice = BiddingBondPrice;
    }

    /**
     * Get 2 竞价中  3 等待出价 4 竞价失败 10 竞价持有者赎回 
     * @return Status 2 竞价中  3 等待出价 4 竞价失败 10 竞价持有者赎回
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 2 竞价中  3 等待出价 4 竞价失败 10 竞价持有者赎回
     * @param Status 2 竞价中  3 等待出价 4 竞价失败 10 竞价持有者赎回
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 竞价标识，1 领先，2 落后 
     * @return BiddingFlag 竞价标识，1 领先，2 落后
     */
    public Long getBiddingFlag() {
        return this.BiddingFlag;
    }

    /**
     * Set 竞价标识，1 领先，2 落后
     * @param BiddingFlag 竞价标识，1 领先，2 落后
     */
    public void setBiddingFlag(Long BiddingFlag) {
        this.BiddingFlag = BiddingFlag;
    }

    /**
     * Get 是否退款，yes表示退款，no表示不退款 
     * @return BiddingBondRefund 是否退款，yes表示退款，no表示不退款
     */
    public String getBiddingBondRefund() {
        return this.BiddingBondRefund;
    }

    /**
     * Set 是否退款，yes表示退款，no表示不退款
     * @param BiddingBondRefund 是否退款，yes表示退款，no表示不退款
     */
    public void setBiddingBondRefund(String BiddingBondRefund) {
        this.BiddingBondRefund = BiddingBondRefund;
    }

    /**
     * Get 我的出价 单位元 
     * @return BiddingPrice 我的出价 单位元
     */
    public Long getBiddingPrice() {
        return this.BiddingPrice;
    }

    /**
     * Set 我的出价 单位元
     * @param BiddingPrice 我的出价 单位元
     */
    public void setBiddingPrice(Long BiddingPrice) {
        this.BiddingPrice = BiddingPrice;
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

    public DescribeBiddingDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBiddingDetailResponse(DescribeBiddingDetailResponse source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.BiddingNum != null) {
            this.BiddingNum = new Long(source.BiddingNum);
        }
        if (source.BiddingStartTime != null) {
            this.BiddingStartTime = new String(source.BiddingStartTime);
        }
        if (source.BiddingEndTime != null) {
            this.BiddingEndTime = new String(source.BiddingEndTime);
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
        if (source.CurrentPrice != null) {
            this.CurrentPrice = new Long(source.CurrentPrice);
        }
        if (source.CurrentNickname != null) {
            this.CurrentNickname = new String(source.CurrentNickname);
        }
        if (source.BiddingBondPrice != null) {
            this.BiddingBondPrice = new Long(source.BiddingBondPrice);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.BiddingFlag != null) {
            this.BiddingFlag = new Long(source.BiddingFlag);
        }
        if (source.BiddingBondRefund != null) {
            this.BiddingBondRefund = new String(source.BiddingBondRefund);
        }
        if (source.BiddingPrice != null) {
            this.BiddingPrice = new Long(source.BiddingPrice);
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
        this.setParamSimple(map, prefix + "BiddingNum", this.BiddingNum);
        this.setParamSimple(map, prefix + "BiddingStartTime", this.BiddingStartTime);
        this.setParamSimple(map, prefix + "BiddingEndTime", this.BiddingEndTime);
        this.setParamSimple(map, prefix + "RegTime", this.RegTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "DeleteTime", this.DeleteTime);
        this.setParamSimple(map, prefix + "CurrentPrice", this.CurrentPrice);
        this.setParamSimple(map, prefix + "CurrentNickname", this.CurrentNickname);
        this.setParamSimple(map, prefix + "BiddingBondPrice", this.BiddingBondPrice);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "BiddingFlag", this.BiddingFlag);
        this.setParamSimple(map, prefix + "BiddingBondRefund", this.BiddingBondRefund);
        this.setParamSimple(map, prefix + "BiddingPrice", this.BiddingPrice);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

