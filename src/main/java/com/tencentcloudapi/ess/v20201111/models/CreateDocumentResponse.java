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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDocumentResponse extends AbstractModel {

    /**
    * 合同流程的底层电子文档ID，为32位字符串。

注:
后续需用同样的FlowId再次调用[发起签署流程](https://qian.tencent.com/developers/companyApis/startFlows/StartFlow)，合同才能进入签署环节
    */
    @SerializedName("DocumentId")
    @Expose
    private String DocumentId;

    /**
    * 合同预览链接URL。

注: `1.如果是预览模式(即NeedPreview设置为true)时, 才会有此预览链接URL`
`2.当使用的模板中存在动态表格控件时，预览结果中没有动态表格的填写内容`
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PreviewFileUrl")
    @Expose
    private String PreviewFileUrl;

    /**
    * 签署方信息，如角色ID、角色名称等
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Approvers")
    @Expose
    private ApproverItem [] Approvers;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 合同流程的底层电子文档ID，为32位字符串。

注:
后续需用同样的FlowId再次调用[发起签署流程](https://qian.tencent.com/developers/companyApis/startFlows/StartFlow)，合同才能进入签署环节 
     * @return DocumentId 合同流程的底层电子文档ID，为32位字符串。

注:
后续需用同样的FlowId再次调用[发起签署流程](https://qian.tencent.com/developers/companyApis/startFlows/StartFlow)，合同才能进入签署环节
     */
    public String getDocumentId() {
        return this.DocumentId;
    }

    /**
     * Set 合同流程的底层电子文档ID，为32位字符串。

注:
后续需用同样的FlowId再次调用[发起签署流程](https://qian.tencent.com/developers/companyApis/startFlows/StartFlow)，合同才能进入签署环节
     * @param DocumentId 合同流程的底层电子文档ID，为32位字符串。

注:
后续需用同样的FlowId再次调用[发起签署流程](https://qian.tencent.com/developers/companyApis/startFlows/StartFlow)，合同才能进入签署环节
     */
    public void setDocumentId(String DocumentId) {
        this.DocumentId = DocumentId;
    }

    /**
     * Get 合同预览链接URL。

注: `1.如果是预览模式(即NeedPreview设置为true)时, 才会有此预览链接URL`
`2.当使用的模板中存在动态表格控件时，预览结果中没有动态表格的填写内容`
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PreviewFileUrl 合同预览链接URL。

注: `1.如果是预览模式(即NeedPreview设置为true)时, 才会有此预览链接URL`
`2.当使用的模板中存在动态表格控件时，预览结果中没有动态表格的填写内容`
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPreviewFileUrl() {
        return this.PreviewFileUrl;
    }

    /**
     * Set 合同预览链接URL。

注: `1.如果是预览模式(即NeedPreview设置为true)时, 才会有此预览链接URL`
`2.当使用的模板中存在动态表格控件时，预览结果中没有动态表格的填写内容`
注意：此字段可能返回 null，表示取不到有效值。
     * @param PreviewFileUrl 合同预览链接URL。

注: `1.如果是预览模式(即NeedPreview设置为true)时, 才会有此预览链接URL`
`2.当使用的模板中存在动态表格控件时，预览结果中没有动态表格的填写内容`
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPreviewFileUrl(String PreviewFileUrl) {
        this.PreviewFileUrl = PreviewFileUrl;
    }

    /**
     * Get 签署方信息，如角色ID、角色名称等
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Approvers 签署方信息，如角色ID、角色名称等
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ApproverItem [] getApprovers() {
        return this.Approvers;
    }

    /**
     * Set 签署方信息，如角色ID、角色名称等
注意：此字段可能返回 null，表示取不到有效值。
     * @param Approvers 签署方信息，如角色ID、角色名称等
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApprovers(ApproverItem [] Approvers) {
        this.Approvers = Approvers;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public CreateDocumentResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDocumentResponse(CreateDocumentResponse source) {
        if (source.DocumentId != null) {
            this.DocumentId = new String(source.DocumentId);
        }
        if (source.PreviewFileUrl != null) {
            this.PreviewFileUrl = new String(source.PreviewFileUrl);
        }
        if (source.Approvers != null) {
            this.Approvers = new ApproverItem[source.Approvers.length];
            for (int i = 0; i < source.Approvers.length; i++) {
                this.Approvers[i] = new ApproverItem(source.Approvers[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DocumentId", this.DocumentId);
        this.setParamSimple(map, prefix + "PreviewFileUrl", this.PreviewFileUrl);
        this.setParamArrayObj(map, prefix + "Approvers.", this.Approvers);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

