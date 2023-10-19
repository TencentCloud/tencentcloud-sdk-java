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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VulEffectModuleInfo extends AbstractModel {

    /**
    * 组件名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 影响的主机uuid
    */
    @SerializedName("Uuids")
    @Expose
    private String [] Uuids;

    /**
    * 组件影响版本
    */
    @SerializedName("Rule")
    @Expose
    private String Rule;

    /**
    * 组件路径
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * 组件版本
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 修复命令
    */
    @SerializedName("FixCmd")
    @Expose
    private String FixCmd;

    /**
    * 影响的主机quuid
    */
    @SerializedName("Quuids")
    @Expose
    private String [] Quuids;

    /**
     * Get 组件名 
     * @return Name 组件名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 组件名
     * @param Name 组件名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 影响的主机uuid 
     * @return Uuids 影响的主机uuid
     */
    public String [] getUuids() {
        return this.Uuids;
    }

    /**
     * Set 影响的主机uuid
     * @param Uuids 影响的主机uuid
     */
    public void setUuids(String [] Uuids) {
        this.Uuids = Uuids;
    }

    /**
     * Get 组件影响版本 
     * @return Rule 组件影响版本
     */
    public String getRule() {
        return this.Rule;
    }

    /**
     * Set 组件影响版本
     * @param Rule 组件影响版本
     */
    public void setRule(String Rule) {
        this.Rule = Rule;
    }

    /**
     * Get 组件路径 
     * @return Path 组件路径
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set 组件路径
     * @param Path 组件路径
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get 组件版本 
     * @return Version 组件版本
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 组件版本
     * @param Version 组件版本
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get 修复命令 
     * @return FixCmd 修复命令
     */
    public String getFixCmd() {
        return this.FixCmd;
    }

    /**
     * Set 修复命令
     * @param FixCmd 修复命令
     */
    public void setFixCmd(String FixCmd) {
        this.FixCmd = FixCmd;
    }

    /**
     * Get 影响的主机quuid 
     * @return Quuids 影响的主机quuid
     */
    public String [] getQuuids() {
        return this.Quuids;
    }

    /**
     * Set 影响的主机quuid
     * @param Quuids 影响的主机quuid
     */
    public void setQuuids(String [] Quuids) {
        this.Quuids = Quuids;
    }

    public VulEffectModuleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulEffectModuleInfo(VulEffectModuleInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Uuids != null) {
            this.Uuids = new String[source.Uuids.length];
            for (int i = 0; i < source.Uuids.length; i++) {
                this.Uuids[i] = new String(source.Uuids[i]);
            }
        }
        if (source.Rule != null) {
            this.Rule = new String(source.Rule);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.FixCmd != null) {
            this.FixCmd = new String(source.FixCmd);
        }
        if (source.Quuids != null) {
            this.Quuids = new String[source.Quuids.length];
            for (int i = 0; i < source.Quuids.length; i++) {
                this.Quuids[i] = new String(source.Quuids[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "Uuids.", this.Uuids);
        this.setParamSimple(map, prefix + "Rule", this.Rule);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "FixCmd", this.FixCmd);
        this.setParamArraySimple(map, prefix + "Quuids.", this.Quuids);

    }
}

