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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LockComponentInfo extends AbstractModel{

    /**
    * 数据库名称
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
    * 表名称
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * 分区
    */
    @SerializedName("Partition")
    @Expose
    private String Partition;

    /**
    * 锁类型：SHARED_READ、SHARED_WRITE、EXCLUSIVE
    */
    @SerializedName("LockType")
    @Expose
    private String LockType;

    /**
    * 锁级别：DB、TABLE、PARTITION
    */
    @SerializedName("LockLevel")
    @Expose
    private String LockLevel;

    /**
    * 锁操作：SELECT,INSERT,UPDATE,DELETE,UNSET,NO_TXN
    */
    @SerializedName("DataOperationType")
    @Expose
    private String DataOperationType;

    /**
    * 是否保持Acid
    */
    @SerializedName("IsAcid")
    @Expose
    private Boolean IsAcid;

    /**
    * 是否动态分区写
    */
    @SerializedName("IsDynamicPartitionWrite")
    @Expose
    private Boolean IsDynamicPartitionWrite;

    /**
     * Get 数据库名称 
     * @return DbName 数据库名称
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set 数据库名称
     * @param DbName 数据库名称
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    /**
     * Get 表名称 
     * @return TableName 表名称
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set 表名称
     * @param TableName 表名称
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get 分区 
     * @return Partition 分区
     */
    public String getPartition() {
        return this.Partition;
    }

    /**
     * Set 分区
     * @param Partition 分区
     */
    public void setPartition(String Partition) {
        this.Partition = Partition;
    }

    /**
     * Get 锁类型：SHARED_READ、SHARED_WRITE、EXCLUSIVE 
     * @return LockType 锁类型：SHARED_READ、SHARED_WRITE、EXCLUSIVE
     */
    public String getLockType() {
        return this.LockType;
    }

    /**
     * Set 锁类型：SHARED_READ、SHARED_WRITE、EXCLUSIVE
     * @param LockType 锁类型：SHARED_READ、SHARED_WRITE、EXCLUSIVE
     */
    public void setLockType(String LockType) {
        this.LockType = LockType;
    }

    /**
     * Get 锁级别：DB、TABLE、PARTITION 
     * @return LockLevel 锁级别：DB、TABLE、PARTITION
     */
    public String getLockLevel() {
        return this.LockLevel;
    }

    /**
     * Set 锁级别：DB、TABLE、PARTITION
     * @param LockLevel 锁级别：DB、TABLE、PARTITION
     */
    public void setLockLevel(String LockLevel) {
        this.LockLevel = LockLevel;
    }

    /**
     * Get 锁操作：SELECT,INSERT,UPDATE,DELETE,UNSET,NO_TXN 
     * @return DataOperationType 锁操作：SELECT,INSERT,UPDATE,DELETE,UNSET,NO_TXN
     */
    public String getDataOperationType() {
        return this.DataOperationType;
    }

    /**
     * Set 锁操作：SELECT,INSERT,UPDATE,DELETE,UNSET,NO_TXN
     * @param DataOperationType 锁操作：SELECT,INSERT,UPDATE,DELETE,UNSET,NO_TXN
     */
    public void setDataOperationType(String DataOperationType) {
        this.DataOperationType = DataOperationType;
    }

    /**
     * Get 是否保持Acid 
     * @return IsAcid 是否保持Acid
     */
    public Boolean getIsAcid() {
        return this.IsAcid;
    }

    /**
     * Set 是否保持Acid
     * @param IsAcid 是否保持Acid
     */
    public void setIsAcid(Boolean IsAcid) {
        this.IsAcid = IsAcid;
    }

    /**
     * Get 是否动态分区写 
     * @return IsDynamicPartitionWrite 是否动态分区写
     */
    public Boolean getIsDynamicPartitionWrite() {
        return this.IsDynamicPartitionWrite;
    }

    /**
     * Set 是否动态分区写
     * @param IsDynamicPartitionWrite 是否动态分区写
     */
    public void setIsDynamicPartitionWrite(Boolean IsDynamicPartitionWrite) {
        this.IsDynamicPartitionWrite = IsDynamicPartitionWrite;
    }

    public LockComponentInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LockComponentInfo(LockComponentInfo source) {
        if (source.DbName != null) {
            this.DbName = new String(source.DbName);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.Partition != null) {
            this.Partition = new String(source.Partition);
        }
        if (source.LockType != null) {
            this.LockType = new String(source.LockType);
        }
        if (source.LockLevel != null) {
            this.LockLevel = new String(source.LockLevel);
        }
        if (source.DataOperationType != null) {
            this.DataOperationType = new String(source.DataOperationType);
        }
        if (source.IsAcid != null) {
            this.IsAcid = new Boolean(source.IsAcid);
        }
        if (source.IsDynamicPartitionWrite != null) {
            this.IsDynamicPartitionWrite = new Boolean(source.IsDynamicPartitionWrite);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DbName", this.DbName);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "Partition", this.Partition);
        this.setParamSimple(map, prefix + "LockType", this.LockType);
        this.setParamSimple(map, prefix + "LockLevel", this.LockLevel);
        this.setParamSimple(map, prefix + "DataOperationType", this.DataOperationType);
        this.setParamSimple(map, prefix + "IsAcid", this.IsAcid);
        this.setParamSimple(map, prefix + "IsDynamicPartitionWrite", this.IsDynamicPartitionWrite);

    }
}

