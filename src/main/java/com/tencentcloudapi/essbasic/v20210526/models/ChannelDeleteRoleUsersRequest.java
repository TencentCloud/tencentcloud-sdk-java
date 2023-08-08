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
    * 代理信息此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 必填。
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * 角色Id（非超管或法人角色Id）
    */
    @SerializedName("RoleId")
    @Expose
    private String RoleId;

    /**
    * 电子签用户ID列表，与OpenIds参数二选一,优先UserIds参数，最多两百
    */
    @SerializedName("UserIds")
    @Expose
    private String [] UserIds;

    /**
    * 操作人信息
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * 客户系统用户ID列表，与UserIds参数二选一,优先UserIds参数，最多两百
    */
    @SerializedName("OpenIds")
    @Expose
    private String [] OpenIds;

    /**
     * Get 代理信息此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 必填。 
     * @return Agent 代理信息此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 必填。
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set 代理信息此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 必填。
     * @param Agent 代理信息此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 必填。
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get 角色Id（非超管或法人角色Id） 
     * @return RoleId 角色Id（非超管或法人角色Id）
     */
    public String getRoleId() {
        return this.RoleId;
    }

    /**
     * Set 角色Id（非超管或法人角色Id）
     * @param RoleId 角色Id（非超管或法人角色Id）
     */
    public void setRoleId(String RoleId) {
        this.RoleId = RoleId;
    }

    /**
     * Get 电子签用户ID列表，与OpenIds参数二选一,优先UserIds参数，最多两百 
     * @return UserIds 电子签用户ID列表，与OpenIds参数二选一,优先UserIds参数，最多两百
     */
    public String [] getUserIds() {
        return this.UserIds;
    }

    /**
     * Set 电子签用户ID列表，与OpenIds参数二选一,优先UserIds参数，最多两百
     * @param UserIds 电子签用户ID列表，与OpenIds参数二选一,优先UserIds参数，最多两百
     */
    public void setUserIds(String [] UserIds) {
        this.UserIds = UserIds;
    }

    /**
     * Get 操作人信息 
     * @return Operator 操作人信息
     * @deprecated
     */
    @Deprecated
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作人信息
     * @param Operator 操作人信息
     * @deprecated
     */
    @Deprecated
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 客户系统用户ID列表，与UserIds参数二选一,优先UserIds参数，最多两百 
     * @return OpenIds 客户系统用户ID列表，与UserIds参数二选一,优先UserIds参数，最多两百
     */
    public String [] getOpenIds() {
        return this.OpenIds;
    }

    /**
     * Set 客户系统用户ID列表，与UserIds参数二选一,优先UserIds参数，最多两百
     * @param OpenIds 客户系统用户ID列表，与UserIds参数二选一,优先UserIds参数，最多两百
     */
    public void setOpenIds(String [] OpenIds) {
        this.OpenIds = OpenIds;
    }

    public ChannelDeleteRoleUsersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChannelDeleteRoleUsersRequest(ChannelDeleteRoleUsersRequest source) {
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
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
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.OpenIds != null) {
            this.OpenIds = new String[source.OpenIds.length];
            for (int i = 0; i < source.OpenIds.length; i++) {
                this.OpenIds[i] = new String(source.OpenIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamSimple(map, prefix + "RoleId", this.RoleId);
        this.setParamArraySimple(map, prefix + "UserIds.", this.UserIds);
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamArraySimple(map, prefix + "OpenIds.", this.OpenIds);

    }
}

