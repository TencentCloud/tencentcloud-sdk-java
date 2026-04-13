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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PadTemplate extends AbstractModel {

    /**
    * <p>模板id。</p>
    */
    @SerializedName("TemplateId")
    @Expose
    private Long TemplateId;

    /**
    * <p>模板名称。</p>
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * <p>垫片内容。</p>
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * <p>模板创建时间。</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>模板修改时间。</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>模板描述。</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>断流等待时间。<br>取值范围：0-30000。<br>单位：ms。</p>
    */
    @SerializedName("WaitDuration")
    @Expose
    private Long WaitDuration;

    /**
    * <p>最大垫片时长。<br>取值范围：0 - 正无穷。<br>单位：ms。</p>
    */
    @SerializedName("MaxDuration")
    @Expose
    private Long MaxDuration;

    /**
    * <p>垫片内容类型： 1：图片，2：视频。 默认值：1。</p>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * <p>断流垫片触发条件</p><p>枚举值：</p><ul><li>0： 主动及异常断流</li><li>1： 异常断流</li></ul><p>默认值：0</p>
    */
    @SerializedName("TriggerCondition")
    @Expose
    private Long TriggerCondition;

    /**
     * Get <p>模板id。</p> 
     * @return TemplateId <p>模板id。</p>
     */
    public Long getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set <p>模板id。</p>
     * @param TemplateId <p>模板id。</p>
     */
    public void setTemplateId(Long TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get <p>模板名称。</p> 
     * @return TemplateName <p>模板名称。</p>
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set <p>模板名称。</p>
     * @param TemplateName <p>模板名称。</p>
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
    }

    /**
     * Get <p>垫片内容。</p> 
     * @return Url <p>垫片内容。</p>
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set <p>垫片内容。</p>
     * @param Url <p>垫片内容。</p>
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get <p>模板创建时间。</p> 
     * @return CreateTime <p>模板创建时间。</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>模板创建时间。</p>
     * @param CreateTime <p>模板创建时间。</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>模板修改时间。</p> 
     * @return UpdateTime <p>模板修改时间。</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>模板修改时间。</p>
     * @param UpdateTime <p>模板修改时间。</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>模板描述。</p> 
     * @return Description <p>模板描述。</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>模板描述。</p>
     * @param Description <p>模板描述。</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>断流等待时间。<br>取值范围：0-30000。<br>单位：ms。</p> 
     * @return WaitDuration <p>断流等待时间。<br>取值范围：0-30000。<br>单位：ms。</p>
     */
    public Long getWaitDuration() {
        return this.WaitDuration;
    }

    /**
     * Set <p>断流等待时间。<br>取值范围：0-30000。<br>单位：ms。</p>
     * @param WaitDuration <p>断流等待时间。<br>取值范围：0-30000。<br>单位：ms。</p>
     */
    public void setWaitDuration(Long WaitDuration) {
        this.WaitDuration = WaitDuration;
    }

    /**
     * Get <p>最大垫片时长。<br>取值范围：0 - 正无穷。<br>单位：ms。</p> 
     * @return MaxDuration <p>最大垫片时长。<br>取值范围：0 - 正无穷。<br>单位：ms。</p>
     */
    public Long getMaxDuration() {
        return this.MaxDuration;
    }

    /**
     * Set <p>最大垫片时长。<br>取值范围：0 - 正无穷。<br>单位：ms。</p>
     * @param MaxDuration <p>最大垫片时长。<br>取值范围：0 - 正无穷。<br>单位：ms。</p>
     */
    public void setMaxDuration(Long MaxDuration) {
        this.MaxDuration = MaxDuration;
    }

    /**
     * Get <p>垫片内容类型： 1：图片，2：视频。 默认值：1。</p> 
     * @return Type <p>垫片内容类型： 1：图片，2：视频。 默认值：1。</p>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>垫片内容类型： 1：图片，2：视频。 默认值：1。</p>
     * @param Type <p>垫片内容类型： 1：图片，2：视频。 默认值：1。</p>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get <p>断流垫片触发条件</p><p>枚举值：</p><ul><li>0： 主动及异常断流</li><li>1： 异常断流</li></ul><p>默认值：0</p> 
     * @return TriggerCondition <p>断流垫片触发条件</p><p>枚举值：</p><ul><li>0： 主动及异常断流</li><li>1： 异常断流</li></ul><p>默认值：0</p>
     */
    public Long getTriggerCondition() {
        return this.TriggerCondition;
    }

    /**
     * Set <p>断流垫片触发条件</p><p>枚举值：</p><ul><li>0： 主动及异常断流</li><li>1： 异常断流</li></ul><p>默认值：0</p>
     * @param TriggerCondition <p>断流垫片触发条件</p><p>枚举值：</p><ul><li>0： 主动及异常断流</li><li>1： 异常断流</li></ul><p>默认值：0</p>
     */
    public void setTriggerCondition(Long TriggerCondition) {
        this.TriggerCondition = TriggerCondition;
    }

    public PadTemplate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PadTemplate(PadTemplate source) {
        if (source.TemplateId != null) {
            this.TemplateId = new Long(source.TemplateId);
        }
        if (source.TemplateName != null) {
            this.TemplateName = new String(source.TemplateName);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.WaitDuration != null) {
            this.WaitDuration = new Long(source.WaitDuration);
        }
        if (source.MaxDuration != null) {
            this.MaxDuration = new Long(source.MaxDuration);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.TriggerCondition != null) {
            this.TriggerCondition = new Long(source.TriggerCondition);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "WaitDuration", this.WaitDuration);
        this.setParamSimple(map, prefix + "MaxDuration", this.MaxDuration);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "TriggerCondition", this.TriggerCondition);

    }
}

