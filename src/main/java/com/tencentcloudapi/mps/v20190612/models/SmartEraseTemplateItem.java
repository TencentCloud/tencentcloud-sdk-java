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

public class SmartEraseTemplateItem extends AbstractModel {

    /**
    * 智能擦除模板唯一标识
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * 智能擦除模板名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 智能擦除模板描述信息
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 模板类型，取值范围：
* Preset：系统预置模板；
* Custom：用户自定义模板。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 擦除类型
- subtitle 去字幕
- watermark 去水印
- privacy 隐私保护
    */
    @SerializedName("EraseType")
    @Expose
    private String EraseType;

    /**
    * 字幕擦除配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EraseSubtitleConfig")
    @Expose
    private SmartEraseSubtitleConfig EraseSubtitleConfig;

    /**
    * 水印擦除配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EraseWatermarkConfig")
    @Expose
    private SmartEraseWatermarkConfig EraseWatermarkConfig;

    /**
    * 隐私保护配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErasePrivacyConfig")
    @Expose
    private SmartErasePrivacyConfig ErasePrivacyConfig;

    /**
    * 模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/862/37710#52)。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 模板最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/862/37710#52)。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 智能擦除预设模板别名
    */
    @SerializedName("AliasName")
    @Expose
    private String AliasName;

    /**
     * Get 智能擦除模板唯一标识 
     * @return Definition 智能擦除模板唯一标识
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set 智能擦除模板唯一标识
     * @param Definition 智能擦除模板唯一标识
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get 智能擦除模板名称 
     * @return Name 智能擦除模板名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 智能擦除模板名称
     * @param Name 智能擦除模板名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 智能擦除模板描述信息 
     * @return Comment 智能擦除模板描述信息
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 智能擦除模板描述信息
     * @param Comment 智能擦除模板描述信息
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get 模板类型，取值范围：
* Preset：系统预置模板；
* Custom：用户自定义模板。 
     * @return Type 模板类型，取值范围：
* Preset：系统预置模板；
* Custom：用户自定义模板。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 模板类型，取值范围：
* Preset：系统预置模板；
* Custom：用户自定义模板。
     * @param Type 模板类型，取值范围：
* Preset：系统预置模板；
* Custom：用户自定义模板。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 擦除类型
- subtitle 去字幕
- watermark 去水印
- privacy 隐私保护 
     * @return EraseType 擦除类型
- subtitle 去字幕
- watermark 去水印
- privacy 隐私保护
     */
    public String getEraseType() {
        return this.EraseType;
    }

    /**
     * Set 擦除类型
- subtitle 去字幕
- watermark 去水印
- privacy 隐私保护
     * @param EraseType 擦除类型
- subtitle 去字幕
- watermark 去水印
- privacy 隐私保护
     */
    public void setEraseType(String EraseType) {
        this.EraseType = EraseType;
    }

    /**
     * Get 字幕擦除配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EraseSubtitleConfig 字幕擦除配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SmartEraseSubtitleConfig getEraseSubtitleConfig() {
        return this.EraseSubtitleConfig;
    }

    /**
     * Set 字幕擦除配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param EraseSubtitleConfig 字幕擦除配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEraseSubtitleConfig(SmartEraseSubtitleConfig EraseSubtitleConfig) {
        this.EraseSubtitleConfig = EraseSubtitleConfig;
    }

    /**
     * Get 水印擦除配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EraseWatermarkConfig 水印擦除配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SmartEraseWatermarkConfig getEraseWatermarkConfig() {
        return this.EraseWatermarkConfig;
    }

    /**
     * Set 水印擦除配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param EraseWatermarkConfig 水印擦除配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEraseWatermarkConfig(SmartEraseWatermarkConfig EraseWatermarkConfig) {
        this.EraseWatermarkConfig = EraseWatermarkConfig;
    }

    /**
     * Get 隐私保护配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErasePrivacyConfig 隐私保护配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SmartErasePrivacyConfig getErasePrivacyConfig() {
        return this.ErasePrivacyConfig;
    }

    /**
     * Set 隐私保护配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErasePrivacyConfig 隐私保护配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErasePrivacyConfig(SmartErasePrivacyConfig ErasePrivacyConfig) {
        this.ErasePrivacyConfig = ErasePrivacyConfig;
    }

    /**
     * Get 模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/862/37710#52)。 
     * @return CreateTime 模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/862/37710#52)。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/862/37710#52)。
     * @param CreateTime 模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/862/37710#52)。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 模板最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/862/37710#52)。 
     * @return UpdateTime 模板最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/862/37710#52)。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 模板最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/862/37710#52)。
     * @param UpdateTime 模板最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/862/37710#52)。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 智能擦除预设模板别名 
     * @return AliasName 智能擦除预设模板别名
     */
    public String getAliasName() {
        return this.AliasName;
    }

    /**
     * Set 智能擦除预设模板别名
     * @param AliasName 智能擦除预设模板别名
     */
    public void setAliasName(String AliasName) {
        this.AliasName = AliasName;
    }

    public SmartEraseTemplateItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SmartEraseTemplateItem(SmartEraseTemplateItem source) {
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
        if (source.EraseType != null) {
            this.EraseType = new String(source.EraseType);
        }
        if (source.EraseSubtitleConfig != null) {
            this.EraseSubtitleConfig = new SmartEraseSubtitleConfig(source.EraseSubtitleConfig);
        }
        if (source.EraseWatermarkConfig != null) {
            this.EraseWatermarkConfig = new SmartEraseWatermarkConfig(source.EraseWatermarkConfig);
        }
        if (source.ErasePrivacyConfig != null) {
            this.ErasePrivacyConfig = new SmartErasePrivacyConfig(source.ErasePrivacyConfig);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.AliasName != null) {
            this.AliasName = new String(source.AliasName);
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
        this.setParamSimple(map, prefix + "EraseType", this.EraseType);
        this.setParamObj(map, prefix + "EraseSubtitleConfig.", this.EraseSubtitleConfig);
        this.setParamObj(map, prefix + "EraseWatermarkConfig.", this.EraseWatermarkConfig);
        this.setParamObj(map, prefix + "ErasePrivacyConfig.", this.ErasePrivacyConfig);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "AliasName", this.AliasName);

    }
}

