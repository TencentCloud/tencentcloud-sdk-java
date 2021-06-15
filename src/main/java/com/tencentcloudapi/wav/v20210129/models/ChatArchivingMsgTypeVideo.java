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
package com.tencentcloudapi.wav.v20210129.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChatArchivingMsgTypeVideo extends AbstractModel{

    /**
    * 视频时长，单位秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PlayLength")
    @Expose
    private Long PlayLength;

    /**
    * 文件大小
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileSize")
    @Expose
    private Long FileSize;

    /**
    * 视频资源对象Cos下载地址
    */
    @SerializedName("CosKey")
    @Expose
    private String CosKey;

    /**
     * Get 视频时长，单位秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PlayLength 视频时长，单位秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPlayLength() {
        return this.PlayLength;
    }

    /**
     * Set 视频时长，单位秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param PlayLength 视频时长，单位秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPlayLength(Long PlayLength) {
        this.PlayLength = PlayLength;
    }

    /**
     * Get 文件大小
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileSize 文件大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFileSize() {
        return this.FileSize;
    }

    /**
     * Set 文件大小
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileSize 文件大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileSize(Long FileSize) {
        this.FileSize = FileSize;
    }

    /**
     * Get 视频资源对象Cos下载地址 
     * @return CosKey 视频资源对象Cos下载地址
     */
    public String getCosKey() {
        return this.CosKey;
    }

    /**
     * Set 视频资源对象Cos下载地址
     * @param CosKey 视频资源对象Cos下载地址
     */
    public void setCosKey(String CosKey) {
        this.CosKey = CosKey;
    }

    public ChatArchivingMsgTypeVideo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChatArchivingMsgTypeVideo(ChatArchivingMsgTypeVideo source) {
        if (source.PlayLength != null) {
            this.PlayLength = new Long(source.PlayLength);
        }
        if (source.FileSize != null) {
            this.FileSize = new Long(source.FileSize);
        }
        if (source.CosKey != null) {
            this.CosKey = new String(source.CosKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PlayLength", this.PlayLength);
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);
        this.setParamSimple(map, prefix + "CosKey", this.CosKey);

    }
}

