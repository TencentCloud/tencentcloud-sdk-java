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
package com.tencentcloudapi.dcdb.v20180411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IsolateHourDCDBInstanceResponse extends AbstractModel{

    /**
    * 隔离成功的实例id列表
    */
    @SerializedName("SuccessInstanceIds")
    @Expose
    private String [] SuccessInstanceIds;

    /**
    * 隔离失败的实例id列表
    */
    @SerializedName("FailedInstanceIds")
    @Expose
    private String [] FailedInstanceIds;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 隔离成功的实例id列表 
     * @return SuccessInstanceIds 隔离成功的实例id列表
     */
    public String [] getSuccessInstanceIds() {
        return this.SuccessInstanceIds;
    }

    /**
     * Set 隔离成功的实例id列表
     * @param SuccessInstanceIds 隔离成功的实例id列表
     */
    public void setSuccessInstanceIds(String [] SuccessInstanceIds) {
        this.SuccessInstanceIds = SuccessInstanceIds;
    }

    /**
     * Get 隔离失败的实例id列表 
     * @return FailedInstanceIds 隔离失败的实例id列表
     */
    public String [] getFailedInstanceIds() {
        return this.FailedInstanceIds;
    }

    /**
     * Set 隔离失败的实例id列表
     * @param FailedInstanceIds 隔离失败的实例id列表
     */
    public void setFailedInstanceIds(String [] FailedInstanceIds) {
        this.FailedInstanceIds = FailedInstanceIds;
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

    public IsolateHourDCDBInstanceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IsolateHourDCDBInstanceResponse(IsolateHourDCDBInstanceResponse source) {
        if (source.SuccessInstanceIds != null) {
            this.SuccessInstanceIds = new String[source.SuccessInstanceIds.length];
            for (int i = 0; i < source.SuccessInstanceIds.length; i++) {
                this.SuccessInstanceIds[i] = new String(source.SuccessInstanceIds[i]);
            }
        }
        if (source.FailedInstanceIds != null) {
            this.FailedInstanceIds = new String[source.FailedInstanceIds.length];
            for (int i = 0; i < source.FailedInstanceIds.length; i++) {
                this.FailedInstanceIds[i] = new String(source.FailedInstanceIds[i]);
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
        this.setParamArraySimple(map, prefix + "SuccessInstanceIds.", this.SuccessInstanceIds);
        this.setParamArraySimple(map, prefix + "FailedInstanceIds.", this.FailedInstanceIds);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

