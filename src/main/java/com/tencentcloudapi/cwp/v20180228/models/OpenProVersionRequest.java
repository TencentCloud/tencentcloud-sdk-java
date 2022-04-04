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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OpenProVersionRequest extends AbstractModel{

    /**
    * 云服务器类型。(当前参数已作废,可以留空值 )
    */
    @SerializedName("MachineType")
    @Expose
    private String MachineType;

    /**
    * 机器所属地域。(当前参数已作废,可以留空值 )
    */
    @SerializedName("MachineRegion")
    @Expose
    private String MachineRegion;

    /**
    * 主机唯一标识Uuid数组。
黑石的InstanceId，CVM的Uuid ,边缘计算的Uuid , 轻量应用服务器的Uuid ,混合云机器的Quuid 。 当前参数最大长度限制20
    */
    @SerializedName("Quuids")
    @Expose
    private String [] Quuids;

    /**
    * 活动ID。
    */
    @SerializedName("ActivityId")
    @Expose
    private Long ActivityId;

    /**
     * Get 云服务器类型。(当前参数已作废,可以留空值 ) 
     * @return MachineType 云服务器类型。(当前参数已作废,可以留空值 )
     */
    public String getMachineType() {
        return this.MachineType;
    }

    /**
     * Set 云服务器类型。(当前参数已作废,可以留空值 )
     * @param MachineType 云服务器类型。(当前参数已作废,可以留空值 )
     */
    public void setMachineType(String MachineType) {
        this.MachineType = MachineType;
    }

    /**
     * Get 机器所属地域。(当前参数已作废,可以留空值 ) 
     * @return MachineRegion 机器所属地域。(当前参数已作废,可以留空值 )
     */
    public String getMachineRegion() {
        return this.MachineRegion;
    }

    /**
     * Set 机器所属地域。(当前参数已作废,可以留空值 )
     * @param MachineRegion 机器所属地域。(当前参数已作废,可以留空值 )
     */
    public void setMachineRegion(String MachineRegion) {
        this.MachineRegion = MachineRegion;
    }

    /**
     * Get 主机唯一标识Uuid数组。
黑石的InstanceId，CVM的Uuid ,边缘计算的Uuid , 轻量应用服务器的Uuid ,混合云机器的Quuid 。 当前参数最大长度限制20 
     * @return Quuids 主机唯一标识Uuid数组。
黑石的InstanceId，CVM的Uuid ,边缘计算的Uuid , 轻量应用服务器的Uuid ,混合云机器的Quuid 。 当前参数最大长度限制20
     */
    public String [] getQuuids() {
        return this.Quuids;
    }

    /**
     * Set 主机唯一标识Uuid数组。
黑石的InstanceId，CVM的Uuid ,边缘计算的Uuid , 轻量应用服务器的Uuid ,混合云机器的Quuid 。 当前参数最大长度限制20
     * @param Quuids 主机唯一标识Uuid数组。
黑石的InstanceId，CVM的Uuid ,边缘计算的Uuid , 轻量应用服务器的Uuid ,混合云机器的Quuid 。 当前参数最大长度限制20
     */
    public void setQuuids(String [] Quuids) {
        this.Quuids = Quuids;
    }

    /**
     * Get 活动ID。 
     * @return ActivityId 活动ID。
     */
    public Long getActivityId() {
        return this.ActivityId;
    }

    /**
     * Set 活动ID。
     * @param ActivityId 活动ID。
     */
    public void setActivityId(Long ActivityId) {
        this.ActivityId = ActivityId;
    }

    public OpenProVersionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OpenProVersionRequest(OpenProVersionRequest source) {
        if (source.MachineType != null) {
            this.MachineType = new String(source.MachineType);
        }
        if (source.MachineRegion != null) {
            this.MachineRegion = new String(source.MachineRegion);
        }
        if (source.Quuids != null) {
            this.Quuids = new String[source.Quuids.length];
            for (int i = 0; i < source.Quuids.length; i++) {
                this.Quuids[i] = new String(source.Quuids[i]);
            }
        }
        if (source.ActivityId != null) {
            this.ActivityId = new Long(source.ActivityId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MachineType", this.MachineType);
        this.setParamSimple(map, prefix + "MachineRegion", this.MachineRegion);
        this.setParamArraySimple(map, prefix + "Quuids.", this.Quuids);
        this.setParamSimple(map, prefix + "ActivityId", this.ActivityId);

    }
}

