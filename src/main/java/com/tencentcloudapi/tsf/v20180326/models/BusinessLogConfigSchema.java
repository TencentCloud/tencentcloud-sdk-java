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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BusinessLogConfigSchema extends AbstractModel{

    /**
    * 解析规则类型
    */
    @SerializedName("SchemaType")
    @Expose
    private Long SchemaType;

    /**
    * 解析规则内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SchemaContent")
    @Expose
    private String SchemaContent;

    /**
    * 解析规则时间格式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SchemaDateFormat")
    @Expose
    private String SchemaDateFormat;

    /**
    * 解析规则对应的多行匹配规则
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SchemaMultilinePattern")
    @Expose
    private String SchemaMultilinePattern;

    /**
    * 解析规则创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SchemaCreateTime")
    @Expose
    private String SchemaCreateTime;

    /**
    * 用户填写的解析规则
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SchemaPatternLayout")
    @Expose
    private String SchemaPatternLayout;

    /**
     * Get 解析规则类型 
     * @return SchemaType 解析规则类型
     */
    public Long getSchemaType() {
        return this.SchemaType;
    }

    /**
     * Set 解析规则类型
     * @param SchemaType 解析规则类型
     */
    public void setSchemaType(Long SchemaType) {
        this.SchemaType = SchemaType;
    }

    /**
     * Get 解析规则内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SchemaContent 解析规则内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSchemaContent() {
        return this.SchemaContent;
    }

    /**
     * Set 解析规则内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param SchemaContent 解析规则内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSchemaContent(String SchemaContent) {
        this.SchemaContent = SchemaContent;
    }

    /**
     * Get 解析规则时间格式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SchemaDateFormat 解析规则时间格式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSchemaDateFormat() {
        return this.SchemaDateFormat;
    }

    /**
     * Set 解析规则时间格式
注意：此字段可能返回 null，表示取不到有效值。
     * @param SchemaDateFormat 解析规则时间格式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSchemaDateFormat(String SchemaDateFormat) {
        this.SchemaDateFormat = SchemaDateFormat;
    }

    /**
     * Get 解析规则对应的多行匹配规则
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SchemaMultilinePattern 解析规则对应的多行匹配规则
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSchemaMultilinePattern() {
        return this.SchemaMultilinePattern;
    }

    /**
     * Set 解析规则对应的多行匹配规则
注意：此字段可能返回 null，表示取不到有效值。
     * @param SchemaMultilinePattern 解析规则对应的多行匹配规则
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSchemaMultilinePattern(String SchemaMultilinePattern) {
        this.SchemaMultilinePattern = SchemaMultilinePattern;
    }

    /**
     * Get 解析规则创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SchemaCreateTime 解析规则创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSchemaCreateTime() {
        return this.SchemaCreateTime;
    }

    /**
     * Set 解析规则创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param SchemaCreateTime 解析规则创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSchemaCreateTime(String SchemaCreateTime) {
        this.SchemaCreateTime = SchemaCreateTime;
    }

    /**
     * Get 用户填写的解析规则
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SchemaPatternLayout 用户填写的解析规则
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSchemaPatternLayout() {
        return this.SchemaPatternLayout;
    }

    /**
     * Set 用户填写的解析规则
注意：此字段可能返回 null，表示取不到有效值。
     * @param SchemaPatternLayout 用户填写的解析规则
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSchemaPatternLayout(String SchemaPatternLayout) {
        this.SchemaPatternLayout = SchemaPatternLayout;
    }

    public BusinessLogConfigSchema() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BusinessLogConfigSchema(BusinessLogConfigSchema source) {
        if (source.SchemaType != null) {
            this.SchemaType = new Long(source.SchemaType);
        }
        if (source.SchemaContent != null) {
            this.SchemaContent = new String(source.SchemaContent);
        }
        if (source.SchemaDateFormat != null) {
            this.SchemaDateFormat = new String(source.SchemaDateFormat);
        }
        if (source.SchemaMultilinePattern != null) {
            this.SchemaMultilinePattern = new String(source.SchemaMultilinePattern);
        }
        if (source.SchemaCreateTime != null) {
            this.SchemaCreateTime = new String(source.SchemaCreateTime);
        }
        if (source.SchemaPatternLayout != null) {
            this.SchemaPatternLayout = new String(source.SchemaPatternLayout);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SchemaType", this.SchemaType);
        this.setParamSimple(map, prefix + "SchemaContent", this.SchemaContent);
        this.setParamSimple(map, prefix + "SchemaDateFormat", this.SchemaDateFormat);
        this.setParamSimple(map, prefix + "SchemaMultilinePattern", this.SchemaMultilinePattern);
        this.setParamSimple(map, prefix + "SchemaCreateTime", this.SchemaCreateTime);
        this.setParamSimple(map, prefix + "SchemaPatternLayout", this.SchemaPatternLayout);

    }
}

