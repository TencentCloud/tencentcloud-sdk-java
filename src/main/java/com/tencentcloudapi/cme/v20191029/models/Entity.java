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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Entity extends AbstractModel {

    /**
    * 类型，取值有：
<li>PERSON：个人。</li>
<li>TEAM：团队。</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Id，当 Type=PERSON，取值为用户 Id，当 Type=TEAM，取值为团队 Id。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
     * Get 类型，取值有：
<li>PERSON：个人。</li>
<li>TEAM：团队。</li> 
     * @return Type 类型，取值有：
<li>PERSON：个人。</li>
<li>TEAM：团队。</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 类型，取值有：
<li>PERSON：个人。</li>
<li>TEAM：团队。</li>
     * @param Type 类型，取值有：
<li>PERSON：个人。</li>
<li>TEAM：团队。</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Id，当 Type=PERSON，取值为用户 Id，当 Type=TEAM，取值为团队 Id。 
     * @return Id Id，当 Type=PERSON，取值为用户 Id，当 Type=TEAM，取值为团队 Id。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Id，当 Type=PERSON，取值为用户 Id，当 Type=TEAM，取值为团队 Id。
     * @param Id Id，当 Type=PERSON，取值为用户 Id，当 Type=TEAM，取值为团队 Id。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    public Entity() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Entity(Entity source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Id", this.Id);

    }
}

