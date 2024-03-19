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

public class UpdateIntegrationEmployeesRequest extends AbstractModel {

    /**
    * 执行本接口操作的员工信息,UserId必填。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * 需要更新的员工信息，最多不超过100个。根据UserId或OpenId更新员工信息，必须填写其中一个，优先使用UserId。

可更新以下字段，其他字段暂不支持
<table> <thead> <tr> <th>参数</th> <th>含义</th> </tr> </thead> <tbody> <tr> <td>DisplayName</td> <td>用户的真实名字</td> </tr> <tr> <td>Mobile</td> <td>用户手机号码</td> </tr> <tr> <td>Email</td> <td>用户的邮箱</td> </tr> <tr> <td>Department.DepartmentId</td> <td>用户进入后的部门ID</td> </tr> </tbody> </table>
    */
    @SerializedName("Employees")
    @Expose
    private Staff [] Employees;

    /**
    * 代理企业和员工的信息。
在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * 员工邀请方式可通过以下途径进行设置：<ul><li>**SMS（默认）**：邀请将通过短信或企业微信消息发送。若场景非企业微信，则采用企业微信消息；其他情境下则使用短信通知。短信内含链接，点击后将进入微信小程序进行认证并加入企业的流程。</li><li>**H5**：将生成H5链接，用户点击链接后可进入H5页面进行认证并加入企业的流程。</li><li>**NONE**：系统会根据Endpoint生成签署链接，业务方需获取链接并通知客户。</li></ul>
    */
    @SerializedName("InvitationNotifyType")
    @Expose
    private String InvitationNotifyType;

    /**
    * 回跳地址，为认证成功后页面进行回跳的URL，请确保回跳地址的可用性。注：`只有在员工邀请方式（InvitationNotifyType参数）为H5场景下才生效， 其他方式下设置无效。`
    */
    @SerializedName("JumpUrl")
    @Expose
    private String JumpUrl;

    /**
    * 要跳转的链接类型<ul><li> **HTTP**：跳转电子签小程序的http_url, 短信通知或者H5跳转适合此类型  ，此时返回长链 (默认类型)</li><li>**HTTP_SHORT_URL**：跳转电子签小程序的http_url, 短信通知或者H5跳转适合此类型，此时返回短链</li><li>**APP**： 第三方APP或小程序跳转电子签小程序的path,  APP或者小程序跳转适合此类型</li><li>**H5**： 第三方移动端浏览器进行嵌入，不支持小程序嵌入，过期时间一个月</li></ul>注意：InvitationNotifyType 和 Endpoint 的关系图<table><tbody><tr><td>通知类型（InvitationNotifyType）</td><td>Endpoint</td></tr><tr><td>SMS（默认）</td><td>不需要传递，会将 Endpoint 默认设置为HTTP_SHORT_URL</td></tr><tr><td>H5</td><td>不需要传递，会将 Endpoint 默认设置为 H5</td></tr><tr><td>NONE</td><td>所有 Endpoint 都支持（HTTP_URL/HTTP_SHORT_URL/H5/APP）默认为HTTP_SHORT_URL</td></tr></tbody></table>
    */
    @SerializedName("Endpoint")
    @Expose
    private String Endpoint;

