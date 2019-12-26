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
package com.tencentcloudapi.gme.v20180711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScanPiece extends AbstractModel{

    /**
    * 流检测时返回，音频转存地址，保留30min
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DumpUrl")
    @Expose
    private String DumpUrl;

    /**
    * 是否违规
    */
    @SerializedName("HitFlag")
    @Expose
    private Boolean HitFlag;

    /**
    * 违规主要类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MainType")
    @Expose
    private String MainType;

    /**
    * 语音检测详情
    */
    @SerializedName("ScanDetail")
    @Expose
    private ScanDetail [] ScanDetail;

    /**
    * gme实时语音房间ID，透传任务传入时的RoomId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RoomId")
    @Expose
    private String RoomId;

    /**
    * gme实时语音用户ID，透传任务传入时的OpenId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OpenId")
    @Expose
    private String OpenId;

    /**
    * 备注
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Info")
    @Expose
    private String Info;

    /**
    * 流检测时分片在流中的偏移时间，单位毫秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 流检测时分片时长
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * 分片开始检测时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PieceStartTime")
    @Expose
    private Long PieceStartTime;

    /**
     * Get 流检测时返回，音频转存地址，保留30min
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DumpUrl 流检测时返回，音频转存地址，保留30min
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDumpUrl() {
        return this.DumpUrl;
    }

    /**
     * Set 流检测时返回，音频转存地址，保留30min
注意：此字段可能返回 null，表示取不到有效值。
     * @param DumpUrl 流检测时返回，音频转存地址，保留30min
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDumpUrl(String DumpUrl) {
        this.DumpUrl = DumpUrl;
    }

    /**
     * Get 是否违规 
     * @return HitFlag 是否违规
     */
    public Boolean getHitFlag() {
        return this.HitFlag;
    }

    /**
     * Set 是否违规
     * @param HitFlag 是否违规
     */
    public void setHitFlag(Boolean HitFlag) {
        this.HitFlag = HitFlag;
    }

    /**
     * Get 违规主要类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MainType 违规主要类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMainType() {
        return this.MainType;
    }

    /**
     * Set 违规主要类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param MainType 违规主要类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMainType(String MainType) {
        this.MainType = MainType;
    }

    /**
     * Get 语音检测详情 
     * @return ScanDetail 语音检测详情
     */
    public ScanDetail [] getScanDetail() {
        return this.ScanDetail;
    }

    /**
     * Set 语音检测详情
     * @param ScanDetail 语音检测详情
     */
    public void setScanDetail(ScanDetail [] ScanDetail) {
        this.ScanDetail = ScanDetail;
    }

    /**
     * Get gme实时语音房间ID，透传任务传入时的RoomId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RoomId gme实时语音房间ID，透传任务传入时的RoomId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRoomId() {
        return this.RoomId;
    }

    /**
     * Set gme实时语音房间ID，透传任务传入时的RoomId
注意：此字段可能返回 null，表示取不到有效值。
     * @param RoomId gme实时语音房间ID，透传任务传入时的RoomId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get gme实时语音用户ID，透传任务传入时的OpenId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OpenId gme实时语音用户ID，透传任务传入时的OpenId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOpenId() {
        return this.OpenId;
    }

    /**
     * Set gme实时语音用户ID，透传任务传入时的OpenId
注意：此字段可能返回 null，表示取不到有效值。
     * @param OpenId gme实时语音用户ID，透传任务传入时的OpenId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOpenId(String OpenId) {
        this.OpenId = OpenId;
    }

    /**
     * Get 备注
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Info 备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInfo() {
        return this.Info;
    }

    /**
     * Set 备注
注意：此字段可能返回 null，表示取不到有效值。
     * @param Info 备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInfo(String Info) {
        this.Info = Info;
    }

    /**
     * Get 流检测时分片在流中的偏移时间，单位毫秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Offset 流检测时分片在流中的偏移时间，单位毫秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 流检测时分片在流中的偏移时间，单位毫秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param Offset 流检测时分片在流中的偏移时间，单位毫秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 流检测时分片时长
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Duration 流检测时分片时长
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set 流检测时分片时长
注意：此字段可能返回 null，表示取不到有效值。
     * @param Duration 流检测时分片时长
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 分片开始检测时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PieceStartTime 分片开始检测时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPieceStartTime() {
        return this.PieceStartTime;
    }

    /**
     * Set 分片开始检测时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param PieceStartTime 分片开始检测时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPieceStartTime(Long PieceStartTime) {
        this.PieceStartTime = PieceStartTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DumpUrl", this.DumpUrl);
        this.setParamSimple(map, prefix + "HitFlag", this.HitFlag);
        this.setParamSimple(map, prefix + "MainType", this.MainType);
        this.setParamArrayObj(map, prefix + "ScanDetail.", this.ScanDetail);
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "OpenId", this.OpenId);
        this.setParamSimple(map, prefix + "Info", this.Info);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "PieceStartTime", this.PieceStartTime);

    }
}

