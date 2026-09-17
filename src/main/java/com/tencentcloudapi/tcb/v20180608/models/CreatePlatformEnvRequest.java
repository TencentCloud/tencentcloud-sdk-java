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

public class CreatePlatformEnvRequest extends AbstractModel {

    /**
    * <p>环境别名</p>
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * <p>套餐池标识</p>
    */
    @SerializedName("PlatformId")
    @Expose
    private String PlatformId;

    /**
    * <p>幂等键</p>
    */
    @SerializedName("ReqKey")
    @Expose
    private String ReqKey;

    /**
     * Get <p>环境别名</p> 
     * @return Alias <p>环境别名</p>
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set <p>环境别名</p>
     * @param Alias <p>环境别名</p>
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get <p>套餐池标识</p> 
     * @return PlatformId <p>套餐池标识</p>
     */
    public String getPlatformId() {
        return this.PlatformId;
    }

    /**
     * Set <p>套餐池标识</p>
     * @param PlatformId <p>套餐池标识</p>
     */
    public void setPlatformId(String PlatformId) {
        this.PlatformId = PlatformId;
    }

    /**
     * Get <p>幂等键</p> 
     * @return ReqKey <p>幂等键</p>
     */
    public String getReqKey() {
        return this.ReqKey;
    }

    /**
     * Set <p>幂等键</p>
     * @param ReqKey <p>幂等键</p>
     */
    public void setReqKey(String ReqKey) {
        this.ReqKey = ReqKey;
    }

    public CreatePlatformEnvRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreatePlatformEnvRequest(CreatePlatformEnvRequest source) {
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
        if (source.PlatformId != null) {
            this.PlatformId = new String(source.PlatformId);
        }
        if (source.ReqKey != null) {
            this.ReqKey = new String(source.ReqKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "PlatformId", this.PlatformId);
        this.setParamSimple(map, prefix + "ReqKey", this.ReqKey);

    }
}

