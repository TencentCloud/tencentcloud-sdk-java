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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyEventNotificationConfigForConsoleRequest extends AbstractModel{

    /**
    * 接收事件通知的方式。默认 "PUSH" 为[ HTTP 回调通知](https://cloud.tencent.com/document/product/266/7829#http.E5.9B.9E.E8.B0.83)，"PULL" 为[基于消息队列的可靠通知](https://cloud.tencent.com/document/product/266/7829#.E5.9F.BA.E4.BA.8E.E6.B6.88.E6.81.AF.E9.98.9F.E5.88.97.E7.9A.84.E5.8F.AF.E9.9D.A0.E9.80.9A.E7.9F.A5)。
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * 采用[ HTTP 回调通知](https://cloud.tencent.com/document/product/266/7829#http.E5.9B.9E.E8.B0.83)接收方式时，用于接收 V3 版本事件通知的地址。
    */
    @SerializedName("NotificationUrlV3")
    @Expose
    private String NotificationUrlV3;

    /**
    * 采用[ HTTP 回调通知](https://cloud.tencent.com/document/product/266/7829#http.E5.9B.9E.E8.B0.83)接收方式时，用于接收 V2 版本事件通知的地址。
    */
    @SerializedName("NotificationUrlV2")
    @Expose
    private String NotificationUrlV2;

    /**
    * 是否接收[视频上传完成](https://cloud.tencent.com/document/product/266/7830)事件通知， 默认 "OFF" 为忽略该事件通知，"ON" 为接收事件通知。
    */
    @SerializedName("UploadMediaCompleteEventSwitch")
    @Expose
    private String UploadMediaCompleteEventSwitch;

    /**
    * 是否接收[视频转码完成](https://cloud.tencent.com/document/product/266/7832)事件通知， 默认 "OFF" 为忽略该事件通知，"ON" 为接收事件通知。
    */
    @SerializedName("TranscodeCompleteEventSwitch")
    @Expose
    private String TranscodeCompleteEventSwitch;

    /**
    * 是否接收[指定时间点截图完成](https://cloud.tencent.com/document/product/266/8105)事件通知，  默认 "OFF" 为忽略该事件通知，"ON" 为接收事件通知。
    */
    @SerializedName("CreateSnapshotByTimeOffsetCompleteEventSwitch")
    @Expose
    private String CreateSnapshotByTimeOffsetCompleteEventSwitch;

    /**
    * 是否接收[视频截取雪碧图完成](https://cloud.tencent.com/document/product/266/8104)事件通知，  默认 "OFF" 为忽略该事件通知，"ON" 为接收事件通知。
    */
    @SerializedName("CreateImageSpriteCompleteEventSwitch")
    @Expose
    private String CreateImageSpriteCompleteEventSwitch;

    /**
    * 是否接收[视频拼接完成](https://cloud.tencent.com/document/product/266/7834)事件通知，  默认 "OFF" 为忽略该事件通知，"ON" 为接收事件通知。
    */
    @SerializedName("ConcatMediaCompleteEventSwitch")
    @Expose
    private String ConcatMediaCompleteEventSwitch;

    /**
    * 是否接收[视频删除完成](https://cloud.tencent.com/document/product/266/13434)事件通知，  默认 "OFF" 为忽略该事件通知，"ON" 为接收事件通知。
    */
    @SerializedName("DeleteMediaCompleteEventSwitch")
    @Expose
    private String DeleteMediaCompleteEventSwitch;

    /**
    * 点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
     * Get 接收事件通知的方式。默认 "PUSH" 为[ HTTP 回调通知](https://cloud.tencent.com/document/product/266/7829#http.E5.9B.9E.E8.B0.83)，"PULL" 为[基于消息队列的可靠通知](https://cloud.tencent.com/document/product/266/7829#.E5.9F.BA.E4.BA.8E.E6.B6.88.E6.81.AF.E9.98.9F.E5.88.97.E7.9A.84.E5.8F.AF.E9.9D.A0.E9.80.9A.E7.9F.A5)。 
     * @return Mode 接收事件通知的方式。默认 "PUSH" 为[ HTTP 回调通知](https://cloud.tencent.com/document/product/266/7829#http.E5.9B.9E.E8.B0.83)，"PULL" 为[基于消息队列的可靠通知](https://cloud.tencent.com/document/product/266/7829#.E5.9F.BA.E4.BA.8E.E6.B6.88.E6.81.AF.E9.98.9F.E5.88.97.E7.9A.84.E5.8F.AF.E9.9D.A0.E9.80.9A.E7.9F.A5)。
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set 接收事件通知的方式。默认 "PUSH" 为[ HTTP 回调通知](https://cloud.tencent.com/document/product/266/7829#http.E5.9B.9E.E8.B0.83)，"PULL" 为[基于消息队列的可靠通知](https://cloud.tencent.com/document/product/266/7829#.E5.9F.BA.E4.BA.8E.E6.B6.88.E6.81.AF.E9.98.9F.E5.88.97.E7.9A.84.E5.8F.AF.E9.9D.A0.E9.80.9A.E7.9F.A5)。
     * @param Mode 接收事件通知的方式。默认 "PUSH" 为[ HTTP 回调通知](https://cloud.tencent.com/document/product/266/7829#http.E5.9B.9E.E8.B0.83)，"PULL" 为[基于消息队列的可靠通知](https://cloud.tencent.com/document/product/266/7829#.E5.9F.BA.E4.BA.8E.E6.B6.88.E6.81.AF.E9.98.9F.E5.88.97.E7.9A.84.E5.8F.AF.E9.9D.A0.E9.80.9A.E7.9F.A5)。
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get 采用[ HTTP 回调通知](https://cloud.tencent.com/document/product/266/7829#http.E5.9B.9E.E8.B0.83)接收方式时，用于接收 V3 版本事件通知的地址。 
     * @return NotificationUrlV3 采用[ HTTP 回调通知](https://cloud.tencent.com/document/product/266/7829#http.E5.9B.9E.E8.B0.83)接收方式时，用于接收 V3 版本事件通知的地址。
     */
    public String getNotificationUrlV3() {
        return this.NotificationUrlV3;
    }

    /**
     * Set 采用[ HTTP 回调通知](https://cloud.tencent.com/document/product/266/7829#http.E5.9B.9E.E8.B0.83)接收方式时，用于接收 V3 版本事件通知的地址。
     * @param NotificationUrlV3 采用[ HTTP 回调通知](https://cloud.tencent.com/document/product/266/7829#http.E5.9B.9E.E8.B0.83)接收方式时，用于接收 V3 版本事件通知的地址。
     */
    public void setNotificationUrlV3(String NotificationUrlV3) {
        this.NotificationUrlV3 = NotificationUrlV3;
    }

    /**
     * Get 采用[ HTTP 回调通知](https://cloud.tencent.com/document/product/266/7829#http.E5.9B.9E.E8.B0.83)接收方式时，用于接收 V2 版本事件通知的地址。 
     * @return NotificationUrlV2 采用[ HTTP 回调通知](https://cloud.tencent.com/document/product/266/7829#http.E5.9B.9E.E8.B0.83)接收方式时，用于接收 V2 版本事件通知的地址。
     */
    public String getNotificationUrlV2() {
        return this.NotificationUrlV2;
    }

    /**
     * Set 采用[ HTTP 回调通知](https://cloud.tencent.com/document/product/266/7829#http.E5.9B.9E.E8.B0.83)接收方式时，用于接收 V2 版本事件通知的地址。
     * @param NotificationUrlV2 采用[ HTTP 回调通知](https://cloud.tencent.com/document/product/266/7829#http.E5.9B.9E.E8.B0.83)接收方式时，用于接收 V2 版本事件通知的地址。
     */
    public void setNotificationUrlV2(String NotificationUrlV2) {
        this.NotificationUrlV2 = NotificationUrlV2;
    }

    /**
     * Get 是否接收[视频上传完成](https://cloud.tencent.com/document/product/266/7830)事件通知， 默认 "OFF" 为忽略该事件通知，"ON" 为接收事件通知。 
     * @return UploadMediaCompleteEventSwitch 是否接收[视频上传完成](https://cloud.tencent.com/document/product/266/7830)事件通知， 默认 "OFF" 为忽略该事件通知，"ON" 为接收事件通知。
     */
    public String getUploadMediaCompleteEventSwitch() {
        return this.UploadMediaCompleteEventSwitch;
    }

    /**
     * Set 是否接收[视频上传完成](https://cloud.tencent.com/document/product/266/7830)事件通知， 默认 "OFF" 为忽略该事件通知，"ON" 为接收事件通知。
     * @param UploadMediaCompleteEventSwitch 是否接收[视频上传完成](https://cloud.tencent.com/document/product/266/7830)事件通知， 默认 "OFF" 为忽略该事件通知，"ON" 为接收事件通知。
     */
    public void setUploadMediaCompleteEventSwitch(String UploadMediaCompleteEventSwitch) {
        this.UploadMediaCompleteEventSwitch = UploadMediaCompleteEventSwitch;
    }

    /**
     * Get 是否接收[视频转码完成](https://cloud.tencent.com/document/product/266/7832)事件通知， 默认 "OFF" 为忽略该事件通知，"ON" 为接收事件通知。 
     * @return TranscodeCompleteEventSwitch 是否接收[视频转码完成](https://cloud.tencent.com/document/product/266/7832)事件通知， 默认 "OFF" 为忽略该事件通知，"ON" 为接收事件通知。
     */
    public String getTranscodeCompleteEventSwitch() {
        return this.TranscodeCompleteEventSwitch;
    }

    /**
     * Set 是否接收[视频转码完成](https://cloud.tencent.com/document/product/266/7832)事件通知， 默认 "OFF" 为忽略该事件通知，"ON" 为接收事件通知。
     * @param TranscodeCompleteEventSwitch 是否接收[视频转码完成](https://cloud.tencent.com/document/product/266/7832)事件通知， 默认 "OFF" 为忽略该事件通知，"ON" 为接收事件通知。
     */
    public void setTranscodeCompleteEventSwitch(String TranscodeCompleteEventSwitch) {
        this.TranscodeCompleteEventSwitch = TranscodeCompleteEventSwitch;
    }

    /**
     * Get 是否接收[指定时间点截图完成](https://cloud.tencent.com/document/product/266/8105)事件通知，  默认 "OFF" 为忽略该事件通知，"ON" 为接收事件通知。 
     * @return CreateSnapshotByTimeOffsetCompleteEventSwitch 是否接收[指定时间点截图完成](https://cloud.tencent.com/document/product/266/8105)事件通知，  默认 "OFF" 为忽略该事件通知，"ON" 为接收事件通知。
     */
    public String getCreateSnapshotByTimeOffsetCompleteEventSwitch() {
        return this.CreateSnapshotByTimeOffsetCompleteEventSwitch;
    }

    /**
     * Set 是否接收[指定时间点截图完成](https://cloud.tencent.com/document/product/266/8105)事件通知，  默认 "OFF" 为忽略该事件通知，"ON" 为接收事件通知。
     * @param CreateSnapshotByTimeOffsetCompleteEventSwitch 是否接收[指定时间点截图完成](https://cloud.tencent.com/document/product/266/8105)事件通知，  默认 "OFF" 为忽略该事件通知，"ON" 为接收事件通知。
     */
    public void setCreateSnapshotByTimeOffsetCompleteEventSwitch(String CreateSnapshotByTimeOffsetCompleteEventSwitch) {
        this.CreateSnapshotByTimeOffsetCompleteEventSwitch = CreateSnapshotByTimeOffsetCompleteEventSwitch;
    }

    /**
     * Get 是否接收[视频截取雪碧图完成](https://cloud.tencent.com/document/product/266/8104)事件通知，  默认 "OFF" 为忽略该事件通知，"ON" 为接收事件通知。 
     * @return CreateImageSpriteCompleteEventSwitch 是否接收[视频截取雪碧图完成](https://cloud.tencent.com/document/product/266/8104)事件通知，  默认 "OFF" 为忽略该事件通知，"ON" 为接收事件通知。
     */
    public String getCreateImageSpriteCompleteEventSwitch() {
        return this.CreateImageSpriteCompleteEventSwitch;
    }

    /**
     * Set 是否接收[视频截取雪碧图完成](https://cloud.tencent.com/document/product/266/8104)事件通知，  默认 "OFF" 为忽略该事件通知，"ON" 为接收事件通知。
     * @param CreateImageSpriteCompleteEventSwitch 是否接收[视频截取雪碧图完成](https://cloud.tencent.com/document/product/266/8104)事件通知，  默认 "OFF" 为忽略该事件通知，"ON" 为接收事件通知。
     */
    public void setCreateImageSpriteCompleteEventSwitch(String CreateImageSpriteCompleteEventSwitch) {
        this.CreateImageSpriteCompleteEventSwitch = CreateImageSpriteCompleteEventSwitch;
    }

    /**
     * Get 是否接收[视频拼接完成](https://cloud.tencent.com/document/product/266/7834)事件通知，  默认 "OFF" 为忽略该事件通知，"ON" 为接收事件通知。 
     * @return ConcatMediaCompleteEventSwitch 是否接收[视频拼接完成](https://cloud.tencent.com/document/product/266/7834)事件通知，  默认 "OFF" 为忽略该事件通知，"ON" 为接收事件通知。
     */
    public String getConcatMediaCompleteEventSwitch() {
        return this.ConcatMediaCompleteEventSwitch;
    }

    /**
     * Set 是否接收[视频拼接完成](https://cloud.tencent.com/document/product/266/7834)事件通知，  默认 "OFF" 为忽略该事件通知，"ON" 为接收事件通知。
     * @param ConcatMediaCompleteEventSwitch 是否接收[视频拼接完成](https://cloud.tencent.com/document/product/266/7834)事件通知，  默认 "OFF" 为忽略该事件通知，"ON" 为接收事件通知。
     */
    public void setConcatMediaCompleteEventSwitch(String ConcatMediaCompleteEventSwitch) {
        this.ConcatMediaCompleteEventSwitch = ConcatMediaCompleteEventSwitch;
    }

    /**
     * Get 是否接收[视频删除完成](https://cloud.tencent.com/document/product/266/13434)事件通知，  默认 "OFF" 为忽略该事件通知，"ON" 为接收事件通知。 
     * @return DeleteMediaCompleteEventSwitch 是否接收[视频删除完成](https://cloud.tencent.com/document/product/266/13434)事件通知，  默认 "OFF" 为忽略该事件通知，"ON" 为接收事件通知。
     */
    public String getDeleteMediaCompleteEventSwitch() {
        return this.DeleteMediaCompleteEventSwitch;
    }

    /**
     * Set 是否接收[视频删除完成](https://cloud.tencent.com/document/product/266/13434)事件通知，  默认 "OFF" 为忽略该事件通知，"ON" 为接收事件通知。
     * @param DeleteMediaCompleteEventSwitch 是否接收[视频删除完成](https://cloud.tencent.com/document/product/266/13434)事件通知，  默认 "OFF" 为忽略该事件通知，"ON" 为接收事件通知。
     */
    public void setDeleteMediaCompleteEventSwitch(String DeleteMediaCompleteEventSwitch) {
        this.DeleteMediaCompleteEventSwitch = DeleteMediaCompleteEventSwitch;
    }

    /**
     * Get 点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。 
     * @return SubAppId 点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set 点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
     * @param SubAppId 点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "NotificationUrlV3", this.NotificationUrlV3);
        this.setParamSimple(map, prefix + "NotificationUrlV2", this.NotificationUrlV2);
        this.setParamSimple(map, prefix + "UploadMediaCompleteEventSwitch", this.UploadMediaCompleteEventSwitch);
        this.setParamSimple(map, prefix + "TranscodeCompleteEventSwitch", this.TranscodeCompleteEventSwitch);
        this.setParamSimple(map, prefix + "CreateSnapshotByTimeOffsetCompleteEventSwitch", this.CreateSnapshotByTimeOffsetCompleteEventSwitch);
        this.setParamSimple(map, prefix + "CreateImageSpriteCompleteEventSwitch", this.CreateImageSpriteCompleteEventSwitch);
        this.setParamSimple(map, prefix + "ConcatMediaCompleteEventSwitch", this.ConcatMediaCompleteEventSwitch);
        this.setParamSimple(map, prefix + "DeleteMediaCompleteEventSwitch", this.DeleteMediaCompleteEventSwitch);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);

    }
}

