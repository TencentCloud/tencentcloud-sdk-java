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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckIntegrationTaskNameExistsResponse extends AbstractModel{

    /**
    * true表示存在，false表示不存在
    */
    @SerializedName("Data")
    @Expose
    private Boolean Data;

    /**
    * 任务名重复类型（0:未重复, 1:开发态重复, 2:生产态重复）
    */
    @SerializedName("ExistsType")
    @Expose
    private Long ExistsType;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get true表示存在，false表示不存在 
     * @return Data true表示存在，false表示不存在
     */
    public Boolean getData() {
        return this.Data;
    }

    /**
     * Set true表示存在，false表示不存在
     * @param Data true表示存在，false表示不存在
     */
    public void setData(Boolean Data) {
        this.Data = Data;
    }

    /**
     * Get 任务名重复类型（0:未重复, 1:开发态重复, 2:生产态重复） 
     * @return ExistsType 任务名重复类型（0:未重复, 1:开发态重复, 2:生产态重复）
     */
    public Long getExistsType() {
        return this.ExistsType;
    }

    /**
     * Set 任务名重复类型（0:未重复, 1:开发态重复, 2:生产态重复）
     * @param ExistsType 任务名重复类型（0:未重复, 1:开发态重复, 2:生产态重复）
     */
    public void setExistsType(Long ExistsType) {
        this.ExistsType = ExistsType;
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

    public CheckIntegrationTaskNameExistsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckIntegrationTaskNameExistsResponse(CheckIntegrationTaskNameExistsResponse source) {
        if (source.Data != null) {
            this.Data = new Boolean(source.Data);
        }
        if (source.ExistsType != null) {
            this.ExistsType = new Long(source.ExistsType);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Data", this.Data);
        this.setParamSimple(map, prefix + "ExistsType", this.ExistsType);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

