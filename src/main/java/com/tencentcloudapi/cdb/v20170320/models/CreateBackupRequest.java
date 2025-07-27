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

public class CreateBackupRequest extends AbstractModel {

    /**
    * 实例 ID，格式如：cdb-c1nl9rpv。与云数据库控制台页面中显示的实例 ID 相同。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 目标备份方法，可选的值：logical - 逻辑冷备，physical - 物理冷备，snapshot - 快照备份。基础版实例仅支持快照备份。
    */
    @SerializedName("BackupMethod")
    @Expose
    private String BackupMethod;

    /**
    * 需要备份的库表信息，如果不设置该参数，则默认整实例备份。在 BackupMethod=logical 逻辑备份中才可设置该参数。指定的库表必须存在，否则可能导致备份失败。
例：如果需要备份 db1 库的 tb1、tb2 表 和 db2 库。则该参数设置为 [{"Db": "db1", "Table": "tb1"}, {"Db": "db1", "Table": "tb2"}, {"Db": "db2"}]。
    */
    @SerializedName("BackupDBTableList")
    @Expose
    private BackupItem [] BackupDBTableList;

    /**
    * 手动备份别名，输入长度请在60个字符内。
    */
    @SerializedName("ManualBackupName")
    @Expose
    private String ManualBackupName;

    /**
    * 是否需要加密物理备份，可选值为：on - 是，off - 否。当 BackupMethod 为 physical 时，该值才有意义。不指定则使用实例备份默认加密策略，这里的默认加密策略指通过 [DescribeBackupEncryptionStatus](https://cloud.tencent.com/document/product/236/86508) 接口查询出的实例当前加密策略。
    */
    @SerializedName("EncryptionFlag")
    @Expose
    private String EncryptionFlag;

    /**
     * Get 实例 ID，格式如：cdb-c1nl9rpv。与云数据库控制台页面中显示的实例 ID 相同。 
     * @return InstanceId 实例 ID，格式如：cdb-c1nl9rpv。与云数据库控制台页面中显示的实例 ID 相同。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID，格式如：cdb-c1nl9rpv。与云数据库控制台页面中显示的实例 ID 相同。
     * @param InstanceId 实例 ID，格式如：cdb-c1nl9rpv。与云数据库控制台页面中显示的实例 ID 相同。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 目标备份方法，可选的值：logical - 逻辑冷备，physical - 物理冷备，snapshot - 快照备份。基础版实例仅支持快照备份。 
     * @return BackupMethod 目标备份方法，可选的值：logical - 逻辑冷备，physical - 物理冷备，snapshot - 快照备份。基础版实例仅支持快照备份。
     */
    public String getBackupMethod() {
        return this.BackupMethod;
    }

    /**
     * Set 目标备份方法，可选的值：logical - 逻辑冷备，physical - 物理冷备，snapshot - 快照备份。基础版实例仅支持快照备份。
     * @param BackupMethod 目标备份方法，可选的值：logical - 逻辑冷备，physical - 物理冷备，snapshot - 快照备份。基础版实例仅支持快照备份。
     */
    public void setBackupMethod(String BackupMethod) {
        this.BackupMethod = BackupMethod;
    }

    /**
     * Get 需要备份的库表信息，如果不设置该参数，则默认整实例备份。在 BackupMethod=logical 逻辑备份中才可设置该参数。指定的库表必须存在，否则可能导致备份失败。
例：如果需要备份 db1 库的 tb1、tb2 表 和 db2 库。则该参数设置为 [{"Db": "db1", "Table": "tb1"}, {"Db": "db1", "Table": "tb2"}, {"Db": "db2"}]。 
     * @return BackupDBTableList 需要备份的库表信息，如果不设置该参数，则默认整实例备份。在 BackupMethod=logical 逻辑备份中才可设置该参数。指定的库表必须存在，否则可能导致备份失败。
例：如果需要备份 db1 库的 tb1、tb2 表 和 db2 库。则该参数设置为 [{"Db": "db1", "Table": "tb1"}, {"Db": "db1", "Table": "tb2"}, {"Db": "db2"}]。
     */
    public BackupItem [] getBackupDBTableList() {
        return this.BackupDBTableList;
    }

