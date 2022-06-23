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

public class CreateDealRequest extends AbstractModel{

    /**
    * 询价类型，1 新购，2 续费，3 套餐升级（增值服务暂时只支持新购）
    */
    @SerializedName("DealType")
    @Expose
    private Long DealType;

    /**
    * 商品类型，1 域名套餐 2 增值服务
    */
    @SerializedName("GoodsType")
    @Expose
    private Long GoodsType;

    /**
    * 套餐类型：
DP_PLUS：专业版
DP_EXPERT：企业版
DP_ULTRA：尊享版

增值服务类型
LB：负载均衡
URL：URL转发
DMONITOR_TASKS：D监控任务数
DMONITOR_IP：D监控备用 IP 数
CUSTOMLINE：自定义线路数
    */
    @SerializedName("GoodsChildType")
    @Expose
    private String GoodsChildType;

    /**
    * 增值服务购买数量，如果是域名套餐固定为1，如果是增值服务则按以下规则：
负载均衡、D监控任务数、D监控备用 IP 数、自定义线路数、URL 转发（必须是5的正整数倍，如 5、10、15 等）
    */
    @SerializedName("GoodsNum")
    @Expose
    private Long GoodsNum;

    /**
    * 是否开启自动续费，1 开启，2 不开启（增值服务暂不支持自动续费），默认值为 2 不开启
    */
    @SerializedName("AutoRenew")
    @Expose
    private Long AutoRenew;

    /**
    * 需要绑定套餐的域名，如 dnspod.cn，如果是续费或升级，domain 参数必须要传，新购可不传。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 套餐时长：
1. 套餐以月为单位（按月只能是 3、6 还有 12 的倍数），套餐例如购买一年则传12，最大120 。（续费最低一年）
2. 升级套餐时不需要传。
3. 增值服务的时长单位为年，买一年传1（增值服务新购按年只能是 1，增值服务续费最大为 10）
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * 套餐类型，需要升级到的套餐类型，只有升级时需要。
    */
    @SerializedName("NewPackageType")
    @Expose
    private String NewPackageType;

    /**
     * Get 询价类型，1 新购，2 续费，3 套餐升级（增值服务暂时只支持新购） 
     * @return DealType 询价类型，1 新购，2 续费，3 套餐升级（增值服务暂时只支持新购）
     */
    public Long getDealType() {
        return this.DealType;
    }

    /**
     * Set 询价类型，1 新购，2 续费，3 套餐升级（增值服务暂时只支持新购）
     * @param DealType 询价类型，1 新购，2 续费，3 套餐升级（增值服务暂时只支持新购）
     */
    public void setDealType(Long DealType) {
        this.DealType = DealType;
    }

    /**
     * Get 商品类型，1 域名套餐 2 增值服务 
     * @return GoodsType 商品类型，1 域名套餐 2 增值服务
     */
    public Long getGoodsType() {
        return this.GoodsType;
    }

    /**
     * Set 商品类型，1 域名套餐 2 增值服务
     * @param GoodsType 商品类型，1 域名套餐 2 增值服务
     */
    public void setGoodsType(Long GoodsType) {
        this.GoodsType = GoodsType;
    }

    /**
     * Get 套餐类型：
DP_PLUS：专业版
DP_EXPERT：企业版
DP_ULTRA：尊享版

增值服务类型
LB：负载均衡
URL：URL转发
DMONITOR_TASKS：D监控任务数
DMONITOR_IP：D监控备用 IP 数
CUSTOMLINE：自定义线路数 
     * @return GoodsChildType 套餐类型：
DP_PLUS：专业版
DP_EXPERT：企业版
DP_ULTRA：尊享版

增值服务类型
LB：负载均衡
URL：URL转发
DMONITOR_TASKS：D监控任务数
DMONITOR_IP：D监控备用 IP 数
CUSTOMLINE：自定义线路数
     */
    public String getGoodsChildType() {
        return this.GoodsChildType;
    }

    /**
     * Set 套餐类型：
DP_PLUS：专业版
DP_EXPERT：企业版
DP_ULTRA：尊享版

增值服务类型
LB：负载均衡
URL：URL转发
DMONITOR_TASKS：D监控任务数
DMONITOR_IP：D监控备用 IP 数
CUSTOMLINE：自定义线路数
     * @param GoodsChildType 套餐类型：
DP_PLUS：专业版
DP_EXPERT：企业版
DP_ULTRA：尊享版

增值服务类型
LB：负载均衡
URL：URL转发
DMONITOR_TASKS：D监控任务数
DMONITOR_IP：D监控备用 IP 数
CUSTOMLINE：自定义线路数
     */
    public void setGoodsChildType(String GoodsChildType) {
        this.GoodsChildType = GoodsChildType;
    }

    /**
     * Get 增值服务购买数量，如果是域名套餐固定为1，如果是增值服务则按以下规则：
负载均衡、D监控任务数、D监控备用 IP 数、自定义线路数、URL 转发（必须是5的正整数倍，如 5、10、15 等） 
     * @return GoodsNum 增值服务购买数量，如果是域名套餐固定为1，如果是增值服务则按以下规则：
负载均衡、D监控任务数、D监控备用 IP 数、自定义线路数、URL 转发（必须是5的正整数倍，如 5、10、15 等）
     */
    public Long getGoodsNum() {
        return this.GoodsNum;
    }

