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

public class RuleContentProcessInfo extends AbstractModel {

    /**
    * <p>进程文件路径</p>
    */
    @SerializedName("Exe")
    @Expose
    private String Exe;

    /**
    * <p>进程命令行</p>
    */
    @SerializedName("CmdLine")
    @Expose
    private String CmdLine;

    /**
     * Get <p>进程文件路径</p> 
     * @return Exe <p>进程文件路径</p>
     */
    public String getExe() {
        return this.Exe;
    }

    /**
     * Set <p>进程文件路径</p>
     * @param Exe <p>进程文件路径</p>
     */
    public void setExe(String Exe) {
        this.Exe = Exe;
    }

    /**
     * Get <p>进程命令行</p> 
     * @return CmdLine <p>进程命令行</p>
     */
    public String getCmdLine() {
        return this.CmdLine;
    }

    /**
     * Set <p>进程命令行</p>
     * @param CmdLine <p>进程命令行</p>
     */
    public void setCmdLine(String CmdLine) {
        this.CmdLine = CmdLine;
    }

    public RuleContentProcessInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleContentProcessInfo(RuleContentProcessInfo source) {
        if (source.Exe != null) {
            this.Exe = new String(source.Exe);
        }
        if (source.CmdLine != null) {
            this.CmdLine = new String(source.CmdLine);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Exe", this.Exe);
        this.setParamSimple(map, prefix + "CmdLine", this.CmdLine);

    }
}

