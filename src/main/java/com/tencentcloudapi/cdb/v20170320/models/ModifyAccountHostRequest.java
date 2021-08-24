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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAccountHostRequest extends AbstractModel{

    /**
    * 实例 ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 账户的名称
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * 账户的旧主机
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * 账户的新主机
    */
    @SerializedName("NewHost")
    @Expose
    private String NewHost;

    /**
     * Get 实例 ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。 
     * @return InstanceId 实例 ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。
     * @param InstanceId 实例 ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 账户的名称 
     * @return User 账户的名称
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set 账户的名称
     * @param User 账户的名称
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get 账户的旧主机 
     * @return Host 账户的旧主机
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set 账户的旧主机
     * @param Host 账户的旧主机
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get 账户的新主机 
     * @return NewHost 账户的新主机
     */
    public String getNewHost() {
        return this.NewHost;
    }

    /**
     * Set 账户的新主机
     * @param NewHost 账户的新主机
     */
    public void setNewHost(String NewHost) {
        this.NewHost = NewHost;
    }

    public ModifyAccountHostRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAccountHostRequest(ModifyAccountHostRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.NewHost != null) {
            this.NewHost = new String(source.NewHost);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "NewHost", this.NewHost);

    }
}

