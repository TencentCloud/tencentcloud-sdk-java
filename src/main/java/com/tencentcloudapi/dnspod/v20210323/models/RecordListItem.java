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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RecordListItem extends AbstractModel{

    /**
    * 记录Id
    */
    @SerializedName("RecordId")
    @Expose
    private Long RecordId;

    /**
    * 记录值
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * 记录状态，启用：ENABLE，暂停：DISABLE
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 更新时间
    */
    @SerializedName("UpdatedOn")
    @Expose
    private String UpdatedOn;

    /**
    * 主机名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 记录线路
    */
    @SerializedName("Line")
    @Expose
    private String Line;

    /**
    * 线路Id
    */
    @SerializedName("LineId")
    @Expose
    private String LineId;

    /**
    * 记录类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 记录权重，用于负载均衡记录
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * 记录监控状态，正常：OK，告警：WARN，宕机：DOWN，未设置监控或监控暂停则为空
    */
    @SerializedName("MonitorStatus")
    @Expose
    private String MonitorStatus;

    /**
    * 记录备注说明
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 记录缓存时间
    */
    @SerializedName("TTL")
    @Expose
    private Long TTL;

    /**
    * MX值，只有MX记录有
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MX")
    @Expose
    private Long MX;

    /**
     * Get 记录Id 
     * @return RecordId 记录Id
     */
    public Long getRecordId() {
        return this.RecordId;
    }

    /**
     * Set 记录Id
     * @param RecordId 记录Id
     */
    public void setRecordId(Long RecordId) {
        this.RecordId = RecordId;
    }

    /**
     * Get 记录值 
     * @return Value 记录值
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 记录值
     * @param Value 记录值
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get 记录状态，启用：ENABLE，暂停：DISABLE 
     * @return Status 记录状态，启用：ENABLE，暂停：DISABLE
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 记录状态，启用：ENABLE，暂停：DISABLE
     * @param Status 记录状态，启用：ENABLE，暂停：DISABLE
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 更新时间 
     * @return UpdatedOn 更新时间
     */
    public String getUpdatedOn() {
        return this.UpdatedOn;
    }

    /**
     * Set 更新时间
     * @param UpdatedOn 更新时间
     */
    public void setUpdatedOn(String UpdatedOn) {
        this.UpdatedOn = UpdatedOn;
    }

    /**
     * Get 主机名 
     * @return Name 主机名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 主机名
     * @param Name 主机名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 记录线路 
     * @return Line 记录线路
     */
    public String getLine() {
        return this.Line;
    }

    /**
     * Set 记录线路
     * @param Line 记录线路
     */
    public void setLine(String Line) {
        this.Line = Line;
    }

    /**
     * Get 线路Id 
     * @return LineId 线路Id
     */
    public String getLineId() {
        return this.LineId;
    }

    /**
     * Set 线路Id
     * @param LineId 线路Id
     */
    public void setLineId(String LineId) {
        this.LineId = LineId;
    }

    /**
     * Get 记录类型 
     * @return Type 记录类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 记录类型
     * @param Type 记录类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 记录权重，用于负载均衡记录
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Weight 记录权重，用于负载均衡记录
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set 记录权重，用于负载均衡记录
注意：此字段可能返回 null，表示取不到有效值。
     * @param Weight 记录权重，用于负载均衡记录
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get 记录监控状态，正常：OK，告警：WARN，宕机：DOWN，未设置监控或监控暂停则为空 
     * @return MonitorStatus 记录监控状态，正常：OK，告警：WARN，宕机：DOWN，未设置监控或监控暂停则为空
     */
    public String getMonitorStatus() {
        return this.MonitorStatus;
    }

    /**
     * Set 记录监控状态，正常：OK，告警：WARN，宕机：DOWN，未设置监控或监控暂停则为空
     * @param MonitorStatus 记录监控状态，正常：OK，告警：WARN，宕机：DOWN，未设置监控或监控暂停则为空
     */
    public void setMonitorStatus(String MonitorStatus) {
        this.MonitorStatus = MonitorStatus;
    }

    /**
     * Get 记录备注说明 
     * @return Remark 记录备注说明
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 记录备注说明
     * @param Remark 记录备注说明
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 记录缓存时间 
     * @return TTL 记录缓存时间
     */
    public Long getTTL() {
        return this.TTL;
    }

    /**
     * Set 记录缓存时间
     * @param TTL 记录缓存时间
     */
    public void setTTL(Long TTL) {
        this.TTL = TTL;
    }

    /**
     * Get MX值，只有MX记录有
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MX MX值，只有MX记录有
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMX() {
        return this.MX;
    }

    /**
     * Set MX值，只有MX记录有
注意：此字段可能返回 null，表示取不到有效值。
     * @param MX MX值，只有MX记录有
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMX(Long MX) {
        this.MX = MX;
    }

    public RecordListItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecordListItem(RecordListItem source) {
        if (source.RecordId != null) {
            this.RecordId = new Long(source.RecordId);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.UpdatedOn != null) {
            this.UpdatedOn = new String(source.UpdatedOn);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Line != null) {
            this.Line = new String(source.Line);
        }
        if (source.LineId != null) {
            this.LineId = new String(source.LineId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
        if (source.MonitorStatus != null) {
            this.MonitorStatus = new String(source.MonitorStatus);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.TTL != null) {
            this.TTL = new Long(source.TTL);
        }
        if (source.MX != null) {
            this.MX = new Long(source.MX);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "UpdatedOn", this.UpdatedOn);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Line", this.Line);
        this.setParamSimple(map, prefix + "LineId", this.LineId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "MonitorStatus", this.MonitorStatus);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "TTL", this.TTL);
        this.setParamSimple(map, prefix + "MX", this.MX);

    }
}

