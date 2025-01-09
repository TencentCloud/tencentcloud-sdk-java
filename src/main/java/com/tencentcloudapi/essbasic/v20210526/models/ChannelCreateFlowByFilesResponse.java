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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChannelCreateFlowByFilesResponse extends AbstractModel {

    /**
    * 合同流程ID，为32位字符串。
建议开发者妥善保存此流程ID，以便于顺利进行后续操作。

[点击查看FlowId在控制台上的位置](https://qcloudimg.tencent-cloud.cn/raw/05af26573d5106763b4cfbb9f7c64b41.png)
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
    * 签署方信息，如角色ID、角色名称等
    */
    @SerializedName("Approvers")
    @Expose
    private ApproverItem [] Approvers;

    /**
    * 预览链接，有效期5分钟
注：如果是预览模式(即NeedPreview设置为true)时, 才会有此预览链接URL
    */
    @SerializedName("PreviewUrl")
    @Expose
    private String PreviewUrl;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 合同流程ID，为32位字符串。
建议开发者妥善保存此流程ID，以便于顺利进行后续操作。

[点击查看FlowId在控制台上的位置](https://qcloudimg.tencent-cloud.cn/raw/05af26573d5106763b4cfbb9f7c64b41.png) 
     * @return FlowId 合同流程ID，为32位字符串。
建议开发者妥善保存此流程ID，以便于顺利进行后续操作。

[点击查看FlowId在控制台上的位置](https://qcloudimg.tencent-cloud.cn/raw/05af26573d5106763b4cfbb9f7c64b41.png)
     */
    public String getFlowId() {
        return this.FlowId;
    }

    /**
     * Set 合同流程ID，为32位字符串。
建议开发者妥善保存此流程ID，以便于顺利进行后续操作。

[点击查看FlowId在控制台上的位置](https://qcloudimg.tencent-cloud.cn/raw/05af26573d5106763b4cfbb9f7c64b41.png)
     * @param FlowId 合同流程ID，为32位字符串。
建议开发者妥善保存此流程ID，以便于顺利进行后续操作。

[点击查看FlowId在控制台上的位置](https://qcloudimg.tencent-cloud.cn/raw/05af26573d5106763b4cfbb9f7c64b41.png)
     */
    public void setFlowId(String FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get 签署方信息，如角色ID、角色名称等 
     * @return Approvers 签署方信息，如角色ID、角色名称等
     */
    public ApproverItem [] getApprovers() {
        return this.Approvers;
    }

    /**
     * Set 签署方信息，如角色ID、角色名称等
     * @param Approvers 签署方信息，如角色ID、角色名称等
     */
    public void setApprovers(ApproverItem [] Approvers) {
        this.Approvers = Approvers;
    }

    /**
     * Get 预览链接，有效期5分钟
注：如果是预览模式(即NeedPreview设置为true)时, 才会有此预览链接URL 
     * @return PreviewUrl 预览链接，有效期5分钟
注：如果是预览模式(即NeedPreview设置为true)时, 才会有此预览链接URL
     */
    public String getPreviewUrl() {
        return this.PreviewUrl;
    }

    /**
     * Set 预览链接，有效期5分钟
注：如果是预览模式(即NeedPreview设置为true)时, 才会有此预览链接URL
     * @param PreviewUrl 预览链接，有效期5分钟
注：如果是预览模式(即NeedPreview设置为true)时, 才会有此预览链接URL
     */
    public void setPreviewUrl(String PreviewUrl) {
        this.PreviewUrl = PreviewUrl;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public ChannelCreateFlowByFilesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChannelCreateFlowByFilesResponse(ChannelCreateFlowByFilesResponse source) {
        if (source.FlowId != null) {
            this.FlowId = new String(source.FlowId);
        }
        if (source.Approvers != null) {
            this.Approvers = new ApproverItem[source.Approvers.length];
            for (int i = 0; i < source.Approvers.length; i++) {
                this.Approvers[i] = new ApproverItem(source.Approvers[i]);
            }
        }
        if (source.PreviewUrl != null) {
            this.PreviewUrl = new String(source.PreviewUrl);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamArrayObj(map, prefix + "Approvers.", this.Approvers);
        this.setParamSimple(map, prefix + "PreviewUrl", this.PreviewUrl);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

