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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PostCKafkaFlowInfo extends AbstractModel {

    /**
    * 投递流唯一ID
    */
    @SerializedName("FlowId")
    @Expose
    private Long FlowId;

    /**
    * 1-访问日志 2-攻击日志
    */
    @SerializedName("LogType")
    @Expose
    private Long LogType;

    /**
    * 状态 0-为关闭 1-为启用
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * CKafka所在区域
    */
    @SerializedName("CKafkaRegion")
    @Expose
    private String CKafkaRegion;

    /**
    * CKafka实例ID
    */
    @SerializedName("CKafkaID")
    @Expose
    private String CKafkaID;

    /**
    * ckafka地址信息
    */
    @SerializedName("Brokers")
    @Expose
    private String Brokers;

    /**
    * ckafka版本号
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 主题名称
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * 压缩算法，支持gzip 和 lz4
    */
    @SerializedName("Compression")
    @Expose
    private String Compression;

    /**
    * 是否支持SASL,0-关闭，1-开启
    */
    @SerializedName("SASLEnable")
    @Expose
    private Long SASLEnable;

    /**
    * SASL用户名
    */
    @SerializedName("SASLUser")
    @Expose
    private String SASLUser;

    /**
    * SALS密码
    */
    @SerializedName("SASLPassword")
    @Expose
    private String SASLPassword;

    /**
    * 描述信息
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 1-外网TGW，2-支撑环境，默认为支撑环境
    */
    @SerializedName("VipType")
    @Expose
    private Long VipType;

    /**
    * 配置状态
    */
    @SerializedName("WriteConfig")
    @Expose
    private FieldWriteConfig WriteConfig;

    /**
     * Get 投递流唯一ID 
     * @return FlowId 投递流唯一ID
     */
    public Long getFlowId() {
        return this.FlowId;
    }

    /**
     * Set 投递流唯一ID
     * @param FlowId 投递流唯一ID
     */
    public void setFlowId(Long FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get 1-访问日志 2-攻击日志 
     * @return LogType 1-访问日志 2-攻击日志
     */
    public Long getLogType() {
        return this.LogType;
    }

    /**
     * Set 1-访问日志 2-攻击日志
     * @param LogType 1-访问日志 2-攻击日志
     */
    public void setLogType(Long LogType) {
        this.LogType = LogType;
    }

    /**
     * Get 状态 0-为关闭 1-为启用 
     * @return Status 状态 0-为关闭 1-为启用
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态 0-为关闭 1-为启用
     * @param Status 状态 0-为关闭 1-为启用
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get CKafka所在区域 
     * @return CKafkaRegion CKafka所在区域
     */
    public String getCKafkaRegion() {
        return this.CKafkaRegion;
    }

    /**
     * Set CKafka所在区域
     * @param CKafkaRegion CKafka所在区域
     */
    public void setCKafkaRegion(String CKafkaRegion) {
        this.CKafkaRegion = CKafkaRegion;
    }

    /**
     * Get CKafka实例ID 
     * @return CKafkaID CKafka实例ID
     */
    public String getCKafkaID() {
        return this.CKafkaID;
    }

    /**
     * Set CKafka实例ID
     * @param CKafkaID CKafka实例ID
     */
    public void setCKafkaID(String CKafkaID) {
        this.CKafkaID = CKafkaID;
    }

    /**
     * Get ckafka地址信息 
     * @return Brokers ckafka地址信息
     */
    public String getBrokers() {
        return this.Brokers;
    }

    /**
     * Set ckafka地址信息
     * @param Brokers ckafka地址信息
     */
    public void setBrokers(String Brokers) {
        this.Brokers = Brokers;
    }

    /**
     * Get ckafka版本号 
     * @return Version ckafka版本号
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set ckafka版本号
     * @param Version ckafka版本号
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get 主题名称 
     * @return Topic 主题名称
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set 主题名称
     * @param Topic 主题名称
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    /**
     * Get 压缩算法，支持gzip 和 lz4 
     * @return Compression 压缩算法，支持gzip 和 lz4
     */
    public String getCompression() {
        return this.Compression;
    }

    /**
     * Set 压缩算法，支持gzip 和 lz4
     * @param Compression 压缩算法，支持gzip 和 lz4
     */
    public void setCompression(String Compression) {
        this.Compression = Compression;
    }

    /**
     * Get 是否支持SASL,0-关闭，1-开启 
     * @return SASLEnable 是否支持SASL,0-关闭，1-开启
     */
    public Long getSASLEnable() {
        return this.SASLEnable;
    }

    /**
     * Set 是否支持SASL,0-关闭，1-开启
     * @param SASLEnable 是否支持SASL,0-关闭，1-开启
     */
    public void setSASLEnable(Long SASLEnable) {
        this.SASLEnable = SASLEnable;
    }

    /**
     * Get SASL用户名 
     * @return SASLUser SASL用户名
     */
    public String getSASLUser() {
        return this.SASLUser;
    }

    /**
     * Set SASL用户名
     * @param SASLUser SASL用户名
     */
    public void setSASLUser(String SASLUser) {
        this.SASLUser = SASLUser;
    }

    /**
     * Get SALS密码 
     * @return SASLPassword SALS密码
     */
    public String getSASLPassword() {
        return this.SASLPassword;
    }

    /**
     * Set SALS密码
     * @param SASLPassword SALS密码
     */
    public void setSASLPassword(String SASLPassword) {
        this.SASLPassword = SASLPassword;
    }

    /**
     * Get 描述信息 
     * @return Content 描述信息
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 描述信息
     * @param Content 描述信息
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 1-外网TGW，2-支撑环境，默认为支撑环境 
     * @return VipType 1-外网TGW，2-支撑环境，默认为支撑环境
     */
    public Long getVipType() {
        return this.VipType;
    }

    /**
     * Set 1-外网TGW，2-支撑环境，默认为支撑环境
     * @param VipType 1-外网TGW，2-支撑环境，默认为支撑环境
     */
    public void setVipType(Long VipType) {
        this.VipType = VipType;
    }

    /**
     * Get 配置状态 
     * @return WriteConfig 配置状态
     */
    public FieldWriteConfig getWriteConfig() {
        return this.WriteConfig;
    }

    /**
     * Set 配置状态
     * @param WriteConfig 配置状态
     */
    public void setWriteConfig(FieldWriteConfig WriteConfig) {
        this.WriteConfig = WriteConfig;
    }

    public PostCKafkaFlowInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PostCKafkaFlowInfo(PostCKafkaFlowInfo source) {
        if (source.FlowId != null) {
            this.FlowId = new Long(source.FlowId);
        }
        if (source.LogType != null) {
            this.LogType = new Long(source.LogType);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CKafkaRegion != null) {
            this.CKafkaRegion = new String(source.CKafkaRegion);
        }
        if (source.CKafkaID != null) {
            this.CKafkaID = new String(source.CKafkaID);
        }
        if (source.Brokers != null) {
            this.Brokers = new String(source.Brokers);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.Topic != null) {
            this.Topic = new String(source.Topic);
        }
        if (source.Compression != null) {
            this.Compression = new String(source.Compression);
        }
        if (source.SASLEnable != null) {
            this.SASLEnable = new Long(source.SASLEnable);
        }
        if (source.SASLUser != null) {
            this.SASLUser = new String(source.SASLUser);
        }
        if (source.SASLPassword != null) {
            this.SASLPassword = new String(source.SASLPassword);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.VipType != null) {
            this.VipType = new Long(source.VipType);
        }
        if (source.WriteConfig != null) {
            this.WriteConfig = new FieldWriteConfig(source.WriteConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CKafkaRegion", this.CKafkaRegion);
        this.setParamSimple(map, prefix + "CKafkaID", this.CKafkaID);
        this.setParamSimple(map, prefix + "Brokers", this.Brokers);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamSimple(map, prefix + "Compression", this.Compression);
        this.setParamSimple(map, prefix + "SASLEnable", this.SASLEnable);
        this.setParamSimple(map, prefix + "SASLUser", this.SASLUser);
        this.setParamSimple(map, prefix + "SASLPassword", this.SASLPassword);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "VipType", this.VipType);
        this.setParamObj(map, prefix + "WriteConfig.", this.WriteConfig);

    }
}

