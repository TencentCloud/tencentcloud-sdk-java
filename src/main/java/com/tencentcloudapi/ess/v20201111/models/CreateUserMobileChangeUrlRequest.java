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

public class CreateUserMobileChangeUrlRequest extends AbstractModel {

    /**
    * 执行本接口操作的员工信息。使用此接口时，必须填写userId。 支持填入集团子公司经办人 userId 代发合同。  注: 在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * 代理企业和员工的信息。 在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * 如果您要修改企业员工用户ID，传递此用户ID即可，其他参数（Name，UserAccountType，IdCardType，IdCardNumber）将被忽略。如果不传此用户ID，则会使用其他参数来进行链接生成。

[点击查看用户ID的获取方式](https://res.ess.tencent.cn/cdn/tsign-developer-center/assets/images/%E7%BB%84%E7%BB%87%E6%9E%B6%E6%9E%84-47eb7105dd300e6dc0c502fba22688ae.png)
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 要修改手机号用户的类型。
<ul><li>0：员工 （默认）</li><li>1：个人</li>
</ul>
如果是员工类型，<b>只能修改本方员工，而不能修改其他企业的员工</b>。
如果是个人类型，可<b>不指定用户身份，生成的是固定的链接，当前登录电子签小程序的用户可进行换绑。</b>

    */
    @SerializedName("UserAccountType")
    @Expose
    private Long UserAccountType;

    /**
    * 要修改手机号用户的姓名，请确保填写的姓名为对方的真实姓名，而非昵称等代名。

如果没有传递 userId且 userAccountType 是 0 或者没有传递， 此参数为<b>必填项。</b>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 要修改手机号用户的证件类型，
目前支持的账号类型如下：

<ul><li><b>ID_CARD </b>: （默认）中国大陆居民身份证 </li>
<li><b>HONGKONG_AND_MACAO</b> : 港澳居民来往内地通行证</li>
<li><b>HONGKONG_MACAO_AND_TAIWAN </b>: 港澳台居民居住证(格式同中国大陆居民身份证)</li></ul>

    */
    @SerializedName("IdCardType")
    @Expose
    private String IdCardType;

    /**
    * 要修改手机号用户的身份证号码，应符合以下规则
<ul><li>中国大陆居民身份证号码应为18位字符串，由数字和大写字母X组成（如存在X，请大写）。</li>
<li>中国港澳居民来往内地通行证号码共11位。第1位为字母，“H”字头签发给中国香港居民，“M”字头签发给中国澳门居民；第2位至第11位为数字。</li>
<li>中国港澳台居民居住证号码编码规则与中国大陆身份证相同，应为18位字符串。</li></ul>
如果没有传递 userId且 userAccountType 是 0 或者没有传递， 此参数为<b>必填项。</b>
    */
    @SerializedName("IdCardNumber")
    @Expose
    private String IdCardNumber;

    /**
    * 要跳转的链接类型

<ul>
<li><b>HTTP</b>：（默认）跳转电子签小程序的http_url,短信通知或者H5跳转适合此类型 ，此时返回长链 (默认类型)</li>
<li><b>HTTP_SHORT_URL</b>：跳转电子签小程序的http_url,短信通知或者H5跳转适合此类型，此时返回短链</li>
<li><b>APP</b>：第三方APP或小程序跳转电子签小程序的path, APP或者小程序跳转适合此类型</li>
</ul>


    */
    @SerializedName("Endpoint")
    @Expose
    private String Endpoint;

    /**
    * 在用户完成实名认证后，其自定义数据将通过[手机号换绑回调](https://qian.tencent.com/developers/company/callback_types_staffs/#%E5%8D%81%E4%B8%89-%E4%B8%AA%E4%BA%BA%E5%91%98%E5%B7%A5%E6%89%8B%E6%9C%BA%E5%8F%B7%E4%BF%AE%E6%94%B9%E5%90%8E%E5%9B%9E%E8%B0%83)返回，以便用户确认其个人数据信息。请注意，自定义数据的字符长度上限为1000，且必须采用base64编码格式。

请注意：
此参数仅支持通过[获取c端用户实名链接](https://qian.tencent.com/developers/companyApis/users/CreateUserVerifyUrl)接口实名的用户生效。
    */
    @SerializedName("UserData")
    @Expose
    private String UserData;

