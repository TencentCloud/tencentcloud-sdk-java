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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IntKeyValue extends AbstractModel {

    /**
    * <p>键，如 error / session</p>
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * <p>整型值</p>
    */
    @SerializedName("Value")
    @Expose
    private Long Value;

    /**
     * Get <p>键，如 error / session</p> 
     * @return Key <p>键，如 error / session</p>
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set <p>键，如 error / session</p>
     * @param Key <p>键，如 error / session</p>
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get <p>整型值</p> 
     * @return Value <p>整型值</p>
     */
    public Long getValue() {
        return this.Value;
    }

    /**
     * Set <p>整型值</p>
     * @param Value <p>整型值</p>
     */
    public void setValue(Long Value) {
        this.Value = Value;
    }

    public IntKeyValue() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IntKeyValue(IntKeyValue source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
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

