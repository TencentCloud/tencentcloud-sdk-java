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

public class SubtitleTransResultItem extends AbstractModel {

    /**
    * <p>翻译标识：</p><ul><li>Success</li><li>Error</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>源语言（如&quot;en&quot;）</p>
    */
    @SerializedName("TransSrc")
    @Expose
    private String TransSrc;

    /**
    * <p>目标语言（如&quot;zh&quot;）</p>
    */
    @SerializedName("TransDst")
    @Expose
    private String TransDst;

    /**
    * <p>字幕文件地址</p>
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * <p>翻译字幕压制视频路径。</p>
    */
    @SerializedName("SubtitleEmbedPath")
    @Expose
    private String SubtitleEmbedPath;

    /**
     * Get <p>翻译标识：</p><ul><li>Success</li><li>Error</li></ul> 
     * @return Status <p>翻译标识：</p><ul><li>Success</li><li>Error</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>翻译标识：</p><ul><li>Success</li><li>Error</li></ul>
     * @param Status <p>翻译标识：</p><ul><li>Success</li><li>Error</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>源语言（如&quot;en&quot;）</p> 
     * @return TransSrc <p>源语言（如&quot;en&quot;）</p>
     */
    public String getTransSrc() {
        return this.TransSrc;
    }

    /**
     * Set <p>源语言（如&quot;en&quot;）</p>
     * @param TransSrc <p>源语言（如&quot;en&quot;）</p>
     */
    public void setTransSrc(String TransSrc) {
        this.TransSrc = TransSrc;
    }

    /**
     * Get <p>目标语言（如&quot;zh&quot;）</p> 
     * @return TransDst <p>目标语言（如&quot;zh&quot;）</p>
     */
    public String getTransDst() {
        return this.TransDst;
    }

    /**
     * Set <p>目标语言（如&quot;zh&quot;）</p>
     * @param TransDst <p>目标语言（如&quot;zh&quot;）</p>
     */
    public void setTransDst(String TransDst) {
        this.TransDst = TransDst;
    }

    /**
     * Get <p>字幕文件地址</p> 
     * @return Path <p>字幕文件地址</p>
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set <p>字幕文件地址</p>
     * @param Path <p>字幕文件地址</p>
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get <p>翻译字幕压制视频路径。</p> 
     * @return SubtitleEmbedPath <p>翻译字幕压制视频路径。</p>
     */
    public String getSubtitleEmbedPath() {
        return this.SubtitleEmbedPath;
    }

    /**
     * Set <p>翻译字幕压制视频路径。</p>
     * @param SubtitleEmbedPath <p>翻译字幕压制视频路径。</p>
     */
    public void setSubtitleEmbedPath(String SubtitleEmbedPath) {
        this.SubtitleEmbedPath = SubtitleEmbedPath;
    }

    public SubtitleTransResultItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubtitleTransResultItem(SubtitleTransResultItem source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.TransSrc != null) {
            this.TransSrc = new String(source.TransSrc);
        }
        if (source.TransDst != null) {
            this.TransDst = new String(source.TransDst);
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
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "TransSrc", this.TransSrc);
        this.setParamSimple(map, prefix + "TransDst", this.TransDst);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "SubtitleEmbedPath", this.SubtitleEmbedPath);

    }
}

