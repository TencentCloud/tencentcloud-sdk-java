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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCloudBaseProjectLatestVersionListRequest extends AbstractModel{

    /**
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 个数
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 环境id, 非必填
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * 项目名称, 非必填
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * 项目类型: framework-oneclick,qci-extension-cicd
    */
    @SerializedName("ProjectType")
    @Expose
    private String ProjectType;

    /**
    * 标签
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * ci的id
    */
    @SerializedName("CiId")
    @Expose
    private String CiId;

    /**
     * Get 偏移量 
     * @return Offset 偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量
     * @param Offset 偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 个数 
     * @return PageSize 个数
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 个数
     * @param PageSize 个数
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 环境id, 非必填 
     * @return EnvId 环境id, 非必填
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set 环境id, 非必填
     * @param EnvId 环境id, 非必填
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get 项目名称, 非必填 
     * @return ProjectName 项目名称, 非必填
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set 项目名称, 非必填
     * @param ProjectName 项目名称, 非必填
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get 项目类型: framework-oneclick,qci-extension-cicd 
     * @return ProjectType 项目类型: framework-oneclick,qci-extension-cicd
     */
    public String getProjectType() {
        return this.ProjectType;
    }

    /**
     * Set 项目类型: framework-oneclick,qci-extension-cicd
     * @param ProjectType 项目类型: framework-oneclick,qci-extension-cicd
     */
    public void setProjectType(String ProjectType) {
        this.ProjectType = ProjectType;
    }

    /**
     * Get 标签 
     * @return Tags 标签
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签
     * @param Tags 标签
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get ci的id 
     * @return CiId ci的id
     */
    public String getCiId() {
        return this.CiId;
    }

    /**
     * Set ci的id
     * @param CiId ci的id
     */
    public void setCiId(String CiId) {
        this.CiId = CiId;
    }

    public DescribeCloudBaseProjectLatestVersionListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCloudBaseProjectLatestVersionListRequest(DescribeCloudBaseProjectLatestVersionListRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.ProjectType != null) {
            this.ProjectType = new String(source.ProjectType);
        }
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
        if (source.CiId != null) {
            this.CiId = new String(source.CiId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "ProjectType", this.ProjectType);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "CiId", this.CiId);

    }
}

