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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeOfflineLogConfigsResponse extends AbstractModel{

    /**
    * 接口调用信息
    */
    @SerializedName("Msg")
    @Expose
    private String Msg;

    /**
    * 用户唯一标示数组
    */
    @SerializedName("UniqueIDSet")
    @Expose
    private String [] UniqueIDSet;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 接口调用信息 
     * @return Msg 接口调用信息
     */
    public String getMsg() {
        return this.Msg;
    }

    /**
     * Set 接口调用信息
     * @param Msg 接口调用信息
     */
    public void setMsg(String Msg) {
        this.Msg = Msg;
    }

    /**
     * Get 用户唯一标示数组 
     * @return UniqueIDSet 用户唯一标示数组
     */
    public String [] getUniqueIDSet() {
        return this.UniqueIDSet;
    }

    /**
     * Set 用户唯一标示数组
     * @param UniqueIDSet 用户唯一标示数组
     */
    public void setUniqueIDSet(String [] UniqueIDSet) {
        this.UniqueIDSet = UniqueIDSet;
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

    public DescribeOfflineLogConfigsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOfflineLogConfigsResponse(DescribeOfflineLogConfigsResponse source) {
        if (source.Msg != null) {
            this.Msg = new String(source.Msg);
        }
        if (source.UniqueIDSet != null) {
            this.UniqueIDSet = new String[source.UniqueIDSet.length];
            for (int i = 0; i < source.UniqueIDSet.length; i++) {
                this.UniqueIDSet[i] = new String(source.UniqueIDSet[i]);
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
        this.setParamSimple(map, prefix + "Msg", this.Msg);
        this.setParamArraySimple(map, prefix + "UniqueIDSet.", this.UniqueIDSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

