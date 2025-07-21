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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ToneWordInfo extends AbstractModel {

    /**
    * 首句超时时间，单位秒
    */
    @SerializedName("FirstSentenceTimeout")
    @Expose
    private Float FirstSentenceTimeout;

    /**
    * 承接语气词
    */
    @SerializedName("ZHToneWords")
    @Expose
    private ZHToneWordsInfo ZHToneWords;

    /**
     * Get 首句超时时间，单位秒 
     * @return FirstSentenceTimeout 首句超时时间，单位秒
     */
    public Float getFirstSentenceTimeout() {
        return this.FirstSentenceTimeout;
    }

    /**
     * Set 首句超时时间，单位秒
     * @param FirstSentenceTimeout 首句超时时间，单位秒
     */
    public void setFirstSentenceTimeout(Float FirstSentenceTimeout) {
        this.FirstSentenceTimeout = FirstSentenceTimeout;
    }

    /**
     * Get 承接语气词 
     * @return ZHToneWords 承接语气词
     */
    public ZHToneWordsInfo getZHToneWords() {
        return this.ZHToneWords;
    }

    /**
     * Set 承接语气词
     * @param ZHToneWords 承接语气词
     */
    public void setZHToneWords(ZHToneWordsInfo ZHToneWords) {
        this.ZHToneWords = ZHToneWords;
    }

    public ToneWordInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ToneWordInfo(ToneWordInfo source) {
        if (source.FirstSentenceTimeout != null) {
            this.FirstSentenceTimeout = new Float(source.FirstSentenceTimeout);
        }
        if (source.ZHToneWords != null) {
            this.ZHToneWords = new ZHToneWordsInfo(source.ZHToneWords);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FirstSentenceTimeout", this.FirstSentenceTimeout);
        this.setParamObj(map, prefix + "ZHToneWords.", this.ZHToneWords);

    }
}

