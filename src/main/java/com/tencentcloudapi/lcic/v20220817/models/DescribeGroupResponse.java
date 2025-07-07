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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeGroupResponse extends AbstractModel {

    /**
    * 群组ID
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 群组名称
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 群主主讲人ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TeacherId")
    @Expose
    private String TeacherId;

    /**
    * 群组类型
0-基础群组
1-组合群组，若为1时会返回子群组ID
    */
    @SerializedName("GroupType")
    @Expose
    private Long GroupType;

    /**
    * 子群组ID列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubGroupIds")
    @Expose
    private String [] SubGroupIds;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 群组ID 
     * @return GroupId 群组ID
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 群组ID
     * @param GroupId 群组ID
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 群组名称 
     * @return GroupName 群组名称
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 群组名称
     * @param GroupName 群组名称
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 群主主讲人ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TeacherId 群主主讲人ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTeacherId() {
        return this.TeacherId;
    }

    /**
     * Set 群主主讲人ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TeacherId 群主主讲人ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTeacherId(String TeacherId) {
        this.TeacherId = TeacherId;
    }

    /**
     * Get 群组类型
0-基础群组
1-组合群组，若为1时会返回子群组ID 
     * @return GroupType 群组类型
0-基础群组
1-组合群组，若为1时会返回子群组ID
     */
    public Long getGroupType() {
        return this.GroupType;
    }

    /**
     * Set 群组类型
0-基础群组
1-组合群组，若为1时会返回子群组ID
     * @param GroupType 群组类型
0-基础群组
1-组合群组，若为1时会返回子群组ID
     */
    public void setGroupType(Long GroupType) {
        this.GroupType = GroupType;
    }

    /**
     * Get 子群组ID列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubGroupIds 子群组ID列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSubGroupIds() {
        return this.SubGroupIds;
    }

    /**
     * Set 子群组ID列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubGroupIds 子群组ID列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubGroupIds(String [] SubGroupIds) {
        this.SubGroupIds = SubGroupIds;
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

    public DescribeGroupResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeGroupResponse(DescribeGroupResponse source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.TeacherId != null) {
            this.TeacherId = new String(source.TeacherId);
        }
        if (source.GroupType != null) {
            this.GroupType = new Long(source.GroupType);
        }
        if (source.SubGroupIds != null) {
            this.SubGroupIds = new String[source.SubGroupIds.length];
            for (int i = 0; i < source.SubGroupIds.length; i++) {
                this.SubGroupIds[i] = new String(source.SubGroupIds[i]);
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
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "TeacherId", this.TeacherId);
        this.setParamSimple(map, prefix + "GroupType", this.GroupType);
        this.setParamArraySimple(map, prefix + "SubGroupIds.", this.SubGroupIds);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

