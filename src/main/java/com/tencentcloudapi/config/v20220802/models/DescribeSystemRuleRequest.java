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
package com.tencentcloudapi.config.v20220802.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSystemRuleRequest extends AbstractModel {

    /**
    * 规则唯一标识
    */
    @SerializedName("Identifier")
    @Expose
    private String Identifier;

    /**
     * Get 规则唯一标识 
     * @return Identifier 规则唯一标识
     */
    public String getIdentifier() {
        return this.Identifier;
    }

    /**
     * Set 规则唯一标识
     * @param Identifier 规则唯一标识
     */
    public void setIdentifier(String Identifier) {
        this.Identifier = Identifier;
    }

    public DescribeSystemRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSystemRuleRequest(DescribeSystemRuleRequest source) {
        if (source.Identifier != null) {
            this.Identifier = new String(source.Identifier);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Identifier", this.Identifier);

    }
}

