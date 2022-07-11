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
package com.tencentcloudapi.irp.v20220324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RecommendContentResponse extends AbstractModel{

    /**
    * 推荐追踪id，用于行为上报。每次接口调用返回的traceId不同
    */
    @SerializedName("RecTraceId")
    @Expose
    private String RecTraceId;

    /**
    * 标识具体的物料信息
    */
    @SerializedName("DataList")
    @Expose
    private RecItemData [] DataList;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 推荐追踪id，用于行为上报。每次接口调用返回的traceId不同 
     * @return RecTraceId 推荐追踪id，用于行为上报。每次接口调用返回的traceId不同
     */
    public String getRecTraceId() {
        return this.RecTraceId;
    }

    /**
     * Set 推荐追踪id，用于行为上报。每次接口调用返回的traceId不同
     * @param RecTraceId 推荐追踪id，用于行为上报。每次接口调用返回的traceId不同
     */
    public void setRecTraceId(String RecTraceId) {
        this.RecTraceId = RecTraceId;
    }

    /**
     * Get 标识具体的物料信息 
     * @return DataList 标识具体的物料信息
     */
    public RecItemData [] getDataList() {
        return this.DataList;
    }

    /**
     * Set 标识具体的物料信息
     * @param DataList 标识具体的物料信息
     */
    public void setDataList(RecItemData [] DataList) {
        this.DataList = DataList;
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

    public RecommendContentResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecommendContentResponse(RecommendContentResponse source) {
        if (source.RecTraceId != null) {
            this.RecTraceId = new String(source.RecTraceId);
        }
        if (source.DataList != null) {
            this.DataList = new RecItemData[source.DataList.length];
            for (int i = 0; i < source.DataList.length; i++) {
                this.DataList[i] = new RecItemData(source.DataList[i]);
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
        this.setParamSimple(map, prefix + "RecTraceId", this.RecTraceId);
        this.setParamArrayObj(map, prefix + "DataList.", this.DataList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

