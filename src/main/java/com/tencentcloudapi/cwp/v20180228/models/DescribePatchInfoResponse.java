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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePatchInfoResponse extends AbstractModel {

    /**
    * kb编号
    */
    @SerializedName("KbNo")
    @Expose
    private String KbNo;

    /**
    * kb名称
    */
    @SerializedName("PatchName")
    @Expose
    private String PatchName;

    /**
    * kb 发布日期
    */
    @SerializedName("PublishTime")
    @Expose
    private String PublishTime;

    /**
    * 参考链接
    */
    @SerializedName("ReferUrl")
    @Expose
    private String ReferUrl;

    /**
    * 包含漏洞数
    */
    @SerializedName("VulCount")
    @Expose
    private Long VulCount;

    /**
    * 补丁关联的漏洞详情列表
    */
    @SerializedName("RelateVulInfoList")
    @Expose
    private RelateVulInfo [] RelateVulInfoList;

    /**
    * 补丁id
    */
    @SerializedName("KbId")
    @Expose
    private Long KbId;

    /**
    * 关联的漏洞CveId，多个id由","分隔
    */
    @SerializedName("RelateVulCveId")
    @Expose
    private String RelateVulCveId;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get kb编号 
     * @return KbNo kb编号
     */
    public String getKbNo() {
        return this.KbNo;
    }

    /**
     * Set kb编号
     * @param KbNo kb编号
     */
    public void setKbNo(String KbNo) {
        this.KbNo = KbNo;
    }

    /**
     * Get kb名称 
     * @return PatchName kb名称
     */
    public String getPatchName() {
        return this.PatchName;
    }

    /**
     * Set kb名称
     * @param PatchName kb名称
     */
    public void setPatchName(String PatchName) {
        this.PatchName = PatchName;
    }

    /**
     * Get kb 发布日期 
     * @return PublishTime kb 发布日期
     */
    public String getPublishTime() {
        return this.PublishTime;
    }

    /**
     * Set kb 发布日期
     * @param PublishTime kb 发布日期
     */
    public void setPublishTime(String PublishTime) {
        this.PublishTime = PublishTime;
    }

    /**
     * Get 参考链接 
     * @return ReferUrl 参考链接
     */
    public String getReferUrl() {
        return this.ReferUrl;
    }

    /**
     * Set 参考链接
     * @param ReferUrl 参考链接
     */
    public void setReferUrl(String ReferUrl) {
        this.ReferUrl = ReferUrl;
    }

    /**
     * Get 包含漏洞数 
     * @return VulCount 包含漏洞数
     */
    public Long getVulCount() {
        return this.VulCount;
    }

    /**
     * Set 包含漏洞数
     * @param VulCount 包含漏洞数
     */
    public void setVulCount(Long VulCount) {
        this.VulCount = VulCount;
    }

    /**
     * Get 补丁关联的漏洞详情列表 
     * @return RelateVulInfoList 补丁关联的漏洞详情列表
     */
    public RelateVulInfo [] getRelateVulInfoList() {
        return this.RelateVulInfoList;
    }

    /**
     * Set 补丁关联的漏洞详情列表
     * @param RelateVulInfoList 补丁关联的漏洞详情列表
     */
    public void setRelateVulInfoList(RelateVulInfo [] RelateVulInfoList) {
        this.RelateVulInfoList = RelateVulInfoList;
    }

    /**
     * Get 补丁id 
     * @return KbId 补丁id
     */
    public Long getKbId() {
        return this.KbId;
    }

    /**
     * Set 补丁id
     * @param KbId 补丁id
     */
    public void setKbId(Long KbId) {
        this.KbId = KbId;
    }

    /**
     * Get 关联的漏洞CveId，多个id由","分隔 
     * @return RelateVulCveId 关联的漏洞CveId，多个id由","分隔
     */
    public String getRelateVulCveId() {
        return this.RelateVulCveId;
    }

    /**
     * Set 关联的漏洞CveId，多个id由","分隔
     * @param RelateVulCveId 关联的漏洞CveId，多个id由","分隔
     */
    public void setRelateVulCveId(String RelateVulCveId) {
        this.RelateVulCveId = RelateVulCveId;
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

    public DescribePatchInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePatchInfoResponse(DescribePatchInfoResponse source) {
        if (source.KbNo != null) {
            this.KbNo = new String(source.KbNo);
        }
        if (source.PatchName != null) {
            this.PatchName = new String(source.PatchName);
        }
        if (source.PublishTime != null) {
            this.PublishTime = new String(source.PublishTime);
        }
        if (source.ReferUrl != null) {
            this.ReferUrl = new String(source.ReferUrl);
        }
        if (source.VulCount != null) {
            this.VulCount = new Long(source.VulCount);
        }
        if (source.RelateVulInfoList != null) {
            this.RelateVulInfoList = new RelateVulInfo[source.RelateVulInfoList.length];
            for (int i = 0; i < source.RelateVulInfoList.length; i++) {
                this.RelateVulInfoList[i] = new RelateVulInfo(source.RelateVulInfoList[i]);
            }
        }
        if (source.KbId != null) {
            this.KbId = new Long(source.KbId);
        }
        if (source.RelateVulCveId != null) {
            this.RelateVulCveId = new String(source.RelateVulCveId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KbNo", this.KbNo);
        this.setParamSimple(map, prefix + "PatchName", this.PatchName);
        this.setParamSimple(map, prefix + "PublishTime", this.PublishTime);
        this.setParamSimple(map, prefix + "ReferUrl", this.ReferUrl);
        this.setParamSimple(map, prefix + "VulCount", this.VulCount);
        this.setParamArrayObj(map, prefix + "RelateVulInfoList.", this.RelateVulInfoList);
        this.setParamSimple(map, prefix + "KbId", this.KbId);
        this.setParamSimple(map, prefix + "RelateVulCveId", this.RelateVulCveId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

