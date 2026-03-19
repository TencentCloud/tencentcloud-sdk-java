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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SeeEventIdFilterConfig extends AbstractModel {

    /**
    * 包含的云存事件 ID 集合
    */
    @SerializedName("IncludeOnly")
    @Expose
    private String [] IncludeOnly;

    /**
    * 排除的云存事件 ID 集合
    */
    @SerializedName("Exclude")
    @Expose
    private String [] Exclude;

    /**
     * Get 包含的云存事件 ID 集合 
     * @return IncludeOnly 包含的云存事件 ID 集合
     */
    public String [] getIncludeOnly() {
        return this.IncludeOnly;
    }

    /**
     * Set 包含的云存事件 ID 集合
     * @param IncludeOnly 包含的云存事件 ID 集合
     */
    public void setIncludeOnly(String [] IncludeOnly) {
        this.IncludeOnly = IncludeOnly;
    }

    /**
     * Get 排除的云存事件 ID 集合 
     * @return Exclude 排除的云存事件 ID 集合
     */
    public String [] getExclude() {
        return this.Exclude;
    }

    /**
     * Set 排除的云存事件 ID 集合
     * @param Exclude 排除的云存事件 ID 集合
     */
    public void setExclude(String [] Exclude) {
        this.Exclude = Exclude;
    }

    public SeeEventIdFilterConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SeeEventIdFilterConfig(SeeEventIdFilterConfig source) {
        if (source.IncludeOnly != null) {
            this.IncludeOnly = new String[source.IncludeOnly.length];
            for (int i = 0; i < source.IncludeOnly.length; i++) {
                this.IncludeOnly[i] = new String(source.IncludeOnly[i]);
            }
        }
        if (source.Exclude != null) {
            this.Exclude = new String[source.Exclude.length];
            for (int i = 0; i < source.Exclude.length; i++) {
                this.Exclude[i] = new String(source.Exclude[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "IncludeOnly.", this.IncludeOnly);
        this.setParamArraySimple(map, prefix + "Exclude.", this.Exclude);

    }
}

