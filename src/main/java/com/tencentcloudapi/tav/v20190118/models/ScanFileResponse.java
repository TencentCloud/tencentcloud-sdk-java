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
package com.tencentcloudapi.tav.v20190118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScanFileResponse extends AbstractModel {

    /**
    * 接口调用状态，成功返回200，失败返回400
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 接口调用描述信息，成功返回"success"，失败返回"invalid request"
    */
    @SerializedName("Info")
    @Expose
    private String Info;

    /**
    * 异步扫描任务提交成功返回success
    */
    @SerializedName("Data")
    @Expose
    private String Data;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 接口调用状态，成功返回200，失败返回400 
     * @return Status 接口调用状态，成功返回200，失败返回400
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 接口调用状态，成功返回200，失败返回400
     * @param Status 接口调用状态，成功返回200，失败返回400
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 接口调用描述信息，成功返回"success"，失败返回"invalid request" 
     * @return Info 接口调用描述信息，成功返回"success"，失败返回"invalid request"
     */
    public String getInfo() {
        return this.Info;
    }

    /**
     * Set 接口调用描述信息，成功返回"success"，失败返回"invalid request"
     * @param Info 接口调用描述信息，成功返回"success"，失败返回"invalid request"
     */
    public void setInfo(String Info) {
        this.Info = Info;
    }

    /**
     * Get 异步扫描任务提交成功返回success 
     * @return Data 异步扫描任务提交成功返回success
     */
    public String getData() {
        return this.Data;
    }

    /**
     * Set 异步扫描任务提交成功返回success
     * @param Data 异步扫描任务提交成功返回success
     */
    public void setData(String Data) {
        this.Data = Data;
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

    public ScanFileResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScanFileResponse(ScanFileResponse source) {
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Info != null) {
            this.Info = new String(source.Info);
        }
        if (source.Data != null) {
            this.Data = new String(source.Data);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Info", this.Info);
        this.setParamSimple(map, prefix + "Data", this.Data);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

