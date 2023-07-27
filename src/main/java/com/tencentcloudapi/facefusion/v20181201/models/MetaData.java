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
package com.tencentcloudapi.facefusion.v20181201.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MetaData extends AbstractModel{

    /**
    * MetaData的Key
    */
    @SerializedName("MetaKey")
    @Expose
    private String MetaKey;

    /**
    * MetaData的Value
    */
    @SerializedName("MetaValue")
    @Expose
    private String MetaValue;

    /**
     * Get MetaData的Key 
     * @return MetaKey MetaData的Key
     */
    public String getMetaKey() {
        return this.MetaKey;
    }

    /**
     * Set MetaData的Key
     * @param MetaKey MetaData的Key
     */
    public void setMetaKey(String MetaKey) {
        this.MetaKey = MetaKey;
    }

    /**
     * Get MetaData的Value 
     * @return MetaValue MetaData的Value
     */
    public String getMetaValue() {
        return this.MetaValue;
    }

    /**
     * Set MetaData的Value
     * @param MetaValue MetaData的Value
     */
    public void setMetaValue(String MetaValue) {
        this.MetaValue = MetaValue;
    }

    public MetaData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MetaData(MetaData source) {
        if (source.MetaKey != null) {
            this.MetaKey = new String(source.MetaKey);
        }
        if (source.MetaValue != null) {
            this.MetaValue = new String(source.MetaValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MetaKey", this.MetaKey);
        this.setParamSimple(map, prefix + "MetaValue", this.MetaValue);

    }
}

