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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRelayUsageResponse extends AbstractModel{

    /**
    * 用量类型，与UsageValue中各个位置的值对应。
    */
    @SerializedName("UsageKey")
    @Expose
    private String [] UsageKey;

    /**
    * 各个时间点用量明细。
    */
    @SerializedName("UsageList")
    @Expose
    private TrtcUsage [] UsageList;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 用量类型，与UsageValue中各个位置的值对应。 
     * @return UsageKey 用量类型，与UsageValue中各个位置的值对应。
     */
    public String [] getUsageKey() {
        return this.UsageKey;
    }

    /**
     * Set 用量类型，与UsageValue中各个位置的值对应。
     * @param UsageKey 用量类型，与UsageValue中各个位置的值对应。
     */
    public void setUsageKey(String [] UsageKey) {
        this.UsageKey = UsageKey;
    }

    /**
     * Get 各个时间点用量明细。 
     * @return UsageList 各个时间点用量明细。
     */
    public TrtcUsage [] getUsageList() {
        return this.UsageList;
    }

    /**
     * Set 各个时间点用量明细。
     * @param UsageList 各个时间点用量明细。
     */
    public void setUsageList(TrtcUsage [] UsageList) {
        this.UsageList = UsageList;
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

    public DescribeRelayUsageResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRelayUsageResponse(DescribeRelayUsageResponse source) {
        if (source.UsageKey != null) {
            this.UsageKey = new String[source.UsageKey.length];
            for (int i = 0; i < source.UsageKey.length; i++) {
                this.UsageKey[i] = new String(source.UsageKey[i]);
            }
        }
        if (source.UsageList != null) {
            this.UsageList = new TrtcUsage[source.UsageList.length];
            for (int i = 0; i < source.UsageList.length; i++) {
                this.UsageList[i] = new TrtcUsage(source.UsageList[i]);
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
        this.setParamArraySimple(map, prefix + "UsageKey.", this.UsageKey);
        this.setParamArrayObj(map, prefix + "UsageList.", this.UsageList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

