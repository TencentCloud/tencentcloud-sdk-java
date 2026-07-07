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

public class CreateUserAutoSignSealUrlRequest extends AbstractModel {

    /**
    * <p>执行本接口操作的员工信息。<br>注: <code>在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</code></p>
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * <p>自动签使用的场景值, 可以选择的场景值如下:</p><ul><li> **E_PRESCRIPTION_AUTO_SIGN** :  电子处方场景</li><li> **OTHER** :  通用场景</li></ul>
    */
    @SerializedName("SceneKey")
    @Expose
    private String SceneKey;

    /**
    * <p>自动签开通个人用户信息, 包括名字,身份证等。</p>
    */
    @SerializedName("UserInfo")
    @Expose
    private UserThreeFactor UserInfo;

    /**
    * <p>代理企业和员工的信息。<br>在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。</p>
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * <p>链接的过期时间，格式为Unix时间戳，不能早于当前时间，且最大为当前时间往后30天。<code>如果不传，默认过期时间为当前时间往后7天。</code></p>
    */
    @SerializedName("ExpiredTime")
    @Expose
    private Long ExpiredTime;

    /**
    * <p>要跳转的链接类型<ul><li> <strong>HTTP</strong>：跳转电子签小程序的http_url, 短信通知或者H5跳转适合此类型  ，此时返回长链</li><li><strong>HTTP_SHORT_URL</strong>：跳转电子签小程序的http_url, 短信通知或者H5跳转适合此类型，此时返回短链</li><li><strong>APP</strong>： 第三方APP或小程序跳转电子签小程序的path,  APP或者小程序跳转适合此类型</li></ul></p>
    */
    @SerializedName("EndPoint")
    @Expose
    private String EndPoint;

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
     * Get <p>自动签使用的场景值, 可以选择的场景值如下:</p><ul><li> **E_PRESCRIPTION_AUTO_SIGN** :  电子处方场景</li><li> **OTHER** :  通用场景</li></ul> 
     * @return SceneKey <p>自动签使用的场景值, 可以选择的场景值如下:</p><ul><li> **E_PRESCRIPTION_AUTO_SIGN** :  电子处方场景</li><li> **OTHER** :  通用场景</li></ul>
     */
    public String getSceneKey() {
        return this.SceneKey;
    }

    /**
     * Set <p>自动签使用的场景值, 可以选择的场景值如下:</p><ul><li> **E_PRESCRIPTION_AUTO_SIGN** :  电子处方场景</li><li> **OTHER** :  通用场景</li></ul>
     * @param SceneKey <p>自动签使用的场景值, 可以选择的场景值如下:</p><ul><li> **E_PRESCRIPTION_AUTO_SIGN** :  电子处方场景</li><li> **OTHER** :  通用场景</li></ul>
     */
    public void setSceneKey(String SceneKey) {
        this.SceneKey = SceneKey;
    }

    /**
     * Get <p>自动签开通个人用户信息, 包括名字,身份证等。</p> 
     * @return UserInfo <p>自动签开通个人用户信息, 包括名字,身份证等。</p>
     */
    public UserThreeFactor getUserInfo() {
        return this.UserInfo;
    }

    /**
     * Set <p>自动签开通个人用户信息, 包括名字,身份证等。</p>
     * @param UserInfo <p>自动签开通个人用户信息, 包括名字,身份证等。</p>
     */
    public void setUserInfo(UserThreeFactor UserInfo) {
        this.UserInfo = UserInfo;
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
     * Get <p>链接的过期时间，格式为Unix时间戳，不能早于当前时间，且最大为当前时间往后30天。<code>如果不传，默认过期时间为当前时间往后7天。</code></p> 
     * @return ExpiredTime <p>链接的过期时间，格式为Unix时间戳，不能早于当前时间，且最大为当前时间往后30天。<code>如果不传，默认过期时间为当前时间往后7天。</code></p>
     */
    public Long getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set <p>链接的过期时间，格式为Unix时间戳，不能早于当前时间，且最大为当前时间往后30天。<code>如果不传，默认过期时间为当前时间往后7天。</code></p>
     * @param ExpiredTime <p>链接的过期时间，格式为Unix时间戳，不能早于当前时间，且最大为当前时间往后30天。<code>如果不传，默认过期时间为当前时间往后7天。</code></p>
     */
    public void setExpiredTime(Long ExpiredTime) {
        this.ExpiredTime = ExpiredTime;
    }

    /**
     * Get <p>要跳转的链接类型<ul><li> <strong>HTTP</strong>：跳转电子签小程序的http_url, 短信通知或者H5跳转适合此类型  ，此时返回长链</li><li><strong>HTTP_SHORT_URL</strong>：跳转电子签小程序的http_url, 短信通知或者H5跳转适合此类型，此时返回短链</li><li><strong>APP</strong>： 第三方APP或小程序跳转电子签小程序的path,  APP或者小程序跳转适合此类型</li></ul></p> 
     * @return EndPoint <p>要跳转的链接类型<ul><li> <strong>HTTP</strong>：跳转电子签小程序的http_url, 短信通知或者H5跳转适合此类型  ，此时返回长链</li><li><strong>HTTP_SHORT_URL</strong>：跳转电子签小程序的http_url, 短信通知或者H5跳转适合此类型，此时返回短链</li><li><strong>APP</strong>： 第三方APP或小程序跳转电子签小程序的path,  APP或者小程序跳转适合此类型</li></ul></p>
     */
    public String getEndPoint() {
        return this.EndPoint;
    }

    /**
     * Set <p>要跳转的链接类型<ul><li> <strong>HTTP</strong>：跳转电子签小程序的http_url, 短信通知或者H5跳转适合此类型  ，此时返回长链</li><li><strong>HTTP_SHORT_URL</strong>：跳转电子签小程序的http_url, 短信通知或者H5跳转适合此类型，此时返回短链</li><li><strong>APP</strong>： 第三方APP或小程序跳转电子签小程序的path,  APP或者小程序跳转适合此类型</li></ul></p>
     * @param EndPoint <p>要跳转的链接类型<ul><li> <strong>HTTP</strong>：跳转电子签小程序的http_url, 短信通知或者H5跳转适合此类型  ，此时返回长链</li><li><strong>HTTP_SHORT_URL</strong>：跳转电子签小程序的http_url, 短信通知或者H5跳转适合此类型，此时返回短链</li><li><strong>APP</strong>： 第三方APP或小程序跳转电子签小程序的path,  APP或者小程序跳转适合此类型</li></ul></p>
     */
    public void setEndPoint(String EndPoint) {
        this.EndPoint = EndPoint;
    }

    public CreateUserAutoSignSealUrlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateUserAutoSignSealUrlRequest(CreateUserAutoSignSealUrlRequest source) {
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.SceneKey != null) {
            this.SceneKey = new String(source.SceneKey);
        }
        if (source.UserInfo != null) {
            this.UserInfo = new UserThreeFactor(source.UserInfo);
        }
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.ExpiredTime != null) {
            this.ExpiredTime = new Long(source.ExpiredTime);
        }
        if (source.EndPoint != null) {
            this.EndPoint = new String(source.EndPoint);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamSimple(map, prefix + "SceneKey", this.SceneKey);
        this.setParamObj(map, prefix + "UserInfo.", this.UserInfo);
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamSimple(map, prefix + "ExpiredTime", this.ExpiredTime);
        this.setParamSimple(map, prefix + "EndPoint", this.EndPoint);

    }
}

