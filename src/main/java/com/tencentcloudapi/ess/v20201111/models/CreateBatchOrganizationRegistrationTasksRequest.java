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

public class CreateBatchOrganizationRegistrationTasksRequest extends AbstractModel {

    /**
    * 执行本接口操作的员工信息。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * 组织机构注册信息。
一次最多支持10条认证流
    */
    @SerializedName("RegistrationOrganizations")
    @Expose
    private RegistrationOrganizationInfo [] RegistrationOrganizations;

    /**
    * 代理企业和员工的信息。
在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * 要生成链接的类型, 可以选择的值如下: 

<ul>
<li>(默认)PC: 生成PC端的链接</li>
<li>SHORT_URL: H5跳转到电子签小程序链接的短链形式, 一般用于发送短信中带的链接, 打开后进入腾讯电子签小程序</li>
<li>APP：生成小程序跳转链接</li>
<li>H5：生成H5跳转长链接</li>
<li>SHORT_H5：生成H5跳转短链</li>
</ul>
    */
    @SerializedName("Endpoint")
    @Expose
    private String Endpoint;

    /**
    * 认证链接使用单链接还是多链接模式

<ul>
<li>0 - 多链接(默认)，指批量生成链接， 每一个企业会拥有一个认证链接，然后分别认证</li>
<li>1 - 单链接 ， 指批量生成链接，然后会将多个链接聚合成一个链接，进行认证</li>
</ul>

p.s.
请注意， 如果使用单链接的模式并且认证方式是授权书方式的时候，必须在接口中传递超管授权书。
    */
    @SerializedName("BatchAuthMethod")
    @Expose
    private Long BatchAuthMethod;

    /**
     * Get 执行本接口操作的员工信息。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。` 
     * @return Operator 执行本接口操作的员工信息。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 执行本接口操作的员工信息。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
     * @param Operator 执行本接口操作的员工信息。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 组织机构注册信息。
一次最多支持10条认证流 
     * @return RegistrationOrganizations 组织机构注册信息。
一次最多支持10条认证流
     */
    public RegistrationOrganizationInfo [] getRegistrationOrganizations() {
        return this.RegistrationOrganizations;
    }

