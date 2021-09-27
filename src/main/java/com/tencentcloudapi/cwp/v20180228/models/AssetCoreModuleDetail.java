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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssetCoreModuleDetail extends AbstractModel{

    /**
    * 名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 描述
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * 路径
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * 版本
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 大小
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * 依赖进程
    */
    @SerializedName("Processes")
    @Expose
    private String Processes;

    /**
    * 被依赖模块
    */
    @SerializedName("Modules")
    @Expose
    private String Modules;

    /**
    * 参数信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Params")
    @Expose
    private AssetCoreModuleParam [] Params;

    /**
    * 数据更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get 名称 
     * @return Name 名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名称
     * @param Name 名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 描述 
     * @return Desc 描述
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set 描述
     * @param Desc 描述
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get 路径 
     * @return Path 路径
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set 路径
     * @param Path 路径
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get 版本 
     * @return Version 版本
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 版本
     * @param Version 版本
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get 大小 
     * @return Size 大小
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set 大小
     * @param Size 大小
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get 依赖进程 
     * @return Processes 依赖进程
     */
    public String getProcesses() {
        return this.Processes;
    }

    /**
     * Set 依赖进程
     * @param Processes 依赖进程
     */
    public void setProcesses(String Processes) {
        this.Processes = Processes;
    }

    /**
     * Get 被依赖模块 
     * @return Modules 被依赖模块
     */
    public String getModules() {
        return this.Modules;
    }

    /**
     * Set 被依赖模块
     * @param Modules 被依赖模块
     */
    public void setModules(String Modules) {
        this.Modules = Modules;
    }

    /**
     * Get 参数信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Params 参数信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AssetCoreModuleParam [] getParams() {
        return this.Params;
    }

    /**
     * Set 参数信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Params 参数信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParams(AssetCoreModuleParam [] Params) {
        this.Params = Params;
    }

    /**
     * Get 数据更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 数据更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 数据更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 数据更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public AssetCoreModuleDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetCoreModuleDetail(AssetCoreModuleDetail source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.Processes != null) {
            this.Processes = new String(source.Processes);
        }
        if (source.Modules != null) {
            this.Modules = new String(source.Modules);
        }
        if (source.Params != null) {
            this.Params = new AssetCoreModuleParam[source.Params.length];
            for (int i = 0; i < source.Params.length; i++) {
                this.Params[i] = new AssetCoreModuleParam(source.Params[i]);
            }
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "Processes", this.Processes);
        this.setParamSimple(map, prefix + "Modules", this.Modules);
        this.setParamArrayObj(map, prefix + "Params.", this.Params);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

