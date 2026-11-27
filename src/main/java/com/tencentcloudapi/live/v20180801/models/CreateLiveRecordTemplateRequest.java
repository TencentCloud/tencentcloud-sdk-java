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

public class CreateLiveRecordTemplateRequest extends AbstractModel {

    /**
    * <p>模板名。仅支持中文、英文、数字、_、-。</p>
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * <p>描述信息。</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Flv录制参数，开启Flv录制时设置。</p>
    */
    @SerializedName("FlvParam")
    @Expose
    private RecordParam FlvParam;

    /**
    * <p>Hls录制参数，开启hls录制时设置。</p>
    */
    @SerializedName("HlsParam")
    @Expose
    private RecordParam HlsParam;

    /**
    * <p>Mp4录制参数，开启Mp4录制时设置。</p>
    */
    @SerializedName("Mp4Param")
    @Expose
    private RecordParam Mp4Param;

    /**
    * <p>Aac录制参数，开启Aac录制时设置。</p>
    */
    @SerializedName("AacParam")
    @Expose
    private RecordParam AacParam;

    /**
    * <p>直播类型，默认 0。<br>0：普通直播，<br>1：慢直播。</p>
    */
    @SerializedName("IsDelayLive")
    @Expose
    private Long IsDelayLive;

    /**
    * <p>HLS专属录制参数。</p>
    */
    @SerializedName("HlsSpecialParam")
    @Expose
    private HlsSpecialParam HlsSpecialParam;

    /**
    * <p>Mp3录制参数，开启Mp3录制时设置。</p>
    */
    @SerializedName("Mp3Param")
    @Expose
    private RecordParam Mp3Param;

    /**
    * <p>是否存储至 cos，值为 1 时表示存储至 cos。</p>
    */
    @SerializedName("CosStore")
    @Expose
    private Long CosStore;

    /**
    * <p>是否去除水印，类型为慢直播时此参数无效。<br>如果为false，则录制水印流或转码流；如果为true，则录制原始流。</p>
    */
    @SerializedName("RemoveWatermark")
    @Expose
    private Boolean RemoveWatermark;

    /**
    * <p>FLV 录制特殊参数。</p>
    */
    @SerializedName("FlvSpecialParam")
    @Expose
    private FlvSpecialParam FlvSpecialParam;

    /**
     * Get <p>模板名。仅支持中文、英文、数字、_、-。</p> 
     * @return TemplateName <p>模板名。仅支持中文、英文、数字、_、-。</p>
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set <p>模板名。仅支持中文、英文、数字、_、-。</p>
     * @param TemplateName <p>模板名。仅支持中文、英文、数字、_、-。</p>
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
    }

    /**
     * Get <p>描述信息。</p> 
     * @return Description <p>描述信息。</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>描述信息。</p>
     * @param Description <p>描述信息。</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>Flv录制参数，开启Flv录制时设置。</p> 
     * @return FlvParam <p>Flv录制参数，开启Flv录制时设置。</p>
     */
    public RecordParam getFlvParam() {
        return this.FlvParam;
    }

    /**
     * Set <p>Flv录制参数，开启Flv录制时设置。</p>
     * @param FlvParam <p>Flv录制参数，开启Flv录制时设置。</p>
     */
    public void setFlvParam(RecordParam FlvParam) {
        this.FlvParam = FlvParam;
    }

    /**
     * Get <p>Hls录制参数，开启hls录制时设置。</p> 
     * @return HlsParam <p>Hls录制参数，开启hls录制时设置。</p>
     */
    public RecordParam getHlsParam() {
        return this.HlsParam;
    }

    /**
     * Set <p>Hls录制参数，开启hls录制时设置。</p>
     * @param HlsParam <p>Hls录制参数，开启hls录制时设置。</p>
     */
    public void setHlsParam(RecordParam HlsParam) {
        this.HlsParam = HlsParam;
    }

    /**
     * Get <p>Mp4录制参数，开启Mp4录制时设置。</p> 
     * @return Mp4Param <p>Mp4录制参数，开启Mp4录制时设置。</p>
     */
    public RecordParam getMp4Param() {
        return this.Mp4Param;
    }

    /**
     * Set <p>Mp4录制参数，开启Mp4录制时设置。</p>
     * @param Mp4Param <p>Mp4录制参数，开启Mp4录制时设置。</p>
     */
    public void setMp4Param(RecordParam Mp4Param) {
        this.Mp4Param = Mp4Param;
    }

    /**
     * Get <p>Aac录制参数，开启Aac录制时设置。</p> 
     * @return AacParam <p>Aac录制参数，开启Aac录制时设置。</p>
     */
    public RecordParam getAacParam() {
        return this.AacParam;
    }

    /**
     * Set <p>Aac录制参数，开启Aac录制时设置。</p>
     * @param AacParam <p>Aac录制参数，开启Aac录制时设置。</p>
     */
    public void setAacParam(RecordParam AacParam) {
        this.AacParam = AacParam;
    }

    /**
     * Get <p>直播类型，默认 0。<br>0：普通直播，<br>1：慢直播。</p> 
     * @return IsDelayLive <p>直播类型，默认 0。<br>0：普通直播，<br>1：慢直播。</p>
     */
    public Long getIsDelayLive() {
        return this.IsDelayLive;
    }

    /**
     * Set <p>直播类型，默认 0。<br>0：普通直播，<br>1：慢直播。</p>
     * @param IsDelayLive <p>直播类型，默认 0。<br>0：普通直播，<br>1：慢直播。</p>
     */
    public void setIsDelayLive(Long IsDelayLive) {
        this.IsDelayLive = IsDelayLive;
    }

