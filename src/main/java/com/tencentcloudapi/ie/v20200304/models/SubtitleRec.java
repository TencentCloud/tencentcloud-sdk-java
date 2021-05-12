/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.ie.v20200304.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubtitleRec extends AbstractModel{

    /**
    * 语音识别：
zh：中文
en：英文
    */
    @SerializedName("AsrDst")
    @Expose
    private String AsrDst;

    /**
    * 翻译识别：
zh：中文
en：英文
    */
    @SerializedName("TransDst")
    @Expose
    private String TransDst;

    /**
     * Get 语音识别：
zh：中文
en：英文 
     * @return AsrDst 语音识别：
zh：中文
en：英文
     */
    public String getAsrDst() {
        return this.AsrDst;
    }

    /**
     * Set 语音识别：
zh：中文
en：英文
     * @param AsrDst 语音识别：
zh：中文
en：英文
     */
    public void setAsrDst(String AsrDst) {
        this.AsrDst = AsrDst;
    }

    /**
     * Get 翻译识别：
zh：中文
en：英文 
     * @return TransDst 翻译识别：
zh：中文
en：英文
     */
    public String getTransDst() {
        return this.TransDst;
    }

    /**
     * Set 翻译识别：
zh：中文
en：英文
     * @param TransDst 翻译识别：
zh：中文
en：英文
     */
    public void setTransDst(String TransDst) {
        this.TransDst = TransDst;
    }

    public SubtitleRec() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubtitleRec(SubtitleRec source) {
        if (source.AsrDst != null) {
            this.AsrDst = new String(source.AsrDst);
        }
        if (source.TransDst != null) {
            this.TransDst = new String(source.TransDst);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AsrDst", this.AsrDst);
        this.setParamSimple(map, prefix + "TransDst", this.TransDst);

    }
}

