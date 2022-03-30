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

public class CreateWorkGroupRequest extends AbstractModel{

    /**
    * 工作组名称
    */
    @SerializedName("WorkGroupName")
    @Expose
    private String WorkGroupName;

    /**
    * 工作组描述
    */
    @SerializedName("WorkGroupDescription")
    @Expose
    private String WorkGroupDescription;

    /**
    * 工作组绑定的鉴权策略集合
    */
    @SerializedName("PolicySet")
    @Expose
    private Policy [] PolicySet;

    /**
    * 需要绑定到工作组的用户Id集合
    */
    @SerializedName("UserIds")
    @Expose
    private String [] UserIds;

    /**
     * Get 工作组名称 
     * @return WorkGroupName 工作组名称
     */
    public String getWorkGroupName() {
        return this.WorkGroupName;
    }

    /**
     * Set 工作组名称
     * @param WorkGroupName 工作组名称
     */
    public void setWorkGroupName(String WorkGroupName) {
        this.WorkGroupName = WorkGroupName;
    }

    /**
     * Get 工作组描述 
     * @return WorkGroupDescription 工作组描述
     */
    public String getWorkGroupDescription() {
        return this.WorkGroupDescription;
    }

    /**
     * Set 工作组描述
     * @param WorkGroupDescription 工作组描述
     */
    public void setWorkGroupDescription(String WorkGroupDescription) {
        this.WorkGroupDescription = WorkGroupDescription;
    }

    /**
     * Get 工作组绑定的鉴权策略集合 
     * @return PolicySet 工作组绑定的鉴权策略集合
     */
    public Policy [] getPolicySet() {
        return this.PolicySet;
    }

    /**
     * Set 工作组绑定的鉴权策略集合
     * @param PolicySet 工作组绑定的鉴权策略集合
     */
    public void setPolicySet(Policy [] PolicySet) {
        this.PolicySet = PolicySet;
    }

    /**
     * Get 需要绑定到工作组的用户Id集合 
     * @return UserIds 需要绑定到工作组的用户Id集合
     */
    public String [] getUserIds() {
        return this.UserIds;
    }

    /**
     * Set 需要绑定到工作组的用户Id集合
     * @param UserIds 需要绑定到工作组的用户Id集合
     */
    public void setUserIds(String [] UserIds) {
        this.UserIds = UserIds;
    }

    public CreateWorkGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateWorkGroupRequest(CreateWorkGroupRequest source) {
        if (source.WorkGroupName != null) {
            this.WorkGroupName = new String(source.WorkGroupName);
        }
        if (source.WorkGroupDescription != null) {
            this.WorkGroupDescription = new String(source.WorkGroupDescription);
        }
        if (source.PolicySet != null) {
            this.PolicySet = new Policy[source.PolicySet.length];
            for (int i = 0; i < source.PolicySet.length; i++) {
                this.PolicySet[i] = new Policy(source.PolicySet[i]);
            }
        }
        if (source.UserIds != null) {
            this.UserIds = new String[source.UserIds.length];
            for (int i = 0; i < source.UserIds.length; i++) {
                this.UserIds[i] = new String(source.UserIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkGroupName", this.WorkGroupName);
        this.setParamSimple(map, prefix + "WorkGroupDescription", this.WorkGroupDescription);
        this.setParamArrayObj(map, prefix + "PolicySet.", this.PolicySet);
        this.setParamArraySimple(map, prefix + "UserIds.", this.UserIds);

    }
}

