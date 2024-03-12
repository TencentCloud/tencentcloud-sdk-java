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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBInstanceLogToCLSResponse extends AbstractModel {

    /**
    * 错误日志投递CLS配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorLog")
    @Expose
    private LogToCLSConfig ErrorLog;

    /**
    * 慢日志投递CLS配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SlowLog")
    @Expose
    private LogToCLSConfig SlowLog;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 错误日志投递CLS配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorLog 错误日志投递CLS配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LogToCLSConfig getErrorLog() {
        return this.ErrorLog;
    }

    /**
     * Set 错误日志投递CLS配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorLog 错误日志投递CLS配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorLog(LogToCLSConfig ErrorLog) {
        this.ErrorLog = ErrorLog;
    }

    /**
     * Get 慢日志投递CLS配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SlowLog 慢日志投递CLS配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LogToCLSConfig getSlowLog() {
        return this.SlowLog;
    }

    /**
     * Set 慢日志投递CLS配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param SlowLog 慢日志投递CLS配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSlowLog(LogToCLSConfig SlowLog) {
        this.SlowLog = SlowLog;
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

    public DescribeDBInstanceLogToCLSResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBInstanceLogToCLSResponse(DescribeDBInstanceLogToCLSResponse source) {
        if (source.ErrorLog != null) {
            this.ErrorLog = new LogToCLSConfig(source.ErrorLog);
        }
        if (source.SlowLog != null) {
            this.SlowLog = new LogToCLSConfig(source.SlowLog);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ErrorLog.", this.ErrorLog);
        this.setParamObj(map, prefix + "SlowLog.", this.SlowLog);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

