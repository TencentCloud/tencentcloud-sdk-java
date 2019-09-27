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
package com.tencentcloudapi.bm.v20180423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDeviceClassPartitionRequest  extends AbstractModel{

    /**
    * 设备类型代号。代号通过接口[查询设备型号(DescribeDeviceClass)](https://cloud.tencent.com/document/api/386/32911)查询。标准机型需要传入此参数。虽是可选参数，但DeviceClassCode和InstanceId参数，必须要填写一个。
    */
    @SerializedName("DeviceClassCode")
    @Expose
    private String DeviceClassCode;

    /**
    * 需要查询自定义机型RAID信息时，传入自定义机型实例ID。InstanceId存在时DeviceClassCode失效。 虽是可选参数，但DeviceClassCode和InstanceId参数，必须要填写一个。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * 获取设备类型代号。代号通过接口[查询设备型号(DescribeDeviceClass)](https://cloud.tencent.com/document/api/386/32911)查询。标准机型需要传入此参数。虽是可选参数，但DeviceClassCode和InstanceId参数，必须要填写一个。
     * @return DeviceClassCode 设备类型代号。代号通过接口[查询设备型号(DescribeDeviceClass)](https://cloud.tencent.com/document/api/386/32911)查询。标准机型需要传入此参数。虽是可选参数，但DeviceClassCode和InstanceId参数，必须要填写一个。
     */
    public String getDeviceClassCode() {
        return this.DeviceClassCode;
    }

    /**
     * 设置设备类型代号。代号通过接口[查询设备型号(DescribeDeviceClass)](https://cloud.tencent.com/document/api/386/32911)查询。标准机型需要传入此参数。虽是可选参数，但DeviceClassCode和InstanceId参数，必须要填写一个。
     * @param DeviceClassCode 设备类型代号。代号通过接口[查询设备型号(DescribeDeviceClass)](https://cloud.tencent.com/document/api/386/32911)查询。标准机型需要传入此参数。虽是可选参数，但DeviceClassCode和InstanceId参数，必须要填写一个。
     */
    public void setDeviceClassCode(String DeviceClassCode) {
        this.DeviceClassCode = DeviceClassCode;
    }

    /**
     * 获取需要查询自定义机型RAID信息时，传入自定义机型实例ID。InstanceId存在时DeviceClassCode失效。 虽是可选参数，但DeviceClassCode和InstanceId参数，必须要填写一个。
     * @return InstanceId 需要查询自定义机型RAID信息时，传入自定义机型实例ID。InstanceId存在时DeviceClassCode失效。 虽是可选参数，但DeviceClassCode和InstanceId参数，必须要填写一个。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置需要查询自定义机型RAID信息时，传入自定义机型实例ID。InstanceId存在时DeviceClassCode失效。 虽是可选参数，但DeviceClassCode和InstanceId参数，必须要填写一个。
     * @param InstanceId 需要查询自定义机型RAID信息时，传入自定义机型实例ID。InstanceId存在时DeviceClassCode失效。 虽是可选参数，但DeviceClassCode和InstanceId参数，必须要填写一个。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceClassCode", this.DeviceClassCode);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

