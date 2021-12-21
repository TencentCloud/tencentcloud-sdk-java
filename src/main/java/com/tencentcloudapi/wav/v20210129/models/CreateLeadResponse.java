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
package com.tencentcloudapi.wav.v20210129.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateLeadResponse extends AbstractModel{

    /**
    * 线索处理状态码： 0-表示创建成功， 1-表示线索合并，2-表示线索重复
    */
    @SerializedName("BusinessCode")
    @Expose
    private Long BusinessCode;

    /**
    * 线索处理结果描述
    */
    @SerializedName("BusinessMsg")
    @Expose
    private String BusinessMsg;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 线索处理状态码： 0-表示创建成功， 1-表示线索合并，2-表示线索重复 
     * @return BusinessCode 线索处理状态码： 0-表示创建成功， 1-表示线索合并，2-表示线索重复
     */
    public Long getBusinessCode() {
        return this.BusinessCode;
    }

    /**
     * Set 线索处理状态码： 0-表示创建成功， 1-表示线索合并，2-表示线索重复
     * @param BusinessCode 线索处理状态码： 0-表示创建成功， 1-表示线索合并，2-表示线索重复
     */
    public void setBusinessCode(Long BusinessCode) {
        this.BusinessCode = BusinessCode;
    }

    /**
     * Get 线索处理结果描述 
     * @return BusinessMsg 线索处理结果描述
     */
    public String getBusinessMsg() {
        return this.BusinessMsg;
    }

    /**
     * Set 线索处理结果描述
     * @param BusinessMsg 线索处理结果描述
     */
    public void setBusinessMsg(String BusinessMsg) {
        this.BusinessMsg = BusinessMsg;
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

    public CreateLeadResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateLeadResponse(CreateLeadResponse source) {
        if (source.BusinessCode != null) {
            this.BusinessCode = new Long(source.BusinessCode);
        }
        if (source.BusinessMsg != null) {
            this.BusinessMsg = new String(source.BusinessMsg);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BusinessCode", this.BusinessCode);
        this.setParamSimple(map, prefix + "BusinessMsg", this.BusinessMsg);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

