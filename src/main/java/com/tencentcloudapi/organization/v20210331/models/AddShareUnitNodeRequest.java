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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddShareUnitNodeRequest extends AbstractModel {

    /**
    * <p>共享单元ID。</p>
    */
    @SerializedName("UnitId")
    @Expose
    private String UnitId;

    /**
    * <p>共享部门ID。</p>
    */
    @SerializedName("NodeId")
    @Expose
    private Long NodeId;

    /**
     * Get <p>共享单元ID。</p> 
     * @return UnitId <p>共享单元ID。</p>
     */
    public String getUnitId() {
        return this.UnitId;
    }

    /**
     * Set <p>共享单元ID。</p>
     * @param UnitId <p>共享单元ID。</p>
     */
    public void setUnitId(String UnitId) {
        this.UnitId = UnitId;
    }

    /**
     * Get <p>共享部门ID。</p> 
     * @return NodeId <p>共享部门ID。</p>
     */
    public Long getNodeId() {
        return this.NodeId;
    }

    /**
     * Set <p>共享部门ID。</p>
     * @param NodeId <p>共享部门ID。</p>
     */
    public void setNodeId(Long NodeId) {
        this.NodeId = NodeId;
    }

    public AddShareUnitNodeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddShareUnitNodeRequest(AddShareUnitNodeRequest source) {
        if (source.UnitId != null) {
            this.UnitId = new String(source.UnitId);
        }
        if (source.NodeId != null) {
            this.NodeId = new Long(source.NodeId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UnitId", this.UnitId);
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);

    }
}

