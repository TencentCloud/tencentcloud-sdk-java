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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyRabbitMQUserRequest extends AbstractModel {

    /**
    * <p>实例 ID，形如 amqp-xxxxxxxx。有效的 InstanceId 可通过登录 <a href="https://console.cloud.tencent.com/trabbitmq/cluster?rid=1">TDMQ RabbitMQ 控制台</a>查询。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>用户名，形如rabbitmq。有效的 User 名称可通过登录 <a href="https://console.cloud.tencent.com/trabbitmq/cluster?rid=1">TDMQ RabbitMQ 控制台</a>查询，点击集群列表中的集群，进入集群详情，并在用户与权限页签中找到用户列表，从而找到用户名称。当前不支持修改admin的密码。</p>
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * <p>密码，登录时使用。规范：不能为空，8-64个字符，至少要包含小写字母、大写字母、数字、特殊字符【()`~!@#$%^&amp;*_=|{}[]:;&#39;,.?/】中的两项</p>
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * <p>描述，不传则不修改</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>用户标签，用于决定改用户访问 RabbitMQ Management 的权限范围<br>management：普通控制台用户，monitoring：管理型控制台用户，其他值：非控制台用户</p>
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * <p>该用户的最大连接数，不传则不修改</p>
    */
    @SerializedName("MaxConnections")
    @Expose
    private Long MaxConnections;

    /**
    * <p>该用户的最大channel数，不传则不修改</p>
    */
    @SerializedName("MaxChannels")
    @Expose
    private Long MaxChannels;

    /**
    * <p>是否开启cam验证</p>
    */
    @SerializedName("EnableCamAuth")
    @Expose
    private Boolean EnableCamAuth;

    /**
     * Get <p>实例 ID，形如 amqp-xxxxxxxx。有效的 InstanceId 可通过登录 <a href="https://console.cloud.tencent.com/trabbitmq/cluster?rid=1">TDMQ RabbitMQ 控制台</a>查询。</p> 
     * @return InstanceId <p>实例 ID，形如 amqp-xxxxxxxx。有效的 InstanceId 可通过登录 <a href="https://console.cloud.tencent.com/trabbitmq/cluster?rid=1">TDMQ RabbitMQ 控制台</a>查询。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例 ID，形如 amqp-xxxxxxxx。有效的 InstanceId 可通过登录 <a href="https://console.cloud.tencent.com/trabbitmq/cluster?rid=1">TDMQ RabbitMQ 控制台</a>查询。</p>
     * @param InstanceId <p>实例 ID，形如 amqp-xxxxxxxx。有效的 InstanceId 可通过登录 <a href="https://console.cloud.tencent.com/trabbitmq/cluster?rid=1">TDMQ RabbitMQ 控制台</a>查询。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>用户名，形如rabbitmq。有效的 User 名称可通过登录 <a href="https://console.cloud.tencent.com/trabbitmq/cluster?rid=1">TDMQ RabbitMQ 控制台</a>查询，点击集群列表中的集群，进入集群详情，并在用户与权限页签中找到用户列表，从而找到用户名称。当前不支持修改admin的密码。</p> 
     * @return User <p>用户名，形如rabbitmq。有效的 User 名称可通过登录 <a href="https://console.cloud.tencent.com/trabbitmq/cluster?rid=1">TDMQ RabbitMQ 控制台</a>查询，点击集群列表中的集群，进入集群详情，并在用户与权限页签中找到用户列表，从而找到用户名称。当前不支持修改admin的密码。</p>
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set <p>用户名，形如rabbitmq。有效的 User 名称可通过登录 <a href="https://console.cloud.tencent.com/trabbitmq/cluster?rid=1">TDMQ RabbitMQ 控制台</a>查询，点击集群列表中的集群，进入集群详情，并在用户与权限页签中找到用户列表，从而找到用户名称。当前不支持修改admin的密码。</p>
     * @param User <p>用户名，形如rabbitmq。有效的 User 名称可通过登录 <a href="https://console.cloud.tencent.com/trabbitmq/cluster?rid=1">TDMQ RabbitMQ 控制台</a>查询，点击集群列表中的集群，进入集群详情，并在用户与权限页签中找到用户列表，从而找到用户名称。当前不支持修改admin的密码。</p>
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get <p>密码，登录时使用。规范：不能为空，8-64个字符，至少要包含小写字母、大写字母、数字、特殊字符【()`~!@#$%^&amp;*_=|{}[]:;&#39;,.?/】中的两项</p> 
     * @return Password <p>密码，登录时使用。规范：不能为空，8-64个字符，至少要包含小写字母、大写字母、数字、特殊字符【()`~!@#$%^&amp;*_=|{}[]:;&#39;,.?/】中的两项</p>
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set <p>密码，登录时使用。规范：不能为空，8-64个字符，至少要包含小写字母、大写字母、数字、特殊字符【()`~!@#$%^&amp;*_=|{}[]:;&#39;,.?/】中的两项</p>
     * @param Password <p>密码，登录时使用。规范：不能为空，8-64个字符，至少要包含小写字母、大写字母、数字、特殊字符【()`~!@#$%^&amp;*_=|{}[]:;&#39;,.?/】中的两项</p>
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get <p>描述，不传则不修改</p> 
     * @return Description <p>描述，不传则不修改</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>描述，不传则不修改</p>
     * @param Description <p>描述，不传则不修改</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>用户标签，用于决定改用户访问 RabbitMQ Management 的权限范围<br>management：普通控制台用户，monitoring：管理型控制台用户，其他值：非控制台用户</p> 
     * @return Tags <p>用户标签，用于决定改用户访问 RabbitMQ Management 的权限范围<br>management：普通控制台用户，monitoring：管理型控制台用户，其他值：非控制台用户</p>
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>用户标签，用于决定改用户访问 RabbitMQ Management 的权限范围<br>management：普通控制台用户，monitoring：管理型控制台用户，其他值：非控制台用户</p>
     * @param Tags <p>用户标签，用于决定改用户访问 RabbitMQ Management 的权限范围<br>management：普通控制台用户，monitoring：管理型控制台用户，其他值：非控制台用户</p>
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>该用户的最大连接数，不传则不修改</p> 
     * @return MaxConnections <p>该用户的最大连接数，不传则不修改</p>
     */
    public Long getMaxConnections() {
        return this.MaxConnections;
    }

    /**
     * Set <p>该用户的最大连接数，不传则不修改</p>
     * @param MaxConnections <p>该用户的最大连接数，不传则不修改</p>
     */
    public void setMaxConnections(Long MaxConnections) {
        this.MaxConnections = MaxConnections;
    }

    /**
     * Get <p>该用户的最大channel数，不传则不修改</p> 
     * @return MaxChannels <p>该用户的最大channel数，不传则不修改</p>
     */
    public Long getMaxChannels() {
        return this.MaxChannels;
    }

    /**
     * Set <p>该用户的最大channel数，不传则不修改</p>
     * @param MaxChannels <p>该用户的最大channel数，不传则不修改</p>
     */
    public void setMaxChannels(Long MaxChannels) {
        this.MaxChannels = MaxChannels;
    }

    /**
     * Get <p>是否开启cam验证</p> 
     * @return EnableCamAuth <p>是否开启cam验证</p>
     */
    public Boolean getEnableCamAuth() {
        return this.EnableCamAuth;
    }

    /**
     * Set <p>是否开启cam验证</p>
     * @param EnableCamAuth <p>是否开启cam验证</p>
     */
    public void setEnableCamAuth(Boolean EnableCamAuth) {
        this.EnableCamAuth = EnableCamAuth;
    }

    public ModifyRabbitMQUserRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRabbitMQUserRequest(ModifyRabbitMQUserRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
        if (source.MaxConnections != null) {
            this.MaxConnections = new Long(source.MaxConnections);
        }
        if (source.MaxChannels != null) {
            this.MaxChannels = new Long(source.MaxChannels);
        }
        if (source.EnableCamAuth != null) {
            this.EnableCamAuth = new Boolean(source.EnableCamAuth);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "MaxConnections", this.MaxConnections);
        this.setParamSimple(map, prefix + "MaxChannels", this.MaxChannels);
        this.setParamSimple(map, prefix + "EnableCamAuth", this.EnableCamAuth);

    }
}

