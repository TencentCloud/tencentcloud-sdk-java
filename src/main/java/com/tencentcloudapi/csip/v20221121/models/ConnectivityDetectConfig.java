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

public class ConnectivityDetectConfig extends AbstractModel {

    /**
    * <p>主机quuid</p>
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * <p>主机uuid</p>
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
     * Get <p>主机quuid</p> 
     * @return Quuid <p>主机quuid</p>
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set <p>主机quuid</p>
     * @param Quuid <p>主机quuid</p>
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get <p>主机uuid</p> 
     * @return Uuid <p>主机uuid</p>
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set <p>主机uuid</p>
     * @param Uuid <p>主机uuid</p>
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    public ConnectivityDetectConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConnectivityDetectConfig(ConnectivityDetectConfig source) {
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);

    }
}

