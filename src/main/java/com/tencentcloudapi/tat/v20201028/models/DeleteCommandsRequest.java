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

public class DeleteCommandsRequest extends AbstractModel{

    /**
    * 待删除命令id
    */
    @SerializedName("CommandIds")
    @Expose
    private String [] CommandIds;

    /**
     * Get 待删除命令id 
     * @return CommandIds 待删除命令id
     */
    public String [] getCommandIds() {
        return this.CommandIds;
    }

    /**
     * Set 待删除命令id
     * @param CommandIds 待删除命令id
     */
    public void setCommandIds(String [] CommandIds) {
        this.CommandIds = CommandIds;
    }

    public DeleteCommandsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteCommandsRequest(DeleteCommandsRequest source) {
        if (source.CommandIds != null) {
            this.CommandIds = new String[source.CommandIds.length];
            for (int i = 0; i < source.CommandIds.length; i++) {
                this.CommandIds[i] = new String(source.CommandIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "CommandIds.", this.CommandIds);

    }
}

