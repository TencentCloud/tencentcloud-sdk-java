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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DomainAliasInfo extends AbstractModel{

    /**
    * 域名别名ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 域名别名
    */
    @SerializedName("DomainAlias")
    @Expose
    private String DomainAlias;

    /**
    * 别名状态：1-DNS不正确；2-正常；3-封禁。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get 域名别名ID 
     * @return Id 域名别名ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 域名别名ID
     * @param Id 域名别名ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 域名别名 
     * @return DomainAlias 域名别名
     */
    public String getDomainAlias() {
        return this.DomainAlias;
    }

    /**
     * Set 域名别名
     * @param DomainAlias 域名别名
     */
    public void setDomainAlias(String DomainAlias) {
        this.DomainAlias = DomainAlias;
    }

    /**
     * Get 别名状态：1-DNS不正确；2-正常；3-封禁。 
     * @return Status 别名状态：1-DNS不正确；2-正常；3-封禁。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 别名状态：1-DNS不正确；2-正常；3-封禁。
     * @param Status 别名状态：1-DNS不正确；2-正常；3-封禁。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public DomainAliasInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DomainAliasInfo(DomainAliasInfo source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.DomainAlias != null) {
            this.DomainAlias = new String(source.DomainAlias);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "DomainAlias", this.DomainAlias);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

