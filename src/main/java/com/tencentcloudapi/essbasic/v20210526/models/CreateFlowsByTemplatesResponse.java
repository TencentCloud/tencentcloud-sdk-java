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

public class CreateFlowsByTemplatesResponse extends AbstractModel {

    /**
    * 生成的合同流程ID数组，合同流程ID为32位字符串。
建议开发者妥善保存此流程ID数组，以便于顺利进行后续操作。

[点击产看FlowId在控制台上的位置](https://qcloudimg.tencent-cloud.cn/raw/05af26573d5106763b4cfbb9f7c64b41.png)
    */
    @SerializedName("FlowIds")
    @Expose
    private String [] FlowIds;

    /**
    * 第三方应用平台的业务信息, 与创建合同的FlowInfos数组中的CustomerData一一对应
    */
    @SerializedName("CustomerData")
    @Expose
    private String [] CustomerData;

    /**
    * 创建消息，对应多个合同ID，
成功为“”,创建失败则对应失败消息
    */
    @SerializedName("ErrorMessages")
    @Expose
    private String [] ErrorMessages;

    /**
    * 合同预览链接URL数组。

注：如果是预览模式(即NeedPreview设置为true)时, 才会有此预览链接URL
    */
    @SerializedName("PreviewUrls")
    @Expose
    private String [] PreviewUrls;

    /**
    * 复杂文档合成任务（如，包含动态表格的预览任务）的任务信息数组；
如果文档需要异步合成，此字段会返回该异步任务的任务信息，后续可以通过ChannelGetTaskResultApi接口查询任务详情；
    */
    @SerializedName("TaskInfos")
    @Expose
    private TaskInfo [] TaskInfos;

