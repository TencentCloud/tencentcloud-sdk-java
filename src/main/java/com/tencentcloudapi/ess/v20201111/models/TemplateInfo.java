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
package com.tencentcloudapi.ess.v20201111.models;

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
    * 模板的名字
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * 此模块需要签署的各个参与方的角色列表。RecipientId标识每个参与方角色对应的唯一标识符，用于确定此角色的信息。

[点击查看在模板中配置的签署参与方角色列表的样子](https://qcloudimg.tencent-cloud.cn/raw/e082bbcc0d923f8cb723d98382410aa2.png)


    */
    @SerializedName("Recipients")
    @Expose
    private Recipient [] Recipients;

    /**
    * 模板的填充控件列表

[点击查看在模板中配置的填充控件的样子](https://qcloudimg.tencent-cloud.cn/raw/cb2f58529fca8d909258f9d45a56f7f4.png)
    */
    @SerializedName("Components")
    @Expose
    private Component [] Components;

    /**
    * 此模板中的签署控件列表

[点击查看在模板中配置的签署控件的样子](https://qcloudimg.tencent-cloud.cn/raw/29bc6ed753a5a0fce4a3ab02e2c0d955.png)
    */
    @SerializedName("SignComponents")
    @Expose
    private Component [] SignComponents;

    /**
    * 模板描述信息
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 此模板的资源ID
    */
    @SerializedName("DocumentResourceIds")
    @Expose
    private String [] DocumentResourceIds;

    /**
    * 生成模板的文件基础信息
    */
    @SerializedName("FileInfos")
    @Expose
    private FileInfo [] FileInfos;

    /**
    * 此模板里边附件的资源ID
    */
    @SerializedName("AttachmentResourceIds")
    @Expose
    private String [] AttachmentResourceIds;

    /**
    * 签署人参与签署的顺序，可以分为以下两种方式：

<b>无序</b>：不限定签署人的签署顺序，签署人可以在任何时间签署。此种方式值为 ：｛-1｝
<b>有序</b>：通过序列数字标识签署顺序，从0开始编码，数字越大签署顺序越靠后，签署人按照指定的顺序依次签署。此种方式值为： ｛0，1，2，3………｝
    */
    @SerializedName("SignOrder")
    @Expose
    private Long [] SignOrder;

    /**
    * 此模板的状态可以分为以下几种：

<b>-1</b>：不可用状态。
<b>0</b>：草稿态，即模板正在编辑或未发布状态。
<b>1</b>：正式态，只有正式态的模板才可以发起合同。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 模板的创建者信息，用户的名字

注： `是创建者的名字，而非创建者的用户ID`
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
    * 此模板创建方角色信息。

[点击查看在模板中配置的创建方角色的样子](https://qcloudimg.tencent-cloud.cn/raw/e082bbcc0d923f8cb723d98382410aa2.png)

    */
    @SerializedName("Promoter")
    @Expose
    private Recipient Promoter;

    /**
    * 模板类型可以分为以下两种：

<b>1</b>：带有本企业自动签署的模板，即签署过程无需签署人手动操作，系统自动完成签署。
<b>3</b>：普通模板，即签署人需要手动进行签署操作。
    */
    @SerializedName("TemplateType")
    @Expose
    private Long TemplateType;

    /**
    * 模板可用状态可以分为以下两种：

<b>1</b>：（默认）启用状态，即模板可以正常使用。
<b>2</b>：停用状态，即模板暂时无法使用。

可到控制台启停模板
    */
    @SerializedName("Available")
    @Expose
    private Long Available;

    /**
    * 创建模板的企业ID，电子签的机构ID
    */
    @SerializedName("OrganizationId")
    @Expose
    private String OrganizationId;

    /**
    * 模板创建人用户ID
    */
    @SerializedName("CreatorId")
    @Expose
    private String CreatorId;

    /**
    * 模板的 H5 预览链接，有效期为 5 分钟。
您可以通过浏览器直接打开此链接预览模板，或将其嵌入到 iframe 中进行预览。

注意：只有在请求接口时将 <b>WithPreviewUrl </b>参数设置为 true，才会生成预览链接。
    */
    @SerializedName("PreviewUrl")
    @Expose
    private String PreviewUrl;

    /**
    * 用户自定义合同类型。

返回配置模板的时候选择的合同类型。[点击查看配置的位置](https://qcloudimg.tencent-cloud.cn/raw/4a766f0540253bf2a05d50c58bd14990.png)

自定义合同类型配置的地方如链接图所示。[点击查看自定义合同类型管理的位置](https://qcloudimg.tencent-cloud.cn/raw/36582cea03ae6a2559894844942b5d5c.png)

    */
    @SerializedName("UserFlowType")
    @Expose
    private UserFlowType UserFlowType;

    /**
    * 模板版本的编号，旨在标识其独特的版本信息，通常呈现为一串字符串，由日期和递增的数字组成
    */
    @SerializedName("TemplateVersion")
    @Expose
    private String TemplateVersion;

    /**
    * 模板是否已发布可以分为以下两种状态：

<b>true</b>：已发布状态，表示该模板已经发布并可以正常使用。
<b>false</b>：未发布状态，表示该模板还未发布，无法使用。
    */
    @SerializedName("Published")
    @Expose
    private Boolean Published;

    /**
    * <b>集体账号场景下</b>： 集团账号分享给子企业的模板的来源模板ID。
    */
    @SerializedName("ShareTemplateId")
    @Expose
    private String ShareTemplateId;

    /**
    * 此模板配置的预填印章列表（包括自动签署指定的印章）
    */
    @SerializedName("TemplateSeals")
    @Expose
    private SealInfo [] TemplateSeals;

    /**
    * 模板内部指定的印章列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Seals")
    @Expose
    private SealInfo [] Seals;

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
     * Get 模板的名字 
     * @return TemplateName 模板的名字
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set 模板的名字
     * @param TemplateName 模板的名字
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
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
     * Get 此模板的资源ID 
     * @return DocumentResourceIds 此模板的资源ID
     */
    public String [] getDocumentResourceIds() {
        return this.DocumentResourceIds;
    }

    /**
     * Set 此模板的资源ID
     * @param DocumentResourceIds 此模板的资源ID
     */
    public void setDocumentResourceIds(String [] DocumentResourceIds) {
        this.DocumentResourceIds = DocumentResourceIds;
    }

    /**
     * Get 生成模板的文件基础信息 
     * @return FileInfos 生成模板的文件基础信息
     */
    public FileInfo [] getFileInfos() {
        return this.FileInfos;
    }

    /**
     * Set 生成模板的文件基础信息
     * @param FileInfos 生成模板的文件基础信息
     */
    public void setFileInfos(FileInfo [] FileInfos) {
        this.FileInfos = FileInfos;
    }

    /**
     * Get 此模板里边附件的资源ID 
     * @return AttachmentResourceIds 此模板里边附件的资源ID
     */
    public String [] getAttachmentResourceIds() {
        return this.AttachmentResourceIds;
    }

    /**
     * Set 此模板里边附件的资源ID
     * @param AttachmentResourceIds 此模板里边附件的资源ID
     */
    public void setAttachmentResourceIds(String [] AttachmentResourceIds) {
        this.AttachmentResourceIds = AttachmentResourceIds;
    }

    /**
     * Get 签署人参与签署的顺序，可以分为以下两种方式：

<b>无序</b>：不限定签署人的签署顺序，签署人可以在任何时间签署。此种方式值为 ：｛-1｝
<b>有序</b>：通过序列数字标识签署顺序，从0开始编码，数字越大签署顺序越靠后，签署人按照指定的顺序依次签署。此种方式值为： ｛0，1，2，3………｝ 
     * @return SignOrder 签署人参与签署的顺序，可以分为以下两种方式：

<b>无序</b>：不限定签署人的签署顺序，签署人可以在任何时间签署。此种方式值为 ：｛-1｝
<b>有序</b>：通过序列数字标识签署顺序，从0开始编码，数字越大签署顺序越靠后，签署人按照指定的顺序依次签署。此种方式值为： ｛0，1，2，3………｝
     */
    public Long [] getSignOrder() {
        return this.SignOrder;
    }

    /**
     * Set 签署人参与签署的顺序，可以分为以下两种方式：

<b>无序</b>：不限定签署人的签署顺序，签署人可以在任何时间签署。此种方式值为 ：｛-1｝
<b>有序</b>：通过序列数字标识签署顺序，从0开始编码，数字越大签署顺序越靠后，签署人按照指定的顺序依次签署。此种方式值为： ｛0，1，2，3………｝
     * @param SignOrder 签署人参与签署的顺序，可以分为以下两种方式：

<b>无序</b>：不限定签署人的签署顺序，签署人可以在任何时间签署。此种方式值为 ：｛-1｝
<b>有序</b>：通过序列数字标识签署顺序，从0开始编码，数字越大签署顺序越靠后，签署人按照指定的顺序依次签署。此种方式值为： ｛0，1，2，3………｝
     */
    public void setSignOrder(Long [] SignOrder) {
        this.SignOrder = SignOrder;
    }

    /**
     * Get 此模板的状态可以分为以下几种：

<b>-1</b>：不可用状态。
<b>0</b>：草稿态，即模板正在编辑或未发布状态。
<b>1</b>：正式态，只有正式态的模板才可以发起合同。 
     * @return Status 此模板的状态可以分为以下几种：

<b>-1</b>：不可用状态。
<b>0</b>：草稿态，即模板正在编辑或未发布状态。
<b>1</b>：正式态，只有正式态的模板才可以发起合同。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 此模板的状态可以分为以下几种：

<b>-1</b>：不可用状态。
<b>0</b>：草稿态，即模板正在编辑或未发布状态。
<b>1</b>：正式态，只有正式态的模板才可以发起合同。
     * @param Status 此模板的状态可以分为以下几种：

<b>-1</b>：不可用状态。
<b>0</b>：草稿态，即模板正在编辑或未发布状态。
<b>1</b>：正式态，只有正式态的模板才可以发起合同。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 模板的创建者信息，用户的名字

注： `是创建者的名字，而非创建者的用户ID` 
     * @return Creator 模板的创建者信息，用户的名字

注： `是创建者的名字，而非创建者的用户ID`
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set 模板的创建者信息，用户的名字

注： `是创建者的名字，而非创建者的用户ID`
     * @param Creator 模板的创建者信息，用户的名字

注： `是创建者的名字，而非创建者的用户ID`
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
     * Get 此模板创建方角色信息。

[点击查看在模板中配置的创建方角色的样子](https://qcloudimg.tencent-cloud.cn/raw/e082bbcc0d923f8cb723d98382410aa2.png)
 
     * @return Promoter 此模板创建方角色信息。

[点击查看在模板中配置的创建方角色的样子](https://qcloudimg.tencent-cloud.cn/raw/e082bbcc0d923f8cb723d98382410aa2.png)

     */
    public Recipient getPromoter() {
        return this.Promoter;
    }

    /**
     * Set 此模板创建方角色信息。

[点击查看在模板中配置的创建方角色的样子](https://qcloudimg.tencent-cloud.cn/raw/e082bbcc0d923f8cb723d98382410aa2.png)

     * @param Promoter 此模板创建方角色信息。

[点击查看在模板中配置的创建方角色的样子](https://qcloudimg.tencent-cloud.cn/raw/e082bbcc0d923f8cb723d98382410aa2.png)

     */
    public void setPromoter(Recipient Promoter) {
        this.Promoter = Promoter;
    }

    /**
     * Get 模板类型可以分为以下两种：

<b>1</b>：带有本企业自动签署的模板，即签署过程无需签署人手动操作，系统自动完成签署。
<b>3</b>：普通模板，即签署人需要手动进行签署操作。 
     * @return TemplateType 模板类型可以分为以下两种：

<b>1</b>：带有本企业自动签署的模板，即签署过程无需签署人手动操作，系统自动完成签署。
<b>3</b>：普通模板，即签署人需要手动进行签署操作。
     */
    public Long getTemplateType() {
        return this.TemplateType;
    }

    /**
     * Set 模板类型可以分为以下两种：

<b>1</b>：带有本企业自动签署的模板，即签署过程无需签署人手动操作，系统自动完成签署。
<b>3</b>：普通模板，即签署人需要手动进行签署操作。
     * @param TemplateType 模板类型可以分为以下两种：

<b>1</b>：带有本企业自动签署的模板，即签署过程无需签署人手动操作，系统自动完成签署。
<b>3</b>：普通模板，即签署人需要手动进行签署操作。
     */
    public void setTemplateType(Long TemplateType) {
        this.TemplateType = TemplateType;
    }

    /**
     * Get 模板可用状态可以分为以下两种：

<b>1</b>：（默认）启用状态，即模板可以正常使用。
<b>2</b>：停用状态，即模板暂时无法使用。

可到控制台启停模板 
     * @return Available 模板可用状态可以分为以下两种：

<b>1</b>：（默认）启用状态，即模板可以正常使用。
<b>2</b>：停用状态，即模板暂时无法使用。

可到控制台启停模板
     */
    public Long getAvailable() {
        return this.Available;
    }

    /**
     * Set 模板可用状态可以分为以下两种：

<b>1</b>：（默认）启用状态，即模板可以正常使用。
<b>2</b>：停用状态，即模板暂时无法使用。

可到控制台启停模板
     * @param Available 模板可用状态可以分为以下两种：

<b>1</b>：（默认）启用状态，即模板可以正常使用。
<b>2</b>：停用状态，即模板暂时无法使用。

可到控制台启停模板
     */
    public void setAvailable(Long Available) {
        this.Available = Available;
    }

    /**
     * Get 创建模板的企业ID，电子签的机构ID 
     * @return OrganizationId 创建模板的企业ID，电子签的机构ID
     */
    public String getOrganizationId() {
        return this.OrganizationId;
    }

    /**
     * Set 创建模板的企业ID，电子签的机构ID
     * @param OrganizationId 创建模板的企业ID，电子签的机构ID
     */
    public void setOrganizationId(String OrganizationId) {
        this.OrganizationId = OrganizationId;
    }

    /**
     * Get 模板创建人用户ID 
     * @return CreatorId 模板创建人用户ID
     */
    public String getCreatorId() {
        return this.CreatorId;
    }

    /**
     * Set 模板创建人用户ID
     * @param CreatorId 模板创建人用户ID
     */
    public void setCreatorId(String CreatorId) {
        this.CreatorId = CreatorId;
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
     * Get 用户自定义合同类型。

返回配置模板的时候选择的合同类型。[点击查看配置的位置](https://qcloudimg.tencent-cloud.cn/raw/4a766f0540253bf2a05d50c58bd14990.png)

自定义合同类型配置的地方如链接图所示。[点击查看自定义合同类型管理的位置](https://qcloudimg.tencent-cloud.cn/raw/36582cea03ae6a2559894844942b5d5c.png)
 
     * @return UserFlowType 用户自定义合同类型。

返回配置模板的时候选择的合同类型。[点击查看配置的位置](https://qcloudimg.tencent-cloud.cn/raw/4a766f0540253bf2a05d50c58bd14990.png)

自定义合同类型配置的地方如链接图所示。[点击查看自定义合同类型管理的位置](https://qcloudimg.tencent-cloud.cn/raw/36582cea03ae6a2559894844942b5d5c.png)

     */
    public UserFlowType getUserFlowType() {
        return this.UserFlowType;
    }

    /**
     * Set 用户自定义合同类型。

返回配置模板的时候选择的合同类型。[点击查看配置的位置](https://qcloudimg.tencent-cloud.cn/raw/4a766f0540253bf2a05d50c58bd14990.png)

自定义合同类型配置的地方如链接图所示。[点击查看自定义合同类型管理的位置](https://qcloudimg.tencent-cloud.cn/raw/36582cea03ae6a2559894844942b5d5c.png)

     * @param UserFlowType 用户自定义合同类型。

返回配置模板的时候选择的合同类型。[点击查看配置的位置](https://qcloudimg.tencent-cloud.cn/raw/4a766f0540253bf2a05d50c58bd14990.png)

自定义合同类型配置的地方如链接图所示。[点击查看自定义合同类型管理的位置](https://qcloudimg.tencent-cloud.cn/raw/36582cea03ae6a2559894844942b5d5c.png)

     */
    public void setUserFlowType(UserFlowType UserFlowType) {
        this.UserFlowType = UserFlowType;
    }

    /**
     * Get 模板版本的编号，旨在标识其独特的版本信息，通常呈现为一串字符串，由日期和递增的数字组成 
     * @return TemplateVersion 模板版本的编号，旨在标识其独特的版本信息，通常呈现为一串字符串，由日期和递增的数字组成
     */
    public String getTemplateVersion() {
        return this.TemplateVersion;
    }

    /**
     * Set 模板版本的编号，旨在标识其独特的版本信息，通常呈现为一串字符串，由日期和递增的数字组成
     * @param TemplateVersion 模板版本的编号，旨在标识其独特的版本信息，通常呈现为一串字符串，由日期和递增的数字组成
     */
    public void setTemplateVersion(String TemplateVersion) {
        this.TemplateVersion = TemplateVersion;
    }

    /**
     * Get 模板是否已发布可以分为以下两种状态：

<b>true</b>：已发布状态，表示该模板已经发布并可以正常使用。
<b>false</b>：未发布状态，表示该模板还未发布，无法使用。 
     * @return Published 模板是否已发布可以分为以下两种状态：

<b>true</b>：已发布状态，表示该模板已经发布并可以正常使用。
<b>false</b>：未发布状态，表示该模板还未发布，无法使用。
     */
    public Boolean getPublished() {
        return this.Published;
    }

    /**
     * Set 模板是否已发布可以分为以下两种状态：

<b>true</b>：已发布状态，表示该模板已经发布并可以正常使用。
<b>false</b>：未发布状态，表示该模板还未发布，无法使用。
     * @param Published 模板是否已发布可以分为以下两种状态：

<b>true</b>：已发布状态，表示该模板已经发布并可以正常使用。
<b>false</b>：未发布状态，表示该模板还未发布，无法使用。
     */
    public void setPublished(Boolean Published) {
        this.Published = Published;
    }

    /**
     * Get <b>集体账号场景下</b>： 集团账号分享给子企业的模板的来源模板ID。 
     * @return ShareTemplateId <b>集体账号场景下</b>： 集团账号分享给子企业的模板的来源模板ID。
     */
    public String getShareTemplateId() {
        return this.ShareTemplateId;
    }

    /**
     * Set <b>集体账号场景下</b>： 集团账号分享给子企业的模板的来源模板ID。
     * @param ShareTemplateId <b>集体账号场景下</b>： 集团账号分享给子企业的模板的来源模板ID。
     */
    public void setShareTemplateId(String ShareTemplateId) {
        this.ShareTemplateId = ShareTemplateId;
    }

    /**
     * Get 此模板配置的预填印章列表（包括自动签署指定的印章） 
     * @return TemplateSeals 此模板配置的预填印章列表（包括自动签署指定的印章）
     */
    public SealInfo [] getTemplateSeals() {
        return this.TemplateSeals;
    }

    /**
     * Set 此模板配置的预填印章列表（包括自动签署指定的印章）
     * @param TemplateSeals 此模板配置的预填印章列表（包括自动签署指定的印章）
     */
    public void setTemplateSeals(SealInfo [] TemplateSeals) {
        this.TemplateSeals = TemplateSeals;
    }

    /**
     * Get 模板内部指定的印章列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Seals 模板内部指定的印章列表
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public SealInfo [] getSeals() {
        return this.Seals;
    }

    /**
     * Set 模板内部指定的印章列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Seals 模板内部指定的印章列表
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setSeals(SealInfo [] Seals) {
        this.Seals = Seals;
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
        if (source.Recipients != null) {
            this.Recipients = new Recipient[source.Recipients.length];
            for (int i = 0; i < source.Recipients.length; i++) {
                this.Recipients[i] = new Recipient(source.Recipients[i]);
            }
        }
        if (source.Components != null) {
            this.Components = new Component[source.Components.length];
            for (int i = 0; i < source.Components.length; i++) {
                this.Components[i] = new Component(source.Components[i]);
            }
        }
        if (source.SignComponents != null) {
            this.SignComponents = new Component[source.SignComponents.length];
            for (int i = 0; i < source.SignComponents.length; i++) {
                this.SignComponents[i] = new Component(source.SignComponents[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.DocumentResourceIds != null) {
            this.DocumentResourceIds = new String[source.DocumentResourceIds.length];
            for (int i = 0; i < source.DocumentResourceIds.length; i++) {
                this.DocumentResourceIds[i] = new String(source.DocumentResourceIds[i]);
            }
        }
        if (source.FileInfos != null) {
            this.FileInfos = new FileInfo[source.FileInfos.length];
            for (int i = 0; i < source.FileInfos.length; i++) {
                this.FileInfos[i] = new FileInfo(source.FileInfos[i]);
            }
        }
        if (source.AttachmentResourceIds != null) {
            this.AttachmentResourceIds = new String[source.AttachmentResourceIds.length];
            for (int i = 0; i < source.AttachmentResourceIds.length; i++) {
                this.AttachmentResourceIds[i] = new String(source.AttachmentResourceIds[i]);
            }
        }
        if (source.SignOrder != null) {
            this.SignOrder = new Long[source.SignOrder.length];
            for (int i = 0; i < source.SignOrder.length; i++) {
                this.SignOrder[i] = new Long(source.SignOrder[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Creator != null) {
            this.Creator = new String(source.Creator);
        }
        if (source.CreatedOn != null) {
            this.CreatedOn = new Long(source.CreatedOn);
        }
        if (source.Promoter != null) {
            this.Promoter = new Recipient(source.Promoter);
        }
        if (source.TemplateType != null) {
            this.TemplateType = new Long(source.TemplateType);
        }
        if (source.Available != null) {
            this.Available = new Long(source.Available);
        }
        if (source.OrganizationId != null) {
            this.OrganizationId = new String(source.OrganizationId);
        }
        if (source.CreatorId != null) {
            this.CreatorId = new String(source.CreatorId);
        }
        if (source.PreviewUrl != null) {
            this.PreviewUrl = new String(source.PreviewUrl);
        }
        if (source.UserFlowType != null) {
            this.UserFlowType = new UserFlowType(source.UserFlowType);
        }
        if (source.TemplateVersion != null) {
            this.TemplateVersion = new String(source.TemplateVersion);
        }
        if (source.Published != null) {
            this.Published = new Boolean(source.Published);
        }
        if (source.ShareTemplateId != null) {
            this.ShareTemplateId = new String(source.ShareTemplateId);
        }
        if (source.TemplateSeals != null) {
            this.TemplateSeals = new SealInfo[source.TemplateSeals.length];
            for (int i = 0; i < source.TemplateSeals.length; i++) {
                this.TemplateSeals[i] = new SealInfo(source.TemplateSeals[i]);
            }
        }
        if (source.Seals != null) {
            this.Seals = new SealInfo[source.Seals.length];
            for (int i = 0; i < source.Seals.length; i++) {
                this.Seals[i] = new SealInfo(source.Seals[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);
        this.setParamArrayObj(map, prefix + "Recipients.", this.Recipients);
        this.setParamArrayObj(map, prefix + "Components.", this.Components);
        this.setParamArrayObj(map, prefix + "SignComponents.", this.SignComponents);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArraySimple(map, prefix + "DocumentResourceIds.", this.DocumentResourceIds);
        this.setParamArrayObj(map, prefix + "FileInfos.", this.FileInfos);
        this.setParamArraySimple(map, prefix + "AttachmentResourceIds.", this.AttachmentResourceIds);
        this.setParamArraySimple(map, prefix + "SignOrder.", this.SignOrder);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Creator", this.Creator);
        this.setParamSimple(map, prefix + "CreatedOn", this.CreatedOn);
        this.setParamObj(map, prefix + "Promoter.", this.Promoter);
        this.setParamSimple(map, prefix + "TemplateType", this.TemplateType);
        this.setParamSimple(map, prefix + "Available", this.Available);
        this.setParamSimple(map, prefix + "OrganizationId", this.OrganizationId);
        this.setParamSimple(map, prefix + "CreatorId", this.CreatorId);
        this.setParamSimple(map, prefix + "PreviewUrl", this.PreviewUrl);
        this.setParamObj(map, prefix + "UserFlowType.", this.UserFlowType);
        this.setParamSimple(map, prefix + "TemplateVersion", this.TemplateVersion);
        this.setParamSimple(map, prefix + "Published", this.Published);
        this.setParamSimple(map, prefix + "ShareTemplateId", this.ShareTemplateId);
        this.setParamArrayObj(map, prefix + "TemplateSeals.", this.TemplateSeals);
        this.setParamArrayObj(map, prefix + "Seals.", this.Seals);

    }
}

