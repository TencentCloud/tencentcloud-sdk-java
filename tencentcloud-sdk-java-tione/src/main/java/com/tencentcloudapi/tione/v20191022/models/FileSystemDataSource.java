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

public class FileSystemDataSource extends AbstractModel{

    /**
    * 文件系统目录
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DirectoryPath")
    @Expose
    private String DirectoryPath;

    /**
    * 文件系统类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileSystemType")
    @Expose
    private String FileSystemType;

    /**
    * 文件系统访问模式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileSystemAccessMode")
    @Expose
    private String FileSystemAccessMode;

    /**
    * 文件系统ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
     * Get 文件系统目录
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DirectoryPath 文件系统目录
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDirectoryPath() {
        return this.DirectoryPath;
    }

    /**
     * Set 文件系统目录
注意：此字段可能返回 null，表示取不到有效值。
     * @param DirectoryPath 文件系统目录
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDirectoryPath(String DirectoryPath) {
        this.DirectoryPath = DirectoryPath;
    }

    /**
     * Get 文件系统类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileSystemType 文件系统类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileSystemType() {
        return this.FileSystemType;
    }

    /**
     * Set 文件系统类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileSystemType 文件系统类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileSystemType(String FileSystemType) {
        this.FileSystemType = FileSystemType;
    }

    /**
     * Get 文件系统访问模式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileSystemAccessMode 文件系统访问模式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileSystemAccessMode() {
        return this.FileSystemAccessMode;
    }

    /**
     * Set 文件系统访问模式
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileSystemAccessMode 文件系统访问模式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileSystemAccessMode(String FileSystemAccessMode) {
        this.FileSystemAccessMode = FileSystemAccessMode;
    }

    /**
     * Get 文件系统ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileSystemId 文件系统ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * Set 文件系统ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileSystemId 文件系统ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DirectoryPath", this.DirectoryPath);
        this.setParamSimple(map, prefix + "FileSystemType", this.FileSystemType);
        this.setParamSimple(map, prefix + "FileSystemAccessMode", this.FileSystemAccessMode);
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);

    }
}