    /**
     * Get 执行本接口操作的员工信息。使用此接口时，必须填写userId。 支持填入集团子公司经办人 userId 代发合同。  注: 在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。 
     * @return Operator 执行本接口操作的员工信息。使用此接口时，必须填写userId。 支持填入集团子公司经办人 userId 代发合同。  注: 在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 执行本接口操作的员工信息。使用此接口时，必须填写userId。 支持填入集团子公司经办人 userId 代发合同。  注: 在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。
     * @param Operator 执行本接口操作的员工信息。使用此接口时，必须填写userId。 支持填入集团子公司经办人 userId 代发合同。  注: 在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 代理企业和员工的信息。 在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。 
     * @return Agent 代理企业和员工的信息。 在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set 代理企业和员工的信息。 在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。
     * @param Agent 代理企业和员工的信息。 在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get 如果您要修改企业员工用户ID，传递此用户ID即可，其他参数（Name，UserAccountType，IdCardType，IdCardNumber）将被忽略。如果不传此用户ID，则会使用其他参数来进行链接生成。

[点击查看用户ID的获取方式](https://res.ess.tencent.cn/cdn/tsign-developer-center/assets/images/%E7%BB%84%E7%BB%87%E6%9E%B6%E6%9E%84-47eb7105dd300e6dc0c502fba22688ae.png) 
     * @return UserId 如果您要修改企业员工用户ID，传递此用户ID即可，其他参数（Name，UserAccountType，IdCardType，IdCardNumber）将被忽略。如果不传此用户ID，则会使用其他参数来进行链接生成。

[点击查看用户ID的获取方式](https://res.ess.tencent.cn/cdn/tsign-developer-center/assets/images/%E7%BB%84%E7%BB%87%E6%9E%B6%E6%9E%84-47eb7105dd300e6dc0c502fba22688ae.png)
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 如果您要修改企业员工用户ID，传递此用户ID即可，其他参数（Name，UserAccountType，IdCardType，IdCardNumber）将被忽略。如果不传此用户ID，则会使用其他参数来进行链接生成。

[点击查看用户ID的获取方式](https://res.ess.tencent.cn/cdn/tsign-developer-center/assets/images/%E7%BB%84%E7%BB%87%E6%9E%B6%E6%9E%84-47eb7105dd300e6dc0c502fba22688ae.png)
     * @param UserId 如果您要修改企业员工用户ID，传递此用户ID即可，其他参数（Name，UserAccountType，IdCardType，IdCardNumber）将被忽略。如果不传此用户ID，则会使用其他参数来进行链接生成。

[点击查看用户ID的获取方式](https://res.ess.tencent.cn/cdn/tsign-developer-center/assets/images/%E7%BB%84%E7%BB%87%E6%9E%B6%E6%9E%84-47eb7105dd300e6dc0c502fba22688ae.png)
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 要修改手机号用户的类型。
<ul><li>0：员工 （默认）</li><li>1：个人</li>
</ul>
如果是员工类型，<b>只能修改本方员工，而不能修改其他企业的员工</b>。
如果是个人类型，可<b>不指定用户身份，生成的是固定的链接，当前登录电子签小程序的用户可进行换绑。</b>
 
     * @return UserAccountType 要修改手机号用户的类型。
<ul><li>0：员工 （默认）</li><li>1：个人</li>
</ul>
如果是员工类型，<b>只能修改本方员工，而不能修改其他企业的员工</b>。
如果是个人类型，可<b>不指定用户身份，生成的是固定的链接，当前登录电子签小程序的用户可进行换绑。</b>

     */
    public Long getUserAccountType() {
        return this.UserAccountType;
    }

