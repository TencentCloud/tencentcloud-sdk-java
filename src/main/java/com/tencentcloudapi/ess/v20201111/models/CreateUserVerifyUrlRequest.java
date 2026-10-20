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

public class CreateUserVerifyUrlRequest extends AbstractModel {

    /**
    * <p>操作人信息</p>
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * <p>要实名的姓名</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>要实名的身份证号码，<br>身份证号码如果有x的话，统一传大写X</p>
    */
    @SerializedName("IdCardNumber")
    @Expose
    private String IdCardNumber;

    /**
    * <p>证件类型，支持以下类型，样式可以参考<a href="https://qian.tencent.com/developers/partner/id_card_support/" target="_blank">常见个人证件类型介绍</a></p><ul><li>ID_CARD 中国大陆居民身份证  (默认值)</li><li>HONGKONG_AND_MACAO 港澳居民来往内地通行证</li><li>HONGKONG_MACAO_AND_TAIWAN 港澳台居民居住证(格式同居民身份证)</li></ul><p>注:  港澳居民来往内地通行证 和  港澳台居民居住证 类型的签署人<b>至少要过一次大陆的海关</b>才能使用。</p>
    */
    @SerializedName("IdCardType")
    @Expose
    private String IdCardType;

    /**
    * <p>要实名的手机号，兼容带+86的格式</p>
    */
    @SerializedName("Mobile")
    @Expose
    private String Mobile;

    /**
    * <p>实名完之后的跳转链接，最大长度1000个字符。<br>链接类型请参考 <a href="https://qian.tencent.com/developers/company/openqianh5" target="_blank">跳转电子签H5</a>。</p><p>注：此参数仅支持 Endpoint 为 <font color="red">H5 或 H5_SHORT_URL </font>的时候传递</p>
    */
    @SerializedName("JumpUrl")
    @Expose
    private String JumpUrl;

    /**
    * <p>要跳转的链接类型</p><ul><li><strong>HTTP</strong>：适用于短信通知或H5跳转的电子签小程序HTTP长链接</li><li><strong>HTTP_SHORT_URL</strong>：适用于短信通知或H5跳转的电子签小程序HTTP短链接</li><li><strong>APP</strong>：（默认类型）适用于第三方APP或小程序跳转的电子签小程序路径</li><li><strong>H5</strong>：适用于跳转至电子签H5实名页面的长链接</li><li><strong>H5_SHORT_URL</strong>：适用于跳转至电子签H5实名页面的短链接</li></ul><p>注：如果不传递，默认值是 <font color="red"> APP </font></p>
    */
    @SerializedName("Endpoint")
    @Expose
    private String Endpoint;

    /**
    * <p>签署完成后是否自动回跳</p><ul><li>false：否, 实名完成不会自动跳转回来(默认)</li><li>true：是, 实名完成会自动跳转回来</li></ul><p>注: </p><ol><li>该参数<font color="red">只针对APP类型（第三方APP或小程序跳转电子签小程序）场景</font> 的实名链接有效</li><li><font color="red">手机应用APP 或 微信小程序需要监控界面的返回走后序逻辑</font>, 微信小程序的文档可以参考<a href="https://developers.weixin.qq.com/miniprogram/dev/reference/api/App.html#onShow-Object-object">这个</a></li><li><font color="red">电子签小程序跳转贵方APP，不支持自动跳转，必需用户手动点击完成按钮（微信的限制）</font></li></ol>
    */
    @SerializedName("AutoJumpBack")
    @Expose
    private Boolean AutoJumpBack;

    /**
    * <p>在用户完成实名认证后，其自定义数据将通过<a href="https://qian.tencent.com/developers/company/callback_types_staffs/#%E5%8D%81%E4%BA%8C-%E4%BC%81%E4%B8%9A%E5%BC%95%E5%AF%BC%E4%B8%AA%E4%BA%BA%E5%AE%9E%E5%90%8D%E8%AE%A4%E8%AF%81%E5%90%8E%E5%9B%9E%E8%B0%83">企业引导个人实名认证后回调</a>返回，以便用户确认其个人数据信息。请注意，自定义数据的字符长度上限为1000，且必须采用base64编码格式。</p>
    */
    @SerializedName("UserData")
    @Expose
    private String UserData;

