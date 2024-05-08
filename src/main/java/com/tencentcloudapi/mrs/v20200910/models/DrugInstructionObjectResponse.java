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
package com.tencentcloudapi.mrs.v20200910.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DrugInstructionObjectResponse extends AbstractModel {

    /**
    * 药品说明书消息定义
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChemicalProductInfo")
    @Expose
    private ChemicalProductInfo ChemicalProductInfo;

    /**
    * 预防用生物制品说明书
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BiologicalProductInfo")
    @Expose
    private BiologicalProductInfo BiologicalProductInfo;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 药品说明书消息定义
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChemicalProductInfo 药品说明书消息定义
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ChemicalProductInfo getChemicalProductInfo() {
        return this.ChemicalProductInfo;
    }

    /**
     * Set 药品说明书消息定义
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChemicalProductInfo 药品说明书消息定义
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChemicalProductInfo(ChemicalProductInfo ChemicalProductInfo) {
        this.ChemicalProductInfo = ChemicalProductInfo;
    }

    /**
     * Get 预防用生物制品说明书
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BiologicalProductInfo 预防用生物制品说明书
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BiologicalProductInfo getBiologicalProductInfo() {
        return this.BiologicalProductInfo;
    }

    /**
     * Set 预防用生物制品说明书
注意：此字段可能返回 null，表示取不到有效值。
     * @param BiologicalProductInfo 预防用生物制品说明书
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBiologicalProductInfo(BiologicalProductInfo BiologicalProductInfo) {
        this.BiologicalProductInfo = BiologicalProductInfo;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DrugInstructionObjectResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DrugInstructionObjectResponse(DrugInstructionObjectResponse source) {
        if (source.ChemicalProductInfo != null) {
            this.ChemicalProductInfo = new ChemicalProductInfo(source.ChemicalProductInfo);
        }
        if (source.BiologicalProductInfo != null) {
            this.BiologicalProductInfo = new BiologicalProductInfo(source.BiologicalProductInfo);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ChemicalProductInfo.", this.ChemicalProductInfo);
        this.setParamObj(map, prefix + "BiologicalProductInfo.", this.BiologicalProductInfo);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

