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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClusterAsGroup extends AbstractModel {

    /**
    * 伸缩组ID
    */
    @SerializedName("AutoScalingGroupId")
    @Expose
    private String AutoScalingGroupId;

    /**
    * 伸缩组状态(开启 enabled 开启中 enabling 关闭 disabled 关闭中 disabling 更新中 updating 删除中 deleting 开启缩容中 scaleDownEnabling 关闭缩容中 scaleDownDisabling)
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 节点是否设置成不可调度
    */
    @SerializedName("IsUnschedulable")
    @Expose
    private Boolean IsUnschedulable;

    /**
    * 伸缩组的label列表
    */
    @SerializedName("Labels")
    @Expose
    private Label [] Labels;

    /**
    * 创建时间
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
     * Get 伸缩组ID 
     * @return AutoScalingGroupId 伸缩组ID
     */
    public String getAutoScalingGroupId() {
        return this.AutoScalingGroupId;
    }

    /**
     * Set 伸缩组ID
     * @param AutoScalingGroupId 伸缩组ID
     */
    public void setAutoScalingGroupId(String AutoScalingGroupId) {
        this.AutoScalingGroupId = AutoScalingGroupId;
    }

    /**
     * Get 伸缩组状态(开启 enabled 开启中 enabling 关闭 disabled 关闭中 disabling 更新中 updating 删除中 deleting 开启缩容中 scaleDownEnabling 关闭缩容中 scaleDownDisabling) 
     * @return Status 伸缩组状态(开启 enabled 开启中 enabling 关闭 disabled 关闭中 disabling 更新中 updating 删除中 deleting 开启缩容中 scaleDownEnabling 关闭缩容中 scaleDownDisabling)
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 伸缩组状态(开启 enabled 开启中 enabling 关闭 disabled 关闭中 disabling 更新中 updating 删除中 deleting 开启缩容中 scaleDownEnabling 关闭缩容中 scaleDownDisabling)
     * @param Status 伸缩组状态(开启 enabled 开启中 enabling 关闭 disabled 关闭中 disabling 更新中 updating 删除中 deleting 开启缩容中 scaleDownEnabling 关闭缩容中 scaleDownDisabling)
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 节点是否设置成不可调度 
     * @return IsUnschedulable 节点是否设置成不可调度
     */
    public Boolean getIsUnschedulable() {
        return this.IsUnschedulable;
    }

    /**
     * Set 节点是否设置成不可调度
     * @param IsUnschedulable 节点是否设置成不可调度
     */
    public void setIsUnschedulable(Boolean IsUnschedulable) {
        this.IsUnschedulable = IsUnschedulable;
    }

    /**
     * Get 伸缩组的label列表 
     * @return Labels 伸缩组的label列表
     */
    public Label [] getLabels() {
        return this.Labels;
    }

    /**
     * Set 伸缩组的label列表
     * @param Labels 伸缩组的label列表
     */
    public void setLabels(Label [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get 创建时间 
     * @return CreatedTime 创建时间
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间
     * @param CreatedTime 创建时间
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    public ClusterAsGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterAsGroup(ClusterAsGroup source) {
        if (source.AutoScalingGroupId != null) {
            this.AutoScalingGroupId = new String(source.AutoScalingGroupId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.IsUnschedulable != null) {
            this.IsUnschedulable = new Boolean(source.IsUnschedulable);
        }
        if (source.Labels != null) {
            this.Labels = new Label[source.Labels.length];
            for (int i = 0; i < source.Labels.length; i++) {
                this.Labels[i] = new Label(source.Labels[i]);
            }
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoScalingGroupId", this.AutoScalingGroupId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "IsUnschedulable", this.IsUnschedulable);
        this.setParamArrayObj(map, prefix + "Labels.", this.Labels);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);

    }
}

