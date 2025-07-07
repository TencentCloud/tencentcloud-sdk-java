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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDosageDetailByDateRequest extends AbstractModel {

    /**
    * 查询账单开始日期，如 2019-01-01
    */
    @SerializedName("StartDate")
    @Expose
    private String StartDate;

    /**
    * 查询账单结束日期，如 2019-01-01， 时间跨度不超过7天
    */
    @SerializedName("EndDate")
    @Expose
    private String EndDate;

    /**
    * 互动直播：
10194   互动直播-核心机房           :
10195   互动直播-边缘机房

cdn业务：
102383：CDN静态加速流量(国内)
102384：CDN静态加速带宽(国内)
102385：CDN静态加速流量(海外)
102386：CDN静态加速带宽(海外)

100967：弹性公网IP-按流量计费
101065：公网负载均衡-按流量计费

视频直播
10226 视频直播流量(国内)
10227 视频直播带宽(国内)
100763 视频直播流量(海外)
100762 视频直播宽带(海外)

仅支持以上产品
    */
    @SerializedName("ProductCode")
    @Expose
    private String ProductCode;

    /**
    * 查询域名 例如 www.qq.com
非CDN业务查询时传入空字符串，返回的值为空
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 1、如果为空，则返回EIP或CLB所有实例的明细；
2、如果传入实例名，则返回该实例明细
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * 支付者的账号 ID（账号 ID 是用户在腾讯云的唯一账号标识），默认查询本账号账单，如集团管理账号需查询成员账号自付的账单，该字段需入参成员账号UIN
    */
    @SerializedName("PayerUin")
    @Expose
    private String PayerUin;

    /**
     * Get 查询账单开始日期，如 2019-01-01 
     * @return StartDate 查询账单开始日期，如 2019-01-01
     */
    public String getStartDate() {
        return this.StartDate;
    }

    /**
     * Set 查询账单开始日期，如 2019-01-01
     * @param StartDate 查询账单开始日期，如 2019-01-01
     */
    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }

    /**
     * Get 查询账单结束日期，如 2019-01-01， 时间跨度不超过7天 
     * @return EndDate 查询账单结束日期，如 2019-01-01， 时间跨度不超过7天
     */
    public String getEndDate() {
        return this.EndDate;
    }

    /**
     * Set 查询账单结束日期，如 2019-01-01， 时间跨度不超过7天
     * @param EndDate 查询账单结束日期，如 2019-01-01， 时间跨度不超过7天
     */
    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }

    /**
     * Get 互动直播：
10194   互动直播-核心机房           :
10195   互动直播-边缘机房

cdn业务：
102383：CDN静态加速流量(国内)
102384：CDN静态加速带宽(国内)
102385：CDN静态加速流量(海外)
102386：CDN静态加速带宽(海外)

100967：弹性公网IP-按流量计费
101065：公网负载均衡-按流量计费

视频直播
10226 视频直播流量(国内)
10227 视频直播带宽(国内)
100763 视频直播流量(海外)
100762 视频直播宽带(海外)

仅支持以上产品 
     * @return ProductCode 互动直播：
10194   互动直播-核心机房           :
10195   互动直播-边缘机房

cdn业务：
102383：CDN静态加速流量(国内)
102384：CDN静态加速带宽(国内)
102385：CDN静态加速流量(海外)
102386：CDN静态加速带宽(海外)

100967：弹性公网IP-按流量计费
101065：公网负载均衡-按流量计费

视频直播
10226 视频直播流量(国内)
10227 视频直播带宽(国内)
100763 视频直播流量(海外)
100762 视频直播宽带(海外)

仅支持以上产品
     */
    public String getProductCode() {
        return this.ProductCode;
    }

    /**
     * Set 互动直播：
10194   互动直播-核心机房           :
10195   互动直播-边缘机房

cdn业务：
102383：CDN静态加速流量(国内)
102384：CDN静态加速带宽(国内)
102385：CDN静态加速流量(海外)
102386：CDN静态加速带宽(海外)

100967：弹性公网IP-按流量计费
101065：公网负载均衡-按流量计费

视频直播
10226 视频直播流量(国内)
10227 视频直播带宽(国内)
100763 视频直播流量(海外)
100762 视频直播宽带(海外)

仅支持以上产品
     * @param ProductCode 互动直播：
10194   互动直播-核心机房           :
10195   互动直播-边缘机房

cdn业务：
102383：CDN静态加速流量(国内)
102384：CDN静态加速带宽(国内)
102385：CDN静态加速流量(海外)
102386：CDN静态加速带宽(海外)

100967：弹性公网IP-按流量计费
101065：公网负载均衡-按流量计费

视频直播
10226 视频直播流量(国内)
10227 视频直播带宽(国内)
100763 视频直播流量(海外)
100762 视频直播宽带(海外)

仅支持以上产品
     */
    public void setProductCode(String ProductCode) {
        this.ProductCode = ProductCode;
    }

    /**
     * Get 查询域名 例如 www.qq.com
非CDN业务查询时传入空字符串，返回的值为空 
     * @return Domain 查询域名 例如 www.qq.com
非CDN业务查询时传入空字符串，返回的值为空
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 查询域名 例如 www.qq.com
非CDN业务查询时传入空字符串，返回的值为空
     * @param Domain 查询域名 例如 www.qq.com
非CDN业务查询时传入空字符串，返回的值为空
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 1、如果为空，则返回EIP或CLB所有实例的明细；
2、如果传入实例名，则返回该实例明细 
     * @return InstanceID 1、如果为空，则返回EIP或CLB所有实例的明细；
2、如果传入实例名，则返回该实例明细
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set 1、如果为空，则返回EIP或CLB所有实例的明细；
2、如果传入实例名，则返回该实例明细
     * @param InstanceID 1、如果为空，则返回EIP或CLB所有实例的明细；
2、如果传入实例名，则返回该实例明细
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get 支付者的账号 ID（账号 ID 是用户在腾讯云的唯一账号标识），默认查询本账号账单，如集团管理账号需查询成员账号自付的账单，该字段需入参成员账号UIN 
     * @return PayerUin 支付者的账号 ID（账号 ID 是用户在腾讯云的唯一账号标识），默认查询本账号账单，如集团管理账号需查询成员账号自付的账单，该字段需入参成员账号UIN
     */
    public String getPayerUin() {
        return this.PayerUin;
    }

    /**
     * Set 支付者的账号 ID（账号 ID 是用户在腾讯云的唯一账号标识），默认查询本账号账单，如集团管理账号需查询成员账号自付的账单，该字段需入参成员账号UIN
     * @param PayerUin 支付者的账号 ID（账号 ID 是用户在腾讯云的唯一账号标识），默认查询本账号账单，如集团管理账号需查询成员账号自付的账单，该字段需入参成员账号UIN
     */
    public void setPayerUin(String PayerUin) {
        this.PayerUin = PayerUin;
    }

    public DescribeDosageDetailByDateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDosageDetailByDateRequest(DescribeDosageDetailByDateRequest source) {
        if (source.StartDate != null) {
            this.StartDate = new String(source.StartDate);
        }
        if (source.EndDate != null) {
            this.EndDate = new String(source.EndDate);
        }
        if (source.ProductCode != null) {
            this.ProductCode = new String(source.ProductCode);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.PayerUin != null) {
            this.PayerUin = new String(source.PayerUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartDate", this.StartDate);
        this.setParamSimple(map, prefix + "EndDate", this.EndDate);
        this.setParamSimple(map, prefix + "ProductCode", this.ProductCode);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "PayerUin", this.PayerUin);

    }
}

