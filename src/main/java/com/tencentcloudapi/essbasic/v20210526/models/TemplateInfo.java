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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TemplateInfo extends AbstractModel {

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

[点击查看在模板中配置的填充控件的样子](https://qcloudimg.tencent-cloud.cn/raw/cb2f58529fca8d909258f9d45a56f7f4.png)
    */
    @SerializedName("Components")
    @Expose
    private Component [] Components;

    /**
    * 此模块需要签署的各个参与方的角色列表。RecipientId标识每个参与方角色对应的唯一标识符，用于确定此角色的信息。

[点击查看在模板中配置的签署参与方角色列表的样子](https://qcloudimg.tencent-cloud.cn/raw/e082bbcc0d923f8cb723d98382410aa2.png)


    */
    @SerializedName("Recipients")
    @Expose
    private Recipient [] Recipients;

    /**
    * 此模板中的签署控件列表

[点击查看在模板中配置的签署控件的样子](https://qcloudimg.tencent-cloud.cn/raw/29bc6ed753a5a0fce4a3ab02e2c0d955.png)
    */
    @SerializedName("SignComponents")
    @Expose
    private Component [] SignComponents;

    /**
    * 模板类型可以分为以下两种：

<b>1</b>：带有<b>本企业自动签署</b>的模板，即签署过程无需签署人手动操作，系统自动完成签署。
<b>3</b>：普通模板，即签署人需要手动进行签署操作。
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
    * 模板的创建者名字
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
    * 模板的 H5 预览链接，有效期为 5 分钟。
您可以通过浏览器直接打开此链接预览模板，或将其嵌入到 iframe 中进行预览。

注意：只有在请求接口时将 <b>WithPreviewUrl </b>参数设置为 true，才会生成预览链接。
    */
    @SerializedName("PreviewUrl")
    @Expose
    private String PreviewUrl;

    /**
    * 第三方应用集成-模板PDF文件链接，有效期5分钟。
请求参数WithPdfUrl=true时返回
（此功能开放需要联系客户经理）。
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
    */
    @SerializedName("ChannelTemplateName")
    @Expose
    private String ChannelTemplateName;

    /**
    * 0-需要子客企业手动领取平台企业的模板(默认); 
1-平台自动设置子客模板
    */
    @SerializedName("ChannelAutoSave")
    @Expose
    private Long ChannelAutoSave;

    /**
    * 模板版本，由全数字字符组成。
默认为空，模板版本号由日期和序号组成，初始版本为yyyyMMdd001，yyyyMMdd002表示第二个版本，以此类推。
    */
    @SerializedName("TemplateVersion")
    @Expose
    private String TemplateVersion;

    /**
    * 模板可用状态的取值通常为以下两种：

<ul><li>1：启用（默认），表示模板处于启用状态，可以被用户正常使用。</li>
<li>2：停用，表示模板处于停用状态，禁止用户使用该模板。</li></ul>
    */
    @SerializedName("Available")
    @Expose
    private Long Available;

    /**
    * 模版的用户合同类型
    */
    @SerializedName("UserFlowType")
    @Expose
    private UserFlowType UserFlowType;

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

[点击查看在模板中配置的填充控件的样子](https://qcloudimg.tencent-cloud.cn/raw/cb2f58529fca8d909258f9d45a56f7f4.png) 
     * @return Components 模板的填充控件列表

[点击查看在模板中配置的填充控件的样子](https://qcloudimg.tencent-cloud.cn/raw/cb2f58529fca8d909258f9d45a56f7f4.png)
     */
    public Component [] getComponents() {
        return this.Components;
    }

    /**
     * Set 模板的填充控件列表

[点击查看在模板中配置的填充控件的样子](https://qcloudimg.tencent-cloud.cn/raw/cb2f58529fca8d909258f9d45a56f7f4.png)
     * @param Components 模板的填充控件列表

[点击查看在模板中配置的填充控件的样子](https://qcloudimg.tencent-cloud.cn/raw/cb2f58529fca8d909258f9d45a56f7f4.png)
     */
    public void setComponents(Component [] Components) {
        this.Components = Components;
    }

    /**
     * Get 此模块需要签署的各个参与方的角色列表。RecipientId标识每个参与方角色对应的唯一标识符，用于确定此角色的信息。

[点击查看在模板中配置的签署参与方角色列表的样子](https://qcloudimg.tencent-cloud.cn/raw/e082bbcc0d923f8cb723d98382410aa2.png)

 
     * @return Recipients 此模块需要签署的各个参与方的角色列表。RecipientId标识每个参与方角色对应的唯一标识符，用于确定此角色的信息。

[点击查看在模板中配置的签署参与方角色列表的样子](https://qcloudimg.tencent-cloud.cn/raw/e082bbcc0d923f8cb723d98382410aa2.png)


     */
    public Recipient [] getRecipients() {
        return this.Recipients;
    }

    /**
     * Set 此模块需要签署的各个参与方的角色列表。RecipientId标识每个参与方角色对应的唯一标识符，用于确定此角色的信息。

[点击查看在模板中配置的签署参与方角色列表的样子](https://qcloudimg.tencent-cloud.cn/raw/e082bbcc0d923f8cb723d98382410aa2.png)


     * @param Recipients 此模块需要签署的各个参与方的角色列表。RecipientId标识每个参与方角色对应的唯一标识符，用于确定此角色的信息。

[点击查看在模板中配置的签署参与方角色列表的样子](https://qcloudimg.tencent-cloud.cn/raw/e082bbcc0d923f8cb723d98382410aa2.png)


     */
    public void setRecipients(Recipient [] Recipients) {
        this.Recipients = Recipients;
    }

    /**
     * Get 此模板中的签署控件列表

[点击查看在模板中配置的签署控件的样子](https://qcloudimg.tencent-cloud.cn/raw/29bc6ed753a5a0fce4a3ab02e2c0d955.png) 
     * @return SignComponents 此模板中的签署控件列表

[点击查看在模板中配置的签署控件的样子](https://qcloudimg.tencent-cloud.cn/raw/29bc6ed753a5a0fce4a3ab02e2c0d955.png)
     */
    public Component [] getSignComponents() {
        return this.SignComponents;
    }

    /**
     * Set 此模板中的签署控件列表

[点击查看在模板中配置的签署控件的样子](https://qcloudimg.tencent-cloud.cn/raw/29bc6ed753a5a0fce4a3ab02e2c0d955.png)
     * @param SignComponents 此模板中的签署控件列表

[点击查看在模板中配置的签署控件的样子](https://qcloudimg.tencent-cloud.cn/raw/29bc6ed753a5a0fce4a3ab02e2c0d955.png)
     */
    public void setSignComponents(Component [] SignComponents) {
        this.SignComponents = SignComponents;
    }

    /**
     * Get 模板类型可以分为以下两种：

<b>1</b>：带有<b>本企业自动签署</b>的模板，即签署过程无需签署人手动操作，系统自动完成签署。
<b>3</b>：普通模板，即签署人需要手动进行签署操作。 
     * @return TemplateType 模板类型可以分为以下两种：

<b>1</b>：带有<b>本企业自动签署</b>的模板，即签署过程无需签署人手动操作，系统自动完成签署。
<b>3</b>：普通模板，即签署人需要手动进行签署操作。
     */
    public Long getTemplateType() {
        return this.TemplateType;
    }

    /**
     * Set 模板类型可以分为以下两种：

<b>1</b>：带有<b>本企业自动签署</b>的模板，即签署过程无需签署人手动操作，系统自动完成签署。
<b>3</b>：普通模板，即签署人需要手动进行签署操作。
     * @param TemplateType 模板类型可以分为以下两种：

<b>1</b>：带有<b>本企业自动签署</b>的模板，即签署过程无需签署人手动操作，系统自动完成签署。
<b>3</b>：普通模板，即签署人需要手动进行签署操作。
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
     * Get 模板的创建者名字 
     * @return Creator 模板的创建者名字
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set 模板的创建者名字
     * @param Creator 模板的创建者名字
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
     * Get 模板的 H5 预览链接，有效期为 5 分钟。
您可以通过浏览器直接打开此链接预览模板，或将其嵌入到 iframe 中进行预览。

注意：只有在请求接口时将 <b>WithPreviewUrl </b>参数设置为 true，才会生成预览链接。 
     * @return PreviewUrl 模板的 H5 预览链接，有效期为 5 分钟。
您可以通过浏览器直接打开此链接预览模板，或将其嵌入到 iframe 中进行预览。

注意：只有在请求接口时将 <b>WithPreviewUrl </b>参数设置为 true，才会生成预览链接。
     */
    public String getPreviewUrl() {
        return this.PreviewUrl;
    }

    /**
     * Set 模板的 H5 预览链接，有效期为 5 分钟。
您可以通过浏览器直接打开此链接预览模板，或将其嵌入到 iframe 中进行预览。

注意：只有在请求接口时将 <b>WithPreviewUrl </b>参数设置为 true，才会生成预览链接。
     * @param PreviewUrl 模板的 H5 预览链接，有效期为 5 分钟。
您可以通过浏览器直接打开此链接预览模板，或将其嵌入到 iframe 中进行预览。

注意：只有在请求接口时将 <b>WithPreviewUrl </b>参数设置为 true，才会生成预览链接。
     */
    public void setPreviewUrl(String PreviewUrl) {
        this.PreviewUrl = PreviewUrl;
    }

    /**
     * Get 第三方应用集成-模板PDF文件链接，有效期5分钟。
请求参数WithPdfUrl=true时返回
（此功能开放需要联系客户经理）。 
     * @return PdfUrl 第三方应用集成-模板PDF文件链接，有效期5分钟。
请求参数WithPdfUrl=true时返回
（此功能开放需要联系客户经理）。
     */
    public String getPdfUrl() {
        return this.PdfUrl;
    }

    /**
     * Set 第三方应用集成-模板PDF文件链接，有效期5分钟。
请求参数WithPdfUrl=true时返回
（此功能开放需要联系客户经理）。
     * @param PdfUrl 第三方应用集成-模板PDF文件链接，有效期5分钟。
请求参数WithPdfUrl=true时返回
（此功能开放需要联系客户经理）。
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
     * @return ChannelTemplateName 本模板关联的三方应用平台平台企业模板名称
     */
    public String getChannelTemplateName() {
        return this.ChannelTemplateName;
    }

    /**
     * Set 本模板关联的三方应用平台平台企业模板名称
     * @param ChannelTemplateName 本模板关联的三方应用平台平台企业模板名称
     */
    public void setChannelTemplateName(String ChannelTemplateName) {
        this.ChannelTemplateName = ChannelTemplateName;
    }

    /**
     * Get 0-需要子客企业手动领取平台企业的模板(默认); 
1-平台自动设置子客模板 
     * @return ChannelAutoSave 0-需要子客企业手动领取平台企业的模板(默认); 
1-平台自动设置子客模板
     */
    public Long getChannelAutoSave() {
        return this.ChannelAutoSave;
    }

    /**
     * Set 0-需要子客企业手动领取平台企业的模板(默认); 
1-平台自动设置子客模板
     * @param ChannelAutoSave 0-需要子客企业手动领取平台企业的模板(默认); 
1-平台自动设置子客模板
     */
    public void setChannelAutoSave(Long ChannelAutoSave) {
        this.ChannelAutoSave = ChannelAutoSave;
    }

    /**
     * Get 模板版本，由全数字字符组成。
默认为空，模板版本号由日期和序号组成，初始版本为yyyyMMdd001，yyyyMMdd002表示第二个版本，以此类推。 
     * @return TemplateVersion 模板版本，由全数字字符组成。
默认为空，模板版本号由日期和序号组成，初始版本为yyyyMMdd001，yyyyMMdd002表示第二个版本，以此类推。
     */
    public String getTemplateVersion() {
        return this.TemplateVersion;
    }

    /**
     * Set 模板版本，由全数字字符组成。
默认为空，模板版本号由日期和序号组成，初始版本为yyyyMMdd001，yyyyMMdd002表示第二个版本，以此类推。
     * @param TemplateVersion 模板版本，由全数字字符组成。
默认为空，模板版本号由日期和序号组成，初始版本为yyyyMMdd001，yyyyMMdd002表示第二个版本，以此类推。
     */
    public void setTemplateVersion(String TemplateVersion) {
        this.TemplateVersion = TemplateVersion;
    }

    /**
     * Get 模板可用状态的取值通常为以下两种：

<ul><li>1：启用（默认），表示模板处于启用状态，可以被用户正常使用。</li>
<li>2：停用，表示模板处于停用状态，禁止用户使用该模板。</li></ul> 
     * @return Available 模板可用状态的取值通常为以下两种：

<ul><li>1：启用（默认），表示模板处于启用状态，可以被用户正常使用。</li>
<li>2：停用，表示模板处于停用状态，禁止用户使用该模板。</li></ul>
     */
    public Long getAvailable() {
        return this.Available;
    }

    /**
     * Set 模板可用状态的取值通常为以下两种：

<ul><li>1：启用（默认），表示模板处于启用状态，可以被用户正常使用。</li>
<li>2：停用，表示模板处于停用状态，禁止用户使用该模板。</li></ul>
     * @param Available 模板可用状态的取值通常为以下两种：

<ul><li>1：启用（默认），表示模板处于启用状态，可以被用户正常使用。</li>
<li>2：停用，表示模板处于停用状态，禁止用户使用该模板。</li></ul>
     */
    public void setAvailable(Long Available) {
        this.Available = Available;
    }

    /**
     * Get 模版的用户合同类型 
     * @return UserFlowType 模版的用户合同类型
     */
    public UserFlowType getUserFlowType() {
        return this.UserFlowType;
    }

    /**
     * Set 模版的用户合同类型
     * @param UserFlowType 模版的用户合同类型
     */
    public void setUserFlowType(UserFlowType UserFlowType) {
        this.UserFlowType = UserFlowType;
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
        if (source.UserFlowType != null) {
            this.UserFlowType = new UserFlowType(source.UserFlowType);
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
        this.setParamObj(map, prefix + "UserFlowType.", this.UserFlowType);

    }
}

