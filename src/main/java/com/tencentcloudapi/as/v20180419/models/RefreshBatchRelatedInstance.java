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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RefreshBatchRelatedInstance extends AbstractModel {

    /**
    * 实例 ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 刷新实例状态。如果在刷新时实例被移出或销毁，状态会更新为 NOT_FOUND。取值如下：<li>WAITING：待刷新</li><li>INIT：初始化中</li><li>RUNNING：刷新中</li><li>FAILED：刷新失败</li><li>CANCELLED：已取消</li><li>SUCCESSFUL：刷新成功</li><li>NOT_FOUND：实例不存在</li>
    */
    @SerializedName("InstanceStatus")
    @Expose
    private String InstanceStatus;

    /**
    * 实例刷新中最近一次伸缩活动 ID，可通过 DescribeAutoScalingActivities 接口查询。
需注意伸缩活动与实例刷新活动不同，一次实例刷新活动可能包括多次伸缩活动。
    */
    @SerializedName("LastActivityId")
    @Expose
    private String LastActivityId;

    /**
    * 实例刷新状态信息。
    */
    @SerializedName("InstanceStatusMessage")
    @Expose
    private String InstanceStatusMessage;

    /**
     * Get 实例 ID。 
     * @return InstanceId 实例 ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID。
     * @param InstanceId 实例 ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 刷新实例状态。如果在刷新时实例被移出或销毁，状态会更新为 NOT_FOUND。取值如下：<li>WAITING：待刷新</li><li>INIT：初始化中</li><li>RUNNING：刷新中</li><li>FAILED：刷新失败</li><li>CANCELLED：已取消</li><li>SUCCESSFUL：刷新成功</li><li>NOT_FOUND：实例不存在</li> 
     * @return InstanceStatus 刷新实例状态。如果在刷新时实例被移出或销毁，状态会更新为 NOT_FOUND。取值如下：<li>WAITING：待刷新</li><li>INIT：初始化中</li><li>RUNNING：刷新中</li><li>FAILED：刷新失败</li><li>CANCELLED：已取消</li><li>SUCCESSFUL：刷新成功</li><li>NOT_FOUND：实例不存在</li>
     */
    public String getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set 刷新实例状态。如果在刷新时实例被移出或销毁，状态会更新为 NOT_FOUND。取值如下：<li>WAITING：待刷新</li><li>INIT：初始化中</li><li>RUNNING：刷新中</li><li>FAILED：刷新失败</li><li>CANCELLED：已取消</li><li>SUCCESSFUL：刷新成功</li><li>NOT_FOUND：实例不存在</li>
     * @param InstanceStatus 刷新实例状态。如果在刷新时实例被移出或销毁，状态会更新为 NOT_FOUND。取值如下：<li>WAITING：待刷新</li><li>INIT：初始化中</li><li>RUNNING：刷新中</li><li>FAILED：刷新失败</li><li>CANCELLED：已取消</li><li>SUCCESSFUL：刷新成功</li><li>NOT_FOUND：实例不存在</li>
     */
    public void setInstanceStatus(String InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    /**
     * Get 实例刷新中最近一次伸缩活动 ID，可通过 DescribeAutoScalingActivities 接口查询。
需注意伸缩活动与实例刷新活动不同，一次实例刷新活动可能包括多次伸缩活动。 
     * @return LastActivityId 实例刷新中最近一次伸缩活动 ID，可通过 DescribeAutoScalingActivities 接口查询。
需注意伸缩活动与实例刷新活动不同，一次实例刷新活动可能包括多次伸缩活动。
     */
    public String getLastActivityId() {
        return this.LastActivityId;
    }

    /**
     * Set 实例刷新中最近一次伸缩活动 ID，可通过 DescribeAutoScalingActivities 接口查询。
需注意伸缩活动与实例刷新活动不同，一次实例刷新活动可能包括多次伸缩活动。
     * @param LastActivityId 实例刷新中最近一次伸缩活动 ID，可通过 DescribeAutoScalingActivities 接口查询。
需注意伸缩活动与实例刷新活动不同，一次实例刷新活动可能包括多次伸缩活动。
     */
    public void setLastActivityId(String LastActivityId) {
        this.LastActivityId = LastActivityId;
    }

    /**
     * Get 实例刷新状态信息。 
     * @return InstanceStatusMessage 实例刷新状态信息。
     */
    public String getInstanceStatusMessage() {
        return this.InstanceStatusMessage;
    }

    /**
     * Set 实例刷新状态信息。
     * @param InstanceStatusMessage 实例刷新状态信息。
     */
    public void setInstanceStatusMessage(String InstanceStatusMessage) {
        this.InstanceStatusMessage = InstanceStatusMessage;
    }

    public RefreshBatchRelatedInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RefreshBatchRelatedInstance(RefreshBatchRelatedInstance source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceStatus != null) {
            this.InstanceStatus = new String(source.InstanceStatus);
        }
        if (source.LastActivityId != null) {
            this.LastActivityId = new String(source.LastActivityId);
        }
        if (source.InstanceStatusMessage != null) {
            this.InstanceStatusMessage = new String(source.InstanceStatusMessage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceStatus", this.InstanceStatus);
        this.setParamSimple(map, prefix + "LastActivityId", this.LastActivityId);
        this.setParamSimple(map, prefix + "InstanceStatusMessage", this.InstanceStatusMessage);

    }
}

