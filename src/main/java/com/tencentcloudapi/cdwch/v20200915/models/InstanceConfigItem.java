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
package com.tencentcloudapi.cdwch.v20200915.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceConfigItem extends AbstractModel {

    /**
    * key
    */
    @SerializedName("ConfKey")
    @Expose
    private String ConfKey;

    /**
    * value
    */
    @SerializedName("ConfValue")
    @Expose
    private String ConfValue;

    /**
     * Get key 
     * @return ConfKey key
     */
    public String getConfKey() {
        return this.ConfKey;
    }

    /**
     * Set key
     * @param ConfKey key
     */
    public void setConfKey(String ConfKey) {
        this.ConfKey = ConfKey;
    }

    /**
     * Get value 
     * @return ConfValue value
     */
    public String getConfValue() {
        return this.ConfValue;
    }

    /**
     * Set value
     * @param ConfValue value
     */
    public void setConfValue(String ConfValue) {
        this.ConfValue = ConfValue;
    }

    public InstanceConfigItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceConfigItem(InstanceConfigItem source) {
        if (source.ConfKey != null) {
            this.ConfKey = new String(source.ConfKey);
        }
        if (source.ConfValue != null) {
            this.ConfValue = new String(source.ConfValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConfKey", this.ConfKey);
        this.setParamSimple(map, prefix + "ConfValue", this.ConfValue);

    }
}

