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
package com.tencentcloudapi.tbaas.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetChaincodeInitializeResultForUserResponse extends AbstractModel{

    /**
    * 实例化结果：0，实例化中；1，实例化成功；2，实例化失败
    */
    @SerializedName("InitResult")
    @Expose
    private Long InitResult;

    /**
    * 实例化信息
    */
    @SerializedName("InitMessage")
    @Expose
    private String InitMessage;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 实例化结果：0，实例化中；1，实例化成功；2，实例化失败 
     * @return InitResult 实例化结果：0，实例化中；1，实例化成功；2，实例化失败
     */
    public Long getInitResult() {
        return this.InitResult;
    }

    /**
     * Set 实例化结果：0，实例化中；1，实例化成功；2，实例化失败
     * @param InitResult 实例化结果：0，实例化中；1，实例化成功；2，实例化失败
     */
    public void setInitResult(Long InitResult) {
        this.InitResult = InitResult;
    }

    /**
     * Get 实例化信息 
     * @return InitMessage 实例化信息
     */
    public String getInitMessage() {
        return this.InitMessage;
    }

    /**
     * Set 实例化信息
     * @param InitMessage 实例化信息
     */
    public void setInitMessage(String InitMessage) {
        this.InitMessage = InitMessage;
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

    public GetChaincodeInitializeResultForUserResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetChaincodeInitializeResultForUserResponse(GetChaincodeInitializeResultForUserResponse source) {
        if (source.InitResult != null) {
            this.InitResult = new Long(source.InitResult);
        }
        if (source.InitMessage != null) {
            this.InitMessage = new String(source.InitMessage);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InitResult", this.InitResult);
        this.setParamSimple(map, prefix + "InitMessage", this.InitMessage);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

