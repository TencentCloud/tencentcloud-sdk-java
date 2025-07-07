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
package com.tencentcloudapi.gme.v20180711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScanPiece extends AbstractModel {

    /**
    * 流检测时返回，音频转存地址，保留30min
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
    */
    @SerializedName("RoomId")
    @Expose
    private String RoomId;

    /**
    * gme实时语音用户ID，透传任务传入时的OpenId
    */
    @SerializedName("OpenId")
    @Expose
    private String OpenId;

    /**
    * 备注
    */
    @SerializedName("Info")
    @Expose
    private String Info;

    /**
    * 流检测时分片在流中的偏移时间，单位毫秒
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 流检测时分片时长
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * 分片开始检测时间
    */
    @SerializedName("PieceStartTime")
    @Expose
    private Long PieceStartTime;

    /**
     * Get 流检测时返回，音频转存地址，保留30min 
     * @return DumpUrl 流检测时返回，音频转存地址，保留30min
     */
    public String getDumpUrl() {
        return this.DumpUrl;
    }

    /**
     * Set 流检测时返回，音频转存地址，保留30min
     * @param DumpUrl 流检测时返回，音频转存地址，保留30min
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
     * @return MainType 违规主要类型
     */
    public String getMainType() {
        return this.MainType;
    }

    /**
     * Set 违规主要类型
     * @param MainType 违规主要类型
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
     * @return RoomId gme实时语音房间ID，透传任务传入时的RoomId
     */
    public String getRoomId() {
        return this.RoomId;
    }

    /**
     * Set gme实时语音房间ID，透传任务传入时的RoomId
     * @param RoomId gme实时语音房间ID，透传任务传入时的RoomId
     */
    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get gme实时语音用户ID，透传任务传入时的OpenId 
     * @return OpenId gme实时语音用户ID，透传任务传入时的OpenId
     */
    public String getOpenId() {
        return this.OpenId;
    }

    /**
     * Set gme实时语音用户ID，透传任务传入时的OpenId
     * @param OpenId gme实时语音用户ID，透传任务传入时的OpenId
     */
    public void setOpenId(String OpenId) {
        this.OpenId = OpenId;
    }

    /**
     * Get 备注 
     * @return Info 备注
     */
    public String getInfo() {
        return this.Info;
    }

    /**
     * Set 备注
     * @param Info 备注
     */
    public void setInfo(String Info) {
        this.Info = Info;
    }

    /**
     * Get 流检测时分片在流中的偏移时间，单位毫秒 
     * @return Offset 流检测时分片在流中的偏移时间，单位毫秒
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 流检测时分片在流中的偏移时间，单位毫秒
     * @param Offset 流检测时分片在流中的偏移时间，单位毫秒
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 流检测时分片时长 
     * @return Duration 流检测时分片时长
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set 流检测时分片时长
     * @param Duration 流检测时分片时长
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 分片开始检测时间 
     * @return PieceStartTime 分片开始检测时间
     */
    public Long getPieceStartTime() {
        return this.PieceStartTime;
    }

    /**
     * Set 分片开始检测时间
     * @param PieceStartTime 分片开始检测时间
     */
    public void setPieceStartTime(Long PieceStartTime) {
        this.PieceStartTime = PieceStartTime;
    }

    public ScanPiece() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScanPiece(ScanPiece source) {
        if (source.DumpUrl != null) {
            this.DumpUrl = new String(source.DumpUrl);
        }
        if (source.HitFlag != null) {
            this.HitFlag = new Boolean(source.HitFlag);
        }
        if (source.MainType != null) {
            this.MainType = new String(source.MainType);
        }
        if (source.ScanDetail != null) {
            this.ScanDetail = new ScanDetail[source.ScanDetail.length];
            for (int i = 0; i < source.ScanDetail.length; i++) {
                this.ScanDetail[i] = new ScanDetail(source.ScanDetail[i]);
            }
        }
        if (source.RoomId != null) {
            this.RoomId = new String(source.RoomId);
        }
        if (source.OpenId != null) {
            this.OpenId = new String(source.OpenId);
        }
        if (source.Info != null) {
            this.Info = new String(source.Info);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.PieceStartTime != null) {
            this.PieceStartTime = new Long(source.PieceStartTime);
        }
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

