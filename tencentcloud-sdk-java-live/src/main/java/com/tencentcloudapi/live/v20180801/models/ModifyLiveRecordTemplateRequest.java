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

public class ModifyLiveRecordTemplateRequest extends AbstractModel{

    /**
    * DescribeRecordTemplates接口获取到的模板 ID。
    */
    @SerializedName("TemplateId")
    @Expose
    private Long TemplateId;

    /**
    * 模板名称。
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
    * FLV 录制参数，开启 FLV 录制时设置。
    */
    @SerializedName("FlvParam")
    @Expose
    private RecordParam FlvParam;

    /**
    * HLS 录制参数，开启 HLS 录制时设置。
    */
    @SerializedName("HlsParam")
    @Expose
    private RecordParam HlsParam;

    /**
    * MP4 录制参数，开启 MP4 录制时设置。
    */
    @SerializedName("Mp4Param")
    @Expose
    private RecordParam Mp4Param;

    /**
    * AAC 录制参数，开启 AAC 录制时设置。
    */
    @SerializedName("AacParam")
    @Expose
    private RecordParam AacParam;

    /**
    * HLS 录制定制参数。
    */
    @SerializedName("HlsSpecialParam")
    @Expose
    private HlsSpecialParam HlsSpecialParam;

    /**
    * MP3 录制参数，开启 MP3 录制时设置。
    */
    @SerializedName("Mp3Param")
    @Expose
    private RecordParam Mp3Param;

    /**
     * Get DescribeRecordTemplates接口获取到的模板 ID。 
     * @return TemplateId DescribeRecordTemplates接口获取到的模板 ID。
     */
    public Long getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set DescribeRecordTemplates接口获取到的模板 ID。
     * @param TemplateId DescribeRecordTemplates接口获取到的模板 ID。
     */
    public void setTemplateId(Long TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 模板名称。 
     * @return TemplateName 模板名称。
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set 模板名称。
     * @param TemplateName 模板名称。
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
     * Get FLV 录制参数，开启 FLV 录制时设置。 
     * @return FlvParam FLV 录制参数，开启 FLV 录制时设置。
     */
    public RecordParam getFlvParam() {
        return this.FlvParam;
    }

    /**
     * Set FLV 录制参数，开启 FLV 录制时设置。
     * @param FlvParam FLV 录制参数，开启 FLV 录制时设置。
     */
    public void setFlvParam(RecordParam FlvParam) {
        this.FlvParam = FlvParam;
    }

    /**
     * Get HLS 录制参数，开启 HLS 录制时设置。 
     * @return HlsParam HLS 录制参数，开启 HLS 录制时设置。
     */
    public RecordParam getHlsParam() {
        return this.HlsParam;
    }

    /**
     * Set HLS 录制参数，开启 HLS 录制时设置。
     * @param HlsParam HLS 录制参数，开启 HLS 录制时设置。
     */
    public void setHlsParam(RecordParam HlsParam) {
        this.HlsParam = HlsParam;
    }

    /**
     * Get MP4 录制参数，开启 MP4 录制时设置。 
     * @return Mp4Param MP4 录制参数，开启 MP4 录制时设置。
     */
    public RecordParam getMp4Param() {
        return this.Mp4Param;
    }

    /**
     * Set MP4 录制参数，开启 MP4 录制时设置。
     * @param Mp4Param MP4 录制参数，开启 MP4 录制时设置。
     */
    public void setMp4Param(RecordParam Mp4Param) {
        this.Mp4Param = Mp4Param;
    }

    /**
     * Get AAC 录制参数，开启 AAC 录制时设置。 
     * @return AacParam AAC 录制参数，开启 AAC 录制时设置。
     */
    public RecordParam getAacParam() {
        return this.AacParam;
    }

    /**
     * Set AAC 录制参数，开启 AAC 录制时设置。
     * @param AacParam AAC 录制参数，开启 AAC 录制时设置。
     */
    public void setAacParam(RecordParam AacParam) {
        this.AacParam = AacParam;
    }

    /**
     * Get HLS 录制定制参数。 
     * @return HlsSpecialParam HLS 录制定制参数。
     */
    public HlsSpecialParam getHlsSpecialParam() {
        return this.HlsSpecialParam;
    }

    /**
     * Set HLS 录制定制参数。
     * @param HlsSpecialParam HLS 录制定制参数。
     */
    public void setHlsSpecialParam(HlsSpecialParam HlsSpecialParam) {
        this.HlsSpecialParam = HlsSpecialParam;
    }

    /**
     * Get MP3 录制参数，开启 MP3 录制时设置。 
     * @return Mp3Param MP3 录制参数，开启 MP3 录制时设置。
     */
    public RecordParam getMp3Param() {
        return this.Mp3Param;
    }

    /**
     * Set MP3 录制参数，开启 MP3 录制时设置。
     * @param Mp3Param MP3 录制参数，开启 MP3 录制时设置。
     */
    public void setMp3Param(RecordParam Mp3Param) {
        this.Mp3Param = Mp3Param;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamObj(map, prefix + "FlvParam.", this.FlvParam);
        this.setParamObj(map, prefix + "HlsParam.", this.HlsParam);
        this.setParamObj(map, prefix + "Mp4Param.", this.Mp4Param);
        this.setParamObj(map, prefix + "AacParam.", this.AacParam);
        this.setParamObj(map, prefix + "HlsSpecialParam.", this.HlsSpecialParam);
        this.setParamObj(map, prefix + "Mp3Param.", this.Mp3Param);

    }
}

