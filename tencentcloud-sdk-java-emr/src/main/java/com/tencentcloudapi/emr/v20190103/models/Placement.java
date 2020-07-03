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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Placement extends AbstractModel{

    /**
    * 实例所属项目ID。该参数可以通过调用 DescribeProject 的返回值中的 projectId 字段来获取。填0为默认项目。
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 实例所属的可用区，例如ap-guangzhou-1。该参数也可以通过调用 DescribeZones 的返回值中的Zone字段来获取。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
     * Get 实例所属项目ID。该参数可以通过调用 DescribeProject 的返回值中的 projectId 字段来获取。填0为默认项目。 
     * @return ProjectId 实例所属项目ID。该参数可以通过调用 DescribeProject 的返回值中的 projectId 字段来获取。填0为默认项目。
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 实例所属项目ID。该参数可以通过调用 DescribeProject 的返回值中的 projectId 字段来获取。填0为默认项目。
     * @param ProjectId 实例所属项目ID。该参数可以通过调用 DescribeProject 的返回值中的 projectId 字段来获取。填0为默认项目。
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 实例所属的可用区，例如ap-guangzhou-1。该参数也可以通过调用 DescribeZones 的返回值中的Zone字段来获取。 
     * @return Zone 实例所属的可用区，例如ap-guangzhou-1。该参数也可以通过调用 DescribeZones 的返回值中的Zone字段来获取。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 实例所属的可用区，例如ap-guangzhou-1。该参数也可以通过调用 DescribeZones 的返回值中的Zone字段来获取。
     * @param Zone 实例所属的可用区，例如ap-guangzhou-1。该参数也可以通过调用 DescribeZones 的返回值中的Zone字段来获取。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Zone", this.Zone);

    }
}

