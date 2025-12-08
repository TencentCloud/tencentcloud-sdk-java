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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MPSOutputFileInfo extends AbstractModel {

    /**
    * MPS输出文件类型
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * MPS输出文件的URL
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
     * Get MPS输出文件类型 
     * @return FileType MPS输出文件类型
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set MPS输出文件类型
     * @param FileType MPS输出文件类型
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get MPS输出文件的URL 
     * @return Url MPS输出文件的URL
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set MPS输出文件的URL
     * @param Url MPS输出文件的URL
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    public MPSOutputFileInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MPSOutputFileInfo(MPSOutputFileInfo source) {
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "Url", this.Url);

    }
}

