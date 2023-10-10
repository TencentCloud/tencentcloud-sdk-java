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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyJavaMemShellPluginSwitchRequest extends AbstractModel{

    /**
    * 主机quuid数组
    */
    @SerializedName("Quuids")
    @Expose
    private String [] Quuids;

    /**
    * 插件目标状态：0: 关闭 1: 开启
    */
    @SerializedName("JavaShellStatus")
    @Expose
    private Long JavaShellStatus;

    /**
     * Get 主机quuid数组 
     * @return Quuids 主机quuid数组
     */
    public String [] getQuuids() {
        return this.Quuids;
    }

    /**
     * Set 主机quuid数组
     * @param Quuids 主机quuid数组
     */
    public void setQuuids(String [] Quuids) {
        this.Quuids = Quuids;
    }

    /**
     * Get 插件目标状态：0: 关闭 1: 开启 
     * @return JavaShellStatus 插件目标状态：0: 关闭 1: 开启
     */
    public Long getJavaShellStatus() {
        return this.JavaShellStatus;
    }

    /**
     * Set 插件目标状态：0: 关闭 1: 开启
     * @param JavaShellStatus 插件目标状态：0: 关闭 1: 开启
     */
    public void setJavaShellStatus(Long JavaShellStatus) {
        this.JavaShellStatus = JavaShellStatus;
    }

    public ModifyJavaMemShellPluginSwitchRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyJavaMemShellPluginSwitchRequest(ModifyJavaMemShellPluginSwitchRequest source) {
        if (source.Quuids != null) {
            this.Quuids = new String[source.Quuids.length];
            for (int i = 0; i < source.Quuids.length; i++) {
                this.Quuids[i] = new String(source.Quuids[i]);
            }
        }
        if (source.JavaShellStatus != null) {
            this.JavaShellStatus = new Long(source.JavaShellStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Quuids.", this.Quuids);
        this.setParamSimple(map, prefix + "JavaShellStatus", this.JavaShellStatus);

    }
}

