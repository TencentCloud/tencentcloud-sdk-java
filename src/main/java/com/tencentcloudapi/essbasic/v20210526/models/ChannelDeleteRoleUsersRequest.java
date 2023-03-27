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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChannelDeleteRoleUsersRequest extends AbstractModel{

    /**
    * 操作人信息
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * 角色Id
    */
    @SerializedName("RoleId")
    @Expose
    private String RoleId;

    /**
    * 用户列表
    */
    @SerializedName("UserIds")
    @Expose
    private String [] UserIds;

    /**
    * 代理信息
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

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
     * Get 角色Id 
     * @return RoleId 角色Id
     */
    public String getRoleId() {
        return this.RoleId;
    }

    /**
     * Set 角色Id
     * @param RoleId 角色Id
     */
    public void setRoleId(String RoleId) {
        this.RoleId = RoleId;
    }

    /**
     * Get 用户列表 
     * @return UserIds 用户列表
     */
    public String [] getUserIds() {
        return this.UserIds;
    }

    /**
     * Set 用户列表
     * @param UserIds 用户列表
     */
    public void setUserIds(String [] UserIds) {
        this.UserIds = UserIds;
    }

    /**
     * Get 代理信息 
     * @return Agent 代理信息
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set 代理信息
     * @param Agent 代理信息
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    public ChannelDeleteRoleUsersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChannelDeleteRoleUsersRequest(ChannelDeleteRoleUsersRequest source) {
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.RoleId != null) {
            this.RoleId = new String(source.RoleId);
        }
        if (source.UserIds != null) {
            this.UserIds = new String[source.UserIds.length];
            for (int i = 0; i < source.UserIds.length; i++) {
                this.UserIds[i] = new String(source.UserIds[i]);
            }
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
        this.setParamSimple(map, prefix + "RoleId", this.RoleId);
        this.setParamArraySimple(map, prefix + "UserIds.", this.UserIds);
        this.setParamObj(map, prefix + "Agent.", this.Agent);

    }
}

