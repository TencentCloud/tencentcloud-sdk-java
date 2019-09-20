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

public class ModifyBackupConfigRequest  extends AbstractModel{

    /**
    * 实例 ID，格式如：cdb-c1nl9rpv。与云数据库控制台页面中显示的实例ID相同。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 备份文件的保留时间，单位为天。最小值为7天，最大值为732天。
    */
    @SerializedName("ExpireDays")
    @Expose
    private Integer ExpireDays;

    /**
    * 备份时间范围，格式为：02:00-06:00，起点和终点时间目前限制为整点，目前可以选择的范围为： 00:00-12:00，02:00-06:00，06：00-10：00，10:00-14:00，14:00-18:00，18:00-22:00，22:00-02:00。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 自动备份方式，仅支持：physical - 物理冷备
    */
    @SerializedName("BackupMethod")
    @Expose
    private String BackupMethod;

    /**
    * binlog的保留时间，单位为天。最小值为7天，最大值为732天。该值的设置不能大于备份文件的保留时间。
    */
    @SerializedName("BinlogExpireDays")
    @Expose
    private Integer BinlogExpireDays;

    /**
     * 获取实例 ID，格式如：cdb-c1nl9rpv。与云数据库控制台页面中显示的实例ID相同。
     * @return InstanceId 实例 ID，格式如：cdb-c1nl9rpv。与云数据库控制台页面中显示的实例ID相同。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置实例 ID，格式如：cdb-c1nl9rpv。与云数据库控制台页面中显示的实例ID相同。
     * @param InstanceId 实例 ID，格式如：cdb-c1nl9rpv。与云数据库控制台页面中显示的实例ID相同。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取备份文件的保留时间，单位为天。最小值为7天，最大值为732天。
     * @return ExpireDays 备份文件的保留时间，单位为天。最小值为7天，最大值为732天。
     */
    public Integer getExpireDays() {
        return this.ExpireDays;
    }

    /**
     * 设置备份文件的保留时间，单位为天。最小值为7天，最大值为732天。
     * @param ExpireDays 备份文件的保留时间，单位为天。最小值为7天，最大值为732天。
     */
    public void setExpireDays(Integer ExpireDays) {
        this.ExpireDays = ExpireDays;
    }

    /**
     * 获取备份时间范围，格式为：02:00-06:00，起点和终点时间目前限制为整点，目前可以选择的范围为： 00:00-12:00，02:00-06:00，06：00-10：00，10:00-14:00，14:00-18:00，18:00-22:00，22:00-02:00。
     * @return StartTime 备份时间范围，格式为：02:00-06:00，起点和终点时间目前限制为整点，目前可以选择的范围为： 00:00-12:00，02:00-06:00，06：00-10：00，10:00-14:00，14:00-18:00，18:00-22:00，22:00-02:00。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * 设置备份时间范围，格式为：02:00-06:00，起点和终点时间目前限制为整点，目前可以选择的范围为： 00:00-12:00，02:00-06:00，06：00-10：00，10:00-14:00，14:00-18:00，18:00-22:00，22:00-02:00。
     * @param StartTime 备份时间范围，格式为：02:00-06:00，起点和终点时间目前限制为整点，目前可以选择的范围为： 00:00-12:00，02:00-06:00，06：00-10：00，10:00-14:00，14:00-18:00，18:00-22:00，22:00-02:00。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * 获取自动备份方式，仅支持：physical - 物理冷备
     * @return BackupMethod 自动备份方式，仅支持：physical - 物理冷备
     */
    public String getBackupMethod() {
        return this.BackupMethod;
    }

    /**
     * 设置自动备份方式，仅支持：physical - 物理冷备
     * @param BackupMethod 自动备份方式，仅支持：physical - 物理冷备
     */
    public void setBackupMethod(String BackupMethod) {
        this.BackupMethod = BackupMethod;
    }

    /**
     * 获取binlog的保留时间，单位为天。最小值为7天，最大值为732天。该值的设置不能大于备份文件的保留时间。
     * @return BinlogExpireDays binlog的保留时间，单位为天。最小值为7天，最大值为732天。该值的设置不能大于备份文件的保留时间。
     */
    public Integer getBinlogExpireDays() {
        return this.BinlogExpireDays;
    }

    /**
     * 设置binlog的保留时间，单位为天。最小值为7天，最大值为732天。该值的设置不能大于备份文件的保留时间。
     * @param BinlogExpireDays binlog的保留时间，单位为天。最小值为7天，最大值为732天。该值的设置不能大于备份文件的保留时间。
     */
    public void setBinlogExpireDays(Integer BinlogExpireDays) {
        this.BinlogExpireDays = BinlogExpireDays;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ExpireDays", this.ExpireDays);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "BackupMethod", this.BackupMethod);
        this.setParamSimple(map, prefix + "BinlogExpireDays", this.BinlogExpireDays);

    }
}

