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
package com.tencentcloudapi.ai3d.v20250513.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class File3D extends AbstractModel {

    /**
    * 文件格式
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 文件的Url（有效期24小时）
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 预览图片Url
    */
    @SerializedName("PreviewImageUrl")
    @Expose
    private String PreviewImageUrl;

    /**
     * Get 文件格式 
     * @return Type 文件格式
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 文件格式
     * @param Type 文件格式
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 文件的Url（有效期24小时） 
     * @return Url 文件的Url（有效期24小时）
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 文件的Url（有效期24小时）
     * @param Url 文件的Url（有效期24小时）
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 预览图片Url 
     * @return PreviewImageUrl 预览图片Url
     */
    public String getPreviewImageUrl() {
        return this.PreviewImageUrl;
    }

    /**
     * Set 预览图片Url
     * @param PreviewImageUrl 预览图片Url
     */
    public void setPreviewImageUrl(String PreviewImageUrl) {
        this.PreviewImageUrl = PreviewImageUrl;
    }

    public File3D() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public File3D(File3D source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.PreviewImageUrl != null) {
            this.PreviewImageUrl = new String(source.PreviewImageUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "PreviewImageUrl", this.PreviewImageUrl);

    }
}

