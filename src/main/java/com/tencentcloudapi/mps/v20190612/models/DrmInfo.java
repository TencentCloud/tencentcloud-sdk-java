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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DrmInfo extends AbstractModel {

    /**
    * 加密类型：
<li> simpleaes: aes-128 加密</li>
<li> widevine</li>
<li> fairplay：Dash不支持fairplay加密</li>  
<li> playready</li>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * SimpleAes 加密信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SimpleAesDrm")
    @Expose
    private SimpleAesDrm SimpleAesDrm;

    /**
     * Get 加密类型：
<li> simpleaes: aes-128 加密</li>
<li> widevine</li>
<li> fairplay：Dash不支持fairplay加密</li>  
<li> playready</li>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 加密类型：
<li> simpleaes: aes-128 加密</li>
<li> widevine</li>
<li> fairplay：Dash不支持fairplay加密</li>  
<li> playready</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 加密类型：
<li> simpleaes: aes-128 加密</li>
<li> widevine</li>
<li> fairplay：Dash不支持fairplay加密</li>  
<li> playready</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 加密类型：
<li> simpleaes: aes-128 加密</li>
<li> widevine</li>
<li> fairplay：Dash不支持fairplay加密</li>  
<li> playready</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get SimpleAes 加密信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SimpleAesDrm SimpleAes 加密信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SimpleAesDrm getSimpleAesDrm() {
        return this.SimpleAesDrm;
    }

    /**
     * Set SimpleAes 加密信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SimpleAesDrm SimpleAes 加密信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSimpleAesDrm(SimpleAesDrm SimpleAesDrm) {
        this.SimpleAesDrm = SimpleAesDrm;
    }

    public DrmInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DrmInfo(DrmInfo source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.SimpleAesDrm != null) {
            this.SimpleAesDrm = new SimpleAesDrm(source.SimpleAesDrm);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "SimpleAesDrm.", this.SimpleAesDrm);

    }
}

