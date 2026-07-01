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

public class PresetApproverInfo extends AbstractModel {

    /**
    * <p>预设参与方姓名。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>预设参与方手机号。</p>
    */
    @SerializedName("Mobile")
    @Expose
    private String Mobile;

    /**
    * <p>预设参与方证件号，需要和IdCardType同时传入。</p><p>证件号码，应符合以下规则</p><ul><li>中国大陆居民身份证号码应为18位字符串，由数字和大写字母X组成(如存在X，请大写)。</li></ul>
    */
    @SerializedName("IdCardNumber")
    @Expose
    private String IdCardNumber;

    /**
    * <p>预设参与方的证件类型，需要与IdCardNumber同时传入。</p><p>证件类型，支持以下类型</p><ul><li><b>ID_CARD</b>: 居民身份证</li></ul>
    */
    @SerializedName("IdCardType")
    @Expose
    private String IdCardType;

    /**
    * <p>企业用户动态签署方场景指定预设企业名称。<code>注意：1. 若为企业动态签署方场景，此参数必须要指定。2. 企业动态签署方场景暂不支持指定姓名证件手机号等参数，仅支持指定企业名称。3. 暂不支持指定子客企业，此处预设的企业仅支持SaaS企业。</code></p>
    */
    @SerializedName("OrganizationName")
    @Expose
    private String OrganizationName;

    /**
     * Get <p>预设参与方姓名。</p> 
     * @return Name <p>预设参与方姓名。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>预设参与方姓名。</p>
     * @param Name <p>预设参与方姓名。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>预设参与方手机号。</p> 
     * @return Mobile <p>预设参与方手机号。</p>
     */
    public String getMobile() {
        return this.Mobile;
    }

    /**
     * Set <p>预设参与方手机号。</p>
     * @param Mobile <p>预设参与方手机号。</p>
     */
    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }

    /**
     * Get <p>预设参与方证件号，需要和IdCardType同时传入。</p><p>证件号码，应符合以下规则</p><ul><li>中国大陆居民身份证号码应为18位字符串，由数字和大写字母X组成(如存在X，请大写)。</li></ul> 
     * @return IdCardNumber <p>预设参与方证件号，需要和IdCardType同时传入。</p><p>证件号码，应符合以下规则</p><ul><li>中国大陆居民身份证号码应为18位字符串，由数字和大写字母X组成(如存在X，请大写)。</li></ul>
     */
    public String getIdCardNumber() {
        return this.IdCardNumber;
    }

    /**
     * Set <p>预设参与方证件号，需要和IdCardType同时传入。</p><p>证件号码，应符合以下规则</p><ul><li>中国大陆居民身份证号码应为18位字符串，由数字和大写字母X组成(如存在X，请大写)。</li></ul>
     * @param IdCardNumber <p>预设参与方证件号，需要和IdCardType同时传入。</p><p>证件号码，应符合以下规则</p><ul><li>中国大陆居民身份证号码应为18位字符串，由数字和大写字母X组成(如存在X，请大写)。</li></ul>
     */
    public void setIdCardNumber(String IdCardNumber) {
        this.IdCardNumber = IdCardNumber;
    }

    /**
     * Get <p>预设参与方的证件类型，需要与IdCardNumber同时传入。</p><p>证件类型，支持以下类型</p><ul><li><b>ID_CARD</b>: 居民身份证</li></ul> 
     * @return IdCardType <p>预设参与方的证件类型，需要与IdCardNumber同时传入。</p><p>证件类型，支持以下类型</p><ul><li><b>ID_CARD</b>: 居民身份证</li></ul>
     */
    public String getIdCardType() {
        return this.IdCardType;
    }

    /**
     * Set <p>预设参与方的证件类型，需要与IdCardNumber同时传入。</p><p>证件类型，支持以下类型</p><ul><li><b>ID_CARD</b>: 居民身份证</li></ul>
     * @param IdCardType <p>预设参与方的证件类型，需要与IdCardNumber同时传入。</p><p>证件类型，支持以下类型</p><ul><li><b>ID_CARD</b>: 居民身份证</li></ul>
     */
    public void setIdCardType(String IdCardType) {
        this.IdCardType = IdCardType;
    }

    /**
     * Get <p>企业用户动态签署方场景指定预设企业名称。<code>注意：1. 若为企业动态签署方场景，此参数必须要指定。2. 企业动态签署方场景暂不支持指定姓名证件手机号等参数，仅支持指定企业名称。3. 暂不支持指定子客企业，此处预设的企业仅支持SaaS企业。</code></p> 
     * @return OrganizationName <p>企业用户动态签署方场景指定预设企业名称。<code>注意：1. 若为企业动态签署方场景，此参数必须要指定。2. 企业动态签署方场景暂不支持指定姓名证件手机号等参数，仅支持指定企业名称。3. 暂不支持指定子客企业，此处预设的企业仅支持SaaS企业。</code></p>
     */
    public String getOrganizationName() {
        return this.OrganizationName;
    }

    /**
     * Set <p>企业用户动态签署方场景指定预设企业名称。<code>注意：1. 若为企业动态签署方场景，此参数必须要指定。2. 企业动态签署方场景暂不支持指定姓名证件手机号等参数，仅支持指定企业名称。3. 暂不支持指定子客企业，此处预设的企业仅支持SaaS企业。</code></p>
     * @param OrganizationName <p>企业用户动态签署方场景指定预设企业名称。<code>注意：1. 若为企业动态签署方场景，此参数必须要指定。2. 企业动态签署方场景暂不支持指定姓名证件手机号等参数，仅支持指定企业名称。3. 暂不支持指定子客企业，此处预设的企业仅支持SaaS企业。</code></p>
     */
    public void setOrganizationName(String OrganizationName) {
        this.OrganizationName = OrganizationName;
    }

    public PresetApproverInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PresetApproverInfo(PresetApproverInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Mobile != null) {
            this.Mobile = new String(source.Mobile);
        }
        if (source.IdCardNumber != null) {
            this.IdCardNumber = new String(source.IdCardNumber);
        }
        if (source.IdCardType != null) {
            this.IdCardType = new String(source.IdCardType);
        }
        if (source.OrganizationName != null) {
            this.OrganizationName = new String(source.OrganizationName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Mobile", this.Mobile);
        this.setParamSimple(map, prefix + "IdCardNumber", this.IdCardNumber);
        this.setParamSimple(map, prefix + "IdCardType", this.IdCardType);
        this.setParamSimple(map, prefix + "OrganizationName", this.OrganizationName);

    }
}

