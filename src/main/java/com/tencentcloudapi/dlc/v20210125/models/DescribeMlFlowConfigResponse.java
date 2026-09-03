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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMlFlowConfigResponse extends AbstractModel {

    /**
    * <p>MLflow 的实验 ID，对应训练作业配置</p>
    */
    @SerializedName("ExperimentID")
    @Expose
    private String ExperimentID;

    /**
    * <p>MLflow 的 RunID，对应训练作业实例 ID</p>
    */
    @SerializedName("RunID")
    @Expose
    private String RunID;

    /**
    * <p>实例级 MLflow 模式：local / remote / none。云上一般为 Remote</p><p>枚举值：</p><ul><li>remote： 使用远程 MLflow </li><li>local： 使用本地启动的 MLflow</li><li>none： 不启用 MLflow</li></ul>
    */
    @SerializedName("MlFlowMode")
    @Expose
    private String MlFlowMode;

    /**
    * <p>实例级 MLflow 访问 URL</p>
    */
    @SerializedName("MlFlowUrl")
    @Expose
    private String MlFlowUrl;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>MLflow 的实验 ID，对应训练作业配置</p> 
     * @return ExperimentID <p>MLflow 的实验 ID，对应训练作业配置</p>
     */
    public String getExperimentID() {
        return this.ExperimentID;
    }

    /**
     * Set <p>MLflow 的实验 ID，对应训练作业配置</p>
     * @param ExperimentID <p>MLflow 的实验 ID，对应训练作业配置</p>
     */
    public void setExperimentID(String ExperimentID) {
        this.ExperimentID = ExperimentID;
    }

    /**
     * Get <p>MLflow 的 RunID，对应训练作业实例 ID</p> 
     * @return RunID <p>MLflow 的 RunID，对应训练作业实例 ID</p>
     */
    public String getRunID() {
        return this.RunID;
    }

    /**
     * Set <p>MLflow 的 RunID，对应训练作业实例 ID</p>
     * @param RunID <p>MLflow 的 RunID，对应训练作业实例 ID</p>
     */
    public void setRunID(String RunID) {
        this.RunID = RunID;
    }

    /**
     * Get <p>实例级 MLflow 模式：local / remote / none。云上一般为 Remote</p><p>枚举值：</p><ul><li>remote： 使用远程 MLflow </li><li>local： 使用本地启动的 MLflow</li><li>none： 不启用 MLflow</li></ul> 
     * @return MlFlowMode <p>实例级 MLflow 模式：local / remote / none。云上一般为 Remote</p><p>枚举值：</p><ul><li>remote： 使用远程 MLflow </li><li>local： 使用本地启动的 MLflow</li><li>none： 不启用 MLflow</li></ul>
     */
    public String getMlFlowMode() {
        return this.MlFlowMode;
    }

    /**
     * Set <p>实例级 MLflow 模式：local / remote / none。云上一般为 Remote</p><p>枚举值：</p><ul><li>remote： 使用远程 MLflow </li><li>local： 使用本地启动的 MLflow</li><li>none： 不启用 MLflow</li></ul>
     * @param MlFlowMode <p>实例级 MLflow 模式：local / remote / none。云上一般为 Remote</p><p>枚举值：</p><ul><li>remote： 使用远程 MLflow </li><li>local： 使用本地启动的 MLflow</li><li>none： 不启用 MLflow</li></ul>
     */
    public void setMlFlowMode(String MlFlowMode) {
        this.MlFlowMode = MlFlowMode;
    }

    /**
     * Get <p>实例级 MLflow 访问 URL</p> 
     * @return MlFlowUrl <p>实例级 MLflow 访问 URL</p>
     */
    public String getMlFlowUrl() {
        return this.MlFlowUrl;
    }

    /**
     * Set <p>实例级 MLflow 访问 URL</p>
     * @param MlFlowUrl <p>实例级 MLflow 访问 URL</p>
     */
    public void setMlFlowUrl(String MlFlowUrl) {
        this.MlFlowUrl = MlFlowUrl;
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

    public DescribeMlFlowConfigResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMlFlowConfigResponse(DescribeMlFlowConfigResponse source) {
        if (source.ExperimentID != null) {
            this.ExperimentID = new String(source.ExperimentID);
        }
        if (source.RunID != null) {
            this.RunID = new String(source.RunID);
        }
        if (source.MlFlowMode != null) {
            this.MlFlowMode = new String(source.MlFlowMode);
        }
        if (source.MlFlowUrl != null) {
            this.MlFlowUrl = new String(source.MlFlowUrl);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExperimentID", this.ExperimentID);
        this.setParamSimple(map, prefix + "RunID", this.RunID);
        this.setParamSimple(map, prefix + "MlFlowMode", this.MlFlowMode);
        this.setParamSimple(map, prefix + "MlFlowUrl", this.MlFlowUrl);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

