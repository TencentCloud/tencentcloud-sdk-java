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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDeviceMonitorInfoResponse extends AbstractModel{

    /**
    * 实例CPU监控数据
    */
    @SerializedName("Cpu")
    @Expose
    private DeviceCpuInfo Cpu;

    /**
    * 实例内存监控数据
    */
    @SerializedName("Mem")
    @Expose
    private DeviceMemInfo Mem;

    /**
    * 实例网络监控数据
    */
    @SerializedName("Net")
    @Expose
    private DeviceNetInfo Net;

    /**
    * 实例磁盘监控数据
    */
    @SerializedName("Disk")
    @Expose
    private DeviceDiskInfo Disk;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 实例CPU监控数据 
     * @return Cpu 实例CPU监控数据
     */
    public DeviceCpuInfo getCpu() {
        return this.Cpu;
    }

    /**
     * Set 实例CPU监控数据
     * @param Cpu 实例CPU监控数据
     */
    public void setCpu(DeviceCpuInfo Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 实例内存监控数据 
     * @return Mem 实例内存监控数据
     */
    public DeviceMemInfo getMem() {
        return this.Mem;
    }

    /**
     * Set 实例内存监控数据
     * @param Mem 实例内存监控数据
     */
    public void setMem(DeviceMemInfo Mem) {
        this.Mem = Mem;
    }

    /**
     * Get 实例网络监控数据 
     * @return Net 实例网络监控数据
     */
    public DeviceNetInfo getNet() {
        return this.Net;
    }

    /**
     * Set 实例网络监控数据
     * @param Net 实例网络监控数据
     */
    public void setNet(DeviceNetInfo Net) {
        this.Net = Net;
    }

    /**
     * Get 实例磁盘监控数据 
     * @return Disk 实例磁盘监控数据
     */
    public DeviceDiskInfo getDisk() {
        return this.Disk;
    }

    /**
     * Set 实例磁盘监控数据
     * @param Disk 实例磁盘监控数据
     */
    public void setDisk(DeviceDiskInfo Disk) {
        this.Disk = Disk;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Cpu.", this.Cpu);
        this.setParamObj(map, prefix + "Mem.", this.Mem);
        this.setParamObj(map, prefix + "Net.", this.Net);
        this.setParamObj(map, prefix + "Disk.", this.Disk);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

