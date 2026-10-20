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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateRoleConfigurationApplyScopeRequest extends AbstractModel {

    /**
    * <p>用户目录</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * <p>申请范围条目</p>
    */
    @SerializedName("ApplyScopeInfo")
    @Expose
    private RoleAssignmentInfo [] ApplyScopeInfo;

    /**
     * Get <p>用户目录</p> 
     * @return ZoneId <p>用户目录</p>
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>用户目录</p>
     * @param ZoneId <p>用户目录</p>
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>申请范围条目</p> 
     * @return ApplyScopeInfo <p>申请范围条目</p>
     */
    public RoleAssignmentInfo [] getApplyScopeInfo() {
        return this.ApplyScopeInfo;
    }

    /**
     * Set <p>申请范围条目</p>
     * @param ApplyScopeInfo <p>申请范围条目</p>
     */
    public void setApplyScopeInfo(RoleAssignmentInfo [] ApplyScopeInfo) {
        this.ApplyScopeInfo = ApplyScopeInfo;
    }

    public CreateRoleConfigurationApplyScopeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRoleConfigurationApplyScopeRequest(CreateRoleConfigurationApplyScopeRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.ApplyScopeInfo != null) {
            this.ApplyScopeInfo = new RoleAssignmentInfo[source.ApplyScopeInfo.length];
            for (int i = 0; i < source.ApplyScopeInfo.length; i++) {
                this.ApplyScopeInfo[i] = new RoleAssignmentInfo(source.ApplyScopeInfo[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamArrayObj(map, prefix + "ApplyScopeInfo.", this.ApplyScopeInfo);

    }
}

