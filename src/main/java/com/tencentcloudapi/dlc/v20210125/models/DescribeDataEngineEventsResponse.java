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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDataEngineEventsResponse extends AbstractModel {

    /**
    * <p>事件详细信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Events")
    @Expose
    private HouseEventsInfo [] Events;

    /**
    * <p>分页号</p>
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * <p>分页大小</p>
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * <p>总页数</p>
    */
    @SerializedName("TotalPages")
    @Expose
    private Long TotalPages;

    /**
    * <p>总条数</p>
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>事件详细信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Events <p>事件详细信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public HouseEventsInfo [] getEvents() {
        return this.Events;
    }

    /**
     * Set <p>事件详细信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Events <p>事件详细信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEvents(HouseEventsInfo [] Events) {
        this.Events = Events;
    }

    /**
     * Get <p>分页号</p> 
     * @return Page <p>分页号</p>
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set <p>分页号</p>
     * @param Page <p>分页号</p>
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get <p>分页大小</p> 
     * @return Size <p>分页大小</p>
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set <p>分页大小</p>
     * @param Size <p>分页大小</p>
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get <p>总页数</p> 
     * @return TotalPages <p>总页数</p>
     */
    public Long getTotalPages() {
        return this.TotalPages;
    }

    /**
     * Set <p>总页数</p>
     * @param TotalPages <p>总页数</p>
     */
    public void setTotalPages(Long TotalPages) {
        this.TotalPages = TotalPages;
    }

    /**
     * Get <p>总条数</p> 
     * @return TotalCount <p>总条数</p>
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set <p>总条数</p>
     * @param TotalCount <p>总条数</p>
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
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

    public DescribeDataEngineEventsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDataEngineEventsResponse(DescribeDataEngineEventsResponse source) {
        if (source.Events != null) {
            this.Events = new HouseEventsInfo[source.Events.length];
            for (int i = 0; i < source.Events.length; i++) {
                this.Events[i] = new HouseEventsInfo(source.Events[i]);
            }
        }
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.TotalPages != null) {
            this.TotalPages = new Long(source.TotalPages);
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
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
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "TotalPages", this.TotalPages);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

