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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReleaseFile extends AbstractModel{

    /**
    * 文件版本
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 文件唯一 key
    */
    @SerializedName("FileKey")
    @Expose
    private String FileKey;

    /**
    * 文件名
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 文件哈希值
    */
    @SerializedName("FileHash")
    @Expose
    private String FileHash;

    /**
    * 文件 id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
     * Get 文件版本 
     * @return Version 文件版本
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 文件版本
     * @param Version 文件版本
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get 文件唯一 key 
     * @return FileKey 文件唯一 key
     */
    public String getFileKey() {
        return this.FileKey;
    }

    /**
     * Set 文件唯一 key
     * @param FileKey 文件唯一 key
     */
    public void setFileKey(String FileKey) {
        this.FileKey = FileKey;
    }

    /**
     * Get 文件名 
     * @return FileName 文件名
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 文件名
     * @param FileName 文件名
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 文件哈希值 
     * @return FileHash 文件哈希值
     */
    public String getFileHash() {
        return this.FileHash;
    }

    /**
     * Set 文件哈希值
     * @param FileHash 文件哈希值
     */
    public void setFileHash(String FileHash) {
        this.FileHash = FileHash;
    }

    /**
     * Get 文件 id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ID 文件 id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set 文件 id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ID 文件 id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setID(Long ID) {
        this.ID = ID;
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

    }
}

