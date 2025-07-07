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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AnswerStat extends AbstractModel {

    /**
    * 选项（按照位表示是否选择，如0x1表示选择A，0x11表示选择AB）
    */
    @SerializedName("Answer")
    @Expose
    private Long Answer;

    /**
    * 答题人数
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
     * Get 选项（按照位表示是否选择，如0x1表示选择A，0x11表示选择AB） 
     * @return Answer 选项（按照位表示是否选择，如0x1表示选择A，0x11表示选择AB）
     */
    public Long getAnswer() {
        return this.Answer;
    }

    /**
     * Set 选项（按照位表示是否选择，如0x1表示选择A，0x11表示选择AB）
     * @param Answer 选项（按照位表示是否选择，如0x1表示选择A，0x11表示选择AB）
     */
    public void setAnswer(Long Answer) {
        this.Answer = Answer;
    }

    /**
     * Get 答题人数 
     * @return Count 答题人数
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 答题人数
     * @param Count 答题人数
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    public AnswerStat() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AnswerStat(AnswerStat source) {
        if (source.Answer != null) {
            this.Answer = new Long(source.Answer);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Answer", this.Answer);
        this.setParamSimple(map, prefix + "Count", this.Count);

    }
}

