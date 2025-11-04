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
    * 翻译标识：
- Success
- Error
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 源语言（如"en"）
    */
    @SerializedName("TransSrc")
    @Expose
    private String TransSrc;

    /**
    * 目标语言（如"zh"）
    */
    @SerializedName("TransDst")
    @Expose
    private String TransDst;

    /**
    * 字幕文件地址
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
     * Get 翻译标识：
- Success
- Error 
     * @return Status 翻译标识：
- Success
- Error
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 翻译标识：
- Success
- Error
     * @param Status 翻译标识：
- Success
- Error
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 源语言（如"en"） 
     * @return TransSrc 源语言（如"en"）
     */
    public String getTransSrc() {
        return this.TransSrc;
    }

    /**
     * Set 源语言（如"en"）
     * @param TransSrc 源语言（如"en"）
     */
    public void setTransSrc(String TransSrc) {
        this.TransSrc = TransSrc;
    }

    /**
     * Get 目标语言（如"zh"） 
     * @return TransDst 目标语言（如"zh"）
     */
    public String getTransDst() {
        return this.TransDst;
    }

    /**
     * Set 目标语言（如"zh"）
     * @param TransDst 目标语言（如"zh"）
     */
    public void setTransDst(String TransDst) {
        this.TransDst = TransDst;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "TransSrc", this.TransSrc);
        this.setParamSimple(map, prefix + "TransDst", this.TransDst);
        this.setParamSimple(map, prefix + "Path", this.Path);

    }
}

