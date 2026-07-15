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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAgentConfigsResponse extends AbstractModel {

    /**
    * 采集配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogConfigs")
    @Expose
    private LogConfigInfo [] LogConfigs;

    /**
    * 服务日志的配置信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceLogConfigs")
    @Expose
    private ServiceLogConfigInfo [] ServiceLogConfigs;

    /**
    * 弃用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastVersion")
    @Expose
    private String LastVersion;

    /**
    * 弃用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NeedUpdate")
    @Expose
    private Boolean NeedUpdate;

    /**
    * 弃用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("URL")
    @Expose
    private String URL;

    /**
    * 弃用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileMd5")
    @Expose
    private String FileMd5;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 采集配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogConfigs 采集配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LogConfigInfo [] getLogConfigs() {
        return this.LogConfigs;
    }

    /**
     * Set 采集配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogConfigs 采集配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogConfigs(LogConfigInfo [] LogConfigs) {
        this.LogConfigs = LogConfigs;
    }

    /**
     * Get 服务日志的配置信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceLogConfigs 服务日志的配置信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ServiceLogConfigInfo [] getServiceLogConfigs() {
        return this.ServiceLogConfigs;
    }

    /**
     * Set 服务日志的配置信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceLogConfigs 服务日志的配置信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceLogConfigs(ServiceLogConfigInfo [] ServiceLogConfigs) {
        this.ServiceLogConfigs = ServiceLogConfigs;
    }

    /**
     * Get 弃用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastVersion 弃用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastVersion() {
        return this.LastVersion;
    }

    /**
     * Set 弃用
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastVersion 弃用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastVersion(String LastVersion) {
        this.LastVersion = LastVersion;
    }

    /**
     * Get 弃用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NeedUpdate 弃用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getNeedUpdate() {
        return this.NeedUpdate;
    }

    /**
     * Set 弃用
注意：此字段可能返回 null，表示取不到有效值。
     * @param NeedUpdate 弃用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNeedUpdate(Boolean NeedUpdate) {
        this.NeedUpdate = NeedUpdate;
    }

    /**
     * Get 弃用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return URL 弃用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getURL() {
        return this.URL;
    }

    /**
     * Set 弃用
注意：此字段可能返回 null，表示取不到有效值。
     * @param URL 弃用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setURL(String URL) {
        this.URL = URL;
    }

    /**
     * Get 弃用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileMd5 弃用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileMd5() {
        return this.FileMd5;
    }

    /**
     * Set 弃用
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileMd5 弃用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileMd5(String FileMd5) {
        this.FileMd5 = FileMd5;
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

    public DescribeAgentConfigsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAgentConfigsResponse(DescribeAgentConfigsResponse source) {
        if (source.LogConfigs != null) {
            this.LogConfigs = new LogConfigInfo[source.LogConfigs.length];
            for (int i = 0; i < source.LogConfigs.length; i++) {
                this.LogConfigs[i] = new LogConfigInfo(source.LogConfigs[i]);
            }
        }
        if (source.ServiceLogConfigs != null) {
            this.ServiceLogConfigs = new ServiceLogConfigInfo[source.ServiceLogConfigs.length];
            for (int i = 0; i < source.ServiceLogConfigs.length; i++) {
                this.ServiceLogConfigs[i] = new ServiceLogConfigInfo(source.ServiceLogConfigs[i]);
            }
        }
        if (source.LastVersion != null) {
            this.LastVersion = new String(source.LastVersion);
        }
        if (source.NeedUpdate != null) {
            this.NeedUpdate = new Boolean(source.NeedUpdate);
        }
        if (source.URL != null) {
            this.URL = new String(source.URL);
        }
        if (source.FileMd5 != null) {
            this.FileMd5 = new String(source.FileMd5);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "LogConfigs.", this.LogConfigs);
        this.setParamArrayObj(map, prefix + "ServiceLogConfigs.", this.ServiceLogConfigs);
        this.setParamSimple(map, prefix + "LastVersion", this.LastVersion);
        this.setParamSimple(map, prefix + "NeedUpdate", this.NeedUpdate);
        this.setParamSimple(map, prefix + "URL", this.URL);
        this.setParamSimple(map, prefix + "FileMd5", this.FileMd5);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

