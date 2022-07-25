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
    */
    @SerializedName("Cluster")
    @Expose
    private String Cluster;

    /**
    * ClickHouse的数据库名
    */
    @SerializedName("Database")
    @Expose
    private String Database;

    /**
    * ClickHouse的数据表名
    */
    @SerializedName("Table")
    @Expose
    private String Table;

    /**
    * ClickHouse的schema
    */
    @SerializedName("Schema")
    @Expose
    private ClickHouseSchema [] Schema;

    /**
    * 实例资源
    */
    @SerializedName("Resource")
    @Expose
    private String Resource;

    /**
    * ClickHouse的连接ip
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * ClickHouse的连接port
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * ClickHouse的用户名
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * ClickHouse的密码
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 实例vip
    */
    @SerializedName("ServiceVip")
    @Expose
    private String ServiceVip;

    /**
    * 实例的vpcId
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * 是否为自建集群
    */
    @SerializedName("SelfBuilt")
    @Expose
    private Boolean SelfBuilt;

    /**
    * ClickHouse是否抛弃解析失败的消息，默认为true
    */
    @SerializedName("DropInvalidMessage")
    @Expose
    private Boolean DropInvalidMessage;

    /**
    * ClickHouse 类型，emr-clickhouse : "emr";cdw-clickhouse : "cdwch";自建 : ""
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 当设置成员参数DropInvalidMessageToCls设置为true时,DropInvalidMessage参数失效
    */
    @SerializedName("DropCls")
    @Expose
    private DropCls DropCls;

    /**
     * Get ClickHouse的集群 
     * @return Cluster ClickHouse的集群
     */
    public String getCluster() {
        return this.Cluster;
    }

    /**
     * Set ClickHouse的集群
     * @param Cluster ClickHouse的集群
     */
    public void setCluster(String Cluster) {
        this.Cluster = Cluster;
    }

    /**
     * Get ClickHouse的数据库名 
     * @return Database ClickHouse的数据库名
     */
    public String getDatabase() {
        return this.Database;
    }

    /**
     * Set ClickHouse的数据库名
     * @param Database ClickHouse的数据库名
     */
    public void setDatabase(String Database) {
        this.Database = Database;
    }

    /**
     * Get ClickHouse的数据表名 
     * @return Table ClickHouse的数据表名
     */
    public String getTable() {
        return this.Table;
    }

    /**
     * Set ClickHouse的数据表名
     * @param Table ClickHouse的数据表名
     */
    public void setTable(String Table) {
        this.Table = Table;
    }

    /**
     * Get ClickHouse的schema 
     * @return Schema ClickHouse的schema
     */
    public ClickHouseSchema [] getSchema() {
        return this.Schema;
    }

    /**
     * Set ClickHouse的schema
     * @param Schema ClickHouse的schema
     */
    public void setSchema(ClickHouseSchema [] Schema) {
        this.Schema = Schema;
    }

    /**
     * Get 实例资源 
     * @return Resource 实例资源
     */
    public String getResource() {
        return this.Resource;
    }

    /**
     * Set 实例资源
     * @param Resource 实例资源
     */
    public void setResource(String Resource) {
        this.Resource = Resource;
    }

    /**
     * Get ClickHouse的连接ip 
     * @return Ip ClickHouse的连接ip
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set ClickHouse的连接ip
     * @param Ip ClickHouse的连接ip
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get ClickHouse的连接port 
     * @return Port ClickHouse的连接port
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set ClickHouse的连接port
     * @param Port ClickHouse的连接port
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get ClickHouse的用户名 
     * @return UserName ClickHouse的用户名
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set ClickHouse的用户名
     * @param UserName ClickHouse的用户名
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get ClickHouse的密码 
     * @return Password ClickHouse的密码
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set ClickHouse的密码
     * @param Password ClickHouse的密码
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get 实例vip 
     * @return ServiceVip 实例vip
     */
    public String getServiceVip() {
        return this.ServiceVip;
    }

    /**
     * Set 实例vip
     * @param ServiceVip 实例vip
     */
    public void setServiceVip(String ServiceVip) {
        this.ServiceVip = ServiceVip;
    }

    /**
     * Get 实例的vpcId 
     * @return UniqVpcId 实例的vpcId
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set 实例的vpcId
     * @param UniqVpcId 实例的vpcId
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get 是否为自建集群 
     * @return SelfBuilt 是否为自建集群
     */
    public Boolean getSelfBuilt() {
        return this.SelfBuilt;
    }

    /**
     * Set 是否为自建集群
     * @param SelfBuilt 是否为自建集群
     */
    public void setSelfBuilt(Boolean SelfBuilt) {
        this.SelfBuilt = SelfBuilt;
    }

    /**
     * Get ClickHouse是否抛弃解析失败的消息，默认为true 
     * @return DropInvalidMessage ClickHouse是否抛弃解析失败的消息，默认为true
     */
    public Boolean getDropInvalidMessage() {
        return this.DropInvalidMessage;
    }

    /**
     * Set ClickHouse是否抛弃解析失败的消息，默认为true
     * @param DropInvalidMessage ClickHouse是否抛弃解析失败的消息，默认为true
     */
    public void setDropInvalidMessage(Boolean DropInvalidMessage) {
        this.DropInvalidMessage = DropInvalidMessage;
    }

    /**
     * Get ClickHouse 类型，emr-clickhouse : "emr";cdw-clickhouse : "cdwch";自建 : "" 
     * @return Type ClickHouse 类型，emr-clickhouse : "emr";cdw-clickhouse : "cdwch";自建 : ""
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set ClickHouse 类型，emr-clickhouse : "emr";cdw-clickhouse : "cdwch";自建 : ""
     * @param Type ClickHouse 类型，emr-clickhouse : "emr";cdw-clickhouse : "cdwch";自建 : ""
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 当设置成员参数DropInvalidMessageToCls设置为true时,DropInvalidMessage参数失效 
     * @return DropCls 当设置成员参数DropInvalidMessageToCls设置为true时,DropInvalidMessage参数失效
     */
    public DropCls getDropCls() {
        return this.DropCls;
    }

    /**
     * Set 当设置成员参数DropInvalidMessageToCls设置为true时,DropInvalidMessage参数失效
     * @param DropCls 当设置成员参数DropInvalidMessageToCls设置为true时,DropInvalidMessage参数失效
     */
    public void setDropCls(DropCls DropCls) {
        this.DropCls = DropCls;
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

    }
}

