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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProxySupportParamResponse extends AbstractModel {

    /**
    * 支持最大代理版本
    */
    @SerializedName("ProxyVersion")
    @Expose
    private String ProxyVersion;

    /**
    * 是否支持连接池
    */
    @SerializedName("SupportPool")
    @Expose
    private Boolean SupportPool;

    /**
    * 连接池最小值
    */
    @SerializedName("PoolMin")
    @Expose
    private Long PoolMin;

    /**
    * 连接池最大值
    */
    @SerializedName("PoolMax")
    @Expose
    private Long PoolMax;

    /**
    * 是否支持事务拆分
    */
    @SerializedName("SupportTransSplit")
    @Expose
    private Boolean SupportTransSplit;

    /**
    * 支持连接池的最小代理版本
    */
    @SerializedName("SupportPoolMinVersion")
    @Expose
    private String SupportPoolMinVersion;

    /**
    * 支持事务拆分的最小代理版本
    */
    @SerializedName("SupportTransSplitMinVersion")
    @Expose
    private String SupportTransSplitMinVersion;

    /**
    * 是否支持设置只读
    */
    @SerializedName("SupportReadOnly")
    @Expose
    private Boolean SupportReadOnly;

    /**
    * 是否自动均衡负载
    */
    @SerializedName("SupportAutoLoadBalance")
    @Expose
    private Boolean SupportAutoLoadBalance;

    /**
    * 是否支持接入模式
    */
    @SerializedName("SupportAccessMode")
    @Expose
    private Boolean SupportAccessMode;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 支持最大代理版本 
     * @return ProxyVersion 支持最大代理版本
     */
    public String getProxyVersion() {
        return this.ProxyVersion;
    }

    /**
     * Set 支持最大代理版本
     * @param ProxyVersion 支持最大代理版本
     */
    public void setProxyVersion(String ProxyVersion) {
        this.ProxyVersion = ProxyVersion;
    }

    /**
     * Get 是否支持连接池 
     * @return SupportPool 是否支持连接池
     */
    public Boolean getSupportPool() {
        return this.SupportPool;
    }

    /**
     * Set 是否支持连接池
     * @param SupportPool 是否支持连接池
     */
    public void setSupportPool(Boolean SupportPool) {
        this.SupportPool = SupportPool;
    }

    /**
     * Get 连接池最小值 
     * @return PoolMin 连接池最小值
     */
    public Long getPoolMin() {
        return this.PoolMin;
    }

    /**
     * Set 连接池最小值
     * @param PoolMin 连接池最小值
     */
    public void setPoolMin(Long PoolMin) {
        this.PoolMin = PoolMin;
    }

    /**
     * Get 连接池最大值 
     * @return PoolMax 连接池最大值
     */
    public Long getPoolMax() {
        return this.PoolMax;
    }

    /**
     * Set 连接池最大值
     * @param PoolMax 连接池最大值
     */
    public void setPoolMax(Long PoolMax) {
        this.PoolMax = PoolMax;
    }

    /**
     * Get 是否支持事务拆分 
     * @return SupportTransSplit 是否支持事务拆分
     */
    public Boolean getSupportTransSplit() {
        return this.SupportTransSplit;
    }

    /**
     * Set 是否支持事务拆分
     * @param SupportTransSplit 是否支持事务拆分
     */
    public void setSupportTransSplit(Boolean SupportTransSplit) {
        this.SupportTransSplit = SupportTransSplit;
    }

    /**
     * Get 支持连接池的最小代理版本 
     * @return SupportPoolMinVersion 支持连接池的最小代理版本
     */
    public String getSupportPoolMinVersion() {
        return this.SupportPoolMinVersion;
    }

    /**
     * Set 支持连接池的最小代理版本
     * @param SupportPoolMinVersion 支持连接池的最小代理版本
     */
    public void setSupportPoolMinVersion(String SupportPoolMinVersion) {
        this.SupportPoolMinVersion = SupportPoolMinVersion;
    }

    /**
     * Get 支持事务拆分的最小代理版本 
     * @return SupportTransSplitMinVersion 支持事务拆分的最小代理版本
     */
    public String getSupportTransSplitMinVersion() {
        return this.SupportTransSplitMinVersion;
    }

    /**
     * Set 支持事务拆分的最小代理版本
     * @param SupportTransSplitMinVersion 支持事务拆分的最小代理版本
     */
    public void setSupportTransSplitMinVersion(String SupportTransSplitMinVersion) {
        this.SupportTransSplitMinVersion = SupportTransSplitMinVersion;
    }

    /**
     * Get 是否支持设置只读 
     * @return SupportReadOnly 是否支持设置只读
     */
    public Boolean getSupportReadOnly() {
        return this.SupportReadOnly;
    }

    /**
     * Set 是否支持设置只读
     * @param SupportReadOnly 是否支持设置只读
     */
    public void setSupportReadOnly(Boolean SupportReadOnly) {
        this.SupportReadOnly = SupportReadOnly;
    }

    /**
     * Get 是否自动均衡负载 
     * @return SupportAutoLoadBalance 是否自动均衡负载
     */
    public Boolean getSupportAutoLoadBalance() {
        return this.SupportAutoLoadBalance;
    }

    /**
     * Set 是否自动均衡负载
     * @param SupportAutoLoadBalance 是否自动均衡负载
     */
    public void setSupportAutoLoadBalance(Boolean SupportAutoLoadBalance) {
        this.SupportAutoLoadBalance = SupportAutoLoadBalance;
    }

    /**
     * Get 是否支持接入模式 
     * @return SupportAccessMode 是否支持接入模式
     */
    public Boolean getSupportAccessMode() {
        return this.SupportAccessMode;
    }

    /**
     * Set 是否支持接入模式
     * @param SupportAccessMode 是否支持接入模式
     */
    public void setSupportAccessMode(Boolean SupportAccessMode) {
        this.SupportAccessMode = SupportAccessMode;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeProxySupportParamResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeProxySupportParamResponse(DescribeProxySupportParamResponse source) {
        if (source.ProxyVersion != null) {
            this.ProxyVersion = new String(source.ProxyVersion);
        }
        if (source.SupportPool != null) {
            this.SupportPool = new Boolean(source.SupportPool);
        }
        if (source.PoolMin != null) {
            this.PoolMin = new Long(source.PoolMin);
        }
        if (source.PoolMax != null) {
            this.PoolMax = new Long(source.PoolMax);
        }
        if (source.SupportTransSplit != null) {
            this.SupportTransSplit = new Boolean(source.SupportTransSplit);
        }
        if (source.SupportPoolMinVersion != null) {
            this.SupportPoolMinVersion = new String(source.SupportPoolMinVersion);
        }
        if (source.SupportTransSplitMinVersion != null) {
            this.SupportTransSplitMinVersion = new String(source.SupportTransSplitMinVersion);
        }
        if (source.SupportReadOnly != null) {
            this.SupportReadOnly = new Boolean(source.SupportReadOnly);
        }
        if (source.SupportAutoLoadBalance != null) {
            this.SupportAutoLoadBalance = new Boolean(source.SupportAutoLoadBalance);
        }
        if (source.SupportAccessMode != null) {
            this.SupportAccessMode = new Boolean(source.SupportAccessMode);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProxyVersion", this.ProxyVersion);
        this.setParamSimple(map, prefix + "SupportPool", this.SupportPool);
        this.setParamSimple(map, prefix + "PoolMin", this.PoolMin);
        this.setParamSimple(map, prefix + "PoolMax", this.PoolMax);
        this.setParamSimple(map, prefix + "SupportTransSplit", this.SupportTransSplit);
        this.setParamSimple(map, prefix + "SupportPoolMinVersion", this.SupportPoolMinVersion);
        this.setParamSimple(map, prefix + "SupportTransSplitMinVersion", this.SupportTransSplitMinVersion);
        this.setParamSimple(map, prefix + "SupportReadOnly", this.SupportReadOnly);
        this.setParamSimple(map, prefix + "SupportAutoLoadBalance", this.SupportAutoLoadBalance);
        this.setParamSimple(map, prefix + "SupportAccessMode", this.SupportAccessMode);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

