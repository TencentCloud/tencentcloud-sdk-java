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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateCfsRuleResponse extends AbstractModel{

    /**
    * 权限组 ID
    */
    @SerializedName("PGroupId")
    @Expose
    private String PGroupId;

    /**
    * 规则 ID
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * 允许访问的客户端 IP 或者 IP 段
    */
    @SerializedName("AuthClientIp")
    @Expose
    private String AuthClientIp;

    /**
    * 读写权限
    */
    @SerializedName("RWPermission")
    @Expose
    private String RWPermission;

    /**
    * 用户权限
    */
    @SerializedName("UserPermission")
    @Expose
    private String UserPermission;

    /**
    * 优先级
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 权限组 ID 
     * @return PGroupId 权限组 ID
     */
    public String getPGroupId() {
        return this.PGroupId;
    }

    /**
     * Set 权限组 ID
     * @param PGroupId 权限组 ID
     */
    public void setPGroupId(String PGroupId) {
        this.PGroupId = PGroupId;
    }

    /**
     * Get 规则 ID 
     * @return RuleId 规则 ID
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则 ID
     * @param RuleId 规则 ID
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 允许访问的客户端 IP 或者 IP 段 
     * @return AuthClientIp 允许访问的客户端 IP 或者 IP 段
     */
    public String getAuthClientIp() {
        return this.AuthClientIp;
    }

    /**
     * Set 允许访问的客户端 IP 或者 IP 段
     * @param AuthClientIp 允许访问的客户端 IP 或者 IP 段
     */
    public void setAuthClientIp(String AuthClientIp) {
        this.AuthClientIp = AuthClientIp;
    }

    /**
     * Get 读写权限 
     * @return RWPermission 读写权限
     */
    public String getRWPermission() {
        return this.RWPermission;
    }

    /**
     * Set 读写权限
     * @param RWPermission 读写权限
     */
    public void setRWPermission(String RWPermission) {
        this.RWPermission = RWPermission;
    }

    /**
     * Get 用户权限 
     * @return UserPermission 用户权限
     */
    public String getUserPermission() {
        return this.UserPermission;
    }

    /**
     * Set 用户权限
     * @param UserPermission 用户权限
     */
    public void setUserPermission(String UserPermission) {
        this.UserPermission = UserPermission;
    }

    /**
     * Get 优先级 
     * @return Priority 优先级
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set 优先级
     * @param Priority 优先级
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PGroupId", this.PGroupId);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "AuthClientIp", this.AuthClientIp);
        this.setParamSimple(map, prefix + "RWPermission", this.RWPermission);
        this.setParamSimple(map, prefix + "UserPermission", this.UserPermission);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

