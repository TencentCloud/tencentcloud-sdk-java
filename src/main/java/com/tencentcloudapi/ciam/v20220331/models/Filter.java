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
package com.tencentcloudapi.ciam.v20220331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Filter extends AbstractModel{

    /**
    * key值
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * value值
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
    * 逻辑值
    */
    @SerializedName("Logic")
    @Expose
    private Boolean Logic;

    /**
     * Get key值 
     * @return Key key值
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set key值
     * @param Key key值
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get value值 
     * @return Values value值
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set value值
     * @param Values value值
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    /**
     * Get 逻辑值 
     * @return Logic 逻辑值
     */
    public Boolean getLogic() {
        return this.Logic;
    }

    /**
     * Set 逻辑值
     * @param Logic 逻辑值
     */
    public void setLogic(Boolean Logic) {
        this.Logic = Logic;
    }

    public Filter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Filter(Filter source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Values != null) {
            this.Values = new String[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new String(source.Values[i]);
            }
        }
        if (source.Logic != null) {
            this.Logic = new Boolean(source.Logic);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);
        this.setParamSimple(map, prefix + "Logic", this.Logic);

    }
}

