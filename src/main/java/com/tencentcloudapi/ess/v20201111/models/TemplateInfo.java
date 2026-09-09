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
package com.tencentcloudapi.ess.v20201111.models;

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
    * <p>模板的名字</p>
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * <p>此模块需要签署的各个参与方的角色列表。RecipientId标识每个参与方角色对应的唯一标识符，用于确定此角色的信息。</p><p><a href="https://qcloudimg.tencent-cloud.cn/raw/e082bbcc0d923f8cb723d98382410aa2.png">点击查看在模板中配置的签署参与方角色列表的样子</a></p>
    */
    @SerializedName("Recipients")
    @Expose
    private Recipient [] Recipients;

    /**
    * <p>模板的填充控件列表</p><p><a href="https://qcloudimg.tencent-cloud.cn/raw/cb2f58529fca8d909258f9d45a56f7f4.png">点击查看在模板中配置的填充控件的样子</a></p>
    */
    @SerializedName("Components")
    @Expose
    private Component [] Components;

    /**
    * <p>此模板中的签署控件列表</p><p><a href="https://qcloudimg.tencent-cloud.cn/raw/29bc6ed753a5a0fce4a3ab02e2c0d955.png">点击查看在模板中配置的签署控件的样子</a></p>
    */
    @SerializedName("SignComponents")
    @Expose
    private Component [] SignComponents;

    /**
    * <p>模板描述信息</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>此模板的资源ID</p>
    */
    @SerializedName("DocumentResourceIds")
    @Expose
    private String [] DocumentResourceIds;

    /**
    * <p>生成模板的文件基础信息</p>
    */
    @SerializedName("FileInfos")
    @Expose
    private FileInfo [] FileInfos;

    /**
    * <p>此模板里边附件的资源ID</p>
    */
    @SerializedName("AttachmentResourceIds")
    @Expose
    private String [] AttachmentResourceIds;

    /**
    * <p>签署人参与签署的顺序，可以分为以下两种方式：</p><p><b>无序</b>：不限定签署人的签署顺序，签署人可以在任何时间签署。此种方式值为 ：｛-1｝<br><b>有序</b>：通过序列数字标识签署顺序，从0开始编码，数字越大签署顺序越靠后，签署人按照指定的顺序依次签署。此种方式值为： ｛0，1，2，3………｝</p>
    */
    @SerializedName("SignOrder")
    @Expose
    private Long [] SignOrder;

    /**
    * <p>此模板的状态可以分为以下几种：</p><p><b>-1</b>：不可用状态。<br><b>0</b>：草稿态，即模板正在编辑或未发布状态。<br><b>1</b>：正式态，只有正式态的模板才可以发起合同。</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>模板的创建者信息，用户的名字</p><p>注： <code>是创建者的名字，而非创建者的用户ID</code></p>
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
    * <p>此模板创建方角色信息。</p><p><a href="https://qcloudimg.tencent-cloud.cn/raw/e082bbcc0d923f8cb723d98382410aa2.png">点击查看在模板中配置的创建方角色的样子</a></p>
    */
    @SerializedName("Promoter")
    @Expose
    private Recipient Promoter;

    /**
    * <p>模板类型可以分为以下两种：</p><p><b>1</b>：带有本企业自动签署的模板，即签署过程无需签署人手动操作，系统自动完成签署。<br><b>3</b>：普通模板，即签署人需要手动进行签署操作。</p>
    */
    @SerializedName("TemplateType")
    @Expose
    private Long TemplateType;

    /**
    * <p>模板可用状态可以分为以下两种：</p><p><b>1</b>：（默认）启用状态，即模板可以正常使用。<br><b>2</b>：停用状态，即模板暂时无法使用。</p><p>可到控制台启停模板</p>
    */
    @SerializedName("Available")
    @Expose
    private Long Available;

    /**
    * <p>创建模板的企业ID，电子签的机构ID</p>
    */
    @SerializedName("OrganizationId")
    @Expose
    private String OrganizationId;

    /**
    * <p>模板创建人用户ID</p>
    */
    @SerializedName("CreatorId")
    @Expose
    private String CreatorId;

    /**
    * <p>模板的 H5 预览链接，有效期为 5 分钟。<br>您可以通过浏览器直接打开此链接预览模板，或将其嵌入到 iframe 中进行预览。</p><p>注意：只有在请求接口时将 <b>WithPreviewUrl </b>参数设置为 true，才会生成预览链接。</p>
    */
    @SerializedName("PreviewUrl")
    @Expose
    private String PreviewUrl;

    /**
    * <p>用户自定义合同类型。</p><p>返回配置模板的时候选择的合同类型。<a href="https://qcloudimg.tencent-cloud.cn/raw/4a766f0540253bf2a05d50c58bd14990.png">点击查看配置的位置</a></p><p>自定义合同类型配置的地方如链接图所示。<a href="https://qcloudimg.tencent-cloud.cn/raw/36582cea03ae6a2559894844942b5d5c.png">点击查看自定义合同类型管理的位置</a></p>
    */
    @SerializedName("UserFlowType")
    @Expose
    private UserFlowType UserFlowType;

    /**
    * <p>模板版本的编号，旨在标识其独特的版本信息，通常呈现为一串字符串，由日期和递增的数字组成</p>
    */
    @SerializedName("TemplateVersion")
    @Expose
    private String TemplateVersion;

    /**
    * <p>模板是否已发布可以分为以下两种状态：</p><p><b>true</b>：已发布状态，表示该模板已经发布并可以正常使用。<br><b>false</b>：未发布状态，表示该模板还未发布，无法使用。</p>
    */
    @SerializedName("Published")
    @Expose
    private Boolean Published;

    /**
    * <p><b>集体账号场景下</b>： 集团账号分享给子企业的模板的来源模板ID。</p>
    */
    @SerializedName("ShareTemplateId")
    @Expose
    private String ShareTemplateId;

    /**
    * <p>此模板配置的预填印章列表（包括自动签署指定的印章）</p>
    */
    @SerializedName("TemplateSeals")
    @Expose
    private SealInfo [] TemplateSeals;

    /**
    * <p>模板内部指定的印章列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Seals")
    @Expose
    private SealInfo [] Seals;

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
     * Get <p>模板的名字</p> 
     * @return TemplateName <p>模板的名字</p>
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set <p>模板的名字</p>
     * @param TemplateName <p>模板的名字</p>
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
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
     * Get <p>此模板的资源ID</p> 
     * @return DocumentResourceIds <p>此模板的资源ID</p>
     */
    public String [] getDocumentResourceIds() {
        return this.DocumentResourceIds;
    }

    /**
     * Set <p>此模板的资源ID</p>
     * @param DocumentResourceIds <p>此模板的资源ID</p>
     */
    public void setDocumentResourceIds(String [] DocumentResourceIds) {
        this.DocumentResourceIds = DocumentResourceIds;
    }

    /**
     * Get <p>生成模板的文件基础信息</p> 
     * @return FileInfos <p>生成模板的文件基础信息</p>
     */
    public FileInfo [] getFileInfos() {
        return this.FileInfos;
    }

    /**
     * Set <p>生成模板的文件基础信息</p>
     * @param FileInfos <p>生成模板的文件基础信息</p>
     */
    public void setFileInfos(FileInfo [] FileInfos) {
        this.FileInfos = FileInfos;
    }

    /**
     * Get <p>此模板里边附件的资源ID</p> 
     * @return AttachmentResourceIds <p>此模板里边附件的资源ID</p>
     */
    public String [] getAttachmentResourceIds() {
        return this.AttachmentResourceIds;
    }

    /**
     * Set <p>此模板里边附件的资源ID</p>
     * @param AttachmentResourceIds <p>此模板里边附件的资源ID</p>
     */
    public void setAttachmentResourceIds(String [] AttachmentResourceIds) {
        this.AttachmentResourceIds = AttachmentResourceIds;
    }

    /**
     * Get <p>签署人参与签署的顺序，可以分为以下两种方式：</p><p><b>无序</b>：不限定签署人的签署顺序，签署人可以在任何时间签署。此种方式值为 ：｛-1｝<br><b>有序</b>：通过序列数字标识签署顺序，从0开始编码，数字越大签署顺序越靠后，签署人按照指定的顺序依次签署。此种方式值为： ｛0，1，2，3………｝</p> 
     * @return SignOrder <p>签署人参与签署的顺序，可以分为以下两种方式：</p><p><b>无序</b>：不限定签署人的签署顺序，签署人可以在任何时间签署。此种方式值为 ：｛-1｝<br><b>有序</b>：通过序列数字标识签署顺序，从0开始编码，数字越大签署顺序越靠后，签署人按照指定的顺序依次签署。此种方式值为： ｛0，1，2，3………｝</p>
     */
    public Long [] getSignOrder() {
        return this.SignOrder;
    }

    /**
     * Set <p>签署人参与签署的顺序，可以分为以下两种方式：</p><p><b>无序</b>：不限定签署人的签署顺序，签署人可以在任何时间签署。此种方式值为 ：｛-1｝<br><b>有序</b>：通过序列数字标识签署顺序，从0开始编码，数字越大签署顺序越靠后，签署人按照指定的顺序依次签署。此种方式值为： ｛0，1，2，3………｝</p>
     * @param SignOrder <p>签署人参与签署的顺序，可以分为以下两种方式：</p><p><b>无序</b>：不限定签署人的签署顺序，签署人可以在任何时间签署。此种方式值为 ：｛-1｝<br><b>有序</b>：通过序列数字标识签署顺序，从0开始编码，数字越大签署顺序越靠后，签署人按照指定的顺序依次签署。此种方式值为： ｛0，1，2，3………｝</p>
     */
    public void setSignOrder(Long [] SignOrder) {
        this.SignOrder = SignOrder;
    }

    /**
     * Get <p>此模板的状态可以分为以下几种：</p><p><b>-1</b>：不可用状态。<br><b>0</b>：草稿态，即模板正在编辑或未发布状态。<br><b>1</b>：正式态，只有正式态的模板才可以发起合同。</p> 
     * @return Status <p>此模板的状态可以分为以下几种：</p><p><b>-1</b>：不可用状态。<br><b>0</b>：草稿态，即模板正在编辑或未发布状态。<br><b>1</b>：正式态，只有正式态的模板才可以发起合同。</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>此模板的状态可以分为以下几种：</p><p><b>-1</b>：不可用状态。<br><b>0</b>：草稿态，即模板正在编辑或未发布状态。<br><b>1</b>：正式态，只有正式态的模板才可以发起合同。</p>
     * @param Status <p>此模板的状态可以分为以下几种：</p><p><b>-1</b>：不可用状态。<br><b>0</b>：草稿态，即模板正在编辑或未发布状态。<br><b>1</b>：正式态，只有正式态的模板才可以发起合同。</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>模板的创建者信息，用户的名字</p><p>注： <code>是创建者的名字，而非创建者的用户ID</code></p> 
     * @return Creator <p>模板的创建者信息，用户的名字</p><p>注： <code>是创建者的名字，而非创建者的用户ID</code></p>
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set <p>模板的创建者信息，用户的名字</p><p>注： <code>是创建者的名字，而非创建者的用户ID</code></p>
     * @param Creator <p>模板的创建者信息，用户的名字</p><p>注： <code>是创建者的名字，而非创建者的用户ID</code></p>
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
     * Get <p>此模板创建方角色信息。</p><p><a href="https://qcloudimg.tencent-cloud.cn/raw/e082bbcc0d923f8cb723d98382410aa2.png">点击查看在模板中配置的创建方角色的样子</a></p> 
     * @return Promoter <p>此模板创建方角色信息。</p><p><a href="https://qcloudimg.tencent-cloud.cn/raw/e082bbcc0d923f8cb723d98382410aa2.png">点击查看在模板中配置的创建方角色的样子</a></p>
     */
    public Recipient getPromoter() {
        return this.Promoter;
    }

    /**
     * Set <p>此模板创建方角色信息。</p><p><a href="https://qcloudimg.tencent-cloud.cn/raw/e082bbcc0d923f8cb723d98382410aa2.png">点击查看在模板中配置的创建方角色的样子</a></p>
     * @param Promoter <p>此模板创建方角色信息。</p><p><a href="https://qcloudimg.tencent-cloud.cn/raw/e082bbcc0d923f8cb723d98382410aa2.png">点击查看在模板中配置的创建方角色的样子</a></p>
     */
    public void setPromoter(Recipient Promoter) {
        this.Promoter = Promoter;
    }

    /**
     * Get <p>模板类型可以分为以下两种：</p><p><b>1</b>：带有本企业自动签署的模板，即签署过程无需签署人手动操作，系统自动完成签署。<br><b>3</b>：普通模板，即签署人需要手动进行签署操作。</p> 
     * @return TemplateType <p>模板类型可以分为以下两种：</p><p><b>1</b>：带有本企业自动签署的模板，即签署过程无需签署人手动操作，系统自动完成签署。<br><b>3</b>：普通模板，即签署人需要手动进行签署操作。</p>
     */
    public Long getTemplateType() {
        return this.TemplateType;
    }

    /**
     * Set <p>模板类型可以分为以下两种：</p><p><b>1</b>：带有本企业自动签署的模板，即签署过程无需签署人手动操作，系统自动完成签署。<br><b>3</b>：普通模板，即签署人需要手动进行签署操作。</p>
     * @param TemplateType <p>模板类型可以分为以下两种：</p><p><b>1</b>：带有本企业自动签署的模板，即签署过程无需签署人手动操作，系统自动完成签署。<br><b>3</b>：普通模板，即签署人需要手动进行签署操作。</p>
     */
    public void setTemplateType(Long TemplateType) {
        this.TemplateType = TemplateType;
    }

    /**
     * Get <p>模板可用状态可以分为以下两种：</p><p><b>1</b>：（默认）启用状态，即模板可以正常使用。<br><b>2</b>：停用状态，即模板暂时无法使用。</p><p>可到控制台启停模板</p> 
     * @return Available <p>模板可用状态可以分为以下两种：</p><p><b>1</b>：（默认）启用状态，即模板可以正常使用。<br><b>2</b>：停用状态，即模板暂时无法使用。</p><p>可到控制台启停模板</p>
     */
    public Long getAvailable() {
        return this.Available;
    }

    /**
     * Set <p>模板可用状态可以分为以下两种：</p><p><b>1</b>：（默认）启用状态，即模板可以正常使用。<br><b>2</b>：停用状态，即模板暂时无法使用。</p><p>可到控制台启停模板</p>
     * @param Available <p>模板可用状态可以分为以下两种：</p><p><b>1</b>：（默认）启用状态，即模板可以正常使用。<br><b>2</b>：停用状态，即模板暂时无法使用。</p><p>可到控制台启停模板</p>
     */
    public void setAvailable(Long Available) {
        this.Available = Available;
    }

    /**
     * Get <p>创建模板的企业ID，电子签的机构ID</p> 
     * @return OrganizationId <p>创建模板的企业ID，电子签的机构ID</p>
     */
    public String getOrganizationId() {
        return this.OrganizationId;
    }

    /**
     * Set <p>创建模板的企业ID，电子签的机构ID</p>
     * @param OrganizationId <p>创建模板的企业ID，电子签的机构ID</p>
     */
    public void setOrganizationId(String OrganizationId) {
        this.OrganizationId = OrganizationId;
    }

    /**
     * Get <p>模板创建人用户ID</p> 
     * @return CreatorId <p>模板创建人用户ID</p>
     */
    public String getCreatorId() {
        return this.CreatorId;
    }

    /**
     * Set <p>模板创建人用户ID</p>
     * @param CreatorId <p>模板创建人用户ID</p>
     */
    public void setCreatorId(String CreatorId) {
        this.CreatorId = CreatorId;
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
     * Get <p>用户自定义合同类型。</p><p>返回配置模板的时候选择的合同类型。<a href="https://qcloudimg.tencent-cloud.cn/raw/4a766f0540253bf2a05d50c58bd14990.png">点击查看配置的位置</a></p><p>自定义合同类型配置的地方如链接图所示。<a href="https://qcloudimg.tencent-cloud.cn/raw/36582cea03ae6a2559894844942b5d5c.png">点击查看自定义合同类型管理的位置</a></p> 
     * @return UserFlowType <p>用户自定义合同类型。</p><p>返回配置模板的时候选择的合同类型。<a href="https://qcloudimg.tencent-cloud.cn/raw/4a766f0540253bf2a05d50c58bd14990.png">点击查看配置的位置</a></p><p>自定义合同类型配置的地方如链接图所示。<a href="https://qcloudimg.tencent-cloud.cn/raw/36582cea03ae6a2559894844942b5d5c.png">点击查看自定义合同类型管理的位置</a></p>
     */
    public UserFlowType getUserFlowType() {
        return this.UserFlowType;
    }

    /**
     * Set <p>用户自定义合同类型。</p><p>返回配置模板的时候选择的合同类型。<a href="https://qcloudimg.tencent-cloud.cn/raw/4a766f0540253bf2a05d50c58bd14990.png">点击查看配置的位置</a></p><p>自定义合同类型配置的地方如链接图所示。<a href="https://qcloudimg.tencent-cloud.cn/raw/36582cea03ae6a2559894844942b5d5c.png">点击查看自定义合同类型管理的位置</a></p>
     * @param UserFlowType <p>用户自定义合同类型。</p><p>返回配置模板的时候选择的合同类型。<a href="https://qcloudimg.tencent-cloud.cn/raw/4a766f0540253bf2a05d50c58bd14990.png">点击查看配置的位置</a></p><p>自定义合同类型配置的地方如链接图所示。<a href="https://qcloudimg.tencent-cloud.cn/raw/36582cea03ae6a2559894844942b5d5c.png">点击查看自定义合同类型管理的位置</a></p>
     */
    public void setUserFlowType(UserFlowType UserFlowType) {
        this.UserFlowType = UserFlowType;
    }

    /**
     * Get <p>模板版本的编号，旨在标识其独特的版本信息，通常呈现为一串字符串，由日期和递增的数字组成</p> 
     * @return TemplateVersion <p>模板版本的编号，旨在标识其独特的版本信息，通常呈现为一串字符串，由日期和递增的数字组成</p>
     */
    public String getTemplateVersion() {
        return this.TemplateVersion;
    }

    /**
     * Set <p>模板版本的编号，旨在标识其独特的版本信息，通常呈现为一串字符串，由日期和递增的数字组成</p>
     * @param TemplateVersion <p>模板版本的编号，旨在标识其独特的版本信息，通常呈现为一串字符串，由日期和递增的数字组成</p>
     */
    public void setTemplateVersion(String TemplateVersion) {
        this.TemplateVersion = TemplateVersion;
    }

    /**
     * Get <p>模板是否已发布可以分为以下两种状态：</p><p><b>true</b>：已发布状态，表示该模板已经发布并可以正常使用。<br><b>false</b>：未发布状态，表示该模板还未发布，无法使用。</p> 
     * @return Published <p>模板是否已发布可以分为以下两种状态：</p><p><b>true</b>：已发布状态，表示该模板已经发布并可以正常使用。<br><b>false</b>：未发布状态，表示该模板还未发布，无法使用。</p>
     */
    public Boolean getPublished() {
        return this.Published;
    }

    /**
     * Set <p>模板是否已发布可以分为以下两种状态：</p><p><b>true</b>：已发布状态，表示该模板已经发布并可以正常使用。<br><b>false</b>：未发布状态，表示该模板还未发布，无法使用。</p>
     * @param Published <p>模板是否已发布可以分为以下两种状态：</p><p><b>true</b>：已发布状态，表示该模板已经发布并可以正常使用。<br><b>false</b>：未发布状态，表示该模板还未发布，无法使用。</p>
     */
    public void setPublished(Boolean Published) {
        this.Published = Published;
    }

    /**
     * Get <p><b>集体账号场景下</b>： 集团账号分享给子企业的模板的来源模板ID。</p> 
     * @return ShareTemplateId <p><b>集体账号场景下</b>： 集团账号分享给子企业的模板的来源模板ID。</p>
     */
    public String getShareTemplateId() {
        return this.ShareTemplateId;
    }

    /**
     * Set <p><b>集体账号场景下</b>： 集团账号分享给子企业的模板的来源模板ID。</p>
     * @param ShareTemplateId <p><b>集体账号场景下</b>： 集团账号分享给子企业的模板的来源模板ID。</p>
     */
    public void setShareTemplateId(String ShareTemplateId) {
        this.ShareTemplateId = ShareTemplateId;
    }

    /**
     * Get <p>此模板配置的预填印章列表（包括自动签署指定的印章）</p> 
     * @return TemplateSeals <p>此模板配置的预填印章列表（包括自动签署指定的印章）</p>
     */
    public SealInfo [] getTemplateSeals() {
        return this.TemplateSeals;
    }

    /**
     * Set <p>此模板配置的预填印章列表（包括自动签署指定的印章）</p>
     * @param TemplateSeals <p>此模板配置的预填印章列表（包括自动签署指定的印章）</p>
     */
    public void setTemplateSeals(SealInfo [] TemplateSeals) {
        this.TemplateSeals = TemplateSeals;
    }

    /**
     * Get <p>模板内部指定的印章列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Seals <p>模板内部指定的印章列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public SealInfo [] getSeals() {
        return this.Seals;
    }

    /**
     * Set <p>模板内部指定的印章列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Seals <p>模板内部指定的印章列表</p>
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

