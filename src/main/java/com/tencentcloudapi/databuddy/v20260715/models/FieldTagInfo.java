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

public class FieldTagInfo extends AbstractModel {

    /**
    * 字段名称（必填）；清除标记场景（LabelId=-1）下为待清除字段名
    */
    @SerializedName("FieldName")
    @Expose
    private String FieldName;

    /**
    * <p>标签ID</p><p>特殊值：-1 表示「清除标记」，仅在 BatchAttachAssetTag 接口中生效：服务端会清除该 FieldName 下所有已有字段标签。使用 -1 时 FieldName 必填，其余字段可留空。</p>
    */
    @SerializedName("LabelId")
    @Expose
    private String LabelId;

    /**
    * 标签名称（可选）
    */
    @SerializedName("LabelName")
    @Expose
    private String LabelName;

    /**
    * <p>标签类型</p><p>枚举值：</p><ul><li>1：GOVERNANCE_LABEL：治理标签</li><li>2：CUSTOM_LABEL：自定义标签</li><li>3：PROPERTY_LABEL：属性标签</li><li>4：DESENSITIZATION_LABEL：脱敏标签</li></ul><p>字段打标规则：非脱敏标签（1/2/3）时 LabelValue 必填；脱敏标签（4）时 LabelValue 可为空</p>
    */
    @SerializedName("LabelType")
    @Expose
    private Long LabelType;

    /**
    * 字段类型（可选），如 string、int、bigint 等
    */
    @SerializedName("FieldType")
    @Expose
    private String FieldType;

    /**
    * 标签值ID（可选）；非脱敏标签（LabelType!=4）建议填充；属性标签（LabelType=3）可为0；脱敏标签（LabelType=4）及清除标记（LabelId=-1）场景可留空
    */
    @SerializedName("LabelValueId")
    @Expose
    private String LabelValueId;

    /**
    * 标签值；非脱敏标签（LabelType!=4）必填，例如治理/自定义/属性标签均需携带业务语义值；脱敏标签（LabelType=4）及清除标记（LabelId=-1）场景可为空
    */
    @SerializedName("LabelValue")
    @Expose
    private String LabelValue;

    /**
     * Get 字段名称（必填）；清除标记场景（LabelId=-1）下为待清除字段名 
     * @return FieldName 字段名称（必填）；清除标记场景（LabelId=-1）下为待清除字段名
     */
    public String getFieldName() {
        return this.FieldName;
    }

    /**
     * Set 字段名称（必填）；清除标记场景（LabelId=-1）下为待清除字段名
     * @param FieldName 字段名称（必填）；清除标记场景（LabelId=-1）下为待清除字段名
     */
    public void setFieldName(String FieldName) {
        this.FieldName = FieldName;
    }

    /**
     * Get <p>标签ID</p><p>特殊值：-1 表示「清除标记」，仅在 BatchAttachAssetTag 接口中生效：服务端会清除该 FieldName 下所有已有字段标签。使用 -1 时 FieldName 必填，其余字段可留空。</p> 
     * @return LabelId <p>标签ID</p><p>特殊值：-1 表示「清除标记」，仅在 BatchAttachAssetTag 接口中生效：服务端会清除该 FieldName 下所有已有字段标签。使用 -1 时 FieldName 必填，其余字段可留空。</p>
     */
    public String getLabelId() {
        return this.LabelId;
    }

    /**
     * Set <p>标签ID</p><p>特殊值：-1 表示「清除标记」，仅在 BatchAttachAssetTag 接口中生效：服务端会清除该 FieldName 下所有已有字段标签。使用 -1 时 FieldName 必填，其余字段可留空。</p>
     * @param LabelId <p>标签ID</p><p>特殊值：-1 表示「清除标记」，仅在 BatchAttachAssetTag 接口中生效：服务端会清除该 FieldName 下所有已有字段标签。使用 -1 时 FieldName 必填，其余字段可留空。</p>
     */
    public void setLabelId(String LabelId) {
        this.LabelId = LabelId;
    }

    /**
     * Get 标签名称（可选） 
     * @return LabelName 标签名称（可选）
     */
    public String getLabelName() {
        return this.LabelName;
    }

    /**
     * Set 标签名称（可选）
     * @param LabelName 标签名称（可选）
     */
    public void setLabelName(String LabelName) {
        this.LabelName = LabelName;
    }

    /**
     * Get <p>标签类型</p><p>枚举值：</p><ul><li>1：GOVERNANCE_LABEL：治理标签</li><li>2：CUSTOM_LABEL：自定义标签</li><li>3：PROPERTY_LABEL：属性标签</li><li>4：DESENSITIZATION_LABEL：脱敏标签</li></ul><p>字段打标规则：非脱敏标签（1/2/3）时 LabelValue 必填；脱敏标签（4）时 LabelValue 可为空</p> 
     * @return LabelType <p>标签类型</p><p>枚举值：</p><ul><li>1：GOVERNANCE_LABEL：治理标签</li><li>2：CUSTOM_LABEL：自定义标签</li><li>3：PROPERTY_LABEL：属性标签</li><li>4：DESENSITIZATION_LABEL：脱敏标签</li></ul><p>字段打标规则：非脱敏标签（1/2/3）时 LabelValue 必填；脱敏标签（4）时 LabelValue 可为空</p>
     */
    public Long getLabelType() {
        return this.LabelType;
    }

