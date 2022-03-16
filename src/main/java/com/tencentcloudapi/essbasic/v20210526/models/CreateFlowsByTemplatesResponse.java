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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateFlowsByTemplatesResponse extends AbstractModel{

    /**
    * 多个合同ID
    */
    @SerializedName("FlowIds")
    @Expose
    private String [] FlowIds;

    /**
    * 渠道的业务信息，限制1024字符
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
    * 预览模式下返回的预览文件url数组
    */
    @SerializedName("PreviewUrls")
    @Expose
    private String [] PreviewUrls;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 多个合同ID 
     * @return FlowIds 多个合同ID
     */
    public String [] getFlowIds() {
        return this.FlowIds;
    }

    /**
     * Set 多个合同ID
     * @param FlowIds 多个合同ID
     */
    public void setFlowIds(String [] FlowIds) {
        this.FlowIds = FlowIds;
    }

    /**
     * Get 渠道的业务信息，限制1024字符 
     * @return CustomerData 渠道的业务信息，限制1024字符
     */
    public String [] getCustomerData() {
        return this.CustomerData;
    }

    /**
     * Set 渠道的业务信息，限制1024字符
     * @param CustomerData 渠道的业务信息，限制1024字符
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
     * Get 预览模式下返回的预览文件url数组 
     * @return PreviewUrls 预览模式下返回的预览文件url数组
     */
    public String [] getPreviewUrls() {
        return this.PreviewUrls;
    }

    /**
     * Set 预览模式下返回的预览文件url数组
     * @param PreviewUrls 预览模式下返回的预览文件url数组
     */
    public void setPreviewUrls(String [] PreviewUrls) {
        this.PreviewUrls = PreviewUrls;
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
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

