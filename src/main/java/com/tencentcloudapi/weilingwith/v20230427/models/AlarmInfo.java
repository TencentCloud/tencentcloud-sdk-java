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
package com.tencentcloudapi.weilingwith.v20230427.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AlarmInfo extends AbstractModel {

    /**
    * 工作空间id
    */
    @SerializedName("WorkspaceId")
    @Expose
    private Long WorkspaceId;

    /**
    * 告警ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 告警状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 告警时间
    */
    @SerializedName("Time")
    @Expose
    private Long Time;

    /**
    * 告警业务类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 告警业务类型名称
    */
    @SerializedName("TypeName")
    @Expose
    private String TypeName;

    /**
    * 子告警类型
    */
    @SerializedName("SubType")
    @Expose
    private String SubType;

    /**
    * 子告警类型名称
    */
    @SerializedName("SubTypeName")
    @Expose
    private String SubTypeName;

    /**
    * 告警级别id
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * 告警级别名称
    */
    @SerializedName("LevelName")
    @Expose
    private String LevelName;

    /**
    * 上报应用appid
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 设备wid
    */
    @SerializedName("WID")
    @Expose
    private String WID;

    /**
    * 设备名称
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * 空间位置
    */
    @SerializedName("Position")
    @Expose
    private String Position;

    /**
    * 上报图片
    */
    @SerializedName("ReportImg")
    @Expose
    private ReportImg ReportImg;

    /**
    * 告警描述
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * 处理人
    */
    @SerializedName("HandlePersonSet")
    @Expose
    private HandlerPersonInfo [] HandlePersonSet;

    /**
    * 处理记录
    */
    @SerializedName("HandleRecordSet")
    @Expose
    private HandleRecordInfo [] HandleRecordSet;

    /**
    * 扩展信息
    */
    @SerializedName("Extend")
    @Expose
    private String Extend;

    /**
    * 应用扩展字段1
    */
    @SerializedName("ExtendOne")
    @Expose
    private String ExtendOne;

    /**
    * 应用扩展字段2
    */
    @SerializedName("ExtendTwo")
    @Expose
    private String ExtendTwo;

    /**
    * 应用透传字段,有效字段为x-json后的字段
    */
    @SerializedName("Echo")
    @Expose
    private String Echo;

    /**
     * Get 工作空间id 
     * @return WorkspaceId 工作空间id
     */
    public Long getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set 工作空间id
     * @param WorkspaceId 工作空间id
     */
    public void setWorkspaceId(Long WorkspaceId) {
        this.WorkspaceId = WorkspaceId;
    }

    /**
     * Get 告警ID 
     * @return Id 告警ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 告警ID
     * @param Id 告警ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 告警状态 
     * @return Status 告警状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 告警状态
     * @param Status 告警状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 告警时间 
     * @return Time 告警时间
     */
    public Long getTime() {
        return this.Time;
    }

    /**
     * Set 告警时间
     * @param Time 告警时间
     */
    public void setTime(Long Time) {
        this.Time = Time;
    }

    /**
     * Get 告警业务类型 
     * @return Type 告警业务类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 告警业务类型
     * @param Type 告警业务类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 告警业务类型名称 
     * @return TypeName 告警业务类型名称
     */
    public String getTypeName() {
        return this.TypeName;
    }

    /**
     * Set 告警业务类型名称
     * @param TypeName 告警业务类型名称
     */
    public void setTypeName(String TypeName) {
        this.TypeName = TypeName;
    }

    /**
     * Get 子告警类型 
     * @return SubType 子告警类型
     */
    public String getSubType() {
        return this.SubType;
    }

    /**
     * Set 子告警类型
     * @param SubType 子告警类型
     */
    public void setSubType(String SubType) {
        this.SubType = SubType;
    }

    /**
     * Get 子告警类型名称 
     * @return SubTypeName 子告警类型名称
     */
    public String getSubTypeName() {
        return this.SubTypeName;
    }

    /**
     * Set 子告警类型名称
     * @param SubTypeName 子告警类型名称
     */
    public void setSubTypeName(String SubTypeName) {
        this.SubTypeName = SubTypeName;
    }

    /**
     * Get 告警级别id 
     * @return Level 告警级别id
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set 告警级别id
     * @param Level 告警级别id
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get 告警级别名称 
     * @return LevelName 告警级别名称
     */
    public String getLevelName() {
        return this.LevelName;
    }

    /**
     * Set 告警级别名称
     * @param LevelName 告警级别名称
     */
    public void setLevelName(String LevelName) {
        this.LevelName = LevelName;
    }

    /**
     * Get 上报应用appid 
     * @return AppId 上报应用appid
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 上报应用appid
     * @param AppId 上报应用appid
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 设备wid 
     * @return WID 设备wid
     */
    public String getWID() {
        return this.WID;
    }

    /**
     * Set 设备wid
     * @param WID 设备wid
     */
    public void setWID(String WID) {
        this.WID = WID;
    }

    /**
     * Get 设备名称 
     * @return DeviceName 设备名称
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set 设备名称
     * @param DeviceName 设备名称
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get 空间位置 
     * @return Position 空间位置
     */
    public String getPosition() {
        return this.Position;
    }

    /**
     * Set 空间位置
     * @param Position 空间位置
     */
    public void setPosition(String Position) {
        this.Position = Position;
    }

    /**
     * Get 上报图片 
     * @return ReportImg 上报图片
     */
    public ReportImg getReportImg() {
        return this.ReportImg;
    }

    /**
     * Set 上报图片
     * @param ReportImg 上报图片
     */
    public void setReportImg(ReportImg ReportImg) {
        this.ReportImg = ReportImg;
    }

    /**
     * Get 告警描述 
     * @return Desc 告警描述
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set 告警描述
     * @param Desc 告警描述
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get 处理人 
     * @return HandlePersonSet 处理人
     */
    public HandlerPersonInfo [] getHandlePersonSet() {
        return this.HandlePersonSet;
    }

    /**
     * Set 处理人
     * @param HandlePersonSet 处理人
     */
    public void setHandlePersonSet(HandlerPersonInfo [] HandlePersonSet) {
        this.HandlePersonSet = HandlePersonSet;
    }

    /**
     * Get 处理记录 
     * @return HandleRecordSet 处理记录
     */
    public HandleRecordInfo [] getHandleRecordSet() {
        return this.HandleRecordSet;
    }

    /**
     * Set 处理记录
     * @param HandleRecordSet 处理记录
     */
    public void setHandleRecordSet(HandleRecordInfo [] HandleRecordSet) {
        this.HandleRecordSet = HandleRecordSet;
    }

    /**
     * Get 扩展信息 
     * @return Extend 扩展信息
     */
    public String getExtend() {
        return this.Extend;
    }

    /**
     * Set 扩展信息
     * @param Extend 扩展信息
     */
    public void setExtend(String Extend) {
        this.Extend = Extend;
    }

    /**
     * Get 应用扩展字段1 
     * @return ExtendOne 应用扩展字段1
     */
    public String getExtendOne() {
        return this.ExtendOne;
    }

    /**
     * Set 应用扩展字段1
     * @param ExtendOne 应用扩展字段1
     */
    public void setExtendOne(String ExtendOne) {
        this.ExtendOne = ExtendOne;
    }

    /**
     * Get 应用扩展字段2 
     * @return ExtendTwo 应用扩展字段2
     */
    public String getExtendTwo() {
        return this.ExtendTwo;
    }

    /**
     * Set 应用扩展字段2
     * @param ExtendTwo 应用扩展字段2
     */
    public void setExtendTwo(String ExtendTwo) {
        this.ExtendTwo = ExtendTwo;
    }

    /**
     * Get 应用透传字段,有效字段为x-json后的字段 
     * @return Echo 应用透传字段,有效字段为x-json后的字段
     */
    public String getEcho() {
        return this.Echo;
    }

    /**
     * Set 应用透传字段,有效字段为x-json后的字段
     * @param Echo 应用透传字段,有效字段为x-json后的字段
     */
    public void setEcho(String Echo) {
        this.Echo = Echo;
    }

    public AlarmInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlarmInfo(AlarmInfo source) {
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new Long(source.WorkspaceId);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Time != null) {
            this.Time = new Long(source.Time);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.TypeName != null) {
            this.TypeName = new String(source.TypeName);
        }
        if (source.SubType != null) {
            this.SubType = new String(source.SubType);
        }
        if (source.SubTypeName != null) {
            this.SubTypeName = new String(source.SubTypeName);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.LevelName != null) {
            this.LevelName = new String(source.LevelName);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.WID != null) {
            this.WID = new String(source.WID);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.Position != null) {
            this.Position = new String(source.Position);
        }
        if (source.ReportImg != null) {
            this.ReportImg = new ReportImg(source.ReportImg);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.HandlePersonSet != null) {
            this.HandlePersonSet = new HandlerPersonInfo[source.HandlePersonSet.length];
            for (int i = 0; i < source.HandlePersonSet.length; i++) {
                this.HandlePersonSet[i] = new HandlerPersonInfo(source.HandlePersonSet[i]);
            }
        }
        if (source.HandleRecordSet != null) {
            this.HandleRecordSet = new HandleRecordInfo[source.HandleRecordSet.length];
            for (int i = 0; i < source.HandleRecordSet.length; i++) {
                this.HandleRecordSet[i] = new HandleRecordInfo(source.HandleRecordSet[i]);
            }
        }
        if (source.Extend != null) {
            this.Extend = new String(source.Extend);
        }
        if (source.ExtendOne != null) {
            this.ExtendOne = new String(source.ExtendOne);
        }
        if (source.ExtendTwo != null) {
            this.ExtendTwo = new String(source.ExtendTwo);
        }
        if (source.Echo != null) {
            this.Echo = new String(source.Echo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "TypeName", this.TypeName);
        this.setParamSimple(map, prefix + "SubType", this.SubType);
        this.setParamSimple(map, prefix + "SubTypeName", this.SubTypeName);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "LevelName", this.LevelName);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "WID", this.WID);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "Position", this.Position);
        this.setParamObj(map, prefix + "ReportImg.", this.ReportImg);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamArrayObj(map, prefix + "HandlePersonSet.", this.HandlePersonSet);
        this.setParamArrayObj(map, prefix + "HandleRecordSet.", this.HandleRecordSet);
        this.setParamSimple(map, prefix + "Extend", this.Extend);
        this.setParamSimple(map, prefix + "ExtendOne", this.ExtendOne);
        this.setParamSimple(map, prefix + "ExtendTwo", this.ExtendTwo);
        this.setParamSimple(map, prefix + "Echo", this.Echo);

    }
}

