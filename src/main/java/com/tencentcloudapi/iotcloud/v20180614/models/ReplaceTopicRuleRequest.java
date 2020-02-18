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
package com.tencentcloudapi.iotcloud.v20180614.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReplaceTopicRuleRequest extends AbstractModel{

    /**
    * 规则名称
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 替换的规则包体
    */
    @SerializedName("TopicRulePayload")
    @Expose
    private TopicRulePayload TopicRulePayload;

    /**
    * 修改类型，0：其他，1：创建行为，2：更新行为，3：删除行为
    */
    @SerializedName("ModifyType")
    @Expose
    private Long ModifyType;

    /**
    * action增删改变更填对应topicRulePayload里面第几个action
    */
    @SerializedName("ActionIndex")
    @Expose
    private Long ActionIndex;

    /**
     * Get 规则名称 
     * @return RuleName 规则名称
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 规则名称
     * @param RuleName 规则名称
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 替换的规则包体 
     * @return TopicRulePayload 替换的规则包体
     */
    public TopicRulePayload getTopicRulePayload() {
        return this.TopicRulePayload;
    }

    /**
     * Set 替换的规则包体
     * @param TopicRulePayload 替换的规则包体
     */
    public void setTopicRulePayload(TopicRulePayload TopicRulePayload) {
        this.TopicRulePayload = TopicRulePayload;
    }

    /**
     * Get 修改类型，0：其他，1：创建行为，2：更新行为，3：删除行为 
     * @return ModifyType 修改类型，0：其他，1：创建行为，2：更新行为，3：删除行为
     */
    public Long getModifyType() {
        return this.ModifyType;
    }

    /**
     * Set 修改类型，0：其他，1：创建行为，2：更新行为，3：删除行为
     * @param ModifyType 修改类型，0：其他，1：创建行为，2：更新行为，3：删除行为
     */
    public void setModifyType(Long ModifyType) {
        this.ModifyType = ModifyType;
    }

    /**
     * Get action增删改变更填对应topicRulePayload里面第几个action 
     * @return ActionIndex action增删改变更填对应topicRulePayload里面第几个action
     */
    public Long getActionIndex() {
        return this.ActionIndex;
    }

    /**
     * Set action增删改变更填对应topicRulePayload里面第几个action
     * @param ActionIndex action增删改变更填对应topicRulePayload里面第几个action
     */
    public void setActionIndex(Long ActionIndex) {
        this.ActionIndex = ActionIndex;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamObj(map, prefix + "TopicRulePayload.", this.TopicRulePayload);
        this.setParamSimple(map, prefix + "ModifyType", this.ModifyType);
        this.setParamSimple(map, prefix + "ActionIndex", this.ActionIndex);

    }
}

