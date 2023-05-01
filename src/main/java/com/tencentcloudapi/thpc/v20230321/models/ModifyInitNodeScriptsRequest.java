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
package com.tencentcloudapi.thpc.v20230321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyInitNodeScriptsRequest extends AbstractModel{

    /**
    * 集群ID。
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 节点初始化脚本信息列表。
    */
    @SerializedName("InitNodeScripts")
    @Expose
    private NodeScript [] InitNodeScripts;

    /**
     * Get 集群ID。 
     * @return ClusterId 集群ID。
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID。
     * @param ClusterId 集群ID。
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 节点初始化脚本信息列表。 
     * @return InitNodeScripts 节点初始化脚本信息列表。
     */
    public NodeScript [] getInitNodeScripts() {
        return this.InitNodeScripts;
    }

    /**
     * Set 节点初始化脚本信息列表。
     * @param InitNodeScripts 节点初始化脚本信息列表。
     */
    public void setInitNodeScripts(NodeScript [] InitNodeScripts) {
        this.InitNodeScripts = InitNodeScripts;
    }

    public ModifyInitNodeScriptsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyInitNodeScriptsRequest(ModifyInitNodeScriptsRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.InitNodeScripts != null) {
            this.InitNodeScripts = new NodeScript[source.InitNodeScripts.length];
            for (int i = 0; i < source.InitNodeScripts.length; i++) {
                this.InitNodeScripts[i] = new NodeScript(source.InitNodeScripts[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArrayObj(map, prefix + "InitNodeScripts.", this.InitNodeScripts);

    }
}

