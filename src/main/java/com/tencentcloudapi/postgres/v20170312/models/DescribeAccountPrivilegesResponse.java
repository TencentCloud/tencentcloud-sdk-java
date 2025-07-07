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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAccountPrivilegesResponse extends AbstractModel {

    /**
    * 用户拥有数据库user_database的CREATE、CONNECT、TEMPORARY权限
    */
    @SerializedName("PrivilegeSet")
    @Expose
    private DatabasePrivilege [] PrivilegeSet;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 用户拥有数据库user_database的CREATE、CONNECT、TEMPORARY权限 
     * @return PrivilegeSet 用户拥有数据库user_database的CREATE、CONNECT、TEMPORARY权限
     */
    public DatabasePrivilege [] getPrivilegeSet() {
        return this.PrivilegeSet;
    }

    /**
     * Set 用户拥有数据库user_database的CREATE、CONNECT、TEMPORARY权限
     * @param PrivilegeSet 用户拥有数据库user_database的CREATE、CONNECT、TEMPORARY权限
     */
    public void setPrivilegeSet(DatabasePrivilege [] PrivilegeSet) {
        this.PrivilegeSet = PrivilegeSet;
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

    public DescribeAccountPrivilegesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAccountPrivilegesResponse(DescribeAccountPrivilegesResponse source) {
        if (source.PrivilegeSet != null) {
            this.PrivilegeSet = new DatabasePrivilege[source.PrivilegeSet.length];
            for (int i = 0; i < source.PrivilegeSet.length; i++) {
                this.PrivilegeSet[i] = new DatabasePrivilege(source.PrivilegeSet[i]);
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
        this.setParamArrayObj(map, prefix + "PrivilegeSet.", this.PrivilegeSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

