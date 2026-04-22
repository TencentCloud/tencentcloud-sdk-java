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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ComponentDeployInfo extends AbstractModel {

    /**
    * 角色名称
    */
    @SerializedName("ComponentName")
    @Expose
    private String ComponentName;

    /**
    * 待安装的节点uuid列表
    */
    @SerializedName("DeployHostUuidList")
    @Expose
    private String [] DeployHostUuidList;

    /**
     * Get 角色名称 
     * @return ComponentName 角色名称
     */
    public String getComponentName() {
        return this.ComponentName;
    }

    /**
     * Set 角色名称
     * @param ComponentName 角色名称
     */
    public void setComponentName(String ComponentName) {
        this.ComponentName = ComponentName;
    }

    /**
     * Get 待安装的节点uuid列表 
     * @return DeployHostUuidList 待安装的节点uuid列表
     */
    public String [] getDeployHostUuidList() {
        return this.DeployHostUuidList;
    }

    /**
     * Set 待安装的节点uuid列表
     * @param DeployHostUuidList 待安装的节点uuid列表
     */
    public void setDeployHostUuidList(String [] DeployHostUuidList) {
        this.DeployHostUuidList = DeployHostUuidList;
    }

    public ComponentDeployInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComponentDeployInfo(ComponentDeployInfo source) {
        if (source.ComponentName != null) {
            this.ComponentName = new String(source.ComponentName);
        }
        if (source.DeployHostUuidList != null) {
            this.DeployHostUuidList = new String[source.DeployHostUuidList.length];
            for (int i = 0; i < source.DeployHostUuidList.length; i++) {
                this.DeployHostUuidList[i] = new String(source.DeployHostUuidList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ComponentName", this.ComponentName);
        this.setParamArraySimple(map, prefix + "DeployHostUuidList.", this.DeployHostUuidList);

    }
}

