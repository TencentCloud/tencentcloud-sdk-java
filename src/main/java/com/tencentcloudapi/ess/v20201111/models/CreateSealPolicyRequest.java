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

public class CreateSealPolicyRequest extends AbstractModel {

    /**
    * <p>执行本接口操作的员工信息。<br>注: <code>在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</code></p>
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * <p>用户在电子文件签署平台标识信息，具体参考UserInfo结构体。可跟下面的UserIds可叠加起作用,<br>同时也支持使用主企业的User进行授权， 当使用主企业的User时， 需要有集团角色。</p>
    */
    @SerializedName("Users")
    @Expose
    private UserInfo [] Users;

    /**
    * <p>电子印章ID，为32位字符串。<br>建议开发者保留此印章ID，后续指定签署区印章或者操作印章需此印章ID。<br>可登录腾讯电子签控制台，在 &quot;印章&quot;-&gt;&quot;印章中心&quot;选择查看的印章，在&quot;印章详情&quot; 中查看某个印章的SealId(在页面中展示为印章ID)。</p>
    */
    @SerializedName("SealId")
    @Expose
    private String SealId;

    /**
    * <p>授权有效期，时间戳秒级。可以传0，代表有效期到2099年12月12日23点59分59秒。</p>
    */
    @SerializedName("Expired")
    @Expose
    private Long Expired;

    /**
    * <p>需要授权的用户UserId集合。跟上面的SealId参数配合使用。选填，跟上面的Users同时起作用。<br>支持使用主企业的UserId进行授权， 当使用主企业的UserId时，该UserId 需要有集团角色。</p>
    */
    @SerializedName("UserIds")
    @Expose
    private String [] UserIds;

    /**
    * <p>印章授权内容，最多300 个字符。</p>
    */
    @SerializedName("Policy")
    @Expose
    private String Policy;

    /**
    * <p>代理企业和员工的信息。<br>在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。</p>
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * <p>个性化配置字段，默认不传。</p>
    */
    @SerializedName("Options")
    @Expose
    private Option [] Options;

    /**
    * <p>针对用印的合同/合同组授权。<br>当单次用印授权时，可以仅在指定合同获得印章授权。<br>此场景下不会触发印章授权回调。</p>
    */
    @SerializedName("AuthorizationFlows")
    @Expose
    private SealPolicyAuthorizationFlows AuthorizationFlows;

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
     * Get <p>用户在电子文件签署平台标识信息，具体参考UserInfo结构体。可跟下面的UserIds可叠加起作用,<br>同时也支持使用主企业的User进行授权， 当使用主企业的User时， 需要有集团角色。</p> 
     * @return Users <p>用户在电子文件签署平台标识信息，具体参考UserInfo结构体。可跟下面的UserIds可叠加起作用,<br>同时也支持使用主企业的User进行授权， 当使用主企业的User时， 需要有集团角色。</p>
     */
    public UserInfo [] getUsers() {
        return this.Users;
    }

    /**
     * Set <p>用户在电子文件签署平台标识信息，具体参考UserInfo结构体。可跟下面的UserIds可叠加起作用,<br>同时也支持使用主企业的User进行授权， 当使用主企业的User时， 需要有集团角色。</p>
     * @param Users <p>用户在电子文件签署平台标识信息，具体参考UserInfo结构体。可跟下面的UserIds可叠加起作用,<br>同时也支持使用主企业的User进行授权， 当使用主企业的User时， 需要有集团角色。</p>
     */
    public void setUsers(UserInfo [] Users) {
        this.Users = Users;
    }

    /**
     * Get <p>电子印章ID，为32位字符串。<br>建议开发者保留此印章ID，后续指定签署区印章或者操作印章需此印章ID。<br>可登录腾讯电子签控制台，在 &quot;印章&quot;-&gt;&quot;印章中心&quot;选择查看的印章，在&quot;印章详情&quot; 中查看某个印章的SealId(在页面中展示为印章ID)。</p> 
     * @return SealId <p>电子印章ID，为32位字符串。<br>建议开发者保留此印章ID，后续指定签署区印章或者操作印章需此印章ID。<br>可登录腾讯电子签控制台，在 &quot;印章&quot;-&gt;&quot;印章中心&quot;选择查看的印章，在&quot;印章详情&quot; 中查看某个印章的SealId(在页面中展示为印章ID)。</p>
     */
    public String getSealId() {
        return this.SealId;
    }

    /**
     * Set <p>电子印章ID，为32位字符串。<br>建议开发者保留此印章ID，后续指定签署区印章或者操作印章需此印章ID。<br>可登录腾讯电子签控制台，在 &quot;印章&quot;-&gt;&quot;印章中心&quot;选择查看的印章，在&quot;印章详情&quot; 中查看某个印章的SealId(在页面中展示为印章ID)。</p>
     * @param SealId <p>电子印章ID，为32位字符串。<br>建议开发者保留此印章ID，后续指定签署区印章或者操作印章需此印章ID。<br>可登录腾讯电子签控制台，在 &quot;印章&quot;-&gt;&quot;印章中心&quot;选择查看的印章，在&quot;印章详情&quot; 中查看某个印章的SealId(在页面中展示为印章ID)。</p>
     */
    public void setSealId(String SealId) {
        this.SealId = SealId;
    }

