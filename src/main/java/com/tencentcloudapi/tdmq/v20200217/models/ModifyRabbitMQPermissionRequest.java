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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyRabbitMQPermissionRequest extends AbstractModel {

    /**
    * 集群实例Id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 用户名，权限关联的用户
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * vhost名称
    */
    @SerializedName("VirtualHost")
    @Expose
    private String VirtualHost;

    /**
    * 权限类型，declare相关操作，该用户可操作该vhost下的资源名称正则表达式
    */
    @SerializedName("ConfigRegexp")
    @Expose
    private String ConfigRegexp;

    /**
    * 权限类型，消息写入相关操作，该用户可操作该vhost下的资源名称正则表达式
    */
    @SerializedName("WriteRegexp")
    @Expose
    private String WriteRegexp;

    /**
    * 权限类型，消息读取相关操作，该用户可操作该vhost下的资源名称正则表达式
    */
    @SerializedName("ReadRegexp")
    @Expose
    private String ReadRegexp;

    /**
     * Get 集群实例Id 
     * @return InstanceId 集群实例Id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 集群实例Id
     * @param InstanceId 集群实例Id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 用户名，权限关联的用户 
     * @return User 用户名，权限关联的用户
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set 用户名，权限关联的用户
     * @param User 用户名，权限关联的用户
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get vhost名称 
     * @return VirtualHost vhost名称
     */
    public String getVirtualHost() {
        return this.VirtualHost;
    }

    /**
     * Set vhost名称
     * @param VirtualHost vhost名称
     */
    public void setVirtualHost(String VirtualHost) {
        this.VirtualHost = VirtualHost;
    }

    /**
     * Get 权限类型，declare相关操作，该用户可操作该vhost下的资源名称正则表达式 
     * @return ConfigRegexp 权限类型，declare相关操作，该用户可操作该vhost下的资源名称正则表达式
     */
    public String getConfigRegexp() {
        return this.ConfigRegexp;
    }

    /**
     * Set 权限类型，declare相关操作，该用户可操作该vhost下的资源名称正则表达式
     * @param ConfigRegexp 权限类型，declare相关操作，该用户可操作该vhost下的资源名称正则表达式
     */
    public void setConfigRegexp(String ConfigRegexp) {
        this.ConfigRegexp = ConfigRegexp;
    }

    /**
     * Get 权限类型，消息写入相关操作，该用户可操作该vhost下的资源名称正则表达式 
     * @return WriteRegexp 权限类型，消息写入相关操作，该用户可操作该vhost下的资源名称正则表达式
     */
    public String getWriteRegexp() {
        return this.WriteRegexp;
    }

    /**
     * Set 权限类型，消息写入相关操作，该用户可操作该vhost下的资源名称正则表达式
     * @param WriteRegexp 权限类型，消息写入相关操作，该用户可操作该vhost下的资源名称正则表达式
     */
    public void setWriteRegexp(String WriteRegexp) {
        this.WriteRegexp = WriteRegexp;
    }

    /**
     * Get 权限类型，消息读取相关操作，该用户可操作该vhost下的资源名称正则表达式 
     * @return ReadRegexp 权限类型，消息读取相关操作，该用户可操作该vhost下的资源名称正则表达式
     */
    public String getReadRegexp() {
        return this.ReadRegexp;
    }

    /**
     * Set 权限类型，消息读取相关操作，该用户可操作该vhost下的资源名称正则表达式
     * @param ReadRegexp 权限类型，消息读取相关操作，该用户可操作该vhost下的资源名称正则表达式
     */
    public void setReadRegexp(String ReadRegexp) {
        this.ReadRegexp = ReadRegexp;
    }

    public ModifyRabbitMQPermissionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRabbitMQPermissionRequest(ModifyRabbitMQPermissionRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.VirtualHost != null) {
            this.VirtualHost = new String(source.VirtualHost);
        }
        if (source.ConfigRegexp != null) {
            this.ConfigRegexp = new String(source.ConfigRegexp);
        }
        if (source.WriteRegexp != null) {
            this.WriteRegexp = new String(source.WriteRegexp);
        }
        if (source.ReadRegexp != null) {
            this.ReadRegexp = new String(source.ReadRegexp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "VirtualHost", this.VirtualHost);
        this.setParamSimple(map, prefix + "ConfigRegexp", this.ConfigRegexp);
        this.setParamSimple(map, prefix + "WriteRegexp", this.WriteRegexp);
        this.setParamSimple(map, prefix + "ReadRegexp", this.ReadRegexp);

    }
}

