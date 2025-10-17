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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KVPair extends AbstractModel {

    /**
    * 键名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("K")
    @Expose
    private String K;

    /**
    * 值，请勿传SQL(请求会被视为攻击接口)，如果有需要，请将SQL进行Base64转码并解码。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("V")
    @Expose
    private String V;

    /**
     * Get 键名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return K 键名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getK() {
        return this.K;
    }

    /**
     * Set 键名
注意：此字段可能返回 null，表示取不到有效值。
     * @param K 键名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setK(String K) {
        this.K = K;
    }

    /**
     * Get 值，请勿传SQL(请求会被视为攻击接口)，如果有需要，请将SQL进行Base64转码并解码。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return V 值，请勿传SQL(请求会被视为攻击接口)，如果有需要，请将SQL进行Base64转码并解码。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getV() {
        return this.V;
    }

    /**
     * Set 值，请勿传SQL(请求会被视为攻击接口)，如果有需要，请将SQL进行Base64转码并解码。
注意：此字段可能返回 null，表示取不到有效值。
     * @param V 值，请勿传SQL(请求会被视为攻击接口)，如果有需要，请将SQL进行Base64转码并解码。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setV(String V) {
        this.V = V;
    }

    public KVPair() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KVPair(KVPair source) {
        if (source.K != null) {
            this.K = new String(source.K);
        }
        if (source.V != null) {
            this.V = new String(source.V);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "K", this.K);
        this.setParamSimple(map, prefix + "V", this.V);

    }
}

