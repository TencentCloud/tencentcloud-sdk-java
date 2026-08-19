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
    * <p>数据流动管理 ID</p>
    */
    @SerializedName("DataFlowId")
    @Expose
    private String DataFlowId;

    /**
    * <p>数据流动名称</p>
    */
    @SerializedName("DataFlowName")
    @Expose
    private String DataFlowName;

    /**
    * <p>源端数据类型</p>
    */
    @SerializedName("SourceStorageType")
    @Expose
    private String SourceStorageType;

    /**
    * <p>源端存储地址</p>
    */
    @SerializedName("SourceStorageAddress")
    @Expose
    private String SourceStorageAddress;

    /**
    * <p>源端路径</p>
    */
    @SerializedName("SourcePath")
    @Expose
    private String SourcePath;

    /**
    * <p>设置数据流动时指定的文件系统内目标路径，必须以 /cfs/ 开头，代表文件存储实例内部的逻辑路径，而非本地挂载点路径。<br>示例：</p><ul><li>若挂载的是CFS根目录 /，需将对象存储上的源端目录与挂载路径下的 test1/test2 建立映射关系，则入参值为 /cfs/test1/test2</li><li>若挂载的是CFS子目录 /subdir，需将对象存储上的源端目录与挂载路径下的 test1/test2 建立映射关系，则入参值为 /cfs/subdir/test1/test2</li></ul>
    */
    @SerializedName("TargetPath")
    @Expose
    private String TargetPath;

    /**
    * <p>available：已生效<br>pending：配置中<br>unavailable：失效<br>deleting：删除中</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreationTime")
    @Expose
    private String CreationTime;

    /**
    * <p>文件系统 ID</p>
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * <p>0：不开启自动更新</p><p>1：开启自动更新</p>
    */
    @SerializedName("AutoRefresh")
    @Expose
    private Long AutoRefresh;

    /**
    * <p>KafkaConsumer 消费时使用的Topic参数</p>
    */
    @SerializedName("UserKafkaTopic")
    @Expose
    private String UserKafkaTopic;

    /**
    * <p>服务地址</p>
    */
    @SerializedName("ServerAddr")
    @Expose
    private String ServerAddr;

    /**
    * <p>Kafka消费用户名</p>
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * <p>自动刷新的状态，available：已生效<br>pending：配置中<br>unavailable：失效</p>
    */
    @SerializedName("AutoRefreshStatus")
    @Expose
    private String AutoRefreshStatus;

    /**
    * <p>自动刷新开启时间</p>
    */
    @SerializedName("AutoRefreshTime")
    @Expose
    private String AutoRefreshTime;

    /**
     * Get <p>数据流动管理 ID</p> 
     * @return DataFlowId <p>数据流动管理 ID</p>
     */
    public String getDataFlowId() {
        return this.DataFlowId;
    }

    /**
     * Set <p>数据流动管理 ID</p>
     * @param DataFlowId <p>数据流动管理 ID</p>
     */
    public void setDataFlowId(String DataFlowId) {
        this.DataFlowId = DataFlowId;
    }

    /**
     * Get <p>数据流动名称</p> 
     * @return DataFlowName <p>数据流动名称</p>
     */
    public String getDataFlowName() {
        return this.DataFlowName;
    }

    /**
     * Set <p>数据流动名称</p>
     * @param DataFlowName <p>数据流动名称</p>
     */
    public void setDataFlowName(String DataFlowName) {
        this.DataFlowName = DataFlowName;
    }

    /**
     * Get <p>源端数据类型</p> 
     * @return SourceStorageType <p>源端数据类型</p>
     */
    public String getSourceStorageType() {
        return this.SourceStorageType;
    }

    /**
     * Set <p>源端数据类型</p>
     * @param SourceStorageType <p>源端数据类型</p>
     */
    public void setSourceStorageType(String SourceStorageType) {
        this.SourceStorageType = SourceStorageType;
    }

    /**
     * Get <p>源端存储地址</p> 
     * @return SourceStorageAddress <p>源端存储地址</p>
     */
    public String getSourceStorageAddress() {
        return this.SourceStorageAddress;
    }

    /**
     * Set <p>源端存储地址</p>
     * @param SourceStorageAddress <p>源端存储地址</p>
     */
    public void setSourceStorageAddress(String SourceStorageAddress) {
        this.SourceStorageAddress = SourceStorageAddress;
    }

    /**
     * Get <p>源端路径</p> 
     * @return SourcePath <p>源端路径</p>
     */
    public String getSourcePath() {
        return this.SourcePath;
    }

    /**
     * Set <p>源端路径</p>
     * @param SourcePath <p>源端路径</p>
     */
    public void setSourcePath(String SourcePath) {
        this.SourcePath = SourcePath;
    }

    /**
     * Get <p>设置数据流动时指定的文件系统内目标路径，必须以 /cfs/ 开头，代表文件存储实例内部的逻辑路径，而非本地挂载点路径。<br>示例：</p><ul><li>若挂载的是CFS根目录 /，需将对象存储上的源端目录与挂载路径下的 test1/test2 建立映射关系，则入参值为 /cfs/test1/test2</li><li>若挂载的是CFS子目录 /subdir，需将对象存储上的源端目录与挂载路径下的 test1/test2 建立映射关系，则入参值为 /cfs/subdir/test1/test2</li></ul> 
     * @return TargetPath <p>设置数据流动时指定的文件系统内目标路径，必须以 /cfs/ 开头，代表文件存储实例内部的逻辑路径，而非本地挂载点路径。<br>示例：</p><ul><li>若挂载的是CFS根目录 /，需将对象存储上的源端目录与挂载路径下的 test1/test2 建立映射关系，则入参值为 /cfs/test1/test2</li><li>若挂载的是CFS子目录 /subdir，需将对象存储上的源端目录与挂载路径下的 test1/test2 建立映射关系，则入参值为 /cfs/subdir/test1/test2</li></ul>
     */
    public String getTargetPath() {
        return this.TargetPath;
    }

    /**
     * Set <p>设置数据流动时指定的文件系统内目标路径，必须以 /cfs/ 开头，代表文件存储实例内部的逻辑路径，而非本地挂载点路径。<br>示例：</p><ul><li>若挂载的是CFS根目录 /，需将对象存储上的源端目录与挂载路径下的 test1/test2 建立映射关系，则入参值为 /cfs/test1/test2</li><li>若挂载的是CFS子目录 /subdir，需将对象存储上的源端目录与挂载路径下的 test1/test2 建立映射关系，则入参值为 /cfs/subdir/test1/test2</li></ul>
     * @param TargetPath <p>设置数据流动时指定的文件系统内目标路径，必须以 /cfs/ 开头，代表文件存储实例内部的逻辑路径，而非本地挂载点路径。<br>示例：</p><ul><li>若挂载的是CFS根目录 /，需将对象存储上的源端目录与挂载路径下的 test1/test2 建立映射关系，则入参值为 /cfs/test1/test2</li><li>若挂载的是CFS子目录 /subdir，需将对象存储上的源端目录与挂载路径下的 test1/test2 建立映射关系，则入参值为 /cfs/subdir/test1/test2</li></ul>
     */
    public void setTargetPath(String TargetPath) {
        this.TargetPath = TargetPath;
    }

    /**
     * Get <p>available：已生效<br>pending：配置中<br>unavailable：失效<br>deleting：删除中</p> 
     * @return Status <p>available：已生效<br>pending：配置中<br>unavailable：失效<br>deleting：删除中</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>available：已生效<br>pending：配置中<br>unavailable：失效<br>deleting：删除中</p>
     * @param Status <p>available：已生效<br>pending：配置中<br>unavailable：失效<br>deleting：删除中</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreationTime <p>创建时间</p>
     */
    public String getCreationTime() {
        return this.CreationTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreationTime <p>创建时间</p>
     */
    public void setCreationTime(String CreationTime) {
        this.CreationTime = CreationTime;
    }

    /**
     * Get <p>文件系统 ID</p> 
     * @return FileSystemId <p>文件系统 ID</p>
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * Set <p>文件系统 ID</p>
     * @param FileSystemId <p>文件系统 ID</p>
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
    }

    /**
     * Get <p>0：不开启自动更新</p><p>1：开启自动更新</p> 
     * @return AutoRefresh <p>0：不开启自动更新</p><p>1：开启自动更新</p>
     */
    public Long getAutoRefresh() {
        return this.AutoRefresh;
    }

    /**
     * Set <p>0：不开启自动更新</p><p>1：开启自动更新</p>
     * @param AutoRefresh <p>0：不开启自动更新</p><p>1：开启自动更新</p>
     */
    public void setAutoRefresh(Long AutoRefresh) {
        this.AutoRefresh = AutoRefresh;
    }

    /**
     * Get <p>KafkaConsumer 消费时使用的Topic参数</p> 
     * @return UserKafkaTopic <p>KafkaConsumer 消费时使用的Topic参数</p>
     */
    public String getUserKafkaTopic() {
        return this.UserKafkaTopic;
    }

    /**
     * Set <p>KafkaConsumer 消费时使用的Topic参数</p>
     * @param UserKafkaTopic <p>KafkaConsumer 消费时使用的Topic参数</p>
     */
    public void setUserKafkaTopic(String UserKafkaTopic) {
        this.UserKafkaTopic = UserKafkaTopic;
    }

    /**
     * Get <p>服务地址</p> 
     * @return ServerAddr <p>服务地址</p>
     */
    public String getServerAddr() {
        return this.ServerAddr;
    }

    /**
     * Set <p>服务地址</p>
     * @param ServerAddr <p>服务地址</p>
     */
    public void setServerAddr(String ServerAddr) {
        this.ServerAddr = ServerAddr;
    }

    /**
     * Get <p>Kafka消费用户名</p> 
     * @return UserName <p>Kafka消费用户名</p>
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set <p>Kafka消费用户名</p>
     * @param UserName <p>Kafka消费用户名</p>
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get <p>自动刷新的状态，available：已生效<br>pending：配置中<br>unavailable：失效</p> 
     * @return AutoRefreshStatus <p>自动刷新的状态，available：已生效<br>pending：配置中<br>unavailable：失效</p>
     */
    public String getAutoRefreshStatus() {
        return this.AutoRefreshStatus;
    }

    /**
     * Set <p>自动刷新的状态，available：已生效<br>pending：配置中<br>unavailable：失效</p>
     * @param AutoRefreshStatus <p>自动刷新的状态，available：已生效<br>pending：配置中<br>unavailable：失效</p>
     */
    public void setAutoRefreshStatus(String AutoRefreshStatus) {
        this.AutoRefreshStatus = AutoRefreshStatus;
    }

    /**
     * Get <p>自动刷新开启时间</p> 
     * @return AutoRefreshTime <p>自动刷新开启时间</p>
     */
    public String getAutoRefreshTime() {
        return this.AutoRefreshTime;
    }

    /**
     * Set <p>自动刷新开启时间</p>
     * @param AutoRefreshTime <p>自动刷新开启时间</p>
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

