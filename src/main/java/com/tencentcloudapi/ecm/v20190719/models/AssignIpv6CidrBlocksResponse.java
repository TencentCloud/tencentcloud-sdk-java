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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssignIpv6CidrBlocksResponse extends AbstractModel{

    /**
    * IPv6网段和所属运营商。	
    */
    @SerializedName("IPv6CidrBlockSet")
    @Expose
    private ISPIPv6CidrBlock [] IPv6CidrBlockSet;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get IPv6网段和所属运营商。	 
     * @return IPv6CidrBlockSet IPv6网段和所属运营商。	
     */
    public ISPIPv6CidrBlock [] getIPv6CidrBlockSet() {
        return this.IPv6CidrBlockSet;
    }

    /**
     * Set IPv6网段和所属运营商。	
     * @param IPv6CidrBlockSet IPv6网段和所属运营商。	
     */
    public void setIPv6CidrBlockSet(ISPIPv6CidrBlock [] IPv6CidrBlockSet) {
        this.IPv6CidrBlockSet = IPv6CidrBlockSet;
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

    public AssignIpv6CidrBlocksResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssignIpv6CidrBlocksResponse(AssignIpv6CidrBlocksResponse source) {
        if (source.IPv6CidrBlockSet != null) {
            this.IPv6CidrBlockSet = new ISPIPv6CidrBlock[source.IPv6CidrBlockSet.length];
            for (int i = 0; i < source.IPv6CidrBlockSet.length; i++) {
                this.IPv6CidrBlockSet[i] = new ISPIPv6CidrBlock(source.IPv6CidrBlockSet[i]);
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
        this.setParamArrayObj(map, prefix + "IPv6CidrBlockSet.", this.IPv6CidrBlockSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

