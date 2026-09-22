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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TopologyEdge extends AbstractModel {

    /**
    * <p>源实体 ID</p>
    */
    @SerializedName("SrcEntityId")
    @Expose
    private String SrcEntityId;

    /**
    * <p>目的实体 ID</p>
    */
    @SerializedName("DstEntityId")
    @Expose
    private String DstEntityId;

    /**
    * <p>关系类型：contains / same_as / calls</p><p>枚举值：</p><ul><li>contains： 包含关系，A 包含 B</li><li>same_as： 等价关系，A 等价 B</li><li>calls： 调用关系， A 调用 B</li></ul><p>默认值：-</p>
    */
    @SerializedName("RelationType")
    @Expose
    private String RelationType;

    /**
     * Get <p>源实体 ID</p> 
     * @return SrcEntityId <p>源实体 ID</p>
     */
    public String getSrcEntityId() {
        return this.SrcEntityId;
    }

    /**
     * Set <p>源实体 ID</p>
     * @param SrcEntityId <p>源实体 ID</p>
     */
    public void setSrcEntityId(String SrcEntityId) {
        this.SrcEntityId = SrcEntityId;
    }

    /**
     * Get <p>目的实体 ID</p> 
     * @return DstEntityId <p>目的实体 ID</p>
     */
    public String getDstEntityId() {
        return this.DstEntityId;
    }

    /**
     * Set <p>目的实体 ID</p>
     * @param DstEntityId <p>目的实体 ID</p>
     */
    public void setDstEntityId(String DstEntityId) {
        this.DstEntityId = DstEntityId;
    }

    /**
     * Get <p>关系类型：contains / same_as / calls</p><p>枚举值：</p><ul><li>contains： 包含关系，A 包含 B</li><li>same_as： 等价关系，A 等价 B</li><li>calls： 调用关系， A 调用 B</li></ul><p>默认值：-</p> 
     * @return RelationType <p>关系类型：contains / same_as / calls</p><p>枚举值：</p><ul><li>contains： 包含关系，A 包含 B</li><li>same_as： 等价关系，A 等价 B</li><li>calls： 调用关系， A 调用 B</li></ul><p>默认值：-</p>
     */
    public String getRelationType() {
        return this.RelationType;
    }

    /**
     * Set <p>关系类型：contains / same_as / calls</p><p>枚举值：</p><ul><li>contains： 包含关系，A 包含 B</li><li>same_as： 等价关系，A 等价 B</li><li>calls： 调用关系， A 调用 B</li></ul><p>默认值：-</p>
     * @param RelationType <p>关系类型：contains / same_as / calls</p><p>枚举值：</p><ul><li>contains： 包含关系，A 包含 B</li><li>same_as： 等价关系，A 等价 B</li><li>calls： 调用关系， A 调用 B</li></ul><p>默认值：-</p>
     */
    public void setRelationType(String RelationType) {
        this.RelationType = RelationType;
    }

    public TopologyEdge() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TopologyEdge(TopologyEdge source) {
        if (source.SrcEntityId != null) {
            this.SrcEntityId = new String(source.SrcEntityId);
        }
        if (source.DstEntityId != null) {
            this.DstEntityId = new String(source.DstEntityId);
        }
        if (source.RelationType != null) {
            this.RelationType = new String(source.RelationType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SrcEntityId", this.SrcEntityId);
        this.setParamSimple(map, prefix + "DstEntityId", this.DstEntityId);
        this.setParamSimple(map, prefix + "RelationType", this.RelationType);

    }
}

