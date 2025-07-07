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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceDTSInstanceInfo extends AbstractModel {

    /**
    * 地域 ID。
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * 实例 ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 仓库ID。
    */
    @SerializedName("SetId")
    @Expose
    private Long SetId;

    /**
    * 可用区ID。
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * 实例类型。
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 实例名称。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 实例访问地址。
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * 状态。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get 地域 ID。 
     * @return RegionId 地域 ID。
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 地域 ID。
     * @param RegionId 地域 ID。
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get 实例 ID。 
     * @return InstanceId 实例 ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID。
     * @param InstanceId 实例 ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 仓库ID。 
     * @return SetId 仓库ID。
     */
    public Long getSetId() {
        return this.SetId;
    }

    /**
     * Set 仓库ID。
     * @param SetId 仓库ID。
     */
    public void setSetId(Long SetId) {
        this.SetId = SetId;
    }

    /**
     * Get 可用区ID。 
     * @return ZoneId 可用区ID。
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 可用区ID。
     * @param ZoneId 可用区ID。
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 实例类型。 
     * @return Type 实例类型。
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 实例类型。
     * @param Type 实例类型。
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 实例名称。 
     * @return InstanceName 实例名称。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称。
     * @param InstanceName 实例名称。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 实例访问地址。 
     * @return Vip 实例访问地址。
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set 实例访问地址。
     * @param Vip 实例访问地址。
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get 状态。 
     * @return Status 状态。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态。
     * @param Status 状态。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public DescribeInstanceDTSInstanceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceDTSInstanceInfo(DescribeInstanceDTSInstanceInfo source) {
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.SetId != null) {
            this.SetId = new Long(source.SetId);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "SetId", this.SetId);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

