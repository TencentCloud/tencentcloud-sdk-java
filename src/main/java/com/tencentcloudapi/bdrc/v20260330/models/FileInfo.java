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
package com.tencentcloudapi.bdrc.v20260330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FileInfo extends AbstractModel {

    /**
    * 文件名称
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * 文件大小，单位是Bytes
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * 文件mtime
    */
    @SerializedName("ModifyTime")
    @Expose
    private Long ModifyTime;

    /**
    * 文件ctime
    */
    @SerializedName("ChangeTime")
    @Expose
    private Long ChangeTime;

    /**
    * 文件类型。取值包含"dir"、"file"、"symlink"
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get 文件名称 
     * @return Path 文件名称
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set 文件名称
     * @param Path 文件名称
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get 文件大小，单位是Bytes 
     * @return Size 文件大小，单位是Bytes
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set 文件大小，单位是Bytes
     * @param Size 文件大小，单位是Bytes
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get 文件mtime 
     * @return ModifyTime 文件mtime
     */
    public Long getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 文件mtime
     * @param ModifyTime 文件mtime
     */
    public void setModifyTime(Long ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get 文件ctime 
     * @return ChangeTime 文件ctime
     */
    public Long getChangeTime() {
        return this.ChangeTime;
    }

    /**
     * Set 文件ctime
     * @param ChangeTime 文件ctime
     */
    public void setChangeTime(Long ChangeTime) {
        this.ChangeTime = ChangeTime;
    }

    /**
     * Get 文件类型。取值包含"dir"、"file"、"symlink" 
     * @return Type 文件类型。取值包含"dir"、"file"、"symlink"
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 文件类型。取值包含"dir"、"file"、"symlink"
     * @param Type 文件类型。取值包含"dir"、"file"、"symlink"
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public FileInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FileInfo(FileInfo source) {
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new Long(source.ModifyTime);
        }
        if (source.ChangeTime != null) {
            this.ChangeTime = new Long(source.ChangeTime);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "ChangeTime", this.ChangeTime);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

