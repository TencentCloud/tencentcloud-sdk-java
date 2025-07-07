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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EntityStatus extends AbstractModel {

    /**
    * 实例名，现在只有子域名。
    */
    @SerializedName("Entity")
    @Expose
    private String Entity;

    /**
    * 实例配置下发状态，取值有：
<li>online：配置已生效；</li><li>fail：配置失败；</li><li> process：配置下发中。</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 实例配置下发信息提示。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
     * Get 实例名，现在只有子域名。 
     * @return Entity 实例名，现在只有子域名。
     */
    public String getEntity() {
        return this.Entity;
    }

    /**
     * Set 实例名，现在只有子域名。
     * @param Entity 实例名，现在只有子域名。
     */
    public void setEntity(String Entity) {
        this.Entity = Entity;
    }

    /**
     * Get 实例配置下发状态，取值有：
<li>online：配置已生效；</li><li>fail：配置失败；</li><li> process：配置下发中。</li> 
     * @return Status 实例配置下发状态，取值有：
<li>online：配置已生效；</li><li>fail：配置失败；</li><li> process：配置下发中。</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 实例配置下发状态，取值有：
<li>online：配置已生效；</li><li>fail：配置失败；</li><li> process：配置下发中。</li>
     * @param Status 实例配置下发状态，取值有：
<li>online：配置已生效；</li><li>fail：配置失败；</li><li> process：配置下发中。</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 实例配置下发信息提示。 
     * @return Message 实例配置下发信息提示。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 实例配置下发信息提示。
     * @param Message 实例配置下发信息提示。
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    public EntityStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EntityStatus(EntityStatus source) {
        if (source.Entity != null) {
            this.Entity = new String(source.Entity);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Entity", this.Entity);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Message", this.Message);

    }
}

