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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AnalyseAmountDetail extends AbstractModel {

    /**
    * 费用类型
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 是否展示
    */
    @SerializedName("Display")
    @Expose
    private Long Display;

    /**
     * Get 费用类型 
     * @return Key 费用类型
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 费用类型
     * @param Key 费用类型
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 是否展示 
     * @return Display 是否展示
     */
    public Long getDisplay() {
        return this.Display;
    }

    /**
     * Set 是否展示
     * @param Display 是否展示
     */
    public void setDisplay(Long Display) {
        this.Display = Display;
    }

    public AnalyseAmountDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AnalyseAmountDetail(AnalyseAmountDetail source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Display != null) {
            this.Display = new Long(source.Display);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Display", this.Display);

    }
}