    /**
     * Get 执行本接口操作的员工信息,UserId必填。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。` 
     * @return Operator 执行本接口操作的员工信息,UserId必填。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 执行本接口操作的员工信息,UserId必填。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
     * @param Operator 执行本接口操作的员工信息,UserId必填。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 需要更新的员工信息，最多不超过100个。根据UserId或OpenId更新员工信息，必须填写其中一个，优先使用UserId。

可更新以下字段，其他字段暂不支持
<table> <thead> <tr> <th>参数</th> <th>含义</th> </tr> </thead> <tbody> <tr> <td>DisplayName</td> <td>用户的真实名字</td> </tr> <tr> <td>Mobile</td> <td>用户手机号码</td> </tr> <tr> <td>Email</td> <td>用户的邮箱</td> </tr> <tr> <td>Department.DepartmentId</td> <td>用户进入后的部门ID</td> </tr> </tbody> </table> 
     * @return Employees 需要更新的员工信息，最多不超过100个。根据UserId或OpenId更新员工信息，必须填写其中一个，优先使用UserId。

可更新以下字段，其他字段暂不支持
<table> <thead> <tr> <th>参数</th> <th>含义</th> </tr> </thead> <tbody> <tr> <td>DisplayName</td> <td>用户的真实名字</td> </tr> <tr> <td>Mobile</td> <td>用户手机号码</td> </tr> <tr> <td>Email</td> <td>用户的邮箱</td> </tr> <tr> <td>Department.DepartmentId</td> <td>用户进入后的部门ID</td> </tr> </tbody> </table>
     */
    public Staff [] getEmployees() {
        return this.Employees;
    }

    /**
     * Set 需要更新的员工信息，最多不超过100个。根据UserId或OpenId更新员工信息，必须填写其中一个，优先使用UserId。

可更新以下字段，其他字段暂不支持
<table> <thead> <tr> <th>参数</th> <th>含义</th> </tr> </thead> <tbody> <tr> <td>DisplayName</td> <td>用户的真实名字</td> </tr> <tr> <td>Mobile</td> <td>用户手机号码</td> </tr> <tr> <td>Email</td> <td>用户的邮箱</td> </tr> <tr> <td>Department.DepartmentId</td> <td>用户进入后的部门ID</td> </tr> </tbody> </table>
     * @param Employees 需要更新的员工信息，最多不超过100个。根据UserId或OpenId更新员工信息，必须填写其中一个，优先使用UserId。

可更新以下字段，其他字段暂不支持
<table> <thead> <tr> <th>参数</th> <th>含义</th> </tr> </thead> <tbody> <tr> <td>DisplayName</td> <td>用户的真实名字</td> </tr> <tr> <td>Mobile</td> <td>用户手机号码</td> </tr> <tr> <td>Email</td> <td>用户的邮箱</td> </tr> <tr> <td>Department.DepartmentId</td> <td>用户进入后的部门ID</td> </tr> </tbody> </table>
     */
    public void setEmployees(Staff [] Employees) {
        this.Employees = Employees;
    }

    /**
     * Get 代理企业和员工的信息。
在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。 
     * @return Agent 代理企业和员工的信息。
在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set 代理企业和员工的信息。
在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。
     * @param Agent 代理企业和员工的信息。
在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get 员工邀请方式可通过以下途径进行设置：<ul><li>**SMS（默认）**：邀请将通过短信或企业微信消息发送。若场景非企业微信，则采用企业微信消息；其他情境下则使用短信通知。短信内含链接，点击后将进入微信小程序进行认证并加入企业的流程。</li><li>**H5**：将生成H5链接，用户点击链接后可进入H5页面进行认证并加入企业的流程。</li><li>**NONE**：系统会根据Endpoint生成签署链接，业务方需获取链接并通知客户。</li></ul> 
     * @return InvitationNotifyType 员工邀请方式可通过以下途径进行设置：<ul><li>**SMS（默认）**：邀请将通过短信或企业微信消息发送。若场景非企业微信，则采用企业微信消息；其他情境下则使用短信通知。短信内含链接，点击后将进入微信小程序进行认证并加入企业的流程。</li><li>**H5**：将生成H5链接，用户点击链接后可进入H5页面进行认证并加入企业的流程。</li><li>**NONE**：系统会根据Endpoint生成签署链接，业务方需获取链接并通知客户。</li></ul>
     */
    public String getInvitationNotifyType() {
        return this.InvitationNotifyType;
    }

