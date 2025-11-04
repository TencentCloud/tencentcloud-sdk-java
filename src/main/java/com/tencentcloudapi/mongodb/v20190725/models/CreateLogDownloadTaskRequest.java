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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateLogDownloadTaskRequest extends AbstractModel {

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 节点名称
    */
    @SerializedName("NodeNames")
    @Expose
    private String [] NodeNames;

    /**
    * 日志类别
    */
    @SerializedName("LogComponents")
    @Expose
    private String [] LogComponents;

    /**
    * 日志等级
    */
    @SerializedName("LogLevels")
    @Expose
    private String [] LogLevels;

    /**
    * 日志ID
    */
    @SerializedName("LogIds")
    @Expose
    private String [] LogIds;

    /**
    * 日志连接信息
    */
    @SerializedName("LogConnections")
    @Expose
    private String [] LogConnections;

    /**
    * 日志详情过滤字段
    */
    @SerializedName("LogDetailParams")
    @Expose
    private String [] LogDetailParams;

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 开始时间 
     * @return StartTime 开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间
     * @param StartTime 开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间 
     * @return EndTime 结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
     * @param EndTime 结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 节点名称 
     * @return NodeNames 节点名称
     */
    public String [] getNodeNames() {
        return this.NodeNames;
    }

    /**
     * Set 节点名称
     * @param NodeNames 节点名称
     */
    public void setNodeNames(String [] NodeNames) {
        this.NodeNames = NodeNames;
    }

    /**
     * Get 日志类别 
     * @return LogComponents 日志类别
     */
    public String [] getLogComponents() {
        return this.LogComponents;
    }

    /**
     * Set 日志类别
     * @param LogComponents 日志类别
     */
    public void setLogComponents(String [] LogComponents) {
        this.LogComponents = LogComponents;
    }

    /**
     * Get 日志等级 
     * @return LogLevels 日志等级
     */
    public String [] getLogLevels() {
        return this.LogLevels;
    }

    /**
     * Set 日志等级
     * @param LogLevels 日志等级
     */
    public void setLogLevels(String [] LogLevels) {
        this.LogLevels = LogLevels;
    }

    /**
     * Get 日志ID 
     * @return LogIds 日志ID
     */
    public String [] getLogIds() {
        return this.LogIds;
    }

    /**
     * Set 日志ID
     * @param LogIds 日志ID
     */
    public void setLogIds(String [] LogIds) {
        this.LogIds = LogIds;
    }

    /**
     * Get 日志连接信息 
     * @return LogConnections 日志连接信息
     */
    public String [] getLogConnections() {
        return this.LogConnections;
    }

    /**
     * Set 日志连接信息
     * @param LogConnections 日志连接信息
     */
    public void setLogConnections(String [] LogConnections) {
        this.LogConnections = LogConnections;
    }

    /**
     * Get 日志详情过滤字段 
     * @return LogDetailParams 日志详情过滤字段
     */
    public String [] getLogDetailParams() {
        return this.LogDetailParams;
    }

    /**
     * Set 日志详情过滤字段
     * @param LogDetailParams 日志详情过滤字段
     */
    public void setLogDetailParams(String [] LogDetailParams) {
        this.LogDetailParams = LogDetailParams;
    }

    public CreateLogDownloadTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateLogDownloadTaskRequest(CreateLogDownloadTaskRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.NodeNames != null) {
            this.NodeNames = new String[source.NodeNames.length];
            for (int i = 0; i < source.NodeNames.length; i++) {
                this.NodeNames[i] = new String(source.NodeNames[i]);
            }
        }
        if (source.LogComponents != null) {
            this.LogComponents = new String[source.LogComponents.length];
            for (int i = 0; i < source.LogComponents.length; i++) {
                this.LogComponents[i] = new String(source.LogComponents[i]);
            }
        }
        if (source.LogLevels != null) {
            this.LogLevels = new String[source.LogLevels.length];
            for (int i = 0; i < source.LogLevels.length; i++) {
                this.LogLevels[i] = new String(source.LogLevels[i]);
            }
        }
        if (source.LogIds != null) {
            this.LogIds = new String[source.LogIds.length];
            for (int i = 0; i < source.LogIds.length; i++) {
                this.LogIds[i] = new String(source.LogIds[i]);
            }
        }
        if (source.LogConnections != null) {
            this.LogConnections = new String[source.LogConnections.length];
            for (int i = 0; i < source.LogConnections.length; i++) {
                this.LogConnections[i] = new String(source.LogConnections[i]);
            }
        }
        if (source.LogDetailParams != null) {
            this.LogDetailParams = new String[source.LogDetailParams.length];
            for (int i = 0; i < source.LogDetailParams.length; i++) {
                this.LogDetailParams[i] = new String(source.LogDetailParams[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "NodeNames.", this.NodeNames);
        this.setParamArraySimple(map, prefix + "LogComponents.", this.LogComponents);
        this.setParamArraySimple(map, prefix + "LogLevels.", this.LogLevels);
        this.setParamArraySimple(map, prefix + "LogIds.", this.LogIds);
        this.setParamArraySimple(map, prefix + "LogConnections.", this.LogConnections);
        this.setParamArraySimple(map, prefix + "LogDetailParams.", this.LogDetailParams);

    }
}

