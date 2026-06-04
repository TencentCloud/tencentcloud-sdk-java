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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SupportedFileType extends AbstractModel {

    /**
    * 文件类型描述(如"文本文档")
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 文件类型(如 txt、pdf、jpg, 建议用扩展名)
    */
    @SerializedName("FileExt")
    @Expose
    private String FileExt;

    /**
    * 文件大小限制(单位: 字节)
    */
    @SerializedName("MaxSizeBytes")
    @Expose
    private String MaxSizeBytes;

    /**
     * Get 文件类型描述(如"文本文档") 
     * @return Description 文件类型描述(如"文本文档")
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 文件类型描述(如"文本文档")
     * @param Description 文件类型描述(如"文本文档")
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 文件类型(如 txt、pdf、jpg, 建议用扩展名) 
     * @return FileExt 文件类型(如 txt、pdf、jpg, 建议用扩展名)
     */
    public String getFileExt() {
        return this.FileExt;
    }

    /**
     * Set 文件类型(如 txt、pdf、jpg, 建议用扩展名)
     * @param FileExt 文件类型(如 txt、pdf、jpg, 建议用扩展名)
     */
    public void setFileExt(String FileExt) {
        this.FileExt = FileExt;
    }

    /**
     * Get 文件大小限制(单位: 字节) 
     * @return MaxSizeBytes 文件大小限制(单位: 字节)
     */
    public String getMaxSizeBytes() {
        return this.MaxSizeBytes;
    }

    /**
     * Set 文件大小限制(单位: 字节)
     * @param MaxSizeBytes 文件大小限制(单位: 字节)
     */
    public void setMaxSizeBytes(String MaxSizeBytes) {
        this.MaxSizeBytes = MaxSizeBytes;
    }

    public SupportedFileType() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SupportedFileType(SupportedFileType source) {
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.FileExt != null) {
            this.FileExt = new String(source.FileExt);
        }
        if (source.MaxSizeBytes != null) {
            this.MaxSizeBytes = new String(source.MaxSizeBytes);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "FileExt", this.FileExt);
        this.setParamSimple(map, prefix + "MaxSizeBytes", this.MaxSizeBytes);

    }
}

