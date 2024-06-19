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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeReplicationGroupInstanceResponse extends AbstractModel {

    /**
    * AppID。
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 地域数字编号。
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * 复制组字符串ID。
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 复制组名称。
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 实例复制组角色。
- r:  备实例
- rw: 主实例
    */
    @SerializedName("InstanceRole")
    @Expose
    private String InstanceRole;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get AppID。 
     * @return AppId AppID。
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set AppID。
     * @param AppId AppID。
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 地域数字编号。 
     * @return RegionId 地域数字编号。
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 地域数字编号。
     * @param RegionId 地域数字编号。
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get 复制组字符串ID。 
     * @return GroupId 复制组字符串ID。
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 复制组字符串ID。
     * @param GroupId 复制组字符串ID。
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 复制组名称。 
     * @return GroupName 复制组名称。
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 复制组名称。
     * @param GroupName 复制组名称。
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 实例复制组角色。
- r:  备实例
- rw: 主实例 
     * @return InstanceRole 实例复制组角色。
- r:  备实例
- rw: 主实例
     */
    public String getInstanceRole() {
        return this.InstanceRole;
    }

    /**
     * Set 实例复制组角色。
- r:  备实例
- rw: 主实例
     * @param InstanceRole 实例复制组角色。
- r:  备实例
- rw: 主实例
     */
    public void setInstanceRole(String InstanceRole) {
        this.InstanceRole = InstanceRole;
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

    public DescribeReplicationGroupInstanceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeReplicationGroupInstanceResponse(DescribeReplicationGroupInstanceResponse source) {
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.InstanceRole != null) {
            this.InstanceRole = new String(source.InstanceRole);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "InstanceRole", this.InstanceRole);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

