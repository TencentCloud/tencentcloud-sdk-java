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
package com.tencentcloudapi.oceanus.v20190422.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Order extends AbstractModel{

    /**
    * 创建、续费、扩缩容 1 2 3
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 自动续费 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * 操作人的UIN
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OperateUin")
    @Expose
    private String OperateUin;

    /**
    * 最终集群的CU数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ComputeCu")
    @Expose
    private Long ComputeCu;

    /**
    * 订单的时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OrderTime")
    @Expose
    private String OrderTime;

    /**
     * Get 创建、续费、扩缩容 1 2 3
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 创建、续费、扩缩容 1 2 3
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 创建、续费、扩缩容 1 2 3
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 创建、续费、扩缩容 1 2 3
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 自动续费 1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AutoRenewFlag 自动续费 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set 自动续费 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param AutoRenewFlag 自动续费 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get 操作人的UIN
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OperateUin 操作人的UIN
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOperateUin() {
        return this.OperateUin;
    }

    /**
     * Set 操作人的UIN
注意：此字段可能返回 null，表示取不到有效值。
     * @param OperateUin 操作人的UIN
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperateUin(String OperateUin) {
        this.OperateUin = OperateUin;
    }

    /**
     * Get 最终集群的CU数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ComputeCu 最终集群的CU数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getComputeCu() {
        return this.ComputeCu;
    }

    /**
     * Set 最终集群的CU数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param ComputeCu 最终集群的CU数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComputeCu(Long ComputeCu) {
        this.ComputeCu = ComputeCu;
    }

    /**
     * Get 订单的时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OrderTime 订单的时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOrderTime() {
        return this.OrderTime;
    }

    /**
     * Set 订单的时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param OrderTime 订单的时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrderTime(String OrderTime) {
        this.OrderTime = OrderTime;
    }

    public Order() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Order(Order source) {
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.OperateUin != null) {
            this.OperateUin = new String(source.OperateUin);
        }
        if (source.ComputeCu != null) {
            this.ComputeCu = new Long(source.ComputeCu);
        }
        if (source.OrderTime != null) {
            this.OrderTime = new String(source.OrderTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "OperateUin", this.OperateUin);
        this.setParamSimple(map, prefix + "ComputeCu", this.ComputeCu);
        this.setParamSimple(map, prefix + "OrderTime", this.OrderTime);

    }
}

