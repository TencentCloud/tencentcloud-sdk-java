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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LevelOption extends AbstractModel {

    /**
    * 告警/风险类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 告警等级 (1: 提示, 2: 低危, 3: 中危, 4: 高危, 5: 严重)
    */
    @SerializedName("Level")
    @Expose
    private Long [] Level;

    /**
     * Get 告警/风险类型 
     * @return Type 告警/风险类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 告警/风险类型
     * @param Type 告警/风险类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 告警等级 (1: 提示, 2: 低危, 3: 中危, 4: 高危, 5: 严重) 
     * @return Level 告警等级 (1: 提示, 2: 低危, 3: 中危, 4: 高危, 5: 严重)
     */
    public Long [] getLevel() {
        return this.Level;
    }

    /**
     * Set 告警等级 (1: 提示, 2: 低危, 3: 中危, 4: 高危, 5: 严重)
     * @param Level 告警等级 (1: 提示, 2: 低危, 3: 中危, 4: 高危, 5: 严重)
     */
    public void setLevel(Long [] Level) {
        this.Level = Level;
    }

    public LevelOption() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LevelOption(LevelOption source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Level != null) {
            this.Level = new Long[source.Level.length];
            for (int i = 0; i < source.Level.length; i++) {
                this.Level[i] = new Long(source.Level[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArraySimple(map, prefix + "Level.", this.Level);

    }
}

