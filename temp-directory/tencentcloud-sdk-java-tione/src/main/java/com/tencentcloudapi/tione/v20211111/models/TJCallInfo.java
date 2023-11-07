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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TJCallInfo extends AbstractModel {

    /**
    * 调用地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HttpAddr")
    @Expose
    private String HttpAddr;

    /**
    * token
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Token")
    @Expose
    private String Token;

    /**
    * 调用示例
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CallExample")
    @Expose
    private String CallExample;

    /**
     * Get 调用地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HttpAddr 调用地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHttpAddr() {
        return this.HttpAddr;
    }

    /**
     * Set 调用地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param HttpAddr 调用地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHttpAddr(String HttpAddr) {
        this.HttpAddr = HttpAddr;
    }

    /**
     * Get token
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Token token
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getToken() {
        return this.Token;
    }

    /**
     * Set token
注意：此字段可能返回 null，表示取不到有效值。
     * @param Token token
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setToken(String Token) {
        this.Token = Token;
    }

    /**
     * Get 调用示例
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CallExample 调用示例
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCallExample() {
        return this.CallExample;
    }

    /**
     * Set 调用示例
注意：此字段可能返回 null，表示取不到有效值。
     * @param CallExample 调用示例
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCallExample(String CallExample) {
        this.CallExample = CallExample;
    }

    public TJCallInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TJCallInfo(TJCallInfo source) {
        if (source.HttpAddr != null) {
            this.HttpAddr = new String(source.HttpAddr);
        }
        if (source.Token != null) {
            this.Token = new String(source.Token);
        }
        if (source.CallExample != null) {
            this.CallExample = new String(source.CallExample);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HttpAddr", this.HttpAddr);
        this.setParamSimple(map, prefix + "Token", this.Token);
        this.setParamSimple(map, prefix + "CallExample", this.CallExample);

    }
}

