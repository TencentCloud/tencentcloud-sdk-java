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

public class PostCLSFlowInfo extends AbstractModel {

    /**
    * <p>投递流唯一ID</p>
    */
    @SerializedName("FlowId")
    @Expose
    private Long FlowId;

    /**
    * <p>1-访问日志 2-攻击日志</p>
    */
    @SerializedName("LogType")
    @Expose
    private Long LogType;

    /**
    * <p>状态 0-为关闭 1-为启用</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>CLS所在区域</p>
    */
    @SerializedName("CLSRegion")
    @Expose
    private String CLSRegion;

    /**
    * <p>CLS日志集合名称</p>
    */
    @SerializedName("LogsetName")
    @Expose
    private String LogsetName;

    /**
    * <p>CLS日志集合ID</p>
    */
    @SerializedName("LogsetID")
    @Expose
    private String LogsetID;

    /**
    * <p>CLS日志主题名称</p>
    */
    @SerializedName("LogTopicName")
    @Expose
    private String LogTopicName;

    /**
    * <p>CLS日志集合ID</p>
    */
    @SerializedName("LogTopicID")
    @Expose
    private String LogTopicID;

    /**
    * <p>写配置</p>
    */
    @SerializedName("WriteConfig")
    @Expose
    private FieldWriteConfig WriteConfig;

    /**
     * Get <p>投递流唯一ID</p> 
     * @return FlowId <p>投递流唯一ID</p>
     */
    public Long getFlowId() {
        return this.FlowId;
    }

    /**
     * Set <p>投递流唯一ID</p>
     * @param FlowId <p>投递流唯一ID</p>
     */
    public void setFlowId(Long FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get <p>1-访问日志 2-攻击日志</p> 
     * @return LogType <p>1-访问日志 2-攻击日志</p>
     */
    public Long getLogType() {
        return this.LogType;
    }

    /**
     * Set <p>1-访问日志 2-攻击日志</p>
     * @param LogType <p>1-访问日志 2-攻击日志</p>
     */
    public void setLogType(Long LogType) {
        this.LogType = LogType;
    }

    /**
     * Get <p>状态 0-为关闭 1-为启用</p> 
     * @return Status <p>状态 0-为关闭 1-为启用</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>状态 0-为关闭 1-为启用</p>
     * @param Status <p>状态 0-为关闭 1-为启用</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>CLS所在区域</p> 
     * @return CLSRegion <p>CLS所在区域</p>
     */
    public String getCLSRegion() {
        return this.CLSRegion;
    }

    /**
     * Set <p>CLS所在区域</p>
     * @param CLSRegion <p>CLS所在区域</p>
     */
    public void setCLSRegion(String CLSRegion) {
        this.CLSRegion = CLSRegion;
    }

    /**
     * Get <p>CLS日志集合名称</p> 
     * @return LogsetName <p>CLS日志集合名称</p>
     */
    public String getLogsetName() {
        return this.LogsetName;
    }

    /**
     * Set <p>CLS日志集合名称</p>
     * @param LogsetName <p>CLS日志集合名称</p>
     */
    public void setLogsetName(String LogsetName) {
        this.LogsetName = LogsetName;
    }

    /**
     * Get <p>CLS日志集合ID</p> 
     * @return LogsetID <p>CLS日志集合ID</p>
     */
    public String getLogsetID() {
        return this.LogsetID;
    }

    /**
     * Set <p>CLS日志集合ID</p>
     * @param LogsetID <p>CLS日志集合ID</p>
     */
    public void setLogsetID(String LogsetID) {
        this.LogsetID = LogsetID;
    }

    /**
     * Get <p>CLS日志主题名称</p> 
     * @return LogTopicName <p>CLS日志主题名称</p>
     */
    public String getLogTopicName() {
        return this.LogTopicName;
    }

    /**
     * Set <p>CLS日志主题名称</p>
     * @param LogTopicName <p>CLS日志主题名称</p>
     */
    public void setLogTopicName(String LogTopicName) {
        this.LogTopicName = LogTopicName;
    }

    /**
     * Get <p>CLS日志集合ID</p> 
     * @return LogTopicID <p>CLS日志集合ID</p>
     */
    public String getLogTopicID() {
        return this.LogTopicID;
    }

    /**
     * Set <p>CLS日志集合ID</p>
     * @param LogTopicID <p>CLS日志集合ID</p>
     */
    public void setLogTopicID(String LogTopicID) {
        this.LogTopicID = LogTopicID;
    }

    /**
     * Get <p>写配置</p> 
     * @return WriteConfig <p>写配置</p>
     */
    public FieldWriteConfig getWriteConfig() {
        return this.WriteConfig;
    }

    /**
     * Set <p>写配置</p>
     * @param WriteConfig <p>写配置</p>
     */
    public void setWriteConfig(FieldWriteConfig WriteConfig) {
        this.WriteConfig = WriteConfig;
    }

    public PostCLSFlowInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PostCLSFlowInfo(PostCLSFlowInfo source) {
        if (source.FlowId != null) {
            this.FlowId = new Long(source.FlowId);
        }
        if (source.LogType != null) {
            this.LogType = new Long(source.LogType);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CLSRegion != null) {
            this.CLSRegion = new String(source.CLSRegion);
        }
        if (source.LogsetName != null) {
            this.LogsetName = new String(source.LogsetName);
        }
        if (source.LogsetID != null) {
            this.LogsetID = new String(source.LogsetID);
        }
        if (source.LogTopicName != null) {
            this.LogTopicName = new String(source.LogTopicName);
        }
        if (source.LogTopicID != null) {
            this.LogTopicID = new String(source.LogTopicID);
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
        this.setParamSimple(map, prefix + "CLSRegion", this.CLSRegion);
        this.setParamSimple(map, prefix + "LogsetName", this.LogsetName);
        this.setParamSimple(map, prefix + "LogsetID", this.LogsetID);
        this.setParamSimple(map, prefix + "LogTopicName", this.LogTopicName);
        this.setParamSimple(map, prefix + "LogTopicID", this.LogTopicID);
        this.setParamObj(map, prefix + "WriteConfig.", this.WriteConfig);

    }
}