    /**
     * Set 要修改手机号用户的类型。
<ul><li>0：员工 （默认）</li><li>1：个人</li>
</ul>
如果是员工类型，<b>只能修改本方员工，而不能修改其他企业的员工</b>。
如果是个人类型，可<b>不指定用户身份，生成的是固定的链接，当前登录电子签小程序的用户可进行换绑。</b>

     * @param UserAccountType 要修改手机号用户的类型。
<ul><li>0：员工 （默认）</li><li>1：个人</li>
</ul>
如果是员工类型，<b>只能修改本方员工，而不能修改其他企业的员工</b>。
如果是个人类型，可<b>不指定用户身份，生成的是固定的链接，当前登录电子签小程序的用户可进行换绑。</b>

     */
    public void setUserAccountType(Long UserAccountType) {
        this.UserAccountType = UserAccountType;
    }

    /**
     * Get 要修改手机号用户的姓名，请确保填写的姓名为对方的真实姓名，而非昵称等代名。

如果没有传递 userId且 userAccountType 是 0 或者没有传递， 此参数为<b>必填项。</b> 
     * @return Name 要修改手机号用户的姓名，请确保填写的姓名为对方的真实姓名，而非昵称等代名。

如果没有传递 userId且 userAccountType 是 0 或者没有传递， 此参数为<b>必填项。</b>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 要修改手机号用户的姓名，请确保填写的姓名为对方的真实姓名，而非昵称等代名。

如果没有传递 userId且 userAccountType 是 0 或者没有传递， 此参数为<b>必填项。</b>
     * @param Name 要修改手机号用户的姓名，请确保填写的姓名为对方的真实姓名，而非昵称等代名。

如果没有传递 userId且 userAccountType 是 0 或者没有传递， 此参数为<b>必填项。</b>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 要修改手机号用户的证件类型，
目前支持的账号类型如下：

<ul><li><b>ID_CARD </b>: （默认）中国大陆居民身份证 </li>
<li><b>HONGKONG_AND_MACAO</b> : 港澳居民来往内地通行证</li>
<li><b>HONGKONG_MACAO_AND_TAIWAN </b>: 港澳台居民居住证(格式同中国大陆居民身份证)</li></ul>
 
     * @return IdCardType 要修改手机号用户的证件类型，
目前支持的账号类型如下：

<ul><li><b>ID_CARD </b>: （默认）中国大陆居民身份证 </li>
<li><b>HONGKONG_AND_MACAO</b> : 港澳居民来往内地通行证</li>
<li><b>HONGKONG_MACAO_AND_TAIWAN </b>: 港澳台居民居住证(格式同中国大陆居民身份证)</li></ul>

     */
    public String getIdCardType() {
        return this.IdCardType;
    }

    /**
     * Set 要修改手机号用户的证件类型，
目前支持的账号类型如下：

<ul><li><b>ID_CARD </b>: （默认）中国大陆居民身份证 </li>
<li><b>HONGKONG_AND_MACAO</b> : 港澳居民来往内地通行证</li>
<li><b>HONGKONG_MACAO_AND_TAIWAN </b>: 港澳台居民居住证(格式同中国大陆居民身份证)</li></ul>

     * @param IdCardType 要修改手机号用户的证件类型，
目前支持的账号类型如下：

<ul><li><b>ID_CARD </b>: （默认）中国大陆居民身份证 </li>
<li><b>HONGKONG_AND_MACAO</b> : 港澳居民来往内地通行证</li>
<li><b>HONGKONG_MACAO_AND_TAIWAN </b>: 港澳台居民居住证(格式同中国大陆居民身份证)</li></ul>

     */
    public void setIdCardType(String IdCardType) {
        this.IdCardType = IdCardType;
    }

    /**
     * Get 要修改手机号用户的身份证号码，应符合以下规则
<ul><li>中国大陆居民身份证号码应为18位字符串，由数字和大写字母X组成（如存在X，请大写）。</li>
<li>中国港澳居民来往内地通行证号码共11位。第1位为字母，“H”字头签发给中国香港居民，“M”字头签发给中国澳门居民；第2位至第11位为数字。</li>
<li>中国港澳台居民居住证号码编码规则与中国大陆身份证相同，应为18位字符串。</li></ul>
如果没有传递 userId且 userAccountType 是 0 或者没有传递， 此参数为<b>必填项。</b> 
     * @return IdCardNumber 要修改手机号用户的身份证号码，应符合以下规则
<ul><li>中国大陆居民身份证号码应为18位字符串，由数字和大写字母X组成（如存在X，请大写）。</li>
<li>中国港澳居民来往内地通行证号码共11位。第1位为字母，“H”字头签发给中国香港居民，“M”字头签发给中国澳门居民；第2位至第11位为数字。</li>
<li>中国港澳台居民居住证号码编码规则与中国大陆身份证相同，应为18位字符串。</li></ul>
如果没有传递 userId且 userAccountType 是 0 或者没有传递， 此参数为<b>必填项。</b>
     */
    public String getIdCardNumber() {
        return this.IdCardNumber;
    }

