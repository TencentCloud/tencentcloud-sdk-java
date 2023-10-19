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

public class SimpleAesDrm extends AbstractModel {

    /**
    * 请求解密秘钥uri地址。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Uri")
    @Expose
    private String Uri;

    /**
    * 加密key(32字节字符串)。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 加密初始化向量(32字节字符串)。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Vector")
    @Expose
    private String Vector;

    /**
     * Get 请求解密秘钥uri地址。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Uri 请求解密秘钥uri地址。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUri() {
        return this.Uri;
    }

    /**
     * Set 请求解密秘钥uri地址。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Uri 请求解密秘钥uri地址。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUri(String Uri) {
        this.Uri = Uri;
    }

    /**
     * Get 加密key(32字节字符串)。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Key 加密key(32字节字符串)。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 加密key(32字节字符串)。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Key 加密key(32字节字符串)。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 加密初始化向量(32字节字符串)。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Vector 加密初始化向量(32字节字符串)。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVector() {
        return this.Vector;
    }

    /**
     * Set 加密初始化向量(32字节字符串)。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Vector 加密初始化向量(32字节字符串)。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVector(String Vector) {
        this.Vector = Vector;
    }

    public SimpleAesDrm() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SimpleAesDrm(SimpleAesDrm source) {
        if (source.Uri != null) {
            this.Uri = new String(source.Uri);
        }
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Vector != null) {
            this.Vector = new String(source.Vector);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uri", this.Uri);
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Vector", this.Vector);

    }
}

