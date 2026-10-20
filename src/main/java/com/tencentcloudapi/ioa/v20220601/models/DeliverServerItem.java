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
package com.tencentcloudapi.ioa.v20220601.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeliverServerItem extends AbstractModel {

    /**
    * <p>服务器id  (创建时忽略)</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * <p>服务器名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>转发服务器地址类型 4:syslog, 2:kafka, 3:http(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * <p>服务器描述</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>syslog服务器地址</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetSyslogAddress")
    @Expose
    private String TargetSyslogAddress;

    /**
    * <p>syslog协议类型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetSyslogProtocol")
    @Expose
    private String TargetSyslogProtocol;

    /**
    * <p>syslog协议端口(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetSyslogPort")
    @Expose
    private Long TargetSyslogPort;

    /**
    * <p>syslog设备/Facility</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SyslogFacility")
    @Expose
    private String SyslogFacility;

    /**
    * <p>Kafka服务器地址</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetKafkaAddress")
    @Expose
    private String TargetKafkaAddress;

    /**
    * <p>Kafka主题</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetKafkaTopic")
    @Expose
    private String TargetKafkaTopic;

    /**
    * <p>Kafka版本</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KafkaVersion")
    @Expose
    private String KafkaVersion;

    /**
    * <p>Kafka sasl用户名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KafkaSaslUserName")
    @Expose
    private String KafkaSaslUserName;

    /**
    * <p>Kafka sasl密码</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KafkaSaslPassword")
    @Expose
    private String KafkaSaslPassword;

    /**
    * <p>http服务器地址</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetHttpUrl")
    @Expose
    private String TargetHttpUrl;

    /**
    * <p>http服务超时时间(只支持32位)</p><p>单位：毫秒</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetHttpTimeout")
    @Expose
    private Long TargetHttpTimeout;

    /**
    * <p>连接器分组ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConnectorGroupId")
    @Expose
    private String ConnectorGroupId;

    /**
    * <p>连接器分组名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConnectorGroupName")
    @Expose
    private String ConnectorGroupName;

    /**
    * <p>KAFKA是否启用SSL</p>
    */
    @SerializedName("KafkaSSLEnable")
    @Expose
    private Boolean KafkaSSLEnable;

    /**
    * <p>跳过证书检查</p>
    */
    @SerializedName("SSLSkipVerify")
    @Expose
    private Boolean SSLSkipVerify;

    /**
     * Get <p>服务器id  (创建时忽略)</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ID <p>服务器id  (创建时忽略)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set <p>服务器id  (创建时忽略)</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ID <p>服务器id  (创建时忽略)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get <p>服务器名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name <p>服务器名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>服务器名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name <p>服务器名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>转发服务器地址类型 4:syslog, 2:kafka, 3:http(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type <p>转发服务器地址类型 4:syslog, 2:kafka, 3:http(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>转发服务器地址类型 4:syslog, 2:kafka, 3:http(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type <p>转发服务器地址类型 4:syslog, 2:kafka, 3:http(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get <p>服务器描述</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description <p>服务器描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>服务器描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description <p>服务器描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>syslog服务器地址</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetSyslogAddress <p>syslog服务器地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetSyslogAddress() {
        return this.TargetSyslogAddress;
    }

    /**
     * Set <p>syslog服务器地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetSyslogAddress <p>syslog服务器地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetSyslogAddress(String TargetSyslogAddress) {
        this.TargetSyslogAddress = TargetSyslogAddress;
    }

    /**
     * Get <p>syslog协议类型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetSyslogProtocol <p>syslog协议类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetSyslogProtocol() {
        return this.TargetSyslogProtocol;
    }

    /**
     * Set <p>syslog协议类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetSyslogProtocol <p>syslog协议类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetSyslogProtocol(String TargetSyslogProtocol) {
        this.TargetSyslogProtocol = TargetSyslogProtocol;
    }

    /**
     * Get <p>syslog协议端口(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetSyslogPort <p>syslog协议端口(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTargetSyslogPort() {
        return this.TargetSyslogPort;
    }

    /**
     * Set <p>syslog协议端口(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetSyslogPort <p>syslog协议端口(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetSyslogPort(Long TargetSyslogPort) {
        this.TargetSyslogPort = TargetSyslogPort;
    }

    /**
     * Get <p>syslog设备/Facility</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SyslogFacility <p>syslog设备/Facility</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSyslogFacility() {
        return this.SyslogFacility;
    }

    /**
     * Set <p>syslog设备/Facility</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SyslogFacility <p>syslog设备/Facility</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSyslogFacility(String SyslogFacility) {
        this.SyslogFacility = SyslogFacility;
    }

    /**
     * Get <p>Kafka服务器地址</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetKafkaAddress <p>Kafka服务器地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetKafkaAddress() {
        return this.TargetKafkaAddress;
    }

    /**
     * Set <p>Kafka服务器地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetKafkaAddress <p>Kafka服务器地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetKafkaAddress(String TargetKafkaAddress) {
        this.TargetKafkaAddress = TargetKafkaAddress;
    }

    /**
     * Get <p>Kafka主题</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetKafkaTopic <p>Kafka主题</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetKafkaTopic() {
        return this.TargetKafkaTopic;
    }

    /**
     * Set <p>Kafka主题</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetKafkaTopic <p>Kafka主题</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetKafkaTopic(String TargetKafkaTopic) {
        this.TargetKafkaTopic = TargetKafkaTopic;
    }

    /**
     * Get <p>Kafka版本</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KafkaVersion <p>Kafka版本</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKafkaVersion() {
        return this.KafkaVersion;
    }

    /**
     * Set <p>Kafka版本</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param KafkaVersion <p>Kafka版本</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKafkaVersion(String KafkaVersion) {
        this.KafkaVersion = KafkaVersion;
    }

    /**
     * Get <p>Kafka sasl用户名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KafkaSaslUserName <p>Kafka sasl用户名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKafkaSaslUserName() {
        return this.KafkaSaslUserName;
    }

    /**
     * Set <p>Kafka sasl用户名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param KafkaSaslUserName <p>Kafka sasl用户名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKafkaSaslUserName(String KafkaSaslUserName) {
        this.KafkaSaslUserName = KafkaSaslUserName;
    }

    /**
     * Get <p>Kafka sasl密码</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KafkaSaslPassword <p>Kafka sasl密码</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKafkaSaslPassword() {
        return this.KafkaSaslPassword;
    }

    /**
     * Set <p>Kafka sasl密码</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param KafkaSaslPassword <p>Kafka sasl密码</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKafkaSaslPassword(String KafkaSaslPassword) {
        this.KafkaSaslPassword = KafkaSaslPassword;
    }

    /**
     * Get <p>http服务器地址</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetHttpUrl <p>http服务器地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetHttpUrl() {
        return this.TargetHttpUrl;
    }

    /**
     * Set <p>http服务器地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetHttpUrl <p>http服务器地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetHttpUrl(String TargetHttpUrl) {
        this.TargetHttpUrl = TargetHttpUrl;
    }

    /**
     * Get <p>http服务超时时间(只支持32位)</p><p>单位：毫秒</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetHttpTimeout <p>http服务超时时间(只支持32位)</p><p>单位：毫秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTargetHttpTimeout() {
        return this.TargetHttpTimeout;
    }

    /**
     * Set <p>http服务超时时间(只支持32位)</p><p>单位：毫秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetHttpTimeout <p>http服务超时时间(只支持32位)</p><p>单位：毫秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetHttpTimeout(Long TargetHttpTimeout) {
        this.TargetHttpTimeout = TargetHttpTimeout;
    }

    /**
     * Get <p>连接器分组ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConnectorGroupId <p>连接器分组ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConnectorGroupId() {
        return this.ConnectorGroupId;
    }

    /**
     * Set <p>连接器分组ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConnectorGroupId <p>连接器分组ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConnectorGroupId(String ConnectorGroupId) {
        this.ConnectorGroupId = ConnectorGroupId;
    }

    /**
     * Get <p>连接器分组名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConnectorGroupName <p>连接器分组名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConnectorGroupName() {
        return this.ConnectorGroupName;
    }

    /**
     * Set <p>连接器分组名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConnectorGroupName <p>连接器分组名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConnectorGroupName(String ConnectorGroupName) {
        this.ConnectorGroupName = ConnectorGroupName;
    }

    /**
     * Get <p>KAFKA是否启用SSL</p> 
     * @return KafkaSSLEnable <p>KAFKA是否启用SSL</p>
     */
    public Boolean getKafkaSSLEnable() {
        return this.KafkaSSLEnable;
    }

    /**
     * Set <p>KAFKA是否启用SSL</p>
     * @param KafkaSSLEnable <p>KAFKA是否启用SSL</p>
     */
    public void setKafkaSSLEnable(Boolean KafkaSSLEnable) {
        this.KafkaSSLEnable = KafkaSSLEnable;
    }

    /**
     * Get <p>跳过证书检查</p> 
     * @return SSLSkipVerify <p>跳过证书检查</p>
     */
    public Boolean getSSLSkipVerify() {
        return this.SSLSkipVerify;
    }

    /**
     * Set <p>跳过证书检查</p>
     * @param SSLSkipVerify <p>跳过证书检查</p>
     */
    public void setSSLSkipVerify(Boolean SSLSkipVerify) {
        this.SSLSkipVerify = SSLSkipVerify;
    }

    public DeliverServerItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeliverServerItem(DeliverServerItem source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.TargetSyslogAddress != null) {
            this.TargetSyslogAddress = new String(source.TargetSyslogAddress);
        }
        if (source.TargetSyslogProtocol != null) {
            this.TargetSyslogProtocol = new String(source.TargetSyslogProtocol);
        }
        if (source.TargetSyslogPort != null) {
            this.TargetSyslogPort = new Long(source.TargetSyslogPort);
        }
        if (source.SyslogFacility != null) {
            this.SyslogFacility = new String(source.SyslogFacility);
        }
        if (source.TargetKafkaAddress != null) {
            this.TargetKafkaAddress = new String(source.TargetKafkaAddress);
        }
        if (source.TargetKafkaTopic != null) {
            this.TargetKafkaTopic = new String(source.TargetKafkaTopic);
        }
        if (source.KafkaVersion != null) {
            this.KafkaVersion = new String(source.KafkaVersion);
        }
        if (source.KafkaSaslUserName != null) {
            this.KafkaSaslUserName = new String(source.KafkaSaslUserName);
        }
        if (source.KafkaSaslPassword != null) {
            this.KafkaSaslPassword = new String(source.KafkaSaslPassword);
        }
        if (source.TargetHttpUrl != null) {
            this.TargetHttpUrl = new String(source.TargetHttpUrl);
        }
        if (source.TargetHttpTimeout != null) {
            this.TargetHttpTimeout = new Long(source.TargetHttpTimeout);
        }
        if (source.ConnectorGroupId != null) {
            this.ConnectorGroupId = new String(source.ConnectorGroupId);
        }
        if (source.ConnectorGroupName != null) {
            this.ConnectorGroupName = new String(source.ConnectorGroupName);
        }
        if (source.KafkaSSLEnable != null) {
            this.KafkaSSLEnable = new Boolean(source.KafkaSSLEnable);
        }
        if (source.SSLSkipVerify != null) {
            this.SSLSkipVerify = new Boolean(source.SSLSkipVerify);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "TargetSyslogAddress", this.TargetSyslogAddress);
        this.setParamSimple(map, prefix + "TargetSyslogProtocol", this.TargetSyslogProtocol);
        this.setParamSimple(map, prefix + "TargetSyslogPort", this.TargetSyslogPort);
        this.setParamSimple(map, prefix + "SyslogFacility", this.SyslogFacility);
        this.setParamSimple(map, prefix + "TargetKafkaAddress", this.TargetKafkaAddress);
        this.setParamSimple(map, prefix + "TargetKafkaTopic", this.TargetKafkaTopic);
        this.setParamSimple(map, prefix + "KafkaVersion", this.KafkaVersion);
        this.setParamSimple(map, prefix + "KafkaSaslUserName", this.KafkaSaslUserName);
        this.setParamSimple(map, prefix + "KafkaSaslPassword", this.KafkaSaslPassword);
        this.setParamSimple(map, prefix + "TargetHttpUrl", this.TargetHttpUrl);
        this.setParamSimple(map, prefix + "TargetHttpTimeout", this.TargetHttpTimeout);
        this.setParamSimple(map, prefix + "ConnectorGroupId", this.ConnectorGroupId);
        this.setParamSimple(map, prefix + "ConnectorGroupName", this.ConnectorGroupName);
        this.setParamSimple(map, prefix + "KafkaSSLEnable", this.KafkaSSLEnable);
        this.setParamSimple(map, prefix + "SSLSkipVerify", this.SSLSkipVerify);

    }
}

