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

public class HostVulComponent extends AbstractModel {

    /**
    * <p>主机简要信息</p>
    */
    @SerializedName("HostInfo")
    @Expose
    private HostBriefInfo HostInfo;

    /**
    * <p>受影响组件版本</p>
    */
    @SerializedName("EffectVersion")
    @Expose
    private String EffectVersion;

    /**
    * <p>组件在主机上的安装路径</p>
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * <p>关联进程 ID</p>
    */
    @SerializedName("ProcessID")
    @Expose
    private String ProcessID;

    /**
    * <p>修复命令（仅展示）</p>
    */
    @SerializedName("FixCommand")
    @Expose
    private String FixCommand;

    /**
    * <p>组件名字</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get <p>主机简要信息</p> 
     * @return HostInfo <p>主机简要信息</p>
     */
    public HostBriefInfo getHostInfo() {
        return this.HostInfo;
    }

    /**
     * Set <p>主机简要信息</p>
     * @param HostInfo <p>主机简要信息</p>
     */
    public void setHostInfo(HostBriefInfo HostInfo) {
        this.HostInfo = HostInfo;
    }

    /**
     * Get <p>受影响组件版本</p> 
     * @return EffectVersion <p>受影响组件版本</p>
     */
    public String getEffectVersion() {
        return this.EffectVersion;
    }

    /**
     * Set <p>受影响组件版本</p>
     * @param EffectVersion <p>受影响组件版本</p>
     */
    public void setEffectVersion(String EffectVersion) {
        this.EffectVersion = EffectVersion;
    }

    /**
     * Get <p>组件在主机上的安装路径</p> 
     * @return Path <p>组件在主机上的安装路径</p>
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set <p>组件在主机上的安装路径</p>
     * @param Path <p>组件在主机上的安装路径</p>
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get <p>关联进程 ID</p> 
     * @return ProcessID <p>关联进程 ID</p>
     */
    public String getProcessID() {
        return this.ProcessID;
    }

    /**
     * Set <p>关联进程 ID</p>
     * @param ProcessID <p>关联进程 ID</p>
     */
    public void setProcessID(String ProcessID) {
        this.ProcessID = ProcessID;
    }

    /**
     * Get <p>修复命令（仅展示）</p> 
     * @return FixCommand <p>修复命令（仅展示）</p>
     */
    public String getFixCommand() {
        return this.FixCommand;
    }

    /**
     * Set <p>修复命令（仅展示）</p>
     * @param FixCommand <p>修复命令（仅展示）</p>
     */
    public void setFixCommand(String FixCommand) {
        this.FixCommand = FixCommand;
    }

    /**
     * Get <p>组件名字</p> 
     * @return Name <p>组件名字</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>组件名字</p>
     * @param Name <p>组件名字</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public HostVulComponent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HostVulComponent(HostVulComponent source) {
        if (source.HostInfo != null) {
            this.HostInfo = new HostBriefInfo(source.HostInfo);
        }
        if (source.EffectVersion != null) {
            this.EffectVersion = new String(source.EffectVersion);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.ProcessID != null) {
            this.ProcessID = new String(source.ProcessID);
        }
        if (source.FixCommand != null) {
            this.FixCommand = new String(source.FixCommand);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "HostInfo.", this.HostInfo);
        this.setParamSimple(map, prefix + "EffectVersion", this.EffectVersion);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "ProcessID", this.ProcessID);
        this.setParamSimple(map, prefix + "FixCommand", this.FixCommand);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

