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

public class GenerateInternalTableResponse extends AbstractModel {

    /**
    * 返回sql
    */
    @SerializedName("Execution")
    @Expose
    private Execution Execution;

    /**
    * 是否tciceberg
    */
    @SerializedName("IsTIcebergSql")
    @Expose
    private Boolean IsTIcebergSql;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 返回sql 
     * @return Execution 返回sql
     */
    public Execution getExecution() {
        return this.Execution;
    }

    /**
     * Set 返回sql
     * @param Execution 返回sql
     */
    public void setExecution(Execution Execution) {
        this.Execution = Execution;
    }

    /**
     * Get 是否tciceberg 
     * @return IsTIcebergSql 是否tciceberg
     */
    public Boolean getIsTIcebergSql() {
        return this.IsTIcebergSql;
    }

    /**
     * Set 是否tciceberg
     * @param IsTIcebergSql 是否tciceberg
     */
    public void setIsTIcebergSql(Boolean IsTIcebergSql) {
        this.IsTIcebergSql = IsTIcebergSql;
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

    public GenerateInternalTableResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GenerateInternalTableResponse(GenerateInternalTableResponse source) {
        if (source.Execution != null) {
            this.Execution = new Execution(source.Execution);
        }
        if (source.IsTIcebergSql != null) {
            this.IsTIcebergSql = new Boolean(source.IsTIcebergSql);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Execution.", this.Execution);
        this.setParamSimple(map, prefix + "IsTIcebergSql", this.IsTIcebergSql);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

