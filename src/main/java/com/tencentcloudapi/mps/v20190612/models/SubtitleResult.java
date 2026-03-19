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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubtitleResult extends AbstractModel {

    /**
    * <p>字幕文件语言</p>
    */
    @SerializedName("Language")
    @Expose
    private String Language;

    /**
    * <p>处理是否成功</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>字幕文件路径。</p>
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * <p>字幕压制视频路径。</p>
    */
    @SerializedName("SubtitleEmbedPath")
    @Expose
    private String SubtitleEmbedPath;

    /**
     * Get <p>字幕文件语言</p> 
     * @return Language <p>字幕文件语言</p>
     */
    public String getLanguage() {
        return this.Language;
    }

    /**
     * Set <p>字幕文件语言</p>
     * @param Language <p>字幕文件语言</p>
     */
    public void setLanguage(String Language) {
        this.Language = Language;
    }

    /**
     * Get <p>处理是否成功</p> 
     * @return Status <p>处理是否成功</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>处理是否成功</p>
     * @param Status <p>处理是否成功</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>字幕文件路径。</p> 
     * @return Path <p>字幕文件路径。</p>
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set <p>字幕文件路径。</p>
     * @param Path <p>字幕文件路径。</p>
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get <p>字幕压制视频路径。</p> 
     * @return SubtitleEmbedPath <p>字幕压制视频路径。</p>
     */
    public String getSubtitleEmbedPath() {
        return this.SubtitleEmbedPath;
    }

    /**
     * Set <p>字幕压制视频路径。</p>
     * @param SubtitleEmbedPath <p>字幕压制视频路径。</p>
     */
    public void setSubtitleEmbedPath(String SubtitleEmbedPath) {
        this.SubtitleEmbedPath = SubtitleEmbedPath;
    }

    public SubtitleResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubtitleResult(SubtitleResult source) {
        if (source.Language != null) {
            this.Language = new String(source.Language);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.SubtitleEmbedPath != null) {
            this.SubtitleEmbedPath = new String(source.SubtitleEmbedPath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Language", this.Language);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "SubtitleEmbedPath", this.SubtitleEmbedPath);

    }
}

