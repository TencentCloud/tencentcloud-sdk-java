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

public class VideoDubbingAsyncInput extends AbstractModel {

    /**
    * <p>输入视频Url</p>
    */
    @SerializedName("InputUrl")
    @Expose
    private String InputUrl;

    /**
    * <p>输入视频FileId</p>
    */
    @SerializedName("InputFileId")
    @Expose
    private String InputFileId;

    /**
    * <p>视频源语言，默认zh</p>
    */
    @SerializedName("SrcLanguage")
    @Expose
    private String SrcLanguage;

    /**
    * <p>视频目标语言，默认en</p>
    */
    @SerializedName("DstLanguage")
    @Expose
    private String DstLanguage;

    /**
    * <p>配音模型</p>
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
     * Get <p>输入视频Url</p> 
     * @return InputUrl <p>输入视频Url</p>
     */
    public String getInputUrl() {
        return this.InputUrl;
    }

    /**
     * Set <p>输入视频Url</p>
     * @param InputUrl <p>输入视频Url</p>
     */
    public void setInputUrl(String InputUrl) {
        this.InputUrl = InputUrl;
    }

    /**
     * Get <p>输入视频FileId</p> 
     * @return InputFileId <p>输入视频FileId</p>
     */
    public String getInputFileId() {
        return this.InputFileId;
    }

    /**
     * Set <p>输入视频FileId</p>
     * @param InputFileId <p>输入视频FileId</p>
     */
    public void setInputFileId(String InputFileId) {
        this.InputFileId = InputFileId;
    }

    /**
     * Get <p>视频源语言，默认zh</p> 
     * @return SrcLanguage <p>视频源语言，默认zh</p>
     */
    public String getSrcLanguage() {
        return this.SrcLanguage;
    }

    /**
     * Set <p>视频源语言，默认zh</p>
     * @param SrcLanguage <p>视频源语言，默认zh</p>
     */
    public void setSrcLanguage(String SrcLanguage) {
        this.SrcLanguage = SrcLanguage;
    }

    /**
     * Get <p>视频目标语言，默认en</p> 
     * @return DstLanguage <p>视频目标语言，默认en</p>
     */
    public String getDstLanguage() {
        return this.DstLanguage;
    }

    /**
     * Set <p>视频目标语言，默认en</p>
     * @param DstLanguage <p>视频目标语言，默认en</p>
     */
    public void setDstLanguage(String DstLanguage) {
        this.DstLanguage = DstLanguage;
    }

    /**
     * Get <p>配音模型</p> 
     * @return Model <p>配音模型</p>
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set <p>配音模型</p>
     * @param Model <p>配音模型</p>
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    public VideoDubbingAsyncInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VideoDubbingAsyncInput(VideoDubbingAsyncInput source) {
        if (source.InputUrl != null) {
            this.InputUrl = new String(source.InputUrl);
        }
        if (source.InputFileId != null) {
            this.InputFileId = new String(source.InputFileId);
        }
        if (source.SrcLanguage != null) {
            this.SrcLanguage = new String(source.SrcLanguage);
        }
        if (source.DstLanguage != null) {
            this.DstLanguage = new String(source.DstLanguage);
        }
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InputUrl", this.InputUrl);
        this.setParamSimple(map, prefix + "InputFileId", this.InputFileId);
        this.setParamSimple(map, prefix + "SrcLanguage", this.SrcLanguage);
        this.setParamSimple(map, prefix + "DstLanguage", this.DstLanguage);
        this.setParamSimple(map, prefix + "Model", this.Model);

    }
}

