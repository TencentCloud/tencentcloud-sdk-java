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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBInstanceConfigResponse  extends AbstractModel{

    /**
    * 主库数据保护方式，主实例属性，可能的返回值：0-异步复制方式，1-半同步复制方式，2-强同步复制方式。
    */
    @SerializedName("ProtectMode")
    @Expose
    private Integer ProtectMode;

    /**
    * 主库部署方式，主实例属性，可能的返回值：0-单可用部署，1-多可用区部署。
    */
    @SerializedName("DeployMode")
    @Expose
    private Integer DeployMode;

    /**
    * 主库可用区的正式名称，如ap-shanghai-1。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 从库的配置信息。
    */
    @SerializedName("SlaveConfig")
    @Expose
    private SlaveConfig SlaveConfig;

    /**
    * ECDB第二个从库的配置信息，只有ECDB实例才有这个字段。
    */
    @SerializedName("BackupConfig")
    @Expose
    private BackupConfig BackupConfig;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取主库数据保护方式，主实例属性，可能的返回值：0-异步复制方式，1-半同步复制方式，2-强同步复制方式。
     * @return ProtectMode 主库数据保护方式，主实例属性，可能的返回值：0-异步复制方式，1-半同步复制方式，2-强同步复制方式。
     */
    public Integer getProtectMode() {
        return this.ProtectMode;
    }

    /**
     * 设置主库数据保护方式，主实例属性，可能的返回值：0-异步复制方式，1-半同步复制方式，2-强同步复制方式。
     * @param ProtectMode 主库数据保护方式，主实例属性，可能的返回值：0-异步复制方式，1-半同步复制方式，2-强同步复制方式。
     */
    public void setProtectMode(Integer ProtectMode) {
        this.ProtectMode = ProtectMode;
    }

    /**
     * 获取主库部署方式，主实例属性，可能的返回值：0-单可用部署，1-多可用区部署。
     * @return DeployMode 主库部署方式，主实例属性，可能的返回值：0-单可用部署，1-多可用区部署。
     */
    public Integer getDeployMode() {
        return this.DeployMode;
    }

    /**
     * 设置主库部署方式，主实例属性，可能的返回值：0-单可用部署，1-多可用区部署。
     * @param DeployMode 主库部署方式，主实例属性，可能的返回值：0-单可用部署，1-多可用区部署。
     */
    public void setDeployMode(Integer DeployMode) {
        this.DeployMode = DeployMode;
    }

    /**
     * 获取主库可用区的正式名称，如ap-shanghai-1。
     * @return Zone 主库可用区的正式名称，如ap-shanghai-1。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * 设置主库可用区的正式名称，如ap-shanghai-1。
     * @param Zone 主库可用区的正式名称，如ap-shanghai-1。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * 获取从库的配置信息。
     * @return SlaveConfig 从库的配置信息。
     */
    public SlaveConfig getSlaveConfig() {
        return this.SlaveConfig;
    }

    /**
     * 设置从库的配置信息。
     * @param SlaveConfig 从库的配置信息。
     */
    public void setSlaveConfig(SlaveConfig SlaveConfig) {
        this.SlaveConfig = SlaveConfig;
    }

    /**
     * 获取ECDB第二个从库的配置信息，只有ECDB实例才有这个字段。
     * @return BackupConfig ECDB第二个从库的配置信息，只有ECDB实例才有这个字段。
     */
    public BackupConfig getBackupConfig() {
        return this.BackupConfig;
    }

    /**
     * 设置ECDB第二个从库的配置信息，只有ECDB实例才有这个字段。
     * @param BackupConfig ECDB第二个从库的配置信息，只有ECDB实例才有这个字段。
     */
    public void setBackupConfig(BackupConfig BackupConfig) {
        this.BackupConfig = BackupConfig;
    }

    /**
     * 获取唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProtectMode", this.ProtectMode);
        this.setParamSimple(map, prefix + "DeployMode", this.DeployMode);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamObj(map, prefix + "SlaveConfig.", this.SlaveConfig);
        this.setParamObj(map, prefix + "BackupConfig.", this.BackupConfig);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

