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

public class KeyValueInt extends AbstractModel {

    /**
    * <p>键</p>
    */
    @SerializedName("Key")
    @Expose
    private Long Key;

    /**
    * <p>值</p>
    */
    @SerializedName("Value")
    @Expose
    private Long Value;

    /**
     * Get <p>键</p> 
     * @return Key <p>键</p>
     */
    public Long getKey() {
        return this.Key;
    }

    /**
     * Set <p>键</p>
     * @param Key <p>键</p>
     */
    public void setKey(Long Key) {
        this.Key = Key;
    }

    /**
     * Get <p>值</p> 
     * @return Value <p>值</p>
     */
    public Long getValue() {
        return this.Value;
    }

    /**
     * Set <p>值</p>
     * @param Value <p>值</p>
     */
    public void setValue(Long Value) {
        this.Value = Value;
    }

    public KeyValueInt() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KeyValueInt(KeyValueInt source) {
        if (source.Key != null) {
            this.Key = new Long(source.Key);
        }
        if (source.Value != null) {
            this.Value = new Long(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

