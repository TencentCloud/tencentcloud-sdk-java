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
package com.tencentcloudapi.asr.v20190614.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SentenceWord extends AbstractModel{

    /**
    * 词结果
    */
    @SerializedName("Word")
    @Expose
    private String Word;

    /**
    * 词在音频中的开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 词在音频中的结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
     * Get 词结果 
     * @return Word 词结果
     */
    public String getWord() {
        return this.Word;
    }

    /**
     * Set 词结果
     * @param Word 词结果
     */
    public void setWord(String Word) {
        this.Word = Word;
    }

    /**
     * Get 词在音频中的开始时间 
     * @return StartTime 词在音频中的开始时间
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 词在音频中的开始时间
     * @param StartTime 词在音频中的开始时间
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 词在音频中的结束时间 
     * @return EndTime 词在音频中的结束时间
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 词在音频中的结束时间
     * @param EndTime 词在音频中的结束时间
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    public SentenceWord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SentenceWord(SentenceWord source) {
        if (source.Word != null) {
            this.Word = new String(source.Word);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Word", this.Word);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

