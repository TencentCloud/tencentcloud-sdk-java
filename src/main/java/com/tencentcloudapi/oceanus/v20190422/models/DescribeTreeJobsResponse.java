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
package com.tencentcloudapi.oceanus.v20190422.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTreeJobsResponse extends AbstractModel {

    /**
    * <p>父节点ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParentId")
    @Expose
    private String ParentId;

    /**
    * <p>当前文件夹ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>当前文件夹名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>当前文件夹下的作业列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JobSet")
    @Expose
    private TreeJobSets [] JobSet;

    /**
    * <p>迭代子目录</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Children")
    @Expose
    private DescribeTreeJobsRsp [] Children;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>父节点ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParentId <p>父节点ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParentId() {
        return this.ParentId;
    }

    /**
     * Set <p>父节点ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParentId <p>父节点ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParentId(String ParentId) {
        this.ParentId = ParentId;
    }

    /**
     * Get <p>当前文件夹ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id <p>当前文件夹ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>当前文件夹ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id <p>当前文件夹ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>当前文件夹名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name <p>当前文件夹名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>当前文件夹名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name <p>当前文件夹名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>当前文件夹下的作业列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JobSet <p>当前文件夹下的作业列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TreeJobSets [] getJobSet() {
        return this.JobSet;
    }

    /**
     * Set <p>当前文件夹下的作业列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param JobSet <p>当前文件夹下的作业列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJobSet(TreeJobSets [] JobSet) {
        this.JobSet = JobSet;
    }

    /**
     * Get <p>迭代子目录</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Children <p>迭代子目录</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribeTreeJobsRsp [] getChildren() {
        return this.Children;
    }

    /**
     * Set <p>迭代子目录</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Children <p>迭代子目录</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChildren(DescribeTreeJobsRsp [] Children) {
        this.Children = Children;
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

    public DescribeTreeJobsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTreeJobsResponse(DescribeTreeJobsResponse source) {
        if (source.ParentId != null) {
            this.ParentId = new String(source.ParentId);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.JobSet != null) {
            this.JobSet = new TreeJobSets[source.JobSet.length];
            for (int i = 0; i < source.JobSet.length; i++) {
                this.JobSet[i] = new TreeJobSets(source.JobSet[i]);
            }
        }
        if (source.Children != null) {
            this.Children = new DescribeTreeJobsRsp[source.Children.length];
            for (int i = 0; i < source.Children.length; i++) {
                this.Children[i] = new DescribeTreeJobsRsp(source.Children[i]);
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
        this.setParamSimple(map, prefix + "ParentId", this.ParentId);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "JobSet.", this.JobSet);
        this.setParamArrayObj(map, prefix + "Children.", this.Children);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

