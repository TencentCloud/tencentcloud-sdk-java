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

public class ModifyOrganizationBusinessInfoRequest extends AbstractModel {

    /**
    * <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容此接口下面信息必填。<ul><li>渠道应用标识:  Agent.AppId</li><li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li><li>第三方平台子客企业中的员工标识: Agent.ProxyOperator.OpenId</li></ul>注:<code>1. 企业激活时， 此时的Agent.ProxyOrganizationOpenId将会是企业激活后企业的唯一标识，建议开发者保存企业ProxyOrganizationOpenId，后续各项接口调用皆需要此参数。</code><code>2. 员工认证时， 此时的Agent.ProxyOperator.OpenId将会是员工认证加入企业后的唯一标识，建议开发者保存此员工的OpenId，后续各项接口调用皆需要此参数。</code><code>3. 同渠道应用(Agent.AppId)下，企业唯一标识ProxyOrganizationOpenId需要保持唯一，员工唯一标识OpenId也要保持唯一 (而不是企业下唯一)。</code></p>
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * <p>企业营业执照或相关证照图片的 resourceId，需提前通过<a href="https://qian.tencent.com/developers/partnerApis/files/UploadFiles">上传文件接口</a>获取后传入。<br>注意：电子签<b>不会</b>对上传的营业执照图片做 OCR 识别，该图片仅作为企业信息变更的凭证留存；企业最新的名称、法人、地址等信息仍需通过本接口的其它字段显式传入。</p>
    */
    @SerializedName("BizLicenseResourceId")
    @Expose
    private String BizLicenseResourceId;

    /**
    * <p>变更后的最新工商登记企业名称。<br>仅当企业名称发生变更时传入，未变更则不传（系统自动沿用电子签侧当前企业名称）。<br></p>
    */
    @SerializedName("OrganizationName")
    @Expose
    private String OrganizationName;

    /**
    * <p>变更后的企业注册地址。<br>仅当地址发生变更时传入，未变更则不传；传入后系统会自动解析省/市/区。<br></p>
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * <p>变更后的企业类型。<br>仅当企业类型发生变更时传入，未变更则不传（沿用当前类型）。<br>目前仅支持个体工商户（INDIVIDUALBIZ）变更为企业（ENTERPRISE）。</p><p>枚举值：</p><ul><li>INDIVIDUALBIZ： 个体工商户</li><li>ENTERPRISE： 企业</li></ul>
    */
    @SerializedName("OrganizationType")
    @Expose
    private String OrganizationType;

    /**
    * <p>变更后的最新工商登记法人姓名。<br>仅当法人发生变更时传入，未变更则不传（系统自动沿用当前法人姓名）。</p>
    */
    @SerializedName("LegalName")
    @Expose
    private String LegalName;

