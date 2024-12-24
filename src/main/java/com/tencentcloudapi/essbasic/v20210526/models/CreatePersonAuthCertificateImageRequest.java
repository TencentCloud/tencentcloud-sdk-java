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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreatePersonAuthCertificateImageRequest extends AbstractModel {

    /**
    * 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * 个人用户名称
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 证件类型，支持以下类型<ul><li> ID_CARD  : 中国大陆居民身份证 (默认值)</li><li> HONGKONG_AND_MACAO  : 中国港澳居民来往内地通行证</li><li> HONGKONG_MACAO_AND_TAIWAN  : 中国港澳台居民居住证(格式同中国大陆居民身份证)</li></ul>
    */
    @SerializedName("IdCardType")
    @Expose
    private String IdCardType;

    /**
    * 证件号码，应符合以下规则<ul><li>居民身份证号码应为18位字符串，由数字和大写字母X组成（如存在X，请大写）。</li><li>港澳居民来往内地通行证号码共11位。第1位为字母，“H”字头签发给中国香港居民，“M”字头签发给中国澳门居民；第2位至第11位为数字。</li><li>港澳台居民居住证号码编码规则与中国大陆身份证相同，应为18位字符串。</li></ul>
    */
    @SerializedName("IdCardNumber")
    @Expose
    private String IdCardNumber;

    /**
    * 自动签使用的场景值, 可以选择的场景值如下:<ul><li> **E_PRESCRIPTION_AUTO_SIGN** :  电子处方场景</li><li> **OTHER** :  通用场景</li></ul>注: `不传默认为处方单场景，即E_PRESCRIPTION_AUTO_SIGN`
    */
    @SerializedName("SceneKey")
    @Expose
    private String SceneKey;

    /**
     * Get 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。 
     * @return Agent 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。
     * @param Agent 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get 个人用户名称 
     * @return UserName 个人用户名称
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 个人用户名称
     * @param UserName 个人用户名称
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 证件类型，支持以下类型<ul><li> ID_CARD  : 中国大陆居民身份证 (默认值)</li><li> HONGKONG_AND_MACAO  : 中国港澳居民来往内地通行证</li><li> HONGKONG_MACAO_AND_TAIWAN  : 中国港澳台居民居住证(格式同中国大陆居民身份证)</li></ul> 
     * @return IdCardType 证件类型，支持以下类型<ul><li> ID_CARD  : 中国大陆居民身份证 (默认值)</li><li> HONGKONG_AND_MACAO  : 中国港澳居民来往内地通行证</li><li> HONGKONG_MACAO_AND_TAIWAN  : 中国港澳台居民居住证(格式同中国大陆居民身份证)</li></ul>
     */
    public String getIdCardType() {
        return this.IdCardType;
    }

    /**
     * Set 证件类型，支持以下类型<ul><li> ID_CARD  : 中国大陆居民身份证 (默认值)</li><li> HONGKONG_AND_MACAO  : 中国港澳居民来往内地通行证</li><li> HONGKONG_MACAO_AND_TAIWAN  : 中国港澳台居民居住证(格式同中国大陆居民身份证)</li></ul>
     * @param IdCardType 证件类型，支持以下类型<ul><li> ID_CARD  : 中国大陆居民身份证 (默认值)</li><li> HONGKONG_AND_MACAO  : 中国港澳居民来往内地通行证</li><li> HONGKONG_MACAO_AND_TAIWAN  : 中国港澳台居民居住证(格式同中国大陆居民身份证)</li></ul>
     */
    public void setIdCardType(String IdCardType) {
        this.IdCardType = IdCardType;
    }

    /**
     * Get 证件号码，应符合以下规则<ul><li>居民身份证号码应为18位字符串，由数字和大写字母X组成（如存在X，请大写）。</li><li>港澳居民来往内地通行证号码共11位。第1位为字母，“H”字头签发给中国香港居民，“M”字头签发给中国澳门居民；第2位至第11位为数字。</li><li>港澳台居民居住证号码编码规则与中国大陆身份证相同，应为18位字符串。</li></ul> 
     * @return IdCardNumber 证件号码，应符合以下规则<ul><li>居民身份证号码应为18位字符串，由数字和大写字母X组成（如存在X，请大写）。</li><li>港澳居民来往内地通行证号码共11位。第1位为字母，“H”字头签发给中国香港居民，“M”字头签发给中国澳门居民；第2位至第11位为数字。</li><li>港澳台居民居住证号码编码规则与中国大陆身份证相同，应为18位字符串。</li></ul>
     */
    public String getIdCardNumber() {
        return this.IdCardNumber;
    }

    /**
     * Set 证件号码，应符合以下规则<ul><li>居民身份证号码应为18位字符串，由数字和大写字母X组成（如存在X，请大写）。</li><li>港澳居民来往内地通行证号码共11位。第1位为字母，“H”字头签发给中国香港居民，“M”字头签发给中国澳门居民；第2位至第11位为数字。</li><li>港澳台居民居住证号码编码规则与中国大陆身份证相同，应为18位字符串。</li></ul>
     * @param IdCardNumber 证件号码，应符合以下规则<ul><li>居民身份证号码应为18位字符串，由数字和大写字母X组成（如存在X，请大写）。</li><li>港澳居民来往内地通行证号码共11位。第1位为字母，“H”字头签发给中国香港居民，“M”字头签发给中国澳门居民；第2位至第11位为数字。</li><li>港澳台居民居住证号码编码规则与中国大陆身份证相同，应为18位字符串。</li></ul>
     */
    public void setIdCardNumber(String IdCardNumber) {
        this.IdCardNumber = IdCardNumber;
    }

    /**
     * Get 自动签使用的场景值, 可以选择的场景值如下:<ul><li> **E_PRESCRIPTION_AUTO_SIGN** :  电子处方场景</li><li> **OTHER** :  通用场景</li></ul>注: `不传默认为处方单场景，即E_PRESCRIPTION_AUTO_SIGN` 
     * @return SceneKey 自动签使用的场景值, 可以选择的场景值如下:<ul><li> **E_PRESCRIPTION_AUTO_SIGN** :  电子处方场景</li><li> **OTHER** :  通用场景</li></ul>注: `不传默认为处方单场景，即E_PRESCRIPTION_AUTO_SIGN`
     */
    public String getSceneKey() {
        return this.SceneKey;
    }

    /**
     * Set 自动签使用的场景值, 可以选择的场景值如下:<ul><li> **E_PRESCRIPTION_AUTO_SIGN** :  电子处方场景</li><li> **OTHER** :  通用场景</li></ul>注: `不传默认为处方单场景，即E_PRESCRIPTION_AUTO_SIGN`
     * @param SceneKey 自动签使用的场景值, 可以选择的场景值如下:<ul><li> **E_PRESCRIPTION_AUTO_SIGN** :  电子处方场景</li><li> **OTHER** :  通用场景</li></ul>注: `不传默认为处方单场景，即E_PRESCRIPTION_AUTO_SIGN`
     */
    public void setSceneKey(String SceneKey) {
        this.SceneKey = SceneKey;
    }

    public CreatePersonAuthCertificateImageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreatePersonAuthCertificateImageRequest(CreatePersonAuthCertificateImageRequest source) {
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.IdCardType != null) {
            this.IdCardType = new String(source.IdCardType);
        }
        if (source.IdCardNumber != null) {
            this.IdCardNumber = new String(source.IdCardNumber);
        }
        if (source.SceneKey != null) {
            this.SceneKey = new String(source.SceneKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "IdCardType", this.IdCardType);
        this.setParamSimple(map, prefix + "IdCardNumber", this.IdCardNumber);
        this.setParamSimple(map, prefix + "SceneKey", this.SceneKey);

    }
}

