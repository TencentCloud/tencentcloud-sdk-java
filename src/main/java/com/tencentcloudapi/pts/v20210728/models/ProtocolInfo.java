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
package com.tencentcloudapi.pts.v20210728.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProtocolInfo extends AbstractModel {

    /**
    * 协议详情
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 文件大小
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * 文件类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
    * 文件 ID
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
     * Get 协议详情 
     * @return Name 协议详情
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 协议详情
     * @param Name 协议详情
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 文件大小 
     * @return Size 文件大小
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set 文件大小
     * @param Size 文件大小
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get 文件类型 
     * @return Type 文件类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 文件类型
     * @param Type 文件类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdatedAt 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdatedAt 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * Get 文件 ID 
     * @return FileId 文件 ID
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set 文件 ID
     * @param FileId 文件 ID
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    public ProtocolInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProtocolInfo(ProtocolInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new String(source.UpdatedAt);
        }
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);
        this.setParamSimple(map, prefix + "FileId", this.FileId);

    }
}

