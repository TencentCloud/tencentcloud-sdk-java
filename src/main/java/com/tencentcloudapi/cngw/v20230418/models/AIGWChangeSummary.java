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
package com.tencentcloudapi.cngw.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AIGWChangeSummary extends AbstractModel {

    /**
    * <p>破坏性变更数</p>
    */
    @SerializedName("Breaking")
    @Expose
    private Long Breaking;

    /**
    * <p>兼容性变更数</p>
    */
    @SerializedName("Compatible")
    @Expose
    private Long Compatible;

    /**
     * Get <p>破坏性变更数</p> 
     * @return Breaking <p>破坏性变更数</p>
     */
    public Long getBreaking() {
        return this.Breaking;
    }

    /**
     * Set <p>破坏性变更数</p>
     * @param Breaking <p>破坏性变更数</p>
     */
    public void setBreaking(Long Breaking) {
        this.Breaking = Breaking;
    }

    /**
     * Get <p>兼容性变更数</p> 
     * @return Compatible <p>兼容性变更数</p>
     */
    public Long getCompatible() {
        return this.Compatible;
    }

    /**
     * Set <p>兼容性变更数</p>
     * @param Compatible <p>兼容性变更数</p>
     */
    public void setCompatible(Long Compatible) {
        this.Compatible = Compatible;
    }

    public AIGWChangeSummary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIGWChangeSummary(AIGWChangeSummary source) {
        if (source.Breaking != null) {
            this.Breaking = new Long(source.Breaking);
        }
        if (source.Compatible != null) {
            this.Compatible = new Long(source.Compatible);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Breaking", this.Breaking);
        this.setParamSimple(map, prefix + "Compatible", this.Compatible);

    }
}

