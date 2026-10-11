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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RolePrivilege extends AbstractModel {

    /**
    * <p>资源</p>
    */
    @SerializedName("Resource")
    @Expose
    private RoleResource Resource;

    /**
    * <p>动作</p>
    */
    @SerializedName("Actions")
    @Expose
    private String [] Actions;

    /**
     * Get <p>资源</p> 
     * @return Resource <p>资源</p>
     */
    public RoleResource getResource() {
        return this.Resource;
    }

    /**
     * Set <p>资源</p>
     * @param Resource <p>资源</p>
     */
    public void setResource(RoleResource Resource) {
        this.Resource = Resource;
    }

    /**
     * Get <p>动作</p> 
     * @return Actions <p>动作</p>
     */
    public String [] getActions() {
        return this.Actions;
    }

    /**
     * Set <p>动作</p>
     * @param Actions <p>动作</p>
     */
    public void setActions(String [] Actions) {
        this.Actions = Actions;
    }

    public RolePrivilege() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RolePrivilege(RolePrivilege source) {
        if (source.Resource != null) {
            this.Resource = new RoleResource(source.Resource);
        }
        if (source.Actions != null) {
            this.Actions = new String[source.Actions.length];
            for (int i = 0; i < source.Actions.length; i++) {
                this.Actions[i] = new String(source.Actions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Resource.", this.Resource);
        this.setParamArraySimple(map, prefix + "Actions.", this.Actions);

    }
}

