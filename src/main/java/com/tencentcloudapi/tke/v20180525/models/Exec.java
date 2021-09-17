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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Exec extends AbstractModel{

    /**
    * 容器内检测的命令
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Commands")
    @Expose
    private String [] Commands;

    /**
     * Get 容器内检测的命令
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Commands 容器内检测的命令
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getCommands() {
        return this.Commands;
    }

    /**
     * Set 容器内检测的命令
注意：此字段可能返回 null，表示取不到有效值。
     * @param Commands 容器内检测的命令
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCommands(String [] Commands) {
        this.Commands = Commands;
    }

    public Exec() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Exec(Exec source) {
        if (source.Commands != null) {
            this.Commands = new String[source.Commands.length];
            for (int i = 0; i < source.Commands.length; i++) {
                this.Commands[i] = new String(source.Commands[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Commands.", this.Commands);

    }
}

