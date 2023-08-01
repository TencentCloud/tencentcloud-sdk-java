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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TemplateInfo extends AbstractModel{

    /**
    * 模板ID，模板的唯一标识
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * 模板名
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * 模板描述信息
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 模板的填充控件列表
    */
    @SerializedName("Components")
    @Expose
    private Component [] Components;

    /**
    * 模板中的签署参与方列表
    */
    @SerializedName("Recipients")
    @Expose
    private Recipient [] Recipients;

    /**
    * 模板中的签署控件列表
    */
    @SerializedName("SignComponents")
    @Expose
    private Component [] SignComponents;

    /**
    * 模板类型：1-静默签；3-普通模板
    */
    @SerializedName("TemplateType")
    @Expose
    private Long TemplateType;

    /**
    * 是否是发起人 ,已弃用
    */
    @SerializedName("IsPromoter")
    @Expose
    private Boolean IsPromoter;

    /**
    * 模板的创建者信息，电子签系统用户ID
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * 模板创建的时间戳，格式为Unix标准时间戳（秒）
    */
    @SerializedName("CreatedOn")
    @Expose
    private Long CreatedOn;

    /**
    * 模板的H5预览链接,有效期5分钟。
可以通过浏览器打开此链接预览模板，或者嵌入到iframe中预览模板。
（此功能开放需要联系客户经理）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PreviewUrl")
    @Expose
    private String PreviewUrl;

    /**
    * 第三方应用集成-模板PDF文件链接，有效期5分钟。
请求参数WithPdfUrl=true时返回
（此功能开放需要联系客户经理）。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PdfUrl")
    @Expose
    private String PdfUrl;

    /**
    * 本模板关联的第三方应用平台企业模板ID
    */
    @SerializedName("ChannelTemplateId")
    @Expose
    private String ChannelTemplateId;

    /**
    * 本模板关联的三方应用平台平台企业模板名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChannelTemplateName")
    @Expose
    private String ChannelTemplateName;

    /**
    * 0-需要子客企业手动领取平台企业的模板(默认); 
1-平台自动设置子客模板
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChannelAutoSave")
    @Expose
    private Long ChannelAutoSave;

    /**
    * 模板版本，全数字字符。
默认为空，初始版本为yyyyMMdd001。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TemplateVersion")
    @Expose
    private String TemplateVersion;

    /**
    * 模板可用状态：
1启用（默认）
2停用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Available")
    @Expose
    private Long Available;

    /**
     * Get 模板ID，模板的唯一标识 
     * @return TemplateId 模板ID，模板的唯一标识
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 模板ID，模板的唯一标识
     * @param TemplateId 模板ID，模板的唯一标识
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 模板名 
     * @return TemplateName 模板名
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set 模板名
     * @param TemplateName 模板名
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
    }

    /**
     * Get 模板描述信息 
     * @return Description 模板描述信息
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 模板描述信息
     * @param Description 模板描述信息
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 模板的填充控件列表 
     * @return Components 模板的填充控件列表
     */
    public Component [] getComponents() {
        return this.Components;
    }

    /**
     * Set 模板的填充控件列表
     * @param Components 模板的填充控件列表
     */
    public void setComponents(Component [] Components) {
        this.Components = Components;
    }

    /**
     * Get 模板中的签署参与方列表 
     * @return Recipients 模板中的签署参与方列表
     */
    public Recipient [] getRecipients() {
        return this.Recipients;
    }

    /**
     * Set 模板中的签署参与方列表
     * @param Recipients 模板中的签署参与方列表
     */
    public void setRecipients(Recipient [] Recipients) {
        this.Recipients = Recipients;
    }

    /**
     * Get 模板中的签署控件列表 
     * @return SignComponents 模板中的签署控件列表
     */
    public Component [] getSignComponents() {
        return this.SignComponents;
    }

    /**
     * Set 模板中的签署控件列表
     * @param SignComponents 模板中的签署控件列表
     */
    public void setSignComponents(Component [] SignComponents) {
        this.SignComponents = SignComponents;
    }

    /**
     * Get 模板类型：1-静默签；3-普通模板 
     * @return TemplateType 模板类型：1-静默签；3-普通模板
     */
    public Long getTemplateType() {
        return this.TemplateType;
    }

    /**
     * Set 模板类型：1-静默签；3-普通模板
     * @param TemplateType 模板类型：1-静默签；3-普通模板
     */
    public void setTemplateType(Long TemplateType) {
        this.TemplateType = TemplateType;
    }

    /**
     * Get 是否是发起人 ,已弃用 
     * @return IsPromoter 是否是发起人 ,已弃用
     * @deprecated
     */
    @Deprecated
    public Boolean getIsPromoter() {
        return this.IsPromoter;
    }

    /**
     * Set 是否是发起人 ,已弃用
     * @param IsPromoter 是否是发起人 ,已弃用
     * @deprecated
     */
    @Deprecated
    public void setIsPromoter(Boolean IsPromoter) {
        this.IsPromoter = IsPromoter;
    }

    /**
     * Get 模板的创建者信息，电子签系统用户ID 
     * @return Creator 模板的创建者信息，电子签系统用户ID
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set 模板的创建者信息，电子签系统用户ID
     * @param Creator 模板的创建者信息，电子签系统用户ID
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    /**
     * Get 模板创建的时间戳，格式为Unix标准时间戳（秒） 
     * @return CreatedOn 模板创建的时间戳，格式为Unix标准时间戳（秒）
     */
    public Long getCreatedOn() {
        return this.CreatedOn;
    }

    /**
     * Set 模板创建的时间戳，格式为Unix标准时间戳（秒）
     * @param CreatedOn 模板创建的时间戳，格式为Unix标准时间戳（秒）
     */
    public void setCreatedOn(Long CreatedOn) {
        this.CreatedOn = CreatedOn;
    }

    /**
     * Get 模板的H5预览链接,有效期5分钟。
可以通过浏览器打开此链接预览模板，或者嵌入到iframe中预览模板。
（此功能开放需要联系客户经理）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PreviewUrl 模板的H5预览链接,有效期5分钟。
可以通过浏览器打开此链接预览模板，或者嵌入到iframe中预览模板。
（此功能开放需要联系客户经理）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPreviewUrl() {
        return this.PreviewUrl;
    }

    /**
     * Set 模板的H5预览链接,有效期5分钟。
可以通过浏览器打开此链接预览模板，或者嵌入到iframe中预览模板。
（此功能开放需要联系客户经理）
注意：此字段可能返回 null，表示取不到有效值。
     * @param PreviewUrl 模板的H5预览链接,有效期5分钟。
可以通过浏览器打开此链接预览模板，或者嵌入到iframe中预览模板。
（此功能开放需要联系客户经理）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPreviewUrl(String PreviewUrl) {
        this.PreviewUrl = PreviewUrl;
    }

    /**
     * Get 第三方应用集成-模板PDF文件链接，有效期5分钟。
请求参数WithPdfUrl=true时返回
（此功能开放需要联系客户经理）。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PdfUrl 第三方应用集成-模板PDF文件链接，有效期5分钟。
请求参数WithPdfUrl=true时返回
（此功能开放需要联系客户经理）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPdfUrl() {
        return this.PdfUrl;
    }

    /**
     * Set 第三方应用集成-模板PDF文件链接，有效期5分钟。
请求参数WithPdfUrl=true时返回
（此功能开放需要联系客户经理）。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PdfUrl 第三方应用集成-模板PDF文件链接，有效期5分钟。
请求参数WithPdfUrl=true时返回
（此功能开放需要联系客户经理）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPdfUrl(String PdfUrl) {
        this.PdfUrl = PdfUrl;
    }

    /**
     * Get 本模板关联的第三方应用平台企业模板ID 
     * @return ChannelTemplateId 本模板关联的第三方应用平台企业模板ID
     */
    public String getChannelTemplateId() {
        return this.ChannelTemplateId;
    }

    /**
     * Set 本模板关联的第三方应用平台企业模板ID
     * @param ChannelTemplateId 本模板关联的第三方应用平台企业模板ID
     */
    public void setChannelTemplateId(String ChannelTemplateId) {
        this.ChannelTemplateId = ChannelTemplateId;
    }

    /**
     * Get 本模板关联的三方应用平台平台企业模板名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChannelTemplateName 本模板关联的三方应用平台平台企业模板名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getChannelTemplateName() {
        return this.ChannelTemplateName;
    }

    /**
     * Set 本模板关联的三方应用平台平台企业模板名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChannelTemplateName 本模板关联的三方应用平台平台企业模板名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChannelTemplateName(String ChannelTemplateName) {
        this.ChannelTemplateName = ChannelTemplateName;
    }

    /**
     * Get 0-需要子客企业手动领取平台企业的模板(默认); 
1-平台自动设置子客模板
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChannelAutoSave 0-需要子客企业手动领取平台企业的模板(默认); 
1-平台自动设置子客模板
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getChannelAutoSave() {
        return this.ChannelAutoSave;
    }

    /**
     * Set 0-需要子客企业手动领取平台企业的模板(默认); 
1-平台自动设置子客模板
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChannelAutoSave 0-需要子客企业手动领取平台企业的模板(默认); 
1-平台自动设置子客模板
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChannelAutoSave(Long ChannelAutoSave) {
        this.ChannelAutoSave = ChannelAutoSave;
    }

    /**
     * Get 模板版本，全数字字符。
默认为空，初始版本为yyyyMMdd001。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TemplateVersion 模板版本，全数字字符。
默认为空，初始版本为yyyyMMdd001。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTemplateVersion() {
        return this.TemplateVersion;
    }

    /**
     * Set 模板版本，全数字字符。
默认为空，初始版本为yyyyMMdd001。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TemplateVersion 模板版本，全数字字符。
默认为空，初始版本为yyyyMMdd001。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTemplateVersion(String TemplateVersion) {
        this.TemplateVersion = TemplateVersion;
    }

    /**
     * Get 模板可用状态：
1启用（默认）
2停用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Available 模板可用状态：
1启用（默认）
2停用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAvailable() {
        return this.Available;
    }

    /**
     * Set 模板可用状态：
1启用（默认）
2停用
注意：此字段可能返回 null，表示取不到有效值。
     * @param Available 模板可用状态：
1启用（默认）
2停用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAvailable(Long Available) {
        this.Available = Available;
    }

    public TemplateInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TemplateInfo(TemplateInfo source) {
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.TemplateName != null) {
            this.TemplateName = new String(source.TemplateName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Components != null) {
            this.Components = new Component[source.Components.length];
            for (int i = 0; i < source.Components.length; i++) {
                this.Components[i] = new Component(source.Components[i]);
            }
        }
        if (source.Recipients != null) {
            this.Recipients = new Recipient[source.Recipients.length];
            for (int i = 0; i < source.Recipients.length; i++) {
                this.Recipients[i] = new Recipient(source.Recipients[i]);
            }
        }
        if (source.SignComponents != null) {
            this.SignComponents = new Component[source.SignComponents.length];
            for (int i = 0; i < source.SignComponents.length; i++) {
                this.SignComponents[i] = new Component(source.SignComponents[i]);
            }
        }
        if (source.TemplateType != null) {
            this.TemplateType = new Long(source.TemplateType);
        }
        if (source.IsPromoter != null) {
            this.IsPromoter = new Boolean(source.IsPromoter);
        }
        if (source.Creator != null) {
            this.Creator = new String(source.Creator);
        }
        if (source.CreatedOn != null) {
            this.CreatedOn = new Long(source.CreatedOn);
        }
        if (source.PreviewUrl != null) {
            this.PreviewUrl = new String(source.PreviewUrl);
        }
        if (source.PdfUrl != null) {
            this.PdfUrl = new String(source.PdfUrl);
        }
        if (source.ChannelTemplateId != null) {
            this.ChannelTemplateId = new String(source.ChannelTemplateId);
        }
        if (source.ChannelTemplateName != null) {
            this.ChannelTemplateName = new String(source.ChannelTemplateName);
        }
        if (source.ChannelAutoSave != null) {
            this.ChannelAutoSave = new Long(source.ChannelAutoSave);
        }
        if (source.TemplateVersion != null) {
            this.TemplateVersion = new String(source.TemplateVersion);
        }
        if (source.Available != null) {
            this.Available = new Long(source.Available);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArrayObj(map, prefix + "Components.", this.Components);
        this.setParamArrayObj(map, prefix + "Recipients.", this.Recipients);
        this.setParamArrayObj(map, prefix + "SignComponents.", this.SignComponents);
        this.setParamSimple(map, prefix + "TemplateType", this.TemplateType);
        this.setParamSimple(map, prefix + "IsPromoter", this.IsPromoter);
        this.setParamSimple(map, prefix + "Creator", this.Creator);
        this.setParamSimple(map, prefix + "CreatedOn", this.CreatedOn);
        this.setParamSimple(map, prefix + "PreviewUrl", this.PreviewUrl);
        this.setParamSimple(map, prefix + "PdfUrl", this.PdfUrl);
        this.setParamSimple(map, prefix + "ChannelTemplateId", this.ChannelTemplateId);
        this.setParamSimple(map, prefix + "ChannelTemplateName", this.ChannelTemplateName);
        this.setParamSimple(map, prefix + "ChannelAutoSave", this.ChannelAutoSave);
        this.setParamSimple(map, prefix + "TemplateVersion", this.TemplateVersion);
        this.setParamSimple(map, prefix + "Available", this.Available);

    }
}

