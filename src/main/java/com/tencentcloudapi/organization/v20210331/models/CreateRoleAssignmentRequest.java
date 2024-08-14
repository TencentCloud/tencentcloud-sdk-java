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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateRoleAssignmentRequest extends AbstractModel {

    /**
    * 空间 ID。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 授权成员账号信息，最多授权50条。
    */
    @SerializedName("RoleAssignmentInfo")
    @Expose
    private RoleAssignmentInfo [] RoleAssignmentInfo;

    /**
     * Get 空间 ID。 
     * @return ZoneId 空间 ID。
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 空间 ID。
     * @param ZoneId 空间 ID。
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 授权成员账号信息，最多授权50条。 
     * @return RoleAssignmentInfo 授权成员账号信息，最多授权50条。
     */
    public RoleAssignmentInfo [] getRoleAssignmentInfo() {
        return this.RoleAssignmentInfo;
    }

    /**
     * Set 授权成员账号信息，最多授权50条。
     * @param RoleAssignmentInfo 授权成员账号信息，最多授权50条。
     */
    public void setRoleAssignmentInfo(RoleAssignmentInfo [] RoleAssignmentInfo) {
        this.RoleAssignmentInfo = RoleAssignmentInfo;
    }

    public CreateRoleAssignmentRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRoleAssignmentRequest(CreateRoleAssignmentRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.RoleAssignmentInfo != null) {
            this.RoleAssignmentInfo = new RoleAssignmentInfo[source.RoleAssignmentInfo.length];
            for (int i = 0; i < source.RoleAssignmentInfo.length; i++) {
                this.RoleAssignmentInfo[i] = new RoleAssignmentInfo(source.RoleAssignmentInfo[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamArrayObj(map, prefix + "RoleAssignmentInfo.", this.RoleAssignmentInfo);

    }
}

