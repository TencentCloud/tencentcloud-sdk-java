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

public class CreateLiveTimeShiftTemplateRequest extends AbstractModel {

    /**
    * <p>模板名称。<br>长度上限：255字节。<br>仅支持中文、英文、数字、_、-。</p>
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * <p>时移时长。单位：s。取值范围：86400 259200 604800 1296000 2592000。</p>
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * <p>描述信息。<br>仅支持中文、英文、数字、_、-。</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>地域。<br>Mainland：中国大陆。<br>Overseas：海外及港澳台地区。<br>EuropeFrankfurt：欧洲-法兰克福。<br>NorthAmericaSiliconValley：北美-硅谷。<br>MiddleEastRiyadh：中东-利雅得。<br>AsiaTokyo：亚太-东京。<br>AsiaSeoul：亚太-首尔。<br>默认值：Mainland。</p>
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * <p>分片时长。<br>可取3-10。<br>单位：s。<br>默认值：5。</p>
    */
    @SerializedName("ItemDuration")
    @Expose
    private Long ItemDuration;

    /**
    * <p>是否去除水印。<br>传true则将录制原始流。<br>默认值：false。</p>
    */
    @SerializedName("RemoveWatermark")
    @Expose
    private Boolean RemoveWatermark;

    /**
    * <p>转码流id列表。<br>此参数仅在 RemoveWatermark为false时生效。</p>
    */
    @SerializedName("TranscodeTemplateIds")
    @Expose
    private Long [] TranscodeTemplateIds;

    /**
     * Get <p>模板名称。<br>长度上限：255字节。<br>仅支持中文、英文、数字、_、-。</p> 
     * @return TemplateName <p>模板名称。<br>长度上限：255字节。<br>仅支持中文、英文、数字、_、-。</p>
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set <p>模板名称。<br>长度上限：255字节。<br>仅支持中文、英文、数字、_、-。</p>
     * @param TemplateName <p>模板名称。<br>长度上限：255字节。<br>仅支持中文、英文、数字、_、-。</p>
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
    }

    /**
     * Get <p>时移时长。单位：s。取值范围：86400 259200 604800 1296000 2592000。</p> 
     * @return Duration <p>时移时长。单位：s。取值范围：86400 259200 604800 1296000 2592000。</p>
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set <p>时移时长。单位：s。取值范围：86400 259200 604800 1296000 2592000。</p>
     * @param Duration <p>时移时长。单位：s。取值范围：86400 259200 604800 1296000 2592000。</p>
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get <p>描述信息。<br>仅支持中文、英文、数字、_、-。</p> 
     * @return Description <p>描述信息。<br>仅支持中文、英文、数字、_、-。</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>描述信息。<br>仅支持中文、英文、数字、_、-。</p>
     * @param Description <p>描述信息。<br>仅支持中文、英文、数字、_、-。</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>地域。<br>Mainland：中国大陆。<br>Overseas：海外及港澳台地区。<br>EuropeFrankfurt：欧洲-法兰克福。<br>NorthAmericaSiliconValley：北美-硅谷。<br>MiddleEastRiyadh：中东-利雅得。<br>AsiaTokyo：亚太-东京。<br>AsiaSeoul：亚太-首尔。<br>默认值：Mainland。</p> 
     * @return Area <p>地域。<br>Mainland：中国大陆。<br>Overseas：海外及港澳台地区。<br>EuropeFrankfurt：欧洲-法兰克福。<br>NorthAmericaSiliconValley：北美-硅谷。<br>MiddleEastRiyadh：中东-利雅得。<br>AsiaTokyo：亚太-东京。<br>AsiaSeoul：亚太-首尔。<br>默认值：Mainland。</p>
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set <p>地域。<br>Mainland：中国大陆。<br>Overseas：海外及港澳台地区。<br>EuropeFrankfurt：欧洲-法兰克福。<br>NorthAmericaSiliconValley：北美-硅谷。<br>MiddleEastRiyadh：中东-利雅得。<br>AsiaTokyo：亚太-东京。<br>AsiaSeoul：亚太-首尔。<br>默认值：Mainland。</p>
     * @param Area <p>地域。<br>Mainland：中国大陆。<br>Overseas：海外及港澳台地区。<br>EuropeFrankfurt：欧洲-法兰克福。<br>NorthAmericaSiliconValley：北美-硅谷。<br>MiddleEastRiyadh：中东-利雅得。<br>AsiaTokyo：亚太-东京。<br>AsiaSeoul：亚太-首尔。<br>默认值：Mainland。</p>
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get <p>分片时长。<br>可取3-10。<br>单位：s。<br>默认值：5。</p> 
     * @return ItemDuration <p>分片时长。<br>可取3-10。<br>单位：s。<br>默认值：5。</p>
     */
    public Long getItemDuration() {
        return this.ItemDuration;
    }

    /**
     * Set <p>分片时长。<br>可取3-10。<br>单位：s。<br>默认值：5。</p>
     * @param ItemDuration <p>分片时长。<br>可取3-10。<br>单位：s。<br>默认值：5。</p>
     */
    public void setItemDuration(Long ItemDuration) {
        this.ItemDuration = ItemDuration;
    }

    /**
     * Get <p>是否去除水印。<br>传true则将录制原始流。<br>默认值：false。</p> 
     * @return RemoveWatermark <p>是否去除水印。<br>传true则将录制原始流。<br>默认值：false。</p>
     */
    public Boolean getRemoveWatermark() {
        return this.RemoveWatermark;
    }

    /**
     * Set <p>是否去除水印。<br>传true则将录制原始流。<br>默认值：false。</p>
     * @param RemoveWatermark <p>是否去除水印。<br>传true则将录制原始流。<br>默认值：false。</p>
     */
    public void setRemoveWatermark(Boolean RemoveWatermark) {
        this.RemoveWatermark = RemoveWatermark;
    }

    /**
     * Get <p>转码流id列表。<br>此参数仅在 RemoveWatermark为false时生效。</p> 
     * @return TranscodeTemplateIds <p>转码流id列表。<br>此参数仅在 RemoveWatermark为false时生效。</p>
     */
    public Long [] getTranscodeTemplateIds() {
        return this.TranscodeTemplateIds;
    }

    /**
     * Set <p>转码流id列表。<br>此参数仅在 RemoveWatermark为false时生效。</p>
     * @param TranscodeTemplateIds <p>转码流id列表。<br>此参数仅在 RemoveWatermark为false时生效。</p>
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

