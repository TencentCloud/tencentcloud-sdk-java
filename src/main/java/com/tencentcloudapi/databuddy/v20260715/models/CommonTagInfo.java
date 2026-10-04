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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CommonTagInfo extends AbstractModel {

    /**
    * 标签ID
    */
    @SerializedName("LabelId")
    @Expose
    private String LabelId;

    /**
    * 标签名称
    */
    @SerializedName("LabelName")
    @Expose
    private String LabelName;

    /**
    * 标签值ID，属性标签（LabelType=3）可为0
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LabelValueId")
    @Expose
    private String LabelValueId;

    /**
    * 标签值，脱敏标签（LabelType=4）时可为空
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LabelValue")
    @Expose
    private String LabelValue;

    /**
    * 标签类型，取值参考LabelType枚举定义：1-治理标签，2-自定义标签，3-属性标签，4-脱敏标签
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 标签是否已删除。true表示该LabelId在meta_biz_label中查不到记录，标签已被物理删除；false（默认）表示标签仍存在
    */
    @SerializedName("Deleted")
    @Expose
    private Boolean Deleted;

    /**
     * Get 标签ID 
     * @return LabelId 标签ID
     */
    public String getLabelId() {
        return this.LabelId;
    }

    /**
     * Set 标签ID
     * @param LabelId 标签ID
     */
    public void setLabelId(String LabelId) {
        this.LabelId = LabelId;
    }

    /**
     * Get 标签名称 
     * @return LabelName 标签名称
     */
    public String getLabelName() {
        return this.LabelName;
    }

    /**
     * Set 标签名称
     * @param LabelName 标签名称
     */
    public void setLabelName(String LabelName) {
        this.LabelName = LabelName;
    }

    /**
     * Get 标签值ID，属性标签（LabelType=3）可为0
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LabelValueId 标签值ID，属性标签（LabelType=3）可为0
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLabelValueId() {
        return this.LabelValueId;
    }

    /**
     * Set 标签值ID，属性标签（LabelType=3）可为0
注意：此字段可能返回 null，表示取不到有效值。
     * @param LabelValueId 标签值ID，属性标签（LabelType=3）可为0
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabelValueId(String LabelValueId) {
        this.LabelValueId = LabelValueId;
    }

    /**
     * Get 标签值，脱敏标签（LabelType=4）时可为空
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LabelValue 标签值，脱敏标签（LabelType=4）时可为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLabelValue() {
        return this.LabelValue;
    }

    /**
     * Set 标签值，脱敏标签（LabelType=4）时可为空
注意：此字段可能返回 null，表示取不到有效值。
     * @param LabelValue 标签值，脱敏标签（LabelType=4）时可为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabelValue(String LabelValue) {
        this.LabelValue = LabelValue;
    }

    /**
     * Get 标签类型，取值参考LabelType枚举定义：1-治理标签，2-自定义标签，3-属性标签，4-脱敏标签 
     * @return Type 标签类型，取值参考LabelType枚举定义：1-治理标签，2-自定义标签，3-属性标签，4-脱敏标签
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 标签类型，取值参考LabelType枚举定义：1-治理标签，2-自定义标签，3-属性标签，4-脱敏标签
     * @param Type 标签类型，取值参考LabelType枚举定义：1-治理标签，2-自定义标签，3-属性标签，4-脱敏标签
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 标签是否已删除。true表示该LabelId在meta_biz_label中查不到记录，标签已被物理删除；false（默认）表示标签仍存在 
     * @return Deleted 标签是否已删除。true表示该LabelId在meta_biz_label中查不到记录，标签已被物理删除；false（默认）表示标签仍存在
     */
    public Boolean getDeleted() {
        return this.Deleted;
    }

    /**
     * Set 标签是否已删除。true表示该LabelId在meta_biz_label中查不到记录，标签已被物理删除；false（默认）表示标签仍存在
     * @param Deleted 标签是否已删除。true表示该LabelId在meta_biz_label中查不到记录，标签已被物理删除；false（默认）表示标签仍存在
     */
    public void setDeleted(Boolean Deleted) {
        this.Deleted = Deleted;
    }

    public CommonTagInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CommonTagInfo(CommonTagInfo source) {
        if (source.LabelId != null) {
            this.LabelId = new String(source.LabelId);
        }
        if (source.LabelName != null) {
            this.LabelName = new String(source.LabelName);
        }
        if (source.LabelValueId != null) {
            this.LabelValueId = new String(source.LabelValueId);
        }
        if (source.LabelValue != null) {
            this.LabelValue = new String(source.LabelValue);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Deleted != null) {
            this.Deleted = new Boolean(source.Deleted);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LabelId", this.LabelId);
        this.setParamSimple(map, prefix + "LabelName", this.LabelName);
        this.setParamSimple(map, prefix + "LabelValueId", this.LabelValueId);
        this.setParamSimple(map, prefix + "LabelValue", this.LabelValue);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Deleted", this.Deleted);

    }
}

