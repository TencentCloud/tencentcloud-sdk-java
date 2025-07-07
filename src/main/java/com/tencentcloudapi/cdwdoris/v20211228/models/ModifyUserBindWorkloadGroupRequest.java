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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyUserBindWorkloadGroupRequest extends AbstractModel {

    /**
    * 集群id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 需要绑定资源组的用户信息，如果一个账户拥有多个主机信息，需要将这些信息都传入
    */
    @SerializedName("BindUsers")
    @Expose
    private BindUser [] BindUsers;

    /**
    * 修改前绑定的资源组名称
    */
    @SerializedName("OldWorkloadGroupName")
    @Expose
    private String OldWorkloadGroupName;

    /**
    * 修改后绑定的资源组名称
    */
    @SerializedName("NewWorkloadGroupName")
    @Expose
    private String NewWorkloadGroupName;

    /**
     * Get 集群id 
     * @return InstanceId 集群id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 集群id
     * @param InstanceId 集群id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 需要绑定资源组的用户信息，如果一个账户拥有多个主机信息，需要将这些信息都传入 
     * @return BindUsers 需要绑定资源组的用户信息，如果一个账户拥有多个主机信息，需要将这些信息都传入
     */
    public BindUser [] getBindUsers() {
        return this.BindUsers;
    }

    /**
     * Set 需要绑定资源组的用户信息，如果一个账户拥有多个主机信息，需要将这些信息都传入
     * @param BindUsers 需要绑定资源组的用户信息，如果一个账户拥有多个主机信息，需要将这些信息都传入
     */
    public void setBindUsers(BindUser [] BindUsers) {
        this.BindUsers = BindUsers;
    }

    /**
     * Get 修改前绑定的资源组名称 
     * @return OldWorkloadGroupName 修改前绑定的资源组名称
     */
    public String getOldWorkloadGroupName() {
        return this.OldWorkloadGroupName;
    }

    /**
     * Set 修改前绑定的资源组名称
     * @param OldWorkloadGroupName 修改前绑定的资源组名称
     */
    public void setOldWorkloadGroupName(String OldWorkloadGroupName) {
        this.OldWorkloadGroupName = OldWorkloadGroupName;
    }

    /**
     * Get 修改后绑定的资源组名称 
     * @return NewWorkloadGroupName 修改后绑定的资源组名称
     */
    public String getNewWorkloadGroupName() {
        return this.NewWorkloadGroupName;
    }

    /**
     * Set 修改后绑定的资源组名称
     * @param NewWorkloadGroupName 修改后绑定的资源组名称
     */
    public void setNewWorkloadGroupName(String NewWorkloadGroupName) {
        this.NewWorkloadGroupName = NewWorkloadGroupName;
    }

    public ModifyUserBindWorkloadGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyUserBindWorkloadGroupRequest(ModifyUserBindWorkloadGroupRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.BindUsers != null) {
            this.BindUsers = new BindUser[source.BindUsers.length];
            for (int i = 0; i < source.BindUsers.length; i++) {
                this.BindUsers[i] = new BindUser(source.BindUsers[i]);
            }
        }
        if (source.OldWorkloadGroupName != null) {
            this.OldWorkloadGroupName = new String(source.OldWorkloadGroupName);
        }
        if (source.NewWorkloadGroupName != null) {
            this.NewWorkloadGroupName = new String(source.NewWorkloadGroupName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "BindUsers.", this.BindUsers);
        this.setParamSimple(map, prefix + "OldWorkloadGroupName", this.OldWorkloadGroupName);
        this.setParamSimple(map, prefix + "NewWorkloadGroupName", this.NewWorkloadGroupName);

    }
}

