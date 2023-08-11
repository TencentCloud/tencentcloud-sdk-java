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

public class EsParam extends AbstractModel{

    /**
    * 实例资源
    */
    @SerializedName("Resource")
    @Expose
    private String Resource;

    /**
    * Es的连接port
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Es用户名
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * Es密码
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 是否为自建集群
    */
    @SerializedName("SelfBuilt")
    @Expose
    private Boolean SelfBuilt;

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
    * Es是否抛弃解析失败的消息
    */
    @SerializedName("DropInvalidMessage")
    @Expose
    private Boolean DropInvalidMessage;

    /**
    * Es自定义index名称
    */
    @SerializedName("Index")
    @Expose
    private String Index;

    /**
    * Es自定义日期后缀
    */
    @SerializedName("DateFormat")
    @Expose
    private String DateFormat;

    /**
    * 非json格式数据的自定义key
    */
    @SerializedName("ContentKey")
    @Expose
    private String ContentKey;

    /**
    * Es是否抛弃非json格式的消息
    */
    @SerializedName("DropInvalidJsonMessage")
    @Expose
    private Boolean DropInvalidJsonMessage;

    /**
    * 转储到Es中的文档ID取值字段名
    */
    @SerializedName("DocumentIdField")
    @Expose
    private String DocumentIdField;

    /**
    * Es自定义index名称的类型，STRING，JSONPATH，默认为STRING
    */
    @SerializedName("IndexType")
    @Expose
    private String IndexType;

    /**
    * 当设置成员参数DropInvalidMessageToCls设置为true时,DropInvalidMessage参数失效
    */
    @SerializedName("DropCls")
    @Expose
    private DropCls DropCls;

    /**
    * 转储到ES的消息为Database的binlog时，如果需要同步数据库操作，即增删改的操作到ES时填写数据库表主键
    */
    @SerializedName("DatabasePrimaryKey")
    @Expose
    private String DatabasePrimaryKey;

    /**
    * 死信队列
    */
    @SerializedName("DropDlq")
    @Expose
    private FailureParam DropDlq;

    /**
    * 使用数据订阅格式导入 es 时，消息与 es 索引字段映射关系。不填默认为默认字段匹配
    */
    @SerializedName("RecordMappingList")
    @Expose
    private EsRecordMapping [] RecordMappingList;

    /**
    * 消息要映射为 es 索引中 @timestamp 的字段，如果当前配置为空，则使用消息的时间戳进行映射
    */
    @SerializedName("DateField")
    @Expose
    private String DateField;