    /**
     * Get <p>操作人信息</p> 
     * @return Operator <p>操作人信息</p>
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set <p>操作人信息</p>
     * @param Operator <p>操作人信息</p>
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get <p>要实名的姓名</p> 
     * @return Name <p>要实名的姓名</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>要实名的姓名</p>
     * @param Name <p>要实名的姓名</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>要实名的身份证号码，<br>身份证号码如果有x的话，统一传大写X</p> 
     * @return IdCardNumber <p>要实名的身份证号码，<br>身份证号码如果有x的话，统一传大写X</p>
     */
    public String getIdCardNumber() {
        return this.IdCardNumber;
    }

    /**
     * Set <p>要实名的身份证号码，<br>身份证号码如果有x的话，统一传大写X</p>
     * @param IdCardNumber <p>要实名的身份证号码，<br>身份证号码如果有x的话，统一传大写X</p>
     */
    public void setIdCardNumber(String IdCardNumber) {
        this.IdCardNumber = IdCardNumber;
    }

    /**
     * Get <p>证件类型，支持以下类型，样式可以参考<a href="https://qian.tencent.com/developers/partner/id_card_support/" target="_blank">常见个人证件类型介绍</a></p><ul><li>ID_CARD 中国大陆居民身份证  (默认值)</li><li>HONGKONG_AND_MACAO 港澳居民来往内地通行证</li><li>HONGKONG_MACAO_AND_TAIWAN 港澳台居民居住证(格式同居民身份证)</li></ul><p>注:  港澳居民来往内地通行证 和  港澳台居民居住证 类型的签署人<b>至少要过一次大陆的海关</b>才能使用。</p> 
     * @return IdCardType <p>证件类型，支持以下类型，样式可以参考<a href="https://qian.tencent.com/developers/partner/id_card_support/" target="_blank">常见个人证件类型介绍</a></p><ul><li>ID_CARD 中国大陆居民身份证  (默认值)</li><li>HONGKONG_AND_MACAO 港澳居民来往内地通行证</li><li>HONGKONG_MACAO_AND_TAIWAN 港澳台居民居住证(格式同居民身份证)</li></ul><p>注:  港澳居民来往内地通行证 和  港澳台居民居住证 类型的签署人<b>至少要过一次大陆的海关</b>才能使用。</p>
     */
    public String getIdCardType() {
        return this.IdCardType;
    }

    /**
     * Set <p>证件类型，支持以下类型，样式可以参考<a href="https://qian.tencent.com/developers/partner/id_card_support/" target="_blank">常见个人证件类型介绍</a></p><ul><li>ID_CARD 中国大陆居民身份证  (默认值)</li><li>HONGKONG_AND_MACAO 港澳居民来往内地通行证</li><li>HONGKONG_MACAO_AND_TAIWAN 港澳台居民居住证(格式同居民身份证)</li></ul><p>注:  港澳居民来往内地通行证 和  港澳台居民居住证 类型的签署人<b>至少要过一次大陆的海关</b>才能使用。</p>
     * @param IdCardType <p>证件类型，支持以下类型，样式可以参考<a href="https://qian.tencent.com/developers/partner/id_card_support/" target="_blank">常见个人证件类型介绍</a></p><ul><li>ID_CARD 中国大陆居民身份证  (默认值)</li><li>HONGKONG_AND_MACAO 港澳居民来往内地通行证</li><li>HONGKONG_MACAO_AND_TAIWAN 港澳台居民居住证(格式同居民身份证)</li></ul><p>注:  港澳居民来往内地通行证 和  港澳台居民居住证 类型的签署人<b>至少要过一次大陆的海关</b>才能使用。</p>
     */
    public void setIdCardType(String IdCardType) {
        this.IdCardType = IdCardType;
    }

