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
package com.tencentcloudapi.ssa.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SocCheckItemV1 extends AbstractModel{

    /**
    * 检查项id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CheckId")
    @Expose
    private String CheckId;

    /**
    * 配置要求
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 检查项类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 检查对象
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * 默认风险等级 2:低危 3:中危 4:高危
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * 相关规范
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Standard")
    @Expose
    private String Standard;

    /**
    * 检查项是否付费 1:免费 2:付费
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsFree")
    @Expose
    private Long IsFree;

    /**
     * Get 检查项id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CheckId 检查项id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCheckId() {
        return this.CheckId;
    }

    /**
     * Set 检查项id
注意：此字段可能返回 null，表示取不到有效值。
     * @param CheckId 检查项id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCheckId(String CheckId) {
        this.CheckId = CheckId;
    }

    /**
     * Get 配置要求
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 配置要求
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 配置要求
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 配置要求
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 检查项类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 检查项类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 检查项类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 检查项类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 检查对象
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssetType 检查对象
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set 检查对象
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssetType 检查对象
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get 默认风险等级 2:低危 3:中危 4:高危
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Level 默认风险等级 2:低危 3:中危 4:高危
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set 默认风险等级 2:低危 3:中危 4:高危
注意：此字段可能返回 null，表示取不到有效值。
     * @param Level 默认风险等级 2:低危 3:中危 4:高危
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get 相关规范
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Standard 相关规范
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStandard() {
        return this.Standard;
    }

    /**
     * Set 相关规范
注意：此字段可能返回 null，表示取不到有效值。
     * @param Standard 相关规范
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStandard(String Standard) {
        this.Standard = Standard;
    }

    /**
     * Get 检查项是否付费 1:免费 2:付费
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsFree 检查项是否付费 1:免费 2:付费
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsFree() {
        return this.IsFree;
    }

    /**
     * Set 检查项是否付费 1:免费 2:付费
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsFree 检查项是否付费 1:免费 2:付费
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsFree(Long IsFree) {
        this.IsFree = IsFree;
    }

    public SocCheckItemV1() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SocCheckItemV1(SocCheckItemV1 source) {
        if (source.CheckId != null) {
            this.CheckId = new String(source.CheckId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.Standard != null) {
            this.Standard = new String(source.Standard);
        }
        if (source.IsFree != null) {
            this.IsFree = new Long(source.IsFree);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CheckId", this.CheckId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Standard", this.Standard);
        this.setParamSimple(map, prefix + "IsFree", this.IsFree);

    }
}

