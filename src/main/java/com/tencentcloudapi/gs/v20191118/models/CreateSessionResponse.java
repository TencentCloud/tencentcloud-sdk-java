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
package com.tencentcloudapi.gs.v20191118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSessionResponse extends AbstractModel {

    /**
    * 服务端session信息，返回给JSSDK
    */
    @SerializedName("ServerSession")
    @Expose
    private String ServerSession;

    /**
    * 【已废弃】
    */
    @SerializedName("RoleNumber")
    @Expose
    private String RoleNumber;

    /**
    * 【互动云游】角色；Player表示玩家；Viewer表示观察者
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 服务端session信息，返回给JSSDK 
     * @return ServerSession 服务端session信息，返回给JSSDK
     */
    public String getServerSession() {
        return this.ServerSession;
    }

    /**
     * Set 服务端session信息，返回给JSSDK
     * @param ServerSession 服务端session信息，返回给JSSDK
     */
    public void setServerSession(String ServerSession) {
        this.ServerSession = ServerSession;
    }

    /**
     * Get 【已废弃】 
     * @return RoleNumber 【已废弃】
     */
    public String getRoleNumber() {
        return this.RoleNumber;
    }

    /**
     * Set 【已废弃】
     * @param RoleNumber 【已废弃】
     */
    public void setRoleNumber(String RoleNumber) {
        this.RoleNumber = RoleNumber;
    }

    /**
     * Get 【互动云游】角色；Player表示玩家；Viewer表示观察者 
     * @return Role 【互动云游】角色；Player表示玩家；Viewer表示观察者
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set 【互动云游】角色；Player表示玩家；Viewer表示观察者
     * @param Role 【互动云游】角色；Player表示玩家；Viewer表示观察者
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public CreateSessionResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSessionResponse(CreateSessionResponse source) {
        if (source.ServerSession != null) {
            this.ServerSession = new String(source.ServerSession);
        }
        if (source.RoleNumber != null) {
            this.RoleNumber = new String(source.RoleNumber);
        }
        if (source.Role != null) {
            this.Role = new String(source.Role);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServerSession", this.ServerSession);
        this.setParamSimple(map, prefix + "RoleNumber", this.RoleNumber);
        this.setParamSimple(map, prefix + "Role", this.Role);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

