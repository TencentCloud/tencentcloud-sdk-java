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
package com.tencentcloudapi.iotvideo.v20201215.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteForwardRuleResponse extends AbstractModel{

    /**
    * 腾讯云账号
    */
    @SerializedName("Endpoint")
    @Expose
    private String Endpoint;

    /**
    * 队列名称
    */
    @SerializedName("QueueName")
    @Expose
    private String QueueName;

    /**
    * 产品ID
    */
    @SerializedName("ProductID")
    @Expose
    private String ProductID;

    /**
    * 删除结果 0成功 其他不成功
    */
    @SerializedName("Result")
    @Expose
    private Long Result;

    /**
    * 错误消息
    */
    @SerializedName("ErrMsg")
    @Expose
    private String ErrMsg;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 腾讯云账号 
     * @return Endpoint 腾讯云账号
     */
    public String getEndpoint() {
        return this.Endpoint;
    }

    /**
     * Set 腾讯云账号
     * @param Endpoint 腾讯云账号
     */
    public void setEndpoint(String Endpoint) {
        this.Endpoint = Endpoint;
    }

    /**
     * Get 队列名称 
     * @return QueueName 队列名称
     */
    public String getQueueName() {
        return this.QueueName;
    }

    /**
     * Set 队列名称
     * @param QueueName 队列名称
     */
    public void setQueueName(String QueueName) {
        this.QueueName = QueueName;
    }

    /**
     * Get 产品ID 
     * @return ProductID 产品ID
     */
    public String getProductID() {
        return this.ProductID;
    }

    /**
     * Set 产品ID
     * @param ProductID 产品ID
     */
    public void setProductID(String ProductID) {
        this.ProductID = ProductID;
    }

    /**
     * Get 删除结果 0成功 其他不成功 
     * @return Result 删除结果 0成功 其他不成功
     */
    public Long getResult() {
        return this.Result;
    }

    /**
     * Set 删除结果 0成功 其他不成功
     * @param Result 删除结果 0成功 其他不成功
     */
    public void setResult(Long Result) {
        this.Result = Result;
    }

    /**
     * Get 错误消息 
     * @return ErrMsg 错误消息
     */
    public String getErrMsg() {
        return this.ErrMsg;
    }

    /**
     * Set 错误消息
     * @param ErrMsg 错误消息
     */
    public void setErrMsg(String ErrMsg) {
        this.ErrMsg = ErrMsg;
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

    public DeleteForwardRuleResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteForwardRuleResponse(DeleteForwardRuleResponse source) {
        if (source.Endpoint != null) {
            this.Endpoint = new String(source.Endpoint);
        }
        if (source.QueueName != null) {
            this.QueueName = new String(source.QueueName);
        }
        if (source.ProductID != null) {
            this.ProductID = new String(source.ProductID);
        }
        if (source.Result != null) {
            this.Result = new Long(source.Result);
        }
        if (source.ErrMsg != null) {
            this.ErrMsg = new String(source.ErrMsg);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Endpoint", this.Endpoint);
        this.setParamSimple(map, prefix + "QueueName", this.QueueName);
        this.setParamSimple(map, prefix + "ProductID", this.ProductID);
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "ErrMsg", this.ErrMsg);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

