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
package com.tencentcloudapi.tci.v20190318.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Word extends AbstractModel{

    /**
    * 当前词的置信度
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * 当前单词语音的起始时间点，单位为ms
    */
    @SerializedName("Mbtm")
    @Expose
    private Long Mbtm;

    /**
    * 当前单词语音的终止时间点，单位为ms
    */
    @SerializedName("Metm")
    @Expose
    private Long Metm;

    /**
    * 当前词
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * 当前词的字节数
    */
    @SerializedName("Wsize")
    @Expose
    private Long Wsize;

    /**
     * Get 当前词的置信度 
     * @return Confidence 当前词的置信度
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set 当前词的置信度
     * @param Confidence 当前词的置信度
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get 当前单词语音的起始时间点，单位为ms 
     * @return Mbtm 当前单词语音的起始时间点，单位为ms
     */
    public Long getMbtm() {
        return this.Mbtm;
    }

    /**
     * Set 当前单词语音的起始时间点，单位为ms
     * @param Mbtm 当前单词语音的起始时间点，单位为ms
     */
    public void setMbtm(Long Mbtm) {
        this.Mbtm = Mbtm;
    }

    /**
     * Get 当前单词语音的终止时间点，单位为ms 
     * @return Metm 当前单词语音的终止时间点，单位为ms
     */
    public Long getMetm() {
        return this.Metm;
    }

    /**
     * Set 当前单词语音的终止时间点，单位为ms
     * @param Metm 当前单词语音的终止时间点，单位为ms
     */
    public void setMetm(Long Metm) {
        this.Metm = Metm;
    }

    /**
     * Get 当前词 
     * @return Text 当前词
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set 当前词
     * @param Text 当前词
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get 当前词的字节数 
     * @return Wsize 当前词的字节数
     */
    public Long getWsize() {
        return this.Wsize;
    }

    /**
     * Set 当前词的字节数
     * @param Wsize 当前词的字节数
     */
    public void setWsize(Long Wsize) {
        this.Wsize = Wsize;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamSimple(map, prefix + "Mbtm", this.Mbtm);
        this.setParamSimple(map, prefix + "Metm", this.Metm);
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "Wsize", this.Wsize);

    }
}

