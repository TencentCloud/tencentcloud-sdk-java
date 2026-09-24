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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CatalogConfig extends AbstractModel {

    /**
    * <p>数据目录唯一 ID</p>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>数据目录名字</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>数据目录类型</p><p>枚举值：</p><ul><li>LAKEHOUSE： LAKEHOUSE类型</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>数据目录描述信息</p>
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * <p>状态</p><p>枚举值：</p><ul><li>2： 连接成功</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>数据目录属性</p>
    */
    @SerializedName("Properties")
    @Expose
    private KVPair [] Properties;

    /**
    * <p>连接信息</p>
    */
    @SerializedName("Connection")
    @Expose
    private ConnectionConfig Connection;

    /**
    * <p>操作人 uin</p>
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * <p>连接日志</p>
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * <p>审计信息</p>
    */
    @SerializedName("Audit")
    @Expose
    private Audit Audit;

    /**
    * <p>创建时间（已废弃）</p><p>参数格式：2024-01-01 12:00:00</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>更新时间（已废弃）</p><p>参数格式：2024-01-01 12:00:00</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get <p>数据目录唯一 ID</p> 
     * @return Id <p>数据目录唯一 ID</p>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>数据目录唯一 ID</p>
     * @param Id <p>数据目录唯一 ID</p>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>数据目录名字</p> 
     * @return Name <p>数据目录名字</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>数据目录名字</p>
     * @param Name <p>数据目录名字</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>数据目录类型</p><p>枚举值：</p><ul><li>LAKEHOUSE： LAKEHOUSE类型</li></ul> 
     * @return Type <p>数据目录类型</p><p>枚举值：</p><ul><li>LAKEHOUSE： LAKEHOUSE类型</li></ul>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>数据目录类型</p><p>枚举值：</p><ul><li>LAKEHOUSE： LAKEHOUSE类型</li></ul>
     * @param Type <p>数据目录类型</p><p>枚举值：</p><ul><li>LAKEHOUSE： LAKEHOUSE类型</li></ul>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>数据目录描述信息</p> 
     * @return Comment <p>数据目录描述信息</p>
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set <p>数据目录描述信息</p>
     * @param Comment <p>数据目录描述信息</p>
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get <p>状态</p><p>枚举值：</p><ul><li>2： 连接成功</li></ul> 
     * @return Status <p>状态</p><p>枚举值：</p><ul><li>2： 连接成功</li></ul>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>状态</p><p>枚举值：</p><ul><li>2： 连接成功</li></ul>
     * @param Status <p>状态</p><p>枚举值：</p><ul><li>2： 连接成功</li></ul>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>数据目录属性</p> 
     * @return Properties <p>数据目录属性</p>
     */
    public KVPair [] getProperties() {
        return this.Properties;
    }

    /**
     * Set <p>数据目录属性</p>
     * @param Properties <p>数据目录属性</p>
     */
    public void setProperties(KVPair [] Properties) {
        this.Properties = Properties;
    }

    /**
     * Get <p>连接信息</p> 
     * @return Connection <p>连接信息</p>
     */
    public ConnectionConfig getConnection() {
        return this.Connection;
    }

    /**
     * Set <p>连接信息</p>
     * @param Connection <p>连接信息</p>
     */
    public void setConnection(ConnectionConfig Connection) {
        this.Connection = Connection;
    }

    /**
     * Get <p>操作人 uin</p> 
     * @return Operator <p>操作人 uin</p>
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set <p>操作人 uin</p>
     * @param Operator <p>操作人 uin</p>
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get <p>连接日志</p> 
     * @return Message <p>连接日志</p>
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set <p>连接日志</p>
     * @param Message <p>连接日志</p>
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get <p>审计信息</p> 
     * @return Audit <p>审计信息</p>
     */
    public Audit getAudit() {
        return this.Audit;
    }

    /**
     * Set <p>审计信息</p>
     * @param Audit <p>审计信息</p>
     */
    public void setAudit(Audit Audit) {
        this.Audit = Audit;
    }

    /**
     * Get <p>创建时间（已废弃）</p><p>参数格式：2024-01-01 12:00:00</p> 
     * @return CreateTime <p>创建时间（已废弃）</p><p>参数格式：2024-01-01 12:00:00</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间（已废弃）</p><p>参数格式：2024-01-01 12:00:00</p>
     * @param CreateTime <p>创建时间（已废弃）</p><p>参数格式：2024-01-01 12:00:00</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>更新时间（已废弃）</p><p>参数格式：2024-01-01 12:00:00</p> 
     * @return UpdateTime <p>更新时间（已废弃）</p><p>参数格式：2024-01-01 12:00:00</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间（已废弃）</p><p>参数格式：2024-01-01 12:00:00</p>
     * @param UpdateTime <p>更新时间（已废弃）</p><p>参数格式：2024-01-01 12:00:00</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public CatalogConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CatalogConfig(CatalogConfig source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Properties != null) {
            this.Properties = new KVPair[source.Properties.length];
            for (int i = 0; i < source.Properties.length; i++) {
                this.Properties[i] = new KVPair(source.Properties[i]);
            }
        }
        if (source.Connection != null) {
            this.Connection = new ConnectionConfig(source.Connection);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.Audit != null) {
            this.Audit = new Audit(source.Audit);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "Properties.", this.Properties);
        this.setParamObj(map, prefix + "Connection.", this.Connection);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamObj(map, prefix + "Audit.", this.Audit);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

