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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogInstance extends AbstractModel {

    /**
    * <p>实例ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>日志状态，create：创建中；normal：开启；close：关闭中。</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>是否可以切换日志查询-取值：yes-可以，no-不可以。该参数主要为控制存量日志迁移到日志平台做查询使用，只有为yes状态才可以调用查询日志接口。</p>
    */
    @SerializedName("EnableQuery")
    @Expose
    private String EnableQuery;

    /**
    * <p>开启时间</p>
    */
    @SerializedName("CreateAt")
    @Expose
    private String CreateAt;

    /**
    * <p>高频存储天数</p>
    */
    @SerializedName("HighLogExpireDay")
    @Expose
    private Long HighLogExpireDay;

    /**
    * <p>低频存储天数</p>
    */
    @SerializedName("LowLogExpireDay")
    @Expose
    private Long LowLogExpireDay;

    /**
    * <p>总存储时长</p>
    */
    @SerializedName("LogExpireDay")
    @Expose
    private Long LogExpireDay;

    /**
    * <p>高频存储量，单位：MB</p>
    */
    @SerializedName("HighStorage")
    @Expose
    private Float HighStorage;

    /**
    * <p>低频存储量，单位：MB</p>
    */
    @SerializedName("LowStorage")
    @Expose
    private Float LowStorage;

    /**
    * <p>总存储量</p>
    */
    @SerializedName("LogStorage")
    @Expose
    private Float LogStorage;

    /**
    * <p>是否开启投递：ON，OFF</p>
    */
    @SerializedName("Deliver")
    @Expose
    private String Deliver;

    /**
    * <p>日志投递信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeliverSummary")
    @Expose
    private DeliverSummary [] DeliverSummary;

    /**
    * <p>业务侧实例相关信息，根据业务不同，返回相关信息不同。</p>
    */
    @SerializedName("InstanceInfo")
    @Expose
    private InstanceInfo InstanceInfo;

    /**
    * <p>审计子类型</p>
    */
    @SerializedName("LogSubType")
    @Expose
    private String LogSubType;

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
     * Get <p>日志状态，create：创建中；normal：开启；close：关闭中。</p> 
     * @return Status <p>日志状态，create：创建中；normal：开启；close：关闭中。</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>日志状态，create：创建中；normal：开启；close：关闭中。</p>
     * @param Status <p>日志状态，create：创建中；normal：开启；close：关闭中。</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>是否可以切换日志查询-取值：yes-可以，no-不可以。该参数主要为控制存量日志迁移到日志平台做查询使用，只有为yes状态才可以调用查询日志接口。</p> 
     * @return EnableQuery <p>是否可以切换日志查询-取值：yes-可以，no-不可以。该参数主要为控制存量日志迁移到日志平台做查询使用，只有为yes状态才可以调用查询日志接口。</p>
     */
    public String getEnableQuery() {
        return this.EnableQuery;
    }

    /**
     * Set <p>是否可以切换日志查询-取值：yes-可以，no-不可以。该参数主要为控制存量日志迁移到日志平台做查询使用，只有为yes状态才可以调用查询日志接口。</p>
     * @param EnableQuery <p>是否可以切换日志查询-取值：yes-可以，no-不可以。该参数主要为控制存量日志迁移到日志平台做查询使用，只有为yes状态才可以调用查询日志接口。</p>
     */
    public void setEnableQuery(String EnableQuery) {
        this.EnableQuery = EnableQuery;
    }

    /**
     * Get <p>开启时间</p> 
     * @return CreateAt <p>开启时间</p>
     */
    public String getCreateAt() {
        return this.CreateAt;
    }

    /**
     * Set <p>开启时间</p>
     * @param CreateAt <p>开启时间</p>
     */
    public void setCreateAt(String CreateAt) {
        this.CreateAt = CreateAt;
    }

    /**
     * Get <p>高频存储天数</p> 
     * @return HighLogExpireDay <p>高频存储天数</p>
     */
    public Long getHighLogExpireDay() {
        return this.HighLogExpireDay;
    }

    /**
     * Set <p>高频存储天数</p>
     * @param HighLogExpireDay <p>高频存储天数</p>
     */
    public void setHighLogExpireDay(Long HighLogExpireDay) {
        this.HighLogExpireDay = HighLogExpireDay;
    }

    /**
     * Get <p>低频存储天数</p> 
     * @return LowLogExpireDay <p>低频存储天数</p>
     */
    public Long getLowLogExpireDay() {
        return this.LowLogExpireDay;
    }

    /**
     * Set <p>低频存储天数</p>
     * @param LowLogExpireDay <p>低频存储天数</p>
     */
    public void setLowLogExpireDay(Long LowLogExpireDay) {
        this.LowLogExpireDay = LowLogExpireDay;
    }

    /**
     * Get <p>总存储时长</p> 
     * @return LogExpireDay <p>总存储时长</p>
     */
    public Long getLogExpireDay() {
        return this.LogExpireDay;
    }

    /**
     * Set <p>总存储时长</p>
     * @param LogExpireDay <p>总存储时长</p>
     */
    public void setLogExpireDay(Long LogExpireDay) {
        this.LogExpireDay = LogExpireDay;
    }

    /**
     * Get <p>高频存储量，单位：MB</p> 
     * @return HighStorage <p>高频存储量，单位：MB</p>
     */
    public Float getHighStorage() {
        return this.HighStorage;
    }

    /**
     * Set <p>高频存储量，单位：MB</p>
     * @param HighStorage <p>高频存储量，单位：MB</p>
     */
    public void setHighStorage(Float HighStorage) {
        this.HighStorage = HighStorage;
    }

    /**
     * Get <p>低频存储量，单位：MB</p> 
     * @return LowStorage <p>低频存储量，单位：MB</p>
     */
    public Float getLowStorage() {
        return this.LowStorage;
    }

    /**
     * Set <p>低频存储量，单位：MB</p>
     * @param LowStorage <p>低频存储量，单位：MB</p>
     */
    public void setLowStorage(Float LowStorage) {
        this.LowStorage = LowStorage;
    }

    /**
     * Get <p>总存储量</p> 
     * @return LogStorage <p>总存储量</p>
     */
    public Float getLogStorage() {
        return this.LogStorage;
    }

    /**
     * Set <p>总存储量</p>
     * @param LogStorage <p>总存储量</p>
     */
    public void setLogStorage(Float LogStorage) {
        this.LogStorage = LogStorage;
    }

    /**
     * Get <p>是否开启投递：ON，OFF</p> 
     * @return Deliver <p>是否开启投递：ON，OFF</p>
     */
    public String getDeliver() {
        return this.Deliver;
    }

    /**
     * Set <p>是否开启投递：ON，OFF</p>
     * @param Deliver <p>是否开启投递：ON，OFF</p>
     */
    public void setDeliver(String Deliver) {
        this.Deliver = Deliver;
    }

    /**
     * Get <p>日志投递信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeliverSummary <p>日志投递信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DeliverSummary [] getDeliverSummary() {
        return this.DeliverSummary;
    }

    /**
     * Set <p>日志投递信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeliverSummary <p>日志投递信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeliverSummary(DeliverSummary [] DeliverSummary) {
        this.DeliverSummary = DeliverSummary;
    }

    /**
     * Get <p>业务侧实例相关信息，根据业务不同，返回相关信息不同。</p> 
     * @return InstanceInfo <p>业务侧实例相关信息，根据业务不同，返回相关信息不同。</p>
     */
    public InstanceInfo getInstanceInfo() {
        return this.InstanceInfo;
    }

    /**
     * Set <p>业务侧实例相关信息，根据业务不同，返回相关信息不同。</p>
     * @param InstanceInfo <p>业务侧实例相关信息，根据业务不同，返回相关信息不同。</p>
     */
    public void setInstanceInfo(InstanceInfo InstanceInfo) {
        this.InstanceInfo = InstanceInfo;
    }

    /**
     * Get <p>审计子类型</p> 
     * @return LogSubType <p>审计子类型</p>
     */
    public String getLogSubType() {
        return this.LogSubType;
    }

    /**
     * Set <p>审计子类型</p>
     * @param LogSubType <p>审计子类型</p>
     */
    public void setLogSubType(String LogSubType) {
        this.LogSubType = LogSubType;
    }

    public LogInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogInstance(LogInstance source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.EnableQuery != null) {
            this.EnableQuery = new String(source.EnableQuery);
        }
        if (source.CreateAt != null) {
            this.CreateAt = new String(source.CreateAt);
        }
        if (source.HighLogExpireDay != null) {
            this.HighLogExpireDay = new Long(source.HighLogExpireDay);
        }
        if (source.LowLogExpireDay != null) {
            this.LowLogExpireDay = new Long(source.LowLogExpireDay);
        }
        if (source.LogExpireDay != null) {
            this.LogExpireDay = new Long(source.LogExpireDay);
        }
        if (source.HighStorage != null) {
            this.HighStorage = new Float(source.HighStorage);
        }
        if (source.LowStorage != null) {
            this.LowStorage = new Float(source.LowStorage);
        }
        if (source.LogStorage != null) {
            this.LogStorage = new Float(source.LogStorage);
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
            this.InstanceInfo = new InstanceInfo(source.InstanceInfo);
        }
        if (source.LogSubType != null) {
            this.LogSubType = new String(source.LogSubType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "EnableQuery", this.EnableQuery);
        this.setParamSimple(map, prefix + "CreateAt", this.CreateAt);
        this.setParamSimple(map, prefix + "HighLogExpireDay", this.HighLogExpireDay);
        this.setParamSimple(map, prefix + "LowLogExpireDay", this.LowLogExpireDay);
        this.setParamSimple(map, prefix + "LogExpireDay", this.LogExpireDay);
        this.setParamSimple(map, prefix + "HighStorage", this.HighStorage);
        this.setParamSimple(map, prefix + "LowStorage", this.LowStorage);
        this.setParamSimple(map, prefix + "LogStorage", this.LogStorage);
        this.setParamSimple(map, prefix + "Deliver", this.Deliver);
        this.setParamArrayObj(map, prefix + "DeliverSummary.", this.DeliverSummary);
        this.setParamObj(map, prefix + "InstanceInfo.", this.InstanceInfo);
        this.setParamSimple(map, prefix + "LogSubType", this.LogSubType);

    }
}

