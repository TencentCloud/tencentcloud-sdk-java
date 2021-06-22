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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WebNodeTypeInfo extends AbstractModel{

    /**
    * 可视化节点个数，固定为1
    */
    @SerializedName("NodeNum")
    @Expose
    private Long NodeNum;

    /**
    * 可视化节点规格
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
     * Get 可视化节点个数，固定为1 
     * @return NodeNum 可视化节点个数，固定为1
     */
    public Long getNodeNum() {
        return this.NodeNum;
    }

    /**
     * Set 可视化节点个数，固定为1
     * @param NodeNum 可视化节点个数，固定为1
     */
    public void setNodeNum(Long NodeNum) {
        this.NodeNum = NodeNum;
    }

    /**
     * Get 可视化节点规格 
     * @return NodeType 可视化节点规格
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set 可视化节点规格
     * @param NodeType 可视化节点规格
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    public WebNodeTypeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WebNodeTypeInfo(WebNodeTypeInfo source) {
        if (source.NodeNum != null) {
            this.NodeNum = new Long(source.NodeNum);
        }
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeNum", this.NodeNum);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);

    }
}

