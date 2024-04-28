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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LimitRule extends AbstractModel {

    /**
    * 请求匹配条件
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Filters")
    @Expose
    private RuleFilter [] Filters;

    /**
    * 参数限流依据组合
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LimitBy")
    @Expose
    private KeyValue [] LimitBy;

    /**
    * 限流阈值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QpsThresholds")
    @Expose
    private QpsThreshold [] QpsThresholds;

    /**
    * 精确限流阈值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccurateQpsThresholds")
    @Expose
    private AccurateQpsThreshold [] AccurateQpsThresholds;

    /**
     * Get 请求匹配条件
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Filters 请求匹配条件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RuleFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 请求匹配条件
注意：此字段可能返回 null，表示取不到有效值。
     * @param Filters 请求匹配条件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFilters(RuleFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 参数限流依据组合
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LimitBy 参数限流依据组合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KeyValue [] getLimitBy() {
        return this.LimitBy;
    }

    /**
     * Set 参数限流依据组合
注意：此字段可能返回 null，表示取不到有效值。
     * @param LimitBy 参数限流依据组合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLimitBy(KeyValue [] LimitBy) {
        this.LimitBy = LimitBy;
    }

    /**
     * Get 限流阈值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QpsThresholds 限流阈值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public QpsThreshold [] getQpsThresholds() {
        return this.QpsThresholds;
    }

    /**
     * Set 限流阈值
注意：此字段可能返回 null，表示取不到有效值。
     * @param QpsThresholds 限流阈值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQpsThresholds(QpsThreshold [] QpsThresholds) {
        this.QpsThresholds = QpsThresholds;
    }

    /**
     * Get 精确限流阈值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccurateQpsThresholds 精确限流阈值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AccurateQpsThreshold [] getAccurateQpsThresholds() {
        return this.AccurateQpsThresholds;
    }

    /**
     * Set 精确限流阈值
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccurateQpsThresholds 精确限流阈值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccurateQpsThresholds(AccurateQpsThreshold [] AccurateQpsThresholds) {
        this.AccurateQpsThresholds = AccurateQpsThresholds;
    }

    public LimitRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LimitRule(LimitRule source) {
        if (source.Filters != null) {
            this.Filters = new RuleFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new RuleFilter(source.Filters[i]);
            }
        }
        if (source.LimitBy != null) {
            this.LimitBy = new KeyValue[source.LimitBy.length];
            for (int i = 0; i < source.LimitBy.length; i++) {
                this.LimitBy[i] = new KeyValue(source.LimitBy[i]);
            }
        }
        if (source.QpsThresholds != null) {
            this.QpsThresholds = new QpsThreshold[source.QpsThresholds.length];
            for (int i = 0; i < source.QpsThresholds.length; i++) {
                this.QpsThresholds[i] = new QpsThreshold(source.QpsThresholds[i]);
            }
        }
        if (source.AccurateQpsThresholds != null) {
            this.AccurateQpsThresholds = new AccurateQpsThreshold[source.AccurateQpsThresholds.length];
            for (int i = 0; i < source.AccurateQpsThresholds.length; i++) {
                this.AccurateQpsThresholds[i] = new AccurateQpsThreshold(source.AccurateQpsThresholds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArrayObj(map, prefix + "LimitBy.", this.LimitBy);
        this.setParamArrayObj(map, prefix + "QpsThresholds.", this.QpsThresholds);
        this.setParamArrayObj(map, prefix + "AccurateQpsThresholds.", this.AccurateQpsThresholds);

    }
}

