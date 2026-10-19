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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AppVariableValue extends AbstractModel {

    /**
    * <p>变量ID</p>
    */
    @SerializedName("VariableId")
    @Expose
    private String VariableId;

    /**
    * <p>变量值</p>
    */
    @SerializedName("VariableValue")
    @Expose
    private String VariableValue;

    /**
     * Get <p>变量ID</p> 
     * @return VariableId <p>变量ID</p>
     */
    public String getVariableId() {
        return this.VariableId;
    }

    /**
     * Set <p>变量ID</p>
     * @param VariableId <p>变量ID</p>
     */
    public void setVariableId(String VariableId) {
        this.VariableId = VariableId;
    }

    /**
     * Get <p>变量值</p> 
     * @return VariableValue <p>变量值</p>
     */
    public String getVariableValue() {
        return this.VariableValue;
    }

    /**
     * Set <p>变量值</p>
     * @param VariableValue <p>变量值</p>
     */
    public void setVariableValue(String VariableValue) {
        this.VariableValue = VariableValue;
    }

    public AppVariableValue() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AppVariableValue(AppVariableValue source) {
        if (source.VariableId != null) {
            this.VariableId = new String(source.VariableId);
        }
        if (source.VariableValue != null) {
            this.VariableValue = new String(source.VariableValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VariableId", this.VariableId);
        this.setParamSimple(map, prefix + "VariableValue", this.VariableValue);

    }
}

