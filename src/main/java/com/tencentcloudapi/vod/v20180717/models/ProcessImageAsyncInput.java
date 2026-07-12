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
    * <p>图片处理的FileId。</p>
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * <p>图片URL。</p>
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * <p>图片处理参数。</p>
    */
    @SerializedName("ImageTaskInput")
    @Expose
    private ProcessImageAsyncTaskInput ImageTaskInput;

    /**
    * <p>图片处理任务的输出媒体文件配置。</p>
    */
    @SerializedName("OutputConfig")
    @Expose
    private ProcessImageAsyncOutputConfig OutputConfig;

    /**
     * Get <p>图片处理的FileId。</p> 
     * @return FileId <p>图片处理的FileId。</p>
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set <p>图片处理的FileId。</p>
     * @param FileId <p>图片处理的FileId。</p>
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get <p>图片URL。</p> 
     * @return Url <p>图片URL。</p>
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set <p>图片URL。</p>
     * @param Url <p>图片URL。</p>
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get <p>图片处理参数。</p> 
     * @return ImageTaskInput <p>图片处理参数。</p>
     */
    public ProcessImageAsyncTaskInput getImageTaskInput() {
        return this.ImageTaskInput;
    }

    /**
     * Set <p>图片处理参数。</p>
     * @param ImageTaskInput <p>图片处理参数。</p>
     */
    public void setImageTaskInput(ProcessImageAsyncTaskInput ImageTaskInput) {
        this.ImageTaskInput = ImageTaskInput;
    }

    /**
     * Get <p>图片处理任务的输出媒体文件配置。</p> 
     * @return OutputConfig <p>图片处理任务的输出媒体文件配置。</p>
     */
    public ProcessImageAsyncOutputConfig getOutputConfig() {
        return this.OutputConfig;
    }

    /**
     * Set <p>图片处理任务的输出媒体文件配置。</p>
     * @param OutputConfig <p>图片处理任务的输出媒体文件配置。</p>
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
        if (source.Url != null) {
            this.Url = new String(source.Url);
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
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamObj(map, prefix + "ImageTaskInput.", this.ImageTaskInput);
        this.setParamObj(map, prefix + "OutputConfig.", this.OutputConfig);

    }
}

