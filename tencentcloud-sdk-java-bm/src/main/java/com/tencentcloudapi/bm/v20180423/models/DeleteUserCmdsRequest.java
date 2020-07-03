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
package com.tencentcloudapi.bm.v20180423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteUserCmdsRequest extends AbstractModel{

    /**
    * 需要删除的脚本ID
    */
    @SerializedName("CmdIds")
    @Expose
    private String [] CmdIds;

    /**
     * Get 需要删除的脚本ID 
     * @return CmdIds 需要删除的脚本ID
     */
    public String [] getCmdIds() {
        return this.CmdIds;
    }

    /**
     * Set 需要删除的脚本ID
     * @param CmdIds 需要删除的脚本ID
     */
    public void setCmdIds(String [] CmdIds) {
        this.CmdIds = CmdIds;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "CmdIds.", this.CmdIds);

    }
}

