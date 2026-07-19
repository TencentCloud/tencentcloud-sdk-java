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
package com.tencentcloudapi.chdfs.v20201112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateTrashConfigRequest extends AbstractModel {

    /**
    * <p>文件系统ID</p>
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * <p>数据保留时间（天）</p>
    */
    @SerializedName("ReservedDays")
    @Expose
    private Long ReservedDays;

    /**
    * <p>规则状态（1：打开；2：关闭）</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <ol><li>字段为空表示开启普通用户回收站 </li><li>字段不为空表示开启HDFS原生回收站，且值必须为/user/* /.Trash</li></ol>
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
     * Get <p>文件系统ID</p> 
     * @return FileSystemId <p>文件系统ID</p>
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * Set <p>文件系统ID</p>
     * @param FileSystemId <p>文件系统ID</p>
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
    }

    /**
     * Get <p>数据保留时间（天）</p> 
     * @return ReservedDays <p>数据保留时间（天）</p>
     */
    public Long getReservedDays() {
        return this.ReservedDays;
    }

    /**
     * Set <p>数据保留时间（天）</p>
     * @param ReservedDays <p>数据保留时间（天）</p>
     */
    public void setReservedDays(Long ReservedDays) {
        this.ReservedDays = ReservedDays;
    }

    /**
     * Get <p>规则状态（1：打开；2：关闭）</p> 
     * @return Status <p>规则状态（1：打开；2：关闭）</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>规则状态（1：打开；2：关闭）</p>
     * @param Status <p>规则状态（1：打开；2：关闭）</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <ol><li>字段为空表示开启普通用户回收站 </li><li>字段不为空表示开启HDFS原生回收站，且值必须为/user/* /.Trash</li></ol> 
     * @return Path <ol><li>字段为空表示开启普通用户回收站 </li><li>字段不为空表示开启HDFS原生回收站，且值必须为/user/* /.Trash</li></ol>
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set <ol><li>字段为空表示开启普通用户回收站 </li><li>字段不为空表示开启HDFS原生回收站，且值必须为/user/* /.Trash</li></ol>
     * @param Path <ol><li>字段为空表示开启普通用户回收站 </li><li>字段不为空表示开启HDFS原生回收站，且值必须为/user/* /.Trash</li></ol>
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    public CreateTrashConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTrashConfigRequest(CreateTrashConfigRequest source) {
        if (source.FileSystemId != null) {
            this.FileSystemId = new String(source.FileSystemId);
        }
        if (source.ReservedDays != null) {
            this.ReservedDays = new Long(source.ReservedDays);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);
        this.setParamSimple(map, prefix + "ReservedDays", this.ReservedDays);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Path", this.Path);

    }
}

