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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DimensionNew extends AbstractModel {

    /**
    * <p>维度 key 标示，后台英文名</p>
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * <p>维度 key 名称，中英文前台展示名</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>是否必选</p>
    */
    @SerializedName("IsRequired")
    @Expose
    private Boolean IsRequired;

    /**
    * <p>支持的操作符列表</p>
    */
    @SerializedName("Operators")
    @Expose
    private Operator [] Operators;

    /**
    * <p>是否支持多选</p>
    */
    @SerializedName("IsMultiple")
    @Expose
    private Boolean IsMultiple;

    /**
    * <p>创建后是否可以修改</p>
    */
    @SerializedName("IsMutable")
    @Expose
    private Boolean IsMutable;

    /**
    * <p>是否展示给用户</p>
    */
    @SerializedName("IsVisible")
    @Expose
    private Boolean IsVisible;

    /**
    * <p>能否用来过滤策略列表</p>
    */
    @SerializedName("CanFilterPolicy")
    @Expose
    private Boolean CanFilterPolicy;

    /**
    * <p>能否用来过滤告警历史</p>
    */
    @SerializedName("CanFilterHistory")
    @Expose
    private Boolean CanFilterHistory;

    /**
    * <p>能否作为聚合维度</p>
    */
    @SerializedName("CanGroupBy")
    @Expose
    private Boolean CanGroupBy;

    /**
    * <p>是否必须作为聚合维度</p>
    */
    @SerializedName("MustGroupBy")
    @Expose
    private Boolean MustGroupBy;

    /**
    * <p>前端翻译要替换的 key</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ShowValueReplace")
    @Expose
    private String ShowValueReplace;

    /**
     * Get <p>维度 key 标示，后台英文名</p> 
     * @return Key <p>维度 key 标示，后台英文名</p>
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set <p>维度 key 标示，后台英文名</p>
     * @param Key <p>维度 key 标示，后台英文名</p>
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get <p>维度 key 名称，中英文前台展示名</p> 
     * @return Name <p>维度 key 名称，中英文前台展示名</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>维度 key 名称，中英文前台展示名</p>
     * @param Name <p>维度 key 名称，中英文前台展示名</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>是否必选</p> 
     * @return IsRequired <p>是否必选</p>
     */
    public Boolean getIsRequired() {
        return this.IsRequired;
    }

    /**
     * Set <p>是否必选</p>
     * @param IsRequired <p>是否必选</p>
     */
    public void setIsRequired(Boolean IsRequired) {
        this.IsRequired = IsRequired;
    }

    /**
     * Get <p>支持的操作符列表</p> 
     * @return Operators <p>支持的操作符列表</p>
     */
    public Operator [] getOperators() {
        return this.Operators;
    }

    /**
     * Set <p>支持的操作符列表</p>
     * @param Operators <p>支持的操作符列表</p>
     */
    public void setOperators(Operator [] Operators) {
        this.Operators = Operators;
    }

    /**
     * Get <p>是否支持多选</p> 
     * @return IsMultiple <p>是否支持多选</p>
     */
    public Boolean getIsMultiple() {
        return this.IsMultiple;
    }

    /**
     * Set <p>是否支持多选</p>
     * @param IsMultiple <p>是否支持多选</p>
     */
    public void setIsMultiple(Boolean IsMultiple) {
        this.IsMultiple = IsMultiple;
    }

    /**
     * Get <p>创建后是否可以修改</p> 
     * @return IsMutable <p>创建后是否可以修改</p>
     */
    public Boolean getIsMutable() {
        return this.IsMutable;
    }

    /**
     * Set <p>创建后是否可以修改</p>
     * @param IsMutable <p>创建后是否可以修改</p>
     */
    public void setIsMutable(Boolean IsMutable) {
        this.IsMutable = IsMutable;
    }

    /**
     * Get <p>是否展示给用户</p> 
     * @return IsVisible <p>是否展示给用户</p>
     */
    public Boolean getIsVisible() {
        return this.IsVisible;
    }

    /**
     * Set <p>是否展示给用户</p>
     * @param IsVisible <p>是否展示给用户</p>
     */
    public void setIsVisible(Boolean IsVisible) {
        this.IsVisible = IsVisible;
    }

    /**
     * Get <p>能否用来过滤策略列表</p> 
     * @return CanFilterPolicy <p>能否用来过滤策略列表</p>
     */
    public Boolean getCanFilterPolicy() {
        return this.CanFilterPolicy;
    }

    /**
     * Set <p>能否用来过滤策略列表</p>
     * @param CanFilterPolicy <p>能否用来过滤策略列表</p>
     */
    public void setCanFilterPolicy(Boolean CanFilterPolicy) {
        this.CanFilterPolicy = CanFilterPolicy;
    }

    /**
     * Get <p>能否用来过滤告警历史</p> 
     * @return CanFilterHistory <p>能否用来过滤告警历史</p>
     */
    public Boolean getCanFilterHistory() {
        return this.CanFilterHistory;
    }

    /**
     * Set <p>能否用来过滤告警历史</p>
     * @param CanFilterHistory <p>能否用来过滤告警历史</p>
     */
    public void setCanFilterHistory(Boolean CanFilterHistory) {
        this.CanFilterHistory = CanFilterHistory;
    }

    /**
     * Get <p>能否作为聚合维度</p> 
     * @return CanGroupBy <p>能否作为聚合维度</p>
     */
    public Boolean getCanGroupBy() {
        return this.CanGroupBy;
    }

    /**
     * Set <p>能否作为聚合维度</p>
     * @param CanGroupBy <p>能否作为聚合维度</p>
     */
    public void setCanGroupBy(Boolean CanGroupBy) {
        this.CanGroupBy = CanGroupBy;
    }

    /**
     * Get <p>是否必须作为聚合维度</p> 
     * @return MustGroupBy <p>是否必须作为聚合维度</p>
     */
    public Boolean getMustGroupBy() {
        return this.MustGroupBy;
    }

    /**
     * Set <p>是否必须作为聚合维度</p>
     * @param MustGroupBy <p>是否必须作为聚合维度</p>
     */
    public void setMustGroupBy(Boolean MustGroupBy) {
        this.MustGroupBy = MustGroupBy;
    }

    /**
     * Get <p>前端翻译要替换的 key</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ShowValueReplace <p>前端翻译要替换的 key</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getShowValueReplace() {
        return this.ShowValueReplace;
    }

    /**
     * Set <p>前端翻译要替换的 key</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ShowValueReplace <p>前端翻译要替换的 key</p>
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

