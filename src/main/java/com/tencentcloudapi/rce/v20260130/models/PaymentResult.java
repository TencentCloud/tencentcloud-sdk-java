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
package com.tencentcloudapi.rce.v20260130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PaymentResult extends AbstractModel {

    /**
    * <p>支付状态</p><p>枚举值：</p><ul><li>success： 成功</li><li>failure： 失败</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>支付失败原因</p>
    */
    @SerializedName("FailureReason")
    @Expose
    private String FailureReason;

    /**
    * <p>是否使用3DS，枚举值：</p><ul><li>是：true</li><li>否：false</li></ul>
    */
    @SerializedName("ThreeDomainSecure")
    @Expose
    private Boolean ThreeDomainSecure;

    /**
    * <p>ECI返回码</p>
    */
    @SerializedName("ECICode")
    @Expose
    private String ECICode;

    /**
    * <p>AVS响应结果（地址验证）</p>
    */
    @SerializedName("AVSCode")
    @Expose
    private String AVSCode;

    /**
    * <p>CVC验证结果（交易真实性验证）</p>
    */
    @SerializedName("CVCCode")
    @Expose
    private String CVCCode;

    /**
     * Get <p>支付状态</p><p>枚举值：</p><ul><li>success： 成功</li><li>failure： 失败</li></ul> 
     * @return Status <p>支付状态</p><p>枚举值：</p><ul><li>success： 成功</li><li>failure： 失败</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>支付状态</p><p>枚举值：</p><ul><li>success： 成功</li><li>failure： 失败</li></ul>
     * @param Status <p>支付状态</p><p>枚举值：</p><ul><li>success： 成功</li><li>failure： 失败</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>支付失败原因</p> 
     * @return FailureReason <p>支付失败原因</p>
     */
    public String getFailureReason() {
        return this.FailureReason;
    }

    /**
     * Set <p>支付失败原因</p>
     * @param FailureReason <p>支付失败原因</p>
     */
    public void setFailureReason(String FailureReason) {
        this.FailureReason = FailureReason;
    }

    /**
     * Get <p>是否使用3DS，枚举值：</p><ul><li>是：true</li><li>否：false</li></ul> 
     * @return ThreeDomainSecure <p>是否使用3DS，枚举值：</p><ul><li>是：true</li><li>否：false</li></ul>
     */
    public Boolean getThreeDomainSecure() {
        return this.ThreeDomainSecure;
    }

    /**
     * Set <p>是否使用3DS，枚举值：</p><ul><li>是：true</li><li>否：false</li></ul>
     * @param ThreeDomainSecure <p>是否使用3DS，枚举值：</p><ul><li>是：true</li><li>否：false</li></ul>
     */
    public void setThreeDomainSecure(Boolean ThreeDomainSecure) {
        this.ThreeDomainSecure = ThreeDomainSecure;
    }

    /**
     * Get <p>ECI返回码</p> 
     * @return ECICode <p>ECI返回码</p>
     */
    public String getECICode() {
        return this.ECICode;
    }

    /**
     * Set <p>ECI返回码</p>
     * @param ECICode <p>ECI返回码</p>
     */
    public void setECICode(String ECICode) {
        this.ECICode = ECICode;
    }

    /**
     * Get <p>AVS响应结果（地址验证）</p> 
     * @return AVSCode <p>AVS响应结果（地址验证）</p>
     */
    public String getAVSCode() {
        return this.AVSCode;
    }

    /**
     * Set <p>AVS响应结果（地址验证）</p>
     * @param AVSCode <p>AVS响应结果（地址验证）</p>
     */
    public void setAVSCode(String AVSCode) {
        this.AVSCode = AVSCode;
    }

    /**
     * Get <p>CVC验证结果（交易真实性验证）</p> 
     * @return CVCCode <p>CVC验证结果（交易真实性验证）</p>
     */
    public String getCVCCode() {
        return this.CVCCode;
    }

    /**
     * Set <p>CVC验证结果（交易真实性验证）</p>
     * @param CVCCode <p>CVC验证结果（交易真实性验证）</p>
     */
    public void setCVCCode(String CVCCode) {
        this.CVCCode = CVCCode;
    }

    public PaymentResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PaymentResult(PaymentResult source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.FailureReason != null) {
            this.FailureReason = new String(source.FailureReason);
        }
        if (source.ThreeDomainSecure != null) {
            this.ThreeDomainSecure = new Boolean(source.ThreeDomainSecure);
        }
        if (source.ECICode != null) {
            this.ECICode = new String(source.ECICode);
        }
        if (source.AVSCode != null) {
            this.AVSCode = new String(source.AVSCode);
        }
        if (source.CVCCode != null) {
            this.CVCCode = new String(source.CVCCode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "FailureReason", this.FailureReason);
        this.setParamSimple(map, prefix + "ThreeDomainSecure", this.ThreeDomainSecure);
        this.setParamSimple(map, prefix + "ECICode", this.ECICode);
        this.setParamSimple(map, prefix + "AVSCode", this.AVSCode);
        this.setParamSimple(map, prefix + "CVCCode", this.CVCCode);

    }
}

