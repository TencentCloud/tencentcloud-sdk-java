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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScaleUpDBInstanceCpuRequest extends AbstractModel {

    /**
    * <p>实例ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>要扩容的CPU核数（增量），每个节点都会增加这么多核数</p>
    */
    @SerializedName("ExtraCpu")
    @Expose
    private Long ExtraCpu;

    /**
     * Get <p>实例ID</p> 
     * @return InstanceId <p>实例ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例ID</p>
     * @param InstanceId <p>实例ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>要扩容的CPU核数（增量），每个节点都会增加这么多核数</p> 
     * @return ExtraCpu <p>要扩容的CPU核数（增量），每个节点都会增加这么多核数</p>
     */
    public Long getExtraCpu() {
        return this.ExtraCpu;
    }

    /**
     * Set <p>要扩容的CPU核数（增量），每个节点都会增加这么多核数</p>
     * @param ExtraCpu <p>要扩容的CPU核数（增量），每个节点都会增加这么多核数</p>
     */
    public void setExtraCpu(Long ExtraCpu) {
        this.ExtraCpu = ExtraCpu;
    }

    public ScaleUpDBInstanceCpuRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScaleUpDBInstanceCpuRequest(ScaleUpDBInstanceCpuRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ExtraCpu != null) {
            this.ExtraCpu = new Long(source.ExtraCpu);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ExtraCpu", this.ExtraCpu);

    }
}

