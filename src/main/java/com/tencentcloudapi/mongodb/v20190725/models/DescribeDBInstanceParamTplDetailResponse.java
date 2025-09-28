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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBInstanceParamTplDetailResponse extends AbstractModel {

    /**
    * 枚举类参数详情列表。
    */
    @SerializedName("InstanceEnumParams")
    @Expose
    private InstanceEnumParam [] InstanceEnumParams;

    /**
    * 整形参数详情列表。
    */
    @SerializedName("InstanceIntegerParams")
    @Expose
    private InstanceIntegerParam [] InstanceIntegerParams;

    /**
    * 文本参数详情列表。
    */
    @SerializedName("InstanceTextParams")
    @Expose
    private InstanceTextParam [] InstanceTextParams;

    /**
    * 多值参数详情列表。
    */
    @SerializedName("InstanceMultiParams")
    @Expose
    private InstanceMultiParam [] InstanceMultiParams;

    /**
    * 参数总个数。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 模板适配的实例版本。
- MONGO_36_WT：MongoDB 3.6 WiredTiger存储引擎版本，
- MONGO_40_WT：MongoDB 4.0 WiredTiger存储引擎版本，
- MONGO_42_WT：MongoDB 4.2 WiredTiger存储引擎版本。
- MONGO_44_WT：MongoDB 4.4 WiredTiger存储引擎版本。
- MONGO_50_WT：MongoDB 5.0 WiredTiger存储引擎版本。
- MONGO_60_WT：MongoDB 6.0 WiredTiger存储引擎版本。
- MONGO_70_WT：MongoDB 7.0 WiredTiger存储引擎版本。
    */
    @SerializedName("MongoVersion")
    @Expose
    private String MongoVersion;

    /**
    * 模板适配集群类型。
- REPLSET：副本集实例。
- SHARD：分片实例。
- STANDALONE：单节点实例。
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
    * 参数模板名称。
    */
    @SerializedName("TplName")
    @Expose
    private String TplName;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 枚举类参数详情列表。 
     * @return InstanceEnumParams 枚举类参数详情列表。
     */
    public InstanceEnumParam [] getInstanceEnumParams() {
        return this.InstanceEnumParams;
    }

    /**
     * Set 枚举类参数详情列表。
     * @param InstanceEnumParams 枚举类参数详情列表。
     */
    public void setInstanceEnumParams(InstanceEnumParam [] InstanceEnumParams) {
        this.InstanceEnumParams = InstanceEnumParams;
    }

    /**
     * Get 整形参数详情列表。 
     * @return InstanceIntegerParams 整形参数详情列表。
     */
    public InstanceIntegerParam [] getInstanceIntegerParams() {
        return this.InstanceIntegerParams;
    }

    /**
     * Set 整形参数详情列表。
     * @param InstanceIntegerParams 整形参数详情列表。
     */
    public void setInstanceIntegerParams(InstanceIntegerParam [] InstanceIntegerParams) {
        this.InstanceIntegerParams = InstanceIntegerParams;
    }

    /**
     * Get 文本参数详情列表。 
     * @return InstanceTextParams 文本参数详情列表。
     */
    public InstanceTextParam [] getInstanceTextParams() {
        return this.InstanceTextParams;
    }

    /**
     * Set 文本参数详情列表。
     * @param InstanceTextParams 文本参数详情列表。
     */
    public void setInstanceTextParams(InstanceTextParam [] InstanceTextParams) {
        this.InstanceTextParams = InstanceTextParams;
    }

    /**
     * Get 多值参数详情列表。 
     * @return InstanceMultiParams 多值参数详情列表。
     */
    public InstanceMultiParam [] getInstanceMultiParams() {
        return this.InstanceMultiParams;
    }

    /**
     * Set 多值参数详情列表。
     * @param InstanceMultiParams 多值参数详情列表。
     */
    public void setInstanceMultiParams(InstanceMultiParam [] InstanceMultiParams) {
        this.InstanceMultiParams = InstanceMultiParams;
    }

    /**
     * Get 参数总个数。 
     * @return TotalCount 参数总个数。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 参数总个数。
     * @param TotalCount 参数总个数。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 模板适配的实例版本。
- MONGO_36_WT：MongoDB 3.6 WiredTiger存储引擎版本，
- MONGO_40_WT：MongoDB 4.0 WiredTiger存储引擎版本，
- MONGO_42_WT：MongoDB 4.2 WiredTiger存储引擎版本。
- MONGO_44_WT：MongoDB 4.4 WiredTiger存储引擎版本。
- MONGO_50_WT：MongoDB 5.0 WiredTiger存储引擎版本。
- MONGO_60_WT：MongoDB 6.0 WiredTiger存储引擎版本。
- MONGO_70_WT：MongoDB 7.0 WiredTiger存储引擎版本。 
     * @return MongoVersion 模板适配的实例版本。
- MONGO_36_WT：MongoDB 3.6 WiredTiger存储引擎版本，
- MONGO_40_WT：MongoDB 4.0 WiredTiger存储引擎版本，
- MONGO_42_WT：MongoDB 4.2 WiredTiger存储引擎版本。
- MONGO_44_WT：MongoDB 4.4 WiredTiger存储引擎版本。
- MONGO_50_WT：MongoDB 5.0 WiredTiger存储引擎版本。
- MONGO_60_WT：MongoDB 6.0 WiredTiger存储引擎版本。
- MONGO_70_WT：MongoDB 7.0 WiredTiger存储引擎版本。
     */
    public String getMongoVersion() {
        return this.MongoVersion;
    }

    /**
     * Set 模板适配的实例版本。
- MONGO_36_WT：MongoDB 3.6 WiredTiger存储引擎版本，
- MONGO_40_WT：MongoDB 4.0 WiredTiger存储引擎版本，
- MONGO_42_WT：MongoDB 4.2 WiredTiger存储引擎版本。
- MONGO_44_WT：MongoDB 4.4 WiredTiger存储引擎版本。
- MONGO_50_WT：MongoDB 5.0 WiredTiger存储引擎版本。
- MONGO_60_WT：MongoDB 6.0 WiredTiger存储引擎版本。
- MONGO_70_WT：MongoDB 7.0 WiredTiger存储引擎版本。
     * @param MongoVersion 模板适配的实例版本。
- MONGO_36_WT：MongoDB 3.6 WiredTiger存储引擎版本，
- MONGO_40_WT：MongoDB 4.0 WiredTiger存储引擎版本，
- MONGO_42_WT：MongoDB 4.2 WiredTiger存储引擎版本。
- MONGO_44_WT：MongoDB 4.4 WiredTiger存储引擎版本。
- MONGO_50_WT：MongoDB 5.0 WiredTiger存储引擎版本。
- MONGO_60_WT：MongoDB 6.0 WiredTiger存储引擎版本。
- MONGO_70_WT：MongoDB 7.0 WiredTiger存储引擎版本。
     */
    public void setMongoVersion(String MongoVersion) {
        this.MongoVersion = MongoVersion;
    }

    /**
     * Get 模板适配集群类型。
- REPLSET：副本集实例。
- SHARD：分片实例。
- STANDALONE：单节点实例。 
     * @return ClusterType 模板适配集群类型。
- REPLSET：副本集实例。
- SHARD：分片实例。
- STANDALONE：单节点实例。
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set 模板适配集群类型。
- REPLSET：副本集实例。
- SHARD：分片实例。
- STANDALONE：单节点实例。
     * @param ClusterType 模板适配集群类型。
- REPLSET：副本集实例。
- SHARD：分片实例。
- STANDALONE：单节点实例。
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get 参数模板名称。 
     * @return TplName 参数模板名称。
     */
    public String getTplName() {
        return this.TplName;
    }

    /**
     * Set 参数模板名称。
     * @param TplName 参数模板名称。
     */
    public void setTplName(String TplName) {
        this.TplName = TplName;
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

    public DescribeDBInstanceParamTplDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBInstanceParamTplDetailResponse(DescribeDBInstanceParamTplDetailResponse source) {
        if (source.InstanceEnumParams != null) {
            this.InstanceEnumParams = new InstanceEnumParam[source.InstanceEnumParams.length];
            for (int i = 0; i < source.InstanceEnumParams.length; i++) {
                this.InstanceEnumParams[i] = new InstanceEnumParam(source.InstanceEnumParams[i]);
            }
        }
        if (source.InstanceIntegerParams != null) {
            this.InstanceIntegerParams = new InstanceIntegerParam[source.InstanceIntegerParams.length];
            for (int i = 0; i < source.InstanceIntegerParams.length; i++) {
                this.InstanceIntegerParams[i] = new InstanceIntegerParam(source.InstanceIntegerParams[i]);
            }
        }
        if (source.InstanceTextParams != null) {
            this.InstanceTextParams = new InstanceTextParam[source.InstanceTextParams.length];
            for (int i = 0; i < source.InstanceTextParams.length; i++) {
                this.InstanceTextParams[i] = new InstanceTextParam(source.InstanceTextParams[i]);
            }
        }
        if (source.InstanceMultiParams != null) {
            this.InstanceMultiParams = new InstanceMultiParam[source.InstanceMultiParams.length];
            for (int i = 0; i < source.InstanceMultiParams.length; i++) {
                this.InstanceMultiParams[i] = new InstanceMultiParam(source.InstanceMultiParams[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.MongoVersion != null) {
            this.MongoVersion = new String(source.MongoVersion);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
        }
        if (source.TplName != null) {
            this.TplName = new String(source.TplName);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "InstanceEnumParams.", this.InstanceEnumParams);
        this.setParamArrayObj(map, prefix + "InstanceIntegerParams.", this.InstanceIntegerParams);
        this.setParamArrayObj(map, prefix + "InstanceTextParams.", this.InstanceTextParams);
        this.setParamArrayObj(map, prefix + "InstanceMultiParams.", this.InstanceMultiParams);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "MongoVersion", this.MongoVersion);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamSimple(map, prefix + "TplName", this.TplName);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

