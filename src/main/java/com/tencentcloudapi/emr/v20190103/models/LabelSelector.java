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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LabelSelector extends AbstractModel {

    /**
    * <p>标签精确匹配条件</p>
    */
    @SerializedName("MatchLabels")
    @Expose
    private StringMap [] MatchLabels;

    /**
    * <p>标签表达式匹配条件</p>
    */
    @SerializedName("MatchExpressions")
    @Expose
    private LabelSelectorRequirement [] MatchExpressions;

    /**
     * Get <p>标签精确匹配条件</p> 
     * @return MatchLabels <p>标签精确匹配条件</p>
     */
    public StringMap [] getMatchLabels() {
        return this.MatchLabels;
    }

    /**
     * Set <p>标签精确匹配条件</p>
     * @param MatchLabels <p>标签精确匹配条件</p>
     */
    public void setMatchLabels(StringMap [] MatchLabels) {
        this.MatchLabels = MatchLabels;
    }

    /**
     * Get <p>标签表达式匹配条件</p> 
     * @return MatchExpressions <p>标签表达式匹配条件</p>
     */
    public LabelSelectorRequirement [] getMatchExpressions() {
        return this.MatchExpressions;
    }

    /**
     * Set <p>标签表达式匹配条件</p>
     * @param MatchExpressions <p>标签表达式匹配条件</p>
     */
    public void setMatchExpressions(LabelSelectorRequirement [] MatchExpressions) {
        this.MatchExpressions = MatchExpressions;
    }

    public LabelSelector() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LabelSelector(LabelSelector source) {
        if (source.MatchLabels != null) {
            this.MatchLabels = new StringMap[source.MatchLabels.length];
            for (int i = 0; i < source.MatchLabels.length; i++) {
                this.MatchLabels[i] = new StringMap(source.MatchLabels[i]);
            }
        }
        if (source.MatchExpressions != null) {
            this.MatchExpressions = new LabelSelectorRequirement[source.MatchExpressions.length];
            for (int i = 0; i < source.MatchExpressions.length; i++) {
                this.MatchExpressions[i] = new LabelSelectorRequirement(source.MatchExpressions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "MatchLabels.", this.MatchLabels);
        this.setParamArrayObj(map, prefix + "MatchExpressions.", this.MatchExpressions);

    }
}

