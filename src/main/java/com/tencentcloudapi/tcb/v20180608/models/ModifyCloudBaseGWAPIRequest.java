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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyCloudBaseGWAPIRequest extends AbstractModel {

    /**
    * Service ID
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * API ID
    */
    @SerializedName("APIId")
    @Expose
    private String APIId;

    /**
    * 选项列表，key取值：domain, path。
    */
    @SerializedName("Options")
    @Expose
    private CloudBaseOption [] Options;

    /**
     * Get Service ID 
     * @return ServiceId Service ID
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set Service ID
     * @param ServiceId Service ID
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get API ID 
     * @return APIId API ID
     */
    public String getAPIId() {
        return this.APIId;
    }

    /**
     * Set API ID
     * @param APIId API ID
     */
    public void setAPIId(String APIId) {
        this.APIId = APIId;
    }

    /**
     * Get 选项列表，key取值：domain, path。 
     * @return Options 选项列表，key取值：domain, path。
     */
    public CloudBaseOption [] getOptions() {
        return this.Options;
    }

    /**
     * Set 选项列表，key取值：domain, path。
     * @param Options 选项列表，key取值：domain, path。
     */
    public void setOptions(CloudBaseOption [] Options) {
        this.Options = Options;
    }

    public ModifyCloudBaseGWAPIRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCloudBaseGWAPIRequest(ModifyCloudBaseGWAPIRequest source) {
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.APIId != null) {
            this.APIId = new String(source.APIId);
        }
        if (source.Options != null) {
            this.Options = new CloudBaseOption[source.Options.length];
            for (int i = 0; i < source.Options.length; i++) {
                this.Options[i] = new CloudBaseOption(source.Options[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "APIId", this.APIId);
        this.setParamArrayObj(map, prefix + "Options.", this.Options);

    }
}

