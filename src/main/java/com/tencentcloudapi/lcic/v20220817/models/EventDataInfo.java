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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EventDataInfo extends AbstractModel {

    /**
    * <p>事件发生的房间号。</p>
    */
    @SerializedName("RoomId")
    @Expose
    private Long RoomId;

    /**
    * <p>事件发生的用户。</p>
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * <p>用户设备类型。0: Unknown; 1: Windows; 2: macOS; 3: Android; 4: iOS; 5: Web; 6: Mobile webpage; 7: Weixin Mini Program.</p>
    */
    @SerializedName("Device")
    @Expose
    private Long Device;

    /**
    * <p>录制时长。单位：秒</p>
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * <p>录制文件大小</p>
    */
    @SerializedName("RecordSize")
    @Expose
    private Long RecordSize;

    /**
    * <p>录制url</p>
    */
    @SerializedName("RecordUrl")
    @Expose
    private String RecordUrl;

    /**
    * <p>MemberQuit事件，对应Reason（0:主动退出 1:被踢 2:永久被踢 4:失去心跳下线 5:房间结束，成员自动退出）</p>
    */
    @SerializedName("Reason")
    @Expose
    private Long Reason;

    /**
    * <p>角色</p><p>枚举值：</p><ul><li>0： 学生</li><li>1： 老师</li><li>2： 助教</li><li>3： 巡课/督导</li></ul>
    */
    @SerializedName("Role")
    @Expose
    private Long Role;

    /**
     * Get <p>事件发生的房间号。</p> 
     * @return RoomId <p>事件发生的房间号。</p>
     */
    public Long getRoomId() {
        return this.RoomId;
    }

    /**
     * Set <p>事件发生的房间号。</p>
     * @param RoomId <p>事件发生的房间号。</p>
     */
    public void setRoomId(Long RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get <p>事件发生的用户。</p> 
     * @return UserId <p>事件发生的用户。</p>
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set <p>事件发生的用户。</p>
     * @param UserId <p>事件发生的用户。</p>
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get <p>用户设备类型。0: Unknown; 1: Windows; 2: macOS; 3: Android; 4: iOS; 5: Web; 6: Mobile webpage; 7: Weixin Mini Program.</p> 
     * @return Device <p>用户设备类型。0: Unknown; 1: Windows; 2: macOS; 3: Android; 4: iOS; 5: Web; 6: Mobile webpage; 7: Weixin Mini Program.</p>
     */
    public Long getDevice() {
        return this.Device;
    }

    /**
     * Set <p>用户设备类型。0: Unknown; 1: Windows; 2: macOS; 3: Android; 4: iOS; 5: Web; 6: Mobile webpage; 7: Weixin Mini Program.</p>
     * @param Device <p>用户设备类型。0: Unknown; 1: Windows; 2: macOS; 3: Android; 4: iOS; 5: Web; 6: Mobile webpage; 7: Weixin Mini Program.</p>
     */
    public void setDevice(Long Device) {
        this.Device = Device;
    }

    /**
     * Get <p>录制时长。单位：秒</p> 
     * @return Duration <p>录制时长。单位：秒</p>
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set <p>录制时长。单位：秒</p>
     * @param Duration <p>录制时长。单位：秒</p>
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get <p>录制文件大小</p> 
     * @return RecordSize <p>录制文件大小</p>
     */
    public Long getRecordSize() {
        return this.RecordSize;
    }

    /**
     * Set <p>录制文件大小</p>
     * @param RecordSize <p>录制文件大小</p>
     */
    public void setRecordSize(Long RecordSize) {
        this.RecordSize = RecordSize;
    }

    /**
     * Get <p>录制url</p> 
     * @return RecordUrl <p>录制url</p>
     */
    public String getRecordUrl() {
        return this.RecordUrl;
    }

    /**
     * Set <p>录制url</p>
     * @param RecordUrl <p>录制url</p>
     */
    public void setRecordUrl(String RecordUrl) {
        this.RecordUrl = RecordUrl;
    }

    /**
     * Get <p>MemberQuit事件，对应Reason（0:主动退出 1:被踢 2:永久被踢 4:失去心跳下线 5:房间结束，成员自动退出）</p> 
     * @return Reason <p>MemberQuit事件，对应Reason（0:主动退出 1:被踢 2:永久被踢 4:失去心跳下线 5:房间结束，成员自动退出）</p>
     */
    public Long getReason() {
        return this.Reason;
    }

    /**
     * Set <p>MemberQuit事件，对应Reason（0:主动退出 1:被踢 2:永久被踢 4:失去心跳下线 5:房间结束，成员自动退出）</p>
     * @param Reason <p>MemberQuit事件，对应Reason（0:主动退出 1:被踢 2:永久被踢 4:失去心跳下线 5:房间结束，成员自动退出）</p>
     */
    public void setReason(Long Reason) {
        this.Reason = Reason;
    }

    /**
     * Get <p>角色</p><p>枚举值：</p><ul><li>0： 学生</li><li>1： 老师</li><li>2： 助教</li><li>3： 巡课/督导</li></ul> 
     * @return Role <p>角色</p><p>枚举值：</p><ul><li>0： 学生</li><li>1： 老师</li><li>2： 助教</li><li>3： 巡课/督导</li></ul>
     */
    public Long getRole() {
        return this.Role;
    }

    /**
     * Set <p>角色</p><p>枚举值：</p><ul><li>0： 学生</li><li>1： 老师</li><li>2： 助教</li><li>3： 巡课/督导</li></ul>
     * @param Role <p>角色</p><p>枚举值：</p><ul><li>0： 学生</li><li>1： 老师</li><li>2： 助教</li><li>3： 巡课/督导</li></ul>
     */
    public void setRole(Long Role) {
        this.Role = Role;
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
        if (source.Reason != null) {
            this.Reason = new Long(source.Reason);
        }
        if (source.Role != null) {
            this.Role = new Long(source.Role);
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
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamSimple(map, prefix + "Role", this.Role);

    }
}

