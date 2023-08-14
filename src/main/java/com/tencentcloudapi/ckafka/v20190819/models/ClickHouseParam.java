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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClickHouseParam extends AbstractModel{

    /**
    * ClickHouse的集群
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Cluster")
    @Expose
    private String Cluster;

    /**
    * ClickHouse的数据库名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Database")
    @Expose
    private String Database;

    /**
    * ClickHouse的数据表名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Table")
    @Expose
    private String Table;

    /**
    * ClickHouse的schema
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Schema")
    @Expose
    private ClickHouseSchema [] Schema;

    /**
    * 实例资源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Resource")
    @Expose
    private String Resource;

    /**
    * ClickHouse的连接ip
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * ClickHouse的连接port
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * ClickHouse的用户名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * ClickHouse的密码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 实例vip
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceVip")
    @Expose
    private String ServiceVip;

    /**
    * 实例的vpcId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * 是否为自建集群
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SelfBuilt")
    @Expose
    private Boolean SelfBuilt;

    /**
    * ClickHouse是否抛弃解析失败的消息，默认为true
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DropInvalidMessage")
    @Expose
    private Boolean DropInvalidMessage;

    /**
    * ClickHouse 类型，emr-clickhouse : "emr";cdw-clickhouse : "cdwch";自建 : ""
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 当设置成员参数DropInvalidMessageToCls设置为true时,DropInvalidMessage参数失效
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DropCls")
    @Expose
    private DropCls DropCls;

    /**
    * 每批次投递到 ClickHouse 表消息数量，默认为 1000 条。
提高该参数值，有利于减少往  ClickHouse 投递的次数，但在错误消息过多及网络不稳定等极端情况下时，可能导致频繁重试影响效率。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BatchSize")
    @Expose
    private Long BatchSize;

    /**
    * 每次从 topic 中拉取消息大小，默认为 1MB，即至少要从 topic 中批量拉取 1MB 消息，才进行数据投递到 ClickHouse 操作。
提高该参数值，有利于减少往  ClickHouse 投递的次数，但在错误消息过多及网络不稳定等极端情况下时，可能导致频繁重试影响效率。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConsumerFetchMinBytes")
    @Expose
    private Long ConsumerFetchMinBytes;

    /**
    * 每次从 topic 拉取消息最大等待时间，当超过当前最大等待时间时，即使没有拉取到 ConsumerFetchMinBytes 大小，也将进行 ClickHouse 投递操作。
提高该参数值，有利于减少往  ClickHouse 投递的次数，但在错误消息过多及网络不稳定等极端情况下时，可能导致频繁重试影响效率。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConsumerFetchMaxWaitMs")
    @Expose
    private Long ConsumerFetchMaxWaitMs;

    /**
     * Get ClickHouse的集群
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Cluster ClickHouse的集群
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCluster() {
        return this.Cluster;
    }

    /**
     * Set ClickHouse的集群
注意：此字段可能返回 null，表示取不到有效值。
     * @param Cluster ClickHouse的集群
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCluster(String Cluster) {
        this.Cluster = Cluster;
    }

    /**
     * Get ClickHouse的数据库名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Database ClickHouse的数据库名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatabase() {
        return this.Database;
    }

    /**
     * Set ClickHouse的数据库名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Database ClickHouse的数据库名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatabase(String Database) {
        this.Database = Database;
    }

    /**
     * Get ClickHouse的数据表名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Table ClickHouse的数据表名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTable() {
        return this.Table;
    }

    /**
     * Set ClickHouse的数据表名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Table ClickHouse的数据表名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTable(String Table) {
        this.Table = Table;
    }

    /**
     * Get ClickHouse的schema
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Schema ClickHouse的schema
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ClickHouseSchema [] getSchema() {
        return this.Schema;
    }

    /**
     * Set ClickHouse的schema
注意：此字段可能返回 null，表示取不到有效值。
     * @param Schema ClickHouse的schema
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSchema(ClickHouseSchema [] Schema) {
        this.Schema = Schema;
    }

    /**
     * Get 实例资源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Resource 实例资源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResource() {
        return this.Resource;
    }

    /**
     * Set 实例资源
注意：此字段可能返回 null，表示取不到有效值。
     * @param Resource 实例资源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResource(String Resource) {
        this.Resource = Resource;
    }

    /**
     * Get ClickHouse的连接ip
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Ip ClickHouse的连接ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set ClickHouse的连接ip
注意：此字段可能返回 null，表示取不到有效值。
     * @param Ip ClickHouse的连接ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get ClickHouse的连接port
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Port ClickHouse的连接port
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set ClickHouse的连接port
注意：此字段可能返回 null，表示取不到有效值。
     * @param Port ClickHouse的连接port
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get ClickHouse的用户名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserName ClickHouse的用户名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set ClickHouse的用户名
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserName ClickHouse的用户名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get ClickHouse的密码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Password ClickHouse的密码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set ClickHouse的密码
注意：此字段可能返回 null，表示取不到有效值。
     * @param Password ClickHouse的密码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get 实例vip
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceVip 实例vip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceVip() {
        return this.ServiceVip;
    }

    /**
     * Set 实例vip
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceVip 实例vip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceVip(String ServiceVip) {
        this.ServiceVip = ServiceVip;
    }

    /**
     * Get 实例的vpcId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UniqVpcId 实例的vpcId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set 实例的vpcId
注意：此字段可能返回 null，表示取不到有效值。
     * @param UniqVpcId 实例的vpcId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get 是否为自建集群
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SelfBuilt 是否为自建集群
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getSelfBuilt() {
        return this.SelfBuilt;
    }

    /**
     * Set 是否为自建集群
注意：此字段可能返回 null，表示取不到有效值。
     * @param SelfBuilt 是否为自建集群
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSelfBuilt(Boolean SelfBuilt) {
        this.SelfBuilt = SelfBuilt;
    }

    /**
     * Get ClickHouse是否抛弃解析失败的消息，默认为true
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DropInvalidMessage ClickHouse是否抛弃解析失败的消息，默认为true
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getDropInvalidMessage() {
        return this.DropInvalidMessage;
    }

    /**
     * Set ClickHouse是否抛弃解析失败的消息，默认为true
注意：此字段可能返回 null，表示取不到有效值。
     * @param DropInvalidMessage ClickHouse是否抛弃解析失败的消息，默认为true
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDropInvalidMessage(Boolean DropInvalidMessage) {
        this.DropInvalidMessage = DropInvalidMessage;
    }

    /**
     * Get ClickHouse 类型，emr-clickhouse : "emr";cdw-clickhouse : "cdwch";自建 : ""
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type ClickHouse 类型，emr-clickhouse : "emr";cdw-clickhouse : "cdwch";自建 : ""
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set ClickHouse 类型，emr-clickhouse : "emr";cdw-clickhouse : "cdwch";自建 : ""
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type ClickHouse 类型，emr-clickhouse : "emr";cdw-clickhouse : "cdwch";自建 : ""
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 当设置成员参数DropInvalidMessageToCls设置为true时,DropInvalidMessage参数失效
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DropCls 当设置成员参数DropInvalidMessageToCls设置为true时,DropInvalidMessage参数失效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DropCls getDropCls() {
        return this.DropCls;
    }

    /**
     * Set 当设置成员参数DropInvalidMessageToCls设置为true时,DropInvalidMessage参数失效
注意：此字段可能返回 null，表示取不到有效值。
     * @param DropCls 当设置成员参数DropInvalidMessageToCls设置为true时,DropInvalidMessage参数失效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDropCls(DropCls DropCls) {
        this.DropCls = DropCls;
    }

    /**
     * Get 每批次投递到 ClickHouse 表消息数量，默认为 1000 条。
提高该参数值，有利于减少往  ClickHouse 投递的次数，但在错误消息过多及网络不稳定等极端情况下时，可能导致频繁重试影响效率。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BatchSize 每批次投递到 ClickHouse 表消息数量，默认为 1000 条。
提高该参数值，有利于减少往  ClickHouse 投递的次数，但在错误消息过多及网络不稳定等极端情况下时，可能导致频繁重试影响效率。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBatchSize() {
        return this.BatchSize;
    }

    /**
     * Set 每批次投递到 ClickHouse 表消息数量，默认为 1000 条。
提高该参数值，有利于减少往  ClickHouse 投递的次数，但在错误消息过多及网络不稳定等极端情况下时，可能导致频繁重试影响效率。
注意：此字段可能返回 null，表示取不到有效值。
     * @param BatchSize 每批次投递到 ClickHouse 表消息数量，默认为 1000 条。
提高该参数值，有利于减少往  ClickHouse 投递的次数，但在错误消息过多及网络不稳定等极端情况下时，可能导致频繁重试影响效率。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBatchSize(Long BatchSize) {
        this.BatchSize = BatchSize;
    }

    /**
     * Get 每次从 topic 中拉取消息大小，默认为 1MB，即至少要从 topic 中批量拉取 1MB 消息，才进行数据投递到 ClickHouse 操作。
提高该参数值，有利于减少往  ClickHouse 投递的次数，但在错误消息过多及网络不稳定等极端情况下时，可能导致频繁重试影响效率。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConsumerFetchMinBytes 每次从 topic 中拉取消息大小，默认为 1MB，即至少要从 topic 中批量拉取 1MB 消息，才进行数据投递到 ClickHouse 操作。
提高该参数值，有利于减少往  ClickHouse 投递的次数，但在错误消息过多及网络不稳定等极端情况下时，可能导致频繁重试影响效率。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getConsumerFetchMinBytes() {
        return this.ConsumerFetchMinBytes;
    }

    /**
     * Set 每次从 topic 中拉取消息大小，默认为 1MB，即至少要从 topic 中批量拉取 1MB 消息，才进行数据投递到 ClickHouse 操作。
提高该参数值，有利于减少往  ClickHouse 投递的次数，但在错误消息过多及网络不稳定等极端情况下时，可能导致频繁重试影响效率。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConsumerFetchMinBytes 每次从 topic 中拉取消息大小，默认为 1MB，即至少要从 topic 中批量拉取 1MB 消息，才进行数据投递到 ClickHouse 操作。
提高该参数值，有利于减少往  ClickHouse 投递的次数，但在错误消息过多及网络不稳定等极端情况下时，可能导致频繁重试影响效率。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConsumerFetchMinBytes(Long ConsumerFetchMinBytes) {
        this.ConsumerFetchMinBytes = ConsumerFetchMinBytes;
    }

    /**
     * Get 每次从 topic 拉取消息最大等待时间，当超过当前最大等待时间时，即使没有拉取到 ConsumerFetchMinBytes 大小，也将进行 ClickHouse 投递操作。
提高该参数值，有利于减少往  ClickHouse 投递的次数，但在错误消息过多及网络不稳定等极端情况下时，可能导致频繁重试影响效率。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConsumerFetchMaxWaitMs 每次从 topic 拉取消息最大等待时间，当超过当前最大等待时间时，即使没有拉取到 ConsumerFetchMinBytes 大小，也将进行 ClickHouse 投递操作。
提高该参数值，有利于减少往  ClickHouse 投递的次数，但在错误消息过多及网络不稳定等极端情况下时，可能导致频繁重试影响效率。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getConsumerFetchMaxWaitMs() {
        return this.ConsumerFetchMaxWaitMs;
    }

    /**
     * Set 每次从 topic 拉取消息最大等待时间，当超过当前最大等待时间时，即使没有拉取到 ConsumerFetchMinBytes 大小，也将进行 ClickHouse 投递操作。
提高该参数值，有利于减少往  ClickHouse 投递的次数，但在错误消息过多及网络不稳定等极端情况下时，可能导致频繁重试影响效率。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConsumerFetchMaxWaitMs 每次从 topic 拉取消息最大等待时间，当超过当前最大等待时间时，即使没有拉取到 ConsumerFetchMinBytes 大小，也将进行 ClickHouse 投递操作。
提高该参数值，有利于减少往  ClickHouse 投递的次数，但在错误消息过多及网络不稳定等极端情况下时，可能导致频繁重试影响效率。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConsumerFetchMaxWaitMs(Long ConsumerFetchMaxWaitMs) {
        this.ConsumerFetchMaxWaitMs = ConsumerFetchMaxWaitMs;
    }

    public ClickHouseParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClickHouseParam(ClickHouseParam source) {
        if (source.Cluster != null) {
            this.Cluster = new String(source.Cluster);
        }
        if (source.Database != null) {
            this.Database = new String(source.Database);
        }
        if (source.Table != null) {
            this.Table = new String(source.Table);
        }
        if (source.Schema != null) {
            this.Schema = new ClickHouseSchema[source.Schema.length];
            for (int i = 0; i < source.Schema.length; i++) {
                this.Schema[i] = new ClickHouseSchema(source.Schema[i]);
            }
        }
        if (source.Resource != null) {
            this.Resource = new String(source.Resource);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.ServiceVip != null) {
            this.ServiceVip = new String(source.ServiceVip);
        }
        if (source.UniqVpcId != null) {
            this.UniqVpcId = new String(source.UniqVpcId);
        }
        if (source.SelfBuilt != null) {
            this.SelfBuilt = new Boolean(source.SelfBuilt);
        }
        if (source.DropInvalidMessage != null) {
            this.DropInvalidMessage = new Boolean(source.DropInvalidMessage);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.DropCls != null) {
            this.DropCls = new DropCls(source.DropCls);
        }
        if (source.BatchSize != null) {
            this.BatchSize = new Long(source.BatchSize);
        }
        if (source.ConsumerFetchMinBytes != null) {
            this.ConsumerFetchMinBytes = new Long(source.ConsumerFetchMinBytes);
        }
        if (source.ConsumerFetchMaxWaitMs != null) {
            this.ConsumerFetchMaxWaitMs = new Long(source.ConsumerFetchMaxWaitMs);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Cluster", this.Cluster);
        this.setParamSimple(map, prefix + "Database", this.Database);
        this.setParamSimple(map, prefix + "Table", this.Table);
        this.setParamArrayObj(map, prefix + "Schema.", this.Schema);
        this.setParamSimple(map, prefix + "Resource", this.Resource);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "ServiceVip", this.ServiceVip);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "SelfBuilt", this.SelfBuilt);
        this.setParamSimple(map, prefix + "DropInvalidMessage", this.DropInvalidMessage);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "DropCls.", this.DropCls);
        this.setParamSimple(map, prefix + "BatchSize", this.BatchSize);
        this.setParamSimple(map, prefix + "ConsumerFetchMinBytes", this.ConsumerFetchMinBytes);
        this.setParamSimple(map, prefix + "ConsumerFetchMaxWaitMs", this.ConsumerFetchMaxWaitMs);

    }
}

