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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDDoSBlackWhiteIpListResponse extends AbstractModel {

    /**
    * 黑名单IP列表
    */
    @SerializedName("BlackIpList")
    @Expose
    private IpSegment [] BlackIpList;

    /**
    * 白名单IP列表
    */
    @SerializedName("WhiteIpList")
    @Expose
    private IpSegment [] WhiteIpList;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 黑名单IP列表 
     * @return BlackIpList 黑名单IP列表
     */
    public IpSegment [] getBlackIpList() {
        return this.BlackIpList;
    }

    /**
     * Set 黑名单IP列表
     * @param BlackIpList 黑名单IP列表
     */
    public void setBlackIpList(IpSegment [] BlackIpList) {
        this.BlackIpList = BlackIpList;
    }

    /**
     * Get 白名单IP列表 
     * @return WhiteIpList 白名单IP列表
     */
    public IpSegment [] getWhiteIpList() {
        return this.WhiteIpList;
    }

    /**
     * Set 白名单IP列表
     * @param WhiteIpList 白名单IP列表
     */
    public void setWhiteIpList(IpSegment [] WhiteIpList) {
        this.WhiteIpList = WhiteIpList;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeDDoSBlackWhiteIpListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDDoSBlackWhiteIpListResponse(DescribeDDoSBlackWhiteIpListResponse source) {
        if (source.BlackIpList != null) {
            this.BlackIpList = new IpSegment[source.BlackIpList.length];
            for (int i = 0; i < source.BlackIpList.length; i++) {
                this.BlackIpList[i] = new IpSegment(source.BlackIpList[i]);
            }
        }
        if (source.WhiteIpList != null) {
            this.WhiteIpList = new IpSegment[source.WhiteIpList.length];
            for (int i = 0; i < source.WhiteIpList.length; i++) {
                this.WhiteIpList[i] = new IpSegment(source.WhiteIpList[i]);
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
        this.setParamArrayObj(map, prefix + "BlackIpList.", this.BlackIpList);
        this.setParamArrayObj(map, prefix + "WhiteIpList.", this.WhiteIpList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

