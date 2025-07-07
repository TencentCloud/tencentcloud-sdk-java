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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InferCodeInfo extends AbstractModel {

    /**
    * 推理代码所在的cos详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CosPathInfo")
    @Expose
    private CosPathInfo CosPathInfo;

    /**
     * Get 推理代码所在的cos详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CosPathInfo 推理代码所在的cos详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CosPathInfo getCosPathInfo() {
        return this.CosPathInfo;
    }

    /**
     * Set 推理代码所在的cos详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param CosPathInfo 推理代码所在的cos详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCosPathInfo(CosPathInfo CosPathInfo) {
        this.CosPathInfo = CosPathInfo;
    }

    public InferCodeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InferCodeInfo(InferCodeInfo source) {
        if (source.CosPathInfo != null) {
            this.CosPathInfo = new CosPathInfo(source.CosPathInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "CosPathInfo.", this.CosPathInfo);

    }
}

