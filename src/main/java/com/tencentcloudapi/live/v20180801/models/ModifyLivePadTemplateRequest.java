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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyLivePadTemplateRequest extends AbstractModel{

    /**
    * 模板id。
    */
    @SerializedName("TemplateId")
    @Expose
    private Long TemplateId;

    /**
    * 垫片内容。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 断流等待时间。
取值范围：0-30000。
单位：ms。
    */
    @SerializedName("WaitDuration")
    @Expose
    private Long WaitDuration;

    /**
    * 最大垫片时长。
取值范围：0 - 正无穷。
单位：ms。
    */
    @SerializedName("MaxDuration")
    @Expose
    private Long MaxDuration;

    /**
    * 模板名称。
长度上限：255字节。
仅支持中文、英文、数字、_、-。
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * 描述信息。
长度上限：1024字节。
仅支持中文、英文、数字、_、-。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 垫片内容类型： 1：图片，2：视频。 默认值：1。
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
     * Get 模板id。 
     * @return TemplateId 模板id。
     */
    public Long getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 模板id。
     * @param TemplateId 模板id。
     */
    public void setTemplateId(Long TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 垫片内容。 
     * @return Url 垫片内容。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 垫片内容。
     * @param Url 垫片内容。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 断流等待时间。
取值范围：0-30000。
单位：ms。 
     * @return WaitDuration 断流等待时间。
取值范围：0-30000。
单位：ms。
     */
    public Long getWaitDuration() {
        return this.WaitDuration;
    }

    /**
     * Set 断流等待时间。
取值范围：0-30000。
单位：ms。
     * @param WaitDuration 断流等待时间。
取值范围：0-30000。
单位：ms。
     */
    public void setWaitDuration(Long WaitDuration) {
        this.WaitDuration = WaitDuration;
    }

    /**
     * Get 最大垫片时长。
取值范围：0 - 正无穷。
单位：ms。 
     * @return MaxDuration 最大垫片时长。
取值范围：0 - 正无穷。
单位：ms。
     */
    public Long getMaxDuration() {
        return this.MaxDuration;
    }

    /**
     * Set 最大垫片时长。
取值范围：0 - 正无穷。
单位：ms。
     * @param MaxDuration 最大垫片时长。
取值范围：0 - 正无穷。
单位：ms。
     */
    public void setMaxDuration(Long MaxDuration) {
        this.MaxDuration = MaxDuration;
    }

    /**
     * Get 模板名称。
长度上限：255字节。
仅支持中文、英文、数字、_、-。 
     * @return TemplateName 模板名称。
长度上限：255字节。
仅支持中文、英文、数字、_、-。
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set 模板名称。
长度上限：255字节。
仅支持中文、英文、数字、_、-。
     * @param TemplateName 模板名称。
长度上限：255字节。
仅支持中文、英文、数字、_、-。
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
    }

    /**
     * Get 描述信息。
长度上限：1024字节。
仅支持中文、英文、数字、_、-。 
     * @return Description 描述信息。
长度上限：1024字节。
仅支持中文、英文、数字、_、-。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述信息。
长度上限：1024字节。
仅支持中文、英文、数字、_、-。
     * @param Description 描述信息。
长度上限：1024字节。
仅支持中文、英文、数字、_、-。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 垫片内容类型： 1：图片，2：视频。 默认值：1。 
     * @return Type 垫片内容类型： 1：图片，2：视频。 默认值：1。
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 垫片内容类型： 1：图片，2：视频。 默认值：1。
     * @param Type 垫片内容类型： 1：图片，2：视频。 默认值：1。
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    public ModifyLivePadTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLivePadTemplateRequest(ModifyLivePadTemplateRequest source) {
        if (source.TemplateId != null) {
            this.TemplateId = new Long(source.TemplateId);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.WaitDuration != null) {
            this.WaitDuration = new Long(source.WaitDuration);
        }
        if (source.MaxDuration != null) {
            this.MaxDuration = new Long(source.MaxDuration);
        }
        if (source.TemplateName != null) {
            this.TemplateName = new String(source.TemplateName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "WaitDuration", this.WaitDuration);
        this.setParamSimple(map, prefix + "MaxDuration", this.MaxDuration);
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

