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

public class ContainerWebServiceItem extends AbstractModel {

    /**
    * Web服务类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 服务版本号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 服务启动用户
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
     * Get Web服务类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type Web服务类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Web服务类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type Web服务类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 服务版本号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Version 服务版本号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 服务版本号
注意：此字段可能返回 null，表示取不到有效值。
     * @param Version 服务版本号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get 服务启动用户
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunAs 服务启动用户
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRunAs() {
        return this.RunAs;
    }

    /**
     * Set 服务启动用户
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunAs 服务启动用户
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

    public ContainerWebServiceItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ContainerWebServiceItem(ContainerWebServiceItem source) {
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "RunAs", this.RunAs);
        this.setParamSimple(map, prefix + "ExePath", this.ExePath);
        this.setParamSimple(map, prefix + "ConfigPath", this.ConfigPath);

    }
}

