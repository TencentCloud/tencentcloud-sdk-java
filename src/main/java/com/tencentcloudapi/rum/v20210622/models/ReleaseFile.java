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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReleaseFile extends AbstractModel {

    /**
    * <p>文件版本</p>
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * <p>文件唯一 key</p>
    */
    @SerializedName("FileKey")
    @Expose
    private String FileKey;

    /**
    * <p>文件名</p>
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * <p>文件哈希值</p>
    */
    @SerializedName("FileHash")
    @Expose
    private String FileHash;

    /**
    * <p>文件 id</p>
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
     * Get <p>文件版本</p> 
     * @return Version <p>文件版本</p>
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set <p>文件版本</p>
     * @param Version <p>文件版本</p>
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get <p>文件唯一 key</p> 
     * @return FileKey <p>文件唯一 key</p>
     */
    public String getFileKey() {
        return this.FileKey;
    }

    /**
     * Set <p>文件唯一 key</p>
     * @param FileKey <p>文件唯一 key</p>
     */
    public void setFileKey(String FileKey) {
        this.FileKey = FileKey;
    }

    /**
     * Get <p>文件名</p> 
     * @return FileName <p>文件名</p>
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set <p>文件名</p>
     * @param FileName <p>文件名</p>
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get <p>文件哈希值</p> 
     * @return FileHash <p>文件哈希值</p>
     */
    public String getFileHash() {
        return this.FileHash;
    }

    /**
     * Set <p>文件哈希值</p>
     * @param FileHash <p>文件哈希值</p>
     */
    public void setFileHash(String FileHash) {
        this.FileHash = FileHash;
    }

    /**
     * Get <p>文件 id</p> 
     * @return ID <p>文件 id</p>
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set <p>文件 id</p>
     * @param ID <p>文件 id</p>
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreatedAt <p>创建时间</p>
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreatedAt <p>创建时间</p>
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    public ReleaseFile() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReleaseFile(ReleaseFile source) {
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.FileKey != null) {
            this.FileKey = new String(source.FileKey);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FileHash != null) {
            this.FileHash = new String(source.FileHash);
        }
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "FileKey", this.FileKey);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileHash", this.FileHash);
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);

    }
}

