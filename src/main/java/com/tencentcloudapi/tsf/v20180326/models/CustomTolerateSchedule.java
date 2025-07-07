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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CustomTolerateSchedule extends AbstractModel {

    /**
    * -
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * -
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * -
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * -
    */
    @SerializedName("Effect")
    @Expose
    private String Effect;

    /**
    * -
    */
    @SerializedName("TolerationSeconds")
    @Expose
    private Long TolerationSeconds;

    /**
     * Get - 
     * @return Key -
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set -
     * @param Key -
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get - 
     * @return Operator -
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set -
     * @param Operator -
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get - 
     * @return Value -
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set -
     * @param Value -
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get - 
     * @return Effect -
     */
    public String getEffect() {
        return this.Effect;
    }

    /**
     * Set -
     * @param Effect -
     */
    public void setEffect(String Effect) {
        this.Effect = Effect;
    }

    /**
     * Get - 
     * @return TolerationSeconds -
     */
    public Long getTolerationSeconds() {
        return this.TolerationSeconds;
    }

    /**
     * Set -
     * @param TolerationSeconds -
     */
    public void setTolerationSeconds(Long TolerationSeconds) {
        this.TolerationSeconds = TolerationSeconds;
    }

    public CustomTolerateSchedule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomTolerateSchedule(CustomTolerateSchedule source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Effect != null) {
            this.Effect = new String(source.Effect);
        }
        if (source.TolerationSeconds != null) {
            this.TolerationSeconds = new Long(source.TolerationSeconds);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Effect", this.Effect);
        this.setParamSimple(map, prefix + "TolerationSeconds", this.TolerationSeconds);

    }
}

