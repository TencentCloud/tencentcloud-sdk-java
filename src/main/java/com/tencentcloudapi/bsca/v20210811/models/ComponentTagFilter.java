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
package com.tencentcloudapi.bsca.v20210811.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ComponentTagFilter extends AbstractModel {

    /**
    * 包括的Tag

    */
    @SerializedName("IncludeTags")
    @Expose
    private String [] IncludeTags;

    /**
    * 排除的Tag
    */
    @SerializedName("ExcludeTags")
    @Expose
    private String [] ExcludeTags;

    /**
     * Get 包括的Tag
 
     * @return IncludeTags 包括的Tag

     */
    public String [] getIncludeTags() {
        return this.IncludeTags;
    }

    /**
     * Set 包括的Tag

     * @param IncludeTags 包括的Tag

     */
    public void setIncludeTags(String [] IncludeTags) {
        this.IncludeTags = IncludeTags;
    }

    /**
     * Get 排除的Tag 
     * @return ExcludeTags 排除的Tag
     */
    public String [] getExcludeTags() {
        return this.ExcludeTags;
    }

    /**
     * Set 排除的Tag
     * @param ExcludeTags 排除的Tag
     */
    public void setExcludeTags(String [] ExcludeTags) {
        this.ExcludeTags = ExcludeTags;
    }

    public ComponentTagFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComponentTagFilter(ComponentTagFilter source) {
        if (source.IncludeTags != null) {
            this.IncludeTags = new String[source.IncludeTags.length];
            for (int i = 0; i < source.IncludeTags.length; i++) {
                this.IncludeTags[i] = new String(source.IncludeTags[i]);
            }
        }
        if (source.ExcludeTags != null) {
            this.ExcludeTags = new String[source.ExcludeTags.length];
            for (int i = 0; i < source.ExcludeTags.length; i++) {
                this.ExcludeTags[i] = new String(source.ExcludeTags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "IncludeTags.", this.IncludeTags);
        this.setParamArraySimple(map, prefix + "ExcludeTags.", this.ExcludeTags);

    }
}

