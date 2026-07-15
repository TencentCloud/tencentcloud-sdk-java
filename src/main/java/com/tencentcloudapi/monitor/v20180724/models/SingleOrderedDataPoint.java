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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SingleOrderedDataPoint extends AbstractModel {

    /**
    * <p>实例对象维度组合</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Dimensions")
    @Expose
    private Dimension [] Dimensions;

    /**
    * <p>监控数据值</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Value")
    @Expose
    private Float Value;

    /**
    * <p>监控数据时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
    * <p>排序序号</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Order")
    @Expose
    private Long Order;

    /**
     * Get <p>实例对象维度组合</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Dimensions <p>实例对象维度组合</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Dimension [] getDimensions() {
        return this.Dimensions;
    }

    /**
     * Set <p>实例对象维度组合</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Dimensions <p>实例对象维度组合</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDimensions(Dimension [] Dimensions) {
        this.Dimensions = Dimensions;
    }

    /**
     * Get <p>监控数据值</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Value <p>监控数据值</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getValue() {
        return this.Value;
    }

    /**
     * Set <p>监控数据值</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Value <p>监控数据值</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValue(Float Value) {
        this.Value = Value;
    }

    /**
     * Get <p>监控数据时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Timestamp <p>监控数据时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set <p>监控数据时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Timestamp <p>监控数据时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get <p>排序序号</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Order <p>排序序号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOrder() {
        return this.Order;
    }

    /**
     * Set <p>排序序号</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Order <p>排序序号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrder(Long Order) {
        this.Order = Order;
    }

    public SingleOrderedDataPoint() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SingleOrderedDataPoint(SingleOrderedDataPoint source) {
        if (source.Dimensions != null) {
            this.Dimensions = new Dimension[source.Dimensions.length];
            for (int i = 0; i < source.Dimensions.length; i++) {
                this.Dimensions[i] = new Dimension(source.Dimensions[i]);
            }
        }
        if (source.Value != null) {
            this.Value = new Float(source.Value);
        }
        if (source.Timestamp != null) {
            this.Timestamp = new Long(source.Timestamp);
        }
        if (source.Order != null) {
            this.Order = new Long(source.Order);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Dimensions.", this.Dimensions);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "Order", this.Order);

    }
}

