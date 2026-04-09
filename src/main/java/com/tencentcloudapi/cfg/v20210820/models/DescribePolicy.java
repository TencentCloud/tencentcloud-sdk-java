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
package com.tencentcloudapi.cfg.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePolicy extends AbstractModel {

    /**
    * <p>保护策略ID列表</p>
    */
    @SerializedName("TaskPolicyIdList")
    @Expose
    private String [] TaskPolicyIdList;

    /**
    * <p>保护策略状态</p><p>枚举值：</p><ul><li>已触发： 表示已触发护栏策略</li><li>未触发： 表示未触发护栏策略</li><li>已恢复： 表示护栏策略已恢复</li></ul>
    */
    @SerializedName("TaskPolicyStatus")
    @Expose
    private String TaskPolicyStatus;

    /**
    * <p>策略规则</p>
    */
    @SerializedName("TaskPolicyRule")
    @Expose
    private String TaskPolicyRule;

    /**
    * <p>护栏策略生效处理策略 1:顺序执行，2:暂停</p>
    */
    @SerializedName("TaskPolicyDealType")
    @Expose
    private Long TaskPolicyDealType;

    /**
     * Get <p>保护策略ID列表</p> 
     * @return TaskPolicyIdList <p>保护策略ID列表</p>
     */
    public String [] getTaskPolicyIdList() {
        return this.TaskPolicyIdList;
    }

    /**
     * Set <p>保护策略ID列表</p>
     * @param TaskPolicyIdList <p>保护策略ID列表</p>
     */
    public void setTaskPolicyIdList(String [] TaskPolicyIdList) {
        this.TaskPolicyIdList = TaskPolicyIdList;
    }

    /**
     * Get <p>保护策略状态</p><p>枚举值：</p><ul><li>已触发： 表示已触发护栏策略</li><li>未触发： 表示未触发护栏策略</li><li>已恢复： 表示护栏策略已恢复</li></ul> 
     * @return TaskPolicyStatus <p>保护策略状态</p><p>枚举值：</p><ul><li>已触发： 表示已触发护栏策略</li><li>未触发： 表示未触发护栏策略</li><li>已恢复： 表示护栏策略已恢复</li></ul>
     */
    public String getTaskPolicyStatus() {
        return this.TaskPolicyStatus;
    }

    /**
     * Set <p>保护策略状态</p><p>枚举值：</p><ul><li>已触发： 表示已触发护栏策略</li><li>未触发： 表示未触发护栏策略</li><li>已恢复： 表示护栏策略已恢复</li></ul>
     * @param TaskPolicyStatus <p>保护策略状态</p><p>枚举值：</p><ul><li>已触发： 表示已触发护栏策略</li><li>未触发： 表示未触发护栏策略</li><li>已恢复： 表示护栏策略已恢复</li></ul>
     */
    public void setTaskPolicyStatus(String TaskPolicyStatus) {
        this.TaskPolicyStatus = TaskPolicyStatus;
    }

    /**
     * Get <p>策略规则</p> 
     * @return TaskPolicyRule <p>策略规则</p>
     */
    public String getTaskPolicyRule() {
        return this.TaskPolicyRule;
    }

    /**
     * Set <p>策略规则</p>
     * @param TaskPolicyRule <p>策略规则</p>
     */
    public void setTaskPolicyRule(String TaskPolicyRule) {
        this.TaskPolicyRule = TaskPolicyRule;
    }

    /**
     * Get <p>护栏策略生效处理策略 1:顺序执行，2:暂停</p> 
     * @return TaskPolicyDealType <p>护栏策略生效处理策略 1:顺序执行，2:暂停</p>
     */
    public Long getTaskPolicyDealType() {
        return this.TaskPolicyDealType;
    }

    /**
     * Set <p>护栏策略生效处理策略 1:顺序执行，2:暂停</p>
     * @param TaskPolicyDealType <p>护栏策略生效处理策略 1:顺序执行，2:暂停</p>
     */
    public void setTaskPolicyDealType(Long TaskPolicyDealType) {
        this.TaskPolicyDealType = TaskPolicyDealType;
    }

    public DescribePolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePolicy(DescribePolicy source) {
        if (source.TaskPolicyIdList != null) {
            this.TaskPolicyIdList = new String[source.TaskPolicyIdList.length];
            for (int i = 0; i < source.TaskPolicyIdList.length; i++) {
                this.TaskPolicyIdList[i] = new String(source.TaskPolicyIdList[i]);
            }
        }
        if (source.TaskPolicyStatus != null) {
            this.TaskPolicyStatus = new String(source.TaskPolicyStatus);
        }
        if (source.TaskPolicyRule != null) {
            this.TaskPolicyRule = new String(source.TaskPolicyRule);
        }
        if (source.TaskPolicyDealType != null) {
            this.TaskPolicyDealType = new Long(source.TaskPolicyDealType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "TaskPolicyIdList.", this.TaskPolicyIdList);
        this.setParamSimple(map, prefix + "TaskPolicyStatus", this.TaskPolicyStatus);
        this.setParamSimple(map, prefix + "TaskPolicyRule", this.TaskPolicyRule);
        this.setParamSimple(map, prefix + "TaskPolicyDealType", this.TaskPolicyDealType);

    }
}

