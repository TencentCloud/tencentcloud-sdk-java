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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HotWord extends AbstractModel {

    /**
    * <p>热词</p>
    */
    @SerializedName("Word")
    @Expose
    private String Word;

    /**
    * <p>权重</p>
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
     * Get <p>热词</p> 
     * @return Word <p>热词</p>
     */
    public String getWord() {
        return this.Word;
    }

    /**
     * Set <p>热词</p>
     * @param Word <p>热词</p>
     */
    public void setWord(String Word) {
        this.Word = Word;
    }

    /**
     * Get <p>权重</p> 
     * @return Weight <p>权重</p>
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set <p>权重</p>
     * @param Weight <p>权重</p>
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    public HotWord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HotWord(HotWord source) {
        if (source.Word != null) {
            this.Word = new String(source.Word);
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Word", this.Word);
        this.setParamSimple(map, prefix + "Weight", this.Weight);

    }
}

