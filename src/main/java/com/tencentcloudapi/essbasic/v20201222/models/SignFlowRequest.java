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
package com.tencentcloudapi.essbasic.v20201222.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SignFlowRequest extends AbstractModel{

    /**
    * 调用方信息
    */
    @SerializedName("Caller")
    @Expose
    private Caller Caller;

    /**
    * 流程编号
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
    * 意愿确认票据。
1. VerifyChannel 为 WEIXINAPP，使用响应的VerifyResult；
2. VerifyChannel 为 FACEID时，使用OrderNo；
3. VerifyChannel 为 VERIFYCODE，使用短信验证码
4. VerifyChannel 为 NONE，传空值
（注：普通情况下，VerifyResult不能为None，如您不希望腾讯电子签对用户签署意愿做校验，请提前与客户经理或邮件至e-contract@tencent.com与我们联系）
    */
    @SerializedName("VerifyResult")
    @Expose
    private String VerifyResult;

    /**
    * 意愿确认渠道：
1. WEIXINAPP - 微信小程序
2. FACEID - 慧眼 (默认) 
3. VERIFYCODE - 验证码
4. THIRD - 第三方 (暂不支持)
5. NONE - 无需电子签系统验证
（注：普通情况下，VerifyChannel不能为None，如您不希望腾讯电子签对用户签署意愿做校验，请提前与客户经理或邮件至e-contract@tencent.com与我们联系）
    */
    @SerializedName("VerifyChannel")
    @Expose
    private String VerifyChannel;

    /**
    * 客户端来源IP
    */
    @SerializedName("SourceIp")
    @Expose
    private String SourceIp;

    /**
    * 签署内容
    */
    @SerializedName("SignSeals")
    @Expose
    private SignSeal [] SignSeals;

    /**
    * 签署备注
    */
    @SerializedName("ApproveMessage")
    @Expose
    private String ApproveMessage;

    /**
    * 签署参与者编号
    */
    @SerializedName("SignId")
    @Expose
    private String SignId;

    /**
     * Get 调用方信息 
     * @return Caller 调用方信息
     */
    public Caller getCaller() {
        return this.Caller;
    }

    /**
     * Set 调用方信息
     * @param Caller 调用方信息
     */
    public void setCaller(Caller Caller) {
        this.Caller = Caller;
    }

    /**
     * Get 流程编号 
     * @return FlowId 流程编号
     */
    public String getFlowId() {
        return this.FlowId;
    }

    /**
     * Set 流程编号
     * @param FlowId 流程编号
     */
    public void setFlowId(String FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get 意愿确认票据。
1. VerifyChannel 为 WEIXINAPP，使用响应的VerifyResult；
2. VerifyChannel 为 FACEID时，使用OrderNo；
3. VerifyChannel 为 VERIFYCODE，使用短信验证码
4. VerifyChannel 为 NONE，传空值
（注：普通情况下，VerifyResult不能为None，如您不希望腾讯电子签对用户签署意愿做校验，请提前与客户经理或邮件至e-contract@tencent.com与我们联系） 
     * @return VerifyResult 意愿确认票据。
1. VerifyChannel 为 WEIXINAPP，使用响应的VerifyResult；
2. VerifyChannel 为 FACEID时，使用OrderNo；
3. VerifyChannel 为 VERIFYCODE，使用短信验证码
4. VerifyChannel 为 NONE，传空值
（注：普通情况下，VerifyResult不能为None，如您不希望腾讯电子签对用户签署意愿做校验，请提前与客户经理或邮件至e-contract@tencent.com与我们联系）
     */
    public String getVerifyResult() {
        return this.VerifyResult;
    }

    /**
     * Set 意愿确认票据。
1. VerifyChannel 为 WEIXINAPP，使用响应的VerifyResult；
2. VerifyChannel 为 FACEID时，使用OrderNo；
3. VerifyChannel 为 VERIFYCODE，使用短信验证码
4. VerifyChannel 为 NONE，传空值
（注：普通情况下，VerifyResult不能为None，如您不希望腾讯电子签对用户签署意愿做校验，请提前与客户经理或邮件至e-contract@tencent.com与我们联系）
     * @param VerifyResult 意愿确认票据。
1. VerifyChannel 为 WEIXINAPP，使用响应的VerifyResult；
2. VerifyChannel 为 FACEID时，使用OrderNo；
3. VerifyChannel 为 VERIFYCODE，使用短信验证码
4. VerifyChannel 为 NONE，传空值
（注：普通情况下，VerifyResult不能为None，如您不希望腾讯电子签对用户签署意愿做校验，请提前与客户经理或邮件至e-contract@tencent.com与我们联系）
     */
    public void setVerifyResult(String VerifyResult) {
        this.VerifyResult = VerifyResult;
    }

    /**
     * Get 意愿确认渠道：
1. WEIXINAPP - 微信小程序
2. FACEID - 慧眼 (默认) 
3. VERIFYCODE - 验证码
4. THIRD - 第三方 (暂不支持)
5. NONE - 无需电子签系统验证
（注：普通情况下，VerifyChannel不能为None，如您不希望腾讯电子签对用户签署意愿做校验，请提前与客户经理或邮件至e-contract@tencent.com与我们联系） 
     * @return VerifyChannel 意愿确认渠道：
1. WEIXINAPP - 微信小程序
2. FACEID - 慧眼 (默认) 
3. VERIFYCODE - 验证码
4. THIRD - 第三方 (暂不支持)
5. NONE - 无需电子签系统验证
（注：普通情况下，VerifyChannel不能为None，如您不希望腾讯电子签对用户签署意愿做校验，请提前与客户经理或邮件至e-contract@tencent.com与我们联系）
     */
    public String getVerifyChannel() {
        return this.VerifyChannel;
    }

    /**
     * Set 意愿确认渠道：
1. WEIXINAPP - 微信小程序
2. FACEID - 慧眼 (默认) 
3. VERIFYCODE - 验证码
4. THIRD - 第三方 (暂不支持)
5. NONE - 无需电子签系统验证
（注：普通情况下，VerifyChannel不能为None，如您不希望腾讯电子签对用户签署意愿做校验，请提前与客户经理或邮件至e-contract@tencent.com与我们联系）
     * @param VerifyChannel 意愿确认渠道：
1. WEIXINAPP - 微信小程序
2. FACEID - 慧眼 (默认) 
3. VERIFYCODE - 验证码
4. THIRD - 第三方 (暂不支持)
5. NONE - 无需电子签系统验证
（注：普通情况下，VerifyChannel不能为None，如您不希望腾讯电子签对用户签署意愿做校验，请提前与客户经理或邮件至e-contract@tencent.com与我们联系）
     */
    public void setVerifyChannel(String VerifyChannel) {
        this.VerifyChannel = VerifyChannel;
    }

    /**
     * Get 客户端来源IP 
     * @return SourceIp 客户端来源IP
     */
    public String getSourceIp() {
        return this.SourceIp;
    }

    /**
     * Set 客户端来源IP
     * @param SourceIp 客户端来源IP
     */
    public void setSourceIp(String SourceIp) {
        this.SourceIp = SourceIp;
    }

    /**
     * Get 签署内容 
     * @return SignSeals 签署内容
     */
    public SignSeal [] getSignSeals() {
        return this.SignSeals;
    }

    /**
     * Set 签署内容
     * @param SignSeals 签署内容
     */
    public void setSignSeals(SignSeal [] SignSeals) {
        this.SignSeals = SignSeals;
    }

    /**
     * Get 签署备注 
     * @return ApproveMessage 签署备注
     */
    public String getApproveMessage() {
        return this.ApproveMessage;
    }

    /**
     * Set 签署备注
     * @param ApproveMessage 签署备注
     */
    public void setApproveMessage(String ApproveMessage) {
        this.ApproveMessage = ApproveMessage;
    }

    /**
     * Get 签署参与者编号 
     * @return SignId 签署参与者编号
     */
    public String getSignId() {
        return this.SignId;
    }

    /**
     * Set 签署参与者编号
     * @param SignId 签署参与者编号
     */
    public void setSignId(String SignId) {
        this.SignId = SignId;
    }

    public SignFlowRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SignFlowRequest(SignFlowRequest source) {
        if (source.Caller != null) {
            this.Caller = new Caller(source.Caller);
        }
        if (source.FlowId != null) {
            this.FlowId = new String(source.FlowId);
        }
        if (source.VerifyResult != null) {
            this.VerifyResult = new String(source.VerifyResult);
        }
        if (source.VerifyChannel != null) {
            this.VerifyChannel = new String(source.VerifyChannel);
        }
        if (source.SourceIp != null) {
            this.SourceIp = new String(source.SourceIp);
        }
        if (source.SignSeals != null) {
            this.SignSeals = new SignSeal[source.SignSeals.length];
            for (int i = 0; i < source.SignSeals.length; i++) {
                this.SignSeals[i] = new SignSeal(source.SignSeals[i]);
            }
        }
        if (source.ApproveMessage != null) {
            this.ApproveMessage = new String(source.ApproveMessage);
        }
        if (source.SignId != null) {
            this.SignId = new String(source.SignId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Caller.", this.Caller);
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamSimple(map, prefix + "VerifyResult", this.VerifyResult);
        this.setParamSimple(map, prefix + "VerifyChannel", this.VerifyChannel);
        this.setParamSimple(map, prefix + "SourceIp", this.SourceIp);
        this.setParamArrayObj(map, prefix + "SignSeals.", this.SignSeals);
        this.setParamSimple(map, prefix + "ApproveMessage", this.ApproveMessage);
        this.setParamSimple(map, prefix + "SignId", this.SignId);

    }
}

