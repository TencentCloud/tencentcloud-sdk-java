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

    }
}

