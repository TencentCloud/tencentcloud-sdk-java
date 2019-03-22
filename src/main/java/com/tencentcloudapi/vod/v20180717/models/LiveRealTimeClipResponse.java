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

public class LiveRealTimeClipResponse  extends AbstractModel{

    /**
    * 剪辑后的视频播放 URL。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 剪辑固化后的视频的媒体文件的唯一标识。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * 剪辑固化后的视频任务流 ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VodTaskId")
    @Expose
    private String VodTaskId;

    /**
    * 剪辑后的视频元信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MetaData")
    @Expose
    private MediaMetaData MetaData;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取剪辑后的视频播放 URL。
     * @return Url 剪辑后的视频播放 URL。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * 设置剪辑后的视频播放 URL。
     * @param Url 剪辑后的视频播放 URL。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * 获取剪辑固化后的视频的媒体文件的唯一标识。
注意：此字段可能返回 null，表示取不到有效值。
     * @return FileId 剪辑固化后的视频的媒体文件的唯一标识。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * 设置剪辑固化后的视频的媒体文件的唯一标识。
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileId 剪辑固化后的视频的媒体文件的唯一标识。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * 获取剪辑固化后的视频任务流 ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @return VodTaskId 剪辑固化后的视频任务流 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVodTaskId() {
        return this.VodTaskId;
    }

    /**
     * 设置剪辑固化后的视频任务流 ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param VodTaskId 剪辑固化后的视频任务流 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVodTaskId(String VodTaskId) {
        this.VodTaskId = VodTaskId;
    }

    /**
     * 获取剪辑后的视频元信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @return MetaData 剪辑后的视频元信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MediaMetaData getMetaData() {
        return this.MetaData;
    }

    /**
     * 设置剪辑后的视频元信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MetaData 剪辑后的视频元信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetaData(MediaMetaData MetaData) {
        this.MetaData = MetaData;
    }

    /**
     * 获取唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "VodTaskId", this.VodTaskId);
        this.setParamObj(map, prefix + "MetaData.", this.MetaData);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

