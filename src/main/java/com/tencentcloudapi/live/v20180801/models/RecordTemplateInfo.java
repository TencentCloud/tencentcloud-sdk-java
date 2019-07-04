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

public class RecordTemplateInfo  extends AbstractModel{

    /**
    * 模板Id。
    */
    @SerializedName("TemplateId")
    @Expose
    private Integer TemplateId;

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
    * Flv录制参数。
    */
    @SerializedName("FlvParam")
    @Expose
    private RecordParam FlvParam;

    /**
    * Hls录制参数。
    */
    @SerializedName("HlsParam")
    @Expose
    private RecordParam HlsParam;

    /**
    * Mp4录制参数。
    */
    @SerializedName("Mp4Param")
    @Expose
    private RecordParam Mp4Param;

    /**
    * Aac录制参数。
    */
    @SerializedName("AacParam")
    @Expose
    private RecordParam AacParam;

    /**
    * 0：普通直播，
1：慢直播。
    */
    @SerializedName("IsDelayLive")
    @Expose
    private Integer IsDelayLive;

    /**
    * HLS录制定制参数
    */
    @SerializedName("HlsSpecialParam")
    @Expose
    private HlsSpecialParam HlsSpecialParam;

    /**
    * Mp3录制参数。
    */
    @SerializedName("Mp3Param")
    @Expose
    private RecordParam Mp3Param;

    /**
     * 获取模板Id。
     * @return TemplateId 模板Id。
     */
    public Integer getTemplateId() {
        return this.TemplateId;
    }

    /**
     * 设置模板Id。
     * @param TemplateId 模板Id。
     */
    public void setTemplateId(Integer TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * 获取模板名称。
     * @return TemplateName 模板名称。
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * 设置模板名称。
     * @param TemplateName 模板名称。
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
    }

    /**
     * 获取描述信息。
     * @return Description 描述信息。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * 设置描述信息。
     * @param Description 描述信息。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * 获取Flv录制参数。
     * @return FlvParam Flv录制参数。
     */
    public RecordParam getFlvParam() {
        return this.FlvParam;
    }

    /**
     * 设置Flv录制参数。
     * @param FlvParam Flv录制参数。
     */
    public void setFlvParam(RecordParam FlvParam) {
        this.FlvParam = FlvParam;
    }

    /**
     * 获取Hls录制参数。
     * @return HlsParam Hls录制参数。
     */
    public RecordParam getHlsParam() {
        return this.HlsParam;
    }

    /**
     * 设置Hls录制参数。
     * @param HlsParam Hls录制参数。
     */
    public void setHlsParam(RecordParam HlsParam) {
        this.HlsParam = HlsParam;
    }

    /**
     * 获取Mp4录制参数。
     * @return Mp4Param Mp4录制参数。
     */
    public RecordParam getMp4Param() {
        return this.Mp4Param;
    }

    /**
     * 设置Mp4录制参数。
     * @param Mp4Param Mp4录制参数。
     */
    public void setMp4Param(RecordParam Mp4Param) {
        this.Mp4Param = Mp4Param;
    }

    /**
     * 获取Aac录制参数。
     * @return AacParam Aac录制参数。
     */
    public RecordParam getAacParam() {
        return this.AacParam;
    }

    /**
     * 设置Aac录制参数。
     * @param AacParam Aac录制参数。
     */
    public void setAacParam(RecordParam AacParam) {
        this.AacParam = AacParam;
    }

    /**
     * 获取0：普通直播，
1：慢直播。
     * @return IsDelayLive 0：普通直播，
1：慢直播。
     */
    public Integer getIsDelayLive() {
        return this.IsDelayLive;
    }

    /**
     * 设置0：普通直播，
1：慢直播。
     * @param IsDelayLive 0：普通直播，
1：慢直播。
     */
    public void setIsDelayLive(Integer IsDelayLive) {
        this.IsDelayLive = IsDelayLive;
    }

    /**
     * 获取HLS录制定制参数
     * @return HlsSpecialParam HLS录制定制参数
     */
    public HlsSpecialParam getHlsSpecialParam() {
        return this.HlsSpecialParam;
    }

    /**
     * 设置HLS录制定制参数
     * @param HlsSpecialParam HLS录制定制参数
     */
    public void setHlsSpecialParam(HlsSpecialParam HlsSpecialParam) {
        this.HlsSpecialParam = HlsSpecialParam;
    }

    /**
     * 获取Mp3录制参数。
     * @return Mp3Param Mp3录制参数。
     */
    public RecordParam getMp3Param() {
        return this.Mp3Param;
    }

    /**
     * 设置Mp3录制参数。
     * @param Mp3Param Mp3录制参数。
     */
    public void setMp3Param(RecordParam Mp3Param) {
        this.Mp3Param = Mp3Param;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
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

