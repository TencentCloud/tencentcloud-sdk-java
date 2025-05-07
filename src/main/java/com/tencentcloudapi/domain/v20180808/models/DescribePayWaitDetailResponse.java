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

public class DescribePayWaitDetailResponse extends AbstractModel {

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 域名类型
pay：等待支持
sub：已经预订
wait：等待出价
finish：完成出价
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 支付结束时间 
格式:YYYY-MM-DD HH:mm:ss
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 域名注册时间 
格式:YYYY-MM-DD HH:mm:ss
    */
    @SerializedName("RegTime")
    @Expose
    private String RegTime;

    /**
    * 域名成交价格 单位元
    */
    @SerializedName("Price")
    @Expose
    private Float Price;

    /**
    * 待退还保证金 单位元
    */
    @SerializedName("RetDeposit")
    @Expose
    private Float RetDeposit;

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
     * Get 域名类型
pay：等待支持
sub：已经预订
wait：等待出价
finish：完成出价 
     * @return Status 域名类型
pay：等待支持
sub：已经预订
wait：等待出价
finish：完成出价
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 域名类型
pay：等待支持
sub：已经预订
wait：等待出价
finish：完成出价
     * @param Status 域名类型
pay：等待支持
sub：已经预订
wait：等待出价
finish：完成出价
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 支付结束时间 
格式:YYYY-MM-DD HH:mm:ss 
     * @return EndTime 支付结束时间 
格式:YYYY-MM-DD HH:mm:ss
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 支付结束时间 
格式:YYYY-MM-DD HH:mm:ss
     * @param EndTime 支付结束时间 
格式:YYYY-MM-DD HH:mm:ss
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 域名注册时间 
格式:YYYY-MM-DD HH:mm:ss 
     * @return RegTime 域名注册时间 
格式:YYYY-MM-DD HH:mm:ss
     */
    public String getRegTime() {
        return this.RegTime;
    }

    /**
     * Set 域名注册时间 
格式:YYYY-MM-DD HH:mm:ss
     * @param RegTime 域名注册时间 
格式:YYYY-MM-DD HH:mm:ss
     */
    public void setRegTime(String RegTime) {
        this.RegTime = RegTime;
    }

    /**
     * Get 域名成交价格 单位元 
     * @return Price 域名成交价格 单位元
     */
    public Float getPrice() {
        return this.Price;
    }

    /**
     * Set 域名成交价格 单位元
     * @param Price 域名成交价格 单位元
     */
    public void setPrice(Float Price) {
        this.Price = Price;
    }

    /**
     * Get 待退还保证金 单位元 
     * @return RetDeposit 待退还保证金 单位元
     */
    public Float getRetDeposit() {
        return this.RetDeposit;
    }

    /**
     * Set 待退还保证金 单位元
     * @param RetDeposit 待退还保证金 单位元
     */
    public void setRetDeposit(Float RetDeposit) {
        this.RetDeposit = RetDeposit;
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

    public DescribePayWaitDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePayWaitDetailResponse(DescribePayWaitDetailResponse source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.RegTime != null) {
            this.RegTime = new String(source.RegTime);
        }
        if (source.Price != null) {
            this.Price = new Float(source.Price);
        }
        if (source.RetDeposit != null) {
            this.RetDeposit = new Float(source.RetDeposit);
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
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "RegTime", this.RegTime);
        this.setParamSimple(map, prefix + "Price", this.Price);
        this.setParamSimple(map, prefix + "RetDeposit", this.RetDeposit);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

