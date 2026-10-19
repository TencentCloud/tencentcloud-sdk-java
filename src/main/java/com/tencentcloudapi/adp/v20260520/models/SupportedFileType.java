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
    * <p>描述信息</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>文件类型（如 txt、pdf、jpg，建议用扩展名）</p>
    */
    @SerializedName("FileExt")
    @Expose
    private String FileExt;

    /**
    * <p>文件大小限制（单位：字节）</p>
    */
    @SerializedName("MaxSizeBytes")
    @Expose
    private String MaxSizeBytes;

    /**
     * Get <p>描述信息</p> 
     * @return Description <p>描述信息</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>描述信息</p>
     * @param Description <p>描述信息</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>文件类型（如 txt、pdf、jpg，建议用扩展名）</p> 
     * @return FileExt <p>文件类型（如 txt、pdf、jpg，建议用扩展名）</p>
     */
    public String getFileExt() {
        return this.FileExt;
    }

    /**
     * Set <p>文件类型（如 txt、pdf、jpg，建议用扩展名）</p>
     * @param FileExt <p>文件类型（如 txt、pdf、jpg，建议用扩展名）</p>
     */
    public void setFileExt(String FileExt) {
        this.FileExt = FileExt;
    }

    /**
     * Get <p>文件大小限制（单位：字节）</p> 
     * @return MaxSizeBytes <p>文件大小限制（单位：字节）</p>
     */
    public String getMaxSizeBytes() {
        return this.MaxSizeBytes;
    }

    /**
     * Set <p>文件大小限制（单位：字节）</p>
     * @param MaxSizeBytes <p>文件大小限制（单位：字节）</p>
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

