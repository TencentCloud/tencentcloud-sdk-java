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
package com.tencentcloudapi.tms.v20201229.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SentimentDetail extends AbstractModel {

    /**
    * 正向分数，取值范围0到100
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Positive")
    @Expose
    private Long Positive;

    /**
    * 负向分数，取值范围0到100
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Negative")
    @Expose
    private Long Negative;

    /**
     * Get 正向分数，取值范围0到100
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Positive 正向分数，取值范围0到100
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPositive() {
        return this.Positive;
    }

    /**
     * Set 正向分数，取值范围0到100
注意：此字段可能返回 null，表示取不到有效值。
     * @param Positive 正向分数，取值范围0到100
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPositive(Long Positive) {
        this.Positive = Positive;
    }

    /**
     * Get 负向分数，取值范围0到100
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Negative 负向分数，取值范围0到100
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNegative() {
        return this.Negative;
    }

    /**
     * Set 负向分数，取值范围0到100
注意：此字段可能返回 null，表示取不到有效值。
     * @param Negative 负向分数，取值范围0到100
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNegative(Long Negative) {
        this.Negative = Negative;
    }

    public SentimentDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SentimentDetail(SentimentDetail source) {
        if (source.Positive != null) {
            this.Positive = new Long(source.Positive);
        }
        if (source.Negative != null) {
            this.Negative = new Long(source.Negative);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Positive", this.Positive);
        this.setParamSimple(map, prefix + "Negative", this.Negative);

    }
}

