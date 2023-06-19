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
package com.tencentcloudapi.cloudstudio.v20230508.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LifeCycleCommand extends AbstractModel{

    /**
    * 指令描述
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 具体命令
    */
    @SerializedName("Command")
    @Expose
    private String Command;

    /**
     * Get 指令描述 
     * @return Name 指令描述
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 指令描述
     * @param Name 指令描述
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 具体命令 
     * @return Command 具体命令
     */
    public String getCommand() {
        return this.Command;
    }

    /**
     * Set 具体命令
     * @param Command 具体命令
     */
    public void setCommand(String Command) {
        this.Command = Command;
    }

    public LifeCycleCommand() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LifeCycleCommand(LifeCycleCommand source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Command != null) {
            this.Command = new String(source.Command);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Command", this.Command);

    }
}

