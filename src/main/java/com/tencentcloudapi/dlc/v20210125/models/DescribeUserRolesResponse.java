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

public class DescribeUserRolesResponse extends AbstractModel{

    /**
    * 符合列举条件的总数量
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 用户角色信息
    */
    @SerializedName("UserRoles")
    @Expose
    private UserRole [] UserRoles;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 符合列举条件的总数量 
     * @return Total 符合列举条件的总数量
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 符合列举条件的总数量
     * @param Total 符合列举条件的总数量
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 用户角色信息 
     * @return UserRoles 用户角色信息
     */
    public UserRole [] getUserRoles() {
        return this.UserRoles;
    }

    /**
     * Set 用户角色信息
     * @param UserRoles 用户角色信息
     */
    public void setUserRoles(UserRole [] UserRoles) {
        this.UserRoles = UserRoles;
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

    public DescribeUserRolesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUserRolesResponse(DescribeUserRolesResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.UserRoles != null) {
            this.UserRoles = new UserRole[source.UserRoles.length];
            for (int i = 0; i < source.UserRoles.length; i++) {
                this.UserRoles[i] = new UserRole(source.UserRoles[i]);
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
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArrayObj(map, prefix + "UserRoles.", this.UserRoles);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

