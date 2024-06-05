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
package com.tencentcloudapi.trp.v20210515.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Chain extends AbstractModel {

    /**
    * 码url
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * 上链数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Data")
    @Expose
    private ChainValue [] Data;

    /**
     * Get 码url
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Code 码url
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set 码url
注意：此字段可能返回 null，表示取不到有效值。
     * @param Code 码url
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * Get 上链数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Data 上链数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ChainValue [] getData() {
        return this.Data;
    }

    /**
     * Set 上链数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param Data 上链数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setData(ChainValue [] Data) {
        this.Data = Data;
    }

    public Chain() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Chain(Chain source) {
        if (source.Code != null) {
            this.Code = new String(source.Code);
        }
        if (source.Data != null) {
            this.Data = new ChainValue[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new ChainValue(source.Data[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamArrayObj(map, prefix + "Data.", this.Data);

    }
}

