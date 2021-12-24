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
package com.tencentcloudapi.iecp.v20210914.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSecretsRequest extends AbstractModel{

    /**
    * 边缘单元ID
    */
    @SerializedName("EdgeUnitID")
    @Expose
    private Long EdgeUnitID;

    /**
    * 页号
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 每页数目
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 命名空间
    */
    @SerializedName("SecretNamespace")
    @Expose
    private String SecretNamespace;

    /**
    * Secret名(模糊匹配)
    */
    @SerializedName("NamePattern")
    @Expose
    private String NamePattern;

    /**
    * Sort.Field:CreateTime Sort.Order:ASC|DESC
    */
    @SerializedName("Sort")
    @Expose
    private FieldSort Sort;

    /**
    * Secret类型(DockerConfigJson或Opaque)
    */
    @SerializedName("SecretType")
    @Expose
    private String SecretType;

    /**
     * Get 边缘单元ID 
     * @return EdgeUnitID 边缘单元ID
     */
    public Long getEdgeUnitID() {
        return this.EdgeUnitID;
    }

    /**
     * Set 边缘单元ID
     * @param EdgeUnitID 边缘单元ID
     */
    public void setEdgeUnitID(Long EdgeUnitID) {
        this.EdgeUnitID = EdgeUnitID;
    }

    /**
     * Get 页号 
     * @return Offset 页号
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 页号
     * @param Offset 页号
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 每页数目 
     * @return Limit 每页数目
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页数目
     * @param Limit 每页数目
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 命名空间 
     * @return SecretNamespace 命名空间
     */
    public String getSecretNamespace() {
        return this.SecretNamespace;
    }

    /**
     * Set 命名空间
     * @param SecretNamespace 命名空间
     */
    public void setSecretNamespace(String SecretNamespace) {
        this.SecretNamespace = SecretNamespace;
    }

    /**
     * Get Secret名(模糊匹配) 
     * @return NamePattern Secret名(模糊匹配)
     */
    public String getNamePattern() {
        return this.NamePattern;
    }

    /**
     * Set Secret名(模糊匹配)
     * @param NamePattern Secret名(模糊匹配)
     */
    public void setNamePattern(String NamePattern) {
        this.NamePattern = NamePattern;
    }

    /**
     * Get Sort.Field:CreateTime Sort.Order:ASC|DESC 
     * @return Sort Sort.Field:CreateTime Sort.Order:ASC|DESC
     */
    public FieldSort getSort() {
        return this.Sort;
    }

    /**
     * Set Sort.Field:CreateTime Sort.Order:ASC|DESC
     * @param Sort Sort.Field:CreateTime Sort.Order:ASC|DESC
     */
    public void setSort(FieldSort Sort) {
        this.Sort = Sort;
    }

    /**
     * Get Secret类型(DockerConfigJson或Opaque) 
     * @return SecretType Secret类型(DockerConfigJson或Opaque)
     */
    public String getSecretType() {
        return this.SecretType;
    }

    /**
     * Set Secret类型(DockerConfigJson或Opaque)
     * @param SecretType Secret类型(DockerConfigJson或Opaque)
     */
    public void setSecretType(String SecretType) {
        this.SecretType = SecretType;
    }

    public DescribeSecretsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSecretsRequest(DescribeSecretsRequest source) {
        if (source.EdgeUnitID != null) {
            this.EdgeUnitID = new Long(source.EdgeUnitID);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.SecretNamespace != null) {
            this.SecretNamespace = new String(source.SecretNamespace);
        }
        if (source.NamePattern != null) {
            this.NamePattern = new String(source.NamePattern);
        }
        if (source.Sort != null) {
            this.Sort = new FieldSort(source.Sort);
        }
        if (source.SecretType != null) {
            this.SecretType = new String(source.SecretType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EdgeUnitID", this.EdgeUnitID);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "SecretNamespace", this.SecretNamespace);
        this.setParamSimple(map, prefix + "NamePattern", this.NamePattern);
        this.setParamObj(map, prefix + "Sort.", this.Sort);
        this.setParamSimple(map, prefix + "SecretType", this.SecretType);

    }
}

