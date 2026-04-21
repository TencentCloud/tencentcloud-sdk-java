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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NatClusterInfo extends AbstractModel {

    /**
    * <p>nat网关ID</p>
    */
    @SerializedName("NatInsId")
    @Expose
    private String NatInsId;

    /**
    * <p>nat网关名称</p>
    */
    @SerializedName("NatInsName")
    @Expose
    private String NatInsName;

    /**
     * Get <p>nat网关ID</p> 
     * @return NatInsId <p>nat网关ID</p>
     */
    public String getNatInsId() {
        return this.NatInsId;
    }

    /**
     * Set <p>nat网关ID</p>
     * @param NatInsId <p>nat网关ID</p>
     */
    public void setNatInsId(String NatInsId) {
        this.NatInsId = NatInsId;
    }

    /**
     * Get <p>nat网关名称</p> 
     * @return NatInsName <p>nat网关名称</p>
     */
    public String getNatInsName() {
        return this.NatInsName;
    }

    /**
     * Set <p>nat网关名称</p>
     * @param NatInsName <p>nat网关名称</p>
     */
    public void setNatInsName(String NatInsName) {
        this.NatInsName = NatInsName;
    }

    public NatClusterInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NatClusterInfo(NatClusterInfo source) {
        if (source.NatInsId != null) {
            this.NatInsId = new String(source.NatInsId);
        }
        if (source.NatInsName != null) {
            this.NatInsName = new String(source.NatInsName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NatInsId", this.NatInsId);
        this.setParamSimple(map, prefix + "NatInsName", this.NatInsName);

    }
}

