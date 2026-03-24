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
package com.tencentcloudapi.config.v20220802.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAggregatorResponse extends AbstractModel {

    /**
    * <p>账号组名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>账号组描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>账号组类型</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>成员信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AggregatorAccounts")
    @Expose
    private AggregatorAccount [] AggregatorAccounts;

    /**
    * <p>创建状态</p>
    */
    @SerializedName("AggregatorStatus")
    @Expose
    private Long AggregatorStatus;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>账号组名称</p> 
     * @return Name <p>账号组名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>账号组名称</p>
     * @param Name <p>账号组名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>账号组描述</p> 
     * @return Description <p>账号组描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>账号组描述</p>
     * @param Description <p>账号组描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>账号组类型</p> 
     * @return Type <p>账号组类型</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>账号组类型</p>
     * @param Type <p>账号组类型</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>成员信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AggregatorAccounts <p>成员信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AggregatorAccount [] getAggregatorAccounts() {
        return this.AggregatorAccounts;
    }

    /**
     * Set <p>成员信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AggregatorAccounts <p>成员信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAggregatorAccounts(AggregatorAccount [] AggregatorAccounts) {
        this.AggregatorAccounts = AggregatorAccounts;
    }

    /**
     * Get <p>创建状态</p> 
     * @return AggregatorStatus <p>创建状态</p>
     */
    public Long getAggregatorStatus() {
        return this.AggregatorStatus;
    }

    /**
     * Set <p>创建状态</p>
     * @param AggregatorStatus <p>创建状态</p>
     */
    public void setAggregatorStatus(Long AggregatorStatus) {
        this.AggregatorStatus = AggregatorStatus;
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

    public DescribeAggregatorResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAggregatorResponse(DescribeAggregatorResponse source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.AggregatorAccounts != null) {
            this.AggregatorAccounts = new AggregatorAccount[source.AggregatorAccounts.length];
            for (int i = 0; i < source.AggregatorAccounts.length; i++) {
                this.AggregatorAccounts[i] = new AggregatorAccount(source.AggregatorAccounts[i]);
            }
        }
        if (source.AggregatorStatus != null) {
            this.AggregatorStatus = new Long(source.AggregatorStatus);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "AggregatorAccounts.", this.AggregatorAccounts);
        this.setParamSimple(map, prefix + "AggregatorStatus", this.AggregatorStatus);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

