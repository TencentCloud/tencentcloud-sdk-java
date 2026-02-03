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

public class DeleteCloudBaseGWAPIRequest extends AbstractModel {

    /**
    * 服务ID
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * API Path
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * API ID
    */
    @SerializedName("APIId")
    @Expose
    private String APIId;

    /**
    * API类型
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * API Name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 自定义值字段（Type为2时，传递容器服务名表示需要删除JNSGW）
    */
    @SerializedName("Custom")
    @Expose
    private String Custom;

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
     * Get 服务ID 
     * @return ServiceId 服务ID
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set 服务ID
     * @param ServiceId 服务ID
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get API Path 
     * @return Path API Path
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set API Path
     * @param Path API Path
     */
    public void setPath(String Path) {
        this.Path = Path;
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
     * Get API类型 
     * @return Type API类型
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set API类型
     * @param Type API类型
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get API Name 
     * @return Name API Name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set API Name
     * @param Name API Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 自定义值字段（Type为2时，传递容器服务名表示需要删除JNSGW） 
     * @return Custom 自定义值字段（Type为2时，传递容器服务名表示需要删除JNSGW）
     */
    public String getCustom() {
        return this.Custom;
    }

    /**
     * Set 自定义值字段（Type为2时，传递容器服务名表示需要删除JNSGW）
     * @param Custom 自定义值字段（Type为2时，传递容器服务名表示需要删除JNSGW）
     */
    public void setCustom(String Custom) {
        this.Custom = Custom;
    }

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

    public DeleteCloudBaseGWAPIRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteCloudBaseGWAPIRequest(DeleteCloudBaseGWAPIRequest source) {
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.APIId != null) {
            this.APIId = new String(source.APIId);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Custom != null) {
            this.Custom = new String(source.Custom);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "APIId", this.APIId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Custom", this.Custom);
        this.setParamSimple(map, prefix + "Domain", this.Domain);

    }
}

