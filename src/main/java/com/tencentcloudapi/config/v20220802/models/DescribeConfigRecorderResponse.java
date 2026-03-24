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

public class DescribeConfigRecorderResponse extends AbstractModel {

    /**
    * 用户监控资源列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Items")
    @Expose
    private UserConfigResource [] Items;

    /**
    * 0 关闭1 打开
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 当日快照次数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TriggerCount")
    @Expose
    private Long TriggerCount;

    /**
    * 当日打开监控次数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OpenCount")
    @Expose
    private Long OpenCount;

    /**
    * 当日修改监控范围次数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateCount")
    @Expose
    private Long UpdateCount;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 用户监控资源列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Items 用户监控资源列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public UserConfigResource [] getItems() {
        return this.Items;
    }

    /**
     * Set 用户监控资源列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Items 用户监控资源列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setItems(UserConfigResource [] Items) {
        this.Items = Items;
    }

    /**
     * Get 0 关闭1 打开 
     * @return Status 0 关闭1 打开
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 0 关闭1 打开
     * @param Status 0 关闭1 打开
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 当日快照次数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TriggerCount 当日快照次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTriggerCount() {
        return this.TriggerCount;
    }

    /**
     * Set 当日快照次数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TriggerCount 当日快照次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTriggerCount(Long TriggerCount) {
        this.TriggerCount = TriggerCount;
    }

    /**
     * Get 当日打开监控次数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OpenCount 当日打开监控次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOpenCount() {
        return this.OpenCount;
    }

    /**
     * Set 当日打开监控次数
注意：此字段可能返回 null，表示取不到有效值。
     * @param OpenCount 当日打开监控次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOpenCount(Long OpenCount) {
        this.OpenCount = OpenCount;
    }

    /**
     * Get 当日修改监控范围次数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateCount 当日修改监控范围次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUpdateCount() {
        return this.UpdateCount;
    }

    /**
     * Set 当日修改监控范围次数
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateCount 当日修改监控范围次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateCount(Long UpdateCount) {
        this.UpdateCount = UpdateCount;
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

    public DescribeConfigRecorderResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeConfigRecorderResponse(DescribeConfigRecorderResponse source) {
        if (source.Items != null) {
            this.Items = new UserConfigResource[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new UserConfigResource(source.Items[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.TriggerCount != null) {
            this.TriggerCount = new Long(source.TriggerCount);
        }
        if (source.OpenCount != null) {
            this.OpenCount = new Long(source.OpenCount);
        }
        if (source.UpdateCount != null) {
            this.UpdateCount = new Long(source.UpdateCount);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Items.", this.Items);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "TriggerCount", this.TriggerCount);
        this.setParamSimple(map, prefix + "OpenCount", this.OpenCount);
        this.setParamSimple(map, prefix + "UpdateCount", this.UpdateCount);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

