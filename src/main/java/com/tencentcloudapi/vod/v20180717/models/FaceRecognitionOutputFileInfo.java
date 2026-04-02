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

public class FaceRecognitionOutputFileInfo extends AbstractModel {

    /**
    * <p>人脸识别输出文件类型</p><p>枚举值：</p><ul><li>Output： 任务生成的结果输出，文件对应人脸识别任务返回中的结果，以 JSON 格式生成文件。</li></ul>
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * <p>人脸识别输出文件的URL</p>
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
     * Get <p>人脸识别输出文件类型</p><p>枚举值：</p><ul><li>Output： 任务生成的结果输出，文件对应人脸识别任务返回中的结果，以 JSON 格式生成文件。</li></ul> 
     * @return FileType <p>人脸识别输出文件类型</p><p>枚举值：</p><ul><li>Output： 任务生成的结果输出，文件对应人脸识别任务返回中的结果，以 JSON 格式生成文件。</li></ul>
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set <p>人脸识别输出文件类型</p><p>枚举值：</p><ul><li>Output： 任务生成的结果输出，文件对应人脸识别任务返回中的结果，以 JSON 格式生成文件。</li></ul>
     * @param FileType <p>人脸识别输出文件类型</p><p>枚举值：</p><ul><li>Output： 任务生成的结果输出，文件对应人脸识别任务返回中的结果，以 JSON 格式生成文件。</li></ul>
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get <p>人脸识别输出文件的URL</p> 
     * @return Url <p>人脸识别输出文件的URL</p>
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set <p>人脸识别输出文件的URL</p>
     * @param Url <p>人脸识别输出文件的URL</p>
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    public FaceRecognitionOutputFileInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FaceRecognitionOutputFileInfo(FaceRecognitionOutputFileInfo source) {
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

