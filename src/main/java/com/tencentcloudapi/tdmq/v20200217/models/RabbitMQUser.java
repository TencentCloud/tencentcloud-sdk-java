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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RabbitMQUser extends AbstractModel{

    /**
    * 集群实例Id
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
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 用户标签，用于决定改用户访问RabbitMQ Management的权限范围
注意：此字段可能返回 null，表示取不到有效值。
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
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 用户描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 用户描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 用户描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 用户标签，用于决定改用户访问RabbitMQ Management的权限范围
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 用户标签，用于决定改用户访问RabbitMQ Management的权限范围
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set 用户标签，用于决定改用户访问RabbitMQ Management的权限范围
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 用户标签，用于决定改用户访问RabbitMQ Management的权限范围
注意：此字段可能返回 null，表示取不到有效值。
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

    }
}

