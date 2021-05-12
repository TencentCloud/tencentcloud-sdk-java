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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QuerySinglePayResult extends AbstractModel{

    /**
    * 受理状态（S：处理成功；F：处理失败）
    */
    @SerializedName("HandleStatus")
    @Expose
    private String HandleStatus;

    /**
    * 受理状态描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HandleMsg")
    @Expose
    private String HandleMsg;

    /**
    * 业务流水号
    */
    @SerializedName("SerialNo")
    @Expose
    private String SerialNo;

    /**
    * 支付明细
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Items")
    @Expose
    private QuerySinglePayItem [] Items;

    /**
     * Get 受理状态（S：处理成功；F：处理失败） 
     * @return HandleStatus 受理状态（S：处理成功；F：处理失败）
     */
    public String getHandleStatus() {
        return this.HandleStatus;
    }

    /**
     * Set 受理状态（S：处理成功；F：处理失败）
     * @param HandleStatus 受理状态（S：处理成功；F：处理失败）
     */
    public void setHandleStatus(String HandleStatus) {
        this.HandleStatus = HandleStatus;
    }

    /**
     * Get 受理状态描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HandleMsg 受理状态描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHandleMsg() {
        return this.HandleMsg;
    }

    /**
     * Set 受理状态描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param HandleMsg 受理状态描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHandleMsg(String HandleMsg) {
        this.HandleMsg = HandleMsg;
    }

    /**
     * Get 业务流水号 
     * @return SerialNo 业务流水号
     */
    public String getSerialNo() {
        return this.SerialNo;
    }

    /**
     * Set 业务流水号
     * @param SerialNo 业务流水号
     */
    public void setSerialNo(String SerialNo) {
        this.SerialNo = SerialNo;
    }

    /**
     * Get 支付明细
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Items 支付明细
注意：此字段可能返回 null，表示取不到有效值。
     */
    public QuerySinglePayItem [] getItems() {
        return this.Items;
    }

    /**
     * Set 支付明细
注意：此字段可能返回 null，表示取不到有效值。
     * @param Items 支付明细
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setItems(QuerySinglePayItem [] Items) {
        this.Items = Items;
    }

    public QuerySinglePayResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QuerySinglePayResult(QuerySinglePayResult source) {
        if (source.HandleStatus != null) {
            this.HandleStatus = new String(source.HandleStatus);
        }
        if (source.HandleMsg != null) {
            this.HandleMsg = new String(source.HandleMsg);
        }
        if (source.SerialNo != null) {
            this.SerialNo = new String(source.SerialNo);
        }
        if (source.Items != null) {
            this.Items = new QuerySinglePayItem[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new QuerySinglePayItem(source.Items[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HandleStatus", this.HandleStatus);
        this.setParamSimple(map, prefix + "HandleMsg", this.HandleMsg);
        this.setParamSimple(map, prefix + "SerialNo", this.SerialNo);
        this.setParamArrayObj(map, prefix + "Items.", this.Items);

    }
}

