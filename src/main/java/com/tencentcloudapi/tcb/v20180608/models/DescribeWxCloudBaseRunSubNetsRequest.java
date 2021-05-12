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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeWxCloudBaseRunSubNetsRequest extends AbstractModel{

    /**
    * VPC id
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 查询个数限制，不填或小于等于0，等于不限制
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get VPC id 
     * @return VpcId VPC id
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC id
     * @param VpcId VPC id
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 查询个数限制，不填或小于等于0，等于不限制 
     * @return Limit 查询个数限制，不填或小于等于0，等于不限制
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 查询个数限制，不填或小于等于0，等于不限制
     * @param Limit 查询个数限制，不填或小于等于0，等于不限制
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeWxCloudBaseRunSubNetsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeWxCloudBaseRunSubNetsRequest(DescribeWxCloudBaseRunSubNetsRequest source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

