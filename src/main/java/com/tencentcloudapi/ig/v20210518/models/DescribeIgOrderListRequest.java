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
package com.tencentcloudapi.ig.v20210518.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeIgOrderListRequest extends AbstractModel {

    /**
    * <p>页码</p>
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * <p>每页数目</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>产品类型</p><p>枚举值：</p><ul><li>ig： 导诊</li><li>ipc： 预问诊</li></ul><p>默认值：ig</p>
    */
    @SerializedName("ProductType")
    @Expose
    private String ProductType;

    /**
    * <p>订单状态</p><p>枚举值：</p><ul><li>0： 无状态</li><li>1： 未激活</li><li>2： 使用中</li><li>3： 暂停使用</li><li>4： 已到期</li><li>5： 已删除</li><li>6： 已失效</li></ul><p>默认值：0</p>
    */
    @SerializedName("OrderStatus")
    @Expose
    private Long OrderStatus;

    /**
    * <p>搜索关键字</p>
    */
    @SerializedName("KeyWord")
    @Expose
    private String KeyWord;

    /**
     * Get <p>页码</p> 
     * @return PageNumber <p>页码</p>
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set <p>页码</p>
     * @param PageNumber <p>页码</p>
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get <p>每页数目</p> 
     * @return PageSize <p>每页数目</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>每页数目</p>
     * @param PageSize <p>每页数目</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>产品类型</p><p>枚举值：</p><ul><li>ig： 导诊</li><li>ipc： 预问诊</li></ul><p>默认值：ig</p> 
     * @return ProductType <p>产品类型</p><p>枚举值：</p><ul><li>ig： 导诊</li><li>ipc： 预问诊</li></ul><p>默认值：ig</p>
     */
    public String getProductType() {
        return this.ProductType;
    }

    /**
     * Set <p>产品类型</p><p>枚举值：</p><ul><li>ig： 导诊</li><li>ipc： 预问诊</li></ul><p>默认值：ig</p>
     * @param ProductType <p>产品类型</p><p>枚举值：</p><ul><li>ig： 导诊</li><li>ipc： 预问诊</li></ul><p>默认值：ig</p>
     */
    public void setProductType(String ProductType) {
        this.ProductType = ProductType;
    }

    /**
     * Get <p>订单状态</p><p>枚举值：</p><ul><li>0： 无状态</li><li>1： 未激活</li><li>2： 使用中</li><li>3： 暂停使用</li><li>4： 已到期</li><li>5： 已删除</li><li>6： 已失效</li></ul><p>默认值：0</p> 
     * @return OrderStatus <p>订单状态</p><p>枚举值：</p><ul><li>0： 无状态</li><li>1： 未激活</li><li>2： 使用中</li><li>3： 暂停使用</li><li>4： 已到期</li><li>5： 已删除</li><li>6： 已失效</li></ul><p>默认值：0</p>
     */
    public Long getOrderStatus() {
        return this.OrderStatus;
    }

    /**
     * Set <p>订单状态</p><p>枚举值：</p><ul><li>0： 无状态</li><li>1： 未激活</li><li>2： 使用中</li><li>3： 暂停使用</li><li>4： 已到期</li><li>5： 已删除</li><li>6： 已失效</li></ul><p>默认值：0</p>
     * @param OrderStatus <p>订单状态</p><p>枚举值：</p><ul><li>0： 无状态</li><li>1： 未激活</li><li>2： 使用中</li><li>3： 暂停使用</li><li>4： 已到期</li><li>5： 已删除</li><li>6： 已失效</li></ul><p>默认值：0</p>
     */
    public void setOrderStatus(Long OrderStatus) {
        this.OrderStatus = OrderStatus;
    }

    /**
     * Get <p>搜索关键字</p> 
     * @return KeyWord <p>搜索关键字</p>
     */
    public String getKeyWord() {
        return this.KeyWord;
    }

    /**
     * Set <p>搜索关键字</p>
     * @param KeyWord <p>搜索关键字</p>
     */
    public void setKeyWord(String KeyWord) {
        this.KeyWord = KeyWord;
    }

    public DescribeIgOrderListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeIgOrderListRequest(DescribeIgOrderListRequest source) {
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.ProductType != null) {
            this.ProductType = new String(source.ProductType);
        }
        if (source.OrderStatus != null) {
            this.OrderStatus = new Long(source.OrderStatus);
        }
        if (source.KeyWord != null) {
            this.KeyWord = new String(source.KeyWord);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "ProductType", this.ProductType);
        this.setParamSimple(map, prefix + "OrderStatus", this.OrderStatus);
        this.setParamSimple(map, prefix + "KeyWord", this.KeyWord);

    }
}