    /**
     * Set 增值服务购买数量，如果是域名套餐固定为1，如果是增值服务则按以下规则：
负载均衡、D监控任务数、D监控备用 IP 数、自定义线路数、URL 转发（必须是5的正整数倍，如 5、10、15 等）
     * @param GoodsNum 增值服务购买数量，如果是域名套餐固定为1，如果是增值服务则按以下规则：
负载均衡、D监控任务数、D监控备用 IP 数、自定义线路数、URL 转发（必须是5的正整数倍，如 5、10、15 等）
     */
    public void setGoodsNum(Long GoodsNum) {
        this.GoodsNum = GoodsNum;
    }

    /**
     * Get 是否开启自动续费，1 开启，2 不开启（增值服务暂不支持自动续费），默认值为 2 不开启 
     * @return AutoRenew 是否开启自动续费，1 开启，2 不开启（增值服务暂不支持自动续费），默认值为 2 不开启
     */
    public Long getAutoRenew() {
        return this.AutoRenew;
    }

    /**
     * Set 是否开启自动续费，1 开启，2 不开启（增值服务暂不支持自动续费），默认值为 2 不开启
     * @param AutoRenew 是否开启自动续费，1 开启，2 不开启（增值服务暂不支持自动续费），默认值为 2 不开启
     */
    public void setAutoRenew(Long AutoRenew) {
        this.AutoRenew = AutoRenew;
    }

    /**
     * Get 需要绑定套餐的域名，如 dnspod.cn，如果是续费或升级，domain 参数必须要传，新购可不传。 
     * @return Domain 需要绑定套餐的域名，如 dnspod.cn，如果是续费或升级，domain 参数必须要传，新购可不传。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 需要绑定套餐的域名，如 dnspod.cn，如果是续费或升级，domain 参数必须要传，新购可不传。
     * @param Domain 需要绑定套餐的域名，如 dnspod.cn，如果是续费或升级，domain 参数必须要传，新购可不传。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 套餐时长：
1. 套餐以月为单位（按月只能是 3、6 还有 12 的倍数），套餐例如购买一年则传12，最大120 。（续费最低一年）
2. 升级套餐时不需要传。
3. 增值服务的时长单位为年，买一年传1（增值服务新购按年只能是 1，增值服务续费最大为 10） 
     * @return TimeSpan 套餐时长：
1. 套餐以月为单位（按月只能是 3、6 还有 12 的倍数），套餐例如购买一年则传12，最大120 。（续费最低一年）
2. 升级套餐时不需要传。
3. 增值服务的时长单位为年，买一年传1（增值服务新购按年只能是 1，增值服务续费最大为 10）
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set 套餐时长：
1. 套餐以月为单位（按月只能是 3、6 还有 12 的倍数），套餐例如购买一年则传12，最大120 。（续费最低一年）
2. 升级套餐时不需要传。
3. 增值服务的时长单位为年，买一年传1（增值服务新购按年只能是 1，增值服务续费最大为 10）
     * @param TimeSpan 套餐时长：
1. 套餐以月为单位（按月只能是 3、6 还有 12 的倍数），套餐例如购买一年则传12，最大120 。（续费最低一年）
2. 升级套餐时不需要传。
3. 增值服务的时长单位为年，买一年传1（增值服务新购按年只能是 1，增值服务续费最大为 10）
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get 套餐类型，需要升级到的套餐类型，只有升级时需要。 
     * @return NewPackageType 套餐类型，需要升级到的套餐类型，只有升级时需要。
     */
    public String getNewPackageType() {
        return this.NewPackageType;
    }

    /**
     * Set 套餐类型，需要升级到的套餐类型，只有升级时需要。
     * @param NewPackageType 套餐类型，需要升级到的套餐类型，只有升级时需要。
     */
    public void setNewPackageType(String NewPackageType) {
        this.NewPackageType = NewPackageType;
    }

    public CreateDealRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDealRequest(CreateDealRequest source) {
        if (source.DealType != null) {
            this.DealType = new Long(source.DealType);
        }
        if (source.GoodsType != null) {
            this.GoodsType = new Long(source.GoodsType);
        }
        if (source.GoodsChildType != null) {
            this.GoodsChildType = new String(source.GoodsChildType);
        }
        if (source.GoodsNum != null) {
            this.GoodsNum = new Long(source.GoodsNum);
        }
        if (source.AutoRenew != null) {
            this.AutoRenew = new Long(source.AutoRenew);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.TimeSpan != null) {
            this.TimeSpan = new Long(source.TimeSpan);
        }
        if (source.NewPackageType != null) {
            this.NewPackageType = new String(source.NewPackageType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DealType", this.DealType);
        this.setParamSimple(map, prefix + "GoodsType", this.GoodsType);
        this.setParamSimple(map, prefix + "GoodsChildType", this.GoodsChildType);
        this.setParamSimple(map, prefix + "GoodsNum", this.GoodsNum);
        this.setParamSimple(map, prefix + "AutoRenew", this.AutoRenew);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "NewPackageType", this.NewPackageType);

    }
}

