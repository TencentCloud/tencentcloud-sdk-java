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

public class DescribeVpcCniPodLimitsRequest extends AbstractModel{

    /**
    * 查询的机型所在可用区，如：ap-guangzhou-3，默认为空，即不按可用区过滤信息
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 查询的实例机型系列信息，如：S5，默认为空，即不按机型系列过滤信息
    */
    @SerializedName("InstanceFamily")
    @Expose
    private String InstanceFamily;

    /**
    * 查询的实例机型信息，如：S5.LARGE8，默认为空，即不按机型过滤信息
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
     * Get 查询的机型所在可用区，如：ap-guangzhou-3，默认为空，即不按可用区过滤信息 
     * @return Zone 查询的机型所在可用区，如：ap-guangzhou-3，默认为空，即不按可用区过滤信息
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 查询的机型所在可用区，如：ap-guangzhou-3，默认为空，即不按可用区过滤信息
     * @param Zone 查询的机型所在可用区，如：ap-guangzhou-3，默认为空，即不按可用区过滤信息
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 查询的实例机型系列信息，如：S5，默认为空，即不按机型系列过滤信息 
     * @return InstanceFamily 查询的实例机型系列信息，如：S5，默认为空，即不按机型系列过滤信息
     */
    public String getInstanceFamily() {
        return this.InstanceFamily;
    }

    /**
     * Set 查询的实例机型系列信息，如：S5，默认为空，即不按机型系列过滤信息
     * @param InstanceFamily 查询的实例机型系列信息，如：S5，默认为空，即不按机型系列过滤信息
     */
    public void setInstanceFamily(String InstanceFamily) {
        this.InstanceFamily = InstanceFamily;
    }

    /**
     * Get 查询的实例机型信息，如：S5.LARGE8，默认为空，即不按机型过滤信息 
     * @return InstanceType 查询的实例机型信息，如：S5.LARGE8，默认为空，即不按机型过滤信息
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 查询的实例机型信息，如：S5.LARGE8，默认为空，即不按机型过滤信息
     * @param InstanceType 查询的实例机型信息，如：S5.LARGE8，默认为空，即不按机型过滤信息
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    public DescribeVpcCniPodLimitsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVpcCniPodLimitsRequest(DescribeVpcCniPodLimitsRequest source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.InstanceFamily != null) {
            this.InstanceFamily = new String(source.InstanceFamily);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "InstanceFamily", this.InstanceFamily);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);

    }
}

