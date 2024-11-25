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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReRankDataObject extends AbstractModel {

    /**
    * 第一段内容
    */
    @SerializedName("PromptA")
    @Expose
    private String PromptA;

    /**
    * 第二段内容
    */
    @SerializedName("PromptB")
    @Expose
    private String PromptB;

    /**
     * Get 第一段内容 
     * @return PromptA 第一段内容
     */
    public String getPromptA() {
        return this.PromptA;
    }

    /**
     * Set 第一段内容
     * @param PromptA 第一段内容
     */
    public void setPromptA(String PromptA) {
        this.PromptA = PromptA;
    }

    /**
     * Get 第二段内容 
     * @return PromptB 第二段内容
     */
    public String getPromptB() {
        return this.PromptB;
    }

    /**
     * Set 第二段内容
     * @param PromptB 第二段内容
     */
    public void setPromptB(String PromptB) {
        this.PromptB = PromptB;
    }

    public ReRankDataObject() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReRankDataObject(ReRankDataObject source) {
        if (source.PromptA != null) {
            this.PromptA = new String(source.PromptA);
        }
        if (source.PromptB != null) {
            this.PromptB = new String(source.PromptB);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PromptA", this.PromptA);
        this.setParamSimple(map, prefix + "PromptB", this.PromptB);

    }
}

