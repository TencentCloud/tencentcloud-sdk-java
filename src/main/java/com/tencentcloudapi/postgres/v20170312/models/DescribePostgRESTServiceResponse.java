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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePostgRESTServiceResponse extends AbstractModel {

    /**
    * <p>PostgREST服务运行状态</p><p>枚举值：</p><ul><li>closed： 已关闭</li><li>creating： 创建中</li><li>running： 运行中</li></ul><p>默认值：closed</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>创建时间</p><p>参数格式：2026-05-10 10:00:00</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>PostgREST服务网络连接信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NetworkAccessList")
    @Expose
    private DBInstanceNetInfo [] NetworkAccessList;

    /**
    * <p>PostgREST服务JWT值</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JWTSecret")
    @Expose
    private String JWTSecret;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>PostgREST服务运行状态</p><p>枚举值：</p><ul><li>closed： 已关闭</li><li>creating： 创建中</li><li>running： 运行中</li></ul><p>默认值：closed</p> 
     * @return Status <p>PostgREST服务运行状态</p><p>枚举值：</p><ul><li>closed： 已关闭</li><li>creating： 创建中</li><li>running： 运行中</li></ul><p>默认值：closed</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>PostgREST服务运行状态</p><p>枚举值：</p><ul><li>closed： 已关闭</li><li>creating： 创建中</li><li>running： 运行中</li></ul><p>默认值：closed</p>
     * @param Status <p>PostgREST服务运行状态</p><p>枚举值：</p><ul><li>closed： 已关闭</li><li>creating： 创建中</li><li>running： 运行中</li></ul><p>默认值：closed</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>创建时间</p><p>参数格式：2026-05-10 10:00:00</p> 
     * @return CreateTime <p>创建时间</p><p>参数格式：2026-05-10 10:00:00</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p><p>参数格式：2026-05-10 10:00:00</p>
     * @param CreateTime <p>创建时间</p><p>参数格式：2026-05-10 10:00:00</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>PostgREST服务网络连接信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NetworkAccessList <p>PostgREST服务网络连接信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DBInstanceNetInfo [] getNetworkAccessList() {
        return this.NetworkAccessList;
    }

    /**
     * Set <p>PostgREST服务网络连接信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param NetworkAccessList <p>PostgREST服务网络连接信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNetworkAccessList(DBInstanceNetInfo [] NetworkAccessList) {
        this.NetworkAccessList = NetworkAccessList;
    }

    /**
     * Get <p>PostgREST服务JWT值</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JWTSecret <p>PostgREST服务JWT值</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getJWTSecret() {
        return this.JWTSecret;
    }

    /**
     * Set <p>PostgREST服务JWT值</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param JWTSecret <p>PostgREST服务JWT值</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJWTSecret(String JWTSecret) {
        this.JWTSecret = JWTSecret;
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

    public DescribePostgRESTServiceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePostgRESTServiceResponse(DescribePostgRESTServiceResponse source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.NetworkAccessList != null) {
            this.NetworkAccessList = new DBInstanceNetInfo[source.NetworkAccessList.length];
            for (int i = 0; i < source.NetworkAccessList.length; i++) {
                this.NetworkAccessList[i] = new DBInstanceNetInfo(source.NetworkAccessList[i]);
            }
        }
        if (source.JWTSecret != null) {
            this.JWTSecret = new String(source.JWTSecret);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamArrayObj(map, prefix + "NetworkAccessList.", this.NetworkAccessList);
        this.setParamSimple(map, prefix + "JWTSecret", this.JWTSecret);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