    /**
     * Set 要修改手机号用户的身份证号码，应符合以下规则
<ul><li>中国大陆居民身份证号码应为18位字符串，由数字和大写字母X组成（如存在X，请大写）。</li>
<li>中国港澳居民来往内地通行证号码共11位。第1位为字母，“H”字头签发给中国香港居民，“M”字头签发给中国澳门居民；第2位至第11位为数字。</li>
<li>中国港澳台居民居住证号码编码规则与中国大陆身份证相同，应为18位字符串。</li></ul>
如果没有传递 userId且 userAccountType 是 0 或者没有传递， 此参数为<b>必填项。</b>
     * @param IdCardNumber 要修改手机号用户的身份证号码，应符合以下规则
<ul><li>中国大陆居民身份证号码应为18位字符串，由数字和大写字母X组成（如存在X，请大写）。</li>
<li>中国港澳居民来往内地通行证号码共11位。第1位为字母，“H”字头签发给中国香港居民，“M”字头签发给中国澳门居民；第2位至第11位为数字。</li>
<li>中国港澳台居民居住证号码编码规则与中国大陆身份证相同，应为18位字符串。</li></ul>
如果没有传递 userId且 userAccountType 是 0 或者没有传递， 此参数为<b>必填项。</b>
     */
    public void setIdCardNumber(String IdCardNumber) {
        this.IdCardNumber = IdCardNumber;
    }

    /**
     * Get 要跳转的链接类型

<ul>
<li><b>HTTP</b>：（默认）跳转电子签小程序的http_url,短信通知或者H5跳转适合此类型 ，此时返回长链 (默认类型)</li>
<li><b>HTTP_SHORT_URL</b>：跳转电子签小程序的http_url,短信通知或者H5跳转适合此类型，此时返回短链</li>
<li><b>APP</b>：第三方APP或小程序跳转电子签小程序的path, APP或者小程序跳转适合此类型</li>
</ul>

 
     * @return Endpoint 要跳转的链接类型

<ul>
<li><b>HTTP</b>：（默认）跳转电子签小程序的http_url,短信通知或者H5跳转适合此类型 ，此时返回长链 (默认类型)</li>
<li><b>HTTP_SHORT_URL</b>：跳转电子签小程序的http_url,短信通知或者H5跳转适合此类型，此时返回短链</li>
<li><b>APP</b>：第三方APP或小程序跳转电子签小程序的path, APP或者小程序跳转适合此类型</li>
</ul>


     */
    public String getEndpoint() {
        return this.Endpoint;
    }

    /**
     * Set 要跳转的链接类型

<ul>
<li><b>HTTP</b>：（默认）跳转电子签小程序的http_url,短信通知或者H5跳转适合此类型 ，此时返回长链 (默认类型)</li>
<li><b>HTTP_SHORT_URL</b>：跳转电子签小程序的http_url,短信通知或者H5跳转适合此类型，此时返回短链</li>
<li><b>APP</b>：第三方APP或小程序跳转电子签小程序的path, APP或者小程序跳转适合此类型</li>
</ul>


     * @param Endpoint 要跳转的链接类型

<ul>
<li><b>HTTP</b>：（默认）跳转电子签小程序的http_url,短信通知或者H5跳转适合此类型 ，此时返回长链 (默认类型)</li>
<li><b>HTTP_SHORT_URL</b>：跳转电子签小程序的http_url,短信通知或者H5跳转适合此类型，此时返回短链</li>
<li><b>APP</b>：第三方APP或小程序跳转电子签小程序的path, APP或者小程序跳转适合此类型</li>
</ul>


     */
    public void setEndpoint(String Endpoint) {
        this.Endpoint = Endpoint;
    }

