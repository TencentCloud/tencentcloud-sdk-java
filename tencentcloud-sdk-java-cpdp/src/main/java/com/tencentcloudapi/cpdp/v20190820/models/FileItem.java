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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FileItem extends AbstractModel{

    /**
    * STRING(256)，文件名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * STRING(120)，随机密码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RandomPassword")
    @Expose
    private String RandomPassword;

    /**
    * STRING(512)，文件路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FilePath")
    @Expose
    private String FilePath;

    /**
    * STRING(64)，提取码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DrawCode")
    @Expose
    private String DrawCode;

    /**
     * Get STRING(256)，文件名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileName STRING(256)，文件名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set STRING(256)，文件名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileName STRING(256)，文件名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get STRING(120)，随机密码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RandomPassword STRING(120)，随机密码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRandomPassword() {
        return this.RandomPassword;
    }

    /**
     * Set STRING(120)，随机密码
注意：此字段可能返回 null，表示取不到有效值。
     * @param RandomPassword STRING(120)，随机密码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRandomPassword(String RandomPassword) {
        this.RandomPassword = RandomPassword;
    }

    /**
     * Get STRING(512)，文件路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FilePath STRING(512)，文件路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFilePath() {
        return this.FilePath;
    }

    /**
     * Set STRING(512)，文件路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param FilePath STRING(512)，文件路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFilePath(String FilePath) {
        this.FilePath = FilePath;
    }

    /**
     * Get STRING(64)，提取码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DrawCode STRING(64)，提取码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDrawCode() {
        return this.DrawCode;
    }

    /**
     * Set STRING(64)，提取码
注意：此字段可能返回 null，表示取不到有效值。
     * @param DrawCode STRING(64)，提取码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDrawCode(String DrawCode) {
        this.DrawCode = DrawCode;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "RandomPassword", this.RandomPassword);
        this.setParamSimple(map, prefix + "FilePath", this.FilePath);
        this.setParamSimple(map, prefix + "DrawCode", this.DrawCode);

    }
}

