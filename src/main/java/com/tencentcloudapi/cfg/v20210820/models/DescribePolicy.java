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
package com.tencentcloudapi.cfg.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePolicy extends AbstractModel{

    /**
    * 保护策略ID列表
    */
    @SerializedName("TaskPolicyIdList")
    @Expose
    private String [] TaskPolicyIdList;

    /**
    * 保护策略状态
    */
    @SerializedName("TaskPolicyStatus")
    @Expose
    private String TaskPolicyStatus;

    /**
    * 策略规则
    */
    @SerializedName("TaskPolicyRule")
    @Expose
    private String TaskPolicyRule;

    /**
    * 护栏策略生效处理策略 1:顺序执行，2:暂停
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskPolicyDealType")
    @Expose
    private Long TaskPolicyDealType;

    /**
     * Get 保护策略ID列表 
     * @return TaskPolicyIdList 保护策略ID列表
     */
    public String [] getTaskPolicyIdList() {
        return this.TaskPolicyIdList;
    }

    /**
     * Set 保护策略ID列表
     * @param TaskPolicyIdList 保护策略ID列表
     */
    public void setTaskPolicyIdList(String [] TaskPolicyIdList) {
        this.TaskPolicyIdList = TaskPolicyIdList;
    }

    /**
     * Get 保护策略状态 
     * @return TaskPolicyStatus 保护策略状态
     */
    public String getTaskPolicyStatus() {
        return this.TaskPolicyStatus;
    }

    /**
     * Set 保护策略状态
     * @param TaskPolicyStatus 保护策略状态
     */
    public void setTaskPolicyStatus(String TaskPolicyStatus) {
        this.TaskPolicyStatus = TaskPolicyStatus;
    }

    /**
     * Get 策略规则 
     * @return TaskPolicyRule 策略规则
     */
    public String getTaskPolicyRule() {
        return this.TaskPolicyRule;
    }

    /**
     * Set 策略规则
     * @param TaskPolicyRule 策略规则
     */
    public void setTaskPolicyRule(String TaskPolicyRule) {
        this.TaskPolicyRule = TaskPolicyRule;
    }

    /**
     * Get 护栏策略生效处理策略 1:顺序执行，2:暂停
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskPolicyDealType 护栏策略生效处理策略 1:顺序执行，2:暂停
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTaskPolicyDealType() {
        return this.TaskPolicyDealType;
    }

    /**
     * Set 护栏策略生效处理策略 1:顺序执行，2:暂停
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskPolicyDealType 护栏策略生效处理策略 1:顺序执行，2:暂停
注意：此字段可能返回 null，表示取不到有效值。
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

