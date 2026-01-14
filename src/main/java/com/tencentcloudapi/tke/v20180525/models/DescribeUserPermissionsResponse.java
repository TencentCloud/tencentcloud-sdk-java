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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUserPermissionsResponse extends AbstractModel {

    /**
    * 用户在当前地域下所有集群中的权限列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Permissions")
    @Expose
    private PermissionItem [] Permissions;

    /**
    * 用户唯一标识符
    */
    @SerializedName("TargetUin")
    @Expose
    private String TargetUin;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 用户在当前地域下所有集群中的权限列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Permissions 用户在当前地域下所有集群中的权限列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PermissionItem [] getPermissions() {
        return this.Permissions;
    }

    /**
     * Set 用户在当前地域下所有集群中的权限列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Permissions 用户在当前地域下所有集群中的权限列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPermissions(PermissionItem [] Permissions) {
        this.Permissions = Permissions;
    }

    /**
     * Get 用户唯一标识符 
     * @return TargetUin 用户唯一标识符
     */
    public String getTargetUin() {
        return this.TargetUin;
    }

    /**
     * Set 用户唯一标识符
     * @param TargetUin 用户唯一标识符
     */
    public void setTargetUin(String TargetUin) {
        this.TargetUin = TargetUin;
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

    public DescribeUserPermissionsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUserPermissionsResponse(DescribeUserPermissionsResponse source) {
        if (source.Permissions != null) {
            this.Permissions = new PermissionItem[source.Permissions.length];
            for (int i = 0; i < source.Permissions.length; i++) {
                this.Permissions[i] = new PermissionItem(source.Permissions[i]);
            }
        }
        if (source.TargetUin != null) {
            this.TargetUin = new String(source.TargetUin);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Permissions.", this.Permissions);
        this.setParamSimple(map, prefix + "TargetUin", this.TargetUin);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

