/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TopInfo extends AbstractModel{

    /**
    * top统计数据，如ip、漏洞名等
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * top统计计数
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
     * Get top统计数据，如ip、漏洞名等 
     * @return Value top统计数据，如ip、漏洞名等
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set top统计数据，如ip、漏洞名等
     * @param Value top统计数据，如ip、漏洞名等
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get top统计计数 
     * @return Count top统计计数
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set top统计计数
     * @param Count top统计计数
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    public TopInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TopInfo(TopInfo source) {
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Count", this.Count);

    }
}

