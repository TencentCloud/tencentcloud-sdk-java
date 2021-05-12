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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeResetInstanceBlueprintsResponse extends AbstractModel{

    /**
    * 符合条件的镜像数量。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 镜像重置信息列表
    */
    @SerializedName("ResetInstanceBlueprintSet")
    @Expose
    private ResetInstanceBlueprint [] ResetInstanceBlueprintSet;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 符合条件的镜像数量。 
     * @return TotalCount 符合条件的镜像数量。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 符合条件的镜像数量。
     * @param TotalCount 符合条件的镜像数量。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 镜像重置信息列表 
     * @return ResetInstanceBlueprintSet 镜像重置信息列表
     */
    public ResetInstanceBlueprint [] getResetInstanceBlueprintSet() {
        return this.ResetInstanceBlueprintSet;
    }

    /**
     * Set 镜像重置信息列表
     * @param ResetInstanceBlueprintSet 镜像重置信息列表
     */
    public void setResetInstanceBlueprintSet(ResetInstanceBlueprint [] ResetInstanceBlueprintSet) {
        this.ResetInstanceBlueprintSet = ResetInstanceBlueprintSet;
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

    public DescribeResetInstanceBlueprintsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeResetInstanceBlueprintsResponse(DescribeResetInstanceBlueprintsResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.ResetInstanceBlueprintSet != null) {
            this.ResetInstanceBlueprintSet = new ResetInstanceBlueprint[source.ResetInstanceBlueprintSet.length];
            for (int i = 0; i < source.ResetInstanceBlueprintSet.length; i++) {
                this.ResetInstanceBlueprintSet[i] = new ResetInstanceBlueprint(source.ResetInstanceBlueprintSet[i]);
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
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "ResetInstanceBlueprintSet.", this.ResetInstanceBlueprintSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

