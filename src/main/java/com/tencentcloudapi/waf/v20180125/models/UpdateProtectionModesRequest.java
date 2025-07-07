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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateProtectionModesRequest extends AbstractModel {

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 资源类型
    */
    @SerializedName("Edition")
    @Expose
    private String Edition;

    /**
    * 大类规则ID
    */
    @SerializedName("TypeIDs")
    @Expose
    private String [] TypeIDs;

    /**
    * 0表示观察，1表示拦截
    */
    @SerializedName("Mode")
    @Expose
    private Long Mode;

    /**
     * Get 域名 
     * @return Domain 域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名
     * @param Domain 域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 资源类型 
     * @return Edition 资源类型
     */
    public String getEdition() {
        return this.Edition;
    }

    /**
     * Set 资源类型
     * @param Edition 资源类型
     */
    public void setEdition(String Edition) {
        this.Edition = Edition;
    }

    /**
     * Get 大类规则ID 
     * @return TypeIDs 大类规则ID
     */
    public String [] getTypeIDs() {
        return this.TypeIDs;
    }

    /**
     * Set 大类规则ID
     * @param TypeIDs 大类规则ID
     */
    public void setTypeIDs(String [] TypeIDs) {
        this.TypeIDs = TypeIDs;
    }

    /**
     * Get 0表示观察，1表示拦截 
     * @return Mode 0表示观察，1表示拦截
     */
    public Long getMode() {
        return this.Mode;
    }

    /**
     * Set 0表示观察，1表示拦截
     * @param Mode 0表示观察，1表示拦截
     */
    public void setMode(Long Mode) {
        this.Mode = Mode;
    }

    public UpdateProtectionModesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateProtectionModesRequest(UpdateProtectionModesRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Edition != null) {
            this.Edition = new String(source.Edition);
        }
        if (source.TypeIDs != null) {
            this.TypeIDs = new String[source.TypeIDs.length];
            for (int i = 0; i < source.TypeIDs.length; i++) {
                this.TypeIDs[i] = new String(source.TypeIDs[i]);
            }
        }
        if (source.Mode != null) {
            this.Mode = new Long(source.Mode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Edition", this.Edition);
        this.setParamArraySimple(map, prefix + "TypeIDs.", this.TypeIDs);
        this.setParamSimple(map, prefix + "Mode", this.Mode);

    }
}