    /**
     * Get <p>HLS专属录制参数。</p> 
     * @return HlsSpecialParam <p>HLS专属录制参数。</p>
     */
    public HlsSpecialParam getHlsSpecialParam() {
        return this.HlsSpecialParam;
    }

    /**
     * Set <p>HLS专属录制参数。</p>
     * @param HlsSpecialParam <p>HLS专属录制参数。</p>
     */
    public void setHlsSpecialParam(HlsSpecialParam HlsSpecialParam) {
        this.HlsSpecialParam = HlsSpecialParam;
    }

    /**
     * Get <p>Mp3录制参数，开启Mp3录制时设置。</p> 
     * @return Mp3Param <p>Mp3录制参数，开启Mp3录制时设置。</p>
     */
    public RecordParam getMp3Param() {
        return this.Mp3Param;
    }

    /**
     * Set <p>Mp3录制参数，开启Mp3录制时设置。</p>
     * @param Mp3Param <p>Mp3录制参数，开启Mp3录制时设置。</p>
     */
    public void setMp3Param(RecordParam Mp3Param) {
        this.Mp3Param = Mp3Param;
    }

    /**
     * Get <p>是否存储至 cos，值为 1 时表示存储至 cos。</p> 
     * @return CosStore <p>是否存储至 cos，值为 1 时表示存储至 cos。</p>
     */
    public Long getCosStore() {
        return this.CosStore;
    }

    /**
     * Set <p>是否存储至 cos，值为 1 时表示存储至 cos。</p>
     * @param CosStore <p>是否存储至 cos，值为 1 时表示存储至 cos。</p>
     */
    public void setCosStore(Long CosStore) {
        this.CosStore = CosStore;
    }

    /**
     * Get <p>是否去除水印，类型为慢直播时此参数无效。<br>如果为false，则录制水印流或转码流；如果为true，则录制原始流。</p> 
     * @return RemoveWatermark <p>是否去除水印，类型为慢直播时此参数无效。<br>如果为false，则录制水印流或转码流；如果为true，则录制原始流。</p>
     */
    public Boolean getRemoveWatermark() {
        return this.RemoveWatermark;
    }

    /**
     * Set <p>是否去除水印，类型为慢直播时此参数无效。<br>如果为false，则录制水印流或转码流；如果为true，则录制原始流。</p>
     * @param RemoveWatermark <p>是否去除水印，类型为慢直播时此参数无效。<br>如果为false，则录制水印流或转码流；如果为true，则录制原始流。</p>
     */
    public void setRemoveWatermark(Boolean RemoveWatermark) {
        this.RemoveWatermark = RemoveWatermark;
    }

    /**
     * Get <p>FLV 录制特殊参数。</p> 
     * @return FlvSpecialParam <p>FLV 录制特殊参数。</p>
     */
    public FlvSpecialParam getFlvSpecialParam() {
        return this.FlvSpecialParam;
    }

    /**
     * Set <p>FLV 录制特殊参数。</p>
     * @param FlvSpecialParam <p>FLV 录制特殊参数。</p>
     */
    public void setFlvSpecialParam(FlvSpecialParam FlvSpecialParam) {
        this.FlvSpecialParam = FlvSpecialParam;
    }

    public CreateLiveRecordTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateLiveRecordTemplateRequest(CreateLiveRecordTemplateRequest source) {
        if (source.TemplateName != null) {
            this.TemplateName = new String(source.TemplateName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.FlvParam != null) {
            this.FlvParam = new RecordParam(source.FlvParam);
        }
        if (source.HlsParam != null) {
            this.HlsParam = new RecordParam(source.HlsParam);
        }
        if (source.Mp4Param != null) {
            this.Mp4Param = new RecordParam(source.Mp4Param);
        }
        if (source.AacParam != null) {
            this.AacParam = new RecordParam(source.AacParam);
        }
        if (source.IsDelayLive != null) {
            this.IsDelayLive = new Long(source.IsDelayLive);
        }
        if (source.HlsSpecialParam != null) {
            this.HlsSpecialParam = new HlsSpecialParam(source.HlsSpecialParam);
        }
        if (source.Mp3Param != null) {
            this.Mp3Param = new RecordParam(source.Mp3Param);
        }
        if (source.CosStore != null) {
            this.CosStore = new Long(source.CosStore);
        }
        if (source.RemoveWatermark != null) {
            this.RemoveWatermark = new Boolean(source.RemoveWatermark);
        }
        if (source.FlvSpecialParam != null) {
            this.FlvSpecialParam = new FlvSpecialParam(source.FlvSpecialParam);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamObj(map, prefix + "FlvParam.", this.FlvParam);
        this.setParamObj(map, prefix + "HlsParam.", this.HlsParam);
        this.setParamObj(map, prefix + "Mp4Param.", this.Mp4Param);
        this.setParamObj(map, prefix + "AacParam.", this.AacParam);
        this.setParamSimple(map, prefix + "IsDelayLive", this.IsDelayLive);
        this.setParamObj(map, prefix + "HlsSpecialParam.", this.HlsSpecialParam);
        this.setParamObj(map, prefix + "Mp3Param.", this.Mp3Param);
        this.setParamSimple(map, prefix + "CosStore", this.CosStore);
        this.setParamSimple(map, prefix + "RemoveWatermark", this.RemoveWatermark);
        this.setParamObj(map, prefix + "FlvSpecialParam.", this.FlvSpecialParam);

    }
}

