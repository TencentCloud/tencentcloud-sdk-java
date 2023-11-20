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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCollationTimeZoneRequest extends AbstractModel {

    /**
    * 购买实例的宿主机类型，PM-物理机, CLOUD_PREMIUM-虚拟机高性能云盘，
	CLOUD_SSD-虚拟机SSD云盘,CLOUD_HSSD-虚拟机加强型SSD云盘，CLOUD_TSSD-虚拟机极速型SSD云盘，CLOUD_BSSD-虚拟机通用型SSD云盘,CLOUD_BASIC-虚拟机云硬盘，默认取值PM
    */
    @SerializedName("MachineType")
    @Expose
    private String MachineType;

    /**
     * Get 购买实例的宿主机类型，PM-物理机, CLOUD_PREMIUM-虚拟机高性能云盘，
	CLOUD_SSD-虚拟机SSD云盘,CLOUD_HSSD-虚拟机加强型SSD云盘，CLOUD_TSSD-虚拟机极速型SSD云盘，CLOUD_BSSD-虚拟机通用型SSD云盘,CLOUD_BASIC-虚拟机云硬盘，默认取值PM 
     * @return MachineType 购买实例的宿主机类型，PM-物理机, CLOUD_PREMIUM-虚拟机高性能云盘，
	CLOUD_SSD-虚拟机SSD云盘,CLOUD_HSSD-虚拟机加强型SSD云盘，CLOUD_TSSD-虚拟机极速型SSD云盘，CLOUD_BSSD-虚拟机通用型SSD云盘,CLOUD_BASIC-虚拟机云硬盘，默认取值PM
     */
    public String getMachineType() {
        return this.MachineType;
    }

    /**
     * Set 购买实例的宿主机类型，PM-物理机, CLOUD_PREMIUM-虚拟机高性能云盘，
	CLOUD_SSD-虚拟机SSD云盘,CLOUD_HSSD-虚拟机加强型SSD云盘，CLOUD_TSSD-虚拟机极速型SSD云盘，CLOUD_BSSD-虚拟机通用型SSD云盘,CLOUD_BASIC-虚拟机云硬盘，默认取值PM
     * @param MachineType 购买实例的宿主机类型，PM-物理机, CLOUD_PREMIUM-虚拟机高性能云盘，
	CLOUD_SSD-虚拟机SSD云盘,CLOUD_HSSD-虚拟机加强型SSD云盘，CLOUD_TSSD-虚拟机极速型SSD云盘，CLOUD_BSSD-虚拟机通用型SSD云盘,CLOUD_BASIC-虚拟机云硬盘，默认取值PM
     */
    public void setMachineType(String MachineType) {
        this.MachineType = MachineType;
    }

    public DescribeCollationTimeZoneRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCollationTimeZoneRequest(DescribeCollationTimeZoneRequest source) {
        if (source.MachineType != null) {
            this.MachineType = new String(source.MachineType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MachineType", this.MachineType);

    }
}

