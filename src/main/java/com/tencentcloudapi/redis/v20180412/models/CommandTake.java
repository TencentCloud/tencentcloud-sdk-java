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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CommandTake extends AbstractModel {

    /**
    * 命令名。
    */
    @SerializedName("Cmd")
    @Expose
    private String Cmd;

    /**
    * 耗时时长。单位：ms。
    */
    @SerializedName("Took")
    @Expose
    private Long Took;

    /**
     * Get 命令名。 
     * @return Cmd 命令名。
     */
    public String getCmd() {
        return this.Cmd;
    }

    /**
     * Set 命令名。
     * @param Cmd 命令名。
     */
    public void setCmd(String Cmd) {
        this.Cmd = Cmd;
    }

    /**
     * Get 耗时时长。单位：ms。 
     * @return Took 耗时时长。单位：ms。
     */
    public Long getTook() {
        return this.Took;
    }

    /**
     * Set 耗时时长。单位：ms。
     * @param Took 耗时时长。单位：ms。
     */
    public void setTook(Long Took) {
        this.Took = Took;
    }

    public CommandTake() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CommandTake(CommandTake source) {
        if (source.Cmd != null) {
            this.Cmd = new String(source.Cmd);
        }
        if (source.Took != null) {
            this.Took = new Long(source.Took);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Cmd", this.Cmd);
        this.setParamSimple(map, prefix + "Took", this.Took);

    }
}

