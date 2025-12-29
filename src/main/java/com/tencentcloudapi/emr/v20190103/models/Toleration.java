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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Toleration extends AbstractModel {

    /**
    * 键
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 值
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * 操作符
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * 污点排斥效果
    */
    @SerializedName("Effect")
    @Expose
    private String Effect;

    /**
    * 驱逐等待时间
    */
    @SerializedName("TolerationSeconds")
    @Expose
    private Long TolerationSeconds;

    /**
     * Get 键 
     * @return Key 键
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 键
     * @param Key 键
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 值 
     * @return Value 值
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 值
     * @param Value 值
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get 操作符 
     * @return Operator 操作符
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作符
     * @param Operator 操作符
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 污点排斥效果 
     * @return Effect 污点排斥效果
     */
    public String getEffect() {
        return this.Effect;
    }

    /**
     * Set 污点排斥效果
     * @param Effect 污点排斥效果
     */
    public void setEffect(String Effect) {
        this.Effect = Effect;
    }

    /**
     * Get 驱逐等待时间 
     * @return TolerationSeconds 驱逐等待时间
     */
    public Long getTolerationSeconds() {
        return this.TolerationSeconds;
    }

    /**
     * Set 驱逐等待时间
     * @param TolerationSeconds 驱逐等待时间
     */
    public void setTolerationSeconds(Long TolerationSeconds) {
        this.TolerationSeconds = TolerationSeconds;
    }

    public Toleration() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Toleration(Toleration source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
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
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "Effect", this.Effect);
        this.setParamSimple(map, prefix + "TolerationSeconds", this.TolerationSeconds);

    }
}

