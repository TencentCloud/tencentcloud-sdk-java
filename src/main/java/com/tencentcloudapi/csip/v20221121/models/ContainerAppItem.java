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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ContainerAppItem extends AbstractModel {

    /**
    * 应用综合类型如web或app或db
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MainType")
    @Expose
    private String MainType;

    /**
    * 具体应用类型如nginx或redis
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 应用版本号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 运行用户名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunAs")
    @Expose
    private String RunAs;

    /**
    * 可执行文件路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExePath")
    @Expose
    private String ExePath;

    /**
    * 配置文件路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConfigPath")
    @Expose
    private String ConfigPath;

    /**
    * 关联进程数量
    */
    @SerializedName("ProcessCnt")
    @Expose
    private Long ProcessCnt;

    /**
     * Get 应用综合类型如web或app或db
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MainType 应用综合类型如web或app或db
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMainType() {
        return this.MainType;
    }

    /**
     * Set 应用综合类型如web或app或db
注意：此字段可能返回 null，表示取不到有效值。
     * @param MainType 应用综合类型如web或app或db
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMainType(String MainType) {
        this.MainType = MainType;
    }

    /**
     * Get 具体应用类型如nginx或redis
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 具体应用类型如nginx或redis
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 具体应用类型如nginx或redis
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 具体应用类型如nginx或redis
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 应用版本号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Version 应用版本号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 应用版本号
注意：此字段可能返回 null，表示取不到有效值。
     * @param Version 应用版本号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get 运行用户名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunAs 运行用户名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRunAs() {
        return this.RunAs;
    }

    /**
     * Set 运行用户名
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunAs 运行用户名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunAs(String RunAs) {
        this.RunAs = RunAs;
    }

    /**
     * Get 可执行文件路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExePath 可执行文件路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExePath() {
        return this.ExePath;
    }

    /**
     * Set 可执行文件路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExePath 可执行文件路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExePath(String ExePath) {
        this.ExePath = ExePath;
    }

    /**
     * Get 配置文件路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConfigPath 配置文件路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConfigPath() {
        return this.ConfigPath;
    }

    /**
     * Set 配置文件路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConfigPath 配置文件路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfigPath(String ConfigPath) {
        this.ConfigPath = ConfigPath;
    }

    /**
     * Get 关联进程数量 
     * @return ProcessCnt 关联进程数量
     */
    public Long getProcessCnt() {
        return this.ProcessCnt;
    }

    /**
     * Set 关联进程数量
     * @param ProcessCnt 关联进程数量
     */
    public void setProcessCnt(Long ProcessCnt) {
        this.ProcessCnt = ProcessCnt;
    }

    public ContainerAppItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ContainerAppItem(ContainerAppItem source) {
        if (source.MainType != null) {
            this.MainType = new String(source.MainType);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.RunAs != null) {
            this.RunAs = new String(source.RunAs);
        }
        if (source.ExePath != null) {
            this.ExePath = new String(source.ExePath);
        }
        if (source.ConfigPath != null) {
            this.ConfigPath = new String(source.ConfigPath);
        }
        if (source.ProcessCnt != null) {
            this.ProcessCnt = new Long(source.ProcessCnt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MainType", this.MainType);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "RunAs", this.RunAs);
        this.setParamSimple(map, prefix + "ExePath", this.ExePath);
        this.setParamSimple(map, prefix + "ConfigPath", this.ConfigPath);
        this.setParamSimple(map, prefix + "ProcessCnt", this.ProcessCnt);

    }
}

