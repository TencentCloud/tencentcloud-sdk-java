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
package com.tencentcloudapi.monitor.v20230616.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeNoticeContentTmplResponse extends AbstractModel {

    /**
    * 自定义通知内容模板
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NoticeContentTmpls")
    @Expose
    private NoticeContentTmpl [] NoticeContentTmpls;

    /**
    * 通知内容模板绑定的告警策略数量
    */
    @SerializedName("NoticeContentTmplBindPolicyCounts")
    @Expose
    private NoticeContentTmplBindPolicyCount [] NoticeContentTmplBindPolicyCounts;

    /**
    * 分页数
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 分页大小
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 结果总数
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
     * Get 自定义通知内容模板
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NoticeContentTmpls 自定义通知内容模板
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NoticeContentTmpl [] getNoticeContentTmpls() {
        return this.NoticeContentTmpls;
    }

    /**
     * Set 自定义通知内容模板
注意：此字段可能返回 null，表示取不到有效值。
     * @param NoticeContentTmpls 自定义通知内容模板
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNoticeContentTmpls(NoticeContentTmpl [] NoticeContentTmpls) {
        this.NoticeContentTmpls = NoticeContentTmpls;
    }

    /**
     * Get 通知内容模板绑定的告警策略数量 
     * @return NoticeContentTmplBindPolicyCounts 通知内容模板绑定的告警策略数量
     */
    public NoticeContentTmplBindPolicyCount [] getNoticeContentTmplBindPolicyCounts() {
        return this.NoticeContentTmplBindPolicyCounts;
    }

    /**
     * Set 通知内容模板绑定的告警策略数量
     * @param NoticeContentTmplBindPolicyCounts 通知内容模板绑定的告警策略数量
     */
    public void setNoticeContentTmplBindPolicyCounts(NoticeContentTmplBindPolicyCount [] NoticeContentTmplBindPolicyCounts) {
        this.NoticeContentTmplBindPolicyCounts = NoticeContentTmplBindPolicyCounts;
    }

    /**
     * Get 分页数 
     * @return PageNumber 分页数
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 分页数
     * @param PageNumber 分页数
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 分页大小 
     * @return PageSize 分页大小
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 分页大小
     * @param PageSize 分页大小
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 结果总数 
     * @return TotalCount 结果总数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 结果总数
     * @param TotalCount 结果总数
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

    public DescribeNoticeContentTmplResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNoticeContentTmplResponse(DescribeNoticeContentTmplResponse source) {
        if (source.NoticeContentTmpls != null) {
            this.NoticeContentTmpls = new NoticeContentTmpl[source.NoticeContentTmpls.length];
            for (int i = 0; i < source.NoticeContentTmpls.length; i++) {
                this.NoticeContentTmpls[i] = new NoticeContentTmpl(source.NoticeContentTmpls[i]);
            }
        }
        if (source.NoticeContentTmplBindPolicyCounts != null) {
            this.NoticeContentTmplBindPolicyCounts = new NoticeContentTmplBindPolicyCount[source.NoticeContentTmplBindPolicyCounts.length];
            for (int i = 0; i < source.NoticeContentTmplBindPolicyCounts.length; i++) {
                this.NoticeContentTmplBindPolicyCounts[i] = new NoticeContentTmplBindPolicyCount(source.NoticeContentTmplBindPolicyCounts[i]);
            }
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
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
        this.setParamArrayObj(map, prefix + "NoticeContentTmpls.", this.NoticeContentTmpls);
        this.setParamArrayObj(map, prefix + "NoticeContentTmplBindPolicyCounts.", this.NoticeContentTmplBindPolicyCounts);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

