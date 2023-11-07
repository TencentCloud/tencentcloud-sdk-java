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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FillError extends AbstractModel {

    /**
    * 为签署方经办人在签署合同中的参与方ID，与控件绑定，是控件的归属方，ID为32位字符串。与入参中补充的签署人角色ID对应，批量补充部分失败返回对应的错误信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RecipientId")
    @Expose
    private String RecipientId;

    /**
    * 补充失败错误说明
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrMessage")
    @Expose
    private String ErrMessage;

    /**
     * Get 为签署方经办人在签署合同中的参与方ID，与控件绑定，是控件的归属方，ID为32位字符串。与入参中补充的签署人角色ID对应，批量补充部分失败返回对应的错误信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RecipientId 为签署方经办人在签署合同中的参与方ID，与控件绑定，是控件的归属方，ID为32位字符串。与入参中补充的签署人角色ID对应，批量补充部分失败返回对应的错误信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRecipientId() {
        return this.RecipientId;
    }

    /**
     * Set 为签署方经办人在签署合同中的参与方ID，与控件绑定，是控件的归属方，ID为32位字符串。与入参中补充的签署人角色ID对应，批量补充部分失败返回对应的错误信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RecipientId 为签署方经办人在签署合同中的参与方ID，与控件绑定，是控件的归属方，ID为32位字符串。与入参中补充的签署人角色ID对应，批量补充部分失败返回对应的错误信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRecipientId(String RecipientId) {
        this.RecipientId = RecipientId;
    }

    /**
     * Get 补充失败错误说明
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrMessage 补充失败错误说明
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrMessage() {
        return this.ErrMessage;
    }

    /**
     * Set 补充失败错误说明
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrMessage 补充失败错误说明
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrMessage(String ErrMessage) {
        this.ErrMessage = ErrMessage;
    }

    public FillError() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FillError(FillError source) {
        if (source.RecipientId != null) {
            this.RecipientId = new String(source.RecipientId);
        }
        if (source.ErrMessage != null) {
            this.ErrMessage = new String(source.ErrMessage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RecipientId", this.RecipientId);
        this.setParamSimple(map, prefix + "ErrMessage", this.ErrMessage);

    }
}

