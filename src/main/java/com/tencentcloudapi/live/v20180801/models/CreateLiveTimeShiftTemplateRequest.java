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

public class CreateLiveTimeShiftTemplateRequest extends AbstractModel{

    /**
    * 模板名称。
长度上限：255字节。
仅支持中文、英文、数字、_、-。
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * 时移时长。
单位：s。
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * 描述信息。
仅支持中文、英文、数字、_、-。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 地域。
Mainland：中国大陆。
Overseas：海外及港澳台地区。
默认值：Mainland。
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * 分片时长。
可取3-10。
单位：s。
默认值：5。
    */
    @SerializedName("ItemDuration")
    @Expose
    private Long ItemDuration;

    /**
    * 是否去除水印。
传true则将录制原始流。
默认值：false。
    */
    @SerializedName("RemoveWatermark")
    @Expose
    private Boolean RemoveWatermark;

    /**
    * 转码流id列表。
此参数仅在 RemoveWatermark为false时生效。
    */
    @SerializedName("TranscodeTemplateIds")
    @Expose
    private Long [] TranscodeTemplateIds;

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
     * Get 时移时长。
单位：s。 
     * @return Duration 时移时长。
单位：s。
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set 时移时长。
单位：s。
     * @param Duration 时移时长。
单位：s。
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 描述信息。
仅支持中文、英文、数字、_、-。 
     * @return Description 描述信息。
仅支持中文、英文、数字、_、-。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述信息。
仅支持中文、英文、数字、_、-。
     * @param Description 描述信息。
仅支持中文、英文、数字、_、-。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 地域。
Mainland：中国大陆。
Overseas：海外及港澳台地区。
默认值：Mainland。 
     * @return Area 地域。
Mainland：中国大陆。
Overseas：海外及港澳台地区。
默认值：Mainland。
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set 地域。
Mainland：中国大陆。
Overseas：海外及港澳台地区。
默认值：Mainland。
     * @param Area 地域。
Mainland：中国大陆。
Overseas：海外及港澳台地区。
默认值：Mainland。
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get 分片时长。
可取3-10。
单位：s。
默认值：5。 
     * @return ItemDuration 分片时长。
可取3-10。
单位：s。
默认值：5。
     */
    public Long getItemDuration() {
        return this.ItemDuration;
    }

    /**
     * Set 分片时长。
可取3-10。
单位：s。
默认值：5。
     * @param ItemDuration 分片时长。
可取3-10。
单位：s。
默认值：5。
     */
    public void setItemDuration(Long ItemDuration) {
        this.ItemDuration = ItemDuration;
    }

    /**
     * Get 是否去除水印。
传true则将录制原始流。
默认值：false。 
     * @return RemoveWatermark 是否去除水印。
传true则将录制原始流。
默认值：false。
     */
    public Boolean getRemoveWatermark() {
        return this.RemoveWatermark;
    }

    /**
     * Set 是否去除水印。
传true则将录制原始流。
默认值：false。
     * @param RemoveWatermark 是否去除水印。
传true则将录制原始流。
默认值：false。
     */
    public void setRemoveWatermark(Boolean RemoveWatermark) {
        this.RemoveWatermark = RemoveWatermark;
    }

    /**
     * Get 转码流id列表。
此参数仅在 RemoveWatermark为false时生效。 
     * @return TranscodeTemplateIds 转码流id列表。
此参数仅在 RemoveWatermark为false时生效。
     */
    public Long [] getTranscodeTemplateIds() {
        return this.TranscodeTemplateIds;
    }

    /**
     * Set 转码流id列表。
此参数仅在 RemoveWatermark为false时生效。
     * @param TranscodeTemplateIds 转码流id列表。
此参数仅在 RemoveWatermark为false时生效。
     */
    public void setTranscodeTemplateIds(Long [] TranscodeTemplateIds) {
        this.TranscodeTemplateIds = TranscodeTemplateIds;
    }

    public CreateLiveTimeShiftTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateLiveTimeShiftTemplateRequest(CreateLiveTimeShiftTemplateRequest source) {
        if (source.TemplateName != null) {
            this.TemplateName = new String(source.TemplateName);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.ItemDuration != null) {
            this.ItemDuration = new Long(source.ItemDuration);
        }
        if (source.RemoveWatermark != null) {
            this.RemoveWatermark = new Boolean(source.RemoveWatermark);
        }
        if (source.TranscodeTemplateIds != null) {
            this.TranscodeTemplateIds = new Long[source.TranscodeTemplateIds.length];
            for (int i = 0; i < source.TranscodeTemplateIds.length; i++) {
                this.TranscodeTemplateIds[i] = new Long(source.TranscodeTemplateIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "ItemDuration", this.ItemDuration);
        this.setParamSimple(map, prefix + "RemoveWatermark", this.RemoveWatermark);
        this.setParamArraySimple(map, prefix + "TranscodeTemplateIds.", this.TranscodeTemplateIds);

    }
}

