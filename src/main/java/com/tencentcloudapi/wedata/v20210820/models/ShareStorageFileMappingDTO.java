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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ShareStorageFileMappingDTO extends AbstractModel {

    /**
    * 源文件名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OriginFileName")
    @Expose
    private String OriginFileName;

    /**
    * 共享存储文件名，即在共享存储文件中的名字
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetFileName")
    @Expose
    private String TargetFileName;

    /**
    * 共享存储最终存储绝对路径，
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AbsoluteTargetFilePath")
    @Expose
    private String AbsoluteTargetFilePath;

    /**
     * Get 源文件名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OriginFileName 源文件名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOriginFileName() {
        return this.OriginFileName;
    }

    /**
     * Set 源文件名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param OriginFileName 源文件名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOriginFileName(String OriginFileName) {
        this.OriginFileName = OriginFileName;
    }

    /**
     * Get 共享存储文件名，即在共享存储文件中的名字
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetFileName 共享存储文件名，即在共享存储文件中的名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetFileName() {
        return this.TargetFileName;
    }

    /**
     * Set 共享存储文件名，即在共享存储文件中的名字
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetFileName 共享存储文件名，即在共享存储文件中的名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetFileName(String TargetFileName) {
        this.TargetFileName = TargetFileName;
    }

    /**
     * Get 共享存储最终存储绝对路径，
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AbsoluteTargetFilePath 共享存储最终存储绝对路径，
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAbsoluteTargetFilePath() {
        return this.AbsoluteTargetFilePath;
    }

    /**
     * Set 共享存储最终存储绝对路径，
注意：此字段可能返回 null，表示取不到有效值。
     * @param AbsoluteTargetFilePath 共享存储最终存储绝对路径，
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAbsoluteTargetFilePath(String AbsoluteTargetFilePath) {
        this.AbsoluteTargetFilePath = AbsoluteTargetFilePath;
    }

    public ShareStorageFileMappingDTO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ShareStorageFileMappingDTO(ShareStorageFileMappingDTO source) {
        if (source.OriginFileName != null) {
            this.OriginFileName = new String(source.OriginFileName);
        }
        if (source.TargetFileName != null) {
            this.TargetFileName = new String(source.TargetFileName);
        }
        if (source.AbsoluteTargetFilePath != null) {
            this.AbsoluteTargetFilePath = new String(source.AbsoluteTargetFilePath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OriginFileName", this.OriginFileName);
        this.setParamSimple(map, prefix + "TargetFileName", this.TargetFileName);
        this.setParamSimple(map, prefix + "AbsoluteTargetFilePath", this.AbsoluteTargetFilePath);

    }
}

