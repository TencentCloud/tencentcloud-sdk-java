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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateUserVerifyUrlRequest extends AbstractModel {

    /**
    * 操作人信息
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * 要实名的姓名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 要实名的身份证号码，
身份证号码如果有x的话，统一传大写X
    */
    @SerializedName("IdCardNumber")
    @Expose
    private String IdCardNumber;

    /**
    * 证件类型，目前只支持身份证类型：ID_CARD
    */
    @SerializedName("IdCardType")
    @Expose
    private String IdCardType;

    /**
    * 要实名的手机号，兼容带+86的格式
    */
    @SerializedName("Mobile")
    @Expose
    private String Mobile;

    /**
    * 要跳转的链接类型

- HTTP：
跳转电子签小程序的http_url,短信通知或者H5跳转适合此类型 ，此时返回长链 (默认类型)

- HTTP_SHORT_URL：
跳转电子签小程序的http_url,短信通知或者H5跳转适合此类型，此时返回短链

- APP：
第三方APP或小程序跳转电子签小程序的path, APP或者小程序跳转适合此类型
    */
    @SerializedName("Endpoint")
    @Expose
    private String Endpoint;

    /**
    * 签署完成后是否自动回跳
<ul><li>false：否, 实名完成不会自动跳转回来(默认)</li><li>true：是, 实名完成会自动跳转回来</li></ul>

注: 
1. 该参数<font color="red">只针对APP类型（电子签小程序跳转贵方小程序）场景</font> 的实名链接有效
2. <font color="red">手机应用APP 或 微信小程序需要监控界面的返回走后序逻辑</font>, 微信小程序的文档可以参考[这个](https://developers.weixin.qq.com/miniprogram/dev/reference/api/App.html#onShow-Object-object)
3. <font color="red">电子签小程序跳转贵方APP，不支持自动跳转，必需用户手动点击完成按钮（微信的限制）</font> 
    */
    @SerializedName("AutoJumpBack")
    @Expose
    private Boolean AutoJumpBack;

    /**
     * Get 操作人信息 
     * @return Operator 操作人信息
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作人信息
     * @param Operator 操作人信息
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 要实名的姓名 
     * @return Name 要实名的姓名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 要实名的姓名
     * @param Name 要实名的姓名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 要实名的身份证号码，
身份证号码如果有x的话，统一传大写X 
     * @return IdCardNumber 要实名的身份证号码，
身份证号码如果有x的话，统一传大写X
     */
    public String getIdCardNumber() {
        return this.IdCardNumber;
    }

    /**
     * Set 要实名的身份证号码，
身份证号码如果有x的话，统一传大写X
     * @param IdCardNumber 要实名的身份证号码，
身份证号码如果有x的话，统一传大写X
     */
    public void setIdCardNumber(String IdCardNumber) {
        this.IdCardNumber = IdCardNumber;
    }

    /**
     * Get 证件类型，目前只支持身份证类型：ID_CARD 
     * @return IdCardType 证件类型，目前只支持身份证类型：ID_CARD
     */
    public String getIdCardType() {
        return this.IdCardType;
    }

    /**
     * Set 证件类型，目前只支持身份证类型：ID_CARD
     * @param IdCardType 证件类型，目前只支持身份证类型：ID_CARD
     */
    public void setIdCardType(String IdCardType) {
        this.IdCardType = IdCardType;
    }

    /**
     * Get 要实名的手机号，兼容带+86的格式 
     * @return Mobile 要实名的手机号，兼容带+86的格式
     */
    public String getMobile() {
        return this.Mobile;
    }

    /**
     * Set 要实名的手机号，兼容带+86的格式
     * @param Mobile 要实名的手机号，兼容带+86的格式
     */
    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }

    /**
     * Get 要跳转的链接类型

- HTTP：
跳转电子签小程序的http_url,短信通知或者H5跳转适合此类型 ，此时返回长链 (默认类型)

- HTTP_SHORT_URL：
跳转电子签小程序的http_url,短信通知或者H5跳转适合此类型，此时返回短链

- APP：
第三方APP或小程序跳转电子签小程序的path, APP或者小程序跳转适合此类型 
     * @return Endpoint 要跳转的链接类型

- HTTP：
跳转电子签小程序的http_url,短信通知或者H5跳转适合此类型 ，此时返回长链 (默认类型)

- HTTP_SHORT_URL：
跳转电子签小程序的http_url,短信通知或者H5跳转适合此类型，此时返回短链

- APP：
第三方APP或小程序跳转电子签小程序的path, APP或者小程序跳转适合此类型
     */
    public String getEndpoint() {
        return this.Endpoint;
    }

    /**
     * Set 要跳转的链接类型

- HTTP：
跳转电子签小程序的http_url,短信通知或者H5跳转适合此类型 ，此时返回长链 (默认类型)

- HTTP_SHORT_URL：
跳转电子签小程序的http_url,短信通知或者H5跳转适合此类型，此时返回短链

- APP：
第三方APP或小程序跳转电子签小程序的path, APP或者小程序跳转适合此类型
     * @param Endpoint 要跳转的链接类型

- HTTP：
跳转电子签小程序的http_url,短信通知或者H5跳转适合此类型 ，此时返回长链 (默认类型)

- HTTP_SHORT_URL：
跳转电子签小程序的http_url,短信通知或者H5跳转适合此类型，此时返回短链

- APP：
第三方APP或小程序跳转电子签小程序的path, APP或者小程序跳转适合此类型
     */
    public void setEndpoint(String Endpoint) {
        this.Endpoint = Endpoint;
    }

    /**
     * Get 签署完成后是否自动回跳
<ul><li>false：否, 实名完成不会自动跳转回来(默认)</li><li>true：是, 实名完成会自动跳转回来</li></ul>

注: 
1. 该参数<font color="red">只针对APP类型（电子签小程序跳转贵方小程序）场景</font> 的实名链接有效
2. <font color="red">手机应用APP 或 微信小程序需要监控界面的返回走后序逻辑</font>, 微信小程序的文档可以参考[这个](https://developers.weixin.qq.com/miniprogram/dev/reference/api/App.html#onShow-Object-object)
3. <font color="red">电子签小程序跳转贵方APP，不支持自动跳转，必需用户手动点击完成按钮（微信的限制）</font>  
     * @return AutoJumpBack 签署完成后是否自动回跳
<ul><li>false：否, 实名完成不会自动跳转回来(默认)</li><li>true：是, 实名完成会自动跳转回来</li></ul>

注: 
1. 该参数<font color="red">只针对APP类型（电子签小程序跳转贵方小程序）场景</font> 的实名链接有效
2. <font color="red">手机应用APP 或 微信小程序需要监控界面的返回走后序逻辑</font>, 微信小程序的文档可以参考[这个](https://developers.weixin.qq.com/miniprogram/dev/reference/api/App.html#onShow-Object-object)
3. <font color="red">电子签小程序跳转贵方APP，不支持自动跳转，必需用户手动点击完成按钮（微信的限制）</font> 
     */
    public Boolean getAutoJumpBack() {
        return this.AutoJumpBack;
    }

    /**
     * Set 签署完成后是否自动回跳
<ul><li>false：否, 实名完成不会自动跳转回来(默认)</li><li>true：是, 实名完成会自动跳转回来</li></ul>

注: 
1. 该参数<font color="red">只针对APP类型（电子签小程序跳转贵方小程序）场景</font> 的实名链接有效
2. <font color="red">手机应用APP 或 微信小程序需要监控界面的返回走后序逻辑</font>, 微信小程序的文档可以参考[这个](https://developers.weixin.qq.com/miniprogram/dev/reference/api/App.html#onShow-Object-object)
3. <font color="red">电子签小程序跳转贵方APP，不支持自动跳转，必需用户手动点击完成按钮（微信的限制）</font> 
     * @param AutoJumpBack 签署完成后是否自动回跳
<ul><li>false：否, 实名完成不会自动跳转回来(默认)</li><li>true：是, 实名完成会自动跳转回来</li></ul>

注: 
1. 该参数<font color="red">只针对APP类型（电子签小程序跳转贵方小程序）场景</font> 的实名链接有效
2. <font color="red">手机应用APP 或 微信小程序需要监控界面的返回走后序逻辑</font>, 微信小程序的文档可以参考[这个](https://developers.weixin.qq.com/miniprogram/dev/reference/api/App.html#onShow-Object-object)
3. <font color="red">电子签小程序跳转贵方APP，不支持自动跳转，必需用户手动点击完成按钮（微信的限制）</font> 
     */
    public void setAutoJumpBack(Boolean AutoJumpBack) {
        this.AutoJumpBack = AutoJumpBack;
    }

    public CreateUserVerifyUrlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateUserVerifyUrlRequest(CreateUserVerifyUrlRequest source) {
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.IdCardNumber != null) {
            this.IdCardNumber = new String(source.IdCardNumber);
        }
        if (source.IdCardType != null) {
            this.IdCardType = new String(source.IdCardType);
        }
        if (source.Mobile != null) {
            this.Mobile = new String(source.Mobile);
        }
        if (source.Endpoint != null) {
            this.Endpoint = new String(source.Endpoint);
        }
        if (source.AutoJumpBack != null) {
            this.AutoJumpBack = new Boolean(source.AutoJumpBack);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "IdCardNumber", this.IdCardNumber);
        this.setParamSimple(map, prefix + "IdCardType", this.IdCardType);
        this.setParamSimple(map, prefix + "Mobile", this.Mobile);
        this.setParamSimple(map, prefix + "Endpoint", this.Endpoint);
        this.setParamSimple(map, prefix + "AutoJumpBack", this.AutoJumpBack);

    }
}

