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
package com.tencentcloudapi.igtm.v20231024.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreatePackageAndPayRequest extends AbstractModel {

    /**
    * 下单类型：CREATE 新购；RENEW 续费；MODIFY 变配
    */
    @SerializedName("DealType")
    @Expose
    private String DealType;

    /**
    * 套餐类型：STANDARD 标准版；ULTIMATE 旗舰版；TASK 任务探测
    */
    @SerializedName("GoodsType")
    @Expose
    private String GoodsType;

    /**
    * 商品数量：STANDARD和ULTIMATE固定为1，TASK为任务探测数量。取值范围：1～10000
    */
    @SerializedName("GoodsNum")
    @Expose
    private Long GoodsNum;

    /**
    * 自动续费：1 开启自动续费；2 关闭自动续费
    */
    @SerializedName("AutoRenew")
    @Expose
    private Long AutoRenew;

    /**
    * 资源ID，续费和变配的时候需要传
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 套餐时长，以月为单位，创建和续费的时候需要传。取值范围：1～120
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * 升级的套餐类型，暂时只支持传ULTIMATE，不支持降配
    */
    @SerializedName("NewPackageType")
    @Expose
    private String NewPackageType;

    /**
    * 是否自动选择代金券，1 是；0否，默认为0
    */
    @SerializedName("AutoVoucher")
    @Expose
    private Long AutoVoucher;

    /**
     * Get 下单类型：CREATE 新购；RENEW 续费；MODIFY 变配 
     * @return DealType 下单类型：CREATE 新购；RENEW 续费；MODIFY 变配
     */
    public String getDealType() {
        return this.DealType;
    }

    /**
     * Set 下单类型：CREATE 新购；RENEW 续费；MODIFY 变配
     * @param DealType 下单类型：CREATE 新购；RENEW 续费；MODIFY 变配
     */
    public void setDealType(String DealType) {
        this.DealType = DealType;
    }

    /**
     * Get 套餐类型：STANDARD 标准版；ULTIMATE 旗舰版；TASK 任务探测 
     * @return GoodsType 套餐类型：STANDARD 标准版；ULTIMATE 旗舰版；TASK 任务探测
     */
    public String getGoodsType() {
        return this.GoodsType;
    }

    /**
     * Set 套餐类型：STANDARD 标准版；ULTIMATE 旗舰版；TASK 任务探测
     * @param GoodsType 套餐类型：STANDARD 标准版；ULTIMATE 旗舰版；TASK 任务探测
     */
    public void setGoodsType(String GoodsType) {
        this.GoodsType = GoodsType;
    }

    /**
     * Get 商品数量：STANDARD和ULTIMATE固定为1，TASK为任务探测数量。取值范围：1～10000 
     * @return GoodsNum 商品数量：STANDARD和ULTIMATE固定为1，TASK为任务探测数量。取值范围：1～10000
     */
    public Long getGoodsNum() {
        return this.GoodsNum;
    }

    /**
     * Set 商品数量：STANDARD和ULTIMATE固定为1，TASK为任务探测数量。取值范围：1～10000
     * @param GoodsNum 商品数量：STANDARD和ULTIMATE固定为1，TASK为任务探测数量。取值范围：1～10000
     */
    public void setGoodsNum(Long GoodsNum) {
        this.GoodsNum = GoodsNum;
    }

    /**
     * Get 自动续费：1 开启自动续费；2 关闭自动续费 
     * @return AutoRenew 自动续费：1 开启自动续费；2 关闭自动续费
     */
    public Long getAutoRenew() {
        return this.AutoRenew;
    }

    /**
     * Set 自动续费：1 开启自动续费；2 关闭自动续费
     * @param AutoRenew 自动续费：1 开启自动续费；2 关闭自动续费
     */
    public void setAutoRenew(Long AutoRenew) {
        this.AutoRenew = AutoRenew;
    }

    /**
     * Get 资源ID，续费和变配的时候需要传 
     * @return ResourceId 资源ID，续费和变配的时候需要传
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源ID，续费和变配的时候需要传
     * @param ResourceId 资源ID，续费和变配的时候需要传
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 套餐时长，以月为单位，创建和续费的时候需要传。取值范围：1～120 
     * @return TimeSpan 套餐时长，以月为单位，创建和续费的时候需要传。取值范围：1～120
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set 套餐时长，以月为单位，创建和续费的时候需要传。取值范围：1～120
     * @param TimeSpan 套餐时长，以月为单位，创建和续费的时候需要传。取值范围：1～120
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get 升级的套餐类型，暂时只支持传ULTIMATE，不支持降配 
     * @return NewPackageType 升级的套餐类型，暂时只支持传ULTIMATE，不支持降配
     */
    public String getNewPackageType() {
        return this.NewPackageType;
    }

    /**
     * Set 升级的套餐类型，暂时只支持传ULTIMATE，不支持降配
     * @param NewPackageType 升级的套餐类型，暂时只支持传ULTIMATE，不支持降配
     */
    public void setNewPackageType(String NewPackageType) {
        this.NewPackageType = NewPackageType;
    }

    /**
     * Get 是否自动选择代金券，1 是；0否，默认为0 
     * @return AutoVoucher 是否自动选择代金券，1 是；0否，默认为0
     */
    public Long getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * Set 是否自动选择代金券，1 是；0否，默认为0
     * @param AutoVoucher 是否自动选择代金券，1 是；0否，默认为0
     */
    public void setAutoVoucher(Long AutoVoucher) {
        this.AutoVoucher = AutoVoucher;
    }

    public CreatePackageAndPayRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreatePackageAndPayRequest(CreatePackageAndPayRequest source) {
        if (source.DealType != null) {
            this.DealType = new String(source.DealType);
        }
        if (source.GoodsType != null) {
            this.GoodsType = new String(source.GoodsType);
        }
        if (source.GoodsNum != null) {
            this.GoodsNum = new Long(source.GoodsNum);
        }
        if (source.AutoRenew != null) {
            this.AutoRenew = new Long(source.AutoRenew);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.TimeSpan != null) {
            this.TimeSpan = new Long(source.TimeSpan);
        }
        if (source.NewPackageType != null) {
            this.NewPackageType = new String(source.NewPackageType);
        }
        if (source.AutoVoucher != null) {
            this.AutoVoucher = new Long(source.AutoVoucher);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DealType", this.DealType);
        this.setParamSimple(map, prefix + "GoodsType", this.GoodsType);
        this.setParamSimple(map, prefix + "GoodsNum", this.GoodsNum);
        this.setParamSimple(map, prefix + "AutoRenew", this.AutoRenew);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "NewPackageType", this.NewPackageType);
        this.setParamSimple(map, prefix + "AutoVoucher", this.AutoVoucher);

    }
}

