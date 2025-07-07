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
package com.tencentcloudapi.mariadb.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NewBackupConfig extends AbstractModel {

    /**
    * 备份策略是否启用。
    */
    @SerializedName("EnableBackupPolicy")
    @Expose
    private Boolean EnableBackupPolicy;

    /**
    * 超期保留开始日期，早于开始日期的超期备份不保留，格式：yyyy-mm-dd。
    */
    @SerializedName("BeginDate")
    @Expose
    private String BeginDate;

    /**
    * 超期备份保留时长，超出保留时间的超期备份将被删除，可填写1-3650整数。
    */
    @SerializedName("MaxRetentionDays")
    @Expose
    private Long MaxRetentionDays;

    /**
    * 备份模式，可选择按年月周模式保存
* 按年：annually
* 按月：monthly
* 按周：weekly
    */
    @SerializedName("Frequency")
    @Expose
    private String Frequency;

    /**
    * Frequency等于weekly时生效。
表示保留特定工作日备份。可选择周一到周日，支持多选，取星期英文： 
* 星期一 ：Monday 
* 星期二 ：Tuesday 
* 星期三：Wednesday
* 星期四：Thursday 
* 星期五：Friday
* 星期六：Saturday
* 星期日：Sunday
    */
    @SerializedName("WeekDays")
    @Expose
    private String [] WeekDays;

    /**
    * 保留备份个数，Frequency等于monthly或weekly时生效。
备份模式选择按月时，可填写1-28整数；
备份模式选择年时，可填写1-336整数。
    */
    @SerializedName("BackupCount")
    @Expose
    private Long BackupCount;

    /**
     * Get 备份策略是否启用。 
     * @return EnableBackupPolicy 备份策略是否启用。
     */
    public Boolean getEnableBackupPolicy() {
        return this.EnableBackupPolicy;
    }

    /**
     * Set 备份策略是否启用。
     * @param EnableBackupPolicy 备份策略是否启用。
     */
    public void setEnableBackupPolicy(Boolean EnableBackupPolicy) {
        this.EnableBackupPolicy = EnableBackupPolicy;
    }

    /**
     * Get 超期保留开始日期，早于开始日期的超期备份不保留，格式：yyyy-mm-dd。 
     * @return BeginDate 超期保留开始日期，早于开始日期的超期备份不保留，格式：yyyy-mm-dd。
     */
    public String getBeginDate() {
        return this.BeginDate;
    }

    /**
     * Set 超期保留开始日期，早于开始日期的超期备份不保留，格式：yyyy-mm-dd。
     * @param BeginDate 超期保留开始日期，早于开始日期的超期备份不保留，格式：yyyy-mm-dd。
     */
    public void setBeginDate(String BeginDate) {
        this.BeginDate = BeginDate;
    }

    /**
     * Get 超期备份保留时长，超出保留时间的超期备份将被删除，可填写1-3650整数。 
     * @return MaxRetentionDays 超期备份保留时长，超出保留时间的超期备份将被删除，可填写1-3650整数。
     */
    public Long getMaxRetentionDays() {
        return this.MaxRetentionDays;
    }

    /**
     * Set 超期备份保留时长，超出保留时间的超期备份将被删除，可填写1-3650整数。
     * @param MaxRetentionDays 超期备份保留时长，超出保留时间的超期备份将被删除，可填写1-3650整数。
     */
    public void setMaxRetentionDays(Long MaxRetentionDays) {
        this.MaxRetentionDays = MaxRetentionDays;
    }

    /**
     * Get 备份模式，可选择按年月周模式保存
* 按年：annually
* 按月：monthly
* 按周：weekly 
     * @return Frequency 备份模式，可选择按年月周模式保存
* 按年：annually
* 按月：monthly
* 按周：weekly
     */
    public String getFrequency() {
        return this.Frequency;
    }

    /**
     * Set 备份模式，可选择按年月周模式保存
* 按年：annually
* 按月：monthly
* 按周：weekly
     * @param Frequency 备份模式，可选择按年月周模式保存
* 按年：annually
* 按月：monthly
* 按周：weekly
     */
    public void setFrequency(String Frequency) {
        this.Frequency = Frequency;
    }

    /**
     * Get Frequency等于weekly时生效。
表示保留特定工作日备份。可选择周一到周日，支持多选，取星期英文： 
* 星期一 ：Monday 
* 星期二 ：Tuesday 
* 星期三：Wednesday
* 星期四：Thursday 
* 星期五：Friday
* 星期六：Saturday
* 星期日：Sunday 
     * @return WeekDays Frequency等于weekly时生效。
表示保留特定工作日备份。可选择周一到周日，支持多选，取星期英文： 
* 星期一 ：Monday 
* 星期二 ：Tuesday 
* 星期三：Wednesday
* 星期四：Thursday 
* 星期五：Friday
* 星期六：Saturday
* 星期日：Sunday
     */
    public String [] getWeekDays() {
        return this.WeekDays;
    }

    /**
     * Set Frequency等于weekly时生效。
表示保留特定工作日备份。可选择周一到周日，支持多选，取星期英文： 
* 星期一 ：Monday 
* 星期二 ：Tuesday 
* 星期三：Wednesday
* 星期四：Thursday 
* 星期五：Friday
* 星期六：Saturday
* 星期日：Sunday
     * @param WeekDays Frequency等于weekly时生效。
表示保留特定工作日备份。可选择周一到周日，支持多选，取星期英文： 
* 星期一 ：Monday 
* 星期二 ：Tuesday 
* 星期三：Wednesday
* 星期四：Thursday 
* 星期五：Friday
* 星期六：Saturday
* 星期日：Sunday
     */
    public void setWeekDays(String [] WeekDays) {
        this.WeekDays = WeekDays;
    }

    /**
     * Get 保留备份个数，Frequency等于monthly或weekly时生效。
备份模式选择按月时，可填写1-28整数；
备份模式选择年时，可填写1-336整数。 
     * @return BackupCount 保留备份个数，Frequency等于monthly或weekly时生效。
备份模式选择按月时，可填写1-28整数；
备份模式选择年时，可填写1-336整数。
     */
    public Long getBackupCount() {
        return this.BackupCount;
    }

    /**
     * Set 保留备份个数，Frequency等于monthly或weekly时生效。
备份模式选择按月时，可填写1-28整数；
备份模式选择年时，可填写1-336整数。
     * @param BackupCount 保留备份个数，Frequency等于monthly或weekly时生效。
备份模式选择按月时，可填写1-28整数；
备份模式选择年时，可填写1-336整数。
     */
    public void setBackupCount(Long BackupCount) {
        this.BackupCount = BackupCount;
    }

    public NewBackupConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NewBackupConfig(NewBackupConfig source) {
        if (source.EnableBackupPolicy != null) {
            this.EnableBackupPolicy = new Boolean(source.EnableBackupPolicy);
        }
        if (source.BeginDate != null) {
            this.BeginDate = new String(source.BeginDate);
        }
        if (source.MaxRetentionDays != null) {
            this.MaxRetentionDays = new Long(source.MaxRetentionDays);
        }
        if (source.Frequency != null) {
            this.Frequency = new String(source.Frequency);
        }
        if (source.WeekDays != null) {
            this.WeekDays = new String[source.WeekDays.length];
            for (int i = 0; i < source.WeekDays.length; i++) {
                this.WeekDays[i] = new String(source.WeekDays[i]);
            }
        }
        if (source.BackupCount != null) {
            this.BackupCount = new Long(source.BackupCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnableBackupPolicy", this.EnableBackupPolicy);
        this.setParamSimple(map, prefix + "BeginDate", this.BeginDate);
        this.setParamSimple(map, prefix + "MaxRetentionDays", this.MaxRetentionDays);
        this.setParamSimple(map, prefix + "Frequency", this.Frequency);
        this.setParamArraySimple(map, prefix + "WeekDays.", this.WeekDays);
        this.setParamSimple(map, prefix + "BackupCount", this.BackupCount);

    }
}

