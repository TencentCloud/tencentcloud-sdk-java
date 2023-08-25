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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DspaDiscoveryTaskCOSCondition extends AbstractModel{

    /**
    * 数据桶名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * 文件类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileTypes")
    @Expose
    private String [] FileTypes;

    /**
    * 文件大小上限，单位为KB，如1000, 目前单个文件最大只支持1GB（1048576KB）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileSizeLimit")
    @Expose
    private Long FileSizeLimit;

    /**
     * Get 数据桶名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Bucket 数据桶名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set 数据桶名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Bucket 数据桶名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get 文件类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileTypes 文件类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getFileTypes() {
        return this.FileTypes;
    }

    /**
     * Set 文件类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileTypes 文件类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileTypes(String [] FileTypes) {
        this.FileTypes = FileTypes;
    }

    /**
     * Get 文件大小上限，单位为KB，如1000, 目前单个文件最大只支持1GB（1048576KB）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileSizeLimit 文件大小上限，单位为KB，如1000, 目前单个文件最大只支持1GB（1048576KB）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFileSizeLimit() {
        return this.FileSizeLimit;
    }

    /**
     * Set 文件大小上限，单位为KB，如1000, 目前单个文件最大只支持1GB（1048576KB）
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileSizeLimit 文件大小上限，单位为KB，如1000, 目前单个文件最大只支持1GB（1048576KB）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileSizeLimit(Long FileSizeLimit) {
        this.FileSizeLimit = FileSizeLimit;
    }

    public DspaDiscoveryTaskCOSCondition() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspaDiscoveryTaskCOSCondition(DspaDiscoveryTaskCOSCondition source) {
        if (source.Bucket != null) {
            this.Bucket = new String(source.Bucket);
        }
        if (source.FileTypes != null) {
            this.FileTypes = new String[source.FileTypes.length];
            for (int i = 0; i < source.FileTypes.length; i++) {
                this.FileTypes[i] = new String(source.FileTypes[i]);
            }
        }
        if (source.FileSizeLimit != null) {
            this.FileSizeLimit = new Long(source.FileSizeLimit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamArraySimple(map, prefix + "FileTypes.", this.FileTypes);
        this.setParamSimple(map, prefix + "FileSizeLimit", this.FileSizeLimit);

    }
}

