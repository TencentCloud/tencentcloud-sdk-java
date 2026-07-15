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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateBatchAdminChangeInvitationsUrlRequest extends AbstractModel {

    /**
    * <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。</p><p>此接口下面信息必填。</p><ul><li>渠道应用标识:  Agent.AppId</li></ul>
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * <p>组织机构要变更的超管姓名。 在超管变更流程中，必须是超管本人进行操作，需要更当前操作人的姓名保持一致。</p>
    */
    @SerializedName("NewAdminName")
    @Expose
    private String NewAdminName;

    /**
    * <p>组织机构要变更的超管手机号。 在超管变更流程中，必须是超管本人进行操作，需要更当前操作人的手机号保持一致。 超管手机号 和超管证件号 二选一 必填。 注意： 1. 如果新超管的个人身份在电子签进行了手机号的变更，之前提交的超管变更任务将无法获取。</p>
    */
    @SerializedName("NewAdminMobile")
    @Expose
    private String NewAdminMobile;

    /**
    * <p>组织机构要变更的超管证件类型支持以下类型</p><ul><li>ID_CARD : 中国大陆居民身份证 (默认值)</li><li>HONGKONG_AND_MACAO : 中国港澳居民来往内地通行证</li><li>HONGKONG_MACAO_AND_TAIWAN : 中国港澳台居民居住证(格式同中国大陆居民身份证)<br>需要更当前操作人的证件类型保持一致。</li></ul><p>枚举值：</p><ul><li>ID_CARD： 中国大陆居民身份证 (默认值)</li><li>HONGKONG_AND_MACAO： 中国港澳居民来往内地通行证</li><li>HONGKONG_MACAO_AND_TAIWAN： 中国港澳台居民居住证(格式同中国大陆居民身份证)</li></ul><p>默认值：ID_CARD</p>
    */
    @SerializedName("NewAdminIdCardType")
    @Expose
    private String NewAdminIdCardType;

    /**
    * <p>组织机构要变更的超管证件号。 在超管变更流程中，必须是超管本人进行操作，需要更当前操作人的证件号保持一致。 超管手机号和超管证件号 二选一必填。</p>
    */
    @SerializedName("NewAdminIdCardNumber")
    @Expose
    private String NewAdminIdCardNumber;

    /**
    * <p>要跳转的链接类型</p><ul><li> **HTTP**：跳转电子签小程序的http_url，短信通知或者H5跳转适合此类型 ，此时返回长链 （默认类型）。</li><li>**HTTP_SHORT_URL**：跳转电子签小程序的http_url，短信通知或者H5跳转适合此类型，此时返回短链。</li><li>**APP**： 第三方APP或小程序跳转电子签小程序的path，APP或者小程序跳转适合此类型。</li><li>**QR_CODE**： 跳转电子签小程序的http_url的二维码形式，可以在页面展示适合此类型。</li></ul><p>枚举值：</p><ul><li>HTTP： 跳转电子签小程序的http_url，短信通知或者H5跳转适合此类型 ，此时返回长链 （默认类型）。</li><li>HTTP_SHORT_URL： 跳转电子签小程序的http_url，短信通知或者H5跳转适合此类型，此时返回短链。</li><li>APP： 第三方APP或小程序跳转电子签小程序的path，APP或者小程序跳转适合此类型。</li><li>QR_CODE： 跳转电子签小程序的http_url的二维码形式，可以在页面展示适合此类型。</li></ul><p>默认值：HTTP</p>
    */
    @SerializedName("Endpoint")
    @Expose
    private String Endpoint;

    /**
     * Get <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。</p><p>此接口下面信息必填。</p><ul><li>渠道应用标识:  Agent.AppId</li></ul> 
     * @return Agent <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。</p><p>此接口下面信息必填。</p><ul><li>渠道应用标识:  Agent.AppId</li></ul>
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。</p><p>此接口下面信息必填。</p><ul><li>渠道应用标识:  Agent.AppId</li></ul>
     * @param Agent <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。</p><p>此接口下面信息必填。</p><ul><li>渠道应用标识:  Agent.AppId</li></ul>
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get <p>组织机构要变更的超管姓名。 在超管变更流程中，必须是超管本人进行操作，需要更当前操作人的姓名保持一致。</p> 
     * @return NewAdminName <p>组织机构要变更的超管姓名。 在超管变更流程中，必须是超管本人进行操作，需要更当前操作人的姓名保持一致。</p>
     */
    public String getNewAdminName() {
        return this.NewAdminName;
    }

    /**
     * Set <p>组织机构要变更的超管姓名。 在超管变更流程中，必须是超管本人进行操作，需要更当前操作人的姓名保持一致。</p>
     * @param NewAdminName <p>组织机构要变更的超管姓名。 在超管变更流程中，必须是超管本人进行操作，需要更当前操作人的姓名保持一致。</p>
     */
    public void setNewAdminName(String NewAdminName) {
        this.NewAdminName = NewAdminName;
    }

    /**
     * Get <p>组织机构要变更的超管手机号。 在超管变更流程中，必须是超管本人进行操作，需要更当前操作人的手机号保持一致。 超管手机号 和超管证件号 二选一 必填。 注意： 1. 如果新超管的个人身份在电子签进行了手机号的变更，之前提交的超管变更任务将无法获取。</p> 
     * @return NewAdminMobile <p>组织机构要变更的超管手机号。 在超管变更流程中，必须是超管本人进行操作，需要更当前操作人的手机号保持一致。 超管手机号 和超管证件号 二选一 必填。 注意： 1. 如果新超管的个人身份在电子签进行了手机号的变更，之前提交的超管变更任务将无法获取。</p>
     */
    public String getNewAdminMobile() {
        return this.NewAdminMobile;
    }

    /**
     * Set <p>组织机构要变更的超管手机号。 在超管变更流程中，必须是超管本人进行操作，需要更当前操作人的手机号保持一致。 超管手机号 和超管证件号 二选一 必填。 注意： 1. 如果新超管的个人身份在电子签进行了手机号的变更，之前提交的超管变更任务将无法获取。</p>
     * @param NewAdminMobile <p>组织机构要变更的超管手机号。 在超管变更流程中，必须是超管本人进行操作，需要更当前操作人的手机号保持一致。 超管手机号 和超管证件号 二选一 必填。 注意： 1. 如果新超管的个人身份在电子签进行了手机号的变更，之前提交的超管变更任务将无法获取。</p>
     */
    public void setNewAdminMobile(String NewAdminMobile) {
        this.NewAdminMobile = NewAdminMobile;
    }

    /**
     * Get <p>组织机构要变更的超管证件类型支持以下类型</p><ul><li>ID_CARD : 中国大陆居民身份证 (默认值)</li><li>HONGKONG_AND_MACAO : 中国港澳居民来往内地通行证</li><li>HONGKONG_MACAO_AND_TAIWAN : 中国港澳台居民居住证(格式同中国大陆居民身份证)<br>需要更当前操作人的证件类型保持一致。</li></ul><p>枚举值：</p><ul><li>ID_CARD： 中国大陆居民身份证 (默认值)</li><li>HONGKONG_AND_MACAO： 中国港澳居民来往内地通行证</li><li>HONGKONG_MACAO_AND_TAIWAN： 中国港澳台居民居住证(格式同中国大陆居民身份证)</li></ul><p>默认值：ID_CARD</p> 
     * @return NewAdminIdCardType <p>组织机构要变更的超管证件类型支持以下类型</p><ul><li>ID_CARD : 中国大陆居民身份证 (默认值)</li><li>HONGKONG_AND_MACAO : 中国港澳居民来往内地通行证</li><li>HONGKONG_MACAO_AND_TAIWAN : 中国港澳台居民居住证(格式同中国大陆居民身份证)<br>需要更当前操作人的证件类型保持一致。</li></ul><p>枚举值：</p><ul><li>ID_CARD： 中国大陆居民身份证 (默认值)</li><li>HONGKONG_AND_MACAO： 中国港澳居民来往内地通行证</li><li>HONGKONG_MACAO_AND_TAIWAN： 中国港澳台居民居住证(格式同中国大陆居民身份证)</li></ul><p>默认值：ID_CARD</p>
     */
    public String getNewAdminIdCardType() {
        return this.NewAdminIdCardType;
    }

    /**
     * Set <p>组织机构要变更的超管证件类型支持以下类型</p><ul><li>ID_CARD : 中国大陆居民身份证 (默认值)</li><li>HONGKONG_AND_MACAO : 中国港澳居民来往内地通行证</li><li>HONGKONG_MACAO_AND_TAIWAN : 中国港澳台居民居住证(格式同中国大陆居民身份证)<br>需要更当前操作人的证件类型保持一致。</li></ul><p>枚举值：</p><ul><li>ID_CARD： 中国大陆居民身份证 (默认值)</li><li>HONGKONG_AND_MACAO： 中国港澳居民来往内地通行证</li><li>HONGKONG_MACAO_AND_TAIWAN： 中国港澳台居民居住证(格式同中国大陆居民身份证)</li></ul><p>默认值：ID_CARD</p>
     * @param NewAdminIdCardType <p>组织机构要变更的超管证件类型支持以下类型</p><ul><li>ID_CARD : 中国大陆居民身份证 (默认值)</li><li>HONGKONG_AND_MACAO : 中国港澳居民来往内地通行证</li><li>HONGKONG_MACAO_AND_TAIWAN : 中国港澳台居民居住证(格式同中国大陆居民身份证)<br>需要更当前操作人的证件类型保持一致。</li></ul><p>枚举值：</p><ul><li>ID_CARD： 中国大陆居民身份证 (默认值)</li><li>HONGKONG_AND_MACAO： 中国港澳居民来往内地通行证</li><li>HONGKONG_MACAO_AND_TAIWAN： 中国港澳台居民居住证(格式同中国大陆居民身份证)</li></ul><p>默认值：ID_CARD</p>
     */
    public void setNewAdminIdCardType(String NewAdminIdCardType) {
        this.NewAdminIdCardType = NewAdminIdCardType;
    }

    /**
     * Get <p>组织机构要变更的超管证件号。 在超管变更流程中，必须是超管本人进行操作，需要更当前操作人的证件号保持一致。 超管手机号和超管证件号 二选一必填。</p> 
     * @return NewAdminIdCardNumber <p>组织机构要变更的超管证件号。 在超管变更流程中，必须是超管本人进行操作，需要更当前操作人的证件号保持一致。 超管手机号和超管证件号 二选一必填。</p>
     */
    public String getNewAdminIdCardNumber() {
        return this.NewAdminIdCardNumber;
    }

    /**
     * Set <p>组织机构要变更的超管证件号。 在超管变更流程中，必须是超管本人进行操作，需要更当前操作人的证件号保持一致。 超管手机号和超管证件号 二选一必填。</p>
     * @param NewAdminIdCardNumber <p>组织机构要变更的超管证件号。 在超管变更流程中，必须是超管本人进行操作，需要更当前操作人的证件号保持一致。 超管手机号和超管证件号 二选一必填。</p>
     */
    public void setNewAdminIdCardNumber(String NewAdminIdCardNumber) {
        this.NewAdminIdCardNumber = NewAdminIdCardNumber;
    }

    /**
     * Get <p>要跳转的链接类型</p><ul><li> **HTTP**：跳转电子签小程序的http_url，短信通知或者H5跳转适合此类型 ，此时返回长链 （默认类型）。</li><li>**HTTP_SHORT_URL**：跳转电子签小程序的http_url，短信通知或者H5跳转适合此类型，此时返回短链。</li><li>**APP**： 第三方APP或小程序跳转电子签小程序的path，APP或者小程序跳转适合此类型。</li><li>**QR_CODE**： 跳转电子签小程序的http_url的二维码形式，可以在页面展示适合此类型。</li></ul><p>枚举值：</p><ul><li>HTTP： 跳转电子签小程序的http_url，短信通知或者H5跳转适合此类型 ，此时返回长链 （默认类型）。</li><li>HTTP_SHORT_URL： 跳转电子签小程序的http_url，短信通知或者H5跳转适合此类型，此时返回短链。</li><li>APP： 第三方APP或小程序跳转电子签小程序的path，APP或者小程序跳转适合此类型。</li><li>QR_CODE： 跳转电子签小程序的http_url的二维码形式，可以在页面展示适合此类型。</li></ul><p>默认值：HTTP</p> 
     * @return Endpoint <p>要跳转的链接类型</p><ul><li> **HTTP**：跳转电子签小程序的http_url，短信通知或者H5跳转适合此类型 ，此时返回长链 （默认类型）。</li><li>**HTTP_SHORT_URL**：跳转电子签小程序的http_url，短信通知或者H5跳转适合此类型，此时返回短链。</li><li>**APP**： 第三方APP或小程序跳转电子签小程序的path，APP或者小程序跳转适合此类型。</li><li>**QR_CODE**： 跳转电子签小程序的http_url的二维码形式，可以在页面展示适合此类型。</li></ul><p>枚举值：</p><ul><li>HTTP： 跳转电子签小程序的http_url，短信通知或者H5跳转适合此类型 ，此时返回长链 （默认类型）。</li><li>HTTP_SHORT_URL： 跳转电子签小程序的http_url，短信通知或者H5跳转适合此类型，此时返回短链。</li><li>APP： 第三方APP或小程序跳转电子签小程序的path，APP或者小程序跳转适合此类型。</li><li>QR_CODE： 跳转电子签小程序的http_url的二维码形式，可以在页面展示适合此类型。</li></ul><p>默认值：HTTP</p>
     */
    public String getEndpoint() {
        return this.Endpoint;
    }

    /**
     * Set <p>要跳转的链接类型</p><ul><li> **HTTP**：跳转电子签小程序的http_url，短信通知或者H5跳转适合此类型 ，此时返回长链 （默认类型）。</li><li>**HTTP_SHORT_URL**：跳转电子签小程序的http_url，短信通知或者H5跳转适合此类型，此时返回短链。</li><li>**APP**： 第三方APP或小程序跳转电子签小程序的path，APP或者小程序跳转适合此类型。</li><li>**QR_CODE**： 跳转电子签小程序的http_url的二维码形式，可以在页面展示适合此类型。</li></ul><p>枚举值：</p><ul><li>HTTP： 跳转电子签小程序的http_url，短信通知或者H5跳转适合此类型 ，此时返回长链 （默认类型）。</li><li>HTTP_SHORT_URL： 跳转电子签小程序的http_url，短信通知或者H5跳转适合此类型，此时返回短链。</li><li>APP： 第三方APP或小程序跳转电子签小程序的path，APP或者小程序跳转适合此类型。</li><li>QR_CODE： 跳转电子签小程序的http_url的二维码形式，可以在页面展示适合此类型。</li></ul><p>默认值：HTTP</p>
     * @param Endpoint <p>要跳转的链接类型</p><ul><li> **HTTP**：跳转电子签小程序的http_url，短信通知或者H5跳转适合此类型 ，此时返回长链 （默认类型）。</li><li>**HTTP_SHORT_URL**：跳转电子签小程序的http_url，短信通知或者H5跳转适合此类型，此时返回短链。</li><li>**APP**： 第三方APP或小程序跳转电子签小程序的path，APP或者小程序跳转适合此类型。</li><li>**QR_CODE**： 跳转电子签小程序的http_url的二维码形式，可以在页面展示适合此类型。</li></ul><p>枚举值：</p><ul><li>HTTP： 跳转电子签小程序的http_url，短信通知或者H5跳转适合此类型 ，此时返回长链 （默认类型）。</li><li>HTTP_SHORT_URL： 跳转电子签小程序的http_url，短信通知或者H5跳转适合此类型，此时返回短链。</li><li>APP： 第三方APP或小程序跳转电子签小程序的path，APP或者小程序跳转适合此类型。</li><li>QR_CODE： 跳转电子签小程序的http_url的二维码形式，可以在页面展示适合此类型。</li></ul><p>默认值：HTTP</p>
     */
    public void setEndpoint(String Endpoint) {
        this.Endpoint = Endpoint;
    }

    public CreateBatchAdminChangeInvitationsUrlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateBatchAdminChangeInvitationsUrlRequest(CreateBatchAdminChangeInvitationsUrlRequest source) {
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.NewAdminName != null) {
            this.NewAdminName = new String(source.NewAdminName);
        }
        if (source.NewAdminMobile != null) {
            this.NewAdminMobile = new String(source.NewAdminMobile);
        }
        if (source.NewAdminIdCardType != null) {
            this.NewAdminIdCardType = new String(source.NewAdminIdCardType);
        }
        if (source.NewAdminIdCardNumber != null) {
            this.NewAdminIdCardNumber = new String(source.NewAdminIdCardNumber);
        }
        if (source.Endpoint != null) {
            this.Endpoint = new String(source.Endpoint);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamSimple(map, prefix + "NewAdminName", this.NewAdminName);
        this.setParamSimple(map, prefix + "NewAdminMobile", this.NewAdminMobile);
        this.setParamSimple(map, prefix + "NewAdminIdCardType", this.NewAdminIdCardType);
        this.setParamSimple(map, prefix + "NewAdminIdCardNumber", this.NewAdminIdCardNumber);
        this.setParamSimple(map, prefix + "Endpoint", this.Endpoint);

    }
}

