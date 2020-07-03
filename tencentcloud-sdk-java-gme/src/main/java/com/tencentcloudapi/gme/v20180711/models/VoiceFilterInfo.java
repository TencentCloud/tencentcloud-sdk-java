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

public class VoiceFilterInfo extends AbstractModel{

    /**
    * 应用ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BizId")
    @Expose
    private Long BizId;

    /**
    * 文件ID，表示文件唯一ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * 文件名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 用户ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OpenId")
    @Expose
    private String OpenId;

    /**
    * 数据创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Timestamp")
    @Expose
    private String Timestamp;

    /**
    * 过滤结果列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Data")
    @Expose
    private VoiceFilter [] Data;

    /**
     * Get 应用ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BizId 应用ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBizId() {
        return this.BizId;
    }

    /**
     * Set 应用ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param BizId 应用ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBizId(Long BizId) {
        this.BizId = BizId;
    }

    /**
     * Get 文件ID，表示文件唯一ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileId 文件ID，表示文件唯一ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set 文件ID，表示文件唯一ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileId 文件ID，表示文件唯一ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get 文件名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileName 文件名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 文件名
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileName 文件名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 用户ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OpenId 用户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOpenId() {
        return this.OpenId;
    }

    /**
     * Set 用户ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param OpenId 用户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOpenId(String OpenId) {
        this.OpenId = OpenId;
    }

    /**
     * Get 数据创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Timestamp 数据创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set 数据创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param Timestamp 数据创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimestamp(String Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get 过滤结果列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Data 过滤结果列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VoiceFilter [] getData() {
        return this.Data;
    }

    /**
     * Set 过滤结果列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Data 过滤结果列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setData(VoiceFilter [] Data) {
        this.Data = Data;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BizId", this.BizId);
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "OpenId", this.OpenId);
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamArrayObj(map, prefix + "Data.", this.Data);

    }
}

