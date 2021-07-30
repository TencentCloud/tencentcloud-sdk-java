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

public class CheckForwardAuthResponse extends AbstractModel{

    /**
    * 腾讯云账号
    */
    @SerializedName("Endpoint")
    @Expose
    private String Endpoint;

    /**
    * 结果
    */
    @SerializedName("Result")
    @Expose
    private Long Result;

    /**
    * 产品ID
    */
    @SerializedName("Productid")
    @Expose
    private String Productid;

    /**
    * 错误消息
    */
    @SerializedName("ErrMsg")
    @Expose
    private String ErrMsg;

    /**
    * 队列类型 0.CMQ  1.Ckafka
    */
    @SerializedName("QueueType")
    @Expose
    private Long QueueType;

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
     * Get 结果 
     * @return Result 结果
     */
    public Long getResult() {
        return this.Result;
    }

    /**
     * Set 结果
     * @param Result 结果
     */
    public void setResult(Long Result) {
        this.Result = Result;
    }

    /**
     * Get 产品ID 
     * @return Productid 产品ID
     */
    public String getProductid() {
        return this.Productid;
    }

    /**
     * Set 产品ID
     * @param Productid 产品ID
     */
    public void setProductid(String Productid) {
        this.Productid = Productid;
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
     * Get 队列类型 0.CMQ  1.Ckafka 
     * @return QueueType 队列类型 0.CMQ  1.Ckafka
     */
    public Long getQueueType() {
        return this.QueueType;
    }

    /**
     * Set 队列类型 0.CMQ  1.Ckafka
     * @param QueueType 队列类型 0.CMQ  1.Ckafka
     */
    public void setQueueType(Long QueueType) {
        this.QueueType = QueueType;
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

    public CheckForwardAuthResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckForwardAuthResponse(CheckForwardAuthResponse source) {
        if (source.Endpoint != null) {
            this.Endpoint = new String(source.Endpoint);
        }
        if (source.Result != null) {
            this.Result = new Long(source.Result);
        }
        if (source.Productid != null) {
            this.Productid = new String(source.Productid);
        }
        if (source.ErrMsg != null) {
            this.ErrMsg = new String(source.ErrMsg);
        }
        if (source.QueueType != null) {
            this.QueueType = new Long(source.QueueType);
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
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "Productid", this.Productid);
        this.setParamSimple(map, prefix + "ErrMsg", this.ErrMsg);
        this.setParamSimple(map, prefix + "QueueType", this.QueueType);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

