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

public class AuditInstanceInfo extends AbstractModel {

    /**
    * <p>实例ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>开启状态</p><p>枚举值：</p><ul><li>OFF： 关闭</li><li>ON： 打开</li></ul>
    */
    @SerializedName("AuditStatus")
    @Expose
    private String AuditStatus;

    /**
    * <p>日志存储有效期</p><p>单位：天</p>
    */
    @SerializedName("LogExpireDay")
    @Expose
    private Long LogExpireDay;

    /**
    * <p>热存储有效期</p><p>单位：天</p>
    */
    @SerializedName("HotLogExpireDay")
    @Expose
    private Long HotLogExpireDay;

    /**
    * <p>冷存储有效期</p><p>单位：天</p>
    */
    @SerializedName("ColdLogExpireDay")
    @Expose
    private Long ColdLogExpireDay;

    /**
    * <p>热存储大小</p><p>单位：MB</p>
    */
    @SerializedName("HotLogSize")
    @Expose
    private Float HotLogSize;

    /**
    * <p>冷存储大小</p><p>单位：MB</p>
    */
    @SerializedName("ColdLogSize")
    @Expose
    private Float ColdLogSize;

    /**
    * <p>开启时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>投递状态</p>
    */
    @SerializedName("Deliver")
    @Expose
    private String Deliver;

    /**
    * <p>投递信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeliverSummary")
    @Expose
    private DeliverSummary [] DeliverSummary;

    /**
    * <p>实例信息</p>
    */
    @SerializedName("InstanceInfo")
    @Expose
    private LogInstanceInfo InstanceInfo;

    /**
     * Get <p>实例ID</p> 
     * @return InstanceId <p>实例ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例ID</p>
     * @param InstanceId <p>实例ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>开启状态</p><p>枚举值：</p><ul><li>OFF： 关闭</li><li>ON： 打开</li></ul> 
     * @return AuditStatus <p>开启状态</p><p>枚举值：</p><ul><li>OFF： 关闭</li><li>ON： 打开</li></ul>
     */
    public String getAuditStatus() {
        return this.AuditStatus;
    }

    /**
     * Set <p>开启状态</p><p>枚举值：</p><ul><li>OFF： 关闭</li><li>ON： 打开</li></ul>
     * @param AuditStatus <p>开启状态</p><p>枚举值：</p><ul><li>OFF： 关闭</li><li>ON： 打开</li></ul>
     */
    public void setAuditStatus(String AuditStatus) {
        this.AuditStatus = AuditStatus;
    }

    /**
     * Get <p>日志存储有效期</p><p>单位：天</p> 
     * @return LogExpireDay <p>日志存储有效期</p><p>单位：天</p>
     */
    public Long getLogExpireDay() {
        return this.LogExpireDay;
    }

    /**
     * Set <p>日志存储有效期</p><p>单位：天</p>
     * @param LogExpireDay <p>日志存储有效期</p><p>单位：天</p>
     */
    public void setLogExpireDay(Long LogExpireDay) {
        this.LogExpireDay = LogExpireDay;
    }

    /**
     * Get <p>热存储有效期</p><p>单位：天</p> 
     * @return HotLogExpireDay <p>热存储有效期</p><p>单位：天</p>
     */
    public Long getHotLogExpireDay() {
        return this.HotLogExpireDay;
    }

    /**
     * Set <p>热存储有效期</p><p>单位：天</p>
     * @param HotLogExpireDay <p>热存储有效期</p><p>单位：天</p>
     */
    public void setHotLogExpireDay(Long HotLogExpireDay) {
        this.HotLogExpireDay = HotLogExpireDay;
    }

    /**
     * Get <p>冷存储有效期</p><p>单位：天</p> 
     * @return ColdLogExpireDay <p>冷存储有效期</p><p>单位：天</p>
     */
    public Long getColdLogExpireDay() {
        return this.ColdLogExpireDay;
    }

    /**
     * Set <p>冷存储有效期</p><p>单位：天</p>
     * @param ColdLogExpireDay <p>冷存储有效期</p><p>单位：天</p>
     */
    public void setColdLogExpireDay(Long ColdLogExpireDay) {
        this.ColdLogExpireDay = ColdLogExpireDay;
    }

