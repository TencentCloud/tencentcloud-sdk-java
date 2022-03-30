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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HostFileInfo extends AbstractModel{

    /**
    * 日志文件夹
    */
    @SerializedName("LogPath")
    @Expose
    private String LogPath;

    /**
    * 日志文件名
    */
    @SerializedName("FilePattern")
    @Expose
    private String FilePattern;

    /**
    * metadata信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CustomLabels")
    @Expose
    private String [] CustomLabels;

    /**
     * Get 日志文件夹 
     * @return LogPath 日志文件夹
     */
    public String getLogPath() {
        return this.LogPath;
    }

    /**
     * Set 日志文件夹
     * @param LogPath 日志文件夹
     */
    public void setLogPath(String LogPath) {
        this.LogPath = LogPath;
    }

    /**
     * Get 日志文件名 
     * @return FilePattern 日志文件名
     */
    public String getFilePattern() {
        return this.FilePattern;
    }

    /**
     * Set 日志文件名
     * @param FilePattern 日志文件名
     */
    public void setFilePattern(String FilePattern) {
        this.FilePattern = FilePattern;
    }

    /**
     * Get metadata信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CustomLabels metadata信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getCustomLabels() {
        return this.CustomLabels;
    }

    /**
     * Set metadata信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param CustomLabels metadata信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCustomLabels(String [] CustomLabels) {
        this.CustomLabels = CustomLabels;
    }

    public HostFileInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HostFileInfo(HostFileInfo source) {
        if (source.LogPath != null) {
            this.LogPath = new String(source.LogPath);
        }
        if (source.FilePattern != null) {
            this.FilePattern = new String(source.FilePattern);
        }
        if (source.CustomLabels != null) {
            this.CustomLabels = new String[source.CustomLabels.length];
            for (int i = 0; i < source.CustomLabels.length; i++) {
                this.CustomLabels[i] = new String(source.CustomLabels[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogPath", this.LogPath);
        this.setParamSimple(map, prefix + "FilePattern", this.FilePattern);
        this.setParamArraySimple(map, prefix + "CustomLabels.", this.CustomLabels);

    }
}

