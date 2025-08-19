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

public class CreateMPSTemplateRequest extends AbstractModel {

    /**
    * <b>点播[应用](/document/product/266/14574) ID。</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * 需要创建的 MPS 模板的类型。取值：
<li>Transcode: 创建转码模板，目前仅支持创建增强模板。</li>
    */
    @SerializedName("TemplateType")
    @Expose
    private String TemplateType;

    /**
    * MPS 创建模板参数。该参数用于透传至媒体处理服务（MPS），从云点播侧创建用户自定义的 MPS 任务模板。
目前仅支持通过此方式创建以下任务类型的模板：
1. 音视频增强：仅支持填写“[创建转码模板](https://cloud.tencent.com/document/product/862/37605)”接口中的 Container 、Name、Comment、RemoveVideo、RemoveAudio、VideoTemplate、AudioTemplate 和 EnhanceConfig 几个参数。其中 EnhanceConfig 此处必填，且 Container 目前暂不支持 hls。

目前模板中仅支持配置以上参数，其他参数无需填写。若包含其它参数，系统将自动忽略。以上透传参数以JSON形式表示。

    */
    @SerializedName("MPSCreateTemplateParams")
    @Expose
    private String MPSCreateTemplateParams;

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
     * Get 需要创建的 MPS 模板的类型。取值：
<li>Transcode: 创建转码模板，目前仅支持创建增强模板。</li> 
     * @return TemplateType 需要创建的 MPS 模板的类型。取值：
<li>Transcode: 创建转码模板，目前仅支持创建增强模板。</li>
     */
    public String getTemplateType() {
        return this.TemplateType;
    }

    /**
     * Set 需要创建的 MPS 模板的类型。取值：
<li>Transcode: 创建转码模板，目前仅支持创建增强模板。</li>
     * @param TemplateType 需要创建的 MPS 模板的类型。取值：
<li>Transcode: 创建转码模板，目前仅支持创建增强模板。</li>
     */
    public void setTemplateType(String TemplateType) {
        this.TemplateType = TemplateType;
    }

    /**
     * Get MPS 创建模板参数。该参数用于透传至媒体处理服务（MPS），从云点播侧创建用户自定义的 MPS 任务模板。
目前仅支持通过此方式创建以下任务类型的模板：
1. 音视频增强：仅支持填写“[创建转码模板](https://cloud.tencent.com/document/product/862/37605)”接口中的 Container 、Name、Comment、RemoveVideo、RemoveAudio、VideoTemplate、AudioTemplate 和 EnhanceConfig 几个参数。其中 EnhanceConfig 此处必填，且 Container 目前暂不支持 hls。

目前模板中仅支持配置以上参数，其他参数无需填写。若包含其它参数，系统将自动忽略。以上透传参数以JSON形式表示。
 
     * @return MPSCreateTemplateParams MPS 创建模板参数。该参数用于透传至媒体处理服务（MPS），从云点播侧创建用户自定义的 MPS 任务模板。
目前仅支持通过此方式创建以下任务类型的模板：
1. 音视频增强：仅支持填写“[创建转码模板](https://cloud.tencent.com/document/product/862/37605)”接口中的 Container 、Name、Comment、RemoveVideo、RemoveAudio、VideoTemplate、AudioTemplate 和 EnhanceConfig 几个参数。其中 EnhanceConfig 此处必填，且 Container 目前暂不支持 hls。

目前模板中仅支持配置以上参数，其他参数无需填写。若包含其它参数，系统将自动忽略。以上透传参数以JSON形式表示。

     */
    public String getMPSCreateTemplateParams() {
        return this.MPSCreateTemplateParams;
    }

    /**
     * Set MPS 创建模板参数。该参数用于透传至媒体处理服务（MPS），从云点播侧创建用户自定义的 MPS 任务模板。
目前仅支持通过此方式创建以下任务类型的模板：
1. 音视频增强：仅支持填写“[创建转码模板](https://cloud.tencent.com/document/product/862/37605)”接口中的 Container 、Name、Comment、RemoveVideo、RemoveAudio、VideoTemplate、AudioTemplate 和 EnhanceConfig 几个参数。其中 EnhanceConfig 此处必填，且 Container 目前暂不支持 hls。

目前模板中仅支持配置以上参数，其他参数无需填写。若包含其它参数，系统将自动忽略。以上透传参数以JSON形式表示。

     * @param MPSCreateTemplateParams MPS 创建模板参数。该参数用于透传至媒体处理服务（MPS），从云点播侧创建用户自定义的 MPS 任务模板。
目前仅支持通过此方式创建以下任务类型的模板：
1. 音视频增强：仅支持填写“[创建转码模板](https://cloud.tencent.com/document/product/862/37605)”接口中的 Container 、Name、Comment、RemoveVideo、RemoveAudio、VideoTemplate、AudioTemplate 和 EnhanceConfig 几个参数。其中 EnhanceConfig 此处必填，且 Container 目前暂不支持 hls。

目前模板中仅支持配置以上参数，其他参数无需填写。若包含其它参数，系统将自动忽略。以上透传参数以JSON形式表示。

     */
    public void setMPSCreateTemplateParams(String MPSCreateTemplateParams) {
        this.MPSCreateTemplateParams = MPSCreateTemplateParams;
    }

    public CreateMPSTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateMPSTemplateRequest(CreateMPSTemplateRequest source) {
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.TemplateType != null) {
            this.TemplateType = new String(source.TemplateType);
        }
        if (source.MPSCreateTemplateParams != null) {
            this.MPSCreateTemplateParams = new String(source.MPSCreateTemplateParams);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "TemplateType", this.TemplateType);
        this.setParamSimple(map, prefix + "MPSCreateTemplateParams", this.MPSCreateTemplateParams);

    }
}

