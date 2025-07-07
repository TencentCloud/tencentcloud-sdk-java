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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SuggestRiskLevelMatrix extends AbstractModel {

    /**
    * 矩阵
    */
    @SerializedName("RiskLevelMatrix")
    @Expose
    private SuggestRiskLevelMatrixItem [] RiskLevelMatrix;

    /**
     * Get 矩阵 
     * @return RiskLevelMatrix 矩阵
     */
    public SuggestRiskLevelMatrixItem [] getRiskLevelMatrix() {
        return this.RiskLevelMatrix;
    }

    /**
     * Set 矩阵
     * @param RiskLevelMatrix 矩阵
     */
    public void setRiskLevelMatrix(SuggestRiskLevelMatrixItem [] RiskLevelMatrix) {
        this.RiskLevelMatrix = RiskLevelMatrix;
    }

    public SuggestRiskLevelMatrix() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SuggestRiskLevelMatrix(SuggestRiskLevelMatrix source) {
        if (source.RiskLevelMatrix != null) {
            this.RiskLevelMatrix = new SuggestRiskLevelMatrixItem[source.RiskLevelMatrix.length];
            for (int i = 0; i < source.RiskLevelMatrix.length; i++) {
                this.RiskLevelMatrix[i] = new SuggestRiskLevelMatrixItem(source.RiskLevelMatrix[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "RiskLevelMatrix.", this.RiskLevelMatrix);

    }
}

