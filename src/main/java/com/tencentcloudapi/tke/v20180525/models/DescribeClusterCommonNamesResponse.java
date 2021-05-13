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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeClusterCommonNamesResponse extends AbstractModel{

    /**
    * 子账户Uin与其客户端证书的CN字段映射
    */
    @SerializedName("CommonNames")
    @Expose
    private CommonName [] CommonNames;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 子账户Uin与其客户端证书的CN字段映射 
     * @return CommonNames 子账户Uin与其客户端证书的CN字段映射
     */
    public CommonName [] getCommonNames() {
        return this.CommonNames;
    }

    /**
     * Set 子账户Uin与其客户端证书的CN字段映射
     * @param CommonNames 子账户Uin与其客户端证书的CN字段映射
     */
    public void setCommonNames(CommonName [] CommonNames) {
        this.CommonNames = CommonNames;
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

    public DescribeClusterCommonNamesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClusterCommonNamesResponse(DescribeClusterCommonNamesResponse source) {
        if (source.CommonNames != null) {
            this.CommonNames = new CommonName[source.CommonNames.length];
            for (int i = 0; i < source.CommonNames.length; i++) {
                this.CommonNames[i] = new CommonName(source.CommonNames[i]);
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
        this.setParamArrayObj(map, prefix + "CommonNames.", this.CommonNames);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

