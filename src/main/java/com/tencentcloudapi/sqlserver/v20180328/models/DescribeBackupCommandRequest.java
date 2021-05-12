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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBackupCommandRequest extends AbstractModel{

    /**
    * 备份文件类型，FULL-全量备份，FULL_LOG-全量备份需要日志增量，FULL_DIFF-全量备份需要差异增量，LOG-日志备份，DIFF-差异备份
    */
    @SerializedName("BackupFileType")
    @Expose
    private String BackupFileType;

    /**
    * 数据库名称
    */
    @SerializedName("DataBaseName")
    @Expose
    private String DataBaseName;

    /**
    * 是否需要恢复，NO-不需要，YES-需要
    */
    @SerializedName("IsRecovery")
    @Expose
    private String IsRecovery;

    /**
    * 备份文件保存的路径；如果不填则默认在D:\\
    */
    @SerializedName("LocalPath")
    @Expose
    private String LocalPath;

    /**
     * Get 备份文件类型，FULL-全量备份，FULL_LOG-全量备份需要日志增量，FULL_DIFF-全量备份需要差异增量，LOG-日志备份，DIFF-差异备份 
     * @return BackupFileType 备份文件类型，FULL-全量备份，FULL_LOG-全量备份需要日志增量，FULL_DIFF-全量备份需要差异增量，LOG-日志备份，DIFF-差异备份
     */
    public String getBackupFileType() {
        return this.BackupFileType;
    }

    /**
     * Set 备份文件类型，FULL-全量备份，FULL_LOG-全量备份需要日志增量，FULL_DIFF-全量备份需要差异增量，LOG-日志备份，DIFF-差异备份
     * @param BackupFileType 备份文件类型，FULL-全量备份，FULL_LOG-全量备份需要日志增量，FULL_DIFF-全量备份需要差异增量，LOG-日志备份，DIFF-差异备份
     */
    public void setBackupFileType(String BackupFileType) {
        this.BackupFileType = BackupFileType;
    }

    /**
     * Get 数据库名称 
     * @return DataBaseName 数据库名称
     */
    public String getDataBaseName() {
        return this.DataBaseName;
    }

    /**
     * Set 数据库名称
     * @param DataBaseName 数据库名称
     */
    public void setDataBaseName(String DataBaseName) {
        this.DataBaseName = DataBaseName;
    }

    /**
     * Get 是否需要恢复，NO-不需要，YES-需要 
     * @return IsRecovery 是否需要恢复，NO-不需要，YES-需要
     */
    public String getIsRecovery() {
        return this.IsRecovery;
    }

    /**
     * Set 是否需要恢复，NO-不需要，YES-需要
     * @param IsRecovery 是否需要恢复，NO-不需要，YES-需要
     */
    public void setIsRecovery(String IsRecovery) {
        this.IsRecovery = IsRecovery;
    }

    /**
     * Get 备份文件保存的路径；如果不填则默认在D:\\ 
     * @return LocalPath 备份文件保存的路径；如果不填则默认在D:\\
     */
    public String getLocalPath() {
        return this.LocalPath;
    }

    /**
     * Set 备份文件保存的路径；如果不填则默认在D:\\
     * @param LocalPath 备份文件保存的路径；如果不填则默认在D:\\
     */
    public void setLocalPath(String LocalPath) {
        this.LocalPath = LocalPath;
    }

    public DescribeBackupCommandRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBackupCommandRequest(DescribeBackupCommandRequest source) {
        if (source.BackupFileType != null) {
            this.BackupFileType = new String(source.BackupFileType);
        }
        if (source.DataBaseName != null) {
            this.DataBaseName = new String(source.DataBaseName);
        }
        if (source.IsRecovery != null) {
            this.IsRecovery = new String(source.IsRecovery);
        }
        if (source.LocalPath != null) {
            this.LocalPath = new String(source.LocalPath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BackupFileType", this.BackupFileType);
        this.setParamSimple(map, prefix + "DataBaseName", this.DataBaseName);
        this.setParamSimple(map, prefix + "IsRecovery", this.IsRecovery);
        this.setParamSimple(map, prefix + "LocalPath", this.LocalPath);

    }
}

