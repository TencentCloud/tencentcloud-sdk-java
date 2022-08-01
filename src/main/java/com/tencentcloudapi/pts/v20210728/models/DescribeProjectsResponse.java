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
package com.tencentcloudapi.pts.v20210728.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProjectsResponse extends AbstractModel{

    /**
    * 项目数组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectSet")
    @Expose
    private Project [] ProjectSet;

    /**
    * 项目数量
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 项目数组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectSet 项目数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Project [] getProjectSet() {
        return this.ProjectSet;
    }

    /**
     * Set 项目数组
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectSet 项目数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectSet(Project [] ProjectSet) {
        this.ProjectSet = ProjectSet;
    }

    /**
     * Get 项目数量 
     * @return Total 项目数量
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 项目数量
     * @param Total 项目数量
     */
    public void setTotal(Long Total) {
        this.Total = Total;
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

    public DescribeProjectsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeProjectsResponse(DescribeProjectsResponse source) {
        if (source.ProjectSet != null) {
            this.ProjectSet = new Project[source.ProjectSet.length];
            for (int i = 0; i < source.ProjectSet.length; i++) {
                this.ProjectSet[i] = new Project(source.ProjectSet[i]);
            }
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ProjectSet.", this.ProjectSet);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

