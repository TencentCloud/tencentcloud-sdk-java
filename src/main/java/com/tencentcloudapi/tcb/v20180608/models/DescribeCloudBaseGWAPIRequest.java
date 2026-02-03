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

public class DescribeCloudBaseGWAPIRequest extends AbstractModel {

    /**
    * 服务ID
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * API域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

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
    * API类型，1为云函数，2为容器
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * API名，Type为1时为云函数名，Type为2时为容器服务名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 查询的分页参数，用于设置查询的偏移位置，0表示从头开始
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 查询的分页参数，用于表示每次查询的最大返回数据量
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 是否启用多地域
    */
    @SerializedName("EnableRegion")
    @Expose
    private Boolean EnableRegion;

    /**
    * 是否使用统一域名
    */
    @SerializedName("EnableUnion")
    @Expose
    private Boolean EnableUnion;

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
     * Get API域名 
     * @return Domain API域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set API域名
     * @param Domain API域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
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
     * Get API类型，1为云函数，2为容器 
     * @return Type API类型，1为云函数，2为容器
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set API类型，1为云函数，2为容器
     * @param Type API类型，1为云函数，2为容器
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get API名，Type为1时为云函数名，Type为2时为容器服务名 
     * @return Name API名，Type为1时为云函数名，Type为2时为容器服务名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set API名，Type为1时为云函数名，Type为2时为容器服务名
     * @param Name API名，Type为1时为云函数名，Type为2时为容器服务名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 查询的分页参数，用于设置查询的偏移位置，0表示从头开始 
     * @return Offset 查询的分页参数，用于设置查询的偏移位置，0表示从头开始
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 查询的分页参数，用于设置查询的偏移位置，0表示从头开始
     * @param Offset 查询的分页参数，用于设置查询的偏移位置，0表示从头开始
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 查询的分页参数，用于表示每次查询的最大返回数据量 
     * @return Limit 查询的分页参数，用于表示每次查询的最大返回数据量
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 查询的分页参数，用于表示每次查询的最大返回数据量
     * @param Limit 查询的分页参数，用于表示每次查询的最大返回数据量
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 是否启用多地域 
     * @return EnableRegion 是否启用多地域
     */
    public Boolean getEnableRegion() {
        return this.EnableRegion;
    }

    /**
     * Set 是否启用多地域
     * @param EnableRegion 是否启用多地域
     */
    public void setEnableRegion(Boolean EnableRegion) {
        this.EnableRegion = EnableRegion;
    }

    /**
     * Get 是否使用统一域名 
     * @return EnableUnion 是否使用统一域名
     */
    public Boolean getEnableUnion() {
        return this.EnableUnion;
    }

    /**
     * Set 是否使用统一域名
     * @param EnableUnion 是否使用统一域名
     */
    public void setEnableUnion(Boolean EnableUnion) {
        this.EnableUnion = EnableUnion;
    }

    public DescribeCloudBaseGWAPIRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCloudBaseGWAPIRequest(DescribeCloudBaseGWAPIRequest source) {
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
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
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.EnableRegion != null) {
            this.EnableRegion = new Boolean(source.EnableRegion);
        }
        if (source.EnableUnion != null) {
            this.EnableUnion = new Boolean(source.EnableUnion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "APIId", this.APIId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "EnableRegion", this.EnableRegion);
        this.setParamSimple(map, prefix + "EnableUnion", this.EnableUnion);

    }
}

