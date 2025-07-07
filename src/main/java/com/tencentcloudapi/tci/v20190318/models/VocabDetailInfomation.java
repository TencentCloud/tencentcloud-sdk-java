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
package com.tencentcloudapi.tci.v20190318.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VocabDetailInfomation extends AbstractModel {

    /**
    * 词汇库中的单词出现在该音频中的那个句子的时间戳，出现了几次，就返回对应次数的起始和结束时间戳
    */
    @SerializedName("VocabDetailInfo")
    @Expose
    private DetailInfo [] VocabDetailInfo;

    /**
    * 词汇库名
    */
    @SerializedName("VocabLibName")
    @Expose
    private String VocabLibName;

    /**
     * Get 词汇库中的单词出现在该音频中的那个句子的时间戳，出现了几次，就返回对应次数的起始和结束时间戳 
     * @return VocabDetailInfo 词汇库中的单词出现在该音频中的那个句子的时间戳，出现了几次，就返回对应次数的起始和结束时间戳
     */
    public DetailInfo [] getVocabDetailInfo() {
        return this.VocabDetailInfo;
    }

    /**
     * Set 词汇库中的单词出现在该音频中的那个句子的时间戳，出现了几次，就返回对应次数的起始和结束时间戳
     * @param VocabDetailInfo 词汇库中的单词出现在该音频中的那个句子的时间戳，出现了几次，就返回对应次数的起始和结束时间戳
     */
    public void setVocabDetailInfo(DetailInfo [] VocabDetailInfo) {
        this.VocabDetailInfo = VocabDetailInfo;
    }

    /**
     * Get 词汇库名 
     * @return VocabLibName 词汇库名
     */
    public String getVocabLibName() {
        return this.VocabLibName;
    }

    /**
     * Set 词汇库名
     * @param VocabLibName 词汇库名
     */
    public void setVocabLibName(String VocabLibName) {
        this.VocabLibName = VocabLibName;
    }

    public VocabDetailInfomation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VocabDetailInfomation(VocabDetailInfomation source) {
        if (source.VocabDetailInfo != null) {
            this.VocabDetailInfo = new DetailInfo[source.VocabDetailInfo.length];
            for (int i = 0; i < source.VocabDetailInfo.length; i++) {
                this.VocabDetailInfo[i] = new DetailInfo(source.VocabDetailInfo[i]);
            }
        }
        if (source.VocabLibName != null) {
            this.VocabLibName = new String(source.VocabLibName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "VocabDetailInfo.", this.VocabDetailInfo);
        this.setParamSimple(map, prefix + "VocabLibName", this.VocabLibName);

    }
}

