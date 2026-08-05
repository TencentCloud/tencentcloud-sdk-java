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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateFlowsByTemplatesResponse extends AbstractModel {

    /**
    * <p>生成的合同流程ID数组，合同流程ID为32位字符串。<br>建议开发者妥善保存此流程ID数组，以便于顺利进行后续操作。</p><p><a href="https://qcloudimg.tencent-cloud.cn/raw/05af26573d5106763b4cfbb9f7c64b41.png">点击产看FlowId在控制台上的位置</a></p>
    */
    @SerializedName("FlowIds")
    @Expose
    private String [] FlowIds;

    /**
    * <p>第三方应用平台的业务信息, 与创建合同的FlowInfos数组中的CustomerData一一对应</p>
    */
    @SerializedName("CustomerData")
    @Expose
    private String [] CustomerData;

    /**
    * <p>创建消息，对应多个合同ID，<br>成功为“”,创建失败则对应失败消息</p>
    */
    @SerializedName("ErrorMessages")
    @Expose
    private String [] ErrorMessages;

    /**
    * <p>合同预览链接URL数组。</p><p>注：如果是预览模式(即NeedPreview设置为true)时, 才会有此预览链接URL<br>如果预览的文件中指定了动态表格控件，此时此接口返回的是合成前的文档预览链接，合成完成后的文档预览链接需要通过<a href="https://qian.tencent.com/developers/partner/callback_types_contracts_sign#%E5%8D%81%E4%B8%80-%E5%90%88%E5%90%8C%E6%96%87%E6%A1%A3%E5%90%88%E6%88%90%E5%AE%8C%E6%88%90%E5%9B%9E%E8%B0%83">合同文档合成完成回调</a>获取或使用返回的TaskInfo中的TaskId通过<a href="https://qian.tencent.com/developers/partnerApis/files/ChannelGetTaskResultApi">查询转换任务状态</a>接口查询得到</p>
    */
    @SerializedName("PreviewUrls")
    @Expose
    private String [] PreviewUrls;

    /**
    * <p>复杂文档合成任务（如，包含动态表格的预览任务）的任务信息数组；<br>如果文档需要异步合成，此字段会返回该异步任务的任务信息，后续可以通过ChannelGetTaskResultApi接口查询任务详情；</p>
    */
    @SerializedName("TaskInfos")
    @Expose
    private TaskInfo [] TaskInfos;

    /**
    * <p>签署方信息，如角色ID、角色名称等</p>
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
     * Get <p>生成的合同流程ID数组，合同流程ID为32位字符串。<br>建议开发者妥善保存此流程ID数组，以便于顺利进行后续操作。</p><p><a href="https://qcloudimg.tencent-cloud.cn/raw/05af26573d5106763b4cfbb9f7c64b41.png">点击产看FlowId在控制台上的位置</a></p> 
     * @return FlowIds <p>生成的合同流程ID数组，合同流程ID为32位字符串。<br>建议开发者妥善保存此流程ID数组，以便于顺利进行后续操作。</p><p><a href="https://qcloudimg.tencent-cloud.cn/raw/05af26573d5106763b4cfbb9f7c64b41.png">点击产看FlowId在控制台上的位置</a></p>
     */
    public String [] getFlowIds() {
        return this.FlowIds;
    }

    /**
     * Set <p>生成的合同流程ID数组，合同流程ID为32位字符串。<br>建议开发者妥善保存此流程ID数组，以便于顺利进行后续操作。</p><p><a href="https://qcloudimg.tencent-cloud.cn/raw/05af26573d5106763b4cfbb9f7c64b41.png">点击产看FlowId在控制台上的位置</a></p>
     * @param FlowIds <p>生成的合同流程ID数组，合同流程ID为32位字符串。<br>建议开发者妥善保存此流程ID数组，以便于顺利进行后续操作。</p><p><a href="https://qcloudimg.tencent-cloud.cn/raw/05af26573d5106763b4cfbb9f7c64b41.png">点击产看FlowId在控制台上的位置</a></p>
     */
    public void setFlowIds(String [] FlowIds) {
        this.FlowIds = FlowIds;
    }

    /**
     * Get <p>第三方应用平台的业务信息, 与创建合同的FlowInfos数组中的CustomerData一一对应</p> 
     * @return CustomerData <p>第三方应用平台的业务信息, 与创建合同的FlowInfos数组中的CustomerData一一对应</p>
     */
    public String [] getCustomerData() {
        return this.CustomerData;
    }

    /**
     * Set <p>第三方应用平台的业务信息, 与创建合同的FlowInfos数组中的CustomerData一一对应</p>
     * @param CustomerData <p>第三方应用平台的业务信息, 与创建合同的FlowInfos数组中的CustomerData一一对应</p>
     */
    public void setCustomerData(String [] CustomerData) {
        this.CustomerData = CustomerData;
    }

    /**
     * Get <p>创建消息，对应多个合同ID，<br>成功为“”,创建失败则对应失败消息</p> 
     * @return ErrorMessages <p>创建消息，对应多个合同ID，<br>成功为“”,创建失败则对应失败消息</p>
     */
    public String [] getErrorMessages() {
        return this.ErrorMessages;
    }

    /**
     * Set <p>创建消息，对应多个合同ID，<br>成功为“”,创建失败则对应失败消息</p>
     * @param ErrorMessages <p>创建消息，对应多个合同ID，<br>成功为“”,创建失败则对应失败消息</p>
     */
    public void setErrorMessages(String [] ErrorMessages) {
        this.ErrorMessages = ErrorMessages;
    }

    /**
     * Get <p>合同预览链接URL数组。</p><p>注：如果是预览模式(即NeedPreview设置为true)时, 才会有此预览链接URL<br>如果预览的文件中指定了动态表格控件，此时此接口返回的是合成前的文档预览链接，合成完成后的文档预览链接需要通过<a href="https://qian.tencent.com/developers/partner/callback_types_contracts_sign#%E5%8D%81%E4%B8%80-%E5%90%88%E5%90%8C%E6%96%87%E6%A1%A3%E5%90%88%E6%88%90%E5%AE%8C%E6%88%90%E5%9B%9E%E8%B0%83">合同文档合成完成回调</a>获取或使用返回的TaskInfo中的TaskId通过<a href="https://qian.tencent.com/developers/partnerApis/files/ChannelGetTaskResultApi">查询转换任务状态</a>接口查询得到</p> 
     * @return PreviewUrls <p>合同预览链接URL数组。</p><p>注：如果是预览模式(即NeedPreview设置为true)时, 才会有此预览链接URL<br>如果预览的文件中指定了动态表格控件，此时此接口返回的是合成前的文档预览链接，合成完成后的文档预览链接需要通过<a href="https://qian.tencent.com/developers/partner/callback_types_contracts_sign#%E5%8D%81%E4%B8%80-%E5%90%88%E5%90%8C%E6%96%87%E6%A1%A3%E5%90%88%E6%88%90%E5%AE%8C%E6%88%90%E5%9B%9E%E8%B0%83">合同文档合成完成回调</a>获取或使用返回的TaskInfo中的TaskId通过<a href="https://qian.tencent.com/developers/partnerApis/files/ChannelGetTaskResultApi">查询转换任务状态</a>接口查询得到</p>
     */
    public String [] getPreviewUrls() {
        return this.PreviewUrls;
    }

    /**
     * Set <p>合同预览链接URL数组。</p><p>注：如果是预览模式(即NeedPreview设置为true)时, 才会有此预览链接URL<br>如果预览的文件中指定了动态表格控件，此时此接口返回的是合成前的文档预览链接，合成完成后的文档预览链接需要通过<a href="https://qian.tencent.com/developers/partner/callback_types_contracts_sign#%E5%8D%81%E4%B8%80-%E5%90%88%E5%90%8C%E6%96%87%E6%A1%A3%E5%90%88%E6%88%90%E5%AE%8C%E6%88%90%E5%9B%9E%E8%B0%83">合同文档合成完成回调</a>获取或使用返回的TaskInfo中的TaskId通过<a href="https://qian.tencent.com/developers/partnerApis/files/ChannelGetTaskResultApi">查询转换任务状态</a>接口查询得到</p>
     * @param PreviewUrls <p>合同预览链接URL数组。</p><p>注：如果是预览模式(即NeedPreview设置为true)时, 才会有此预览链接URL<br>如果预览的文件中指定了动态表格控件，此时此接口返回的是合成前的文档预览链接，合成完成后的文档预览链接需要通过<a href="https://qian.tencent.com/developers/partner/callback_types_contracts_sign#%E5%8D%81%E4%B8%80-%E5%90%88%E5%90%8C%E6%96%87%E6%A1%A3%E5%90%88%E6%88%90%E5%AE%8C%E6%88%90%E5%9B%9E%E8%B0%83">合同文档合成完成回调</a>获取或使用返回的TaskInfo中的TaskId通过<a href="https://qian.tencent.com/developers/partnerApis/files/ChannelGetTaskResultApi">查询转换任务状态</a>接口查询得到</p>
     */
    public void setPreviewUrls(String [] PreviewUrls) {
        this.PreviewUrls = PreviewUrls;
    }

    /**
     * Get <p>复杂文档合成任务（如，包含动态表格的预览任务）的任务信息数组；<br>如果文档需要异步合成，此字段会返回该异步任务的任务信息，后续可以通过ChannelGetTaskResultApi接口查询任务详情；</p> 
     * @return TaskInfos <p>复杂文档合成任务（如，包含动态表格的预览任务）的任务信息数组；<br>如果文档需要异步合成，此字段会返回该异步任务的任务信息，后续可以通过ChannelGetTaskResultApi接口查询任务详情；</p>
     */
    public TaskInfo [] getTaskInfos() {
        return this.TaskInfos;
    }

    /**
     * Set <p>复杂文档合成任务（如，包含动态表格的预览任务）的任务信息数组；<br>如果文档需要异步合成，此字段会返回该异步任务的任务信息，后续可以通过ChannelGetTaskResultApi接口查询任务详情；</p>
     * @param TaskInfos <p>复杂文档合成任务（如，包含动态表格的预览任务）的任务信息数组；<br>如果文档需要异步合成，此字段会返回该异步任务的任务信息，后续可以通过ChannelGetTaskResultApi接口查询任务详情；</p>
     */
    public void setTaskInfos(TaskInfo [] TaskInfos) {
        this.TaskInfos = TaskInfos;
    }

    /**
     * Get <p>签署方信息，如角色ID、角色名称等</p> 
     * @return FlowApprovers <p>签署方信息，如角色ID、角色名称等</p>
     */
    public FlowApproverItem [] getFlowApprovers() {
        return this.FlowApprovers;
    }

    /**
     * Set <p>签署方信息，如角色ID、角色名称等</p>
     * @param FlowApprovers <p>签署方信息，如角色ID、角色名称等</p>
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

