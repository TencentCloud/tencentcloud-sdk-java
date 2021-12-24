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
package com.tencentcloudapi.iecp.v20210914.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EdgeNodeInstallerOnline extends AbstractModel{

    /**
    * 节点安装脚本名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScriptName")
    @Expose
    private String ScriptName;

    /**
    * 节点安装脚本下载链接
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScriptDownloadUrl")
    @Expose
    private String ScriptDownloadUrl;

    /**
    * 节点安装命令
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Guide")
    @Expose
    private String Guide;

    /**
     * Get 节点安装脚本名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScriptName 节点安装脚本名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScriptName() {
        return this.ScriptName;
    }

    /**
     * Set 节点安装脚本名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScriptName 节点安装脚本名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScriptName(String ScriptName) {
        this.ScriptName = ScriptName;
    }

    /**
     * Get 节点安装脚本下载链接
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScriptDownloadUrl 节点安装脚本下载链接
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScriptDownloadUrl() {
        return this.ScriptDownloadUrl;
    }

    /**
     * Set 节点安装脚本下载链接
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScriptDownloadUrl 节点安装脚本下载链接
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScriptDownloadUrl(String ScriptDownloadUrl) {
        this.ScriptDownloadUrl = ScriptDownloadUrl;
    }

    /**
     * Get 节点安装命令
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Guide 节点安装命令
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGuide() {
        return this.Guide;
    }

    /**
     * Set 节点安装命令
注意：此字段可能返回 null，表示取不到有效值。
     * @param Guide 节点安装命令
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGuide(String Guide) {
        this.Guide = Guide;
    }

    public EdgeNodeInstallerOnline() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EdgeNodeInstallerOnline(EdgeNodeInstallerOnline source) {
        if (source.ScriptName != null) {
            this.ScriptName = new String(source.ScriptName);
        }
        if (source.ScriptDownloadUrl != null) {
            this.ScriptDownloadUrl = new String(source.ScriptDownloadUrl);
        }
        if (source.Guide != null) {
            this.Guide = new String(source.Guide);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ScriptName", this.ScriptName);
        this.setParamSimple(map, prefix + "ScriptDownloadUrl", this.ScriptDownloadUrl);
        this.setParamSimple(map, prefix + "Guide", this.Guide);

    }
}

