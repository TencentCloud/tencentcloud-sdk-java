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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePublicConfigReleasesRequest extends AbstractModel {

    /**
    * 配置项名称，不传入时查询全量
    */
    @SerializedName("ConfigName")
    @Expose
    private String ConfigName;

    /**
    * 命名空间ID，不传入时查询全量
    */
    @SerializedName("NamespaceId")
    @Expose
    private String NamespaceId;

    /**
    * 每页条数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 配置项ID，不传入时查询全量
    */
    @SerializedName("ConfigId")
    @Expose
    private String ConfigId;

    /**
     * Get 配置项名称，不传入时查询全量 
     * @return ConfigName 配置项名称，不传入时查询全量
     */
    public String getConfigName() {
        return this.ConfigName;
    }

    /**
     * Set 配置项名称，不传入时查询全量
     * @param ConfigName 配置项名称，不传入时查询全量
     */
    public void setConfigName(String ConfigName) {
        this.ConfigName = ConfigName;
    }

    /**
     * Get 命名空间ID，不传入时查询全量 
     * @return NamespaceId 命名空间ID，不传入时查询全量
     */
    public String getNamespaceId() {
        return this.NamespaceId;
    }

    /**
     * Set 命名空间ID，不传入时查询全量
     * @param NamespaceId 命名空间ID，不传入时查询全量
     */
    public void setNamespaceId(String NamespaceId) {
        this.NamespaceId = NamespaceId;
    }

    /**
     * Get 每页条数 
     * @return Limit 每页条数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页条数
     * @param Limit 每页条数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移量 
     * @return Offset 偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量
     * @param Offset 偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 配置项ID，不传入时查询全量 
     * @return ConfigId 配置项ID，不传入时查询全量
     */
    public String getConfigId() {
        return this.ConfigId;
    }

    /**
     * Set 配置项ID，不传入时查询全量
     * @param ConfigId 配置项ID，不传入时查询全量
     */
    public void setConfigId(String ConfigId) {
        this.ConfigId = ConfigId;
    }

    public DescribePublicConfigReleasesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePublicConfigReleasesRequest(DescribePublicConfigReleasesRequest source) {
        if (source.ConfigName != null) {
            this.ConfigName = new String(source.ConfigName);
        }
        if (source.NamespaceId != null) {
            this.NamespaceId = new String(source.NamespaceId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.ConfigId != null) {
            this.ConfigId = new String(source.ConfigId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConfigName", this.ConfigName);
        this.setParamSimple(map, prefix + "NamespaceId", this.NamespaceId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "ConfigId", this.ConfigId);

    }
}

