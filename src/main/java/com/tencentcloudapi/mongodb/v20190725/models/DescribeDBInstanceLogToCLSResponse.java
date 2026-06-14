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

public class DescribeDBInstanceLogToCLSResponse extends AbstractModel {

    /**
    * <p>实例错误日志投递配置</p>
    */
    @SerializedName("ErrorLog")
    @Expose
    private LogToCLSConfig ErrorLog;

    /**
    * <p>实例慢日志投递配置</p>
    */
    @SerializedName("SlowLog")
    @Expose
    private LogToCLSConfig SlowLog;

    /**
    * <p>实例操作日志投递配置</p>
    */
    @SerializedName("OperationLog")
    @Expose
    private LogToCLSConfig OperationLog;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>实例错误日志投递配置</p> 
     * @return ErrorLog <p>实例错误日志投递配置</p>
     */
    public LogToCLSConfig getErrorLog() {
        return this.ErrorLog;
    }

    /**
     * Set <p>实例错误日志投递配置</p>
     * @param ErrorLog <p>实例错误日志投递配置</p>
     */
    public void setErrorLog(LogToCLSConfig ErrorLog) {
        this.ErrorLog = ErrorLog;
    }

    /**
     * Get <p>实例慢日志投递配置</p> 
     * @return SlowLog <p>实例慢日志投递配置</p>
     */
    public LogToCLSConfig getSlowLog() {
        return this.SlowLog;
    }

    /**
     * Set <p>实例慢日志投递配置</p>
     * @param SlowLog <p>实例慢日志投递配置</p>
     */
    public void setSlowLog(LogToCLSConfig SlowLog) {
        this.SlowLog = SlowLog;
    }

    /**
     * Get <p>实例操作日志投递配置</p> 
     * @return OperationLog <p>实例操作日志投递配置</p>
     */
    public LogToCLSConfig getOperationLog() {
        return this.OperationLog;
    }

    /**
     * Set <p>实例操作日志投递配置</p>
     * @param OperationLog <p>实例操作日志投递配置</p>
     */
    public void setOperationLog(LogToCLSConfig OperationLog) {
        this.OperationLog = OperationLog;
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
        if (source.OperationLog != null) {
            this.OperationLog = new LogToCLSConfig(source.OperationLog);
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
        this.setParamObj(map, prefix + "OperationLog.", this.OperationLog);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