    /**
    * 用来区分当前索引映射，属于新建索引还是存量索引。"EXIST_MAPPING"：从存量索引中选择；"NEW_MAPPING"：新建索引
    */
    @SerializedName("RecordMappingMode")
    @Expose
    private String RecordMappingMode;

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
     * Get Es的连接port 
     * @return Port Es的连接port
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Es的连接port
     * @param Port Es的连接port
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get Es用户名 
     * @return UserName Es用户名
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Es用户名
     * @param UserName Es用户名
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get Es密码 
     * @return Password Es密码
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set Es密码
     * @param Password Es密码
     */
    public void setPassword(String Password) {
        this.Password = Password;
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
     * Get Es是否抛弃解析失败的消息 
     * @return DropInvalidMessage Es是否抛弃解析失败的消息
     */
    public Boolean getDropInvalidMessage() {
        return this.DropInvalidMessage;
    }

    /**
     * Set Es是否抛弃解析失败的消息
     * @param DropInvalidMessage Es是否抛弃解析失败的消息
     */
    public void setDropInvalidMessage(Boolean DropInvalidMessage) {
        this.DropInvalidMessage = DropInvalidMessage;
    }

    /**
     * Get Es自定义index名称 
     * @return Index Es自定义index名称
     */
    public String getIndex() {
        return this.Index;
    }

    /**
     * Set Es自定义index名称
     * @param Index Es自定义index名称
     */
    public void setIndex(String Index) {
        this.Index = Index;
    }

    /**
     * Get Es自定义日期后缀 
     * @return DateFormat Es自定义日期后缀
     */
    public String getDateFormat() {
        return this.DateFormat;
    }

    /**
     * Set Es自定义日期后缀
     * @param DateFormat Es自定义日期后缀
     */
    public void setDateFormat(String DateFormat) {
        this.DateFormat = DateFormat;
    }

    /**
     * Get 非json格式数据的自定义key 
     * @return ContentKey 非json格式数据的自定义key
     */
    public String getContentKey() {
        return this.ContentKey;
    }

    /**
     * Set 非json格式数据的自定义key
     * @param ContentKey 非json格式数据的自定义key
     */
    public void setContentKey(String ContentKey) {
        this.ContentKey = ContentKey;
    }

    /**
     * Get Es是否抛弃非json格式的消息 
     * @return DropInvalidJsonMessage Es是否抛弃非json格式的消息
     */
    public Boolean getDropInvalidJsonMessage() {
        return this.DropInvalidJsonMessage;
    }

    /**
     * Set Es是否抛弃非json格式的消息
     * @param DropInvalidJsonMessage Es是否抛弃非json格式的消息
     */
    public void setDropInvalidJsonMessage(Boolean DropInvalidJsonMessage) {
        this.DropInvalidJsonMessage = DropInvalidJsonMessage;
    }

    /**
     * Get 转储到Es中的文档ID取值字段名 
     * @return DocumentIdField 转储到Es中的文档ID取值字段名
     */
    public String getDocumentIdField() {
        return this.DocumentIdField;
    }

    /**
     * Set 转储到Es中的文档ID取值字段名
     * @param DocumentIdField 转储到Es中的文档ID取值字段名
     */
    public void setDocumentIdField(String DocumentIdField) {
        this.DocumentIdField = DocumentIdField;
    }

    /**
     * Get Es自定义index名称的类型，STRING，JSONPATH，默认为STRING 
     * @return IndexType Es自定义index名称的类型，STRING，JSONPATH，默认为STRING
     */
    public String getIndexType() {
        return this.IndexType;
    }

    /**
     * Set Es自定义index名称的类型，STRING，JSONPATH，默认为STRING
     * @param IndexType Es自定义index名称的类型，STRING，JSONPATH，默认为STRING
     */
    public void setIndexType(String IndexType) {
        this.IndexType = IndexType;
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

    /**
     * Get 转储到ES的消息为Database的binlog时，如果需要同步数据库操作，即增删改的操作到ES时填写数据库表主键 
     * @return DatabasePrimaryKey 转储到ES的消息为Database的binlog时，如果需要同步数据库操作，即增删改的操作到ES时填写数据库表主键
     */
    public String getDatabasePrimaryKey() {
        return this.DatabasePrimaryKey;
    }

    /**
     * Set 转储到ES的消息为Database的binlog时，如果需要同步数据库操作，即增删改的操作到ES时填写数据库表主键
     * @param DatabasePrimaryKey 转储到ES的消息为Database的binlog时，如果需要同步数据库操作，即增删改的操作到ES时填写数据库表主键
     */
    public void setDatabasePrimaryKey(String DatabasePrimaryKey) {
        this.DatabasePrimaryKey = DatabasePrimaryKey;
    }

    /**
     * Get 死信队列 
     * @return DropDlq 死信队列
     */
    public FailureParam getDropDlq() {
        return this.DropDlq;
    }

    /**
     * Set 死信队列
     * @param DropDlq 死信队列
     */
    public void setDropDlq(FailureParam DropDlq) {
        this.DropDlq = DropDlq;
    }

    /**
     * Get 使用数据订阅格式导入 es 时，消息与 es 索引字段映射关系。不填默认为默认字段匹配 
     * @return RecordMappingList 使用数据订阅格式导入 es 时，消息与 es 索引字段映射关系。不填默认为默认字段匹配
     */
    public EsRecordMapping [] getRecordMappingList() {
        return this.RecordMappingList;
    }

    /**
     * Set 使用数据订阅格式导入 es 时，消息与 es 索引字段映射关系。不填默认为默认字段匹配
     * @param RecordMappingList 使用数据订阅格式导入 es 时，消息与 es 索引字段映射关系。不填默认为默认字段匹配
     */
    public void setRecordMappingList(EsRecordMapping [] RecordMappingList) {
        this.RecordMappingList = RecordMappingList;
    }

    /**
     * Get 消息要映射为 es 索引中 @timestamp 的字段，如果当前配置为空，则使用消息的时间戳进行映射 
     * @return DateField 消息要映射为 es 索引中 @timestamp 的字段，如果当前配置为空，则使用消息的时间戳进行映射
     */
    public String getDateField() {
        return this.DateField;
    }

    /**
     * Set 消息要映射为 es 索引中 @timestamp 的字段，如果当前配置为空，则使用消息的时间戳进行映射
     * @param DateField 消息要映射为 es 索引中 @timestamp 的字段，如果当前配置为空，则使用消息的时间戳进行映射
     */
    public void setDateField(String DateField) {
        this.DateField = DateField;
    }

    /**
     * Get 用来区分当前索引映射，属于新建索引还是存量索引。"EXIST_MAPPING"：从存量索引中选择；"NEW_MAPPING"：新建索引 
     * @return RecordMappingMode 用来区分当前索引映射，属于新建索引还是存量索引。"EXIST_MAPPING"：从存量索引中选择；"NEW_MAPPING"：新建索引
     */
    public String getRecordMappingMode() {
        return this.RecordMappingMode;
    }

    /**
     * Set 用来区分当前索引映射，属于新建索引还是存量索引。"EXIST_MAPPING"：从存量索引中选择；"NEW_MAPPING"：新建索引
     * @param RecordMappingMode 用来区分当前索引映射，属于新建索引还是存量索引。"EXIST_MAPPING"：从存量索引中选择；"NEW_MAPPING"：新建索引
     */
    public void setRecordMappingMode(String RecordMappingMode) {
        this.RecordMappingMode = RecordMappingMode;
    }

    public EsParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EsParam(EsParam source) {
        if (source.Resource != null) {
            this.Resource = new String(source.Resource);
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
        if (source.SelfBuilt != null) {
            this.SelfBuilt = new Boolean(source.SelfBuilt);
        }
        if (source.ServiceVip != null) {
            this.ServiceVip = new String(source.ServiceVip);
        }
        if (source.UniqVpcId != null) {
            this.UniqVpcId = new String(source.UniqVpcId);
        }
        if (source.DropInvalidMessage != null) {
            this.DropInvalidMessage = new Boolean(source.DropInvalidMessage);
        }
        if (source.Index != null) {
            this.Index = new String(source.Index);
        }
        if (source.DateFormat != null) {
            this.DateFormat = new String(source.DateFormat);
        }
        if (source.ContentKey != null) {
            this.ContentKey = new String(source.ContentKey);
        }
        if (source.DropInvalidJsonMessage != null) {
            this.DropInvalidJsonMessage = new Boolean(source.DropInvalidJsonMessage);
        }
        if (source.DocumentIdField != null) {
            this.DocumentIdField = new String(source.DocumentIdField);
        }
        if (source.IndexType != null) {
            this.IndexType = new String(source.IndexType);
        }
        if (source.DropCls != null) {
            this.DropCls = new DropCls(source.DropCls);
        }
        if (source.DatabasePrimaryKey != null) {
            this.DatabasePrimaryKey = new String(source.DatabasePrimaryKey);
        }
        if (source.DropDlq != null) {
            this.DropDlq = new FailureParam(source.DropDlq);
        }
        if (source.RecordMappingList != null) {
            this.RecordMappingList = new EsRecordMapping[source.RecordMappingList.length];
            for (int i = 0; i < source.RecordMappingList.length; i++) {
                this.RecordMappingList[i] = new EsRecordMapping(source.RecordMappingList[i]);
            }
        }
        if (source.DateField != null) {
            this.DateField = new String(source.DateField);
        }
        if (source.RecordMappingMode != null) {
            this.RecordMappingMode = new String(source.RecordMappingMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Resource", this.Resource);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "SelfBuilt", this.SelfBuilt);
        this.setParamSimple(map, prefix + "ServiceVip", this.ServiceVip);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "DropInvalidMessage", this.DropInvalidMessage);
        this.setParamSimple(map, prefix + "Index", this.Index);
        this.setParamSimple(map, prefix + "DateFormat", this.DateFormat);
        this.setParamSimple(map, prefix + "ContentKey", this.ContentKey);
        this.setParamSimple(map, prefix + "DropInvalidJsonMessage", this.DropInvalidJsonMessage);
        this.setParamSimple(map, prefix + "DocumentIdField", this.DocumentIdField);
        this.setParamSimple(map, prefix + "IndexType", this.IndexType);
        this.setParamObj(map, prefix + "DropCls.", this.DropCls);
        this.setParamSimple(map, prefix + "DatabasePrimaryKey", this.DatabasePrimaryKey);
        this.setParamObj(map, prefix + "DropDlq.", this.DropDlq);
        this.setParamArrayObj(map, prefix + "RecordMappingList.", this.RecordMappingList);
        this.setParamSimple(map, prefix + "DateField", this.DateField);
        this.setParamSimple(map, prefix + "RecordMappingMode", this.RecordMappingMode);

    }
}

