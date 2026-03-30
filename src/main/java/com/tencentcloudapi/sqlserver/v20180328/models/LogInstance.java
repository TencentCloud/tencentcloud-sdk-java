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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogInstance extends AbstractModel {

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 日志状态，create：创建中；normal：开启；close：关闭中。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 	
是否可以切换日志查询-取值：yes-可以，no-不可以。该参数主要为控制存量日志迁移到日志平台做查询使用，只有为yes状态才可以调用查询日志接口。
    */
    @SerializedName("EnableQuery")
    @Expose
    private String EnableQuery;

    /**
    * 开启时间
    */
    @SerializedName("CreateAt")
    @Expose
    private String CreateAt;

    /**
    * 高频存储天数
    */
    @SerializedName("HighLogExpireDay")
    @Expose
    private Long HighLogExpireDay;

    /**
    * 低频存储天数
    */
    @SerializedName("LowLogExpireDay")
    @Expose
    private Long LowLogExpireDay;

    /**
    * 总存储时长
    */
    @SerializedName("LogExpireDay")
    @Expose
    private Long LogExpireDay;

    /**
    * 高频存储量，单位：MB
    */
    @SerializedName("HighStorage")
    @Expose
    private Float HighStorage;

    /**
    * 低频存储量，单位：MB
    */
    @SerializedName("LowStorage")
    @Expose
    private Float LowStorage;

    /**
    * 总存储量
    */
    @SerializedName("LogStorage")
    @Expose
    private Float LogStorage;

    /**
    * 是否开启投递：ON，OFF
    */
    @SerializedName("Deliver")
    @Expose
    private String Deliver;

    /**
    * 日志投递信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeliverSummary")
    @Expose
    private DeliverSummary [] DeliverSummary;

    /**
    * 业务侧实例相关信息，根据业务不同，返回相关信息不同。
    */
    @SerializedName("InstanceInfo")
    @Expose
    private InstanceInfo InstanceInfo;

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 日志状态，create：创建中；normal：开启；close：关闭中。 
     * @return Status 日志状态，create：创建中；normal：开启；close：关闭中。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 日志状态，create：创建中；normal：开启；close：关闭中。
     * @param Status 日志状态，create：创建中；normal：开启；close：关闭中。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 	
是否可以切换日志查询-取值：yes-可以，no-不可以。该参数主要为控制存量日志迁移到日志平台做查询使用，只有为yes状态才可以调用查询日志接口。 
     * @return EnableQuery 	
是否可以切换日志查询-取值：yes-可以，no-不可以。该参数主要为控制存量日志迁移到日志平台做查询使用，只有为yes状态才可以调用查询日志接口。
     */
    public String getEnableQuery() {
        return this.EnableQuery;
    }

    /**
     * Set 	
是否可以切换日志查询-取值：yes-可以，no-不可以。该参数主要为控制存量日志迁移到日志平台做查询使用，只有为yes状态才可以调用查询日志接口。
     * @param EnableQuery 	
是否可以切换日志查询-取值：yes-可以，no-不可以。该参数主要为控制存量日志迁移到日志平台做查询使用，只有为yes状态才可以调用查询日志接口。
     */
    public void setEnableQuery(String EnableQuery) {
        this.EnableQuery = EnableQuery;
    }

    /**
     * Get 开启时间 
     * @return CreateAt 开启时间
     */
    public String getCreateAt() {
        return this.CreateAt;
    }

    /**
     * Set 开启时间
     * @param CreateAt 开启时间
     */
    public void setCreateAt(String CreateAt) {
        this.CreateAt = CreateAt;
    }

    /**
     * Get 高频存储天数 
     * @return HighLogExpireDay 高频存储天数
     */
    public Long getHighLogExpireDay() {
        return this.HighLogExpireDay;
    }

    /**
     * Set 高频存储天数
     * @param HighLogExpireDay 高频存储天数
     */
    public void setHighLogExpireDay(Long HighLogExpireDay) {
        this.HighLogExpireDay = HighLogExpireDay;
    }

    /**
     * Get 低频存储天数 
     * @return LowLogExpireDay 低频存储天数
     */
    public Long getLowLogExpireDay() {
        return this.LowLogExpireDay;
    }

    /**
     * Set 低频存储天数
     * @param LowLogExpireDay 低频存储天数
     */
    public void setLowLogExpireDay(Long LowLogExpireDay) {
        this.LowLogExpireDay = LowLogExpireDay;
    }

    /**
     * Get 总存储时长 
     * @return LogExpireDay 总存储时长
     */
    public Long getLogExpireDay() {
        return this.LogExpireDay;
    }

    /**
     * Set 总存储时长
     * @param LogExpireDay 总存储时长
     */
    public void setLogExpireDay(Long LogExpireDay) {
        this.LogExpireDay = LogExpireDay;
    }

    /**
     * Get 高频存储量，单位：MB 
     * @return HighStorage 高频存储量，单位：MB
     */
    public Float getHighStorage() {
        return this.HighStorage;
    }

    /**
     * Set 高频存储量，单位：MB
     * @param HighStorage 高频存储量，单位：MB
     */
    public void setHighStorage(Float HighStorage) {
        this.HighStorage = HighStorage;
    }

    /**
     * Get 低频存储量，单位：MB 
     * @return LowStorage 低频存储量，单位：MB
     */
    public Float getLowStorage() {
        return this.LowStorage;
    }

    /**
     * Set 低频存储量，单位：MB
     * @param LowStorage 低频存储量，单位：MB
     */
    public void setLowStorage(Float LowStorage) {
        this.LowStorage = LowStorage;
    }

    /**
     * Get 总存储量 
     * @return LogStorage 总存储量
     */
    public Float getLogStorage() {
        return this.LogStorage;
    }

    /**
     * Set 总存储量
     * @param LogStorage 总存储量
     */
    public void setLogStorage(Float LogStorage) {
        this.LogStorage = LogStorage;
    }

    /**
     * Get 是否开启投递：ON，OFF 
     * @return Deliver 是否开启投递：ON，OFF
     */
    public String getDeliver() {
        return this.Deliver;
    }

    /**
     * Set 是否开启投递：ON，OFF
     * @param Deliver 是否开启投递：ON，OFF
     */
    public void setDeliver(String Deliver) {
        this.Deliver = Deliver;
    }

    /**
     * Get 日志投递信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeliverSummary 日志投递信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DeliverSummary [] getDeliverSummary() {
        return this.DeliverSummary;
    }

    /**
     * Set 日志投递信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeliverSummary 日志投递信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeliverSummary(DeliverSummary [] DeliverSummary) {
        this.DeliverSummary = DeliverSummary;
    }

    /**
     * Get 业务侧实例相关信息，根据业务不同，返回相关信息不同。 
     * @return InstanceInfo 业务侧实例相关信息，根据业务不同，返回相关信息不同。
     */
    public InstanceInfo getInstanceInfo() {
        return this.InstanceInfo;
    }

    /**
     * Set 业务侧实例相关信息，根据业务不同，返回相关信息不同。
     * @param InstanceInfo 业务侧实例相关信息，根据业务不同，返回相关信息不同。
     */
    public void setInstanceInfo(InstanceInfo InstanceInfo) {
        this.InstanceInfo = InstanceInfo;
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

    }
}

