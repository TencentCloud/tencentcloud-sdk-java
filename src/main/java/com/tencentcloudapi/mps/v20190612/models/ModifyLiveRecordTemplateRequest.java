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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyLiveRecordTemplateRequest extends AbstractModel {

    /**
    * 录制模板唯一标识。
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * HLS配置参数，和MP4Configure需要二选一必填。
    */
    @SerializedName("HLSConfigure")
    @Expose
    private HLSConfigureInfo HLSConfigure;

    /**
    * MP4配置参数，和HLSConfigure需要二选一必填。
    */
    @SerializedName("MP4Configure")
    @Expose
    private MP4ConfigureInfo MP4Configure;

    /**
    * 录制模板名称，长度限制：64 个字符。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 模板描述信息，长度限制：256 个字符。
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 录制类型，取值为video（音视频录制）、audio（纯音频录制）、auto（自动探测）。
    */
    @SerializedName("RecordType")
    @Expose
    private String RecordType;

    /**
     * Get 录制模板唯一标识。 
     * @return Definition 录制模板唯一标识。
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set 录制模板唯一标识。
     * @param Definition 录制模板唯一标识。
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get HLS配置参数，和MP4Configure需要二选一必填。 
     * @return HLSConfigure HLS配置参数，和MP4Configure需要二选一必填。
     */
    public HLSConfigureInfo getHLSConfigure() {
        return this.HLSConfigure;
    }

    /**
     * Set HLS配置参数，和MP4Configure需要二选一必填。
     * @param HLSConfigure HLS配置参数，和MP4Configure需要二选一必填。
     */
    public void setHLSConfigure(HLSConfigureInfo HLSConfigure) {
        this.HLSConfigure = HLSConfigure;
    }

    /**
     * Get MP4配置参数，和HLSConfigure需要二选一必填。 
     * @return MP4Configure MP4配置参数，和HLSConfigure需要二选一必填。
     */
    public MP4ConfigureInfo getMP4Configure() {
        return this.MP4Configure;
    }

    /**
     * Set MP4配置参数，和HLSConfigure需要二选一必填。
     * @param MP4Configure MP4配置参数，和HLSConfigure需要二选一必填。
     */
    public void setMP4Configure(MP4ConfigureInfo MP4Configure) {
        this.MP4Configure = MP4Configure;
    }

    /**
     * Get 录制模板名称，长度限制：64 个字符。 
     * @return Name 录制模板名称，长度限制：64 个字符。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 录制模板名称，长度限制：64 个字符。
     * @param Name 录制模板名称，长度限制：64 个字符。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 模板描述信息，长度限制：256 个字符。 
     * @return Comment 模板描述信息，长度限制：256 个字符。
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 模板描述信息，长度限制：256 个字符。
     * @param Comment 模板描述信息，长度限制：256 个字符。
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get 录制类型，取值为video（音视频录制）、audio（纯音频录制）、auto（自动探测）。 
     * @return RecordType 录制类型，取值为video（音视频录制）、audio（纯音频录制）、auto（自动探测）。
     */
    public String getRecordType() {
        return this.RecordType;
    }

    /**
     * Set 录制类型，取值为video（音视频录制）、audio（纯音频录制）、auto（自动探测）。
     * @param RecordType 录制类型，取值为video（音视频录制）、audio（纯音频录制）、auto（自动探测）。
     */
    public void setRecordType(String RecordType) {
        this.RecordType = RecordType;
    }

    public ModifyLiveRecordTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLiveRecordTemplateRequest(ModifyLiveRecordTemplateRequest source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.HLSConfigure != null) {
            this.HLSConfigure = new HLSConfigureInfo(source.HLSConfigure);
        }
        if (source.MP4Configure != null) {
            this.MP4Configure = new MP4ConfigureInfo(source.MP4Configure);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.RecordType != null) {
            this.RecordType = new String(source.RecordType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamObj(map, prefix + "HLSConfigure.", this.HLSConfigure);
        this.setParamObj(map, prefix + "MP4Configure.", this.MP4Configure);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "RecordType", this.RecordType);

    }
}

