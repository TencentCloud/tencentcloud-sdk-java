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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVpcRuleOverviewRequest extends AbstractModel{

    /**
    * EdgeId值两个vpc间的边id  不是必填项可以为空，就是所有vpc间的访问控制规则
    */
    @SerializedName("EdgeId")
    @Expose
    private String EdgeId;

    /**
     * Get EdgeId值两个vpc间的边id  不是必填项可以为空，就是所有vpc间的访问控制规则 
     * @return EdgeId EdgeId值两个vpc间的边id  不是必填项可以为空，就是所有vpc间的访问控制规则
     */
    public String getEdgeId() {
        return this.EdgeId;
    }

    /**
     * Set EdgeId值两个vpc间的边id  不是必填项可以为空，就是所有vpc间的访问控制规则
     * @param EdgeId EdgeId值两个vpc间的边id  不是必填项可以为空，就是所有vpc间的访问控制规则
     */
    public void setEdgeId(String EdgeId) {
        this.EdgeId = EdgeId;
    }

    public DescribeVpcRuleOverviewRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVpcRuleOverviewRequest(DescribeVpcRuleOverviewRequest source) {
        if (source.EdgeId != null) {
            this.EdgeId = new String(source.EdgeId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EdgeId", this.EdgeId);

    }
}

