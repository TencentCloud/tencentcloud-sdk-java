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

public class CommandLine extends AbstractModel {

    /**
    * 路径,需要base64加密
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Exe")
    @Expose
    private String Exe;

    /**
    * 命令行,需要base64加密
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Cmdline")
    @Expose
    private String Cmdline;

    /**
     * Get 路径,需要base64加密
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Exe 路径,需要base64加密
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExe() {
        return this.Exe;
    }

    /**
     * Set 路径,需要base64加密
注意：此字段可能返回 null，表示取不到有效值。
     * @param Exe 路径,需要base64加密
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExe(String Exe) {
        this.Exe = Exe;
    }

    /**
     * Get 命令行,需要base64加密
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Cmdline 命令行,需要base64加密
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCmdline() {
        return this.Cmdline;
    }

    /**
     * Set 命令行,需要base64加密
注意：此字段可能返回 null，表示取不到有效值。
     * @param Cmdline 命令行,需要base64加密
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCmdline(String Cmdline) {
        this.Cmdline = Cmdline;
    }

    public CommandLine() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CommandLine(CommandLine source) {
        if (source.Exe != null) {
            this.Exe = new String(source.Exe);
        }
        if (source.Cmdline != null) {
            this.Cmdline = new String(source.Cmdline);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Exe", this.Exe);
        this.setParamSimple(map, prefix + "Cmdline", this.Cmdline);

    }
}

