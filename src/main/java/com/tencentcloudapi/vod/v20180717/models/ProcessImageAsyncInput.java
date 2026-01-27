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

public class ProcessImageAsyncInput extends AbstractModel {

    /**
    * 图片处理的FileId。
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * 图片处理参数。
    */
    @SerializedName("ImageTaskInput")
    @Expose
    private ProcessImageAsyncTaskInput ImageTaskInput;

    /**
    * 图片处理任务的输出媒体文件配置。
    */
    @SerializedName("OutputConfig")
    @Expose
    private ProcessImageAsyncOutputConfig OutputConfig;

    /**
     * Get 图片处理的FileId。 
     * @return FileId 图片处理的FileId。
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set 图片处理的FileId。
     * @param FileId 图片处理的FileId。
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get 图片处理参数。 
     * @return ImageTaskInput 图片处理参数。
     */
    public ProcessImageAsyncTaskInput getImageTaskInput() {
        return this.ImageTaskInput;
    }

    /**
     * Set 图片处理参数。
     * @param ImageTaskInput 图片处理参数。
     */
    public void setImageTaskInput(ProcessImageAsyncTaskInput ImageTaskInput) {
        this.ImageTaskInput = ImageTaskInput;
    }

    /**
     * Get 图片处理任务的输出媒体文件配置。 
     * @return OutputConfig 图片处理任务的输出媒体文件配置。
     */
    public ProcessImageAsyncOutputConfig getOutputConfig() {
        return this.OutputConfig;
    }

    /**
     * Set 图片处理任务的输出媒体文件配置。
     * @param OutputConfig 图片处理任务的输出媒体文件配置。
     */
    public void setOutputConfig(ProcessImageAsyncOutputConfig OutputConfig) {
        this.OutputConfig = OutputConfig;
    }

    public ProcessImageAsyncInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProcessImageAsyncInput(ProcessImageAsyncInput source) {
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.ImageTaskInput != null) {
            this.ImageTaskInput = new ProcessImageAsyncTaskInput(source.ImageTaskInput);
        }
        if (source.OutputConfig != null) {
            this.OutputConfig = new ProcessImageAsyncOutputConfig(source.OutputConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamObj(map, prefix + "ImageTaskInput.", this.ImageTaskInput);
        this.setParamObj(map, prefix + "OutputConfig.", this.OutputConfig);

    }
}

