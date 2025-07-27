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

public class DescribeTreeJobsRsp extends AbstractModel {

    /**
    * 父节点ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParentId")
    @Expose
    private String ParentId;

    /**
    * 当前文件夹ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 当前文件夹名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 当前文件夹下的作业集合
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JobSet")
    @Expose
    private TreeJobSets [] JobSet;

    /**
    * 迭代子目录
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Children")
    @Expose
    private DescribeTreeJobsRsp [] Children;

    /**
    * 请求ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
    * attach-000
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PageAttach")
    @Expose
    private String PageAttach;

    /**
    * bool
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HasMore")
    @Expose
    private Boolean HasMore;

    /**
     * Get 父节点ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParentId 父节点ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParentId() {
        return this.ParentId;
    }

    /**
     * Set 父节点ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParentId 父节点ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParentId(String ParentId) {
        this.ParentId = ParentId;
    }

    /**
     * Get 当前文件夹ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id 当前文件夹ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 当前文件夹ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id 当前文件夹ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 当前文件夹名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 当前文件夹名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 当前文件夹名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 当前文件夹名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 当前文件夹下的作业集合
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JobSet 当前文件夹下的作业集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TreeJobSets [] getJobSet() {
        return this.JobSet;
    }

    /**
     * Set 当前文件夹下的作业集合
注意：此字段可能返回 null，表示取不到有效值。
     * @param JobSet 当前文件夹下的作业集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJobSet(TreeJobSets [] JobSet) {
        this.JobSet = JobSet;
    }

    /**
     * Get 迭代子目录
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Children 迭代子目录
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribeTreeJobsRsp [] getChildren() {
        return this.Children;
    }

    /**
     * Set 迭代子目录
注意：此字段可能返回 null，表示取不到有效值。
     * @param Children 迭代子目录
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChildren(DescribeTreeJobsRsp [] Children) {
        this.Children = Children;
    }

    /**
     * Get 请求ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RequestId 请求ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 请求ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param RequestId 请求ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Get attach-000
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PageAttach attach-000
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPageAttach() {
        return this.PageAttach;
    }

    /**
     * Set attach-000
注意：此字段可能返回 null，表示取不到有效值。
     * @param PageAttach attach-000
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPageAttach(String PageAttach) {
        this.PageAttach = PageAttach;
    }

    /**
     * Get bool
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HasMore bool
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getHasMore() {
        return this.HasMore;
    }

    /**
     * Set bool
注意：此字段可能返回 null，表示取不到有效值。
     * @param HasMore bool
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHasMore(Boolean HasMore) {
        this.HasMore = HasMore;
    }

    public DescribeTreeJobsRsp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTreeJobsRsp(DescribeTreeJobsRsp source) {
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
        if (source.PageAttach != null) {
            this.PageAttach = new String(source.PageAttach);
        }
        if (source.HasMore != null) {
            this.HasMore = new Boolean(source.HasMore);
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
        this.setParamSimple(map, prefix + "PageAttach", this.PageAttach);
        this.setParamSimple(map, prefix + "HasMore", this.HasMore);

    }
}

