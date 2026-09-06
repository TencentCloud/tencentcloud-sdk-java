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

public class RedLetterInvoiceItem extends AbstractModel {

    /**
    * <p>红字发票代码</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * <p>红字发票号码</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Number")
    @Expose
    private String Number;

    /**
    * <p>红字开票日期</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * <p>红字发票状态</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
     * Get <p>红字发票代码</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Code <p>红字发票代码</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set <p>红字发票代码</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Code <p>红字发票代码</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * Get <p>红字发票号码</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Number <p>红字发票号码</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNumber() {
        return this.Number;
    }

    /**
     * Set <p>红字发票号码</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Number <p>红字发票号码</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNumber(String Number) {
        this.Number = Number;
    }

    /**
     * Get <p>红字开票日期</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Date <p>红字开票日期</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set <p>红字开票日期</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Date <p>红字开票日期</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get <p>红字发票状态</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return State <p>红字发票状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set <p>红字发票状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param State <p>红字发票状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setState(String State) {
        this.State = State;
    }

    public RedLetterInvoiceItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RedLetterInvoiceItem(RedLetterInvoiceItem source) {
        if (source.Code != null) {
            this.Code = new String(source.Code);
        }
        if (source.Number != null) {
            this.Number = new String(source.Number);
        }
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Number", this.Number);
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "State", this.State);

    }
}