    /**
     * Get <p>要实名的手机号，兼容带+86的格式</p> 
     * @return Mobile <p>要实名的手机号，兼容带+86的格式</p>
     */
    public String getMobile() {
        return this.Mobile;
    }

    /**
     * Set <p>要实名的手机号，兼容带+86的格式</p>
     * @param Mobile <p>要实名的手机号，兼容带+86的格式</p>
     */
    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }

    /**
     * Get <p>实名完之后的跳转链接，最大长度1000个字符。<br>链接类型请参考 <a href="https://qian.tencent.com/developers/company/openqianh5" target="_blank">跳转电子签H5</a>。</p><p>注：此参数仅支持 Endpoint 为 <font color="red">H5 或 H5_SHORT_URL </font>的时候传递</p> 
     * @return JumpUrl <p>实名完之后的跳转链接，最大长度1000个字符。<br>链接类型请参考 <a href="https://qian.tencent.com/developers/company/openqianh5" target="_blank">跳转电子签H5</a>。</p><p>注：此参数仅支持 Endpoint 为 <font color="red">H5 或 H5_SHORT_URL </font>的时候传递</p>
     */
    public String getJumpUrl() {
        return this.JumpUrl;
    }

    /**
     * Set <p>实名完之后的跳转链接，最大长度1000个字符。<br>链接类型请参考 <a href="https://qian.tencent.com/developers/company/openqianh5" target="_blank">跳转电子签H5</a>。</p><p>注：此参数仅支持 Endpoint 为 <font color="red">H5 或 H5_SHORT_URL </font>的时候传递</p>
     * @param JumpUrl <p>实名完之后的跳转链接，最大长度1000个字符。<br>链接类型请参考 <a href="https://qian.tencent.com/developers/company/openqianh5" target="_blank">跳转电子签H5</a>。</p><p>注：此参数仅支持 Endpoint 为 <font color="red">H5 或 H5_SHORT_URL </font>的时候传递</p>
     */
    public void setJumpUrl(String JumpUrl) {
        this.JumpUrl = JumpUrl;
    }

    /**
     * Get <p>要跳转的链接类型</p><ul><li><strong>HTTP</strong>：适用于短信通知或H5跳转的电子签小程序HTTP长链接</li><li><strong>HTTP_SHORT_URL</strong>：适用于短信通知或H5跳转的电子签小程序HTTP短链接</li><li><strong>APP</strong>：（默认类型）适用于第三方APP或小程序跳转的电子签小程序路径</li><li><strong>H5</strong>：适用于跳转至电子签H5实名页面的长链接</li><li><strong>H5_SHORT_URL</strong>：适用于跳转至电子签H5实名页面的短链接</li></ul><p>注：如果不传递，默认值是 <font color="red"> APP </font></p> 
     * @return Endpoint <p>要跳转的链接类型</p><ul><li><strong>HTTP</strong>：适用于短信通知或H5跳转的电子签小程序HTTP长链接</li><li><strong>HTTP_SHORT_URL</strong>：适用于短信通知或H5跳转的电子签小程序HTTP短链接</li><li><strong>APP</strong>：（默认类型）适用于第三方APP或小程序跳转的电子签小程序路径</li><li><strong>H5</strong>：适用于跳转至电子签H5实名页面的长链接</li><li><strong>H5_SHORT_URL</strong>：适用于跳转至电子签H5实名页面的短链接</li></ul><p>注：如果不传递，默认值是 <font color="red"> APP </font></p>
     */
    public String getEndpoint() {
        return this.Endpoint;
    }

    /**
     * Set <p>要跳转的链接类型</p><ul><li><strong>HTTP</strong>：适用于短信通知或H5跳转的电子签小程序HTTP长链接</li><li><strong>HTTP_SHORT_URL</strong>：适用于短信通知或H5跳转的电子签小程序HTTP短链接</li><li><strong>APP</strong>：（默认类型）适用于第三方APP或小程序跳转的电子签小程序路径</li><li><strong>H5</strong>：适用于跳转至电子签H5实名页面的长链接</li><li><strong>H5_SHORT_URL</strong>：适用于跳转至电子签H5实名页面的短链接</li></ul><p>注：如果不传递，默认值是 <font color="red"> APP </font></p>
     * @param Endpoint <p>要跳转的链接类型</p><ul><li><strong>HTTP</strong>：适用于短信通知或H5跳转的电子签小程序HTTP长链接</li><li><strong>HTTP_SHORT_URL</strong>：适用于短信通知或H5跳转的电子签小程序HTTP短链接</li><li><strong>APP</strong>：（默认类型）适用于第三方APP或小程序跳转的电子签小程序路径</li><li><strong>H5</strong>：适用于跳转至电子签H5实名页面的长链接</li><li><strong>H5_SHORT_URL</strong>：适用于跳转至电子签H5实名页面的短链接</li></ul><p>注：如果不传递，默认值是 <font color="red"> APP </font></p>
     */
    public void setEndpoint(String Endpoint) {
        this.Endpoint = Endpoint;
    }

    /**
     * Get <p>签署完成后是否自动回跳</p><ul><li>false：否, 实名完成不会自动跳转回来(默认)</li><li>true：是, 实名完成会自动跳转回来</li></ul><p>注: </p><ol><li>该参数<font color="red">只针对APP类型（第三方APP或小程序跳转电子签小程序）场景</font> 的实名链接有效</li><li><font color="red">手机应用APP 或 微信小程序需要监控界面的返回走后序逻辑</font>, 微信小程序的文档可以参考<a href="https://developers.weixin.qq.com/miniprogram/dev/reference/api/App.html#onShow-Object-object">这个</a></li><li><font color="red">电子签小程序跳转贵方APP，不支持自动跳转，必需用户手动点击完成按钮（微信的限制）</font></li></ol> 
     * @return AutoJumpBack <p>签署完成后是否自动回跳</p><ul><li>false：否, 实名完成不会自动跳转回来(默认)</li><li>true：是, 实名完成会自动跳转回来</li></ul><p>注: </p><ol><li>该参数<font color="red">只针对APP类型（第三方APP或小程序跳转电子签小程序）场景</font> 的实名链接有效</li><li><font color="red">手机应用APP 或 微信小程序需要监控界面的返回走后序逻辑</font>, 微信小程序的文档可以参考<a href="https://developers.weixin.qq.com/miniprogram/dev/reference/api/App.html#onShow-Object-object">这个</a></li><li><font color="red">电子签小程序跳转贵方APP，不支持自动跳转，必需用户手动点击完成按钮（微信的限制）</font></li></ol>
     */
    public Boolean getAutoJumpBack() {
        return this.AutoJumpBack;
    }

    /**
     * Set <p>签署完成后是否自动回跳</p><ul><li>false：否, 实名完成不会自动跳转回来(默认)</li><li>true：是, 实名完成会自动跳转回来</li></ul><p>注: </p><ol><li>该参数<font color="red">只针对APP类型（第三方APP或小程序跳转电子签小程序）场景</font> 的实名链接有效</li><li><font color="red">手机应用APP 或 微信小程序需要监控界面的返回走后序逻辑</font>, 微信小程序的文档可以参考<a href="https://developers.weixin.qq.com/miniprogram/dev/reference/api/App.html#onShow-Object-object">这个</a></li><li><font color="red">电子签小程序跳转贵方APP，不支持自动跳转，必需用户手动点击完成按钮（微信的限制）</font></li></ol>
     * @param AutoJumpBack <p>签署完成后是否自动回跳</p><ul><li>false：否, 实名完成不会自动跳转回来(默认)</li><li>true：是, 实名完成会自动跳转回来</li></ul><p>注: </p><ol><li>该参数<font color="red">只针对APP类型（第三方APP或小程序跳转电子签小程序）场景</font> 的实名链接有效</li><li><font color="red">手机应用APP 或 微信小程序需要监控界面的返回走后序逻辑</font>, 微信小程序的文档可以参考<a href="https://developers.weixin.qq.com/miniprogram/dev/reference/api/App.html#onShow-Object-object">这个</a></li><li><font color="red">电子签小程序跳转贵方APP，不支持自动跳转，必需用户手动点击完成按钮（微信的限制）</font></li></ol>
     */
    public void setAutoJumpBack(Boolean AutoJumpBack) {
        this.AutoJumpBack = AutoJumpBack;
    }

    /**
     * Get <p>在用户完成实名认证后，其自定义数据将通过<a href="https://qian.tencent.com/developers/company/callback_types_staffs/#%E5%8D%81%E4%BA%8C-%E4%BC%81%E4%B8%9A%E5%BC%95%E5%AF%BC%E4%B8%AA%E4%BA%BA%E5%AE%9E%E5%90%8D%E8%AE%A4%E8%AF%81%E5%90%8E%E5%9B%9E%E8%B0%83">企业引导个人实名认证后回调</a>返回，以便用户确认其个人数据信息。请注意，自定义数据的字符长度上限为1000，且必须采用base64编码格式。</p> 
     * @return UserData <p>在用户完成实名认证后，其自定义数据将通过<a href="https://qian.tencent.com/developers/company/callback_types_staffs/#%E5%8D%81%E4%BA%8C-%E4%BC%81%E4%B8%9A%E5%BC%95%E5%AF%BC%E4%B8%AA%E4%BA%BA%E5%AE%9E%E5%90%8D%E8%AE%A4%E8%AF%81%E5%90%8E%E5%9B%9E%E8%B0%83">企业引导个人实名认证后回调</a>返回，以便用户确认其个人数据信息。请注意，自定义数据的字符长度上限为1000，且必须采用base64编码格式。</p>
     */
    public String getUserData() {
        return this.UserData;
    }

    /**
     * Set <p>在用户完成实名认证后，其自定义数据将通过<a href="https://qian.tencent.com/developers/company/callback_types_staffs/#%E5%8D%81%E4%BA%8C-%E4%BC%81%E4%B8%9A%E5%BC%95%E5%AF%BC%E4%B8%AA%E4%BA%BA%E5%AE%9E%E5%90%8D%E8%AE%A4%E8%AF%81%E5%90%8E%E5%9B%9E%E8%B0%83">企业引导个人实名认证后回调</a>返回，以便用户确认其个人数据信息。请注意，自定义数据的字符长度上限为1000，且必须采用base64编码格式。</p>
     * @param UserData <p>在用户完成实名认证后，其自定义数据将通过<a href="https://qian.tencent.com/developers/company/callback_types_staffs/#%E5%8D%81%E4%BA%8C-%E4%BC%81%E4%B8%9A%E5%BC%95%E5%AF%BC%E4%B8%AA%E4%BA%BA%E5%AE%9E%E5%90%8D%E8%AE%A4%E8%AF%81%E5%90%8E%E5%9B%9E%E8%B0%83">企业引导个人实名认证后回调</a>返回，以便用户确认其个人数据信息。请注意，自定义数据的字符长度上限为1000，且必须采用base64编码格式。</p>
     */
    public void setUserData(String UserData) {
        this.UserData = UserData;
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
        if (source.JumpUrl != null) {
            this.JumpUrl = new String(source.JumpUrl);
        }
        if (source.Endpoint != null) {
            this.Endpoint = new String(source.Endpoint);
        }
        if (source.AutoJumpBack != null) {
            this.AutoJumpBack = new Boolean(source.AutoJumpBack);
        }
        if (source.UserData != null) {
            this.UserData = new String(source.UserData);
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
        this.setParamSimple(map, prefix + "JumpUrl", this.JumpUrl);
        this.setParamSimple(map, prefix + "Endpoint", this.Endpoint);
        this.setParamSimple(map, prefix + "AutoJumpBack", this.AutoJumpBack);
        this.setParamSimple(map, prefix + "UserData", this.UserData);

    }
}

