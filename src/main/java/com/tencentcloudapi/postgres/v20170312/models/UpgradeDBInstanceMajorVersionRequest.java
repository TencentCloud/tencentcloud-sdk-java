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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpgradeDBInstanceMajorVersionRequest extends AbstractModel {

    /**
    * 实例ID。可通过[DescribeDBInstances](https://cloud.tencent.com/document/api/409/16773)接口获取
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * 目标内核版本号，可以通过API [DescribeDBVersions](https://cloud.tencent.com/document/product/409/89018)获取可以升级的目标内核版本号。
    */
    @SerializedName("TargetDBKernelVersion")
    @Expose
    private String TargetDBKernelVersion;

    /**
    * 是否为校验模式，若UpgradeCheck为True，表示仅进行内核版本兼容性检查，不会进行实质性的升级操作，对原实例无影响。检查结果可以通过升级日志查看。
    */
    @SerializedName("UpgradeCheck")
    @Expose
    private Boolean UpgradeCheck;

    /**
    * 升级前备份选项。True，表示升级前需要创建全量备份，False，表示升级前不需要创建全量备份。当实例已有备份集可以恢复到升级前的状态时，可选择False，否则需要指定为True。UpgradeCheck为True时，此参数无效。
    */
    @SerializedName("BackupBeforeUpgrade")
    @Expose
    private Boolean BackupBeforeUpgrade;

    /**
    * 统计信息收集选项，对主例运行 ANALYZE 以在升级后更新系统统计信息。可选值包括，
0：不需要收集统计信息；
1：实例恢复写之前收集统计信息；
3：实例恢复写之后收集统计信息。
UpgradeCheck为True时，此参数无效。
    */
    @SerializedName("StatisticsRefreshOption")
    @Expose
    private Long StatisticsRefreshOption;

    /**
    * 插件升级选项，pg_upgrade不会升级任何插件，需要在升级完成后在创建过插件的库上执行"ALTER EXTENSION UPDATE"。发起升级实例大版本时可以指定在实例恢复写前/后是否需要升级任务自动升级插件版本。可选值包括：
0：不需要自动升级插件；
1：恢复写之前升级插件；
2：恢复写之后升级插件。
UpgradeCheck为True时，此参数无效。
    */
    @SerializedName("ExtensionUpgradeOption")
    @Expose
    private Long ExtensionUpgradeOption;

    /**
    * 升级时间选项，升级过程中会有一段时间实例只读，并会有一次秒级闪断，发起升级时需要选择这段影响的时间窗。可选值包括：
0：自动执行，不需要指定时间窗；
1：指定本次升级任务的时间窗，通过参数UpgradeTimeBegin和UpgradeTimeEnd设置；
2：在实例运维时间窗内执行。
UpgradeCheck为True时，此参数无效。
    */
    @SerializedName("UpgradeTimeOption")
    @Expose
    private Long UpgradeTimeOption;

    /**
    * 升级时间窗开始时间，时间格式：HH:MM:SS，例如：01:00:00。当UpgradeTimeOption为1时，该参数有效。
UpgradeCheck为True时，此参数无效。
    */
    @SerializedName("UpgradeTimeBegin")
    @Expose
    private String UpgradeTimeBegin;

    /**
    * 升级时间窗截止时间，时间格式：HH:MM:SS，例如：02:00:00。当UpgradeTimeOption为1时，该参数有效。
UpgradeCheck为True时，此参数无效。
    */
    @SerializedName("UpgradeTimeEnd")
    @Expose
    private String UpgradeTimeEnd;

    /**
     * Get 实例ID。可通过[DescribeDBInstances](https://cloud.tencent.com/document/api/409/16773)接口获取 
     * @return DBInstanceId 实例ID。可通过[DescribeDBInstances](https://cloud.tencent.com/document/api/409/16773)接口获取
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set 实例ID。可通过[DescribeDBInstances](https://cloud.tencent.com/document/api/409/16773)接口获取
     * @param DBInstanceId 实例ID。可通过[DescribeDBInstances](https://cloud.tencent.com/document/api/409/16773)接口获取
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get 目标内核版本号，可以通过API [DescribeDBVersions](https://cloud.tencent.com/document/product/409/89018)获取可以升级的目标内核版本号。 
     * @return TargetDBKernelVersion 目标内核版本号，可以通过API [DescribeDBVersions](https://cloud.tencent.com/document/product/409/89018)获取可以升级的目标内核版本号。
     */
    public String getTargetDBKernelVersion() {
        return this.TargetDBKernelVersion;
    }

    /**
     * Set 目标内核版本号，可以通过API [DescribeDBVersions](https://cloud.tencent.com/document/product/409/89018)获取可以升级的目标内核版本号。
     * @param TargetDBKernelVersion 目标内核版本号，可以通过API [DescribeDBVersions](https://cloud.tencent.com/document/product/409/89018)获取可以升级的目标内核版本号。
     */
    public void setTargetDBKernelVersion(String TargetDBKernelVersion) {
        this.TargetDBKernelVersion = TargetDBKernelVersion;
    }

    /**
     * Get 是否为校验模式，若UpgradeCheck为True，表示仅进行内核版本兼容性检查，不会进行实质性的升级操作，对原实例无影响。检查结果可以通过升级日志查看。 
     * @return UpgradeCheck 是否为校验模式，若UpgradeCheck为True，表示仅进行内核版本兼容性检查，不会进行实质性的升级操作，对原实例无影响。检查结果可以通过升级日志查看。
     */
    public Boolean getUpgradeCheck() {
        return this.UpgradeCheck;
    }

    /**
     * Set 是否为校验模式，若UpgradeCheck为True，表示仅进行内核版本兼容性检查，不会进行实质性的升级操作，对原实例无影响。检查结果可以通过升级日志查看。
     * @param UpgradeCheck 是否为校验模式，若UpgradeCheck为True，表示仅进行内核版本兼容性检查，不会进行实质性的升级操作，对原实例无影响。检查结果可以通过升级日志查看。
     */
    public void setUpgradeCheck(Boolean UpgradeCheck) {
        this.UpgradeCheck = UpgradeCheck;
    }

    /**
     * Get 升级前备份选项。True，表示升级前需要创建全量备份，False，表示升级前不需要创建全量备份。当实例已有备份集可以恢复到升级前的状态时，可选择False，否则需要指定为True。UpgradeCheck为True时，此参数无效。 
     * @return BackupBeforeUpgrade 升级前备份选项。True，表示升级前需要创建全量备份，False，表示升级前不需要创建全量备份。当实例已有备份集可以恢复到升级前的状态时，可选择False，否则需要指定为True。UpgradeCheck为True时，此参数无效。
     */
    public Boolean getBackupBeforeUpgrade() {
        return this.BackupBeforeUpgrade;
    }

    /**
     * Set 升级前备份选项。True，表示升级前需要创建全量备份，False，表示升级前不需要创建全量备份。当实例已有备份集可以恢复到升级前的状态时，可选择False，否则需要指定为True。UpgradeCheck为True时，此参数无效。
     * @param BackupBeforeUpgrade 升级前备份选项。True，表示升级前需要创建全量备份，False，表示升级前不需要创建全量备份。当实例已有备份集可以恢复到升级前的状态时，可选择False，否则需要指定为True。UpgradeCheck为True时，此参数无效。
     */
    public void setBackupBeforeUpgrade(Boolean BackupBeforeUpgrade) {
        this.BackupBeforeUpgrade = BackupBeforeUpgrade;
    }

    /**
     * Get 统计信息收集选项，对主例运行 ANALYZE 以在升级后更新系统统计信息。可选值包括，
0：不需要收集统计信息；
1：实例恢复写之前收集统计信息；
3：实例恢复写之后收集统计信息。
UpgradeCheck为True时，此参数无效。 
     * @return StatisticsRefreshOption 统计信息收集选项，对主例运行 ANALYZE 以在升级后更新系统统计信息。可选值包括，
0：不需要收集统计信息；
1：实例恢复写之前收集统计信息；
3：实例恢复写之后收集统计信息。
UpgradeCheck为True时，此参数无效。
     */
    public Long getStatisticsRefreshOption() {
        return this.StatisticsRefreshOption;
    }

    /**
     * Set 统计信息收集选项，对主例运行 ANALYZE 以在升级后更新系统统计信息。可选值包括，
0：不需要收集统计信息；
1：实例恢复写之前收集统计信息；
3：实例恢复写之后收集统计信息。
UpgradeCheck为True时，此参数无效。
     * @param StatisticsRefreshOption 统计信息收集选项，对主例运行 ANALYZE 以在升级后更新系统统计信息。可选值包括，
0：不需要收集统计信息；
1：实例恢复写之前收集统计信息；
3：实例恢复写之后收集统计信息。
UpgradeCheck为True时，此参数无效。
     */
    public void setStatisticsRefreshOption(Long StatisticsRefreshOption) {
        this.StatisticsRefreshOption = StatisticsRefreshOption;
    }

    /**
     * Get 插件升级选项，pg_upgrade不会升级任何插件，需要在升级完成后在创建过插件的库上执行"ALTER EXTENSION UPDATE"。发起升级实例大版本时可以指定在实例恢复写前/后是否需要升级任务自动升级插件版本。可选值包括：
0：不需要自动升级插件；
1：恢复写之前升级插件；
2：恢复写之后升级插件。
UpgradeCheck为True时，此参数无效。 
     * @return ExtensionUpgradeOption 插件升级选项，pg_upgrade不会升级任何插件，需要在升级完成后在创建过插件的库上执行"ALTER EXTENSION UPDATE"。发起升级实例大版本时可以指定在实例恢复写前/后是否需要升级任务自动升级插件版本。可选值包括：
0：不需要自动升级插件；
1：恢复写之前升级插件；
2：恢复写之后升级插件。
UpgradeCheck为True时，此参数无效。
     */
    public Long getExtensionUpgradeOption() {
        return this.ExtensionUpgradeOption;
    }

    /**
     * Set 插件升级选项，pg_upgrade不会升级任何插件，需要在升级完成后在创建过插件的库上执行"ALTER EXTENSION UPDATE"。发起升级实例大版本时可以指定在实例恢复写前/后是否需要升级任务自动升级插件版本。可选值包括：
0：不需要自动升级插件；
1：恢复写之前升级插件；
2：恢复写之后升级插件。
UpgradeCheck为True时，此参数无效。
     * @param ExtensionUpgradeOption 插件升级选项，pg_upgrade不会升级任何插件，需要在升级完成后在创建过插件的库上执行"ALTER EXTENSION UPDATE"。发起升级实例大版本时可以指定在实例恢复写前/后是否需要升级任务自动升级插件版本。可选值包括：
0：不需要自动升级插件；
1：恢复写之前升级插件；
2：恢复写之后升级插件。
UpgradeCheck为True时，此参数无效。
     */
    public void setExtensionUpgradeOption(Long ExtensionUpgradeOption) {
        this.ExtensionUpgradeOption = ExtensionUpgradeOption;
    }

    /**
     * Get 升级时间选项，升级过程中会有一段时间实例只读，并会有一次秒级闪断，发起升级时需要选择这段影响的时间窗。可选值包括：
0：自动执行，不需要指定时间窗；
1：指定本次升级任务的时间窗，通过参数UpgradeTimeBegin和UpgradeTimeEnd设置；
2：在实例运维时间窗内执行。
UpgradeCheck为True时，此参数无效。 
     * @return UpgradeTimeOption 升级时间选项，升级过程中会有一段时间实例只读，并会有一次秒级闪断，发起升级时需要选择这段影响的时间窗。可选值包括：
0：自动执行，不需要指定时间窗；
1：指定本次升级任务的时间窗，通过参数UpgradeTimeBegin和UpgradeTimeEnd设置；
2：在实例运维时间窗内执行。
UpgradeCheck为True时，此参数无效。
     */
    public Long getUpgradeTimeOption() {
        return this.UpgradeTimeOption;
    }

    /**
     * Set 升级时间选项，升级过程中会有一段时间实例只读，并会有一次秒级闪断，发起升级时需要选择这段影响的时间窗。可选值包括：
0：自动执行，不需要指定时间窗；
1：指定本次升级任务的时间窗，通过参数UpgradeTimeBegin和UpgradeTimeEnd设置；
2：在实例运维时间窗内执行。
UpgradeCheck为True时，此参数无效。
     * @param UpgradeTimeOption 升级时间选项，升级过程中会有一段时间实例只读，并会有一次秒级闪断，发起升级时需要选择这段影响的时间窗。可选值包括：
0：自动执行，不需要指定时间窗；
1：指定本次升级任务的时间窗，通过参数UpgradeTimeBegin和UpgradeTimeEnd设置；
2：在实例运维时间窗内执行。
UpgradeCheck为True时，此参数无效。
     */
    public void setUpgradeTimeOption(Long UpgradeTimeOption) {
        this.UpgradeTimeOption = UpgradeTimeOption;
    }

    /**
     * Get 升级时间窗开始时间，时间格式：HH:MM:SS，例如：01:00:00。当UpgradeTimeOption为1时，该参数有效。
UpgradeCheck为True时，此参数无效。 
     * @return UpgradeTimeBegin 升级时间窗开始时间，时间格式：HH:MM:SS，例如：01:00:00。当UpgradeTimeOption为1时，该参数有效。
UpgradeCheck为True时，此参数无效。
     */
    public String getUpgradeTimeBegin() {
        return this.UpgradeTimeBegin;
    }

    /**
     * Set 升级时间窗开始时间，时间格式：HH:MM:SS，例如：01:00:00。当UpgradeTimeOption为1时，该参数有效。
UpgradeCheck为True时，此参数无效。
     * @param UpgradeTimeBegin 升级时间窗开始时间，时间格式：HH:MM:SS，例如：01:00:00。当UpgradeTimeOption为1时，该参数有效。
UpgradeCheck为True时，此参数无效。
     */
    public void setUpgradeTimeBegin(String UpgradeTimeBegin) {
        this.UpgradeTimeBegin = UpgradeTimeBegin;
    }

    /**
     * Get 升级时间窗截止时间，时间格式：HH:MM:SS，例如：02:00:00。当UpgradeTimeOption为1时，该参数有效。
UpgradeCheck为True时，此参数无效。 
     * @return UpgradeTimeEnd 升级时间窗截止时间，时间格式：HH:MM:SS，例如：02:00:00。当UpgradeTimeOption为1时，该参数有效。
UpgradeCheck为True时，此参数无效。
     */
    public String getUpgradeTimeEnd() {
        return this.UpgradeTimeEnd;
    }

    /**
     * Set 升级时间窗截止时间，时间格式：HH:MM:SS，例如：02:00:00。当UpgradeTimeOption为1时，该参数有效。
UpgradeCheck为True时，此参数无效。
     * @param UpgradeTimeEnd 升级时间窗截止时间，时间格式：HH:MM:SS，例如：02:00:00。当UpgradeTimeOption为1时，该参数有效。
UpgradeCheck为True时，此参数无效。
     */
    public void setUpgradeTimeEnd(String UpgradeTimeEnd) {
        this.UpgradeTimeEnd = UpgradeTimeEnd;
    }

    public UpgradeDBInstanceMajorVersionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpgradeDBInstanceMajorVersionRequest(UpgradeDBInstanceMajorVersionRequest source) {
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
        }
        if (source.TargetDBKernelVersion != null) {
            this.TargetDBKernelVersion = new String(source.TargetDBKernelVersion);
        }
        if (source.UpgradeCheck != null) {
            this.UpgradeCheck = new Boolean(source.UpgradeCheck);
        }
        if (source.BackupBeforeUpgrade != null) {
            this.BackupBeforeUpgrade = new Boolean(source.BackupBeforeUpgrade);
        }
        if (source.StatisticsRefreshOption != null) {
            this.StatisticsRefreshOption = new Long(source.StatisticsRefreshOption);
        }
        if (source.ExtensionUpgradeOption != null) {
            this.ExtensionUpgradeOption = new Long(source.ExtensionUpgradeOption);
        }
        if (source.UpgradeTimeOption != null) {
            this.UpgradeTimeOption = new Long(source.UpgradeTimeOption);
        }
        if (source.UpgradeTimeBegin != null) {
            this.UpgradeTimeBegin = new String(source.UpgradeTimeBegin);
        }
        if (source.UpgradeTimeEnd != null) {
            this.UpgradeTimeEnd = new String(source.UpgradeTimeEnd);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "TargetDBKernelVersion", this.TargetDBKernelVersion);
        this.setParamSimple(map, prefix + "UpgradeCheck", this.UpgradeCheck);
        this.setParamSimple(map, prefix + "BackupBeforeUpgrade", this.BackupBeforeUpgrade);
        this.setParamSimple(map, prefix + "StatisticsRefreshOption", this.StatisticsRefreshOption);
        this.setParamSimple(map, prefix + "ExtensionUpgradeOption", this.ExtensionUpgradeOption);
        this.setParamSimple(map, prefix + "UpgradeTimeOption", this.UpgradeTimeOption);
        this.setParamSimple(map, prefix + "UpgradeTimeBegin", this.UpgradeTimeBegin);
        this.setParamSimple(map, prefix + "UpgradeTimeEnd", this.UpgradeTimeEnd);

    }
}

