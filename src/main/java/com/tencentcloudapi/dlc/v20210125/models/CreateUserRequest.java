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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateUserRequest extends AbstractModel{

    /**
    * 需要授权的子用户uin，可以通过腾讯云控制台右上角 → “账号信息” → “账号ID进行查看”。
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 用户描述信息，方便区分不同用户
    */
    @SerializedName("UserDescription")
    @Expose
    private String UserDescription;

    /**
    * 绑定到用户的权限集合
    */
    @SerializedName("PolicySet")
    @Expose
    private Policy [] PolicySet;

    /**
    * 用户类型。ADMIN：管理员 COMMON：一般用户。当用户类型为管理员的时候，不能设置权限集合和绑定的工作组集合，管理员默认拥有所有权限。该参数不填默认为COMMON
    */
    @SerializedName("UserType")
    @Expose
    private String UserType;

    /**
    * 绑定到用户的工作组ID集合。
    */
    @SerializedName("WorkGroupIds")
    @Expose
    private Long [] WorkGroupIds;

    /**
    * 用户别名，字符长度小50
    */
    @SerializedName("UserAlias")
    @Expose
    private String UserAlias;

    /**
     * Get 需要授权的子用户uin，可以通过腾讯云控制台右上角 → “账号信息” → “账号ID进行查看”。 
     * @return UserId 需要授权的子用户uin，可以通过腾讯云控制台右上角 → “账号信息” → “账号ID进行查看”。
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 需要授权的子用户uin，可以通过腾讯云控制台右上角 → “账号信息” → “账号ID进行查看”。
     * @param UserId 需要授权的子用户uin，可以通过腾讯云控制台右上角 → “账号信息” → “账号ID进行查看”。
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 用户描述信息，方便区分不同用户 
     * @return UserDescription 用户描述信息，方便区分不同用户
     */
    public String getUserDescription() {
        return this.UserDescription;
    }

    /**
     * Set 用户描述信息，方便区分不同用户
     * @param UserDescription 用户描述信息，方便区分不同用户
     */
    public void setUserDescription(String UserDescription) {
        this.UserDescription = UserDescription;
    }

    /**
     * Get 绑定到用户的权限集合 
     * @return PolicySet 绑定到用户的权限集合
     */
    public Policy [] getPolicySet() {
        return this.PolicySet;
    }

    /**
     * Set 绑定到用户的权限集合
     * @param PolicySet 绑定到用户的权限集合
     */
    public void setPolicySet(Policy [] PolicySet) {
        this.PolicySet = PolicySet;
    }

    /**
     * Get 用户类型。ADMIN：管理员 COMMON：一般用户。当用户类型为管理员的时候，不能设置权限集合和绑定的工作组集合，管理员默认拥有所有权限。该参数不填默认为COMMON 
     * @return UserType 用户类型。ADMIN：管理员 COMMON：一般用户。当用户类型为管理员的时候，不能设置权限集合和绑定的工作组集合，管理员默认拥有所有权限。该参数不填默认为COMMON
     */
    public String getUserType() {
        return this.UserType;
    }

    /**
     * Set 用户类型。ADMIN：管理员 COMMON：一般用户。当用户类型为管理员的时候，不能设置权限集合和绑定的工作组集合，管理员默认拥有所有权限。该参数不填默认为COMMON
     * @param UserType 用户类型。ADMIN：管理员 COMMON：一般用户。当用户类型为管理员的时候，不能设置权限集合和绑定的工作组集合，管理员默认拥有所有权限。该参数不填默认为COMMON
     */
    public void setUserType(String UserType) {
        this.UserType = UserType;
    }

    /**
     * Get 绑定到用户的工作组ID集合。 
     * @return WorkGroupIds 绑定到用户的工作组ID集合。
     */
    public Long [] getWorkGroupIds() {
        return this.WorkGroupIds;
    }

    /**
     * Set 绑定到用户的工作组ID集合。
     * @param WorkGroupIds 绑定到用户的工作组ID集合。
     */
    public void setWorkGroupIds(Long [] WorkGroupIds) {
        this.WorkGroupIds = WorkGroupIds;
    }

    /**
     * Get 用户别名，字符长度小50 
     * @return UserAlias 用户别名，字符长度小50
     */
    public String getUserAlias() {
        return this.UserAlias;
    }

    /**
     * Set 用户别名，字符长度小50
     * @param UserAlias 用户别名，字符长度小50
     */
    public void setUserAlias(String UserAlias) {
        this.UserAlias = UserAlias;
    }

    public CreateUserRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateUserRequest(CreateUserRequest source) {
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.UserDescription != null) {
            this.UserDescription = new String(source.UserDescription);
        }
        if (source.PolicySet != null) {
            this.PolicySet = new Policy[source.PolicySet.length];
            for (int i = 0; i < source.PolicySet.length; i++) {
                this.PolicySet[i] = new Policy(source.PolicySet[i]);
            }
        }
        if (source.UserType != null) {
            this.UserType = new String(source.UserType);
        }
        if (source.WorkGroupIds != null) {
            this.WorkGroupIds = new Long[source.WorkGroupIds.length];
            for (int i = 0; i < source.WorkGroupIds.length; i++) {
                this.WorkGroupIds[i] = new Long(source.WorkGroupIds[i]);
            }
        }
        if (source.UserAlias != null) {
            this.UserAlias = new String(source.UserAlias);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "UserDescription", this.UserDescription);
        this.setParamArrayObj(map, prefix + "PolicySet.", this.PolicySet);
        this.setParamSimple(map, prefix + "UserType", this.UserType);
        this.setParamArraySimple(map, prefix + "WorkGroupIds.", this.WorkGroupIds);
        this.setParamSimple(map, prefix + "UserAlias", this.UserAlias);

    }
}

