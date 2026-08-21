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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMsgRecordListResponse extends AbstractModel {

    /**
    * <p>是否有更多页</p>
    */
    @SerializedName("HasMore")
    @Expose
    private Boolean HasMore;

    /**
    * <p>消息记录列表</p>
    */
    @SerializedName("MsgRecordList")
    @Expose
    private MsgRecord [] MsgRecordList;

    /**
    * <p>下一页游标信息</p>
    */
    @SerializedName("NextCursor")
    @Expose
    private String NextCursor;

    /**
    * <p>上一页游标信息</p>
    */
    @SerializedName("PrevCursor")
    @Expose
    private String PrevCursor;

    /**
    * <p>符合条件的总记录数，用于前端分页显示</p>
    */
    @SerializedName("TotalCount")
    @Expose
    private String TotalCount;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>是否有更多页</p> 
     * @return HasMore <p>是否有更多页</p>
     */
    public Boolean getHasMore() {
        return this.HasMore;
    }

    /**
     * Set <p>是否有更多页</p>
     * @param HasMore <p>是否有更多页</p>
     */
    public void setHasMore(Boolean HasMore) {
        this.HasMore = HasMore;
    }

    /**
     * Get <p>消息记录列表</p> 
     * @return MsgRecordList <p>消息记录列表</p>
     */
    public MsgRecord [] getMsgRecordList() {
        return this.MsgRecordList;
    }

    /**
     * Set <p>消息记录列表</p>
     * @param MsgRecordList <p>消息记录列表</p>
     */
    public void setMsgRecordList(MsgRecord [] MsgRecordList) {
        this.MsgRecordList = MsgRecordList;
    }

    /**
     * Get <p>下一页游标信息</p> 
     * @return NextCursor <p>下一页游标信息</p>
     */
    public String getNextCursor() {
        return this.NextCursor;
    }

    /**
     * Set <p>下一页游标信息</p>
     * @param NextCursor <p>下一页游标信息</p>
     */
    public void setNextCursor(String NextCursor) {
        this.NextCursor = NextCursor;
    }

    /**
     * Get <p>上一页游标信息</p> 
     * @return PrevCursor <p>上一页游标信息</p>
     */
    public String getPrevCursor() {
        return this.PrevCursor;
    }

    /**
     * Set <p>上一页游标信息</p>
     * @param PrevCursor <p>上一页游标信息</p>
     */
    public void setPrevCursor(String PrevCursor) {
        this.PrevCursor = PrevCursor;
    }

    /**
     * Get <p>符合条件的总记录数，用于前端分页显示</p> 
     * @return TotalCount <p>符合条件的总记录数，用于前端分页显示</p>
     */
    public String getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set <p>符合条件的总记录数，用于前端分页显示</p>
     * @param TotalCount <p>符合条件的总记录数，用于前端分页显示</p>
     */
    public void setTotalCount(String TotalCount) {
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

    public DescribeMsgRecordListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMsgRecordListResponse(DescribeMsgRecordListResponse source) {
        if (source.HasMore != null) {
            this.HasMore = new Boolean(source.HasMore);
        }
        if (source.MsgRecordList != null) {
            this.MsgRecordList = new MsgRecord[source.MsgRecordList.length];
            for (int i = 0; i < source.MsgRecordList.length; i++) {
                this.MsgRecordList[i] = new MsgRecord(source.MsgRecordList[i]);
            }
        }
        if (source.NextCursor != null) {
            this.NextCursor = new String(source.NextCursor);
        }
        if (source.PrevCursor != null) {
            this.PrevCursor = new String(source.PrevCursor);
        }
        if (source.TotalCount != null) {
            this.TotalCount = new String(source.TotalCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HasMore", this.HasMore);
        this.setParamArrayObj(map, prefix + "MsgRecordList.", this.MsgRecordList);
        this.setParamSimple(map, prefix + "NextCursor", this.NextCursor);
        this.setParamSimple(map, prefix + "PrevCursor", this.PrevCursor);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

