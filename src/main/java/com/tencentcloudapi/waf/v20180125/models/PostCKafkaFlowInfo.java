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

    }
}