    /**
     * Set <p>标签类型</p><p>枚举值：</p><ul><li>1：GOVERNANCE_LABEL：治理标签</li><li>2：CUSTOM_LABEL：自定义标签</li><li>3：PROPERTY_LABEL：属性标签</li><li>4：DESENSITIZATION_LABEL：脱敏标签</li></ul><p>字段打标规则：非脱敏标签（1/2/3）时 LabelValue 必填；脱敏标签（4）时 LabelValue 可为空</p>
     * @param LabelType <p>标签类型</p><p>枚举值：</p><ul><li>1：GOVERNANCE_LABEL：治理标签</li><li>2：CUSTOM_LABEL：自定义标签</li><li>3：PROPERTY_LABEL：属性标签</li><li>4：DESENSITIZATION_LABEL：脱敏标签</li></ul><p>字段打标规则：非脱敏标签（1/2/3）时 LabelValue 必填；脱敏标签（4）时 LabelValue 可为空</p>
     */
    public void setLabelType(Long LabelType) {
        this.LabelType = LabelType;
    }

    /**
     * Get 字段类型（可选），如 string、int、bigint 等 
     * @return FieldType 字段类型（可选），如 string、int、bigint 等
     */
    public String getFieldType() {
        return this.FieldType;
    }

    /**
     * Set 字段类型（可选），如 string、int、bigint 等
     * @param FieldType 字段类型（可选），如 string、int、bigint 等
     */
    public void setFieldType(String FieldType) {
        this.FieldType = FieldType;
    }

    /**
     * Get 标签值ID（可选）；非脱敏标签（LabelType!=4）建议填充；属性标签（LabelType=3）可为0；脱敏标签（LabelType=4）及清除标记（LabelId=-1）场景可留空 
     * @return LabelValueId 标签值ID（可选）；非脱敏标签（LabelType!=4）建议填充；属性标签（LabelType=3）可为0；脱敏标签（LabelType=4）及清除标记（LabelId=-1）场景可留空
     */
    public String getLabelValueId() {
        return this.LabelValueId;
    }

    /**
     * Set 标签值ID（可选）；非脱敏标签（LabelType!=4）建议填充；属性标签（LabelType=3）可为0；脱敏标签（LabelType=4）及清除标记（LabelId=-1）场景可留空
     * @param LabelValueId 标签值ID（可选）；非脱敏标签（LabelType!=4）建议填充；属性标签（LabelType=3）可为0；脱敏标签（LabelType=4）及清除标记（LabelId=-1）场景可留空
     */
    public void setLabelValueId(String LabelValueId) {
        this.LabelValueId = LabelValueId;
    }

    /**
     * Get 标签值；非脱敏标签（LabelType!=4）必填，例如治理/自定义/属性标签均需携带业务语义值；脱敏标签（LabelType=4）及清除标记（LabelId=-1）场景可为空 
     * @return LabelValue 标签值；非脱敏标签（LabelType!=4）必填，例如治理/自定义/属性标签均需携带业务语义值；脱敏标签（LabelType=4）及清除标记（LabelId=-1）场景可为空
     */
    public String getLabelValue() {
        return this.LabelValue;
    }

    /**
     * Set 标签值；非脱敏标签（LabelType!=4）必填，例如治理/自定义/属性标签均需携带业务语义值；脱敏标签（LabelType=4）及清除标记（LabelId=-1）场景可为空
     * @param LabelValue 标签值；非脱敏标签（LabelType!=4）必填，例如治理/自定义/属性标签均需携带业务语义值；脱敏标签（LabelType=4）及清除标记（LabelId=-1）场景可为空
     */
    public void setLabelValue(String LabelValue) {
        this.LabelValue = LabelValue;
    }

    public FieldTagInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FieldTagInfo(FieldTagInfo source) {
        if (source.FieldName != null) {
            this.FieldName = new String(source.FieldName);
        }
        if (source.LabelId != null) {
            this.LabelId = new String(source.LabelId);
        }
        if (source.LabelName != null) {
            this.LabelName = new String(source.LabelName);
        }
        if (source.LabelType != null) {
            this.LabelType = new Long(source.LabelType);
        }
        if (source.FieldType != null) {
            this.FieldType = new String(source.FieldType);
        }
        if (source.LabelValueId != null) {
            this.LabelValueId = new String(source.LabelValueId);
        }
        if (source.LabelValue != null) {
            this.LabelValue = new String(source.LabelValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FieldName", this.FieldName);
        this.setParamSimple(map, prefix + "LabelId", this.LabelId);
        this.setParamSimple(map, prefix + "LabelName", this.LabelName);
        this.setParamSimple(map, prefix + "LabelType", this.LabelType);
        this.setParamSimple(map, prefix + "FieldType", this.FieldType);
        this.setParamSimple(map, prefix + "LabelValueId", this.LabelValueId);
        this.setParamSimple(map, prefix + "LabelValue", this.LabelValue);

    }
}

