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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyMPSTemplateRequest extends AbstractModel {

    /**
    * <b>点播[应用](/document/product/266/14574) ID。</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * 需要修改的 MPS 模板的类型。取值：
<li>Transcode: 创建转码模板，目前仅支持修改增强参数。</li>
    */
    @SerializedName("TemplateType")
    @Expose
    private String TemplateType;

    /**
    * MPS 修改模板参数。该参数用于透传至媒体处理服务（MPS），从云点播侧修改用户自定义的 MPS 任务模板。
 目前仅支持通过此方式修改以下任务类型的模板：
1. 音视频增强：仅支持填写“[修改转码模板](https://cloud.tencent.com/document/api/862/37578)”接口中的 Name、Comment、RemoveVideo、RemoveAudio、VideoTemplate、AudioTemplate 和 EnhanceConfig 几个参数的内容。目前仅支持在模板中配置以上参数，其他参数无需填写，若包含其它参数，系统将自动忽略。
    */
    @SerializedName("MPSModifyTemplateParams")
    @Expose
    private String MPSModifyTemplateParams;

    /**
     * Get <b>点播[应用](/document/product/266/14574) ID。</b> 
     * @return SubAppId <b>点播[应用](/document/product/266/14574) ID。</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>点播[应用](/document/product/266/14574) ID。</b>
     * @param SubAppId <b>点播[应用](/document/product/266/14574) ID。</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get 需要修改的 MPS 模板的类型。取值：
<li>Transcode: 创建转码模板，目前仅支持修改增强参数。</li> 
     * @return TemplateType 需要修改的 MPS 模板的类型。取值：
<li>Transcode: 创建转码模板，目前仅支持修改增强参数。</li>
     */
    public String getTemplateType() {
        return this.TemplateType;
    }

    /**
     * Set 需要修改的 MPS 模板的类型。取值：
<li>Transcode: 创建转码模板，目前仅支持修改增强参数。</li>
     * @param TemplateType 需要修改的 MPS 模板的类型。取值：
<li>Transcode: 创建转码模板，目前仅支持修改增强参数。</li>
     */
    public void setTemplateType(String TemplateType) {
        this.TemplateType = TemplateType;
    }

    /**
     * Get MPS 修改模板参数。该参数用于透传至媒体处理服务（MPS），从云点播侧修改用户自定义的 MPS 任务模板。
 目前仅支持通过此方式修改以下任务类型的模板：
1. 音视频增强：仅支持填写“[修改转码模板](https://cloud.tencent.com/document/api/862/37578)”接口中的 Name、Comment、RemoveVideo、RemoveAudio、VideoTemplate、AudioTemplate 和 EnhanceConfig 几个参数的内容。目前仅支持在模板中配置以上参数，其他参数无需填写，若包含其它参数，系统将自动忽略。 
     * @return MPSModifyTemplateParams MPS 修改模板参数。该参数用于透传至媒体处理服务（MPS），从云点播侧修改用户自定义的 MPS 任务模板。
 目前仅支持通过此方式修改以下任务类型的模板：
1. 音视频增强：仅支持填写“[修改转码模板](https://cloud.tencent.com/document/api/862/37578)”接口中的 Name、Comment、RemoveVideo、RemoveAudio、VideoTemplate、AudioTemplate 和 EnhanceConfig 几个参数的内容。目前仅支持在模板中配置以上参数，其他参数无需填写，若包含其它参数，系统将自动忽略。
     */
    public String getMPSModifyTemplateParams() {
        return this.MPSModifyTemplateParams;
    }

    /**
     * Set MPS 修改模板参数。该参数用于透传至媒体处理服务（MPS），从云点播侧修改用户自定义的 MPS 任务模板。
 目前仅支持通过此方式修改以下任务类型的模板：
1. 音视频增强：仅支持填写“[修改转码模板](https://cloud.tencent.com/document/api/862/37578)”接口中的 Name、Comment、RemoveVideo、RemoveAudio、VideoTemplate、AudioTemplate 和 EnhanceConfig 几个参数的内容。目前仅支持在模板中配置以上参数，其他参数无需填写，若包含其它参数，系统将自动忽略。
     * @param MPSModifyTemplateParams MPS 修改模板参数。该参数用于透传至媒体处理服务（MPS），从云点播侧修改用户自定义的 MPS 任务模板。
 目前仅支持通过此方式修改以下任务类型的模板：
1. 音视频增强：仅支持填写“[修改转码模板](https://cloud.tencent.com/document/api/862/37578)”接口中的 Name、Comment、RemoveVideo、RemoveAudio、VideoTemplate、AudioTemplate 和 EnhanceConfig 几个参数的内容。目前仅支持在模板中配置以上参数，其他参数无需填写，若包含其它参数，系统将自动忽略。
     */
    public void setMPSModifyTemplateParams(String MPSModifyTemplateParams) {
        this.MPSModifyTemplateParams = MPSModifyTemplateParams;
    }

    public ModifyMPSTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyMPSTemplateRequest(ModifyMPSTemplateRequest source) {
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.TemplateType != null) {
            this.TemplateType = new String(source.TemplateType);
        }
        if (source.MPSModifyTemplateParams != null) {
            this.MPSModifyTemplateParams = new String(source.MPSModifyTemplateParams);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "TemplateType", this.TemplateType);
        this.setParamSimple(map, prefix + "MPSModifyTemplateParams", this.MPSModifyTemplateParams);

    }
}

