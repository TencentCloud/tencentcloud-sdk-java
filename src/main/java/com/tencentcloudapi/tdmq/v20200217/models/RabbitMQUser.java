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

public class RabbitMQUser extends AbstractModel {

    /**
    * 实例 ID，形如 amqp-xxxxxxxx。有效的 InstanceId 可通过登录 [TDMQ RabbitMQ 控制台](https://console.cloud.tencent.com/trabbitmq/cluster?rid=1)查询。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 用户名，登录时使用
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * 密码，登录时使用
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 用户描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 用户标签，用于决定改用户访问RabbitMQ Management的权限范围
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * 用户创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 用户最后修改时间
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * 用户类型，System：系统创建，User：用户创建
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 单个用户最大可用连接数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxConnections")
    @Expose
    private Long MaxConnections;

    /**
    * 单个用户最大可用通道数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxChannels")
    @Expose
    private Long MaxChannels;

    /**
    * 创建时间时间戳
    */
    @SerializedName("CreateTs")
    @Expose
    private Long CreateTs;

    /**
    * 修改时间时间戳
    */
    @SerializedName("ModifyTs")
    @Expose
    private Long ModifyTs;

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
     * Get 用户名，登录时使用 
     * @return User 用户名，登录时使用
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set 用户名，登录时使用
     * @param User 用户名，登录时使用
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get 密码，登录时使用 
     * @return Password 密码，登录时使用
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 密码，登录时使用
     * @param Password 密码，登录时使用
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get 用户描述 
     * @return Description 用户描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 用户描述
     * @param Description 用户描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 用户标签，用于决定改用户访问RabbitMQ Management的权限范围 
     * @return Tags 用户标签，用于决定改用户访问RabbitMQ Management的权限范围
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set 用户标签，用于决定改用户访问RabbitMQ Management的权限范围
     * @param Tags 用户标签，用于决定改用户访问RabbitMQ Management的权限范围
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 用户创建时间 
     * @return CreateTime 用户创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 用户创建时间
     * @param CreateTime 用户创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 用户最后修改时间 
     * @return ModifyTime 用户最后修改时间
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 用户最后修改时间
     * @param ModifyTime 用户最后修改时间
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get 用户类型，System：系统创建，User：用户创建 
     * @return Type 用户类型，System：系统创建，User：用户创建
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 用户类型，System：系统创建，User：用户创建
     * @param Type 用户类型，System：系统创建，User：用户创建
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 单个用户最大可用连接数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxConnections 单个用户最大可用连接数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxConnections() {
        return this.MaxConnections;
    }

    /**
     * Set 单个用户最大可用连接数
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxConnections 单个用户最大可用连接数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxConnections(Long MaxConnections) {
        this.MaxConnections = MaxConnections;
    }

    /**
     * Get 单个用户最大可用通道数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxChannels 单个用户最大可用通道数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxChannels() {
        return this.MaxChannels;
    }

    /**
     * Set 单个用户最大可用通道数
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxChannels 单个用户最大可用通道数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxChannels(Long MaxChannels) {
        this.MaxChannels = MaxChannels;
    }

    /**
     * Get 创建时间时间戳 
     * @return CreateTs 创建时间时间戳
     */
    public Long getCreateTs() {
        return this.CreateTs;
    }

    /**
     * Set 创建时间时间戳
     * @param CreateTs 创建时间时间戳
     */
    public void setCreateTs(Long CreateTs) {
        this.CreateTs = CreateTs;
    }

    /**
     * Get 修改时间时间戳 
     * @return ModifyTs 修改时间时间戳
     */
    public Long getModifyTs() {
        return this.ModifyTs;
    }

    /**
     * Set 修改时间时间戳
     * @param ModifyTs 修改时间时间戳
     */
    public void setModifyTs(Long ModifyTs) {
        this.ModifyTs = ModifyTs;
    }

    public RabbitMQUser() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RabbitMQUser(RabbitMQUser source) {
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
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.MaxConnections != null) {
            this.MaxConnections = new Long(source.MaxConnections);
        }
        if (source.MaxChannels != null) {
            this.MaxChannels = new Long(source.MaxChannels);
        }
        if (source.CreateTs != null) {
            this.CreateTs = new Long(source.CreateTs);
        }
        if (source.ModifyTs != null) {
            this.ModifyTs = new Long(source.ModifyTs);
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
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "MaxConnections", this.MaxConnections);
        this.setParamSimple(map, prefix + "MaxChannels", this.MaxChannels);
        this.setParamSimple(map, prefix + "CreateTs", this.CreateTs);
        this.setParamSimple(map, prefix + "ModifyTs", this.ModifyTs);

    }
}

