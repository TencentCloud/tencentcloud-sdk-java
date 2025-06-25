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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AgentKnowledgeFilterTag extends AbstractModel {

    /**
    * 标签之间的关系;0:AND, 1:OR
    */
    @SerializedName("Operator")
    @Expose
    private Long Operator;

    /**
    * 标签
    */
    @SerializedName("Labels")
    @Expose
    private AgentKnowledgeAttrLabel [] Labels;

    /**
     * Get 标签之间的关系;0:AND, 1:OR 
     * @return Operator 标签之间的关系;0:AND, 1:OR
     */
    public Long getOperator() {
        return this.Operator;
    }

    /**
     * Set 标签之间的关系;0:AND, 1:OR
     * @param Operator 标签之间的关系;0:AND, 1:OR
     */
    public void setOperator(Long Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 标签 
     * @return Labels 标签
     */
    public AgentKnowledgeAttrLabel [] getLabels() {
        return this.Labels;
    }

    /**
     * Set 标签
     * @param Labels 标签
     */
    public void setLabels(AgentKnowledgeAttrLabel [] Labels) {
        this.Labels = Labels;
    }

    public AgentKnowledgeFilterTag() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentKnowledgeFilterTag(AgentKnowledgeFilterTag source) {
        if (source.Operator != null) {
            this.Operator = new Long(source.Operator);
        }
        if (source.Labels != null) {
            this.Labels = new AgentKnowledgeAttrLabel[source.Labels.length];
            for (int i = 0; i < source.Labels.length; i++) {
                this.Labels[i] = new AgentKnowledgeAttrLabel(source.Labels[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamArrayObj(map, prefix + "Labels.", this.Labels);

    }
}

