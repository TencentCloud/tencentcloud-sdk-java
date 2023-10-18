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

public class ApproverItem extends AbstractModel{

    /**
    * 签署方唯一编号

在动态签署人场景下，可以用此编号确定参与方
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SignId")
    @Expose
    private String SignId;

    /**
    * 签署方角色编号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RecipientId")
    @Expose
    private String RecipientId;

    /**
    * 签署方角色名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApproverRoleName")
    @Expose
    private String ApproverRoleName;

    /**
     * Get 签署方唯一编号

在动态签署人场景下，可以用此编号确定参与方
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SignId 签署方唯一编号

在动态签署人场景下，可以用此编号确定参与方
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSignId() {
        return this.SignId;
    }

    /**
     * Set 签署方唯一编号

在动态签署人场景下，可以用此编号确定参与方
注意：此字段可能返回 null，表示取不到有效值。
     * @param SignId 签署方唯一编号

在动态签署人场景下，可以用此编号确定参与方
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSignId(String SignId) {
        this.SignId = SignId;
    }

    /**
     * Get 签署方角色编号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RecipientId 签署方角色编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRecipientId() {
        return this.RecipientId;
    }

    /**
     * Set 签署方角色编号
注意：此字段可能返回 null，表示取不到有效值。
     * @param RecipientId 签署方角色编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRecipientId(String RecipientId) {
        this.RecipientId = RecipientId;
    }

    /**
     * Get 签署方角色名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApproverRoleName 签署方角色名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApproverRoleName() {
        return this.ApproverRoleName;
    }

    /**
     * Set 签署方角色名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApproverRoleName 签署方角色名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApproverRoleName(String ApproverRoleName) {
        this.ApproverRoleName = ApproverRoleName;
    }

    public ApproverItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApproverItem(ApproverItem source) {
        if (source.SignId != null) {
            this.SignId = new String(source.SignId);
        }
        if (source.RecipientId != null) {
            this.RecipientId = new String(source.RecipientId);
        }
        if (source.ApproverRoleName != null) {
            this.ApproverRoleName = new String(source.ApproverRoleName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SignId", this.SignId);
        this.setParamSimple(map, prefix + "RecipientId", this.RecipientId);
        this.setParamSimple(map, prefix + "ApproverRoleName", this.ApproverRoleName);

    }
}

