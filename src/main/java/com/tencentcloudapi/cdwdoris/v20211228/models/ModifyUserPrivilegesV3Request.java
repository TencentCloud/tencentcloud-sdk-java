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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyUserPrivilegesV3Request extends AbstractModel {

    /**
    * 集群id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 用户名
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 用户权限
    */
    @SerializedName("UserPrivileges")
    @Expose
    private UpdateUserPrivileges UserPrivileges;

    /**
    * 用户链接来自的 IP	
    */
    @SerializedName("WhiteHost")
    @Expose
    private String WhiteHost;

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
     * Get 用户名 
     * @return UserName 用户名
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 用户名
     * @param UserName 用户名
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 用户权限 
     * @return UserPrivileges 用户权限
     */
    public UpdateUserPrivileges getUserPrivileges() {
        return this.UserPrivileges;
    }

    /**
     * Set 用户权限
     * @param UserPrivileges 用户权限
     */
    public void setUserPrivileges(UpdateUserPrivileges UserPrivileges) {
        this.UserPrivileges = UserPrivileges;
    }

    /**
     * Get 用户链接来自的 IP	 
     * @return WhiteHost 用户链接来自的 IP	
     */
    public String getWhiteHost() {
        return this.WhiteHost;
    }

    /**
     * Set 用户链接来自的 IP	
     * @param WhiteHost 用户链接来自的 IP	
     */
    public void setWhiteHost(String WhiteHost) {
        this.WhiteHost = WhiteHost;
    }

    public ModifyUserPrivilegesV3Request() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyUserPrivilegesV3Request(ModifyUserPrivilegesV3Request source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.UserPrivileges != null) {
            this.UserPrivileges = new UpdateUserPrivileges(source.UserPrivileges);
        }
        if (source.WhiteHost != null) {
            this.WhiteHost = new String(source.WhiteHost);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamObj(map, prefix + "UserPrivileges.", this.UserPrivileges);
        this.setParamSimple(map, prefix + "WhiteHost", this.WhiteHost);

    }
}

