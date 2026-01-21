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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeParamTemplatesRequest extends AbstractModel {

    /**
    * <p>指定查询的产品版本与架构。</p><ul><li>6：Redis 4.0 标准架构。</li><li>7：Redis 4.0 集群架构。</li><li>8：Redis 5.0 标准架构。</li><li>9：Redis 5.0 集群架构。</li><li>15：Redis 6.2 标准架构。</li><li>16：Redis 6.2 集群架构。</li><li>17：Redis 7.0 标准架构。</li><li>18：Redis 7.0 集群架构。</li><li>19：ValKey 8.0 标准架构。</li><li>20：ValKey 8.0 集群架构。</li></ul>
    */
    @SerializedName("ProductTypes")
    @Expose
    private Long [] ProductTypes;

    /**
    * <p>指定查询的参数模板名称。</p><ul><li>数据类型：字符串数组，最大长度限制为50。</li><li>获取方式：请通过 <a href="https://console.cloud.tencent.com/redis/templates">Redis 控制台的参数模版</a> 页面复制自定义模板或系统默认模板的模板名称。</li></ul>
    */
    @SerializedName("TemplateNames")
    @Expose
    private String [] TemplateNames;

    /**
    * <p>指定查询的参数模板 ID。</p><ul><li>数据类型：字符串数组，最大长度限制为50。</li><li>获取方式：请通过 <a href="https://console.cloud.tencent.com/redis/templates">Redis 控制台的参数模版</a> 页面复制自定义模板或系统默认模板的模板 ID。</li></ul>
    */
    @SerializedName("TemplateIds")
    @Expose
    private String [] TemplateIds;

    /**
    * <p>指定查询结果的分页大小，即每页返回的记录数量。</p><ul><li>取值范围：0～200。</li><li>默认值：200。</li></ul>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>分页偏移量，用于指定查询结果的起始位置。</p><ul><li>取值：必须为 Limit 的整数倍，默认值为 0。</li><li>计算公式：offset=limit*(页码-1)。</li></ul>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get <p>指定查询的产品版本与架构。</p><ul><li>6：Redis 4.0 标准架构。</li><li>7：Redis 4.0 集群架构。</li><li>8：Redis 5.0 标准架构。</li><li>9：Redis 5.0 集群架构。</li><li>15：Redis 6.2 标准架构。</li><li>16：Redis 6.2 集群架构。</li><li>17：Redis 7.0 标准架构。</li><li>18：Redis 7.0 集群架构。</li><li>19：ValKey 8.0 标准架构。</li><li>20：ValKey 8.0 集群架构。</li></ul> 
     * @return ProductTypes <p>指定查询的产品版本与架构。</p><ul><li>6：Redis 4.0 标准架构。</li><li>7：Redis 4.0 集群架构。</li><li>8：Redis 5.0 标准架构。</li><li>9：Redis 5.0 集群架构。</li><li>15：Redis 6.2 标准架构。</li><li>16：Redis 6.2 集群架构。</li><li>17：Redis 7.0 标准架构。</li><li>18：Redis 7.0 集群架构。</li><li>19：ValKey 8.0 标准架构。</li><li>20：ValKey 8.0 集群架构。</li></ul>
     */
    public Long [] getProductTypes() {
        return this.ProductTypes;
    }

    /**
     * Set <p>指定查询的产品版本与架构。</p><ul><li>6：Redis 4.0 标准架构。</li><li>7：Redis 4.0 集群架构。</li><li>8：Redis 5.0 标准架构。</li><li>9：Redis 5.0 集群架构。</li><li>15：Redis 6.2 标准架构。</li><li>16：Redis 6.2 集群架构。</li><li>17：Redis 7.0 标准架构。</li><li>18：Redis 7.0 集群架构。</li><li>19：ValKey 8.0 标准架构。</li><li>20：ValKey 8.0 集群架构。</li></ul>
     * @param ProductTypes <p>指定查询的产品版本与架构。</p><ul><li>6：Redis 4.0 标准架构。</li><li>7：Redis 4.0 集群架构。</li><li>8：Redis 5.0 标准架构。</li><li>9：Redis 5.0 集群架构。</li><li>15：Redis 6.2 标准架构。</li><li>16：Redis 6.2 集群架构。</li><li>17：Redis 7.0 标准架构。</li><li>18：Redis 7.0 集群架构。</li><li>19：ValKey 8.0 标准架构。</li><li>20：ValKey 8.0 集群架构。</li></ul>
     */
    public void setProductTypes(Long [] ProductTypes) {
        this.ProductTypes = ProductTypes;
    }

    /**
     * Get <p>指定查询的参数模板名称。</p><ul><li>数据类型：字符串数组，最大长度限制为50。</li><li>获取方式：请通过 <a href="https://console.cloud.tencent.com/redis/templates">Redis 控制台的参数模版</a> 页面复制自定义模板或系统默认模板的模板名称。</li></ul> 
     * @return TemplateNames <p>指定查询的参数模板名称。</p><ul><li>数据类型：字符串数组，最大长度限制为50。</li><li>获取方式：请通过 <a href="https://console.cloud.tencent.com/redis/templates">Redis 控制台的参数模版</a> 页面复制自定义模板或系统默认模板的模板名称。</li></ul>
     */
    public String [] getTemplateNames() {
        return this.TemplateNames;
    }

    /**
     * Set <p>指定查询的参数模板名称。</p><ul><li>数据类型：字符串数组，最大长度限制为50。</li><li>获取方式：请通过 <a href="https://console.cloud.tencent.com/redis/templates">Redis 控制台的参数模版</a> 页面复制自定义模板或系统默认模板的模板名称。</li></ul>
     * @param TemplateNames <p>指定查询的参数模板名称。</p><ul><li>数据类型：字符串数组，最大长度限制为50。</li><li>获取方式：请通过 <a href="https://console.cloud.tencent.com/redis/templates">Redis 控制台的参数模版</a> 页面复制自定义模板或系统默认模板的模板名称。</li></ul>
     */
    public void setTemplateNames(String [] TemplateNames) {
        this.TemplateNames = TemplateNames;
    }

    /**
     * Get <p>指定查询的参数模板 ID。</p><ul><li>数据类型：字符串数组，最大长度限制为50。</li><li>获取方式：请通过 <a href="https://console.cloud.tencent.com/redis/templates">Redis 控制台的参数模版</a> 页面复制自定义模板或系统默认模板的模板 ID。</li></ul> 
     * @return TemplateIds <p>指定查询的参数模板 ID。</p><ul><li>数据类型：字符串数组，最大长度限制为50。</li><li>获取方式：请通过 <a href="https://console.cloud.tencent.com/redis/templates">Redis 控制台的参数模版</a> 页面复制自定义模板或系统默认模板的模板 ID。</li></ul>
     */
    public String [] getTemplateIds() {
        return this.TemplateIds;
    }

    /**
     * Set <p>指定查询的参数模板 ID。</p><ul><li>数据类型：字符串数组，最大长度限制为50。</li><li>获取方式：请通过 <a href="https://console.cloud.tencent.com/redis/templates">Redis 控制台的参数模版</a> 页面复制自定义模板或系统默认模板的模板 ID。</li></ul>
     * @param TemplateIds <p>指定查询的参数模板 ID。</p><ul><li>数据类型：字符串数组，最大长度限制为50。</li><li>获取方式：请通过 <a href="https://console.cloud.tencent.com/redis/templates">Redis 控制台的参数模版</a> 页面复制自定义模板或系统默认模板的模板 ID。</li></ul>
     */
    public void setTemplateIds(String [] TemplateIds) {
        this.TemplateIds = TemplateIds;
    }

    /**
     * Get <p>指定查询结果的分页大小，即每页返回的记录数量。</p><ul><li>取值范围：0～200。</li><li>默认值：200。</li></ul> 
     * @return Limit <p>指定查询结果的分页大小，即每页返回的记录数量。</p><ul><li>取值范围：0～200。</li><li>默认值：200。</li></ul>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>指定查询结果的分页大小，即每页返回的记录数量。</p><ul><li>取值范围：0～200。</li><li>默认值：200。</li></ul>
     * @param Limit <p>指定查询结果的分页大小，即每页返回的记录数量。</p><ul><li>取值范围：0～200。</li><li>默认值：200。</li></ul>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>分页偏移量，用于指定查询结果的起始位置。</p><ul><li>取值：必须为 Limit 的整数倍，默认值为 0。</li><li>计算公式：offset=limit*(页码-1)。</li></ul> 
     * @return Offset <p>分页偏移量，用于指定查询结果的起始位置。</p><ul><li>取值：必须为 Limit 的整数倍，默认值为 0。</li><li>计算公式：offset=limit*(页码-1)。</li></ul>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页偏移量，用于指定查询结果的起始位置。</p><ul><li>取值：必须为 Limit 的整数倍，默认值为 0。</li><li>计算公式：offset=limit*(页码-1)。</li></ul>
     * @param Offset <p>分页偏移量，用于指定查询结果的起始位置。</p><ul><li>取值：必须为 Limit 的整数倍，默认值为 0。</li><li>计算公式：offset=limit*(页码-1)。</li></ul>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeParamTemplatesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeParamTemplatesRequest(DescribeParamTemplatesRequest source) {
        if (source.ProductTypes != null) {
            this.ProductTypes = new Long[source.ProductTypes.length];
            for (int i = 0; i < source.ProductTypes.length; i++) {
                this.ProductTypes[i] = new Long(source.ProductTypes[i]);
            }
        }
        if (source.TemplateNames != null) {
            this.TemplateNames = new String[source.TemplateNames.length];
            for (int i = 0; i < source.TemplateNames.length; i++) {
                this.TemplateNames[i] = new String(source.TemplateNames[i]);
            }
        }
        if (source.TemplateIds != null) {
            this.TemplateIds = new String[source.TemplateIds.length];
            for (int i = 0; i < source.TemplateIds.length; i++) {
                this.TemplateIds[i] = new String(source.TemplateIds[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ProductTypes.", this.ProductTypes);
        this.setParamArraySimple(map, prefix + "TemplateNames.", this.TemplateNames);
        this.setParamArraySimple(map, prefix + "TemplateIds.", this.TemplateIds);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

