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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreatePostCKafkaFlowRequest extends AbstractModel {

    /**
    * 投递的CKafka所在区域
    */
    @SerializedName("CKafkaRegion")
    @Expose
    private String CKafkaRegion;

    /**
    * 客户的CKafka 实例ID
    */
    @SerializedName("CKafkaID")
    @Expose
    private String CKafkaID;

    /**
    * 支撑环境是IP:PORT，外网环境是domain:PORT
    */
    @SerializedName("Brokers")
    @Expose
    private String Brokers;

    /**
    * 默认为none，支持snappy、gzip和lz4压缩，推荐snappy
    */
    @SerializedName("Compression")
    @Expose
    private String Compression;

    /**
    * 1-外网TGW，2-支撑环境，默认为支撑环境
    */
    @SerializedName("VipType")
    @Expose
    private Long VipType;

    /**
    * 1-访问日志，2-攻击日志，默认为访问日志
    */
    @SerializedName("LogType")
    @Expose
    private Long LogType;

    /**
    * 主题名称，默认不传或者传空字符串，默认值为waf_post_access_log
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * kafka集群的版本号
    */
    @SerializedName("KafkaVersion")
    @Expose
    private String KafkaVersion;

    /**
    * 是否开启SASL校验，默认不开启，0-关闭，1-开启
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
    * SASL密码
    */
    @SerializedName("SASLPassword")
    @Expose
    private String SASLPassword;

    /**
    * 开启访问日志某些字段是否投递
    */
    @SerializedName("WriteConfig")
    @Expose
    private FieldWriteConfig WriteConfig;

    /**
     * Get 投递的CKafka所在区域 
     * @return CKafkaRegion 投递的CKafka所在区域
     */
    public String getCKafkaRegion() {
        return this.CKafkaRegion;
    }

    /**
     * Set 投递的CKafka所在区域
     * @param CKafkaRegion 投递的CKafka所在区域
     */
    public void setCKafkaRegion(String CKafkaRegion) {
        this.CKafkaRegion = CKafkaRegion;
    }

    /**
     * Get 客户的CKafka 实例ID 
     * @return CKafkaID 客户的CKafka 实例ID
     */
    public String getCKafkaID() {
        return this.CKafkaID;
    }

    /**
     * Set 客户的CKafka 实例ID
     * @param CKafkaID 客户的CKafka 实例ID
     */
    public void setCKafkaID(String CKafkaID) {
        this.CKafkaID = CKafkaID;
    }

    /**
     * Get 支撑环境是IP:PORT，外网环境是domain:PORT 
     * @return Brokers 支撑环境是IP:PORT，外网环境是domain:PORT
     */
    public String getBrokers() {
        return this.Brokers;
    }

    /**
     * Set 支撑环境是IP:PORT，外网环境是domain:PORT
     * @param Brokers 支撑环境是IP:PORT，外网环境是domain:PORT
     */
    public void setBrokers(String Brokers) {
        this.Brokers = Brokers;
    }

    /**
     * Get 默认为none，支持snappy、gzip和lz4压缩，推荐snappy 
     * @return Compression 默认为none，支持snappy、gzip和lz4压缩，推荐snappy
     */
    public String getCompression() {
        return this.Compression;
    }

    /**
     * Set 默认为none，支持snappy、gzip和lz4压缩，推荐snappy
     * @param Compression 默认为none，支持snappy、gzip和lz4压缩，推荐snappy
     */
    public void setCompression(String Compression) {
        this.Compression = Compression;
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
     * Get 1-访问日志，2-攻击日志，默认为访问日志 
     * @return LogType 1-访问日志，2-攻击日志，默认为访问日志
     */
    public Long getLogType() {
        return this.LogType;
    }

    /**
     * Set 1-访问日志，2-攻击日志，默认为访问日志
     * @param LogType 1-访问日志，2-攻击日志，默认为访问日志
     */
    public void setLogType(Long LogType) {
        this.LogType = LogType;
    }

    /**
     * Get 主题名称，默认不传或者传空字符串，默认值为waf_post_access_log 
     * @return Topic 主题名称，默认不传或者传空字符串，默认值为waf_post_access_log
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set 主题名称，默认不传或者传空字符串，默认值为waf_post_access_log
     * @param Topic 主题名称，默认不传或者传空字符串，默认值为waf_post_access_log
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    /**
     * Get kafka集群的版本号 
     * @return KafkaVersion kafka集群的版本号
     */
    public String getKafkaVersion() {
        return this.KafkaVersion;
    }

    /**
     * Set kafka集群的版本号
     * @param KafkaVersion kafka集群的版本号
     */
    public void setKafkaVersion(String KafkaVersion) {
        this.KafkaVersion = KafkaVersion;
    }

    /**
     * Get 是否开启SASL校验，默认不开启，0-关闭，1-开启 
     * @return SASLEnable 是否开启SASL校验，默认不开启，0-关闭，1-开启
     */
    public Long getSASLEnable() {
        return this.SASLEnable;
    }

    /**
     * Set 是否开启SASL校验，默认不开启，0-关闭，1-开启
     * @param SASLEnable 是否开启SASL校验，默认不开启，0-关闭，1-开启
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
     * Get SASL密码 
     * @return SASLPassword SASL密码
     */
    public String getSASLPassword() {
        return this.SASLPassword;
    }

    /**
     * Set SASL密码
     * @param SASLPassword SASL密码
     */
    public void setSASLPassword(String SASLPassword) {
        this.SASLPassword = SASLPassword;
    }

    /**
     * Get 开启访问日志某些字段是否投递 
     * @return WriteConfig 开启访问日志某些字段是否投递
     */
    public FieldWriteConfig getWriteConfig() {
        return this.WriteConfig;
    }

    /**
     * Set 开启访问日志某些字段是否投递
     * @param WriteConfig 开启访问日志某些字段是否投递
     */
    public void setWriteConfig(FieldWriteConfig WriteConfig) {
        this.WriteConfig = WriteConfig;
    }

    public CreatePostCKafkaFlowRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreatePostCKafkaFlowRequest(CreatePostCKafkaFlowRequest source) {
        if (source.CKafkaRegion != null) {
            this.CKafkaRegion = new String(source.CKafkaRegion);
        }
        if (source.CKafkaID != null) {
            this.CKafkaID = new String(source.CKafkaID);
        }
        if (source.Brokers != null) {
            this.Brokers = new String(source.Brokers);
        }
        if (source.Compression != null) {
            this.Compression = new String(source.Compression);
        }
        if (source.VipType != null) {
            this.VipType = new Long(source.VipType);
        }
        if (source.LogType != null) {
            this.LogType = new Long(source.LogType);
        }
        if (source.Topic != null) {
            this.Topic = new String(source.Topic);
        }
        if (source.KafkaVersion != null) {
            this.KafkaVersion = new String(source.KafkaVersion);
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
        if (source.WriteConfig != null) {
            this.WriteConfig = new FieldWriteConfig(source.WriteConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CKafkaRegion", this.CKafkaRegion);
        this.setParamSimple(map, prefix + "CKafkaID", this.CKafkaID);
        this.setParamSimple(map, prefix + "Brokers", this.Brokers);
        this.setParamSimple(map, prefix + "Compression", this.Compression);
        this.setParamSimple(map, prefix + "VipType", this.VipType);
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamSimple(map, prefix + "KafkaVersion", this.KafkaVersion);
        this.setParamSimple(map, prefix + "SASLEnable", this.SASLEnable);
        this.setParamSimple(map, prefix + "SASLUser", this.SASLUser);
        this.setParamSimple(map, prefix + "SASLPassword", this.SASLPassword);
        this.setParamObj(map, prefix + "WriteConfig.", this.WriteConfig);

    }
}

