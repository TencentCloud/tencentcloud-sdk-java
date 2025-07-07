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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListGrantServiceAccessActionNode extends AbstractModel {

    /**
    * 接口名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 接口描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 接口名 
     * @return Name 接口名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 接口名
     * @param Name 接口名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 接口描述 
     * @return Description 接口描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 接口描述
     * @param Description 接口描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public ListGrantServiceAccessActionNode() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListGrantServiceAccessActionNode(ListGrantServiceAccessActionNode source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