    /**
     * Set 员工邀请方式可通过以下途径进行设置：<ul><li>**SMS（默认）**：邀请将通过短信或企业微信消息发送。若场景非企业微信，则采用企业微信消息；其他情境下则使用短信通知。短信内含链接，点击后将进入微信小程序进行认证并加入企业的流程。</li><li>**H5**：将生成H5链接，用户点击链接后可进入H5页面进行认证并加入企业的流程。</li><li>**NONE**：系统会根据Endpoint生成签署链接，业务方需获取链接并通知客户。</li></ul>
     * @param InvitationNotifyType 员工邀请方式可通过以下途径进行设置：<ul><li>**SMS（默认）**：邀请将通过短信或企业微信消息发送。若场景非企业微信，则采用企业微信消息；其他情境下则使用短信通知。短信内含链接，点击后将进入微信小程序进行认证并加入企业的流程。</li><li>**H5**：将生成H5链接，用户点击链接后可进入H5页面进行认证并加入企业的流程。</li><li>**NONE**：系统会根据Endpoint生成签署链接，业务方需获取链接并通知客户。</li></ul>
     */
    public void setInvitationNotifyType(String InvitationNotifyType) {
        this.InvitationNotifyType = InvitationNotifyType;
    }

    /**
     * Get 回跳地址，为认证成功后页面进行回跳的URL，请确保回跳地址的可用性。注：`只有在员工邀请方式（InvitationNotifyType参数）为H5场景下才生效， 其他方式下设置无效。` 
     * @return JumpUrl 回跳地址，为认证成功后页面进行回跳的URL，请确保回跳地址的可用性。注：`只有在员工邀请方式（InvitationNotifyType参数）为H5场景下才生效， 其他方式下设置无效。`
     */
    public String getJumpUrl() {
        return this.JumpUrl;
    }

    /**
     * Set 回跳地址，为认证成功后页面进行回跳的URL，请确保回跳地址的可用性。注：`只有在员工邀请方式（InvitationNotifyType参数）为H5场景下才生效， 其他方式下设置无效。`
     * @param JumpUrl 回跳地址，为认证成功后页面进行回跳的URL，请确保回跳地址的可用性。注：`只有在员工邀请方式（InvitationNotifyType参数）为H5场景下才生效， 其他方式下设置无效。`
     */
    public void setJumpUrl(String JumpUrl) {
        this.JumpUrl = JumpUrl;
    }

    /**
     * Get 要跳转的链接类型<ul><li> **HTTP**：跳转电子签小程序的http_url, 短信通知或者H5跳转适合此类型  ，此时返回长链 (默认类型)</li><li>**HTTP_SHORT_URL**：跳转电子签小程序的http_url, 短信通知或者H5跳转适合此类型，此时返回短链</li><li>**APP**： 第三方APP或小程序跳转电子签小程序的path,  APP或者小程序跳转适合此类型</li><li>**H5**： 第三方移动端浏览器进行嵌入，不支持小程序嵌入，过期时间一个月</li></ul>注意：InvitationNotifyType 和 Endpoint 的关系图<table><tbody><tr><td>通知类型（InvitationNotifyType）</td><td>Endpoint</td></tr><tr><td>SMS（默认）</td><td>不需要传递，会将 Endpoint 默认设置为HTTP_SHORT_URL</td></tr><tr><td>H5</td><td>不需要传递，会将 Endpoint 默认设置为 H5</td></tr><tr><td>NONE</td><td>所有 Endpoint 都支持（HTTP_URL/HTTP_SHORT_URL/H5/APP）默认为HTTP_SHORT_URL</td></tr></tbody></table> 
     * @return Endpoint 要跳转的链接类型<ul><li> **HTTP**：跳转电子签小程序的http_url, 短信通知或者H5跳转适合此类型  ，此时返回长链 (默认类型)</li><li>**HTTP_SHORT_URL**：跳转电子签小程序的http_url, 短信通知或者H5跳转适合此类型，此时返回短链</li><li>**APP**： 第三方APP或小程序跳转电子签小程序的path,  APP或者小程序跳转适合此类型</li><li>**H5**： 第三方移动端浏览器进行嵌入，不支持小程序嵌入，过期时间一个月</li></ul>注意：InvitationNotifyType 和 Endpoint 的关系图<table><tbody><tr><td>通知类型（InvitationNotifyType）</td><td>Endpoint</td></tr><tr><td>SMS（默认）</td><td>不需要传递，会将 Endpoint 默认设置为HTTP_SHORT_URL</td></tr><tr><td>H5</td><td>不需要传递，会将 Endpoint 默认设置为 H5</td></tr><tr><td>NONE</td><td>所有 Endpoint 都支持（HTTP_URL/HTTP_SHORT_URL/H5/APP）默认为HTTP_SHORT_URL</td></tr></tbody></table>
     */
    public String getEndpoint() {
        return this.Endpoint;
    }

