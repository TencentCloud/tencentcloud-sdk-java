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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDefaultVpcRequest extends AbstractModel{

    /**
    * 子网所在的可用区，该参数可通过[DescribeZones](https://cloud.tencent.com/document/product/213/15707)接口获取，例如ap-guangzhou-1，不指定时将随机选择可用区。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 是否强制返回默认VPC。
    */
    @SerializedName("Force")
    @Expose
    private Boolean Force;

    /**
     * Get 子网所在的可用区，该参数可通过[DescribeZones](https://cloud.tencent.com/document/product/213/15707)接口获取，例如ap-guangzhou-1，不指定时将随机选择可用区。 
     * @return Zone 子网所在的可用区，该参数可通过[DescribeZones](https://cloud.tencent.com/document/product/213/15707)接口获取，例如ap-guangzhou-1，不指定时将随机选择可用区。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 子网所在的可用区，该参数可通过[DescribeZones](https://cloud.tencent.com/document/product/213/15707)接口获取，例如ap-guangzhou-1，不指定时将随机选择可用区。
     * @param Zone 子网所在的可用区，该参数可通过[DescribeZones](https://cloud.tencent.com/document/product/213/15707)接口获取，例如ap-guangzhou-1，不指定时将随机选择可用区。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 是否强制返回默认VPC。 
     * @return Force 是否强制返回默认VPC。
     */
    public Boolean getForce() {
        return this.Force;
    }

    /**
     * Set 是否强制返回默认VPC。
     * @param Force 是否强制返回默认VPC。
     */
    public void setForce(Boolean Force) {
        this.Force = Force;
    }

    public CreateDefaultVpcRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDefaultVpcRequest(CreateDefaultVpcRequest source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.Force != null) {
            this.Force = new Boolean(source.Force);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Force", this.Force);

    }
}

