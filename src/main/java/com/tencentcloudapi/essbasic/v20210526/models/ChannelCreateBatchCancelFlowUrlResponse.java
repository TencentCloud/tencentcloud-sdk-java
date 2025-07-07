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

public class ChannelCreateBatchCancelFlowUrlResponse extends AbstractModel {

    /**
    * 批量撤销合同的URL链接, 需要在手机端打开, 有效期24小时

注：<font color="red">生成的链路后面不能再增加参数</font>（会出现覆盖链接中已有参数导致错误）
    */
    @SerializedName("BatchCancelFlowUrl")
    @Expose
    private String BatchCancelFlowUrl;

    /**
    * 与入参的FlowIds数组一致,   成功生成到撤销链接中,则为"",   不能撤销合同则为失败原因
    */
    @SerializedName("FailMessages")
    @Expose
    private String [] FailMessages;

    /**
    * 签署撤销链接的过期时间(格式为:年-月-日 时:分:秒), 默认是生成链接的24小时后失效


    */
    @SerializedName("UrlExpireOn")
    @Expose
    private String UrlExpireOn;

    /**
    * 批量撤销任务编号，为32位字符串，可用于[查询批量撤销合同结果](https://qian.tencent.com/developers/partnerApis/operateFlows/DescribeCancelFlowsTask) 或关联[批量撤销任务结果回调](https://qian.tencent.com/developers/partner/callback_types_contracts_sign#%E4%B9%9D-%E6%89%B9%E9%87%8F%E6%92%A4%E9%94%80%E7%BB%93%E6%9E%9C%E5%9B%9E%E8%B0%83)
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 批量撤销合同的URL链接, 需要在手机端打开, 有效期24小时

注：<font color="red">生成的链路后面不能再增加参数</font>（会出现覆盖链接中已有参数导致错误） 
     * @return BatchCancelFlowUrl 批量撤销合同的URL链接, 需要在手机端打开, 有效期24小时

注：<font color="red">生成的链路后面不能再增加参数</font>（会出现覆盖链接中已有参数导致错误）
     */
    public String getBatchCancelFlowUrl() {
        return this.BatchCancelFlowUrl;
    }

    /**
     * Set 批量撤销合同的URL链接, 需要在手机端打开, 有效期24小时

注：<font color="red">生成的链路后面不能再增加参数</font>（会出现覆盖链接中已有参数导致错误）
     * @param BatchCancelFlowUrl 批量撤销合同的URL链接, 需要在手机端打开, 有效期24小时

注：<font color="red">生成的链路后面不能再增加参数</font>（会出现覆盖链接中已有参数导致错误）
     */
    public void setBatchCancelFlowUrl(String BatchCancelFlowUrl) {
        this.BatchCancelFlowUrl = BatchCancelFlowUrl;
    }

    /**
     * Get 与入参的FlowIds数组一致,   成功生成到撤销链接中,则为"",   不能撤销合同则为失败原因 
     * @return FailMessages 与入参的FlowIds数组一致,   成功生成到撤销链接中,则为"",   不能撤销合同则为失败原因
     */
    public String [] getFailMessages() {
        return this.FailMessages;
    }

    /**
     * Set 与入参的FlowIds数组一致,   成功生成到撤销链接中,则为"",   不能撤销合同则为失败原因
     * @param FailMessages 与入参的FlowIds数组一致,   成功生成到撤销链接中,则为"",   不能撤销合同则为失败原因
     */
    public void setFailMessages(String [] FailMessages) {
        this.FailMessages = FailMessages;
    }

    /**
     * Get 签署撤销链接的过期时间(格式为:年-月-日 时:分:秒), 默认是生成链接的24小时后失效

 
     * @return UrlExpireOn 签署撤销链接的过期时间(格式为:年-月-日 时:分:秒), 默认是生成链接的24小时后失效


     */
    public String getUrlExpireOn() {
        return this.UrlExpireOn;
    }

    /**
     * Set 签署撤销链接的过期时间(格式为:年-月-日 时:分:秒), 默认是生成链接的24小时后失效


     * @param UrlExpireOn 签署撤销链接的过期时间(格式为:年-月-日 时:分:秒), 默认是生成链接的24小时后失效


     */
    public void setUrlExpireOn(String UrlExpireOn) {
        this.UrlExpireOn = UrlExpireOn;
    }

    /**
     * Get 批量撤销任务编号，为32位字符串，可用于[查询批量撤销合同结果](https://qian.tencent.com/developers/partnerApis/operateFlows/DescribeCancelFlowsTask) 或关联[批量撤销任务结果回调](https://qian.tencent.com/developers/partner/callback_types_contracts_sign#%E4%B9%9D-%E6%89%B9%E9%87%8F%E6%92%A4%E9%94%80%E7%BB%93%E6%9E%9C%E5%9B%9E%E8%B0%83) 
     * @return TaskId 批量撤销任务编号，为32位字符串，可用于[查询批量撤销合同结果](https://qian.tencent.com/developers/partnerApis/operateFlows/DescribeCancelFlowsTask) 或关联[批量撤销任务结果回调](https://qian.tencent.com/developers/partner/callback_types_contracts_sign#%E4%B9%9D-%E6%89%B9%E9%87%8F%E6%92%A4%E9%94%80%E7%BB%93%E6%9E%9C%E5%9B%9E%E8%B0%83)
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 批量撤销任务编号，为32位字符串，可用于[查询批量撤销合同结果](https://qian.tencent.com/developers/partnerApis/operateFlows/DescribeCancelFlowsTask) 或关联[批量撤销任务结果回调](https://qian.tencent.com/developers/partner/callback_types_contracts_sign#%E4%B9%9D-%E6%89%B9%E9%87%8F%E6%92%A4%E9%94%80%E7%BB%93%E6%9E%9C%E5%9B%9E%E8%B0%83)
     * @param TaskId 批量撤销任务编号，为32位字符串，可用于[查询批量撤销合同结果](https://qian.tencent.com/developers/partnerApis/operateFlows/DescribeCancelFlowsTask) 或关联[批量撤销任务结果回调](https://qian.tencent.com/developers/partner/callback_types_contracts_sign#%E4%B9%9D-%E6%89%B9%E9%87%8F%E6%92%A4%E9%94%80%E7%BB%93%E6%9E%9C%E5%9B%9E%E8%B0%83)
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
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

    public ChannelCreateBatchCancelFlowUrlResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChannelCreateBatchCancelFlowUrlResponse(ChannelCreateBatchCancelFlowUrlResponse source) {
        if (source.BatchCancelFlowUrl != null) {
            this.BatchCancelFlowUrl = new String(source.BatchCancelFlowUrl);
        }
        if (source.FailMessages != null) {
            this.FailMessages = new String[source.FailMessages.length];
            for (int i = 0; i < source.FailMessages.length; i++) {
                this.FailMessages[i] = new String(source.FailMessages[i]);
            }
        }
        if (source.UrlExpireOn != null) {
            this.UrlExpireOn = new String(source.UrlExpireOn);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BatchCancelFlowUrl", this.BatchCancelFlowUrl);
        this.setParamArraySimple(map, prefix + "FailMessages.", this.FailMessages);
        this.setParamSimple(map, prefix + "UrlExpireOn", this.UrlExpireOn);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

