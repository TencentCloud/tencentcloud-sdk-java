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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateBatchCancelFlowUrlResponse extends AbstractModel{

    /**
    * 批量撤回签署流程链接
    */
    @SerializedName("BatchCancelFlowUrl")
    @Expose
    private String BatchCancelFlowUrl;

    /**
    * 签署流程撤回失败信息
    */
    @SerializedName("FailMessages")
    @Expose
    private String [] FailMessages;

    /**
    * 签署连接过期时间字符串：年月日-时分秒
    */
    @SerializedName("UrlExpireOn")
    @Expose
    private String UrlExpireOn;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 批量撤回签署流程链接 
     * @return BatchCancelFlowUrl 批量撤回签署流程链接
     */
    public String getBatchCancelFlowUrl() {
        return this.BatchCancelFlowUrl;
    }

    /**
     * Set 批量撤回签署流程链接
     * @param BatchCancelFlowUrl 批量撤回签署流程链接
     */
    public void setBatchCancelFlowUrl(String BatchCancelFlowUrl) {
        this.BatchCancelFlowUrl = BatchCancelFlowUrl;
    }

    /**
     * Get 签署流程撤回失败信息 
     * @return FailMessages 签署流程撤回失败信息
     */
    public String [] getFailMessages() {
        return this.FailMessages;
    }

    /**
     * Set 签署流程撤回失败信息
     * @param FailMessages 签署流程撤回失败信息
     */
    public void setFailMessages(String [] FailMessages) {
        this.FailMessages = FailMessages;
    }

    /**
     * Get 签署连接过期时间字符串：年月日-时分秒 
     * @return UrlExpireOn 签署连接过期时间字符串：年月日-时分秒
     */
    public String getUrlExpireOn() {
        return this.UrlExpireOn;
    }

    /**
     * Set 签署连接过期时间字符串：年月日-时分秒
     * @param UrlExpireOn 签署连接过期时间字符串：年月日-时分秒
     */
    public void setUrlExpireOn(String UrlExpireOn) {
        this.UrlExpireOn = UrlExpireOn;
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

    public CreateBatchCancelFlowUrlResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateBatchCancelFlowUrlResponse(CreateBatchCancelFlowUrlResponse source) {
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
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

