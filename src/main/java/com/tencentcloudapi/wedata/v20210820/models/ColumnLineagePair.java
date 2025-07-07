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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ColumnLineagePair extends AbstractModel {

    /**
    * 列血缘来源方
    */
    @SerializedName("Sources")
    @Expose
    private ColumnLineage [] Sources;

    /**
    * 列血缘目标方
    */
    @SerializedName("Target")
    @Expose
    private ColumnLineage Target;

    /**
     * Get 列血缘来源方 
     * @return Sources 列血缘来源方
     */
    public ColumnLineage [] getSources() {
        return this.Sources;
    }

    /**
     * Set 列血缘来源方
     * @param Sources 列血缘来源方
     */
    public void setSources(ColumnLineage [] Sources) {
        this.Sources = Sources;
    }

    /**
     * Get 列血缘目标方 
     * @return Target 列血缘目标方
     */
    public ColumnLineage getTarget() {
        return this.Target;
    }

    /**
     * Set 列血缘目标方
     * @param Target 列血缘目标方
     */
    public void setTarget(ColumnLineage Target) {
        this.Target = Target;
    }

    public ColumnLineagePair() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ColumnLineagePair(ColumnLineagePair source) {
        if (source.Sources != null) {
            this.Sources = new ColumnLineage[source.Sources.length];
            for (int i = 0; i < source.Sources.length; i++) {
                this.Sources[i] = new ColumnLineage(source.Sources[i]);
            }
        }
        if (source.Target != null) {
            this.Target = new ColumnLineage(source.Target);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Sources.", this.Sources);
        this.setParamObj(map, prefix + "Target.", this.Target);

    }
}

