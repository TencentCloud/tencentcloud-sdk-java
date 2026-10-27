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
package com.tencentcloudapi.cvd.v20201104.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreatePolicyRequest extends AbstractModel {

    /**
    * <p>策略名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>策略详情</p>
    */
    @SerializedName("PolicyInfoList")
    @Expose
    private PolicyInfo [] PolicyInfoList;

    /**
    * <p>策略描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>策略作用的用户id</p>
    */
    @SerializedName("UserIds")
    @Expose
    private String [] UserIds;

    /**
     * Get <p>策略名称</p> 
     * @return Name <p>策略名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>策略名称</p>
     * @param Name <p>策略名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>策略详情</p> 
     * @return PolicyInfoList <p>策略详情</p>
     */
    public PolicyInfo [] getPolicyInfoList() {
        return this.PolicyInfoList;
    }

    /**
     * Set <p>策略详情</p>
     * @param PolicyInfoList <p>策略详情</p>
     */
    public void setPolicyInfoList(PolicyInfo [] PolicyInfoList) {
        this.PolicyInfoList = PolicyInfoList;
    }

    /**
     * Get <p>策略描述</p> 
     * @return Description <p>策略描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>策略描述</p>
     * @param Description <p>策略描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>策略作用的用户id</p> 
     * @return UserIds <p>策略作用的用户id</p>
     */
    public String [] getUserIds() {
        return this.UserIds;
    }

    /**
     * Set <p>策略作用的用户id</p>
     * @param UserIds <p>策略作用的用户id</p>
     */
    public void setUserIds(String [] UserIds) {
        this.UserIds = UserIds;
    }

    public CreatePolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreatePolicyRequest(CreatePolicyRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.PolicyInfoList != null) {
            this.PolicyInfoList = new PolicyInfo[source.PolicyInfoList.length];
            for (int i = 0; i < source.PolicyInfoList.length; i++) {
                this.PolicyInfoList[i] = new PolicyInfo(source.PolicyInfoList[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
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
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "PolicyInfoList.", this.PolicyInfoList);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArraySimple(map, prefix + "UserIds.", this.UserIds);

    }
}

