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
package com.tencentcloudapi.yunjing.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProVersionMachine extends AbstractModel{

    /**
    * 主机类型。
<li>CVM: 虚拟主机</li>
<li>BM: 黑石物理机</li>
    */
    @SerializedName("MachineType")
    @Expose
    private String MachineType;

    /**
    * 主机所在地域。
如：ap-guangzhou、ap-beijing
    */
    @SerializedName("MachineRegion")
    @Expose
    private String MachineRegion;

    /**
    * 主机唯一标识Uuid。
黑石的InstanceId，CVM的Uuid
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
     * Get 主机类型。
<li>CVM: 虚拟主机</li>
<li>BM: 黑石物理机</li> 
     * @return MachineType 主机类型。
<li>CVM: 虚拟主机</li>
<li>BM: 黑石物理机</li>
     */
    public String getMachineType() {
        return this.MachineType;
    }

    /**
     * Set 主机类型。
<li>CVM: 虚拟主机</li>
<li>BM: 黑石物理机</li>
     * @param MachineType 主机类型。
<li>CVM: 虚拟主机</li>
<li>BM: 黑石物理机</li>
     */
    public void setMachineType(String MachineType) {
        this.MachineType = MachineType;
    }

    /**
     * Get 主机所在地域。
如：ap-guangzhou、ap-beijing 
     * @return MachineRegion 主机所在地域。
如：ap-guangzhou、ap-beijing
     */
    public String getMachineRegion() {
        return this.MachineRegion;
    }

    /**
     * Set 主机所在地域。
如：ap-guangzhou、ap-beijing
     * @param MachineRegion 主机所在地域。
如：ap-guangzhou、ap-beijing
     */
    public void setMachineRegion(String MachineRegion) {
        this.MachineRegion = MachineRegion;
    }

    /**
     * Get 主机唯一标识Uuid。
黑石的InstanceId，CVM的Uuid 
     * @return Quuid 主机唯一标识Uuid。
黑石的InstanceId，CVM的Uuid
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set 主机唯一标识Uuid。
黑石的InstanceId，CVM的Uuid
     * @param Quuid 主机唯一标识Uuid。
黑石的InstanceId，CVM的Uuid
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MachineType", this.MachineType);
        this.setParamSimple(map, prefix + "MachineRegion", this.MachineRegion);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);

    }
}

