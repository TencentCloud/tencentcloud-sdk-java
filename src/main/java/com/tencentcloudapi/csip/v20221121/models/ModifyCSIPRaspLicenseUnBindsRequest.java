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

public class ModifyCSIPRaspLicenseUnBindsRequest extends AbstractModel {

    /**
    * <p>待解绑的实例ID列表（IsAll=true时可不传）</p>
    */
    @SerializedName("InstanceIDs")
    @Expose
    private String [] InstanceIDs;

    /**
    * <p>是否解绑全部已绑定RASP机器</p>
    */
    @SerializedName("IsAll")
    @Expose
    private Boolean IsAll;

    /**
     * Get <p>待解绑的实例ID列表（IsAll=true时可不传）</p> 
     * @return InstanceIDs <p>待解绑的实例ID列表（IsAll=true时可不传）</p>
     */
    public String [] getInstanceIDs() {
        return this.InstanceIDs;
    }

    /**
     * Set <p>待解绑的实例ID列表（IsAll=true时可不传）</p>
     * @param InstanceIDs <p>待解绑的实例ID列表（IsAll=true时可不传）</p>
     */
    public void setInstanceIDs(String [] InstanceIDs) {
        this.InstanceIDs = InstanceIDs;
    }

    /**
     * Get <p>是否解绑全部已绑定RASP机器</p> 
     * @return IsAll <p>是否解绑全部已绑定RASP机器</p>
     */
    public Boolean getIsAll() {
        return this.IsAll;
    }

    /**
     * Set <p>是否解绑全部已绑定RASP机器</p>
     * @param IsAll <p>是否解绑全部已绑定RASP机器</p>
     */
    public void setIsAll(Boolean IsAll) {
        this.IsAll = IsAll;
    }

    public ModifyCSIPRaspLicenseUnBindsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCSIPRaspLicenseUnBindsRequest(ModifyCSIPRaspLicenseUnBindsRequest source) {
        if (source.InstanceIDs != null) {
            this.InstanceIDs = new String[source.InstanceIDs.length];
            for (int i = 0; i < source.InstanceIDs.length; i++) {
                this.InstanceIDs[i] = new String(source.InstanceIDs[i]);
            }
        }
        if (source.IsAll != null) {
            this.IsAll = new Boolean(source.IsAll);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIDs.", this.InstanceIDs);
        this.setParamSimple(map, prefix + "IsAll", this.IsAll);

    }
}

