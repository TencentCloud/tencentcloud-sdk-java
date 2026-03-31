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

public class CreateCfsFileSystemResponse extends AbstractModel {

    /**
    * <p>文件系统创建时间</p>
    */
    @SerializedName("CreationTime")
    @Expose
    private String CreationTime;

    /**
    * <p>用户自定义文件系统名称</p>
    */
    @SerializedName("CreationToken")
    @Expose
    private String CreationToken;

    /**
    * <p>文件系统 ID</p>
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * <p>文件系统状态，可能出现状态包括：“creating”  创建中, “create_failed” 创建失败, “available” 可用, “unserviced” 不可用, “upgrading” 升级中， “deleting” 删除中。</p>
    */
    @SerializedName("LifeCycleState")
    @Expose
    private String LifeCycleState;

    /**
    * <p>文件系统已使用容量大小，单位为 Byte</p>
    */
    @SerializedName("SizeByte")
    @Expose
    private Long SizeByte;

    /**
    * <p>可用区 ID</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * <p>用户自定义文件系统名称</p>
    */
    @SerializedName("FsName")
    @Expose
    private String FsName;

    /**
    * <p>文件系统是否加密</p>
    */
    @SerializedName("Encrypted")
    @Expose
    private Boolean Encrypted;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>文件系统创建时间</p> 
     * @return CreationTime <p>文件系统创建时间</p>
     */
    public String getCreationTime() {
        return this.CreationTime;
    }

    /**
     * Set <p>文件系统创建时间</p>
     * @param CreationTime <p>文件系统创建时间</p>
     */
    public void setCreationTime(String CreationTime) {
        this.CreationTime = CreationTime;
    }

    /**
     * Get <p>用户自定义文件系统名称</p> 
     * @return CreationToken <p>用户自定义文件系统名称</p>
     */
    public String getCreationToken() {
        return this.CreationToken;
    }

    /**
     * Set <p>用户自定义文件系统名称</p>
     * @param CreationToken <p>用户自定义文件系统名称</p>
     */
    public void setCreationToken(String CreationToken) {
        this.CreationToken = CreationToken;
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
     * Get <p>文件系统状态，可能出现状态包括：“creating”  创建中, “create_failed” 创建失败, “available” 可用, “unserviced” 不可用, “upgrading” 升级中， “deleting” 删除中。</p> 
     * @return LifeCycleState <p>文件系统状态，可能出现状态包括：“creating”  创建中, “create_failed” 创建失败, “available” 可用, “unserviced” 不可用, “upgrading” 升级中， “deleting” 删除中。</p>
     */
    public String getLifeCycleState() {
        return this.LifeCycleState;
    }

    /**
     * Set <p>文件系统状态，可能出现状态包括：“creating”  创建中, “create_failed” 创建失败, “available” 可用, “unserviced” 不可用, “upgrading” 升级中， “deleting” 删除中。</p>
     * @param LifeCycleState <p>文件系统状态，可能出现状态包括：“creating”  创建中, “create_failed” 创建失败, “available” 可用, “unserviced” 不可用, “upgrading” 升级中， “deleting” 删除中。</p>
     */
    public void setLifeCycleState(String LifeCycleState) {
        this.LifeCycleState = LifeCycleState;
    }

    /**
     * Get <p>文件系统已使用容量大小，单位为 Byte</p> 
     * @return SizeByte <p>文件系统已使用容量大小，单位为 Byte</p>
     */
    public Long getSizeByte() {
        return this.SizeByte;
    }

    /**
     * Set <p>文件系统已使用容量大小，单位为 Byte</p>
     * @param SizeByte <p>文件系统已使用容量大小，单位为 Byte</p>
     */
    public void setSizeByte(Long SizeByte) {
        this.SizeByte = SizeByte;
    }

    /**
     * Get <p>可用区 ID</p> 
     * @return ZoneId <p>可用区 ID</p>
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>可用区 ID</p>
     * @param ZoneId <p>可用区 ID</p>
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>用户自定义文件系统名称</p> 
     * @return FsName <p>用户自定义文件系统名称</p>
     */
    public String getFsName() {
        return this.FsName;
    }

    /**
     * Set <p>用户自定义文件系统名称</p>
     * @param FsName <p>用户自定义文件系统名称</p>
     */
    public void setFsName(String FsName) {
        this.FsName = FsName;
    }

    /**
     * Get <p>文件系统是否加密</p> 
     * @return Encrypted <p>文件系统是否加密</p>
     */
    public Boolean getEncrypted() {
        return this.Encrypted;
    }

    /**
     * Set <p>文件系统是否加密</p>
     * @param Encrypted <p>文件系统是否加密</p>
     */
    public void setEncrypted(Boolean Encrypted) {
        this.Encrypted = Encrypted;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public CreateCfsFileSystemResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCfsFileSystemResponse(CreateCfsFileSystemResponse source) {
        if (source.CreationTime != null) {
            this.CreationTime = new String(source.CreationTime);
        }
        if (source.CreationToken != null) {
            this.CreationToken = new String(source.CreationToken);
        }
        if (source.FileSystemId != null) {
            this.FileSystemId = new String(source.FileSystemId);
        }
        if (source.LifeCycleState != null) {
            this.LifeCycleState = new String(source.LifeCycleState);
        }
        if (source.SizeByte != null) {
            this.SizeByte = new Long(source.SizeByte);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.FsName != null) {
            this.FsName = new String(source.FsName);
        }
        if (source.Encrypted != null) {
            this.Encrypted = new Boolean(source.Encrypted);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
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

