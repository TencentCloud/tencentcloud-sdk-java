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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CFSVolume extends AbstractModel {

    /**
    * 存储卷名称
    */
    @SerializedName("VolumeName")
    @Expose
    private String VolumeName;

    /**
    * 文件系统 id
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * CFSId
    */
    @SerializedName("FSId")
    @Expose
    private String FSId;

    /**
    * 挂载点 ip
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * cfs子目录
    */
    @SerializedName("SubPath")
    @Expose
    private String SubPath;

    /**
     * Get 存储卷名称 
     * @return VolumeName 存储卷名称
     */
    public String getVolumeName() {
        return this.VolumeName;
    }

    /**
     * Set 存储卷名称
     * @param VolumeName 存储卷名称
     */
    public void setVolumeName(String VolumeName) {
        this.VolumeName = VolumeName;
    }

    /**
     * Get 文件系统 id 
     * @return FileSystemId 文件系统 id
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * Set 文件系统 id
     * @param FileSystemId 文件系统 id
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
    }

    /**
     * Get CFSId 
     * @return FSId CFSId
     */
    public String getFSId() {
        return this.FSId;
    }

    /**
     * Set CFSId
     * @param FSId CFSId
     */
    public void setFSId(String FSId) {
        this.FSId = FSId;
    }

    /**
     * Get 挂载点 ip 
     * @return Host 挂载点 ip
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set 挂载点 ip
     * @param Host 挂载点 ip
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get cfs子目录 
     * @return SubPath cfs子目录
     */
    public String getSubPath() {
        return this.SubPath;
    }

    /**
     * Set cfs子目录
     * @param SubPath cfs子目录
     */
    public void setSubPath(String SubPath) {
        this.SubPath = SubPath;
    }

    public CFSVolume() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CFSVolume(CFSVolume source) {
        if (source.VolumeName != null) {
            this.VolumeName = new String(source.VolumeName);
        }
        if (source.FileSystemId != null) {
            this.FileSystemId = new String(source.FileSystemId);
        }
        if (source.FSId != null) {
            this.FSId = new String(source.FSId);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.SubPath != null) {
            this.SubPath = new String(source.SubPath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VolumeName", this.VolumeName);
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);
        this.setParamSimple(map, prefix + "FSId", this.FSId);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "SubPath", this.SubPath);

    }
}

