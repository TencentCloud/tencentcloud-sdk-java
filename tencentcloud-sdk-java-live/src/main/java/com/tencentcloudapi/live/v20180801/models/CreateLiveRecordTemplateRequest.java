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

public class CreateLiveRecordTemplateRequest extends AbstractModel{

    /**
    * 模板名。仅支持中文、英文、数字、_、-。
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * 描述信息。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Flv录制参数，开启Flv录制时设置。
    */
    @SerializedName("FlvParam")
    @Expose
    private RecordParam FlvParam;

    /**
    * Hls录制参数，开启hls录制时设置。
    */
    @SerializedName("HlsParam")
    @Expose
    private RecordParam HlsParam;

    /**
    * Mp4录制参数，开启Mp4录制时设置。
    */
    @SerializedName("Mp4Param")
    @Expose
    private RecordParam Mp4Param;

    /**
    * Aac录制参数，开启Aac录制时设置。
    */
    @SerializedName("AacParam")
    @Expose
    private RecordParam AacParam;

    /**
    * 直播类型，默认 0。
0：普通直播，
1：慢直播。
    */
    @SerializedName("IsDelayLive")
    @Expose
    private Long IsDelayLive;

    /**
    * HLS专属录制参数。
    */
    @SerializedName("HlsSpecialParam")
    @Expose
    private HlsSpecialParam HlsSpecialParam;

    /**
    * Mp3录制参数，开启Mp3录制时设置。
    */
    @SerializedName("Mp3Param")
    @Expose
    private RecordParam Mp3Param;

    /**
     * Get 模板名。仅支持中文、英文、数字、_、-。 
     * @return TemplateName 模板名。仅支持中文、英文、数字、_、-。
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set 模板名。仅支持中文、英文、数字、_、-。
     * @param TemplateName 模板名。仅支持中文、英文、数字、_、-。
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
    }

    /**
     * Get 描述信息。 
     * @return Description 描述信息。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述信息。
     * @param Description 描述信息。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Flv录制参数，开启Flv录制时设置。 
     * @return FlvParam Flv录制参数，开启Flv录制时设置。
     */
    public RecordParam getFlvParam() {
        return this.FlvParam;
    }

    /**
     * Set Flv录制参数，开启Flv录制时设置。
     * @param FlvParam Flv录制参数，开启Flv录制时设置。
     */
    public void setFlvParam(RecordParam FlvParam) {
        this.FlvParam = FlvParam;
    }

    /**
     * Get Hls录制参数，开启hls录制时设置。 
     * @return HlsParam Hls录制参数，开启hls录制时设置。
     */
    public RecordParam getHlsParam() {
        return this.HlsParam;
    }

    /**
     * Set Hls录制参数，开启hls录制时设置。
     * @param HlsParam Hls录制参数，开启hls录制时设置。
     */
    public void setHlsParam(RecordParam HlsParam) {
        this.HlsParam = HlsParam;
    }

    /**
     * Get Mp4录制参数，开启Mp4录制时设置。 
     * @return Mp4Param Mp4录制参数，开启Mp4录制时设置。
     */
    public RecordParam getMp4Param() {
        return this.Mp4Param;
    }

    /**
     * Set Mp4录制参数，开启Mp4录制时设置。
     * @param Mp4Param Mp4录制参数，开启Mp4录制时设置。
     */
    public void setMp4Param(RecordParam Mp4Param) {
        this.Mp4Param = Mp4Param;
    }

    /**
     * Get Aac录制参数，开启Aac录制时设置。 
     * @return AacParam Aac录制参数，开启Aac录制时设置。
     */
    public RecordParam getAacParam() {
        return this.AacParam;
    }

    /**
     * Set Aac录制参数，开启Aac录制时设置。
     * @param AacParam Aac录制参数，开启Aac录制时设置。
     */
    public void setAacParam(RecordParam AacParam) {
        this.AacParam = AacParam;
    }

    /**
     * Get 直播类型，默认 0。
0：普通直播，
1：慢直播。 
     * @return IsDelayLive 直播类型，默认 0。
0：普通直播，
1：慢直播。
     */
    public Long getIsDelayLive() {
        return this.IsDelayLive;
    }

    /**
     * Set 直播类型，默认 0。
0：普通直播，
1：慢直播。
     * @param IsDelayLive 直播类型，默认 0。
0：普通直播，
1：慢直播。
     */
    public void setIsDelayLive(Long IsDelayLive) {
        this.IsDelayLive = IsDelayLive;
    }

    /**
     * Get HLS专属录制参数。 
     * @return HlsSpecialParam HLS专属录制参数。
     */
    public HlsSpecialParam getHlsSpecialParam() {
        return this.HlsSpecialParam;
    }

    /**
     * Set HLS专属录制参数。
     * @param HlsSpecialParam HLS专属录制参数。
     */
    public void setHlsSpecialParam(HlsSpecialParam HlsSpecialParam) {
        this.HlsSpecialParam = HlsSpecialParam;
    }

    /**
     * Get Mp3录制参数，开启Mp3录制时设置。 
     * @return Mp3Param Mp3录制参数，开启Mp3录制时设置。
     */
    public RecordParam getMp3Param() {
        return this.Mp3Param;
    }

    /**
     * Set Mp3录制参数，开启Mp3录制时设置。
     * @param Mp3Param Mp3录制参数，开启Mp3录制时设置。
     */
    public void setMp3Param(RecordParam Mp3Param) {
        this.Mp3Param = Mp3Param;
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

    }
}

