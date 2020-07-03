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
package com.tencentcloudapi.cat.v20180409.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAgentGroupsResponse extends AbstractModel{

    /**
    * 用户所属的系统默认拨测分组
    */
    @SerializedName("SysDefaultGroup")
    @Expose
    private AgentGroup SysDefaultGroup;

    /**
    * 用户创建的拨测分组列表
    */
    @SerializedName("CustomGroups")
    @Expose
    private AgentGroup [] CustomGroups;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 用户所属的系统默认拨测分组 
     * @return SysDefaultGroup 用户所属的系统默认拨测分组
     */
    public AgentGroup getSysDefaultGroup() {
        return this.SysDefaultGroup;
    }

    /**
     * Set 用户所属的系统默认拨测分组
     * @param SysDefaultGroup 用户所属的系统默认拨测分组
     */
    public void setSysDefaultGroup(AgentGroup SysDefaultGroup) {
        this.SysDefaultGroup = SysDefaultGroup;
    }

    /**
     * Get 用户创建的拨测分组列表 
     * @return CustomGroups 用户创建的拨测分组列表
     */
    public AgentGroup [] getCustomGroups() {
        return this.CustomGroups;
    }

    /**
     * Set 用户创建的拨测分组列表
     * @param CustomGroups 用户创建的拨测分组列表
     */
    public void setCustomGroups(AgentGroup [] CustomGroups) {
        this.CustomGroups = CustomGroups;
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
        this.setParamObj(map, prefix + "SysDefaultGroup.", this.SysDefaultGroup);
        this.setParamArrayObj(map, prefix + "CustomGroups.", this.CustomGroups);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

