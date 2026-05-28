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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PreviewPGUserMigrationsResponse extends AbstractModel {

    /**
    * <p>将要执行的migration列表</p>
    */
    @SerializedName("Pending")
    @Expose
    private MigrationPlanItem [] Pending;

    /**
    * <p>已经应用的migration列表</p>
    */
    @SerializedName("Applied")
    @Expose
    private MigrationPlanItem [] Applied;

    /**
    * <p>版本相同但 checksum 不一致冲突的migration列表</p>
    */
    @SerializedName("Conflicts")
    @Expose
    private MigrationConflict [] Conflicts;

    /**
    * <p>是否可直接执行；当前仅表示没有 checksum 冲突</p>
    */
    @SerializedName("Executable")
    @Expose
    private Boolean Executable;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>将要执行的migration列表</p> 
     * @return Pending <p>将要执行的migration列表</p>
     */
    public MigrationPlanItem [] getPending() {
        return this.Pending;
    }

    /**
     * Set <p>将要执行的migration列表</p>
     * @param Pending <p>将要执行的migration列表</p>
     */
    public void setPending(MigrationPlanItem [] Pending) {
        this.Pending = Pending;
    }

    /**
     * Get <p>已经应用的migration列表</p> 
     * @return Applied <p>已经应用的migration列表</p>
     */
    public MigrationPlanItem [] getApplied() {
        return this.Applied;
    }

    /**
     * Set <p>已经应用的migration列表</p>
     * @param Applied <p>已经应用的migration列表</p>
     */
    public void setApplied(MigrationPlanItem [] Applied) {
        this.Applied = Applied;
    }

    /**
     * Get <p>版本相同但 checksum 不一致冲突的migration列表</p> 
     * @return Conflicts <p>版本相同但 checksum 不一致冲突的migration列表</p>
     */
    public MigrationConflict [] getConflicts() {
        return this.Conflicts;
    }

    /**
     * Set <p>版本相同但 checksum 不一致冲突的migration列表</p>
     * @param Conflicts <p>版本相同但 checksum 不一致冲突的migration列表</p>
     */
    public void setConflicts(MigrationConflict [] Conflicts) {
        this.Conflicts = Conflicts;
    }

    /**
     * Get <p>是否可直接执行；当前仅表示没有 checksum 冲突</p> 
     * @return Executable <p>是否可直接执行；当前仅表示没有 checksum 冲突</p>
     */
    public Boolean getExecutable() {
        return this.Executable;
    }

    /**
     * Set <p>是否可直接执行；当前仅表示没有 checksum 冲突</p>
     * @param Executable <p>是否可直接执行；当前仅表示没有 checksum 冲突</p>
     */
    public void setExecutable(Boolean Executable) {
        this.Executable = Executable;
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

    public PreviewPGUserMigrationsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PreviewPGUserMigrationsResponse(PreviewPGUserMigrationsResponse source) {
        if (source.Pending != null) {
            this.Pending = new MigrationPlanItem[source.Pending.length];
            for (int i = 0; i < source.Pending.length; i++) {
                this.Pending[i] = new MigrationPlanItem(source.Pending[i]);
            }
        }
        if (source.Applied != null) {
            this.Applied = new MigrationPlanItem[source.Applied.length];
            for (int i = 0; i < source.Applied.length; i++) {
                this.Applied[i] = new MigrationPlanItem(source.Applied[i]);
            }
        }
        if (source.Conflicts != null) {
            this.Conflicts = new MigrationConflict[source.Conflicts.length];
            for (int i = 0; i < source.Conflicts.length; i++) {
                this.Conflicts[i] = new MigrationConflict(source.Conflicts[i]);
            }
        }
        if (source.Executable != null) {
            this.Executable = new Boolean(source.Executable);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Pending.", this.Pending);
        this.setParamArrayObj(map, prefix + "Applied.", this.Applied);
        this.setParamArrayObj(map, prefix + "Conflicts.", this.Conflicts);
        this.setParamSimple(map, prefix + "Executable", this.Executable);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

