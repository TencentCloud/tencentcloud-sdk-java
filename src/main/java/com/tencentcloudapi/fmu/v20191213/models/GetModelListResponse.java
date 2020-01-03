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
package com.tencentcloudapi.fmu.v20191213.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetModelListResponse extends AbstractModel{

    /**
    * 唇色素材总数量。
    */
    @SerializedName("ModelIdNum")
    @Expose
    private Long ModelIdNum;

    /**
    * 素材数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelInfos")
    @Expose
    private ModelInfo [] ModelInfos;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 唇色素材总数量。 
     * @return ModelIdNum 唇色素材总数量。
     */
    public Long getModelIdNum() {
        return this.ModelIdNum;
    }

    /**
     * Set 唇色素材总数量。
     * @param ModelIdNum 唇色素材总数量。
     */
    public void setModelIdNum(Long ModelIdNum) {
        this.ModelIdNum = ModelIdNum;
    }

    /**
     * Get 素材数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelInfos 素材数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ModelInfo [] getModelInfos() {
        return this.ModelInfos;
    }

    /**
     * Set 素材数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelInfos 素材数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModelInfos(ModelInfo [] ModelInfos) {
        this.ModelInfos = ModelInfos;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModelIdNum", this.ModelIdNum);
        this.setParamArrayObj(map, prefix + "ModelInfos.", this.ModelInfos);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

