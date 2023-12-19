/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateUserDataEngineConfigRequest extends AbstractModel {

    /**
    * 引擎ID
    */
    @SerializedName("DataEngineId")
    @Expose
    private String DataEngineId;

    /**
    * 用户自定义引擎配置项集合。该参数需要传用户需要添加的全部配置项，例如，已有配置项k1:v1，添加k2:v2，需要传[k1:v1,k2:v2]。
    */
    @SerializedName("DataEngineConfigPairs")
    @Expose
    private DataEngineConfigPair [] DataEngineConfigPairs;

    /**
    * 作业引擎资源配置模版
    */
    @SerializedName("SessionResourceTemplate")
    @Expose
    private SessionResourceTemplate SessionResourceTemplate;

    /**
     * Get 引擎ID 
     * @return DataEngineId 引擎ID
     */
    public String getDataEngineId() {
        return this.DataEngineId;
    }

    /**
     * Set 引擎ID
     * @param DataEngineId 引擎ID
     */
    public void setDataEngineId(String DataEngineId) {
        this.DataEngineId = DataEngineId;
    }

    /**
     * Get 用户自定义引擎配置项集合。该参数需要传用户需要添加的全部配置项，例如，已有配置项k1:v1，添加k2:v2，需要传[k1:v1,k2:v2]。 
     * @return DataEngineConfigPairs 用户自定义引擎配置项集合。该参数需要传用户需要添加的全部配置项，例如，已有配置项k1:v1，添加k2:v2，需要传[k1:v1,k2:v2]。
     */
    public DataEngineConfigPair [] getDataEngineConfigPairs() {
        return this.DataEngineConfigPairs;
    }

    /**
     * Set 用户自定义引擎配置项集合。该参数需要传用户需要添加的全部配置项，例如，已有配置项k1:v1，添加k2:v2，需要传[k1:v1,k2:v2]。
     * @param DataEngineConfigPairs 用户自定义引擎配置项集合。该参数需要传用户需要添加的全部配置项，例如，已有配置项k1:v1，添加k2:v2，需要传[k1:v1,k2:v2]。
     */
    public void setDataEngineConfigPairs(DataEngineConfigPair [] DataEngineConfigPairs) {
        this.DataEngineConfigPairs = DataEngineConfigPairs;
    }

    /**
     * Get 作业引擎资源配置模版 
     * @return SessionResourceTemplate 作业引擎资源配置模版
     */
    public SessionResourceTemplate getSessionResourceTemplate() {
        return this.SessionResourceTemplate;
    }

    /**
     * Set 作业引擎资源配置模版
     * @param SessionResourceTemplate 作业引擎资源配置模版
     */
    public void setSessionResourceTemplate(SessionResourceTemplate SessionResourceTemplate) {
        this.SessionResourceTemplate = SessionResourceTemplate;
    }

    public UpdateUserDataEngineConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateUserDataEngineConfigRequest(UpdateUserDataEngineConfigRequest source) {
        if (source.DataEngineId != null) {
            this.DataEngineId = new String(source.DataEngineId);
        }
        if (source.DataEngineConfigPairs != null) {
            this.DataEngineConfigPairs = new DataEngineConfigPair[source.DataEngineConfigPairs.length];
            for (int i = 0; i < source.DataEngineConfigPairs.length; i++) {
                this.DataEngineConfigPairs[i] = new DataEngineConfigPair(source.DataEngineConfigPairs[i]);
            }
        }
        if (source.SessionResourceTemplate != null) {
            this.SessionResourceTemplate = new SessionResourceTemplate(source.SessionResourceTemplate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DataEngineId", this.DataEngineId);
        this.setParamArrayObj(map, prefix + "DataEngineConfigPairs.", this.DataEngineConfigPairs);
        this.setParamObj(map, prefix + "SessionResourceTemplate.", this.SessionResourceTemplate);

    }
}

