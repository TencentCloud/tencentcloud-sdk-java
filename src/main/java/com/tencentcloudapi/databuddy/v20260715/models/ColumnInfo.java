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

public class ColumnInfo extends AbstractModel {

    /**
    * 字段名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 字段类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 字段描述
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 字段设置
    */
    @SerializedName("FieldSetting")
    @Expose
    private String FieldSetting;

    /**
    * 是否为主键
    */
    @SerializedName("IsPrimaryKey")
    @Expose
    private Boolean IsPrimaryKey;

    /**
    * 字段策略
    */
    @SerializedName("DataMaskStrategyInfo")
    @Expose
    private DataMaskStrategyInfo DataMaskStrategyInfo;

    /**
    * 字段级标签列表，仅当请求中FetchOption.FetchTags=true时返回，默认不返回
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private CommonTagInfo [] Tags;

    /**
    * 字段关联的字典维度信息，仅当请求中FetchOption.FetchDictDimensions=true时返回，默认不返回；若该字段未关联任何字典维度则为空
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DictDimension")
    @Expose
    private DictDimensionInfo DictDimension;

    /**
     * Get 字段名称 
     * @return Name 字段名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 字段名称
     * @param Name 字段名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 字段类型 
     * @return Type 字段类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 字段类型
     * @param Type 字段类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 字段描述 
     * @return Comment 字段描述
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 字段描述
     * @param Comment 字段描述
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get 字段设置 
     * @return FieldSetting 字段设置
     */
    public String getFieldSetting() {
        return this.FieldSetting;
    }

    /**
     * Set 字段设置
     * @param FieldSetting 字段设置
     */
    public void setFieldSetting(String FieldSetting) {
        this.FieldSetting = FieldSetting;
    }

    /**
     * Get 是否为主键 
     * @return IsPrimaryKey 是否为主键
     */
    public Boolean getIsPrimaryKey() {
        return this.IsPrimaryKey;
    }

    /**
     * Set 是否为主键
     * @param IsPrimaryKey 是否为主键
     */
    public void setIsPrimaryKey(Boolean IsPrimaryKey) {
        this.IsPrimaryKey = IsPrimaryKey;
    }

    /**
     * Get 字段策略 
     * @return DataMaskStrategyInfo 字段策略
     */
    public DataMaskStrategyInfo getDataMaskStrategyInfo() {
        return this.DataMaskStrategyInfo;
    }

    /**
     * Set 字段策略
     * @param DataMaskStrategyInfo 字段策略
     */
    public void setDataMaskStrategyInfo(DataMaskStrategyInfo DataMaskStrategyInfo) {
        this.DataMaskStrategyInfo = DataMaskStrategyInfo;
    }

    /**
     * Get 字段级标签列表，仅当请求中FetchOption.FetchTags=true时返回，默认不返回
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 字段级标签列表，仅当请求中FetchOption.FetchTags=true时返回，默认不返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CommonTagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set 字段级标签列表，仅当请求中FetchOption.FetchTags=true时返回，默认不返回
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 字段级标签列表，仅当请求中FetchOption.FetchTags=true时返回，默认不返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(CommonTagInfo [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 字段关联的字典维度信息，仅当请求中FetchOption.FetchDictDimensions=true时返回，默认不返回；若该字段未关联任何字典维度则为空
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DictDimension 字段关联的字典维度信息，仅当请求中FetchOption.FetchDictDimensions=true时返回，默认不返回；若该字段未关联任何字典维度则为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DictDimensionInfo getDictDimension() {
        return this.DictDimension;
    }

    /**
     * Set 字段关联的字典维度信息，仅当请求中FetchOption.FetchDictDimensions=true时返回，默认不返回；若该字段未关联任何字典维度则为空
注意：此字段可能返回 null，表示取不到有效值。
     * @param DictDimension 字段关联的字典维度信息，仅当请求中FetchOption.FetchDictDimensions=true时返回，默认不返回；若该字段未关联任何字典维度则为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDictDimension(DictDimensionInfo DictDimension) {
        this.DictDimension = DictDimension;
    }

    public ColumnInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ColumnInfo(ColumnInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.FieldSetting != null) {
            this.FieldSetting = new String(source.FieldSetting);
        }
        if (source.IsPrimaryKey != null) {
            this.IsPrimaryKey = new Boolean(source.IsPrimaryKey);
        }
        if (source.DataMaskStrategyInfo != null) {
            this.DataMaskStrategyInfo = new DataMaskStrategyInfo(source.DataMaskStrategyInfo);
        }
        if (source.Tags != null) {
            this.Tags = new CommonTagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new CommonTagInfo(source.Tags[i]);
            }
        }
        if (source.DictDimension != null) {
            this.DictDimension = new DictDimensionInfo(source.DictDimension);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "FieldSetting", this.FieldSetting);
        this.setParamSimple(map, prefix + "IsPrimaryKey", this.IsPrimaryKey);
        this.setParamObj(map, prefix + "DataMaskStrategyInfo.", this.DataMaskStrategyInfo);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamObj(map, prefix + "DictDimension.", this.DictDimension);

    }
}

