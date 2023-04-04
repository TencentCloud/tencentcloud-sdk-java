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
package com.tencentcloudapi.trro.v20220325.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProjectListResponse extends AbstractModel{

    /**
    * 项目信息数组
    */
    @SerializedName("Projects")
    @Expose
    private ProjectInfo [] Projects;

    /**
    * 项目总数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 本次返回的项目数
    */
    @SerializedName("Num")
    @Expose
    private Long Num;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 项目信息数组 
     * @return Projects 项目信息数组
     */
    public ProjectInfo [] getProjects() {
        return this.Projects;
    }

    /**
     * Set 项目信息数组
     * @param Projects 项目信息数组
     */
    public void setProjects(ProjectInfo [] Projects) {
        this.Projects = Projects;
    }

    /**
     * Get 项目总数 
     * @return Total 项目总数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 项目总数
     * @param Total 项目总数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 本次返回的项目数 
     * @return Num 本次返回的项目数
     */
    public Long getNum() {
        return this.Num;
    }

    /**
     * Set 本次返回的项目数
     * @param Num 本次返回的项目数
     */
    public void setNum(Long Num) {
        this.Num = Num;
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

    public DescribeProjectListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeProjectListResponse(DescribeProjectListResponse source) {
        if (source.Projects != null) {
            this.Projects = new ProjectInfo[source.Projects.length];
            for (int i = 0; i < source.Projects.length; i++) {
                this.Projects[i] = new ProjectInfo(source.Projects[i]);
            }
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Num != null) {
            this.Num = new Long(source.Num);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Projects.", this.Projects);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "Num", this.Num);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

