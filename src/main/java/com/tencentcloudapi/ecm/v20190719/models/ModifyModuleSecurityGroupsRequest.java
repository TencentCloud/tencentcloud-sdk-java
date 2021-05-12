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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyModuleSecurityGroupsRequest extends AbstractModel{

    /**
    * 安全组列表。不超过5个。
    */
    @SerializedName("SecurityGroupIdSet")
    @Expose
    private String [] SecurityGroupIdSet;

    /**
    * 模块id。
    */
    @SerializedName("ModuleId")
    @Expose
    private String ModuleId;

    /**
     * Get 安全组列表。不超过5个。 
     * @return SecurityGroupIdSet 安全组列表。不超过5个。
     */
    public String [] getSecurityGroupIdSet() {
        return this.SecurityGroupIdSet;
    }

    /**
     * Set 安全组列表。不超过5个。
     * @param SecurityGroupIdSet 安全组列表。不超过5个。
     */
    public void setSecurityGroupIdSet(String [] SecurityGroupIdSet) {
        this.SecurityGroupIdSet = SecurityGroupIdSet;
    }

    /**
     * Get 模块id。 
     * @return ModuleId 模块id。
     */
    public String getModuleId() {
        return this.ModuleId;
    }

    /**
     * Set 模块id。
     * @param ModuleId 模块id。
     */
    public void setModuleId(String ModuleId) {
        this.ModuleId = ModuleId;
    }

    public ModifyModuleSecurityGroupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyModuleSecurityGroupsRequest(ModifyModuleSecurityGroupsRequest source) {
        if (source.SecurityGroupIdSet != null) {
            this.SecurityGroupIdSet = new String[source.SecurityGroupIdSet.length];
            for (int i = 0; i < source.SecurityGroupIdSet.length; i++) {
                this.SecurityGroupIdSet[i] = new String(source.SecurityGroupIdSet[i]);
            }
        }
        if (source.ModuleId != null) {
            this.ModuleId = new String(source.ModuleId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "SecurityGroupIdSet.", this.SecurityGroupIdSet);
        this.setParamSimple(map, prefix + "ModuleId", this.ModuleId);

    }
}

