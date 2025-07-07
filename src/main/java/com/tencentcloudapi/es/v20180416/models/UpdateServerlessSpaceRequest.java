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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateServerlessSpaceRequest extends AbstractModel {

    /**
    * Serveless索引空间ID
    */
    @SerializedName("SpaceId")
    @Expose
    private String SpaceId;

    /**
    * Serveless索引空间名
    */
    @SerializedName("SpaceName")
    @Expose
    private String SpaceName;

    /**
    * kibana内网开关
    */
    @SerializedName("KibanaPrivateAccess")
    @Expose
    private String KibanaPrivateAccess;

    /**
    * kibana公网开关
    */
    @SerializedName("KibanaPublicAccess")
    @Expose
    private String KibanaPublicAccess;

    /**
    * kibana公网白名单
    */
    @SerializedName("KibanaPublicAcl")
    @Expose
    private EsAcl KibanaPublicAcl;

    /**
     * Get Serveless索引空间ID 
     * @return SpaceId Serveless索引空间ID
     */
    public String getSpaceId() {
        return this.SpaceId;
    }

    /**
     * Set Serveless索引空间ID
     * @param SpaceId Serveless索引空间ID
     */
    public void setSpaceId(String SpaceId) {
        this.SpaceId = SpaceId;
    }

    /**
     * Get Serveless索引空间名 
     * @return SpaceName Serveless索引空间名
     */
    public String getSpaceName() {
        return this.SpaceName;
    }

    /**
     * Set Serveless索引空间名
     * @param SpaceName Serveless索引空间名
     */
    public void setSpaceName(String SpaceName) {
        this.SpaceName = SpaceName;
    }

    /**
     * Get kibana内网开关 
     * @return KibanaPrivateAccess kibana内网开关
     */
    public String getKibanaPrivateAccess() {
        return this.KibanaPrivateAccess;
    }

    /**
     * Set kibana内网开关
     * @param KibanaPrivateAccess kibana内网开关
     */
    public void setKibanaPrivateAccess(String KibanaPrivateAccess) {
        this.KibanaPrivateAccess = KibanaPrivateAccess;
    }

    /**
     * Get kibana公网开关 
     * @return KibanaPublicAccess kibana公网开关
     */
    public String getKibanaPublicAccess() {
        return this.KibanaPublicAccess;
    }

    /**
     * Set kibana公网开关
     * @param KibanaPublicAccess kibana公网开关
     */
    public void setKibanaPublicAccess(String KibanaPublicAccess) {
        this.KibanaPublicAccess = KibanaPublicAccess;
    }

    /**
     * Get kibana公网白名单 
     * @return KibanaPublicAcl kibana公网白名单
     */
    public EsAcl getKibanaPublicAcl() {
        return this.KibanaPublicAcl;
    }

    /**
     * Set kibana公网白名单
     * @param KibanaPublicAcl kibana公网白名单
     */
    public void setKibanaPublicAcl(EsAcl KibanaPublicAcl) {
        this.KibanaPublicAcl = KibanaPublicAcl;
    }

    public UpdateServerlessSpaceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateServerlessSpaceRequest(UpdateServerlessSpaceRequest source) {
        if (source.SpaceId != null) {
            this.SpaceId = new String(source.SpaceId);
        }
        if (source.SpaceName != null) {
            this.SpaceName = new String(source.SpaceName);
        }
        if (source.KibanaPrivateAccess != null) {
            this.KibanaPrivateAccess = new String(source.KibanaPrivateAccess);
        }
        if (source.KibanaPublicAccess != null) {
            this.KibanaPublicAccess = new String(source.KibanaPublicAccess);
        }
        if (source.KibanaPublicAcl != null) {
            this.KibanaPublicAcl = new EsAcl(source.KibanaPublicAcl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SpaceId", this.SpaceId);
        this.setParamSimple(map, prefix + "SpaceName", this.SpaceName);
        this.setParamSimple(map, prefix + "KibanaPrivateAccess", this.KibanaPrivateAccess);
        this.setParamSimple(map, prefix + "KibanaPublicAccess", this.KibanaPublicAccess);
        this.setParamObj(map, prefix + "KibanaPublicAcl.", this.KibanaPublicAcl);

    }
}

