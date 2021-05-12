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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInternalEndpointDnsStatusRequest extends AbstractModel{

    /**
    * vpc列表
    */
    @SerializedName("VpcSet")
    @Expose
    private VpcAndDomainInfo [] VpcSet;

    /**
     * Get vpc列表 
     * @return VpcSet vpc列表
     */
    public VpcAndDomainInfo [] getVpcSet() {
        return this.VpcSet;
    }

    /**
     * Set vpc列表
     * @param VpcSet vpc列表
     */
    public void setVpcSet(VpcAndDomainInfo [] VpcSet) {
        this.VpcSet = VpcSet;
    }

    public DescribeInternalEndpointDnsStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInternalEndpointDnsStatusRequest(DescribeInternalEndpointDnsStatusRequest source) {
        if (source.VpcSet != null) {
            this.VpcSet = new VpcAndDomainInfo[source.VpcSet.length];
            for (int i = 0; i < source.VpcSet.length; i++) {
                this.VpcSet[i] = new VpcAndDomainInfo(source.VpcSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "VpcSet.", this.VpcSet);

    }
}

