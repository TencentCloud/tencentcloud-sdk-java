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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTDEMRelatedEventsResponse extends AbstractModel {

    /**
    * <p>关联事件，schema 与 Search 列表项相同</p>
    */
    @SerializedName("Events")
    @Expose
    private ExplorationEventItem [] Events;

    /**
    * <p>偏移</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>条数</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>是否还有下一页</p>
    */
    @SerializedName("HasMore")
    @Expose
    private Boolean HasMore;

    /**
    * <p>各分类计数，Key 为分类 id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CategoryCounts")
    @Expose
    private IntKeyValue [] CategoryCounts;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>关联事件，schema 与 Search 列表项相同</p> 
     * @return Events <p>关联事件，schema 与 Search 列表项相同</p>
     */
    public ExplorationEventItem [] getEvents() {
        return this.Events;
    }

    /**
     * Set <p>关联事件，schema 与 Search 列表项相同</p>
     * @param Events <p>关联事件，schema 与 Search 列表项相同</p>
     */
    public void setEvents(ExplorationEventItem [] Events) {
        this.Events = Events;
    }

    /**
     * Get <p>偏移</p> 
     * @return Offset <p>偏移</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移</p>
     * @param Offset <p>偏移</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>条数</p> 
     * @return Limit <p>条数</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>条数</p>
     * @param Limit <p>条数</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>是否还有下一页</p> 
     * @return HasMore <p>是否还有下一页</p>
     */
    public Boolean getHasMore() {
        return this.HasMore;
    }

    /**
     * Set <p>是否还有下一页</p>
     * @param HasMore <p>是否还有下一页</p>
     */
    public void setHasMore(Boolean HasMore) {
        this.HasMore = HasMore;
    }

    /**
     * Get <p>各分类计数，Key 为分类 id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CategoryCounts <p>各分类计数，Key 为分类 id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IntKeyValue [] getCategoryCounts() {
        return this.CategoryCounts;
    }

    /**
     * Set <p>各分类计数，Key 为分类 id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CategoryCounts <p>各分类计数，Key 为分类 id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCategoryCounts(IntKeyValue [] CategoryCounts) {
        this.CategoryCounts = CategoryCounts;
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

    public DescribeTDEMRelatedEventsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTDEMRelatedEventsResponse(DescribeTDEMRelatedEventsResponse source) {
        if (source.Events != null) {
            this.Events = new ExplorationEventItem[source.Events.length];
            for (int i = 0; i < source.Events.length; i++) {
                this.Events[i] = new ExplorationEventItem(source.Events[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.HasMore != null) {
            this.HasMore = new Boolean(source.HasMore);
        }
        if (source.CategoryCounts != null) {
            this.CategoryCounts = new IntKeyValue[source.CategoryCounts.length];
            for (int i = 0; i < source.CategoryCounts.length; i++) {
                this.CategoryCounts[i] = new IntKeyValue(source.CategoryCounts[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Events.", this.Events);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "HasMore", this.HasMore);
        this.setParamArrayObj(map, prefix + "CategoryCounts.", this.CategoryCounts);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

