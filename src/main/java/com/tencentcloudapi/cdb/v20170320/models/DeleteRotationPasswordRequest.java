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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteRotationPasswordRequest extends AbstractModel {

    /**
    * 实例 ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 关闭密码轮转的实例账户名,例如root
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * 关闭密码轮转的实例账户域名，例如%
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * 关闭密码轮转后实例账户的最新密码
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
     * Get 实例 ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同 
     * @return InstanceId 实例 ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同
     * @param InstanceId 实例 ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 关闭密码轮转的实例账户名,例如root 
     * @return User 关闭密码轮转的实例账户名,例如root
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set 关闭密码轮转的实例账户名,例如root
     * @param User 关闭密码轮转的实例账户名,例如root
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get 关闭密码轮转的实例账户域名，例如% 
     * @return Host 关闭密码轮转的实例账户域名，例如%
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set 关闭密码轮转的实例账户域名，例如%
     * @param Host 关闭密码轮转的实例账户域名，例如%
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get 关闭密码轮转后实例账户的最新密码 
     * @return Password 关闭密码轮转后实例账户的最新密码
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 关闭密码轮转后实例账户的最新密码
     * @param Password 关闭密码轮转后实例账户的最新密码
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    public DeleteRotationPasswordRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteRotationPasswordRequest(DeleteRotationPasswordRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
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
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Password", this.Password);

    }
}

