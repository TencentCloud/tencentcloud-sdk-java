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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteOnCallFormsRequest extends AbstractModel {

    /**
    * <p>固定值，为&quot;monitor&quot;</p>
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * <p>要删除的值班表id</p>
    */
    @SerializedName("OnCallFormIDs")
    @Expose
    private String [] OnCallFormIDs;

    /**
     * Get <p>固定值，为&quot;monitor&quot;</p> 
     * @return Module <p>固定值，为&quot;monitor&quot;</p>
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set <p>固定值，为&quot;monitor&quot;</p>
     * @param Module <p>固定值，为&quot;monitor&quot;</p>
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get <p>要删除的值班表id</p> 
     * @return OnCallFormIDs <p>要删除的值班表id</p>
     */
    public String [] getOnCallFormIDs() {
        return this.OnCallFormIDs;
    }

    /**
     * Set <p>要删除的值班表id</p>
     * @param OnCallFormIDs <p>要删除的值班表id</p>
     */
    public void setOnCallFormIDs(String [] OnCallFormIDs) {
        this.OnCallFormIDs = OnCallFormIDs;
    }

    public DeleteOnCallFormsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteOnCallFormsRequest(DeleteOnCallFormsRequest source) {
        if (source.Module != null) {
            this.Module = new String(source.Module);
        }
        if (source.OnCallFormIDs != null) {
            this.OnCallFormIDs = new String[source.OnCallFormIDs.length];
            for (int i = 0; i < source.OnCallFormIDs.length; i++) {
                this.OnCallFormIDs[i] = new String(source.OnCallFormIDs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamArraySimple(map, prefix + "OnCallFormIDs.", this.OnCallFormIDs);

    }
}

