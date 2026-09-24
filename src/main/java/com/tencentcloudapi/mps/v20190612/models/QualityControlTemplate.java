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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QualityControlTemplate extends AbstractModel {

    /**
    * <p>媒体质检模板唯一标识。</p>
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * <p>媒体质检模板名称。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>模板描述信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * <p>模板类型，取值：</p><li>Preset：系统预置模板；</li><li>Custom：用户自定义模板。</li>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>媒体质检配置参数。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QualityControlItemSet")
    @Expose
    private QualityControlItemConfig [] QualityControlItemSet;

    /**
    * <p>模板创建时间，使用 <a href="https://cloud.tencent.com/document/product/862/37710#52">ISO 日期格式</a>。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>模板最后修改时间，使用 <a href="https://cloud.tencent.com/document/product/862/37710#52">ISO 日期格式</a>。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>媒体质检的抽检策略。</p>
    */
    @SerializedName("Strategy")
    @Expose
    private QualityControlStrategy Strategy;

    /**
     * Get <p>媒体质检模板唯一标识。</p> 
     * @return Definition <p>媒体质检模板唯一标识。</p>
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set <p>媒体质检模板唯一标识。</p>
     * @param Definition <p>媒体质检模板唯一标识。</p>
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get <p>媒体质检模板名称。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name <p>媒体质检模板名称。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>媒体质检模板名称。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name <p>媒体质检模板名称。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>模板描述信息。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Comment <p>模板描述信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set <p>模板描述信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Comment <p>模板描述信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get <p>模板类型，取值：</p><li>Preset：系统预置模板；</li><li>Custom：用户自定义模板。</li>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type <p>模板类型，取值：</p><li>Preset：系统预置模板；</li><li>Custom：用户自定义模板。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>模板类型，取值：</p><li>Preset：系统预置模板；</li><li>Custom：用户自定义模板。</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type <p>模板类型，取值：</p><li>Preset：系统预置模板；</li><li>Custom：用户自定义模板。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>媒体质检配置参数。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QualityControlItemSet <p>媒体质检配置参数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public QualityControlItemConfig [] getQualityControlItemSet() {
        return this.QualityControlItemSet;
    }

    /**
     * Set <p>媒体质检配置参数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param QualityControlItemSet <p>媒体质检配置参数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQualityControlItemSet(QualityControlItemConfig [] QualityControlItemSet) {
        this.QualityControlItemSet = QualityControlItemSet;
    }

    /**
     * Get <p>模板创建时间，使用 <a href="https://cloud.tencent.com/document/product/862/37710#52">ISO 日期格式</a>。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime <p>模板创建时间，使用 <a href="https://cloud.tencent.com/document/product/862/37710#52">ISO 日期格式</a>。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>模板创建时间，使用 <a href="https://cloud.tencent.com/document/product/862/37710#52">ISO 日期格式</a>。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime <p>模板创建时间，使用 <a href="https://cloud.tencent.com/document/product/862/37710#52">ISO 日期格式</a>。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>模板最后修改时间，使用 <a href="https://cloud.tencent.com/document/product/862/37710#52">ISO 日期格式</a>。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime <p>模板最后修改时间，使用 <a href="https://cloud.tencent.com/document/product/862/37710#52">ISO 日期格式</a>。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>模板最后修改时间，使用 <a href="https://cloud.tencent.com/document/product/862/37710#52">ISO 日期格式</a>。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime <p>模板最后修改时间，使用 <a href="https://cloud.tencent.com/document/product/862/37710#52">ISO 日期格式</a>。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>媒体质检的抽检策略。</p> 
     * @return Strategy <p>媒体质检的抽检策略。</p>
     */
    public QualityControlStrategy getStrategy() {
        return this.Strategy;
    }

    /**
     * Set <p>媒体质检的抽检策略。</p>
     * @param Strategy <p>媒体质检的抽检策略。</p>
     */
    public void setStrategy(QualityControlStrategy Strategy) {
        this.Strategy = Strategy;
    }

    public QualityControlTemplate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QualityControlTemplate(QualityControlTemplate source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.QualityControlItemSet != null) {
            this.QualityControlItemSet = new QualityControlItemConfig[source.QualityControlItemSet.length];
            for (int i = 0; i < source.QualityControlItemSet.length; i++) {
                this.QualityControlItemSet[i] = new QualityControlItemConfig(source.QualityControlItemSet[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Strategy != null) {
            this.Strategy = new QualityControlStrategy(source.Strategy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "QualityControlItemSet.", this.QualityControlItemSet);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamObj(map, prefix + "Strategy.", this.Strategy);

    }
}