    /**
     * Set 需要备份的库表信息，如果不设置该参数，则默认整实例备份。在 BackupMethod=logical 逻辑备份中才可设置该参数。指定的库表必须存在，否则可能导致备份失败。
例：如果需要备份 db1 库的 tb1、tb2 表 和 db2 库。则该参数设置为 [{"Db": "db1", "Table": "tb1"}, {"Db": "db1", "Table": "tb2"}, {"Db": "db2"}]。
     * @param BackupDBTableList 需要备份的库表信息，如果不设置该参数，则默认整实例备份。在 BackupMethod=logical 逻辑备份中才可设置该参数。指定的库表必须存在，否则可能导致备份失败。
例：如果需要备份 db1 库的 tb1、tb2 表 和 db2 库。则该参数设置为 [{"Db": "db1", "Table": "tb1"}, {"Db": "db1", "Table": "tb2"}, {"Db": "db2"}]。
     */
    public void setBackupDBTableList(BackupItem [] BackupDBTableList) {
        this.BackupDBTableList = BackupDBTableList;
    }

    /**
     * Get 手动备份别名，输入长度请在60个字符内。 
     * @return ManualBackupName 手动备份别名，输入长度请在60个字符内。
     */
    public String getManualBackupName() {
        return this.ManualBackupName;
    }

    /**
     * Set 手动备份别名，输入长度请在60个字符内。
     * @param ManualBackupName 手动备份别名，输入长度请在60个字符内。
     */
    public void setManualBackupName(String ManualBackupName) {
        this.ManualBackupName = ManualBackupName;
    }

    /**
     * Get 是否需要加密物理备份，可选值为：on - 是，off - 否。当 BackupMethod 为 physical 时，该值才有意义。不指定则使用实例备份默认加密策略，这里的默认加密策略指通过 [DescribeBackupEncryptionStatus](https://cloud.tencent.com/document/product/236/86508) 接口查询出的实例当前加密策略。 
     * @return EncryptionFlag 是否需要加密物理备份，可选值为：on - 是，off - 否。当 BackupMethod 为 physical 时，该值才有意义。不指定则使用实例备份默认加密策略，这里的默认加密策略指通过 [DescribeBackupEncryptionStatus](https://cloud.tencent.com/document/product/236/86508) 接口查询出的实例当前加密策略。
     */
    public String getEncryptionFlag() {
        return this.EncryptionFlag;
    }

    /**
     * Set 是否需要加密物理备份，可选值为：on - 是，off - 否。当 BackupMethod 为 physical 时，该值才有意义。不指定则使用实例备份默认加密策略，这里的默认加密策略指通过 [DescribeBackupEncryptionStatus](https://cloud.tencent.com/document/product/236/86508) 接口查询出的实例当前加密策略。
     * @param EncryptionFlag 是否需要加密物理备份，可选值为：on - 是，off - 否。当 BackupMethod 为 physical 时，该值才有意义。不指定则使用实例备份默认加密策略，这里的默认加密策略指通过 [DescribeBackupEncryptionStatus](https://cloud.tencent.com/document/product/236/86508) 接口查询出的实例当前加密策略。
     */
    public void setEncryptionFlag(String EncryptionFlag) {
        this.EncryptionFlag = EncryptionFlag;
    }

    public CreateBackupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateBackupRequest(CreateBackupRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.BackupMethod != null) {
            this.BackupMethod = new String(source.BackupMethod);
        }
        if (source.BackupDBTableList != null) {
            this.BackupDBTableList = new BackupItem[source.BackupDBTableList.length];
            for (int i = 0; i < source.BackupDBTableList.length; i++) {
                this.BackupDBTableList[i] = new BackupItem(source.BackupDBTableList[i]);
            }
        }
        if (source.ManualBackupName != null) {
            this.ManualBackupName = new String(source.ManualBackupName);
        }
        if (source.EncryptionFlag != null) {
            this.EncryptionFlag = new String(source.EncryptionFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "BackupMethod", this.BackupMethod);
        this.setParamArrayObj(map, prefix + "BackupDBTableList.", this.BackupDBTableList);
        this.setParamSimple(map, prefix + "ManualBackupName", this.ManualBackupName);
        this.setParamSimple(map, prefix + "EncryptionFlag", this.EncryptionFlag);

    }
}

