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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeReadOnlyGroupAutoWeightResponse extends AbstractModel {

    /**
    * 只读组ID，格式如：mssqlro-3l3fgqn7
    */
    @SerializedName("ReadOnlyGroupId")
    @Expose
    private String ReadOnlyGroupId;

    /**
    * 只读组名称
    */
    @SerializedName("ReadOnlyGroupName")
    @Expose
    private String ReadOnlyGroupName;

    /**
    * 只读组的地域ID，与主实例相同
    */
    @SerializedName("RegionId")
    @Expose
    private String RegionId;

    /**
    * 只读组的可用区，与主实例相同
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 是否启动超时剔除功能，1-开启，0-不开启
    */
    @SerializedName("IsOfflineDelay")
    @Expose
    private Long IsOfflineDelay;

    /**
    * 启动超时剔除功能后，使用的超时阈值(秒)
    */
    @SerializedName("ReadOnlyMaxDelayTime")
    @Expose
    private Long ReadOnlyMaxDelayTime;

    /**
    * 启动超时剔除功能后，至少只读组保留的只读副本数
    */
    @SerializedName("MinReadOnlyInGroup")
    @Expose
    private Long MinReadOnlyInGroup;

    /**
    * 只读组vip
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * 只读组vport
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * 只读组在私有网络ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 只读组在私有网络子网ID
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 只读实例副本集合
    */
    @SerializedName("ReadOnlyInstanceSet")
    @Expose
    private ReadOnlyInstance [] ReadOnlyInstanceSet;

    /**
    * 只读组状态: 1-申请成功运行中，5-申请中
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 主实例ID，形如mssql-sgeshe3th
    */
    @SerializedName("MasterInstanceId")
    @Expose
    private String MasterInstanceId;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 只读组ID，格式如：mssqlro-3l3fgqn7 
     * @return ReadOnlyGroupId 只读组ID，格式如：mssqlro-3l3fgqn7
     */
    public String getReadOnlyGroupId() {
        return this.ReadOnlyGroupId;
    }

    /**
     * Set 只读组ID，格式如：mssqlro-3l3fgqn7
     * @param ReadOnlyGroupId 只读组ID，格式如：mssqlro-3l3fgqn7
     */
    public void setReadOnlyGroupId(String ReadOnlyGroupId) {
        this.ReadOnlyGroupId = ReadOnlyGroupId;
    }

    /**
     * Get 只读组名称 
     * @return ReadOnlyGroupName 只读组名称
     */
    public String getReadOnlyGroupName() {
        return this.ReadOnlyGroupName;
    }

    /**
     * Set 只读组名称
     * @param ReadOnlyGroupName 只读组名称
     */
    public void setReadOnlyGroupName(String ReadOnlyGroupName) {
        this.ReadOnlyGroupName = ReadOnlyGroupName;
    }

    /**
     * Get 只读组的地域ID，与主实例相同 
     * @return RegionId 只读组的地域ID，与主实例相同
     */
    public String getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 只读组的地域ID，与主实例相同
     * @param RegionId 只读组的地域ID，与主实例相同
     */
    public void setRegionId(String RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get 只读组的可用区，与主实例相同 
     * @return ZoneId 只读组的可用区，与主实例相同
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 只读组的可用区，与主实例相同
     * @param ZoneId 只读组的可用区，与主实例相同
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 是否启动超时剔除功能，1-开启，0-不开启 
     * @return IsOfflineDelay 是否启动超时剔除功能，1-开启，0-不开启
     */
    public Long getIsOfflineDelay() {
        return this.IsOfflineDelay;
    }

    /**
     * Set 是否启动超时剔除功能，1-开启，0-不开启
     * @param IsOfflineDelay 是否启动超时剔除功能，1-开启，0-不开启
     */
    public void setIsOfflineDelay(Long IsOfflineDelay) {
        this.IsOfflineDelay = IsOfflineDelay;
    }

    /**
     * Get 启动超时剔除功能后，使用的超时阈值(秒) 
     * @return ReadOnlyMaxDelayTime 启动超时剔除功能后，使用的超时阈值(秒)
     */
    public Long getReadOnlyMaxDelayTime() {
        return this.ReadOnlyMaxDelayTime;
    }

    /**
     * Set 启动超时剔除功能后，使用的超时阈值(秒)
     * @param ReadOnlyMaxDelayTime 启动超时剔除功能后，使用的超时阈值(秒)
     */
    public void setReadOnlyMaxDelayTime(Long ReadOnlyMaxDelayTime) {
        this.ReadOnlyMaxDelayTime = ReadOnlyMaxDelayTime;
    }

    /**
     * Get 启动超时剔除功能后，至少只读组保留的只读副本数 
     * @return MinReadOnlyInGroup 启动超时剔除功能后，至少只读组保留的只读副本数
     */
    public Long getMinReadOnlyInGroup() {
        return this.MinReadOnlyInGroup;
    }

    /**
     * Set 启动超时剔除功能后，至少只读组保留的只读副本数
     * @param MinReadOnlyInGroup 启动超时剔除功能后，至少只读组保留的只读副本数
     */
    public void setMinReadOnlyInGroup(Long MinReadOnlyInGroup) {
        this.MinReadOnlyInGroup = MinReadOnlyInGroup;
    }

    /**
     * Get 只读组vip 
     * @return Vip 只读组vip
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set 只读组vip
     * @param Vip 只读组vip
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get 只读组vport 
     * @return Vport 只读组vport
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set 只读组vport
     * @param Vport 只读组vport
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get 只读组在私有网络ID 
     * @return VpcId 只读组在私有网络ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 只读组在私有网络ID
     * @param VpcId 只读组在私有网络ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 只读组在私有网络子网ID 
     * @return SubnetId 只读组在私有网络子网ID
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 只读组在私有网络子网ID
     * @param SubnetId 只读组在私有网络子网ID
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 只读实例副本集合 
     * @return ReadOnlyInstanceSet 只读实例副本集合
     */
    public ReadOnlyInstance [] getReadOnlyInstanceSet() {
        return this.ReadOnlyInstanceSet;
    }

    /**
     * Set 只读实例副本集合
     * @param ReadOnlyInstanceSet 只读实例副本集合
     */
    public void setReadOnlyInstanceSet(ReadOnlyInstance [] ReadOnlyInstanceSet) {
        this.ReadOnlyInstanceSet = ReadOnlyInstanceSet;
    }

    /**
     * Get 只读组状态: 1-申请成功运行中，5-申请中 
     * @return Status 只读组状态: 1-申请成功运行中，5-申请中
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 只读组状态: 1-申请成功运行中，5-申请中
     * @param Status 只读组状态: 1-申请成功运行中，5-申请中
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 主实例ID，形如mssql-sgeshe3th 
     * @return MasterInstanceId 主实例ID，形如mssql-sgeshe3th
     */
    public String getMasterInstanceId() {
        return this.MasterInstanceId;
    }

    /**
     * Set 主实例ID，形如mssql-sgeshe3th
     * @param MasterInstanceId 主实例ID，形如mssql-sgeshe3th
     */
    public void setMasterInstanceId(String MasterInstanceId) {
        this.MasterInstanceId = MasterInstanceId;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeReadOnlyGroupAutoWeightResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeReadOnlyGroupAutoWeightResponse(DescribeReadOnlyGroupAutoWeightResponse source) {
        if (source.ReadOnlyGroupId != null) {
            this.ReadOnlyGroupId = new String(source.ReadOnlyGroupId);
        }
        if (source.ReadOnlyGroupName != null) {
            this.ReadOnlyGroupName = new String(source.ReadOnlyGroupName);
        }
        if (source.RegionId != null) {
            this.RegionId = new String(source.RegionId);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.IsOfflineDelay != null) {
            this.IsOfflineDelay = new Long(source.IsOfflineDelay);
        }
        if (source.ReadOnlyMaxDelayTime != null) {
            this.ReadOnlyMaxDelayTime = new Long(source.ReadOnlyMaxDelayTime);
        }
        if (source.MinReadOnlyInGroup != null) {
            this.MinReadOnlyInGroup = new Long(source.MinReadOnlyInGroup);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vport != null) {
            this.Vport = new Long(source.Vport);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.ReadOnlyInstanceSet != null) {
            this.ReadOnlyInstanceSet = new ReadOnlyInstance[source.ReadOnlyInstanceSet.length];
            for (int i = 0; i < source.ReadOnlyInstanceSet.length; i++) {
                this.ReadOnlyInstanceSet[i] = new ReadOnlyInstance(source.ReadOnlyInstanceSet[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.MasterInstanceId != null) {
            this.MasterInstanceId = new String(source.MasterInstanceId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReadOnlyGroupId", this.ReadOnlyGroupId);
        this.setParamSimple(map, prefix + "ReadOnlyGroupName", this.ReadOnlyGroupName);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "IsOfflineDelay", this.IsOfflineDelay);
        this.setParamSimple(map, prefix + "ReadOnlyMaxDelayTime", this.ReadOnlyMaxDelayTime);
        this.setParamSimple(map, prefix + "MinReadOnlyInGroup", this.MinReadOnlyInGroup);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamArrayObj(map, prefix + "ReadOnlyInstanceSet.", this.ReadOnlyInstanceSet);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "MasterInstanceId", this.MasterInstanceId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