    /**
     * Get <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容此接口下面信息必填。<ul><li>渠道应用标识:  Agent.AppId</li><li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li><li>第三方平台子客企业中的员工标识: Agent.ProxyOperator.OpenId</li></ul>注:<code>1. 企业激活时， 此时的Agent.ProxyOrganizationOpenId将会是企业激活后企业的唯一标识，建议开发者保存企业ProxyOrganizationOpenId，后续各项接口调用皆需要此参数。</code><code>2. 员工认证时， 此时的Agent.ProxyOperator.OpenId将会是员工认证加入企业后的唯一标识，建议开发者保存此员工的OpenId，后续各项接口调用皆需要此参数。</code><code>3. 同渠道应用(Agent.AppId)下，企业唯一标识ProxyOrganizationOpenId需要保持唯一，员工唯一标识OpenId也要保持唯一 (而不是企业下唯一)。</code></p> 
     * @return Agent <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容此接口下面信息必填。<ul><li>渠道应用标识:  Agent.AppId</li><li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li><li>第三方平台子客企业中的员工标识: Agent.ProxyOperator.OpenId</li></ul>注:<code>1. 企业激活时， 此时的Agent.ProxyOrganizationOpenId将会是企业激活后企业的唯一标识，建议开发者保存企业ProxyOrganizationOpenId，后续各项接口调用皆需要此参数。</code><code>2. 员工认证时， 此时的Agent.ProxyOperator.OpenId将会是员工认证加入企业后的唯一标识，建议开发者保存此员工的OpenId，后续各项接口调用皆需要此参数。</code><code>3. 同渠道应用(Agent.AppId)下，企业唯一标识ProxyOrganizationOpenId需要保持唯一，员工唯一标识OpenId也要保持唯一 (而不是企业下唯一)。</code></p>
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容此接口下面信息必填。<ul><li>渠道应用标识:  Agent.AppId</li><li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li><li>第三方平台子客企业中的员工标识: Agent.ProxyOperator.OpenId</li></ul>注:<code>1. 企业激活时， 此时的Agent.ProxyOrganizationOpenId将会是企业激活后企业的唯一标识，建议开发者保存企业ProxyOrganizationOpenId，后续各项接口调用皆需要此参数。</code><code>2. 员工认证时， 此时的Agent.ProxyOperator.OpenId将会是员工认证加入企业后的唯一标识，建议开发者保存此员工的OpenId，后续各项接口调用皆需要此参数。</code><code>3. 同渠道应用(Agent.AppId)下，企业唯一标识ProxyOrganizationOpenId需要保持唯一，员工唯一标识OpenId也要保持唯一 (而不是企业下唯一)。</code></p>
     * @param Agent <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容此接口下面信息必填。<ul><li>渠道应用标识:  Agent.AppId</li><li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li><li>第三方平台子客企业中的员工标识: Agent.ProxyOperator.OpenId</li></ul>注:<code>1. 企业激活时， 此时的Agent.ProxyOrganizationOpenId将会是企业激活后企业的唯一标识，建议开发者保存企业ProxyOrganizationOpenId，后续各项接口调用皆需要此参数。</code><code>2. 员工认证时， 此时的Agent.ProxyOperator.OpenId将会是员工认证加入企业后的唯一标识，建议开发者保存此员工的OpenId，后续各项接口调用皆需要此参数。</code><code>3. 同渠道应用(Agent.AppId)下，企业唯一标识ProxyOrganizationOpenId需要保持唯一，员工唯一标识OpenId也要保持唯一 (而不是企业下唯一)。</code></p>
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get <p>企业营业执照或相关证照图片的 resourceId，需提前通过<a href="https://qian.tencent.com/developers/partnerApis/files/UploadFiles">上传文件接口</a>获取后传入。<br>注意：电子签<b>不会</b>对上传的营业执照图片做 OCR 识别，该图片仅作为企业信息变更的凭证留存；企业最新的名称、法人、地址等信息仍需通过本接口的其它字段显式传入。</p> 
     * @return BizLicenseResourceId <p>企业营业执照或相关证照图片的 resourceId，需提前通过<a href="https://qian.tencent.com/developers/partnerApis/files/UploadFiles">上传文件接口</a>获取后传入。<br>注意：电子签<b>不会</b>对上传的营业执照图片做 OCR 识别，该图片仅作为企业信息变更的凭证留存；企业最新的名称、法人、地址等信息仍需通过本接口的其它字段显式传入。</p>
     */
    public String getBizLicenseResourceId() {
        return this.BizLicenseResourceId;
    }

    /**
     * Set <p>企业营业执照或相关证照图片的 resourceId，需提前通过<a href="https://qian.tencent.com/developers/partnerApis/files/UploadFiles">上传文件接口</a>获取后传入。<br>注意：电子签<b>不会</b>对上传的营业执照图片做 OCR 识别，该图片仅作为企业信息变更的凭证留存；企业最新的名称、法人、地址等信息仍需通过本接口的其它字段显式传入。</p>
     * @param BizLicenseResourceId <p>企业营业执照或相关证照图片的 resourceId，需提前通过<a href="https://qian.tencent.com/developers/partnerApis/files/UploadFiles">上传文件接口</a>获取后传入。<br>注意：电子签<b>不会</b>对上传的营业执照图片做 OCR 识别，该图片仅作为企业信息变更的凭证留存；企业最新的名称、法人、地址等信息仍需通过本接口的其它字段显式传入。</p>
     */
    public void setBizLicenseResourceId(String BizLicenseResourceId) {
        this.BizLicenseResourceId = BizLicenseResourceId;
    }

    /**
     * Get <p>变更后的最新工商登记企业名称。<br>仅当企业名称发生变更时传入，未变更则不传（系统自动沿用电子签侧当前企业名称）。<br></p> 
     * @return OrganizationName <p>变更后的最新工商登记企业名称。<br>仅当企业名称发生变更时传入，未变更则不传（系统自动沿用电子签侧当前企业名称）。<br></p>
     */
    public String getOrganizationName() {
        return this.OrganizationName;
    }

