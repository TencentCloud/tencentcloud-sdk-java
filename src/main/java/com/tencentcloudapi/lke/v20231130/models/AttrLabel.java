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

public class AttrLabel extends AbstractModel {

    /**
    * 标签来源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Source")
    @Expose
    private Long Source;

    /**
    * 标签ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AttrBizId")
    @Expose
    private String AttrBizId;

    /**
    * 标签标识
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AttrKey")
    @Expose
    private String AttrKey;

    /**
    * 标签名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AttrName")
    @Expose
    private String AttrName;

    /**
    * 标签值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Labels")
    @Expose
    private Label [] Labels;

    /**
     * Get 标签来源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Source 标签来源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSource() {
        return this.Source;
    }

    /**
     * Set 标签来源
注意：此字段可能返回 null，表示取不到有效值。
     * @param Source 标签来源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSource(Long Source) {
        this.Source = Source;
    }

    /**
     * Get 标签ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AttrBizId 标签ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAttrBizId() {
        return this.AttrBizId;
    }

    /**
     * Set 标签ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param AttrBizId 标签ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAttrBizId(String AttrBizId) {
        this.AttrBizId = AttrBizId;
    }

    /**
     * Get 标签标识
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AttrKey 标签标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAttrKey() {
        return this.AttrKey;
    }

    /**
     * Set 标签标识
注意：此字段可能返回 null，表示取不到有效值。
     * @param AttrKey 标签标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAttrKey(String AttrKey) {
        this.AttrKey = AttrKey;
    }

    /**
     * Get 标签名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AttrName 标签名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAttrName() {
        return this.AttrName;
    }

    /**
     * Set 标签名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param AttrName 标签名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAttrName(String AttrName) {
        this.AttrName = AttrName;
    }

    /**
     * Get 标签值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Labels 标签值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Label [] getLabels() {
        return this.Labels;
    }

    /**
     * Set 标签值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Labels 标签值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabels(Label [] Labels) {
        this.Labels = Labels;
    }

    public AttrLabel() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AttrLabel(AttrLabel source) {
        if (source.Source != null) {
            this.Source = new Long(source.Source);
        }
        if (source.AttrBizId != null) {
            this.AttrBizId = new String(source.AttrBizId);
        }
        if (source.AttrKey != null) {
            this.AttrKey = new String(source.AttrKey);
        }
        if (source.AttrName != null) {
            this.AttrName = new String(source.AttrName);
        }
        if (source.Labels != null) {
            this.Labels = new Label[source.Labels.length];
            for (int i = 0; i < source.Labels.length; i++) {
                this.Labels[i] = new Label(source.Labels[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "AttrBizId", this.AttrBizId);
        this.setParamSimple(map, prefix + "AttrKey", this.AttrKey);
        this.setParamSimple(map, prefix + "AttrName", this.AttrName);
        this.setParamArrayObj(map, prefix + "Labels.", this.Labels);

    }
}

