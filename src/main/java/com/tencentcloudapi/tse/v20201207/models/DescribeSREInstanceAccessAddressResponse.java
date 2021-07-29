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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSREInstanceAccessAddressResponse extends AbstractModel{

    /**
    * 内网访问地址
    */
    @SerializedName("IntranetAddress")
    @Expose
    private String IntranetAddress;

    /**
    * 公网访问地址
    */
    @SerializedName("InternetAddress")
    @Expose
    private String InternetAddress;

    /**
    * apollo多环境公网ip
    */
    @SerializedName("EnvAddressInfos")
    @Expose
    private EnvAddressInfo [] EnvAddressInfos;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 内网访问地址 
     * @return IntranetAddress 内网访问地址
     */
    public String getIntranetAddress() {
        return this.IntranetAddress;
    }

    /**
     * Set 内网访问地址
     * @param IntranetAddress 内网访问地址
     */
    public void setIntranetAddress(String IntranetAddress) {
        this.IntranetAddress = IntranetAddress;
    }

    /**
     * Get 公网访问地址 
     * @return InternetAddress 公网访问地址
     */
    public String getInternetAddress() {
        return this.InternetAddress;
    }

    /**
     * Set 公网访问地址
     * @param InternetAddress 公网访问地址
     */
    public void setInternetAddress(String InternetAddress) {
        this.InternetAddress = InternetAddress;
    }

    /**
     * Get apollo多环境公网ip 
     * @return EnvAddressInfos apollo多环境公网ip
     */
    public EnvAddressInfo [] getEnvAddressInfos() {
        return this.EnvAddressInfos;
    }

    /**
     * Set apollo多环境公网ip
     * @param EnvAddressInfos apollo多环境公网ip
     */
    public void setEnvAddressInfos(EnvAddressInfo [] EnvAddressInfos) {
        this.EnvAddressInfos = EnvAddressInfos;
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

    public DescribeSREInstanceAccessAddressResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSREInstanceAccessAddressResponse(DescribeSREInstanceAccessAddressResponse source) {
        if (source.IntranetAddress != null) {
            this.IntranetAddress = new String(source.IntranetAddress);
        }
        if (source.InternetAddress != null) {
            this.InternetAddress = new String(source.InternetAddress);
        }
        if (source.EnvAddressInfos != null) {
            this.EnvAddressInfos = new EnvAddressInfo[source.EnvAddressInfos.length];
            for (int i = 0; i < source.EnvAddressInfos.length; i++) {
                this.EnvAddressInfos[i] = new EnvAddressInfo(source.EnvAddressInfos[i]);
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
        this.setParamSimple(map, prefix + "IntranetAddress", this.IntranetAddress);
        this.setParamSimple(map, prefix + "InternetAddress", this.InternetAddress);
        this.setParamArrayObj(map, prefix + "EnvAddressInfos.", this.EnvAddressInfos);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

