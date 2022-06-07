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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTrainingFrameworksResponse extends AbstractModel{

    /**
    * 框架信息列表
    */
    @SerializedName("FrameworkInfos")
    @Expose
    private FrameworkInfo [] FrameworkInfos;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 框架信息列表 
     * @return FrameworkInfos 框架信息列表
     */
    public FrameworkInfo [] getFrameworkInfos() {
        return this.FrameworkInfos;
    }

    /**
     * Set 框架信息列表
     * @param FrameworkInfos 框架信息列表
     */
    public void setFrameworkInfos(FrameworkInfo [] FrameworkInfos) {
        this.FrameworkInfos = FrameworkInfos;
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

    public DescribeTrainingFrameworksResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTrainingFrameworksResponse(DescribeTrainingFrameworksResponse source) {
        if (source.FrameworkInfos != null) {
            this.FrameworkInfos = new FrameworkInfo[source.FrameworkInfos.length];
            for (int i = 0; i < source.FrameworkInfos.length; i++) {
                this.FrameworkInfos[i] = new FrameworkInfo(source.FrameworkInfos[i]);
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
        this.setParamArrayObj(map, prefix + "FrameworkInfos.", this.FrameworkInfos);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

