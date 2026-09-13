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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyExtendedServiceRequest extends AbstractModel {

    /**
    * <p>执行本接口操作的员工信息。<br>注: <code>在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</code></p>
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * <p>要管理的拓展服务类型。<ul><li>OPEN_SERVER_SIGN：企业“授权签”</li><li>AUTO_SIGN_CAN_FILL_IN：本企业“授权签”合同支持签前内容补充</li><li>OVERSEA_SIGN：企业与港澳台居民签署合同</li><li>AGE_LIMIT_EXPANSION：拓宽签署方年龄限制</li><li>MOBILE_CHECK_APPROVER：个人签署方仅校验手机号</li><li>HIDE_OPERATOR_DISPLAY：隐藏合同经办人姓名</li><li>ORGANIZATION_OCR_FALLBACK：正楷临摹签名失败后更换其他签名类型</li><li>ORGANIZATION_FLOW_NOTIFY_TYPE：短信通知签署方</li><li>HIDE_ONE_KEY_SIGN：个人签署方手写签名时需逐个手写</li><li>SIGN_SIGNATURE_DEFAULT_SET_HANDWRITE：个人签署方手动签名</li><li>ORGANIZATION_FLOW_EMAIL_NOTIFY：邮件通知签署方</li><li>FLOW_APPROVAL：合同审批强制开启</li><li>ORGANIZATION_FLOW_PASSWD_NOTIFY：签署密码开通引导</li><li>APP_LOGIN：限制企业员工小程序端登录</li><li>PC_LOGIN：限制企业员工网页端登录</li></ul></p>
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
    * <p>操作类型</p><ul><li>OPEN : 开通</li><li>CLOSE : 关闭</li></ul>
    */
    @SerializedName("Operate")
    @Expose
    private String Operate;

    /**
    * <p>代理企业和员工的信息。<br>在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。</p>
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * <p>链接跳转类型，支持以下类型</p><ul><li>WEIXINAPP : 短链直接跳转到电子签小程序  (默认值)</li><li>APP : 第三方APP或小程序跳转电子签小程序</li><li>WEIXIN_QRCODE_URL：直接跳转至电子签小程序的二维码链接，无需通过中转页。<font color="red">您需要自行将其转换为二维码，使用微信扫码后可直接进入。请注意，直接点击链接是无效的。</font></li></ul>
    */
    @SerializedName("Endpoint")
    @Expose
    private String Endpoint;

    /**
     * Get <p>执行本接口操作的员工信息。<br>注: <code>在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</code></p> 
     * @return Operator <p>执行本接口操作的员工信息。<br>注: <code>在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</code></p>
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set <p>执行本接口操作的员工信息。<br>注: <code>在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</code></p>
     * @param Operator <p>执行本接口操作的员工信息。<br>注: <code>在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</code></p>
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get <p>要管理的拓展服务类型。<ul><li>OPEN_SERVER_SIGN：企业“授权签”</li><li>AUTO_SIGN_CAN_FILL_IN：本企业“授权签”合同支持签前内容补充</li><li>OVERSEA_SIGN：企业与港澳台居民签署合同</li><li>AGE_LIMIT_EXPANSION：拓宽签署方年龄限制</li><li>MOBILE_CHECK_APPROVER：个人签署方仅校验手机号</li><li>HIDE_OPERATOR_DISPLAY：隐藏合同经办人姓名</li><li>ORGANIZATION_OCR_FALLBACK：正楷临摹签名失败后更换其他签名类型</li><li>ORGANIZATION_FLOW_NOTIFY_TYPE：短信通知签署方</li><li>HIDE_ONE_KEY_SIGN：个人签署方手写签名时需逐个手写</li><li>SIGN_SIGNATURE_DEFAULT_SET_HANDWRITE：个人签署方手动签名</li><li>ORGANIZATION_FLOW_EMAIL_NOTIFY：邮件通知签署方</li><li>FLOW_APPROVAL：合同审批强制开启</li><li>ORGANIZATION_FLOW_PASSWD_NOTIFY：签署密码开通引导</li><li>APP_LOGIN：限制企业员工小程序端登录</li><li>PC_LOGIN：限制企业员工网页端登录</li></ul></p> 
     * @return ServiceType <p>要管理的拓展服务类型。<ul><li>OPEN_SERVER_SIGN：企业“授权签”</li><li>AUTO_SIGN_CAN_FILL_IN：本企业“授权签”合同支持签前内容补充</li><li>OVERSEA_SIGN：企业与港澳台居民签署合同</li><li>AGE_LIMIT_EXPANSION：拓宽签署方年龄限制</li><li>MOBILE_CHECK_APPROVER：个人签署方仅校验手机号</li><li>HIDE_OPERATOR_DISPLAY：隐藏合同经办人姓名</li><li>ORGANIZATION_OCR_FALLBACK：正楷临摹签名失败后更换其他签名类型</li><li>ORGANIZATION_FLOW_NOTIFY_TYPE：短信通知签署方</li><li>HIDE_ONE_KEY_SIGN：个人签署方手写签名时需逐个手写</li><li>SIGN_SIGNATURE_DEFAULT_SET_HANDWRITE：个人签署方手动签名</li><li>ORGANIZATION_FLOW_EMAIL_NOTIFY：邮件通知签署方</li><li>FLOW_APPROVAL：合同审批强制开启</li><li>ORGANIZATION_FLOW_PASSWD_NOTIFY：签署密码开通引导</li><li>APP_LOGIN：限制企业员工小程序端登录</li><li>PC_LOGIN：限制企业员工网页端登录</li></ul></p>
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set <p>要管理的拓展服务类型。<ul><li>OPEN_SERVER_SIGN：企业“授权签”</li><li>AUTO_SIGN_CAN_FILL_IN：本企业“授权签”合同支持签前内容补充</li><li>OVERSEA_SIGN：企业与港澳台居民签署合同</li><li>AGE_LIMIT_EXPANSION：拓宽签署方年龄限制</li><li>MOBILE_CHECK_APPROVER：个人签署方仅校验手机号</li><li>HIDE_OPERATOR_DISPLAY：隐藏合同经办人姓名</li><li>ORGANIZATION_OCR_FALLBACK：正楷临摹签名失败后更换其他签名类型</li><li>ORGANIZATION_FLOW_NOTIFY_TYPE：短信通知签署方</li><li>HIDE_ONE_KEY_SIGN：个人签署方手写签名时需逐个手写</li><li>SIGN_SIGNATURE_DEFAULT_SET_HANDWRITE：个人签署方手动签名</li><li>ORGANIZATION_FLOW_EMAIL_NOTIFY：邮件通知签署方</li><li>FLOW_APPROVAL：合同审批强制开启</li><li>ORGANIZATION_FLOW_PASSWD_NOTIFY：签署密码开通引导</li><li>APP_LOGIN：限制企业员工小程序端登录</li><li>PC_LOGIN：限制企业员工网页端登录</li></ul></p>
     * @param ServiceType <p>要管理的拓展服务类型。<ul><li>OPEN_SERVER_SIGN：企业“授权签”</li><li>AUTO_SIGN_CAN_FILL_IN：本企业“授权签”合同支持签前内容补充</li><li>OVERSEA_SIGN：企业与港澳台居民签署合同</li><li>AGE_LIMIT_EXPANSION：拓宽签署方年龄限制</li><li>MOBILE_CHECK_APPROVER：个人签署方仅校验手机号</li><li>HIDE_OPERATOR_DISPLAY：隐藏合同经办人姓名</li><li>ORGANIZATION_OCR_FALLBACK：正楷临摹签名失败后更换其他签名类型</li><li>ORGANIZATION_FLOW_NOTIFY_TYPE：短信通知签署方</li><li>HIDE_ONE_KEY_SIGN：个人签署方手写签名时需逐个手写</li><li>SIGN_SIGNATURE_DEFAULT_SET_HANDWRITE：个人签署方手动签名</li><li>ORGANIZATION_FLOW_EMAIL_NOTIFY：邮件通知签署方</li><li>FLOW_APPROVAL：合同审批强制开启</li><li>ORGANIZATION_FLOW_PASSWD_NOTIFY：签署密码开通引导</li><li>APP_LOGIN：限制企业员工小程序端登录</li><li>PC_LOGIN：限制企业员工网页端登录</li></ul></p>
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * Get <p>操作类型</p><ul><li>OPEN : 开通</li><li>CLOSE : 关闭</li></ul> 
     * @return Operate <p>操作类型</p><ul><li>OPEN : 开通</li><li>CLOSE : 关闭</li></ul>
     */
    public String getOperate() {
        return this.Operate;
    }

    /**
     * Set <p>操作类型</p><ul><li>OPEN : 开通</li><li>CLOSE : 关闭</li></ul>
     * @param Operate <p>操作类型</p><ul><li>OPEN : 开通</li><li>CLOSE : 关闭</li></ul>
     */
    public void setOperate(String Operate) {
        this.Operate = Operate;
    }

    /**
     * Get <p>代理企业和员工的信息。<br>在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。</p> 
     * @return Agent <p>代理企业和员工的信息。<br>在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。</p>
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set <p>代理企业和员工的信息。<br>在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。</p>
     * @param Agent <p>代理企业和员工的信息。<br>在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。</p>
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get <p>链接跳转类型，支持以下类型</p><ul><li>WEIXINAPP : 短链直接跳转到电子签小程序  (默认值)</li><li>APP : 第三方APP或小程序跳转电子签小程序</li><li>WEIXIN_QRCODE_URL：直接跳转至电子签小程序的二维码链接，无需通过中转页。<font color="red">您需要自行将其转换为二维码，使用微信扫码后可直接进入。请注意，直接点击链接是无效的。</font></li></ul> 
     * @return Endpoint <p>链接跳转类型，支持以下类型</p><ul><li>WEIXINAPP : 短链直接跳转到电子签小程序  (默认值)</li><li>APP : 第三方APP或小程序跳转电子签小程序</li><li>WEIXIN_QRCODE_URL：直接跳转至电子签小程序的二维码链接，无需通过中转页。<font color="red">您需要自行将其转换为二维码，使用微信扫码后可直接进入。请注意，直接点击链接是无效的。</font></li></ul>
     */
    public String getEndpoint() {
        return this.Endpoint;
    }

    /**
     * Set <p>链接跳转类型，支持以下类型</p><ul><li>WEIXINAPP : 短链直接跳转到电子签小程序  (默认值)</li><li>APP : 第三方APP或小程序跳转电子签小程序</li><li>WEIXIN_QRCODE_URL：直接跳转至电子签小程序的二维码链接，无需通过中转页。<font color="red">您需要自行将其转换为二维码，使用微信扫码后可直接进入。请注意，直接点击链接是无效的。</font></li></ul>
     * @param Endpoint <p>链接跳转类型，支持以下类型</p><ul><li>WEIXINAPP : 短链直接跳转到电子签小程序  (默认值)</li><li>APP : 第三方APP或小程序跳转电子签小程序</li><li>WEIXIN_QRCODE_URL：直接跳转至电子签小程序的二维码链接，无需通过中转页。<font color="red">您需要自行将其转换为二维码，使用微信扫码后可直接进入。请注意，直接点击链接是无效的。</font></li></ul>
     */
    public void setEndpoint(String Endpoint) {
        this.Endpoint = Endpoint;
    }

    public ModifyExtendedServiceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyExtendedServiceRequest(ModifyExtendedServiceRequest source) {
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.ServiceType != null) {
            this.ServiceType = new String(source.ServiceType);
        }
        if (source.Operate != null) {
            this.Operate = new String(source.Operate);
        }
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.Endpoint != null) {
            this.Endpoint = new String(source.Endpoint);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamSimple(map, prefix + "Operate", this.Operate);
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamSimple(map, prefix + "Endpoint", this.Endpoint);

    }
}

