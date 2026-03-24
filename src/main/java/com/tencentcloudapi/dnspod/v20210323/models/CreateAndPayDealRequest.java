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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAndPayDealRequest extends AbstractModel {

    /**
    * <p>询价类型，1 新购，2 续费，3 套餐升级（增值服务暂时只支持新购）</p>
    */
    @SerializedName("DealType")
    @Expose
    private Long DealType;

    /**
    * <p>商品类型，1 域名套餐 2 增值服务</p>
    */
    @SerializedName("GoodsType")
    @Expose
    private Long GoodsType;

    /**
    * <p>套餐类型：<br>DP_PLUS：专业版<br>DP_EXPERT：企业版<br>DP_ULTRA：尊享版</p><p>增值服务类型<br>LB：负载均衡<br>URL：URL转发<br>DMONITOR_TASKS：D监控任务数<br>DMONITOR_IP：D监控备用 IP 数<br>CUSTOMLINE：自定义线路数</p>
    */
    @SerializedName("GoodsChildType")
    @Expose
    private String GoodsChildType;

    /**
    * <p>增值服务购买数量，如果是域名套餐固定为1，如果是增值服务则按以下规则：<br>负载均衡、D监控任务数、D监控备用 IP 数、自定义线路数、URL 转发（必须是5的正整数倍，如 5、10、15 等）</p>
    */
    @SerializedName("GoodsNum")
    @Expose
    private Long GoodsNum;

    /**
    * <p>是否开启自动续费，1 开启，2 不开启（增值服务暂不支持自动续费），默认值为 2 不开启</p>
    */
    @SerializedName("AutoRenew")
    @Expose
    private Long AutoRenew;

    /**
    * <p>需要绑定套餐的域名，如 dnspod.cn，如果是续费或升级，domain 参数必须要传，新购可不传。</p>
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * <p>套餐时长：</p><ol><li>套餐以月为单位（按月只能是 3、6 还有 12 的倍数），套餐例如购买一年则传12，最大120 。（续费最低一年）</li><li>升级套餐时不需要传。</li><li>增值服务的时长单位为年，买一年传1（增值服务新购按年只能是 1，增值服务续费最大为 10）</li></ol>
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * <p>套餐类型，需要升级到的套餐类型，只有升级时需要。</p>
    */
    @SerializedName("NewPackageType")
    @Expose
    private String NewPackageType;

    /**
    * <p>可重入ID，避免接口重试场景生成额外订单和实例</p><p>入参限制：长度不超过70个字符</p>
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
     * Get <p>询价类型，1 新购，2 续费，3 套餐升级（增值服务暂时只支持新购）</p> 
     * @return DealType <p>询价类型，1 新购，2 续费，3 套餐升级（增值服务暂时只支持新购）</p>
     */
    public Long getDealType() {
        return this.DealType;
    }

    /**
     * Set <p>询价类型，1 新购，2 续费，3 套餐升级（增值服务暂时只支持新购）</p>
     * @param DealType <p>询价类型，1 新购，2 续费，3 套餐升级（增值服务暂时只支持新购）</p>
     */
    public void setDealType(Long DealType) {
        this.DealType = DealType;
    }

    /**
     * Get <p>商品类型，1 域名套餐 2 增值服务</p> 
     * @return GoodsType <p>商品类型，1 域名套餐 2 增值服务</p>
     */
    public Long getGoodsType() {
        return this.GoodsType;
    }

    /**
     * Set <p>商品类型，1 域名套餐 2 增值服务</p>
     * @param GoodsType <p>商品类型，1 域名套餐 2 增值服务</p>
     */
    public void setGoodsType(Long GoodsType) {
        this.GoodsType = GoodsType;
    }

    /**
     * Get <p>套餐类型：<br>DP_PLUS：专业版<br>DP_EXPERT：企业版<br>DP_ULTRA：尊享版</p><p>增值服务类型<br>LB：负载均衡<br>URL：URL转发<br>DMONITOR_TASKS：D监控任务数<br>DMONITOR_IP：D监控备用 IP 数<br>CUSTOMLINE：自定义线路数</p> 
     * @return GoodsChildType <p>套餐类型：<br>DP_PLUS：专业版<br>DP_EXPERT：企业版<br>DP_ULTRA：尊享版</p><p>增值服务类型<br>LB：负载均衡<br>URL：URL转发<br>DMONITOR_TASKS：D监控任务数<br>DMONITOR_IP：D监控备用 IP 数<br>CUSTOMLINE：自定义线路数</p>
     */
    public String getGoodsChildType() {
        return this.GoodsChildType;
    }

    /**
     * Set <p>套餐类型：<br>DP_PLUS：专业版<br>DP_EXPERT：企业版<br>DP_ULTRA：尊享版</p><p>增值服务类型<br>LB：负载均衡<br>URL：URL转发<br>DMONITOR_TASKS：D监控任务数<br>DMONITOR_IP：D监控备用 IP 数<br>CUSTOMLINE：自定义线路数</p>
     * @param GoodsChildType <p>套餐类型：<br>DP_PLUS：专业版<br>DP_EXPERT：企业版<br>DP_ULTRA：尊享版</p><p>增值服务类型<br>LB：负载均衡<br>URL：URL转发<br>DMONITOR_TASKS：D监控任务数<br>DMONITOR_IP：D监控备用 IP 数<br>CUSTOMLINE：自定义线路数</p>
     */
    public void setGoodsChildType(String GoodsChildType) {
        this.GoodsChildType = GoodsChildType;
    }

    /**
     * Get <p>增值服务购买数量，如果是域名套餐固定为1，如果是增值服务则按以下规则：<br>负载均衡、D监控任务数、D监控备用 IP 数、自定义线路数、URL 转发（必须是5的正整数倍，如 5、10、15 等）</p> 
     * @return GoodsNum <p>增值服务购买数量，如果是域名套餐固定为1，如果是增值服务则按以下规则：<br>负载均衡、D监控任务数、D监控备用 IP 数、自定义线路数、URL 转发（必须是5的正整数倍，如 5、10、15 等）</p>
     */
    public Long getGoodsNum() {
        return this.GoodsNum;
    }

    /**
     * Set <p>增值服务购买数量，如果是域名套餐固定为1，如果是增值服务则按以下规则：<br>负载均衡、D监控任务数、D监控备用 IP 数、自定义线路数、URL 转发（必须是5的正整数倍，如 5、10、15 等）</p>
     * @param GoodsNum <p>增值服务购买数量，如果是域名套餐固定为1，如果是增值服务则按以下规则：<br>负载均衡、D监控任务数、D监控备用 IP 数、自定义线路数、URL 转发（必须是5的正整数倍，如 5、10、15 等）</p>
     */
    public void setGoodsNum(Long GoodsNum) {
        this.GoodsNum = GoodsNum;
    }

    /**
     * Get <p>是否开启自动续费，1 开启，2 不开启（增值服务暂不支持自动续费），默认值为 2 不开启</p> 
     * @return AutoRenew <p>是否开启自动续费，1 开启，2 不开启（增值服务暂不支持自动续费），默认值为 2 不开启</p>
     */
    public Long getAutoRenew() {
        return this.AutoRenew;
    }

    /**
     * Set <p>是否开启自动续费，1 开启，2 不开启（增值服务暂不支持自动续费），默认值为 2 不开启</p>
     * @param AutoRenew <p>是否开启自动续费，1 开启，2 不开启（增值服务暂不支持自动续费），默认值为 2 不开启</p>
     */
    public void setAutoRenew(Long AutoRenew) {
        this.AutoRenew = AutoRenew;
    }

    /**
     * Get <p>需要绑定套餐的域名，如 dnspod.cn，如果是续费或升级，domain 参数必须要传，新购可不传。</p> 
     * @return Domain <p>需要绑定套餐的域名，如 dnspod.cn，如果是续费或升级，domain 参数必须要传，新购可不传。</p>
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set <p>需要绑定套餐的域名，如 dnspod.cn，如果是续费或升级，domain 参数必须要传，新购可不传。</p>
     * @param Domain <p>需要绑定套餐的域名，如 dnspod.cn，如果是续费或升级，domain 参数必须要传，新购可不传。</p>
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get <p>套餐时长：</p><ol><li>套餐以月为单位（按月只能是 3、6 还有 12 的倍数），套餐例如购买一年则传12，最大120 。（续费最低一年）</li><li>升级套餐时不需要传。</li><li>增值服务的时长单位为年，买一年传1（增值服务新购按年只能是 1，增值服务续费最大为 10）</li></ol> 
     * @return TimeSpan <p>套餐时长：</p><ol><li>套餐以月为单位（按月只能是 3、6 还有 12 的倍数），套餐例如购买一年则传12，最大120 。（续费最低一年）</li><li>升级套餐时不需要传。</li><li>增值服务的时长单位为年，买一年传1（增值服务新购按年只能是 1，增值服务续费最大为 10）</li></ol>
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set <p>套餐时长：</p><ol><li>套餐以月为单位（按月只能是 3、6 还有 12 的倍数），套餐例如购买一年则传12，最大120 。（续费最低一年）</li><li>升级套餐时不需要传。</li><li>增值服务的时长单位为年，买一年传1（增值服务新购按年只能是 1，增值服务续费最大为 10）</li></ol>
     * @param TimeSpan <p>套餐时长：</p><ol><li>套餐以月为单位（按月只能是 3、6 还有 12 的倍数），套餐例如购买一年则传12，最大120 。（续费最低一年）</li><li>升级套餐时不需要传。</li><li>增值服务的时长单位为年，买一年传1（增值服务新购按年只能是 1，增值服务续费最大为 10）</li></ol>
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get <p>套餐类型，需要升级到的套餐类型，只有升级时需要。</p> 
     * @return NewPackageType <p>套餐类型，需要升级到的套餐类型，只有升级时需要。</p>
     */
    public String getNewPackageType() {
        return this.NewPackageType;
    }

    /**
     * Set <p>套餐类型，需要升级到的套餐类型，只有升级时需要。</p>
     * @param NewPackageType <p>套餐类型，需要升级到的套餐类型，只有升级时需要。</p>
     */
    public void setNewPackageType(String NewPackageType) {
        this.NewPackageType = NewPackageType;
    }

    /**
     * Get <p>可重入ID，避免接口重试场景生成额外订单和实例</p><p>入参限制：长度不超过70个字符</p> 
     * @return ClientToken <p>可重入ID，避免接口重试场景生成额外订单和实例</p><p>入参限制：长度不超过70个字符</p>
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set <p>可重入ID，避免接口重试场景生成额外订单和实例</p><p>入参限制：长度不超过70个字符</p>
     * @param ClientToken <p>可重入ID，避免接口重试场景生成额外订单和实例</p><p>入参限制：长度不超过70个字符</p>
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    public CreateAndPayDealRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAndPayDealRequest(CreateAndPayDealRequest source) {
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
        if (source.ClientToken != null) {
            this.ClientToken = new String(source.ClientToken);
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
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);

    }
}

