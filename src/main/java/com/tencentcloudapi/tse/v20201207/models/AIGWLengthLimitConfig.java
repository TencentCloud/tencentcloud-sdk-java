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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AIGWLengthLimitConfig extends AbstractModel {

    /**
    * <p>是否开启输入限制</p>
    */
    @SerializedName("EnableInputLimit")
    @Expose
    private Boolean EnableInputLimit;

    /**
    * <p>最大输入字符数</p>
    */
    @SerializedName("MaxInputChars")
    @Expose
    private Long MaxInputChars;

    /**
     * Get <p>是否开启输入限制</p> 
     * @return EnableInputLimit <p>是否开启输入限制</p>
     */
    public Boolean getEnableInputLimit() {
        return this.EnableInputLimit;
    }

    /**
     * Set <p>是否开启输入限制</p>
     * @param EnableInputLimit <p>是否开启输入限制</p>
     */
    public void setEnableInputLimit(Boolean EnableInputLimit) {
        this.EnableInputLimit = EnableInputLimit;
    }

    /**
     * Get <p>最大输入字符数</p> 
     * @return MaxInputChars <p>最大输入字符数</p>
     */
    public Long getMaxInputChars() {
        return this.MaxInputChars;
    }

    /**
     * Set <p>最大输入字符数</p>
     * @param MaxInputChars <p>最大输入字符数</p>
     */
    public void setMaxInputChars(Long MaxInputChars) {
        this.MaxInputChars = MaxInputChars;
    }

    public AIGWLengthLimitConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIGWLengthLimitConfig(AIGWLengthLimitConfig source) {
        if (source.EnableInputLimit != null) {
            this.EnableInputLimit = new Boolean(source.EnableInputLimit);
        }
        if (source.MaxInputChars != null) {
            this.MaxInputChars = new Long(source.MaxInputChars);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnableInputLimit", this.EnableInputLimit);
        this.setParamSimple(map, prefix + "MaxInputChars", this.MaxInputChars);

    }
}

