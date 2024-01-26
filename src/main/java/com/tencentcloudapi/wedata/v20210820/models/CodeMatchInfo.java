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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CodeMatchInfo extends AbstractModel {

    /**
    * 行号
    */
    @SerializedName("Number")
    @Expose
    private Long Number;

    /**
    * 行内容
    */
    @SerializedName("Line")
    @Expose
    private String Line;

    /**
    * 离线节点类型
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
     * Get 行号 
     * @return Number 行号
     */
    public Long getNumber() {
        return this.Number;
    }

    /**
     * Set 行号
     * @param Number 行号
     */
    public void setNumber(Long Number) {
        this.Number = Number;
    }

    /**
     * Get 行内容 
     * @return Line 行内容
     */
    public String getLine() {
        return this.Line;
    }

    /**
     * Set 行内容
     * @param Line 行内容
     */
    public void setLine(String Line) {
        this.Line = Line;
    }

    /**
     * Get 离线节点类型 
     * @return NodeType 离线节点类型
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set 离线节点类型
     * @param NodeType 离线节点类型
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    public CodeMatchInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CodeMatchInfo(CodeMatchInfo source) {
        if (source.Number != null) {
            this.Number = new Long(source.Number);
        }
        if (source.Line != null) {
            this.Line = new String(source.Line);
        }
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Number", this.Number);
        this.setParamSimple(map, prefix + "Line", this.Line);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);

    }
}

