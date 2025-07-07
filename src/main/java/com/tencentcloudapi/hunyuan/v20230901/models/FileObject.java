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
package com.tencentcloudapi.hunyuan.v20230901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FileObject extends AbstractModel {

    /**
    * 文件标识符，可在各个API中引用。
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * 对象类型，始终为 file。
    */
    @SerializedName("Object")
    @Expose
    private String Object;

    /**
    * 文件大小，单位为字节。
    */
    @SerializedName("Bytes")
    @Expose
    private Long Bytes;

    /**
    * 文件创建时的 Unix 时间戳（秒）。
    */
    @SerializedName("CreatedAt")
    @Expose
    private Long CreatedAt;

    /**
    * 文件名。
    */
    @SerializedName("Filename")
    @Expose
    private String Filename;

    /**
    * 上传文件的用途。
    */
    @SerializedName("Purpose")
    @Expose
    private String Purpose;

    /**
     * Get 文件标识符，可在各个API中引用。 
     * @return ID 文件标识符，可在各个API中引用。
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set 文件标识符，可在各个API中引用。
     * @param ID 文件标识符，可在各个API中引用。
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Get 对象类型，始终为 file。 
     * @return Object 对象类型，始终为 file。
     */
    public String getObject() {
        return this.Object;
    }

    /**
     * Set 对象类型，始终为 file。
     * @param Object 对象类型，始终为 file。
     */
    public void setObject(String Object) {
        this.Object = Object;
    }

    /**
     * Get 文件大小，单位为字节。 
     * @return Bytes 文件大小，单位为字节。
     */
    public Long getBytes() {
        return this.Bytes;
    }

    /**
     * Set 文件大小，单位为字节。
     * @param Bytes 文件大小，单位为字节。
     */
    public void setBytes(Long Bytes) {
        this.Bytes = Bytes;
    }

    /**
     * Get 文件创建时的 Unix 时间戳（秒）。 
     * @return CreatedAt 文件创建时的 Unix 时间戳（秒）。
     */
    public Long getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set 文件创建时的 Unix 时间戳（秒）。
     * @param CreatedAt 文件创建时的 Unix 时间戳（秒）。
     */
    public void setCreatedAt(Long CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get 文件名。 
     * @return Filename 文件名。
     */
    public String getFilename() {
        return this.Filename;
    }

    /**
     * Set 文件名。
     * @param Filename 文件名。
     */
    public void setFilename(String Filename) {
        this.Filename = Filename;
    }

    /**
     * Get 上传文件的用途。 
     * @return Purpose 上传文件的用途。
     */
    public String getPurpose() {
        return this.Purpose;
    }

    /**
     * Set 上传文件的用途。
     * @param Purpose 上传文件的用途。
     */
    public void setPurpose(String Purpose) {
        this.Purpose = Purpose;
    }

    public FileObject() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FileObject(FileObject source) {
        if (source.ID != null) {
            this.ID = new String(source.ID);
        }
        if (source.Object != null) {
            this.Object = new String(source.Object);
        }
        if (source.Bytes != null) {
            this.Bytes = new Long(source.Bytes);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new Long(source.CreatedAt);
        }
        if (source.Filename != null) {
            this.Filename = new String(source.Filename);
        }
        if (source.Purpose != null) {
            this.Purpose = new String(source.Purpose);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Object", this.Object);
        this.setParamSimple(map, prefix + "Bytes", this.Bytes);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "Filename", this.Filename);
        this.setParamSimple(map, prefix + "Purpose", this.Purpose);

    }
}

