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

public class FileUploadTask  extends AbstractModel{

    /**
    * 文件唯一 ID。
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * 上传完成后生成的媒体文件基础信息。
    */
    @SerializedName("MediaBasicInfo")
    @Expose
    private MediaBasicInfo MediaBasicInfo;

    /**
    * 若视频上传时指定了视频处理流程，则该字段为流程任务 ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProcedureTaskId")
    @Expose
    private String ProcedureTaskId;

    /**
    * 元信息。包括大小、时长、视频流信息、音频流信息等。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MetaData")
    @Expose
    private MediaMetaData MetaData;

    /**
     * 获取文件唯一 ID。
     * @return FileId 文件唯一 ID。
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * 设置文件唯一 ID。
     * @param FileId 文件唯一 ID。
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * 获取上传完成后生成的媒体文件基础信息。
     * @return MediaBasicInfo 上传完成后生成的媒体文件基础信息。
     */
    public MediaBasicInfo getMediaBasicInfo() {
        return this.MediaBasicInfo;
    }

    /**
     * 设置上传完成后生成的媒体文件基础信息。
     * @param MediaBasicInfo 上传完成后生成的媒体文件基础信息。
     */
    public void setMediaBasicInfo(MediaBasicInfo MediaBasicInfo) {
        this.MediaBasicInfo = MediaBasicInfo;
    }

    /**
     * 获取若视频上传时指定了视频处理流程，则该字段为流程任务 ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @return ProcedureTaskId 若视频上传时指定了视频处理流程，则该字段为流程任务 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProcedureTaskId() {
        return this.ProcedureTaskId;
    }

    /**
     * 设置若视频上传时指定了视频处理流程，则该字段为流程任务 ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProcedureTaskId 若视频上传时指定了视频处理流程，则该字段为流程任务 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProcedureTaskId(String ProcedureTaskId) {
        this.ProcedureTaskId = ProcedureTaskId;
    }

    /**
     * 获取元信息。包括大小、时长、视频流信息、音频流信息等。
注意：此字段可能返回 null，表示取不到有效值。
     * @return MetaData 元信息。包括大小、时长、视频流信息、音频流信息等。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MediaMetaData getMetaData() {
        return this.MetaData;
    }

    /**
     * 设置元信息。包括大小、时长、视频流信息、音频流信息等。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MetaData 元信息。包括大小、时长、视频流信息、音频流信息等。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetaData(MediaMetaData MetaData) {
        this.MetaData = MetaData;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamObj(map, prefix + "MediaBasicInfo.", this.MediaBasicInfo);
        this.setParamSimple(map, prefix + "ProcedureTaskId", this.ProcedureTaskId);
        this.setParamObj(map, prefix + "MetaData.", this.MetaData);

    }
}

