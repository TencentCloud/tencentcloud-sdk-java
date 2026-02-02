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

public class ExtractBlindWatermarkInputInfo extends AbstractModel {

    /**
    * 提取数字水印输入类型，可选值：<li>FILEID：文件媒资ID；</li><li>URL：文件url；</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 需要提取的文件媒资ID
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * 需要提取的视频文件url
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
     * Get 提取数字水印输入类型，可选值：<li>FILEID：文件媒资ID；</li><li>URL：文件url；</li> 
     * @return Type 提取数字水印输入类型，可选值：<li>FILEID：文件媒资ID；</li><li>URL：文件url；</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 提取数字水印输入类型，可选值：<li>FILEID：文件媒资ID；</li><li>URL：文件url；</li>
     * @param Type 提取数字水印输入类型，可选值：<li>FILEID：文件媒资ID；</li><li>URL：文件url；</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 需要提取的文件媒资ID 
     * @return FileId 需要提取的文件媒资ID
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set 需要提取的文件媒资ID
     * @param FileId 需要提取的文件媒资ID
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get 需要提取的视频文件url 
     * @return Url 需要提取的视频文件url
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 需要提取的视频文件url
     * @param Url 需要提取的视频文件url
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    public ExtractBlindWatermarkInputInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExtractBlindWatermarkInputInfo(ExtractBlindWatermarkInputInfo source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "Url", this.Url);

    }
}

