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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyContainerReplicasRequest extends AbstractModel {

    /**
    * 部署组ID，部署组唯一标识，可以通过[DescribeContainerGroups](https://cloud.tencent.com/document/api/649/36068)查询已创建的容器部署组列表；也可以调用[CreateContainGroup](https://cloud.tencent.com/document/api/649/36075)创建新的容器部署组
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 实例数量
    */
    @SerializedName("InstanceNum")
    @Expose
    private Long InstanceNum;

    /**
     * Get 部署组ID，部署组唯一标识，可以通过[DescribeContainerGroups](https://cloud.tencent.com/document/api/649/36068)查询已创建的容器部署组列表；也可以调用[CreateContainGroup](https://cloud.tencent.com/document/api/649/36075)创建新的容器部署组 
     * @return GroupId 部署组ID，部署组唯一标识，可以通过[DescribeContainerGroups](https://cloud.tencent.com/document/api/649/36068)查询已创建的容器部署组列表；也可以调用[CreateContainGroup](https://cloud.tencent.com/document/api/649/36075)创建新的容器部署组
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 部署组ID，部署组唯一标识，可以通过[DescribeContainerGroups](https://cloud.tencent.com/document/api/649/36068)查询已创建的容器部署组列表；也可以调用[CreateContainGroup](https://cloud.tencent.com/document/api/649/36075)创建新的容器部署组
     * @param GroupId 部署组ID，部署组唯一标识，可以通过[DescribeContainerGroups](https://cloud.tencent.com/document/api/649/36068)查询已创建的容器部署组列表；也可以调用[CreateContainGroup](https://cloud.tencent.com/document/api/649/36075)创建新的容器部署组
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 实例数量 
     * @return InstanceNum 实例数量
     */
    public Long getInstanceNum() {
        return this.InstanceNum;
    }

    /**
     * Set 实例数量
     * @param InstanceNum 实例数量
     */
    public void setInstanceNum(Long InstanceNum) {
        this.InstanceNum = InstanceNum;
    }

    public ModifyContainerReplicasRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyContainerReplicasRequest(ModifyContainerReplicasRequest source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.InstanceNum != null) {
            this.InstanceNum = new Long(source.InstanceNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "InstanceNum", this.InstanceNum);

    }
}

