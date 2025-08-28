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

public class DescribePodInstancesRequest extends AbstractModel {

    /**
    * 部署组ID，可通过调用[DescribeContainerGroups](https://cloud.tencent.com/document/api/649/36068)查询已创建的部署组列表或登录控制台进行查看；也可以调用[CreateContainGroup](https://cloud.tencent.com/document/api/649/36075)创建新的部署组。
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 偏移量，取值从0开始
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页个数，默认为20， 取值应为1~50
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 用于通过PodName字段过滤返回结果。
    */
    @SerializedName("PodNameList")
    @Expose
    private String [] PodNameList;

    /**
    * 新老版本pod批次标识，old表示老版本，new表示新版本。
    */
    @SerializedName("DeployVersion")
    @Expose
    private String DeployVersion;

    /**
    * 实例所属任务ID，登录控制台进行查看。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
     * Get 部署组ID，可通过调用[DescribeContainerGroups](https://cloud.tencent.com/document/api/649/36068)查询已创建的部署组列表或登录控制台进行查看；也可以调用[CreateContainGroup](https://cloud.tencent.com/document/api/649/36075)创建新的部署组。 
     * @return GroupId 部署组ID，可通过调用[DescribeContainerGroups](https://cloud.tencent.com/document/api/649/36068)查询已创建的部署组列表或登录控制台进行查看；也可以调用[CreateContainGroup](https://cloud.tencent.com/document/api/649/36075)创建新的部署组。
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 部署组ID，可通过调用[DescribeContainerGroups](https://cloud.tencent.com/document/api/649/36068)查询已创建的部署组列表或登录控制台进行查看；也可以调用[CreateContainGroup](https://cloud.tencent.com/document/api/649/36075)创建新的部署组。
     * @param GroupId 部署组ID，可通过调用[DescribeContainerGroups](https://cloud.tencent.com/document/api/649/36068)查询已创建的部署组列表或登录控制台进行查看；也可以调用[CreateContainGroup](https://cloud.tencent.com/document/api/649/36075)创建新的部署组。
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 偏移量，取值从0开始 
     * @return Offset 偏移量，取值从0开始
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，取值从0开始
     * @param Offset 偏移量，取值从0开始
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页个数，默认为20， 取值应为1~50 
     * @return Limit 分页个数，默认为20， 取值应为1~50
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页个数，默认为20， 取值应为1~50
     * @param Limit 分页个数，默认为20， 取值应为1~50
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 用于通过PodName字段过滤返回结果。 
     * @return PodNameList 用于通过PodName字段过滤返回结果。
     */
    public String [] getPodNameList() {
        return this.PodNameList;
    }

    /**
     * Set 用于通过PodName字段过滤返回结果。
     * @param PodNameList 用于通过PodName字段过滤返回结果。
     */
    public void setPodNameList(String [] PodNameList) {
        this.PodNameList = PodNameList;
    }

    /**
     * Get 新老版本pod批次标识，old表示老版本，new表示新版本。 
     * @return DeployVersion 新老版本pod批次标识，old表示老版本，new表示新版本。
     */
    public String getDeployVersion() {
        return this.DeployVersion;
    }

    /**
     * Set 新老版本pod批次标识，old表示老版本，new表示新版本。
     * @param DeployVersion 新老版本pod批次标识，old表示老版本，new表示新版本。
     */
    public void setDeployVersion(String DeployVersion) {
        this.DeployVersion = DeployVersion;
    }

    /**
     * Get 实例所属任务ID，登录控制台进行查看。 
     * @return TaskId 实例所属任务ID，登录控制台进行查看。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 实例所属任务ID，登录控制台进行查看。
     * @param TaskId 实例所属任务ID，登录控制台进行查看。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    public DescribePodInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePodInstancesRequest(DescribePodInstancesRequest source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.PodNameList != null) {
            this.PodNameList = new String[source.PodNameList.length];
            for (int i = 0; i < source.PodNameList.length; i++) {
                this.PodNameList[i] = new String(source.PodNameList[i]);
            }
        }
        if (source.DeployVersion != null) {
            this.DeployVersion = new String(source.DeployVersion);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "PodNameList.", this.PodNameList);
        this.setParamSimple(map, prefix + "DeployVersion", this.DeployVersion);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);

    }
}

