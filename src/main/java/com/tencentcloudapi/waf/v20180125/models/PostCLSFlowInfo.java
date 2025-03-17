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

public class PostCLSFlowInfo extends AbstractModel {

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
    * CLS所在区域
    */
    @SerializedName("CLSRegion")
    @Expose
    private String CLSRegion;

    /**
    * CLS日志集合名称
    */
    @SerializedName("LogsetName")
    @Expose
    private String LogsetName;

    /**
    * CLS日志集合ID
    */
    @SerializedName("LogsetID")
    @Expose
    private String LogsetID;

    /**
    * CLS日志主题名称
    */
    @SerializedName("LogTopicName")
    @Expose
    private String LogTopicName;

    /**
    * CLS日志集合ID
    */
    @SerializedName("LogTopicID")
    @Expose
    private String LogTopicID;

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
     * Get CLS所在区域 
     * @return CLSRegion CLS所在区域
     */
    public String getCLSRegion() {
        return this.CLSRegion;
    }

    /**
     * Set CLS所在区域
     * @param CLSRegion CLS所在区域
     */
    public void setCLSRegion(String CLSRegion) {
        this.CLSRegion = CLSRegion;
    }

    /**
     * Get CLS日志集合名称 
     * @return LogsetName CLS日志集合名称
     */
    public String getLogsetName() {
        return this.LogsetName;
    }

    /**
     * Set CLS日志集合名称
     * @param LogsetName CLS日志集合名称
     */
    public void setLogsetName(String LogsetName) {
        this.LogsetName = LogsetName;
    }

    /**
     * Get CLS日志集合ID 
     * @return LogsetID CLS日志集合ID
     */
    public String getLogsetID() {
        return this.LogsetID;
    }

    /**
     * Set CLS日志集合ID
     * @param LogsetID CLS日志集合ID
     */
    public void setLogsetID(String LogsetID) {
        this.LogsetID = LogsetID;
    }

    /**
     * Get CLS日志主题名称 
     * @return LogTopicName CLS日志主题名称
     */
    public String getLogTopicName() {
        return this.LogTopicName;
    }

    /**
     * Set CLS日志主题名称
     * @param LogTopicName CLS日志主题名称
     */
    public void setLogTopicName(String LogTopicName) {
        this.LogTopicName = LogTopicName;
    }

    /**
     * Get CLS日志集合ID 
     * @return LogTopicID CLS日志集合ID
     */
    public String getLogTopicID() {
        return this.LogTopicID;
    }

    /**
     * Set CLS日志集合ID
     * @param LogTopicID CLS日志集合ID
     */
    public void setLogTopicID(String LogTopicID) {
        this.LogTopicID = LogTopicID;
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

    }
}

