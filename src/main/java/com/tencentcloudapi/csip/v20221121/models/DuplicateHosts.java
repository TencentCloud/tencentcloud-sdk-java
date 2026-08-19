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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DuplicateHosts extends AbstractModel {

    /**
    * <p>Quuid 参数</p>
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * <p>Uuid 参数</p>
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * <p>Id 参数</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
     * Get <p>Quuid 参数</p> 
     * @return Quuid <p>Quuid 参数</p>
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set <p>Quuid 参数</p>
     * @param Quuid <p>Quuid 参数</p>
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get <p>Uuid 参数</p> 
     * @return Uuid <p>Uuid 参数</p>
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set <p>Uuid 参数</p>
     * @param Uuid <p>Uuid 参数</p>
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get <p>Id 参数</p> 
     * @return Id <p>Id 参数</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>Id 参数</p>
     * @param Id <p>Id 参数</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    public DuplicateHosts() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DuplicateHosts(DuplicateHosts source) {
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "Id", this.Id);

    }
}

