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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProxySupportParamResponse extends AbstractModel{

    /**
    * 支持最大代理版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProxyVersion")
    @Expose
    private String ProxyVersion;

    /**
    * 是否支持连接池
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SupportPool")
    @Expose
    private Boolean SupportPool;

    /**
    * 连接池最小值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PoolMin")
    @Expose
    private Long PoolMin;

    /**
    * 连接池最大值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PoolMax")
    @Expose
    private Long PoolMax;

    /**
    * 是否支持事务拆分
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SupportTransSplit")
    @Expose
    private Boolean SupportTransSplit;

    /**
    * 支持连接池的最小代理版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SupportPoolMinVersion")
    @Expose
    private String SupportPoolMinVersion;

    /**
    * 支持事务拆分的最小代理版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SupportTransSplitMinVersion")
    @Expose
    private String SupportTransSplitMinVersion;

    /**
    * 是否支持设置只读
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SupportReadOnly")
    @Expose
    private Boolean SupportReadOnly;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 支持最大代理版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProxyVersion 支持最大代理版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProxyVersion() {
        return this.ProxyVersion;
    }

    /**
     * Set 支持最大代理版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProxyVersion 支持最大代理版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProxyVersion(String ProxyVersion) {
        this.ProxyVersion = ProxyVersion;
    }

    /**
     * Get 是否支持连接池
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SupportPool 是否支持连接池
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getSupportPool() {
        return this.SupportPool;
    }

    /**
     * Set 是否支持连接池
注意：此字段可能返回 null，表示取不到有效值。
     * @param SupportPool 是否支持连接池
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSupportPool(Boolean SupportPool) {
        this.SupportPool = SupportPool;
    }

    /**
     * Get 连接池最小值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PoolMin 连接池最小值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPoolMin() {
        return this.PoolMin;
    }

    /**
     * Set 连接池最小值
注意：此字段可能返回 null，表示取不到有效值。
     * @param PoolMin 连接池最小值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPoolMin(Long PoolMin) {
        this.PoolMin = PoolMin;
    }

    /**
     * Get 连接池最大值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PoolMax 连接池最大值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPoolMax() {
        return this.PoolMax;
    }

    /**
     * Set 连接池最大值
注意：此字段可能返回 null，表示取不到有效值。
     * @param PoolMax 连接池最大值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPoolMax(Long PoolMax) {
        this.PoolMax = PoolMax;
    }

    /**
     * Get 是否支持事务拆分
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SupportTransSplit 是否支持事务拆分
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getSupportTransSplit() {
        return this.SupportTransSplit;
    }

    /**
     * Set 是否支持事务拆分
注意：此字段可能返回 null，表示取不到有效值。
     * @param SupportTransSplit 是否支持事务拆分
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSupportTransSplit(Boolean SupportTransSplit) {
        this.SupportTransSplit = SupportTransSplit;
    }

    /**
     * Get 支持连接池的最小代理版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SupportPoolMinVersion 支持连接池的最小代理版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSupportPoolMinVersion() {
        return this.SupportPoolMinVersion;
    }

    /**
     * Set 支持连接池的最小代理版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param SupportPoolMinVersion 支持连接池的最小代理版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSupportPoolMinVersion(String SupportPoolMinVersion) {
        this.SupportPoolMinVersion = SupportPoolMinVersion;
    }

    /**
     * Get 支持事务拆分的最小代理版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SupportTransSplitMinVersion 支持事务拆分的最小代理版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSupportTransSplitMinVersion() {
        return this.SupportTransSplitMinVersion;
    }

    /**
     * Set 支持事务拆分的最小代理版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param SupportTransSplitMinVersion 支持事务拆分的最小代理版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSupportTransSplitMinVersion(String SupportTransSplitMinVersion) {
        this.SupportTransSplitMinVersion = SupportTransSplitMinVersion;
    }

    /**
     * Get 是否支持设置只读
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SupportReadOnly 是否支持设置只读
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getSupportReadOnly() {
        return this.SupportReadOnly;
    }

    /**
     * Set 是否支持设置只读
注意：此字段可能返回 null，表示取不到有效值。
     * @param SupportReadOnly 是否支持设置只读
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSupportReadOnly(Boolean SupportReadOnly) {
        this.SupportReadOnly = SupportReadOnly;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
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
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