    /**
     * Set 组织机构注册信息。
一次最多支持10条认证流
     * @param RegistrationOrganizations 组织机构注册信息。
一次最多支持10条认证流
     */
    public void setRegistrationOrganizations(RegistrationOrganizationInfo [] RegistrationOrganizations) {
        this.RegistrationOrganizations = RegistrationOrganizations;
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
     * Get 要生成链接的类型, 可以选择的值如下: 

<ul>
<li>(默认)PC: 生成PC端的链接</li>
<li>SHORT_URL: H5跳转到电子签小程序链接的短链形式, 一般用于发送短信中带的链接, 打开后进入腾讯电子签小程序</li>
<li>APP：生成小程序跳转链接</li>
<li>H5：生成H5跳转长链接</li>
<li>SHORT_H5：生成H5跳转短链</li>
</ul> 
     * @return Endpoint 要生成链接的类型, 可以选择的值如下: 

<ul>
<li>(默认)PC: 生成PC端的链接</li>
<li>SHORT_URL: H5跳转到电子签小程序链接的短链形式, 一般用于发送短信中带的链接, 打开后进入腾讯电子签小程序</li>
<li>APP：生成小程序跳转链接</li>
<li>H5：生成H5跳转长链接</li>
<li>SHORT_H5：生成H5跳转短链</li>
</ul>
     */
    public String getEndpoint() {
        return this.Endpoint;
    }

    /**
     * Set 要生成链接的类型, 可以选择的值如下: 

<ul>
<li>(默认)PC: 生成PC端的链接</li>
<li>SHORT_URL: H5跳转到电子签小程序链接的短链形式, 一般用于发送短信中带的链接, 打开后进入腾讯电子签小程序</li>
<li>APP：生成小程序跳转链接</li>
<li>H5：生成H5跳转长链接</li>
<li>SHORT_H5：生成H5跳转短链</li>
</ul>
     * @param Endpoint 要生成链接的类型, 可以选择的值如下: 

<ul>
<li>(默认)PC: 生成PC端的链接</li>
<li>SHORT_URL: H5跳转到电子签小程序链接的短链形式, 一般用于发送短信中带的链接, 打开后进入腾讯电子签小程序</li>
<li>APP：生成小程序跳转链接</li>
<li>H5：生成H5跳转长链接</li>
<li>SHORT_H5：生成H5跳转短链</li>
</ul>
     */
    public void setEndpoint(String Endpoint) {
        this.Endpoint = Endpoint;
    }

    /**
     * Get 认证链接使用单链接还是多链接模式

<ul>
<li>0 - 多链接(默认)，指批量生成链接， 每一个企业会拥有一个认证链接，然后分别认证</li>
<li>1 - 单链接 ， 指批量生成链接，然后会将多个链接聚合成一个链接，进行认证</li>
</ul>

p.s.
请注意， 如果使用单链接的模式并且认证方式是授权书方式的时候，必须在接口中传递超管授权书。 
     * @return BatchAuthMethod 认证链接使用单链接还是多链接模式

<ul>
<li>0 - 多链接(默认)，指批量生成链接， 每一个企业会拥有一个认证链接，然后分别认证</li>
<li>1 - 单链接 ， 指批量生成链接，然后会将多个链接聚合成一个链接，进行认证</li>
</ul>

p.s.
请注意， 如果使用单链接的模式并且认证方式是授权书方式的时候，必须在接口中传递超管授权书。
     */
    public Long getBatchAuthMethod() {
        return this.BatchAuthMethod;
    }

    /**
     * Set 认证链接使用单链接还是多链接模式

<ul>
<li>0 - 多链接(默认)，指批量生成链接， 每一个企业会拥有一个认证链接，然后分别认证</li>
<li>1 - 单链接 ， 指批量生成链接，然后会将多个链接聚合成一个链接，进行认证</li>
</ul>

p.s.
请注意， 如果使用单链接的模式并且认证方式是授权书方式的时候，必须在接口中传递超管授权书。
     * @param BatchAuthMethod 认证链接使用单链接还是多链接模式

<ul>
<li>0 - 多链接(默认)，指批量生成链接， 每一个企业会拥有一个认证链接，然后分别认证</li>
<li>1 - 单链接 ， 指批量生成链接，然后会将多个链接聚合成一个链接，进行认证</li>
</ul>

p.s.
请注意， 如果使用单链接的模式并且认证方式是授权书方式的时候，必须在接口中传递超管授权书。
     */
    public void setBatchAuthMethod(Long BatchAuthMethod) {
        this.BatchAuthMethod = BatchAuthMethod;
    }

    public CreateBatchOrganizationRegistrationTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateBatchOrganizationRegistrationTasksRequest(CreateBatchOrganizationRegistrationTasksRequest source) {
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.RegistrationOrganizations != null) {
            this.RegistrationOrganizations = new RegistrationOrganizationInfo[source.RegistrationOrganizations.length];
            for (int i = 0; i < source.RegistrationOrganizations.length; i++) {
                this.RegistrationOrganizations[i] = new RegistrationOrganizationInfo(source.RegistrationOrganizations[i]);
            }
        }
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.Endpoint != null) {
            this.Endpoint = new String(source.Endpoint);
        }
        if (source.BatchAuthMethod != null) {
            this.BatchAuthMethod = new Long(source.BatchAuthMethod);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamArrayObj(map, prefix + "RegistrationOrganizations.", this.RegistrationOrganizations);
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamSimple(map, prefix + "Endpoint", this.Endpoint);
        this.setParamSimple(map, prefix + "BatchAuthMethod", this.BatchAuthMethod);

    }
}