    /**
    * 签署方信息，如角色ID、角色名称等
    */
    @SerializedName("FlowApprovers")
    @Expose
    private FlowApproverItem [] FlowApprovers;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 生成的合同流程ID数组，合同流程ID为32位字符串。
建议开发者妥善保存此流程ID数组，以便于顺利进行后续操作。

[点击产看FlowId在控制台上的位置](https://qcloudimg.tencent-cloud.cn/raw/05af26573d5106763b4cfbb9f7c64b41.png) 
     * @return FlowIds 生成的合同流程ID数组，合同流程ID为32位字符串。
建议开发者妥善保存此流程ID数组，以便于顺利进行后续操作。

[点击产看FlowId在控制台上的位置](https://qcloudimg.tencent-cloud.cn/raw/05af26573d5106763b4cfbb9f7c64b41.png)
     */
    public String [] getFlowIds() {
        return this.FlowIds;
    }

    /**
     * Set 生成的合同流程ID数组，合同流程ID为32位字符串。
建议开发者妥善保存此流程ID数组，以便于顺利进行后续操作。

[点击产看FlowId在控制台上的位置](https://qcloudimg.tencent-cloud.cn/raw/05af26573d5106763b4cfbb9f7c64b41.png)
     * @param FlowIds 生成的合同流程ID数组，合同流程ID为32位字符串。
建议开发者妥善保存此流程ID数组，以便于顺利进行后续操作。

[点击产看FlowId在控制台上的位置](https://qcloudimg.tencent-cloud.cn/raw/05af26573d5106763b4cfbb9f7c64b41.png)
     */
    public void setFlowIds(String [] FlowIds) {
        this.FlowIds = FlowIds;
    }

    /**
     * Get 第三方应用平台的业务信息, 与创建合同的FlowInfos数组中的CustomerData一一对应 
     * @return CustomerData 第三方应用平台的业务信息, 与创建合同的FlowInfos数组中的CustomerData一一对应
     */
    public String [] getCustomerData() {
        return this.CustomerData;
    }

    /**
     * Set 第三方应用平台的业务信息, 与创建合同的FlowInfos数组中的CustomerData一一对应
     * @param CustomerData 第三方应用平台的业务信息, 与创建合同的FlowInfos数组中的CustomerData一一对应
     */
    public void setCustomerData(String [] CustomerData) {
        this.CustomerData = CustomerData;
    }

    /**
     * Get 创建消息，对应多个合同ID，
成功为“”,创建失败则对应失败消息 
     * @return ErrorMessages 创建消息，对应多个合同ID，
成功为“”,创建失败则对应失败消息
     */
    public String [] getErrorMessages() {
        return this.ErrorMessages;
    }

    /**
     * Set 创建消息，对应多个合同ID，
成功为“”,创建失败则对应失败消息
     * @param ErrorMessages 创建消息，对应多个合同ID，
成功为“”,创建失败则对应失败消息
     */
    public void setErrorMessages(String [] ErrorMessages) {
        this.ErrorMessages = ErrorMessages;
    }

    /**
     * Get 合同预览链接URL数组。

注：如果是预览模式(即NeedPreview设置为true)时, 才会有此预览链接URL 
     * @return PreviewUrls 合同预览链接URL数组。

注：如果是预览模式(即NeedPreview设置为true)时, 才会有此预览链接URL
     */
    public String [] getPreviewUrls() {
        return this.PreviewUrls;
    }

    /**
     * Set 合同预览链接URL数组。

注：如果是预览模式(即NeedPreview设置为true)时, 才会有此预览链接URL
     * @param PreviewUrls 合同预览链接URL数组。

注：如果是预览模式(即NeedPreview设置为true)时, 才会有此预览链接URL
     */
    public void setPreviewUrls(String [] PreviewUrls) {
        this.PreviewUrls = PreviewUrls;
    }

    /**
     * Get 复杂文档合成任务（如，包含动态表格的预览任务）的任务信息数组；
如果文档需要异步合成，此字段会返回该异步任务的任务信息，后续可以通过ChannelGetTaskResultApi接口查询任务详情； 
     * @return TaskInfos 复杂文档合成任务（如，包含动态表格的预览任务）的任务信息数组；
如果文档需要异步合成，此字段会返回该异步任务的任务信息，后续可以通过ChannelGetTaskResultApi接口查询任务详情；
     */
    public TaskInfo [] getTaskInfos() {
        return this.TaskInfos;
    }

    /**
     * Set 复杂文档合成任务（如，包含动态表格的预览任务）的任务信息数组；
如果文档需要异步合成，此字段会返回该异步任务的任务信息，后续可以通过ChannelGetTaskResultApi接口查询任务详情；
     * @param TaskInfos 复杂文档合成任务（如，包含动态表格的预览任务）的任务信息数组；
如果文档需要异步合成，此字段会返回该异步任务的任务信息，后续可以通过ChannelGetTaskResultApi接口查询任务详情；
     */
    public void setTaskInfos(TaskInfo [] TaskInfos) {
        this.TaskInfos = TaskInfos;
    }

    /**
     * Get 签署方信息，如角色ID、角色名称等 
     * @return FlowApprovers 签署方信息，如角色ID、角色名称等
     */
    public FlowApproverItem [] getFlowApprovers() {
        return this.FlowApprovers;
    }

    /**
     * Set 签署方信息，如角色ID、角色名称等
     * @param FlowApprovers 签署方信息，如角色ID、角色名称等
     */
    public void setFlowApprovers(FlowApproverItem [] FlowApprovers) {
        this.FlowApprovers = FlowApprovers;
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

    public CreateFlowsByTemplatesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateFlowsByTemplatesResponse(CreateFlowsByTemplatesResponse source) {
        if (source.FlowIds != null) {
            this.FlowIds = new String[source.FlowIds.length];
            for (int i = 0; i < source.FlowIds.length; i++) {
                this.FlowIds[i] = new String(source.FlowIds[i]);
            }
        }
        if (source.CustomerData != null) {
            this.CustomerData = new String[source.CustomerData.length];
            for (int i = 0; i < source.CustomerData.length; i++) {
                this.CustomerData[i] = new String(source.CustomerData[i]);
            }
        }
        if (source.ErrorMessages != null) {
            this.ErrorMessages = new String[source.ErrorMessages.length];
            for (int i = 0; i < source.ErrorMessages.length; i++) {
                this.ErrorMessages[i] = new String(source.ErrorMessages[i]);
            }
        }
        if (source.PreviewUrls != null) {
            this.PreviewUrls = new String[source.PreviewUrls.length];
            for (int i = 0; i < source.PreviewUrls.length; i++) {
                this.PreviewUrls[i] = new String(source.PreviewUrls[i]);
            }
        }
        if (source.TaskInfos != null) {
            this.TaskInfos = new TaskInfo[source.TaskInfos.length];
            for (int i = 0; i < source.TaskInfos.length; i++) {
                this.TaskInfos[i] = new TaskInfo(source.TaskInfos[i]);
            }
        }
        if (source.FlowApprovers != null) {
            this.FlowApprovers = new FlowApproverItem[source.FlowApprovers.length];
            for (int i = 0; i < source.FlowApprovers.length; i++) {
                this.FlowApprovers[i] = new FlowApproverItem(source.FlowApprovers[i]);
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
        this.setParamArraySimple(map, prefix + "FlowIds.", this.FlowIds);
        this.setParamArraySimple(map, prefix + "CustomerData.", this.CustomerData);
        this.setParamArraySimple(map, prefix + "ErrorMessages.", this.ErrorMessages);
        this.setParamArraySimple(map, prefix + "PreviewUrls.", this.PreviewUrls);
        this.setParamArrayObj(map, prefix + "TaskInfos.", this.TaskInfos);
        this.setParamArrayObj(map, prefix + "FlowApprovers.", this.FlowApprovers);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

