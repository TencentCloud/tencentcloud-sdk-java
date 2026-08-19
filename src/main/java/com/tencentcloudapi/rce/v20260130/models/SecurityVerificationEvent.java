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

public class SecurityVerificationEvent extends AbstractModel {

    /**
    * <p>安全验证所处的事件类型</p><p>枚举值：</p><ul><li>register： 注册</li><li>login： 登录</li><li>modify_account： 修改账号</li><li>modify_password： 修改密码</li><li>create_order： 创建订单</li><li>transaction： 交易支付</li><li>modify_order： 修改订单</li><li>withdraw： 提现</li><li>add_promotion： 参加营销活动</li><li>redeem： 兑奖</li></ul>
    */
    @SerializedName("VerificationEvent")
    @Expose
    private String VerificationEvent;

    /**
    * <p>安全验证类型，sms-短信、phone_call-电话、email-邮件、captcha-验证码、shared_knowledge-共享知识、face-人脸、fingerprint-指纹等</p>
    */
    @SerializedName("VerificationType")
    @Expose
    private String VerificationType;

    /**
    * <p>安全验证的内容，例如：用于验证的电话号码、邮件、验证码或者问题，当安全验证类型是sms、phone_call、email、captcha、shared_knowledge时输入</p>
    */
    @SerializedName("VerificationContent")
    @Expose
    private String VerificationContent;

    /**
    * <p>安全验证结果</p>
    */
    @SerializedName("VerificationResult")
    @Expose
    private Result VerificationResult;

    /**
    * <p>与RCE约定的定制化信息，为K:V 格式的对象数组，示例：[{&quot;Key&quot;: &quot;ApproverName&quot;, &quot;Value&quot;: &quot;bob&quot;},{&quot;Key&quot;:&quot;ApproverPhone&quot;,&quot;Value&quot;: &quot;+86131****5678&quot;}]</p>
    */
    @SerializedName("Cust")
    @Expose
    private Cust [] Cust;

    /**
     * Get <p>安全验证所处的事件类型</p><p>枚举值：</p><ul><li>register： 注册</li><li>login： 登录</li><li>modify_account： 修改账号</li><li>modify_password： 修改密码</li><li>create_order： 创建订单</li><li>transaction： 交易支付</li><li>modify_order： 修改订单</li><li>withdraw： 提现</li><li>add_promotion： 参加营销活动</li><li>redeem： 兑奖</li></ul> 
     * @return VerificationEvent <p>安全验证所处的事件类型</p><p>枚举值：</p><ul><li>register： 注册</li><li>login： 登录</li><li>modify_account： 修改账号</li><li>modify_password： 修改密码</li><li>create_order： 创建订单</li><li>transaction： 交易支付</li><li>modify_order： 修改订单</li><li>withdraw： 提现</li><li>add_promotion： 参加营销活动</li><li>redeem： 兑奖</li></ul>
     */
    public String getVerificationEvent() {
        return this.VerificationEvent;
    }

    /**
     * Set <p>安全验证所处的事件类型</p><p>枚举值：</p><ul><li>register： 注册</li><li>login： 登录</li><li>modify_account： 修改账号</li><li>modify_password： 修改密码</li><li>create_order： 创建订单</li><li>transaction： 交易支付</li><li>modify_order： 修改订单</li><li>withdraw： 提现</li><li>add_promotion： 参加营销活动</li><li>redeem： 兑奖</li></ul>
     * @param VerificationEvent <p>安全验证所处的事件类型</p><p>枚举值：</p><ul><li>register： 注册</li><li>login： 登录</li><li>modify_account： 修改账号</li><li>modify_password： 修改密码</li><li>create_order： 创建订单</li><li>transaction： 交易支付</li><li>modify_order： 修改订单</li><li>withdraw： 提现</li><li>add_promotion： 参加营销活动</li><li>redeem： 兑奖</li></ul>
     */
    public void setVerificationEvent(String VerificationEvent) {
        this.VerificationEvent = VerificationEvent;
    }

    /**
     * Get <p>安全验证类型，sms-短信、phone_call-电话、email-邮件、captcha-验证码、shared_knowledge-共享知识、face-人脸、fingerprint-指纹等</p> 
     * @return VerificationType <p>安全验证类型，sms-短信、phone_call-电话、email-邮件、captcha-验证码、shared_knowledge-共享知识、face-人脸、fingerprint-指纹等</p>
     */
    public String getVerificationType() {
        return this.VerificationType;
    }

