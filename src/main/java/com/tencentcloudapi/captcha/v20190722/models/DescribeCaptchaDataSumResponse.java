/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.captcha.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCaptchaDataSumResponse extends AbstractModel {

    /**
    * 请求总量
    */
    @SerializedName("GetSum")
    @Expose
    private Long GetSum;

    /**
    * 请求验证成功量
    */
    @SerializedName("VfySuccSum")
    @Expose
    private Long VfySuccSum;

    /**
    * 请求验证量
    */
    @SerializedName("VfySum")
    @Expose
    private Long VfySum;

    /**
    * 拦截攻击量
    */
    @SerializedName("AttackSum")
    @Expose
    private Long AttackSum;

    /**
    * 返回信息
    */
    @SerializedName("CaptchaMsg")
    @Expose
    private String CaptchaMsg;

    /**
    * 成功返回0  其它失败
    */
    @SerializedName("CaptchaCode")
    @Expose
    private Long CaptchaCode;

    /**
    * 票据校验总量
    */
    @SerializedName("CheckTicketSum")
    @Expose
    private Long CheckTicketSum;

    /**
    * 票据验证通过量
    */
    @SerializedName("TicketThroughputSum")
    @Expose
    private Long TicketThroughputSum;

    /**
    * 票据验证拦截量
    */
    @SerializedName("TicketInterceptSum")
    @Expose
    private Long TicketInterceptSum;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 请求总量 
     * @return GetSum 请求总量
     */
    public Long getGetSum() {
        return this.GetSum;
    }

    /**
     * Set 请求总量
     * @param GetSum 请求总量
     */
    public void setGetSum(Long GetSum) {
        this.GetSum = GetSum;
    }

    /**
     * Get 请求验证成功量 
     * @return VfySuccSum 请求验证成功量
     */
    public Long getVfySuccSum() {
        return this.VfySuccSum;
    }

    /**
     * Set 请求验证成功量
     * @param VfySuccSum 请求验证成功量
     */
    public void setVfySuccSum(Long VfySuccSum) {
        this.VfySuccSum = VfySuccSum;
    }

    /**
     * Get 请求验证量 
     * @return VfySum 请求验证量
     */
    public Long getVfySum() {
        return this.VfySum;
    }

    /**
     * Set 请求验证量
     * @param VfySum 请求验证量
     */
    public void setVfySum(Long VfySum) {
        this.VfySum = VfySum;
    }

    /**
     * Get 拦截攻击量 
     * @return AttackSum 拦截攻击量
     */
    public Long getAttackSum() {
        return this.AttackSum;
    }

    /**
     * Set 拦截攻击量
     * @param AttackSum 拦截攻击量
     */
    public void setAttackSum(Long AttackSum) {
        this.AttackSum = AttackSum;
    }

    /**
     * Get 返回信息 
     * @return CaptchaMsg 返回信息
     */
    public String getCaptchaMsg() {
        return this.CaptchaMsg;
    }

    /**
     * Set 返回信息
     * @param CaptchaMsg 返回信息
     */
    public void setCaptchaMsg(String CaptchaMsg) {
        this.CaptchaMsg = CaptchaMsg;
    }

    /**
     * Get 成功返回0  其它失败 
     * @return CaptchaCode 成功返回0  其它失败
     */
    public Long getCaptchaCode() {
        return this.CaptchaCode;
    }

    /**
     * Set 成功返回0  其它失败
     * @param CaptchaCode 成功返回0  其它失败
     */
    public void setCaptchaCode(Long CaptchaCode) {
        this.CaptchaCode = CaptchaCode;
    }

    /**
     * Get 票据校验总量 
     * @return CheckTicketSum 票据校验总量
     */
    public Long getCheckTicketSum() {
        return this.CheckTicketSum;
    }

    /**
     * Set 票据校验总量
     * @param CheckTicketSum 票据校验总量
     */
    public void setCheckTicketSum(Long CheckTicketSum) {
        this.CheckTicketSum = CheckTicketSum;
    }

    /**
     * Get 票据验证通过量 
     * @return TicketThroughputSum 票据验证通过量
     */
    public Long getTicketThroughputSum() {
        return this.TicketThroughputSum;
    }

    /**
     * Set 票据验证通过量
     * @param TicketThroughputSum 票据验证通过量
     */
    public void setTicketThroughputSum(Long TicketThroughputSum) {
        this.TicketThroughputSum = TicketThroughputSum;
    }

    /**
     * Get 票据验证拦截量 
     * @return TicketInterceptSum 票据验证拦截量
     */
    public Long getTicketInterceptSum() {
        return this.TicketInterceptSum;
    }

    /**
     * Set 票据验证拦截量
     * @param TicketInterceptSum 票据验证拦截量
     */
    public void setTicketInterceptSum(Long TicketInterceptSum) {
        this.TicketInterceptSum = TicketInterceptSum;
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

    public DescribeCaptchaDataSumResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCaptchaDataSumResponse(DescribeCaptchaDataSumResponse source) {
        if (source.GetSum != null) {
            this.GetSum = new Long(source.GetSum);
        }
        if (source.VfySuccSum != null) {
            this.VfySuccSum = new Long(source.VfySuccSum);
        }
        if (source.VfySum != null) {
            this.VfySum = new Long(source.VfySum);
        }
        if (source.AttackSum != null) {
            this.AttackSum = new Long(source.AttackSum);
        }
        if (source.CaptchaMsg != null) {
            this.CaptchaMsg = new String(source.CaptchaMsg);
        }
        if (source.CaptchaCode != null) {
            this.CaptchaCode = new Long(source.CaptchaCode);
        }
        if (source.CheckTicketSum != null) {
            this.CheckTicketSum = new Long(source.CheckTicketSum);
        }
        if (source.TicketThroughputSum != null) {
            this.TicketThroughputSum = new Long(source.TicketThroughputSum);
        }
        if (source.TicketInterceptSum != null) {
            this.TicketInterceptSum = new Long(source.TicketInterceptSum);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GetSum", this.GetSum);
        this.setParamSimple(map, prefix + "VfySuccSum", this.VfySuccSum);
        this.setParamSimple(map, prefix + "VfySum", this.VfySum);
        this.setParamSimple(map, prefix + "AttackSum", this.AttackSum);
        this.setParamSimple(map, prefix + "CaptchaMsg", this.CaptchaMsg);
        this.setParamSimple(map, prefix + "CaptchaCode", this.CaptchaCode);
        this.setParamSimple(map, prefix + "CheckTicketSum", this.CheckTicketSum);
        this.setParamSimple(map, prefix + "TicketThroughputSum", this.TicketThroughputSum);
        this.setParamSimple(map, prefix + "TicketInterceptSum", this.TicketInterceptSum);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

