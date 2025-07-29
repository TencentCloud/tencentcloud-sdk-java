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

public class ProcessMediaByMPSRequest extends AbstractModel {

    /**
    * 媒体文件 ID，即该文件在云点播上的全局唯一标识符，在上传成功后由云点播后台分配。可以在 [视频上传完成事件通知](/document/product/266/7830) 或 [云点播控制台](https://console.cloud.tencent.com/vod/media) 获取该字段。
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * <b>点播[应用](/document/product/266/14574) ID。</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * 该参数用于透传至媒体处理服务（MPS），以便从云点播侧发起 MPS 视频处理任务。
视频处理参数详情请参考：[MPS 发起媒体处理](https://cloud.tencent.com/document/api/862/37578)。
填写说明：
1. 目前仅需要配置 MPS “发起媒体处理”接口中的 AiAnalysisTask 参数，其他参数无需填写，若包含其它参数，系统将自动忽略；
2. 当前仅支持通过此方式发起智能擦除任务。若配置了其他任务类型的相关参数，系统将自动忽略这些参数。

    */
    @SerializedName("MPSProcessMediaParams")
    @Expose
    private String MPSProcessMediaParams;

    /**
     * Get 媒体文件 ID，即该文件在云点播上的全局唯一标识符，在上传成功后由云点播后台分配。可以在 [视频上传完成事件通知](/document/product/266/7830) 或 [云点播控制台](https://console.cloud.tencent.com/vod/media) 获取该字段。 
     * @return FileId 媒体文件 ID，即该文件在云点播上的全局唯一标识符，在上传成功后由云点播后台分配。可以在 [视频上传完成事件通知](/document/product/266/7830) 或 [云点播控制台](https://console.cloud.tencent.com/vod/media) 获取该字段。
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set 媒体文件 ID，即该文件在云点播上的全局唯一标识符，在上传成功后由云点播后台分配。可以在 [视频上传完成事件通知](/document/product/266/7830) 或 [云点播控制台](https://console.cloud.tencent.com/vod/media) 获取该字段。
     * @param FileId 媒体文件 ID，即该文件在云点播上的全局唯一标识符，在上传成功后由云点播后台分配。可以在 [视频上传完成事件通知](/document/product/266/7830) 或 [云点播控制台](https://console.cloud.tencent.com/vod/media) 获取该字段。
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

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
     * Get 该参数用于透传至媒体处理服务（MPS），以便从云点播侧发起 MPS 视频处理任务。
视频处理参数详情请参考：[MPS 发起媒体处理](https://cloud.tencent.com/document/api/862/37578)。
填写说明：
1. 目前仅需要配置 MPS “发起媒体处理”接口中的 AiAnalysisTask 参数，其他参数无需填写，若包含其它参数，系统将自动忽略；
2. 当前仅支持通过此方式发起智能擦除任务。若配置了其他任务类型的相关参数，系统将自动忽略这些参数。
 
     * @return MPSProcessMediaParams 该参数用于透传至媒体处理服务（MPS），以便从云点播侧发起 MPS 视频处理任务。
视频处理参数详情请参考：[MPS 发起媒体处理](https://cloud.tencent.com/document/api/862/37578)。
填写说明：
1. 目前仅需要配置 MPS “发起媒体处理”接口中的 AiAnalysisTask 参数，其他参数无需填写，若包含其它参数，系统将自动忽略；
2. 当前仅支持通过此方式发起智能擦除任务。若配置了其他任务类型的相关参数，系统将自动忽略这些参数。

     */
    public String getMPSProcessMediaParams() {
        return this.MPSProcessMediaParams;
    }

    /**
     * Set 该参数用于透传至媒体处理服务（MPS），以便从云点播侧发起 MPS 视频处理任务。
视频处理参数详情请参考：[MPS 发起媒体处理](https://cloud.tencent.com/document/api/862/37578)。
填写说明：
1. 目前仅需要配置 MPS “发起媒体处理”接口中的 AiAnalysisTask 参数，其他参数无需填写，若包含其它参数，系统将自动忽略；
2. 当前仅支持通过此方式发起智能擦除任务。若配置了其他任务类型的相关参数，系统将自动忽略这些参数。

     * @param MPSProcessMediaParams 该参数用于透传至媒体处理服务（MPS），以便从云点播侧发起 MPS 视频处理任务。
视频处理参数详情请参考：[MPS 发起媒体处理](https://cloud.tencent.com/document/api/862/37578)。
填写说明：
1. 目前仅需要配置 MPS “发起媒体处理”接口中的 AiAnalysisTask 参数，其他参数无需填写，若包含其它参数，系统将自动忽略；
2. 当前仅支持通过此方式发起智能擦除任务。若配置了其他任务类型的相关参数，系统将自动忽略这些参数。

     */
    public void setMPSProcessMediaParams(String MPSProcessMediaParams) {
        this.MPSProcessMediaParams = MPSProcessMediaParams;
    }

    public ProcessMediaByMPSRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProcessMediaByMPSRequest(ProcessMediaByMPSRequest source) {
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.MPSProcessMediaParams != null) {
            this.MPSProcessMediaParams = new String(source.MPSProcessMediaParams);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "MPSProcessMediaParams", this.MPSProcessMediaParams);

    }
}

