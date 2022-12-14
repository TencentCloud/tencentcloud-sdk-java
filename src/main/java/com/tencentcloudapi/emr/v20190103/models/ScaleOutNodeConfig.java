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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScaleOutNodeConfig extends AbstractModel{

    /**
    * 扩容节点类型取值范围：
  <li>MASTER</li>
  <li>TASK</li>
  <li>CORE</li>
  <li>ROUTER</li>
    */
    @SerializedName("NodeFlag")
    @Expose
    private String NodeFlag;

    /**
    * 扩容节点数量
    */
    @SerializedName("NodeCount")
    @Expose
    private Long NodeCount;

    /**
     * Get 扩容节点类型取值范围：
  <li>MASTER</li>
  <li>TASK</li>
  <li>CORE</li>
  <li>ROUTER</li> 
     * @return NodeFlag 扩容节点类型取值范围：
  <li>MASTER</li>
  <li>TASK</li>
  <li>CORE</li>
  <li>ROUTER</li>
     */
    public String getNodeFlag() {
        return this.NodeFlag;
    }

    /**
     * Set 扩容节点类型取值范围：
  <li>MASTER</li>
  <li>TASK</li>
  <li>CORE</li>
  <li>ROUTER</li>
     * @param NodeFlag 扩容节点类型取值范围：
  <li>MASTER</li>
  <li>TASK</li>
  <li>CORE</li>
  <li>ROUTER</li>
     */
    public void setNodeFlag(String NodeFlag) {
        this.NodeFlag = NodeFlag;
    }

    /**
     * Get 扩容节点数量 
     * @return NodeCount 扩容节点数量
     */
    public Long getNodeCount() {
        return this.NodeCount;
    }

    /**
     * Set 扩容节点数量
     * @param NodeCount 扩容节点数量
     */
    public void setNodeCount(Long NodeCount) {
        this.NodeCount = NodeCount;
    }

    public ScaleOutNodeConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScaleOutNodeConfig(ScaleOutNodeConfig source) {
        if (source.NodeFlag != null) {
            this.NodeFlag = new String(source.NodeFlag);
        }
        if (source.NodeCount != null) {
            this.NodeCount = new Long(source.NodeCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeFlag", this.NodeFlag);
        this.setParamSimple(map, prefix + "NodeCount", this.NodeCount);

    }
}

