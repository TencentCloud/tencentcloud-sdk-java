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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSecurityGroupManagedRulesRequest extends AbstractModel{

    /**
    * 站点Id。当使用ZoneId和Entity时可不填写TemplateId，否则必须填写TemplateId。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 子域名/应用名。当使用ZoneId和Entity时可不填写TemplateId，否则必须填写TemplateId。
    */
    @SerializedName("Entity")
    @Expose
    private String Entity;

    /**
    * 分页查询偏移量。默认值：0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页查询限制数目。默认值：20，最大值：1000。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 模板Id。当使用模板Id时可不填ZoneId和Entity，否则必须填写ZoneId和Entity。
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
     * Get 站点Id。当使用ZoneId和Entity时可不填写TemplateId，否则必须填写TemplateId。 
     * @return ZoneId 站点Id。当使用ZoneId和Entity时可不填写TemplateId，否则必须填写TemplateId。
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 站点Id。当使用ZoneId和Entity时可不填写TemplateId，否则必须填写TemplateId。
     * @param ZoneId 站点Id。当使用ZoneId和Entity时可不填写TemplateId，否则必须填写TemplateId。
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 子域名/应用名。当使用ZoneId和Entity时可不填写TemplateId，否则必须填写TemplateId。 
     * @return Entity 子域名/应用名。当使用ZoneId和Entity时可不填写TemplateId，否则必须填写TemplateId。
     */
    public String getEntity() {
        return this.Entity;
    }

    /**
     * Set 子域名/应用名。当使用ZoneId和Entity时可不填写TemplateId，否则必须填写TemplateId。
     * @param Entity 子域名/应用名。当使用ZoneId和Entity时可不填写TemplateId，否则必须填写TemplateId。
     */
    public void setEntity(String Entity) {
        this.Entity = Entity;
    }

    /**
     * Get 分页查询偏移量。默认值：0。 
     * @return Offset 分页查询偏移量。默认值：0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页查询偏移量。默认值：0。
     * @param Offset 分页查询偏移量。默认值：0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页查询限制数目。默认值：20，最大值：1000。 
     * @return Limit 分页查询限制数目。默认值：20，最大值：1000。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页查询限制数目。默认值：20，最大值：1000。
     * @param Limit 分页查询限制数目。默认值：20，最大值：1000。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 模板Id。当使用模板Id时可不填ZoneId和Entity，否则必须填写ZoneId和Entity。 
     * @return TemplateId 模板Id。当使用模板Id时可不填ZoneId和Entity，否则必须填写ZoneId和Entity。
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 模板Id。当使用模板Id时可不填ZoneId和Entity，否则必须填写ZoneId和Entity。
     * @param TemplateId 模板Id。当使用模板Id时可不填ZoneId和Entity，否则必须填写ZoneId和Entity。
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    public DescribeSecurityGroupManagedRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSecurityGroupManagedRulesRequest(DescribeSecurityGroupManagedRulesRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Entity != null) {
            this.Entity = new String(source.Entity);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Entity", this.Entity);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);

    }
}

