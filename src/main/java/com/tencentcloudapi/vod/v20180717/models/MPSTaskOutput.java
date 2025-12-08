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

public class MPSTaskOutput extends AbstractModel {

    /**
    * 任务返回结果中的文件类型结果。如智能擦除中，擦除后的视频文件将被存入媒资，并在此字段中给出 FileId；基于画面提取的字幕文件 Url 将在此字段中给出。
    */
    @SerializedName("OutputFiles")
    @Expose
    private MPSOutputFile [] OutputFiles;

    /**
    * 任务返回的结果JSON
    */
    @SerializedName("OutputText")
    @Expose
    private String OutputText;

    /**
     * Get 任务返回结果中的文件类型结果。如智能擦除中，擦除后的视频文件将被存入媒资，并在此字段中给出 FileId；基于画面提取的字幕文件 Url 将在此字段中给出。 
     * @return OutputFiles 任务返回结果中的文件类型结果。如智能擦除中，擦除后的视频文件将被存入媒资，并在此字段中给出 FileId；基于画面提取的字幕文件 Url 将在此字段中给出。
     */
    public MPSOutputFile [] getOutputFiles() {
        return this.OutputFiles;
    }

    /**
     * Set 任务返回结果中的文件类型结果。如智能擦除中，擦除后的视频文件将被存入媒资，并在此字段中给出 FileId；基于画面提取的字幕文件 Url 将在此字段中给出。
     * @param OutputFiles 任务返回结果中的文件类型结果。如智能擦除中，擦除后的视频文件将被存入媒资，并在此字段中给出 FileId；基于画面提取的字幕文件 Url 将在此字段中给出。
     */
    public void setOutputFiles(MPSOutputFile [] OutputFiles) {
        this.OutputFiles = OutputFiles;
    }

    /**
     * Get 任务返回的结果JSON 
     * @return OutputText 任务返回的结果JSON
     */
    public String getOutputText() {
        return this.OutputText;
    }

    /**
     * Set 任务返回的结果JSON
     * @param OutputText 任务返回的结果JSON
     */
    public void setOutputText(String OutputText) {
        this.OutputText = OutputText;
    }

    public MPSTaskOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MPSTaskOutput(MPSTaskOutput source) {
        if (source.OutputFiles != null) {
            this.OutputFiles = new MPSOutputFile[source.OutputFiles.length];
            for (int i = 0; i < source.OutputFiles.length; i++) {
                this.OutputFiles[i] = new MPSOutputFile(source.OutputFiles[i]);
            }
        }
        if (source.OutputText != null) {
            this.OutputText = new String(source.OutputText);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "OutputFiles.", this.OutputFiles);
        this.setParamSimple(map, prefix + "OutputText", this.OutputText);

    }
}

