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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProjectRequest extends AbstractModel{

    /**
    * 项目id。一般使用项目Id来查询，与projectName必须存在一个。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 是否展示关联集群信息
    */
    @SerializedName("DescribeClusters")
    @Expose
    private Boolean DescribeClusters;

    /**
    * 是否展示关联执行组的信息，仅部分信息。
    */
    @SerializedName("DescribeExecutors")
    @Expose
    private Boolean DescribeExecutors;

    /**
    * 默认不展示项目管理员信息
    */
    @SerializedName("DescribeAdminUsers")
    @Expose
    private Boolean DescribeAdminUsers;

    /**
    * 默认不统计项目人员数量
    */
    @SerializedName("DescribeMemberCount")
    @Expose
    private Boolean DescribeMemberCount;

    /**
    * 默认不查询创建者的信息
    */
    @SerializedName("DescribeCreator")
    @Expose
    private Boolean DescribeCreator;

    /**
    * 项目名只在租户内唯一，一般用来转化为项目ID。
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
     * Get 项目id。一般使用项目Id来查询，与projectName必须存在一个。 
     * @return ProjectId 项目id。一般使用项目Id来查询，与projectName必须存在一个。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目id。一般使用项目Id来查询，与projectName必须存在一个。
     * @param ProjectId 项目id。一般使用项目Id来查询，与projectName必须存在一个。
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 是否展示关联集群信息 
     * @return DescribeClusters 是否展示关联集群信息
     */
    public Boolean getDescribeClusters() {
        return this.DescribeClusters;
    }

    /**
     * Set 是否展示关联集群信息
     * @param DescribeClusters 是否展示关联集群信息
     */
    public void setDescribeClusters(Boolean DescribeClusters) {
        this.DescribeClusters = DescribeClusters;
    }

    /**
     * Get 是否展示关联执行组的信息，仅部分信息。 
     * @return DescribeExecutors 是否展示关联执行组的信息，仅部分信息。
     */
    public Boolean getDescribeExecutors() {
        return this.DescribeExecutors;
    }

    /**
     * Set 是否展示关联执行组的信息，仅部分信息。
     * @param DescribeExecutors 是否展示关联执行组的信息，仅部分信息。
     */
    public void setDescribeExecutors(Boolean DescribeExecutors) {
        this.DescribeExecutors = DescribeExecutors;
    }

    /**
     * Get 默认不展示项目管理员信息 
     * @return DescribeAdminUsers 默认不展示项目管理员信息
     */
    public Boolean getDescribeAdminUsers() {
        return this.DescribeAdminUsers;
    }

    /**
     * Set 默认不展示项目管理员信息
     * @param DescribeAdminUsers 默认不展示项目管理员信息
     */
    public void setDescribeAdminUsers(Boolean DescribeAdminUsers) {
        this.DescribeAdminUsers = DescribeAdminUsers;
    }

    /**
     * Get 默认不统计项目人员数量 
     * @return DescribeMemberCount 默认不统计项目人员数量
     */
    public Boolean getDescribeMemberCount() {
        return this.DescribeMemberCount;
    }

    /**
     * Set 默认不统计项目人员数量
     * @param DescribeMemberCount 默认不统计项目人员数量
     */
    public void setDescribeMemberCount(Boolean DescribeMemberCount) {
        this.DescribeMemberCount = DescribeMemberCount;
    }

    /**
     * Get 默认不查询创建者的信息 
     * @return DescribeCreator 默认不查询创建者的信息
     */
    public Boolean getDescribeCreator() {
        return this.DescribeCreator;
    }

    /**
     * Set 默认不查询创建者的信息
     * @param DescribeCreator 默认不查询创建者的信息
     */
    public void setDescribeCreator(Boolean DescribeCreator) {
        this.DescribeCreator = DescribeCreator;
    }

    /**
     * Get 项目名只在租户内唯一，一般用来转化为项目ID。 
     * @return ProjectName 项目名只在租户内唯一，一般用来转化为项目ID。
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set 项目名只在租户内唯一，一般用来转化为项目ID。
     * @param ProjectName 项目名只在租户内唯一，一般用来转化为项目ID。
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    public DescribeProjectRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeProjectRequest(DescribeProjectRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.DescribeClusters != null) {
            this.DescribeClusters = new Boolean(source.DescribeClusters);
        }
        if (source.DescribeExecutors != null) {
            this.DescribeExecutors = new Boolean(source.DescribeExecutors);
        }
        if (source.DescribeAdminUsers != null) {
            this.DescribeAdminUsers = new Boolean(source.DescribeAdminUsers);
        }
        if (source.DescribeMemberCount != null) {
            this.DescribeMemberCount = new Boolean(source.DescribeMemberCount);
        }
        if (source.DescribeCreator != null) {
            this.DescribeCreator = new Boolean(source.DescribeCreator);
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "DescribeClusters", this.DescribeClusters);
        this.setParamSimple(map, prefix + "DescribeExecutors", this.DescribeExecutors);
        this.setParamSimple(map, prefix + "DescribeAdminUsers", this.DescribeAdminUsers);
        this.setParamSimple(map, prefix + "DescribeMemberCount", this.DescribeMemberCount);
        this.setParamSimple(map, prefix + "DescribeCreator", this.DescribeCreator);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);

    }
}

