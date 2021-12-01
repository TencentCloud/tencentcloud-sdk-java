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
package com.tencentcloudapi.ivld.v20210903.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AudioInfo extends AbstractModel{

    /**
    * ASR提取的文字信息
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * ASR起始时间戳，从0开始
    */
    @SerializedName("StartTimeStamp")
    @Expose
    private Float StartTimeStamp;

    /**
    * ASR结束时间戳，从0开始
    */
    @SerializedName("EndTimeStamp")
    @Expose
    private Float EndTimeStamp;

    /**
    * ASR提取的音频标签
    */
    @SerializedName("Tag")
    @Expose
    private String Tag;

    /**
     * Get ASR提取的文字信息 
     * @return Content ASR提取的文字信息
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set ASR提取的文字信息
     * @param Content ASR提取的文字信息
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get ASR起始时间戳，从0开始 
     * @return StartTimeStamp ASR起始时间戳，从0开始
     */
    public Float getStartTimeStamp() {
        return this.StartTimeStamp;
    }

    /**
     * Set ASR起始时间戳，从0开始
     * @param StartTimeStamp ASR起始时间戳，从0开始
     */
    public void setStartTimeStamp(Float StartTimeStamp) {
        this.StartTimeStamp = StartTimeStamp;
    }

    /**
     * Get ASR结束时间戳，从0开始 
     * @return EndTimeStamp ASR结束时间戳，从0开始
     */
    public Float getEndTimeStamp() {
        return this.EndTimeStamp;
    }

    /**
     * Set ASR结束时间戳，从0开始
     * @param EndTimeStamp ASR结束时间戳，从0开始
     */
    public void setEndTimeStamp(Float EndTimeStamp) {
        this.EndTimeStamp = EndTimeStamp;
    }

    /**
     * Get ASR提取的音频标签 
     * @return Tag ASR提取的音频标签
     */
    public String getTag() {
        return this.Tag;
    }

    /**
     * Set ASR提取的音频标签
     * @param Tag ASR提取的音频标签
     */
    public void setTag(String Tag) {
        this.Tag = Tag;
    }

    public AudioInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AudioInfo(AudioInfo source) {
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.StartTimeStamp != null) {
            this.StartTimeStamp = new Float(source.StartTimeStamp);
        }
        if (source.EndTimeStamp != null) {
            this.EndTimeStamp = new Float(source.EndTimeStamp);
        }
        if (source.Tag != null) {
            this.Tag = new String(source.Tag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "StartTimeStamp", this.StartTimeStamp);
        this.setParamSimple(map, prefix + "EndTimeStamp", this.EndTimeStamp);
        this.setParamSimple(map, prefix + "Tag", this.Tag);

    }
}

