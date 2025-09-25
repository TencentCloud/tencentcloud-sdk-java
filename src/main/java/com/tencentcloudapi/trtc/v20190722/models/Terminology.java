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

public class Terminology extends AbstractModel {

    /**
    * 源术语
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * 目标术语翻译结果
    */
    @SerializedName("Target")
    @Expose
    private String Target;

    /**
     * Get 源术语 
     * @return Source 源术语
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 源术语
     * @param Source 源术语
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get 目标术语翻译结果 
     * @return Target 目标术语翻译结果
     */
    public String getTarget() {
        return this.Target;
    }

    /**
     * Set 目标术语翻译结果
     * @param Target 目标术语翻译结果
     */
    public void setTarget(String Target) {
        this.Target = Target;
    }

    public Terminology() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Terminology(Terminology source) {
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.Target != null) {
            this.Target = new String(source.Target);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Target", this.Target);

    }
}

