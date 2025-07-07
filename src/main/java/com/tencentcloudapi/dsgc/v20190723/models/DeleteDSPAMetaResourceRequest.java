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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteDSPAMetaResourceRequest extends AbstractModel {

    /**
    * DSPA实例ID。
    */
    @SerializedName("DspaId")
    @Expose
    private String DspaId;

    /**
    * 用户云资源ID。
    */
    @SerializedName("ResourceIDs")
    @Expose
    private String [] ResourceIDs;

    /**
     * Get DSPA实例ID。 
     * @return DspaId DSPA实例ID。
     */
    public String getDspaId() {
        return this.DspaId;
    }

    /**
     * Set DSPA实例ID。
     * @param DspaId DSPA实例ID。
     */
    public void setDspaId(String DspaId) {
        this.DspaId = DspaId;
    }

    /**
     * Get 用户云资源ID。 
     * @return ResourceIDs 用户云资源ID。
     */
    public String [] getResourceIDs() {
        return this.ResourceIDs;
    }

    /**
     * Set 用户云资源ID。
     * @param ResourceIDs 用户云资源ID。
     */
    public void setResourceIDs(String [] ResourceIDs) {
        this.ResourceIDs = ResourceIDs;
    }

    public DeleteDSPAMetaResourceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteDSPAMetaResourceRequest(DeleteDSPAMetaResourceRequest source) {
        if (source.DspaId != null) {
            this.DspaId = new String(source.DspaId);
        }
        if (source.ResourceIDs != null) {
            this.ResourceIDs = new String[source.ResourceIDs.length];
            for (int i = 0; i < source.ResourceIDs.length; i++) {
                this.ResourceIDs[i] = new String(source.ResourceIDs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DspaId", this.DspaId);
        this.setParamArraySimple(map, prefix + "ResourceIDs.", this.ResourceIDs);

    }
}

