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
package com.tencentcloudapi.iotvideoindustry.v20201201.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WarningsData extends AbstractModel{

    /**
    * 唯一ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 设备ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * 设备名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * 告警通道
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WarnChannel")
    @Expose
    private String WarnChannel;

    /**
    * 告警级别 1: "一级警情", 2: "二级警情", 3: "三级警情", 4: "四级警情",
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WarnLevel")
    @Expose
    private Long WarnLevel;

    /**
    * 告警级别名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WarnLevelName")
    @Expose
    private String WarnLevelName;

    /**
    * 告警方式 2 设备报警 5 视频报警 6 设备故障报警
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WarnMode")
    @Expose
    private Long WarnMode;

    /**
    * 告警方式名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WarnModeName")
    @Expose
    private String WarnModeName;

    /**
    * 告警类型  2: {
			Name: "设备报警",
			WarnType: map[int]string{
				1: "视频丢失报警",
				2: "设备防拆报警",
				3: "存储设备磁盘满报警",
				4: "设备高温报警",
				5: "设备低温报警",
			},
		},
		5: {
			Name: "视频报警",
			WarnType: map[int]string{
				1:  "人工视频报警",
				2:  "运动目标检测报警",
				3:  "遗留物检测报警",
				4:  "物体移除检测报警",
				5:  "绊线检测报警",
				6:  "入侵检测报警",
				7:  "逆行检测报警",
				8:  "徘徊检测报警",
				9:  "流量统计报警",
				10: "密度检测报警",
				11: "视频异常检测报警",
				12: "快速移动报警",
			},
		},
		6: {
			Name: "设备故障报警",
			WarnType: map[int]string{
				1: "存储设备磁盘故障报警",
				2: "存储设备风扇故障报警",
			},
		}
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WarnType")
    @Expose
    private Long WarnType;

    /**
    * 是否删除
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Del")
    @Expose
    private Long Del;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get 唯一ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id 唯一ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 唯一ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id 唯一ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 设备ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeviceId 设备ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set 设备ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeviceId 设备ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get 设备名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeviceName 设备名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set 设备名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeviceName 设备名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get 告警通道
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WarnChannel 告警通道
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWarnChannel() {
        return this.WarnChannel;
    }

    /**
     * Set 告警通道
注意：此字段可能返回 null，表示取不到有效值。
     * @param WarnChannel 告警通道
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWarnChannel(String WarnChannel) {
        this.WarnChannel = WarnChannel;
    }

    /**
     * Get 告警级别 1: "一级警情", 2: "二级警情", 3: "三级警情", 4: "四级警情",
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WarnLevel 告警级别 1: "一级警情", 2: "二级警情", 3: "三级警情", 4: "四级警情",
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWarnLevel() {
        return this.WarnLevel;
    }

    /**
     * Set 告警级别 1: "一级警情", 2: "二级警情", 3: "三级警情", 4: "四级警情",
注意：此字段可能返回 null，表示取不到有效值。
     * @param WarnLevel 告警级别 1: "一级警情", 2: "二级警情", 3: "三级警情", 4: "四级警情",
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWarnLevel(Long WarnLevel) {
        this.WarnLevel = WarnLevel;
    }

    /**
     * Get 告警级别名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WarnLevelName 告警级别名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWarnLevelName() {
        return this.WarnLevelName;
    }

    /**
     * Set 告警级别名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param WarnLevelName 告警级别名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWarnLevelName(String WarnLevelName) {
        this.WarnLevelName = WarnLevelName;
    }

    /**
     * Get 告警方式 2 设备报警 5 视频报警 6 设备故障报警
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WarnMode 告警方式 2 设备报警 5 视频报警 6 设备故障报警
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWarnMode() {
        return this.WarnMode;
    }

    /**
     * Set 告警方式 2 设备报警 5 视频报警 6 设备故障报警
注意：此字段可能返回 null，表示取不到有效值。
     * @param WarnMode 告警方式 2 设备报警 5 视频报警 6 设备故障报警
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWarnMode(Long WarnMode) {
        this.WarnMode = WarnMode;
    }

    /**
     * Get 告警方式名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WarnModeName 告警方式名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWarnModeName() {
        return this.WarnModeName;
    }

    /**
     * Set 告警方式名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param WarnModeName 告警方式名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWarnModeName(String WarnModeName) {
        this.WarnModeName = WarnModeName;
    }

    /**
     * Get 告警类型  2: {
			Name: "设备报警",
			WarnType: map[int]string{
				1: "视频丢失报警",
				2: "设备防拆报警",
				3: "存储设备磁盘满报警",
				4: "设备高温报警",
				5: "设备低温报警",
			},
		},
		5: {
			Name: "视频报警",
			WarnType: map[int]string{
				1:  "人工视频报警",
				2:  "运动目标检测报警",
				3:  "遗留物检测报警",
				4:  "物体移除检测报警",
				5:  "绊线检测报警",
				6:  "入侵检测报警",
				7:  "逆行检测报警",
				8:  "徘徊检测报警",
				9:  "流量统计报警",
				10: "密度检测报警",
				11: "视频异常检测报警",
				12: "快速移动报警",
			},
		},
		6: {
			Name: "设备故障报警",
			WarnType: map[int]string{
				1: "存储设备磁盘故障报警",
				2: "存储设备风扇故障报警",
			},
		}
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WarnType 告警类型  2: {
			Name: "设备报警",
			WarnType: map[int]string{
				1: "视频丢失报警",
				2: "设备防拆报警",
				3: "存储设备磁盘满报警",
				4: "设备高温报警",
				5: "设备低温报警",
			},
		},
		5: {
			Name: "视频报警",
			WarnType: map[int]string{
				1:  "人工视频报警",
				2:  "运动目标检测报警",
				3:  "遗留物检测报警",
				4:  "物体移除检测报警",
				5:  "绊线检测报警",
				6:  "入侵检测报警",
				7:  "逆行检测报警",
				8:  "徘徊检测报警",
				9:  "流量统计报警",
				10: "密度检测报警",
				11: "视频异常检测报警",
				12: "快速移动报警",
			},
		},
		6: {
			Name: "设备故障报警",
			WarnType: map[int]string{
				1: "存储设备磁盘故障报警",
				2: "存储设备风扇故障报警",
			},
		}
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWarnType() {
        return this.WarnType;
    }

    /**
     * Set 告警类型  2: {
			Name: "设备报警",
			WarnType: map[int]string{
				1: "视频丢失报警",
				2: "设备防拆报警",
				3: "存储设备磁盘满报警",
				4: "设备高温报警",
				5: "设备低温报警",
			},
		},
		5: {
			Name: "视频报警",
			WarnType: map[int]string{
				1:  "人工视频报警",
				2:  "运动目标检测报警",
				3:  "遗留物检测报警",
				4:  "物体移除检测报警",
				5:  "绊线检测报警",
				6:  "入侵检测报警",
				7:  "逆行检测报警",
				8:  "徘徊检测报警",
				9:  "流量统计报警",
				10: "密度检测报警",
				11: "视频异常检测报警",
				12: "快速移动报警",
			},
		},
		6: {
			Name: "设备故障报警",
			WarnType: map[int]string{
				1: "存储设备磁盘故障报警",
				2: "存储设备风扇故障报警",
			},
		}
注意：此字段可能返回 null，表示取不到有效值。
     * @param WarnType 告警类型  2: {
			Name: "设备报警",
			WarnType: map[int]string{
				1: "视频丢失报警",
				2: "设备防拆报警",
				3: "存储设备磁盘满报警",
				4: "设备高温报警",
				5: "设备低温报警",
			},
		},
		5: {
			Name: "视频报警",
			WarnType: map[int]string{
				1:  "人工视频报警",
				2:  "运动目标检测报警",
				3:  "遗留物检测报警",
				4:  "物体移除检测报警",
				5:  "绊线检测报警",
				6:  "入侵检测报警",
				7:  "逆行检测报警",
				8:  "徘徊检测报警",
				9:  "流量统计报警",
				10: "密度检测报警",
				11: "视频异常检测报警",
				12: "快速移动报警",
			},
		},
		6: {
			Name: "设备故障报警",
			WarnType: map[int]string{
				1: "存储设备磁盘故障报警",
				2: "存储设备风扇故障报警",
			},
		}
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWarnType(Long WarnType) {
        this.WarnType = WarnType;
    }

    /**
     * Get 是否删除
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Del 是否删除
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDel() {
        return this.Del;
    }

    /**
     * Set 是否删除
注意：此字段可能返回 null，表示取不到有效值。
     * @param Del 是否删除
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDel(Long Del) {
        this.Del = Del;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public WarningsData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WarningsData(WarningsData source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.WarnChannel != null) {
            this.WarnChannel = new String(source.WarnChannel);
        }
        if (source.WarnLevel != null) {
            this.WarnLevel = new Long(source.WarnLevel);
        }
        if (source.WarnLevelName != null) {
            this.WarnLevelName = new String(source.WarnLevelName);
        }
        if (source.WarnMode != null) {
            this.WarnMode = new Long(source.WarnMode);
        }
        if (source.WarnModeName != null) {
            this.WarnModeName = new String(source.WarnModeName);
        }
        if (source.WarnType != null) {
            this.WarnType = new Long(source.WarnType);
        }
        if (source.Del != null) {
            this.Del = new Long(source.Del);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "WarnChannel", this.WarnChannel);
        this.setParamSimple(map, prefix + "WarnLevel", this.WarnLevel);
        this.setParamSimple(map, prefix + "WarnLevelName", this.WarnLevelName);
        this.setParamSimple(map, prefix + "WarnMode", this.WarnMode);
        this.setParamSimple(map, prefix + "WarnModeName", this.WarnModeName);
        this.setParamSimple(map, prefix + "WarnType", this.WarnType);
        this.setParamSimple(map, prefix + "Del", this.Del);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