    /**
     * Get <p>授权有效期，时间戳秒级。可以传0，代表有效期到2099年12月12日23点59分59秒。</p> 
     * @return Expired <p>授权有效期，时间戳秒级。可以传0，代表有效期到2099年12月12日23点59分59秒。</p>
     */
    public Long getExpired() {
        return this.Expired;
    }

    /**
     * Set <p>授权有效期，时间戳秒级。可以传0，代表有效期到2099年12月12日23点59分59秒。</p>
     * @param Expired <p>授权有效期，时间戳秒级。可以传0，代表有效期到2099年12月12日23点59分59秒。</p>
     */
    public void setExpired(Long Expired) {
        this.Expired = Expired;
    }

    /**
     * Get <p>需要授权的用户UserId集合。跟上面的SealId参数配合使用。选填，跟上面的Users同时起作用。<br>支持使用主企业的UserId进行授权， 当使用主企业的UserId时，该UserId 需要有集团角色。</p> 
     * @return UserIds <p>需要授权的用户UserId集合。跟上面的SealId参数配合使用。选填，跟上面的Users同时起作用。<br>支持使用主企业的UserId进行授权， 当使用主企业的UserId时，该UserId 需要有集团角色。</p>
     */
    public String [] getUserIds() {
        return this.UserIds;
    }

    /**
     * Set <p>需要授权的用户UserId集合。跟上面的SealId参数配合使用。选填，跟上面的Users同时起作用。<br>支持使用主企业的UserId进行授权， 当使用主企业的UserId时，该UserId 需要有集团角色。</p>
     * @param UserIds <p>需要授权的用户UserId集合。跟上面的SealId参数配合使用。选填，跟上面的Users同时起作用。<br>支持使用主企业的UserId进行授权， 当使用主企业的UserId时，该UserId 需要有集团角色。</p>
     */
    public void setUserIds(String [] UserIds) {
        this.UserIds = UserIds;
    }

    /**
     * Get <p>印章授权内容，最多300 个字符。</p> 
     * @return Policy <p>印章授权内容，最多300 个字符。</p>
     */
    public String getPolicy() {
        return this.Policy;
    }

    /**
     * Set <p>印章授权内容，最多300 个字符。</p>
     * @param Policy <p>印章授权内容，最多300 个字符。</p>
     */
    public void setPolicy(String Policy) {
        this.Policy = Policy;
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
     * Get <p>个性化配置字段，默认不传。</p> 
     * @return Options <p>个性化配置字段，默认不传。</p>
     */
    public Option [] getOptions() {
        return this.Options;
    }

    /**
     * Set <p>个性化配置字段，默认不传。</p>
     * @param Options <p>个性化配置字段，默认不传。</p>
     */
    public void setOptions(Option [] Options) {
        this.Options = Options;
    }

    /**
     * Get <p>针对用印的合同/合同组授权。<br>当单次用印授权时，可以仅在指定合同获得印章授权。<br>此场景下不会触发印章授权回调。</p> 
     * @return AuthorizationFlows <p>针对用印的合同/合同组授权。<br>当单次用印授权时，可以仅在指定合同获得印章授权。<br>此场景下不会触发印章授权回调。</p>
     */
    public SealPolicyAuthorizationFlows getAuthorizationFlows() {
        return this.AuthorizationFlows;
    }

    /**
     * Set <p>针对用印的合同/合同组授权。<br>当单次用印授权时，可以仅在指定合同获得印章授权。<br>此场景下不会触发印章授权回调。</p>
     * @param AuthorizationFlows <p>针对用印的合同/合同组授权。<br>当单次用印授权时，可以仅在指定合同获得印章授权。<br>此场景下不会触发印章授权回调。</p>
     */
    public void setAuthorizationFlows(SealPolicyAuthorizationFlows AuthorizationFlows) {
        this.AuthorizationFlows = AuthorizationFlows;
    }

    public CreateSealPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSealPolicyRequest(CreateSealPolicyRequest source) {
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.Users != null) {
            this.Users = new UserInfo[source.Users.length];
            for (int i = 0; i < source.Users.length; i++) {
                this.Users[i] = new UserInfo(source.Users[i]);
            }
        }
        if (source.SealId != null) {
            this.SealId = new String(source.SealId);
        }
        if (source.Expired != null) {
            this.Expired = new Long(source.Expired);
        }
        if (source.UserIds != null) {
            this.UserIds = new String[source.UserIds.length];
            for (int i = 0; i < source.UserIds.length; i++) {
                this.UserIds[i] = new String(source.UserIds[i]);
            }
        }
        if (source.Policy != null) {
            this.Policy = new String(source.Policy);
        }
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.Options != null) {
            this.Options = new Option[source.Options.length];
            for (int i = 0; i < source.Options.length; i++) {
                this.Options[i] = new Option(source.Options[i]);
            }
        }
        if (source.AuthorizationFlows != null) {
            this.AuthorizationFlows = new SealPolicyAuthorizationFlows(source.AuthorizationFlows);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamArrayObj(map, prefix + "Users.", this.Users);
        this.setParamSimple(map, prefix + "SealId", this.SealId);
        this.setParamSimple(map, prefix + "Expired", this.Expired);
        this.setParamArraySimple(map, prefix + "UserIds.", this.UserIds);
        this.setParamSimple(map, prefix + "Policy", this.Policy);
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamArrayObj(map, prefix + "Options.", this.Options);
        this.setParamObj(map, prefix + "AuthorizationFlows.", this.AuthorizationFlows);

    }
}