    /**
     * Get <p>热存储大小</p><p>单位：MB</p> 
     * @return HotLogSize <p>热存储大小</p><p>单位：MB</p>
     */
    public Float getHotLogSize() {
        return this.HotLogSize;
    }

    /**
     * Set <p>热存储大小</p><p>单位：MB</p>
     * @param HotLogSize <p>热存储大小</p><p>单位：MB</p>
     */
    public void setHotLogSize(Float HotLogSize) {
        this.HotLogSize = HotLogSize;
    }

    /**
     * Get <p>冷存储大小</p><p>单位：MB</p> 
     * @return ColdLogSize <p>冷存储大小</p><p>单位：MB</p>
     */
    public Float getColdLogSize() {
        return this.ColdLogSize;
    }

    /**
     * Set <p>冷存储大小</p><p>单位：MB</p>
     * @param ColdLogSize <p>冷存储大小</p><p>单位：MB</p>
     */
    public void setColdLogSize(Float ColdLogSize) {
        this.ColdLogSize = ColdLogSize;
    }

    /**
     * Get <p>开启时间</p> 
     * @return CreateTime <p>开启时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>开启时间</p>
     * @param CreateTime <p>开启时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>投递状态</p> 
     * @return Deliver <p>投递状态</p>
     */
    public String getDeliver() {
        return this.Deliver;
    }

    /**
     * Set <p>投递状态</p>
     * @param Deliver <p>投递状态</p>
     */
    public void setDeliver(String Deliver) {
        this.Deliver = Deliver;
    }

    /**
     * Get <p>投递信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeliverSummary <p>投递信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DeliverSummary [] getDeliverSummary() {
        return this.DeliverSummary;
    }

    /**
     * Set <p>投递信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeliverSummary <p>投递信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeliverSummary(DeliverSummary [] DeliverSummary) {
        this.DeliverSummary = DeliverSummary;
    }

    /**
     * Get <p>实例信息</p> 
     * @return InstanceInfo <p>实例信息</p>
     */
    public LogInstanceInfo getInstanceInfo() {
        return this.InstanceInfo;
    }

    /**
     * Set <p>实例信息</p>
     * @param InstanceInfo <p>实例信息</p>
     */
    public void setInstanceInfo(LogInstanceInfo InstanceInfo) {
        this.InstanceInfo = InstanceInfo;
    }

    public AuditInstanceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuditInstanceInfo(AuditInstanceInfo source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.AuditStatus != null) {
            this.AuditStatus = new String(source.AuditStatus);
        }
        if (source.LogExpireDay != null) {
            this.LogExpireDay = new Long(source.LogExpireDay);
        }
        if (source.HotLogExpireDay != null) {
            this.HotLogExpireDay = new Long(source.HotLogExpireDay);
        }
        if (source.ColdLogExpireDay != null) {
            this.ColdLogExpireDay = new Long(source.ColdLogExpireDay);
        }
        if (source.HotLogSize != null) {
            this.HotLogSize = new Float(source.HotLogSize);
        }
        if (source.ColdLogSize != null) {
            this.ColdLogSize = new Float(source.ColdLogSize);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Deliver != null) {
            this.Deliver = new String(source.Deliver);
        }
        if (source.DeliverSummary != null) {
            this.DeliverSummary = new DeliverSummary[source.DeliverSummary.length];
            for (int i = 0; i < source.DeliverSummary.length; i++) {
                this.DeliverSummary[i] = new DeliverSummary(source.DeliverSummary[i]);
            }
        }
        if (source.InstanceInfo != null) {
            this.InstanceInfo = new LogInstanceInfo(source.InstanceInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "AuditStatus", this.AuditStatus);
        this.setParamSimple(map, prefix + "LogExpireDay", this.LogExpireDay);
        this.setParamSimple(map, prefix + "HotLogExpireDay", this.HotLogExpireDay);
        this.setParamSimple(map, prefix + "ColdLogExpireDay", this.ColdLogExpireDay);
        this.setParamSimple(map, prefix + "HotLogSize", this.HotLogSize);
        this.setParamSimple(map, prefix + "ColdLogSize", this.ColdLogSize);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Deliver", this.Deliver);
        this.setParamArrayObj(map, prefix + "DeliverSummary.", this.DeliverSummary);
        this.setParamObj(map, prefix + "InstanceInfo.", this.InstanceInfo);

    }
}

