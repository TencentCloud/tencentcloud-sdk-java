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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExecAction extends AbstractModel {

    /**
    * 执行命令列表
    */
    @SerializedName("Command")
    @Expose
    private String [] Command;

    /**
     * Get 执行命令列表 
     * @return Command 执行命令列表
     */
    public String [] getCommand() {
        return this.Command;
    }

    /**
     * Set 执行命令列表
     * @param Command 执行命令列表
     */
    public void setCommand(String [] Command) {
        this.Command = Command;
    }

    public ExecAction() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExecAction(ExecAction source) {
        if (source.Command != null) {
            this.Command = new String[source.Command.length];
            for (int i = 0; i < source.Command.length; i++) {
                this.Command[i] = new String(source.Command[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Command.", this.Command);

    }
}

