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
package com.tencentcloudapi.iotvideo.v20191126.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogData extends AbstractModel{

    /**
    * 发生时间 UNIX时间戳，单位秒
    */
    @SerializedName("Occurtime")
    @Expose
    private Long Occurtime;

    /**
    * 日志类型 1在线状态变更 2FP变更 3SP变更 4CO控制 5ST变更 6EV事件
    */
    @SerializedName("LogType")
    @Expose
    private Long LogType;

    /**
    * 物模型对象索引
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataObject")
    @Expose
    private String DataObject;

    /**
    * 物模型旧值  json串
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OldValue")
    @Expose
    private String OldValue;

    /**
    * 物模型新值  json串
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NewValue")
    @Expose
    private String NewValue;

    /**
     * Get 发生时间 UNIX时间戳，单位秒 
     * @return Occurtime 发生时间 UNIX时间戳，单位秒
     */
    public Long getOccurtime() {
        return this.Occurtime;
    }

    /**
     * Set 发生时间 UNIX时间戳，单位秒
     * @param Occurtime 发生时间 UNIX时间戳，单位秒
     */
    public void setOccurtime(Long Occurtime) {
        this.Occurtime = Occurtime;
    }

    /**
     * Get 日志类型 1在线状态变更 2FP变更 3SP变更 4CO控制 5ST变更 6EV事件 
     * @return LogType 日志类型 1在线状态变更 2FP变更 3SP变更 4CO控制 5ST变更 6EV事件
     */
    public Long getLogType() {
        return this.LogType;
    }

    /**
     * Set 日志类型 1在线状态变更 2FP变更 3SP变更 4CO控制 5ST变更 6EV事件
     * @param LogType 日志类型 1在线状态变更 2FP变更 3SP变更 4CO控制 5ST变更 6EV事件
     */
    public void setLogType(Long LogType) {
        this.LogType = LogType;
    }

    /**
     * Get 物模型对象索引
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataObject 物模型对象索引
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDataObject() {
        return this.DataObject;
    }

    /**
     * Set 物模型对象索引
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataObject 物模型对象索引
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataObject(String DataObject) {
        this.DataObject = DataObject;
    }

    /**
     * Get 物模型旧值  json串
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OldValue 物模型旧值  json串
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOldValue() {
        return this.OldValue;
    }

    /**
     * Set 物模型旧值  json串
注意：此字段可能返回 null，表示取不到有效值。
     * @param OldValue 物模型旧值  json串
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOldValue(String OldValue) {
        this.OldValue = OldValue;
    }

    /**
     * Get 物模型新值  json串
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NewValue 物模型新值  json串
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNewValue() {
        return this.NewValue;
    }

    /**
     * Set 物模型新值  json串
注意：此字段可能返回 null，表示取不到有效值。
     * @param NewValue 物模型新值  json串
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNewValue(String NewValue) {
        this.NewValue = NewValue;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Occurtime", this.Occurtime);
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamSimple(map, prefix + "DataObject", this.DataObject);
        this.setParamSimple(map, prefix + "OldValue", this.OldValue);
        this.setParamSimple(map, prefix + "NewValue", this.NewValue);

    }
}

