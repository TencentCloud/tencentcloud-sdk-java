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
package com.tencentcloudapi.ssm.v20190923.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListSecretsRequest extends AbstractModel {

    /**
    * <p>查询列表的起始位置，以0开始，不设置默认为0。</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>单次查询返回的最大数量，0或不设置则使用默认值 20。</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>根据创建时间的排序方式，0或者不设置则使用降序排序， 1 表示升序排序。</p>
    */
    @SerializedName("OrderType")
    @Expose
    private Long OrderType;

    /**
    * <p>根据凭据状态进行过滤。<br>默认为0表示查询全部。<br>1 --  表示查询Enabled 凭据列表。<br>2 --  表示查询Disabled 凭据列表。<br>3 --  表示查询PendingDelete 凭据列表。<br>4 --  表示PendingCreate。<br>5 --  表示CreateFailed。<br>其中状态PendingCreate和CreateFailed只有在SecretType为云产品凭据时生效</p>
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
    * <p>根据凭据名称进行过滤，为空表示不过滤。</p>
    */
    @SerializedName("SearchSecretName")
    @Expose
    private String SearchSecretName;

    /**
    * <p>标签过滤条件。</p>
    */
    @SerializedName("TagFilters")
    @Expose
    private TagFilter [] TagFilters;

    /**
    * <p>0  -- 表示用户自定义凭据，默认为0。<br>1  -- 表示用户云产品凭据。<br>2 -- 表示SSH密钥对凭据。<br>3 -- 表示云API密钥对凭据。</p>
    */
    @SerializedName("SecretType")
    @Expose
    private Long SecretType;

    /**
    * <p>此参数仅在SecretType参数值为1时生效，<br>当SecretType值为1时：<br>如果ProductName值为空，则表示查询所有类型的云产品凭据；<br>如果ProductName值为某个指定的云产品值如Mysql时，则表示查询Mysql数据库凭据；<br>如果ProductName值为多个云产品值，如：Mysql,Tdsql-mysql,Tdsql_C_Mysql（多个值以英文逗号,分隔开）则表示查询三种云产品类型的凭据；<br>支持的云产品列表请通过接口：DescribeSupportedProducts进行查询。</p>
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * <p>凭据加密类型</p><p>枚举值：</p><ul><li>0： KMS 密钥加密</li><li>1： 软密钥加密</li></ul><p>默认值：0</p>
    */
    @SerializedName("EncryptType")
    @Expose
    private Long EncryptType;

    /**
     * Get <p>查询列表的起始位置，以0开始，不设置默认为0。</p> 
     * @return Offset <p>查询列表的起始位置，以0开始，不设置默认为0。</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>查询列表的起始位置，以0开始，不设置默认为0。</p>
     * @param Offset <p>查询列表的起始位置，以0开始，不设置默认为0。</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>单次查询返回的最大数量，0或不设置则使用默认值 20。</p> 
     * @return Limit <p>单次查询返回的最大数量，0或不设置则使用默认值 20。</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>单次查询返回的最大数量，0或不设置则使用默认值 20。</p>
     * @param Limit <p>单次查询返回的最大数量，0或不设置则使用默认值 20。</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>根据创建时间的排序方式，0或者不设置则使用降序排序， 1 表示升序排序。</p> 
     * @return OrderType <p>根据创建时间的排序方式，0或者不设置则使用降序排序， 1 表示升序排序。</p>
     */
    public Long getOrderType() {
        return this.OrderType;
    }

    /**
     * Set <p>根据创建时间的排序方式，0或者不设置则使用降序排序， 1 表示升序排序。</p>
     * @param OrderType <p>根据创建时间的排序方式，0或者不设置则使用降序排序， 1 表示升序排序。</p>
     */
    public void setOrderType(Long OrderType) {
        this.OrderType = OrderType;
    }

    /**
     * Get <p>根据凭据状态进行过滤。<br>默认为0表示查询全部。<br>1 --  表示查询Enabled 凭据列表。<br>2 --  表示查询Disabled 凭据列表。<br>3 --  表示查询PendingDelete 凭据列表。<br>4 --  表示PendingCreate。<br>5 --  表示CreateFailed。<br>其中状态PendingCreate和CreateFailed只有在SecretType为云产品凭据时生效</p> 
     * @return State <p>根据凭据状态进行过滤。<br>默认为0表示查询全部。<br>1 --  表示查询Enabled 凭据列表。<br>2 --  表示查询Disabled 凭据列表。<br>3 --  表示查询PendingDelete 凭据列表。<br>4 --  表示PendingCreate。<br>5 --  表示CreateFailed。<br>其中状态PendingCreate和CreateFailed只有在SecretType为云产品凭据时生效</p>
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set <p>根据凭据状态进行过滤。<br>默认为0表示查询全部。<br>1 --  表示查询Enabled 凭据列表。<br>2 --  表示查询Disabled 凭据列表。<br>3 --  表示查询PendingDelete 凭据列表。<br>4 --  表示PendingCreate。<br>5 --  表示CreateFailed。<br>其中状态PendingCreate和CreateFailed只有在SecretType为云产品凭据时生效</p>
     * @param State <p>根据凭据状态进行过滤。<br>默认为0表示查询全部。<br>1 --  表示查询Enabled 凭据列表。<br>2 --  表示查询Disabled 凭据列表。<br>3 --  表示查询PendingDelete 凭据列表。<br>4 --  表示PendingCreate。<br>5 --  表示CreateFailed。<br>其中状态PendingCreate和CreateFailed只有在SecretType为云产品凭据时生效</p>
     */
    public void setState(Long State) {
        this.State = State;
    }

    /**
     * Get <p>根据凭据名称进行过滤，为空表示不过滤。</p> 
     * @return SearchSecretName <p>根据凭据名称进行过滤，为空表示不过滤。</p>
     */
    public String getSearchSecretName() {
        return this.SearchSecretName;
    }

    /**
     * Set <p>根据凭据名称进行过滤，为空表示不过滤。</p>
     * @param SearchSecretName <p>根据凭据名称进行过滤，为空表示不过滤。</p>
     */
    public void setSearchSecretName(String SearchSecretName) {
        this.SearchSecretName = SearchSecretName;
    }

    /**
     * Get <p>标签过滤条件。</p> 
     * @return TagFilters <p>标签过滤条件。</p>
     */
    public TagFilter [] getTagFilters() {
        return this.TagFilters;
    }

    /**
     * Set <p>标签过滤条件。</p>
     * @param TagFilters <p>标签过滤条件。</p>
     */
    public void setTagFilters(TagFilter [] TagFilters) {
        this.TagFilters = TagFilters;
    }

    /**
     * Get <p>0  -- 表示用户自定义凭据，默认为0。<br>1  -- 表示用户云产品凭据。<br>2 -- 表示SSH密钥对凭据。<br>3 -- 表示云API密钥对凭据。</p> 
     * @return SecretType <p>0  -- 表示用户自定义凭据，默认为0。<br>1  -- 表示用户云产品凭据。<br>2 -- 表示SSH密钥对凭据。<br>3 -- 表示云API密钥对凭据。</p>
     */
    public Long getSecretType() {
        return this.SecretType;
    }

    /**
     * Set <p>0  -- 表示用户自定义凭据，默认为0。<br>1  -- 表示用户云产品凭据。<br>2 -- 表示SSH密钥对凭据。<br>3 -- 表示云API密钥对凭据。</p>
     * @param SecretType <p>0  -- 表示用户自定义凭据，默认为0。<br>1  -- 表示用户云产品凭据。<br>2 -- 表示SSH密钥对凭据。<br>3 -- 表示云API密钥对凭据。</p>
     */
    public void setSecretType(Long SecretType) {
        this.SecretType = SecretType;
    }

    /**
     * Get <p>此参数仅在SecretType参数值为1时生效，<br>当SecretType值为1时：<br>如果ProductName值为空，则表示查询所有类型的云产品凭据；<br>如果ProductName值为某个指定的云产品值如Mysql时，则表示查询Mysql数据库凭据；<br>如果ProductName值为多个云产品值，如：Mysql,Tdsql-mysql,Tdsql_C_Mysql（多个值以英文逗号,分隔开）则表示查询三种云产品类型的凭据；<br>支持的云产品列表请通过接口：DescribeSupportedProducts进行查询。</p> 
     * @return ProductName <p>此参数仅在SecretType参数值为1时生效，<br>当SecretType值为1时：<br>如果ProductName值为空，则表示查询所有类型的云产品凭据；<br>如果ProductName值为某个指定的云产品值如Mysql时，则表示查询Mysql数据库凭据；<br>如果ProductName值为多个云产品值，如：Mysql,Tdsql-mysql,Tdsql_C_Mysql（多个值以英文逗号,分隔开）则表示查询三种云产品类型的凭据；<br>支持的云产品列表请通过接口：DescribeSupportedProducts进行查询。</p>
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set <p>此参数仅在SecretType参数值为1时生效，<br>当SecretType值为1时：<br>如果ProductName值为空，则表示查询所有类型的云产品凭据；<br>如果ProductName值为某个指定的云产品值如Mysql时，则表示查询Mysql数据库凭据；<br>如果ProductName值为多个云产品值，如：Mysql,Tdsql-mysql,Tdsql_C_Mysql（多个值以英文逗号,分隔开）则表示查询三种云产品类型的凭据；<br>支持的云产品列表请通过接口：DescribeSupportedProducts进行查询。</p>
     * @param ProductName <p>此参数仅在SecretType参数值为1时生效，<br>当SecretType值为1时：<br>如果ProductName值为空，则表示查询所有类型的云产品凭据；<br>如果ProductName值为某个指定的云产品值如Mysql时，则表示查询Mysql数据库凭据；<br>如果ProductName值为多个云产品值，如：Mysql,Tdsql-mysql,Tdsql_C_Mysql（多个值以英文逗号,分隔开）则表示查询三种云产品类型的凭据；<br>支持的云产品列表请通过接口：DescribeSupportedProducts进行查询。</p>
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get <p>凭据加密类型</p><p>枚举值：</p><ul><li>0： KMS 密钥加密</li><li>1： 软密钥加密</li></ul><p>默认值：0</p> 
     * @return EncryptType <p>凭据加密类型</p><p>枚举值：</p><ul><li>0： KMS 密钥加密</li><li>1： 软密钥加密</li></ul><p>默认值：0</p>
     */
    public Long getEncryptType() {
        return this.EncryptType;
    }

    /**
     * Set <p>凭据加密类型</p><p>枚举值：</p><ul><li>0： KMS 密钥加密</li><li>1： 软密钥加密</li></ul><p>默认值：0</p>
     * @param EncryptType <p>凭据加密类型</p><p>枚举值：</p><ul><li>0： KMS 密钥加密</li><li>1： 软密钥加密</li></ul><p>默认值：0</p>
     */
    public void setEncryptType(Long EncryptType) {
        this.EncryptType = EncryptType;
    }

    public ListSecretsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListSecretsRequest(ListSecretsRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.OrderType != null) {
            this.OrderType = new Long(source.OrderType);
        }
        if (source.State != null) {
            this.State = new Long(source.State);
        }
        if (source.SearchSecretName != null) {
            this.SearchSecretName = new String(source.SearchSecretName);
        }
        if (source.TagFilters != null) {
            this.TagFilters = new TagFilter[source.TagFilters.length];
            for (int i = 0; i < source.TagFilters.length; i++) {
                this.TagFilters[i] = new TagFilter(source.TagFilters[i]);
            }
        }
        if (source.SecretType != null) {
            this.SecretType = new Long(source.SecretType);
        }
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
        if (source.EncryptType != null) {
            this.EncryptType = new Long(source.EncryptType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "SearchSecretName", this.SearchSecretName);
        this.setParamArrayObj(map, prefix + "TagFilters.", this.TagFilters);
        this.setParamSimple(map, prefix + "SecretType", this.SecretType);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "EncryptType", this.EncryptType);

    }
}

