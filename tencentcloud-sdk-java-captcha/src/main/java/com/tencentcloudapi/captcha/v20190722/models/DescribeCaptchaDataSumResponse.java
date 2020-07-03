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
package com.tencentcloudapi.captcha.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCaptchaDataSumResponse extends AbstractModel{

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
注意：此字段可能返回 null，表示取不到有效值。
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
    * 票据校验量
    */
    @SerializedName("CheckTicketSum")
    @Expose
    private Long CheckTicketSum;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
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
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CaptchaMsg 返回信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCaptchaMsg() {
        return this.CaptchaMsg;
    }

    /**
     * Set 返回信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param CaptchaMsg 返回信息
注意：此字段可能返回 null，表示取不到有效值。
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
     * Get 票据校验量 
     * @return CheckTicketSum 票据校验量
     */
    public Long getCheckTicketSum() {
        return this.CheckTicketSum;
    }

    /**
     * Set 票据校验量
     * @param CheckTicketSum 票据校验量
     */
    public void setCheckTicketSum(Long CheckTicketSum) {
        this.CheckTicketSum = CheckTicketSum;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
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
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

