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

public class ScanPiece  extends AbstractModel{

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
    * gme实时语音房间id，透传任务传入时的RoomId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RoomId")
    @Expose
    private String RoomId;

    /**
    * gme实时语音用户id，透传任务传入时的OpenId
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
     * 获取流检测时返回，音频转存地址，保留30min
注意：此字段可能返回 null，表示取不到有效值。
     * @return DumpUrl 流检测时返回，音频转存地址，保留30min
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDumpUrl() {
        return this.DumpUrl;
    }

    /**
     * 设置流检测时返回，音频转存地址，保留30min
注意：此字段可能返回 null，表示取不到有效值。
     * @param DumpUrl 流检测时返回，音频转存地址，保留30min
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDumpUrl(String DumpUrl) {
        this.DumpUrl = DumpUrl;
    }

    /**
     * 获取是否违规
     * @return HitFlag 是否违规
     */
    public Boolean getHitFlag() {
        return this.HitFlag;
    }

    /**
     * 设置是否违规
     * @param HitFlag 是否违规
     */
    public void setHitFlag(Boolean HitFlag) {
        this.HitFlag = HitFlag;
    }

    /**
     * 获取违规主要类型
注意：此字段可能返回 null，表示取不到有效值。
     * @return MainType 违规主要类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMainType() {
        return this.MainType;
    }

    /**
     * 设置违规主要类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param MainType 违规主要类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMainType(String MainType) {
        this.MainType = MainType;
    }

    /**
     * 获取语音检测详情
     * @return ScanDetail 语音检测详情
     */
    public ScanDetail [] getScanDetail() {
        return this.ScanDetail;
    }

    /**
     * 设置语音检测详情
     * @param ScanDetail 语音检测详情
     */
    public void setScanDetail(ScanDetail [] ScanDetail) {
        this.ScanDetail = ScanDetail;
    }

    /**
     * 获取gme实时语音房间id，透传任务传入时的RoomId
注意：此字段可能返回 null，表示取不到有效值。
     * @return RoomId gme实时语音房间id，透传任务传入时的RoomId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRoomId() {
        return this.RoomId;
    }

    /**
     * 设置gme实时语音房间id，透传任务传入时的RoomId
注意：此字段可能返回 null，表示取不到有效值。
     * @param RoomId gme实时语音房间id，透传任务传入时的RoomId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * 获取gme实时语音用户id，透传任务传入时的OpenId
注意：此字段可能返回 null，表示取不到有效值。
     * @return OpenId gme实时语音用户id，透传任务传入时的OpenId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOpenId() {
        return this.OpenId;
    }

    /**
     * 设置gme实时语音用户id，透传任务传入时的OpenId
注意：此字段可能返回 null，表示取不到有效值。
     * @param OpenId gme实时语音用户id，透传任务传入时的OpenId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOpenId(String OpenId) {
        this.OpenId = OpenId;
    }

    /**
     * 获取备注
注意：此字段可能返回 null，表示取不到有效值。
     * @return Info 备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInfo() {
        return this.Info;
    }

    /**
     * 设置备注
注意：此字段可能返回 null，表示取不到有效值。
     * @param Info 备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInfo(String Info) {
        this.Info = Info;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DumpUrl", this.DumpUrl);
        this.setParamSimple(map, prefix + "HitFlag", this.HitFlag);
        this.setParamSimple(map, prefix + "MainType", this.MainType);
        this.setParamArrayObj(map, prefix + "ScanDetail.", this.ScanDetail);
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "OpenId", this.OpenId);
        this.setParamSimple(map, prefix + "Info", this.Info);

    }
}