    /**
     * Set <p>变更后的最新工商登记企业名称。<br>仅当企业名称发生变更时传入，未变更则不传（系统自动沿用电子签侧当前企业名称）。<br></p>
     * @param OrganizationName <p>变更后的最新工商登记企业名称。<br>仅当企业名称发生变更时传入，未变更则不传（系统自动沿用电子签侧当前企业名称）。<br></p>
     */
    public void setOrganizationName(String OrganizationName) {
        this.OrganizationName = OrganizationName;
    }

    /**
     * Get <p>变更后的企业注册地址。<br>仅当地址发生变更时传入，未变更则不传；传入后系统会自动解析省/市/区。<br></p> 
     * @return Address <p>变更后的企业注册地址。<br>仅当地址发生变更时传入，未变更则不传；传入后系统会自动解析省/市/区。<br></p>
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set <p>变更后的企业注册地址。<br>仅当地址发生变更时传入，未变更则不传；传入后系统会自动解析省/市/区。<br></p>
     * @param Address <p>变更后的企业注册地址。<br>仅当地址发生变更时传入，未变更则不传；传入后系统会自动解析省/市/区。<br></p>
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get <p>变更后的企业类型。<br>仅当企业类型发生变更时传入，未变更则不传（沿用当前类型）。<br>目前仅支持个体工商户（INDIVIDUALBIZ）变更为企业（ENTERPRISE）。</p><p>枚举值：</p><ul><li>INDIVIDUALBIZ： 个体工商户</li><li>ENTERPRISE： 企业</li></ul> 
     * @return OrganizationType <p>变更后的企业类型。<br>仅当企业类型发生变更时传入，未变更则不传（沿用当前类型）。<br>目前仅支持个体工商户（INDIVIDUALBIZ）变更为企业（ENTERPRISE）。</p><p>枚举值：</p><ul><li>INDIVIDUALBIZ： 个体工商户</li><li>ENTERPRISE： 企业</li></ul>
     */
    public String getOrganizationType() {
        return this.OrganizationType;
    }

    /**
     * Set <p>变更后的企业类型。<br>仅当企业类型发生变更时传入，未变更则不传（沿用当前类型）。<br>目前仅支持个体工商户（INDIVIDUALBIZ）变更为企业（ENTERPRISE）。</p><p>枚举值：</p><ul><li>INDIVIDUALBIZ： 个体工商户</li><li>ENTERPRISE： 企业</li></ul>
     * @param OrganizationType <p>变更后的企业类型。<br>仅当企业类型发生变更时传入，未变更则不传（沿用当前类型）。<br>目前仅支持个体工商户（INDIVIDUALBIZ）变更为企业（ENTERPRISE）。</p><p>枚举值：</p><ul><li>INDIVIDUALBIZ： 个体工商户</li><li>ENTERPRISE： 企业</li></ul>
     */
    public void setOrganizationType(String OrganizationType) {
        this.OrganizationType = OrganizationType;
    }

    /**
     * Get <p>变更后的最新工商登记法人姓名。<br>仅当法人发生变更时传入，未变更则不传（系统自动沿用当前法人姓名）。</p> 
     * @return LegalName <p>变更后的最新工商登记法人姓名。<br>仅当法人发生变更时传入，未变更则不传（系统自动沿用当前法人姓名）。</p>
     */
    public String getLegalName() {
        return this.LegalName;
    }

    /**
     * Set <p>变更后的最新工商登记法人姓名。<br>仅当法人发生变更时传入，未变更则不传（系统自动沿用当前法人姓名）。</p>
     * @param LegalName <p>变更后的最新工商登记法人姓名。<br>仅当法人发生变更时传入，未变更则不传（系统自动沿用当前法人姓名）。</p>
     */
    public void setLegalName(String LegalName) {
        this.LegalName = LegalName;
    }

    public ModifyOrganizationBusinessInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyOrganizationBusinessInfoRequest(ModifyOrganizationBusinessInfoRequest source) {
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.BizLicenseResourceId != null) {
            this.BizLicenseResourceId = new String(source.BizLicenseResourceId);
        }
        if (source.OrganizationName != null) {
            this.OrganizationName = new String(source.OrganizationName);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.OrganizationType != null) {
            this.OrganizationType = new String(source.OrganizationType);
        }
        if (source.LegalName != null) {
            this.LegalName = new String(source.LegalName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamSimple(map, prefix + "BizLicenseResourceId", this.BizLicenseResourceId);
        this.setParamSimple(map, prefix + "OrganizationName", this.OrganizationName);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "OrganizationType", this.OrganizationType);
        this.setParamSimple(map, prefix + "LegalName", this.LegalName);

    }
}

