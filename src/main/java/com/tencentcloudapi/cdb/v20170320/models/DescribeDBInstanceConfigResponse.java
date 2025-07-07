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

public class DescribeDBInstanceConfigResponse extends AbstractModel {

    /**
    * 主实例数据保护方式，可能的返回值：0 - 异步复制方式，1 - 半同步复制方式，2 - 强同步复制方式。
    */
    @SerializedName("ProtectMode")
    @Expose
    private Long ProtectMode;

    /**
    * 主实例部署方式，可能的返回值：0 - 单可用部署，1 - 多可用区部署。
    */
    @SerializedName("DeployMode")
    @Expose
    private Long DeployMode;

    /**
    * 实例可用区信息，格式如 "ap-shanghai-1"。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 备库的配置信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SlaveConfig")
    @Expose
    private SlaveConfig SlaveConfig;

    /**
    * 强同步实例第二备库的配置信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BackupConfig")
    @Expose
    private BackupConfig BackupConfig;

    /**
    * 是否切换备库。
    */
    @SerializedName("Switched")
    @Expose
    private Boolean Switched;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 主实例数据保护方式，可能的返回值：0 - 异步复制方式，1 - 半同步复制方式，2 - 强同步复制方式。 
     * @return ProtectMode 主实例数据保护方式，可能的返回值：0 - 异步复制方式，1 - 半同步复制方式，2 - 强同步复制方式。
     */
    public Long getProtectMode() {
        return this.ProtectMode;
    }

    /**
     * Set 主实例数据保护方式，可能的返回值：0 - 异步复制方式，1 - 半同步复制方式，2 - 强同步复制方式。
     * @param ProtectMode 主实例数据保护方式，可能的返回值：0 - 异步复制方式，1 - 半同步复制方式，2 - 强同步复制方式。
     */
    public void setProtectMode(Long ProtectMode) {
        this.ProtectMode = ProtectMode;
    }

    /**
     * Get 主实例部署方式，可能的返回值：0 - 单可用部署，1 - 多可用区部署。 
     * @return DeployMode 主实例部署方式，可能的返回值：0 - 单可用部署，1 - 多可用区部署。
     */
    public Long getDeployMode() {
        return this.DeployMode;
    }

    /**
     * Set 主实例部署方式，可能的返回值：0 - 单可用部署，1 - 多可用区部署。
     * @param DeployMode 主实例部署方式，可能的返回值：0 - 单可用部署，1 - 多可用区部署。
     */
    public void setDeployMode(Long DeployMode) {
        this.DeployMode = DeployMode;
    }

    /**
     * Get 实例可用区信息，格式如 "ap-shanghai-1"。 
     * @return Zone 实例可用区信息，格式如 "ap-shanghai-1"。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 实例可用区信息，格式如 "ap-shanghai-1"。
     * @param Zone 实例可用区信息，格式如 "ap-shanghai-1"。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 备库的配置信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SlaveConfig 备库的配置信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SlaveConfig getSlaveConfig() {
        return this.SlaveConfig;
    }

    /**
     * Set 备库的配置信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SlaveConfig 备库的配置信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSlaveConfig(SlaveConfig SlaveConfig) {
        this.SlaveConfig = SlaveConfig;
    }

    /**
     * Get 强同步实例第二备库的配置信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BackupConfig 强同步实例第二备库的配置信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BackupConfig getBackupConfig() {
        return this.BackupConfig;
    }

    /**
     * Set 强同步实例第二备库的配置信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param BackupConfig 强同步实例第二备库的配置信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBackupConfig(BackupConfig BackupConfig) {
        this.BackupConfig = BackupConfig;
    }

    /**
     * Get 是否切换备库。 
     * @return Switched 是否切换备库。
     */
    public Boolean getSwitched() {
        return this.Switched;
    }

    /**
     * Set 是否切换备库。
     * @param Switched 是否切换备库。
     */
    public void setSwitched(Boolean Switched) {
        this.Switched = Switched;
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

    public DescribeDBInstanceConfigResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBInstanceConfigResponse(DescribeDBInstanceConfigResponse source) {
        if (source.ProtectMode != null) {
            this.ProtectMode = new Long(source.ProtectMode);
        }
        if (source.DeployMode != null) {
            this.DeployMode = new Long(source.DeployMode);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.SlaveConfig != null) {
            this.SlaveConfig = new SlaveConfig(source.SlaveConfig);
        }
        if (source.BackupConfig != null) {
            this.BackupConfig = new BackupConfig(source.BackupConfig);
        }
        if (source.Switched != null) {
            this.Switched = new Boolean(source.Switched);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProtectMode", this.ProtectMode);
        this.setParamSimple(map, prefix + "DeployMode", this.DeployMode);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamObj(map, prefix + "SlaveConfig.", this.SlaveConfig);
        this.setParamObj(map, prefix + "BackupConfig.", this.BackupConfig);
        this.setParamSimple(map, prefix + "Switched", this.Switched);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

