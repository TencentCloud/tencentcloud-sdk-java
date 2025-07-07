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
package com.tencentcloudapi.cms.v20190321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageModerationRequest extends AbstractModel {

    /**
    * 文件地址
    */
    @SerializedName("FileUrl")
    @Expose
    private String FileUrl;

    /**
    * 文件MD5值
    */
    @SerializedName("FileMD5")
    @Expose
    private String FileMD5;

    /**
    * 文件内容 Base64,与FileUrl必须二填一
    */
    @SerializedName("FileContent")
    @Expose
    private String FileContent;

    /**
     * Get 文件地址 
     * @return FileUrl 文件地址
     */
    public String getFileUrl() {
        return this.FileUrl;
    }

    /**
     * Set 文件地址
     * @param FileUrl 文件地址
     */
    public void setFileUrl(String FileUrl) {
        this.FileUrl = FileUrl;
    }

    /**
     * Get 文件MD5值 
     * @return FileMD5 文件MD5值
     */
    public String getFileMD5() {
        return this.FileMD5;
    }

    /**
     * Set 文件MD5值
     * @param FileMD5 文件MD5值
     */
    public void setFileMD5(String FileMD5) {
        this.FileMD5 = FileMD5;
    }

    /**
     * Get 文件内容 Base64,与FileUrl必须二填一 
     * @return FileContent 文件内容 Base64,与FileUrl必须二填一
     */
    public String getFileContent() {
        return this.FileContent;
    }

    /**
     * Set 文件内容 Base64,与FileUrl必须二填一
     * @param FileContent 文件内容 Base64,与FileUrl必须二填一
     */
    public void setFileContent(String FileContent) {
        this.FileContent = FileContent;
    }

    public ImageModerationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageModerationRequest(ImageModerationRequest source) {
        if (source.FileUrl != null) {
            this.FileUrl = new String(source.FileUrl);
        }
        if (source.FileMD5 != null) {
            this.FileMD5 = new String(source.FileMD5);
        }
        if (source.FileContent != null) {
            this.FileContent = new String(source.FileContent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileUrl", this.FileUrl);
        this.setParamSimple(map, prefix + "FileMD5", this.FileMD5);
        this.setParamSimple(map, prefix + "FileContent", this.FileContent);

    }
}

