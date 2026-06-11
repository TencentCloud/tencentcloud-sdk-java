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

public class TermPair extends AbstractModel {

    /**
    * <p>源术语。</p>
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * <p>目标术语翻译结果。</p>
    */
    @SerializedName("Target")
    @Expose
    private String Target;

    /**
     * Get <p>源术语。</p> 
     * @return Source <p>源术语。</p>
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set <p>源术语。</p>
     * @param Source <p>源术语。</p>
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get <p>目标术语翻译结果。</p> 
     * @return Target <p>目标术语翻译结果。</p>
     */
    public String getTarget() {
        return this.Target;
    }

    /**
     * Set <p>目标术语翻译结果。</p>
     * @param Target <p>目标术语翻译结果。</p>
     */
    public void setTarget(String Target) {
        this.Target = Target;
    }

    public TermPair() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TermPair(TermPair source) {
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

