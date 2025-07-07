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
    * 执行本接口操作的员工信息。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * 用户在电子文件签署平台标识信息，具体参考UserInfo结构体。可跟下面的UserIds可叠加起作用
    */
    @SerializedName("Users")
    @Expose
    private UserInfo [] Users;

    /**
    * 电子印章ID，为32位字符串。
建议开发者保留此印章ID，后续指定签署区印章或者操作印章需此印章ID。
可登录腾讯电子签控制台，在 "印章"->"印章中心"选择查看的印章，在"印章详情" 中查看某个印章的SealId(在页面中展示为印章ID)。
    */
    @SerializedName("SealId")
    @Expose
    private String SealId;

    /**
    * 授权有效期，时间戳秒级。可以传0，代表有效期到2099年12月12日23点59分59秒。
    */
    @SerializedName("Expired")
    @Expose
    private Long Expired;

    /**
    * 需要授权的用户UserId集合。跟上面的SealId参数配合使用。选填，跟上面的Users同时起作用
    */
    @SerializedName("UserIds")
    @Expose
    private String [] UserIds;

    /**
    * 印章授权内容
    */
    @SerializedName("Policy")
    @Expose
    private String Policy;

    /**
    * 代理企业和员工的信息。
在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

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
     * Get 用户在电子文件签署平台标识信息，具体参考UserInfo结构体。可跟下面的UserIds可叠加起作用 
     * @return Users 用户在电子文件签署平台标识信息，具体参考UserInfo结构体。可跟下面的UserIds可叠加起作用
     */
    public UserInfo [] getUsers() {
        return this.Users;
    }

    /**
     * Set 用户在电子文件签署平台标识信息，具体参考UserInfo结构体。可跟下面的UserIds可叠加起作用
     * @param Users 用户在电子文件签署平台标识信息，具体参考UserInfo结构体。可跟下面的UserIds可叠加起作用
     */
    public void setUsers(UserInfo [] Users) {
        this.Users = Users;
    }

    /**
     * Get 电子印章ID，为32位字符串。
建议开发者保留此印章ID，后续指定签署区印章或者操作印章需此印章ID。
可登录腾讯电子签控制台，在 "印章"->"印章中心"选择查看的印章，在"印章详情" 中查看某个印章的SealId(在页面中展示为印章ID)。 
     * @return SealId 电子印章ID，为32位字符串。
建议开发者保留此印章ID，后续指定签署区印章或者操作印章需此印章ID。
可登录腾讯电子签控制台，在 "印章"->"印章中心"选择查看的印章，在"印章详情" 中查看某个印章的SealId(在页面中展示为印章ID)。
     */
    public String getSealId() {
        return this.SealId;
    }

    /**
     * Set 电子印章ID，为32位字符串。
建议开发者保留此印章ID，后续指定签署区印章或者操作印章需此印章ID。
可登录腾讯电子签控制台，在 "印章"->"印章中心"选择查看的印章，在"印章详情" 中查看某个印章的SealId(在页面中展示为印章ID)。
     * @param SealId 电子印章ID，为32位字符串。
建议开发者保留此印章ID，后续指定签署区印章或者操作印章需此印章ID。
可登录腾讯电子签控制台，在 "印章"->"印章中心"选择查看的印章，在"印章详情" 中查看某个印章的SealId(在页面中展示为印章ID)。
     */
    public void setSealId(String SealId) {
        this.SealId = SealId;
    }

    /**
     * Get 授权有效期，时间戳秒级。可以传0，代表有效期到2099年12月12日23点59分59秒。 
     * @return Expired 授权有效期，时间戳秒级。可以传0，代表有效期到2099年12月12日23点59分59秒。
     */
    public Long getExpired() {
        return this.Expired;
    }

    /**
     * Set 授权有效期，时间戳秒级。可以传0，代表有效期到2099年12月12日23点59分59秒。
     * @param Expired 授权有效期，时间戳秒级。可以传0，代表有效期到2099年12月12日23点59分59秒。
     */
    public void setExpired(Long Expired) {
        this.Expired = Expired;
    }

    /**
     * Get 需要授权的用户UserId集合。跟上面的SealId参数配合使用。选填，跟上面的Users同时起作用 
     * @return UserIds 需要授权的用户UserId集合。跟上面的SealId参数配合使用。选填，跟上面的Users同时起作用
     */
    public String [] getUserIds() {
        return this.UserIds;
    }

    /**
     * Set 需要授权的用户UserId集合。跟上面的SealId参数配合使用。选填，跟上面的Users同时起作用
     * @param UserIds 需要授权的用户UserId集合。跟上面的SealId参数配合使用。选填，跟上面的Users同时起作用
     */
    public void setUserIds(String [] UserIds) {
        this.UserIds = UserIds;
    }

    /**
     * Get 印章授权内容 
     * @return Policy 印章授权内容
     */
    public String getPolicy() {
        return this.Policy;
    }

    /**
     * Set 印章授权内容
     * @param Policy 印章授权内容
     */
    public void setPolicy(String Policy) {
        this.Policy = Policy;
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

    }
}

