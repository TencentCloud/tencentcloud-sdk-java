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
package com.tencentcloudapi.alb.v20251030.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NotifyUnbindTargetRequest extends AbstractModel {

    /**
    * 后端服务的IP列表。
> **VpcId**（**NumericVpcId**）、**Ips**必须同时设置。
    */
    @SerializedName("Ips")
    @Expose
    private String [] Ips;

    /**
    * 后端服务所属VPC的数字ID。
> **VpcId**（**NumericVpcId**）、**Ips**必须同时设置。
    */
    @SerializedName("NumericVpcId")
    @Expose
    private Long NumericVpcId;

    /**
     * Get 后端服务的IP列表。
> **VpcId**（**NumericVpcId**）、**Ips**必须同时设置。 
     * @return Ips 后端服务的IP列表。
> **VpcId**（**NumericVpcId**）、**Ips**必须同时设置。
     */
    public String [] getIps() {
        return this.Ips;
    }

    /**
     * Set 后端服务的IP列表。
> **VpcId**（**NumericVpcId**）、**Ips**必须同时设置。
     * @param Ips 后端服务的IP列表。
> **VpcId**（**NumericVpcId**）、**Ips**必须同时设置。
     */
    public void setIps(String [] Ips) {
        this.Ips = Ips;
    }

    /**
     * Get 后端服务所属VPC的数字ID。
> **VpcId**（**NumericVpcId**）、**Ips**必须同时设置。 
     * @return NumericVpcId 后端服务所属VPC的数字ID。
> **VpcId**（**NumericVpcId**）、**Ips**必须同时设置。
     */
    public Long getNumericVpcId() {
        return this.NumericVpcId;
    }

    /**
     * Set 后端服务所属VPC的数字ID。
> **VpcId**（**NumericVpcId**）、**Ips**必须同时设置。
     * @param NumericVpcId 后端服务所属VPC的数字ID。
> **VpcId**（**NumericVpcId**）、**Ips**必须同时设置。
     */
    public void setNumericVpcId(Long NumericVpcId) {
        this.NumericVpcId = NumericVpcId;
    }

    public NotifyUnbindTargetRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NotifyUnbindTargetRequest(NotifyUnbindTargetRequest source) {
        if (source.Ips != null) {
            this.Ips = new String[source.Ips.length];
            for (int i = 0; i < source.Ips.length; i++) {
                this.Ips[i] = new String(source.Ips[i]);
            }
        }
        if (source.NumericVpcId != null) {
            this.NumericVpcId = new Long(source.NumericVpcId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Ips.", this.Ips);
        this.setParamSimple(map, prefix + "NumericVpcId", this.NumericVpcId);

    }
}

