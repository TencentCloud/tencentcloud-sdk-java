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
    * 模板ID
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * 模板名字
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
    * 模板控件信息结构
    */
    @SerializedName("Components")
    @Expose
    private Component [] Components;

    /**
    * 签署区模板信息结构
    */
    @SerializedName("SignComponents")
    @Expose
    private Component [] SignComponents;

    /**
    * 模板的创建者信息
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * 模板创建的时间戳（精确到秒）
    */
    @SerializedName("CreatedOn")
    @Expose
    private Long CreatedOn;

    /**
    * 模板类型：1-静默签；2-静默签授权；3-普通模板
    */
    @SerializedName("TemplateType")
    @Expose
    private Long TemplateType;

    /**
    * 模板中的流程参与人信息
    */
    @SerializedName("Recipients")
    @Expose
    private Recipient [] Recipients;

    /**
    * 是否是发起人
    */
    @SerializedName("IsPromoter")
    @Expose
    private Boolean IsPromoter;

    /**
     * Get 模板ID 
     * @return TemplateId 模板ID
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 模板ID
     * @param TemplateId 模板ID
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 模板名字 
     * @return TemplateName 模板名字
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set 模板名字
     * @param TemplateName 模板名字
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
     * Get 模板控件信息结构 
     * @return Components 模板控件信息结构
     */
    public Component [] getComponents() {
        return this.Components;
    }

    /**
     * Set 模板控件信息结构
     * @param Components 模板控件信息结构
     */
    public void setComponents(Component [] Components) {
        this.Components = Components;
    }

    /**
     * Get 签署区模板信息结构 
     * @return SignComponents 签署区模板信息结构
     */
    public Component [] getSignComponents() {
        return this.SignComponents;
    }

    /**
     * Set 签署区模板信息结构
     * @param SignComponents 签署区模板信息结构
     */
    public void setSignComponents(Component [] SignComponents) {
        this.SignComponents = SignComponents;
    }

    /**
     * Get 模板的创建者信息 
     * @return Creator 模板的创建者信息
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set 模板的创建者信息
     * @param Creator 模板的创建者信息
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    /**
     * Get 模板创建的时间戳（精确到秒） 
     * @return CreatedOn 模板创建的时间戳（精确到秒）
     */
    public Long getCreatedOn() {
        return this.CreatedOn;
    }

    /**
     * Set 模板创建的时间戳（精确到秒）
     * @param CreatedOn 模板创建的时间戳（精确到秒）
     */
    public void setCreatedOn(Long CreatedOn) {
        this.CreatedOn = CreatedOn;
    }

    /**
     * Get 模板类型：1-静默签；2-静默签授权；3-普通模板 
     * @return TemplateType 模板类型：1-静默签；2-静默签授权；3-普通模板
     */
    public Long getTemplateType() {
        return this.TemplateType;
    }

    /**
     * Set 模板类型：1-静默签；2-静默签授权；3-普通模板
     * @param TemplateType 模板类型：1-静默签；2-静默签授权；3-普通模板
     */
    public void setTemplateType(Long TemplateType) {
        this.TemplateType = TemplateType;
    }

    /**
     * Get 模板中的流程参与人信息 
     * @return Recipients 模板中的流程参与人信息
     */
    public Recipient [] getRecipients() {
        return this.Recipients;
    }

    /**
     * Set 模板中的流程参与人信息
     * @param Recipients 模板中的流程参与人信息
     */
    public void setRecipients(Recipient [] Recipients) {
        this.Recipients = Recipients;
    }

    /**
     * Get 是否是发起人 
     * @return IsPromoter 是否是发起人
     */
    public Boolean getIsPromoter() {
        return this.IsPromoter;
    }

    /**
     * Set 是否是发起人
     * @param IsPromoter 是否是发起人
     */
    public void setIsPromoter(Boolean IsPromoter) {
        this.IsPromoter = IsPromoter;
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
        if (source.SignComponents != null) {
            this.SignComponents = new Component[source.SignComponents.length];
            for (int i = 0; i < source.SignComponents.length; i++) {
                this.SignComponents[i] = new Component(source.SignComponents[i]);
            }
        }
        if (source.Creator != null) {
            this.Creator = new String(source.Creator);
        }
        if (source.CreatedOn != null) {
            this.CreatedOn = new Long(source.CreatedOn);
        }
        if (source.TemplateType != null) {
            this.TemplateType = new Long(source.TemplateType);
        }
        if (source.Recipients != null) {
            this.Recipients = new Recipient[source.Recipients.length];
            for (int i = 0; i < source.Recipients.length; i++) {
                this.Recipients[i] = new Recipient(source.Recipients[i]);
            }
        }
        if (source.IsPromoter != null) {
            this.IsPromoter = new Boolean(source.IsPromoter);
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
        this.setParamArrayObj(map, prefix + "SignComponents.", this.SignComponents);
        this.setParamSimple(map, prefix + "Creator", this.Creator);
        this.setParamSimple(map, prefix + "CreatedOn", this.CreatedOn);
        this.setParamSimple(map, prefix + "TemplateType", this.TemplateType);
        this.setParamArrayObj(map, prefix + "Recipients.", this.Recipients);
        this.setParamSimple(map, prefix + "IsPromoter", this.IsPromoter);

    }
}

