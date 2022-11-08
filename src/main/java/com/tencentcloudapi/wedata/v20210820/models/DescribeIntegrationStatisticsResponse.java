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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeIntegrationStatisticsResponse extends AbstractModel{

    /**
    * 总任务数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalTask")
    @Expose
    private Long TotalTask;

    /**
    * 生产态任务数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProdTask")
    @Expose
    private Long ProdTask;

    /**
    * 开发态任务数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DevTask")
    @Expose
    private Long DevTask;

    /**
    * 总读取条数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalReadRecords")
    @Expose
    private Long TotalReadRecords;

    /**
    * 总写入条数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalWriteRecords")
    @Expose
    private Long TotalWriteRecords;

    /**
    * 总脏数据条数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalErrorRecords")
    @Expose
    private Long TotalErrorRecords;

    /**
    * 总告警事件数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalAlarmEvent")
    @Expose
    private Long TotalAlarmEvent;

    /**
    * 当天读取增长条数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IncreaseReadRecords")
    @Expose
    private Long IncreaseReadRecords;

    /**
    * 当天写入增长条数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IncreaseWriteRecords")
    @Expose
    private Long IncreaseWriteRecords;

    /**
    * 当天脏数据增长条数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IncreaseErrorRecords")
    @Expose
    private Long IncreaseErrorRecords;

    /**
    * 当天告警事件增长数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IncreaseAlarmEvent")
    @Expose
    private Long IncreaseAlarmEvent;

    /**
    * 告警事件统计
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlarmEvent")
    @Expose
    private String AlarmEvent;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 总任务数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalTask 总任务数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalTask() {
        return this.TotalTask;
    }

    /**
     * Set 总任务数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalTask 总任务数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalTask(Long TotalTask) {
        this.TotalTask = TotalTask;
    }

    /**
     * Get 生产态任务数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProdTask 生产态任务数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getProdTask() {
        return this.ProdTask;
    }

    /**
     * Set 生产态任务数
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProdTask 生产态任务数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProdTask(Long ProdTask) {
        this.ProdTask = ProdTask;
    }

    /**
     * Get 开发态任务数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DevTask 开发态任务数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDevTask() {
        return this.DevTask;
    }

    /**
     * Set 开发态任务数
注意：此字段可能返回 null，表示取不到有效值。
     * @param DevTask 开发态任务数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDevTask(Long DevTask) {
        this.DevTask = DevTask;
    }

    /**
     * Get 总读取条数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalReadRecords 总读取条数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalReadRecords() {
        return this.TotalReadRecords;
    }

    /**
     * Set 总读取条数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalReadRecords 总读取条数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalReadRecords(Long TotalReadRecords) {
        this.TotalReadRecords = TotalReadRecords;
    }

    /**
     * Get 总写入条数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalWriteRecords 总写入条数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalWriteRecords() {
        return this.TotalWriteRecords;
    }

    /**
     * Set 总写入条数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalWriteRecords 总写入条数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalWriteRecords(Long TotalWriteRecords) {
        this.TotalWriteRecords = TotalWriteRecords;
    }

    /**
     * Get 总脏数据条数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalErrorRecords 总脏数据条数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalErrorRecords() {
        return this.TotalErrorRecords;
    }

    /**
     * Set 总脏数据条数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalErrorRecords 总脏数据条数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalErrorRecords(Long TotalErrorRecords) {
        this.TotalErrorRecords = TotalErrorRecords;
    }

    /**
     * Get 总告警事件数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalAlarmEvent 总告警事件数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalAlarmEvent() {
        return this.TotalAlarmEvent;
    }

    /**
     * Set 总告警事件数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalAlarmEvent 总告警事件数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalAlarmEvent(Long TotalAlarmEvent) {
        this.TotalAlarmEvent = TotalAlarmEvent;
    }

    /**
     * Get 当天读取增长条数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IncreaseReadRecords 当天读取增长条数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIncreaseReadRecords() {
        return this.IncreaseReadRecords;
    }

    /**
     * Set 当天读取增长条数
注意：此字段可能返回 null，表示取不到有效值。
     * @param IncreaseReadRecords 当天读取增长条数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIncreaseReadRecords(Long IncreaseReadRecords) {
        this.IncreaseReadRecords = IncreaseReadRecords;
    }

    /**
     * Get 当天写入增长条数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IncreaseWriteRecords 当天写入增长条数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIncreaseWriteRecords() {
        return this.IncreaseWriteRecords;
    }

    /**
     * Set 当天写入增长条数
注意：此字段可能返回 null，表示取不到有效值。
     * @param IncreaseWriteRecords 当天写入增长条数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIncreaseWriteRecords(Long IncreaseWriteRecords) {
        this.IncreaseWriteRecords = IncreaseWriteRecords;
    }

    /**
     * Get 当天脏数据增长条数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IncreaseErrorRecords 当天脏数据增长条数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIncreaseErrorRecords() {
        return this.IncreaseErrorRecords;
    }

    /**
     * Set 当天脏数据增长条数
注意：此字段可能返回 null，表示取不到有效值。
     * @param IncreaseErrorRecords 当天脏数据增长条数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIncreaseErrorRecords(Long IncreaseErrorRecords) {
        this.IncreaseErrorRecords = IncreaseErrorRecords;
    }

    /**
     * Get 当天告警事件增长数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IncreaseAlarmEvent 当天告警事件增长数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIncreaseAlarmEvent() {
        return this.IncreaseAlarmEvent;
    }

    /**
     * Set 当天告警事件增长数
注意：此字段可能返回 null，表示取不到有效值。
     * @param IncreaseAlarmEvent 当天告警事件增长数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIncreaseAlarmEvent(Long IncreaseAlarmEvent) {
        this.IncreaseAlarmEvent = IncreaseAlarmEvent;
    }

    /**
     * Get 告警事件统计
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlarmEvent 告警事件统计
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAlarmEvent() {
        return this.AlarmEvent;
    }

    /**
     * Set 告警事件统计
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlarmEvent 告警事件统计
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlarmEvent(String AlarmEvent) {
        this.AlarmEvent = AlarmEvent;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeIntegrationStatisticsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeIntegrationStatisticsResponse(DescribeIntegrationStatisticsResponse source) {
        if (source.TotalTask != null) {
            this.TotalTask = new Long(source.TotalTask);
        }
        if (source.ProdTask != null) {
            this.ProdTask = new Long(source.ProdTask);
        }
        if (source.DevTask != null) {
            this.DevTask = new Long(source.DevTask);
        }
        if (source.TotalReadRecords != null) {
            this.TotalReadRecords = new Long(source.TotalReadRecords);
        }
        if (source.TotalWriteRecords != null) {
            this.TotalWriteRecords = new Long(source.TotalWriteRecords);
        }
        if (source.TotalErrorRecords != null) {
            this.TotalErrorRecords = new Long(source.TotalErrorRecords);
        }
        if (source.TotalAlarmEvent != null) {
            this.TotalAlarmEvent = new Long(source.TotalAlarmEvent);
        }
        if (source.IncreaseReadRecords != null) {
            this.IncreaseReadRecords = new Long(source.IncreaseReadRecords);
        }
        if (source.IncreaseWriteRecords != null) {
            this.IncreaseWriteRecords = new Long(source.IncreaseWriteRecords);
        }
        if (source.IncreaseErrorRecords != null) {
            this.IncreaseErrorRecords = new Long(source.IncreaseErrorRecords);
        }
        if (source.IncreaseAlarmEvent != null) {
            this.IncreaseAlarmEvent = new Long(source.IncreaseAlarmEvent);
        }
        if (source.AlarmEvent != null) {
            this.AlarmEvent = new String(source.AlarmEvent);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalTask", this.TotalTask);
        this.setParamSimple(map, prefix + "ProdTask", this.ProdTask);
        this.setParamSimple(map, prefix + "DevTask", this.DevTask);
        this.setParamSimple(map, prefix + "TotalReadRecords", this.TotalReadRecords);
        this.setParamSimple(map, prefix + "TotalWriteRecords", this.TotalWriteRecords);
        this.setParamSimple(map, prefix + "TotalErrorRecords", this.TotalErrorRecords);
        this.setParamSimple(map, prefix + "TotalAlarmEvent", this.TotalAlarmEvent);
        this.setParamSimple(map, prefix + "IncreaseReadRecords", this.IncreaseReadRecords);
        this.setParamSimple(map, prefix + "IncreaseWriteRecords", this.IncreaseWriteRecords);
        this.setParamSimple(map, prefix + "IncreaseErrorRecords", this.IncreaseErrorRecords);
        this.setParamSimple(map, prefix + "IncreaseAlarmEvent", this.IncreaseAlarmEvent);
        this.setParamSimple(map, prefix + "AlarmEvent", this.AlarmEvent);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

