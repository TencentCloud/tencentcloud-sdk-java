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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VideoEditProjectOutput extends AbstractModel{

    /**
    * 导出的多媒体创作引擎媒体 Id，仅当导出目标为多媒体创作引擎媒体时有效。
    */
    @SerializedName("MaterialId")
    @Expose
    private String MaterialId;

    /**
    * 云点播媒资 FileId。
    */
    @SerializedName("VodFileId")
    @Expose
    private String VodFileId;

    /**
    * 导出的媒资 URL。
    */
    @SerializedName("URL")
    @Expose
    private String URL;

    /**
    * 元信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MetaData")
    @Expose
    private MediaMetaData MetaData;

    /**
     * Get 导出的多媒体创作引擎媒体 Id，仅当导出目标为多媒体创作引擎媒体时有效。 
     * @return MaterialId 导出的多媒体创作引擎媒体 Id，仅当导出目标为多媒体创作引擎媒体时有效。
     */
    public String getMaterialId() {
        return this.MaterialId;
    }

    /**
     * Set 导出的多媒体创作引擎媒体 Id，仅当导出目标为多媒体创作引擎媒体时有效。
     * @param MaterialId 导出的多媒体创作引擎媒体 Id，仅当导出目标为多媒体创作引擎媒体时有效。
     */
    public void setMaterialId(String MaterialId) {
        this.MaterialId = MaterialId;
    }

    /**
     * Get 云点播媒资 FileId。 
     * @return VodFileId 云点播媒资 FileId。
     */
    public String getVodFileId() {
        return this.VodFileId;
    }

    /**
     * Set 云点播媒资 FileId。
     * @param VodFileId 云点播媒资 FileId。
     */
    public void setVodFileId(String VodFileId) {
        this.VodFileId = VodFileId;
    }

    /**
     * Get 导出的媒资 URL。 
     * @return URL 导出的媒资 URL。
     */
    public String getURL() {
        return this.URL;
    }

    /**
     * Set 导出的媒资 URL。
     * @param URL 导出的媒资 URL。
     */
    public void setURL(String URL) {
        this.URL = URL;
    }

    /**
     * Get 元信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MetaData 元信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MediaMetaData getMetaData() {
        return this.MetaData;
    }

    /**
     * Set 元信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MetaData 元信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetaData(MediaMetaData MetaData) {
        this.MetaData = MetaData;
    }

    public VideoEditProjectOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VideoEditProjectOutput(VideoEditProjectOutput source) {
        if (source.MaterialId != null) {
            this.MaterialId = new String(source.MaterialId);
        }
        if (source.VodFileId != null) {
            this.VodFileId = new String(source.VodFileId);
        }
        if (source.URL != null) {
            this.URL = new String(source.URL);
        }
        if (source.MetaData != null) {
            this.MetaData = new MediaMetaData(source.MetaData);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MaterialId", this.MaterialId);
        this.setParamSimple(map, prefix + "VodFileId", this.VodFileId);
        this.setParamSimple(map, prefix + "URL", this.URL);
        this.setParamObj(map, prefix + "MetaData.", this.MetaData);

    }
}

