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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Toleration extends AbstractModel {

    /**
    * 容忍应用到的 taint key
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 键与值的关系
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * 要匹配的污点效果
    */
    @SerializedName("Effect")
    @Expose
    private String Effect;

    /**
     * Get 容忍应用到的 taint key 
     * @return Key 容忍应用到的 taint key
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 容忍应用到的 taint key
     * @param Key 容忍应用到的 taint key
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 键与值的关系 
     * @return Operator 键与值的关系
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 键与值的关系
     * @param Operator 键与值的关系
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 要匹配的污点效果 
     * @return Effect 要匹配的污点效果
     */
    public String getEffect() {
        return this.Effect;
    }

    /**
     * Set 要匹配的污点效果
     * @param Effect 要匹配的污点效果
     */
    public void setEffect(String Effect) {
        this.Effect = Effect;
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
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.Effect != null) {
            this.Effect = new String(source.Effect);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "Effect", this.Effect);

    }
}

