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
package com.tencentcloudapi.config.v20220802.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAggregateConfigDeliverResponse extends AbstractModel {

    /**
    * 投递名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeliverName")
    @Expose
    private String DeliverName;

    /**
    * 资源六段式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetArn")
    @Expose
    private String TargetArn;

    /**
    * 投递状态 DeliverStatus：0 关闭  1 开启
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 日志前缀
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeliverPrefix")
    @Expose
    private String DeliverPrefix;

    /**
    * 投递类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeliverType")
    @Expose
    private String DeliverType;

    /**
    * 支持跨账号投递的成员账号uin，只能是委派管理员。默认为0，即投递到管理员账号下
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeliverUin")
    @Expose
    private Long DeliverUin;

    /**
    * 1：配置变更 2： 资源列表 3：全部
    */
    @SerializedName("DeliverContentType")
    @Expose
    private Long DeliverContentType;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 投递名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeliverName 投递名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeliverName() {
        return this.DeliverName;
    }

    /**
     * Set 投递名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeliverName 投递名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeliverName(String DeliverName) {
        this.DeliverName = DeliverName;
    }

    /**
     * Get 资源六段式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetArn 资源六段式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetArn() {
        return this.TargetArn;
    }

    /**
     * Set 资源六段式
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetArn 资源六段式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetArn(String TargetArn) {
        this.TargetArn = TargetArn;
    }

    /**
     * Get 投递状态 DeliverStatus：0 关闭  1 开启 
     * @return Status 投递状态 DeliverStatus：0 关闭  1 开启
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 投递状态 DeliverStatus：0 关闭  1 开启
     * @param Status 投递状态 DeliverStatus：0 关闭  1 开启
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 日志前缀
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeliverPrefix 日志前缀
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeliverPrefix() {
        return this.DeliverPrefix;
    }

    /**
     * Set 日志前缀
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeliverPrefix 日志前缀
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeliverPrefix(String DeliverPrefix) {
        this.DeliverPrefix = DeliverPrefix;
    }

    /**
     * Get 投递类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeliverType 投递类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeliverType() {
        return this.DeliverType;
    }

    /**
     * Set 投递类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeliverType 投递类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeliverType(String DeliverType) {
        this.DeliverType = DeliverType;
    }

    /**
     * Get 支持跨账号投递的成员账号uin，只能是委派管理员。默认为0，即投递到管理员账号下
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeliverUin 支持跨账号投递的成员账号uin，只能是委派管理员。默认为0，即投递到管理员账号下
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDeliverUin() {
        return this.DeliverUin;
    }

    /**
     * Set 支持跨账号投递的成员账号uin，只能是委派管理员。默认为0，即投递到管理员账号下
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeliverUin 支持跨账号投递的成员账号uin，只能是委派管理员。默认为0，即投递到管理员账号下
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeliverUin(Long DeliverUin) {
        this.DeliverUin = DeliverUin;
    }

    /**
     * Get 1：配置变更 2： 资源列表 3：全部 
     * @return DeliverContentType 1：配置变更 2： 资源列表 3：全部
     */
    public Long getDeliverContentType() {
        return this.DeliverContentType;
    }

    /**
     * Set 1：配置变更 2： 资源列表 3：全部
     * @param DeliverContentType 1：配置变更 2： 资源列表 3：全部
     */
    public void setDeliverContentType(Long DeliverContentType) {
        this.DeliverContentType = DeliverContentType;
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

    public DescribeAggregateConfigDeliverResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAggregateConfigDeliverResponse(DescribeAggregateConfigDeliverResponse source) {
        if (source.DeliverName != null) {
            this.DeliverName = new String(source.DeliverName);
        }
        if (source.TargetArn != null) {
            this.TargetArn = new String(source.TargetArn);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.DeliverPrefix != null) {
            this.DeliverPrefix = new String(source.DeliverPrefix);
        }
        if (source.DeliverType != null) {
            this.DeliverType = new String(source.DeliverType);
        }
        if (source.DeliverUin != null) {
            this.DeliverUin = new Long(source.DeliverUin);
        }
        if (source.DeliverContentType != null) {
            this.DeliverContentType = new Long(source.DeliverContentType);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeliverName", this.DeliverName);
        this.setParamSimple(map, prefix + "TargetArn", this.TargetArn);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "DeliverPrefix", this.DeliverPrefix);
        this.setParamSimple(map, prefix + "DeliverType", this.DeliverType);
        this.setParamSimple(map, prefix + "DeliverUin", this.DeliverUin);
        this.setParamSimple(map, prefix + "DeliverContentType", this.DeliverContentType);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

