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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeModuleDetailResponse extends AbstractModel{

    /**
    * 模块的详细信息，详细见数据结构中的ModuleInfo。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Module")
    @Expose
    private Module Module;

    /**
    * 模块的统计信息，详细见数据结构中的ModuleCounterInfo。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModuleCounter")
    @Expose
    private ModuleCounter ModuleCounter;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 模块的详细信息，详细见数据结构中的ModuleInfo。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Module 模块的详细信息，详细见数据结构中的ModuleInfo。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Module getModule() {
        return this.Module;
    }

    /**
     * Set 模块的详细信息，详细见数据结构中的ModuleInfo。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Module 模块的详细信息，详细见数据结构中的ModuleInfo。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModule(Module Module) {
        this.Module = Module;
    }

    /**
     * Get 模块的统计信息，详细见数据结构中的ModuleCounterInfo。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModuleCounter 模块的统计信息，详细见数据结构中的ModuleCounterInfo。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ModuleCounter getModuleCounter() {
        return this.ModuleCounter;
    }

    /**
     * Set 模块的统计信息，详细见数据结构中的ModuleCounterInfo。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModuleCounter 模块的统计信息，详细见数据结构中的ModuleCounterInfo。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModuleCounter(ModuleCounter ModuleCounter) {
        this.ModuleCounter = ModuleCounter;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Module.", this.Module);
        this.setParamObj(map, prefix + "ModuleCounter.", this.ModuleCounter);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

