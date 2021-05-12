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
package com.tencentcloudapi.tione.v20191022.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OutputDataConfig extends AbstractModel{

    /**
    * cos输出桶
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CosOutputBucket")
    @Expose
    private String CosOutputBucket;

    /**
    * cos输出key前缀
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CosOutputKeyPrefix")
    @Expose
    private String CosOutputKeyPrefix;

    /**
    * 文件系统输出，如果指定了文件系统，那么Cos输出会被忽略
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileSystemDataSource")
    @Expose
    private FileSystemDataSource FileSystemDataSource;

    /**
     * Get cos输出桶
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CosOutputBucket cos输出桶
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCosOutputBucket() {
        return this.CosOutputBucket;
    }

    /**
     * Set cos输出桶
注意：此字段可能返回 null，表示取不到有效值。
     * @param CosOutputBucket cos输出桶
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCosOutputBucket(String CosOutputBucket) {
        this.CosOutputBucket = CosOutputBucket;
    }

    /**
     * Get cos输出key前缀
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CosOutputKeyPrefix cos输出key前缀
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCosOutputKeyPrefix() {
        return this.CosOutputKeyPrefix;
    }

    /**
     * Set cos输出key前缀
注意：此字段可能返回 null，表示取不到有效值。
     * @param CosOutputKeyPrefix cos输出key前缀
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCosOutputKeyPrefix(String CosOutputKeyPrefix) {
        this.CosOutputKeyPrefix = CosOutputKeyPrefix;
    }

    /**
     * Get 文件系统输出，如果指定了文件系统，那么Cos输出会被忽略
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileSystemDataSource 文件系统输出，如果指定了文件系统，那么Cos输出会被忽略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FileSystemDataSource getFileSystemDataSource() {
        return this.FileSystemDataSource;
    }

    /**
     * Set 文件系统输出，如果指定了文件系统，那么Cos输出会被忽略
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileSystemDataSource 文件系统输出，如果指定了文件系统，那么Cos输出会被忽略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileSystemDataSource(FileSystemDataSource FileSystemDataSource) {
        this.FileSystemDataSource = FileSystemDataSource;
    }

    public OutputDataConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OutputDataConfig(OutputDataConfig source) {
        if (source.CosOutputBucket != null) {
            this.CosOutputBucket = new String(source.CosOutputBucket);
        }
        if (source.CosOutputKeyPrefix != null) {
            this.CosOutputKeyPrefix = new String(source.CosOutputKeyPrefix);
        }
        if (source.FileSystemDataSource != null) {
            this.FileSystemDataSource = new FileSystemDataSource(source.FileSystemDataSource);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CosOutputBucket", this.CosOutputBucket);
        this.setParamSimple(map, prefix + "CosOutputKeyPrefix", this.CosOutputKeyPrefix);
        this.setParamObj(map, prefix + "FileSystemDataSource.", this.FileSystemDataSource);

    }
}

