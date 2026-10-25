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

public class TagInfo extends AbstractModel {

    /**
    * 标签ID（入参必填）
    */
    @SerializedName("LabelId")
    @Expose
    private String LabelId;

    /**
    * 标签名称（入参必填）
    */
    @SerializedName("LabelName")
    @Expose
    private String LabelName;

    /**
    * <p>标签类型（入参必填）</p><p>枚举值：</p><ul><li>1：GOVERNANCE_LABEL：治理标签（标签管理页手动创建）</li><li>2：CUSTOM_LABEL：自定义标签（打标时自动创建）</li><li>3：PROPERTY_LABEL：属性标签（Key-Value键值对）</li><li>4：DESENSITIZATION_LABEL：脱敏标签（与脱敏策略绑定）</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 标签值ID（可选）；属性标签可为0；LabelType=4（脱敏标签）时非必填
    */
    @SerializedName("LabelValueId")
    @Expose
    private String LabelValueId;

    /**
    * 标签值（可选）；LabelType=4（脱敏标签）时非必填
    */
    @SerializedName("LabelValue")
    @Expose
    private String LabelValue;

    /**
    * 【仅出参，入参无需填写】标签是否已被物理删除（true=已删除）
    */
    @SerializedName("IsDeleted")
    @Expose
    private Boolean IsDeleted;

    /**
    * 【仅入参，出参不返回】是否自动创建自定义标签（可选，默认 false）；true=当 LabelName 非空且标签不存在时，自动创建 LabelType=2（CUSTOM_LABEL）的自定义标签；false=仅使用已有标签打标，标签不存在时报错
    */
    @SerializedName("CreateCustomLabel")
    @Expose
    private Boolean CreateCustomLabel;

    /**
     * Get 标签ID（入参必填） 
     * @return LabelId 标签ID（入参必填）
     */
    public String getLabelId() {
        return this.LabelId;
    }

    /**
     * Set 标签ID（入参必填）
     * @param LabelId 标签ID（入参必填）
     */
    public void setLabelId(String LabelId) {
        this.LabelId = LabelId;
    }

    /**
     * Get 标签名称（入参必填） 
     * @return LabelName 标签名称（入参必填）
     */
    public String getLabelName() {
        return this.LabelName;
    }

    /**
     * Set 标签名称（入参必填）
     * @param LabelName 标签名称（入参必填）
     */
    public void setLabelName(String LabelName) {
        this.LabelName = LabelName;
    }

    /**
     * Get <p>标签类型（入参必填）</p><p>枚举值：</p><ul><li>1：GOVERNANCE_LABEL：治理标签（标签管理页手动创建）</li><li>2：CUSTOM_LABEL：自定义标签（打标时自动创建）</li><li>3：PROPERTY_LABEL：属性标签（Key-Value键值对）</li><li>4：DESENSITIZATION_LABEL：脱敏标签（与脱敏策略绑定）</li></ul> 
     * @return Type <p>标签类型（入参必填）</p><p>枚举值：</p><ul><li>1：GOVERNANCE_LABEL：治理标签（标签管理页手动创建）</li><li>2：CUSTOM_LABEL：自定义标签（打标时自动创建）</li><li>3：PROPERTY_LABEL：属性标签（Key-Value键值对）</li><li>4：DESENSITIZATION_LABEL：脱敏标签（与脱敏策略绑定）</li></ul>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>标签类型（入参必填）</p><p>枚举值：</p><ul><li>1：GOVERNANCE_LABEL：治理标签（标签管理页手动创建）</li><li>2：CUSTOM_LABEL：自定义标签（打标时自动创建）</li><li>3：PROPERTY_LABEL：属性标签（Key-Value键值对）</li><li>4：DESENSITIZATION_LABEL：脱敏标签（与脱敏策略绑定）</li></ul>
     * @param Type <p>标签类型（入参必填）</p><p>枚举值：</p><ul><li>1：GOVERNANCE_LABEL：治理标签（标签管理页手动创建）</li><li>2：CUSTOM_LABEL：自定义标签（打标时自动创建）</li><li>3：PROPERTY_LABEL：属性标签（Key-Value键值对）</li><li>4：DESENSITIZATION_LABEL：脱敏标签（与脱敏策略绑定）</li></ul>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 标签值ID（可选）；属性标签可为0；LabelType=4（脱敏标签）时非必填 
     * @return LabelValueId 标签值ID（可选）；属性标签可为0；LabelType=4（脱敏标签）时非必填
     */
    public String getLabelValueId() {
        return this.LabelValueId;
    }

