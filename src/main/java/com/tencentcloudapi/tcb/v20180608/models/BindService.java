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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BindService extends AbstractModel {

    /**
    * 服务标识
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * 服务名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 场景，云托管、云函数、aibuilder等
    */
    @SerializedName("Scene")
    @Expose
    private String Scene;

    /**
     * Get 服务标识 
     * @return ID 服务标识
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set 服务标识
     * @param ID 服务标识
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Get 服务名称 
     * @return Name 服务名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 服务名称
     * @param Name 服务名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 场景，云托管、云函数、aibuilder等 
     * @return Scene 场景，云托管、云函数、aibuilder等
     */
    public String getScene() {
        return this.Scene;
    }

    /**
     * Set 场景，云托管、云函数、aibuilder等
     * @param Scene 场景，云托管、云函数、aibuilder等
     */
    public void setScene(String Scene) {
        this.Scene = Scene;
    }

    public BindService() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BindService(BindService source) {
        if (source.ID != null) {
            this.ID = new String(source.ID);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Scene != null) {
            this.Scene = new String(source.Scene);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Scene", this.Scene);

    }
}

