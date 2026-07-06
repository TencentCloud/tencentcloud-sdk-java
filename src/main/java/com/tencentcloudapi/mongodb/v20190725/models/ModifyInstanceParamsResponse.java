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

public class ModifyInstanceParamsResponse extends AbstractModel {

    /**
    * <p>修改参数配置是否生效。</p><ul><li>true：参数修改后的值已生效。</li><li>false：执行失败。</li></ul>
    */
    @SerializedName("Changed")
    @Expose
    private Boolean Changed;

    /**
    * <p>该参数暂时无意义(兼容前端保留)。</p>
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>修改参数配置是否生效。</p><ul><li>true：参数修改后的值已生效。</li><li>false：执行失败。</li></ul> 
     * @return Changed <p>修改参数配置是否生效。</p><ul><li>true：参数修改后的值已生效。</li><li>false：执行失败。</li></ul>
     */
    public Boolean getChanged() {
        return this.Changed;
    }

    /**
     * Set <p>修改参数配置是否生效。</p><ul><li>true：参数修改后的值已生效。</li><li>false：执行失败。</li></ul>
     * @param Changed <p>修改参数配置是否生效。</p><ul><li>true：参数修改后的值已生效。</li><li>false：执行失败。</li></ul>
     */
    public void setChanged(Boolean Changed) {
        this.Changed = Changed;
    }

    /**
     * Get <p>该参数暂时无意义(兼容前端保留)。</p> 
     * @return TaskId <p>该参数暂时无意义(兼容前端保留)。</p>
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>该参数暂时无意义(兼容前端保留)。</p>
     * @param TaskId <p>该参数暂时无意义(兼容前端保留)。</p>
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public ModifyInstanceParamsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyInstanceParamsResponse(ModifyInstanceParamsResponse source) {
        if (source.Changed != null) {
            this.Changed = new Boolean(source.Changed);
        }
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Changed", this.Changed);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

