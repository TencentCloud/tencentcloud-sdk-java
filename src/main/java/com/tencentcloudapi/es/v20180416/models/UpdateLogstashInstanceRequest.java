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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateLogstashInstanceRequest extends AbstractModel{

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例节点数量
    */
    @SerializedName("NodeNum")
    @Expose
    private Long NodeNum;

    /**
    * 实例YML配置
    */
    @SerializedName("YMLConfig")
    @Expose
    private String YMLConfig;

    /**
    * 实例绑定的ES集群信息
    */
    @SerializedName("BindedES")
    @Expose
    private LogstashBindedES BindedES;

    /**
    * 实例名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 扩展文件列表
    */
    @SerializedName("ExtendedFiles")
    @Expose
    private LogstashExtendedFile [] ExtendedFiles;

    /**
    * 实例规格
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * 节点磁盘容量
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * 可维护时间段
    */
    @SerializedName("OperationDuration")
    @Expose
    private OperationDurationUpdated OperationDuration;

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
     * Get 实例节点数量 
     * @return NodeNum 实例节点数量
     */
    public Long getNodeNum() {
        return this.NodeNum;
    }

    /**
     * Set 实例节点数量
     * @param NodeNum 实例节点数量
     */
    public void setNodeNum(Long NodeNum) {
        this.NodeNum = NodeNum;
    }

    /**
     * Get 实例YML配置 
     * @return YMLConfig 实例YML配置
     */
    public String getYMLConfig() {
        return this.YMLConfig;
    }

    /**
     * Set 实例YML配置
     * @param YMLConfig 实例YML配置
     */
    public void setYMLConfig(String YMLConfig) {
        this.YMLConfig = YMLConfig;
    }

    /**
     * Get 实例绑定的ES集群信息 
     * @return BindedES 实例绑定的ES集群信息
     */
    public LogstashBindedES getBindedES() {
        return this.BindedES;
    }

    /**
     * Set 实例绑定的ES集群信息
     * @param BindedES 实例绑定的ES集群信息
     */
    public void setBindedES(LogstashBindedES BindedES) {
        this.BindedES = BindedES;
    }

    /**
     * Get 实例名称 
     * @return InstanceName 实例名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称
     * @param InstanceName 实例名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 扩展文件列表 
     * @return ExtendedFiles 扩展文件列表
     */
    public LogstashExtendedFile [] getExtendedFiles() {
        return this.ExtendedFiles;
    }

    /**
     * Set 扩展文件列表
     * @param ExtendedFiles 扩展文件列表
     */
    public void setExtendedFiles(LogstashExtendedFile [] ExtendedFiles) {
        this.ExtendedFiles = ExtendedFiles;
    }

    /**
     * Get 实例规格 
     * @return NodeType 实例规格
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set 实例规格
     * @param NodeType 实例规格
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get 节点磁盘容量 
     * @return DiskSize 节点磁盘容量
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set 节点磁盘容量
     * @param DiskSize 节点磁盘容量
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get 可维护时间段 
     * @return OperationDuration 可维护时间段
     */
    public OperationDurationUpdated getOperationDuration() {
        return this.OperationDuration;
    }

    /**
     * Set 可维护时间段
     * @param OperationDuration 可维护时间段
     */
    public void setOperationDuration(OperationDurationUpdated OperationDuration) {
        this.OperationDuration = OperationDuration;
    }

    public UpdateLogstashInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateLogstashInstanceRequest(UpdateLogstashInstanceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.NodeNum != null) {
            this.NodeNum = new Long(source.NodeNum);
        }
        if (source.YMLConfig != null) {
            this.YMLConfig = new String(source.YMLConfig);
        }
        if (source.BindedES != null) {
            this.BindedES = new LogstashBindedES(source.BindedES);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.ExtendedFiles != null) {
            this.ExtendedFiles = new LogstashExtendedFile[source.ExtendedFiles.length];
            for (int i = 0; i < source.ExtendedFiles.length; i++) {
                this.ExtendedFiles[i] = new LogstashExtendedFile(source.ExtendedFiles[i]);
            }
        }
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.OperationDuration != null) {
            this.OperationDuration = new OperationDurationUpdated(source.OperationDuration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "NodeNum", this.NodeNum);
        this.setParamSimple(map, prefix + "YMLConfig", this.YMLConfig);
        this.setParamObj(map, prefix + "BindedES.", this.BindedES);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamArrayObj(map, prefix + "ExtendedFiles.", this.ExtendedFiles);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamObj(map, prefix + "OperationDuration.", this.OperationDuration);

    }
}

