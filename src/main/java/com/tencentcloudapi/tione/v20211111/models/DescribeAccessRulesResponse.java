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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAccessRulesResponse extends AbstractModel {

    /**
    * <p>当前用户有哪些权限</p>
    */
    @SerializedName("AccessRules")
    @Expose
    private AccessRule [] AccessRules;

    /**
    * <p>权限点全量集合</p>
    */
    @SerializedName("FullAccessRules")
    @Expose
    private AccessRule [] FullAccessRules;

    /**
    * <p>当前用户拥有的空间外角色</p>
    */
    @SerializedName("GlobalRoles")
    @Expose
    private String [] GlobalRoles;

    /**
    * <p>当前用户可见的空间列表</p>
    */
    @SerializedName("Workspaces")
    @Expose
    private Workspace [] Workspaces;

    /**
    * <p>当前用户有哪些空间外权限</p>
    */
    @SerializedName("OutsideAccessRules")
    @Expose
    private AccessRule [] OutsideAccessRules;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>当前用户有哪些权限</p> 
     * @return AccessRules <p>当前用户有哪些权限</p>
     */
    public AccessRule [] getAccessRules() {
        return this.AccessRules;
    }

    /**
     * Set <p>当前用户有哪些权限</p>
     * @param AccessRules <p>当前用户有哪些权限</p>
     */
    public void setAccessRules(AccessRule [] AccessRules) {
        this.AccessRules = AccessRules;
    }

    /**
     * Get <p>权限点全量集合</p> 
     * @return FullAccessRules <p>权限点全量集合</p>
     */
    public AccessRule [] getFullAccessRules() {
        return this.FullAccessRules;
    }

    /**
     * Set <p>权限点全量集合</p>
     * @param FullAccessRules <p>权限点全量集合</p>
     */
    public void setFullAccessRules(AccessRule [] FullAccessRules) {
        this.FullAccessRules = FullAccessRules;
    }

    /**
     * Get <p>当前用户拥有的空间外角色</p> 
     * @return GlobalRoles <p>当前用户拥有的空间外角色</p>
     */
    public String [] getGlobalRoles() {
        return this.GlobalRoles;
    }

    /**
     * Set <p>当前用户拥有的空间外角色</p>
     * @param GlobalRoles <p>当前用户拥有的空间外角色</p>
     */
    public void setGlobalRoles(String [] GlobalRoles) {
        this.GlobalRoles = GlobalRoles;
    }

    /**
     * Get <p>当前用户可见的空间列表</p> 
     * @return Workspaces <p>当前用户可见的空间列表</p>
     */
    public Workspace [] getWorkspaces() {
        return this.Workspaces;
    }

    /**
     * Set <p>当前用户可见的空间列表</p>
     * @param Workspaces <p>当前用户可见的空间列表</p>
     */
    public void setWorkspaces(Workspace [] Workspaces) {
        this.Workspaces = Workspaces;
    }

    /**
     * Get <p>当前用户有哪些空间外权限</p> 
     * @return OutsideAccessRules <p>当前用户有哪些空间外权限</p>
     */
    public AccessRule [] getOutsideAccessRules() {
        return this.OutsideAccessRules;
    }

    /**
     * Set <p>当前用户有哪些空间外权限</p>
     * @param OutsideAccessRules <p>当前用户有哪些空间外权限</p>
     */
    public void setOutsideAccessRules(AccessRule [] OutsideAccessRules) {
        this.OutsideAccessRules = OutsideAccessRules;
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

    public DescribeAccessRulesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAccessRulesResponse(DescribeAccessRulesResponse source) {
        if (source.AccessRules != null) {
            this.AccessRules = new AccessRule[source.AccessRules.length];
            for (int i = 0; i < source.AccessRules.length; i++) {
                this.AccessRules[i] = new AccessRule(source.AccessRules[i]);
            }
        }
        if (source.FullAccessRules != null) {
            this.FullAccessRules = new AccessRule[source.FullAccessRules.length];
            for (int i = 0; i < source.FullAccessRules.length; i++) {
                this.FullAccessRules[i] = new AccessRule(source.FullAccessRules[i]);
            }
        }
        if (source.GlobalRoles != null) {
            this.GlobalRoles = new String[source.GlobalRoles.length];
            for (int i = 0; i < source.GlobalRoles.length; i++) {
                this.GlobalRoles[i] = new String(source.GlobalRoles[i]);
            }
        }
        if (source.Workspaces != null) {
            this.Workspaces = new Workspace[source.Workspaces.length];
            for (int i = 0; i < source.Workspaces.length; i++) {
                this.Workspaces[i] = new Workspace(source.Workspaces[i]);
            }
        }
        if (source.OutsideAccessRules != null) {
            this.OutsideAccessRules = new AccessRule[source.OutsideAccessRules.length];
            for (int i = 0; i < source.OutsideAccessRules.length; i++) {
                this.OutsideAccessRules[i] = new AccessRule(source.OutsideAccessRules[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "AccessRules.", this.AccessRules);
        this.setParamArrayObj(map, prefix + "FullAccessRules.", this.FullAccessRules);
        this.setParamArraySimple(map, prefix + "GlobalRoles.", this.GlobalRoles);
        this.setParamArrayObj(map, prefix + "Workspaces.", this.Workspaces);
        this.setParamArrayObj(map, prefix + "OutsideAccessRules.", this.OutsideAccessRules);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

