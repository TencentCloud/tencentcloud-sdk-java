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

public class TableLineagePair extends AbstractModel {

    /**
    * 血缘数据来源表
    */
    @SerializedName("Sources")
    @Expose
    private TableLineage [] Sources;

    /**
    * 血缘数据目标表
    */
    @SerializedName("Target")
    @Expose
    private TableLineage Target;

    /**
     * Get 血缘数据来源表 
     * @return Sources 血缘数据来源表
     */
    public TableLineage [] getSources() {
        return this.Sources;
    }

    /**
     * Set 血缘数据来源表
     * @param Sources 血缘数据来源表
     */
    public void setSources(TableLineage [] Sources) {
        this.Sources = Sources;
    }

    /**
     * Get 血缘数据目标表 
     * @return Target 血缘数据目标表
     */
    public TableLineage getTarget() {
        return this.Target;
    }

    /**
     * Set 血缘数据目标表
     * @param Target 血缘数据目标表
     */
    public void setTarget(TableLineage Target) {
        this.Target = Target;
    }

    public TableLineagePair() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TableLineagePair(TableLineagePair source) {
        if (source.Sources != null) {
            this.Sources = new TableLineage[source.Sources.length];
            for (int i = 0; i < source.Sources.length; i++) {
                this.Sources[i] = new TableLineage(source.Sources[i]);
            }
        }
        if (source.Target != null) {
            this.Target = new TableLineage(source.Target);
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

