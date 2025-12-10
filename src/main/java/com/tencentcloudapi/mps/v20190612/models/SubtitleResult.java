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
    * 字幕文件语言
    */
    @SerializedName("Language")
    @Expose
    private String Language;

    /**
    * 处理是否成功
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 字幕文件地址
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
     * Get 字幕文件语言 
     * @return Language 字幕文件语言
     */
    public String getLanguage() {
        return this.Language;
    }

    /**
     * Set 字幕文件语言
     * @param Language 字幕文件语言
     */
    public void setLanguage(String Language) {
        this.Language = Language;
    }

    /**
     * Get 处理是否成功 
     * @return Status 处理是否成功
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 处理是否成功
     * @param Status 处理是否成功
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 字幕文件地址 
     * @return Path 字幕文件地址
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set 字幕文件地址
     * @param Path 字幕文件地址
     */
    public void setPath(String Path) {
        this.Path = Path;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Language", this.Language);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Path", this.Path);

    }
}