    /**
     * Set <p>安全验证类型，sms-短信、phone_call-电话、email-邮件、captcha-验证码、shared_knowledge-共享知识、face-人脸、fingerprint-指纹等</p>
     * @param VerificationType <p>安全验证类型，sms-短信、phone_call-电话、email-邮件、captcha-验证码、shared_knowledge-共享知识、face-人脸、fingerprint-指纹等</p>
     */
    public void setVerificationType(String VerificationType) {
        this.VerificationType = VerificationType;
    }

    /**
     * Get <p>安全验证的内容，例如：用于验证的电话号码、邮件、验证码或者问题，当安全验证类型是sms、phone_call、email、captcha、shared_knowledge时输入</p> 
     * @return VerificationContent <p>安全验证的内容，例如：用于验证的电话号码、邮件、验证码或者问题，当安全验证类型是sms、phone_call、email、captcha、shared_knowledge时输入</p>
     */
    public String getVerificationContent() {
        return this.VerificationContent;
    }

    /**
     * Set <p>安全验证的内容，例如：用于验证的电话号码、邮件、验证码或者问题，当安全验证类型是sms、phone_call、email、captcha、shared_knowledge时输入</p>
     * @param VerificationContent <p>安全验证的内容，例如：用于验证的电话号码、邮件、验证码或者问题，当安全验证类型是sms、phone_call、email、captcha、shared_knowledge时输入</p>
     */
    public void setVerificationContent(String VerificationContent) {
        this.VerificationContent = VerificationContent;
    }

    /**
     * Get <p>安全验证结果</p> 
     * @return VerificationResult <p>安全验证结果</p>
     */
    public Result getVerificationResult() {
        return this.VerificationResult;
    }

    /**
     * Set <p>安全验证结果</p>
     * @param VerificationResult <p>安全验证结果</p>
     */
    public void setVerificationResult(Result VerificationResult) {
        this.VerificationResult = VerificationResult;
    }

    /**
     * Get <p>与RCE约定的定制化信息，为K:V 格式的对象数组，示例：[{&quot;Key&quot;: &quot;ApproverName&quot;, &quot;Value&quot;: &quot;bob&quot;},{&quot;Key&quot;:&quot;ApproverPhone&quot;,&quot;Value&quot;: &quot;+86131****5678&quot;}]</p> 
     * @return Cust <p>与RCE约定的定制化信息，为K:V 格式的对象数组，示例：[{&quot;Key&quot;: &quot;ApproverName&quot;, &quot;Value&quot;: &quot;bob&quot;},{&quot;Key&quot;:&quot;ApproverPhone&quot;,&quot;Value&quot;: &quot;+86131****5678&quot;}]</p>
     */
    public Cust [] getCust() {
        return this.Cust;
    }

    /**
     * Set <p>与RCE约定的定制化信息，为K:V 格式的对象数组，示例：[{&quot;Key&quot;: &quot;ApproverName&quot;, &quot;Value&quot;: &quot;bob&quot;},{&quot;Key&quot;:&quot;ApproverPhone&quot;,&quot;Value&quot;: &quot;+86131****5678&quot;}]</p>
     * @param Cust <p>与RCE约定的定制化信息，为K:V 格式的对象数组，示例：[{&quot;Key&quot;: &quot;ApproverName&quot;, &quot;Value&quot;: &quot;bob&quot;},{&quot;Key&quot;:&quot;ApproverPhone&quot;,&quot;Value&quot;: &quot;+86131****5678&quot;}]</p>
     */
    public void setCust(Cust [] Cust) {
        this.Cust = Cust;
    }

    public SecurityVerificationEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecurityVerificationEvent(SecurityVerificationEvent source) {
        if (source.VerificationEvent != null) {
            this.VerificationEvent = new String(source.VerificationEvent);
        }
        if (source.VerificationType != null) {
            this.VerificationType = new String(source.VerificationType);
        }
        if (source.VerificationContent != null) {
            this.VerificationContent = new String(source.VerificationContent);
        }
        if (source.VerificationResult != null) {
            this.VerificationResult = new Result(source.VerificationResult);
        }
        if (source.Cust != null) {
            this.Cust = new Cust[source.Cust.length];
            for (int i = 0; i < source.Cust.length; i++) {
                this.Cust[i] = new Cust(source.Cust[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VerificationEvent", this.VerificationEvent);
        this.setParamSimple(map, prefix + "VerificationType", this.VerificationType);
        this.setParamSimple(map, prefix + "VerificationContent", this.VerificationContent);
        this.setParamObj(map, prefix + "VerificationResult.", this.VerificationResult);
        this.setParamArrayObj(map, prefix + "Cust.", this.Cust);

    }
}

