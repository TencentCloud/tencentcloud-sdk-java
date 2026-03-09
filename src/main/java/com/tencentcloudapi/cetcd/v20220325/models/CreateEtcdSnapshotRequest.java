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
package com.tencentcloudapi.cetcd.v20220325.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateEtcdSnapshotRequest extends AbstractModel {

    /**
    * etcd实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * etcd快照名称
    */
    @SerializedName("SnapshotName")
    @Expose
    private String SnapshotName;

    /**
    * 备份用户名
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * 备份密码
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
     * Get etcd实例id 
     * @return InstanceId etcd实例id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set etcd实例id
     * @param InstanceId etcd实例id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get etcd快照名称 
     * @return SnapshotName etcd快照名称
     */
    public String getSnapshotName() {
        return this.SnapshotName;
    }

    /**
     * Set etcd快照名称
     * @param SnapshotName etcd快照名称
     */
    public void setSnapshotName(String SnapshotName) {
        this.SnapshotName = SnapshotName;
    }

    /**
     * Get 备份用户名 
     * @return User 备份用户名
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set 备份用户名
     * @param User 备份用户名
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get 备份密码 
     * @return Password 备份密码
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 备份密码
     * @param Password 备份密码
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    public CreateEtcdSnapshotRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateEtcdSnapshotRequest(CreateEtcdSnapshotRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.SnapshotName != null) {
            this.SnapshotName = new String(source.SnapshotName);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "SnapshotName", this.SnapshotName);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "Password", this.Password);

    }
}

