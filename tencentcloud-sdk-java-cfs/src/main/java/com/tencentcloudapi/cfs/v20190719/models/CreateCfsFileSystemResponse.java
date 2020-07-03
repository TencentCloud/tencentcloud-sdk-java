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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCfsFileSystemResponse extends AbstractModel{

    /**
    * 文件系统创建时间
    */
    @SerializedName("CreationTime")
    @Expose
    private String CreationTime;

    /**
    * 用户自定义文件系统名称
    */
    @SerializedName("CreationToken")
    @Expose
    private String CreationToken;

    /**
    * 文件系统 ID
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * 文件系统状态
    */
    @SerializedName("LifeCycleState")
    @Expose
    private String LifeCycleState;

    /**
    * 文件系统已使用容量大小
    */
    @SerializedName("SizeByte")
    @Expose
    private Long SizeByte;

    /**
    * 可用区 ID
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * 用户自定义文件系统名称
    */
    @SerializedName("FsName")
    @Expose
    private String FsName;

    /**
    * 文件系统是否加密
    */
    @SerializedName("Encrypted")
    @Expose
    private Boolean Encrypted;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 文件系统创建时间 
     * @return CreationTime 文件系统创建时间
     */
    public String getCreationTime() {
        return this.CreationTime;
    }

    /**
     * Set 文件系统创建时间
     * @param CreationTime 文件系统创建时间
     */
    public void setCreationTime(String CreationTime) {
        this.CreationTime = CreationTime;
    }

    /**
     * Get 用户自定义文件系统名称 
     * @return CreationToken 用户自定义文件系统名称
     */
    public String getCreationToken() {
        return this.CreationToken;
    }

    /**
     * Set 用户自定义文件系统名称
     * @param CreationToken 用户自定义文件系统名称
     */
    public void setCreationToken(String CreationToken) {
        this.CreationToken = CreationToken;
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
     * Get 文件系统状态 
     * @return LifeCycleState 文件系统状态
     */
    public String getLifeCycleState() {
        return this.LifeCycleState;
    }

    /**
     * Set 文件系统状态
     * @param LifeCycleState 文件系统状态
     */
    public void setLifeCycleState(String LifeCycleState) {
        this.LifeCycleState = LifeCycleState;
    }

    /**
     * Get 文件系统已使用容量大小 
     * @return SizeByte 文件系统已使用容量大小
     */
    public Long getSizeByte() {
        return this.SizeByte;
    }

    /**
     * Set 文件系统已使用容量大小
     * @param SizeByte 文件系统已使用容量大小
     */
    public void setSizeByte(Long SizeByte) {
        this.SizeByte = SizeByte;
    }

    /**
     * Get 可用区 ID 
     * @return ZoneId 可用区 ID
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 可用区 ID
     * @param ZoneId 可用区 ID
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 用户自定义文件系统名称 
     * @return FsName 用户自定义文件系统名称
     */
    public String getFsName() {
        return this.FsName;
    }

    /**
     * Set 用户自定义文件系统名称
     * @param FsName 用户自定义文件系统名称
     */
    public void setFsName(String FsName) {
        this.FsName = FsName;
    }

    /**
     * Get 文件系统是否加密 
     * @return Encrypted 文件系统是否加密
     */
    public Boolean getEncrypted() {
        return this.Encrypted;
    }

    /**
     * Set 文件系统是否加密
     * @param Encrypted 文件系统是否加密
     */
    public void setEncrypted(Boolean Encrypted) {
        this.Encrypted = Encrypted;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CreationTime", this.CreationTime);
        this.setParamSimple(map, prefix + "CreationToken", this.CreationToken);
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);
        this.setParamSimple(map, prefix + "LifeCycleState", this.LifeCycleState);
        this.setParamSimple(map, prefix + "SizeByte", this.SizeByte);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "FsName", this.FsName);
        this.setParamSimple(map, prefix + "Encrypted", this.Encrypted);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

