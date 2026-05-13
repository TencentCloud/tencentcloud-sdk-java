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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AIRoundPath extends AbstractModel {

    /**
    * <p>画布中的节点名称</p>
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * <p>画布中的节点类型</p><p>枚举值：</p><ul><li>DIALOGUE： 对话节点</li><li>API_CALL： 接口调用节点</li><li>TRANSFER： 转接节点</li><li>KEY_PRESS： 按键节点</li><li>END_CALL： 挂断节点</li></ul>
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * <p>经过当前节点的时间戳</p><p>单位：ms</p>
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
     * Get <p>画布中的节点名称</p> 
     * @return NodeName <p>画布中的节点名称</p>
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set <p>画布中的节点名称</p>
     * @param NodeName <p>画布中的节点名称</p>
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get <p>画布中的节点类型</p><p>枚举值：</p><ul><li>DIALOGUE： 对话节点</li><li>API_CALL： 接口调用节点</li><li>TRANSFER： 转接节点</li><li>KEY_PRESS： 按键节点</li><li>END_CALL： 挂断节点</li></ul> 
     * @return NodeType <p>画布中的节点类型</p><p>枚举值：</p><ul><li>DIALOGUE： 对话节点</li><li>API_CALL： 接口调用节点</li><li>TRANSFER： 转接节点</li><li>KEY_PRESS： 按键节点</li><li>END_CALL： 挂断节点</li></ul>
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set <p>画布中的节点类型</p><p>枚举值：</p><ul><li>DIALOGUE： 对话节点</li><li>API_CALL： 接口调用节点</li><li>TRANSFER： 转接节点</li><li>KEY_PRESS： 按键节点</li><li>END_CALL： 挂断节点</li></ul>
     * @param NodeType <p>画布中的节点类型</p><p>枚举值：</p><ul><li>DIALOGUE： 对话节点</li><li>API_CALL： 接口调用节点</li><li>TRANSFER： 转接节点</li><li>KEY_PRESS： 按键节点</li><li>END_CALL： 挂断节点</li></ul>
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get <p>经过当前节点的时间戳</p><p>单位：ms</p> 
     * @return Timestamp <p>经过当前节点的时间戳</p><p>单位：ms</p>
     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set <p>经过当前节点的时间戳</p><p>单位：ms</p>
     * @param Timestamp <p>经过当前节点的时间戳</p><p>单位：ms</p>
     */
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
    }

    public AIRoundPath() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIRoundPath(AIRoundPath source) {
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.Timestamp != null) {
            this.Timestamp = new Long(source.Timestamp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);

    }
}

