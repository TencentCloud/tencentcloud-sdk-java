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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Columns extends AbstractModel {

    /**
    * 字段名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 字段类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 字段描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 位置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Position")
    @Expose
    private Long Position;

    /**
    * 是否分区
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsPartition")
    @Expose
    private Boolean IsPartition;

    /**
    * 业务额外属性
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BizParams")
    @Expose
    private BizParams BizParams;

    /**
    * 字段精度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Precision")
    @Expose
    private Long Precision;

    /**
    * 字段位数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Scale")
    @Expose
    private Long Scale;

    /**
    * 字段额外属性
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Params")
    @Expose
    private Params Params;

    /**
     * Get 字段名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 字段名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 字段名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 字段名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 字段类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 字段类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 字段类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 字段类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 字段描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 字段描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 字段描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 字段描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 位置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Position 位置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPosition() {
        return this.Position;
    }

    /**
     * Set 位置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Position 位置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPosition(Long Position) {
        this.Position = Position;
    }

    /**
     * Get 是否分区
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsPartition 是否分区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsPartition() {
        return this.IsPartition;
    }

    /**
     * Set 是否分区
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsPartition 是否分区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsPartition(Boolean IsPartition) {
        this.IsPartition = IsPartition;
    }

    /**
     * Get 业务额外属性
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BizParams 业务额外属性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BizParams getBizParams() {
        return this.BizParams;
    }

    /**
     * Set 业务额外属性
注意：此字段可能返回 null，表示取不到有效值。
     * @param BizParams 业务额外属性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBizParams(BizParams BizParams) {
        this.BizParams = BizParams;
    }

    /**
     * Get 字段精度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Precision 字段精度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPrecision() {
        return this.Precision;
    }

    /**
     * Set 字段精度
注意：此字段可能返回 null，表示取不到有效值。
     * @param Precision 字段精度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrecision(Long Precision) {
        this.Precision = Precision;
    }

    /**
     * Get 字段位数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Scale 字段位数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getScale() {
        return this.Scale;
    }

    /**
     * Set 字段位数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Scale 字段位数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScale(Long Scale) {
        this.Scale = Scale;
    }

    /**
     * Get 字段额外属性
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Params 字段额外属性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Params getParams() {
        return this.Params;
    }

    /**
     * Set 字段额外属性
注意：此字段可能返回 null，表示取不到有效值。
     * @param Params 字段额外属性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParams(Params Params) {
        this.Params = Params;
    }

    public Columns() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Columns(Columns source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Position != null) {
            this.Position = new Long(source.Position);
        }
        if (source.IsPartition != null) {
            this.IsPartition = new Boolean(source.IsPartition);
        }
        if (source.BizParams != null) {
            this.BizParams = new BizParams(source.BizParams);
        }
        if (source.Precision != null) {
            this.Precision = new Long(source.Precision);
        }
        if (source.Scale != null) {
            this.Scale = new Long(source.Scale);
        }
        if (source.Params != null) {
            this.Params = new Params(source.Params);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Position", this.Position);
        this.setParamSimple(map, prefix + "IsPartition", this.IsPartition);
        this.setParamObj(map, prefix + "BizParams.", this.BizParams);
        this.setParamSimple(map, prefix + "Precision", this.Precision);
        this.setParamSimple(map, prefix + "Scale", this.Scale);
        this.setParamObj(map, prefix + "Params.", this.Params);

    }
}

