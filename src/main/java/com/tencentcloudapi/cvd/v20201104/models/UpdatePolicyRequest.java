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

public class UpdatePolicyRequest extends AbstractModel {

    /**
    * <p>待更新策略id</p>
    */
    @SerializedName("PolicyId")
    @Expose
    private String PolicyId;

    /**
    * <p>更新策略后策略名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>更新策略后策略描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>更新策略的具体修改值（全集）</p>
    */
    @SerializedName("PolicyInfoList")
    @Expose
    private PolicyInfo [] PolicyInfoList;

    /**
    * <p>新增绑定用户列表</p>
    */
    @SerializedName("BindUserIds")
    @Expose
    private String [] BindUserIds;

    /**
    * <p>移除绑定的用户列表</p>
    */
    @SerializedName("RemoveUserIds")
    @Expose
    private String [] RemoveUserIds;

    /**
     * Get <p>待更新策略id</p> 
     * @return PolicyId <p>待更新策略id</p>
     */
    public String getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set <p>待更新策略id</p>
     * @param PolicyId <p>待更新策略id</p>
     */
    public void setPolicyId(String PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get <p>更新策略后策略名称</p> 
     * @return Name <p>更新策略后策略名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>更新策略后策略名称</p>
     * @param Name <p>更新策略后策略名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>更新策略后策略描述</p> 
     * @return Description <p>更新策略后策略描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>更新策略后策略描述</p>
     * @param Description <p>更新策略后策略描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>更新策略的具体修改值（全集）</p> 
     * @return PolicyInfoList <p>更新策略的具体修改值（全集）</p>
     */
    public PolicyInfo [] getPolicyInfoList() {
        return this.PolicyInfoList;
    }

    /**
     * Set <p>更新策略的具体修改值（全集）</p>
     * @param PolicyInfoList <p>更新策略的具体修改值（全集）</p>
     */
    public void setPolicyInfoList(PolicyInfo [] PolicyInfoList) {
        this.PolicyInfoList = PolicyInfoList;
    }

    /**
     * Get <p>新增绑定用户列表</p> 
     * @return BindUserIds <p>新增绑定用户列表</p>
     */
    public String [] getBindUserIds() {
        return this.BindUserIds;
    }

    /**
     * Set <p>新增绑定用户列表</p>
     * @param BindUserIds <p>新增绑定用户列表</p>
     */
    public void setBindUserIds(String [] BindUserIds) {
        this.BindUserIds = BindUserIds;
    }

    /**
     * Get <p>移除绑定的用户列表</p> 
     * @return RemoveUserIds <p>移除绑定的用户列表</p>
     */
    public String [] getRemoveUserIds() {
        return this.RemoveUserIds;
    }

    /**
     * Set <p>移除绑定的用户列表</p>
     * @param RemoveUserIds <p>移除绑定的用户列表</p>
     */
    public void setRemoveUserIds(String [] RemoveUserIds) {
        this.RemoveUserIds = RemoveUserIds;
    }

    public UpdatePolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdatePolicyRequest(UpdatePolicyRequest source) {
        if (source.PolicyId != null) {
            this.PolicyId = new String(source.PolicyId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.PolicyInfoList != null) {
            this.PolicyInfoList = new PolicyInfo[source.PolicyInfoList.length];
            for (int i = 0; i < source.PolicyInfoList.length; i++) {
                this.PolicyInfoList[i] = new PolicyInfo(source.PolicyInfoList[i]);
            }
        }
        if (source.BindUserIds != null) {
            this.BindUserIds = new String[source.BindUserIds.length];
            for (int i = 0; i < source.BindUserIds.length; i++) {
                this.BindUserIds[i] = new String(source.BindUserIds[i]);
            }
        }
        if (source.RemoveUserIds != null) {
            this.RemoveUserIds = new String[source.RemoveUserIds.length];
            for (int i = 0; i < source.RemoveUserIds.length; i++) {
                this.RemoveUserIds[i] = new String(source.RemoveUserIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArrayObj(map, prefix + "PolicyInfoList.", this.PolicyInfoList);
        this.setParamArraySimple(map, prefix + "BindUserIds.", this.BindUserIds);
        this.setParamArraySimple(map, prefix + "RemoveUserIds.", this.RemoveUserIds);

    }
}

