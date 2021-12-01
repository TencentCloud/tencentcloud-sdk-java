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
package com.tencentcloudapi.ivld.v20210903.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaPreknownInfo extends AbstractModel{

    /**
    * 媒资文件类型，参见MediaPreknownInfo结构体定义
    */
    @SerializedName("MediaType")
    @Expose
    private Long MediaType;

    /**
    * 媒资素材一级类型，参见MediaPreknownInfo结构体定义
    */
    @SerializedName("MediaLabel")
    @Expose
    private Long MediaLabel;

    /**
    * 媒资素材二级类型，参见MediaPreknownInfo结构体定义
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MediaSecondLabel")
    @Expose
    private Long MediaSecondLabel;

    /**
    * 媒资音频类型，参见MediaPreknownInfo结构体定义
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MediaLang")
    @Expose
    private Long MediaLang;

    /**
     * Get 媒资文件类型，参见MediaPreknownInfo结构体定义 
     * @return MediaType 媒资文件类型，参见MediaPreknownInfo结构体定义
     */
    public Long getMediaType() {
        return this.MediaType;
    }

    /**
     * Set 媒资文件类型，参见MediaPreknownInfo结构体定义
     * @param MediaType 媒资文件类型，参见MediaPreknownInfo结构体定义
     */
    public void setMediaType(Long MediaType) {
        this.MediaType = MediaType;
    }

    /**
     * Get 媒资素材一级类型，参见MediaPreknownInfo结构体定义 
     * @return MediaLabel 媒资素材一级类型，参见MediaPreknownInfo结构体定义
     */
    public Long getMediaLabel() {
        return this.MediaLabel;
    }

    /**
     * Set 媒资素材一级类型，参见MediaPreknownInfo结构体定义
     * @param MediaLabel 媒资素材一级类型，参见MediaPreknownInfo结构体定义
     */
    public void setMediaLabel(Long MediaLabel) {
        this.MediaLabel = MediaLabel;
    }

    /**
     * Get 媒资素材二级类型，参见MediaPreknownInfo结构体定义
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MediaSecondLabel 媒资素材二级类型，参见MediaPreknownInfo结构体定义
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMediaSecondLabel() {
        return this.MediaSecondLabel;
    }

    /**
     * Set 媒资素材二级类型，参见MediaPreknownInfo结构体定义
注意：此字段可能返回 null，表示取不到有效值。
     * @param MediaSecondLabel 媒资素材二级类型，参见MediaPreknownInfo结构体定义
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMediaSecondLabel(Long MediaSecondLabel) {
        this.MediaSecondLabel = MediaSecondLabel;
    }

    /**
     * Get 媒资音频类型，参见MediaPreknownInfo结构体定义
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MediaLang 媒资音频类型，参见MediaPreknownInfo结构体定义
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMediaLang() {
        return this.MediaLang;
    }

    /**
     * Set 媒资音频类型，参见MediaPreknownInfo结构体定义
注意：此字段可能返回 null，表示取不到有效值。
     * @param MediaLang 媒资音频类型，参见MediaPreknownInfo结构体定义
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMediaLang(Long MediaLang) {
        this.MediaLang = MediaLang;
    }

    public MediaPreknownInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaPreknownInfo(MediaPreknownInfo source) {
        if (source.MediaType != null) {
            this.MediaType = new Long(source.MediaType);
        }
        if (source.MediaLabel != null) {
            this.MediaLabel = new Long(source.MediaLabel);
        }
        if (source.MediaSecondLabel != null) {
            this.MediaSecondLabel = new Long(source.MediaSecondLabel);
        }
        if (source.MediaLang != null) {
            this.MediaLang = new Long(source.MediaLang);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MediaType", this.MediaType);
        this.setParamSimple(map, prefix + "MediaLabel", this.MediaLabel);
        this.setParamSimple(map, prefix + "MediaSecondLabel", this.MediaSecondLabel);
        this.setParamSimple(map, prefix + "MediaLang", this.MediaLang);

    }
}

