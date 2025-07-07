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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FinancialBillItemDetails extends AbstractModel {

    /**
    * 项目编号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ItemID")
    @Expose
    private String ItemID;

    /**
    * 项目名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 单位
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Unit")
    @Expose
    private String Unit;

    /**
    * 数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Quantity")
    @Expose
    private String Quantity;

    /**
    * 规格标准
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Standard")
    @Expose
    private String Standard;

    /**
    * 金额
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Total")
    @Expose
    private String Total;

    /**
    * 项目序号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SerialNumber")
    @Expose
    private String SerialNumber;

    /**
    * 备注
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get 项目编号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ItemID 项目编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getItemID() {
        return this.ItemID;
    }

    /**
     * Set 项目编号
注意：此字段可能返回 null，表示取不到有效值。
     * @param ItemID 项目编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setItemID(String ItemID) {
        this.ItemID = ItemID;
    }

    /**
     * Get 项目名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 项目名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 项目名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 项目名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 单位
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Unit 单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUnit() {
        return this.Unit;
    }

    /**
     * Set 单位
注意：此字段可能返回 null，表示取不到有效值。
     * @param Unit 单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    /**
     * Get 数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Quantity 数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getQuantity() {
        return this.Quantity;
    }

    /**
     * Set 数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param Quantity 数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQuantity(String Quantity) {
        this.Quantity = Quantity;
    }

    /**
     * Get 规格标准
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Standard 规格标准
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStandard() {
        return this.Standard;
    }

    /**
     * Set 规格标准
注意：此字段可能返回 null，表示取不到有效值。
     * @param Standard 规格标准
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStandard(String Standard) {
        this.Standard = Standard;
    }

    /**
     * Get 金额
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Total 金额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTotal() {
        return this.Total;
    }

    /**
     * Set 金额
注意：此字段可能返回 null，表示取不到有效值。
     * @param Total 金额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotal(String Total) {
        this.Total = Total;
    }

    /**
     * Get 项目序号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SerialNumber 项目序号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSerialNumber() {
        return this.SerialNumber;
    }

    /**
     * Set 项目序号
注意：此字段可能返回 null，表示取不到有效值。
     * @param SerialNumber 项目序号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSerialNumber(String SerialNumber) {
        this.SerialNumber = SerialNumber;
    }

    /**
     * Get 备注
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Remark 备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注
注意：此字段可能返回 null，表示取不到有效值。
     * @param Remark 备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public FinancialBillItemDetails() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FinancialBillItemDetails(FinancialBillItemDetails source) {
        if (source.ItemID != null) {
            this.ItemID = new String(source.ItemID);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Unit != null) {
            this.Unit = new String(source.Unit);
        }
        if (source.Quantity != null) {
            this.Quantity = new String(source.Quantity);
        }
        if (source.Standard != null) {
            this.Standard = new String(source.Standard);
        }
        if (source.Total != null) {
            this.Total = new String(source.Total);
        }
        if (source.SerialNumber != null) {
            this.SerialNumber = new String(source.SerialNumber);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ItemID", this.ItemID);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Unit", this.Unit);
        this.setParamSimple(map, prefix + "Quantity", this.Quantity);
        this.setParamSimple(map, prefix + "Standard", this.Standard);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "SerialNumber", this.SerialNumber);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

