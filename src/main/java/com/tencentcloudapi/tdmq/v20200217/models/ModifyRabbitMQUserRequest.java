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
    * 实例 ID，形如 amqp-xxxxxxxx。有效的 InstanceId 可通过登录 [TDMQ RabbitMQ 控制台](https://console.cloud.tencent.com/trabbitmq/cluster?rid=1)查询。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 用户名，形如 admin。有效的 User 名称可通过登录 [TDMQ RabbitMQ 控制台](https://console.cloud.tencent.com/trabbitmq/cluster?rid=1)查询，点击集群列表中的集群，进入集群详情，并在用户与权限页签中找到用户列表，从而找到用户名称。
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * 密码，登录时使用。规范：不能为空，8-64个字符，至少要包含小写字母、大写字母、数字、特殊字符【()`~!@#$%^&*_=|{}[]:;',.?/】中的两项
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 描述，不传则不修改
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 用户标签，用于决定改用户访问 RabbitMQ Management 的权限范围
management：普通控制台用户，monitoring：管理型控制台用户，其他值：非控制台用户
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * 该用户的最大连接数，不传则不修改
    */
    @SerializedName("MaxConnections")
    @Expose
    private Long MaxConnections;

    /**
    * 该用户的最大channel数，不传则不修改
    */
    @SerializedName("MaxChannels")
    @Expose
    private Long MaxChannels;

    /**
     * Get 实例 ID，形如 amqp-xxxxxxxx。有效的 InstanceId 可通过登录 [TDMQ RabbitMQ 控制台](https://console.cloud.tencent.com/trabbitmq/cluster?rid=1)查询。 
     * @return InstanceId 实例 ID，形如 amqp-xxxxxxxx。有效的 InstanceId 可通过登录 [TDMQ RabbitMQ 控制台](https://console.cloud.tencent.com/trabbitmq/cluster?rid=1)查询。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID，形如 amqp-xxxxxxxx。有效的 InstanceId 可通过登录 [TDMQ RabbitMQ 控制台](https://console.cloud.tencent.com/trabbitmq/cluster?rid=1)查询。
     * @param InstanceId 实例 ID，形如 amqp-xxxxxxxx。有效的 InstanceId 可通过登录 [TDMQ RabbitMQ 控制台](https://console.cloud.tencent.com/trabbitmq/cluster?rid=1)查询。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 用户名，形如 admin。有效的 User 名称可通过登录 [TDMQ RabbitMQ 控制台](https://console.cloud.tencent.com/trabbitmq/cluster?rid=1)查询，点击集群列表中的集群，进入集群详情，并在用户与权限页签中找到用户列表，从而找到用户名称。 
     * @return User 用户名，形如 admin。有效的 User 名称可通过登录 [TDMQ RabbitMQ 控制台](https://console.cloud.tencent.com/trabbitmq/cluster?rid=1)查询，点击集群列表中的集群，进入集群详情，并在用户与权限页签中找到用户列表，从而找到用户名称。
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set 用户名，形如 admin。有效的 User 名称可通过登录 [TDMQ RabbitMQ 控制台](https://console.cloud.tencent.com/trabbitmq/cluster?rid=1)查询，点击集群列表中的集群，进入集群详情，并在用户与权限页签中找到用户列表，从而找到用户名称。
     * @param User 用户名，形如 admin。有效的 User 名称可通过登录 [TDMQ RabbitMQ 控制台](https://console.cloud.tencent.com/trabbitmq/cluster?rid=1)查询，点击集群列表中的集群，进入集群详情，并在用户与权限页签中找到用户列表，从而找到用户名称。
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get 密码，登录时使用。规范：不能为空，8-64个字符，至少要包含小写字母、大写字母、数字、特殊字符【()`~!@#$%^&*_=|{}[]:;',.?/】中的两项 
     * @return Password 密码，登录时使用。规范：不能为空，8-64个字符，至少要包含小写字母、大写字母、数字、特殊字符【()`~!@#$%^&*_=|{}[]:;',.?/】中的两项
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 密码，登录时使用。规范：不能为空，8-64个字符，至少要包含小写字母、大写字母、数字、特殊字符【()`~!@#$%^&*_=|{}[]:;',.?/】中的两项
     * @param Password 密码，登录时使用。规范：不能为空，8-64个字符，至少要包含小写字母、大写字母、数字、特殊字符【()`~!@#$%^&*_=|{}[]:;',.?/】中的两项
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get 描述，不传则不修改 
     * @return Description 描述，不传则不修改
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述，不传则不修改
     * @param Description 描述，不传则不修改
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 用户标签，用于决定改用户访问 RabbitMQ Management 的权限范围
management：普通控制台用户，monitoring：管理型控制台用户，其他值：非控制台用户 
     * @return Tags 用户标签，用于决定改用户访问 RabbitMQ Management 的权限范围
management：普通控制台用户，monitoring：管理型控制台用户，其他值：非控制台用户
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set 用户标签，用于决定改用户访问 RabbitMQ Management 的权限范围
management：普通控制台用户，monitoring：管理型控制台用户，其他值：非控制台用户
     * @param Tags 用户标签，用于决定改用户访问 RabbitMQ Management 的权限范围
management：普通控制台用户，monitoring：管理型控制台用户，其他值：非控制台用户
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 该用户的最大连接数，不传则不修改 
     * @return MaxConnections 该用户的最大连接数，不传则不修改
     */
    public Long getMaxConnections() {
        return this.MaxConnections;
    }

    /**
     * Set 该用户的最大连接数，不传则不修改
     * @param MaxConnections 该用户的最大连接数，不传则不修改
     */
    public void setMaxConnections(Long MaxConnections) {
        this.MaxConnections = MaxConnections;
    }

    /**
     * Get 该用户的最大channel数，不传则不修改 
     * @return MaxChannels 该用户的最大channel数，不传则不修改
     */
    public Long getMaxChannels() {
        return this.MaxChannels;
    }

    /**
     * Set 该用户的最大channel数，不传则不修改
     * @param MaxChannels 该用户的最大channel数，不传则不修改
     */
    public void setMaxChannels(Long MaxChannels) {
        this.MaxChannels = MaxChannels;
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

    }
}

