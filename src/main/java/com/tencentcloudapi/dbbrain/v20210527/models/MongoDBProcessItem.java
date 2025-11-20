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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MongoDBProcessItem extends AbstractModel {

    /**
    * 是否内部IP
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsInternalIp")
    @Expose
    private Boolean IsInternalIp;

    /**
    * 语句类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 语句详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Command")
    @Expose
    private String Command;

    /**
    * 节点ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceNodeId")
    @Expose
    private String InstanceNodeId;

    /**
    * 客户端ip
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * 运行时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Time")
    @Expose
    private Float Time;

    /**
    * 会话ID

注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * 分片名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ShardName")
    @Expose
    private String ShardName;

    /**
    * 用户
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * 数据库
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DB")
    @Expose
    private String DB;

    /**
     * Get 是否内部IP
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsInternalIp 是否内部IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsInternalIp() {
        return this.IsInternalIp;
    }

    /**
     * Set 是否内部IP
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsInternalIp 是否内部IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsInternalIp(Boolean IsInternalIp) {
        this.IsInternalIp = IsInternalIp;
    }

    /**
     * Get 语句类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 语句类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 语句类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 语句类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 语句详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Command 语句详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCommand() {
        return this.Command;
    }

    /**
     * Set 语句详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param Command 语句详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCommand(String Command) {
        this.Command = Command;
    }

    /**
     * Get 节点ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceNodeId 节点ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceNodeId() {
        return this.InstanceNodeId;
    }

    /**
     * Set 节点ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceNodeId 节点ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceNodeId(String InstanceNodeId) {
        this.InstanceNodeId = InstanceNodeId;
    }

    /**
     * Get 客户端ip
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Host 客户端ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set 客户端ip
注意：此字段可能返回 null，表示取不到有效值。
     * @param Host 客户端ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get 运行时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Time 运行时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getTime() {
        return this.Time;
    }

    /**
     * Set 运行时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param Time 运行时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTime(Float Time) {
        this.Time = Time;
    }

    /**
     * Get 会话ID

注意：此字段可能返回 null，表示取不到有效值。 
     * @return ID 会话ID

注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set 会话ID

注意：此字段可能返回 null，表示取不到有效值。
     * @param ID 会话ID

注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get 分片名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ShardName 分片名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getShardName() {
        return this.ShardName;
    }

    /**
     * Set 分片名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ShardName 分片名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setShardName(String ShardName) {
        this.ShardName = ShardName;
    }

    /**
     * Get 用户
注意：此字段可能返回 null，表示取不到有效值。 
     * @return User 用户
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set 用户
注意：此字段可能返回 null，表示取不到有效值。
     * @param User 用户
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get 数据库
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DB 数据库
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDB() {
        return this.DB;
    }

    /**
     * Set 数据库
注意：此字段可能返回 null，表示取不到有效值。
     * @param DB 数据库
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDB(String DB) {
        this.DB = DB;
    }

    public MongoDBProcessItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MongoDBProcessItem(MongoDBProcessItem source) {
        if (source.IsInternalIp != null) {
            this.IsInternalIp = new Boolean(source.IsInternalIp);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Command != null) {
            this.Command = new String(source.Command);
        }
        if (source.InstanceNodeId != null) {
            this.InstanceNodeId = new String(source.InstanceNodeId);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.Time != null) {
            this.Time = new Float(source.Time);
        }
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.ShardName != null) {
            this.ShardName = new String(source.ShardName);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.DB != null) {
            this.DB = new String(source.DB);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsInternalIp", this.IsInternalIp);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Command", this.Command);
        this.setParamSimple(map, prefix + "InstanceNodeId", this.InstanceNodeId);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "ShardName", this.ShardName);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "DB", this.DB);

    }
}

