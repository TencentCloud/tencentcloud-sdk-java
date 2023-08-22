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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EventDataInfo extends AbstractModel{

    /**
    * 事件发生的房间号。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RoomId")
    @Expose
    private Long RoomId;

    /**
    * 事件发生的用户。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 用户设备类型。0: Unknown; 1: Windows; 2: macOS; 3: Android; 4: iOS; 5: Web; 6: Mobile webpage; 7: Weixin Mini Program.
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Device")
    @Expose
    private Long Device;

    /**
    * 录制时长。单位：秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * 录制文件大小
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RecordSize")
    @Expose
    private Long RecordSize;

    /**
    * 录制url
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RecordUrl")
    @Expose
    private String RecordUrl;

    /**
     * Get 事件发生的房间号。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RoomId 事件发生的房间号。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRoomId() {
        return this.RoomId;
    }

    /**
     * Set 事件发生的房间号。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RoomId 事件发生的房间号。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRoomId(Long RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get 事件发生的用户。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserId 事件发生的用户。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 事件发生的用户。
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserId 事件发生的用户。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 用户设备类型。0: Unknown; 1: Windows; 2: macOS; 3: Android; 4: iOS; 5: Web; 6: Mobile webpage; 7: Weixin Mini Program.
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Device 用户设备类型。0: Unknown; 1: Windows; 2: macOS; 3: Android; 4: iOS; 5: Web; 6: Mobile webpage; 7: Weixin Mini Program.
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDevice() {
        return this.Device;
    }

    /**
     * Set 用户设备类型。0: Unknown; 1: Windows; 2: macOS; 3: Android; 4: iOS; 5: Web; 6: Mobile webpage; 7: Weixin Mini Program.
注意：此字段可能返回 null，表示取不到有效值。
     * @param Device 用户设备类型。0: Unknown; 1: Windows; 2: macOS; 3: Android; 4: iOS; 5: Web; 6: Mobile webpage; 7: Weixin Mini Program.
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDevice(Long Device) {
        this.Device = Device;
    }

    /**
     * Get 录制时长。单位：秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Duration 录制时长。单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set 录制时长。单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param Duration 录制时长。单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 录制文件大小
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RecordSize 录制文件大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRecordSize() {
        return this.RecordSize;
    }

    /**
     * Set 录制文件大小
注意：此字段可能返回 null，表示取不到有效值。
     * @param RecordSize 录制文件大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRecordSize(Long RecordSize) {
        this.RecordSize = RecordSize;
    }

    /**
     * Get 录制url
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RecordUrl 录制url
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRecordUrl() {
        return this.RecordUrl;
    }

    /**
     * Set 录制url
注意：此字段可能返回 null，表示取不到有效值。
     * @param RecordUrl 录制url
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRecordUrl(String RecordUrl) {
        this.RecordUrl = RecordUrl;
    }

    public EventDataInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EventDataInfo(EventDataInfo source) {
        if (source.RoomId != null) {
            this.RoomId = new Long(source.RoomId);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.Device != null) {
            this.Device = new Long(source.Device);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.RecordSize != null) {
            this.RecordSize = new Long(source.RecordSize);
        }
        if (source.RecordUrl != null) {
            this.RecordUrl = new String(source.RecordUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "Device", this.Device);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "RecordSize", this.RecordSize);
        this.setParamSimple(map, prefix + "RecordUrl", this.RecordUrl);

    }
}

