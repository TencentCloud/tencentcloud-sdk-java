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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUserInfoResponse  extends AbstractModel{

    /**
    * 用户状态，取值：
<li>Normal：正常 ；</li>
<li> Closed：下线；</li>
<li> Arrearage：欠费停服。</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 用户付费类型，取值：
<li>DailyPayment：日结付费 ；</li>
<li>MonthlyPayment：月结付费。</li>
    */
    @SerializedName("PaymentType")
    @Expose
    private String PaymentType;

    /**
    * 是否是旧版视频处理用户，取值：
<li>0：否 ；</li>
<li>1：是。</li>
    */
    @SerializedName("OldMpsUser")
    @Expose
    private Long OldMpsUser;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取用户状态，取值：
<li>Normal：正常 ；</li>
<li> Closed：下线；</li>
<li> Arrearage：欠费停服。</li>
     * @return Status 用户状态，取值：
<li>Normal：正常 ；</li>
<li> Closed：下线；</li>
<li> Arrearage：欠费停服。</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * 设置用户状态，取值：
<li>Normal：正常 ；</li>
<li> Closed：下线；</li>
<li> Arrearage：欠费停服。</li>
     * @param Status 用户状态，取值：
<li>Normal：正常 ；</li>
<li> Closed：下线；</li>
<li> Arrearage：欠费停服。</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * 获取用户付费类型，取值：
<li>DailyPayment：日结付费 ；</li>
<li>MonthlyPayment：月结付费。</li>
     * @return PaymentType 用户付费类型，取值：
<li>DailyPayment：日结付费 ；</li>
<li>MonthlyPayment：月结付费。</li>
     */
    public String getPaymentType() {
        return this.PaymentType;
    }

    /**
     * 设置用户付费类型，取值：
<li>DailyPayment：日结付费 ；</li>
<li>MonthlyPayment：月结付费。</li>
     * @param PaymentType 用户付费类型，取值：
<li>DailyPayment：日结付费 ；</li>
<li>MonthlyPayment：月结付费。</li>
     */
    public void setPaymentType(String PaymentType) {
        this.PaymentType = PaymentType;
    }

    /**
     * 获取是否是旧版视频处理用户，取值：
<li>0：否 ；</li>
<li>1：是。</li>
     * @return OldMpsUser 是否是旧版视频处理用户，取值：
<li>0：否 ；</li>
<li>1：是。</li>
     */
    public Long getOldMpsUser() {
        return this.OldMpsUser;
    }

    /**
     * 设置是否是旧版视频处理用户，取值：
<li>0：否 ；</li>
<li>1：是。</li>
     * @param OldMpsUser 是否是旧版视频处理用户，取值：
<li>0：否 ；</li>
<li>1：是。</li>
     */
    public void setOldMpsUser(Long OldMpsUser) {
        this.OldMpsUser = OldMpsUser;
    }

    /**
     * 获取唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "PaymentType", this.PaymentType);
        this.setParamSimple(map, prefix + "OldMpsUser", this.OldMpsUser);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