    /**
     * Set 要跳转的链接类型<ul><li> **HTTP**：跳转电子签小程序的http_url, 短信通知或者H5跳转适合此类型  ，此时返回长链 (默认类型)</li><li>**HTTP_SHORT_URL**：跳转电子签小程序的http_url, 短信通知或者H5跳转适合此类型，此时返回短链</li><li>**APP**： 第三方APP或小程序跳转电子签小程序的path,  APP或者小程序跳转适合此类型</li><li>**H5**： 第三方移动端浏览器进行嵌入，不支持小程序嵌入，过期时间一个月</li></ul>注意：InvitationNotifyType 和 Endpoint 的关系图<table><tbody><tr><td>通知类型（InvitationNotifyType）</td><td>Endpoint</td></tr><tr><td>SMS（默认）</td><td>不需要传递，会将 Endpoint 默认设置为HTTP_SHORT_URL</td></tr><tr><td>H5</td><td>不需要传递，会将 Endpoint 默认设置为 H5</td></tr><tr><td>NONE</td><td>所有 Endpoint 都支持（HTTP_URL/HTTP_SHORT_URL/H5/APP）默认为HTTP_SHORT_URL</td></tr></tbody></table>
     * @param Endpoint 要跳转的链接类型<ul><li> **HTTP**：跳转电子签小程序的http_url, 短信通知或者H5跳转适合此类型  ，此时返回长链 (默认类型)</li><li>**HTTP_SHORT_URL**：跳转电子签小程序的http_url, 短信通知或者H5跳转适合此类型，此时返回短链</li><li>**APP**： 第三方APP或小程序跳转电子签小程序的path,  APP或者小程序跳转适合此类型</li><li>**H5**： 第三方移动端浏览器进行嵌入，不支持小程序嵌入，过期时间一个月</li></ul>注意：InvitationNotifyType 和 Endpoint 的关系图<table><tbody><tr><td>通知类型（InvitationNotifyType）</td><td>Endpoint</td></tr><tr><td>SMS（默认）</td><td>不需要传递，会将 Endpoint 默认设置为HTTP_SHORT_URL</td></tr><tr><td>H5</td><td>不需要传递，会将 Endpoint 默认设置为 H5</td></tr><tr><td>NONE</td><td>所有 Endpoint 都支持（HTTP_URL/HTTP_SHORT_URL/H5/APP）默认为HTTP_SHORT_URL</td></tr></tbody></table>
     */
    public void setEndpoint(String Endpoint) {
        this.Endpoint = Endpoint;
    }

    public UpdateIntegrationEmployeesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateIntegrationEmployeesRequest(UpdateIntegrationEmployeesRequest source) {
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.Employees != null) {
            this.Employees = new Staff[source.Employees.length];
            for (int i = 0; i < source.Employees.length; i++) {
                this.Employees[i] = new Staff(source.Employees[i]);
            }
        }
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.InvitationNotifyType != null) {
            this.InvitationNotifyType = new String(source.InvitationNotifyType);
        }
        if (source.JumpUrl != null) {
            this.JumpUrl = new String(source.JumpUrl);
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
        this.setParamArrayObj(map, prefix + "Employees.", this.Employees);
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamSimple(map, prefix + "InvitationNotifyType", this.InvitationNotifyType);
        this.setParamSimple(map, prefix + "JumpUrl", this.JumpUrl);
        this.setParamSimple(map, prefix + "Endpoint", this.Endpoint);

    }
}

