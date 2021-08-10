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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCustomizedConfigAssociateListRequest extends AbstractModel{

    /**
    * 配置ID
    */
    @SerializedName("UconfigId")
    @Expose
    private String UconfigId;

    /**
    * 拉取绑定关系列表开始位置，默认值 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 拉取绑定关系列表数目，默认值 20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 搜索域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
     * Get 配置ID 
     * @return UconfigId 配置ID
     */
    public String getUconfigId() {
        return this.UconfigId;
    }

    /**
     * Set 配置ID
     * @param UconfigId 配置ID
     */
    public void setUconfigId(String UconfigId) {
        this.UconfigId = UconfigId;
    }

    /**
     * Get 拉取绑定关系列表开始位置，默认值 0 
     * @return Offset 拉取绑定关系列表开始位置，默认值 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 拉取绑定关系列表开始位置，默认值 0
     * @param Offset 拉取绑定关系列表开始位置，默认值 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 拉取绑定关系列表数目，默认值 20 
     * @return Limit 拉取绑定关系列表数目，默认值 20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 拉取绑定关系列表数目，默认值 20
     * @param Limit 拉取绑定关系列表数目，默认值 20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 搜索域名 
     * @return Domain 搜索域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 搜索域名
     * @param Domain 搜索域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    public DescribeCustomizedConfigAssociateListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCustomizedConfigAssociateListRequest(DescribeCustomizedConfigAssociateListRequest source) {
        if (source.UconfigId != null) {
            this.UconfigId = new String(source.UconfigId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UconfigId", this.UconfigId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Domain", this.Domain);

    }
}