    /**
     * Set 标签值ID（可选）；属性标签可为0；LabelType=4（脱敏标签）时非必填
     * @param LabelValueId 标签值ID（可选）；属性标签可为0；LabelType=4（脱敏标签）时非必填
     */
    public void setLabelValueId(String LabelValueId) {
        this.LabelValueId = LabelValueId;
    }

    /**
     * Get 标签值（可选）；LabelType=4（脱敏标签）时非必填 
     * @return LabelValue 标签值（可选）；LabelType=4（脱敏标签）时非必填
     */
    public String getLabelValue() {
        return this.LabelValue;
    }

    /**
     * Set 标签值（可选）；LabelType=4（脱敏标签）时非必填
     * @param LabelValue 标签值（可选）；LabelType=4（脱敏标签）时非必填
     */
    public void setLabelValue(String LabelValue) {
        this.LabelValue = LabelValue;
    }

    /**
     * Get 【仅出参，入参无需填写】标签是否已被物理删除（true=已删除） 
     * @return IsDeleted 【仅出参，入参无需填写】标签是否已被物理删除（true=已删除）
     */
    public Boolean getIsDeleted() {
        return this.IsDeleted;
    }

    /**
     * Set 【仅出参，入参无需填写】标签是否已被物理删除（true=已删除）
     * @param IsDeleted 【仅出参，入参无需填写】标签是否已被物理删除（true=已删除）
     */
    public void setIsDeleted(Boolean IsDeleted) {
        this.IsDeleted = IsDeleted;
    }

    /**
     * Get 【仅入参，出参不返回】是否自动创建自定义标签（可选，默认 false）；true=当 LabelName 非空且标签不存在时，自动创建 LabelType=2（CUSTOM_LABEL）的自定义标签；false=仅使用已有标签打标，标签不存在时报错 
     * @return CreateCustomLabel 【仅入参，出参不返回】是否自动创建自定义标签（可选，默认 false）；true=当 LabelName 非空且标签不存在时，自动创建 LabelType=2（CUSTOM_LABEL）的自定义标签；false=仅使用已有标签打标，标签不存在时报错
     */
    public Boolean getCreateCustomLabel() {
        return this.CreateCustomLabel;
    }

    /**
     * Set 【仅入参，出参不返回】是否自动创建自定义标签（可选，默认 false）；true=当 LabelName 非空且标签不存在时，自动创建 LabelType=2（CUSTOM_LABEL）的自定义标签；false=仅使用已有标签打标，标签不存在时报错
     * @param CreateCustomLabel 【仅入参，出参不返回】是否自动创建自定义标签（可选，默认 false）；true=当 LabelName 非空且标签不存在时，自动创建 LabelType=2（CUSTOM_LABEL）的自定义标签；false=仅使用已有标签打标，标签不存在时报错
     */
    public void setCreateCustomLabel(Boolean CreateCustomLabel) {
        this.CreateCustomLabel = CreateCustomLabel;
    }

    public TagInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TagInfo(TagInfo source) {
        if (source.LabelId != null) {
            this.LabelId = new String(source.LabelId);
        }
        if (source.LabelName != null) {
            this.LabelName = new String(source.LabelName);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.LabelValueId != null) {
            this.LabelValueId = new String(source.LabelValueId);
        }
        if (source.LabelValue != null) {
            this.LabelValue = new String(source.LabelValue);
        }
        if (source.IsDeleted != null) {
            this.IsDeleted = new Boolean(source.IsDeleted);
        }
        if (source.CreateCustomLabel != null) {
            this.CreateCustomLabel = new Boolean(source.CreateCustomLabel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LabelId", this.LabelId);
        this.setParamSimple(map, prefix + "LabelName", this.LabelName);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "LabelValueId", this.LabelValueId);
        this.setParamSimple(map, prefix + "LabelValue", this.LabelValue);
        this.setParamSimple(map, prefix + "IsDeleted", this.IsDeleted);
        this.setParamSimple(map, prefix + "CreateCustomLabel", this.CreateCustomLabel);

    }
}

