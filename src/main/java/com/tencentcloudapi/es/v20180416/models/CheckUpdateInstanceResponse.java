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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckUpdateInstanceResponse extends AbstractModel {

    /**
    * 是否允许变配操作
    */
    @SerializedName("AllowUpdate")
    @Expose
    private Boolean AllowUpdate;

    /**
    * 不允许变配的原因
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrMsg")
    @Expose
    private String ErrMsg;

    /**
    * 是否需要设置分片迁移并发相关参数
    */
    @SerializedName("NeedSetShards")
    @Expose
    private Boolean NeedSetShards;

    /**
    * 是否需要开启置放群组异步任务
    */
    @SerializedName("EnableScheduleRecoverGroupTask")
    @Expose
    private Boolean EnableScheduleRecoverGroupTask;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 是否允许变配操作 
     * @return AllowUpdate 是否允许变配操作
     */
    public Boolean getAllowUpdate() {
        return this.AllowUpdate;
    }

    /**
     * Set 是否允许变配操作
     * @param AllowUpdate 是否允许变配操作
     */
    public void setAllowUpdate(Boolean AllowUpdate) {
        this.AllowUpdate = AllowUpdate;
    }

    /**
     * Get 不允许变配的原因
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrMsg 不允许变配的原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrMsg() {
        return this.ErrMsg;
    }

    /**
     * Set 不允许变配的原因
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrMsg 不允许变配的原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrMsg(String ErrMsg) {
        this.ErrMsg = ErrMsg;
    }

    /**
     * Get 是否需要设置分片迁移并发相关参数 
     * @return NeedSetShards 是否需要设置分片迁移并发相关参数
     */
    public Boolean getNeedSetShards() {
        return this.NeedSetShards;
    }

    /**
     * Set 是否需要设置分片迁移并发相关参数
     * @param NeedSetShards 是否需要设置分片迁移并发相关参数
     */
    public void setNeedSetShards(Boolean NeedSetShards) {
        this.NeedSetShards = NeedSetShards;
    }

    /**
     * Get 是否需要开启置放群组异步任务 
     * @return EnableScheduleRecoverGroupTask 是否需要开启置放群组异步任务
     */
    public Boolean getEnableScheduleRecoverGroupTask() {
        return this.EnableScheduleRecoverGroupTask;
    }

    /**
     * Set 是否需要开启置放群组异步任务
     * @param EnableScheduleRecoverGroupTask 是否需要开启置放群组异步任务
     */
    public void setEnableScheduleRecoverGroupTask(Boolean EnableScheduleRecoverGroupTask) {
        this.EnableScheduleRecoverGroupTask = EnableScheduleRecoverGroupTask;
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

    public CheckUpdateInstanceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckUpdateInstanceResponse(CheckUpdateInstanceResponse source) {
        if (source.AllowUpdate != null) {
            this.AllowUpdate = new Boolean(source.AllowUpdate);
        }
        if (source.ErrMsg != null) {
            this.ErrMsg = new String(source.ErrMsg);
        }
        if (source.NeedSetShards != null) {
            this.NeedSetShards = new Boolean(source.NeedSetShards);
        }
        if (source.EnableScheduleRecoverGroupTask != null) {
            this.EnableScheduleRecoverGroupTask = new Boolean(source.EnableScheduleRecoverGroupTask);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AllowUpdate", this.AllowUpdate);
        this.setParamSimple(map, prefix + "ErrMsg", this.ErrMsg);
        this.setParamSimple(map, prefix + "NeedSetShards", this.NeedSetShards);
        this.setParamSimple(map, prefix + "EnableScheduleRecoverGroupTask", this.EnableScheduleRecoverGroupTask);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

