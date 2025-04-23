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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WordResult extends AbstractModel {

    /**
    * 字词文本。
    */
    @SerializedName("Word")
    @Expose
    private String Word;

    /**
    * 字词起始时间戳，单位秒。
    */
    @SerializedName("Start")
    @Expose
    private Float Start;

    /**
    * 字词结束时间戳，单位秒。
    */
    @SerializedName("End")
    @Expose
    private Float End;

    /**
    * 翻译文本
    */
    @SerializedName("Trans")
    @Expose
    private String Trans;

    /**
     * Get 字词文本。 
     * @return Word 字词文本。
     */
    public String getWord() {
        return this.Word;
    }

    /**
     * Set 字词文本。
     * @param Word 字词文本。
     */
    public void setWord(String Word) {
        this.Word = Word;
    }

    /**
     * Get 字词起始时间戳，单位秒。 
     * @return Start 字词起始时间戳，单位秒。
     */
    public Float getStart() {
        return this.Start;
    }

    /**
     * Set 字词起始时间戳，单位秒。
     * @param Start 字词起始时间戳，单位秒。
     */
    public void setStart(Float Start) {
        this.Start = Start;
    }

    /**
     * Get 字词结束时间戳，单位秒。 
     * @return End 字词结束时间戳，单位秒。
     */
    public Float getEnd() {
        return this.End;
    }

    /**
     * Set 字词结束时间戳，单位秒。
     * @param End 字词结束时间戳，单位秒。
     */
    public void setEnd(Float End) {
        this.End = End;
    }

    /**
     * Get 翻译文本 
     * @return Trans 翻译文本
     */
    public String getTrans() {
        return this.Trans;
    }

    /**
     * Set 翻译文本
     * @param Trans 翻译文本
     */
    public void setTrans(String Trans) {
        this.Trans = Trans;
    }

    public WordResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WordResult(WordResult source) {
        if (source.Word != null) {
            this.Word = new String(source.Word);
        }
        if (source.Start != null) {
            this.Start = new Float(source.Start);
        }
        if (source.End != null) {
            this.End = new Float(source.End);
        }
        if (source.Trans != null) {
            this.Trans = new String(source.Trans);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Word", this.Word);
        this.setParamSimple(map, prefix + "Start", this.Start);
        this.setParamSimple(map, prefix + "End", this.End);
        this.setParamSimple(map, prefix + "Trans", this.Trans);

    }
}

