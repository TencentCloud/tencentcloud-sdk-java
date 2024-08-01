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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RecoverBackUpJobRequest extends AbstractModel {

    /**
    * 集群id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 任务id
    */
    @SerializedName("BackUpJobId")
    @Expose
    private Long BackUpJobId;

    /**
    * 恢复出来的新表副本数
    */
    @SerializedName("ReplicationNum")
    @Expose
    private Long ReplicationNum;

    /**
    * 恢复是否保持源表中的配置，1时表示保留源表中的配置
    */
    @SerializedName("ReserveSourceConfig")
    @Expose
    private Long ReserveSourceConfig;

    /**
    * 0默认 1cos恢复
    */
    @SerializedName("RecoverType")
    @Expose
    private Long RecoverType;

    /**
    * CosSourceInfo对象
    */
    @SerializedName("CosSourceInfo")
    @Expose
    private CosSourceInfo CosSourceInfo;

    /**
    * 0默认 1定期执行
    */
    @SerializedName("ScheduleType")
    @Expose
    private Long ScheduleType;

    /**
    * 年-月-日 时:分:秒
    */
    @SerializedName("NextTime")
    @Expose
    private String NextTime;

    /**
    * 调度名称
    */
    @SerializedName("ScheduleName")
    @Expose
    private String ScheduleName;

    /**
    * create update
    */
    @SerializedName("OperationType")
    @Expose
    private String OperationType;

    /**
    * 恢复粒度：All全量、Database按库、Table按表
    */
    @SerializedName("RecoverScope")
    @Expose
    private String RecoverScope;

    /**
    * 恢复库：如果是按库备份，则需要该字段，库之间用","分割
    */
    @SerializedName("RecoverDatabase")
    @Expose
    private String RecoverDatabase;

    /**
     * Get 集群id 
     * @return InstanceId 集群id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 集群id
     * @param InstanceId 集群id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 任务id 
     * @return BackUpJobId 任务id
     */
    public Long getBackUpJobId() {
        return this.BackUpJobId;
    }

    /**
     * Set 任务id
     * @param BackUpJobId 任务id
     */
    public void setBackUpJobId(Long BackUpJobId) {
        this.BackUpJobId = BackUpJobId;
    }

    /**
     * Get 恢复出来的新表副本数 
     * @return ReplicationNum 恢复出来的新表副本数
     */
    public Long getReplicationNum() {
        return this.ReplicationNum;
    }

    /**
     * Set 恢复出来的新表副本数
     * @param ReplicationNum 恢复出来的新表副本数
     */
    public void setReplicationNum(Long ReplicationNum) {
        this.ReplicationNum = ReplicationNum;
    }

    /**
     * Get 恢复是否保持源表中的配置，1时表示保留源表中的配置 
     * @return ReserveSourceConfig 恢复是否保持源表中的配置，1时表示保留源表中的配置
     */
    public Long getReserveSourceConfig() {
        return this.ReserveSourceConfig;
    }

    /**
     * Set 恢复是否保持源表中的配置，1时表示保留源表中的配置
     * @param ReserveSourceConfig 恢复是否保持源表中的配置，1时表示保留源表中的配置
     */
    public void setReserveSourceConfig(Long ReserveSourceConfig) {
        this.ReserveSourceConfig = ReserveSourceConfig;
    }

    /**
     * Get 0默认 1cos恢复 
     * @return RecoverType 0默认 1cos恢复
     */
    public Long getRecoverType() {
        return this.RecoverType;
    }

    /**
     * Set 0默认 1cos恢复
     * @param RecoverType 0默认 1cos恢复
     */
    public void setRecoverType(Long RecoverType) {
        this.RecoverType = RecoverType;
    }

    /**
     * Get CosSourceInfo对象 
     * @return CosSourceInfo CosSourceInfo对象
     */
    public CosSourceInfo getCosSourceInfo() {
        return this.CosSourceInfo;
    }

    /**
     * Set CosSourceInfo对象
     * @param CosSourceInfo CosSourceInfo对象
     */
    public void setCosSourceInfo(CosSourceInfo CosSourceInfo) {
        this.CosSourceInfo = CosSourceInfo;
    }

    /**
     * Get 0默认 1定期执行 
     * @return ScheduleType 0默认 1定期执行
     */
    public Long getScheduleType() {
        return this.ScheduleType;
    }

    /**
     * Set 0默认 1定期执行
     * @param ScheduleType 0默认 1定期执行
     */
    public void setScheduleType(Long ScheduleType) {
        this.ScheduleType = ScheduleType;
    }

    /**
     * Get 年-月-日 时:分:秒 
     * @return NextTime 年-月-日 时:分:秒
     */
    public String getNextTime() {
        return this.NextTime;
    }

    /**
     * Set 年-月-日 时:分:秒
     * @param NextTime 年-月-日 时:分:秒
     */
    public void setNextTime(String NextTime) {
        this.NextTime = NextTime;
    }

    /**
     * Get 调度名称 
     * @return ScheduleName 调度名称
     */
    public String getScheduleName() {
        return this.ScheduleName;
    }

    /**
     * Set 调度名称
     * @param ScheduleName 调度名称
     */
    public void setScheduleName(String ScheduleName) {
        this.ScheduleName = ScheduleName;
    }

    /**
     * Get create update 
     * @return OperationType create update
     */
    public String getOperationType() {
        return this.OperationType;
    }

    /**
     * Set create update
     * @param OperationType create update
     */
    public void setOperationType(String OperationType) {
        this.OperationType = OperationType;
    }

    /**
     * Get 恢复粒度：All全量、Database按库、Table按表 
     * @return RecoverScope 恢复粒度：All全量、Database按库、Table按表
     */
    public String getRecoverScope() {
        return this.RecoverScope;
    }

    /**
     * Set 恢复粒度：All全量、Database按库、Table按表
     * @param RecoverScope 恢复粒度：All全量、Database按库、Table按表
     */
    public void setRecoverScope(String RecoverScope) {
        this.RecoverScope = RecoverScope;
    }

    /**
     * Get 恢复库：如果是按库备份，则需要该字段，库之间用","分割 
     * @return RecoverDatabase 恢复库：如果是按库备份，则需要该字段，库之间用","分割
     */
    public String getRecoverDatabase() {
        return this.RecoverDatabase;
    }

    /**
     * Set 恢复库：如果是按库备份，则需要该字段，库之间用","分割
     * @param RecoverDatabase 恢复库：如果是按库备份，则需要该字段，库之间用","分割
     */
    public void setRecoverDatabase(String RecoverDatabase) {
        this.RecoverDatabase = RecoverDatabase;
    }

    public RecoverBackUpJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecoverBackUpJobRequest(RecoverBackUpJobRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.BackUpJobId != null) {
            this.BackUpJobId = new Long(source.BackUpJobId);
        }
        if (source.ReplicationNum != null) {
            this.ReplicationNum = new Long(source.ReplicationNum);
        }
        if (source.ReserveSourceConfig != null) {
            this.ReserveSourceConfig = new Long(source.ReserveSourceConfig);
        }
        if (source.RecoverType != null) {
            this.RecoverType = new Long(source.RecoverType);
        }
        if (source.CosSourceInfo != null) {
            this.CosSourceInfo = new CosSourceInfo(source.CosSourceInfo);
        }
        if (source.ScheduleType != null) {
            this.ScheduleType = new Long(source.ScheduleType);
        }
        if (source.NextTime != null) {
            this.NextTime = new String(source.NextTime);
        }
        if (source.ScheduleName != null) {
            this.ScheduleName = new String(source.ScheduleName);
        }
        if (source.OperationType != null) {
            this.OperationType = new String(source.OperationType);
        }
        if (source.RecoverScope != null) {
            this.RecoverScope = new String(source.RecoverScope);
        }
        if (source.RecoverDatabase != null) {
            this.RecoverDatabase = new String(source.RecoverDatabase);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "BackUpJobId", this.BackUpJobId);
        this.setParamSimple(map, prefix + "ReplicationNum", this.ReplicationNum);
        this.setParamSimple(map, prefix + "ReserveSourceConfig", this.ReserveSourceConfig);
        this.setParamSimple(map, prefix + "RecoverType", this.RecoverType);
        this.setParamObj(map, prefix + "CosSourceInfo.", this.CosSourceInfo);
        this.setParamSimple(map, prefix + "ScheduleType", this.ScheduleType);
        this.setParamSimple(map, prefix + "NextTime", this.NextTime);
        this.setParamSimple(map, prefix + "ScheduleName", this.ScheduleName);
        this.setParamSimple(map, prefix + "OperationType", this.OperationType);
        this.setParamSimple(map, prefix + "RecoverScope", this.RecoverScope);
        this.setParamSimple(map, prefix + "RecoverDatabase", this.RecoverDatabase);

    }
}

