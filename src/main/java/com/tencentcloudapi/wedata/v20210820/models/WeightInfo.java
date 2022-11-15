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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WeightInfo extends AbstractModel{

    /**
    * 权重
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * 维度类型 1：准确性，2：唯一性，3：完整性，4：一致性，5：及时性，6：有效性
    */
    @SerializedName("QualityDim")
    @Expose
    private Long QualityDim;

    /**
     * Get 权重 
     * @return Weight 权重
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set 权重
     * @param Weight 权重
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get 维度类型 1：准确性，2：唯一性，3：完整性，4：一致性，5：及时性，6：有效性 
     * @return QualityDim 维度类型 1：准确性，2：唯一性，3：完整性，4：一致性，5：及时性，6：有效性
     */
    public Long getQualityDim() {
        return this.QualityDim;
    }

    /**
     * Set 维度类型 1：准确性，2：唯一性，3：完整性，4：一致性，5：及时性，6：有效性
     * @param QualityDim 维度类型 1：准确性，2：唯一性，3：完整性，4：一致性，5：及时性，6：有效性
     */
    public void setQualityDim(Long QualityDim) {
        this.QualityDim = QualityDim;
    }

    public WeightInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WeightInfo(WeightInfo source) {
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
        if (source.QualityDim != null) {
            this.QualityDim = new Long(source.QualityDim);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "QualityDim", this.QualityDim);

    }
}

