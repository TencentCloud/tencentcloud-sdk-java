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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DimensionNew extends AbstractModel{

    /**
    * 维度 key 标示，后台英文名
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 维度 key 名称，中英文前台展示名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 是否必选
    */
    @SerializedName("IsRequired")
    @Expose
    private Boolean IsRequired;

    /**
    * 支持的操作符列表
    */
    @SerializedName("Operators")
    @Expose
    private Operator [] Operators;

    /**
    * 是否支持多选
    */
    @SerializedName("IsMultiple")
    @Expose
    private Boolean IsMultiple;

    /**
    * 创建后是否可以修改
    */
    @SerializedName("IsMutable")
    @Expose
    private Boolean IsMutable;

    /**
    * 是否展示给用户
    */
    @SerializedName("IsVisible")
    @Expose
    private Boolean IsVisible;

    /**
    * 能否用来过滤策略列表
    */
    @SerializedName("CanFilterPolicy")
    @Expose
    private Boolean CanFilterPolicy;

    /**
    * 能否用来过滤告警历史
    */
    @SerializedName("CanFilterHistory")
    @Expose
    private Boolean CanFilterHistory;

    /**
    * 能否作为聚合维度
    */
    @SerializedName("CanGroupBy")
    @Expose
    private Boolean CanGroupBy;

    /**
    * 是否必须作为聚合维度
    */
    @SerializedName("MustGroupBy")
    @Expose
    private Boolean MustGroupBy;

    /**
    * 前端翻译要替换的 key
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ShowValueReplace")
    @Expose
    private String ShowValueReplace;

    /**
     * Get 维度 key 标示，后台英文名 
     * @return Key 维度 key 标示，后台英文名
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 维度 key 标示，后台英文名
     * @param Key 维度 key 标示，后台英文名
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 维度 key 名称，中英文前台展示名 
     * @return Name 维度 key 名称，中英文前台展示名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 维度 key 名称，中英文前台展示名
     * @param Name 维度 key 名称，中英文前台展示名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 是否必选 
     * @return IsRequired 是否必选
     */
    public Boolean getIsRequired() {
        return this.IsRequired;
    }

    /**
     * Set 是否必选
     * @param IsRequired 是否必选
     */
    public void setIsRequired(Boolean IsRequired) {
        this.IsRequired = IsRequired;
    }

    /**
     * Get 支持的操作符列表 
     * @return Operators 支持的操作符列表
     */
    public Operator [] getOperators() {
        return this.Operators;
    }

    /**
     * Set 支持的操作符列表
     * @param Operators 支持的操作符列表
     */
    public void setOperators(Operator [] Operators) {
        this.Operators = Operators;
    }

    /**
     * Get 是否支持多选 
     * @return IsMultiple 是否支持多选
     */
    public Boolean getIsMultiple() {
        return this.IsMultiple;
    }

    /**
     * Set 是否支持多选
     * @param IsMultiple 是否支持多选
     */
    public void setIsMultiple(Boolean IsMultiple) {
        this.IsMultiple = IsMultiple;
    }

    /**
     * Get 创建后是否可以修改 
     * @return IsMutable 创建后是否可以修改
     */
    public Boolean getIsMutable() {
        return this.IsMutable;
    }

    /**
     * Set 创建后是否可以修改
     * @param IsMutable 创建后是否可以修改
     */
    public void setIsMutable(Boolean IsMutable) {
        this.IsMutable = IsMutable;
    }

    /**
     * Get 是否展示给用户 
     * @return IsVisible 是否展示给用户
     */
    public Boolean getIsVisible() {
        return this.IsVisible;
    }

    /**
     * Set 是否展示给用户
     * @param IsVisible 是否展示给用户
     */
    public void setIsVisible(Boolean IsVisible) {
        this.IsVisible = IsVisible;
    }

    /**
     * Get 能否用来过滤策略列表 
     * @return CanFilterPolicy 能否用来过滤策略列表
     */
    public Boolean getCanFilterPolicy() {
        return this.CanFilterPolicy;
    }

    /**
     * Set 能否用来过滤策略列表
     * @param CanFilterPolicy 能否用来过滤策略列表
     */
    public void setCanFilterPolicy(Boolean CanFilterPolicy) {
        this.CanFilterPolicy = CanFilterPolicy;
    }

    /**
     * Get 能否用来过滤告警历史 
     * @return CanFilterHistory 能否用来过滤告警历史
     */
    public Boolean getCanFilterHistory() {
        return this.CanFilterHistory;
    }

    /**
     * Set 能否用来过滤告警历史
     * @param CanFilterHistory 能否用来过滤告警历史
     */
    public void setCanFilterHistory(Boolean CanFilterHistory) {
        this.CanFilterHistory = CanFilterHistory;
    }

    /**
     * Get 能否作为聚合维度 
     * @return CanGroupBy 能否作为聚合维度
     */
    public Boolean getCanGroupBy() {
        return this.CanGroupBy;
    }

    /**
     * Set 能否作为聚合维度
     * @param CanGroupBy 能否作为聚合维度
     */
    public void setCanGroupBy(Boolean CanGroupBy) {
        this.CanGroupBy = CanGroupBy;
    }

    /**
     * Get 是否必须作为聚合维度 
     * @return MustGroupBy 是否必须作为聚合维度
     */
    public Boolean getMustGroupBy() {
        return this.MustGroupBy;
    }

    /**
     * Set 是否必须作为聚合维度
     * @param MustGroupBy 是否必须作为聚合维度
     */
    public void setMustGroupBy(Boolean MustGroupBy) {
        this.MustGroupBy = MustGroupBy;
    }

    /**
     * Get 前端翻译要替换的 key
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ShowValueReplace 前端翻译要替换的 key
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getShowValueReplace() {
        return this.ShowValueReplace;
    }

    /**
     * Set 前端翻译要替换的 key
注意：此字段可能返回 null，表示取不到有效值。
     * @param ShowValueReplace 前端翻译要替换的 key
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setShowValueReplace(String ShowValueReplace) {
        this.ShowValueReplace = ShowValueReplace;
    }

    public DimensionNew() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DimensionNew(DimensionNew source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.IsRequired != null) {
            this.IsRequired = new Boolean(source.IsRequired);
        }
        if (source.Operators != null) {
            this.Operators = new Operator[source.Operators.length];
            for (int i = 0; i < source.Operators.length; i++) {
                this.Operators[i] = new Operator(source.Operators[i]);
            }
        }
        if (source.IsMultiple != null) {
            this.IsMultiple = new Boolean(source.IsMultiple);
        }
        if (source.IsMutable != null) {
            this.IsMutable = new Boolean(source.IsMutable);
        }
        if (source.IsVisible != null) {
            this.IsVisible = new Boolean(source.IsVisible);
        }
        if (source.CanFilterPolicy != null) {
            this.CanFilterPolicy = new Boolean(source.CanFilterPolicy);
        }
        if (source.CanFilterHistory != null) {
            this.CanFilterHistory = new Boolean(source.CanFilterHistory);
        }
        if (source.CanGroupBy != null) {
            this.CanGroupBy = new Boolean(source.CanGroupBy);
        }
        if (source.MustGroupBy != null) {
            this.MustGroupBy = new Boolean(source.MustGroupBy);
        }
        if (source.ShowValueReplace != null) {
            this.ShowValueReplace = new String(source.ShowValueReplace);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "IsRequired", this.IsRequired);
        this.setParamArrayObj(map, prefix + "Operators.", this.Operators);
        this.setParamSimple(map, prefix + "IsMultiple", this.IsMultiple);
        this.setParamSimple(map, prefix + "IsMutable", this.IsMutable);
        this.setParamSimple(map, prefix + "IsVisible", this.IsVisible);
        this.setParamSimple(map, prefix + "CanFilterPolicy", this.CanFilterPolicy);
        this.setParamSimple(map, prefix + "CanFilterHistory", this.CanFilterHistory);
        this.setParamSimple(map, prefix + "CanGroupBy", this.CanGroupBy);
        this.setParamSimple(map, prefix + "MustGroupBy", this.MustGroupBy);
        this.setParamSimple(map, prefix + "ShowValueReplace", this.ShowValueReplace);

    }
}

