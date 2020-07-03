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
package com.tencentcloudapi.ame.v20190916.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeItemsResponse extends AbstractModel{

    /**
    * 分页偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 当前页歌曲数量
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * 总数据条数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 剩余数量（total-offset-size），通过这个值判断是否
还有下一页
    */
    @SerializedName("HaveMore")
    @Expose
    private Long HaveMore;

    /**
    * Items 歌曲列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Items")
    @Expose
    private Item [] Items;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 分页偏移量 
     * @return Offset 分页偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移量
     * @param Offset 分页偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 当前页歌曲数量 
     * @return Size 当前页歌曲数量
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set 当前页歌曲数量
     * @param Size 当前页歌曲数量
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get 总数据条数 
     * @return Total 总数据条数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 总数据条数
     * @param Total 总数据条数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 剩余数量（total-offset-size），通过这个值判断是否
还有下一页 
     * @return HaveMore 剩余数量（total-offset-size），通过这个值判断是否
还有下一页
     */
    public Long getHaveMore() {
        return this.HaveMore;
    }

    /**
     * Set 剩余数量（total-offset-size），通过这个值判断是否
还有下一页
     * @param HaveMore 剩余数量（total-offset-size），通过这个值判断是否
还有下一页
     */
    public void setHaveMore(Long HaveMore) {
        this.HaveMore = HaveMore;
    }

    /**
     * Get Items 歌曲列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Items Items 歌曲列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Item [] getItems() {
        return this.Items;
    }

    /**
     * Set Items 歌曲列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Items Items 歌曲列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setItems(Item [] Items) {
        this.Items = Items;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "HaveMore", this.HaveMore);
        this.setParamArrayObj(map, prefix + "Items.", this.Items);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

