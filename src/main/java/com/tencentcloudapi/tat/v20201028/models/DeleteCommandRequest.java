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
package com.tencentcloudapi.tat.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteCommandRequest extends AbstractModel{

    /**
    * 待删除的命令ID。
    */
    @SerializedName("CommandId")
    @Expose
    private String CommandId;

    /**
     * Get 待删除的命令ID。 
     * @return CommandId 待删除的命令ID。
     */
    public String getCommandId() {
        return this.CommandId;
    }

    /**
     * Set 待删除的命令ID。
     * @param CommandId 待删除的命令ID。
     */
    public void setCommandId(String CommandId) {
        this.CommandId = CommandId;
    }

    public DeleteCommandRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteCommandRequest(DeleteCommandRequest source) {
        if (source.CommandId != null) {
            this.CommandId = new String(source.CommandId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CommandId", this.CommandId);

    }
}

