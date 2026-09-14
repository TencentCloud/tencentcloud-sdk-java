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
    * <p>模板ID，模板的唯一标识</p>
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * <p>模板名</p>
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * <p>模板描述信息</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>模板的填充控件列表</p><p><a href="https://qcloudimg.tencent-cloud.cn/raw/cb2f58529fca8d909258f9d45a56f7f4.png">点击查看在模板中配置的填充控件的样子</a></p>
    */
    @SerializedName("Components")
    @Expose
    private Component [] Components;

    /**
    * <p>此模块需要签署的各个参与方的角色列表。RecipientId标识每个参与方角色对应的唯一标识符，用于确定此角色的信息。</p><p><a href="https://qcloudimg.tencent-cloud.cn/raw/e082bbcc0d923f8cb723d98382410aa2.png">点击查看在模板中配置的签署参与方角色列表的样子</a></p>
    */
    @SerializedName("Recipients")
    @Expose
    private Recipient [] Recipients;

    /**
    * <p>此模板中的签署控件列表</p><p><a href="https://qcloudimg.tencent-cloud.cn/raw/29bc6ed753a5a0fce4a3ab02e2c0d955.png">点击查看在模板中配置的签署控件的样子</a></p>
    */
    @SerializedName("SignComponents")
    @Expose
    private Component [] SignComponents;

    /**
    * <p>模板类型可以分为以下两种：<b>1</b>：带有<b>本企业“授权签”</b>的模板，即签署过程无需签署人手动操作，系统自动完成签署。<b>3</b>：普通模板，即签署人需要手动进行签署操作。</p>
    */
    @SerializedName("TemplateType")
    @Expose
    private Long TemplateType;

    /**
    * <p>是否是发起人 ,已弃用</p>
    */
    @SerializedName("IsPromoter")
    @Expose
    private Boolean IsPromoter;

    /**
    * <p>模板的创建者名字</p>
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * <p>模板创建的时间戳，格式为Unix标准时间戳（秒）</p>
    */
    @SerializedName("CreatedOn")
    @Expose
    private Long CreatedOn;

    /**
    * <p>模板的 H5 预览链接，有效期为 5 分钟。<br>您可以通过浏览器直接打开此链接预览模板，或将其嵌入到 iframe 中进行预览。</p><p>注意：只有在请求接口时将 <b>WithPreviewUrl </b>参数设置为 true，才会生成预览链接。</p>
    */
    @SerializedName("PreviewUrl")
    @Expose
    private String PreviewUrl;

    /**
    * <p>第三方应用集成-模板PDF文件链接，有效期5分钟。<br>请求参数WithPdfUrl=true时返回<br>（此功能开放需要联系客户经理）。</p>
    */
    @SerializedName("PdfUrl")
    @Expose
    private String PdfUrl;

    /**
    * <p>本模板关联的第三方应用平台企业模板ID</p>
    */
    @SerializedName("ChannelTemplateId")
    @Expose
    private String ChannelTemplateId;

    /**
    * <p>本模板关联的三方应用平台平台企业模板名称</p>
    */
    @SerializedName("ChannelTemplateName")
    @Expose
    private String ChannelTemplateName;

    /**
    * <p>0-需要子客企业手动领取平台企业的模板(默认);<br>1-平台自动设置子客模板</p>
    */
    @SerializedName("ChannelAutoSave")
    @Expose
    private Long ChannelAutoSave;

    /**
    * <p>模板版本，由全数字字符组成。<br>默认为空，模板版本号由日期和序号组成，初始版本为yyyyMMdd001，yyyyMMdd002表示第二个版本，以此类推。</p>
    */
    @SerializedName("TemplateVersion")
    @Expose
    private String TemplateVersion;

    /**
    * <p>模板可用状态的取值通常为以下两种：</p><ul><li>1：启用（默认），表示模板处于启用状态，可以被用户正常使用。</li><li>2：停用，表示模板处于停用状态，禁止用户使用该模板。</li></ul>
    */
    @SerializedName("Available")
    @Expose
    private Long Available;

    /**
    * <p>模板的用户合同类型</p>
    */
    @SerializedName("UserFlowType")
    @Expose
    private UserFlowType UserFlowType;

    /**
     * Get <p>模板ID，模板的唯一标识</p> 
     * @return TemplateId <p>模板ID，模板的唯一标识</p>
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set <p>模板ID，模板的唯一标识</p>
     * @param TemplateId <p>模板ID，模板的唯一标识</p>
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get <p>模板名</p> 
     * @return TemplateName <p>模板名</p>
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set <p>模板名</p>
     * @param TemplateName <p>模板名</p>
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
    }

    /**
     * Get <p>模板描述信息</p> 
     * @return Description <p>模板描述信息</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>模板描述信息</p>
     * @param Description <p>模板描述信息</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>模板的填充控件列表</p><p><a href="https://qcloudimg.tencent-cloud.cn/raw/cb2f58529fca8d909258f9d45a56f7f4.png">点击查看在模板中配置的填充控件的样子</a></p> 
     * @return Components <p>模板的填充控件列表</p><p><a href="https://qcloudimg.tencent-cloud.cn/raw/cb2f58529fca8d909258f9d45a56f7f4.png">点击查看在模板中配置的填充控件的样子</a></p>
     */
    public Component [] getComponents() {
        return this.Components;
    }

    /**
     * Set <p>模板的填充控件列表</p><p><a href="https://qcloudimg.tencent-cloud.cn/raw/cb2f58529fca8d909258f9d45a56f7f4.png">点击查看在模板中配置的填充控件的样子</a></p>
     * @param Components <p>模板的填充控件列表</p><p><a href="https://qcloudimg.tencent-cloud.cn/raw/cb2f58529fca8d909258f9d45a56f7f4.png">点击查看在模板中配置的填充控件的样子</a></p>
     */
    public void setComponents(Component [] Components) {
        this.Components = Components;
    }

    /**
     * Get <p>此模块需要签署的各个参与方的角色列表。RecipientId标识每个参与方角色对应的唯一标识符，用于确定此角色的信息。</p><p><a href="https://qcloudimg.tencent-cloud.cn/raw/e082bbcc0d923f8cb723d98382410aa2.png">点击查看在模板中配置的签署参与方角色列表的样子</a></p> 
     * @return Recipients <p>此模块需要签署的各个参与方的角色列表。RecipientId标识每个参与方角色对应的唯一标识符，用于确定此角色的信息。</p><p><a href="https://qcloudimg.tencent-cloud.cn/raw/e082bbcc0d923f8cb723d98382410aa2.png">点击查看在模板中配置的签署参与方角色列表的样子</a></p>
     */
    public Recipient [] getRecipients() {
        return this.Recipients;
    }

    /**
     * Set <p>此模块需要签署的各个参与方的角色列表。RecipientId标识每个参与方角色对应的唯一标识符，用于确定此角色的信息。</p><p><a href="https://qcloudimg.tencent-cloud.cn/raw/e082bbcc0d923f8cb723d98382410aa2.png">点击查看在模板中配置的签署参与方角色列表的样子</a></p>
     * @param Recipients <p>此模块需要签署的各个参与方的角色列表。RecipientId标识每个参与方角色对应的唯一标识符，用于确定此角色的信息。</p><p><a href="https://qcloudimg.tencent-cloud.cn/raw/e082bbcc0d923f8cb723d98382410aa2.png">点击查看在模板中配置的签署参与方角色列表的样子</a></p>
     */
    public void setRecipients(Recipient [] Recipients) {
        this.Recipients = Recipients;
    }

    /**
     * Get <p>此模板中的签署控件列表</p><p><a href="https://qcloudimg.tencent-cloud.cn/raw/29bc6ed753a5a0fce4a3ab02e2c0d955.png">点击查看在模板中配置的签署控件的样子</a></p> 
     * @return SignComponents <p>此模板中的签署控件列表</p><p><a href="https://qcloudimg.tencent-cloud.cn/raw/29bc6ed753a5a0fce4a3ab02e2c0d955.png">点击查看在模板中配置的签署控件的样子</a></p>
     */
    public Component [] getSignComponents() {
        return this.SignComponents;
    }

    /**
     * Set <p>此模板中的签署控件列表</p><p><a href="https://qcloudimg.tencent-cloud.cn/raw/29bc6ed753a5a0fce4a3ab02e2c0d955.png">点击查看在模板中配置的签署控件的样子</a></p>
     * @param SignComponents <p>此模板中的签署控件列表</p><p><a href="https://qcloudimg.tencent-cloud.cn/raw/29bc6ed753a5a0fce4a3ab02e2c0d955.png">点击查看在模板中配置的签署控件的样子</a></p>
     */
    public void setSignComponents(Component [] SignComponents) {
        this.SignComponents = SignComponents;
    }

    /**
     * Get <p>模板类型可以分为以下两种：<b>1</b>：带有<b>本企业“授权签”</b>的模板，即签署过程无需签署人手动操作，系统自动完成签署。<b>3</b>：普通模板，即签署人需要手动进行签署操作。</p> 
     * @return TemplateType <p>模板类型可以分为以下两种：<b>1</b>：带有<b>本企业“授权签”</b>的模板，即签署过程无需签署人手动操作，系统自动完成签署。<b>3</b>：普通模板，即签署人需要手动进行签署操作。</p>
     */
    public Long getTemplateType() {
        return this.TemplateType;
    }

    /**
     * Set <p>模板类型可以分为以下两种：<b>1</b>：带有<b>本企业“授权签”</b>的模板，即签署过程无需签署人手动操作，系统自动完成签署。<b>3</b>：普通模板，即签署人需要手动进行签署操作。</p>
     * @param TemplateType <p>模板类型可以分为以下两种：<b>1</b>：带有<b>本企业“授权签”</b>的模板，即签署过程无需签署人手动操作，系统自动完成签署。<b>3</b>：普通模板，即签署人需要手动进行签署操作。</p>
     */
    public void setTemplateType(Long TemplateType) {
        this.TemplateType = TemplateType;
    }

    /**
     * Get <p>是否是发起人 ,已弃用</p> 
     * @return IsPromoter <p>是否是发起人 ,已弃用</p>
     * @deprecated
     */
    @Deprecated
    public Boolean getIsPromoter() {
        return this.IsPromoter;
    }

    /**
     * Set <p>是否是发起人 ,已弃用</p>
     * @param IsPromoter <p>是否是发起人 ,已弃用</p>
     * @deprecated
     */
    @Deprecated
    public void setIsPromoter(Boolean IsPromoter) {
        this.IsPromoter = IsPromoter;
    }

    /**
     * Get <p>模板的创建者名字</p> 
     * @return Creator <p>模板的创建者名字</p>
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set <p>模板的创建者名字</p>
     * @param Creator <p>模板的创建者名字</p>
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    /**
     * Get <p>模板创建的时间戳，格式为Unix标准时间戳（秒）</p> 
     * @return CreatedOn <p>模板创建的时间戳，格式为Unix标准时间戳（秒）</p>
     */
    public Long getCreatedOn() {
        return this.CreatedOn;
    }

    /**
     * Set <p>模板创建的时间戳，格式为Unix标准时间戳（秒）</p>
     * @param CreatedOn <p>模板创建的时间戳，格式为Unix标准时间戳（秒）</p>
     */
    public void setCreatedOn(Long CreatedOn) {
        this.CreatedOn = CreatedOn;
    }

    /**
     * Get <p>模板的 H5 预览链接，有效期为 5 分钟。<br>您可以通过浏览器直接打开此链接预览模板，或将其嵌入到 iframe 中进行预览。</p><p>注意：只有在请求接口时将 <b>WithPreviewUrl </b>参数设置为 true，才会生成预览链接。</p> 
     * @return PreviewUrl <p>模板的 H5 预览链接，有效期为 5 分钟。<br>您可以通过浏览器直接打开此链接预览模板，或将其嵌入到 iframe 中进行预览。</p><p>注意：只有在请求接口时将 <b>WithPreviewUrl </b>参数设置为 true，才会生成预览链接。</p>
     */
    public String getPreviewUrl() {
        return this.PreviewUrl;
    }

    /**
     * Set <p>模板的 H5 预览链接，有效期为 5 分钟。<br>您可以通过浏览器直接打开此链接预览模板，或将其嵌入到 iframe 中进行预览。</p><p>注意：只有在请求接口时将 <b>WithPreviewUrl </b>参数设置为 true，才会生成预览链接。</p>
     * @param PreviewUrl <p>模板的 H5 预览链接，有效期为 5 分钟。<br>您可以通过浏览器直接打开此链接预览模板，或将其嵌入到 iframe 中进行预览。</p><p>注意：只有在请求接口时将 <b>WithPreviewUrl </b>参数设置为 true，才会生成预览链接。</p>
     */
    public void setPreviewUrl(String PreviewUrl) {
        this.PreviewUrl = PreviewUrl;
    }

    /**
     * Get <p>第三方应用集成-模板PDF文件链接，有效期5分钟。<br>请求参数WithPdfUrl=true时返回<br>（此功能开放需要联系客户经理）。</p> 
     * @return PdfUrl <p>第三方应用集成-模板PDF文件链接，有效期5分钟。<br>请求参数WithPdfUrl=true时返回<br>（此功能开放需要联系客户经理）。</p>
     */
    public String getPdfUrl() {
        return this.PdfUrl;
    }

    /**
     * Set <p>第三方应用集成-模板PDF文件链接，有效期5分钟。<br>请求参数WithPdfUrl=true时返回<br>（此功能开放需要联系客户经理）。</p>
     * @param PdfUrl <p>第三方应用集成-模板PDF文件链接，有效期5分钟。<br>请求参数WithPdfUrl=true时返回<br>（此功能开放需要联系客户经理）。</p>
     */
    public void setPdfUrl(String PdfUrl) {
        this.PdfUrl = PdfUrl;
    }

    /**
     * Get <p>本模板关联的第三方应用平台企业模板ID</p> 
     * @return ChannelTemplateId <p>本模板关联的第三方应用平台企业模板ID</p>
     */
    public String getChannelTemplateId() {
        return this.ChannelTemplateId;
    }

    /**
     * Set <p>本模板关联的第三方应用平台企业模板ID</p>
     * @param ChannelTemplateId <p>本模板关联的第三方应用平台企业模板ID</p>
     */
    public void setChannelTemplateId(String ChannelTemplateId) {
        this.ChannelTemplateId = ChannelTemplateId;
    }

    /**
     * Get <p>本模板关联的三方应用平台平台企业模板名称</p> 
     * @return ChannelTemplateName <p>本模板关联的三方应用平台平台企业模板名称</p>
     */
    public String getChannelTemplateName() {
        return this.ChannelTemplateName;
    }

    /**
     * Set <p>本模板关联的三方应用平台平台企业模板名称</p>
     * @param ChannelTemplateName <p>本模板关联的三方应用平台平台企业模板名称</p>
     */
    public void setChannelTemplateName(String ChannelTemplateName) {
        this.ChannelTemplateName = ChannelTemplateName;
    }

    /**
     * Get <p>0-需要子客企业手动领取平台企业的模板(默认);<br>1-平台自动设置子客模板</p> 
     * @return ChannelAutoSave <p>0-需要子客企业手动领取平台企业的模板(默认);<br>1-平台自动设置子客模板</p>
     */
    public Long getChannelAutoSave() {
        return this.ChannelAutoSave;
    }

    /**
     * Set <p>0-需要子客企业手动领取平台企业的模板(默认);<br>1-平台自动设置子客模板</p>
     * @param ChannelAutoSave <p>0-需要子客企业手动领取平台企业的模板(默认);<br>1-平台自动设置子客模板</p>
     */
    public void setChannelAutoSave(Long ChannelAutoSave) {
        this.ChannelAutoSave = ChannelAutoSave;
    }

    /**
     * Get <p>模板版本，由全数字字符组成。<br>默认为空，模板版本号由日期和序号组成，初始版本为yyyyMMdd001，yyyyMMdd002表示第二个版本，以此类推。</p> 
     * @return TemplateVersion <p>模板版本，由全数字字符组成。<br>默认为空，模板版本号由日期和序号组成，初始版本为yyyyMMdd001，yyyyMMdd002表示第二个版本，以此类推。</p>
     */
    public String getTemplateVersion() {
        return this.TemplateVersion;
    }

    /**
     * Set <p>模板版本，由全数字字符组成。<br>默认为空，模板版本号由日期和序号组成，初始版本为yyyyMMdd001，yyyyMMdd002表示第二个版本，以此类推。</p>
     * @param TemplateVersion <p>模板版本，由全数字字符组成。<br>默认为空，模板版本号由日期和序号组成，初始版本为yyyyMMdd001，yyyyMMdd002表示第二个版本，以此类推。</p>
     */
    public void setTemplateVersion(String TemplateVersion) {
        this.TemplateVersion = TemplateVersion;
    }

    /**
     * Get <p>模板可用状态的取值通常为以下两种：</p><ul><li>1：启用（默认），表示模板处于启用状态，可以被用户正常使用。</li><li>2：停用，表示模板处于停用状态，禁止用户使用该模板。</li></ul> 
     * @return Available <p>模板可用状态的取值通常为以下两种：</p><ul><li>1：启用（默认），表示模板处于启用状态，可以被用户正常使用。</li><li>2：停用，表示模板处于停用状态，禁止用户使用该模板。</li></ul>
     */
    public Long getAvailable() {
        return this.Available;
    }

    /**
     * Set <p>模板可用状态的取值通常为以下两种：</p><ul><li>1：启用（默认），表示模板处于启用状态，可以被用户正常使用。</li><li>2：停用，表示模板处于停用状态，禁止用户使用该模板。</li></ul>
     * @param Available <p>模板可用状态的取值通常为以下两种：</p><ul><li>1：启用（默认），表示模板处于启用状态，可以被用户正常使用。</li><li>2：停用，表示模板处于停用状态，禁止用户使用该模板。</li></ul>
     */
    public void setAvailable(Long Available) {
        this.Available = Available;
    }

    /**
     * Get <p>模板的用户合同类型</p> 
     * @return UserFlowType <p>模板的用户合同类型</p>
     */
    public UserFlowType getUserFlowType() {
        return this.UserFlowType;
    }

    /**
     * Set <p>模板的用户合同类型</p>
     * @param UserFlowType <p>模板的用户合同类型</p>
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

