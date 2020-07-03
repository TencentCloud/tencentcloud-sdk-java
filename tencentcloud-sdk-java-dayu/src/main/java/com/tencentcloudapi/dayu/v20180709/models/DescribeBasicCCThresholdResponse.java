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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBasicCCThresholdResponse extends AbstractModel{

    /**
    * CC启动开关（0:关闭；1:开启）
    */
    @SerializedName("CCEnable")
    @Expose
    private Long CCEnable;

    /**
    * CC防护阈值
    */
    @SerializedName("CCThreshold")
    @Expose
    private Long CCThreshold;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get CC启动开关（0:关闭；1:开启） 
     * @return CCEnable CC启动开关（0:关闭；1:开启）
     */
    public Long getCCEnable() {
        return this.CCEnable;
    }

    /**
     * Set CC启动开关（0:关闭；1:开启）
     * @param CCEnable CC启动开关（0:关闭；1:开启）
     */
    public void setCCEnable(Long CCEnable) {
        this.CCEnable = CCEnable;
    }

    /**
     * Get CC防护阈值 
     * @return CCThreshold CC防护阈值
     */
    public Long getCCThreshold() {
        return this.CCThreshold;
    }

    /**
     * Set CC防护阈值
     * @param CCThreshold CC防护阈值
     */
    public void setCCThreshold(Long CCThreshold) {
        this.CCThreshold = CCThreshold;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CCEnable", this.CCEnable);
        this.setParamSimple(map, prefix + "CCThreshold", this.CCThreshold);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

