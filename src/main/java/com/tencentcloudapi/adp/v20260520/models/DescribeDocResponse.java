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

public class DescribeDocResponse extends AbstractModel {

    /**
    * <p>文档链接（外部链接 + COS 链接）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DocLink")
    @Expose
    private DocLink DocLink;

    /**
    * <p>解析配置（分割规则、内容过滤等）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParseConfig")
    @Expose
    private DocParseConfig ParseConfig;

    /**
    * <p>文档基础信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Summary")
    @Expose
    private DocSummary Summary;

    /**
    * <p>开关配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Switch")
    @Expose
    private DocSwitch Switch;

    /**
    * <p>更新周期配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdatePeriod")
    @Expose
    private DocUpdatePeriod UpdatePeriod;

    /**
    * <p>用户访问配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserAccessConfig")
    @Expose
    private UserAccessConfig UserAccessConfig;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>文档链接（外部链接 + COS 链接）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DocLink <p>文档链接（外部链接 + COS 链接）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DocLink getDocLink() {
        return this.DocLink;
    }

    /**
     * Set <p>文档链接（外部链接 + COS 链接）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DocLink <p>文档链接（外部链接 + COS 链接）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDocLink(DocLink DocLink) {
        this.DocLink = DocLink;
    }

    /**
     * Get <p>解析配置（分割规则、内容过滤等）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParseConfig <p>解析配置（分割规则、内容过滤等）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DocParseConfig getParseConfig() {
        return this.ParseConfig;
    }

    /**
     * Set <p>解析配置（分割规则、内容过滤等）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParseConfig <p>解析配置（分割规则、内容过滤等）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParseConfig(DocParseConfig ParseConfig) {
        this.ParseConfig = ParseConfig;
    }

    /**
     * Get <p>文档基础信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Summary <p>文档基础信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DocSummary getSummary() {
        return this.Summary;
    }

    /**
     * Set <p>文档基础信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Summary <p>文档基础信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSummary(DocSummary Summary) {
        this.Summary = Summary;
    }

    /**
     * Get <p>开关配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Switch <p>开关配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DocSwitch getSwitch() {
        return this.Switch;
    }

    /**
     * Set <p>开关配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Switch <p>开关配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSwitch(DocSwitch Switch) {
        this.Switch = Switch;
    }

    /**
     * Get <p>更新周期配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdatePeriod <p>更新周期配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DocUpdatePeriod getUpdatePeriod() {
        return this.UpdatePeriod;
    }

    /**
     * Set <p>更新周期配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdatePeriod <p>更新周期配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdatePeriod(DocUpdatePeriod UpdatePeriod) {
        this.UpdatePeriod = UpdatePeriod;
    }

    /**
     * Get <p>用户访问配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserAccessConfig <p>用户访问配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public UserAccessConfig getUserAccessConfig() {
        return this.UserAccessConfig;
    }

    /**
     * Set <p>用户访问配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserAccessConfig <p>用户访问配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserAccessConfig(UserAccessConfig UserAccessConfig) {
        this.UserAccessConfig = UserAccessConfig;
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

    public DescribeDocResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDocResponse(DescribeDocResponse source) {
        if (source.DocLink != null) {
            this.DocLink = new DocLink(source.DocLink);
        }
        if (source.ParseConfig != null) {
            this.ParseConfig = new DocParseConfig(source.ParseConfig);
        }
        if (source.Summary != null) {
            this.Summary = new DocSummary(source.Summary);
        }
        if (source.Switch != null) {
            this.Switch = new DocSwitch(source.Switch);
        }
        if (source.UpdatePeriod != null) {
            this.UpdatePeriod = new DocUpdatePeriod(source.UpdatePeriod);
        }
        if (source.UserAccessConfig != null) {
            this.UserAccessConfig = new UserAccessConfig(source.UserAccessConfig);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "DocLink.", this.DocLink);
        this.setParamObj(map, prefix + "ParseConfig.", this.ParseConfig);
        this.setParamObj(map, prefix + "Summary.", this.Summary);
        this.setParamObj(map, prefix + "Switch.", this.Switch);
        this.setParamObj(map, prefix + "UpdatePeriod.", this.UpdatePeriod);
        this.setParamObj(map, prefix + "UserAccessConfig.", this.UserAccessConfig);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

