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

public class ContainerFileInfo extends AbstractModel{

    /**
    * namespace可以多个，用分隔号分割,例如A,B
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 容器名称
    */
    @SerializedName("Container")
    @Expose
    private String Container;

    /**
    * 日志文件夹
    */
    @SerializedName("LogPath")
    @Expose
    private String LogPath;

    /**
    * 日志名称
    */
    @SerializedName("FilePattern")
    @Expose
    private String FilePattern;

    /**
    * pod标签信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IncludeLabels")
    @Expose
    private String [] IncludeLabels;

    /**
    * 工作负载信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkLoad")
    @Expose
    private ContainerWorkLoadInfo WorkLoad;

    /**
    * 需要排除的namespace可以多个，用分隔号分割,例如A,B
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExcludeNamespace")
    @Expose
    private String ExcludeNamespace;

    /**
    * 需要排除的pod标签信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExcludeLabels")
    @Expose
    private String [] ExcludeLabels;

    /**
     * Get namespace可以多个，用分隔号分割,例如A,B 
     * @return Namespace namespace可以多个，用分隔号分割,例如A,B
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set namespace可以多个，用分隔号分割,例如A,B
     * @param Namespace namespace可以多个，用分隔号分割,例如A,B
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 容器名称 
     * @return Container 容器名称
     */
    public String getContainer() {
        return this.Container;
    }

    /**
     * Set 容器名称
     * @param Container 容器名称
     */
    public void setContainer(String Container) {
        this.Container = Container;
    }

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
     * Get 日志名称 
     * @return FilePattern 日志名称
     */
    public String getFilePattern() {
        return this.FilePattern;
    }

    /**
     * Set 日志名称
     * @param FilePattern 日志名称
     */
    public void setFilePattern(String FilePattern) {
        this.FilePattern = FilePattern;
    }

    /**
     * Get pod标签信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IncludeLabels pod标签信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getIncludeLabels() {
        return this.IncludeLabels;
    }

    /**
     * Set pod标签信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param IncludeLabels pod标签信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIncludeLabels(String [] IncludeLabels) {
        this.IncludeLabels = IncludeLabels;
    }

    /**
     * Get 工作负载信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkLoad 工作负载信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ContainerWorkLoadInfo getWorkLoad() {
        return this.WorkLoad;
    }

    /**
     * Set 工作负载信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkLoad 工作负载信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkLoad(ContainerWorkLoadInfo WorkLoad) {
        this.WorkLoad = WorkLoad;
    }

    /**
     * Get 需要排除的namespace可以多个，用分隔号分割,例如A,B
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExcludeNamespace 需要排除的namespace可以多个，用分隔号分割,例如A,B
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExcludeNamespace() {
        return this.ExcludeNamespace;
    }

    /**
     * Set 需要排除的namespace可以多个，用分隔号分割,例如A,B
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExcludeNamespace 需要排除的namespace可以多个，用分隔号分割,例如A,B
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExcludeNamespace(String ExcludeNamespace) {
        this.ExcludeNamespace = ExcludeNamespace;
    }

    /**
     * Get 需要排除的pod标签信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExcludeLabels 需要排除的pod标签信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getExcludeLabels() {
        return this.ExcludeLabels;
    }

    /**
     * Set 需要排除的pod标签信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExcludeLabels 需要排除的pod标签信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExcludeLabels(String [] ExcludeLabels) {
        this.ExcludeLabels = ExcludeLabels;
    }

    public ContainerFileInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ContainerFileInfo(ContainerFileInfo source) {
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.Container != null) {
            this.Container = new String(source.Container);
        }
        if (source.LogPath != null) {
            this.LogPath = new String(source.LogPath);
        }
        if (source.FilePattern != null) {
            this.FilePattern = new String(source.FilePattern);
        }
        if (source.IncludeLabels != null) {
            this.IncludeLabels = new String[source.IncludeLabels.length];
            for (int i = 0; i < source.IncludeLabels.length; i++) {
                this.IncludeLabels[i] = new String(source.IncludeLabels[i]);
            }
        }
        if (source.WorkLoad != null) {
            this.WorkLoad = new ContainerWorkLoadInfo(source.WorkLoad);
        }
        if (source.ExcludeNamespace != null) {
            this.ExcludeNamespace = new String(source.ExcludeNamespace);
        }
        if (source.ExcludeLabels != null) {
            this.ExcludeLabels = new String[source.ExcludeLabels.length];
            for (int i = 0; i < source.ExcludeLabels.length; i++) {
                this.ExcludeLabels[i] = new String(source.ExcludeLabels[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "Container", this.Container);
        this.setParamSimple(map, prefix + "LogPath", this.LogPath);
        this.setParamSimple(map, prefix + "FilePattern", this.FilePattern);
        this.setParamArraySimple(map, prefix + "IncludeLabels.", this.IncludeLabels);
        this.setParamObj(map, prefix + "WorkLoad.", this.WorkLoad);
        this.setParamSimple(map, prefix + "ExcludeNamespace", this.ExcludeNamespace);
        this.setParamArraySimple(map, prefix + "ExcludeLabels.", this.ExcludeLabels);

    }
}

