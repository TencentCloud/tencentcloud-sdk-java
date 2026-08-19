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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeComplianceStandardTermTreeResponse extends AbstractModel {

    /**
    * <p>合规规范ID</p>
    */
    @SerializedName("StandardID")
    @Expose
    private Long StandardID;

    /**
    * <p>规范名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>条款章节</p>
    */
    @SerializedName("Chapters")
    @Expose
    private ComplianceChapterItem [] Chapters;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>合规规范ID</p> 
     * @return StandardID <p>合规规范ID</p>
     */
    public Long getStandardID() {
        return this.StandardID;
    }

    /**
     * Set <p>合规规范ID</p>
     * @param StandardID <p>合规规范ID</p>
     */
    public void setStandardID(Long StandardID) {
        this.StandardID = StandardID;
    }

    /**
     * Get <p>规范名称</p> 
     * @return Name <p>规范名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>规范名称</p>
     * @param Name <p>规范名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>条款章节</p> 
     * @return Chapters <p>条款章节</p>
     */
    public ComplianceChapterItem [] getChapters() {
        return this.Chapters;
    }

    /**
     * Set <p>条款章节</p>
     * @param Chapters <p>条款章节</p>
     */
    public void setChapters(ComplianceChapterItem [] Chapters) {
        this.Chapters = Chapters;
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

    public DescribeComplianceStandardTermTreeResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeComplianceStandardTermTreeResponse(DescribeComplianceStandardTermTreeResponse source) {
        if (source.StandardID != null) {
            this.StandardID = new Long(source.StandardID);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Chapters != null) {
            this.Chapters = new ComplianceChapterItem[source.Chapters.length];
            for (int i = 0; i < source.Chapters.length; i++) {
                this.Chapters[i] = new ComplianceChapterItem(source.Chapters[i]);
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
        this.setParamSimple(map, prefix + "StandardID", this.StandardID);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "Chapters.", this.Chapters);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

