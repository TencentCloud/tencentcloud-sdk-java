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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Option extends AbstractModel {

    /**
    * <p>指标名</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>指标值</p>
    */
    @SerializedName("Value")
    @Expose
    private Long Value;

    /**
     * Get <p>指标名</p> 
     * @return Name <p>指标名</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>指标名</p>
     * @param Name <p>指标名</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>指标值</p> 
     * @return Value <p>指标值</p>
     */
    public Long getValue() {
        return this.Value;
    }

    /**
     * Set <p>指标值</p>
     * @param Value <p>指标值</p>
     */
    public void setValue(Long Value) {
        this.Value = Value;
    }

    public Option() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Option(Option source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Value != null) {
            this.Value = new Long(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

