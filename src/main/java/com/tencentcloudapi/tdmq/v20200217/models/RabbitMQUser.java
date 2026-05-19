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

public class RabbitMQUser extends AbstractModel {

    /**
    * <p>实例 ID，形如 amqp-xxxxxxxx。有效的 InstanceId 可通过登录 <a href="https://console.cloud.tencent.com/trabbitmq/cluster?rid=1">TDMQ RabbitMQ 控制台</a>查询。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>用户名，登录时使用</p>
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * <p>密码，登录时使用</p>
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * <p>用户描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>用户标签，用于决定改用户访问RabbitMQ Management的权限范围</p>
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * <p>用户创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>用户最后修改时间</p>
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * <p>用户类型，System：系统创建，User：用户创建</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>单个用户最大可用连接数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxConnections")
    @Expose
    private Long MaxConnections;

    /**
    * <p>单个用户最大可用通道数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxChannels")
    @Expose
    private Long MaxChannels;

    /**
    * <p>创建时间时间戳</p>
    */
    @SerializedName("CreateTs")
    @Expose
    private Long CreateTs;

    /**
    * <p>修改时间时间戳</p>
    */
    @SerializedName("ModifyTs")
    @Expose
    private Long ModifyTs;

    /**
    * <p>是否开启cam验证</p><p>默认值：false</p>
    */
    @SerializedName("CamAuthEnabled")
    @Expose
    private Boolean CamAuthEnabled;

    /**
    * <p>cam凭据名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CamCredentialName")
    @Expose
    private String CamCredentialName;

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
     * Get <p>用户名，登录时使用</p> 
     * @return User <p>用户名，登录时使用</p>
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set <p>用户名，登录时使用</p>
     * @param User <p>用户名，登录时使用</p>
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get <p>密码，登录时使用</p> 
     * @return Password <p>密码，登录时使用</p>
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set <p>密码，登录时使用</p>
     * @param Password <p>密码，登录时使用</p>
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get <p>用户描述</p> 
     * @return Description <p>用户描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>用户描述</p>
     * @param Description <p>用户描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>用户标签，用于决定改用户访问RabbitMQ Management的权限范围</p> 
     * @return Tags <p>用户标签，用于决定改用户访问RabbitMQ Management的权限范围</p>
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>用户标签，用于决定改用户访问RabbitMQ Management的权限范围</p>
     * @param Tags <p>用户标签，用于决定改用户访问RabbitMQ Management的权限范围</p>
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>用户创建时间</p> 
     * @return CreateTime <p>用户创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>用户创建时间</p>
     * @param CreateTime <p>用户创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>用户最后修改时间</p> 
     * @return ModifyTime <p>用户最后修改时间</p>
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set <p>用户最后修改时间</p>
     * @param ModifyTime <p>用户最后修改时间</p>
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get <p>用户类型，System：系统创建，User：用户创建</p> 
     * @return Type <p>用户类型，System：系统创建，User：用户创建</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>用户类型，System：系统创建，User：用户创建</p>
     * @param Type <p>用户类型，System：系统创建，User：用户创建</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>单个用户最大可用连接数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxConnections <p>单个用户最大可用连接数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxConnections() {
        return this.MaxConnections;
    }

    /**
     * Set <p>单个用户最大可用连接数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxConnections <p>单个用户最大可用连接数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxConnections(Long MaxConnections) {
        this.MaxConnections = MaxConnections;
    }

    /**
     * Get <p>单个用户最大可用通道数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxChannels <p>单个用户最大可用通道数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxChannels() {
        return this.MaxChannels;
    }

    /**
     * Set <p>单个用户最大可用通道数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxChannels <p>单个用户最大可用通道数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxChannels(Long MaxChannels) {
        this.MaxChannels = MaxChannels;
    }

    /**
     * Get <p>创建时间时间戳</p> 
     * @return CreateTs <p>创建时间时间戳</p>
     */
    public Long getCreateTs() {
        return this.CreateTs;
    }

    /**
     * Set <p>创建时间时间戳</p>
     * @param CreateTs <p>创建时间时间戳</p>
     */
    public void setCreateTs(Long CreateTs) {
        this.CreateTs = CreateTs;
    }

    /**
     * Get <p>修改时间时间戳</p> 
     * @return ModifyTs <p>修改时间时间戳</p>
     */
    public Long getModifyTs() {
        return this.ModifyTs;
    }

    /**
     * Set <p>修改时间时间戳</p>
     * @param ModifyTs <p>修改时间时间戳</p>
     */
    public void setModifyTs(Long ModifyTs) {
        this.ModifyTs = ModifyTs;
    }

    /**
     * Get <p>是否开启cam验证</p><p>默认值：false</p> 
     * @return CamAuthEnabled <p>是否开启cam验证</p><p>默认值：false</p>
     */
    public Boolean getCamAuthEnabled() {
        return this.CamAuthEnabled;
    }

    /**
     * Set <p>是否开启cam验证</p><p>默认值：false</p>
     * @param CamAuthEnabled <p>是否开启cam验证</p><p>默认值：false</p>
     */
    public void setCamAuthEnabled(Boolean CamAuthEnabled) {
        this.CamAuthEnabled = CamAuthEnabled;
    }

    /**
     * Get <p>cam凭据名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CamCredentialName <p>cam凭据名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCamCredentialName() {
        return this.CamCredentialName;
    }

    /**
     * Set <p>cam凭据名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CamCredentialName <p>cam凭据名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCamCredentialName(String CamCredentialName) {
        this.CamCredentialName = CamCredentialName;
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
        if (source.CamAuthEnabled != null) {
            this.CamAuthEnabled = new Boolean(source.CamAuthEnabled);
        }
        if (source.CamCredentialName != null) {
            this.CamCredentialName = new String(source.CamCredentialName);
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
        this.setParamSimple(map, prefix + "CamAuthEnabled", this.CamAuthEnabled);
        this.setParamSimple(map, prefix + "CamCredentialName", this.CamCredentialName);

    }
}

