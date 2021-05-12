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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GroupApiUseStatistics extends AbstractModel{

    /**
    * 总调用数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TopStatusCode")
    @Expose
    private ApiUseStatisticsEntity [] TopStatusCode;

    /**
    * 平均错误率
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TopTimeCost")
    @Expose
    private ApiUseStatisticsEntity [] TopTimeCost;

    /**
    * 分位值对象
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Quantile")
    @Expose
    private QuantileEntity Quantile;

    /**
     * Get 总调用数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TopStatusCode 总调用数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ApiUseStatisticsEntity [] getTopStatusCode() {
        return this.TopStatusCode;
    }

    /**
     * Set 总调用数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TopStatusCode 总调用数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopStatusCode(ApiUseStatisticsEntity [] TopStatusCode) {
        this.TopStatusCode = TopStatusCode;
    }

    /**
     * Get 平均错误率
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TopTimeCost 平均错误率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ApiUseStatisticsEntity [] getTopTimeCost() {
        return this.TopTimeCost;
    }

    /**
     * Set 平均错误率
注意：此字段可能返回 null，表示取不到有效值。
     * @param TopTimeCost 平均错误率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopTimeCost(ApiUseStatisticsEntity [] TopTimeCost) {
        this.TopTimeCost = TopTimeCost;
    }

    /**
     * Get 分位值对象
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Quantile 分位值对象
注意：此字段可能返回 null，表示取不到有效值。
     */
    public QuantileEntity getQuantile() {
        return this.Quantile;
    }

    /**
     * Set 分位值对象
注意：此字段可能返回 null，表示取不到有效值。
     * @param Quantile 分位值对象
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQuantile(QuantileEntity Quantile) {
        this.Quantile = Quantile;
    }

    public GroupApiUseStatistics() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GroupApiUseStatistics(GroupApiUseStatistics source) {
        if (source.TopStatusCode != null) {
            this.TopStatusCode = new ApiUseStatisticsEntity[source.TopStatusCode.length];
            for (int i = 0; i < source.TopStatusCode.length; i++) {
                this.TopStatusCode[i] = new ApiUseStatisticsEntity(source.TopStatusCode[i]);
            }
        }
        if (source.TopTimeCost != null) {
            this.TopTimeCost = new ApiUseStatisticsEntity[source.TopTimeCost.length];
            for (int i = 0; i < source.TopTimeCost.length; i++) {
                this.TopTimeCost[i] = new ApiUseStatisticsEntity(source.TopTimeCost[i]);
            }
        }
        if (source.Quantile != null) {
            this.Quantile = new QuantileEntity(source.Quantile);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "TopStatusCode.", this.TopStatusCode);
        this.setParamArrayObj(map, prefix + "TopTimeCost.", this.TopTimeCost);
        this.setParamObj(map, prefix + "Quantile.", this.Quantile);

    }
}

