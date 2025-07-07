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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Label extends AbstractModel {

    /**
    * 标签ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LabelBizId")
    @Expose
    private String LabelBizId;

    /**
    * 标签名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LabelName")
    @Expose
    private String LabelName;

    /**
     * Get 标签ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LabelBizId 标签ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLabelBizId() {
        return this.LabelBizId;
    }

    /**
     * Set 标签ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param LabelBizId 标签ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabelBizId(String LabelBizId) {
        this.LabelBizId = LabelBizId;
    }

    /**
     * Get 标签名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LabelName 标签名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLabelName() {
        return this.LabelName;
    }

    /**
     * Set 标签名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param LabelName 标签名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabelName(String LabelName) {
        this.LabelName = LabelName;
    }

    public Label() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Label(Label source) {
        if (source.LabelBizId != null) {
            this.LabelBizId = new String(source.LabelBizId);
        }
        if (source.LabelName != null) {
            this.LabelName = new String(source.LabelName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LabelBizId", this.LabelBizId);
        this.setParamSimple(map, prefix + "LabelName", this.LabelName);

    }
}

