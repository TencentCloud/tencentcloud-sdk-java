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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RecipientComponentInfo extends AbstractModel{

    /**
    * 参与方Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RecipientId")
    @Expose
    private String RecipientId;

    /**
    * 参与方填写状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RecipientFillStatus")
    @Expose
    private String RecipientFillStatus;

    /**
    * 是否发起方
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsPromoter")
    @Expose
    private Boolean IsPromoter;

    /**
    * 填写控件内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Components")
    @Expose
    private FilledComponent [] Components;

    /**
     * Get 参与方Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RecipientId 参与方Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRecipientId() {
        return this.RecipientId;
    }

    /**
     * Set 参与方Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param RecipientId 参与方Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRecipientId(String RecipientId) {
        this.RecipientId = RecipientId;
    }

    /**
     * Get 参与方填写状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RecipientFillStatus 参与方填写状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRecipientFillStatus() {
        return this.RecipientFillStatus;
    }

    /**
     * Set 参与方填写状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param RecipientFillStatus 参与方填写状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRecipientFillStatus(String RecipientFillStatus) {
        this.RecipientFillStatus = RecipientFillStatus;
    }

    /**
     * Get 是否发起方
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsPromoter 是否发起方
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsPromoter() {
        return this.IsPromoter;
    }

    /**
     * Set 是否发起方
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsPromoter 是否发起方
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsPromoter(Boolean IsPromoter) {
        this.IsPromoter = IsPromoter;
    }

    /**
     * Get 填写控件内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Components 填写控件内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FilledComponent [] getComponents() {
        return this.Components;
    }

    /**
     * Set 填写控件内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param Components 填写控件内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComponents(FilledComponent [] Components) {
        this.Components = Components;
    }

    public RecipientComponentInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecipientComponentInfo(RecipientComponentInfo source) {
        if (source.RecipientId != null) {
            this.RecipientId = new String(source.RecipientId);
        }
        if (source.RecipientFillStatus != null) {
            this.RecipientFillStatus = new String(source.RecipientFillStatus);
        }
        if (source.IsPromoter != null) {
            this.IsPromoter = new Boolean(source.IsPromoter);
        }
        if (source.Components != null) {
            this.Components = new FilledComponent[source.Components.length];
            for (int i = 0; i < source.Components.length; i++) {
                this.Components[i] = new FilledComponent(source.Components[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RecipientId", this.RecipientId);
        this.setParamSimple(map, prefix + "RecipientFillStatus", this.RecipientFillStatus);
        this.setParamSimple(map, prefix + "IsPromoter", this.IsPromoter);
        this.setParamArrayObj(map, prefix + "Components.", this.Components);

    }
}

