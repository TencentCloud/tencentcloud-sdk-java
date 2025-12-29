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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FileCollection extends AbstractModel {

    /**
    * 最大上传文件的数量
    */
    @SerializedName("MaxFileCount")
    @Expose
    private Long MaxFileCount;

    /**
    * 支持的上传文件类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SupportedFileTypes")
    @Expose
    private String [] SupportedFileTypes;

    /**
     * Get 最大上传文件的数量 
     * @return MaxFileCount 最大上传文件的数量
     */
    public Long getMaxFileCount() {
        return this.MaxFileCount;
    }

    /**
     * Set 最大上传文件的数量
     * @param MaxFileCount 最大上传文件的数量
     */
    public void setMaxFileCount(Long MaxFileCount) {
        this.MaxFileCount = MaxFileCount;
    }

    /**
     * Get 支持的上传文件类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SupportedFileTypes 支持的上传文件类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSupportedFileTypes() {
        return this.SupportedFileTypes;
    }

    /**
     * Set 支持的上传文件类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param SupportedFileTypes 支持的上传文件类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSupportedFileTypes(String [] SupportedFileTypes) {
        this.SupportedFileTypes = SupportedFileTypes;
    }

    public FileCollection() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FileCollection(FileCollection source) {
        if (source.MaxFileCount != null) {
            this.MaxFileCount = new Long(source.MaxFileCount);
        }
        if (source.SupportedFileTypes != null) {
            this.SupportedFileTypes = new String[source.SupportedFileTypes.length];
            for (int i = 0; i < source.SupportedFileTypes.length; i++) {
                this.SupportedFileTypes[i] = new String(source.SupportedFileTypes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MaxFileCount", this.MaxFileCount);
        this.setParamArraySimple(map, prefix + "SupportedFileTypes.", this.SupportedFileTypes);

    }
}

