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
package com.tencentcloudapi.iotvideo.v20201215.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDeviceActionHistoryResponse extends AbstractModel{

    /**
    * 总条数
    */
    @SerializedName("TotalCounts")
    @Expose
    private Long TotalCounts;

    /**
    * 动作历史
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ActionHistories")
    @Expose
    private ActionHistory [] ActionHistories;

    /**
    * 用于标识查询结果的上下文，翻页用。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Context")
    @Expose
    private String Context;

    /**
    * 搜索结果是否已经结束。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Listover")
    @Expose
    private Boolean Listover;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 总条数 
     * @return TotalCounts 总条数
     */
    public Long getTotalCounts() {
        return this.TotalCounts;
    }

    /**
     * Set 总条数
     * @param TotalCounts 总条数
     */
    public void setTotalCounts(Long TotalCounts) {
        this.TotalCounts = TotalCounts;
    }

    /**
     * Get 动作历史
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ActionHistories 动作历史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ActionHistory [] getActionHistories() {
        return this.ActionHistories;
    }

    /**
     * Set 动作历史
注意：此字段可能返回 null，表示取不到有效值。
     * @param ActionHistories 动作历史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setActionHistories(ActionHistory [] ActionHistories) {
        this.ActionHistories = ActionHistories;
    }

    /**
     * Get 用于标识查询结果的上下文，翻页用。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Context 用于标识查询结果的上下文，翻页用。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContext() {
        return this.Context;
    }

    /**
     * Set 用于标识查询结果的上下文，翻页用。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Context 用于标识查询结果的上下文，翻页用。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContext(String Context) {
        this.Context = Context;
    }

    /**
     * Get 搜索结果是否已经结束。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Listover 搜索结果是否已经结束。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getListover() {
        return this.Listover;
    }

    /**
     * Set 搜索结果是否已经结束。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Listover 搜索结果是否已经结束。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setListover(Boolean Listover) {
        this.Listover = Listover;
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

    public DescribeDeviceActionHistoryResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDeviceActionHistoryResponse(DescribeDeviceActionHistoryResponse source) {
        if (source.TotalCounts != null) {
            this.TotalCounts = new Long(source.TotalCounts);
        }
        if (source.ActionHistories != null) {
            this.ActionHistories = new ActionHistory[source.ActionHistories.length];
            for (int i = 0; i < source.ActionHistories.length; i++) {
                this.ActionHistories[i] = new ActionHistory(source.ActionHistories[i]);
            }
        }
        if (source.Context != null) {
            this.Context = new String(source.Context);
        }
        if (source.Listover != null) {
            this.Listover = new Boolean(source.Listover);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCounts", this.TotalCounts);
        this.setParamArrayObj(map, prefix + "ActionHistories.", this.ActionHistories);
        this.setParamSimple(map, prefix + "Context", this.Context);
        this.setParamSimple(map, prefix + "Listover", this.Listover);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

