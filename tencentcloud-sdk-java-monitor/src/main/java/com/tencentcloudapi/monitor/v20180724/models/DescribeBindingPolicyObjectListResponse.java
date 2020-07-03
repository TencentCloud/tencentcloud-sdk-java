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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBindingPolicyObjectListResponse extends AbstractModel{

    /**
    * 绑定的对象实例列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("List")
    @Expose
    private DescribeBindingPolicyObjectListInstance [] List;

    /**
    * 绑定的对象实例总数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 未屏蔽的对象实例数
    */
    @SerializedName("NoShieldedSum")
    @Expose
    private Long NoShieldedSum;

    /**
    * 绑定的实例分组信息，没有绑定实例分组则为空
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceGroup")
    @Expose
    private DescribeBindingPolicyObjectListInstanceGroup InstanceGroup;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 绑定的对象实例列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return List 绑定的对象实例列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribeBindingPolicyObjectListInstance [] getList() {
        return this.List;
    }

    /**
     * Set 绑定的对象实例列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param List 绑定的对象实例列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setList(DescribeBindingPolicyObjectListInstance [] List) {
        this.List = List;
    }

    /**
     * Get 绑定的对象实例总数 
     * @return Total 绑定的对象实例总数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 绑定的对象实例总数
     * @param Total 绑定的对象实例总数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 未屏蔽的对象实例数 
     * @return NoShieldedSum 未屏蔽的对象实例数
     */
    public Long getNoShieldedSum() {
        return this.NoShieldedSum;
    }

    /**
     * Set 未屏蔽的对象实例数
     * @param NoShieldedSum 未屏蔽的对象实例数
     */
    public void setNoShieldedSum(Long NoShieldedSum) {
        this.NoShieldedSum = NoShieldedSum;
    }

    /**
     * Get 绑定的实例分组信息，没有绑定实例分组则为空
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceGroup 绑定的实例分组信息，没有绑定实例分组则为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribeBindingPolicyObjectListInstanceGroup getInstanceGroup() {
        return this.InstanceGroup;
    }

    /**
     * Set 绑定的实例分组信息，没有绑定实例分组则为空
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceGroup 绑定的实例分组信息，没有绑定实例分组则为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceGroup(DescribeBindingPolicyObjectListInstanceGroup InstanceGroup) {
        this.InstanceGroup = InstanceGroup;
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
        this.setParamArrayObj(map, prefix + "List.", this.List);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "NoShieldedSum", this.NoShieldedSum);
        this.setParamObj(map, prefix + "InstanceGroup.", this.InstanceGroup);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

