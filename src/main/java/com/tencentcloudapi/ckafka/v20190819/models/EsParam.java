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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EsParam extends AbstractModel {

    /**
    * <p>Es实例资源Id</p>
    */
    @SerializedName("Resource")
    @Expose
    private String Resource;

    /**
    * <p>Es的连接port</p>
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * <p>Es用户名</p>
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * <p>Es密码</p>
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * <p>是否为自建集群</p>
    */
    @SerializedName("SelfBuilt")
    @Expose
    private Boolean SelfBuilt;

    /**
    * <p>实例vip</p>
    */
    @SerializedName("ServiceVip")
    @Expose
    private String ServiceVip;

    /**
    * <p>实例的vpcId</p>
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * <p>Es是否抛弃解析失败的消息</p>
    */
    @SerializedName("DropInvalidMessage")
    @Expose
    private Boolean DropInvalidMessage;

    /**
    * <p>Es自定义index名称</p>
    */
    @SerializedName("Index")
    @Expose
    private String Index;

    /**
    * <p>Es自定义日期后缀</p>
    */
    @SerializedName("DateFormat")
    @Expose
    private String DateFormat;

    /**
    * <p>非json格式数据的自定义key</p>
    */
    @SerializedName("ContentKey")
    @Expose
    private String ContentKey;

    /**
    * <p>Es是否抛弃非json格式的消息</p>
    */
    @SerializedName("DropInvalidJsonMessage")
    @Expose
    private Boolean DropInvalidJsonMessage;

    /**
    * <p>转储到Es中的文档ID取值字段名</p>
    */
    @SerializedName("DocumentIdField")
    @Expose
    private String DocumentIdField;

    /**
    * <p>Es自定义index名称的类型，STRING，JSONPATH，默认为STRING</p>
    */
    @SerializedName("IndexType")
    @Expose
    private String IndexType;

    /**
    * <p>当设置成员参数DropInvalidMessageToCls设置为true时,DropInvalidMessage参数失效</p>
    */
    @SerializedName("DropCls")
    @Expose
    private DropCls DropCls;

    /**
    * <p>转储到ES的消息为Database的binlog时，如果需要同步数据库操作，即增删改的操作到ES时填写数据库表主键</p>
    */
    @SerializedName("DatabasePrimaryKey")
    @Expose
    private String DatabasePrimaryKey;

    /**
    * <p>死信队列</p>
    */
    @SerializedName("DropDlq")
    @Expose
    private FailureParam DropDlq;

    /**
    * <p>使用数据订阅格式导入 es 时，消息与 es 索引字段映射关系。不填默认为默认字段匹配</p>
    */
    @SerializedName("RecordMappingList")
    @Expose
    private EsRecordMapping [] RecordMappingList;

    /**
    * <p>消息要映射为 es 索引中 @timestamp 的字段，如果当前配置为空，则使用消息的时间戳进行映射</p>
    */
    @SerializedName("DateField")
    @Expose
    private String DateField;

    /**
    * <p>用来区分当前索引映射，属于新建索引还是存量索引。&quot;EXIST_MAPPING&quot;：从存量索引中选择；&quot;NEW_MAPPING&quot;：新建索引</p>
    */
    @SerializedName("RecordMappingMode")
    @Expose
    private String RecordMappingMode;

    /**
    * <p>集群版 ES 连接协议，默认http协议</p><p>枚举值：</p><ul><li>http： http协议</li><li>https： https协议</li></ul>
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
     * Get <p>Es实例资源Id</p> 
     * @return Resource <p>Es实例资源Id</p>
     */
    public String getResource() {
        return this.Resource;
    }

    /**
     * Set <p>Es实例资源Id</p>
     * @param Resource <p>Es实例资源Id</p>
     */
    public void setResource(String Resource) {
        this.Resource = Resource;
    }

    /**
     * Get <p>Es的连接port</p> 
     * @return Port <p>Es的连接port</p>
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set <p>Es的连接port</p>
     * @param Port <p>Es的连接port</p>
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get <p>Es用户名</p> 
     * @return UserName <p>Es用户名</p>
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set <p>Es用户名</p>
     * @param UserName <p>Es用户名</p>
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get <p>Es密码</p> 
     * @return Password <p>Es密码</p>
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set <p>Es密码</p>
     * @param Password <p>Es密码</p>
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get <p>是否为自建集群</p> 
     * @return SelfBuilt <p>是否为自建集群</p>
     */
    public Boolean getSelfBuilt() {
        return this.SelfBuilt;
    }

    /**
     * Set <p>是否为自建集群</p>
     * @param SelfBuilt <p>是否为自建集群</p>
     */
    public void setSelfBuilt(Boolean SelfBuilt) {
        this.SelfBuilt = SelfBuilt;
    }

    /**
     * Get <p>实例vip</p> 
     * @return ServiceVip <p>实例vip</p>
     */
    public String getServiceVip() {
        return this.ServiceVip;
    }

    /**
     * Set <p>实例vip</p>
     * @param ServiceVip <p>实例vip</p>
     */
    public void setServiceVip(String ServiceVip) {
        this.ServiceVip = ServiceVip;
    }

    /**
     * Get <p>实例的vpcId</p> 
     * @return UniqVpcId <p>实例的vpcId</p>
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set <p>实例的vpcId</p>
     * @param UniqVpcId <p>实例的vpcId</p>
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get <p>Es是否抛弃解析失败的消息</p> 
     * @return DropInvalidMessage <p>Es是否抛弃解析失败的消息</p>
     */
    public Boolean getDropInvalidMessage() {
        return this.DropInvalidMessage;
    }

    /**
     * Set <p>Es是否抛弃解析失败的消息</p>
     * @param DropInvalidMessage <p>Es是否抛弃解析失败的消息</p>
     */
    public void setDropInvalidMessage(Boolean DropInvalidMessage) {
        this.DropInvalidMessage = DropInvalidMessage;
    }

    /**
     * Get <p>Es自定义index名称</p> 
     * @return Index <p>Es自定义index名称</p>
     */
    public String getIndex() {
        return this.Index;
    }

    /**
     * Set <p>Es自定义index名称</p>
     * @param Index <p>Es自定义index名称</p>
     */
    public void setIndex(String Index) {
        this.Index = Index;
    }

    /**
     * Get <p>Es自定义日期后缀</p> 
     * @return DateFormat <p>Es自定义日期后缀</p>
     */
    public String getDateFormat() {
        return this.DateFormat;
    }

    /**
     * Set <p>Es自定义日期后缀</p>
     * @param DateFormat <p>Es自定义日期后缀</p>
     */
    public void setDateFormat(String DateFormat) {
        this.DateFormat = DateFormat;
    }

    /**
     * Get <p>非json格式数据的自定义key</p> 
     * @return ContentKey <p>非json格式数据的自定义key</p>
     */
    public String getContentKey() {
        return this.ContentKey;
    }

    /**
     * Set <p>非json格式数据的自定义key</p>
     * @param ContentKey <p>非json格式数据的自定义key</p>
     */
    public void setContentKey(String ContentKey) {
        this.ContentKey = ContentKey;
    }

    /**
     * Get <p>Es是否抛弃非json格式的消息</p> 
     * @return DropInvalidJsonMessage <p>Es是否抛弃非json格式的消息</p>
     */
    public Boolean getDropInvalidJsonMessage() {
        return this.DropInvalidJsonMessage;
    }

    /**
     * Set <p>Es是否抛弃非json格式的消息</p>
     * @param DropInvalidJsonMessage <p>Es是否抛弃非json格式的消息</p>
     */
    public void setDropInvalidJsonMessage(Boolean DropInvalidJsonMessage) {
        this.DropInvalidJsonMessage = DropInvalidJsonMessage;
    }

    /**
     * Get <p>转储到Es中的文档ID取值字段名</p> 
     * @return DocumentIdField <p>转储到Es中的文档ID取值字段名</p>
     */
    public String getDocumentIdField() {
        return this.DocumentIdField;
    }

    /**
     * Set <p>转储到Es中的文档ID取值字段名</p>
     * @param DocumentIdField <p>转储到Es中的文档ID取值字段名</p>
     */
    public void setDocumentIdField(String DocumentIdField) {
        this.DocumentIdField = DocumentIdField;
    }

    /**
     * Get <p>Es自定义index名称的类型，STRING，JSONPATH，默认为STRING</p> 
     * @return IndexType <p>Es自定义index名称的类型，STRING，JSONPATH，默认为STRING</p>
     */
    public String getIndexType() {
        return this.IndexType;
    }

    /**
     * Set <p>Es自定义index名称的类型，STRING，JSONPATH，默认为STRING</p>
     * @param IndexType <p>Es自定义index名称的类型，STRING，JSONPATH，默认为STRING</p>
     */
    public void setIndexType(String IndexType) {
        this.IndexType = IndexType;
    }

    /**
     * Get <p>当设置成员参数DropInvalidMessageToCls设置为true时,DropInvalidMessage参数失效</p> 
     * @return DropCls <p>当设置成员参数DropInvalidMessageToCls设置为true时,DropInvalidMessage参数失效</p>
     */
    public DropCls getDropCls() {
        return this.DropCls;
    }

    /**
     * Set <p>当设置成员参数DropInvalidMessageToCls设置为true时,DropInvalidMessage参数失效</p>
     * @param DropCls <p>当设置成员参数DropInvalidMessageToCls设置为true时,DropInvalidMessage参数失效</p>
     */
    public void setDropCls(DropCls DropCls) {
        this.DropCls = DropCls;
    }

    /**
     * Get <p>转储到ES的消息为Database的binlog时，如果需要同步数据库操作，即增删改的操作到ES时填写数据库表主键</p> 
     * @return DatabasePrimaryKey <p>转储到ES的消息为Database的binlog时，如果需要同步数据库操作，即增删改的操作到ES时填写数据库表主键</p>
     */
    public String getDatabasePrimaryKey() {
        return this.DatabasePrimaryKey;
    }

    /**
     * Set <p>转储到ES的消息为Database的binlog时，如果需要同步数据库操作，即增删改的操作到ES时填写数据库表主键</p>
     * @param DatabasePrimaryKey <p>转储到ES的消息为Database的binlog时，如果需要同步数据库操作，即增删改的操作到ES时填写数据库表主键</p>
     */
    public void setDatabasePrimaryKey(String DatabasePrimaryKey) {
        this.DatabasePrimaryKey = DatabasePrimaryKey;
    }

    /**
     * Get <p>死信队列</p> 
     * @return DropDlq <p>死信队列</p>
     */
    public FailureParam getDropDlq() {
        return this.DropDlq;
    }

    /**
     * Set <p>死信队列</p>
     * @param DropDlq <p>死信队列</p>
     */
    public void setDropDlq(FailureParam DropDlq) {
        this.DropDlq = DropDlq;
    }

    /**
     * Get <p>使用数据订阅格式导入 es 时，消息与 es 索引字段映射关系。不填默认为默认字段匹配</p> 
     * @return RecordMappingList <p>使用数据订阅格式导入 es 时，消息与 es 索引字段映射关系。不填默认为默认字段匹配</p>
     */
    public EsRecordMapping [] getRecordMappingList() {
        return this.RecordMappingList;
    }

    /**
     * Set <p>使用数据订阅格式导入 es 时，消息与 es 索引字段映射关系。不填默认为默认字段匹配</p>
     * @param RecordMappingList <p>使用数据订阅格式导入 es 时，消息与 es 索引字段映射关系。不填默认为默认字段匹配</p>
     */
    public void setRecordMappingList(EsRecordMapping [] RecordMappingList) {
        this.RecordMappingList = RecordMappingList;
    }

    /**
     * Get <p>消息要映射为 es 索引中 @timestamp 的字段，如果当前配置为空，则使用消息的时间戳进行映射</p> 
     * @return DateField <p>消息要映射为 es 索引中 @timestamp 的字段，如果当前配置为空，则使用消息的时间戳进行映射</p>
     */
    public String getDateField() {
        return this.DateField;
    }

    /**
     * Set <p>消息要映射为 es 索引中 @timestamp 的字段，如果当前配置为空，则使用消息的时间戳进行映射</p>
     * @param DateField <p>消息要映射为 es 索引中 @timestamp 的字段，如果当前配置为空，则使用消息的时间戳进行映射</p>
     */
    public void setDateField(String DateField) {
        this.DateField = DateField;
    }

    /**
     * Get <p>用来区分当前索引映射，属于新建索引还是存量索引。&quot;EXIST_MAPPING&quot;：从存量索引中选择；&quot;NEW_MAPPING&quot;：新建索引</p> 
     * @return RecordMappingMode <p>用来区分当前索引映射，属于新建索引还是存量索引。&quot;EXIST_MAPPING&quot;：从存量索引中选择；&quot;NEW_MAPPING&quot;：新建索引</p>
     */
    public String getRecordMappingMode() {
        return this.RecordMappingMode;
    }

    /**
     * Set <p>用来区分当前索引映射，属于新建索引还是存量索引。&quot;EXIST_MAPPING&quot;：从存量索引中选择；&quot;NEW_MAPPING&quot;：新建索引</p>
     * @param RecordMappingMode <p>用来区分当前索引映射，属于新建索引还是存量索引。&quot;EXIST_MAPPING&quot;：从存量索引中选择；&quot;NEW_MAPPING&quot;：新建索引</p>
     */
    public void setRecordMappingMode(String RecordMappingMode) {
        this.RecordMappingMode = RecordMappingMode;
    }

    /**
     * Get <p>集群版 ES 连接协议，默认http协议</p><p>枚举值：</p><ul><li>http： http协议</li><li>https： https协议</li></ul> 
     * @return Protocol <p>集群版 ES 连接协议，默认http协议</p><p>枚举值：</p><ul><li>http： http协议</li><li>https： https协议</li></ul>
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set <p>集群版 ES 连接协议，默认http协议</p><p>枚举值：</p><ul><li>http： http协议</li><li>https： https协议</li></ul>
     * @param Protocol <p>集群版 ES 连接协议，默认http协议</p><p>枚举值：</p><ul><li>http： http协议</li><li>https： https协议</li></ul>
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
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
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
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
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);

    }
}

