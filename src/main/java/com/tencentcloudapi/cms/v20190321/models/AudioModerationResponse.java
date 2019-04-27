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
package com.tencentcloudapi.cms.v20190321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AudioModerationResponse  extends AbstractModel{

    /**
    * 业务返回码 
60001：成功请求回调任务
    */
    @SerializedName("BusinessCode")
    @Expose
    private Long BusinessCode;

    /**
    * 识别返回结果
    */
    @SerializedName("Data")
    @Expose
    private String [] Data;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取业务返回码 
60001：成功请求回调任务
     * @return BusinessCode 业务返回码 
60001：成功请求回调任务
     */
    public Long getBusinessCode() {
        return this.BusinessCode;
    }

    /**
     * 设置业务返回码 
60001：成功请求回调任务
     * @param BusinessCode 业务返回码 
60001：成功请求回调任务
     */
    public void setBusinessCode(Long BusinessCode) {
        this.BusinessCode = BusinessCode;
    }

    /**
     * 获取识别返回结果
     * @return Data 识别返回结果
     */
    public String [] getData() {
        return this.Data;
    }

    /**
     * 设置识别返回结果
     * @param Data 识别返回结果
     */
    public void setData(String [] Data) {
        this.Data = Data;
    }

    /**
     * 获取唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BusinessCode", this.BusinessCode);
        this.setParamArraySimple(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