    /**
     * Get 在用户完成实名认证后，其自定义数据将通过[手机号换绑回调](https://qian.tencent.com/developers/company/callback_types_staffs/#%E5%8D%81%E4%B8%89-%E4%B8%AA%E4%BA%BA%E5%91%98%E5%B7%A5%E6%89%8B%E6%9C%BA%E5%8F%B7%E4%BF%AE%E6%94%B9%E5%90%8E%E5%9B%9E%E8%B0%83)返回，以便用户确认其个人数据信息。请注意，自定义数据的字符长度上限为1000，且必须采用base64编码格式。

请注意：
此参数仅支持通过[获取c端用户实名链接](https://qian.tencent.com/developers/companyApis/users/CreateUserVerifyUrl)接口实名的用户生效。 
     * @return UserData 在用户完成实名认证后，其自定义数据将通过[手机号换绑回调](https://qian.tencent.com/developers/company/callback_types_staffs/#%E5%8D%81%E4%B8%89-%E4%B8%AA%E4%BA%BA%E5%91%98%E5%B7%A5%E6%89%8B%E6%9C%BA%E5%8F%B7%E4%BF%AE%E6%94%B9%E5%90%8E%E5%9B%9E%E8%B0%83)返回，以便用户确认其个人数据信息。请注意，自定义数据的字符长度上限为1000，且必须采用base64编码格式。

请注意：
此参数仅支持通过[获取c端用户实名链接](https://qian.tencent.com/developers/companyApis/users/CreateUserVerifyUrl)接口实名的用户生效。
     */
    public String getUserData() {
        return this.UserData;
    }

    /**
     * Set 在用户完成实名认证后，其自定义数据将通过[手机号换绑回调](https://qian.tencent.com/developers/company/callback_types_staffs/#%E5%8D%81%E4%B8%89-%E4%B8%AA%E4%BA%BA%E5%91%98%E5%B7%A5%E6%89%8B%E6%9C%BA%E5%8F%B7%E4%BF%AE%E6%94%B9%E5%90%8E%E5%9B%9E%E8%B0%83)返回，以便用户确认其个人数据信息。请注意，自定义数据的字符长度上限为1000，且必须采用base64编码格式。

请注意：
此参数仅支持通过[获取c端用户实名链接](https://qian.tencent.com/developers/companyApis/users/CreateUserVerifyUrl)接口实名的用户生效。
     * @param UserData 在用户完成实名认证后，其自定义数据将通过[手机号换绑回调](https://qian.tencent.com/developers/company/callback_types_staffs/#%E5%8D%81%E4%B8%89-%E4%B8%AA%E4%BA%BA%E5%91%98%E5%B7%A5%E6%89%8B%E6%9C%BA%E5%8F%B7%E4%BF%AE%E6%94%B9%E5%90%8E%E5%9B%9E%E8%B0%83)返回，以便用户确认其个人数据信息。请注意，自定义数据的字符长度上限为1000，且必须采用base64编码格式。

请注意：
此参数仅支持通过[获取c端用户实名链接](https://qian.tencent.com/developers/companyApis/users/CreateUserVerifyUrl)接口实名的用户生效。
     */
    public void setUserData(String UserData) {
        this.UserData = UserData;
    }

    public CreateUserMobileChangeUrlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateUserMobileChangeUrlRequest(CreateUserMobileChangeUrlRequest source) {
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.UserAccountType != null) {
            this.UserAccountType = new Long(source.UserAccountType);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.IdCardType != null) {
            this.IdCardType = new String(source.IdCardType);
        }
        if (source.IdCardNumber != null) {
            this.IdCardNumber = new String(source.IdCardNumber);
        }
        if (source.Endpoint != null) {
            this.Endpoint = new String(source.Endpoint);
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
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "UserAccountType", this.UserAccountType);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "IdCardType", this.IdCardType);
        this.setParamSimple(map, prefix + "IdCardNumber", this.IdCardNumber);
        this.setParamSimple(map, prefix + "Endpoint", this.Endpoint);
        this.setParamSimple(map, prefix + "UserData", this.UserData);

    }
}

