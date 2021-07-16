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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeConfigMachineGroupsResponse extends AbstractModel{

    /**
    * 采集规则配置绑定的机器组列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MachineGroups")
    @Expose
    private MachineGroupInfo [] MachineGroups;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 采集规则配置绑定的机器组列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MachineGroups 采集规则配置绑定的机器组列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MachineGroupInfo [] getMachineGroups() {
        return this.MachineGroups;
    }

    /**
     * Set 采集规则配置绑定的机器组列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param MachineGroups 采集规则配置绑定的机器组列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMachineGroups(MachineGroupInfo [] MachineGroups) {
        this.MachineGroups = MachineGroups;
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

    public DescribeConfigMachineGroupsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeConfigMachineGroupsResponse(DescribeConfigMachineGroupsResponse source) {
        if (source.MachineGroups != null) {
            this.MachineGroups = new MachineGroupInfo[source.MachineGroups.length];
            for (int i = 0; i < source.MachineGroups.length; i++) {
                this.MachineGroups[i] = new MachineGroupInfo(source.MachineGroups[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "MachineGroups.", this.MachineGroups);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

