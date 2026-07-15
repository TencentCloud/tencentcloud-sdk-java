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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAsyncRequestInfoResponse extends AbstractModel {

    /**
    * <p>任务执行结果。</p><p>枚举值：</p><ul><li>INITIAL： 初始化。</li><li>RUNNING： 运行中。</li><li>SUCCESS： 执行成功。</li><li>FAILED： 执行失败。</li><li>KILLED： 已终止。</li><li>REMOVED： 已删除。</li><li>PAUSED： 终止中。</li><li>UNDEFINED： 任务已创建但未开始执行，在 WaitSwitch = true 场景下，表示任务正在等待维护时间窗到来。</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>任务执行信息描述。</p>
    */
    @SerializedName("Info")
    @Expose
    private String Info;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>任务执行结果。</p><p>枚举值：</p><ul><li>INITIAL： 初始化。</li><li>RUNNING： 运行中。</li><li>SUCCESS： 执行成功。</li><li>FAILED： 执行失败。</li><li>KILLED： 已终止。</li><li>REMOVED： 已删除。</li><li>PAUSED： 终止中。</li><li>UNDEFINED： 任务已创建但未开始执行，在 WaitSwitch = true 场景下，表示任务正在等待维护时间窗到来。</li></ul> 
     * @return Status <p>任务执行结果。</p><p>枚举值：</p><ul><li>INITIAL： 初始化。</li><li>RUNNING： 运行中。</li><li>SUCCESS： 执行成功。</li><li>FAILED： 执行失败。</li><li>KILLED： 已终止。</li><li>REMOVED： 已删除。</li><li>PAUSED： 终止中。</li><li>UNDEFINED： 任务已创建但未开始执行，在 WaitSwitch = true 场景下，表示任务正在等待维护时间窗到来。</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>任务执行结果。</p><p>枚举值：</p><ul><li>INITIAL： 初始化。</li><li>RUNNING： 运行中。</li><li>SUCCESS： 执行成功。</li><li>FAILED： 执行失败。</li><li>KILLED： 已终止。</li><li>REMOVED： 已删除。</li><li>PAUSED： 终止中。</li><li>UNDEFINED： 任务已创建但未开始执行，在 WaitSwitch = true 场景下，表示任务正在等待维护时间窗到来。</li></ul>
     * @param Status <p>任务执行结果。</p><p>枚举值：</p><ul><li>INITIAL： 初始化。</li><li>RUNNING： 运行中。</li><li>SUCCESS： 执行成功。</li><li>FAILED： 执行失败。</li><li>KILLED： 已终止。</li><li>REMOVED： 已删除。</li><li>PAUSED： 终止中。</li><li>UNDEFINED： 任务已创建但未开始执行，在 WaitSwitch = true 场景下，表示任务正在等待维护时间窗到来。</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>任务执行信息描述。</p> 
     * @return Info <p>任务执行信息描述。</p>
     */
    public String getInfo() {
        return this.Info;
    }

    /**
     * Set <p>任务执行信息描述。</p>
     * @param Info <p>任务执行信息描述。</p>
     */
    public void setInfo(String Info) {
        this.Info = Info;
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

    public DescribeAsyncRequestInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAsyncRequestInfoResponse(DescribeAsyncRequestInfoResponse source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Info != null) {
            this.Info = new String(source.Info);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Info", this.Info);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

