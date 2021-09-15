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
package com.tencentcloudapi.essbasic.v20201222.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCustomFlowIdsResponse extends AbstractModel{

    /**
    * 自定义流程 id 映射列表
    */
    @SerializedName("CustomIdList")
    @Expose
    private CustomFlowIdMap [] CustomIdList;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 自定义流程 id 映射列表 
     * @return CustomIdList 自定义流程 id 映射列表
     */
    public CustomFlowIdMap [] getCustomIdList() {
        return this.CustomIdList;
    }

    /**
     * Set 自定义流程 id 映射列表
     * @param CustomIdList 自定义流程 id 映射列表
     */
    public void setCustomIdList(CustomFlowIdMap [] CustomIdList) {
        this.CustomIdList = CustomIdList;
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

    public DescribeCustomFlowIdsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCustomFlowIdsResponse(DescribeCustomFlowIdsResponse source) {
        if (source.CustomIdList != null) {
            this.CustomIdList = new CustomFlowIdMap[source.CustomIdList.length];
            for (int i = 0; i < source.CustomIdList.length; i++) {
                this.CustomIdList[i] = new CustomFlowIdMap(source.CustomIdList[i]);
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
        this.setParamArrayObj(map, prefix + "CustomIdList.", this.CustomIdList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

