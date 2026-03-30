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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LLMSensitiveValueLevel extends AbstractModel {

    /**
    * 敏感数据标签，如政治、色情
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * 敏感数据等级，250,300，400分别代表超严格、严格、标准等级
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
     * Get 敏感数据标签，如政治、色情 
     * @return Label 敏感数据标签，如政治、色情
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set 敏感数据标签，如政治、色情
     * @param Label 敏感数据标签，如政治、色情
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get 敏感数据等级，250,300，400分别代表超严格、严格、标准等级 
     * @return Level 敏感数据等级，250,300，400分别代表超严格、严格、标准等级
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set 敏感数据等级，250,300，400分别代表超严格、严格、标准等级
     * @param Level 敏感数据等级，250,300，400分别代表超严格、严格、标准等级
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    public LLMSensitiveValueLevel() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LLMSensitiveValueLevel(LLMSensitiveValueLevel source) {
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "Level", this.Level);

    }
}

