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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataFlowInfo extends AbstractModel {

    /**
    * 数据流动管理 ID
    */
    @SerializedName("DataFlowId")
    @Expose
    private String DataFlowId;

    /**
    * 数据流动名称
    */
    @SerializedName("DataFlowName")
    @Expose
    private String DataFlowName;

    /**
    * 源端数据类型
    */
    @SerializedName("SourceStorageType")
    @Expose
    private String SourceStorageType;

    /**
    * 源端存储地址
    */
    @SerializedName("SourceStorageAddress")
    @Expose
    private String SourceStorageAddress;

    /**
    * 源端路径
    */
    @SerializedName("SourcePath")
    @Expose
    private String SourcePath;

    /**
    * 目录路径
    */
    @SerializedName("TargetPath")
    @Expose
    private String TargetPath;

    /**
    * available：已生效
pending：配置中
unavailable：失效
deleting：删除中
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 创建时间
    */
    @SerializedName("CreationTime")
    @Expose
    private String CreationTime;

    /**
    * 文件系统 ID
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * 0：不开启自动更新

1：开启自动更新
    */
    @SerializedName("AutoRefresh")
    @Expose
    private Long AutoRefresh;

    /**
    * KafkaConsumer 消费时使用的Topic参数
    */
    @SerializedName("UserKafkaTopic")
    @Expose
    private String UserKafkaTopic;

    /**
    * 服务地址
    */
    @SerializedName("ServerAddr")
    @Expose
    private String ServerAddr;

    /**
    * Kafka消费用户名
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 自动刷新的状态，available：已生效
pending：配置中
unavailable：失效
    */
    @SerializedName("AutoRefreshStatus")
    @Expose
    private String AutoRefreshStatus;

    /**
    * 自动刷新开启时间
    */
    @SerializedName("AutoRefreshTime")
    @Expose
    private String AutoRefreshTime;

    /**
     * Get 数据流动管理 ID 
     * @return DataFlowId 数据流动管理 ID
     */
    public String getDataFlowId() {
        return this.DataFlowId;
    }

    /**
     * Set 数据流动管理 ID
     * @param DataFlowId 数据流动管理 ID
     */
    public void setDataFlowId(String DataFlowId) {
        this.DataFlowId = DataFlowId;
    }

    /**
     * Get 数据流动名称 
     * @return DataFlowName 数据流动名称
     */
    public String getDataFlowName() {
        return this.DataFlowName;
    }

    /**
     * Set 数据流动名称
     * @param DataFlowName 数据流动名称
     */
    public void setDataFlowName(String DataFlowName) {
        this.DataFlowName = DataFlowName;
    }

    /**
     * Get 源端数据类型 
     * @return SourceStorageType 源端数据类型
     */
    public String getSourceStorageType() {
        return this.SourceStorageType;
    }

    /**
     * Set 源端数据类型
     * @param SourceStorageType 源端数据类型
     */
    public void setSourceStorageType(String SourceStorageType) {
        this.SourceStorageType = SourceStorageType;
    }

    /**
     * Get 源端存储地址 
     * @return SourceStorageAddress 源端存储地址
     */
    public String getSourceStorageAddress() {
        return this.SourceStorageAddress;
    }

    /**
     * Set 源端存储地址
     * @param SourceStorageAddress 源端存储地址
     */
    public void setSourceStorageAddress(String SourceStorageAddress) {
        this.SourceStorageAddress = SourceStorageAddress;
    }

    /**
     * Get 源端路径 
     * @return SourcePath 源端路径
     */
    public String getSourcePath() {
        return this.SourcePath;
    }

    /**
     * Set 源端路径
     * @param SourcePath 源端路径
     */
    public void setSourcePath(String SourcePath) {
        this.SourcePath = SourcePath;
    }

    /**
     * Get 目录路径 
     * @return TargetPath 目录路径
     */
    public String getTargetPath() {
        return this.TargetPath;
    }

    /**
     * Set 目录路径
     * @param TargetPath 目录路径
     */
    public void setTargetPath(String TargetPath) {
        this.TargetPath = TargetPath;
    }

    /**
     * Get available：已生效
pending：配置中
unavailable：失效
deleting：删除中 
     * @return Status available：已生效
pending：配置中
unavailable：失效
deleting：删除中
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set available：已生效
pending：配置中
unavailable：失效
deleting：删除中
     * @param Status available：已生效
pending：配置中
unavailable：失效
deleting：删除中
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 创建时间 
     * @return CreationTime 创建时间
     */
    public String getCreationTime() {
        return this.CreationTime;
    }

    /**
     * Set 创建时间
     * @param CreationTime 创建时间
     */
    public void setCreationTime(String CreationTime) {
        this.CreationTime = CreationTime;
    }

    /**
     * Get 文件系统 ID 
     * @return FileSystemId 文件系统 ID
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * Set 文件系统 ID
     * @param FileSystemId 文件系统 ID
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
    }

    /**
     * Get 0：不开启自动更新

1：开启自动更新 
     * @return AutoRefresh 0：不开启自动更新

1：开启自动更新
     */
    public Long getAutoRefresh() {
        return this.AutoRefresh;
    }

    /**
     * Set 0：不开启自动更新

1：开启自动更新
     * @param AutoRefresh 0：不开启自动更新

1：开启自动更新
     */
    public void setAutoRefresh(Long AutoRefresh) {
        this.AutoRefresh = AutoRefresh;
    }

    /**
     * Get KafkaConsumer 消费时使用的Topic参数 
     * @return UserKafkaTopic KafkaConsumer 消费时使用的Topic参数
     */
    public String getUserKafkaTopic() {
        return this.UserKafkaTopic;
    }

    /**
     * Set KafkaConsumer 消费时使用的Topic参数
     * @param UserKafkaTopic KafkaConsumer 消费时使用的Topic参数
     */
    public void setUserKafkaTopic(String UserKafkaTopic) {
        this.UserKafkaTopic = UserKafkaTopic;
    }

    /**
     * Get 服务地址 
     * @return ServerAddr 服务地址
     */
    public String getServerAddr() {
        return this.ServerAddr;
    }

    /**
     * Set 服务地址
     * @param ServerAddr 服务地址
     */
    public void setServerAddr(String ServerAddr) {
        this.ServerAddr = ServerAddr;
    }

    /**
     * Get Kafka消费用户名 
     * @return UserName Kafka消费用户名
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Kafka消费用户名
     * @param UserName Kafka消费用户名
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 自动刷新的状态，available：已生效
pending：配置中
unavailable：失效 
     * @return AutoRefreshStatus 自动刷新的状态，available：已生效
pending：配置中
unavailable：失效
     */
    public String getAutoRefreshStatus() {
        return this.AutoRefreshStatus;
    }

    /**
     * Set 自动刷新的状态，available：已生效
pending：配置中
unavailable：失效
     * @param AutoRefreshStatus 自动刷新的状态，available：已生效
pending：配置中
unavailable：失效
     */
    public void setAutoRefreshStatus(String AutoRefreshStatus) {
        this.AutoRefreshStatus = AutoRefreshStatus;
    }

    /**
     * Get 自动刷新开启时间 
     * @return AutoRefreshTime 自动刷新开启时间
     */
    public String getAutoRefreshTime() {
        return this.AutoRefreshTime;
    }

    /**
     * Set 自动刷新开启时间
     * @param AutoRefreshTime 自动刷新开启时间
     */
    public void setAutoRefreshTime(String AutoRefreshTime) {
        this.AutoRefreshTime = AutoRefreshTime;
    }

    public DataFlowInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataFlowInfo(DataFlowInfo source) {
        if (source.DataFlowId != null) {
            this.DataFlowId = new String(source.DataFlowId);
        }
        if (source.DataFlowName != null) {
            this.DataFlowName = new String(source.DataFlowName);
        }
        if (source.SourceStorageType != null) {
            this.SourceStorageType = new String(source.SourceStorageType);
        }
        if (source.SourceStorageAddress != null) {
            this.SourceStorageAddress = new String(source.SourceStorageAddress);
        }
        if (source.SourcePath != null) {
            this.SourcePath = new String(source.SourcePath);
        }
        if (source.TargetPath != null) {
            this.TargetPath = new String(source.TargetPath);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CreationTime != null) {
            this.CreationTime = new String(source.CreationTime);
        }
        if (source.FileSystemId != null) {
            this.FileSystemId = new String(source.FileSystemId);
        }
        if (source.AutoRefresh != null) {
            this.AutoRefresh = new Long(source.AutoRefresh);
        }
        if (source.UserKafkaTopic != null) {
            this.UserKafkaTopic = new String(source.UserKafkaTopic);
        }
        if (source.ServerAddr != null) {
            this.ServerAddr = new String(source.ServerAddr);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.AutoRefreshStatus != null) {
            this.AutoRefreshStatus = new String(source.AutoRefreshStatus);
        }
        if (source.AutoRefreshTime != null) {
            this.AutoRefreshTime = new String(source.AutoRefreshTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DataFlowId", this.DataFlowId);
        this.setParamSimple(map, prefix + "DataFlowName", this.DataFlowName);
        this.setParamSimple(map, prefix + "SourceStorageType", this.SourceStorageType);
        this.setParamSimple(map, prefix + "SourceStorageAddress", this.SourceStorageAddress);
        this.setParamSimple(map, prefix + "SourcePath", this.SourcePath);
        this.setParamSimple(map, prefix + "TargetPath", this.TargetPath);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreationTime", this.CreationTime);
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);
        this.setParamSimple(map, prefix + "AutoRefresh", this.AutoRefresh);
        this.setParamSimple(map, prefix + "UserKafkaTopic", this.UserKafkaTopic);
        this.setParamSimple(map, prefix + "ServerAddr", this.ServerAddr);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "AutoRefreshStatus", this.AutoRefreshStatus);
        this.setParamSimple(map, prefix + "AutoRefreshTime", this.AutoRefreshTime);

    }
}

