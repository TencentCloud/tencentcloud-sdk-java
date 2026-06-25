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
package com.tencentcloudapi.cngw.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AIGWACLSubject extends AbstractModel {

    /**
    * <p>鉴权主体ID</p>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>鉴权主体名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get <p>鉴权主体ID</p> 
     * @return Id <p>鉴权主体ID</p>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>鉴权主体ID</p>
     * @param Id <p>鉴权主体ID</p>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>鉴权主体名称</p> 
     * @return Name <p>鉴权主体名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>鉴权主体名称</p>
     * @param Name <p>鉴权主体名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public AIGWACLSubject() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIGWACLSubject(AIGWACLSubject source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

