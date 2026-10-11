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

public class DataMaskLabelInfo extends AbstractModel {

    /**
    * 敏感标签 ID，对应 catalog-manager meta_biz_label.id
    */
    @SerializedName("LabelId")
    @Expose
    private String LabelId;

    /**
    * 敏感标签名称，对应 catalog-manager meta_biz_label.name
    */
    @SerializedName("LabelName")
    @Expose
    private String LabelName;

    /**
    * 标签类型，固定值 4（DESENSITIZATION_LABEL 脱敏标签）。参考 enum LabelType：1=业务标签、2=技术标签、3=分类标签、4=脱敏标签
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
     * Get 敏感标签 ID，对应 catalog-manager meta_biz_label.id 
     * @return LabelId 敏感标签 ID，对应 catalog-manager meta_biz_label.id
     */
    public String getLabelId() {
        return this.LabelId;
    }

    /**
     * Set 敏感标签 ID，对应 catalog-manager meta_biz_label.id
     * @param LabelId 敏感标签 ID，对应 catalog-manager meta_biz_label.id
     */
    public void setLabelId(String LabelId) {
        this.LabelId = LabelId;
    }

    /**
     * Get 敏感标签名称，对应 catalog-manager meta_biz_label.name 
     * @return LabelName 敏感标签名称，对应 catalog-manager meta_biz_label.name
     */
    public String getLabelName() {
        return this.LabelName;
    }

    /**
     * Set 敏感标签名称，对应 catalog-manager meta_biz_label.name
     * @param LabelName 敏感标签名称，对应 catalog-manager meta_biz_label.name
     */
    public void setLabelName(String LabelName) {
        this.LabelName = LabelName;
    }

    /**
     * Get 标签类型，固定值 4（DESENSITIZATION_LABEL 脱敏标签）。参考 enum LabelType：1=业务标签、2=技术标签、3=分类标签、4=脱敏标签 
     * @return Type 标签类型，固定值 4（DESENSITIZATION_LABEL 脱敏标签）。参考 enum LabelType：1=业务标签、2=技术标签、3=分类标签、4=脱敏标签
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 标签类型，固定值 4（DESENSITIZATION_LABEL 脱敏标签）。参考 enum LabelType：1=业务标签、2=技术标签、3=分类标签、4=脱敏标签
     * @param Type 标签类型，固定值 4（DESENSITIZATION_LABEL 脱敏标签）。参考 enum LabelType：1=业务标签、2=技术标签、3=分类标签、4=脱敏标签
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    public DataMaskLabelInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataMaskLabelInfo(DataMaskLabelInfo source) {
        if (source.LabelId != null) {
            this.LabelId = new String(source.LabelId);
        }
        if (source.LabelName != null) {
            this.LabelName = new String(source.LabelName);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LabelId", this.LabelId);
        this.setParamSimple(map, prefix + "LabelName", this.LabelName);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

