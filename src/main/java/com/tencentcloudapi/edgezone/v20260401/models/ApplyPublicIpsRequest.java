/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.edgezone.v20260401.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApplyPublicIpsRequest extends AbstractModel {

    /**
    * 公网实例 ID（路由发布模式必须为 STATIC ）
    */
    @SerializedName("NetworkInstanceId")
    @Expose
    private String NetworkInstanceId;

    /**
    * 申请Ip数量，最小为 1
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 申请的Ip类型，枚举值：ipv4、ipv6
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get 公网实例 ID（路由发布模式必须为 STATIC ） 
     * @return NetworkInstanceId 公网实例 ID（路由发布模式必须为 STATIC ）
     */
    public String getNetworkInstanceId() {
        return this.NetworkInstanceId;
    }

    /**
     * Set 公网实例 ID（路由发布模式必须为 STATIC ）
     * @param NetworkInstanceId 公网实例 ID（路由发布模式必须为 STATIC ）
     */
    public void setNetworkInstanceId(String NetworkInstanceId) {
        this.NetworkInstanceId = NetworkInstanceId;
    }

    /**
     * Get 申请Ip数量，最小为 1 
     * @return Count 申请Ip数量，最小为 1
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 申请Ip数量，最小为 1
     * @param Count 申请Ip数量，最小为 1
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 申请的Ip类型，枚举值：ipv4、ipv6 
     * @return Type 申请的Ip类型，枚举值：ipv4、ipv6
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 申请的Ip类型，枚举值：ipv4、ipv6
     * @param Type 申请的Ip类型，枚举值：ipv4、ipv6
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public ApplyPublicIpsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplyPublicIpsRequest(ApplyPublicIpsRequest source) {
        if (source.NetworkInstanceId != null) {
            this.NetworkInstanceId = new String(source.NetworkInstanceId);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NetworkInstanceId", this.NetworkInstanceId);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

