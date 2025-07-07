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
package com.tencentcloudapi.tione.v20191022.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataSource extends AbstractModel {

    /**
    * cos数据源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CosDataSource")
    @Expose
    private CosDataSource CosDataSource;

    /**
    * 文件系统输入源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileSystemDataSource")
    @Expose
    private FileSystemDataSource FileSystemDataSource;

    /**
     * Get cos数据源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CosDataSource cos数据源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CosDataSource getCosDataSource() {
        return this.CosDataSource;
    }

    /**
     * Set cos数据源
注意：此字段可能返回 null，表示取不到有效值。
     * @param CosDataSource cos数据源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCosDataSource(CosDataSource CosDataSource) {
        this.CosDataSource = CosDataSource;
    }

    /**
     * Get 文件系统输入源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileSystemDataSource 文件系统输入源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FileSystemDataSource getFileSystemDataSource() {
        return this.FileSystemDataSource;
    }

    /**
     * Set 文件系统输入源
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileSystemDataSource 文件系统输入源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileSystemDataSource(FileSystemDataSource FileSystemDataSource) {
        this.FileSystemDataSource = FileSystemDataSource;
    }

    public DataSource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataSource(DataSource source) {
        if (source.CosDataSource != null) {
            this.CosDataSource = new CosDataSource(source.CosDataSource);
        }
        if (source.FileSystemDataSource != null) {
            this.FileSystemDataSource = new FileSystemDataSource(source.FileSystemDataSource);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "CosDataSource.", this.CosDataSource);
        this.setParamObj(map, prefix + "FileSystemDataSource.", this.FileSystemDataSource);

    }
}

